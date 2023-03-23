package startOfData;

public class DataStorageNode {
    DataStorageNode front;
    DataStorageNode back;
    String name;
    int score;
    
    DataStorageNode(){
        

        DataStorageNode front = null;
        DataStorageNode back = null;
        //We'll test if we have to instantiate these later
        String name;
        int score;
    }

    void setFront(){

    }
    void setBack(){

    }
    void setName(String newName){
        name = newName;
    }
    void setScore(int scoreOfDraft){
        score = scoreOfDraft + score;
    }
    DataStorageNode getFront(){
        return front;

    }
    DataStorageNode getBack(){
        return back;
    }
    String getName(){
        return name;
    }
    int getScore(){
        return score;
    }
    

}
