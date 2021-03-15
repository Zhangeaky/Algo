package map;

import java.security.SecureRandom;
import java.util.HashMap;
class zyk{

    zyk(int value){

        this.value = value;

    }

    private int value;
}
public class hashmap {





    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        map.put("nihao",2);
        map.put("zhangeaky",2);
        System.out.println(map.get("nihao")==map.get("zhangeaky"));

        HashMap<String ,zyk> zyk = new HashMap<>();
        zyk t1 = new zyk(1);
        zyk t2 = new zyk(1);
        zyk.put("piao",t1);
        zyk.put("bupiao",t2);
        System.out.println( zyk.get("piao").equals(zyk.get("bupiao")));

        HashMap<String, String> newmap = new HashMap<>();

        newmap.put("zhangeaky","nihao");
        newmap.put("cui","nihao");
        System.out.println( newmap.get("cui").equals(newmap.get("zhangeaky")));




    }



}
