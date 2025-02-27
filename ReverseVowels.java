import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ReverseVowels {
    public static void main(String[] args) {
        ReverseVowels r=new ReverseVowels();
        String S1="hello";
        System.out.println("Input: "+S1);
        System.out.println("Output: "+r.reverseVowels(S1));
    }
    public String reverseVowels(String s){
        if(s==null || s.length()==0) return s;
        Set<Character> vowels = new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        char[] chars = s.toCharArray();
        int left = 0, right = chars.length-1;
        while(left<right){
            while(left<right && !vowels.contains(s.charAt(left))){
                left++;
            }
            while(left<right && !vowels.contains(s.charAt(right))){
                right--;
            }
            char temp=chars[left];
            chars[left]=chars[right];
            chars[right]=temp;
            left++;
            right--;
        }
        return new String(chars);
    }
}
