package com.AMIT.retail.webServices;

import com.AMIT.retail.ProductModel;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ProductsResponse {

    @SerializedName("products")
    private List<ProductModel> productsList;

    public List<ProductModel> getProductsList() {
        return productsList;
    }

    public void setProductsList(List<ProductModel> productsList) {
        this.productsList = productsList;
    }
}
