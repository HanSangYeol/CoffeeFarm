package com.coffee_farm.www.coffeefarm.Util;

import com.coffee_farm.www.coffeefarm.Data.Product.Bean;
import com.coffee_farm.www.coffeefarm.Data.Product.CoffeeMachine;
import com.coffee_farm.www.coffeefarm.Data.Product.Espresso;
import com.coffee_farm.www.coffeefarm.Data.Product.Greenbean;
import com.coffee_farm.www.coffeefarm.Data.Product.HandDrip;
import com.coffee_farm.www.coffeefarm.Data.Product.PresentSet;
import com.coffee_farm.www.coffeefarm.Data.Product.ProductSet;
import com.coffee_farm.www.coffeefarm.Data.Product.Teabag;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by the on 2017-11-23.
 */

public class GlobalUtil {

    public static final List<Greenbean> GRRENBEAN_LIST = new ArrayList<>();
    public static final List<Bean> BEAN_LIST = new ArrayList<>();
    public static final List<Teabag> TEABAG_LIST = new ArrayList<>();
    public static final List<ProductSet> SETPRODUCT_LIST = new ArrayList<>();
    public static final List<PresentSet> PRESENTSET_LIST = new ArrayList<>();
    public static final List<Espresso> ESPRESSO_LIST = new ArrayList<>();
    public static final List<HandDrip> HANDDRIP_LIST = new ArrayList<>();
    public static final List<CoffeeMachine> COFFEE_MACHINES_LIST = new ArrayList<>();

    public static void GREENBEAN_DATE(){
        GRRENBEAN_LIST.clear();
        GRRENBEAN_LIST.add(new Greenbean(1, "생두1","PNG","http://cfile26.uf.tistory.com/image/2475683A57AD6B2028AE97", 12000, "제조사", 250,2500,1000,"등급","원산지", 100,true, null,"상세정보"));
        GRRENBEAN_LIST.add(new Greenbean(2, "생두2","오세아니아","http://cfile26.uf.tistory.com/image/2475683A57AD6B2028AE97", 12000, "제조사", 250,2500,1000,"등급","원산지", 100,true, null,"상세정보"));
        GRRENBEAN_LIST.add(new Greenbean(3, "생두3","중남미","http://coffee-farm.com/skin/goods/list/46.jpg", 14000, "제조사", 250,2500,1000,"등급","원산지", 100,true, null,"상세정보"));
        GRRENBEAN_LIST.add(new Greenbean(4, "생두4","중남미","http://coffee-farm.com/skin/goods/list/46.jpg", 14000, "제조사", 250,2500,1000,"등급","원산지", 100,true, null,"상세정보"));
        GRRENBEAN_LIST.add(new Greenbean(5, "생두5","중남미","http://coffee-farm.com/skin/goods/list/46.jpg", 14000, "제조사", 250,2500,1000,"등급","원산지", 100,true, null,"상세정보"));
        GRRENBEAN_LIST.add(new Greenbean(6, "생두6","아프리카","http://coffee-farm.com/skin/goods/list/54.jpg", 15000, "제조사", 250,2500,1000,"등급","원산지", 100,true, null,"상세정보"));
        GRRENBEAN_LIST.add(new Greenbean(7, "생두7","아프리카","http://coffee-farm.com/skin/goods/list/54.jpg", 15000, "제조사", 250,2500,1000,"등급","원산지", 100,true, null,"상세정보"));
        GRRENBEAN_LIST.add(new Greenbean(8, "생두8","아프리카","http://coffee-farm.com/skin/goods/list/54.jpg", 15000, "제조사", 250,2500,1000,"등급","원산지", 100,true, null,"상세정보"));
        GRRENBEAN_LIST.add(new Greenbean(9, "생두9","아프리카","http://coffee-farm.com/skin/goods/list/54.jpg", 15000, "제조사", 250,2500,1000,"등급","원산지", 100,true, null,"상세정보"));
        GRRENBEAN_LIST.add(new Greenbean(10,"생두10" ,"북미","http://coffee-farm.com/skin/goods/list/127.jpg", 9000, "제조사", 250,2500,1000,"등급","원산지", 100,true, null,"상세정보"));
        GRRENBEAN_LIST.add(new Greenbean(11,"생두11" ,"하와이","http://coffee-farm.com/skin/goods/list/59.jpg", 7000, "제조사", 250,2500,1000,"등급","원산지", 100,true, null,"상세정보"));
        GRRENBEAN_LIST.add(new Greenbean(12,"생두12" ,"아시아","http://coffee-farm.com/skin/goods/list/62.jpg", 7000, "제조사", 250,2500,1000,"등급","원산지", 100,true, null,"상세정보"));
        GRRENBEAN_LIST.add(new Greenbean(13,"생두13" ,"중동","http://coffee-farm.com/skin/goods/list/56.jpg", 20000, "제조사", 250,2500,1000,"등급","원산지", 100,true, null,"상세정보"));
        GRRENBEAN_LIST.add(new Greenbean(14,"생두14" ,"중동","http://coffee-farm.com/skin/goods/list/56.jpg", 20000, "제조사", 250,2500,1000,"등급","원산지", 100,true, null,"상세정보"));
        GRRENBEAN_LIST.add(new Greenbean(15,"생두15" ,"중동","http://coffee-farm.com/skin/goods/list/56.jpg", 20000, "제조사", 250,2500,1000,"등급","원산지", 100,true, null,"상세정보"));

    }

