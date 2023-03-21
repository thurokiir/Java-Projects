package startOfData;
import java.io.*;

public class startOfData{  

    public static void main(String[] args){


        testClass testOne = new testClass();


        String[][] baseballResults = testOne.csvFinder();

        for(int i = 0; i < baseballResults.length; i++){

            System.out.println();
            System.out.println("Round " + i%50);

            for(int j = 0; j < 15; j++){
                System.out.print(baseballResults[i][j]+ "  ,");
            }
            System.out.println();
        }

    
    

    }
}