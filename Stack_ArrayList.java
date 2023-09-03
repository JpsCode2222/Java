// Stack Using array List
public class Stack_ArrayList {
    // Node
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class Stack{
        // head
        public static Node head;
        // Stack Empty or not 
        public boolean isEmpty(){
            return head == null;
        }

        // Push
        public void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        // Pop
        public int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        // Peek
        public int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args){
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        // Pop
        s.pop();
        // Traversal
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
