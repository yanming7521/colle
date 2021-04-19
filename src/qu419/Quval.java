package qu419;

import java.util.Arrays;

public class Quval {
    public static int removeElement(int[] nums, int val) {
    int j = 0;
    for(int i = 0;i<nums.length;)
    {
        if(nums[i] != val)
        {
            nums[j] = nums[i];
            i++; j++;
        }
        else
        {
            i++;
        }
    }
        return j;
    }
    public static void main(String[] args) {
    int[] ax = {0,1,2,2,3,0,4,2};
    int val = 2;
    int c = removeElement(ax, val);
    System.out.println(c);
    int[] ac = new int[c];
    for(int i = 0;i<c;i++)
    {
        ac[i] = ax[i];
    }
    System.out.println(Arrays.toString(ac));
    }
}
