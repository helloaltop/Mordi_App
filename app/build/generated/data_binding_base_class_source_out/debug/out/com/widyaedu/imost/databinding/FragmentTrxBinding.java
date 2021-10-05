// Generated by view binder compiler. Do not edit!
package com.widyaedu.imost.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.widyaedu.imost.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentTrxBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final EditText etCari;

  @NonNull
  public final RecyclerView rvHistoryTransaction;

  @NonNull
  public final TextView tv;

  @NonNull
  public final TextView tvAll;

  @NonNull
  public final TextView tvBerhasil;

  @NonNull
  public final TextView tvPending;

  private FragmentTrxBinding(@NonNull ConstraintLayout rootView, @NonNull EditText etCari,
      @NonNull RecyclerView rvHistoryTransaction, @NonNull TextView tv, @NonNull TextView tvAll,
      @NonNull TextView tvBerhasil, @NonNull TextView tvPending) {
    this.rootView = rootView;
    this.etCari = etCari;
    this.rvHistoryTransaction = rvHistoryTransaction;
    this.tv = tv;
    this.tvAll = tvAll;
    this.tvBerhasil = tvBerhasil;
    this.tvPending = tvPending;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentTrxBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentTrxBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_trx, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentTrxBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.etCari;
      EditText etCari = rootView.findViewById(id);
      if (etCari == null) {
        break missingId;
      }

      id = R.id.rvHistoryTransaction;
      RecyclerView rvHistoryTransaction = rootView.findViewById(id);
      if (rvHistoryTransaction == null) {
        break missingId;
      }

      id = R.id.tv;
      TextView tv = rootView.findViewById(id);
      if (tv == null) {
        break missingId;
      }

      id = R.id.tvAll;
      TextView tvAll = rootView.findViewById(id);
      if (tvAll == null) {
        break missingId;
      }

      id = R.id.tvBerhasil;
      TextView tvBerhasil = rootView.findViewById(id);
      if (tvBerhasil == null) {
        break missingId;
      }

      id = R.id.tvPending;
      TextView tvPending = rootView.findViewById(id);
      if (tvPending == null) {
        break missingId;
      }

      return new FragmentTrxBinding((ConstraintLayout) rootView, etCari, rvHistoryTransaction, tv,
          tvAll, tvBerhasil, tvPending);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
