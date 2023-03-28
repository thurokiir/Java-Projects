package startOfData;

public class DataStorageNode<V,K> {
    private DataStorageNode<V,K> front;
    private DataStorageNode<V,K> back;
    private V name;
    private K key;
    private int score;
    private int selection;
    
    public DataStorageNode(){
        DataStorageNode<V,K> front = null;
        DataStorageNode<V,K> back = null;
        this.name = null;
        this.score = 0; //no player should have a score of zero, use zero as conditional to determine if the node should be initialized.
    }

    public DataStorageNode(V name, int score){
        
        DataStorageNode<V,K> front = null;
        DataStorageNode<V,K> back = null;
        this.name = name;
        this.score = score;

    }

    public DataStorageNode(V name, K key, int score){
        
        DataStorageNode<V,K> front = null;
        DataStorageNode<V,K> back = null;
        this.name = name;
        this.score = score;
        this.key = key;
    }

    //Sets
    void setFront(){

    }
    void setBack(){

    }
    void setName(V newName){
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
    K getKKey(){
        return (K)name;
    }
    V getVKey(){
        return (V)key;
    }
    int getScoreI(){
        return score/3;
    }
    double getScoreD(){
        return score%3;
    }

}
