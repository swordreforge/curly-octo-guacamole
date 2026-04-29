package com.miui.miwallpaper.material.palette;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.AsyncTask;
import android.util.ArrayMap;
import android.util.Log;
import android.util.SparseBooleanArray;
import androidx.core.graphics.C0541p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import zy.dd;
import zy.lvui;
import zy.x2;

/* JADX INFO: compiled from: Palette.java */
/* JADX INFO: loaded from: classes3.dex */
public final class toq {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    static final int f72162f7l8 = 16;

    /* JADX INFO: renamed from: g */
    static final int f29523g = 12544;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    static final boolean f72163ld6 = false;

    /* JADX INFO: renamed from: p */
    static final String f29524p = "Palette";

    /* JADX INFO: renamed from: s */
    static final float f29525s = 4.5f;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final zy f72164x2 = new C5278k();

    /* JADX INFO: renamed from: y */
    static final float f29526y = 3.0f;

    /* JADX INFO: renamed from: k */
    private final List<C5279n> f29527k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final List<com.miui.miwallpaper.material.palette.zy> f72165toq;

    /* JADX INFO: renamed from: q */
    private final SparseBooleanArray f29529q = new SparseBooleanArray();

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final Map<com.miui.miwallpaper.material.palette.zy, C5279n> f72166zy = new ArrayMap();

    /* JADX INFO: renamed from: n */
    private final C5279n f29528n = toq();

    /* JADX INFO: renamed from: com.miui.miwallpaper.material.palette.toq$k */
    /* JADX INFO: compiled from: Palette.java */
    class C5278k implements zy {

        /* JADX INFO: renamed from: k */
        private static final float f29530k = 0.05f;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private static final float f72167toq = 0.95f;

        C5278k() {
        }

        /* JADX INFO: renamed from: q */
        private boolean m17923q(float[] fArr) {
            return fArr[2] >= f72167toq;
        }

        private boolean toq(float[] fArr) {
            return fArr[2] <= f29530k;
        }

        private boolean zy(float[] fArr) {
            float f2 = fArr[0];
            return f2 >= 10.0f && f2 <= 37.0f && fArr[1] <= 0.82f;
        }

        @Override // com.miui.miwallpaper.material.palette.toq.zy
        /* JADX INFO: renamed from: k */
        public boolean mo17924k(int i2, float[] fArr) {
            return (m17923q(fArr) || toq(fArr) || zy(fArr)) ? false : true;
        }
    }

    /* JADX INFO: renamed from: com.miui.miwallpaper.material.palette.toq$q */
    /* JADX INFO: compiled from: Palette.java */
    public interface InterfaceC5280q {
        /* JADX INFO: renamed from: k */
        void m17929k(@lvui toq toqVar);
    }

    /* JADX INFO: compiled from: Palette.java */
    public interface zy {
        /* JADX INFO: renamed from: k */
        boolean mo17924k(@x2 int i2, @lvui float[] fArr);
    }

    toq(List<C5279n> list, List<com.miui.miwallpaper.material.palette.zy> list2) {
        this.f29527k = list;
        this.f72165toq = list2;
    }

    private boolean a9(C5279n c5279n, com.miui.miwallpaper.material.palette.zy zyVar) {
        float[] fArrZy = c5279n.zy();
        return fArrZy[1] >= zyVar.m17941n() && fArrZy[1] <= zyVar.zy() && fArrZy[2] >= zyVar.m17943q() && fArrZy[2] <= zyVar.toq() && !this.f29529q.get(c5279n.m17927n());
    }

    @Deprecated
    /* JADX INFO: renamed from: g */
    public static toq m17912g(Bitmap bitmap, int i2) {
        return zy(bitmap).m17936s(i2).f7l8();
    }

    /* JADX INFO: renamed from: k */
    private static float[] m17913k(C5279n c5279n) {
        float[] fArr = new float[3];
        System.arraycopy(c5279n.zy(), 0, fArr, 0, 3);
        return fArr;
    }

    private C5279n ld6(com.miui.miwallpaper.material.palette.zy zyVar) {
        C5279n c5279nNi7 = ni7(zyVar);
        if (c5279nNi7 != null && zyVar.m17942p()) {
            this.f29529q.append(c5279nNi7.m17927n(), true);
        }
        return c5279nNi7;
    }

    @Deprecated
    /* JADX INFO: renamed from: n */
    public static toq m17914n(Bitmap bitmap) {
        return zy(bitmap).f7l8();
    }

