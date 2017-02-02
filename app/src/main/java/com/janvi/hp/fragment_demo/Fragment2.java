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

public class Fragment2 extends Fragment {
    private Button btnlotus;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment2, container, false);
        btnlotus =(Button)view.findViewById(R.id.btnlotus );
        btnlotus .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment3 fragment3 =new Fragment3() ;
                getFragmentManager() .beginTransaction() .replace(R.id.l2,fragment3 ).addToBackStack("").commit() ;
            }
        });
        return view;
    }
}
