import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class Histogram {
    private Map <Object,Integer> data = new HashMap<>();

    public int get(Object key) {
        return data.get(key);
    }
    public Set keySet(){
        return data.keySet();
    }
    public void Increment(Object key){
        data.put(key, data.containsKey(key)?data.get(key)+1:1);
    }

}
