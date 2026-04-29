package com.airbnb.lottie.model.content;

import android.graphics.Paint;
import com.airbnb.lottie.C1504r;
import com.airbnb.lottie.animation.content.fn3e;
import com.airbnb.lottie.model.animatable.C1443k;
import com.airbnb.lottie.model.animatable.C1446q;
import java.util.List;
import zy.dd;

/* JADX INFO: compiled from: ShapeStroke.java */
/* JADX INFO: loaded from: classes.dex */
public class ki implements com.airbnb.lottie.model.content.zy {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private final toq f55997f7l8;

    /* JADX INFO: renamed from: g */
    private final com.airbnb.lottie.model.animatable.toq f7999g;

    /* JADX INFO: renamed from: k */
    private final String f8000k;

    /* JADX INFO: renamed from: n */
    private final C1446q f8001n;

    /* JADX INFO: renamed from: p */
    private final boolean f8002p;

    /* JADX INFO: renamed from: q */
    private final C1443k f8003q;

    /* JADX INFO: renamed from: s */
    private final float f8004s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @dd
    private final com.airbnb.lottie.model.animatable.toq f55998toq;

    /* JADX INFO: renamed from: y */
    private final zy f8005y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final List<com.airbnb.lottie.model.animatable.toq> f55999zy;

    /* JADX INFO: renamed from: com.airbnb.lottie.model.content.ki$k */
    /* JADX INFO: compiled from: ShapeStroke.java */
    static /* synthetic */ class C1453k {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ int[] f8006k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        static final /* synthetic */ int[] f56000toq;

        static {
            int[] iArr = new int[zy.values().length];
            f56000toq = iArr;
            try {
                iArr[zy.BEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f56000toq[zy.MITER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f56000toq[zy.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[toq.values().length];
            f8006k = iArr2;
            try {
                iArr2[toq.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8006k[toq.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8006k[toq.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: compiled from: ShapeStroke.java */
    public enum toq {
        BUTT,
        ROUND,
        UNKNOWN;

        public Paint.Cap toPaintCap() {
            int i2 = C1453k.f8006k[ordinal()];
            return i2 != 1 ? i2 != 2 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }
    }

    /* JADX INFO: compiled from: ShapeStroke.java */
    public enum zy {
        MITER,
        ROUND,
        BEVEL;

        public Paint.Join toPaintJoin() {
            int i2 = C1453k.f56000toq[ordinal()];
            if (i2 == 1) {
                return Paint.Join.BEVEL;
            }
            if (i2 == 2) {
                return Paint.Join.MITER;
            }
            if (i2 != 3) {
                return null;
            }
            return Paint.Join.ROUND;
        }
    }

    public ki(String str, @dd com.airbnb.lottie.model.animatable.toq toqVar, List<com.airbnb.lottie.model.animatable.toq> list, C1443k c1443k, C1446q c1446q, com.airbnb.lottie.model.animatable.toq toqVar2, toq toqVar3, zy zyVar, float f2, boolean z2) {
        this.f8000k = str;
        this.f55998toq = toqVar;
        this.f55999zy = list;
        this.f8003q = c1443k;
        this.f8001n = c1446q;
        this.f7999g = toqVar2;
        this.f55997f7l8 = toqVar3;
        this.f8005y = zyVar;
        this.f8004s = f2;
        this.f8002p = z2;
    }

    public float f7l8() {
        return this.f8004s;
    }

    /* JADX INFO: renamed from: g */
    public List<com.airbnb.lottie.model.animatable.toq> m6016g() {
        return this.f55999zy;
    }

    @Override // com.airbnb.lottie.model.content.zy
    /* JADX INFO: renamed from: k */
    public com.airbnb.lottie.animation.content.zy mo6000k(C1504r c1504r, com.airbnb.lottie.model.layer.toq toqVar) {
        return new fn3e(c1504r, toqVar, this);
    }

    public boolean ld6() {
        return this.f8002p;
    }

    /* JADX INFO: renamed from: n */
    public zy m6017n() {
        return this.f8005y;
    }

    /* JADX INFO: renamed from: p */
    public com.airbnb.lottie.model.animatable.toq m6018p() {
        return this.f7999g;
    }

    /* JADX INFO: renamed from: q */
    public com.airbnb.lottie.model.animatable.toq m6019q() {
        return this.f55998toq;
    }

    /* JADX INFO: renamed from: s */
    public C1446q m6020s() {
        return this.f8001n;
    }

    public toq toq() {
        return this.f55997f7l8;
    }

    /* JADX INFO: renamed from: y */
    public String m6021y() {
        return this.f8000k;
    }

    public C1443k zy() {
        return this.f8003q;
    }
}
