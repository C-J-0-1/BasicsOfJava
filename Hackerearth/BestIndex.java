import java.util.*;

class BestIndex {
    public static void main(String args[] ) throws Exception {

        // Write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        long arr[] = new long[n+1];
        long preArr[] = new long[n+1];

        arr[0] = 0;
        arr[1] = s.nextInt();
        preArr[1] = arr[1];
        for(int i = 2 ; i <= n ; i++){
            arr[i] = s.nextInt();
            preArr[i] = preArr[i-1] + arr[i];
        }

        int max = 0, sum = 0;
        for(int i = 1 ; i <= n ; i++){
            sum = 0;
            int k = 2, limit = i;
            while(limit <= n){
                if(limit + k <= n){
                    limit += k;
                }
                else{
                    break;
                }
                k++;
            }
            sum += preArr[limit] - preArr[i-1];
            if(max < sum)
                max = sum;
        }
        System.out.println(max);
    }
}