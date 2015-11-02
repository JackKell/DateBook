package com.github.jackkell.datebook;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.github.jackkell.datebook.dataobject.DateEvent;

import java.util.ArrayList;

public class DateCardRecyclerViewAdapter extends RecyclerView.Adapter<DateCardRecyclerViewAdapter.DateViewHolder> {

    private static String LOG_TAG = "MyRecyclerViewAdapter";

    public static class DateViewHolder extends RecyclerView.ViewHolder {
        CardView dateCardView;


        public DateViewHolder(View itemView) {
            super(itemView);
        }
    }

    @Override
    public DateViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(DateViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

}
