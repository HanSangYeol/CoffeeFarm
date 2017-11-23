package com.coffee_farm.www.coffeefarm.Util;

import com.coffee_farm.www.coffeefarm.Data.Bean;
import com.coffee_farm.www.coffeefarm.R;

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
        GRRENBEAN_LIST.add(new Bean(1, "생두1","http://cfile26.uf.tistory.com/image/2475683A57AD6B2028AE97", 10000, "제조사", 250,2500,1000,"등급","원산지", 100,true, null,"상세정보"));
        GRRENBEAN_LIST.add(new Bean(2, "생두2","http://cfile26.uf.tistory.com/image/2475683A57AD6B2028AE97", 10000, "제조사", 250,2500,1000,"등급","원산지", 100,true, null,"상세정보"));
        GRRENBEAN_LIST.add(new Bean(3, "생두3","http://cfile26.uf.tistory.com/image/2475683A57AD6B2028AE97", 10000, "제조사", 250,2500,1000,"등급","원산지", 100,true, null,"상세정보"));
        GRRENBEAN_LIST.add(new Bean(4, "생두4","http://cfile26.uf.tistory.com/image/2475683A57AD6B2028AE97", 10000, "제조사", 250,2500,1000,"등급","원산지", 100,true, null,"상세정보"));
        GRRENBEAN_LIST.add(new Bean(5, "생두5","http://cfile26.uf.tistory.com/image/2475683A57AD6B2028AE97", 10000, "제조사", 250,2500,1000,"등급","원산지", 100,true, null,"상세정보"));
        GRRENBEAN_LIST.add(new Bean(6, "생두6","http://cfile26.uf.tistory.com/image/2475683A57AD6B2028AE97", 10000, "제조사", 250,2500,1000,"등급","원산지", 100,true, null,"상세정보"));
        GRRENBEAN_LIST.add(new Bean(7, "생두6","http://cfile26.uf.tistory.com/image/2475683A57AD6B2028AE97", 10000, "제조사", 250,2500,1000,"등급","원산지", 100,true, null,"상세정보"));
        GRRENBEAN_LIST.add(new Bean(8, "생두6","http://cfile26.uf.tistory.com/image/2475683A57AD6B2028AE97", 10000, "제조사", 250,2500,1000,"등급","원산지", 100,true, null,"상세정보"));
        GRRENBEAN_LIST.add(new Bean(9, "생두6","http://cfile26.uf.tistory.com/image/2475683A57AD6B2028AE97", 10000, "제조사", 250,2500,1000,"등급","원산지", 100,true, null,"상세정보"));
    }

    public static void BEAN_DATE(){
        BEAN_LIST.clear();
        BEAN_LIST.add(new Bean(1, "원두1","http://cfile1.uf.tistory.com/image/233E094155BA3D0F18E7B9", 10000, "제조사", 250,2500,1000,"등급","원산지", 100,true, null,"상세정보"));
        BEAN_LIST.add(new Bean(2, "원두2","http://cfile1.uf.tistory.com/image/233E094155BA3D0F18E7B9", 10000, "제조사", 250,2500,1000,"등급","원산지", 100,true, null,"상세정보"));
        BEAN_LIST.add(new Bean(3, "원두3","http://cfile1.uf.tistory.com/image/233E094155BA3D0F18E7B9", 10000, "제조사", 250,2500,1000,"등급","원산지", 100,true, null,"상세정보"));
        BEAN_LIST.add(new Bean(4, "원두4","http://cfile1.uf.tistory.com/image/233E094155BA3D0F18E7B9", 10000, "제조사", 250,2500,1000,"등급","원산지", 100,true, null,"상세정보"));
        BEAN_LIST.add(new Bean(5, "원두5","http://cfile1.uf.tistory.com/image/233E094155BA3D0F18E7B9", 10000, "제조사", 250,2500,1000,"등급","원산지", 100,true, null,"상세정보"));
    }
}
