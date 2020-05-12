package com.company;

public class Product {
    private String nameProduct;
    private String description;
    private String expiryDate;
    private String dateEntryInWarehouse;
    private String nameProducer;
    private String unit;
    private int availableQuantity;
    private String location;
    private int allowableShelfValue;
    private String comment;


    public Product(String nameProduct, String description, String expiryDate, String dateEntryInWarehouse, String nameProducer, String unit, int availableQuantity, int allowableShelfValue, String comment) {
        this.nameProduct = nameProduct;
        this.description = description;
        this.expiryDate = expiryDate;
        this.dateEntryInWarehouse = dateEntryInWarehouse;
        this.nameProducer = nameProducer;
        this.unit = unit;
        this.availableQuantity = availableQuantity;
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

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public String getLocation() {
        return location;
    }

    public int getAllowableShelfValue() {
        return allowableShelfValue;
    }

    public String getComment() {
        return comment;
    }

    public String getNameProducer() {
        return nameProducer;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public void setDateEntryInWarehouse(String dateEntryInWarehouse) {
        this.dateEntryInWarehouse = dateEntryInWarehouse;
    }

    public void setNameProducer(String nameProducer) {
        this.nameProducer = nameProducer;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setAllowableShelfValue(int allowableShelfValue) {
        this.allowableShelfValue = allowableShelfValue;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}

