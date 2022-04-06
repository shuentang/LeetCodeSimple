import java.util.Arrays;
import java.util.HashMap;


public class twoSum2 {
    public static void main(String[] args) {
        int[] nums = {3,3};
        int target = 6;
        int[] ans = twoSum(nums, target);
        System.out.println(Arrays.toString(ans));

    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashtable = new HashMap<>();
        int[] ans={0,0};
        for(int i=0; i<nums.length;i++){
            if (hashtable.containsKey(target - nums[i])) {
                return new int[]{hashtable.get(target - nums[i]), i};
            }
            hashtable.put(nums[i], i);

        }
        return ans;
    }
}
