package com.coffee_farm.www.coffeefarm.Data.Product;

/**
 * Created by the on 2017-12-04.
 */

public class PresentSetOptionItem {

    private int id;
    private String title;
    private int price;
    private PresentSetOption option;

    public PresentSetOptionItem() {
    }

    public PresentSetOptionItem(int id, String title, int price, PresentSetOption option) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.option = option;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public PresentSetOption getOption() {
        return option;
    }

    public void setOption(PresentSetOption option) {
        this.option = option;
    }
}
