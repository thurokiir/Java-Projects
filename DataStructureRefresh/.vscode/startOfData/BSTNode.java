package startOfData;

public class BSTNode {
    BSTNode left;
    BSTNode right;
    int data;
    
    
    BSTNode(){
        left = null;
        right = null;
        data = 0; //questionable but mandatory
    }


    BSTNode(int n){
        left = null;
        right = null;
        data = n;
    }

    void setleft(BSTNode l){
        left = l;
    }
    
    void setright(BSTNode r){
        right = r;
    }

    BSTNode getLeft(){
        return left;
    }

    BSTNode getRight(){
        return right;
    }

    void setData(int n){
        data = n;
    }

    int getInt(){
        return data;
    }

    





}
