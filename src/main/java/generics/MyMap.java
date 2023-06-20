package generics;

import java.util.HashMap;
import java.util.Map;

public class MyMap {
    private Map<String, Object> map = new HashMap<>();

    public void addToMap(String key, Object value){
        map.put(key,value);
    }

    public Object get(String key){
        return map.get(key);
    }

    public <T> T getGeneric(String key){
        return (T)map.get(key);
    }
}
