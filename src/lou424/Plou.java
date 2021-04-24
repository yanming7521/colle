package lou424;

public class Plou {
    public int climbStairs(int n) {
        int fx0 = 0,fx1 = 0,fx2 = 1;
        for(int i = 1; i <= n; i++)
        {
            fx0 = fx1;
            fx1 = fx2;
            fx2 = fx1 + fx0;
        }
        return fx2;
    }

    public static void main(String[] args) {
        Plou fx = new Plou();
        int fxi = fx.climbStairs(9);
        System.out.println(fxi);
    }
}
