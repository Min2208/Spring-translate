package model;

import java.util.HashMap;
import java.util.Map;

public class Translate {
    private static Map<String,String> translate= new HashMap<>();
    static {
        translate.put("dog","Con cho");
        translate.put("cat","Con meo");
        translate.put("dragon","Con rong");
        translate.put("chicken","Con ga");

    }

    public String getValue(String key){
        return translate.get(key);
    }
}
