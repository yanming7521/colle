package Io524;

import java.io.*;

public class TestIo {
    public static void main(String[] args) {
        Standard exma = new Standard();
        File f = new File("F:\\colle\\src","test.txt");
        exma.setTestfile(f);
        exma.shiti();
    }
}
