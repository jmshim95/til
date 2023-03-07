import java.io.*;
import java.util.StringTokenizer;

public class Main_2525 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());
        int duck = Integer.parseInt(br.readLine());

        int addedHour = Math.round((minute+duck) / 60);
        minute = (minute+duck) % 60;

        hour += addedHour;

        if (hour >= 24) {
            hour %= 24;
        }

        bw.write(hour + " " + minute);

        br.close();
        bw.close();
    }
}