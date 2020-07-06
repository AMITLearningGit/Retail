package com.AMIT.retail.asyncTask;

import android.os.AsyncTask;

import com.AMIT.retail.ProductModel;
import com.AMIT.retail.room.ProductDAO;

public class UpdateAsyncTask extends AsyncTask<ProductModel , Void , Void> {

    private ProductDAO productDAO;

    public UpdateAsyncTask(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }

    @Override
    protected Void doInBackground(ProductModel... productModels) {
        productDAO.updateProduct(productModels[0]);
        return null;
    }
}
