package com.bo.xMarket.dto;

import com.bo.xMarket.model.Transaction;

public class BranchOfficeRequest {
    //private Integer branchId; *
    private Integer managerId; //nombre del manager no Id *
    private String name;
    private Integer phone;
    private String zone;
    private String address;

    public BranchOfficeRequest() {
    }

    public BranchOfficeRequest(Integer managerId, String name, Integer phone, String zone, String address) {
        this.managerId = managerId;
        this.name = name;
        this.phone = phone;
        this.zone = zone;
        this.address = address;
    }


    @Override
    public String toString() {
        return "BranchOfficeRequest{" +
                "managerId=" + managerId +
                ", name='" + name + '\'' +
                ", phone=" + phone +
                ", zone='" + zone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
