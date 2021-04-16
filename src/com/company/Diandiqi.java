package com.company;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
/*
迭代器和增强for
 */
public class Diandiqi {
    public static void main(String[] args) {
        Collection<String> cs1 = new ArrayList<String>();
        cs1.add("123");
        cs1.add("qwe");
        Iterator<String> iter = cs1.iterator(); //迭代器向上转型
        boolean a1 = iter.hasNext(); //判断有没有下一个元素
        System.out.println(a1);
        while(iter.hasNext()){
            String s = iter.next();
            System.out.print(s+" ");
        }
        System.out.println();
        int[] ar = {1,2,3,4,5,6,7};
        for(int i:ar) System.out.print(i);  //增强for循环 for（数据类型 变量：数组名/集合名）
        System.out.println();
        for(String s:cs1) System.out.print(s);
    }
}
