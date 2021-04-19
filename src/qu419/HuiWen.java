package qu419;

public class HuiWen {
    public static boolean isPalindrome(int x) {
    if(x < 0 || (x % 10 == 0 && x != 0))
        return false;
    int num = 0;
    while (x > num) {
        num = num * 10 + x % 10;
        x /= 10;
    }
    return (x == num || x == num/10) ? true : false;
    }

    public static void main(String[] args) {
        int x=12321;
        boolean as = isPalindrome(x);
        System.out.println(as);
    }
}