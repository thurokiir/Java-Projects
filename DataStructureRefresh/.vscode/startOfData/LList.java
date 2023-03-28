package startOfData;

public class LList {
    DataStorageNode head;
    DataStorageNode tail;

    public LList(){
        head = null;
        tail = null;
    }
    public LList(DataStorageNode first){
        head = first;
        tail = first;
    }
}
