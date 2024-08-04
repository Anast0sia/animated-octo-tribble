package org.example;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    public Map<String, Long> map = new HashMap<>();
    public int count = 0;

    public int add(String name, long number) {
        if (!map.containsKey(name)) {
            map.put(name, number);
            count++;
        }
        return count;
    }
}