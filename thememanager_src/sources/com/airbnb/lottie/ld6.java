package com.airbnb.lottie;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import androidx.collection.C0252s;
import com.airbnb.lottie.model.C1472q;
import com.airbnb.lottie.model.C1475y;
import com.airbnb.lottie.model.layer.C1464n;
import com.airbnb.lottie.utils.C1510q;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import zy.uv6;
import zy.y9n;

/* JADX INFO: compiled from: LottieComposition.java */
/* JADX INFO: loaded from: classes.dex */
public class ld6 {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private androidx.collection.n7h<C1472q> f55964f7l8;

    /* JADX INFO: renamed from: g */
    private List<C1475y> f7958g;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private float f55966ld6;

    /* JADX INFO: renamed from: n */
    private Map<String, com.airbnb.lottie.model.zy> f7960n;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private boolean f55967n7h;

    /* JADX INFO: renamed from: p */
    private Rect f7961p;

    /* JADX INFO: renamed from: q */
    private Map<String, dd> f7962q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private float f55968qrj;

    /* JADX INFO: renamed from: s */
    private List<C1464n> f7963s;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private float f55970x2;

    /* JADX INFO: renamed from: y */
    private C0252s<C1464n> f7964y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private Map<String, List<C1464n>> f55971zy;

    /* JADX INFO: renamed from: k */
    private final uv6 f7959k = new uv6();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final HashSet<String> f55969toq = new HashSet<>();

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private int f55965kja0 = 0;

    /* JADX INFO: compiled from: LottieComposition.java */
    @Deprecated
    public static class toq {

        /* JADX INFO: renamed from: com.airbnb.lottie.ld6$toq$k */
        /* JADX INFO: compiled from: LottieComposition.java */
        private static final class C1440k implements x9kr<ld6>, com.airbnb.lottie.toq {

            /* JADX INFO: renamed from: k */
            private final lrht f7965k;

            /* JADX INFO: renamed from: toq, reason: collision with root package name */
            private boolean f55972toq;

            @Override // com.airbnb.lottie.toq
            public void cancel() {
                this.f55972toq = true;
            }

            @Override // com.airbnb.lottie.x9kr
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public void onResult(ld6 ld6Var) {
                if (this.f55972toq) {
                    return;
                }
                this.f7965k.m5989k(ld6Var);
            }

            private C1440k(lrht lrhtVar) {
                this.f55972toq = false;
                this.f7965k = lrhtVar;
            }
        }

        private toq() {
        }

        @Deprecated
        public static com.airbnb.lottie.toq f7l8(String str, lrht lrhtVar) {
            C1440k c1440k = new C1440k(lrhtVar);
            ni7.o1t(str, null).m5952q(c1440k);
            return c1440k;
        }

        @Deprecated
        /* JADX INFO: renamed from: g */
        public static com.airbnb.lottie.toq m5981g(com.airbnb.lottie.parser.moshi.zy zyVar, lrht lrhtVar) {
            C1440k c1440k = new C1440k(lrhtVar);
            ni7.ni7(zyVar, null).m5952q(c1440k);
            return c1440k;
        }

        @Deprecated
        /* JADX INFO: renamed from: k */
        public static com.airbnb.lottie.toq m5982k(Context context, String str, lrht lrhtVar) {
            C1440k c1440k = new C1440k(lrhtVar);
            ni7.kja0(context, str).m5952q(c1440k);
            return c1440k;
        }

        @Deprecated
        public static com.airbnb.lottie.toq ld6(Context context, @zy.n5r1 int i2, lrht lrhtVar) {
            C1440k c1440k = new C1440k(lrhtVar);
            ni7.mcp(context, i2).m5952q(c1440k);
            return c1440k;
        }

        @Deprecated
        @zy.dd
        @y9n
        /* JADX INFO: renamed from: n */
        public static ld6 m5983n(InputStream inputStream, boolean z2) {
            if (z2) {
                C1510q.m6255n("Lottie now auto-closes input stream!");
            }
            return ni7.fn3e(inputStream, null).toq();
        }

        @Deprecated
        @zy.dd
        @y9n
        /* JADX INFO: renamed from: p */
        public static ld6 m5984p(String str) {
            return ni7.wvg(str, null).toq();
        }

        @Deprecated
        @zy.dd
        @y9n
        /* JADX INFO: renamed from: q */
        public static ld6 m5985q(InputStream inputStream) {
            return ni7.fn3e(inputStream, null).toq();
        }

        @Deprecated
        @zy.dd
        @y9n
        /* JADX INFO: renamed from: s */
        public static ld6 m5986s(com.airbnb.lottie.parser.moshi.zy zyVar) {
            return ni7.fu4(zyVar, null).toq();
        }

        @Deprecated
        @zy.dd
        @y9n
        public static ld6 toq(Context context, String str) {
            return ni7.cdj(context, str).toq();
        }

