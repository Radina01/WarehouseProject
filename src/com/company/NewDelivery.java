package com.company;

import java.util.List;
import java.util.Scanner;

public class NewDelivery<T> {
    Scanner scanner = new Scanner(System.in);
    String newName;
    String newDescription;
    String newExpiryDate;
    String newDateOfEnteringTheWarehouse;
    String newUnit;
    String newAvailableQuantity;
    String newLocation;
    String newAllowableShelfValue;
    String newComment;
    String newNameProducer;
    List<T> tableWithProducts;

    /*public T check() {
        for (T product : tableWithProducts) {
            if (product.getNameProduct().equals(enterNameOfNewProduct())) {
                if (product.getExpiryDate().equals(enterExpiryDateOfNewProduct())) {
                    tableWithProducts.remove(product);

                }
            }
        }
    }

    /*public Object makeNewProductObject() {
        T product = new T(newName, newDescription, newExpiryDate, newDateOfEnteringTheWarehouse, newNameProducer, newUnit, newAvailableQuantity, newLocation, newAllowableShelfValue, newComment);
        return product;
    }*/

    public String enterNameOfNewProduct() {
        this.newName = scanner.next();
        System.out.println("Въведете името на продукта, който искате да поръчате: " + newName);
        return newName;
    }

    public String enterDescriptionOfNewProduct() {
        this.newDescription = scanner.next();
        System.out.println("Въведете описанието на продукта, който искате да поръчате: " + newDescription);
        return newDescription;
    }

    public String enterExpiryDateOfNewProduct() {
        this.newExpiryDate = scanner.next();
        System.out.println("Въведете срока на годност на продукта, който искате да поръчате: " + newExpiryDate);
        return newExpiryDate;
    }

    public String enterDateOfEnteringTheWarehouseOfNewProduct() {
        this.newDateOfEnteringTheWarehouse = scanner.next();
        System.out.println("Въведете описанието продукта, който искате да поръчате: " + newDateOfEnteringTheWarehouse);
        return newDateOfEnteringTheWarehouse;
    }

    public String enterUnitOfNewProduct() {
        this.newUnit = scanner.next();
        System.out.println("Въведете описанието продукта, който искате да поръчате: " + newUnit);
        return newUnit;
    }

    public String enterLocationOfNewProduct() {
        this.newLocation = scanner.next();
        System.out.println("Въведете описанието продукта, който искате да поръчате: " + newLocation);
        return newLocation;
    }

    public String enterAllowableShelfValueOfNewProduct() {
        this.newAllowableShelfValue = scanner.next();
        System.out.println("Въведете описанието продукта, който искате да поръчате: " + newAllowableShelfValue);
        return newAllowableShelfValue;
    }

    public String enterCommentOfNewProduct() {
        this.newComment = scanner.next();
        System.out.println("Въведете описанието продукта, който искате да поръчате: " + newComment);
        return newComment;
    }

    public String enterNameProducerOfNewProduct() {
        this.newNameProducer = scanner.next();
        System.out.println("Въведете описанието продукта, който искате да поръчате: " + newNameProducer);
        return newNameProducer;
    }

    public String enterAvailableQuantityOfNewProduct() {
        this.newAvailableQuantity = scanner.next();
        System.out.println("Въведете описанието продукта, който искате да поръчате: " + newAvailableQuantity);
        return newAvailableQuantity;
    }
}
