package com.company;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    private static Warehouse warehouse = new Warehouse();
    private int section;
    private int shelf;
    private int number;
    List<Product> tableWithProducts;
    private final int MAX_SECTION = 5;
    private final int MAX_SHELF = 3;
    private final int MAX_NUMBER_SQUARE_METERS = 2;

    private Warehouse() {
        this.section = 0;
        this.shelf = 0;
        this.number = 0;
        this.tableWithProducts = new ArrayList<>();
    }

    public static Warehouse getWarehouse() {
        return warehouse;
    }

    public void addToTable(Product product) {
        int allowableShelfValue = product.getAllowableShelfValue();
        int quantity = product.getAvailableQuantity();

        for (int i = 0; i < quantity; i++) {
            if(!nextItem()) return;
            for (int j = 0; j < allowableShelfValue; j++) {
                product.setLocation(section + "section" + ", " + shelf + "shelf" + ", " + number + "number");
                this.tableWithProducts.add(product);
            }
        }
    }

    private boolean nextItem() {
        if (number + 1 > MAX_NUMBER_SQUARE_METERS) {
            if (shelf + 1 > MAX_SHELF) {
                if (section + 1 > MAX_SECTION) {
                    System.out.println("Няма достатъчно място");
                    return false;
                } else section++;
            } else shelf++;
        } else number++;
        return true;
    }

    public void printProducts() {
        List<Product> newProductsList = new ArrayList<>();
        if(tableWithProducts.size() > 0) {
            newProductsList.add(tableWithProducts.get(0));
            for (int i = 1; i < tableWithProducts.size(); i++) {
                for (int j = 0; j < newProductsList.size(); j++) {
                    if (newProductsList.get(j).getNameProduct().equals(tableWithProducts.get(i).getNameProduct())) {
                        newProductsList.get(j).setAvailableQuantity(tableWithProducts.get(i).getAvailableQuantity()
                                + newProductsList.get(j).getAvailableQuantity());
                    } else {
                        newProductsList.add(tableWithProducts.get(i));
                    }
                }
            }

            for (Product p : newProductsList) {
                System.out.println("Име: " + p.getNameProduct() + '\n' +
                        "Налично количество: " + p.getAvailableQuantity() + '\n' +
                        "Допустим брой на продуктите на рафт: " + p.getAllowableShelfValue() + '\n');
            }
        }
        else System.out.println("Няма продукти в склада");
        /*
         */
    }

    public void printListOfProducts() {
        for (Product product : tableWithProducts) {
            System.out.println(
                    "Име: " + product.getNameProduct() + '\n' +
                            "Описание: " + product.getDescription() + '\n' +
                            "Срок на годност: " + product.getExpiryDate() + '\n' +
                            "Дата на постъпване на продукта в склада: " + product.getDateEntryInWarehouse() + '\n' +
                            "Име на производител: " + product.getNameProducer() + '\n' +
                            "Мерна единица:  " + product.getUnit() + '\n' +
                            "Налично количество: " + product.getAvailableQuantity() + '\n' +
                            "Местоположение: " + product.getLocation() + '\n' +
                            "Допустим брой на продуктите на рафт: " + product.getAllowableShelfValue() + '\n' +
                            "Коментар: " + product.getComment() + '\n');
        }
    }


    public int getSection() {
        return section;
    }

    public int getShelf() {
        return shelf;
    }

    public int getNumber() {
        return number;
    }
}
