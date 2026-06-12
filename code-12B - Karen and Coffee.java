import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        int k = sc.nextInt();
        int q = sc.nextInt();
 
        int MAX = 200000;
        int[] recipe = new int[MAX + 2];
 
        for (int i = 0; i < n; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
 
            recipe[l]++;
            recipe[r + 1]--;
        }
 
        for (int i = 1; i <= MAX; i++) {
            recipe[i] += recipe[i - 1];
        }
 
        int[] optimal = new int[MAX + 1];
 
        for (int i = 1; i <= MAX; i++) {
            if (recipe[i] >= k) {
                optimal[i] = 1;
            }
        }
        int[] prefix = new int[MAX + 1];
 
        for (int i = 1; i <= MAX; i++) {
            prefix[i] = prefix[i - 1] + optimal[i];
        }
        while (q > 0) {
            q-- ;
            int a = sc.nextInt();
            int b = sc.nextInt();
 
            System.out.println(prefix[b] - prefix[a - 1]);
        }
    }
}
