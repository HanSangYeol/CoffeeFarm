package com.coffee_farm.www.coffeefarm.Data.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by the on 2017-12-04.
 */

public class PresentSetOption {

    private int id;
    private String title;
    private Teabag teabag;
    private List<PresentSetOptionItem> items = new ArrayList<>();

    public PresentSetOption() {
    }

    public PresentSetOption(int id, String title, Teabag teabag) {
        this.id = id;
        this.title = title;
        this.teabag = teabag;
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

    public Teabag getTeabag() {
        return teabag;
    }

    public void setTeabag(Teabag teabag) {
        this.teabag = teabag;
    }

    public List<PresentSetOptionItem> getItems() {
        return items;
    }

    public void setItems(List<PresentSetOptionItem> items) {
        this.items = items;
    }
}
