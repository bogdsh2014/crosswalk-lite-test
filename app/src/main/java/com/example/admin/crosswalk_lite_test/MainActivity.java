package com.example.admin.crosswalk_lite_test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;

import org.xwalk.core.XWalkActivity;
import org.xwalk.core.XWalkResourceClient;
import org.xwalk.core.XWalkUIClient;
import org.xwalk.core.XWalkView;

public class MainActivity extends XWalkActivity {
    XWalkView mXWalkView;

    @Override
    protected void onXWalkReady() {
        mXWalkView = new XWalkView(this);
        RelativeLayout l1 = (RelativeLayout) findViewById(R.id.layout1);
        l1.addView(mXWalkView);

        mXWalkView.setUIClient(new XWalkUIClient(mXWalkView));
        mXWalkView.setResourceClient(new XWalkResourceClient(mXWalkView));

        mXWalkView.load("http://192.168.1.153:3000/test", null);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
