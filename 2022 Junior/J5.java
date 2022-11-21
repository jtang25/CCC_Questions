// not AC
import java.util.*;
import java.lang.*;

public class J5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int T = input.nextInt();
        if(T==1){
            int[]tree = {input.nextInt(), input.nextInt()};
            if(tree[0]==N || tree[1]==N || tree[0]==1 || tree[1]==1){
                System.out.println(N-1);
            }
            else{
                System.out.println(Math.max(Math.max(tree[0],N-tree[0]),Math.max(tree[1],N-tree[1]))-1);
            }
        }
        else if(T>1){
            int max = 1;
            ArrayList<ArrayList<Integer>> tree = new ArrayList<ArrayList<Integer>>();
            for(int x = 0; x<T; x++){
                tree.add(new ArrayList<Integer>());
                tree.get(x).add(input.nextInt());
                tree.get(x).add(input.nextInt());
            }
            int maxs = 0;
            for(int x = 1; x<N+1; x++){
               for(int y = 1; y<N+1; y++){
                   for(int z = 1; z<N+1; z++){
                        for(int a = 0; a<tree.size(); a++){
                            int first = tree.get(a).get(0);
                            int second = tree.get(a).get(1);
                            if(((tree.get(a).get(0)<x) || (tree.get(a).get(0)>=x+z)) || (tree.get(a).get(1)<y) || (tree.get(a).get(1)>=y+z)==false){
                                maxs = Math.max(z,maxs);
                            }
                       }
                   }
               }
            }
            System.out.println(maxs);
        }
    }
}
