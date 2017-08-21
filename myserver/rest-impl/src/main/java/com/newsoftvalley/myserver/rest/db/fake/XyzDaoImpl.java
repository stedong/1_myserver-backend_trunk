package com.newsoftvalley.myserver.rest.db.fake;

import com.newsoftvalley.myserver.rest.db.XyzDao;
import nam.e.spa.ce.Xyz;
import nam.e.spa.ce.XyzKey;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hanyuandong on 2017/8/19.
 */
public class XyzDaoImpl implements XyzDao {

        private Map<String, Xyz> _dataBase;

        public XyzDaoImpl() {
            _dataBase = new HashMap<>();
        }
        @Override
        public Xyz get(XyzKey key) { return _dataBase.get(key.getNumA() + "_" + key.getNumB());}

        @Override
        public void insert(Xyz xyz) {
                String stringKey = xyz.getNumA() + "_" +xyz.getNumB();
                _dataBase.put(stringKey,xyz);
        }

        @Override
        public void update(XyzKey key, Xyz xyz) {

        }

        @Override
        public void delete(XyzKey key) {
                String stringKey = key.getNumA() + "_" + key.getNumB();
                _dataBase.remove(stringKey);
        }
}

