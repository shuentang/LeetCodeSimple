import java.util.Arrays;
import java.util.HashMap;



public class twoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] ans = twoSum(nums, target);
        System.out.println(Arrays.toString(ans));

    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> di = new HashMap<>();
        for(int i=0; i<nums.length;i++){
            int temp = nums[i];
            int temp2 = target-temp;
            if(di.containsKey(temp2)){
                return new int[]{di.get(temp2),i};
            }
            di.put(temp, i);
        }
        return new int[0];
    }
}
