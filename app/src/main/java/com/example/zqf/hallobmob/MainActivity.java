package com.example.zqf.hallobmob;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.example.zqf.hallobmob.bean.Order;

import java.util.ArrayList;
import java.util.List;

import cn.bmob.v3.Bmob;
import cn.bmob.v3.BmobQuery;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.FindListener;
import static android.graphics.Color.WHITE;


public class MainActivity extends AppCompatActivity {

    ListView listView;
    Button but;
    List<Order> orderlist=new ArrayList<>();
    int x;
    OrderAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bmob.initialize(this,"14ad818ac5ca96d7f6166b841450afee");     //初始化只需要一次

        listView=findViewById(R.id.listView2);
        but=findViewById(R.id.button4);
        but.setTextColor(WHITE);

        BmobQuery<Order> bmobQuery = new BmobQuery<>();
        bmobQuery.findObjects(new FindListener<Order>() {
            @Override
            public void done(List<Order> object, BmobException e) {
                if(e==null){
                    orderlist=object;
                    adapter=new OrderAdapter(MainActivity.this,R.layout.item_order,orderlist);
                    listView.setAdapter(adapter);
                } else{
                    //toast("失败："+e.getMessage());
                }
            }
        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                x=i;
                Intent intent=new Intent(MainActivity.this,OrderActivity.class);
                intent.putExtra("obj",orderlist.get(i).getObjectId());
                intent.putExtra("order",orderlist.get(i));
                startActivityForResult(intent,10);
            }
        });

        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BmobQuery<Order> bmobQuery = new BmobQuery<>();
                bmobQuery.findObjects(new FindListener<Order>() {
                    @Override
                    public void done(List<Order> object, BmobException e) {
                        if(e==null){
                            orderlist=object;
                            adapter=new OrderAdapter(MainActivity.this,R.layout.item_order,orderlist);
                            listView.setAdapter(adapter);
                        } else{
                            //toast("失败："+e.getMessage());
                        }
                    }
                });
            }
        });
    }

    public void toast(String toast) {           //Toast便捷使用方法
        Toast.makeText(getApplicationContext(), toast, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case 10:
                if(resultCode==RESULT_OK) {
                    //fragment更新

                }
                break;
            default:
                break;
        }
    }
}
