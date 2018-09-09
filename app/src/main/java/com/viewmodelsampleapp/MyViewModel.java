package com.viewmodelsampleapp;
import android.arch.lifecycle.ViewModel;
/**
 * Created by laxmikant on 08/09/18.
 */

public class MyViewModel extends ViewModel {
    private int count;

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }
}
