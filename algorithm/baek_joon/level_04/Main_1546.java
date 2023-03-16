import java.io.*;

public class Main_1546 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        float best = 0;
        float sum = 0;
        float[] scores = new float[n];
        for (int i = 0; i < n; i++) {
            scores[i] = Integer.parseInt(s[i]);
            if(best < scores[i]) best = scores[i];
        }

        for (int i = 0; i <n; i++) {
            scores[i] = scores[i] / best * 100;
            sum += scores[i];
        }

        float r = sum / n;

        bw.write(String.valueOf(r));
        br.close();
        bw.close();
    }
}