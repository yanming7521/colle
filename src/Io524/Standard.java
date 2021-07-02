package Io524;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Standard {
    File testfile;

    public void setTestfile(File testfile) {
        this.testfile = testfile;
    }

    public void shiti () {
        int fenshu = 0;
        int tishu = 0;
        Scanner scanner = new Scanner(System.in);
        try {
            FileReader inone = new FileReader(testfile);
            BufferedReader intwo = new BufferedReader(inone);
            String s = null;
            System.out.println("----准备开始答题----");
            System.out.println("当前分数："+fenshu);
            while(null != (s = intwo.readLine())) {
                if(!s.startsWith("-"))
                    System.out.println(s);
                else {
                    s = s.replaceAll("-","");
                    String cor = s;
                    System.out.print("输入你的答案：");
                    String ans = scanner.nextLine();
                    if(ans.compareToIgnoreCase(cor) == 0) {
                        fenshu = fenshu + 5;
                        tishu++;
                        System.out.println("当前分数："+fenshu);
                    }
                    else {
                        tishu++;
                        System.out.println("当前分数："+fenshu);
                    }
                }
            }
            intwo.close();
        }
        catch (IOException exp) { }
        System.out.println("试题总分："+tishu*5);
        System.out.println("答题结束!!");
    }
}
