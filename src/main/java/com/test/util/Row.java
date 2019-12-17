package com.test.util;

public class Row implements PrintToConsole{
    private Object[] strings;
    private int curentIndex = 0;

    public Row(int size) {
        strings = new Object[size];
    }

    public void addValue(Object value){
      strings[curentIndex] = value;
      curentIndex ++;
    }

    @Override
    public void printToConsole(String[] formats) {
        for (int i = 0; i < strings.length; i++) {
            Table.formatter.format(formats[i],strings[i]);
        }
    }
}
