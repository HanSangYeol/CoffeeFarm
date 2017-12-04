package com.coffee_farm.www.coffeefarm.Data.Product;

/**
 * Created by the on 2017-12-04.
 */

public class SetProductOptionItem {

    private int id;
    private String title;
    private int price;
    private SetProductOption option;

    public SetProductOptionItem() {
    }

    public SetProductOptionItem(int id, String title, int price, SetProductOption option) {
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

    public SetProductOption getOption() {
        return option;
    }

    public void setOption(SetProductOption option) {
        this.option = option;
    }
}
