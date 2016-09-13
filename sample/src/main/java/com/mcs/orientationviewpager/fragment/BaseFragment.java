package com.mcs.orientationviewpager.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;

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
public class BaseFragment extends Fragment {

    protected OrientationViewPager mViewPager;
    protected ViewPagerAdapter mAdapter;

    protected void setupBarName(String name) {
        final ActionBar ab = ((AppCompatActivity) getActivity()).getSupportActionBar();
        ab.setTitle(name);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        menu.clear();
        inflater.inflate(R.menu.menu_main, menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        switch(id) {
            case R.id.action_duration:
                return true;
            case R.id.action_interpolator:
                return true;
            case R.id.duration_50:
                mViewPager.setScrollDuration(50);
                showMessage("50ms");
                return true;
            case R.id.duration_100:
                mViewPager.setScrollDuration(100);
                showMessage("100ms");
                return true;
            case R.id.duration_500:
                mViewPager.setScrollDuration(500);
                showMessage("500ms");
                return true;
            case R.id.duration_1000:
                mViewPager.setScrollDuration(1000);
                showMessage("1000ms");
                return true;
            case R.id.linear:
                mViewPager.setScrollInterpolator(new LinearInterpolator());
                showMessage("LinearInterpolator");
                return true;
            case R.id.accelerate:
                mViewPager.setScrollInterpolator(new AccelerateInterpolator());
                showMessage("AccelerateInterpolator");
                return true;
            case R.id.accelerateDecelerate:
                mViewPager.setScrollInterpolator(new AccelerateDecelerateInterpolator());
                showMessage("AccelerateDecelerateInterpolator");
                return true;
            case R.id.decelerate:
                mViewPager.setScrollInterpolator(new DecelerateInterpolator());
                showMessage("DecelerateInterpolator");
                return true;
            case R.id.overshoot:
                mViewPager.setScrollInterpolator(new OvershootInterpolator());
                showMessage("OvershootInterpolator");
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void showMessage(String msg) {
        Snackbar snackbar = Snackbar.make(mViewPager, msg,Snackbar.LENGTH_LONG);
        snackbar.show();
    }
}
