package com.google.android.material.navigation;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.C0130p;
import androidx.appcompat.view.menu.f7l8;
import androidx.appcompat.view.menu.kja0;
import androidx.appcompat.view.menu.n7h;
import androidx.appcompat.view.menu.t8r;
import com.google.android.material.badge.toq;
import com.google.android.material.internal.ParcelableSparseArray;
import zy.dd;
import zy.lvui;
import zy.uv6;

/* JADX INFO: loaded from: classes2.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP})
public class NavigationBarPresenter implements n7h {

    /* JADX INFO: renamed from: g */
    private int f24710g;

    /* JADX INFO: renamed from: k */
    private f7l8 f24711k;

    /* JADX INFO: renamed from: n */
    private boolean f24712n = false;

    /* JADX INFO: renamed from: q */
    private NavigationBarMenuView f24713q;

    static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.google.android.material.navigation.NavigationBarPresenter.SavedState.1
            @Override // android.os.Parcelable.Creator
            @lvui
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(@lvui Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            @lvui
            /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        };

        /* JADX INFO: renamed from: k */
        int f24714k;

        /* JADX INFO: renamed from: q */
        @dd
        ParcelableSparseArray f24715q;

        SavedState() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@lvui Parcel parcel, int i2) {
            parcel.writeInt(this.f24714k);
            parcel.writeParcelable(this.f24715q, 0);
        }

        SavedState(@lvui Parcel parcel) {
            this.f24714k = parcel.readInt();
            this.f24715q = (ParcelableSparseArray) parcel.readParcelable(getClass().getClassLoader());
        }
    }

    @Override // androidx.appcompat.view.menu.n7h
    public void f7l8(@dd f7l8 f7l8Var, boolean z2) {
    }

    /* JADX INFO: renamed from: g */
    public void m14655g(int i2) {
        this.f24710g = i2;
    }

    @Override // androidx.appcompat.view.menu.n7h
    public int getId() {
        return this.f24710g;
    }

    @Override // androidx.appcompat.view.menu.n7h
    /* JADX INFO: renamed from: k */
    public void mo352k(@lvui Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f24713q.cdj(savedState.f24714k);
            this.f24713q.m14649h(toq.f7l8(this.f24713q.getContext(), savedState.f24715q));
        }
    }

    @Override // androidx.appcompat.view.menu.n7h
    public boolean ld6(@dd f7l8 f7l8Var, @dd C0130p c0130p) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n7h
    /* JADX INFO: renamed from: n */
    public boolean mo353n() {
        return false;
    }

    public void n7h(boolean z2) {
        this.f24712n = z2;
    }

    @Override // androidx.appcompat.view.menu.n7h
    /* JADX INFO: renamed from: p */
    public boolean mo354p(@dd t8r t8rVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n7h
    /* JADX INFO: renamed from: q */
    public void mo355q(boolean z2) {
        if (this.f24712n) {
            return;
        }
        if (z2) {
            this.f24713q.m14652q();
        } else {
            this.f24713q.ki();
        }
    }

    public void qrj(@lvui NavigationBarMenuView navigationBarMenuView) {
        this.f24713q = navigationBarMenuView;
    }

    @Override // androidx.appcompat.view.menu.n7h
    /* JADX INFO: renamed from: s */
    public void mo356s(@dd n7h.InterfaceC0129k interfaceC0129k) {
    }

    @Override // androidx.appcompat.view.menu.n7h
    @dd
    public kja0 toq(@dd ViewGroup viewGroup) {
        return this.f24713q;
    }

    @Override // androidx.appcompat.view.menu.n7h
    public void x2(@lvui Context context, @lvui f7l8 f7l8Var) {
        this.f24711k = f7l8Var;
        this.f24713q.zy(f7l8Var);
    }

    @Override // androidx.appcompat.view.menu.n7h
    /* JADX INFO: renamed from: y */
    public boolean mo367y(@dd f7l8 f7l8Var, @dd C0130p c0130p) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n7h
    @lvui
    public Parcelable zy() {
        SavedState savedState = new SavedState();
        savedState.f24714k = this.f24713q.getSelectedItemId();
        savedState.f24715q = toq.m14107y(this.f24713q.getBadgeDrawables());
        return savedState;
    }
}
