package com.bumptech.glide.load.resource.bitmap;

import com.bumptech.glide.load.C3138s;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.h */
/* JADX INFO: compiled from: DownsampleStrategy.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3101h {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final AbstractC3101h f62893f7l8;

    /* JADX INFO: renamed from: g */
    public static final AbstractC3101h f18698g;

    /* JADX INFO: renamed from: n */
    public static final AbstractC3101h f18700n;

    /* JADX INFO: renamed from: s */
    static final boolean f18702s;

    /* JADX INFO: renamed from: y */
    public static final C3138s<AbstractC3101h> f18703y;

    /* JADX INFO: renamed from: k */
    public static final AbstractC3101h f18699k = new k();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final AbstractC3101h f62894toq = new toq();

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final AbstractC3101h f62895zy = new n();

    /* JADX INFO: renamed from: q */
    public static final AbstractC3101h f18701q = new zy();

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.h$f7l8 */
    /* JADX INFO: compiled from: DownsampleStrategy.java */
    public enum f7l8 {
        MEMORY,
        QUALITY
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.h$g */
    /* JADX INFO: compiled from: DownsampleStrategy.java */
    private static class g extends AbstractC3101h {
        g() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.AbstractC3101h
        /* JADX INFO: renamed from: k */
        public f7l8 mo10965k(int i2, int i3, int i4, int i5) {
            return f7l8.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.AbstractC3101h
        public float toq(int i2, int i3, int i4, int i5) {
            return 1.0f;
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.h$k */
    /* JADX INFO: compiled from: DownsampleStrategy.java */
    private static class k extends AbstractC3101h {
        k() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.AbstractC3101h
        /* JADX INFO: renamed from: k */
        public f7l8 mo10965k(int i2, int i3, int i4, int i5) {
            return f7l8.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.AbstractC3101h
        public float toq(int i2, int i3, int i4, int i5) {
            if (Math.min(i3 / i5, i2 / i4) == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(r1);
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.h$n */
    /* JADX INFO: compiled from: DownsampleStrategy.java */
    private static class n extends AbstractC3101h {
        n() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.AbstractC3101h
        /* JADX INFO: renamed from: k */
        public f7l8 mo10965k(int i2, int i3, int i4, int i5) {
            return AbstractC3101h.f18702s ? f7l8.QUALITY : f7l8.MEMORY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.AbstractC3101h
        public float toq(int i2, int i3, int i4, int i5) {
            if (AbstractC3101h.f18702s) {
                return Math.min(i4 / i2, i5 / i3);
            }
            if (Math.max(i3 / i5, i2 / i4) == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(r2);
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.h$q */
    /* JADX INFO: compiled from: DownsampleStrategy.java */
    private static class q extends AbstractC3101h {
        q() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.AbstractC3101h
        /* JADX INFO: renamed from: k */
        public f7l8 mo10965k(int i2, int i3, int i4, int i5) {
            return f7l8.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.AbstractC3101h
        public float toq(int i2, int i3, int i4, int i5) {
            return Math.max(i4 / i2, i5 / i3);
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.h$toq */
    /* JADX INFO: compiled from: DownsampleStrategy.java */
    private static class toq extends AbstractC3101h {
        toq() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.AbstractC3101h
        /* JADX INFO: renamed from: k */
        public f7l8 mo10965k(int i2, int i3, int i4, int i5) {
            return f7l8.MEMORY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.AbstractC3101h
        public float toq(int i2, int i3, int i4, int i5) {
            int iCeil = (int) Math.ceil(Math.max(i3 / i5, i2 / i4));
            return 1.0f / (r2 << (Math.max(1, Integer.highestOneBit(iCeil)) >= iCeil ? 0 : 1));
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.h$zy */
    /* JADX INFO: compiled from: DownsampleStrategy.java */
    private static class zy extends AbstractC3101h {
        zy() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.AbstractC3101h
        /* JADX INFO: renamed from: k */
        public f7l8 mo10965k(int i2, int i3, int i4, int i5) {
            return toq(i2, i3, i4, i5) == 1.0f ? f7l8.QUALITY : AbstractC3101h.f62895zy.mo10965k(i2, i3, i4, i5);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.AbstractC3101h
        public float toq(int i2, int i3, int i4, int i5) {
            return Math.min(1.0f, AbstractC3101h.f62895zy.toq(i2, i3, i4, i5));
        }
    }

    static {
        q qVar = new q();
        f18700n = qVar;
        f18698g = new g();
        f62893f7l8 = qVar;
        f18703y = C3138s.f7l8("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", qVar);
        f18702s = true;
    }

    /* JADX INFO: renamed from: k */
    public abstract f7l8 mo10965k(int i2, int i3, int i4, int i5);

    public abstract float toq(int i2, int i3, int i4, int i5);
}
