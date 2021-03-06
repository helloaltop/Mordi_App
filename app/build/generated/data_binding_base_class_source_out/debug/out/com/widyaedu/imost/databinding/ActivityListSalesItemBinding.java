// Generated by view binder compiler. Do not edit!
package com.widyaedu.imost.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.appbar.AppBarLayout;
import com.toptoche.searchablespinnerlibrary.SearchableSpinner;
import com.widyaedu.imost.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityListSalesItemBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final AppBarLayout appBar;

  @NonNull
  public final Toolbar appaSalesItem;

  @NonNull
  public final ImageView bckItem;

  @NonNull
  public final LottieAnimationView pbSales;

  @NonNull
  public final RecyclerView rvSalesItem;

  @NonNull
  public final SearchableSpinner spinnerSales;

  private ActivityListSalesItemBinding(@NonNull FrameLayout rootView, @NonNull AppBarLayout appBar,
      @NonNull Toolbar appaSalesItem, @NonNull ImageView bckItem,
      @NonNull LottieAnimationView pbSales, @NonNull RecyclerView rvSalesItem,
      @NonNull SearchableSpinner spinnerSales) {
    this.rootView = rootView;
    this.appBar = appBar;
    this.appaSalesItem = appaSalesItem;
    this.bckItem = bckItem;
    this.pbSales = pbSales;
    this.rvSalesItem = rvSalesItem;
    this.spinnerSales = spinnerSales;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityListSalesItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityListSalesItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_list_sales_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityListSalesItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.appBar;
      AppBarLayout appBar = rootView.findViewById(id);
      if (appBar == null) {
        break missingId;
      }

      id = R.id.appaSalesItem;
      Toolbar appaSalesItem = rootView.findViewById(id);
      if (appaSalesItem == null) {
        break missingId;
      }

      id = R.id.bckItem;
      ImageView bckItem = rootView.findViewById(id);
      if (bckItem == null) {
        break missingId;
      }

      id = R.id.pbSales;
      LottieAnimationView pbSales = rootView.findViewById(id);
      if (pbSales == null) {
        break missingId;
      }

      id = R.id.rv_sales_item;
      RecyclerView rvSalesItem = rootView.findViewById(id);
      if (rvSalesItem == null) {
        break missingId;
      }

      id = R.id.spinnerSales;
      SearchableSpinner spinnerSales = rootView.findViewById(id);
      if (spinnerSales == null) {
        break missingId;
      }

      return new ActivityListSalesItemBinding((FrameLayout) rootView, appBar, appaSalesItem,
          bckItem, pbSales, rvSalesItem, spinnerSales);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
