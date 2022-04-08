import java.util.Stack;

public class isVaild {
    public static void main(String[] args) {
        System.out.println(solution(new String("]")));

    }

    public static boolean solution(String s){

        Stack<Character> stack = new Stack<>();
        for(char c: s.toCharArray()){
            if(c=='('){stack.push(')');}
            else if(c=='['){stack.push(']');}
            else if(c=='{'){stack.push('}');}
            else if(stack.empty() || c!=stack.pop()){return false;} // 情况1，当c是右半边符号，且栈里没有对于的左符号，此时为false
            // 情况2 ，当栈顶元素不等于c，匹配出错了，此时也是false
        }
        return stack.empty();

    }
}
