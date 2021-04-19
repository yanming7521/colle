package qu419;

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
    for(int i =0;i<=c-1;i++)
    {
        System.out.print(ax[i]+",");
    }
    }
}
