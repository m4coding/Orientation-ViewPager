package com.mcs.orientationviewpager.adapter;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.widget.SlidingPaneLayout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.mcs.orientationviewpager.R;
import com.mcs.viewpager.PagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mochangsheng
 * @version 1.0
 * @description 该类的主要功能描述
 * @created 2016/9/12
 * @changeRecord [修改记录] <br/>
 */
public class ViewPagerAdapter extends PagerAdapter {

    private List<PagerEntity> mList;
    private Context mContext;

    public ViewPagerAdapter(Context context) {
        mList = new ArrayList<>();
        mList.add(new PagerEntity("0", Color.GREEN));
        mList.add(new PagerEntity("1", Color.BLACK));
        mList.add(new PagerEntity("2", Color.BLUE));
        mList.add(new PagerEntity("3", Color.RED));
        mList.add(new PagerEntity("4", Color.DKGRAY));
        mList.add(new PagerEntity("5", Color.YELLOW));

        mContext = context;
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        View view = View.inflate(mContext, R.layout.item_pager,null);
        container.addView(view);

        TextView content = (TextView) view.findViewById(R.id.text);
        content.setText(mList.get(position).name);
        content.setBackgroundColor(mList.get(position).color);

        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    public static class PagerEntity {
        public String name;
        public int color;

        public PagerEntity(String name, int color) {
            this.name = name;
            this.color = color;
        }
    }
}
