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

public final class ItemChatSalesBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView ivImg;

  @NonNull
  public final TextView tvChat;

  @NonNull
  public final TextView tvDate;

  private ItemChatSalesBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView ivImg,
      @NonNull TextView tvChat, @NonNull TextView tvDate) {
    this.rootView = rootView;
    this.ivImg = ivImg;
    this.tvChat = tvChat;
    this.tvDate = tvDate;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemChatSalesBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemChatSalesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_chat_sales, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemChatSalesBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ivImg;
      ImageView ivImg = rootView.findViewById(id);
      if (ivImg == null) {
        break missingId;
      }

      id = R.id.tvChat;
      TextView tvChat = rootView.findViewById(id);
      if (tvChat == null) {
        break missingId;
      }

      id = R.id.tvDate;
      TextView tvDate = rootView.findViewById(id);
      if (tvDate == null) {
        break missingId;
      }

      return new ItemChatSalesBinding((ConstraintLayout) rootView, ivImg, tvChat, tvDate);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
