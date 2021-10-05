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

public final class ItemMypaymentBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final ImageView imgIconBank;

  @NonNull
  public final TextView paymentName;

  @NonNull
  public final TextView tvRekening;

  private ItemMypaymentBinding(@NonNull CardView rootView, @NonNull ImageView imgIconBank,
      @NonNull TextView paymentName, @NonNull TextView tvRekening) {
    this.rootView = rootView;
    this.imgIconBank = imgIconBank;
    this.paymentName = paymentName;
    this.tvRekening = tvRekening;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemMypaymentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemMypaymentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_mypayment, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemMypaymentBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imgIconBank;
      ImageView imgIconBank = rootView.findViewById(id);
      if (imgIconBank == null) {
        break missingId;
      }

      id = R.id.paymentName;
      TextView paymentName = rootView.findViewById(id);
      if (paymentName == null) {
        break missingId;
      }

      id = R.id.tvRekening;
      TextView tvRekening = rootView.findViewById(id);
      if (tvRekening == null) {
        break missingId;
      }

      return new ItemMypaymentBinding((CardView) rootView, imgIconBank, paymentName, tvRekening);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
