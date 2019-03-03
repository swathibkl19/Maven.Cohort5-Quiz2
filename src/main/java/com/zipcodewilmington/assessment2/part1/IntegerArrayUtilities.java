package com.zipcodewilmington.assessment2.part1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class IntegerArrayUtilities {


    public Boolean hasEvenLength(Integer[] array) {


        return (array.length % 2 == 0);
    }

    public Integer[] range(int start, int stop) {

        List<Integer> list = new ArrayList<Integer>();

        for (int i = start; i <= stop; i++) {

            list.add(i);

        }
       // System.out.println(list);
        Integer[] arr =new Integer[list.size()];

        return list.toArray(arr);
    }


    public Integer getSumOfFirstTwo(Integer[] array) {

        return array[0] + array[1];
    }

    public Integer getProductOfFirstTwo(Integer[] array) {

        return array[0] * array [1];
    }
}
