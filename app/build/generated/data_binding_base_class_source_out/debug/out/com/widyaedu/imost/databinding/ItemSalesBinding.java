// Generated by view binder compiler. Do not edit!
package com.widyaedu.imost.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.widyaedu.imost.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemSalesBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final ConstraintLayout clSales;

  @NonNull
  public final CardView cvSales;

  @NonNull
  public final TextView ivChat;

  @NonNull
  public final RatingBar ivRate;

  @NonNull
  public final CircleImageView ivSales;

  @NonNull
  public final ImageView tvS;

  @NonNull
  public final TextView tvSales;

  @NonNull
  public final TextView tvSalesLokasi;

  @NonNull
  public final TextView tvViewOption;

  private ItemSalesBinding(@NonNull CardView rootView, @NonNull ConstraintLayout clSales,
      @NonNull CardView cvSales, @NonNull TextView ivChat, @NonNull RatingBar ivRate,
      @NonNull CircleImageView ivSales, @NonNull ImageView tvS, @NonNull TextView tvSales,
      @NonNull TextView tvSalesLokasi, @NonNull TextView tvViewOption) {
    this.rootView = rootView;
    this.clSales = clSales;
    this.cvSales = cvSales;
    this.ivChat = ivChat;
    this.ivRate = ivRate;
    this.ivSales = ivSales;
    this.tvS = tvS;
    this.tvSales = tvSales;
    this.tvSalesLokasi = tvSalesLokasi;
    this.tvViewOption = tvViewOption;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemSalesBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemSalesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_sales, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemSalesBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.clSales;
      ConstraintLayout clSales = rootView.findViewById(id);
      if (clSales == null) {
        break missingId;
      }

      CardView cvSales = (CardView) rootView;

      id = R.id.ivChat;
      TextView ivChat = rootView.findViewById(id);
      if (ivChat == null) {
        break missingId;
      }

      id = R.id.ivRate;
      RatingBar ivRate = rootView.findViewById(id);
      if (ivRate == null) {
        break missingId;
      }

      id = R.id.ivSales;
      CircleImageView ivSales = rootView.findViewById(id);
      if (ivSales == null) {
        break missingId;
      }

      id = R.id.tvS;
      ImageView tvS = rootView.findViewById(id);
      if (tvS == null) {
        break missingId;
      }

      id = R.id.tvSales;
      TextView tvSales = rootView.findViewById(id);
      if (tvSales == null) {
        break missingId;
      }

      id = R.id.tvSalesLokasi;
      TextView tvSalesLokasi = rootView.findViewById(id);
      if (tvSalesLokasi == null) {
        break missingId;
      }

      id = R.id.tvViewOption;
      TextView tvViewOption = rootView.findViewById(id);
      if (tvViewOption == null) {
        break missingId;
      }

      return new ItemSalesBinding((CardView) rootView, clSales, cvSales, ivChat, ivRate, ivSales,
          tvS, tvSales, tvSalesLokasi, tvViewOption);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}