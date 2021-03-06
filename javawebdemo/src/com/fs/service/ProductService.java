package com.fs.service;

import com.fs.common.ResponseCode;

import java.net.ResponseCache;

/**
 * @author zangye03@gmail.com
 * @date 2020/1/14 18:16
 */
public interface ProductService {
    ResponseCode getAllProduct();

    ResponseCode toType(String id);

    ResponseCode fuzzySearch(String key);

    ResponseCode addOne(String pname, String pnum, String price);

    ResponseCode delOne(String pname, String pnum, String price);
}
