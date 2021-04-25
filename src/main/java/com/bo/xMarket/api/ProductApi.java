package com.bo.xMarket.api;

import com.bo.xMarket.bl.ProductBl;
import com.bo.xMarket.bl.TransactionBl;
import com.bo.xMarket.dto.OfferRequest;
import com.bo.xMarket.dto.ProductRequest;
import com.bo.xMarket.dto.ProductResponse;
import com.bo.xMarket.dto.ProductSpecificResponse;
import com.bo.xMarket.model.Product;
import com.bo.xMarket.model.Transaction;
import com.bo.xMarket.util.TransactionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping(value = "")
public class ProductApi {
    private ProductBl productBl;
    private TransactionBl transactionBl;

    @Autowired
    public ProductApi(ProductBl productBl, TransactionBl transactionBl) {
        this.productBl = productBl;
        this.transactionBl = transactionBl;
    }

    @RequestMapping(value = "/manager/{personId}/products", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ProductResponse> ListProducts(@PathVariable("personId") Integer id) {
        return productBl.productList(id);
    }

    @RequestMapping(value = "/user/{userid}/branchOffice/{branchoffice}/category/{categoryid}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ProductResponse> productsbycategory(@PathVariable("userid") Integer id, @PathVariable("branchoffice") Integer idbranch,@PathVariable("categoryid") Integer idcategory) {
        return productBl.productListbyCategory(id, idbranch,idcategory);
    }

    @RequestMapping(value = "/user/{userid}/branchOffice/{branchoffice}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ProductResponse> productsbycategory(@PathVariable("userid") Integer id, @PathVariable("branchoffice") Integer idbranch) {
        return productBl.productListbyBranchId(id, idbranch);
    }

    @RequestMapping(value = "/admin/{userid}/branchOffice/{branchoffice}/product", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Product addProduct(@PathVariable("userid") Integer id, @PathVariable("branchoffice") Integer idbranch, @RequestBody ProductRequest productRequest, HttpServletRequest request) {
        Transaction transaction = TransactionUtil.createTransaction(request);
        transactionBl.createTransaction(transaction);
        return productBl.addProduct(productRequest, idbranch, transaction);
    }

    @RequestMapping(value = "/product/{productid}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ProductSpecificResponse productInfo(@PathVariable("productid") Integer id) {
        return productBl.productInfo(id);
    }

    @RequestMapping(value = "/product/{productid}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.OK)
    public void productDelete(@PathVariable("productid") Integer productid, HttpServletRequest request) {
        Transaction transaction = TransactionUtil.createTransaction(request);
        transactionBl.createTransaction(transaction);
        productBl.productDelete(productid);
    }

    @RequestMapping(value = "/product/offers/{productid}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<OfferRequest> productOffers(@PathVariable("productid") Integer id) {
        return productBl.productOffers(id);
    }

}
