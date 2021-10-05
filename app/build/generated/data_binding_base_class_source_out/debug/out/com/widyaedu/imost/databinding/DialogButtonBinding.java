// Generated by view binder compiler. Do not edit!
package com.widyaedu.imost.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.widyaedu.imost.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class DialogButtonBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button btOK;

  @NonNull
  public final TextView tvMessage;

  private DialogButtonBinding(@NonNull LinearLayout rootView, @NonNull Button btOK,
      @NonNull TextView tvMessage) {
    this.rootView = rootView;
    this.btOK = btOK;
    this.tvMessage = tvMessage;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DialogButtonBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DialogButtonBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.dialog_button, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DialogButtonBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btOK;
      Button btOK = rootView.findViewById(id);
      if (btOK == null) {
        break missingId;
      }

      id = R.id.tvMessage;
      TextView tvMessage = rootView.findViewById(id);
      if (tvMessage == null) {
        break missingId;
      }

      return new DialogButtonBinding((LinearLayout) rootView, btOK, tvMessage);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
