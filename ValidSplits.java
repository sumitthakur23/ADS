public class ValidSplits {
    public static void main(String[] args) {
        int[] arr={10,4,-8,7};
        long result=ValidSplits.validSplits(arr);
        System.out.println(result);
    }
    public static long validSplits(int[]arr){
        int totalSum=0;
        for(int num:arr){
            totalSum+=num;
        }
        int leftSum=0;
        long ValidSplits=0;
        for(int i=0;i<arr.length-1;i++){
            leftSum+=arr[i];
            int rightSum=totalSum-leftSum;
            if(leftSum>=rightSum){
                ValidSplits++;
            }
        }
        return ValidSplits;
    }
}
