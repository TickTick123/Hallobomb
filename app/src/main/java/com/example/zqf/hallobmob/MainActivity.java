package com.example.zqf.hallobmob;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import cn.bmob.v3.Bmob;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.SaveListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bmob.initialize(this,"952c699bad14188ea5ef2af20da327b6");
        Person p2 = new Person();
        p2.setName("lucky");
        p2.setAddress("北京海淀");
        Log.e("abc","Bomb太厉害了！");
        p2.save(new SaveListener<String>() {
            @Override
            public void done(String objectId,BmobException e) {
                if(e==null){
                    Toast.makeText(MainActivity.this,"添加数据成功，返回objectId为：" + objectId,Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(MainActivity.this,"创建数据失败：" + e.getMessage(),Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
