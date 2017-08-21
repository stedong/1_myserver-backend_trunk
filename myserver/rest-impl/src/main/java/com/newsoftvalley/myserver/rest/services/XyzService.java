package com.newsoftvalley.myserver.rest.services;

import com.linkedin.restli.common.HttpStatus;
import com.linkedin.restli.server.CreateResponse;
import com.linkedin.restli.server.UpdateResponse;
import com.newsoftvalley.myserver.rest.db.XyzDao;
import nam.e.spa.ce.Abc;
import nam.e.spa.ce.Xyz;
import nam.e.spa.ce.XyzKey;

/**
 * Created by hanyuandong on 2017/8/19.
 */
public class XyzService {
    private XyzDao _xyzDao;
    public XyzService(XyzDao xyzDao){
        _xyzDao = xyzDao;
    }
    public Xyz get(XyzKey complex) {
        Xyz xyz = _xyzDao.get(complex);
        if(complex == null) {
            xyz = calculateXyz(complex);
        }
        return xyz;
    }
    private Xyz calculateXyz(XyzKey complex) {
        Xyz xyz = new Xyz()
                .setNumA(complex.getNumA())
                .setNumB(complex.getNumB())
                .setSum(complex.getNumA() + complex.getNumB());
        return xyz;
    }
    public CreateResponse create(Xyz xyz) {
        _xyzDao.insert(xyz);
        return new CreateResponse(HttpStatus.S_201_CREATED);
    }
    public UpdateResponse update(XyzKey key, Xyz xyz) {
        _xyzDao.update(key, xyz);
        return new UpdateResponse(HttpStatus.S_207_MULTI_STATUS);
    }
    public UpdateResponse delete(XyzKey key) {
        _xyzDao.delete(key);
        return new UpdateResponse(HttpStatus.S_207_MULTI_STATUS);
    }
}
