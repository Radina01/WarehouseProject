package com.company;

public class Product {
    private String nameProduct;
    private String description;
    private String expiryDate;
    private String dateEntryInWarehouse;
    private String nameProducer;
    private String unit;
    private String availableQuantity;
    private String location;
    private String allowableShelfValue;
    private String comment;


    public Product(String nameProduct, String description, String expiryDate, String dateEntryInWarehouse, String nameProducer, String unit, String availableQuantity, String location, String allowableShelfValue, String comment) {
        this.nameProduct = nameProduct;
        this.description = description;
        this.expiryDate = expiryDate;
        this.dateEntryInWarehouse = dateEntryInWarehouse;
        this.nameProducer = nameProducer;
        this.unit = unit;
        this.availableQuantity = availableQuantity;
        this.location = location;
        this.allowableShelfValue = allowableShelfValue;
        this.comment = comment;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public String getDescription() {
        return description;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public String getDateEntryInWarehouse() {
        return dateEntryInWarehouse;
    }

    public String getUnit() {
        return unit;
    }

    public String getAvailableQuantity() {
        return availableQuantity;
    }

    public String getLocation() {
        return location;
    }

    public String getAllowableShelfValue() {
        return allowableShelfValue;
    }

    public String getComment() {
        return comment;
    }

    public String getNameProducer() {
        return nameProducer;
    }
}

