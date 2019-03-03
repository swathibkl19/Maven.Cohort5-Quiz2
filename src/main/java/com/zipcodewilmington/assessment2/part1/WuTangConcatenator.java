package com.zipcodewilmington.assessment2.part1;

public class WuTangConcatenator {

    private Integer input;

    public WuTangConcatenator(Integer input) {

        this.input =input;
    }

        public Boolean isWu () {


           // WuTangConcatenator a = WuTangConcatenator.this;

           // boolean bool = (a * 3);

           // Boolean  b;
            //b = a * 3;



            return (input%3 == 0);

        }

        public Boolean isTang () {
      //boolean a= WuTangConcatenator.this;

       //return a * 5;
            return (input%5 == 0);
        }

        public Boolean isWuTang () {

            return isWu() && isTang();
        }
    }