    private C5279n ni7(com.miui.miwallpaper.material.palette.zy zyVar) {
        int size = this.f29527k.size();
        float f2 = 0.0f;
        C5279n c5279n = null;
        for (int i2 = 0; i2 < size; i2++) {
            C5279n c5279n2 = this.f29527k.get(i2);
            if (a9(c5279n2, zyVar)) {
                float fM17915p = m17915p(c5279n2, zyVar);
                if (c5279n == null || fM17915p > f2) {
                    c5279n = c5279n2;
                    f2 = fM17915p;
                }
            }
        }
        return c5279n;
    }

    /* JADX INFO: renamed from: p */
    private float m17915p(C5279n c5279n, com.miui.miwallpaper.material.palette.zy zyVar) {
        float[] fArrZy = c5279n.zy();
        C5279n c5279n2 = this.f29528n;
        return (zyVar.f7l8() > 0.0f ? zyVar.f7l8() * (1.0f - Math.abs(fArrZy[1] - zyVar.m17944s())) : 0.0f) + (zyVar.m17940k() > 0.0f ? zyVar.m17940k() * (1.0f - Math.abs(fArrZy[2] - zyVar.m17945y())) : 0.0f) + (zyVar.m17939g() > 0.0f ? zyVar.m17939g() * (c5279n.m17928q() / (c5279n2 != null ? c5279n2.m17928q() : 1)) : 0.0f);
    }

    @lvui
    /* JADX INFO: renamed from: q */
    public static toq m17916q(@lvui List<C5279n> list) {
        return new C8029toq(list).f7l8();
    }

    @Deprecated
    /* JADX INFO: renamed from: s */
    public static AsyncTask<Bitmap, Void, toq> m17917s(Bitmap bitmap, InterfaceC5280q interfaceC5280q) {
        return zy(bitmap).m17931g(interfaceC5280q);
    }

    private C5279n toq() {
        int size = this.f29527k.size();
        int iM17928q = Integer.MIN_VALUE;
        C5279n c5279n = null;
        for (int i2 = 0; i2 < size; i2++) {
            C5279n c5279n2 = this.f29527k.get(i2);
            if (c5279n2.m17928q() > iM17928q) {
                iM17928q = c5279n2.m17928q();
                c5279n = c5279n2;
            }
        }
        return c5279n;
    }

    @Deprecated
    /* JADX INFO: renamed from: y */
    public static AsyncTask<Bitmap, Void, toq> m17918y(Bitmap bitmap, int i2, InterfaceC5280q interfaceC5280q) {
        return zy(bitmap).m17936s(i2).m17931g(interfaceC5280q);
    }

    @lvui
    public static C8029toq zy(@lvui Bitmap bitmap) {
        return new C8029toq(bitmap);
    }

    @x2
    public int cdj(@x2 int i2) {
        C5279n c5279n = this.f29528n;
        return c5279n != null ? c5279n.m17927n() : i2;
    }

    void f7l8() {
        int size = this.f72165toq.size();
        for (int i2 = 0; i2 < size; i2++) {
            com.miui.miwallpaper.material.palette.zy zyVar = this.f72165toq.get(i2);
            zyVar.ld6();
            this.f72166zy.put(zyVar, ld6(zyVar));
        }
        this.f29529q.clear();
    }

    @x2
    public int fn3e(@x2 int i2) {
        return x2(com.miui.miwallpaper.material.palette.zy.f29551z, i2);
    }

    @x2
    public int fu4(@x2 int i2) {
        return x2(com.miui.miwallpaper.material.palette.zy.f72183mcp, i2);
    }

    @dd
    /* JADX INFO: renamed from: h */
    public C5279n m17919h() {
        return o1t(com.miui.miwallpaper.material.palette.zy.f72189wvg);
    }

    @dd
    /* JADX INFO: renamed from: i */
    public C5279n m17920i() {
        return o1t(com.miui.miwallpaper.material.palette.zy.f29549t);
    }

    @dd
    public C5279n jk() {
        return o1t(com.miui.miwallpaper.material.palette.zy.f72186o1t);
    }

    @dd
    public C5279n ki() {
        return this.f29528n;
    }

    @x2
    public int kja0(@x2 int i2) {
        return x2(com.miui.miwallpaper.material.palette.zy.f72189wvg, i2);
    }

    @x2
    public int mcp(@x2 int i2) {
        return x2(com.miui.miwallpaper.material.palette.zy.f72186o1t, i2);
    }

    @dd
    public C5279n n7h() {
        return o1t(com.miui.miwallpaper.material.palette.zy.f72179jk);
    }

