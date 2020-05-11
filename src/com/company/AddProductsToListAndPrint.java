package com.company;

public class AddProductsToListAndPrint {
    Potatoes potatoes = new Potatoes("Картофи", "Растение, зеленчук, кръгло, кафяв", "20-05-2020", "10-05-2020", "Самоковски картофи","килограми", "100", "1 секция, 3 рафт, 5 номер", "200", "Ако не завърша тази програма ще хапна един суров");
    Tomatoes tomatoes = new Tomatoes("Домати", "Растение, плод, кръгло, червен", "17-05-2020", "09-05-2020", "Баба и Дядо ЕООД", "килограми", "50", "1 секция, 2 рафт, 4 номер", "150", "Доматите са плод и са кръгли");
    ListOfProducts<Product> listOfProducts = new ListOfProducts<>();
    public void addAndPrintProducts() {
        listOfProducts.addToTable(potatoes);
        listOfProducts.addToTable(tomatoes);
        listOfProducts.printProducts();
    }
}
