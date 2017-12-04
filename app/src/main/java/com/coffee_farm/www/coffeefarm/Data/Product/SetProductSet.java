package com.coffee_farm.www.coffeefarm.Data.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by the on 2017-12-04.
 */

public class SetProductSet {

    private int id;
    private String title; // 이름
    private String title_Img; // 타이틀사진
    private int price; // 가격
    private String manufacturer; // 제조사
    private int saved_money; // 적립금
    private int distribution_cost; // 배송비
    private int asset_inventory_surplus; // 재고수량
    private String country_of_origin; // 원산지
    private String grade; // 모델명
    private int select_option_1;
    private List<SetProductOption> option_1 = new ArrayList<>(); // 2중 1택
    private int select_option_2;
    private List<SetProductOption> option_2 = new ArrayList<>(); // 2중 1택
    private int beadstate;
    private List<SetProductOption> option_state = new ArrayList<>(); // 원두상태
    private int count; // 수량
    private boolean For_sale; // 판매여부

    private List<String> product_picture; // 제품사진

    private String product_detail_info; // 제품상세정보
}
