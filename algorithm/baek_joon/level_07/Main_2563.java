import java.io.*;
import java.util.StringTokenizer;

public class Main_2563 {

    public static void main(String[] args) throws IOException {
        // 백준 2563 - 색종이
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        final int PAPERED = 1;
        final int DRAWING_PAPER_SIZE_X = 100;
        final int DRAWING_PAPER_SIZE_Y = 100;
        int result = 0;

        // 100x100 도화지 배열
        int[][] drawingPaper = new int[DRAWING_PAPER_SIZE_X][DRAWING_PAPER_SIZE_Y];
        int coloredPaperCount = Integer.parseInt(br.readLine());

        for (int i = 0; i < coloredPaperCount; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int coloredPaperX = Integer.parseInt(st.nextToken());
            int coloredPaperY = Integer.parseInt(st.nextToken());

            // 색종이 붙이기 -> 해당하는 도화지 배열값을 1로 채움
            for (int x = coloredPaperX; x < coloredPaperX + 10; x++) {
                for (int y = coloredPaperY; y < coloredPaperY + 10; y++) {
                    if (drawingPaper[x][y] == PAPERED) {
                        continue;
                    }

                    // 종이가 붙어버렸다~~
                    drawingPaper[x][y] = PAPERED;

                    // 결과 합산
                    result += PAPERED;
                }
            }
        }

        bw.write(String.valueOf(result));

        br.close();
        bw.close();
    }
}