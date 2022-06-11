package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

//To hold view  ---> view holder

public class RecyclerProductAdapter extends RecyclerView.Adapter<RecyclerProductAdapter.ViewHolder> {

    Context context;
    ArrayList<ProductsModel> arrProducts;
    RecyclerProductAdapter(Context context, ArrayList<ProductsModel> arrProducts){
        this.context = context;
        this.arrProducts = arrProducts;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // object is created and is set here

        View view = LayoutInflater.from(context).inflate(R.layout.bcd_products, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
        // reference goes to the constructor itemView
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        // set data here
        // variables of Views stored in holder class

        holder.cardImg.setImageResource(arrProducts.get(position).cardImg);
        holder.cardName.setText(arrProducts.get(position).cardName);
        holder.cardDescription.setText(arrProducts.get(position).cardDescription);

    }

    @Override
    public int getItemCount() {
        return arrProducts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView cardName,cardDescription;
        ImageView cardImg;

        //Product Layout is in itemView
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            cardName= itemView.findViewById(R.id.cardName);
            cardDescription= itemView.findViewById(R.id.cardDescription);
            cardImg= itemView.findViewById(R.id.cardImg);
        }
    }

}
