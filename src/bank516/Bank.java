package bank516;

public class Bank {
    private int money;
    public void nextm (int in,int out) throws BankExp{
        if(in < 0 || out > 0){
            throw new BankExp(in,out);
        }
        int nextm = in + out;
        System.out.printf("本次纯入账：%d 元 \n",nextm);
        money = nextm + money;
    }
    public int getMoney(){
        return money;
    }
}
