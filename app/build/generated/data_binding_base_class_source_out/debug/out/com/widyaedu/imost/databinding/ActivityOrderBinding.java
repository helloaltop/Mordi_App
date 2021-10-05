// Generated by view binder compiler. Do not edit!
package com.widyaedu.imost.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.widyaedu.imost.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityOrderBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button bt;

  @NonNull
  public final Button btL;

  @NonNull
  public final ImageView iv;

  @NonNull
  public final ImageView ivBack;

  @NonNull
  public final TextView tv1;

  @NonNull
  public final TextView tv10;

  @NonNull
  public final TextView tv3;

  @NonNull
  public final TextView tv5;

  @NonNull
  public final TextView tv6;

  @NonNull
  public final TextView tv8;

  @NonNull
  public final TextView tv9;

  @NonNull
  public final TextView tvEmail;

  @NonNull
  public final TextView tvPriceItem;

  @NonNull
  public final TextView tvType;

  @NonNull
  public final TextView tvproductName;

  @NonNull
  public final View v;

  @NonNull
  public final View v2;

  @NonNull
  public final View v3;

  @NonNull
  public final View v4;

  @NonNull
  public final View v5;

  @NonNull
  public final View v6;

  private ActivityOrderBinding(@NonNull ConstraintLayout rootView, @NonNull Button bt,
      @NonNull Button btL, @NonNull ImageView iv, @NonNull ImageView ivBack, @NonNull TextView tv1,
      @NonNull TextView tv10, @NonNull TextView tv3, @NonNull TextView tv5, @NonNull TextView tv6,
      @NonNull TextView tv8, @NonNull TextView tv9, @NonNull TextView tvEmail,
      @NonNull TextView tvPriceItem, @NonNull TextView tvType, @NonNull TextView tvproductName,
      @NonNull View v, @NonNull View v2, @NonNull View v3, @NonNull View v4, @NonNull View v5,
      @NonNull View v6) {
    this.rootView = rootView;
    this.bt = bt;
    this.btL = btL;
    this.iv = iv;
    this.ivBack = ivBack;
    this.tv1 = tv1;
    this.tv10 = tv10;
    this.tv3 = tv3;
    this.tv5 = tv5;
    this.tv6 = tv6;
    this.tv8 = tv8;
    this.tv9 = tv9;
    this.tvEmail = tvEmail;
    this.tvPriceItem = tvPriceItem;
    this.tvType = tvType;
    this.tvproductName = tvproductName;
    this.v = v;
    this.v2 = v2;
    this.v3 = v3;
    this.v4 = v4;
    this.v5 = v5;
    this.v6 = v6;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityOrderBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityOrderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_order, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityOrderBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bt;
      Button bt = rootView.findViewById(id);
      if (bt == null) {
        break missingId;
      }

      id = R.id.btL;
      Button btL = rootView.findViewById(id);
      if (btL == null) {
        break missingId;
      }

      id = R.id.iv;
      ImageView iv = rootView.findViewById(id);
      if (iv == null) {
        break missingId;
      }

      id = R.id.ivBack;
      ImageView ivBack = rootView.findViewById(id);
      if (ivBack == null) {
        break missingId;
      }

      id = R.id.tv1;
      TextView tv1 = rootView.findViewById(id);
      if (tv1 == null) {
        break missingId;
      }

      id = R.id.tv10;
      TextView tv10 = rootView.findViewById(id);
      if (tv10 == null) {
        break missingId;
      }

      id = R.id.tv3;
      TextView tv3 = rootView.findViewById(id);
      if (tv3 == null) {
        break missingId;
      }

      id = R.id.tv5;
      TextView tv5 = rootView.findViewById(id);
      if (tv5 == null) {
        break missingId;
      }

      id = R.id.tv6;
      TextView tv6 = rootView.findViewById(id);
      if (tv6 == null) {
        break missingId;
      }

      id = R.id.tv8;
      TextView tv8 = rootView.findViewById(id);
      if (tv8 == null) {
        break missingId;
      }

      id = R.id.tv9;
      TextView tv9 = rootView.findViewById(id);
      if (tv9 == null) {
        break missingId;
      }

      id = R.id.tvEmail;
      TextView tvEmail = rootView.findViewById(id);
      if (tvEmail == null) {
        break missingId;
      }

      id = R.id.tvPriceItem;
      TextView tvPriceItem = rootView.findViewById(id);
      if (tvPriceItem == null) {
        break missingId;
      }

      id = R.id.tvType;
      TextView tvType = rootView.findViewById(id);
      if (tvType == null) {
        break missingId;
      }

      id = R.id.tvproductName;
      TextView tvproductName = rootView.findViewById(id);
      if (tvproductName == null) {
        break missingId;
      }

      id = R.id.v;
      View v = rootView.findViewById(id);
      if (v == null) {
        break missingId;
      }

      id = R.id.v2;
      View v2 = rootView.findViewById(id);
      if (v2 == null) {
        break missingId;
      }

      id = R.id.v3;
      View v3 = rootView.findViewById(id);
      if (v3 == null) {
        break missingId;
      }

      id = R.id.v4;
      View v4 = rootView.findViewById(id);
      if (v4 == null) {
        break missingId;
      }

      id = R.id.v5;
      View v5 = rootView.findViewById(id);
      if (v5 == null) {
        break missingId;
      }

      id = R.id.v6;
      View v6 = rootView.findViewById(id);
      if (v6 == null) {
        break missingId;
      }

      return new ActivityOrderBinding((ConstraintLayout) rootView, bt, btL, iv, ivBack, tv1, tv10,
          tv3, tv5, tv6, tv8, tv9, tvEmail, tvPriceItem, tvType, tvproductName, v, v2, v3, v4, v5,
          v6);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
