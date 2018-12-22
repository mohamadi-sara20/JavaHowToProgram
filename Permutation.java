package JavaHowToProgram;

import java.util.ArrayList;
import java.util.List;

public class Permutation {


    public static void main(String[] args){

        String x = "ABCDEFGHIJ";
        System.out.println(getPerms(x));


    }

    public static ArrayList<String> getPerms(String x){

        ArrayList<String> allPerms = new ArrayList<>();
        ArrayList<String> permutations = new ArrayList<>();
        String s = "";
        if(x.length() == 1) {
            permutations.add(x);
            return permutations;
        }

        
        for(int i = 0; i < x.length(); i++) {
            s = "" + x.charAt(i);
            String swap = swap(x, i);
            ArrayList<String> temp = getPerms(swap.substring(1, swap.length()));
            for(int j = 0; j < temp.size(); j++){
                String perm = s + temp.get(j);
                allPerms.add(perm);
            }

        }

        return allPerms;
    }

    private static String swap(String y, int ind){
        return y.substring(ind, ind + 1) + y.substring(0, ind) + y.substring(ind + 1 , y.length());

    }




}
