class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map= new HashMap<>();
        int f=0;
        for(int val: nums){
            map.put(val, map.getOrDefault(val,0)+1);
        }
        for(int val: map.values()){
            if(val>1){
                f=1;
            }
        }
        if(f==0)
        return false;
        else
        return true;
    }
}
