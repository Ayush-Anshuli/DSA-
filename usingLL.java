import java.util.*;
public class usingLL {
    static class Node{
        int data;
        Node next;

         public Node(int data){
            this.data=data;
            this.next=null;
         }

    }
    static class queue{
        
        public static Node head;
        public static Node tail;
        
        // isempty
            public static boolean isEmpty(){
                return head==null && tail==null;
            }
        
        // add
            public static void add(int data){
                Node newNode=new Node(data);
                if(head==null){
                    head=tail=newNode;
                }
                tail.next=newNode;
                tail=newNode;
            }

        // remove

        public static int remove(){
            if(isEmpty()){
                return -1;
            }
            int front = head.data;
            // for 1 element
            if(head==tail){
                 head=tail=null;
            }
            else{
                head=head.next;
            }
            return front;
        }

        // peek
            public static int peek(){
                if(isEmpty()){
                    return -1;
                }
                return head.data;
            }

    }
    public static void main(String[] args) {
        queue a=new queue();

        System.out.println("enter the data");
        a.add(1);
        a.add(2);
        a.add(3);

        while (!a.isEmpty()) {
            System.out.println(a.peek());
            a.remove();
        }
    }
}
