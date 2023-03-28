package startOfData;

public class DataStorageNode<T,K> {
    private DataStorageNode<T,K> front;
    private DataStorageNode<T,K> back;
    private T name;
    private K key;
    private int score;
    private int selection;
    
    public DataStorageNode(){
        DataStorageNode<T,K> front = null;
        DataStorageNode<T,K> back = null;
        this.name = null;
        this.score = 0; //no player should have a score of zero, use zero as conditional to determine if the node should be initialized.
    }

    public DataStorageNode(T name, int score){
        
        DataStorageNode<T,K> front = null;
        DataStorageNode<T,K> back = null;
        this.name = name;
        this.score = score;

    }

    public DataStorageNode(T name, K key, int score){
        
        DataStorageNode<T,K> front = null;
        DataStorageNode<T,K> back = null;
        this.name = name;
        this.score = score;
        this.key = key;
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
    void setKey(K newKey){
        this.key = newKey;
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
    int getKey(){//not sure if I will be using floats instead
        return (int)key;
    }
    int getScoreI(){
        return score/3;
    }
    double getScoreD(){
        return score%3;
    }

}
