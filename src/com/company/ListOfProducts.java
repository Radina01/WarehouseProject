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

    public void writeToDataBase() {
        for (T product : tableWithProducts) {
            System.out.println("Име: " + product.getNameProduct() + '\n' +
                    "Описание: " + product.getDescription() + '\n' +
                    "Срок на годност: " + product.getExpiryDate() + '\n' +
                    "Дата на постъпване на продукта в склада: " + product.getDateEntryInWarehouse() + '\n' +
                    "Мерна единица:  " + product.getUnit() + '\n' +
                    "Налично количество: " + product.getAvailableQuantity() + '\n' +
                    "Местоположение: " + product.getLocation() + '\n' +
                    "Допустим брой на продуктите на рафт: " + product.getAllowableShelfValue() +
                    "Коментар: " + product.getComment());
        }
    }
}
