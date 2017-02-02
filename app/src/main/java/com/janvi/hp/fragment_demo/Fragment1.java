package com.janvi.hp.fragment_demo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by HP on 2/1/2017.
 */

public class Fragment1 extends Fragment {
    private Button btnrose;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment1, container, false);
        btnrose =(Button) view .findViewById(R.id.btnrose );
        btnrose .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment2 fragment2 =new Fragment2() ;
                getFragmentManager() .beginTransaction() .replace(R.id.l2,fragment2 ).addToBackStack("").commit() ;

            }
        }) ;

        return view;
        }
    }
