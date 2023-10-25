package J_Collection;

import java.util.HashMap;
import java.util.Map;

public class J_Map {
    public static void main(String[] args) {
//        Map gives key value pair.
        Map<Integer, String> map = new HashMap<>();
        map.put(2, "2");
        map.put(3, "3");
        map.put(4, "4");
        map.replace(4, "11");
//        map.remove(2,"2");
        System.out.println(map.keySet());
    }
}
