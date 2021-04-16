package ceshi;

public class Stri {
    St a =new St();
    St b =new St();
    public St strin (St a,St b){
        StringBuilder ab=new StringBuilder();
        ab.append(a.s).append(b.s);
        St c = new St();
        c.s=ab.toString();
        return c;
    }
    public int lenth(St s){
        s.len=s.s.length();
        return s.len;
    }
}
