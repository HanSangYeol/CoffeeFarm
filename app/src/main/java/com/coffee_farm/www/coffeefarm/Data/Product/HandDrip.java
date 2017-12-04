package com.coffee_farm.www.coffeefarm.Data.Product;

import java.util.List;

/**
 * Created by the on 2017-12-04.
 */

public class HandDrip {

    private int id;
    private String title; // 이름
    private String kind; // 카테고리
    private String title_Img; // 타이틀사진
    private int price; // 가격
    private String manufacturer; // 제조사
    private int saved_money; // 적립금
    private int distribution_cost; // 배송비
    private int asset_inventory_surplus; // 재고수량
    private String country_of_origin; //
    private int count; // 수량
    private boolean For_sale; // 판매여부

    private List<String> product_picture; // 제품사진

    private String product_detail_info; // 제품상세정보

    public HandDrip() {
    }

    public HandDrip(int id, String title, String kind, String title_Img, int price, String manufacturer, int saved_money, int distribution_cost, int asset_inventory_surplus, String country_of_origin, int count, boolean for_sale, List<String> product_picture, String product_detail_info) {
        this.id = id;
        this.title = title;
        this.kind = kind;
        this.title_Img = title_Img;
        this.price = price;
        this.manufacturer = manufacturer;
        this.saved_money = saved_money;
        this.distribution_cost = distribution_cost;
        this.asset_inventory_surplus = asset_inventory_surplus;
        this.country_of_origin = country_of_origin;
        this.count = count;
        For_sale = for_sale;
        this.product_picture = product_picture;
        this.product_detail_info = product_detail_info;
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

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getTitle_Img() {
        return title_Img;
    }

    public void setTitle_Img(String title_Img) {
        this.title_Img = title_Img;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getSaved_money() {
        return saved_money;
    }

    public void setSaved_money(int saved_money) {
        this.saved_money = saved_money;
    }

    public int getDistribution_cost() {
        return distribution_cost;
    }

    public void setDistribution_cost(int distribution_cost) {
        this.distribution_cost = distribution_cost;
    }

    public int getAsset_inventory_surplus() {
        return asset_inventory_surplus;
    }

    public void setAsset_inventory_surplus(int asset_inventory_surplus) {
        this.asset_inventory_surplus = asset_inventory_surplus;
    }

    public String getCountry_of_origin() {
        return country_of_origin;
    }

    public void setCountry_of_origin(String country_of_origin) {
        this.country_of_origin = country_of_origin;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isFor_sale() {
        return For_sale;
    }

    public void setFor_sale(boolean for_sale) {
        For_sale = for_sale;
    }

    public List<String> getProduct_picture() {
        return product_picture;
    }

    public void setProduct_picture(List<String> product_picture) {
        this.product_picture = product_picture;
    }

    public String getProduct_detail_info() {
        return product_detail_info;
    }

    public void setProduct_detail_info(String product_detail_info) {
        this.product_detail_info = product_detail_info;
    }
}
