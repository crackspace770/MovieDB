// Generated by view binder compiler. Do not edit!
package com.fajar.moviedb.setting.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.fajar.moviedb.setting.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentMovieFavoriteBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final RecyclerView rvMovieFavorite;

  @NonNull
  public final View viewEmptyFavorite;

  private FragmentMovieFavoriteBinding(@NonNull ConstraintLayout rootView,
      @NonNull RecyclerView rvMovieFavorite, @NonNull View viewEmptyFavorite) {
    this.rootView = rootView;
    this.rvMovieFavorite = rvMovieFavorite;
    this.viewEmptyFavorite = viewEmptyFavorite;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentMovieFavoriteBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentMovieFavoriteBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_movie_favorite, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentMovieFavoriteBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.rv_movie_favorite;
      RecyclerView rvMovieFavorite = ViewBindings.findChildViewById(rootView, id);
      if (rvMovieFavorite == null) {
        break missingId;
      }

      id = R.id.view_empty_favorite;
      View viewEmptyFavorite = ViewBindings.findChildViewById(rootView, id);
      if (viewEmptyFavorite == null) {
        break missingId;
      }

      return new FragmentMovieFavoriteBinding((ConstraintLayout) rootView, rvMovieFavorite,
          viewEmptyFavorite);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}