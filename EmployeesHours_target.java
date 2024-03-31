import java.util.*;

public class EmployeesHours_target {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int n = sc.nextInt();
        int[] hours = new int[n];
        for(int i=0; i<hours.length; i++){
            hours[i] = sc.nextInt();
        }

        numberOfEmployeesWhoMetTarget(hours, target);
    }

        public static void numberOfEmployeesWhoMetTarget(int[] hours, int target) {
            int n = hours.length;
            int count = 0;
            for(int i=0; i<n; i++){
                if(hours[i] >= target){
                    count = count + 1;
                }
            }
            System.out.println(count);
        }
    }

