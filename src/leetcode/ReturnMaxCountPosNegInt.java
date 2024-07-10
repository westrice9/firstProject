package leetcode;

public class ReturnMaxCountPosNegInt {
    public static void main(String[] args) {
        int[] nums= { -9, -7, -4, 1, 5, 8, 9};
        System.out.println(maximumCount(nums));
    }
    public static int maximumCount(int[] nums) {
        if (nums[0]>0||nums[nums.length-1]<0) return nums.length;

        int left =0,right = nums.length-1, mid=0;
        while (left<right){
            mid = left+(right-left/2);
            if(nums[mid]<0)left=mid+1;
            else right = mid;
        }
        int neg=left;
        left=0; right = nums.length;
        while(left<right){
            mid = left + (right-left)/2;
            if (nums[mid]>0) right = mid;
            else left = mid+1;
        }
        int pos = nums.length-1;
        return Math.max(neg,pos);
//        public int maximumCount(int[] nums) {
//            int pos =0;
//            int neg =0;
//            for (int i =0;i<nums.length;i++){
//                if (nums[i]>0){
//                    pos++;
//                }
//                if (nums[i]<0){
//                    neg++;
//                }
//            }
//            return Math.max(pos,neg);
//        }
    }
}
