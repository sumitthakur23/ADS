import java.util.List;
import java.util.ArrayList;

public class G13Subsets {
    public static void gS(int[] nums, int in, List<Integer>curr, List<List<Integer>>res){
        res.add(new ArrayList<>(curr));
        for(int i=in; i<nums.length; i++){
            curr.add(nums[i]);
            gS(nums, i+1, curr, res);
            curr.remove(curr.size()-1);
        }
    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        gS(nums, 0, new ArrayList<>(), res);
        return res;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(subsets(nums));
    }
}
