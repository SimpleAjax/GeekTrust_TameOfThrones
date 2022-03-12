package utils;

import java.util.HashMap;
import java.util.Map;

public class Util {
    public static String characterAntiClockShift(String input, int count) {
        StringBuffer buffer = new StringBuffer();
        for(int i=0; i<input.length(); i++) {
            char c = input.charAt(i);
            c-=count;
            if(c<'A') c+=26;
            buffer.append(c);
        }
        return buffer.toString();
    }

    public static Map<Character, Integer> getCharCountMap(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<str.length(); i++) {
            char c = str.charAt(i);
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        return map;
    }
}
