package com.newsoftvalley.myserver.listeners;

import com.newsoftvalley.myserver.rest.services.AbcServiceFactory;
import com.newsoftvalley.myserver.rest.services.XyzServiceFactory;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;


/**
 * Created by hanyuandong on 2017/8/19.
 */
public class MyServletContextListener implements ServletContextListener {


    @Override
    public void contextInitialized(ServletContextEvent sce) {
        AbcServiceFactory.createInstance();
        XyzServiceFactory.createInstance();}
    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}