        @Deprecated
        @zy.dd
        @y9n
        /* JADX INFO: renamed from: y */
        public static ld6 m5987y(Resources resources, JSONObject jSONObject) {
            return ni7.m6135t(jSONObject, null).toq();
        }

        @Deprecated
        public static com.airbnb.lottie.toq zy(InputStream inputStream, lrht lrhtVar) {
            C1440k c1440k = new C1440k(lrhtVar);
            ni7.m6127i(inputStream, null).m5952q(c1440k);
            return c1440k;
        }
    }

    public float cdj(float f2) {
        float f3 = this.f55966ld6;
        return (f2 - f3) / (this.f55970x2 - f3);
    }

    public Map<String, com.airbnb.lottie.model.zy> f7l8() {
        return this.f7960n;
    }

    public boolean fn3e() {
        return !this.f7962q.isEmpty();
    }

    @zy.uv6({uv6.EnumC7844k.LIBRARY})
    public C1464n fu4(long j2) {
        return this.f7964y.n7h(j2);
    }

    /* JADX INFO: renamed from: g */
    public float m5971g() {
        return this.f55970x2;
    }

    @zy.dd
    @zy.uv6({uv6.EnumC7844k.LIBRARY})
    /* JADX INFO: renamed from: h */
    public List<C1464n> m5972h(String str) {
        return this.f55971zy.get(str);
    }

    @zy.uv6({uv6.EnumC7844k.LIBRARY})
    /* JADX INFO: renamed from: i */
    public boolean m5973i() {
        return this.f55967n7h;
    }

    @zy.uv6({uv6.EnumC7844k.LIBRARY})
    /* JADX INFO: renamed from: k */
    public void m5974k(String str) {
        C1510q.m6255n(str);
        this.f55969toq.add(str);
    }

    public float ki() {
        return this.f55966ld6;
    }

    public uv6 kja0() {
        return this.f7959k;
    }

    public List<C1464n> ld6() {
        return this.f7963s;
    }

    /* JADX INFO: renamed from: n */
    public float m5975n() {
        return this.f55970x2 - this.f55966ld6;
    }

    @zy.uv6({uv6.EnumC7844k.LIBRARY})
    public int n7h() {
        return this.f55965kja0;
    }

    @zy.uv6({uv6.EnumC7844k.LIBRARY})
    public void ni7(Rect rect, float f2, float f3, float f4, List<C1464n> list, C0252s<C1464n> c0252s, Map<String, List<C1464n>> map, Map<String, dd> map2, androidx.collection.n7h<C1472q> n7hVar, Map<String, com.airbnb.lottie.model.zy> map3, List<C1475y> list2) {
        this.f7961p = rect;
        this.f55966ld6 = f2;
        this.f55970x2 = f3;
        this.f55968qrj = f4;
        this.f7963s = list;
        this.f7964y = c0252s;
        this.f55971zy = map;
        this.f7962q = map2;
        this.f55964f7l8 = n7hVar;
        this.f7960n = map3;
        this.f7958g = list2;
    }

    public void o1t(boolean z2) {
        this.f7959k.f7l8(z2);
    }

    /* JADX INFO: renamed from: p */
    public Map<String, dd> m5976p() {
        return this.f7962q;
    }

    /* JADX INFO: renamed from: q */
    public float m5977q() {
        return (long) ((m5975n() / this.f55968qrj) * 1000.0f);
    }

    public List<C1475y> qrj() {
        return this.f7958g;
    }

    /* JADX INFO: renamed from: s */
    public float m5978s() {
        return this.f55968qrj;
    }

    public ArrayList<String> t8r() {
        HashSet<String> hashSet = this.f55969toq;
        return new ArrayList<>(Arrays.asList((String[]) hashSet.toArray(new String[hashSet.size()])));
    }

    @zy.lvui
    public String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        Iterator<C1464n> it = this.f7963s.iterator();
        while (it.hasNext()) {
            sb.append(it.next().m6074z("\t"));
        }
        return sb.toString();
    }

    public Rect toq() {
        return this.f7961p;
    }

    @zy.dd
    public C1475y x2(String str) {
        int size = this.f7958g.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1475y c1475y = this.f7958g.get(i2);
            if (c1475y.m6097q(str)) {
                return c1475y;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: y */
    public float m5979y(float f2) {
        return com.airbnb.lottie.utils.f7l8.ld6(this.f55966ld6, this.f55970x2, f2);
    }

    @zy.uv6({uv6.EnumC7844k.LIBRARY})
    /* JADX INFO: renamed from: z */
    public void m5980z(boolean z2) {
        this.f55967n7h = z2;
    }

    @zy.uv6({uv6.EnumC7844k.LIBRARY})
    public void zurt(int i2) {
        this.f55965kja0 += i2;
    }

    public androidx.collection.n7h<C1472q> zy() {
        return this.f55964f7l8;
    }
}
