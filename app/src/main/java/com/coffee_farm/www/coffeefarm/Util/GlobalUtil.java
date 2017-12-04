package com.coffee_farm.www.coffeefarm.Util;

import com.coffee_farm.www.coffeefarm.Data.Product.Bean;
import com.coffee_farm.www.coffeefarm.Data.Product.Greenbean;
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

    public static void GREENBEAN_DATE(){
        GRRENBEAN_LIST.clear();
        GRRENBEAN_LIST.add(new Greenbean(1, "생두1","PNG","http://cfile26.uf.tistory.com/image/2475683A57AD6B2028AE97", 10000, "제조사", 250,2500,1000,"등급","원산지", 100,true, null,"상세정보"));
        GRRENBEAN_LIST.add(new Greenbean(2, "생두2","오세아니아","http://cfile26.uf.tistory.com/image/2475683A57AD6B2028AE97", 10000, "제조사", 250,2500,1000,"등급","원산지", 100,true, null,"상세정보"));
        GRRENBEAN_LIST.add(new Greenbean(3, "생두3","중남미","http://coffee-farm.com/skin/goods/list/46.jpg", 10000, "제조사", 250,2500,1000,"등급","원산지", 100,true, null,"상세정보"));
        GRRENBEAN_LIST.add(new Greenbean(4, "생두4","중남미","http://coffee-farm.com/skin/goods/list/46.jpg", 10000, "제조사", 250,2500,1000,"등급","원산지", 100,true, null,"상세정보"));
        GRRENBEAN_LIST.add(new Greenbean(5, "생두5","중남미","http://coffee-farm.com/skin/goods/list/46.jpg", 10000, "제조사", 250,2500,1000,"등급","원산지", 100,true, null,"상세정보"));
        GRRENBEAN_LIST.add(new Greenbean(6, "생두6","아프리카","http://coffee-farm.com/skin/goods/list/54.jpg", 10000, "제조사", 250,2500,1000,"등급","원산지", 100,true, null,"상세정보"));
        GRRENBEAN_LIST.add(new Greenbean(7, "생두7","아프리카","http://coffee-farm.com/skin/goods/list/54.jpg", 10000, "제조사", 250,2500,1000,"등급","원산지", 100,true, null,"상세정보"));
        GRRENBEAN_LIST.add(new Greenbean(8, "생두8","아프리카","http://coffee-farm.com/skin/goods/list/54.jpg", 10000, "제조사", 250,2500,1000,"등급","원산지", 100,true, null,"상세정보"));
        GRRENBEAN_LIST.add(new Greenbean(9, "생두9","아프리카","http://coffee-farm.com/skin/goods/list/54.jpg", 10000, "제조사", 250,2500,1000,"등급","원산지", 100,true, null,"상세정보"));
        GRRENBEAN_LIST.add(new Greenbean(10,"생두10" ,"북미","http://coffee-farm.com/skin/goods/list/127.jpg", 10000, "제조사", 250,2500,1000,"등급","원산지", 100,true, null,"상세정보"));
        GRRENBEAN_LIST.add(new Greenbean(11,"생두11" ,"하와이","http://coffee-farm.com/skin/goods/list/59.jpg", 10000, "제조사", 250,2500,1000,"등급","원산지", 100,true, null,"상세정보"));
        GRRENBEAN_LIST.add(new Greenbean(12,"생두12" ,"아시아","http://coffee-farm.com/skin/goods/list/62.jpg", 10000, "제조사", 250,2500,1000,"등급","원산지", 100,true, null,"상세정보"));
        GRRENBEAN_LIST.add(new Greenbean(13,"생두13" ,"중동","http://coffee-farm.com/skin/goods/list/56.jpg", 10000, "제조사", 250,2500,1000,"등급","원산지", 100,true, null,"상세정보"));
        GRRENBEAN_LIST.add(new Greenbean(14,"생두14" ,"중동","http://coffee-farm.com/skin/goods/list/56.jpg", 10000, "제조사", 250,2500,1000,"등급","원산지", 100,true, null,"상세정보"));
        GRRENBEAN_LIST.add(new Greenbean(15,"생두15" ,"중동","http://coffee-farm.com/skin/goods/list/56.jpg", 10000, "제조사", 250,2500,1000,"등급","원산지", 100,true, null,"상세정보"));

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
}
