package com.company;

import java.util.Scanner;

public class NewDelivery {
    Scanner scanner = new Scanner(System.in);
    String newName;
    String newDescription;
    String newExpiryDate;
    String newDateOfEnteringTheWarehouse;
    String newUnit;
    int newAvailableQuantity;
    String newAllowableShelfValue;
    String newComment;
    String newNameProducer;

    public void enterData() {
        enterNameOfNewProduct();
        enterDescriptionOfNewProduct();
        enterExpiryDateOfNewProduct();
        enterDateOfEnteringTheWarehouseOfNewProduct();
        enterNameProducerOfNewProduct();
        enterUnitOfNewProduct();
        enterAvailableQuantityOfNewProduct();
        enterAllowableShelfValueOfNewProduct();
        enterCommentOfNewProduct();
        Warehouse.getWarehouse().addToTable(makeNewProductObject());
    }

    public Product makeNewProductObject() {
        Product product = new Product(newName, newDescription, newExpiryDate, newDateOfEnteringTheWarehouse, newNameProducer, newUnit, newAvailableQuantity, newAllowableShelfValue, newComment);
        return product;
    }

    public String enterNameOfNewProduct() {
        System.out.println("Въведете името на продукта, който искате да поръчате: " + newName);
        this.newName = scanner.next();
        return newName;
    }

    public String enterDescriptionOfNewProduct() {
        System.out.println("Въведете описанието на продукта, който искате да поръчате: " + newDescription);
        this.newDescription = scanner.next();
        return newDescription;
    }

    public String enterExpiryDateOfNewProduct() {
        System.out.println("Въведете срока на годност на продукта, който искате да поръчате: " + newExpiryDate);
        this.newExpiryDate = scanner.next();
        return newExpiryDate;
    }

    public String enterDateOfEnteringTheWarehouseOfNewProduct() {
        System.out.println("Въведете дата на постъпване на продукта в склада, който искате да поръчате: " + newDateOfEnteringTheWarehouse);
        this.newDateOfEnteringTheWarehouse = scanner.next();
        return newDateOfEnteringTheWarehouse;
    }

    public String enterUnitOfNewProduct() {
        System.out.println("Въведете описанието продукта, който искате да поръчате: " + newUnit);
        this.newUnit = scanner.next();
        return newUnit;
    }

    public String enterAllowableShelfValueOfNewProduct() {
        System.out.println("Въведете описанието продукта, който искате да поръчате: " + newAllowableShelfValue);
        this.newAllowableShelfValue = scanner.next();
        return newAllowableShelfValue;
    }

    public String enterCommentOfNewProduct() {
        System.out.println("Въведете описанието продукта, който искате да поръчате: " + newComment);
        this.newComment = scanner.next();
        return newComment;
    }

    public String enterNameProducerOfNewProduct() {
        System.out.println("Въведете описанието продукта, който искате да поръчате: " + newNameProducer);
        this.newNameProducer = scanner.next();
        return newNameProducer;
    }

    public int enterAvailableQuantityOfNewProduct() {
        System.out.println("Въведете количеството на продукта, който искате да поръчате: " + newAvailableQuantity);
        this.newAvailableQuantity = scanner.nextInt();
        return newAvailableQuantity;
    }
}
