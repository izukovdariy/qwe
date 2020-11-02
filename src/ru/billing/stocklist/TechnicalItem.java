package ru.billing.stocklist;

import static java.lang.String.format;

public class TechnicalItem extends GenericItem {
    private short warrantyTime; // гарантийный срок (суток)

    public void setWarrantyTime(short warrantyTime) {
        this.warrantyTime = warrantyTime;
    }

    public short getWarrantyTime() {
        return warrantyTime;
    }
    @Override
    protected String getInfo() {
        return super.getInfo() + format(" warrantyTime: %d", warrantyTime);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TechnicalItem that = (TechnicalItem) o;
        return warrantyTime == that.warrantyTime;
    }
    @Override
    public Object clone() throws CloneNotSupportedException{
        if (this.getAnalog() != null)
            return super.clone();
        else return null;
    }

    @Override
    public String toString(){
        return  super.toString() + " warrantyTime: " + warrantyTime;
    }

}
