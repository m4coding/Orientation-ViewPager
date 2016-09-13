package com.mcs.orientationviewpager.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mcs.orientationviewpager.R;
import com.mcs.orientationviewpager.adapter.ViewPagerAdapter;
import com.mcs.viewpager.OrientationViewPager;

/**
 * @author mochangsheng
 * @version 1.0
 * @description 该类的主要功能描述
 * @created 2016/9/12
 * @changeRecord [修改记录] <br/>
 */
public class VerticalFragment extends BaseFragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_vertical, container, false);
        mViewPager = (OrientationViewPager) view.findViewById(R.id.view_pager);
        mAdapter = new ViewPagerAdapter(getActivity());
        mViewPager.setAdapter(mAdapter);
        setupBarName("Vertical-ViewPaer");

        mViewPager.requestFocus();
        return view;
    }
}
