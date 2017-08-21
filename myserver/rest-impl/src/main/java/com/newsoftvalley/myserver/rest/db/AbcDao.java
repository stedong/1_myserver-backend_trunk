package com.newsoftvalley.myserver.rest.db;

import nam.e.spa.ce.Abc;

public interface AbcDao {
    Abc get(String longUrl);
    void insert(Abc abc);
    void delete(String key);
    void update(String key, Abc abc);
}
