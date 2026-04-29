package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.o1t;
import androidx.lifecycle.kja0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
final class BackStackState implements Parcelable {
    public static final Parcelable.Creator<BackStackState> CREATOR = new Parcelable.Creator<BackStackState>() { // from class: androidx.fragment.app.BackStackState.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public BackStackState createFromParcel(Parcel parcel) {
            return new BackStackState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public BackStackState[] newArray(int i2) {
            return new BackStackState[i2];
        }
    };
    private static final String TAG = "FragmentManager";

    /* JADX INFO: renamed from: f */
    final boolean f4644f;

    /* JADX INFO: renamed from: g */
    final int[] f4645g;

    /* JADX INFO: renamed from: h */
    final int f4646h;

    /* JADX INFO: renamed from: i */
    final CharSequence f4647i;

    /* JADX INFO: renamed from: k */
    final int[] f4648k;

    /* JADX INFO: renamed from: l */
    final ArrayList<String> f4649l;

    /* JADX INFO: renamed from: n */
    final int[] f4650n;

    /* JADX INFO: renamed from: p */
    final int f4651p;

    /* JADX INFO: renamed from: q */
    final ArrayList<String> f4652q;

    /* JADX INFO: renamed from: r */
    final ArrayList<String> f4653r;

    /* JADX INFO: renamed from: s */
    final String f4654s;

    /* JADX INFO: renamed from: t */
    final CharSequence f4655t;

    /* JADX INFO: renamed from: y */
    final int f4656y;

    /* JADX INFO: renamed from: z */
    final int f4657z;

    public BackStackState(C0884k c0884k) {
        int size = c0884k.f51527zy.size();
        this.f4648k = new int[size * 5];
        if (!c0884k.f4853s) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f4652q = new ArrayList<>(size);
        this.f4650n = new int[size];
        this.f4645g = new int[size];
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            o1t.C0889k c0889k = c0884k.f51527zy.get(i2);
            int i4 = i3 + 1;
            this.f4648k[i3] = c0889k.f4856k;
            ArrayList<String> arrayList = this.f4652q;
            Fragment fragment = c0889k.f51529toq;
            arrayList.add(fragment != null ? fragment.mWho : null);
            int[] iArr = this.f4648k;
            int i5 = i4 + 1;
            iArr[i4] = c0889k.f51530zy;
            int i6 = i5 + 1;
            iArr[i5] = c0889k.f4858q;
            int i7 = i6 + 1;
            iArr[i6] = c0889k.f4857n;
            iArr[i7] = c0889k.f4855g;
            this.f4650n[i2] = c0889k.f51528f7l8.ordinal();
            this.f4645g[i2] = c0889k.f4859y.ordinal();
            i2++;
            i3 = i7 + 1;
        }
        this.f4656y = c0884k.f4854y;
        this.f4654s = c0884k.f51521ld6;
        this.f4651p = c0884k.f4820r;
        this.f4646h = c0884k.f51526x2;
        this.f4647i = c0884k.f51523qrj;
        this.f4657z = c0884k.f51522n7h;
        this.f4655t = c0884k.f51520kja0;
        this.f4653r = c0884k.f4848h;
        this.f4649l = c0884k.f51517cdj;
        this.f4644f = c0884k.f51519ki;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: k */
    public C0884k m4174k(FragmentManager fragmentManager) {
        C0884k c0884k = new C0884k(fragmentManager);
        int i2 = 0;
        int i3 = 0;
        while (i2 < this.f4648k.length) {
            o1t.C0889k c0889k = new o1t.C0889k();
            int i4 = i2 + 1;
            c0889k.f4856k = this.f4648k[i2];
            if (FragmentManager.m4(2)) {
                Log.v(TAG, "Instantiate " + c0884k + " op #" + i3 + " base fragment #" + this.f4648k[i4]);
            }
            String str = this.f4652q.get(i3);
            if (str != null) {
                c0889k.f51529toq = fragmentManager.zp(str);
            } else {
                c0889k.f51529toq = null;
            }
            c0889k.f51528f7l8 = kja0.zy.values()[this.f4650n[i3]];
            c0889k.f4859y = kja0.zy.values()[this.f4645g[i3]];
            int[] iArr = this.f4648k;
            int i5 = i4 + 1;
            int i6 = iArr[i4];
            c0889k.f51530zy = i6;
            int i7 = i5 + 1;
            int i8 = iArr[i5];
            c0889k.f4858q = i8;
            int i9 = i7 + 1;
            int i10 = iArr[i7];
            c0889k.f4857n = i10;
            int i11 = iArr[i9];
            c0889k.f4855g = i11;
            c0884k.f4852q = i6;
            c0884k.f4850n = i8;
            c0884k.f4847g = i10;
            c0884k.f51518f7l8 = i11;
            c0884k.m4314s(c0889k);
            i3++;
            i2 = i9 + 1;
        }
        c0884k.f4854y = this.f4656y;
        c0884k.f51521ld6 = this.f4654s;
        c0884k.f4820r = this.f4651p;
        c0884k.f4853s = true;
        c0884k.f51526x2 = this.f4646h;
        c0884k.f51523qrj = this.f4647i;
        c0884k.f51522n7h = this.f4657z;
        c0884k.f51520kja0 = this.f4655t;
        c0884k.f4848h = this.f4653r;
        c0884k.f51517cdj = this.f4649l;
        c0884k.f51519ki = this.f4644f;
        c0884k.ncyb(1);
        return c0884k;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeIntArray(this.f4648k);
        parcel.writeStringList(this.f4652q);
        parcel.writeIntArray(this.f4650n);
        parcel.writeIntArray(this.f4645g);
        parcel.writeInt(this.f4656y);
        parcel.writeString(this.f4654s);
        parcel.writeInt(this.f4651p);
        parcel.writeInt(this.f4646h);
        TextUtils.writeToParcel(this.f4647i, parcel, 0);
        parcel.writeInt(this.f4657z);
        TextUtils.writeToParcel(this.f4655t, parcel, 0);
        parcel.writeStringList(this.f4653r);
        parcel.writeStringList(this.f4649l);
        parcel.writeInt(this.f4644f ? 1 : 0);
    }

    public BackStackState(Parcel parcel) {
        this.f4648k = parcel.createIntArray();
        this.f4652q = parcel.createStringArrayList();
        this.f4650n = parcel.createIntArray();
        this.f4645g = parcel.createIntArray();
        this.f4656y = parcel.readInt();
        this.f4654s = parcel.readString();
        this.f4651p = parcel.readInt();
        this.f4646h = parcel.readInt();
        this.f4647i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f4657z = parcel.readInt();
        this.f4655t = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f4653r = parcel.createStringArrayList();
        this.f4649l = parcel.createStringArrayList();
        this.f4644f = parcel.readInt() != 0;
    }
}
