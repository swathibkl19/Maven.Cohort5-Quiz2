package com.zipcodewilmington.assessment2.part2;

import java.util.Arrays;

public class ArrayUtility {

    public Integer[] merge(Integer[] array1, Integer[] array2, int length) {

        Integer[] newArray = new Integer[(array1.length) + (array2.length)];
        int count = 0;

        for (int i = 0; i < (Integer) array1.length; i++) {
            newArray[count] = (Integer) array1[i];
            count++;
        }

        for (int j = 0; j < (Integer) array2.length; j++) {
            newArray[count] = (Integer) array2[j];
            count++;
        }

        return newArray;
        /**
         * public Integer[] merge(Integer[] array1, Integer[] array2) {
         *         int newLength = array1.length + array2.length;
         *
         *         Integer[] numbers = Arrays.copyOf(array1, newLength);
         *
         *
         *         int n = array1.length;
         *
         *         for(int i = 0; i < array2.length; i++) {
         *             numbers[n] = array2[i];
         *             n++;
         *         }
         *
         *         //a shorter way to copy array
         *         //        System.arraycopy(array2, 0, numbers, array1.length, array2.length);
         *
         *         return numbers;
         */
    }


    public Integer[] rotate(Integer[] array, Integer index) {

        Integer[] rotated = new Integer[array.length];
            int rotatedIndex = 0;

            //copy from the index to the end of the array
            for(int i = index; i < array.length; i++) {
                rotated[rotatedIndex] = array[i];
                rotatedIndex++;
            }

            //copy the beginning up to the index
            for (int i = 0; i < index; i++) {
                rotated[rotatedIndex] = array[i];
                rotatedIndex++;
            }

            return rotated;
    }


    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {

     Integer[] newArray = new Integer[(array1.length) + (array2.length)];
     int value = 0, i, j;
     int count = 0;
        /**
         * int count = count(array1, valueToEvaluate) + count(array2, valueToEvaluate);
         *
         *
         *         return count;
         *     }
         *
         *     public int count(Integer[] array, Integer valueToCount) {
         *         int count = 0;
         *         for(int i = 0; i < array.length; i++) {
         *             if (valueToCount.equals(array[i])) {
         *                 count++;
         *             }
         *         }
         *         return count;
         */

    // merge(array1,array2){

     for (i = 0; i < (Integer) array1.length; i++) {
         newArray[value] = (Integer) array1[i];
         value++;
     }

     for (j = 0; j < (Integer) array2.length; j++) {
         newArray[value] = (Integer) array2[j];
         value++;
     }

     for (int k = 0; k < newArray.length; k++) {
         if (newArray[k].equals(valueToEvaluate)) {
             count++;
            }

        }
        return count;
        /**merge(array1,array2,array1.length)
        return  long count = someString.chars().filter(ch -> ch == 'e').count();
**/
    }

    public Integer mostCommon(Integer[] array) {

        int count = 1, tempCount;

        int popular = (int) array[0];
        //int temp = 0;
        for (int i = 0; i < (array.length - 1); i++) {
            int temp = (int) array[i];
            tempCount = 0;
            for (int j = 1; j < array.length; j++) {
                if (temp == (int) array[j]) {
                    tempCount++;
                }
                if (tempCount > count) {
                    popular = temp;
                    count = tempCount;
                }
            }
        }

        return popular;
        /**
         * Integer common = array[0];
         *         int commonCount = count(array, common);
         *
         *         for(int i = 0; i < array.length; i++) {
         *             Integer currentNumber = array[i];
         *             int currentCount = count(array, currentNumber);
         *
         *             if (currentCount > commonCount) {
         *                 common = currentNumber;
         *                 commonCount = currentCount;
         *             }
         *         }
         *
         *         return common;
         */
    }
}
