package lesson230514_2;

import java.util.HashMap;
import java.util.Iterator;

public class test {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("1", "23");
        hashMap.put("2", "233");
        hashMap.put("3", "234");
        hashMap.put("4", "235");

        Iterator<String> iterator = hashMap.keySet().iterator();



    }
}
