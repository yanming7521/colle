package bank516;

import java.util.Scanner;

public class TestBank {
    public static void main(String[] args) {
        System.out.printf("Bank收支管理系统\n存入为+，支出为-  否则报异常！\n");
        Bank b = new Bank();
/*        try{
            b.nextm(200,-10);
            b.nextm(300,-400);
            b.nextm(500,-450);
            System.out.printf("现有存款： %d 元 \n",b.getMoney());
            b.nextm(-10,-10);
            b.nextm(999,999);
        }*/
        try{
            while(true){
                Scanner in = new Scanner(System.in);
                System.out.print("存入：");
                int x = in.nextInt();
                System.out.print("支出：");
                int y = in.nextInt();
                b.nextm(x,y);
            }
        }
        catch (BankExp e){
            System.out.print("存在问题：");
            System.out.println(e.err());
        }

        System.out.println("余额"+b.getMoney()+"元");
    }
}
