package CodeChallages.MyHashTable;

public interface MyHashTable <K,V>{
    V get(K key);
    void put(K key, V value);
    boolean containsKey(K key);
    int size();
}