package com.atguigu.java;

import java.util.ArrayList;

/**
 * @author Administrator
 * @create 2020-01-10-21:46
 */
public class TemplatesTest {

    //模板六：prsf
    private static final int NUM=0;
    //扩展
    //psf
    public static final int NUM1=1;
    //psfi
    public static final int NUM2=2;
    //psfs
    public static final String NUM3="3";


    //模板一：psvm
    public static void main(String[] args) {

        //模板二：sout
        System.out.println("hello");
        //扩展：
        //soutp
        System.out.println("args = [" + args + "]");
        //soutm
        System.out.println("TemplatesTest.main");
        int num1=0;
        System.out.println("num1 = " + num1);
        int num2=1;
        System.out.println("num2 = " + num2);
        //xxx.sout
        System.out.println(num1);

        //模板三：fori
        String[] arr = new String[]{"a","b","c"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //扩展
        //iter
        for (String s : arr) {
            System.out.println("s = " + s);
        }
        //itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];

        }

        //模板四
        ArrayList list = new ArrayList();
        list.add(11);
        list.add(11);
        list.add(11);
        list.add(11);
        //list.for
        for (Object o : list) {

        }
        //扩展
        //list.fori
        for (int i = 0; i < list.size(); i++) {
            
        }
        //list.forr
        for (int i = list.size() - 1; i >= 0; i--) {
            
        }

        //模板五：
        //ifn
        if (list == null) {

        }
        //扩展
        //inn
        if (list != null) {

        }
        //xxx.nn  /  xxx.null
        if (list != null) {

        }
        if (list == null) {

        }
    }
}
