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
                put(entry.getKey(), entry.value);
                entry = entry.getBack();
            }
        }
    }

    private int hash(K key){
        return Math.abs(key.hashCode()) % table.length;
    }

    //putting an entry into the table
    public void put(K key, V Value){
        int index = hash(key);
        if(table[index] == null){
            table[index] = new DataStorageNode<K, V>(key, Value, 0);
            size++;
        }else{
            DataStorageNode<K, V> entry = table[index];
            while(entry.getBack() != null && !entry.key.equals(key)){
                entry = entry.getBack();
            }
            if(entry.key.equals(key)){
                entry.value = Value;
            }else{
                entry.getBack() = new DataStorageNode<K, V>(key, Value,0);
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
            while(entry != null && !entry.key.equals(key)){
                entry = entry.getBack();
            }
            if(entry == null){
                return null;
            }else{
                return entry.value;
            }
        }
    }

    public void remove(K key){
        int index = hash(key);
        if(table[index] == null){
            return;
        }else{
            DataStorageNode<K, V> entry = table[index];
            DataStorageNode<K, V> prev = null;
            while(entry.getBack() != null && !entry.getKey().equals(key)){
                prev = entry;
                entry = entry.getBack();
            }
            if(entry.key.equals(key)){
                if(prev == null){
                    table[index] = entry.getBack();
                }else{
                    prev.getBack() = entry.getBack();
                }
                size--;
            }
        }
        if(getLoadFactor() < loadFactor / 4 && table.length > INITIAL_CAPACITY){
            resize();
        }
    }
}
