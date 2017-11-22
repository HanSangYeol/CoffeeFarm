package com.coffee_farm.www.coffeefarm;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by the on 2017-11-22.
 */

public abstract class BaseActivity extends AppCompatActivity {

    Context mContext = this;

    public abstract void setValues();
    public abstract void setupEvents();
    public abstract void bindView();
}
