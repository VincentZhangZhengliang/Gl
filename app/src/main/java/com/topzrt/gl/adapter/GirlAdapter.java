package com.topzrt.gl.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.topzrt.gl.R;
import com.topzrt.gl.bean.Girl;

import java.util.List;

/**
 * Created by Vincent;
 * Created on 2017/9/30;
 * DSC:
 */

public class GirlAdapter extends BaseAdapter {

    Context mContext;
    List<Girl> mList;

    public GirlAdapter(Context context, List<Girl> list) {
        mContext = context;
        mList = list;
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        ViewHolder holder;
        if (view == null) {
            view = LayoutInflater.from(mContext).inflate(R.layout.item, viewGroup, false);
            holder = new ViewHolder(view);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }
        holder.mName.setText(mList.get(i).getName());
        holder.mAge.setText(mList.get(i).getAge());
        return view;

    }

    class ViewHolder {

        View mView;
        private final TextView mName;
        private final TextView mAge;

        public ViewHolder(View view) {
            mView = view;
            mName = (TextView) mView.findViewById(R.id.textView2);
            mAge = (TextView) mView.findViewById(R.id.textView4);
        }

    }

}
