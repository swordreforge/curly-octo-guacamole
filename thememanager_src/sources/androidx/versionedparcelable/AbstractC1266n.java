package androidx.versionedparcelable;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.NetworkOnMainThreadException;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseBooleanArray;
import androidx.collection.C0247k;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import zy.hyr;
import zy.lvui;
import zy.uv6;

/* JADX INFO: renamed from: androidx.versionedparcelable.n */
/* JADX INFO: compiled from: VersionedParcel.java */
/* JADX INFO: loaded from: classes.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public abstract class AbstractC1266n {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private static final int f53665cdj = 5;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final int f53666f7l8 = -3;

    /* JADX INFO: renamed from: g */
    private static final int f6923g = -2;

    /* JADX INFO: renamed from: h */
    private static final int f6924h = 4;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private static final int f53667ki = 7;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private static final int f53668kja0 = 3;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final int f53669ld6 = -7;

    /* JADX INFO: renamed from: n */
    private static final int f6925n = -1;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static final int f53670n7h = 2;

    /* JADX INFO: renamed from: p */
    private static final int f6926p = -6;

    /* JADX INFO: renamed from: q */
    private static final String f6927q = "VersionedParcel";

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final int f53671qrj = 1;

    /* JADX INFO: renamed from: s */
    private static final int f6928s = -5;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private static final int f53672t8r = 8;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final int f53673x2 = -9;

    /* JADX INFO: renamed from: y */
    private static final int f6929y = -4;

    /* JADX INFO: renamed from: k */
    protected final C0247k<String, Method> f6930k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    protected final C0247k<String, Method> f53674toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    protected final C0247k<String, Class> f53675zy;

    /* JADX INFO: renamed from: androidx.versionedparcelable.n$k */
    /* JADX INFO: compiled from: VersionedParcel.java */
    class k extends ObjectInputStream {
        k(InputStream inputStream) {
            super(inputStream);
        }

        @Override // java.io.ObjectInputStream
        protected Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws ClassNotFoundException, IOException {
            Class<?> cls = Class.forName(objectStreamClass.getName(), false, getClass().getClassLoader());
            return cls != null ? cls : super.resolveClass(objectStreamClass);
        }
    }

    /* JADX INFO: renamed from: androidx.versionedparcelable.n$toq */
    /* JADX INFO: compiled from: VersionedParcel.java */
    public static class toq extends RuntimeException {
        public toq(Throwable th) {
            super(th);
        }
    }

    public AbstractC1266n(C0247k<String, Method> c0247k, C0247k<String, Method> c0247k2, C0247k<String, Class> c0247k3) {
        this.f6930k = c0247k;
        this.f53674toq = c0247k2;
        this.f53675zy = c0247k3;
    }

    private int a9() {
        return d2ok();
    }

    private <T> int f7l8(T t2) {
        if (t2 instanceof String) {
            return 4;
        }
        if (t2 instanceof Parcelable) {
            return 2;
        }
        if (t2 instanceof InterfaceC1269y) {
            return 1;
        }
        if (t2 instanceof Serializable) {
            return 3;
        }
        if (t2 instanceof IBinder) {
            return 5;
        }
        if (t2 instanceof Integer) {
            return 7;
        }
        if (t2 instanceof Float) {
            return 8;
        }
        throw new IllegalArgumentException(t2.getClass().getName() + " cannot be VersionedParcelled");
    }

    private <T, S extends Collection<T>> S fu4(S s2) {
        int iD2ok = d2ok();
        if (iD2ok < 0) {
            return null;
        }
        if (iD2ok != 0) {
            int iD2ok2 = d2ok();
            if (iD2ok < 0) {
                return null;
            }
            if (iD2ok2 == 1) {
                while (iD2ok > 0) {
                    s2.add(yz());
                    iD2ok--;
                }
            } else if (iD2ok2 == 2) {
                while (iD2ok > 0) {
                    s2.add(mo5498c());
                    iD2ok--;
                }
            } else if (iD2ok2 == 3) {
                while (iD2ok > 0) {
                    s2.add(uv6());
                    iD2ok--;
                }
            } else if (iD2ok2 == 4) {
                while (iD2ok > 0) {
                    s2.add(mo5501j());
                    iD2ok--;
                }
            } else if (iD2ok2 == 5) {
                while (iD2ok > 0) {
                    s2.add(mo5503m());
                    iD2ok--;
                }
            }
        }
        return s2;
    }

    @lvui
    /* JADX INFO: renamed from: g */
    protected static Throwable m5508g(@lvui Throwable th) {
        while (th.getCause() != null) {
            th = th.getCause();
        }
        return th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void h7am(InterfaceC1269y interfaceC1269y) {
        try {
            gc3c(m5510q(interfaceC1269y.getClass()).getName());
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException(interfaceC1269y.getClass().getSimpleName() + " does not have a Parcelizer", e2);
        }
    }

    private <T> void ikck(Collection<T> collection, int i2) {
        mo5497b(i2);
        m5511v(collection);
    }

    private Exception mcp(int i2, String str) {
        return toq(i2, str);
    }

    /* JADX INFO: renamed from: n */
    private Method m5509n(String str) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Method method = this.f6930k.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, AbstractC1266n.class.getClassLoader()).getDeclaredMethod("read", AbstractC1266n.class);
        this.f6930k.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX INFO: renamed from: q */
    private Class m5510q(Class<? extends InterfaceC1269y> cls) throws ClassNotFoundException {
        Class cls2 = this.f53675zy.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        this.f53675zy.put(cls.getName(), cls3);
        return cls3;
    }

    private Exception toq(int i2, String str) {
        switch (i2) {
            case -9:
                return (Exception) mo5498c();
            case -8:
            default:
                return new RuntimeException("Unknown exception code: " + i2 + " msg " + str);
            case -7:
                return new UnsupportedOperationException(str);
            case -6:
                return new NetworkOnMainThreadException();
            case -5:
                return new IllegalStateException(str);
            case -4:
                return new NullPointerException(str);
            case -3:
                return new IllegalArgumentException(str);
            case -2:
                return new BadParcelableException(str);
            case -1:
                return new SecurityException(str);
        }
    }

    /* JADX INFO: renamed from: v */
    private <T> void m5511v(Collection<T> collection) {
        if (collection == null) {
            g1(-1);
        }
        int size = collection.size();
        g1(size);
        if (size > 0) {
            int iF7l8 = f7l8(collection.iterator().next());
            g1(iF7l8);
            switch (iF7l8) {
                case 1:
                    Iterator<T> it = collection.iterator();
                    while (it.hasNext()) {
                        bek6((InterfaceC1269y) it.next());
                    }
                    break;
                case 2:
                    Iterator<T> it2 = collection.iterator();
                    while (it2.hasNext()) {
                        sok((Parcelable) it2.next());
                    }
                    break;
                case 3:
                    Iterator<T> it3 = collection.iterator();
                    while (it3.hasNext()) {
                        w831((Serializable) it3.next());
                    }
                    break;
                case 4:
                    Iterator<T> it4 = collection.iterator();
                    while (it4.hasNext()) {
                        gc3c((String) it4.next());
                    }
                    break;
                case 5:
                    Iterator<T> it5 = collection.iterator();
                    while (it5.hasNext()) {
                        bz2((IBinder) it5.next());
                    }
                    break;
                case 7:
                    Iterator<T> it6 = collection.iterator();
                    while (it6.hasNext()) {
                        g1(((Integer) it6.next()).intValue());
                    }
                    break;
                case 8:
                    Iterator<T> it7 = collection.iterator();
                    while (it7.hasNext()) {
                        qo(((Float) it7.next()).floatValue());
                    }
                    break;
            }
        }
    }

    private void w831(Serializable serializable) {
        if (serializable == null) {
            gc3c(null);
            return;
        }
        String name = serializable.getClass().getName();
        gc3c(name);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(serializable);
            objectOutputStream.close();
            mo5505u(byteArrayOutputStream.toByteArray());
        } catch (IOException e2) {
            throw new RuntimeException("VersionedParcelable encountered IOException writing serializable object (name = " + name + ")", e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y */
    private Method m5512y(Class cls) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Method method = this.f53674toq.get(cls.getName());
        if (method != null) {
            return method;
        }
        Class clsM5510q = m5510q(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsM5510q.getDeclaredMethod("write", cls, AbstractC1266n.class);
        this.f53674toq.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* JADX INFO: renamed from: a */
    protected abstract void mo5496a(boolean z2);

    public <T> void a98o(T[] tArr, int i2) {
        mo5497b(i2);
        i1(tArr);
    }

    /* JADX INFO: renamed from: b */
    protected abstract void mo5497b(int i2);

    protected <T extends InterfaceC1269y> void b3e(T t2, AbstractC1266n abstractC1266n) {
        try {
            m5512y(t2.getClass()).invoke(null, t2, abstractC1266n);
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e2);
        } catch (IllegalAccessException e3) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e3);
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e4);
        } catch (InvocationTargetException e6) {
            if (!(e6.getCause() instanceof RuntimeException)) {
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e6);
            }
            throw ((RuntimeException) e6.getCause());
        }
    }

    protected void bek6(InterfaceC1269y interfaceC1269y) {
        if (interfaceC1269y == null) {
            gc3c(null);
            return;
        }
        h7am(interfaceC1269y);
        AbstractC1266n abstractC1266nZy = zy();
        b3e(interfaceC1269y, abstractC1266nZy);
        abstractC1266nZy.mo5502k();
    }

    public void bf2(boolean z2, boolean z3) {
    }

    public void bo(byte[] bArr, int i2) {
        mo5497b(i2);
        mo5505u(bArr);
    }

    @hyr(api = 21)
    public void bwp(SizeF sizeF, int i2) {
        mo5497b(i2);
        mo5496a(sizeF != null);
        if (sizeF != null) {
            qo(sizeF.getWidth());
            qo(sizeF.getHeight());
        }
    }

    protected abstract void bz2(IBinder iBinder);

    /* JADX INFO: renamed from: c */
    protected abstract <T extends Parcelable> T mo5498c();

    public void c8jq(byte[] bArr, int i2, int i3, int i4) {
        mo5497b(i4);
        y2(bArr, i2, i3);
    }

    public Bundle cdj(Bundle bundle, int i2) {
        return !fti(i2) ? bundle : mo5500h();
    }

    public void cfr(Parcelable parcelable, int i2) {
        mo5497b(i2);
        sok(parcelable);
    }

    public void ch(boolean[] zArr, int i2) {
        mo5497b(i2);
        m5521x(zArr);
    }

    public void cv06(InterfaceC1269y interfaceC1269y, int i2) {
        mo5497b(i2);
        bek6(interfaceC1269y);
    }

    /* JADX INFO: renamed from: d */
    protected abstract void mo5499d(double d2);

    protected abstract int d2ok();

    protected float[] d3() {
        int iD2ok = d2ok();
        if (iD2ok < 0) {
            return null;
        }
        float[] fArr = new float[iD2ok];
        for (int i2 = 0; i2 < iD2ok; i2++) {
            fArr[i2] = jp0y();
        }
        return fArr;
    }

    public void d8wk(float[] fArr, int i2) {
        mo5497b(i2);
        wo(fArr);
    }

    public int[] dd(int[] iArr, int i2) {
        return !fti(i2) ? iArr : m5519r();
    }

    protected abstract void dr(CharSequence charSequence);

    @hyr(api = 21)
    /* JADX INFO: renamed from: e */
    public Size m5513e(Size size, int i2) {
        if (!fti(i2)) {
            return size;
        }
        if (x2()) {
            return new Size(d2ok(), d2ok());
        }
        return null;
    }

    public IBinder ek5k(IBinder iBinder, int i2) {
        return !fti(i2) ? iBinder : mo5503m();
    }

    protected <T extends InterfaceC1269y> T eqxt(String str, AbstractC1266n abstractC1266n) {
        try {
            return (T) m5509n(str).invoke(null, abstractC1266n);
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e2);
        } catch (IllegalAccessException e3) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e3);
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e4);
        } catch (InvocationTargetException e6) {
            if (e6.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e6.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e6);
        }
    }

    protected void etdu() {
        g1(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public <K, V> Map<K, V> m5514f(Map<K, V> map, int i2) {
        if (!fti(i2)) {
            return map;
        }
        int iD2ok = d2ok();
        if (iD2ok < 0) {
            return null;
        }
        C0247k c0247k = new C0247k();
        if (iD2ok == 0) {
            return c0247k;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        fu4(arrayList);
        fu4(arrayList2);
        for (int i3 = 0; i3 < iD2ok; i3++) {
            c0247k.put(arrayList.get(i3), arrayList2.get(i3));
        }
        return c0247k;
    }

    public char[] fn3e(char[] cArr, int i2) {
        if (!fti(i2)) {
            return cArr;
        }
        int iD2ok = d2ok();
        if (iD2ok < 0) {
            return null;
        }
        char[] cArr2 = new char[iD2ok];
        for (int i3 = 0; i3 < iD2ok; i3++) {
            cArr2[i3] = (char) d2ok();
        }
        return cArr2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void fnq8(Exception exc, int i2) {
        mo5497b(i2);
        if (exc == 0) {
            etdu();
            return;
        }
        int i3 = 0;
        if ((exc instanceof Parcelable) && exc.getClass().getClassLoader() == Parcelable.class.getClassLoader()) {
            i3 = -9;
        } else if (exc instanceof SecurityException) {
            i3 = -1;
        } else if (exc instanceof BadParcelableException) {
            i3 = -2;
        } else if (exc instanceof IllegalArgumentException) {
            i3 = -3;
        } else if (exc instanceof NullPointerException) {
            i3 = -4;
        } else if (exc instanceof IllegalStateException) {
            i3 = -5;
        } else if (exc instanceof NetworkOnMainThreadException) {
            i3 = -6;
        } else if (exc instanceof UnsupportedOperationException) {
            i3 = -7;
        }
        g1(i3);
        if (i3 == 0) {
            if (!(exc instanceof RuntimeException)) {
                throw new RuntimeException(exc);
            }
            throw ((RuntimeException) exc);
        }
        gc3c(exc.getMessage());
        if (i3 != -9) {
            return;
        }
        sok((Parcelable) exc);
    }

    protected abstract boolean fti(int i2);

    protected abstract void g1(int i2);

    protected void gbni(int[] iArr) {
        if (iArr == null) {
            g1(-1);
            return;
        }
        g1(iArr.length);
        for (int i2 : iArr) {
            g1(i2);
        }
    }

    protected abstract void gc3c(String str);

    public float gvn7(float f2, int i2) {
        return !fti(i2) ? f2 : jp0y();
    }

    public void gyi(char[] cArr, int i2) {
        mo5497b(i2);
        if (cArr == null) {
            g1(-1);
            return;
        }
        g1(cArr.length);
        for (char c2 : cArr) {
            g1(c2);
        }
    }

    /* JADX INFO: renamed from: h */
    protected abstract Bundle mo5500h();

    public SparseBooleanArray hb(SparseBooleanArray sparseBooleanArray, int i2) {
        if (!fti(i2)) {
            return sparseBooleanArray;
        }
        int iD2ok = d2ok();
        if (iD2ok < 0) {
            return null;
        }
        SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray(iD2ok);
        for (int i3 = 0; i3 < iD2ok; i3++) {
            sparseBooleanArray2.put(d2ok(), x2());
        }
        return sparseBooleanArray2;
    }

    public long[] hyr(long[] jArr, int i2) {
        return !fti(i2) ? jArr : n5r1();
    }

    /* JADX INFO: renamed from: i */
    public byte[] m5515i(byte[] bArr, int i2) {
        return !fti(i2) ? bArr : t8r();
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected <T> void i1(T[] tArr) {
        if (tArr == 0) {
            g1(-1);
            return;
        }
        int length = tArr.length;
        g1(length);
        if (length > 0) {
            int i2 = 0;
            int iF7l8 = f7l8(tArr[0]);
            g1(iF7l8);
            if (iF7l8 == 1) {
                while (i2 < length) {
                    bek6((InterfaceC1269y) tArr[i2]);
                    i2++;
                }
                return;
            }
            if (iF7l8 == 2) {
                while (i2 < length) {
                    sok((Parcelable) tArr[i2]);
                    i2++;
                }
                return;
            }
            if (iF7l8 == 3) {
                while (i2 < length) {
                    w831((Serializable) tArr[i2]);
                    i2++;
                }
            } else if (iF7l8 == 4) {
                while (i2 < length) {
                    gc3c((String) tArr[i2]);
                    i2++;
                }
            } else {
                if (iF7l8 != 5) {
                    return;
                }
                while (i2 < length) {
                    bz2((IBinder) tArr[i2]);
                    i2++;
                }
            }
        }
    }

    protected abstract void i9jn(long j2);

    /* JADX INFO: renamed from: j */
    protected abstract String mo5501j();

    public Exception jk(Exception exc, int i2) {
        int iA9;
        return (fti(i2) && (iA9 = a9()) != 0) ? mcp(iA9, mo5501j()) : exc;
    }

    protected abstract float jp0y();

    protected abstract void jz5(IInterface iInterface);

    /* JADX INFO: renamed from: k */
    protected abstract void mo5502k();

    @hyr(api = 21)
    public void kcsr(Size size, int i2) {
        mo5497b(i2);
        mo5496a(size != null);
        if (size != null) {
            g1(size.getWidth());
            g1(size.getHeight());
        }
    }

    public byte ki(byte b2, int i2) {
        return !fti(i2) ? b2 : (byte) (d2ok() & 255);
    }

    public boolean[] kja0(boolean[] zArr, int i2) {
        return !fti(i2) ? zArr : n7h();
    }

    public void ktq(IInterface iInterface, int i2) {
        mo5497b(i2);
        jz5(iInterface);
    }

    /* JADX INFO: renamed from: l */
    public long m5516l(long j2, int i2) {
        return !fti(i2) ? j2 : ncyb();
    }

    public <T> T[] ld6(T[] tArr, int i2) {
        return !fti(i2) ? tArr : (T[]) m5518p(tArr);
    }

    public <T extends Parcelable> T lrht(T t2, int i2) {
        return !fti(i2) ? t2 : (T) mo5498c();
    }

    public void ltg8(long j2, int i2) {
        mo5497b(i2);
        i9jn(j2);
    }

    public void lv5(Bundle bundle, int i2) {
        mo5497b(i2);
        nmn5(bundle);
    }

    public int lvui(int i2, int i3) {
        return !fti(i3) ? i2 : d2ok();
    }

    /* JADX INFO: renamed from: m */
    protected abstract IBinder mo5503m();

    public void m4(long[] jArr, int i2) {
        mo5497b(i2);
        r8s8(jArr);
    }

    public void mu(double d2, int i2) {
        mo5497b(i2);
        mo5499d(d2);
    }

    protected long[] n5r1() {
        int iD2ok = d2ok();
        if (iD2ok < 0) {
            return null;
        }
        long[] jArr = new long[iD2ok];
        for (int i2 = 0; i2 < iD2ok; i2++) {
            jArr[i2] = ncyb();
        }
        return jArr;
    }

    protected boolean[] n7h() {
        int iD2ok = d2ok();
        if (iD2ok < 0) {
            return null;
        }
        boolean[] zArr = new boolean[iD2ok];
        for (int i2 = 0; i2 < iD2ok; i2++) {
            zArr[i2] = d2ok() != 0;
        }
        return zArr;
    }

    protected abstract long ncyb();

    public CharSequence ni7(CharSequence charSequence, int i2) {
        return !fti(i2) ? charSequence : zurt();
    }

    protected abstract void nmn5(Bundle bundle);

    @hyr(api = 21)
    public SizeF nn86(SizeF sizeF, int i2) {
        if (!fti(i2)) {
            return sizeF;
        }
        if (x2()) {
            return new SizeF(jp0y(), jp0y());
        }
        return null;
    }

    /* JADX INFO: renamed from: o */
    public String m5517o(String str, int i2) {
        return !fti(i2) ? str : mo5501j();
    }

    public double o1t(double d2, int i2) {
        return !fti(i2) ? d2 : mo5506z();
    }

    public float[] oc(float[] fArr, int i2) {
        return !fti(i2) ? fArr : d3();
    }

    /* JADX INFO: renamed from: p */
    protected <T> T[] m5518p(T[] tArr) {
        int iD2ok = d2ok();
        if (iD2ok < 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(iD2ok);
        if (iD2ok != 0) {
            int iD2ok2 = d2ok();
            if (iD2ok < 0) {
                return null;
            }
            if (iD2ok2 == 1) {
                while (iD2ok > 0) {
                    arrayList.add(yz());
                    iD2ok--;
                }
            } else if (iD2ok2 == 2) {
                while (iD2ok > 0) {
                    arrayList.add(mo5498c());
                    iD2ok--;
                }
            } else if (iD2ok2 == 3) {
                while (iD2ok > 0) {
                    arrayList.add(uv6());
                    iD2ok--;
                }
            } else if (iD2ok2 == 4) {
                while (iD2ok > 0) {
                    arrayList.add(mo5501j());
                    iD2ok--;
                }
            } else if (iD2ok2 == 5) {
                while (iD2ok > 0) {
                    arrayList.add(mo5503m());
                    iD2ok--;
                }
            }
        }
        return (T[]) arrayList.toArray(tArr);
    }

    public <T> void py(List<T> list, int i2) {
        ikck(list, i2);
    }

    public void qkj8(double[] dArr, int i2) {
        mo5497b(i2);
        vq(dArr);
    }

    protected abstract void qo(float f2);

    public boolean qrj(boolean z2, int i2) {
        return !fti(i2) ? z2 : x2();
    }

    /* JADX INFO: renamed from: r */
    protected int[] m5519r() {
        int iD2ok = d2ok();
        if (iD2ok < 0) {
            return null;
        }
        int[] iArr = new int[iD2ok];
        for (int i2 = 0; i2 < iD2ok; i2++) {
            iArr[i2] = d2ok();
        }
        return iArr;
    }

    protected void r8s8(long[] jArr) {
        if (jArr == null) {
            g1(-1);
            return;
        }
        g1(jArr.length);
        for (long j2 : jArr) {
            i9jn(j2);
        }
    }

    /* JADX INFO: renamed from: s */
    public boolean mo5504s() {
        return false;
    }

    public void se(SparseBooleanArray sparseBooleanArray, int i2) {
        mo5497b(i2);
        if (sparseBooleanArray == null) {
            g1(-1);
            return;
        }
        int size = sparseBooleanArray.size();
        g1(size);
        for (int i3 = 0; i3 < size; i3++) {
            g1(sparseBooleanArray.keyAt(i3));
            mo5496a(sparseBooleanArray.valueAt(i3));
        }
    }

    protected abstract void sok(Parcelable parcelable);

    /* JADX INFO: renamed from: t */
    public double[] m5520t(double[] dArr, int i2) {
        return !fti(i2) ? dArr : wvg();
    }

    public void t8iq(byte b2, int i2) {
        mo5497b(i2);
        g1(b2);
    }

    protected abstract byte[] t8r();

    public void tfm(float f2, int i2) {
        mo5497b(i2);
        qo(f2);
    }

    /* JADX INFO: renamed from: u */
    protected abstract void mo5505u(byte[] bArr);

    public void uj2j(IBinder iBinder, int i2) {
        mo5497b(i2);
        bz2(iBinder);
    }

    protected Serializable uv6() {
        String strMo5501j = mo5501j();
        if (strMo5501j == null) {
            return null;
        }
        try {
            return (Serializable) new k(new ByteArrayInputStream(t8r())).readObject();
        } catch (IOException e2) {
            throw new RuntimeException("VersionedParcelable encountered IOException reading a Serializable object (name = " + strMo5501j + ")", e2);
        } catch (ClassNotFoundException e3) {
            throw new RuntimeException("VersionedParcelable encountered ClassNotFoundException reading a Serializable object (name = " + strMo5501j + ")", e3);
        }
    }

    public <K, V> void v0af(Map<K, V> map, int i2) {
        mo5497b(i2);
        if (map == null) {
            g1(-1);
            return;
        }
        int size = map.size();
        g1(size);
        if (size == 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            arrayList.add(entry.getKey());
            arrayList2.add(entry.getValue());
        }
        m5511v(arrayList);
        m5511v(arrayList2);
    }

    protected void vq(double[] dArr) {
        if (dArr == null) {
            g1(-1);
            return;
        }
        g1(dArr.length);
        for (double d2 : dArr) {
            mo5499d(d2);
        }
    }

    public <T> Set<T> vyq(Set<T> set, int i2) {
        return !fti(i2) ? set : (Set) fu4(new androidx.collection.zy());
    }

    public void was(int i2, int i3) {
        mo5497b(i3);
        g1(i2);
    }

    protected void wo(float[] fArr) {
        if (fArr == null) {
            g1(-1);
            return;
        }
        g1(fArr.length);
        for (float f2 : fArr) {
            qo(f2);
        }
    }

    protected double[] wvg() {
        int iD2ok = d2ok();
        if (iD2ok < 0) {
            return null;
        }
        double[] dArr = new double[iD2ok];
        for (int i2 = 0; i2 < iD2ok; i2++) {
            dArr[i2] = mo5506z();
        }
        return dArr;
    }

    /* JADX INFO: renamed from: x */
    protected void m5521x(boolean[] zArr) {
        if (zArr == null) {
            g1(-1);
            return;
        }
        g1(zArr.length);
        for (boolean z2 : zArr) {
            g1(z2 ? 1 : 0);
        }
    }

    protected abstract boolean x2();

    public <T> List<T> x9kr(List<T> list, int i2) {
        return !fti(i2) ? list : (List) fu4(new ArrayList());
    }

    public void xwq3(CharSequence charSequence, int i2) {
        mo5497b(i2);
        dr(charSequence);
    }

    protected abstract void y2(byte[] bArr, int i2, int i3);

    public <T extends InterfaceC1269y> T y9n(T t2, int i2) {
        return !fti(i2) ? t2 : (T) yz();
    }

    public <T> void yqrt(Set<T> set, int i2) {
        ikck(set, i2);
    }

    protected <T extends InterfaceC1269y> T yz() {
        String strMo5501j = mo5501j();
        if (strMo5501j == null) {
            return null;
        }
        return (T) eqxt(strMo5501j, zy());
    }

    /* JADX INFO: renamed from: z */
    protected abstract double mo5506z();

    public void z4(Serializable serializable, int i2) {
        mo5497b(i2);
        w831(serializable);
    }

    public void zkd(String str, int i2) {
        mo5497b(i2);
        gc3c(str);
    }

    public void zp(boolean z2, int i2) {
        mo5497b(i2);
        mo5496a(z2);
    }

    public void zsr0(int[] iArr, int i2) {
        mo5497b(i2);
        gbni(iArr);
    }

    protected abstract CharSequence zurt();

    protected abstract AbstractC1266n zy();
}
