package com.topzrt.gl.model;

import com.topzrt.gl.bean.Girl;

import java.util.List;

/**
 * Created by Vincent;
 * Created on 2017/9/30;
 * DSC:
 */

public class IGirlImpl implements IGril {


    @Override
    public void showGirl(List<Girl> list, OnShowGilrListener onShowGilrListener) {
        onShowGilrListener.onComplete(list);
    }


}