    public static void BEAN_DATE(){
        BEAN_LIST.clear();
        BEAN_LIST.add(new Bean(1, "원두1","PNG","http://coffee-farm.com/admin/images/no_img60.gif", 10000, "제조사", 250,2500,1000,"등급","원산지", 100,true, null,"상세정보"));
        BEAN_LIST.add(new Bean(2, "원두2","PNG","http://coffee-farm.com/admin/images/no_img60.gif", 10000, "제조사", 250,2500,1000,"등급","원산지", 100,true, null,"상세정보"));
        BEAN_LIST.add(new Bean(3, "원두3","오세아니아","http://coffee-farm.com/admin/images/no_img60.gif", 10000, "제조사", 250,2500,1000,"등급","원산지", 100,true, null,"상세정보"));
        BEAN_LIST.add(new Bean(4, "원두4","중남미","http://coffee-farm.com/skin/goods/list/177.jpg", 10000, "제조사", 250,2500,1000,"등급","원산지", 100,true, null,"상세정보"));
        BEAN_LIST.add(new Bean(5, "원두5","아프리카","http://coffee-farm.com/skin/goods/list/178.jpg", 10000, "제조사", 250,2500,1000,"등급","원산지", 100,true, null,"상세정보"));
        BEAN_LIST.add(new Bean(6, "원두5","아프리카","http://coffee-farm.com/skin/goods/list/178.jpg", 10000, "제조사", 250,2500,1000,"등급","원산지", 100,true, null,"상세정보"));
        BEAN_LIST.add(new Bean(7, "원두5","아프리카","http://coffee-farm.com/skin/goods/list/178.jpg", 10000, "제조사", 250,2500,1000,"등급","원산지", 100,true, null,"상세정보"));
        BEAN_LIST.add(new Bean(8, "원두5","아프리카","http://coffee-farm.com/skin/goods/list/178.jpg", 10000, "제조사", 250,2500,1000,"등급","원산지", 100,true, null,"상세정보"));
        BEAN_LIST.add(new Bean(9, "원두5","북미","http://coffee-farm.com/skin/goods/list/166.jpg", 10000, "제조사", 250,2500,1000,"등급","원산지", 100,true, null,"상세정보"));
        BEAN_LIST.add(new Bean(10, "원두5","북미","http://coffee-farm.com/skin/goods/list/166.jpg", 10000, "제조사", 250,2500,1000,"등급","원산지", 100,true, null,"상세정보"));
        BEAN_LIST.add(new Bean(11, "원두5","북미","http://coffee-farm.com/skin/goods/list/166.jpg", 10000, "제조사", 250,2500,1000,"등급","원산지", 100,true, null,"상세정보"));
        BEAN_LIST.add(new Bean(12, "원두5","하와이","http://coffee-farm.com/skin/goods/list/166.jpg", 10000, "제조사", 250,2500,1000,"등급","원산지", 100,true, null,"상세정보"));
        BEAN_LIST.add(new Bean(13, "원두5","하와이","http://coffee-farm.com/skin/goods/list/166.jpg", 10000, "제조사", 250,2500,1000,"등급","원산지", 100,true, null,"상세정보"));
        BEAN_LIST.add(new Bean(14, "원두5","아시아","http://coffee-farm.com/skin/goods/list/166.jpg", 10000, "제조사", 250,2500,1000,"등급","원산지", 100,true, null,"상세정보"));
        BEAN_LIST.add(new Bean(15, "원두5","중동","http://coffee-farm.com/skin/goods/list/168.jpg", 10000, "제조사", 250,2500,1000,"등급","원산지", 100,true, null,"상세정보"));
        BEAN_LIST.add(new Bean(16, "원두5","중동","http://coffee-farm.com/skin/goods/list/168.jpg", 10000, "제조사", 250,2500,1000,"등급","원산지", 100,true, null,"상세정보"));
        BEAN_LIST.add(new Bean(17, "원두5","아시아","http://coffee-farm.com/skin/goods/list/168.jpg", 10000, "제조사", 250,2500,1000,"등급","원산지", 100,true, null,"상세정보"));
        BEAN_LIST.add(new Bean(18, "원두5","아시아","http://coffee-farm.com/skin/goods/list/168.jpg", 10000, "제조사", 250,2500,1000,"등급","원산지", 100,true, null,"상세정보"));
        BEAN_LIST.add(new Bean(19, "원두5","아시아","http://coffee-farm.com/skin/goods/list/168.jpg", 10000, "제조사", 250,2500,1000,"등급","원산지", 100,true, null,"상세정보"));

    }

