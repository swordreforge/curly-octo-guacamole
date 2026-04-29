package androidx.recyclerview.widget;

import android.view.View;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: ViewBoundsCheck.java */
/* JADX INFO: loaded from: classes.dex */
class dd {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    static final int f52108cdj = 1024;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    static final int f52109f7l8 = 1;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    static final int f52110fn3e = 16384;

    /* JADX INFO: renamed from: g */
    static final int f5840g = 0;

    /* JADX INFO: renamed from: h */
    static final int f5841h = 512;

    /* JADX INFO: renamed from: i */
    static final int f5842i = 8192;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    static final int f52111ki = 12;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    static final int f52112kja0 = 256;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    static final int f52113ld6 = 16;

    /* JADX INFO: renamed from: n */
    static final int f5843n = 4;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    static final int f52114n7h = 8;

    /* JADX INFO: renamed from: p */
    static final int f5844p = 4;

    /* JADX INFO: renamed from: q */
    static final int f5845q = 2;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    static final int f52115qrj = 64;

    /* JADX INFO: renamed from: s */
    static final int f5846s = 4;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    static final int f52116t8r = 4096;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    static final int f52117x2 = 32;

    /* JADX INFO: renamed from: y */
    static final int f5847y = 2;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    static final int f52118zurt = 7;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    static final int f52119zy = 1;

    /* JADX INFO: renamed from: k */
    final toq f5848k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    C1075k f52120toq = new C1075k();

    /* JADX INFO: renamed from: androidx.recyclerview.widget.dd$k */
    /* JADX INFO: compiled from: ViewBoundsCheck.java */
    static class C1075k {

        /* JADX INFO: renamed from: k */
        int f5849k = 0;

        /* JADX INFO: renamed from: n */
        int f5850n;

        /* JADX INFO: renamed from: q */
        int f5851q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        int f52121toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        int f52122zy;

        C1075k() {
        }

        /* JADX INFO: renamed from: k */
        void m4959k(int i2) {
            this.f5849k = i2 | this.f5849k;
        }

        /* JADX INFO: renamed from: n */
        void m4960n(int i2, int i3, int i4, int i5) {
            this.f52121toq = i2;
            this.f52122zy = i3;
            this.f5851q = i4;
            this.f5850n = i5;
        }

        /* JADX INFO: renamed from: q */
        void m4961q() {
            this.f5849k = 0;
        }

        boolean toq() {
            int i2 = this.f5849k;
            if ((i2 & 7) != 0 && (i2 & (zy(this.f5851q, this.f52121toq) << 0)) == 0) {
                return false;
            }
            int i3 = this.f5849k;
            if ((i3 & 112) != 0 && (i3 & (zy(this.f5851q, this.f52122zy) << 4)) == 0) {
                return false;
            }
            int i4 = this.f5849k;
            if ((i4 & 1792) != 0 && (i4 & (zy(this.f5850n, this.f52121toq) << 8)) == 0) {
                return false;
            }
            int i5 = this.f5849k;
            return (i5 & miuix.pickerwidget.date.zy.f87990t8r) == 0 || (i5 & (zy(this.f5850n, this.f52122zy) << 12)) != 0;
        }

        int zy(int i2, int i3) {
            if (i2 > i3) {
                return 1;
            }
            return i2 == i3 ? 2 : 4;
        }
    }

    /* JADX INFO: compiled from: ViewBoundsCheck.java */
    interface toq {
        /* JADX INFO: renamed from: k */
        View mo4808k(int i2);

        /* JADX INFO: renamed from: n */
        int mo4809n(View view);

        /* JADX INFO: renamed from: q */
        int mo4810q();

        int toq(View view);

        int zy();
    }

    /* JADX INFO: compiled from: ViewBoundsCheck.java */
    @Retention(RetentionPolicy.SOURCE)
    public @interface zy {
    }

    dd(toq toqVar) {
        this.f5848k = toqVar;
    }

    /* JADX INFO: renamed from: k */
    View m4958k(int i2, int i3, int i4, int i5) {
        int iZy = this.f5848k.zy();
        int iMo4810q = this.f5848k.mo4810q();
        int i6 = i3 > i2 ? 1 : -1;
        View view = null;
        while (i2 != i3) {
            View viewMo4808k = this.f5848k.mo4808k(i2);
            this.f52120toq.m4960n(iZy, iMo4810q, this.f5848k.toq(viewMo4808k), this.f5848k.mo4809n(viewMo4808k));
            if (i4 != 0) {
                this.f52120toq.m4961q();
                this.f52120toq.m4959k(i4);
                if (this.f52120toq.toq()) {
                    return viewMo4808k;
                }
            }
            if (i5 != 0) {
                this.f52120toq.m4961q();
                this.f52120toq.m4959k(i5);
                if (this.f52120toq.toq()) {
                    view = viewMo4808k;
                }
            }
            i2 += i6;
        }
        return view;
    }

    boolean toq(View view, int i2) {
        this.f52120toq.m4960n(this.f5848k.zy(), this.f5848k.mo4810q(), this.f5848k.toq(view), this.f5848k.mo4809n(view));
        if (i2 == 0) {
            return false;
        }
        this.f52120toq.m4961q();
        this.f52120toq.m4959k(i2);
        return this.f52120toq.toq();
    }
}
