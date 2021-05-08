package com.bo.xMarket.dto;

import java.sql.Date;

public class CardResponse {
    private Integer cardId;
    private Integer userId;
    private String cardName;
    private Integer cardNumber;
    private Integer expirationYear;
    private Integer expirationMonth;
    private Integer cvc;
    private Date creationDate;
    private Integer status;

    public Integer getCardId() {
        return cardId;
    }

    public void setCardId(Integer cardId) {
        this.cardId = cardId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public Integer getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(Integer cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Integer getExpirationYear() {
        return expirationYear;
    }

    public void setExpirationYear(Integer expirationYear) {
        this.expirationYear = expirationYear;
    }

    public Integer getExpirationMonth() {
        return expirationMonth;
    }

    public void setExpirationMonth(Integer expirationMonth) {
        this.expirationMonth = expirationMonth;
    }

    public Integer getCvc() {
        return cvc;
    }

    public void setCvc(Integer cvc) {
        this.cvc = cvc;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Card{" +
                "cardId=" + cardId + '\'' +
                ", userId=" + userId + '\'' +
                ", cardName='" + cardName + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", expirationYear='" + expirationYear + '\'' +
                ", expirationMonth='" + expirationMonth + '\'' +
                ", cvc='" + cvc + '\'' +
                ", creationDate=" + creationDate + '\'' +
                ", status=" + status +
                '}';
    }


}
