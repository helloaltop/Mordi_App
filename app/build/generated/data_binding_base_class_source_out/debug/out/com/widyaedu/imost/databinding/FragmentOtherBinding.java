// Generated by view binder compiler. Do not edit!
package com.widyaedu.imost.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import com.widyaedu.imost.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentOtherBinding implements ViewBinding {
  @NonNull
  private final NestedScrollView rootView;

  @NonNull
  public final CircleImageView ivProfileUser;

  @NonNull
  public final LinearLayout layoutHistory;

  @NonNull
  public final LinearLayout ll;

  @NonNull
  public final LinearLayout myAccount;

  @NonNull
  public final TextView tv1;

  @NonNull
  public final TextView tvLogout;

  @NonNull
  public final TextView tvNama;

  @NonNull
  public final TextView tvNomor;

  @NonNull
  public final TextView tvVersion;

  @NonNull
  public final View v;

  private FragmentOtherBinding(@NonNull NestedScrollView rootView,
      @NonNull CircleImageView ivProfileUser, @NonNull LinearLayout layoutHistory,
      @NonNull LinearLayout ll, @NonNull LinearLayout myAccount, @NonNull TextView tv1,
      @NonNull TextView tvLogout, @NonNull TextView tvNama, @NonNull TextView tvNomor,
      @NonNull TextView tvVersion, @NonNull View v) {
    this.rootView = rootView;
    this.ivProfileUser = ivProfileUser;
    this.layoutHistory = layoutHistory;
    this.ll = ll;
    this.myAccount = myAccount;
    this.tv1 = tv1;
    this.tvLogout = tvLogout;
    this.tvNama = tvNama;
    this.tvNomor = tvNomor;
    this.tvVersion = tvVersion;
    this.v = v;
  }

  @Override
  @NonNull
  public NestedScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentOtherBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentOtherBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_other, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentOtherBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ivProfileUser;
      CircleImageView ivProfileUser = rootView.findViewById(id);
      if (ivProfileUser == null) {
        break missingId;
      }

      id = R.id.layoutHistory;
      LinearLayout layoutHistory = rootView.findViewById(id);
      if (layoutHistory == null) {
        break missingId;
      }

      id = R.id.ll;
      LinearLayout ll = rootView.findViewById(id);
      if (ll == null) {
        break missingId;
      }

      id = R.id.myAccount;
      LinearLayout myAccount = rootView.findViewById(id);
      if (myAccount == null) {
        break missingId;
      }

      id = R.id.tv1;
      TextView tv1 = rootView.findViewById(id);
      if (tv1 == null) {
        break missingId;
      }

      id = R.id.tvLogout;
      TextView tvLogout = rootView.findViewById(id);
      if (tvLogout == null) {
        break missingId;
      }

      id = R.id.tvNama;
      TextView tvNama = rootView.findViewById(id);
      if (tvNama == null) {
        break missingId;
      }

      id = R.id.tvNomor;
      TextView tvNomor = rootView.findViewById(id);
      if (tvNomor == null) {
        break missingId;
      }

      id = R.id.tvVersion;
      TextView tvVersion = rootView.findViewById(id);
      if (tvVersion == null) {
        break missingId;
      }

      id = R.id.v;
      View v = rootView.findViewById(id);
      if (v == null) {
        break missingId;
      }

      return new FragmentOtherBinding((NestedScrollView) rootView, ivProfileUser, layoutHistory, ll,
          myAccount, tv1, tvLogout, tvNama, tvNomor, tvVersion, v);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
