package lc421;

import java.util.Arrays;

public class Maxint {
    public int maxarray(int nums[]){
        int pre = 0;
        int maxa=nums[0];
        for(int i = 0;i < nums.length;i++)
        {
            pre=max(pre+nums[i], nums[i]);
            maxa=max(maxa, pre);
        }
        return maxa;
    }
    public int max(int x,int y){
        return x > y ? x : y;
    }
    public static void main(String[] args) {
        int ma[]={1,-1,5,5,-6,7,9,10};
        int mb[]={-2,1,-3,4,-1,2,1,-5,4};
        Maxint mad = new Maxint();
        int max = mad.maxarray(ma);
        int maz = mad.maxarray(mb);
        System.out.println(Arrays.toString(ma));
        System.out.println("SumMax = "+max);
        System.out.println(Arrays.toString(mb));
        System.out.print("SumMax = "+maz);
    }
}
