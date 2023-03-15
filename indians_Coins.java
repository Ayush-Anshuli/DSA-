import java .util.*;
public class indians_Coins {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Integer coins[]={1,2,5,10,20,50,100,500,2000};
        Arrays.sort(coins,Comparator.reverseOrder());

        int countofcoin=0;
        System.out.println("enter the amount");
        int amount=sc.nextInt();

        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<coins.length;i++){
            if(coins[i]<=amount){
                while(coins[i]<=amount){
                    countofcoin++;
                    ans.add(coins[i]);
                    amount-=coins[i];
                }
            }
        }
        System.out.println("total min coin is used = "+countofcoin);

        for(int i=0;i<ans.size();i++){
            System.out.println(ans.get(i)+" ");
        }
    }
}
