package startOfData;

public class DataStorageNode<T> {
    private DataStorageNode<T> front;
    private DataStorageNode<T> back;
    private T name;
    private int score;
    
    public DataStorageNode(T name, int score){
        

        DataStorageNode<T> front = null;
        DataStorageNode<T> back = null;
        //We'll test if we have to instantiate these later
        this.name = name;
        this.score = score;
    }

    //Sets
    void setFront(){

    }
    void setBack(){

    }
    void setName(T newName){
        this.name = newName;
    }
    void setScore(int scoreOfDraft){
        this.score = scoreOfDraft + score;
    }

    //Gets
    DataStorageNode getFront(){
        return front;

    }
    DataStorageNode getBack(){
        return back;
    }
    String getName(){
        return (String)name;
    }
    int getScore(){
        return score;
    }
    

}
