package com.tutorials.hp.recyclerviewcustomcards.mRecycler;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.tutorials.hp.recyclerviewcustomcards.R;


public class MyViewHolder extends RecyclerView.ViewHolder {

    TextView nameTxt,propellantTxt;
    ImageView img;

    public MyViewHolder(View itemView) {
        super(itemView);

        nameTxt= (TextView) itemView.findViewById(R.id.nameTxt);
        propellantTxt= (TextView) itemView.findViewById(R.id.propellantTxt);
        img= (ImageView) itemView.findViewById(R.id.spacecraftImg);
    }
}
