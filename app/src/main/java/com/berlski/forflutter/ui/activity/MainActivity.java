package com.berlski.forflutter.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.berlski.forflutter.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView mTextMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextMessage = (TextView) findViewById(R.id.message);
        Button mStartFlutter = (Button) findViewById(R.id.start_flutter);
        Button mStartNewFlutter = (Button) findViewById(R.id.start_new_flutter);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);

        mStartFlutter.setOnClickListener(this);
        mStartNewFlutter.setOnClickListener(this);

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.title_home);
                    return true;

                case R.id.navigation_dashboard:
                    mTextMessage.setText(R.string.title_dashboard);
                    return true;

                case R.id.navigation_notifications:
                    mTextMessage.setText(R.string.title_notifications);
                    return true;
            }
            return false;
        }
    };

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.start_flutter:
                startActivity(new Intent(this, FlutterDemoActivity.class));
                break;

            case R.id.start_new_flutter:
                startActivity(new Intent(this, FlutterDemoActivity.class));
                break;

        }
    }
}
