package com.AMIT.retail.asyncTask;

import android.os.AsyncTask;

import com.AMIT.retail.ProductModel;
import com.AMIT.retail.room.ProductDAO;

import java.util.List;

public class GetProductAsyncTask extends AsyncTask<Void, Void, List<ProductModel>> {

    private ProductDAO productDAO;

    public GetProductAsyncTask(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }

    @Override
    protected List<ProductModel> doInBackground(Void... voids) {
        return productDAO.getAllProducts();
    }
}
