package string422;

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
        int size = en.lengthOfLastWord("123 13");
        System.out.println(size);
    }
}
