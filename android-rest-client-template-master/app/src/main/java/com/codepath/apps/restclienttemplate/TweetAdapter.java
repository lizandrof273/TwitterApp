package com.codepath.apps.restclienttemplate;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class TweetAdapter {
    //pass in the tweets array in constructer

    //for each row, inflate the lauyout and cache refrence into viewholder

    //bind values based on postion

    // create view holder class
    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView ivProfileImage;
        public TextView tvUserName;
        public TextView tvBody;

        public ViewHolder(View itemView) {
            super(itemView);

            ivProfileImage = (ImageView) itemView.findViewsById(R.id.ivProfileImage);
        }
    }
}
