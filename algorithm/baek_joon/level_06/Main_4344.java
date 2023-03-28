import java.io.*;

public class Main_4344 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer sb = new StringBuffer();
        int c = Integer.parseInt(br.readLine());

        for (int i = 0; i < c; i++) {
            String[] tests = br.readLine().split(" ");
            double sum = 0;
            double over = 0;

            for (int j = 1; j < tests.length; j++) {
                sum += Integer.parseInt(tests[j]);
            }

            double avg = sum / Integer.parseInt(tests[0]);

            for (int j = 1; j < tests.length; j++) {
                if (Integer.parseInt(tests[j]) > avg) {
                    over++;
                }
            }

            double r = over / (tests.length - 1) * 100;

            String s = String.format("%.3f", r);
            sb.append(s).append("%").append("\n");
        }

        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}