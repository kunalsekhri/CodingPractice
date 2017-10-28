public class Solution {
    public int[] twoSum(int[] nums, int target) {
    if(nums==null||nums.length==1)
    {
        return nums;
    }
    int []result=new int[2];
    HashMap<Integer,Integer>values=new HashMap<Integer,Integer>();
    for(int i=0;i<nums.length;i++)
    {
        if(values.containsKey(nums[i]))
        {
            result[0]=values.get(nums[i]);
            result[1]=i;
            break;
        }
        else
        {
            values.put(target-nums[i],i);
        }
    }
   
    
    return result;
    }
}
