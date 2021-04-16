package com.company;
import java.io.File;
import java.io.IOException;
public class File1 {
    public static void main (String[] args) throws IOException {
        File file=new File("F:\\照片\\微信图片_2020062514101911.png");
        System.out.println(file);
        String absolutePath = file.getAbsolutePath();
        String name = file.getName();
        System.out.println(absolutePath+"  "+name);
        long length = file.length();
        System.out.println(length);
        File f2=new File("F:\\colle");
        long z12 = f2.length();
        System.out.println(file.exists()+" "+" "+f2.isFile());
        File ff=new File("F:\\照片\\1.txt");
        boolean new1 = ff.createNewFile();
        // ff.delete();
        System.out.println(new1);
        File ff1=new File("F:\\照片\\1");
        boolean m1 = ff1.mkdir();
        System.out.println(m1);
        File ff2=new File("F:\\照片\\1\\2\\3\\4");
        boolean m2 = ff2.mkdirs();
        System.out.println(m2);
        if(ff2.exists())
        {
            boolean mm = ff2.delete();
            System.out.println(mm);
        }
        File c1=new File("F:\\照片");
        String[] l1 = c1.list();
        for (String s : l1) {
            System.out.println(s);
        }
        File[] lis2 = c1.listFiles();
        for (File file1 : lis2) {
            System.out.println(file1);
        }
    }
}
