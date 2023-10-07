// https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/description/
public class Check_if_Array_Is_Sorted_and_Rotated {
    public static void main(String[] args) {
        int[] nums = {2,1,3,4};
        System.out.println(check(nums));
    }
    public static boolean check(int[] nums) {
        if(nums.length==1) return true;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums[(i+1) % nums.length]) count++;

        }
       
        if(count>1) return false;
        
        return true;
    }
    
}
