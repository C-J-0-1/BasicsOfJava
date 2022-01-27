import java.util.*;


class SevenSegmentDisplay {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while(t-- > 0){
            String display[] = new String[]{"6", "2", "5", "5", "4", "5", "6", "3", "7", "6"};
            String n = sc.nextLine();
            
            int totalSticks = 0;
            for(int i = 0 ; i < n.length() ; i++){
                totalSticks += Integer.parseInt(display[Integer.parseInt(n.substring(i, i+1))%10]);
            }

            String max = "";
            while(totalSticks != 0){
                if(totalSticks %2 == 1){
                    max += "7";
                    totalSticks -= 3;
                }
                else if(totalSticks % 2 == 0){
                    for(int i = 0 ; i < totalSticks/2 ; i++){
                        max += "1";
                        totalSticks -= 2;
                    }
                }
            }
            System.out.println(max);
        }
    }
}