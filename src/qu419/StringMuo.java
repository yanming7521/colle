package qu419;

public class StringMuo {
    public static int pipei(String haystack, String needle)
    {
        int h = haystack.length();
        int n = needle.length();
        for(int i = 0; i < h-n+1;i++)
        {
            if(haystack.substring(i,i+n).equals(needle))
                return i;
        }
        return -1;
    }
    public static int searchInsert(int[] nums, int target) {
        int i = 0;
        for(;i < nums.length;i++ )
        {
            if(nums[i] >= target)
                return i;
        }
        return i;
    }
    public static void main(String[] args) {
        /*System.out.println(pipei("hellow","ll"));
        System.out.println(pipei("",""));
        System.out.println(pipei("124587996","79"));*/
        int[] a = {1,2,5,6,7,8};
        int x=3;
        int ix = searchInsert(a, x);
        System.out.println(ix);
    }
}
