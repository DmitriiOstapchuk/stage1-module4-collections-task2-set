package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
    Set<String> result = new HashSet<>();
    Iterator<String> first = firstSet.iterator();
    while (first.hasNext()) {
        String item = first.next();
        if (secondSet.contains(item) && !thirdSet.contains(item)) {
            result.add(item);
        }
    }
    Iterator<String> third = thirdSet.iterator();
    while (third.hasNext()) {
        String item = third.next();
        if (!firstSet.contains(item) && !secondSet.contains(item)) {
            result.add(item);
        }
    }
    return result;
    }
}
