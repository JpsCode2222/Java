import java.util.Stack;
// Push Element in Stack At Bottom
public class Stack_PushAtBottom{
    public static void pushAtBottom(int data, Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        Stack_PushAtBottom.pushAtBottom(data,s);
        s.push(top);
    }
    public static void main(String[] args){
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        Stack_PushAtBottom.pushAtBottom(4,s);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }

    }
}