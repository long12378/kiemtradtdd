package com.example.kiemtradtdd;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class congtyadapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<congty> ctlist;

    public congtyadapter(Context context, int layout, List<congty> ctlist) {
        this.context = context;
        this.layout = layout;
        this.ctlist = ctlist;
    }

    @Override
    public int getCount() {
        return ctlist.size();
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
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout,null);
        TextView ten = (TextView)view.findViewById(R.id.ten);
        TextView chuthich = (TextView)view.findViewById(R.id.chuthich);
        TextView tich = (TextView)view.findViewById(R.id.tich);
        ImageView avatar = (ImageView)view.findViewById(R.id.avatar);
        congty ct =ctlist.get(position);
        ten.setText(ct.getTen());
        chuthich.setText(ct.getChuthich());
        tich.setText(ct.getTich());
        avatar.setImageResource(ct.getAnh());
        return view;
    }
    public void removeItem(List<congty> items){
        for(congty item : items){
            ctlist.remove(item);
        }
        notifyDataSetChanged();
    }
}
