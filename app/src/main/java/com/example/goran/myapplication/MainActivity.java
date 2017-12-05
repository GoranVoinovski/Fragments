package com.example.goran.myapplication;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.pager)ViewPager mojpager;
    @BindView(R.id.tablayout)TabLayout mojtablayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
        setUpViewPager(mojpager);

    }

    private void setUpViewPager(ViewPager mojpager) {

        MyPageAdapter adapter = new MyPageAdapter(this.getSupportFragmentManager());
        adapter.addFragment(new Fragment1(),"Tab 1");
        mojpager.setAdapter(adapter);
    }
}
