import java.util.HashMap;
class LongestSubarray {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> subNum = new HashMap<>();
        subNum.put(0, 1);
        int total = 0, count = 0;

        for (int n : nums) {
            total+=n;

            if (subNum.containsKey(total - k)) {
                count += subNum.get(total-k);
            }
            subNum.put(total, subNum.getOrDefault(total, 0) + 1);
        }
        return count;       
    }
    public static void main(String args[]){
        LongestSubarray ls = new LongestSubarray();
        int[] nums = {1, 2, 3, 1, 1, 1, 5, -1};
        int k = 5;
        System.out.println("Total Subarray "+ls.subarraySum(nums, k));
    }
}