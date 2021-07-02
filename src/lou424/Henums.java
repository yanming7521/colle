package lou424;

import java.util.Arrays;

public class Henums {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums = new int[m + n];
        int i = 0,j = 0,k = 0;
        while(i < m || j < n)
        {
            if(i == m)
            {
                nums[k] = nums2[j++];
            }
            else if(j == n)
            {
                nums[k] = nums1[i++];
            }
            else if(nums1[i] < nums2[j])
            {
                nums[k] = nums1[i++];
            }
            else
            {
                nums[k] = nums2[j++];
            }
            k++;
        }
        nums1 = nums;
        for(i = 0; i < m+n; i++)
        {
            nums1[i] = nums[i];
        }
        System.out.println(Arrays.toString(nums1));
    }

    public static void main(String[] args) {
        Henums h = new Henums();
        int[] a = {1,2,3,0,0,0};
        int[] b = {2,5,6};
        h.merge(a,3,b,3);
    }
}
