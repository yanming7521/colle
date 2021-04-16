package sum;

public class Fannum {
    public static int fanshu (int x){
        int re = 0;
        while(x!=0){
            int tmp = x%10;
            if(re>214748364||(re==214748364 && tmp>7))
            {
                return 0;
            }
            if(re<-214748364||(re==-214748364 && tmp<-8))
            {
                return 0;
            }
            re = re*10 + tmp;
            x = x/10;
        }
        return re;
    }
    public static int reverse(int x) {
        long n = 0;
        while(x != 0) {
            n = n*10 + x%10;
            x = x/10;
        }
        return (int)n==n? (int)n:0;
    }
    public static void main(String[] args) {
        int fan = Fannum.fanshu(-52378);
        int re = Fannum.reverse(-2147483645);
        System.out.println(fan);
        System.out.println(re);
    }
}
