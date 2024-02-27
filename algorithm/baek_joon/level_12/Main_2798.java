import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        String[] cards = br.readLine().split(" ");

        int m = Integer.parseInt(input[1]);
        int res = 0;

        for (int i = 0; i < cards.length - 2; i++) {
            for (int j = i + 1; j < cards.length - 1; j++) {
                for (int k = j + 1; k < cards.length; k++) {
                    int sum = Integer.parseInt(cards[i]) + Integer.parseInt(cards[j]) + Integer.parseInt(cards[k]);
                    if (sum <= m && sum > res) {
                        res = sum;
                    }
                }
            }
        }

        bw.write(String.valueOf(res));
        br.close();
        bw.close();
    }

}