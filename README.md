# Orientation-ViewPager
能够设置水平方向滚动、垂直方向滚动、滚动时间和滚动插值器的ViewPager（A ViewPager that can be set horizontal orientation or vertical orientation）

## 例子效果图 ##
//Horizontal ViewPager

![](http://i.imgur.com/V1Sfj7K.gif)


//Vertical ViewPager

![](http://i.imgur.com/DlJmIqP.gif)

## 使用 ##

	<!--Horizontal ViewPager-->
	<?xml version="1.0" encoding="utf-8"?>
	<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
	    xmlns:app="http://schemas.android.com/apk/res-auto"
	    android:orientation="vertical"
	    android:layout_width="match_parent"
	    android:layout_height="match_parent">
	    <com.mcs.viewpager.OrientationViewPager
	        android:layout_width="match_parent"
	        android:layout_height="match_parent"
	        android:id="@+id/view_pager"
			app:orientation="horizontal">
	    </com.mcs.viewpager.OrientationViewPager>
	</LinearLayout>


	<!--Vertical ViewPager-->
	<?xml version="1.0" encoding="utf-8"?>
	<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
	    xmlns:app="http://schemas.android.com/apk/res-auto"
	    android:orientation="vertical"
	    android:layout_width="match_parent"
	    android:layout_height="match_parent">
	    <com.mcs.viewpager.OrientationViewPager
	        android:layout_width="match_parent"
	        android:layout_height="match_parent"
	        android:id="@+id/view_pager"
			app:orientation="vertical">
	    </com.mcs.viewpager.OrientationViewPager>
	</LinearLayout>


	//设置滚动时间
	mViewPager.setScrollDuration(50);//50ms

	//设置滚动插值器interpolator
	mViewPager.setScrollInterpolator(new LinearInterpolator());//线性插值器


