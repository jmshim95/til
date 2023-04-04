import java.io.*;

public class Main_2738 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);

        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            String[] s1 = br.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(s1[j]);
            }
        }

        for (int i = 0; i < n; i++) {
            String[] s1 = br.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                arr[i][j] += Integer.parseInt(s1[j]);
                sb.append(arr[i][j]).append(" ");
            }
            sb.append("\n");
        }

        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}