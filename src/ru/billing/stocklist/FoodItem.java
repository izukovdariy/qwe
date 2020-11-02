package ru.billing.stocklist;

import java.util.Date;
import java.util.Objects;

import static java.lang.String.format;

public class FoodItem extends GenericItem {
    private Date dateOfIncome ; // дата производства
    private short expires; // срок годности

    public short getExpires() {
        return expires;
    }

    public Date getDateOfIncome() {
        return dateOfIncome;
    }

    public void setExpires(short expires) {
        this.expires = expires;
    }

    public void setDateOfIncome(Date dateOfIncome) {
        this.dateOfIncome = dateOfIncome;
    }

    public FoodItem(String name, float price, FoodItem analog, Date date, short expires){
        this.setName(name);
        this.setPrice(price);
        this.setAnalog(analog);
        this.dateOfIncome = date;
        this.expires = expires;
    }
    public FoodItem(String name, float price, short expires){
        this(name, price, null, new Date(), expires);
    }
    public FoodItem(String name){
        this("no_name", 0, null, new Date(), (short)0);
    }


    @Override
    protected String getInfo() {
        return super.getInfo() + format(" dateOfIncome: %s, expires: %d", dateOfIncome.toString(), expires);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        FoodItem foodItem = (FoodItem) o;
        return expires == foodItem.expires &&
                Objects.equals(dateOfIncome, foodItem.dateOfIncome);
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        if (this.getAnalog() != null)
        return super.clone();
        else return null;
    }

    @Override
    public String toString(){
        return  super.toString() + " dateOfIncome: " + dateOfIncome + ", expires: " + expires;
    }

}
