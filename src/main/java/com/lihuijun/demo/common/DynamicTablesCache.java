package com.lihuijun.demo.common;

import java.util.ArrayList;
import java.util.List;

/**
 * 存储当前系统动态创建的表
 */
public class DynamicTablesCache {
    public static class TableCache{
        public static List<String> TABLES = new ArrayList<>();
    }
}
