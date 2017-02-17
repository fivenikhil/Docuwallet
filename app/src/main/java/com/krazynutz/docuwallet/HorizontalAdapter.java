package com.krazynutz.docuwallet;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;


public class HorizontalAdapter extends RecyclerView.Adapter<HorizontalAdapter.MyViewHolder> {

    private List<String> datalist_H;
    private Context mcontext;

    public HorizontalAdapter(Context context, List<String> datalist) {
        mcontext = context;
        datalist_H = datalist;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.imgView_folder)
        ImageView card;

        @BindView(R.id.txt_foldrname)
        TextView folder;

        public MyViewHolder(View v)
        {
            super(v);
            ButterKnife.bind(this, v);

        }
    }

    @Override
    public HorizontalAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.redesign_first_item, parent, false);
        MyViewHolder vh =new MyViewHolder(v);

        return vh;
    }

    @Override
    public void onBindViewHolder(HorizontalAdapter.MyViewHolder holder, int position) {

        holder.folder.setText(datalist_H.get(position));
        //holder.card.setImageResource(datalist_H.get(position));
        holder.folder.setTypeface(Typeface.createFromAsset(mcontext.getAssets(), "BreeSerif-Regular.ttf"));

    }

    @Override
    public int getItemCount()
    {
        return datalist_H.size();
    }
}
