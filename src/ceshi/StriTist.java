package ceshi;

import org.junit.Assert;
import org.junit.Test;

public class StriTist {
    @Test
    public void str(){
        Stri s1=new Stri();
        St a=new St("asdf");
        St b=new St("fdsa");
        St ab = s1.strin(a, b);
        St c=new St("asdffdsa");
        if(c.s.equals(ab.s)){
            System.out.println("ture"+"  s = "+ab.s);
        }
    }
    @Test
    public void lenth(){
        St a=new St("123456789");
        Stri s1=new Stri();
        int le = s1.lenth(a);
        Assert.assertEquals(9,le);
    }
}
