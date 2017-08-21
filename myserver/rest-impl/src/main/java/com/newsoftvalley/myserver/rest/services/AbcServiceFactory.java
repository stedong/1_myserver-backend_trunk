package com.newsoftvalley.myserver.rest.services;

import com.newsoftvalley.myserver.rest.db.AbcDao;
import com.newsoftvalley.myserver.rest.db.fake.AbcDaoImpl;

/**
 * Created by hanyuandong on 2017/8/19.
 */
public class AbcServiceFactory {
    private static AbcService _abcDef;
    private static Object _lock = new Object();

    private AbcServiceFactory() {}

    public static AbcService createInstance() {
        if (_abcDef == null) {
            synchronized (_lock) {
                if (_abcDef == null) {
                    _abcDef = new AbcService(new AbcDaoImpl() {
                    });
                }
            }
        }
        return _abcDef;
    }
}
