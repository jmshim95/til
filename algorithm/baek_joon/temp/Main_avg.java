import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        short[] d = new short[n];
        short cnt = 0;
        int sum = 0;
        int[] oftenArr = new int[8001];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            short num = Short.parseShort(br.readLine());
            d[i] = num;
            min = Math.min(min, num);
            max = Math.max(max, num);
            sum += num;
            if (num < 0) {
                num = (short) (-1 * num + 4000);
            }
            oftenArr[num]++;
        }

        int often = Integer.MIN_VALUE;
        for (int i : oftenArr) {
            often = Math.max(i, often);
        }

//        for (int i = 0; i < n; i++) {
//
//        }

        int avg = sum / n;

        sb.append(Math.round(avg)).append("\n"); // 산술평균
        sb.append("").append("\n"); // 중앙값
        sb.append(often).append("\n"); // 최빈값
        sb.append(max-min).append("\n"); // 범위

        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}