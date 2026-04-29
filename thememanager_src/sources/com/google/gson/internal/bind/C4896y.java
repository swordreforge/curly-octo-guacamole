package com.google.gson.internal.bind;

import com.google.gson.C4871g;
import com.google.gson.InterfaceC4928z;
import com.google.gson.fu4;
import com.google.gson.internal.C4904p;
import com.google.gson.reflect.C4922k;
import com.google.gson.stream.C4924k;
import com.google.gson.stream.C4926q;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.gson.internal.bind.y */
/* JADX INFO: compiled from: ObjectTypeAdapter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C4896y extends fu4<Object> {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final InterfaceC4928z f68778toq = new k();

    /* JADX INFO: renamed from: k */
    private final C4871g f27737k;

    /* JADX INFO: renamed from: com.google.gson.internal.bind.y$k */
    /* JADX INFO: compiled from: ObjectTypeAdapter.java */
    class k implements InterfaceC4928z {
        k() {
        }

        @Override // com.google.gson.InterfaceC4928z
        /* JADX INFO: renamed from: k */
        public <T> fu4<T> mo17108k(C4871g c4871g, C4922k<T> c4922k) {
            if (c4922k.getRawType() == Object.class) {
                return new C4896y(c4871g);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.bind.y$toq */
    /* JADX INFO: compiled from: ObjectTypeAdapter.java */
    static /* synthetic */ class toq {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ int[] f27738k;

        static {
            int[] iArr = new int[com.google.gson.stream.zy.values().length];
            f27738k = iArr;
            try {
                iArr[com.google.gson.stream.zy.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27738k[com.google.gson.stream.zy.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27738k[com.google.gson.stream.zy.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f27738k[com.google.gson.stream.zy.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f27738k[com.google.gson.stream.zy.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f27738k[com.google.gson.stream.zy.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    C4896y(C4871g c4871g) {
        this.f27737k = c4871g;
    }

    @Override // com.google.gson.fu4
    /* JADX INFO: renamed from: n */
    public Object mo7087n(C4924k c4924k) throws IOException {
        switch (toq.f27738k[c4924k.g1().ordinal()]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                c4924k.mo17116k();
                while (c4924k.ki()) {
                    arrayList.add(mo7087n(c4924k));
                }
                c4924k.ld6();
                return arrayList;
            case 2:
                C4904p c4904p = new C4904p();
                c4924k.zy();
                while (c4924k.ki()) {
                    c4904p.put(c4924k.y9n(), mo7087n(c4924k));
                }
                c4924k.x2();
                return c4904p;
            case 3:
                return c4924k.nmn5();
            case 4:
                return Double.valueOf(c4924k.hyr());
            case 5:
                return Boolean.valueOf(c4924k.d2ok());
            case 6:
                c4924k.a98o();
                return null;
            default:
                throw new IllegalStateException();
        }
    }

    @Override // com.google.gson.fu4
    /* JADX INFO: renamed from: s */
    public void mo7089s(C4926q c4926q, Object obj) throws IOException {
        if (obj == null) {
            c4926q.hyr();
            return;
        }
        fu4 fu4VarCdj = this.f27737k.cdj(obj.getClass());
        if (!(fu4VarCdj instanceof C4896y)) {
            fu4VarCdj.mo7089s(c4926q, obj);
        } else {
            c4926q.mo17112y();
            c4926q.x2();
        }
    }
}
