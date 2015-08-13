package com.example.hewei.flowlayout;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.hewei.flowlayout.Widget.FlowLayout;

import java.util.ArrayList;
import java.util.Random;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FlowLayout flowLayout = (FlowLayout) findViewById(R.id.flow_layout);

        ArrayList<String> labelStrs = new ArrayList<>();
        for(int i = 0 ; i < 10; i++) {
            labelStrs.add("god ");
            labelStrs.add("god god god");
            labelStrs.add("god god god god god god god ");
            labelStrs.add("god god god god god god ");
            labelStrs.add("god god ");
            labelStrs.add("god ");
            labelStrs.add("god god god god god god god god god ");

        }

        // 添加流式标签
        ViewGroup.MarginLayoutParams params = new ViewGroup.MarginLayoutParams(-2, -2);
        params.bottomMargin = getResources().getDimensionPixelSize(R.dimen.bottom_margin);
        params.rightMargin = getResources().getDimensionPixelSize(R.dimen.right_margin);
        int paddingSize = getResources().getDimensionPixelSize(R.dimen.padding_size);
        TextView label = null;
        flowLayout.removeAllViews();
        for (int i = 0; i < labelStrs.size(); i++) {
            label = new TextView(this);
            label.setLayoutParams(params);
            label.setBackgroundColor(Color.parseColor("#ff0000"));
            label.setText(labelStrs.get(i));
            label.setPadding(paddingSize, 0, paddingSize, 0);
            label.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 13);
            label.setTextColor(Color.parseColor("#6ED5D7"));
            label.setGravity(Gravity.CENTER);
            flowLayout.addView(label);
        }
    }


}
