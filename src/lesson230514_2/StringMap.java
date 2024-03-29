package lesson230514_2;

import java.util.LinkedList;
import java.util.List;

//Ассоциативный массив
public class StringMap {

    static class Entry{
        String key;
        String value;

        public Entry(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    private static final int CAPACITY = 10;
    List<Entry>[] data;

    public StringMap() {
        data = new List[CAPACITY];
        for (int i = 0; i < data.length; i++) {
            data[i] = new LinkedList<>();
        }
    }

    public void put(String key, String value){
        char c = key.charAt(0);
        int index = c % CAPACITY;
        data[index].add(new Entry(key, value));

    }
    public String get(String key){
        char c = key.charAt(0);
        int index = c % CAPACITY;
        for (Entry entry : data[index]){
            if(entry.key.equals(key))
                return entry.value;
        }
        return null;
    }

    public static void main(String[] args) {
        StringMap map = new StringMap();

        map.put("Pete", "123-123-1233");
        map.put("John", "123-123-7891");
        map.put("Ann", "123-123-7366");

        System.out.println(map.get("Pete"));
        System.out.println(map.get("John"));
        System.out.println(map.get("Ann"));

        map.put("Paul", "123");
        System.out.println(map.get("Paul"));
        System.out.println(map.get("Pete"));


    }
}
