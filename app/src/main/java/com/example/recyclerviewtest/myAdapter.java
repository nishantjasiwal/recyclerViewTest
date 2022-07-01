package com.example.recyclerviewtest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class myAdapter extends RecyclerView.Adapter<myAdapter.ViewHolder>{

    ArrayList<Model> arrayList;
    Context context;

    public myAdapter(ArrayList<Model> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.custom_card,null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Model model=arrayList.get(position);
        holder.mainTextView.setText(model.getMainText());
        holder.secTextView.setText(model.getSecondText());
        holder.imageView.setImageResource(model.getImage());

    }


    @Override
    public int getItemCount() {
        return arrayList.size();
    }


    class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView mainTextView,secTextView;

        public ViewHolder(@NonNull View itemView) {

            super(itemView);

            imageView=itemView.findViewById(R.id.imageView);
            mainTextView=itemView.findViewById(R.id.TextViewMain);
            secTextView=itemView.findViewById(R.id.TextViewSecond);


        }
    }

}

