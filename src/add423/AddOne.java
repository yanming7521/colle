package add423;

import java.util.Arrays;

public class AddOne {
    public int[] plusOne(int[] digits) {
        for(int i = digits.length-1; i >= 0; i--)
        {
            if (digits[i] != 9)
            {
                digits[i]++; return digits;
            }
            else
            {
                digits[i] = 0;
            }
        }
        digits = new int[digits.length+1];
        digits[0] = 1;
        return digits;
    }

    public static void main(String[] args) {
        AddOne one = new AddOne();
        int[] on = {9,9,9,9};
        System.out.println(Arrays.toString( one.plusOne(on)));
    }
}
