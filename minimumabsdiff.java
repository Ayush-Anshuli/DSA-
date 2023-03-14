import java.util.*;
public class minimumabsdiff {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");

        int n=sc.nextInt();

        int a[]=new int[n];
        int b[]=new int[n];

        System.out.println("enter the elements in the 1st array");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        
        System.out.println("enter the elements in the 2nd array");
        for(int i=0;i<a.length;i++){
            b[i]=sc.nextInt();
        }

        Arrays.sort(a);
        Arrays.sort(b);
        int minDiff=0;

        for(int i=0;i<a.length;i++){
            minDiff+=Math.abs(a[i]-b[i]);
        }
        System.out.println("minimum difference is = " + minDiff);
    }

}
