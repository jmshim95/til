import java.io.*;

public class Main_1193 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //Z 모양 지그재그 탐색
        int location = Integer.parseInt(br.readLine());
        int numerator = 1;
        int denominator = 1;
        int diagonalLineLength = 1;
        int i = 0;

        w:
        while (true) {
            if(location == 1) break;

            if (diagonalLineLength % 2 == 0) {
                numerator = 0;
                denominator = diagonalLineLength +1;
            } else {
                numerator = diagonalLineLength +1;
                denominator = 0;
            }

            for(int j = 0; j < diagonalLineLength; j++){
                if (diagonalLineLength % 2 == 0) {
                    numerator++;
                    denominator--;
                } else {
                    numerator--;
                    denominator++;
                }

                i++;
                if(i == location) break w;
            }

            diagonalLineLength++;
        }

        bw.write(numerator + "/" + denominator);

        br.close();
        bw.close();
    }
}