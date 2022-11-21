import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<ArrayList<String>> name = new ArrayList<ArrayList<String>>();
        ArrayList<ArrayList<String>> with = new ArrayList<ArrayList<String>>();
        ArrayList<ArrayList<String>> without = new ArrayList<ArrayList<String>>();
        ArrayList<Boolean> violatedwith = new ArrayList<Boolean>();
        ArrayList<Boolean> violatedwithout = new ArrayList<Boolean>();
        int N = input.nextInt();
        int counter = 0;
        for(int x = 0; x<N; x++){
            with.add(new ArrayList<String>());
            with.get(x).add(input.next());
            with.get(x).add(input.next());
            violatedwith.add(false);
        }
        int G = input.nextInt();
        for(int x = 0; x<G; x++){
            without.add(new ArrayList<String>());
            without.get(x).add(input.next());
            without.get(x).add(input.next());
            violatedwithout.add(false);
        }
        int F = input.nextInt();
        
        if(with.size()==0 && without.size()==0){
            System.out.println(0);
            System.exit(0);
        }
        for(int x = 0; x<F; x++){
            name.add(new ArrayList<String>());
            name.get(x).add(input.next());
            name.get(x).add(input.next());
            name.get(x).add(input.next());
            for(int y = 0; y<N; y++){
                    if(with.size()!=0 && violatedwith.get(y)==false){
                        if(name.get(x).contains(with.get(y).get(0)) && !name.get(x).contains(with.get(y).get(1))){
                            counter++;
                            violatedwith.set(y, true);
                        }
                        else if(!name.get(x).contains(with.get(y).get(0)) && name.get(x).contains(with.get(y).get(1))){
                            counter++;
                            violatedwith.set(y, true);
                        }
                    }
            }
            for(int z = 0; z<G; z++){
                    if(without.size()!=0 && violatedwithout.get(z)==false){
                        if(name.get(x).contains(without.get(z).get(0)) && name.get(x).contains(without.get(z).get(1))){
                            counter++;
                            violatedwithout.set(z, true);
                        }
                    }
                }
        }
        System.out.println(counter);
    }
}