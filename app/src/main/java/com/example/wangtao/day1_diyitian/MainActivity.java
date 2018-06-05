package com.example.wangtao.day1_diyitian;

import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //加载初始界面  你好Asadadsadadadda
        Initview();
    }
     //加载初始界面电风扇第三方大师但是
    private void Initview() {

        IntentFilter intentFilter =new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
    }
}
