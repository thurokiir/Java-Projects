package startOfData;

/*
Selection Sort	Ω(n^2)	θ(n^2)	O(n^2)	O(1)
Bubble Sort	Ω(n)	θ(n^2)	O(n^2)	O(1)
Insertion Sort	Ω(n)	θ(n^2)	O(n^2)	O(1)
Heap Sort	Ω(n log(n))	θ(n log(n))	O(n log(n))	O(1)
Quick Sort	Ω(n log(n))	θ(n log(n))	O(n^2)	O(n)
Merge Sort	Ω(n log(n))	θ(n log(n))	O(n log(n))	O(n)
Bucket Sort	Ω(n +k)	θ(n +k)	O(n^2)	O(n)
Radix Sort	Ω(nk)	θ(nk)	O(nk)	O(n + k)
Count Sort	Ω(n +k)	θ(n +k)	O(n +k)	O(k)
Shell Sort	Ω(n)	θ(n log(n))	O(n log(n))	O(1)
Tim Sort	Ω(n)	θ(n log(n))	O(n log (n))	O(n)
Tree Sort	Ω(n log(n))	θ(n log(n))	O(n^2)	O(n)
Cube Sort	Ω(n)	θ(n log(n))	O(n log(n))	O(n)
*/

public class sortingAlgos{

    private int [] arrayForSorting;

    sortingAlgos(){

    }

    //In case we want to do some data manipulation between search and sort! =D HAPPYFACE??? UNSURE IF THIS IS JOY???
    sortingAlgos(int randomDataSet[]){
        arrayForSorting = randomDataSet;
    }


    /*
    / One of the worst sorting Algorithms. O(n^2) speed, does not requre extra memory (in place) and does not maintain relative positions 
    / ie: if there was a 10b and a 10a found, selectionSort would not maintain that sequence (sometimes)
    /
    */
    int [] selectionSortDeep(int randomInt[]){  
        
        int selectCopy [] = new int [randomInt.length];

        System.arraycopy(randomInt, 0, selectCopy, 0, randomInt.length);

        int n = randomInt.length - 1;
        /*
        for(int m = 0; m < n; m ++){
            selectCopy[m] = randomInt[m];
        }
        */

        //Find smallest element in unsorted Array
        for(int i = 0; i < n; i++){
 
            int min_idx = i;
            for(int j = i+1; j < n; j++){
                if(selectCopy[j] < selectCopy[min_idx]){
                    min_idx = j;
                }
            }

            //Swap the latest found element with the first element
            int temp = selectCopy[min_idx];
            selectCopy[min_idx] = selectCopy[i];
            selectCopy[i] = temp;
        }

        return selectCopy;
    }

    int [] selectionSort(int randomInt[], boolean deep){  
        
        if(deep == true){
            return selectionSortDeep(randomInt);
        }

        int n = randomInt.length - 1;

        //Find smallest element in unsorted Array
        for(int i = 0; i < n; i++){
 
            int min_idx = i;
            for(int j = i+1; j < n; j++){
                if(randomInt[j] < randomInt[min_idx]){
                    min_idx = j;
                }
            }

            //Swap the latest found element with the first element
            int temp = randomInt[min_idx];
            randomInt[min_idx] = randomInt[i];
            randomInt[i] = temp;
        }

        return randomInt;
    }


    /*
    / O(n^2)
    / 
    */
    int [] bubbleSort(int randomInt[], boolean deep){

        if(deep == true){
            int btest [] = new int[randomInt.length];

            System.arraycopy(randomInt, 0, btest, 0, randomInt.length);

            return rBubbleSort(btest, randomInt.length);
        } 

        //randomInt = rBubbleSort(randomInt, randomInt.length);
        
        return nBubbleSort(randomInt);
    }

    private int[] rBubbleSort(int randomInt[], int loop){

        if(loop == 1){
            return randomInt;
        }

        int count = 0;
        
        //Lets iterate the list!
        for(int i = 0; i < loop-2; i++){

            //if an element one ahead of the iteration is larger than the iteration, swap it.
            if(randomInt[i] > randomInt[i+1]){
                /*
                System.out.println();
                if(randomInt[i+1] == 0){
                    for(int j = 0; j < randomInt.length; j++){
                        System.out.print(randomInt[j] + " ");
                    }
                }
                */
                int temp = randomInt[i];
                randomInt[i] = randomInt[i+1];
                randomInt[i+1] = temp;
                count = count++;
            }
        }
        rBubbleSort(randomInt, loop-1);
        if(count == 0){
            return randomInt;
        }
        return randomInt;

    }

    private int [] nBubbleSort(int [] shallowArray){

        int n = shallowArray.length - 1;

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n - i; j++){
                if(shallowArray[j] > shallowArray[j+1]){
                    int temp = shallowArray[j];
                    shallowArray[j] = shallowArray[j+1];
                    shallowArray[j + 1] = temp;
                }
            }
        }

        return shallowArray;
    }
    int [] insertionSort(int randomInt[]){
        return randomInt;
    }
    int [] heapSort(int randomInt[]){
        return randomInt;
    }
    int [] quickSort(int randomInt[]){
        return randomInt;
    }
    int [] mergeSort(int randomInt[]){
        return randomInt;
    }
    int [] bucketSort(int randomInt[]){
        return randomInt;
    }
    int [] radixSort(int randomInt[]){
        return randomInt;
    }
    int [] countSort(int randomInt[]){
        return randomInt;
    }
    int [] shellSort(int randomInt[]){
        return randomInt;
    }
    int [] timSort(int randomInt[]){
        return randomInt;
    }
    int []  treeSort(int randomInt[]){
        return randomInt;
    }
    int [] cubeSort(int randomInt[]){

        return randomInt;
    }
    
}