package miuix.appcompat.internal.view;

import android.util.Log;
import android.view.View;
import miuix.internal.util.n7h;
import z4j7.C7797k;
import zy.dd;
import zy.lvui;

/* JADX INFO: renamed from: miuix.appcompat.internal.view.n */
/* JADX INFO: compiled from: ExtraPaddingPolicy.java */
/* JADX INFO: loaded from: classes3.dex */
public class C7040n {

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    public static final int f87073n7h = 28;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    public static final int f87074qrj = 0;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static boolean f87075x2 = true;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private int f87076f7l8;

    /* JADX INFO: renamed from: k */
    private boolean f39580k;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    @dd
    private int[] f87077ld6;

    /* JADX INFO: renamed from: s */
    @lvui
    private int[] f39584s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f87078toq = 0;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private int f87079zy = 0;

    /* JADX INFO: renamed from: q */
    private int f39583q = 0;

    /* JADX INFO: renamed from: n */
    private int f39581n = 0;

    /* JADX INFO: renamed from: g */
    private boolean f39579g = true;

    /* JADX INFO: renamed from: y */
    @lvui
    private int[] f39585y = null;

    /* JADX INFO: renamed from: p */
    @dd
    private int[] f39582p = null;

    /* JADX INFO: renamed from: miuix.appcompat.internal.view.n$k */
    /* JADX INFO: compiled from: ExtraPaddingPolicy.java */
    public static class k {

        /* JADX INFO: renamed from: k */
        C7040n f39586k = new C7040n();

        /* JADX INFO: renamed from: g */
        public k m25387g(int... iArr) {
            this.f39586k.f39582p = iArr;
            return this;
        }

        /* JADX INFO: renamed from: k */
        public C7040n m25388k() {
            return this.f39586k;
        }

        /* JADX INFO: renamed from: n */
        public k m25389n(int... iArr) {
            this.f39586k.f39585y = iArr;
            return this;
        }

        /* JADX INFO: renamed from: q */
        public k m25390q(int... iArr) {
            this.f39586k.f87077ld6 = iArr;
            return this;
        }

        public C7040n toq(int i2) {
            if (i2 == 2) {
                return m25389n(C7797k.f100633toq, C7797k.f100634zy).zy(0, 36, 100).m25387g(C7797k.f100633toq).m25390q(0, 44).m25388k();
            }
            if (i2 == 3) {
                return m25389n(C7797k.f100633toq).zy(0, 28).m25388k();
            }
            return null;
        }

        public k zy(int... iArr) {
            this.f39586k.f39584s = iArr;
            return this;
        }
    }

    C7040n() {
    }

    public int f7l8(boolean z2) {
        int[] iArr;
        int i2 = (this.f39579g || (iArr = this.f87077ld6) == null) ? this.f39584s[this.f87076f7l8] : iArr[this.f87076f7l8];
        return (i2 == 0 || z2) ? i2 : i2 + 28;
    }

    /* JADX INFO: renamed from: g */
    public int m25382g() {
        return f7l8(true);
    }

    public void ld6(boolean z2) {
        this.f39580k = z2;
    }

    /* JADX INFO: renamed from: n */
    public void m25383n(View view) {
        int i2;
        int i3;
        if (this.f39580k) {
            int left = view.getLeft();
            int top = view.getTop();
            int right = view.getRight();
            int bottom = view.getBottom();
            int iM25382g = (int) (m25382g() * (view.getResources().getConfiguration().densityDpi / 160.0f));
            if (n7h.x2(view)) {
                i2 = left - iM25382g;
                i3 = right - iM25382g;
            } else {
                i2 = left + iM25382g;
                i3 = right + iM25382g;
            }
            view.layout(i2, top, i3, bottom);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m25384p(int i2, int i3, int i4, int i5, float f2, boolean z2) {
        if (this.f39583q == i4 && this.f87078toq == i2) {
            return;
        }
        if (f87075x2) {
            Log.d("ExtraPaddingPolicy", "onContainerSizeChanged new Win w = " + i2 + " h = " + i3 + " new C w = " + i4 + " h = " + i5);
            Log.d("ExtraPaddingPolicy", "onContainerSizeChanged old Win w = " + this.f87078toq + " h = " + this.f87079zy + " old C w = " + this.f39583q + " h = " + this.f39581n);
            StringBuilder sb = new StringBuilder();
            sb.append("onContainerSizeChanged density ");
            sb.append(f2);
            sb.append(" isInFloatingWindow = ");
            sb.append(z2);
            Log.d("ExtraPaddingPolicy", sb.toString());
        }
        this.f87078toq = i2;
        this.f87079zy = i3;
        this.f39583q = i4;
        this.f39581n = i5;
        int i6 = 0;
        this.f39579g = (((float) i4) * 1.0f) / (((float) i2) * f2) >= 0.95f || z2;
        if (f87075x2) {
            Log.d("ExtraPaddingPolicy", "onContainerSizeChanged isFullWindow " + this.f39579g);
        }
        if (this.f87079zy <= 550) {
            this.f87076f7l8 = 0;
            return;
        }
        if (this.f39579g || this.f39582p == null) {
            while (true) {
                int[] iArr = this.f39585y;
                if (i6 >= iArr.length) {
                    return;
                }
                int i7 = (int) (iArr[i6] * f2);
                if (i6 == 0 && i4 < i7) {
                    this.f87076f7l8 = i6;
                    return;
                } else if (i4 <= i7) {
                    this.f87076f7l8 = i6;
                    return;
                } else {
                    if (i6 == iArr.length - 1) {
                        this.f87076f7l8 = i6 + 1;
                    }
                    i6++;
                }
            }
        } else {
            while (true) {
                int[] iArr2 = this.f39582p;
                if (i6 >= iArr2.length) {
                    return;
                }
                int i8 = (int) (iArr2[i6] * f2);
                if (i6 == 0 && i4 < i8) {
                    this.f87076f7l8 = i6;
                    return;
                } else if (i4 <= i8) {
                    this.f87076f7l8 = i6;
                    return;
                } else {
                    if (i6 == iArr2.length - 1) {
                        this.f87076f7l8 = i6 + 1;
                    }
                    i6++;
                }
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public boolean m25385s() {
        return this.f39580k;
    }

    /* JADX INFO: renamed from: y */
    public int m25386y() {
        return this.f87076f7l8;
    }
}
