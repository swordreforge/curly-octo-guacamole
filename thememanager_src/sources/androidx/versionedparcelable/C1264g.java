package androidx.versionedparcelable;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import androidx.collection.C0247k;
import java.lang.reflect.Method;
import zy.uv6;

/* JADX INFO: renamed from: androidx.versionedparcelable.g */
/* JADX INFO: compiled from: VersionedParcelParcel.java */
/* JADX INFO: loaded from: classes.dex */
@uv6({uv6.EnumC7844k.LIBRARY})
class C1264g extends AbstractC1266n {

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    private static final String f53658mcp = "VersionedParcelParcel";

    /* JADX INFO: renamed from: t */
    private static final boolean f6920t = false;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private final Parcel f53659fn3e;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    private final String f53660fu4;

    /* JADX INFO: renamed from: i */
    private final SparseIntArray f6921i;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private final int f53661ni7;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    private int f53662o1t;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    private int f53663wvg;

    /* JADX INFO: renamed from: z */
    private int f6922z;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private final int f53664zurt;

    C1264g(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C0247k(), new C0247k(), new C0247k());
    }

    @Override // androidx.versionedparcelable.AbstractC1266n
    /* JADX INFO: renamed from: a */
    public void mo5496a(boolean z2) {
        this.f53659fn3e.writeInt(z2 ? 1 : 0);
    }

    @Override // androidx.versionedparcelable.AbstractC1266n
    /* JADX INFO: renamed from: b */
    public void mo5497b(int i2) {
        mo5502k();
        this.f6922z = i2;
        this.f6921i.put(i2, this.f53659fn3e.dataPosition());
        g1(0);
        g1(i2);
    }

    @Override // androidx.versionedparcelable.AbstractC1266n
    public void bz2(IBinder iBinder) {
        this.f53659fn3e.writeStrongBinder(iBinder);
    }

    @Override // androidx.versionedparcelable.AbstractC1266n
    /* JADX INFO: renamed from: c */
    public <T extends Parcelable> T mo5498c() {
        return (T) this.f53659fn3e.readParcelable(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.AbstractC1266n
    /* JADX INFO: renamed from: d */
    public void mo5499d(double d2) {
        this.f53659fn3e.writeDouble(d2);
    }

    @Override // androidx.versionedparcelable.AbstractC1266n
    public int d2ok() {
        return this.f53659fn3e.readInt();
    }

    @Override // androidx.versionedparcelable.AbstractC1266n
    protected void dr(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f53659fn3e, 0);
    }

    @Override // androidx.versionedparcelable.AbstractC1266n
    public boolean fti(int i2) {
        while (this.f53662o1t < this.f53661ni7) {
            int i3 = this.f53663wvg;
            if (i3 == i2) {
                return true;
            }
            if (String.valueOf(i3).compareTo(String.valueOf(i2)) > 0) {
                return false;
            }
            this.f53659fn3e.setDataPosition(this.f53662o1t);
            int i4 = this.f53659fn3e.readInt();
            this.f53663wvg = this.f53659fn3e.readInt();
            this.f53662o1t += i4;
        }
        return this.f53663wvg == i2;
    }

    @Override // androidx.versionedparcelable.AbstractC1266n
    public void g1(int i2) {
        this.f53659fn3e.writeInt(i2);
    }

    @Override // androidx.versionedparcelable.AbstractC1266n
    public void gc3c(String str) {
        this.f53659fn3e.writeString(str);
    }

    @Override // androidx.versionedparcelable.AbstractC1266n
    /* JADX INFO: renamed from: h */
    public Bundle mo5500h() {
        return this.f53659fn3e.readBundle(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.AbstractC1266n
    public void i9jn(long j2) {
        this.f53659fn3e.writeLong(j2);
    }

    @Override // androidx.versionedparcelable.AbstractC1266n
    /* JADX INFO: renamed from: j */
    public String mo5501j() {
        return this.f53659fn3e.readString();
    }

    @Override // androidx.versionedparcelable.AbstractC1266n
    public float jp0y() {
        return this.f53659fn3e.readFloat();
    }

    @Override // androidx.versionedparcelable.AbstractC1266n
    public void jz5(IInterface iInterface) {
        this.f53659fn3e.writeStrongInterface(iInterface);
    }

    @Override // androidx.versionedparcelable.AbstractC1266n
    /* JADX INFO: renamed from: k */
    public void mo5502k() {
        int i2 = this.f6922z;
        if (i2 >= 0) {
            int i3 = this.f6921i.get(i2);
            int iDataPosition = this.f53659fn3e.dataPosition();
            this.f53659fn3e.setDataPosition(i3);
            this.f53659fn3e.writeInt(iDataPosition - i3);
            this.f53659fn3e.setDataPosition(iDataPosition);
        }
    }

    @Override // androidx.versionedparcelable.AbstractC1266n
    /* JADX INFO: renamed from: m */
    public IBinder mo5503m() {
        return this.f53659fn3e.readStrongBinder();
    }

    @Override // androidx.versionedparcelable.AbstractC1266n
    public long ncyb() {
        return this.f53659fn3e.readLong();
    }

    @Override // androidx.versionedparcelable.AbstractC1266n
    public void nmn5(Bundle bundle) {
        this.f53659fn3e.writeBundle(bundle);
    }

    @Override // androidx.versionedparcelable.AbstractC1266n
    public void qo(float f2) {
        this.f53659fn3e.writeFloat(f2);
    }

    @Override // androidx.versionedparcelable.AbstractC1266n
    public void sok(Parcelable parcelable) {
        this.f53659fn3e.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.AbstractC1266n
    public byte[] t8r() {
        int i2 = this.f53659fn3e.readInt();
        if (i2 < 0) {
            return null;
        }
        byte[] bArr = new byte[i2];
        this.f53659fn3e.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.AbstractC1266n
    /* JADX INFO: renamed from: u */
    public void mo5505u(byte[] bArr) {
        if (bArr == null) {
            this.f53659fn3e.writeInt(-1);
        } else {
            this.f53659fn3e.writeInt(bArr.length);
            this.f53659fn3e.writeByteArray(bArr);
        }
    }

    @Override // androidx.versionedparcelable.AbstractC1266n
    public boolean x2() {
        return this.f53659fn3e.readInt() != 0;
    }

    @Override // androidx.versionedparcelable.AbstractC1266n
    public void y2(byte[] bArr, int i2, int i3) {
        if (bArr == null) {
            this.f53659fn3e.writeInt(-1);
        } else {
            this.f53659fn3e.writeInt(bArr.length);
            this.f53659fn3e.writeByteArray(bArr, i2, i3);
        }
    }

    @Override // androidx.versionedparcelable.AbstractC1266n
    /* JADX INFO: renamed from: z */
    public double mo5506z() {
        return this.f53659fn3e.readDouble();
    }

    @Override // androidx.versionedparcelable.AbstractC1266n
    protected CharSequence zurt() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f53659fn3e);
    }

    @Override // androidx.versionedparcelable.AbstractC1266n
    protected AbstractC1266n zy() {
        Parcel parcel = this.f53659fn3e;
        int iDataPosition = parcel.dataPosition();
        int i2 = this.f53662o1t;
        if (i2 == this.f53664zurt) {
            i2 = this.f53661ni7;
        }
        return new C1264g(parcel, iDataPosition, i2, this.f53660fu4 + "  ", this.f6930k, this.f53674toq, this.f53675zy);
    }

    private C1264g(Parcel parcel, int i2, int i3, String str, C0247k<String, Method> c0247k, C0247k<String, Method> c0247k2, C0247k<String, Class> c0247k3) {
        super(c0247k, c0247k2, c0247k3);
        this.f6921i = new SparseIntArray();
        this.f6922z = -1;
        this.f53663wvg = -1;
        this.f53659fn3e = parcel;
        this.f53664zurt = i2;
        this.f53661ni7 = i3;
        this.f53662o1t = i2;
        this.f53660fu4 = str;
    }
}
