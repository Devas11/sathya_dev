import java.io.*;
import java.util.*;
public class Power {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int pow = scanner.nextInt();
        System.out.print(Math.pow(num, pow));
    }
}
