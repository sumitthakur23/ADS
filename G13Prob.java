import java.util.HashSet;
import java.util.Set;
public class G13Prob {
    // Given a string s, find the length of longest substring without repeating characters.
    // s = "abcabcbb"
    //approach: sliding window and hashet:
    // use two pointers (left and right to dive the window)
    // use a Hashset to track characters in the current window
    // Expand right until we find a duplicate character.
    // when duplicate is found, shrink left until the substring becomes valid.

    public static int LenLongSub(String s){
        Set<Character> set = new HashSet<>();
        int le=0, maxen=0;
        for(int ri=0; ri<s.length(); ri++){
            while (set.contains(s.charAt(ri))){
                set.remove(s.charAt(le));
                le++;
            }
            set.add(s.charAt(ri));
            maxen = Math.max(maxen, ri-le+1);
        }
        return maxen;
    }

    public static void main(String[] args) {
        System.out.println(LenLongSub("abcabcbb"));
    }
}
