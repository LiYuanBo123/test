package com.example.ouc_market;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MyOneLineView extends LinearLayout {
    private View dividerTop,dividerBottom;
    private LinearLayout llRoot;
    private ImageView ivLeftIcon;
    private TextView tvTextContent;
    private EditText editContent;
    private TextView tvRightText;
    private ImageView ivRightIcon;
    public MyOneLineView(Context context) {//该构造函数使其可以在Java代码中使用
        super(context);
    }
    public MyOneLineView(Context context, AttributeSet attrs){//该构造函数使其可以在XML布局中使用
        super(context,attrs);
    }
    public MyOneLineView init(){
        //引入xml布局
        LayoutInflater.from(getContext()).inflate(R.layout.my_layout,this,true);
        llRoot = (LinearLayout)findViewById(R.id.ll_root);
        dividerTop = findViewById(R.id.divider_top);
        dividerBottom = findViewById(R.id.divider_bottom);
        ivLeftIcon = (ImageView)findViewById(R.id.iv_left_icon);
        tvTextContent = (TextView)findViewById(R.id.tv_text_content);
        editContent = (EditText)findViewById(R.id.edit_content);
        tvRightText = (TextView)findViewById(R.id.tv_right_text);
        ivRightIcon = (ImageView)findViewById(R.id.iv_right_icon);
        return this;
    }
    //分割线的显示情况
    public MyOneLineView showDivider(Boolean showDividerTop,Boolean showDividerBottom){
        if(showDividerTop){
            dividerTop.setVisibility(VISIBLE);
        }else {
            dividerTop.setVisibility(GONE);
        }
        if (showDividerBottom){
            dividerBottom.setVisibility(VISIBLE);
        }else {
            dividerBottom.setVisibility(GONE);
        }
        return this;
    }
    //设置上分割线的颜色
    public MyOneLineView setDividerTopColor(int dividerTopColorRes){
        dividerTop.setBackgroundColor(getResources().getColor(dividerTopColorRes));
        return this;
    }
}
