package com.zipcodewilmington.assessment2.part1;

public class BasicUtilities {
    public Boolean isGreaterThan5(Integer value) {

        return value >= 5;
    }

    public Boolean isLessThan7(Integer value) {

        return value <= 7;
    }

    public Boolean isBetween5And7(Integer valueToEvaluate) {

        return (valueToEvaluate >= 5 && valueToEvaluate <= 7);
    }

    public Boolean startsWith(String string, Character character) {

        character = Character.toUpperCase(character);
        return (string.charAt(0) == character);
    }
}
