package com.example.letterboxb;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AdapterSiswa10PPLG1 extends RecyclerView.Adapter<ViewHolderPepeleg> {

    Context context;
    List<ItemPepeleg> items;

    public AdapterSiswa10PPLG1(Context context, List<ItemPepeleg> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public ViewHolderPepeleg onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        return new ViewHolderPepeleg(LayoutInflater.from(context).inflate(R.layout.item_view,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull  ViewHolderPepeleg holder, int position) {
        holder.nameView.setText(items.get(position).getName());
        holder.absenView.setText(items.get(position).getAbsen());
        holder.imageView.setImageResource(items.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}