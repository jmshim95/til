- 백준 기준으로, 문제를 제출할 때 클래스 명은 반드시 `Main` 이어야함.
- 라이브러리를 사용할 경우 `import` 라인도 같이 기재 해줘야함.   

ex) 
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println(a + b);
    }
}
```