package com.example.ouc_market;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class My_Fragment extends Fragment {
    private TextView tv;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState){
        View myLayout = inflater.inflate(R.layout.my_layout,container,false);
        tv = (TextView)myLayout.findViewById(R.id.myPage);
        return myLayout;
    }

}
