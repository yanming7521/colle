package sum;

public class Twonum {
    public int[] twosum ( int[] nums, int target){
        int[] end = new int[]{0,0};
        int i, j;
        for (i = 0; i < nums.length-1; i++) {
            for (j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    end[0] = i;
                    end[1] = j;
                }
            }
        }
        return end;
    }
    public static void main(String[] args) {
        Twonum t = new Twonum();
        int[] nums = new int[]{2, 7, 4, 75, 1, 5};
        int[] arr;
        arr = t.twosum(nums, 6);
        System.out.print("[");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
            if(i==0) {
                System.out.print(",");
            }
        }
        System.out.print("]");
    }
}
