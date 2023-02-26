import java.util.*;
public class queue {
    static class queueAA{
         static int arr[];
         static int size;
         static int rear;
         queueAA(int n){
            arr=new int[n];
            size=n;
            rear=-1;
         }

        //  IS EMPTY
        public static boolean isEmpty(){
            return rear==-1;
        }

        // ADD FUNCTION
        public static void add(int data){
            if(rear==size-1){
                System.out.println("queue is full");
                return;
            }
            rear=rear+1;
            arr[rear]=data;
        }

        // REMOVE
        public static int remove(){
            if(isEmpty()){
                return -1;
            }
            int front=arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear=rear-1;
            return front;
        }

        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return arr[0];
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size");
        int n=sc.nextInt();
        queueAA a=new queueAA(n);

        System.out.println("enter the data");
        a.add(sc.nextInt());
        a.add(sc.nextInt());
        a.add(sc.nextInt());

        while(!a.isEmpty()){
            System.out.println(a.peek());
            a.remove();
        }
        
    }
}
