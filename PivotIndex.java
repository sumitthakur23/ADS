public class PivotIndex {
    public static void main(String[] args) {
        int[] arr={1,5,6,4,6,6};
        System.out.println(pivot(arr));
    }
    public static int pivot(int[]arr){
        int sum=0;
        for(int num:arr){
            sum+=num;
        }
        int leftSum=0;
        for(int i=0;i<arr.length;i++){
            if(leftSum==sum-leftSum-arr[i]){
                return i;
            }
            leftSum+=arr[i];
        }
        return -1;
    }
}
