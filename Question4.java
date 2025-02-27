import java.util.HashMap;

public class Question4 {
    public static void main(String[] args) {
        int[] nums = {1, -1, 5, -2, 3};
        int target = 3;
        System.out.println(maxSubArraySum(nums, target)); // Output should be 4
    }

    public static int maxSubArraySum(int[] nums, int target) {
        int currentSum = 0;
        int maxLength = 0;
        HashMap<Integer, Integer> sumMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];

            if (currentSum == target) {
                maxLength = i + 1;
            }

            if (!sumMap.containsKey(currentSum)) {
                sumMap.put(currentSum, i);
            }

            if (sumMap.containsKey(currentSum - target)) {
                maxLength = Math.max(maxLength, i - sumMap.get(currentSum - target));
            }
        }

        return maxLength;
    }
}