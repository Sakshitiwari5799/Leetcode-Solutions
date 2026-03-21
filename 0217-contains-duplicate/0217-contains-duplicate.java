class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hashset=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            hashset.add(nums[i]);
        }
        if(hashset.size()==nums.length){
            return false;
        }else{
            return true;
        }
    }
}