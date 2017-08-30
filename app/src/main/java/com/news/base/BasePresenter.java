package com.news.base;

import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by lichen on 2017/8/29.
 */

public abstract class BasePresenter<V> {
    protected V mView;

    protected CompositeDisposable mCompositeDisposable = new CompositeDisposable();

    public void setView(V v) {
        this.mView = v;
        this.onAttached();
    }

    public abstract void onAttached();

    public void onDetached() {
        mCompositeDisposable.dispose();
    }

}
