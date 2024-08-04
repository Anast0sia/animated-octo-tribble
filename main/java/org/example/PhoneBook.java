package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class PhoneBook {
    public Map<String, Long> map = new TreeMap<>();
    public int count = 0;

    public int add(String name, long number) {
        if (!map.containsKey(name)) {
            map.put(name, number);
            count++;
        }
        return count;
    }

    public String findByNumber(long number) {
        for (Map.Entry<String, Long> entry : map.entrySet()) {
            if (map.containsValue(number)) {
                return entry.getKey();
            }
        }
        return null;
    }

    public long findByName(String name) {
        if (map.containsKey(name)) {
            return map.get(name);
        }
        return 0;
    }

    public List<String> printAllNames() {
        List<String> list = new ArrayList<>();
        for (Map.Entry<String, Long> entry : map.entrySet()) {
            list.add(entry.getKey());
        }
        System.out.println(list);
        return list;
    }
}