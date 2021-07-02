package bank516;

public class BankExp extends Exception {
    String errors;
    public BankExp(int n,int m){
        errors = "存入 "+n+"元 支出 "+m+"元 不符合要求！";
    }
    public String err(){
        return errors;
    }
}
