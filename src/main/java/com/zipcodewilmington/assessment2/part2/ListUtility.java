package com.zipcodewilmington.assessment2.part2;
import java.lang.Boolean;

import java.util.ArrayList;
import java.util.List;

public class ListUtility {

   private List<Integer> list =new ArrayList<>();

    public Boolean add(Integer i) {

        return list.add(i);
    }

    public Integer size() {

        return list.size();
    }

    public List<Integer> getUnique() {

        List<Integer> unique = new ArrayList<>();
       for(Integer number : list) {
           if(!unique.contains(number)) {
               unique.add(number);
                   }
               }
       return unique;


    }

    public String join() {
        String result = "";

        for(int i = 0; i < list.size(); i++) {
            result += list.get(i);
            if (i < list.size() - 1) {
                result += ", ";
            }
        }

        return result;
    }

    public Integer mostCommon() {

        Integer common = list.get(0);
        int commonCount = countOccurrence(common);

        for(Integer currentNumber : list) {
            int currentCount = countOccurrence(currentNumber);
            if (currentCount > commonCount) {
                common = currentNumber;
                commonCount = currentCount;
            }
        }
        return common;
    }

    private int countOccurrence(Integer valueToCount) {
        int count = 0;

        for (Integer currentValue : list) {
            if (currentValue == valueToCount) {
                count++;
            }
        }

        return count;
    }
    public Boolean contains(Integer valueToAdd) {

        return list.contains(valueToAdd);

    }
}
