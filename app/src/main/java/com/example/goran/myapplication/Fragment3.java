package com.example.goran.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * Created by goran on 5.12.17.
 */

public class Fragment3 extends Fragment{

    @BindView(R.id.textview)TextView tekts;
    @BindView(R.id.imgview)ImageView slika;
    private Unbinder mUnbind;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment3,null);
        mUnbind  =  ButterKnife.bind(this, view);
        //Picasso.with(getActivity()).load(R.drawable.brainster_and_code).fit().centerInside().into(slika);
        Picasso.with(getActivity()).load("https://www.cleverfiles.com/howto/wp-content/uploads/2016/08/mini.jpg").fit().centerInside().into(slika);
        return view;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mUnbind.unbind();
    }



    @OnClick(R.id.btn)
    public void buttonClick (){

        tekts.setText(R.string.textviewtekst3);
        Toast.makeText(getActivity(), "test Fragment 3", Toast.LENGTH_SHORT).show();

    }


}