    @dd
    public C5279n o1t(@lvui com.miui.miwallpaper.material.palette.zy zyVar) {
        return this.f72166zy.get(zyVar);
    }

    @x2
    public int qrj(@x2 int i2) {
        return x2(com.miui.miwallpaper.material.palette.zy.f72179jk, i2);
    }

    @lvui
    /* JADX INFO: renamed from: t */
    public List<com.miui.miwallpaper.material.palette.zy> m17921t() {
        return Collections.unmodifiableList(this.f72165toq);
    }

    @x2
    public int t8r(@x2 int i2) {
        return x2(com.miui.miwallpaper.material.palette.zy.f29549t, i2);
    }

    @lvui
    public List<C5279n> wvg() {
        return Collections.unmodifiableList(this.f29527k);
    }

    @x2
    public int x2(@lvui com.miui.miwallpaper.material.palette.zy zyVar, @x2 int i2) {
        C5279n c5279nO1t = o1t(zyVar);
        return c5279nO1t != null ? c5279nO1t.m17927n() : i2;
    }

    @dd
    /* JADX INFO: renamed from: z */
    public C5279n m17922z() {
        return o1t(com.miui.miwallpaper.material.palette.zy.f72183mcp);
    }

    @dd
    public C5279n zurt() {
        return o1t(com.miui.miwallpaper.material.palette.zy.f29551z);
    }

    /* JADX INFO: renamed from: com.miui.miwallpaper.material.palette.toq$n */
    /* JADX INFO: compiled from: Palette.java */
    public static final class C5279n {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private int f72168f7l8;

        /* JADX INFO: renamed from: g */
        private boolean f29531g;

        /* JADX INFO: renamed from: k */
        private final int f29532k;

        /* JADX INFO: renamed from: n */
        private final int f29533n;

        /* JADX INFO: renamed from: q */
        private final int f29534q;

        /* JADX INFO: renamed from: s */
        private float[] f29535s;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final int f72169toq;

        /* JADX INFO: renamed from: y */
        private int f29536y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final int f72170zy;

        public C5279n(@x2 int i2, int i3) {
            this.f29532k = Color.red(i2);
            this.f72169toq = Color.green(i2);
            this.f72170zy = Color.blue(i2);
            this.f29534q = i2;
            this.f29533n = i3;
        }

        /* JADX INFO: renamed from: k */
        private void m17925k() {
            if (this.f29531g) {
                return;
            }
            int iN7h = C0541p.n7h(-1, this.f29534q, toq.f29525s);
            int iN7h2 = C0541p.n7h(-1, this.f29534q, toq.f29526y);
            if (iN7h != -1 && iN7h2 != -1) {
                this.f29536y = C0541p.m2542t(-1, iN7h);
                this.f72168f7l8 = C0541p.m2542t(-1, iN7h2);
                this.f29531g = true;
                return;
            }
            int iN7h3 = C0541p.n7h(-16777216, this.f29534q, toq.f29525s);
            int iN7h4 = C0541p.n7h(-16777216, this.f29534q, toq.f29526y);
            if (iN7h3 == -1 || iN7h4 == -1) {
                this.f29536y = iN7h != -1 ? C0541p.m2542t(-1, iN7h) : C0541p.m2542t(-16777216, iN7h3);
                this.f72168f7l8 = iN7h2 != -1 ? C0541p.m2542t(-1, iN7h2) : C0541p.m2542t(-16777216, iN7h4);
                this.f29531g = true;
            } else {
                this.f29536y = C0541p.m2542t(-16777216, iN7h3);
                this.f72168f7l8 = C0541p.m2542t(-16777216, iN7h4);
                this.f29531g = true;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C5279n.class != obj.getClass()) {
                return false;
            }
            C5279n c5279n = (C5279n) obj;
            return this.f29533n == c5279n.f29533n && this.f29534q == c5279n.f29534q;
        }

        @x2
        /* JADX INFO: renamed from: g */
        public int m17926g() {
            m17925k();
            return this.f72168f7l8;
        }

        public int hashCode() {
            return (this.f29534q * 31) + this.f29533n;
        }

        @x2
        /* JADX INFO: renamed from: n */
        public int m17927n() {
            return this.f29534q;
        }

        /* JADX INFO: renamed from: q */
        public int m17928q() {
            return this.f29533n;
        }

        public String toString() {
            return C5279n.class.getSimpleName() + " [RGB: #" + Integer.toHexString(m17927n()) + "] [HSL: " + Arrays.toString(zy()) + "] [Population: " + this.f29533n + "] [Title Text: #" + Integer.toHexString(m17926g()) + "] [Body Text: #" + Integer.toHexString(toq()) + ']';
        }

