import java.util.*;

public class Bai925 {
    public static void main(String[] args) {
        String name = "xnhtq";
        System.out.println(name.length());
        System.out.println(name.charAt(4));
        String typed = "xhhttqq";

        System.out.println(isLongPressedName(name, typed));
    }

    //    public static Map<Character, Integer> buildMap(String s) {
//        Map<Character, Integer> map = new HashMap<>();
//
//        for (char ch : s.toCharArray()) {
//            map.put(ch, map.getOrDefault(ch, 0) + 1);
//        }
//        return map;
//    }
//
//    public static boolean isLongPressedName(String name, String typed) {
//        Map<Character, Integer> mapName = buildMap(name);
//        Map<Character, Integer> mapTyped = buildMap(typed);
//
//        for (char key : mapName.keySet()) {
//            if (mapTyped.containsKey(key) == false
//                    || mapName.get(key) > mapTyped.getOrDefault(key, 0)) {
//                return false;
//            }
//        }
//        return true;
//    }
    public static  boolean isLongPressedName(String name, String typed) {
        if(typed.length() < name.length()){
            return false;
        }

        int i = 0;
        int j = 0;
        while (j < typed.length() && i < name.length()) {
            if (  name.charAt(i) == typed.charAt(j)) {
                i++;
                j++;
            } else if (i > 0 && typed.charAt(j) == name.charAt(i - 1)) {
                j++;
            } else {
                return false;
            }
        }
        while(j < typed.length()){
            if(name.charAt(i-1) != typed.charAt(j)){
                return false;
            }
            j++;
        }
        if(i < name.length()) return false;
        return true;
    }

}
