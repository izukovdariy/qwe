package ru.billing.stocklist;

import java.util.Objects;

public class GenericItem {
    private int ID; // ID товара
    private String name; // Наименование товара
    private float price; //Цена товара
    private GenericItem analog; // аналог товара
    private Category category = Category.GENERAL;// категория товара
    private static int currentID = 1; //максимальный назначенный ID товара в текущей сессии

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setAnalog(GenericItem analog) {
        this.analog = analog;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public static int getCurrentID() {
        return currentID;
    }

    public Category getCategory() {
        return category;
    }

    public GenericItem getAnalog() {
        return analog;
    }

    public float getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }

    public GenericItem(String name, float price, Category category){
        this.name = name;
        this.price = price;
        this.category = category;
        this.ID = GenericItem.currentID++;
    }
    public GenericItem(String name, float price, GenericItem analog){
        this.name = name;
        this.price = price;
        this.analog = analog;
        this.ID = GenericItem.currentID++;
    }

    public GenericItem(){
        this.ID = GenericItem.currentID++;
    }


    public void printAll(){
        String str = getInfo();
        System.out.println(str);
    }

    protected String getInfo() {
        return String.format("ID: %d , Name: %-20s , price:%5.2f, analog: %d, category: %-10s ",ID,name,price, analog, category);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        GenericItem that = (GenericItem) o;
        return ID == that.ID &&
                Float.compare(that.price, price) == 0 &&
                analog == that.analog &&
                Objects.equals(name, that.name) &&
                category == that.category;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        Object o = super.clone();
        ((GenericItem)o).analog = (GenericItem) analog.clone();
        return o;
    }

    @Override
    public String toString(){
        return "ID: " + ID + ", Name: " + name + ", price: " + price + ", analog: " + analog + ", category: " + category ;
    }

}
