package com.company;

public class AddProductsToListAndPrint {
    Potatoes potatoes = new Potatoes("Картофи", "Растение, зеленчук, кръгло, кафяв", "20-05-2020", "10-05-2020", "Самоковски картофи","килограми", 1, 200, "Ако не завърша тази програма ще хапна един суров");
    Tomatoes tomatoes = new Tomatoes("Домати", "Растение, плод, кръгло, червен", "17-05-2020", "09-05-2020", "Баба и Дядо ЕООД", "килограми", 4, 150, "Доматите са плод и са кръгли");

    public AddProductsToListAndPrint() {
   //     Warehouse.getWarehouse().addToTable(potatoes);
     //   Warehouse.getWarehouse().addToTable(tomatoes);
    }
    public void printProducts() {
        Warehouse.getWarehouse().printProducts();
    }
}
