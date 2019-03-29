package com.example.ventunofontapp;


import android.content.Context;

import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.List;

public class GridDataAdapter extends BaseAdapter {

    private Context mContext;
    private Typeface mTypeface;

    private List<DataAdapter> mDataAdapter;

    public GridDataAdapter (Context context, List<DataAdapter> mDataAdapter){
        this.mContext = context;
        this.mDataAdapter = mDataAdapter;
        mTypeface = Typeface.createFromAsset(mContext.getAssets(), "font/ventuno.ttf");
    }



    @Override
    public int getCount() {
        return  mDataAdapter.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        ViewHolder mViewHolder;

        if(convertView == null){

            mViewHolder = new ViewHolder();
            convertView = inflater.inflate(R.layout.grid_item, null);

            mViewHolder.mLetter = convertView.findViewById(R.id.grid_item_letter);
            mViewHolder.mLetter.setTypeface(mTypeface);

            mViewHolder.mLabel = convertView.findViewById(R.id.grid_item_label);


            convertView.setTag(mViewHolder);

        }else{

            mViewHolder = (ViewHolder)convertView.getTag();
        }

        mViewHolder.mLetter.setText(mDataAdapter.get(position).getLetters());
        mViewHolder.mLabel.setText(mDataAdapter.get(position).getLetters());

        return convertView;

    }


}
