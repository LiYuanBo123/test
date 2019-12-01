package com.example.ouc_market;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private TextView tobBar;
    private TextView tabDeal;
    private TextView tabMy;
    private TextView tabUp;

    private FrameLayout ly_content;
    private First_Fragment f1,f2;
    private FragmentManager fragmentManager;

    private My_Fragment my_fragment;
    private View myLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null){
            actionBar.hide();
        }
        bindView();
    }
    //UI组件初始化与活动绑定
    private void bindView(){
        tobBar =(TextView)this.findViewById(R.id.txt_top);
        tabDeal =(TextView)this.findViewById(R.id.txt_deal);
        tabMy = (TextView)this.findViewById(R.id.txt_my);
        tabUp = (TextView)this.findViewById(R.id.txt_up);
        ly_content = (FrameLayout)findViewById(R.id.fragment_container);

        tabDeal.setOnClickListener(this);
        tabMy.setOnClickListener(this);
        tabUp.setOnClickListener(this);
    }

    //重置多有文本的选中状态
    public void selected(){
        tabDeal.setSelected(false);
        tabUp.setSelected(false);
        tabMy.setSelected(false);
    }

    //隐藏所有Fragment
    public void hindAllFragment(FragmentTransaction transaction){
        if (f1 != null){
            transaction.hide(f1);
        }
        if(f2 != null){
            transaction.hide(f2);
        }
        if (my_fragment != null){
            transaction.hide(my_fragment);
        }
    }
    @Override
    public void onClick(View view) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        hindAllFragment(transaction);
        switch (view.getId()){
            case R.id.txt_deal:
                selected();
                tabDeal.setSelected(true);
                if (f1 == null){
                    f1 = new First_Fragment("第一个Fragment");
                    transaction.add(R.id.fragment_container,f1);
                }else {
                    transaction.show(f1);
                }
                break;
            case R.id.txt_up:
                selected();
                tabUp.setSelected(true);
                if (f2 == null){
                    f2 = new First_Fragment("第二个Fragment");
                    transaction.add(R.id.fragment_container,f2);
                }else {
                    transaction.show(f2);
                }
                break;
            case R.id.txt_my:
                selected();
                tabMy.setSelected(true);
                if (my_fragment == null){
                    my_fragment = new My_Fragment();
                    transaction.add(R.id.fragment_container,my_fragment);
                }else {
                    transaction.show(my_fragment);
                }
                break;
        }
        transaction.commit();
    }

}
