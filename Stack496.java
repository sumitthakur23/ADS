import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.Arrays;
public class Stack496 {
    // Given two arrays nums1 and nums2 where nums1 is a subset of nums2.
    // find ythe next greater element for each number in nums1 in nums2.
    // nums1 = [4,1,2] nums2 = [1,3,4,2]
    // output = [-1,3,-1]
    public static int[] nGReEle(int[] nums1, int[] nums2){
        Map<Integer,Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        for (int num:nums2){
            while (!stack.isEmpty() && stack.peek()<num){
                map.put(stack.pop(),num);
            }
            stack.push(num);
        }
        int[] res = new int[nums1.length];
        for(int i=0; i<nums1.length; i++){
            res[i] = map.getOrDefault(nums1[i],-1);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};
        System.out.println(Arrays.toString(nGReEle(nums1,nums2)));
    }
}
  