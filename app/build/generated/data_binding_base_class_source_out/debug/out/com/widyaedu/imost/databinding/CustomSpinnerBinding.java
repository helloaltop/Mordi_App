// Generated by view binder compiler. Do not edit!
package com.widyaedu.imost.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

public final class CustomSpinnerBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView imgIcon;

  @NonNull
  public final TextView tvLoc;

  private CustomSpinnerBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView imgIcon,
      @NonNull TextView tvLoc) {
    this.rootView = rootView;
    this.imgIcon = imgIcon;
    this.tvLoc = tvLoc;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static CustomSpinnerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static CustomSpinnerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.custom_spinner, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static CustomSpinnerBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imgIcon;
      ImageView imgIcon = rootView.findViewById(id);
      if (imgIcon == null) {
        break missingId;
      }

      id = R.id.tvLoc;
      TextView tvLoc = rootView.findViewById(id);
      if (tvLoc == null) {
        break missingId;
      }

      return new CustomSpinnerBinding((ConstraintLayout) rootView, imgIcon, tvLoc);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
