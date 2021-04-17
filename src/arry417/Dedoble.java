package arry417;

public class Dedoble {
    public static int arrayde(int[] x){
        int i = 0;
        for(int j=1;j<x.length;j++)
        {
            if(x[i] != x[j])
            {
                i++;
                x[i] = x[j];
            }
        }
        return i+1;
    }
    public static void show(int xl,int[] x){
        System.out.println();
        System.out.print(xl+", nums = [");
        for(int i = 0 ; i < xl ; i++)
        {
            System.out.print(x[i]);
            if(i < xl-1) System.out.print(",");
        }
        System.out.println("]");
    }
    public static void main(String[] args) {
        int[] x = {1,2,2,3,5,8,9,9,10};
        int xl = arrayde(x);
        show(xl,x);
        int[] x1 = {0,0,1,1,1,2,2,3,3,4};
        xl = arrayde(x1);
        show(xl,x1);
        int[] x2 = {1,1,2};
        xl = arrayde(x2);
        show(xl,x2);
    }
}
