package com.example.parkyoungjun.lab3_3;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Frag1 extends Fragment {public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    // inflate fragment1 xml source
    ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.frag1,container,false);

    return rootView;
    }
}