        @x2
        public int toq() {
            m17925k();
            return this.f29536y;
        }

        @lvui
        public float[] zy() {
            if (this.f29535s == null) {
                this.f29535s = new float[3];
            }
            C0541p.m2540q(this.f29532k, this.f72169toq, this.f72170zy, this.f29535s);
            return this.f29535s;
        }

        C5279n(int i2, int i3, int i4, int i5) {
            this.f29532k = i2;
            this.f72169toq = i3;
            this.f72170zy = i4;
            this.f29534q = Color.rgb(i2, i3, i4);
            this.f29533n = i5;
        }

        C5279n(float[] fArr, int i2) {
            this(C0541p.m2537k(fArr), i2);
            this.f29535s = fArr;
        }
    }

    /* JADX INFO: renamed from: com.miui.miwallpaper.material.palette.toq$toq, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Palette.java */
    public static final class C8029toq {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private final List<zy> f72171f7l8;

        /* JADX INFO: renamed from: g */
        private int f29537g;

        /* JADX INFO: renamed from: k */
        private final List<C5279n> f29538k;

        /* JADX INFO: renamed from: n */
        private int f29539n;

        /* JADX INFO: renamed from: q */
        private int f29540q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final Bitmap f72172toq;

        /* JADX INFO: renamed from: y */
        private Rect f29541y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final List<com.miui.miwallpaper.material.palette.zy> f72173zy;

        /* JADX INFO: renamed from: com.miui.miwallpaper.material.palette.toq$toq$k */
        /* JADX INFO: compiled from: Palette.java */
        class AsyncTaskC5281k extends AsyncTask<Bitmap, Void, toq> {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ InterfaceC5280q f29542k;

            AsyncTaskC5281k(InterfaceC5280q interfaceC5280q) {
                this.f29542k = interfaceC5280q;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public toq doInBackground(Bitmap... bitmapArr) {
                try {
                    return C8029toq.this.f7l8();
                } catch (Exception e2) {
                    Log.e(toq.f29524p, "Exception thrown during async generate", e2);
                    return null;
                }
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
            public void onPostExecute(toq toqVar) {
                this.f29542k.m17929k(toqVar);
            }
        }

        public C8029toq(@lvui Bitmap bitmap) {
            ArrayList arrayList = new ArrayList();
            this.f72173zy = arrayList;
            this.f29540q = 16;
            this.f29539n = 12544;
            this.f29537g = -1;
            this.f72171f7l8 = new ArrayList();
            if (bitmap == null || bitmap.isRecycled()) {
                throw new IllegalArgumentException("Bitmap is not valid");
            }
            this.f72172toq = bitmap;
            this.f29538k = null;
            arrayList.add(com.miui.miwallpaper.material.palette.zy.f29551z);
            arrayList.add(com.miui.miwallpaper.material.palette.zy.f72186o1t);
            arrayList.add(com.miui.miwallpaper.material.palette.zy.f72189wvg);
            arrayList.add(com.miui.miwallpaper.material.palette.zy.f29549t);
            arrayList.add(com.miui.miwallpaper.material.palette.zy.f72183mcp);
            arrayList.add(com.miui.miwallpaper.material.palette.zy.f72179jk);
        }

        private Bitmap x2(Bitmap bitmap) {
            int iMax;
            int i2;
            double dSqrt = -1.0d;
            if (this.f29539n > 0) {
                int width = bitmap.getWidth() * bitmap.getHeight();
                int i3 = this.f29539n;
                if (width > i3) {
                    dSqrt = Math.sqrt(((double) i3) / ((double) width));
                }
            } else if (this.f29537g > 0 && (iMax = Math.max(bitmap.getWidth(), bitmap.getHeight())) > (i2 = this.f29537g)) {
                dSqrt = ((double) i2) / ((double) iMax);
            }
            return dSqrt <= 0.0d ? bitmap : Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * dSqrt), (int) Math.ceil(((double) bitmap.getHeight()) * dSqrt), false);
        }

        /* JADX INFO: renamed from: y */
        private int[] m17930y(Bitmap bitmap) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int[] iArr = new int[width * height];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            Rect rect = this.f29541y;
            if (rect == null) {
                return iArr;
            }
            int iWidth = rect.width();
            int iHeight = this.f29541y.height();
            int[] iArr2 = new int[iWidth * iHeight];
            for (int i2 = 0; i2 < iHeight; i2++) {
                Rect rect2 = this.f29541y;
                System.arraycopy(iArr, ((rect2.top + i2) * width) + rect2.left, iArr2, i2 * iWidth, iWidth);
            }
            return iArr2;
        }

