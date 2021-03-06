// Generated by view binder compiler. Do not edit!
package com.widyaedu.imost.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.widyaedu.imost.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class BottomMenuAddProductBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btActive;

  @NonNull
  public final Button btNonActive;

  @NonNull
  public final Button btSaveProduk;

  @NonNull
  public final EditText etHarga;

  @NonNull
  public final TextView textView4;

  @NonNull
  public final TextView tvHarga;

  @NonNull
  public final TextView tvNama;

  @NonNull
  public final TextView tvProduct;

  private BottomMenuAddProductBinding(@NonNull ConstraintLayout rootView, @NonNull Button btActive,
      @NonNull Button btNonActive, @NonNull Button btSaveProduk, @NonNull EditText etHarga,
      @NonNull TextView textView4, @NonNull TextView tvHarga, @NonNull TextView tvNama,
      @NonNull TextView tvProduct) {
    this.rootView = rootView;
    this.btActive = btActive;
    this.btNonActive = btNonActive;
    this.btSaveProduk = btSaveProduk;
    this.etHarga = etHarga;
    this.textView4 = textView4;
    this.tvHarga = tvHarga;
    this.tvNama = tvNama;
    this.tvProduct = tvProduct;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static BottomMenuAddProductBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static BottomMenuAddProductBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.bottom_menu_add_product, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static BottomMenuAddProductBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btActive;
      Button btActive = rootView.findViewById(id);
      if (btActive == null) {
        break missingId;
      }

      id = R.id.btNonActive;
      Button btNonActive = rootView.findViewById(id);
      if (btNonActive == null) {
        break missingId;
      }

      id = R.id.btSaveProduk;
      Button btSaveProduk = rootView.findViewById(id);
      if (btSaveProduk == null) {
        break missingId;
      }

      id = R.id.etHarga;
      EditText etHarga = rootView.findViewById(id);
      if (etHarga == null) {
        break missingId;
      }

      id = R.id.textView4;
      TextView textView4 = rootView.findViewById(id);
      if (textView4 == null) {
        break missingId;
      }

      id = R.id.tvHarga;
      TextView tvHarga = rootView.findViewById(id);
      if (tvHarga == null) {
        break missingId;
      }

      id = R.id.tvNama;
      TextView tvNama = rootView.findViewById(id);
      if (tvNama == null) {
        break missingId;
      }

      id = R.id.tvProduct;
      TextView tvProduct = rootView.findViewById(id);
      if (tvProduct == null) {
        break missingId;
      }

      return new BottomMenuAddProductBinding((ConstraintLayout) rootView, btActive, btNonActive,
          btSaveProduk, etHarga, textView4, tvHarga, tvNama, tvProduct);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
