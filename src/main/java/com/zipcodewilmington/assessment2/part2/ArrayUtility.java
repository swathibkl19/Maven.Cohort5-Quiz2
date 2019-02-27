package com.zipcodewilmington.assessment2.part2;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {

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
          }





    public Integer[] rotate(Integer[] array, Integer index) {

//        Integer[] newArray = new Integer[(array.length)];
//                     int count = 0 ,i;
//
//                      for ( i = 0; i < (Integer) array.length; i++) {
//                          if(array[i] == index)
//                              newArray[count] = (Integer) array[index];
//                              count++;
//                          else
//                              newArray[count] = (Integer) array[i];
//
//                          count++;
//                      }
//                      return newArray;

return  null;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {

        Integer[] newArray = new Integer[(array1.length) + (array2.length)];
        int value = 0, i, j;
        int count = 0;

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


    }
}
