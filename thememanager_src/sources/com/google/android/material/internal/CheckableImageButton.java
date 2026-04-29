package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.core.view.C0683f;
import androidx.core.view.C0701k;
import androidx.customview.view.AbsSavedState;
import p030n.C7397k;
import zy.lvui;
import zy.uv6;

/* JADX INFO: loaded from: classes2.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP})
public class CheckableImageButton extends AppCompatImageButton implements Checkable {

    /* JADX INFO: renamed from: p */
    private static final int[] f24524p = {R.attr.state_checked};

    /* JADX INFO: renamed from: g */
    private boolean f24525g;

    /* JADX INFO: renamed from: s */
    private boolean f24526s;

    /* JADX INFO: renamed from: y */
    private boolean f24527y;

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.internal.CheckableImageButton.SavedState.1
            @Override // android.os.Parcelable.Creator
            @lvui
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(@lvui Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            @lvui
            /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(@lvui Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @lvui
            /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        };

        /* JADX INFO: renamed from: q */
        boolean f24528q;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        /* JADX INFO: renamed from: k */
        private void m14523k(@lvui Parcel parcel) {
            this.f24528q = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@lvui Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f24528q ? 1 : 0);
        }

        public SavedState(@lvui Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            m14523k(parcel);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.internal.CheckableImageButton$k */
    class C4037k extends C0701k {
        C4037k() {
        }

        @Override // androidx.core.view.C0701k
        public void onInitializeAccessibilityEvent(View view, @lvui AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }

        @Override // androidx.core.view.C0701k
        public void onInitializeAccessibilityNodeInfo(View view, @lvui androidx.core.view.accessibility.ki kiVar) {
            super.onInitializeAccessibilityNodeInfo(view, kiVar);
            kiVar.v0af(CheckableImageButton.this.m14522k());
            kiVar.etdu(CheckableImageButton.this.isChecked());
        }
    }

    public CheckableImageButton(Context context) {
        this(context, null);
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f24525g;
    }

    /* JADX INFO: renamed from: k */
    public boolean m14522k() {
        return this.f24527y;
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i2) {
        if (!this.f24525g) {
            return super.onCreateDrawableState(i2);
        }
        int[] iArr = f24524p;
        return View.mergeDrawableStates(super.onCreateDrawableState(i2 + iArr.length), iArr);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setChecked(savedState.f24528q);
    }

    @Override // android.view.View
    @lvui
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f24528q = this.f24525g;
        return savedState;
    }

    public void setCheckable(boolean z2) {
        if (this.f24527y != z2) {
            this.f24527y = z2;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z2) {
        if (!this.f24527y || this.f24525g == z2) {
            return;
        }
        this.f24525g = z2;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z2) {
        this.f24526s = z2;
    }

    @Override // android.view.View
    public void setPressed(boolean z2) {
        if (this.f24526s) {
            super.setPressed(z2);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f24525g);
    }

    public boolean toq() {
        return this.f24526s;
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7397k.toq.f92844e5);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f24527y = true;
        this.f24526s = true;
        C0683f.zwy(this, new C4037k());
    }
}
