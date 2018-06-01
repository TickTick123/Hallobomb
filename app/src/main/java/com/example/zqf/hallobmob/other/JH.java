package com.example.zqf.hallobmob.other;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.zqf.hallobmob.R;

import cn.bmob.v3.BmobQuery;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.QueryListener;
import cn.bmob.v3.listener.SaveListener;
import cn.bmob.v3.listener.UpdateListener;

/**
 * Created by admin on 2018/1/31.
 */

public class JH extends AppCompatActivity {
    Person x=new Person();
    Person y=new Person();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jh_main);
        Button button_add=findViewById(R.id.button4);
        Button button_del=findViewById(R.id.button5);
        Button button_ser=findViewById(R.id.button6);
        final TextView text=findViewById(R.id.textView2);
        button_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                x.setAddress("湖南株洲");
                x.setName("江浩");
                x.save(new SaveListener<String>() {
                    @Override
                    public void done(String s, BmobException e) {
                        if(e==null){
                            Toast.makeText(JH.this,"添加数据成功，返回数据为：" + s,Toast.LENGTH_LONG).show();
                            y.setObjectId(s);
                        }else{
                            Toast.makeText(JH.this,"创建数据失败：" + e.getMessage(),Toast.LENGTH_LONG).show();
                        }
                    }
                });
            }
        });
        button_del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                y.delete(new UpdateListener() {
                    @Override
                    public void done(BmobException e) {
                        if(e==null){
                            Toast.makeText(JH.this,"删除数据成功，地址为："+x.getAddress(),Toast.LENGTH_LONG).show();
                            text.setText(x.getAddress());
                        }else{
                            Toast.makeText(JH.this,"删除数据失败：" + e.getMessage(),Toast.LENGTH_LONG).show();
                        }
                    }
                });
            }
        });
        button_ser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BmobQuery<Person> query=new BmobQuery<>();
                query.getObject(y.getObjectId(), new QueryListener<Person>() {
                    @Override
                    public void done(Person person, BmobException e) {
                        if(e==null){
                            Toast.makeText(JH.this,"查询成功"+person.toString(),Toast.LENGTH_LONG).show();
                            text.setText(person.toString());
                        }else{
                            Toast.makeText(JH.this,"查询数据失败：" + e.getMessage(),Toast.LENGTH_LONG).show();
                        }
                    }
                });
            }
        });
    }
}