    public static void TEABAG_DATA(){
        TEABAG_LIST.clear();
        TEABAG_LIST.add(new Teabag(1, "티백1", "드립티백", "http://coffee-farm.com/skin/goods/list/162.jpg",  12000, "커피팜", 250, 2500, 1000, "등급", "원산지", 100, true, null, null));
        TEABAG_LIST.add(new Teabag(2, "티백2", "캔커피", "http://coffee-farm.com/skin/goods/list/g201205182104_189_list.jpg",  12000, "커피팜", 250, 2500, 1000, "등급", "원산지", 100, true, null, null));
        TEABAG_LIST.add(new Teabag(3, "티백3", "더치커피", "http://coffee-farm.com/skin/goods/list/g201305241152_193_list.jpg",  12000, "커피팜", 250, 2500, 1000, "등급", "원산지", 100, true, null, null));
        TEABAG_LIST.add(new Teabag(4, "티백4", "더치커피", "http://coffee-farm.com/skin/goods/list/g201305241154_194_list.jpg",  12000, "커피팜", 250, 2500, 1000, "등급", "원산지", 100, true, null, null));

    }

    public static void SETPRODUCT_DATA(){
        SETPRODUCT_LIST.clear();
        SETPRODUCT_LIST.add(new ProductSet(1, "세트상품1", "세트상품", "http://coffee-farm.com/admin/images/no_img60.gif",  12000, "커피팜", 250, 2500, 1000, "등급", "원산지", 100, true, null, null));
        SETPRODUCT_LIST.add(new ProductSet(2, "세트상품2", "세트상품", "http://coffee-farm.com/admin/images/no_img60.gif",  12000, "커피팜", 250, 2500, 1000, "등급", "원산지", 100, true, null, null));
        SETPRODUCT_LIST.add(new ProductSet(3, "세트상품3", "세트상품", "http://coffee-farm.com/admin/images/no_img60.gif",  12000, "커피팜", 250, 2500, 1000, "등급", "원산지", 100, true, null, null));
        SETPRODUCT_LIST.add(new ProductSet(4, "세트상품4", "세트상품", "http://coffee-farm.com/admin/images/no_img60.gif",  12000, "커피팜", 250, 2500, 1000, "등급", "원산지", 100, true, null, null));
    }

    public static void PRESENTSET_DATA(){
        PRESENTSET_LIST.clear();
        PRESENTSET_LIST.add(new PresentSet(1, "선물세트1", "드립티백세트", "http://coffee-farm.com/skin/goods/list/155.jpg",  12000, "커피팜", 250, 2500, 1000, "등급", "원산지", 100, true, null, null));
        PRESENTSET_LIST.add(new PresentSet(2, "선물세트2", "원두제품세트", "http://coffee-farm.com/skin/goods/list/155.jpg",  12000, "커피팜", 250, 2500, 1000, "등급", "원산지", 100, true, null, null));
        PRESENTSET_LIST.add(new PresentSet(3, "선물세트3", "원두제품세트", "http://coffee-farm.com/skin/goods/list/155.jpg",  12000, "커피팜", 250, 2500, 1000, "등급", "원산지", 100, true, null, null));
        PRESENTSET_LIST.add(new PresentSet(4, "선물세트4", "원두제품세트", "http://coffee-farm.com/skin/goods/list/155.jpg",  12000, "커피팜", 250, 2500, 1000, "등급", "원산지", 100, true, null, null));
        PRESENTSET_LIST.add(new PresentSet(5, "선물세트5", "원두제품세트", "http://coffee-farm.com/skin/goods/list/155.jpg",  12000, "커피팜", 250, 2500, 1000, "등급", "원산지", 100, true, null, null));
    }

    public static void ESPRESSO_DATA(){
        ESPRESSO_LIST.clear();
        ESPRESSO_LIST.add(new Espresso(1, "에스프레소1", "에스프레스 커피", "http://coffee-farm.com/skin/goods/list/155.jpg",  12000, "커피팜", 250, 2500, 1000, 100, true, null, null));
        ESPRESSO_LIST.add(new Espresso(2, "에스프레소2", "에스프레스 커피", "http://coffee-farm.com/skin/goods/list/155.jpg",  12000, "커피팜", 250, 2500, 1000, 100, true, null, null));
        ESPRESSO_LIST.add(new Espresso(3, "에스프레소3", "에스프레스 커피", "http://coffee-farm.com/skin/goods/list/155.jpg",  12000, "커피팜", 250, 2500, 1000, 100, true, null, null));
    }

