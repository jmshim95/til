버퍼와 스캐너 관련 글   
- https://dlee0129.tistory.com/238
- https://www.acmicpc.net/blog/search/%EC%9E%85%EB%A0%A5+%EC%86%8D%EB%8F%84

1. 사용하는 버퍼의 크기차이.
2. 내부적 처리방식

>BufferedReader 사용 -> 빠르고 불편함
```java
import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken()); // 공백 단위로 읽어들임
        int b = Integer.parseInt(st.nextToken());

        bw.write(a > b ? ">" : a < b ? "<" : "==");
        br.close();
        bw.close();
    }
}
```

> Scanner 사용 -> 느리고 편함
```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a > b ? ">" : a < b ? "<" : "==");
    }
}
```