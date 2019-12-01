package com.example.ouc_market;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class First_Fragment extends Fragment {
    private String context;
    private TextView mTextView;

    public First_Fragment(String context){
        this.context = context;
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.first_fragment,container,false);
        mTextView = (TextView)view.findViewById(R.id.txt_content);
        mTextView.setText(context);
        return view;
    }
}
