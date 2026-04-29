package androidx.versionedparcelable;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import androidx.collection.C0247k;
import androidx.versionedparcelable.AbstractC1266n;
import com.google.android.exoplayer2.C3548p;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.Set;
import zy.uv6;

/* JADX INFO: compiled from: VersionedParcelStream.java */
/* JADX INFO: loaded from: classes.dex */
@uv6({uv6.EnumC7844k.LIBRARY})
class f7l8 extends AbstractC1266n {

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    private static final int f53636a9 = 1;

    /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
    private static final int f53637d2ok = 8;

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    private static final int f53638d3 = 5;

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    private static final int f53639dd = 11;

    /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
    private static final int f53640eqxt = 7;

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    private static final int f53641fti = 2;

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    private static final int f53642gvn7 = 4;

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    private static final int f53643jk = 0;

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    private static final int f53644jp0y = 3;

    /* JADX INFO: renamed from: l */
    private static final int f6912l = 14;

    /* JADX INFO: renamed from: lvui, reason: collision with root package name */
    private static final int f53645lvui = 9;

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    private static final Charset f53646mcp = Charset.forName(C3548p.f21093h);

    /* JADX INFO: renamed from: ncyb, reason: collision with root package name */
    private static final int f53647ncyb = 13;

    /* JADX INFO: renamed from: oc, reason: collision with root package name */
    private static final int f53648oc = 6;

    /* JADX INFO: renamed from: r */
    private static final int f6913r = 10;

    /* JADX INFO: renamed from: x9kr, reason: collision with root package name */
    private static final int f53649x9kr = 12;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private final DataOutputStream f53650fn3e;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    private toq f53651fu4;

    /* JADX INFO: renamed from: i */
    private final DataInputStream f6914i;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private DataOutputStream f53652ni7;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    int f53653o1t;

    /* JADX INFO: renamed from: t */
    int f6915t;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    private int f53654wvg;

    /* JADX INFO: renamed from: z */
    private boolean f6916z;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private DataInputStream f53655zurt;

    /* JADX INFO: compiled from: VersionedParcelStream.java */
    private static class toq {

        /* JADX INFO: renamed from: k */
        final ByteArrayOutputStream f6918k;

        /* JADX INFO: renamed from: q */
        private final DataOutputStream f6919q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final DataOutputStream f53656toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final int f53657zy;

        toq(int i2, DataOutputStream dataOutputStream) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            this.f6918k = byteArrayOutputStream;
            this.f53656toq = new DataOutputStream(byteArrayOutputStream);
            this.f53657zy = i2;
            this.f6919q = dataOutputStream;
        }

