package startOfData;
import java.lang.Math;


public class testClass {

    BST test;
    MatrixGraph gTest;
   

    testClass(){
        test = new BST();

        
    }

    public void BSTTest(){
        
        int[] testValues = new int[] { 50, 62, 90, 23, 70, 26, 9, 57, 25, 51 };

        for (int i = 0; i <= 9; i++){
            
            test.insert(testValues[i]);
        }

        /*
        test.inOrder();
        System.out.println();
        test.preOrder();
        System.out.println();
        test.postOrder();
        System.out.println();
        */
    }

    public void graphTest(){
        int[][] twoDiTest = {
            {0,4,0,0,0},
            {0,0,3,3,0},
            {2,0,0,0,2},
            {0,0,0,0,0},
            {0,5,0,2,0},

        };

        gTest = new MatrixGraph(twoDiTest);

        gTest.populateEdgeLoop();

//        gTest.populateNode();
    }

    public void sortingTest(int length){

       
        
        int[] intArray = new int[length];

        intArray = getARandomIntArray(intArray);

        printADataSet(intArray);

        int [] intArrayTemp = new int[intArray.length];

        System.arraycopy(intArray, 0, intArrayTemp, 0, intArray.length);

        sortingAlgos sortSlave = new sortingAlgos();

        int [] selectionTrue = sortSlave.selectionSort(intArray,true);//setting up for deep copy

        printADataSet(selectionTrue);

        printADataSet(intArray);

        int [] bubbly = sortSlave.bubbleSort(intArray,false);

        printADataSet(bubbly);
        
        int [] bubblyTrue = sortSlave.bubbleSort(intArray,true);


        System.out.print("\n"  + "BubbleSortsHappenHere");

        printADataSet(bubblyTrue);

        printADataSet(intArray);


        
    }

    /*
    *   Accepts a min and max range of numbers to return an int. Uses a typecast to return an int.
    */
    public int getARandomInt(double smallestInt, double largestInt){ 
        double min = Math.ceil(smallestInt);
        double max = Math.floor(largestInt);

        return (int)Math.floor(Math.random() * (max - min) +  min); //typecasted, will warp results due to rounding leading to distribution errors
    }

    /*
    *   Accepts a min and max range of doubles to return a double. 
    */
    public double getARandomDouble(double smallestDouble, double largestDouble){ 
        double min = Math.ceil(smallestDouble);
        double max = Math.floor(largestDouble);

        return Math.floor(Math.random() * (max - min) +  min); 
    }

    public int[] getARandomIntArray(int [] theShell){

        for(int i = 0; i < theShell.length-1; i++){
            theShell[i] = getARandomInt(-100, +100);
        }
        return theShell;
    }

    void printADataSet(int [] sorted){

        System.out.println();
        for(int i = 0; i < sorted.length - 1; i++){
            System.out.print(sorted[i] + " ");
        }

    }

}
