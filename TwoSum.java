
// This is the solution for the two sum problem in Leetcode
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer,Integer> HM= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int diff = target-nums[i];
            if(HM.containsKey(diff)){
                result[0]= i;
                result[1]= HM.get(diff);
                return result;
            }
            HM.put(nums[i], i);

        }
        return result;
    }
}
