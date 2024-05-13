// Generated by view binder compiler. Do not edit!
package com.example.notebook.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.notebook.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class NoteItemBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final ImageView noteDeleteBtn;

  @NonNull
  public final ImageView noteUpdateBtn;

  @NonNull
  public final TextView txtContentView;

  @NonNull
  public final TextView txtTitleView;

  private NoteItemBinding(@NonNull CardView rootView, @NonNull ImageView noteDeleteBtn,
      @NonNull ImageView noteUpdateBtn, @NonNull TextView txtContentView,
      @NonNull TextView txtTitleView) {
    this.rootView = rootView;
    this.noteDeleteBtn = noteDeleteBtn;
    this.noteUpdateBtn = noteUpdateBtn;
    this.txtContentView = txtContentView;
    this.txtTitleView = txtTitleView;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static NoteItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static NoteItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.note_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static NoteItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.noteDeleteBtn;
      ImageView noteDeleteBtn = ViewBindings.findChildViewById(rootView, id);
      if (noteDeleteBtn == null) {
        break missingId;
      }

      id = R.id.noteUpdateBtn;
      ImageView noteUpdateBtn = ViewBindings.findChildViewById(rootView, id);
      if (noteUpdateBtn == null) {
        break missingId;
      }

      id = R.id.txtContentView;
      TextView txtContentView = ViewBindings.findChildViewById(rootView, id);
      if (txtContentView == null) {
        break missingId;
      }

      id = R.id.txtTitleView;
      TextView txtTitleView = ViewBindings.findChildViewById(rootView, id);
      if (txtTitleView == null) {
        break missingId;
      }

      return new NoteItemBinding((CardView) rootView, noteDeleteBtn, noteUpdateBtn, txtContentView,
          txtTitleView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
