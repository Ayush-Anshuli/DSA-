import java.util.*;
public class histogram {
    public static void histogram(int arr[]){
        int max=0;
        int nr[]=new int[arr.length];
        int nl[]=new int[arr.length];
        Stack<Integer>s=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!s.empty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.empty()){
                nr[i]=arr.length;
            }
            else{
                nr[i]=s.peek();
            }
            s.push(i);
        }
        for(int i=0;i<arr.length;i++){
            while(!s.empty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.empty()){
                nl[i]=arr.length;
            }
            else{
                nl[i]=s.peek();
            }
            s.push(i);
        }
        for(int i=0;i<arr.length;i++){
            int height=arr[i];
            int width=nr[i]-nl[i]-1;
            int area=height*width;
            max=Math.max(max, area);
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();

        int arr[]=new int [n];
        System.out.println("enter the element");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        histogram(arr);
    }
}
