package com.jianglei.asmstudy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.jianglei.testlibrary.TestUtils;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TestUtils.test();
        int i = 1;
    }
}
