package com.company;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
/*
集合及操作
 */
public class Main {

    public static void main(String[] args) {
	// write your code here
        Collection<String> cd =new ArrayList<>();
        System.out.println(cd);
        boolean a=cd.add("xxx"); //执行成功返回true
        System.out.println(a);
        System.out.println(cd);
        cd.add("123");
        cd.add("asd");
        System.out.println(cd);
        cd.remove("123");
        System.out.println(cd);
        boolean b = cd.remove("qwe");
        System.out.println(b);
        boolean c = cd.contains("asd");
        boolean c1 = cd.contains("as");
        System.out.println(c+"/"+c1);
        int x = cd.size();
        System.out.println(x);
        Object[] arry1 = cd.toArray();
        for(int i=0;i<arry1.length;i++)
        {
            System.out.print(arry1[i]+" ");
        }

    }
}
