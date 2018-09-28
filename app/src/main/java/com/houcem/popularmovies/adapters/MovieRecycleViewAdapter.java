package com.houcem.popularmovies.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class MovieRecycleViewAdapter extends RecyclerView.Adapter {
    @NonNull
    @Override
    public MovieViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {

    }

    public class MovieViewHolder extends RecyclerView.ViewHolder{
        private ImageView image;
        private TextView movieTitle;


        public MovieViewHolder(@NonNull View itemView) {
            super(itemView);
        }



    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
