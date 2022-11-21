import java.util.*;
import java.lang.*;
public class J3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[] word = input.next().toCharArray();
        for(int x = 0; x<word.length; x++){
            ArrayList<Character> string = new ArrayList<Character>();
            String turn ="";
            int a = 0;
            while(word[x]!='+' && word[x]!='-'){
                string.add(word[x]);
                x++;
            }
            if(word[x]=='+'){
                turn = "tighten";
                boolean ran = false;
                while(x<word.length-1 && (word[x+1]=='1' || word[x+1]=='2' || word[x+1]=='3' || word[x+1]=='4' || word[x+1]=='5' || word[x+1]=='6' || word[x+1]=='7' || word[x+1]=='8' || word[x+1]=='9' || word[x+1]=='0')){
                    x++;
                    a=a*10+word[x]-48;
                    ran = true;
                }
                if(ran==false){
                    x++;
                }
            }
            if(word[x]=='-'){
                turn = "loosen";
                boolean ran = false;
                while(x<word.length-1 && (word[x+1]=='1' || word[x+1]=='2' || word[x+1]=='3' || word[x+1]=='4' || word[x+1]=='5' || word[x+1]=='6' || word[x+1]=='7' || word[x+1]=='8' || word[x+1]=='9' || word[x+1]=='0')){
                    x++;
                    a=a*10+word[x]-48;
                    ran = true;
                }
                if(ran==false){
                    x++;
                }
            }
            for(int y = 0; y<string.size(); y++){
                System.out.print(string.get(y));
            }
            System.out.print(" "+turn+" "+a);
            System.out.println();
        }
    }
}
