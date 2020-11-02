package ru.billing.stocklist;

import ru.billing.stocklist.GenericItem;

import java.util.ArrayList;
import java.util.HashMap;

public class ItemCatalog {
    private HashMap<Integer, GenericItem> cat = new HashMap<Integer,GenericItem>();
    private ArrayList<GenericItem> ALCatalog = new ArrayList<GenericItem>();

    public void setCat(HashMap<Integer, GenericItem> cat) {
        this.cat = cat;
    }

    public ArrayList<GenericItem> getALCatalog() {
        return ALCatalog;
    }

    public HashMap<Integer, GenericItem> getCat() {
        return cat;
    }

    public void setALCatalog(ArrayList<GenericItem> ALCatalog) {
        this.ALCatalog = ALCatalog;
    }

    public void addItem(GenericItem item) {
        cat.put(item.getID(), item); // Добавляем товар в HashMap
        ALCatalog.add(item); // Добавляем тот же товар в ArrayList
    }

    public void printItems(){
        for(GenericItem i : ALCatalog){
            System.out.println(i);
        }
    }

    public GenericItem findItemByID(int id){
        if(!cat.containsKey(id)) {
            return null;
        } else{
            return cat.get(id);
        }
    }
    public GenericItem findItemByIDAL(int id){
        for(GenericItem i : ALCatalog){
            if(i.getID()==id) return i;
        }
        return null;
    }




}
