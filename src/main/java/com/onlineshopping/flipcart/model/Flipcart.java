package com.onlineshopping.flipcart.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document

public class Flipcart {

    private int customerid;

    public int getCustomerid() {
        return customerid;
    }

    public void setCustomerid(int customerid) {
        this.customerid = customerid;
    }

    public String getCutomername() {
        return cutomername;
    }

    public void setCutomername(String cutomername) {
        this.cutomername = cutomername;
    }

    public String getCustomeraddress() {
        return customeraddress;
    }

    public void setCustomeraddress(String customeraddress) {
        this.customeraddress = customeraddress;
    }

    public Double getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(Double phonenumber) {
        this.phonenumber = phonenumber;
    }

    private String cutomername;
    private String customeraddress;
    private Double phonenumber;
}
