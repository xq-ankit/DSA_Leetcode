//https://leetcode.com/problems/richest-customer-wealth/description/
public class Richest_Customer_Wealth_1672{
    public static void main(String[] args) {
        int[][] accounts = {{1, 2, 3}, {3, 2, 1}};
        System.out.println(maximumWealth(accounts));
    }
    
    public static int maximumWealth(int[][] arr) {
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(ans<sum(arr[i])) ans=sum(arr[i]);
           
        }
        return ans;
        
    }
    public static int sum(int[] arr){
        int total=0;
        for(int element:arr){
            total+=element;
        }
        return total;
    }
}