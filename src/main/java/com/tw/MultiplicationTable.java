package com.tw;

import java.util.ArrayList;

public class MultiplicationTable {
    public String create(int start, int end) {
        if(isValid(start, end)){
            return generateTable(start, end);
        }
        return null;
    }

    public Boolean isValid(int start, int end) {
        return isInRange(start) && isInRange(end) && isStartNotBiggerThanEnd(start, end);
    }

    public Boolean isInRange(int number) {
        return number >= 1 && number <= 1000;
    }

    public Boolean isStartNotBiggerThanEnd(int start, int end) {
        return start <= end;
    }

    public String generateTable(int start, int end) {
        ArrayList<String> lineList = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            lineList.add(generateLine(start,i));
        }
        return String.join(System.lineSeparator(), lineList);
    }

    public String generateLine(int start, int row) {
        ArrayList<String> itemList = new ArrayList<>();
        for (int i = start; i <= row; i++) {
            itemList.add(generateSingleExpression(i, row));
        }
        return String.join("  ", itemList);
    }

    public String generateSingleExpression(int multiplicand, int multiplier) {
        return multiplicand + "*" + multiplier + "=" + multiplicand * multiplier;
    }
}
