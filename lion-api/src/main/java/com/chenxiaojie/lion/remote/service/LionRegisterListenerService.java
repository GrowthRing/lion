package com.chenxiaojie.lion.remote.service;

/**
 * Created by xiaojie.chen on 2015-03-22 10:04:44.
 */
public interface LionRegisterListenerService {

    public boolean registerListener(String projectName, String listenerURL, int env);

}