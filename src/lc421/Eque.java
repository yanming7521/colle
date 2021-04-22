package lc421;

import java.util.Arrays;

public class Eque {

    public void coutmax(int ax[])
    {
        int sum = 0;
        for(int x:ax)   //for(int x;x<ax.length;x++)
        {
            sum = sum + x;
        }
        float pj = sum/ax.length;
        int ac[] = new int [ax.length];
        int i = 0;
        for(int xy:ax)
        {
            if(xy>pj)
            {
                System.out.print(xy+" ");
                ac[i]=xy;
                i++;
            }
        }
        System.out.println();
        for(int ix = 0;ix<i;ix++)
        {
            System.out.print(ac[ix]+" ");
        }
    }

    public static void main(String[] args) {
        Eque eq = new Eque();
        int ax[] = {1,2,3,4,5,6,7,8,9};
        eq.coutmax(ax);
    }
}

