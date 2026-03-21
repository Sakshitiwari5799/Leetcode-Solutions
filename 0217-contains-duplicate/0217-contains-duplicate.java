class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hashset=new HashSet<>();
       for(int i:nums){
        if(!hashset.add(i)){
            return true; 
        }
       }
       return false;
    }
}