package com.jamilton.mandingapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.MenuHolder>{

    private List<Menu>misMenus = new ArrayList<>();
    private Context context;

    public MenuAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public MenuHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                                  .inflate(R.layout.item_menu, parent, false);
        return new MenuHolder(view);
    }   

    @Override
    public void onBindViewHolder(@NonNull MenuHolder holder, int position) {

        Menu menu = misMenus.get(position);

        holder.text.setText(menu.getNombrePapas());
        holder.img.setImageResource(menu.getImagenPapas());

    }

    @Override
    public int getItemCount() {
        return misMenus.size();
    }


    public void setMenus(List<Menu>misMenus){
        this.misMenus = misMenus;
    }

    class MenuHolder extends RecyclerView.ViewHolder{

        ImageView img;
        TextView text;

        public MenuHolder(@NonNull View itemView) {
            super(itemView);

            img =itemView.findViewById(R.id.imagenPapas);
            text = itemView.findViewById(R.id.nombrePapas);

        }
    }
}
