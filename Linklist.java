public class Linklist {
    Node head;
    private int size;
    Linklist(){
        this.size = 0;
    }
    // Node
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(String data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // Add Last
    public  void addLast(String data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }
    // Print List
    public void printList(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }

        System.out.println("NULL");
    }

    // Delete Firt
    public void deleteFirst(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        size--;
        head = head.next;
    }

    // Delete Last 
    public void deleteLast(){
        if(head == null){
           System.out.println("The List is empty");
            return;
        }
        size--;
           if(head.next == null){
            head = null;
            return;
        }
        Node secLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secLast = secLast.next;
        } 
        secLast.next = null;
    }

    public int getSize(){
        return size;
    }

    public static void main(String[] args){
        Linklist list = new Linklist();
        list.addFirst("A");
        list.addFirst("IS");
        list.addLast("List");
        list.addFirst("This");
        list.addFirst("This");
        list.deleteFirst();
        list.deleteLast();
        list.printList();
        System.out.println(list.getSize());
    }
}
