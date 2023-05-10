package CodeChallages.MyHashTable;

import java.util.ArrayList;
import java.util.Arrays;

public class Map implements MyHashTable{

    private ArrayList<MapObj> mapa;
    public Map(){
        mapa =  new ArrayList<MapObj>();
    }
    @Override
    public Object get(Object key) {
        for (MapObj mapObj : mapa) {
            if (mapObj.getKey().equals(key))
                return mapObj.getValue();
        }
        return null;
    }

    @Override
    public void put(Object key, Object value) {
        MapObj add = new MapObj((String) key, (String) value);
        mapa.add(add);
    }

    @Override
    public boolean containsKey(Object key) {
        for (MapObj mapObj : mapa) {
            if (mapObj.getKey().equals(key))
                return true;
        }
        return false;

    }

    @Override
    public int size() {
        return mapa.size();
    }

    public void print(){
        for (MapObj mapObj : mapa) {
            System.out.println(mapObj.toString());
        }
    }
}
