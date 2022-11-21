import java.util.*;
import java.lang.*;
public class '22-J1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        a=a*8;
        b=b*3;
        int left = 28-a-b;
        System.out.println(Math.abs(left));
    }
}
