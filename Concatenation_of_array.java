import java.util.*;

public class Concatenation_of_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        getConcatenation(nums);

    }

        public static int[] getConcatenation(int[] nums) {
            Scanner sc = new Scanner(System.in);
            int n = nums.length;
            int[] ans = new int[2*n];
    
            for(int i=0; i<ans.length; i++){
            for(int j=1; j<n; j++){
                 if(n <= i){
                    j--;
                }
                ans[i] = nums[j];
            }
            }
    
            Reverse(ans, n+1, 2*n);
            return ans;
        }
    
        public static void Reverse(int[] ans, int i, int j){
            int temp =0;
            while(i<j){
                temp = ans[i];
                ans[i] = ans[j];
                ans[j] = temp;
                i++;
                j--;
            }
        }
    }
