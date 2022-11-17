package com.kenilamaniya.photogalleryapp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;

public class Adapter extends BaseAdapter {

    private Context mContext;
    public int[] imgArray = {
            R.drawable.image_1,R.drawable.image_2

    };

    public Adapter(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return imgArray.length;
    }

    @Override
    public Object getItem(int i) {
        return imgArray[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView imageView = new ImageView(mContext);
        imageView.setImageResource(imgArray[i]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new GridView.LayoutParams(340,350));

        return imageView;
    }
}
