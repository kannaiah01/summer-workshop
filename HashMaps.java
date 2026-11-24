import java.net.SocketPermission;
import java.util.*;
public class HashMaps{
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Shyam", 90);
        map.put("kannaiah", 80);
        map.put("dinesh", 70);
        System.out.println(map);

        System.out.println(map.get("Shyam"));
        System.out.println(map.get("kannaiah"));
        System.out.println(map.get("dinesh"));
        System.out.println(map.containsValue(90));
        System.out.println(map.containsKey("kannaiah"));
        System.out.println(map.size());       
        System.out.println(key);
        for (String key : map.keySet()) {  
         System.out.println(key + ": " + map.get(key));
        }
    }
    
}