// Generated by view binder compiler. Do not edit!
package com.widyaedu.imost.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import com.widyaedu.imost.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemPromoBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final CardView cvSales;

  @NonNull
  public final ImageView ivPromo;

  @NonNull
  public final TextView tvPromo;

  @NonNull
  public final TextView tvPromoLokasi;

  @NonNull
  public final TextView tvPromodesc;

  @NonNull
  public final ImageView tvS;

  @NonNull
  public final TextView tvViewOption;

  private ItemPromoBinding(@NonNull CardView rootView, @NonNull CardView cvSales,
      @NonNull ImageView ivPromo, @NonNull TextView tvPromo, @NonNull TextView tvPromoLokasi,
      @NonNull TextView tvPromodesc, @NonNull ImageView tvS, @NonNull TextView tvViewOption) {
    this.rootView = rootView;
    this.cvSales = cvSales;
    this.ivPromo = ivPromo;
    this.tvPromo = tvPromo;
    this.tvPromoLokasi = tvPromoLokasi;
    this.tvPromodesc = tvPromodesc;
    this.tvS = tvS;
    this.tvViewOption = tvViewOption;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemPromoBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemPromoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_promo, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemPromoBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      CardView cvSales = (CardView) rootView;

      id = R.id.ivPromo;
      ImageView ivPromo = rootView.findViewById(id);
      if (ivPromo == null) {
        break missingId;
      }

      id = R.id.tvPromo;
      TextView tvPromo = rootView.findViewById(id);
      if (tvPromo == null) {
        break missingId;
      }

      id = R.id.tvPromoLokasi;
      TextView tvPromoLokasi = rootView.findViewById(id);
      if (tvPromoLokasi == null) {
        break missingId;
      }

      id = R.id.tvPromodesc;
      TextView tvPromodesc = rootView.findViewById(id);
      if (tvPromodesc == null) {
        break missingId;
      }

      id = R.id.tvS;
      ImageView tvS = rootView.findViewById(id);
      if (tvS == null) {
        break missingId;
      }

      id = R.id.tvViewOption;
      TextView tvViewOption = rootView.findViewById(id);
      if (tvViewOption == null) {
        break missingId;
      }

      return new ItemPromoBinding((CardView) rootView, cvSales, ivPromo, tvPromo, tvPromoLokasi,
          tvPromodesc, tvS, tvViewOption);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}