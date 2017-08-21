package com.newsoftvalley.myserver.rest.services;

import com.newsoftvalley.myserver.rest.db.fake.XyzDaoImpl;

/**
 * Created by hanyuandong on 2017/8/19.
 */
public class XyzServiceFactory {
    private static XyzService _xyzDef;
    private static Object _lock = new Object();

    private XyzServiceFactory(){}
    public static XyzService createInstance() {
        if(_xyzDef == null) {
            synchronized (_lock) {
                if (_xyzDef == null) {
                    _xyzDef = new XyzService(new XyzDaoImpl() {
                    });
                }
            }
        }
        return _xyzDef;
    }
}
