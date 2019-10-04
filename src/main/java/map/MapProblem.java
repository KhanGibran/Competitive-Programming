package map;

import java.util.HashMap;
import java.util.Map;

public class MapProblem
{
    /**
     * Insert - O(1)
     * Delete - O(1)
     * Update - O(1)
     * Select - O(1)
     */
    public static void main(String[] args) {
        Map<String,MyObject> map = new HashMap<>();
        map.put("XYZ",new MyObject(1,2,"Terry"));
        map.put("ABC",null);
        System.out.println(map.get("XYZ"));
        System.out.println(map.get("ABC"));
        map.remove("ABC");
        System.out.println(map.containsKey("ABC"));
        System.out.println(map.containsKey("XYZ"));




        map.put("Hello",new MyObject(1,2,"Jammy"));
        map.put("Hello",null);
        System.out.println(map.get("Hello"));

    }
}

