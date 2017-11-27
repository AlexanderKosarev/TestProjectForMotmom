package com.example.alex_pc.testprojectformotmom;


import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.List;


public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RemindViewHolder> {

    private List<OfficesList> data;

    public RecyclerAdapter(List<OfficesList> data) {
        this.data = data;
    }

    @Override
    public RemindViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_ragment, parent,false);
        return new RemindViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RemindViewHolder holder, int position) {
        holder.itemImage.setImageURI(Uri.parse(data.get(position).getImage()));
        holder.itemName.setText(data.get(position).getName());
        holder.itemShortDescription.setText(data.get(position).getShortDescription());
        holder.itemRating.setRating(data.get(position).getRaing());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class RemindViewHolder extends RecyclerView.ViewHolder {
        public int currentItem;
        ImageView itemImage;
        TextView itemName;
        TextView itemShortDescription;
        RatingBar itemRating;

        public RemindViewHolder(View itemView){
            super(itemView);
            itemImage = (ImageView)itemView.findViewById(R.id.item_image);
            itemName = (TextView)itemView.findViewById(R.id.item_name);
            itemShortDescription = (TextView)itemView.findViewById(R.id.item_shortDescription);
            itemRating = (RatingBar)itemView.findViewById(R.id.item_rating);
        }

    }
}
