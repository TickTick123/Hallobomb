package com.example.zqf.hallobmob;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.zqf.hallobmob.bean.Order;
import com.example.zqf.hallobmob.other.Ck;
import com.example.zqf.hallobmob.other.JH;
import com.example.zqf.hallobmob.other.ZQF;
import com.example.zqf.hallobmob.other.tgy_main;

import cn.bmob.v3.Bmob;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.SaveListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bmob.initialize(this,"14ad818ac5ca96d7f6166b841450afee");     //初始化只需要一次
        Order p2 = new Order();
        //p2.setSum(225);
        p2.setAddress("北京海淀");
        Log.e("abc","Bomb太厉害了！");
        p2.save(new SaveListener<String>() {
            @Override
            public void done(String objectId,BmobException e) {
                if(e==null){
                    Toast.makeText(MainActivity.this,"添加数据成功，返回objectId为：" + objectId,Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(MainActivity.this,"创建数据失败：" + e.getMessage(),Toast.LENGTH_LONG).show();      //hahaha
                }
            }
        });

        Button button1=findViewById(R.id.button);               //江浩的按钮
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,JH.class);
                startActivity(intent);
            }
        });

        Button button2=findViewById(R.id.button2);              //张启帆的按钮
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,ZQF.class);
                startActivity(intent);
            }
        });

        Button button3 =findViewById(R.id.button3);              //ck的按钮
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Ck.class);
                startActivity(intent);
            }
        });
        Button button4=findViewById(R.id.button4);//田桂源按钮
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,tgy_main.class);
                startActivity(intent);
            }
        });



    }
}
