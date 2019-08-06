package com.feri.juhe.joker.test;/**
 * @author Feri
 */

import com.feri.juhe.joker.util.HttpUtil;
import org.junit.Test;

/**
 *@program: Joker
 *@description:
 *@author: Feri
 *@create: 2019-08-06 16:31
 */
public class Juhe_Test {
    @Test
    public void t1(){
        String u="http://v.juhe.cn/joke/content/text.php?key=b12d46180eda262ec3a1cec558aa950e&page=1&pagesize=1";
        System.out.println("笑话："+ HttpUtil.getStr(u));
    }
}
