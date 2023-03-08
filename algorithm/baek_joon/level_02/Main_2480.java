import java.io.*;
import java.util.StringTokenizer;

public class Main_2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int prizeMoney = 0;
        int[] dices = new int[3];

        for (int i = 0; i < 3; i++) {
            dices[i] = Integer.parseInt(st.nextToken());
        }

        if (dices[0] == dices[1] && dices[0] == dices[2]) {
            // 모두 같을 때
            prizeMoney = 10000 + (dices[0] * 1000);
        } else if (dices[0] == dices[1] || dices[0] == dices[2]) {
            // 두 수만 같을 때 (같은 눈 구분)
            prizeMoney = 1000 + (dices[0] * 100);
        } else if (dices[1] == dices[2]) {
            // 두 수만 같을 때 (같 눈 구분)
            prizeMoney = 1000 + (dices[1] * 100);
        } else {
            // 모두 다를 때
            int temp = 0;
            for (int dice : dices) {
                if (dice > temp) {
                    temp = dice;
                    prizeMoney = dice * 100;
                }
            }
        }

        bw.write(String.valueOf(prizeMoney));

        br.close();
        bw.close();
    }
}