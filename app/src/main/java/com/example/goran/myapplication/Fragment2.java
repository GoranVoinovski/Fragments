package com.example.goran.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * Created by goran on 5.12.17.
 */

public class Fragment2 extends Fragment{

    private Unbinder mUnbind;
    @BindView(R.id.textview)TextView tekts;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment2,null);
        mUnbind  =  ButterKnife.bind(this, view);


        return view;
    }

    @OnClick(R.id.btn)
    public void buttonClick (){

        tekts.setText(R.string.textviewtekst2);
        Toast.makeText(getActivity(), "test Fragment 2", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mUnbind.unbind();
    }
}
