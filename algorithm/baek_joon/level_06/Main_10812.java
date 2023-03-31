import java.io.*;

public class Main_10812 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int[] baskets = new int[n];
        int[] mirror = new int[n];

        for (int i = 0; i < n; i++) {
            baskets[i] = i + 1;
        }

        for (int i = 0; i < m; i++) {
            String[] a = br.readLine().split(" ");
            int begin = Integer.parseInt(a[0])-1;
            int end = Integer.parseInt(a[1])-1;
            int mid = Integer.parseInt(a[2])-1;

            mirror = baskets.clone();

            int basketsIndex = begin;
            for (int j = mid; j <= end; j++) {
                baskets[basketsIndex] = baskets[j];
                basketsIndex++;
            }

            int s = begin + end - mid + 1;
            int mirrorIndex = begin;
            for (int j = begin; j < mid; j++) {
                baskets[s] = mirror[mirrorIndex];
                mirrorIndex++;
                s++;
            }
        }

        for (int i : baskets) {
            sb.append(i).append(" ");
        }

        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}