package com.github.jackkell.datebook.adapter;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.github.jackkell.datebook.R;
import com.github.jackkell.datebook.dataobject.RomanticDate;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DateCardRecyclerViewAdapter extends RecyclerView.Adapter<DateCardRecyclerViewAdapter.DateViewHolder> {

    private List<RomanticDate> dates;

    private static String LOG_TAG = "DateCardRecyclerViewAdapter";

    public DateCardRecyclerViewAdapter(List<RomanticDate> dates) {
        this.dates = dates;
    }

    public static class DateViewHolder extends RecyclerView.ViewHolder {
        CardView cvDate;
        TextView tvDateTitle;
        TextView tvDateType;
        TextView tvDateBody;
        TextView tvDateDuration;
        TextView tvDateCost;
        TextView tvDateTransportation;

        public DateViewHolder(View itemView) {
            super(itemView);
            cvDate = (CardView) itemView.findViewById(R.id.cvDate);
            tvDateTitle = (TextView) itemView.findViewById(R.id.tvDateTitle);
            tvDateType = (TextView) itemView.findViewById(R.id.tvDateType);
            tvDateBody = (TextView) itemView.findViewById(R.id.tvDateBody);
            tvDateDuration = (TextView) itemView.findViewById(R.id.tvDateDuration);
            tvDateCost = (TextView) itemView.findViewById(R.id.tvDateCost);
            tvDateTransportation = (TextView) itemView.findViewById(R.id.tvTranpsortation);
        }
    }

    @Override
    public DateViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.date_card_view,parent, false);
        DateViewHolder dateViewHolder = new DateViewHolder(view);
        return dateViewHolder;
    }

    @Override
    public void onBindViewHolder(DateViewHolder holder, int position) {
        RomanticDate currentDate = dates.get(position);
        holder.tvDateTitle.setText(currentDate.name);
        holder.tvDateBody.setText(currentDate.body);
        holder.tvDateType.setText(currentDate.type);
        holder.tvDateDuration.setText(currentDate.duration);
        holder.tvDateCost.setText(currentDate.cost);
        holder.tvDateTransportation.setText(currentDate.transportation);
    }

    @Override
    public int getItemCount() {
        return dates.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView){
        super.onAttachedToRecyclerView(recyclerView);
    }

}
