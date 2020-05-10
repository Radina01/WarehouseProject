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
                    Potatoes potatoes = new Potatoes("f", "f", "f", "f", "f", "f", "f", "f", "f");
                    ListOfProducts<Product> listOfProducts = new ListOfProducts<>();
                    listOfProducts.addToTable(potatoes);
                    listOfProducts.writeToDataBase();
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
}
