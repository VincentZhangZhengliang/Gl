package com.topzrt.gl.presenter;

import com.topzrt.gl.view.IGirlView;

import java.lang.ref.WeakReference;

/**
 * Created by Vincent;
 * Created on 2017/9/30;
 * DSC:
 */

public class GirlPresenter {

    IGirlView mIGirlView;

    protected WeakReference<IGirlView> mReference;


    public void attachView(IGirlView iGirlView) {
        mReference = new WeakReference<IGirlView>(iGirlView);
    }

    public void detachView() {
        mReference.clear();
    }

    public void fetch() {

    }


}
