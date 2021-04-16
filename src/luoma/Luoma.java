package luoma;

import java.util.Scanner;

/*
例如， 罗马数字 2 写做 II ，即为两个并列的 1。12 写做 XII ，即为 X + II 。 27 写做  XXVII, 即为 XX + V + II 。
        通常情况下，罗马数字中小的数字在大的数字的右边。
        但也存在特例，例如 4 不写做 IIII，而是 IV。
        数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。
        同样地，数字 9 表示为 IX。这个特殊的规则只适用于以下六种情况：
        I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
        X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。 
        C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
        给定一个罗马数字，将其转换成整数。输入确保在 1 到 3999 的范围内。
*/
class Lu
{
    String luma;
    int num = 0;
    public Lu(){ }
    public Lu(String luma)
    {
        this.luma = luma;
    }
    public void luTonum ()
    {
        int pnum =getchar(luma.charAt(0));
        for(int i = 1;i<luma.length();i++)
        {
            int s = getchar(luma.charAt(i));
            if(pnum < s) {num -= pnum;}     //比较前一个数字，小的减掉大的加上
            else {num += pnum;}
            pnum = s;                       //后移一位
        }
        num += pnum;
        System.out.println("数字是："+num);
    }
    public int getchar (char c)
    {
        switch(c)
        {
            case 'I' : return 1;
            case 'V' : return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C' : return 100;
            case 'D' : return 500;
            case 'M' : return 1000;
            default: return 0;
        }
    }
}
public class Luoma {
    public static void main(String[] args) {
        System.out.print("输入罗马数字：");
        Scanner in = new Scanner(System.in);
        String lu = in.next();
        Lu luna = new Lu(lu);
        luna.luTonum();
    }
}
