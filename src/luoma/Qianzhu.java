package luoma;

import java.io.IOException;

public class Qianzhu {
    public static String longqian(String[] strs) {
        if(strs == null || strs.length == 0)    return "";

        for(int i = 0; i < strs[0].length(); i++){
            char ch = strs[0].charAt(i);
            for(int j = 1; j < strs.length; j++){
                if(i == strs[j].length() || strs[j].charAt(i) != ch)
                    return strs[0].substring(0, i);
            }
        }
        return strs[0];
    }
    public static void main(String[] args) throws IOException {
        String[] as = new String[3];
        as[1]="ffff";
        as[2]="ffsa";
        as[0]="ffcvf";
        String end = Qianzhu.longqian(as);
        System.out.println(end);
    }
}
