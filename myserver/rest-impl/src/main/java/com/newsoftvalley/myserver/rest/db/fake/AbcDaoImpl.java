package com.newsoftvalley.myserver.rest.db.fake;

import com.newsoftvalley.myserver.rest.db.AbcDao;
import nam.e.spa.ce.Abc;

import java.util.HashMap;
import java.util.Map;

public class AbcDaoImpl implements AbcDao {

    private Map<String, Abc> _dataBase;

    public AbcDaoImpl() {
        _dataBase = new HashMap<>();
    }
    @Override
    public Abc get(String longUrl) {
        return _dataBase.get(longUrl);
    }
    @Override
    public void insert(Abc abc) {
        _dataBase.put(abc.getLongUrl(),abc);
    }
    @Override
    public void delete(String key) {
        _dataBase.remove(key);
    }
    public void update(String key, Abc abc) {
        _dataBase.remove(key, abc);

    }
}
