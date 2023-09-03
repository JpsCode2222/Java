// Stack Using LinkedList
import java.util.LinkedList;
public class Stack_LinkedList {
    static class Stack{
        static LinkedList<Integer> list = new LinkedList<>();

        public static boolean isEmpty(){
            return list.size() == 0;
        }

        // push
        public static void push(int data){
            list.add(data);
        }

        // pop
        public static int pop(){
            if(list.isEmpty()){
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        // peek
        public static int peek(){
            if(list.isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }

    }
    public static void main(String[] args){
        Stack s = new Stack();
        s.push(10);
        s.push(10);
        s.push(10);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
