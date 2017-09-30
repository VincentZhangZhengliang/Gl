package com.topzrt.gl.model;

import com.topzrt.gl.bean.Girl;

import java.util.List;

/**
 * Created by Vincent;
 * Created on 2017/9/30;
 * DSC:
 */

public interface IGril {

    void showGirl(List<Girl> list,OnShowGilrListener onShowGilrListener);

}
