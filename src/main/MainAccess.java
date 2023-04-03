package main;

public class MainAccess {

    private static void BubbleSort(int[] Array) {
        int N = Array.length;
        int Temp = 0;
        
        for(int Bubble = 0; Bubble < N; Bubble++) {
            for(int Sort = 1; Sort < (N-Bubble); Sort++) {
                if(Array[Sort-1] > Array[Sort]) {
                    
                    // Swap Elements
                    Temp = Array[Sort-1];
                    Array[Sort-1] = Array [Sort];
                    Array[Sort] = Temp;
                    
                }
            }
        }
    }
    
    public static void main(String[] args) {
        int Array[] = {3,1,4,2,5};
        
        System.out.println("Array Before Bubble Sort");
        for(int Test = 0; Test < Array.length; Test++) {
            System.out.print(Array[Test] + " ");
        }
        
        System.out.println("");
        
        // Sorting Array Elements Using Bubble Sort
        BubbleSort(Array); 
        
        System.out.println("Array After Bubble Sort");
        for(int Test = 0; Test < Array.length; Test++) {
            System.out.print(Array[Test] + " ");
        }
        System.out.println("");
    }
}
