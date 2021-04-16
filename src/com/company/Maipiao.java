package com.company;
class Mai implements Runnable
{
    private int piao=200;
    Object obj=new Object();
    @Override
    public void run() {
    while(piao!=0)
    {
        synchronized (obj){
            if(piao>0){
                try{
                    Thread.sleep(4);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+" 正在卖"+piao+"号票<<---->>");
                piao--;
            }
        }
    }
    }
}
public class Maipiao {
    public static void main(String[] args) {
        Mai a1=new Mai();
        Thread x1=new Thread(a1);
        Thread x2=new Thread(a1);
        Thread x3=new Thread(a1);
        x1.start();
        x2.start();
        x3.start();
    }
}
