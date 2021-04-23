package string422;

import java.util.Scanner;

public class Strend {
    public int lengthOfLastWord(String s) {
    int ex = s.length()-1;
    int end = ex;
    for( ; ex >= 0; ex--)
    {
        if(s.charAt(ex) == ' ')
            if(ex==end)
            {
                end--;
            }
        else {
                break;
            }
    }
    return end-ex;
}

    public static void main(String[] args) {
        Strend en = new Strend();
        Scanner in = new Scanner(System.in);
        String next = in.nextLine();
        int size = en.lengthOfLastWord(next);
        System.out.println(size);
    }
}
