public class DefuseBomb {
    public static void main(String[] args) {
        // problem number: 1652(difuse the bomb)
    }
    public static int[] decrypt(int[]code,int k){
        int n = code.length;
        int []result = new int[n];
        if(k==0){
            return result;
        }
        int start,end,step;
        if(k>0){
            start = 1;
            end = k;
            step = 1;
        }
        else{
            start = -1;
            end = k;
            step = -1;
        }
        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j=1; j<=k; j++){
                int index = (i+(j*step)+n)%n; // handling here circular indexing
                sum += code[index];
            }
            result[i] = sum;
        }
        return result;
    }
} 
