import java.util.*;

class Main {

    static int[] leader;
    static int[] size;

    static int find(int x) {
        if (leader[x] == x)
            return x;

        leader[x] = find(leader[x]);
        return leader[x];
    }

    static void union(int a, int b) {
        a = find(a);
        b = find(b);

        if (a == b)
            return;

        if (size[a] < size[b]) {
            int temp = a;
            a = b;
            b = temp;
        }

        leader[b] = a;
        size[a] += size[b];
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        leader = new int[N + 1];
        size = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            leader[i] = i;
            size[i] = 1;
        }

        int[] A = new int[M];
        int[] B = new int[M];

        for (int i = 0; i < M; i++) {
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();

            union(A[i], B[i]);
        }

        long[] edges = new long[N + 1];

        for (int i = 0; i < M; i++) {
            int root = find(A[i]);
            edges[root]++;
        }

        long answer = 0;

        for (int i = 1; i <= N; i++) {

            if (find(i) == i) {

                long k = size[i];

                long possible = k * (k - 1) / 2;

                answer += possible - edges[i];
            }
        }

        System.out.println(answer);
    }
}
