package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import zy.lvui;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new Parcelable.Creator<FragmentState>() { // from class: androidx.fragment.app.FragmentState.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public FragmentState createFromParcel(Parcel parcel) {
            return new FragmentState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public FragmentState[] newArray(int i2) {
            return new FragmentState[i2];
        }
    };

    /* JADX INFO: renamed from: g */
    final int f4728g;

    /* JADX INFO: renamed from: h */
    final boolean f4729h;

    /* JADX INFO: renamed from: i */
    final boolean f4730i;

    /* JADX INFO: renamed from: k */
    final String f4731k;

    /* JADX INFO: renamed from: l */
    Bundle f4732l;

    /* JADX INFO: renamed from: n */
    final boolean f4733n;

    /* JADX INFO: renamed from: p */
    final boolean f4734p;

    /* JADX INFO: renamed from: q */
    final String f4735q;

    /* JADX INFO: renamed from: r */
    final int f4736r;

    /* JADX INFO: renamed from: s */
    final String f4737s;

    /* JADX INFO: renamed from: t */
    final boolean f4738t;

    /* JADX INFO: renamed from: y */
    final int f4739y;

    /* JADX INFO: renamed from: z */
    final Bundle f4740z;

    FragmentState(Fragment fragment) {
        this.f4731k = fragment.getClass().getName();
        this.f4735q = fragment.mWho;
        this.f4733n = fragment.mFromLayout;
        this.f4728g = fragment.mFragmentId;
        this.f4739y = fragment.mContainerId;
        this.f4737s = fragment.mTag;
        this.f4734p = fragment.mRetainInstance;
        this.f4729h = fragment.mRemoving;
        this.f4730i = fragment.mDetached;
        this.f4740z = fragment.mArguments;
        this.f4738t = fragment.mHidden;
        this.f4736r = fragment.mMaxState.ordinal();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @lvui
    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f4731k);
        sb.append(" (");
        sb.append(this.f4735q);
        sb.append(")}:");
        if (this.f4733n) {
            sb.append(" fromLayout");
        }
        if (this.f4739y != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f4739y));
        }
        String str = this.f4737s;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f4737s);
        }
        if (this.f4734p) {
            sb.append(" retainInstance");
        }
        if (this.f4729h) {
            sb.append(" removing");
        }
        if (this.f4730i) {
            sb.append(" detached");
        }
        if (this.f4738t) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f4731k);
        parcel.writeString(this.f4735q);
        parcel.writeInt(this.f4733n ? 1 : 0);
        parcel.writeInt(this.f4728g);
        parcel.writeInt(this.f4739y);
        parcel.writeString(this.f4737s);
        parcel.writeInt(this.f4734p ? 1 : 0);
        parcel.writeInt(this.f4729h ? 1 : 0);
        parcel.writeInt(this.f4730i ? 1 : 0);
        parcel.writeBundle(this.f4740z);
        parcel.writeInt(this.f4738t ? 1 : 0);
        parcel.writeBundle(this.f4732l);
        parcel.writeInt(this.f4736r);
    }

    FragmentState(Parcel parcel) {
        this.f4731k = parcel.readString();
        this.f4735q = parcel.readString();
        this.f4733n = parcel.readInt() != 0;
        this.f4728g = parcel.readInt();
        this.f4739y = parcel.readInt();
        this.f4737s = parcel.readString();
        this.f4734p = parcel.readInt() != 0;
        this.f4729h = parcel.readInt() != 0;
        this.f4730i = parcel.readInt() != 0;
        this.f4740z = parcel.readBundle();
        this.f4738t = parcel.readInt() != 0;
        this.f4732l = parcel.readBundle();
        this.f4736r = parcel.readInt();
    }
}
