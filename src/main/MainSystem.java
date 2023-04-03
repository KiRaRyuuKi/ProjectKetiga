package main;

import java.util.Scanner;

public class MainSystem {

    private static void SequintialSearch(int[] ParameterPertama, int ParameterKedua) {
        int Index = -1;
        
        for(int Search = 0; Search < ParameterPertama.length; Search++) {
            if(ParameterPertama[Search] == ParameterKedua) {
                Index = Search;
                break;
            }
        }
        if(Index == -1) {
            System.out.println("Your Target Integer Does Not Exist In The Array");
        } else {
            System.out.println("Your Target Integer Is In Index " + Index + " Of The Array");
        }
    }
    
    public static void main(String[] args) {
        int[] ExampleVariable = {0,8,1,2,3,4,5,9,0,3,5,7};
        Scanner Scan = new Scanner(System.in);
        
        System.out.print("Array { ");
        for(int Use = 0; Use < ExampleVariable.length; Use++) {
            System.out.print(ExampleVariable[Use] + " ");
        }
        System.out.println("}");
        System.out.println("");
        
        System.out.print("Cari Target : ");
        int Target = Scan.nextInt();
        SequintialSearch(ExampleVariable, Target);
    }    
}
