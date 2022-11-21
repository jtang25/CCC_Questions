import java.util.*;
import java.lang.*;
public class J2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int a, b;
        int counter= 0;
        for(int x = 0; x<N; x++){
            a=input.nextInt();
            b=input.nextInt();
            if(a*5-b*3>40){
                counter++;
            }
        }
        if(counter==N){
            System.out.println(counter+"+");
        }
        else if(counter!=N){
            System.out.println(counter);
        }
    }
}
