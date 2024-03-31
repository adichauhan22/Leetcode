import java.util.*;

public class Shuffal_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        int pos = sc.nextInt();
        shuffle(nums, pos);
    }

        public static int[] shuffle(int[] nums, int pos) {
            int size = 2*pos;
            int[] arr = new int[size];
            int j = 0;
            for(int i=0; i<size; i++){
                arr[i] = nums[j];
                i++;
                if(i >= size){
                    break;
                }
                arr[i] = nums[pos];
                j++;
                pos++;
            }
            for(int i=0; i<size; i++){
                System.out.println(arr[i]);
            }
            return arr;
        }
    }

