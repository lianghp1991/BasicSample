package com.lhp.copy.basicsample.ui;

import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;

import com.lhp.copy.basicsample.model.Product;

import java.util.List;


/**
 * @author lianghp
 * @Date 2018/10/30
 **/
public class ProductAdapter  {
    List<? extends Product> mProductList;
    @Nullable
    private final ProductClickCallback mProductClickCallback;
    public ProductAdapter(@Nullable ProductClickCallback productClickCallback){
        mProductClickCallback = productClickCallback;
    }
    public void setProductList(List<? extends Product> productList){
        if(mProductList ==null){
            mProductList = productList;

        }
    }
    static class ProductViewHolder {

    }
}