        @lvui
        public toq f7l8() {
            List<C5279n> listM17905q;
            zy[] zyVarArr;
            Bitmap bitmap = this.f72172toq;
            if (bitmap != null) {
                Bitmap bitmapX2 = x2(bitmap);
                Rect rect = this.f29541y;
                if (bitmapX2 != this.f72172toq && rect != null) {
                    double width = ((double) bitmapX2.getWidth()) / ((double) this.f72172toq.getWidth());
                    rect.left = (int) Math.floor(((double) rect.left) * width);
                    rect.top = (int) Math.floor(((double) rect.top) * width);
                    rect.right = Math.min((int) Math.ceil(((double) rect.right) * width), bitmapX2.getWidth());
                    rect.bottom = Math.min((int) Math.ceil(((double) rect.bottom) * width), bitmapX2.getHeight());
                }
                int[] iArrM17930y = m17930y(bitmapX2);
                int i2 = this.f29540q;
                if (this.f72171f7l8.isEmpty()) {
                    zyVarArr = null;
                } else {
                    List<zy> list = this.f72171f7l8;
                    zyVarArr = (zy[]) list.toArray(new zy[list.size()]);
                }
                C5277k c5277k = new C5277k(iArrM17930y, i2, zyVarArr);
                if (bitmapX2 != this.f72172toq) {
                    bitmapX2.recycle();
                }
                listM17905q = c5277k.m17905q();
            } else {
                listM17905q = this.f29538k;
            }
            toq toqVar = new toq(listM17905q, this.f72173zy);
            toqVar.f7l8();
            return toqVar;
        }

        @lvui
        /* JADX INFO: renamed from: g */
        public AsyncTask<Bitmap, Void, toq> m17931g(@lvui InterfaceC5280q interfaceC5280q) {
            if (interfaceC5280q != null) {
                return new AsyncTaskC5281k(interfaceC5280q).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, this.f72172toq);
            }
            throw new IllegalArgumentException("listener can not be null");
        }

        @lvui
        /* JADX INFO: renamed from: k */
        public C8029toq m17932k(zy zyVar) {
            if (zyVar != null) {
                this.f72171f7l8.add(zyVar);
            }
            return this;
        }

        @lvui
        @Deprecated
        public C8029toq ld6(int i2) {
            this.f29537g = i2;
            this.f29539n = -1;
            return this;
        }

        @lvui
        /* JADX INFO: renamed from: n */
        public C8029toq m17933n() {
            List<com.miui.miwallpaper.material.palette.zy> list = this.f72173zy;
            if (list != null) {
                list.clear();
            }
            return this;
        }

        @lvui
        /* JADX INFO: renamed from: p */
        public C8029toq m17934p(int i2) {
            this.f29539n = i2;
            this.f29537g = -1;
            return this;
        }

        @lvui
        /* JADX INFO: renamed from: q */
        public C8029toq m17935q() {
            this.f29541y = null;
            return this;
        }

        @lvui
        public C8029toq qrj(int i2, int i3, int i4, int i5) {
            if (this.f72172toq != null) {
                if (this.f29541y == null) {
                    this.f29541y = new Rect();
                }
                this.f29541y.set(0, 0, this.f72172toq.getWidth(), this.f72172toq.getHeight());
                if (!this.f29541y.intersect(i2, i3, i4, i5)) {
                    throw new IllegalArgumentException("The given region must intersect with the Bitmap's dimensions.");
                }
            }
            return this;
        }

        @lvui
        /* JADX INFO: renamed from: s */
        public C8029toq m17936s(int i2) {
            this.f29540q = i2;
            return this;
        }

        @lvui
        public C8029toq toq(@lvui com.miui.miwallpaper.material.palette.zy zyVar) {
            if (!this.f72173zy.contains(zyVar)) {
                this.f72173zy.add(zyVar);
            }
            return this;
        }

        @lvui
        public C8029toq zy() {
            this.f72171f7l8.clear();
            return this;
        }

        public C8029toq(@lvui List<C5279n> list) {
            this.f72173zy = new ArrayList();
            this.f29540q = 16;
            this.f29539n = 12544;
            this.f29537g = -1;
            ArrayList arrayList = new ArrayList();
            this.f72171f7l8 = arrayList;
            if (list != null && !list.isEmpty()) {
                arrayList.add(toq.f72164x2);
                this.f29538k = list;
                this.f72172toq = null;
                return;
            }
            throw new IllegalArgumentException("List of Swatches is not valid");
        }
    }
}
