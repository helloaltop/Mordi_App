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

public final class ItemKuotaBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final CardView cv;

  @NonNull
  public final CardView cvSales;

  @NonNull
  public final ImageView ivIcon;

  @NonNull
  public final TextView price;

  @NonNull
  public final TextView productDetail;

  @NonNull
  public final TextView productName;

  @NonNull
  public final TextView salesName;

  @NonNull
  public final TextView tvCity;

  private ItemKuotaBinding(@NonNull CardView rootView, @NonNull CardView cv,
      @NonNull CardView cvSales, @NonNull ImageView ivIcon, @NonNull TextView price,
      @NonNull TextView productDetail, @NonNull TextView productName, @NonNull TextView salesName,
      @NonNull TextView tvCity) {
    this.rootView = rootView;
    this.cv = cv;
    this.cvSales = cvSales;
    this.ivIcon = ivIcon;
    this.price = price;
    this.productDetail = productDetail;
    this.productName = productName;
    this.salesName = salesName;
    this.tvCity = tvCity;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemKuotaBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemKuotaBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_kuota, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemKuotaBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cv;
      CardView cv = rootView.findViewById(id);
      if (cv == null) {
        break missingId;
      }

      CardView cvSales = (CardView) rootView;

      id = R.id.ivIcon;
      ImageView ivIcon = rootView.findViewById(id);
      if (ivIcon == null) {
        break missingId;
      }

      id = R.id.price;
      TextView price = rootView.findViewById(id);
      if (price == null) {
        break missingId;
      }

      id = R.id.productDetail;
      TextView productDetail = rootView.findViewById(id);
      if (productDetail == null) {
        break missingId;
      }

      id = R.id.productName;
      TextView productName = rootView.findViewById(id);
      if (productName == null) {
        break missingId;
      }

      id = R.id.salesName;
      TextView salesName = rootView.findViewById(id);
      if (salesName == null) {
        break missingId;
      }

      id = R.id.tvCity;
      TextView tvCity = rootView.findViewById(id);
      if (tvCity == null) {
        break missingId;
      }

      return new ItemKuotaBinding((CardView) rootView, cv, cvSales, ivIcon, price, productDetail,
          productName, salesName, tvCity);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
