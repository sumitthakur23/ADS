import java.util.HashMap;
import java.util.Map;

public class G13Prob2 {

    public static int LenLongSubTwoDistinct(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int le = 0, maxen = 0;
        for (int ri = 0; ri < s.length(); ri++) {
            map.put(s.charAt(ri), map.getOrDefault(s.charAt(ri), 0) + 1);
            while (map.size() > 2) {
                map.put(s.charAt(le), map.get(s.charAt(le)) - 1);
                if (map.get(s.charAt(le)) == 0) {
                    map.remove(s.charAt(le));
                }
                le++;
            }
            maxen = Math.max(maxen, ri - le + 1);
        }
        return maxen;
    }

    public static void main(String[] args) {
        System.out.println(LenLongSubTwoDistinct("eceba")); // Output should be 3
    }
}