    public static void HANDDRIP_DATA(){
        HANDDRIP_LIST.clear();
        HANDDRIP_LIST.add(new HandDrip(1, "드리퍼1", "드리퍼", "http://coffee-farm.com/skin/goods/list/96.jpg",  12000, "커피팜", 250, 2500, 1000,"커피팜",100, true, null, null));
        HANDDRIP_LIST.add(new HandDrip(2, "드리퍼2", "드리퍼", "http://coffee-farm.com/skin/goods/list/96.jpg",  12000, "커피팜", 250, 2500, 1000,"커피팜",100, true, null, null));
        HANDDRIP_LIST.add(new HandDrip(3, "드리퍼3", "드리퍼", "http://coffee-farm.com/skin/goods/list/96.jpg",  12000, "커피팜", 250, 2500, 1000,"커피팜",100, true, null, null));
        HANDDRIP_LIST.add(new HandDrip(3, "드립서버1", "드립서버", "http://coffee-farm.com/skin/goods/list/103.jpg",  12000, "커피팜", 250, 2500, 1000,"커피팜",100, true, null, null));HANDDRIP_LIST.add(new HandDrip(3, "에스프레소3", "에스프레스 커피", "http://coffee-farm.com/skin/goods/list/155.jpg",  12000, "커피팜", 250, 2500, 1000,"커피팜",100, true, null, null));
        HANDDRIP_LIST.add(new HandDrip(3, "드립서버2", "드립서버", "http://coffee-farm.com/skin/goods/list/103.jpg",  12000, "커피팜", 250, 2500, 1000,"커피팜",100, true, null, null));
        HANDDRIP_LIST.add(new HandDrip(3, "드립서버3", "드립서버", "http://coffee-farm.com/skin/goods/list/103.jpg",  12000, "커피팜", 250, 2500, 1000,"커피팜",100, true, null, null));
        HANDDRIP_LIST.add(new HandDrip(3, "드립서버4", "드립서버", "http://coffee-farm.com/skin/goods/list/103.jpg",  12000, "커피팜", 250, 2500, 1000,"커피팜",100, true, null, null));
        HANDDRIP_LIST.add(new HandDrip(3, "드립서버5", "드립서버", "http://coffee-farm.com/skin/goods/list/103.jpg",  12000, "커피팜", 250, 2500, 1000,"커피팜",100, true, null, null));
        HANDDRIP_LIST.add(new HandDrip(3, "드립포트1", "드립포트", "http://coffee-farm.com/skin/goods/list/99.jpg",  12000, "커피팜", 250, 2500, 1000,"커피팜",100, true, null, null));
        HANDDRIP_LIST.add(new HandDrip(3, "필터/소모품/기타1", "필터/소모품/기타", "http://coffee-farm.com/skin/goods/list/118.jpg",  12000, "커피팜", 250, 2500, 1000,"커피팜",100, true, null, null));
        HANDDRIP_LIST.add(new HandDrip(3, "필터/소모품/기타2", "필터/소모품/기타", "http://coffee-farm.com/skin/goods/list/118.jpg",  12000, "커피팜", 250, 2500, 1000,"커피팜",100, true, null, null));
        HANDDRIP_LIST.add(new HandDrip(3, "필터/소모품/기타3", "필터/소모품/기타", "http://coffee-farm.com/skin/goods/list/118.jpg",  12000, "커피팜", 250, 2500, 1000,"커피팜",100, true, null, null));
        HANDDRIP_LIST.add(new HandDrip(3, "드립세트1", "드립세트", "http://coffee-farm.com/skin/goods/list/120.jpg",  12000, "커피팜", 250, 2500, 1000,"커피팜",100, true, null, null));
        HANDDRIP_LIST.add(new HandDrip(3, "드립세트2", "드립세트", "http://coffee-farm.com/skin/goods/list/120.jpg",  12000, "커피팜", 250, 2500, 1000,"커피팜",100, true, null, null));
    }

    public static void COFFEE_MACHINE_DATA(){
        COFFEE_MACHINES_LIST.clear();
        COFFEE_MACHINES_LIST.add(new CoffeeMachine(1, "커피머신1", "커피머신", "http://coffee-farm.com/skin/goods/list/143.jpg",  12000, "커피팜", 250, 2500, 1000,"커피팜",100, true, null, null));
        COFFEE_MACHINES_LIST.add(new CoffeeMachine(2, "커피머신2", "커피머신", "http://coffee-farm.com/skin/goods/list/119.jpg",  12000, "커피팜", 250, 2500, 1000,"커피팜",100, true, null, null));

    }
}
