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
        if (section == MAX_SECTION && shelf == MAX_SHELF && number == MAX_NUMBER_SQUARE_METERS) {
            System.out.println("Няма достатъчно място");
            return;
        }
        if ((product.getAvailableQuantity() + number > MAX_NUMBER_SQUARE_METERS)) {
            int currentQuantity = product.getAvailableQuantity();
            System.out.println("neshto");
            product.setAvailableQuantity(MAX_NUMBER_SQUARE_METERS - number);
            product.setLocation(section + "section" + ", " + shelf + "shelf" + ", " + number + "number");

            this.tableWithProducts.add(product);
            number = 0;
            while (product.getAvailableQuantity() > MAX_NUMBER_SQUARE_METERS) {
                if (shelf + 1 > MAX_SHELF) {
                    if (section + 1 > MAX_SECTION) {
                        System.out.println("Няма достатъчно място");
                        return;
                    } else section++;
                } else shelf++;
                product.setAvailableQuantity(product.getAvailableQuantity() - MAX_NUMBER_SQUARE_METERS);
            }
            product.setAvailableQuantity(product.getAvailableQuantity());
            addToTable(product);
        } else {
            number += product.getAvailableQuantity();
            product.setLocation(section + "section" + ", " + shelf + "shelf" + ", " + number + "number");
            this.tableWithProducts.add(product);
        }
    }

    public void printProducts() {
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
