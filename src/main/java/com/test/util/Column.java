package com.test.util;

public class Column implements PrintToConsole {
    private String[] columnNames;

    public Column(String[] columnNames) {
        this.columnNames = columnNames;
    }
    @Override
    public void printToConsole(String[] formats) {
        for (int i = 0; i < columnNames.length; i++) {
            Table.formatter.format(formats[i],columnNames[i]);
        }
    }
}
