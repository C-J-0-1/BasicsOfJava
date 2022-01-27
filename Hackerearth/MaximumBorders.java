import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class MaximumBorders {
    public static void main(String args[] ) throws Exception {
       Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
       while(t-- > 0){
           int border, maxBorder;
           int n = sc.nextInt();
           int m = sc.nextInt();

           char table[][] = new char[n][m];

           for(int i = 0 ; i < n ; i++){
                table[i] = sc.next().toCharArray();
           }
           border = 0;
           maxBorder = 0;
           for(int i = 0 ; i < n ; i++){
               for(int j = 0 ; j < m ; j++){
                   if(table[i][j] == '#'){
                       border++;
                       if (border > maxBorder){
                           maxBorder = border;
                       }
                   }
                   else if(table[i][j] == '.'){
                       border = 0;
                   }
               }
           }
           System.out.println(maxBorder);
       }
    }
}
