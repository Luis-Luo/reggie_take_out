package com.itheima.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class UploadFileTest {
    @Test
    public void test1() {
        String fileName = "ererewe.jpg";
        String suffix = fileName.substring(fileName.lastIndexOf("."));
        System.out.println(suffix);
    }


    /**
     * 栈：先进后出
     */
    @Test
    void stack() {
        ArrayList<String> str = new ArrayList<>();
        str.add("1");
        str.add("2");
        str.add("3");
        str.add("4");
        for (String list : str) {
            System.out.println(list);
        }

        for (int i = str.toArray().length - 1; i >= 0; i--) {
            String remove = str.remove(i);
            System.out.println(remove);
        }
    }

    @Test
    void queue() {
        ArrayList<String> str = new ArrayList<>();
        str.add("1");
        str.add("2");
        str.add("3");
        str.add("4");
        for (String list : str) {
            System.out.println(list);
        }

        for (int i = 0; i <= str.toArray().length - 1; i++) {
            String a = str.get(i);
            System.out.println(a);
        }
    }

    @Test
    void test() throws Exception {
        int[] a = {1, 6, 4, 7, 8, 9, 5, 2};
        int[] sort = sort(a);
        for (int i = 0; i < sort.length; i++) {
            System.out.println(sort[i]);
        }
    }

    public int[] sort(int[] sourceArray) throws Exception {
        // 对 arr 进行拷贝，不改变参数内容
        int[] arr = Arrays.copyOf(sourceArray, sourceArray.length);

        for (int i = 1; i < arr.length; i++) {
            // 设定一个标记，若为true，则表示此次循环没有进行交换，也就是待排序列已经有序，排序已经完成。
            boolean flag = true;

            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;

                    flag = false;
                }
                //for (int i1 = 0; i1 < arr.length; i1++) {
                //    System.out.print(arr[i1]+" ");
                //}
            }

            if (flag) {
                break;
            }
        }
        return arr;
    }


    @Test
    void test11() {
        //int i = 0;
        ////String a ;
        //i = i++;
        //System.out.println("i = " + i);
        //System.out.println("3" + 2);


        String a = "通话";
        String b = "wrewrw";
        String c = "通话";
        String d = "gdfgd";
        System.out.println(String.format("a : %d | b: %d | c: %d",a.hashCode(),b.hashCode(),c.hashCode()));
    }
}
