package com.company;
/*
多线程
 */
class Zhuxian1 extends Thread {
    @Override
    public void run() {
        for (int i=0;i<10;i++){
            System.out.println("go--->"+i+" "+getName());
        }
    }
}
public class Zhuxian {
    public static void main(String[] args) {
        Zhuxian1 zx = new Zhuxian1();
        zx.start();
        Zhuxian1 zx1 = new Zhuxian1();
        zx1.start();
        Zhuxian1 zx11 = new Zhuxian1();
        zx11.start();
        Zhuxian1 zx111 = new Zhuxian1();
        zx111.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("to--->" + i + " " + Thread.currentThread().getName());
            new Thread() {
                @Override
                public void run() {
                    for (int i = 0; i < 10; i++) {
                        System.out.println("run--->" + i + " " + getName());
                    }
                }
            }.start();
        }
    }
}