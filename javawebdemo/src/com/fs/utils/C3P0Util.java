package com.fs.utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/30 18:14
 */
public class C3P0Util {

    private static ComboPooledDataSource com = new ComboPooledDataSource();

    public static ComboPooledDataSource getCom(){
        return com;
    }
}
