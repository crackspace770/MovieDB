// Generated by view binder compiler. Do not edit!
package com.fajar.moviedb.core.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.fajar.moviedb.core.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemTrendingBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final ImageView ivItemImage;

  @NonNull
  public final RatingBar rateStar;

  @NonNull
  public final Space topSpace;

  @NonNull
  public final TextView tvItemTitle;

  private ItemTrendingBinding(@NonNull CardView rootView, @NonNull ImageView ivItemImage,
      @NonNull RatingBar rateStar, @NonNull Space topSpace, @NonNull TextView tvItemTitle) {
    this.rootView = rootView;
    this.ivItemImage = ivItemImage;
    this.rateStar = rateStar;
    this.topSpace = topSpace;
    this.tvItemTitle = tvItemTitle;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemTrendingBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemTrendingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_trending, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemTrendingBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.iv_item_image;
      ImageView ivItemImage = ViewBindings.findChildViewById(rootView, id);
      if (ivItemImage == null) {
        break missingId;
      }

      id = R.id.rate_star;
      RatingBar rateStar = ViewBindings.findChildViewById(rootView, id);
      if (rateStar == null) {
        break missingId;
      }

      id = R.id.top_space;
      Space topSpace = ViewBindings.findChildViewById(rootView, id);
      if (topSpace == null) {
        break missingId;
      }

      id = R.id.tv_item_title;
      TextView tvItemTitle = ViewBindings.findChildViewById(rootView, id);
      if (tvItemTitle == null) {
        break missingId;
      }

      return new ItemTrendingBinding((CardView) rootView, ivItemImage, rateStar, topSpace,
          tvItemTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}