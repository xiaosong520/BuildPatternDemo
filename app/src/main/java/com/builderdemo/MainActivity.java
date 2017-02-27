package com.builderdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView tv_content;
    private Button btn_show;
    private Button btn_getInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViewData();
    }


    private void initViewData() {
        tv_content = (TextView) findViewById(R.id.tv_content);
        btn_show = (Button) findViewById(R.id.btn_show);
        btn_getInfo = (Button) findViewById(R.id.btn_getInfo);
        btn_show.setOnClickListener(this);
        btn_getInfo.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_show:
                showText();
                break;
            case R.id.btn_getInfo:
                GetUserInfo();
                break;
        }
    }

    private void GetUserInfo() {
       /* UserInfoBuilder builder = new UserInfoBuilder("小嵩");
          UserInfo info = builder.setAge(23)
                .setSex("男")
                .setHeight(174)
                .setWeight(62.5)
                .create();//将数据传递给UserInfo 实体类*/

        UserInfo info = UserInfoBuilder
                            .getInstance("小芳")
                            .setAge(20)
                            .setSex("女")
                            .setHeight(167)
                            .setWeight(52)
                            .into(tv_content)//显示到TextView中*/
                            .create();

        Toast.makeText(this, info.toString(),Toast.LENGTH_SHORT).show();

    }

    private void showText() {

        UserInfoBuilder.getInstance("小嵩")
                .setAge(23)
                .setSex("男")
                .setHeight(174)
                .setWeight(62.5)
                .into(tv_content);//显示到TextView中
    }


}
