// Generated by view binder compiler. Do not edit!
package com.fajar.moviedb.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.fajar.moviedb.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentMovieBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final RecyclerView rvMovie;

  @NonNull
  public final SwipeRefreshLayout swipeToRefresh;

  @NonNull
  public final ViewErrorBinding viewError;

  private FragmentMovieBinding(@NonNull ConstraintLayout rootView, @NonNull ProgressBar progressBar,
      @NonNull RecyclerView rvMovie, @NonNull SwipeRefreshLayout swipeToRefresh,
      @NonNull ViewErrorBinding viewError) {
    this.rootView = rootView;
    this.progressBar = progressBar;
    this.rvMovie = rvMovie;
    this.swipeToRefresh = swipeToRefresh;
    this.viewError = viewError;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentMovieBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentMovieBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_movie, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentMovieBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.progress_bar;
      ProgressBar progressBar = ViewBindings.findChildViewById(rootView, id);
      if (progressBar == null) {
        break missingId;
      }

      id = R.id.rv_movie;
      RecyclerView rvMovie = ViewBindings.findChildViewById(rootView, id);
      if (rvMovie == null) {
        break missingId;
      }

      id = R.id.swipe_to_refresh;
      SwipeRefreshLayout swipeToRefresh = ViewBindings.findChildViewById(rootView, id);
      if (swipeToRefresh == null) {
        break missingId;
      }

      id = R.id.view_error;
      View viewError = ViewBindings.findChildViewById(rootView, id);
      if (viewError == null) {
        break missingId;
      }
      ViewErrorBinding binding_viewError = ViewErrorBinding.bind(viewError);

      return new FragmentMovieBinding((ConstraintLayout) rootView, progressBar, rvMovie,
          swipeToRefresh, binding_viewError);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
