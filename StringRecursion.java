// 784 
public class StringRecursion {
    public static void generatepermu(String str, String perm) {
        if(str.isEmpty()){
            System.out.println(perm);
            return;
        }
        for(int i=0; i<str.length(); i++){
            Character ch = str.charAt(i);
            String rem=str.substring(0, i)+str.substring(i+1);
            generatepermu(str, perm+ch);
        }
    }
    public static void main(String[] args) {
        String str = "abcd";
        System.out.println("Permutation of "+str+" is: ");
        generatepermu(str, "");
    }
}
