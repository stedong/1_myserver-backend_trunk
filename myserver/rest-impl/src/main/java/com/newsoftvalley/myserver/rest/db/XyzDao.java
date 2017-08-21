package com.newsoftvalley.myserver.rest.db;

import nam.e.spa.ce.Xyz;
import nam.e.spa.ce.XyzKey;

/**
 * Created by hanyuandong on 2017/8/19.
 */
public interface XyzDao {
    Xyz get(XyzKey key);
    void insert(Xyz xyz);
    void update(XyzKey key, Xyz xyz);
    void delete(XyzKey key);
}

