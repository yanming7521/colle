package com.company;
class arry
{
    int[] arr;
    int ind;
    public static int get(int[] arr,int ind)
{
    if(arr==null){
        throw new NullPointerException("传入null");
    }
    int ele =arr[ind];
    return ele;
}
}
public class Yichang {
    public static void main(String[] args) {
        int[] arr=null;
        arry a=new arry();
        int b=a.get(arr,0);
        System.out.println(b);
    }
}

