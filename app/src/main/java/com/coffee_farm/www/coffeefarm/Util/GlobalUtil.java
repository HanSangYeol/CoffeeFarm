package com.coffee_farm.www.coffeefarm.Util;

import com.coffee_farm.www.coffeefarm.Data.Bean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by the on 2017-11-23.
 */

public class GlobalUtil {

    public static final List<Bean> GRRENBEAN_LIST = new ArrayList<>();
    public static final List<Bean> BEAN_LIST = new ArrayList<>();

    public static void GREENBEAN_DATE(){
        GRRENBEAN_LIST.clear();
        GRRENBEAN_LIST.add(new Bean(1, "생두1", 10000, "제조사", 250,2500,1000,"등급","원산지", 100,true, null,"상세정보"));
        GRRENBEAN_LIST.add(new Bean(2, "생두2", 10000, "제조사", 250,2500,1000,"등급","원산지", 100,true, null,"상세정보"));
        GRRENBEAN_LIST.add(new Bean(3, "생두3", 10000, "제조사", 250,2500,1000,"등급","원산지", 100,true, null,"상세정보"));
        GRRENBEAN_LIST.add(new Bean(4, "생두4", 10000, "제조사", 250,2500,1000,"등급","원산지", 100,true, null,"상세정보"));
        GRRENBEAN_LIST.add(new Bean(5, "생두5", 10000, "제조사", 250,2500,1000,"등급","원산지", 100,true, null,"상세정보"));
        GRRENBEAN_LIST.add(new Bean(6, "생두6", 10000, "제조사", 250,2500,1000,"등급","원산지", 100,true, null,"상세정보"));
    }

    public static void BEAN_DATE(){
        BEAN_LIST.clear();
        BEAN_LIST.add(new Bean(1, "원두1", 10000, "제조사", 250,2500,1000,"등급","원산지", 100,true, null,"상세정보"));
        BEAN_LIST.add(new Bean(2, "원두2", 10000, "제조사", 250,2500,1000,"등급","원산지", 100,true, null,"상세정보"));
        BEAN_LIST.add(new Bean(3, "원두3", 10000, "제조사", 250,2500,1000,"등급","원산지", 100,true, null,"상세정보"));
        BEAN_LIST.add(new Bean(4, "원두4", 10000, "제조사", 250,2500,1000,"등급","원산지", 100,true, null,"상세정보"));
        BEAN_LIST.add(new Bean(5, "원두5", 10000, "제조사", 250,2500,1000,"등급","원산지", 100,true, null,"상세정보"));
        BEAN_LIST.add(new Bean(6, "원두6", 10000, "제조사", 250,2500,1000,"등급","원산지", 100,true, null,"상세정보"));
    }
}
