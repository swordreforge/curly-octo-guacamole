package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new Parcelable.Creator<FragmentManagerState>() { // from class: androidx.fragment.app.FragmentManagerState.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public FragmentManagerState createFromParcel(Parcel parcel) {
            return new FragmentManagerState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public FragmentManagerState[] newArray(int i2) {
            return new FragmentManagerState[i2];
        }
    };

    /* JADX INFO: renamed from: g */
    int f4720g;

    /* JADX INFO: renamed from: h */
    ArrayList<FragmentManager.LaunchedFragmentInfo> f4721h;

    /* JADX INFO: renamed from: k */
    ArrayList<FragmentState> f4722k;

    /* JADX INFO: renamed from: n */
    BackStackState[] f4723n;

    /* JADX INFO: renamed from: p */
    ArrayList<Bundle> f4724p;

    /* JADX INFO: renamed from: q */
    ArrayList<String> f4725q;

    /* JADX INFO: renamed from: s */
    ArrayList<String> f4726s;

    /* JADX INFO: renamed from: y */
    String f4727y;

    public FragmentManagerState() {
        this.f4727y = null;
        this.f4726s = new ArrayList<>();
        this.f4724p = new ArrayList<>();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeTypedList(this.f4722k);
        parcel.writeStringList(this.f4725q);
        parcel.writeTypedArray(this.f4723n, i2);
        parcel.writeInt(this.f4720g);
        parcel.writeString(this.f4727y);
        parcel.writeStringList(this.f4726s);
        parcel.writeTypedList(this.f4724p);
        parcel.writeTypedList(this.f4721h);
    }

    public FragmentManagerState(Parcel parcel) {
        this.f4727y = null;
        this.f4726s = new ArrayList<>();
        this.f4724p = new ArrayList<>();
        this.f4722k = parcel.createTypedArrayList(FragmentState.CREATOR);
        this.f4725q = parcel.createStringArrayList();
        this.f4723n = (BackStackState[]) parcel.createTypedArray(BackStackState.CREATOR);
        this.f4720g = parcel.readInt();
        this.f4727y = parcel.readString();
        this.f4726s = parcel.createStringArrayList();
        this.f4724p = parcel.createTypedArrayList(Bundle.CREATOR);
        this.f4721h = parcel.createTypedArrayList(FragmentManager.LaunchedFragmentInfo.CREATOR);
    }
}
