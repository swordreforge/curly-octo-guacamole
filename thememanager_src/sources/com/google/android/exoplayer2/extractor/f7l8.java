package com.google.android.exoplayer2.extractor;

import android.net.Uri;
import com.google.android.exoplayer2.extractor.flac.C3340n;
import com.google.android.exoplayer2.extractor.jpeg.C3351k;
import com.google.android.exoplayer2.extractor.mkv.C3358n;
import com.google.android.exoplayer2.extractor.mp3.C3363g;
import com.google.android.exoplayer2.extractor.ogg.C3393q;
import com.google.android.exoplayer2.extractor.ts.C3415n;
import com.google.android.exoplayer2.extractor.ts.C3422y;
import com.google.android.exoplayer2.extractor.ts.gvn7;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import zy.dd;

/* JADX INFO: compiled from: DefaultExtractorsFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public final class f7l8 implements kja0 {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private int f63695f7l8;

    /* JADX INFO: renamed from: g */
    private int f19761g;

    /* JADX INFO: renamed from: n */
    private int f19762n;

    /* JADX INFO: renamed from: p */
    private int f19763p;

    /* JADX INFO: renamed from: q */
    private int f19764q;

    /* JADX INFO: renamed from: s */
    private int f19765s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private boolean f63698toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private int f63699x2;

    /* JADX INFO: renamed from: y */
    private int f19766y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private boolean f63700zy;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static final int[] f63694n7h = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 14};

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private static final C3337k f63693kja0 = new C3337k();

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private int f63696ld6 = 1;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private int f63697qrj = gvn7.f20233t;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.f7l8$k */
    /* JADX INFO: compiled from: DefaultExtractorsFactory.java */
    private static final class C3337k {

        /* JADX INFO: renamed from: k */
        private final AtomicBoolean f19767k = new AtomicBoolean(false);

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @zy.o1t("extensionLoaded")
        @dd
        private Constructor<? extends InterfaceC3397p> f63701toq;

        @dd
        private Constructor<? extends InterfaceC3397p> toq() {
            synchronized (this.f19767k) {
                if (this.f19767k.get()) {
                    return this.f63701toq;
                }
                try {
                    if (Boolean.TRUE.equals(Class.forName("com.google.android.exoplayer2.ext.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
                        this.f63701toq = Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(InterfaceC3397p.class).getConstructor(Integer.TYPE);
                    }
                } catch (ClassNotFoundException unused) {
                } catch (Exception e2) {
                    throw new RuntimeException("Error instantiating FLAC extension", e2);
                }
                this.f19767k.set(true);
                return this.f63701toq;
            }
        }

        @dd
        /* JADX INFO: renamed from: k */
        public InterfaceC3397p m11703k(int i2) {
            Constructor<? extends InterfaceC3397p> qVar = toq();
            if (qVar == null) {
                return null;
            }
            try {
                return qVar.newInstance(Integer.valueOf(i2));
            } catch (Exception e2) {
                throw new IllegalStateException("Unexpected error creating FLAC extractor", e2);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    private void m11697n(int i2, List<InterfaceC3397p> list) {
        switch (i2) {
            case 0:
                list.add(new com.google.android.exoplayer2.extractor.ts.toq());
                break;
            case 1:
                list.add(new C3415n());
                break;
            case 2:
                list.add(new C3422y((this.f63700zy ? 2 : 0) | this.f19764q | (this.f63698toq ? 1 : 0)));
                break;
            case 3:
                list.add(new com.google.android.exoplayer2.extractor.amr.toq((this.f63700zy ? 2 : 0) | this.f19762n | (this.f63698toq ? 1 : 0)));
                break;
            case 4:
                InterfaceC3397p interfaceC3397pM11703k = f63693kja0.m11703k(this.f19761g);
                if (interfaceC3397pM11703k == null) {
                    list.add(new C3340n(this.f19761g));
                } else {
                    list.add(interfaceC3397pM11703k);
                }
                break;
            case 5:
                list.add(new com.google.android.exoplayer2.extractor.flv.zy());
                break;
            case 6:
                list.add(new C3358n(this.f63695f7l8));
                break;
            case 7:
                list.add(new C3363g((this.f63700zy ? 2 : 0) | this.f19763p | (this.f63698toq ? 1 : 0)));
                break;
            case 8:
                list.add(new com.google.android.exoplayer2.extractor.mp4.f7l8(this.f19765s));
                list.add(new com.google.android.exoplayer2.extractor.mp4.ld6(this.f19766y));
                break;
            case 9:
                list.add(new C3393q());
                break;
            case 10:
                list.add(new com.google.android.exoplayer2.extractor.ts.wvg());
                break;
            case 11:
                list.add(new gvn7(this.f63696ld6, this.f63699x2, this.f63697qrj));
                break;
            case 12:
                list.add(new com.google.android.exoplayer2.extractor.wav.toq());
                break;
            case 14:
                list.add(new C3351k());
                break;
        }
    }

    public synchronized f7l8 cdj(int i2) {
        this.f63697qrj = i2;
        return this;
    }

    public synchronized f7l8 f7l8(int i2) {
        this.f19762n = i2;
        return this;
    }

    /* JADX INFO: renamed from: g */
    public synchronized f7l8 m11698g(int i2) {
        this.f19764q = i2;
        return this;
    }

    /* JADX INFO: renamed from: h */
    public synchronized f7l8 m11699h(int i2) {
        this.f63696ld6 = i2;
        return this;
    }

    public synchronized f7l8 kja0(int i2) {
        this.f63699x2 = i2;
        return this;
    }

    public synchronized f7l8 ld6(int i2) {
        this.f19765s = i2;
        return this;
    }

    public synchronized f7l8 n7h(int i2) {
        this.f19766y = i2;
        return this;
    }

    /* JADX INFO: renamed from: p */
    public synchronized f7l8 m11700p(int i2) {
        this.f19761g = i2;
        return this;
    }

    public synchronized f7l8 qrj(int i2) {
        this.f19763p = i2;
        return this;
    }

    /* JADX INFO: renamed from: s */
    public synchronized f7l8 m11701s(boolean z2) {
        this.f63698toq = z2;
        return this;
    }

    @Override // com.google.android.exoplayer2.extractor.kja0
    public synchronized InterfaceC3397p[] toq(Uri uri, Map<String, List<String>> map) {
        ArrayList arrayList;
        arrayList = new ArrayList(14);
        int qVar = com.google.android.exoplayer2.util.kja0.toq(map);
        if (qVar != -1) {
            m11697n(qVar, arrayList);
        }
        int iZy = com.google.android.exoplayer2.util.kja0.zy(uri);
        if (iZy != -1 && iZy != qVar) {
            m11697n(iZy, arrayList);
        }
        for (int i2 : f63694n7h) {
            if (i2 != qVar && i2 != iZy) {
                m11697n(i2, arrayList);
            }
        }
        return (InterfaceC3397p[]) arrayList.toArray(new InterfaceC3397p[arrayList.size()]);
    }

    public synchronized f7l8 x2(int i2) {
        this.f63695f7l8 = i2;
        return this;
    }

    /* JADX INFO: renamed from: y */
    public synchronized f7l8 m11702y(boolean z2) {
        this.f63700zy = z2;
        return this;
    }

    @Override // com.google.android.exoplayer2.extractor.kja0
    public synchronized InterfaceC3397p[] zy() {
        return toq(Uri.EMPTY, new HashMap());
    }
}
