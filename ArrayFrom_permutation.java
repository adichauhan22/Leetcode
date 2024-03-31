import java.util.Scanner;

public class ArrayFrom_permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        buildArray(nums);
        
    }
        public static int[] buildArray(int[] nums) {
            int n = nums.length;
            int[] ans = new int[n];
            for(int i=0; i<n; i++){
                ans[i] = nums[nums[i]];
            }
            for(int i=0; i<n; i++){
                System.out.println(ans[i]);
            }
            return ans;
        }
    }

