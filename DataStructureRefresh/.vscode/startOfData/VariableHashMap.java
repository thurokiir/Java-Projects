package startOfData;


public class VariableHashMap<K, V> {
    private final int INITIAL_CAPACITY = 16;
    private DataStorageNode<K, V>[] table;
    private int size;
    private float loadFactor;

    public VariableHashMap() {
        this.table = new DataStorageNode[INITIAL_CAPACITY];
        this.loadFactor = 0.75f;
        this.size = 0;
    }

    public VariableHashMap(float loadFactor) {
        this.table = new DataStorageNode[INITIAL_CAPACITY];
        this.loadFactor = loadFactor;
        this.size = 0;
    }


    private float getLoadFactor(){
        return (float)size / table.length;
    }

    private void resize(){
        DataStorageNode<K, V>[] oldTable = table;
        table = new DataStorageNode[oldTable.length * 2];
        size = 0;
        for(int i = 0; i< oldTable.length; i++){
            DataStorageNode<K, V> entry = oldTable[i];
            while(entry != null){
                put(entry.getVKey(), entry.getKKey());
                entry = entry.getBack();
            }
        }
    }

    private int hash(K key){
        return Math.abs(key.hashCode()) % table.length;
    }

    //putting an entry into the table, rewrite this to use DataStorageNode as a parameter
    public void put(K key, V Value){
        int index = hash(key);
        if(table[index] == null){
            table[index] = new DataStorageNode<K, V>(key, Value, 0);
            size++;
        }else{
            DataStorageNode<K, V> entry = table[index];
            while(entry.getBack() != null && !entry.getKKey().equals(key)){
                entry = entry.getBack();
            }
            if(entry.getKKey().equals(key)){
                entry.setName(key); //change this later to search hash return function
            }else{
                DataStorageNode <K,V> temp = new DataStorageNode<K, V>(key, Value,0);
                entry.setBack(temp);
                size++;
            }
        }
        if(getLoadFactor() > loadFactor){
            resize();
        }
    }

    public V get(K key){
        int index = hash(key);
        if(table[index] == null){
            return null;
        }else{
            DataStorageNode<K, V> entry = table[index];
            while(entry != null && !entry.getKKey().equals(key)){
                entry = entry.getBack();
            }
            if(entry == null){
                return null;
            }else{
                return entry.getKKey();
            }
        }
    }

    //removing an entry from the table, likely issue with generic comparisons. Check later.
    public void remove(K key){
        int index = hash(key);
        if(table[index] == null){
            return;
        }else{
            DataStorageNode<K, V> entry = table[index];
            DataStorageNode<K, V> prev = null;
            while(entry.getBack() != null && !entry.getKKey().equals(key)){
                prev = entry;
                entry = entry.getBack();
            }
            if(entry.getKKey().equals(key)){
                if(prev == null){
                    table[index] = entry.getBack();
                }else{
                    prev.setBack(entry.getBack());
                }
                size--;
            }
        }
        if(getLoadFactor() < loadFactor / 4 && table.length > INITIAL_CAPACITY){
            resize();
        }
    }
}
