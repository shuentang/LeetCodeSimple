public class maxSubArray {
    public static void main(String[] args) {
        int[] arr = {2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(solution(arr));


    }

    public static int solution(int[] nums){
        int result = Integer.MIN_VALUE;
        int count = 0;
        for(int i:nums){
            count+=i;  //
            if(count>result) result=count;
            if(count<0) count=0; // 使用贪心算法解这个问题， 当指针所指的特征之前的数组和小于零，count从这个指针开始
        }
        return result;
    }

}
