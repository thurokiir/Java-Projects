package startOfData;

public class DataStorageNode<T> {
    private DataStorageNode<T> front;
    private DataStorageNode<T> back;
    private T name;
    private int score;
    private int selection;
    
    public DataStorageNode(){
        DataStorageNode<T> front = null;
        DataStorageNode<T> back = null;
        this.name = null;
        this.score = 0; //no player should have a score of zero, use zero as conditional to determine if the node should be initialized.
    }

    public DataStorageNode(T name, int score){
        
        DataStorageNode<T> front = null;
        DataStorageNode<T> back = null;
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
        selection++;
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
    int getScoreI(){
        return score/3;
    }
    double getScoreD(){
        return score%3;
    }

}
