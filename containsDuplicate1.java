class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map= new HashMap<>();
        for(int val: nums){
            if(map.containsKey(val)){
                return true;
            }
            else{
                map.put(val,1);
            }
        }
        return false;
    }
}
