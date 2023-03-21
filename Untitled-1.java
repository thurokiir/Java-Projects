import java.util.*;



class Untitled{
    public static void main(String[] args){
        int MAX = 5;
        int number = 0;
        for (int count = MAX; count >=1; count--){
            number += (count * count);
        }
        System.out.println("The result is:" + number);
        //25+16+9+4
    }
}
