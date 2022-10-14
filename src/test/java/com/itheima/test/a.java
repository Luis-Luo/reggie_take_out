package com.itheima.test;

import org.junit.jupiter.api.Test;

/**
 * @author luo
 */
public class a {
    String str = new String("good");
    char[] ch = {'a', 'b', 'c'};

    public static void main(String[] args) {
        a a = new a();
        a.change(a.str, a.ch);
        System.out.print(a.str + "and");
        System.out.print(a.ch);
    }

    public void change(String str, char ch[]) {
        str = "test ok";
        ch[0] = 'g';
    }


    @Test
    public void test() {
        int i = 0;
        int j = 0;
        j = i++;
        System.out.println(j);//输出0
        System.out.println(i);//输出1
        System.out.println(Math.round(11.5));
    }
}