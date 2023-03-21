package startOfData;

public class BST {
   
    private BSTNode root;

    public BST(){
        root = null;
    }
    
    
    public boolean isEmpty(){
        return root == null;
    }


    
    public void insert(int data){
        if(root == null){
            root = new BSTNode(data);
            return;
        }
        BSTNode inserter = new BSTNode(data);
        insert(root, inserter);
    }



    //recursive insert
    private BSTNode insert(BSTNode last, BSTNode inserted){

        if(last == null){
            
            last = inserted;

        } else {
            if (inserted.getInt() <= last.getInt()){

                last.left = insert(last.left, inserted);
         } else {

                last.right = insert(last.right, inserted);
        }
    }
    return last;
        
    }
    

    void delete (int n){

        root = delete(root, n);
    }

    //recursive delete
    private BSTNode delete(BSTNode last, int n){

        return last;
    }

    int noteCount(){
        return noteCount(root);
    }

    //recursive noteCount
    private int noteCount(BSTNode last){
        return 1;
    }


    boolean search(int n){

        return search(root, n);
    }

    private boolean search(BSTNode last, int n){



        return false;
    }

    void inOrder(){
        System.out.println("InOrder");
        inOrder(root);
    }

    private void inOrder(BSTNode last){


        if(last != null){
            
            inOrder(last.getLeft());
            System.out.print(last.data + " ");
            inOrder(last.getRight());
        }

    }

    void preOrder(){
        System.out.println("PreOrder");
        preOrder(root);
    }

    private void preOrder(BSTNode last){

        if(last != null){
            System.out.print(last.data + " ");
            inOrder(last.getLeft());
            inOrder(last.getRight());
        }
    }

    void postOrder(){
        System.out.println("PostOrder");
        postOrder(root);
    }

    private void postOrder(BSTNode last){
        
        if(last != null){
            inOrder(last.getLeft());
            inOrder(last.getRight());
            System.out.print(last.data + " ");
        }
    }




}
