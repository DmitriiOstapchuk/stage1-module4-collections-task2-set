package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < sourceList.size(); i++) {
            int x = sourceList.get(i);
            if (x % 2 == 1) {
                set.add(x);
                set.add(2 * x);
            } else {
                set.add(x);
                do {
                    x /= 2;
                    set.add(x);
                } while (x % 2 == 0);
            }
        }
        return set;
    }
}
