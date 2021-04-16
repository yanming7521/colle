package luoma;

import java.util.Stack;

public class Kuokao {
    public static Boolean stark (String s)
    {
        if(s.length()%2!=0)
        {
            return false;
        }
        Stack<Character> stack = new Stack <Character> ();
        for(int i=0; i<s.length();i++)
        {
            char c = s.charAt(i);
            if(c == '(' || c == '[' || c == '{')
                stack.push(c);
            else
            {
                if(stack.isEmpty())     //只有左
                    return false;

                char top = stack.pop();

                if(c == ')' && top != '(')
                    return false;
                if(c == ']' && top != '[')
                    return false;
                if(c == '}' && top != '{')
                    return false;
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String s = "{()}";
        String a = "{({})}";
        String b = "{}|{)(";
        System.out.println(Kuokao.stark(s)+" "+Kuokao.stark(a)+" "+Kuokao.stark(b));
    }
}
