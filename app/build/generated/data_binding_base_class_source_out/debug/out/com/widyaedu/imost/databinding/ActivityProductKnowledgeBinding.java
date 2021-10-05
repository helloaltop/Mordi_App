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
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.widyaedu.imost.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityProductKnowledgeBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final CardView cardKuota;

  @NonNull
  public final CardView cardNomor;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final ImageView imageView2;

  @NonNull
  public final ImageView ivBack;

  @NonNull
  public final TextView textView8;

  @NonNull
  public final TextView tvKuota;

  @NonNull
  public final TextView tvKuotaDesc;

  @NonNull
  public final TextView tvNomor;

  @NonNull
  public final TextView tvNomorDesc;

  private ActivityProductKnowledgeBinding(@NonNull ConstraintLayout rootView,
      @NonNull CardView cardKuota, @NonNull CardView cardNomor, @NonNull ImageView imageView,
      @NonNull ImageView imageView2, @NonNull ImageView ivBack, @NonNull TextView textView8,
      @NonNull TextView tvKuota, @NonNull TextView tvKuotaDesc, @NonNull TextView tvNomor,
      @NonNull TextView tvNomorDesc) {
    this.rootView = rootView;
    this.cardKuota = cardKuota;
    this.cardNomor = cardNomor;
    this.imageView = imageView;
    this.imageView2 = imageView2;
    this.ivBack = ivBack;
    this.textView8 = textView8;
    this.tvKuota = tvKuota;
    this.tvKuotaDesc = tvKuotaDesc;
    this.tvNomor = tvNomor;
    this.tvNomorDesc = tvNomorDesc;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityProductKnowledgeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityProductKnowledgeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_product_knowledge, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityProductKnowledgeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cardKuota;
      CardView cardKuota = rootView.findViewById(id);
      if (cardKuota == null) {
        break missingId;
      }

      id = R.id.cardNomor;
      CardView cardNomor = rootView.findViewById(id);
      if (cardNomor == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = rootView.findViewById(id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.imageView2;
      ImageView imageView2 = rootView.findViewById(id);
      if (imageView2 == null) {
        break missingId;
      }

      id = R.id.ivBack;
      ImageView ivBack = rootView.findViewById(id);
      if (ivBack == null) {
        break missingId;
      }

      id = R.id.textView8;
      TextView textView8 = rootView.findViewById(id);
      if (textView8 == null) {
        break missingId;
      }

      id = R.id.tvKuota;
      TextView tvKuota = rootView.findViewById(id);
      if (tvKuota == null) {
        break missingId;
      }

      id = R.id.tvKuotaDesc;
      TextView tvKuotaDesc = rootView.findViewById(id);
      if (tvKuotaDesc == null) {
        break missingId;
      }

      id = R.id.tvNomor;
      TextView tvNomor = rootView.findViewById(id);
      if (tvNomor == null) {
        break missingId;
      }

      id = R.id.tvNomorDesc;
      TextView tvNomorDesc = rootView.findViewById(id);
      if (tvNomorDesc == null) {
        break missingId;
      }

      return new ActivityProductKnowledgeBinding((ConstraintLayout) rootView, cardKuota, cardNomor,
          imageView, imageView2, ivBack, textView8, tvKuota, tvKuotaDesc, tvNomor, tvNomorDesc);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
