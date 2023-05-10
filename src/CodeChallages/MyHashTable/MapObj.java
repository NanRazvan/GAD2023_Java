package CodeChallages.MyHashTable;

public class MapObj {
    private String key;
    private String value;

    public MapObj(String key, String value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "MapObj{" +
                "key='" + key + '\'' +
                ", value='" + value + '\'' +
                '}';
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
}
