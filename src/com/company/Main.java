package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while (true) {
            System.out.println("------------------------------------\n" +
                    "   1. Списък на наличните продукти\n" +
                    "   2. Записване на нова доставка\n" +
                    "   3. Справка за наличността в даден период\n" +
                    "   4. Изход\n" +
                    "------------------------------------");

            System.out.print("Избери една опция: ");
            Scanner scanner = new Scanner(System.in);
            byte chosenOption = scanner.nextByte();

            switch (chosenOption) {
                case 1:
                    executeFirstFunction();
                    break;
                case 2:
                    System.out.println();
                    break;
                case 3:
                    System.out.println("");
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }
    }
    public static void executeFirstFunction() {
        Potatoes potatoes = new Potatoes("Картофи", "Растение, зеленчук, кръгло, кафяв", "20-05-2020", "10-05-2020", "Самоковски картофи","килограми", "100", "1 секция, 3 рафт, 5 номер", "200", "Ако не завърша тази програма ще хапна един суров");
        Tomatoes tomatoes = new Tomatoes("Домати", "Растение, плод, кръгло, червен", "17-05-2020", "09-05-2020", "Баба и Дядо ЕООД", "килограми", "50", "1 секция, 2 рафт, 4 номер", "150", "Доматите са плод и са кръгли");
        ListOfProducts<Product> listOfProducts = new ListOfProducts<>();
        listOfProducts.addToTable(potatoes);
        listOfProducts.addToTable(tomatoes);
        listOfProducts.writeToDataBase();
    }
}
