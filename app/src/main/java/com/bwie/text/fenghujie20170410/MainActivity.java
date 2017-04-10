package com.bwie.text.fenghujie20170410;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

/**
 * 冯虎杰
 * A卷
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //获取自定义控件对象
        final CircleView rpb = (CircleView) findViewById(R.id.circleView_);

        Button button = (Button) findViewById(R.id.bt_);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                int r = random.nextInt(255);
                int g = random.nextInt(255);
                int b = random.nextInt(255);
                int argb = Color.argb(255, r, g, b);
                rpb.setColor(argb);
            }
        });

    }
}
