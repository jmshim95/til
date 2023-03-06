import java.io.*;
import java.time.LocalTime;
import java.util.StringTokenizer;

public class Main_2884 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());
        LocalTime time = LocalTime.of(hour, minute);

        LocalTime miracleMorning = time.minusMinutes(45L);
        String[] split = miracleMorning.toString().split(":");

        hour = Integer.parseInt(split[0]);
        minute = Integer.parseInt(split[1]);

        bw.write(hour + " " + minute);

        br.close();
        bw.close();
    }
}