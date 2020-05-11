package com.company;

import java.util.ArrayList;
import java.util.List;

public class ListOfProducts<T extends Product>  {
    private T t;
    List<T> tableWithProducts;

    public ListOfProducts() {
        this.tableWithProducts = new ArrayList<T>();
    }

    public void addToTable(T t) {
        this.tableWithProducts.add(t);
        this.t = t;
    }


}
