//https://leetcode.com/problems/two-sum/
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int res[] = new int[2];
        int arr[] = {2,7,11,15};
        int target = 9;
        res = twoSum(arr,target);
        System.out.println("result = ["+res[0]+","+res[1]+"]");
    }
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        int res[] = new int[2];
        for(int i=0;i<nums.length;i++)
            map.put(nums[i],i);
        for(int i=0;i<nums.length;i++)
        {
            int hold = target-nums[i];
            if(map.containsKey(hold) && map.get(hold)!=i){
                res[0] = i;
                res[1] = map.get(hold);
                break;
            }
        }
        return res;
    }
}
