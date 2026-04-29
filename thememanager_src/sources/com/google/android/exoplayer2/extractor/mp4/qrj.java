package com.google.android.exoplayer2.extractor.mp4;

import com.google.android.exoplayer2.extractor.fu4;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.SlowMotionData;
import com.google.android.exoplayer2.sok;
import com.google.android.exoplayer2.util.gvn7;
import com.google.common.base.d3;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: SefReader.java */
/* JADX INFO: loaded from: classes2.dex */
final class qrj {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private static final int f64272cdj = 12;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final int f64273f7l8 = 3;

    /* JADX INFO: renamed from: g */
    private static final int f20053g = 2;

    /* JADX INFO: renamed from: h */
    private static final int f20054h = 8;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private static final int f64275kja0 = 12;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final int f64276ld6 = 2819;

    /* JADX INFO: renamed from: n */
    private static final int f20055n = 1;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static final int f64277n7h = 1397048916;

    /* JADX INFO: renamed from: p */
    private static final int f20056p = 2817;

    /* JADX INFO: renamed from: q */
    private static final int f20057q = 0;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final String f64278qrj = "SefReader";

    /* JADX INFO: renamed from: s */
    private static final int f20058s = 2816;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final int f64280x2 = 2820;

    /* JADX INFO: renamed from: y */
    private static final int f20059y = 2192;

    /* JADX INFO: renamed from: k */
    private final List<C3379k> f20060k = new ArrayList();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f64281toq = 0;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private int f64282zy;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private static final d3 f64274ki = d3.m15307y(':');

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private static final d3 f64279t8r = d3.m15307y('*');

    /* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.mp4.qrj$k */
    /* JADX INFO: compiled from: SefReader.java */
    private static final class C3379k {

        /* JADX INFO: renamed from: k */
        public final int f20061k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public final long f64283toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public final int f64284zy;

        public C3379k(int i2, long j2, int i3) {
            this.f20061k = i2;
            this.f64283toq = j2;
            this.f64284zy = i3;
        }
    }

    /* JADX INFO: renamed from: g */
    private static SlowMotionData m11865g(gvn7 gvn7Var, int i2) throws sok {
        ArrayList arrayList = new ArrayList();
        List<String> listKja0 = f64279t8r.kja0(gvn7Var.jk(i2));
        for (int i3 = 0; i3 < listKja0.size(); i3++) {
            List<String> listKja02 = f64274ki.kja0(listKja0.get(i3));
            if (listKja02.size() != 3) {
                throw sok.createForMalformedContainer(null, null);
            }
            try {
                arrayList.add(new SlowMotionData.Segment(Long.parseLong(listKja02.get(0)), Long.parseLong(listKja02.get(1)), 1 << (Integer.parseInt(listKja02.get(2)) - 1)));
            } catch (NumberFormatException e2) {
                throw sok.createForMalformedContainer(null, e2);
            }
        }
        return new SlowMotionData(arrayList);
    }

    /* JADX INFO: renamed from: k */
    private void m11866k(com.google.android.exoplayer2.extractor.ld6 ld6Var, fu4 fu4Var) throws IOException {
        gvn7 gvn7Var = new gvn7(8);
        ld6Var.readFully(gvn7Var.m13598q(), 0, 8);
        this.f64282zy = gvn7Var.ki() + 8;
        if (gvn7Var.kja0() != f64277n7h) {
            fu4Var.f19818k = 0L;
        } else {
            fu4Var.f19818k = ld6Var.getPosition() - ((long) (this.f64282zy - 12));
            this.f64281toq = 2;
        }
    }

    /* JADX INFO: renamed from: n */
    private void m11867n(com.google.android.exoplayer2.extractor.ld6 ld6Var, List<Metadata.Entry> list) throws IOException {
        long position = ld6Var.getPosition();
        int length = (int) ((ld6Var.getLength() - ld6Var.getPosition()) - ((long) this.f64282zy));
        gvn7 gvn7Var = new gvn7(length);
        ld6Var.readFully(gvn7Var.m13598q(), 0, length);
        for (int i2 = 0; i2 < this.f20060k.size(); i2++) {
            C3379k c3379k = this.f20060k.get(i2);
            gvn7Var.n5r1((int) (c3379k.f64283toq - position));
            gvn7Var.hyr(4);
            int iKi = gvn7Var.ki();
            int qVar = toq(gvn7Var.jk(iKi));
            int i3 = c3379k.f64284zy - (iKi + 8);
            if (qVar == f20059y) {
                list.add(m11865g(gvn7Var, i3));
            } else if (qVar != f20058s && qVar != f20056p && qVar != f64276ld6 && qVar != f64280x2) {
                throw new IllegalStateException();
            }
        }
    }

    /* JADX INFO: renamed from: q */
    private void m11868q(com.google.android.exoplayer2.extractor.ld6 ld6Var, fu4 fu4Var) throws IOException {
        long length = ld6Var.getLength();
        int i2 = (this.f64282zy - 12) - 8;
        gvn7 gvn7Var = new gvn7(i2);
        ld6Var.readFully(gvn7Var.m13598q(), 0, i2);
        for (int i3 = 0; i3 < i2 / 12; i3++) {
            gvn7Var.hyr(2);
            short sFn3e = gvn7Var.fn3e();
            if (sFn3e == f20059y || sFn3e == f20058s || sFn3e == f20056p || sFn3e == f64276ld6 || sFn3e == f64280x2) {
                this.f20060k.add(new C3379k(sFn3e, (length - ((long) this.f64282zy)) - ((long) gvn7Var.ki()), gvn7Var.ki()));
            } else {
                gvn7Var.hyr(8);
            }
        }
        if (this.f20060k.isEmpty()) {
            fu4Var.f19818k = 0L;
        } else {
            this.f64281toq = 3;
            fu4Var.f19818k = this.f20060k.get(0).f64283toq;
        }
    }

    private static int toq(String str) throws sok {
        str.hashCode();
        switch (str) {
            case "SlowMotion_Data":
                return f20059y;
            case "Super_SlowMotion_Edit_Data":
                return f64276ld6;
            case "Super_SlowMotion_Data":
                return f20058s;
            case "Super_SlowMotion_Deflickering_On":
                return f64280x2;
            case "Super_SlowMotion_BGM":
                return f20056p;
            default:
                throw sok.createForMalformedContainer("Invalid SEF name", null);
        }
    }

    public void f7l8() {
        this.f20060k.clear();
        this.f64281toq = 0;
    }

    public int zy(com.google.android.exoplayer2.extractor.ld6 ld6Var, fu4 fu4Var, List<Metadata.Entry> list) throws IOException {
        int i2 = this.f64281toq;
        long j2 = 0;
        if (i2 == 0) {
            long length = ld6Var.getLength();
            if (length != -1 && length >= 8) {
                j2 = length - 8;
            }
            fu4Var.f19818k = j2;
            this.f64281toq = 1;
        } else if (i2 == 1) {
            m11866k(ld6Var, fu4Var);
        } else if (i2 == 2) {
            m11868q(ld6Var, fu4Var);
        } else {
            if (i2 != 3) {
                throw new IllegalStateException();
            }
            m11867n(ld6Var, list);
            fu4Var.f19818k = 0L;
        }
        return 1;
    }
}
