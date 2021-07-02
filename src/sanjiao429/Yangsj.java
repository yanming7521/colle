package sanjiao429;

import java.util.ArrayList;
import java.util.List;

public class Yangsj {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        for (int i = 0; i < numRows; ++i) {
            List<Integer> row = new ArrayList<Integer>();
            for (int j = 0; j <= i; ++j) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(ret.get(i - 1).get(j - 1) + ret.get(i - 1).get(j));
                }
            }
            ret.add(row);
        }
        return ret;
    }

    public static void main(String[] args) {
        Yangsj san = new Yangsj();
        int num = 5;
        List<List<Integer>> sanjiao = san.generate(num);
        for(List<Integer> list : sanjiao)
        {
            for(int x : list){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