        /* JADX INFO: renamed from: k */
        void m5507k() throws IOException {
            this.f53656toq.flush();
            int size = this.f6918k.size();
            this.f6919q.writeInt((this.f53657zy << 16) | (size >= 65535 ? 65535 : size));
            if (size >= 65535) {
                this.f6919q.writeInt(size);
            }
            this.f6918k.writeTo(this.f6919q);
        }
    }

    public f7l8(InputStream inputStream, OutputStream outputStream) {
        this(inputStream, outputStream, new C0247k(), new C0247k(), new C0247k());
    }

    private void mbx(Object obj) {
        if (obj == null) {
            g1(0);
            return;
        }
        if (obj instanceof Bundle) {
            g1(1);
            nmn5((Bundle) obj);
            return;
        }
        if (obj instanceof String) {
            g1(3);
            gc3c((String) obj);
            return;
        }
        if (obj instanceof String[]) {
            g1(4);
            i1((String[]) obj);
            return;
        }
        if (obj instanceof Boolean) {
            g1(5);
            mo5496a(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof boolean[]) {
            g1(6);
            m5521x((boolean[]) obj);
            return;
        }
        if (obj instanceof Double) {
            g1(7);
            mo5499d(((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof double[]) {
            g1(8);
            vq((double[]) obj);
            return;
        }
        if (obj instanceof Integer) {
            g1(9);
            g1(((Integer) obj).intValue());
            return;
        }
        if (obj instanceof int[]) {
            g1(10);
            gbni((int[]) obj);
            return;
        }
        if (obj instanceof Long) {
            g1(11);
            i9jn(((Long) obj).longValue());
            return;
        }
        if (obj instanceof long[]) {
            g1(12);
            r8s8((long[]) obj);
            return;
        }
        if (obj instanceof Float) {
            g1(13);
            qo(((Float) obj).floatValue());
        } else if (obj instanceof float[]) {
            g1(14);
            wo((float[]) obj);
        } else {
            throw new IllegalArgumentException("Unsupported type " + obj.getClass());
        }
    }

    private void vep5(int i2, String str, Bundle bundle) {
        switch (i2) {
            case 0:
                bundle.putParcelable(str, null);
                return;
            case 1:
                bundle.putBundle(str, mo5500h());
                return;
            case 2:
                bundle.putBundle(str, mo5500h());
                return;
            case 3:
                bundle.putString(str, mo5501j());
                return;
            case 4:
                bundle.putStringArray(str, (String[]) m5518p(new String[0]));
                return;
            case 5:
                bundle.putBoolean(str, x2());
                return;
            case 6:
                bundle.putBooleanArray(str, n7h());
                return;
            case 7:
                bundle.putDouble(str, mo5506z());
                return;
            case 8:
                bundle.putDoubleArray(str, wvg());
                return;
            case 9:
                bundle.putInt(str, d2ok());
                return;
            case 10:
                bundle.putIntArray(str, m5519r());
                return;
            case 11:
                bundle.putLong(str, ncyb());
                return;
            case 12:
                bundle.putLongArray(str, n5r1());
                return;
            case 13:
                bundle.putFloat(str, jp0y());
                return;
            case 14:
                bundle.putFloatArray(str, d3());
                return;
            default:
                throw new RuntimeException("Unknown type " + i2);
        }
    }

    @Override // androidx.versionedparcelable.AbstractC1266n
    /* JADX INFO: renamed from: a */
    public void mo5496a(boolean z2) {
        try {
            this.f53652ni7.writeBoolean(z2);
        } catch (IOException e2) {
            throw new AbstractC1266n.toq(e2);
        }
    }

    @Override // androidx.versionedparcelable.AbstractC1266n
    /* JADX INFO: renamed from: b */
    public void mo5497b(int i2) {
        mo5502k();
        toq toqVar = new toq(i2, this.f53650fn3e);
        this.f53651fu4 = toqVar;
        this.f53652ni7 = toqVar.f53656toq;
    }

    @Override // androidx.versionedparcelable.AbstractC1266n
    public void bf2(boolean z2, boolean z3) {
        if (!z2) {
            throw new RuntimeException("Serialization of this object is not allowed");
        }
        this.f6916z = z3;
    }

    @Override // androidx.versionedparcelable.AbstractC1266n
    public void bz2(IBinder iBinder) {
        if (!this.f6916z) {
            throw new RuntimeException("Binders cannot be written to an OutputStream");
        }
    }

    @Override // androidx.versionedparcelable.AbstractC1266n
    /* JADX INFO: renamed from: c */
    public <T extends Parcelable> T mo5498c() {
        return null;
    }

    @Override // androidx.versionedparcelable.AbstractC1266n
    /* JADX INFO: renamed from: d */
    public void mo5499d(double d2) {
        try {
            this.f53652ni7.writeDouble(d2);
        } catch (IOException e2) {
            throw new AbstractC1266n.toq(e2);
        }
    }

    @Override // androidx.versionedparcelable.AbstractC1266n
    public int d2ok() {
        try {
            return this.f53655zurt.readInt();
        } catch (IOException e2) {
            throw new AbstractC1266n.toq(e2);
        }
    }

    @Override // androidx.versionedparcelable.AbstractC1266n
    protected void dr(CharSequence charSequence) {
        if (!this.f6916z) {
            throw new RuntimeException("CharSequence cannot be written to an OutputStream");
        }
    }

    @Override // androidx.versionedparcelable.AbstractC1266n
    public boolean fti(int i2) {
        while (true) {
            try {
                int i3 = this.f53654wvg;
                if (i3 == i2) {
                    return true;
                }
                if (String.valueOf(i3).compareTo(String.valueOf(i2)) > 0) {
                    return false;
                }
                if (this.f53653o1t < this.f6915t) {
                    this.f6914i.skip(r2 - r1);
                }
                this.f6915t = -1;
                int i4 = this.f6914i.readInt();
                this.f53653o1t = 0;
                int i5 = i4 & 65535;
                if (i5 == 65535) {
                    i5 = this.f6914i.readInt();
                }
                this.f53654wvg = (i4 >> 16) & 65535;
                this.f6915t = i5;
            } catch (IOException unused) {
                return false;
            }
        }
    }

    @Override // androidx.versionedparcelable.AbstractC1266n
    public void g1(int i2) {
        try {
            this.f53652ni7.writeInt(i2);
        } catch (IOException e2) {
            throw new AbstractC1266n.toq(e2);
        }
    }

    @Override // androidx.versionedparcelable.AbstractC1266n
    public void gc3c(String str) {
        try {
            if (str != null) {
                byte[] bytes = str.getBytes(f53646mcp);
                this.f53652ni7.writeInt(bytes.length);
                this.f53652ni7.write(bytes);
            } else {
                this.f53652ni7.writeInt(-1);
            }
        } catch (IOException e2) {
            throw new AbstractC1266n.toq(e2);
        }
    }

    @Override // androidx.versionedparcelable.AbstractC1266n
    /* JADX INFO: renamed from: h */
    public Bundle mo5500h() {
        int iD2ok = d2ok();
        if (iD2ok < 0) {
            return null;
        }
        Bundle bundle = new Bundle();
        for (int i2 = 0; i2 < iD2ok; i2++) {
            vep5(d2ok(), mo5501j(), bundle);
        }
        return bundle;
    }

    @Override // androidx.versionedparcelable.AbstractC1266n
    public void i9jn(long j2) {
        try {
            this.f53652ni7.writeLong(j2);
        } catch (IOException e2) {
            throw new AbstractC1266n.toq(e2);
        }
    }

    @Override // androidx.versionedparcelable.AbstractC1266n
    /* JADX INFO: renamed from: j */
    public String mo5501j() {
        try {
            int i2 = this.f53655zurt.readInt();
            if (i2 <= 0) {
                return null;
            }
            byte[] bArr = new byte[i2];
            this.f53655zurt.readFully(bArr);
            return new String(bArr, f53646mcp);
        } catch (IOException e2) {
            throw new AbstractC1266n.toq(e2);
        }
    }

    @Override // androidx.versionedparcelable.AbstractC1266n
    public float jp0y() {
        try {
            return this.f53655zurt.readFloat();
        } catch (IOException e2) {
            throw new AbstractC1266n.toq(e2);
        }
    }

    @Override // androidx.versionedparcelable.AbstractC1266n
    public void jz5(IInterface iInterface) {
        if (!this.f6916z) {
            throw new RuntimeException("Binders cannot be written to an OutputStream");
        }
    }

    @Override // androidx.versionedparcelable.AbstractC1266n
    /* JADX INFO: renamed from: k */
    public void mo5502k() {
        toq toqVar = this.f53651fu4;
        if (toqVar != null) {
            try {
                if (toqVar.f6918k.size() != 0) {
                    this.f53651fu4.m5507k();
                }
                this.f53651fu4 = null;
            } catch (IOException e2) {
                throw new AbstractC1266n.toq(e2);
            }
        }
    }

    @Override // androidx.versionedparcelable.AbstractC1266n
    /* JADX INFO: renamed from: m */
    public IBinder mo5503m() {
        return null;
    }

    @Override // androidx.versionedparcelable.AbstractC1266n
    public long ncyb() {
        try {
            return this.f53655zurt.readLong();
        } catch (IOException e2) {
            throw new AbstractC1266n.toq(e2);
        }
    }

    @Override // androidx.versionedparcelable.AbstractC1266n
    public void nmn5(Bundle bundle) {
        try {
            if (bundle == null) {
                this.f53652ni7.writeInt(-1);
                return;
            }
            Set<String> setKeySet = bundle.keySet();
            this.f53652ni7.writeInt(setKeySet.size());
            for (String str : setKeySet) {
                gc3c(str);
                mbx(bundle.get(str));
            }
        } catch (IOException e2) {
            throw new AbstractC1266n.toq(e2);
        }
    }

    @Override // androidx.versionedparcelable.AbstractC1266n
    public void qo(float f2) {
        try {
            this.f53652ni7.writeFloat(f2);
        } catch (IOException e2) {
            throw new AbstractC1266n.toq(e2);
        }
    }

    @Override // androidx.versionedparcelable.AbstractC1266n
    /* JADX INFO: renamed from: s */
    public boolean mo5504s() {
        return true;
    }

    @Override // androidx.versionedparcelable.AbstractC1266n
    public void sok(Parcelable parcelable) {
        if (!this.f6916z) {
            throw new RuntimeException("Parcelables cannot be written to an OutputStream");
        }
    }

    @Override // androidx.versionedparcelable.AbstractC1266n
    public byte[] t8r() {
        try {
            int i2 = this.f53655zurt.readInt();
            if (i2 <= 0) {
                return null;
            }
            byte[] bArr = new byte[i2];
            this.f53655zurt.readFully(bArr);
            return bArr;
        } catch (IOException e2) {
            throw new AbstractC1266n.toq(e2);
        }
    }

    @Override // androidx.versionedparcelable.AbstractC1266n
    /* JADX INFO: renamed from: u */
    public void mo5505u(byte[] bArr) {
        try {
            if (bArr != null) {
                this.f53652ni7.writeInt(bArr.length);
                this.f53652ni7.write(bArr);
            } else {
                this.f53652ni7.writeInt(-1);
            }
        } catch (IOException e2) {
            throw new AbstractC1266n.toq(e2);
        }
    }

    @Override // androidx.versionedparcelable.AbstractC1266n
    public boolean x2() {
        try {
            return this.f53655zurt.readBoolean();
        } catch (IOException e2) {
            throw new AbstractC1266n.toq(e2);
        }
    }

    @Override // androidx.versionedparcelable.AbstractC1266n
    public void y2(byte[] bArr, int i2, int i3) {
        try {
            if (bArr != null) {
                this.f53652ni7.writeInt(i3);
                this.f53652ni7.write(bArr, i2, i3);
            } else {
                this.f53652ni7.writeInt(-1);
            }
        } catch (IOException e2) {
            throw new AbstractC1266n.toq(e2);
        }
    }

    @Override // androidx.versionedparcelable.AbstractC1266n
    /* JADX INFO: renamed from: z */
    public double mo5506z() {
        try {
            return this.f53655zurt.readDouble();
        } catch (IOException e2) {
            throw new AbstractC1266n.toq(e2);
        }
    }

    @Override // androidx.versionedparcelable.AbstractC1266n
    protected CharSequence zurt() {
        return null;
    }

    @Override // androidx.versionedparcelable.AbstractC1266n
    protected AbstractC1266n zy() {
        return new f7l8(this.f53655zurt, this.f53652ni7, this.f6930k, this.f53674toq, this.f53675zy);
    }

    private f7l8(InputStream inputStream, OutputStream outputStream, C0247k<String, Method> c0247k, C0247k<String, Method> c0247k2, C0247k<String, Class> c0247k3) {
        super(c0247k, c0247k2, c0247k3);
        this.f53653o1t = 0;
        this.f53654wvg = -1;
        this.f6915t = -1;
        DataInputStream dataInputStream = inputStream != null ? new DataInputStream(new C1263k(inputStream)) : null;
        this.f6914i = dataInputStream;
        DataOutputStream dataOutputStream = outputStream != null ? new DataOutputStream(outputStream) : null;
        this.f53650fn3e = dataOutputStream;
        this.f53655zurt = dataInputStream;
        this.f53652ni7 = dataOutputStream;
    }

    /* JADX INFO: renamed from: androidx.versionedparcelable.f7l8$k */
    /* JADX INFO: compiled from: VersionedParcelStream.java */
    class C1263k extends FilterInputStream {
        C1263k(InputStream inputStream) {
            super(inputStream);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            f7l8 f7l8Var = f7l8.this;
            int i2 = f7l8Var.f6915t;
            if (i2 != -1 && f7l8Var.f53653o1t >= i2) {
                throw new IOException();
            }
            int i3 = super.read();
            f7l8.this.f53653o1t++;
            return i3;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long j2) throws IOException {
            f7l8 f7l8Var = f7l8.this;
            int i2 = f7l8Var.f6915t;
            if (i2 != -1 && f7l8Var.f53653o1t >= i2) {
                throw new IOException();
            }
            long jSkip = super.skip(j2);
            if (jSkip > 0) {
                f7l8.this.f53653o1t += (int) jSkip;
            }
            return jSkip;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i2, int i3) throws IOException {
            f7l8 f7l8Var = f7l8.this;
            int i4 = f7l8Var.f6915t;
            if (i4 != -1 && f7l8Var.f53653o1t >= i4) {
                throw new IOException();
            }
            int i5 = super.read(bArr, i2, i3);
            if (i5 > 0) {
                f7l8.this.f53653o1t += i5;
            }
            return i5;
        }
    }
}
