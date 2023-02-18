package com.example.recyclerview2;

import static androidx.recyclerview.widget.RecyclerView.*;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class recycler extends RecyclerView.Adapter<recycler.viewholder> {

    Context context;
    ArrayList<Data> list;
    recycler(Context context, ArrayList<Data> list)
    {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.rowlayout,parent,false);
        viewholder vh = new viewholder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {
        holder.img.setImageResource(list.get(position).img);
        holder.name.setText(list.get(position).name);
        holder.number.setText(list.get(position).number);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewholder extends RecyclerView.ViewHolder {
            TextView name,number;
            ImageView img;
        public viewholder(View itemview) {
            super(itemview);
            name = itemview.findViewById(R.id.idname);
            number = itemview.findViewById(R.id.idnumber);
            img = itemview.findViewById(R.id.idimg);

        }

    }
}
