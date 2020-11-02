package ru.billing.client;

import ru.billing.stocklist.*;

import java.util.Date;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        String line = "Конфеты ’Маска’;45;120";
        String[] item_fld = new String[3];
        int j = 0;
        for (String retval : line.split(";")) {
            item_fld[j] = retval;j++;
       }
        FoodItem food_item1 = new FoodItem(item_fld[0], Float.valueOf(item_fld[1]), Short.valueOf(item_fld[2]));
        FoodItem food_item2 = new FoodItem("Kit-Kat");
        FoodItem food_item3 = new FoodItem("Twix");
        FoodItem food_item4 = new FoodItem("Bounty");
        FoodItem food_item5 = new FoodItem("Milka");
        FoodItem food_item6 = new FoodItem("Mars");
        FoodItem food_item7 = new FoodItem("Alpen Gold");
        FoodItem food_item8 = new FoodItem("Picnik");
        FoodItem food_item9 = new FoodItem("Milkyway");
        FoodItem food_item10 = new FoodItem("Tempo");

        ItemCatalog cat = new ItemCatalog();
        cat.addItem(food_item1);cat.addItem(food_item2);cat.addItem(food_item3);cat.addItem(food_item4);
        cat.addItem(food_item5);cat.addItem(food_item6);cat.addItem(food_item7);cat.addItem(food_item8);
        cat.addItem(food_item9);cat.addItem(food_item10);

        long begin = new Date().getTime();
        for(int i=0; i<100000;i++)
            cat.findItemByID(9);
        long end = new Date().getTime();
        System.out.println("In HashMap: "+(end-begin));
        begin = new Date().getTime();
        for(int i=0; i<100000;i++)
            cat.findItemByIDAL(9);
        end = new Date().getTime();
        System.out.println("In ArrayList: "+(end-begin));

        CatalogLoader loader = new CatalogStubLoader();
        loader.load(cat);




    }
}


