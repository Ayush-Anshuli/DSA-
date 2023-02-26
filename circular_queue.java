import java.util.*;
public class circular_queue {
    static class queue{
        static int arr[];
        static int size;
        static int rear;
        static int front;
             queue(int n){
                arr=new int[n];
                size=n;
                rear=-1;
                front=-1;
             }

            //  IS EMPPTY CONDITION
            
             public static boolean isEmpty(){
                return rear==-1 && front==-1;
             }

            //  IS FULL CONDITION

             public static boolean isfull(){
                return (rear+1)%size == front;
             }

            //  add condition

            public static void add(int data){
                if(isfull()){
                    return;
                }
                // if only one element is going to add on a circular queue
                if(front==-1){
                    front=0;
                }
                rear=(rear+1)%size;
                arr[rear]=data;
            }

            public static int remove(){
                if(isEmpty()){
                    return -1;
                }
                int result=arr[front];
                if(rear==front){
                    rear=front=-1;
                }
                else{
                     front=(front+1)%size;
                }
                return result;
            }

            public static int peek(){
                return arr[front];
            }
    }
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // System.out.println("enter the size");
        // int n=sc.nextInt();
        queue a=new queue(3);

        System.out.println("enter the data");
        a.add(1);
        a.add(2);
        a.add(3);

        System.out.println(a.remove());
        a.add(4);
        System.out.println(a.remove());
        a.add(5);

        while(!a.isEmpty()){
            System.out.println(a.peek());
            a.remove();
        }
    }
}
