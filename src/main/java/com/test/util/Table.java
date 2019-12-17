package com.test.util;

import java.util.ArrayList;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;

public class Table implements PrintToConsole{
    public static Formatter formatter = new Formatter(System.out);
    private final Column title;
    private final String[] titleFormats;
    private final List<Row> rowList = new ArrayList<>();

    public Table(Column title,String[] titleFormats) {
        this.title = title;
        this.titleFormats = titleFormats;
    }
    public void addRow(Row row){
        rowList.add(row);
    }

    @Override
    public void printToConsole(String[] formats) {
        // 打印表头
        title.printToConsole(titleFormats);
        // 打印表数据
        Iterator<Row> iterator = rowList.iterator();
        while (iterator.hasNext()){
            Row row = iterator.next();
            row.printToConsole(formats);
        }
    }
}
