package com.example.placement_ready.HelperClasses.Homeadepter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.placement_ready.R;

import java.util.ArrayList;

public class mostviewed_Adepter extends RecyclerView.Adapter<mostviewed_Adepter.mostviewedholder> {
    ArrayList<mostviewed_helperClass> mostviewedlocation;

    public mostviewed_Adepter(ArrayList<mostviewed_helperClass> mostviewedlocation) {
        this.mostviewedlocation = mostviewedlocation;
    }

    @NonNull
    @Override
    public mostviewedholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.mostviewed_card_design,parent,false);
        mostviewedholder mostviewedholder =new mostviewedholder(view);
        return mostviewedholder;
    }

    @Override
    public void onBindViewHolder(@NonNull mostviewedholder holder, int position) {
        mostviewed_helperClass mostviewed_helperClass=mostviewedlocation.get(position);
        holder.image.setImageResource(mostviewed_helperClass.getImage());
        holder.title.setText(mostviewed_helperClass.getTitle());
        holder.desc.setText(mostviewed_helperClass.getDiscreption());

    }

    @Override
    public int getItemCount() {
        return mostviewedlocation.size();
    }

    public static class mostviewedholder extends RecyclerView.ViewHolder{
        ImageView image;
        TextView title,desc;
        public mostviewedholder(@NonNull View itemView) {
            super(itemView);

            image=itemView.findViewById(R.id.mostviewed_image);
            title=itemView.findViewById(R.id.mostviewed_title);
            desc=itemView.findViewById(R.id.mostviewed_desc);

        }
    }

}
