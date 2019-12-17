package com.test.hash;


import com.test.util.Column;
import com.test.util.DrawLineChart;
import com.test.util.Row;
import com.test.util.Table;
import edu.princeton.cs.algs4.StdRandom;

public class TestMain1 {
    public static void main(String[] args) {
//        testMethod1();
        testMethod2();
    }
    // 设置散列值
    public static void testMethod1() {
//        Map<Integer,Integer> map = new HashMap<>();
        Column column = new Column(new String[]{"键","三列值"});
        Table table = new Table(column,new String[]{"%-6s","%6s\n"});
        int M = 97;
        for (int i = 0; i < 20; i++) {
            int num = StdRandom.uniform(10,500);
            int hashCode = num % M;
            Row row = new Row(2);
            row.addValue(num);
            row.addValue(hashCode);
            table.addRow(row);
        }
        table.printToConsole(new String[]{"%-6d","%6d\n"});

    }

    public static void testMethod2() {
        DrawLineChart drawLineChart = new DrawLineChart();
        for (int i = 0; i < 100; i++) {
            drawLineChart.addPoint(i,i);
        }
        drawLineChart.drawing();
    }
}
