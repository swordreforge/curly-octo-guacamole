package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import java.util.NavigableMap;
import zy.dd;
import zy.hyr;
import zy.yz;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.bitmap_recycle.h */
/* JADX INFO: compiled from: SizeStrategy.java */
/* JADX INFO: loaded from: classes2.dex */
@hyr(19)
final class C3004h implements x2 {

    /* JADX INFO: renamed from: q */
    private static final int f18257q = 8;

    /* JADX INFO: renamed from: k */
    private final toq f18258k = new toq();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final C3012y<k, Bitmap> f62705toq = new C3012y<>();

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final NavigableMap<Integer, Integer> f62706zy = new n7h();

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.bitmap_recycle.h$k */
    /* JADX INFO: compiled from: SizeStrategy.java */
    @yz
    static final class k implements qrj {

        /* JADX INFO: renamed from: k */
        private final toq f18259k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        int f62707toq;

        k(toq toqVar) {
            this.f18259k = toqVar;
        }

        public boolean equals(Object obj) {
            return (obj instanceof k) && this.f62707toq == ((k) obj).f62707toq;
        }

        public int hashCode() {
            return this.f62707toq;
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.qrj
        /* JADX INFO: renamed from: k */
        public void mo10675k() {
            this.f18259k.zy(this);
        }

        public String toString() {
            return C3004h.f7l8(this.f62707toq);
        }

        public void toq(int i2) {
            this.f62707toq = i2;
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.bitmap_recycle.h$toq */
    /* JADX INFO: compiled from: SizeStrategy.java */
    @yz
    static class toq extends AbstractC3010q<k> {
        toq() {
        }

        /* JADX INFO: renamed from: n */
        public k m10677n(int i2) {
            k kVar = (k) super.toq();
            kVar.toq(i2);
            return kVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.bumptech.glide.load.engine.bitmap_recycle.AbstractC3010q
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public k mo10676k() {
            return new k(this);
        }
    }

    C3004h() {
    }

    static String f7l8(int i2) {
        return "[" + i2 + "]";
    }

    /* JADX INFO: renamed from: n */
    private void m10670n(Integer num) {
        Integer num2 = this.f62706zy.get(num);
        if (num2.intValue() == 1) {
            this.f62706zy.remove(num);
        } else {
            this.f62706zy.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }

    /* JADX INFO: renamed from: y */
    private static String m10671y(Bitmap bitmap) {
        return f7l8(com.bumptech.glide.util.kja0.m11233y(bitmap));
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.x2
    @dd
    /* JADX INFO: renamed from: g */
    public Bitmap mo10672g(int i2, int i3, Bitmap.Config config) {
        int iF7l8 = com.bumptech.glide.util.kja0.f7l8(i2, i3, config);
        k kVarM10677n = this.f18258k.m10677n(iF7l8);
        Integer numCeilingKey = this.f62706zy.ceilingKey(Integer.valueOf(iF7l8));
        if (numCeilingKey != null && numCeilingKey.intValue() != iF7l8 && numCeilingKey.intValue() <= iF7l8 * 8) {
            this.f18258k.zy(kVarM10677n);
            kVarM10677n = this.f18258k.m10677n(numCeilingKey.intValue());
        }
        Bitmap bitmapM10704k = this.f62705toq.m10704k(kVarM10677n);
        if (bitmapM10704k != null) {
            bitmapM10704k.reconfigure(i2, i3, config);
            m10670n(numCeilingKey);
        }
        return bitmapM10704k;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.x2
    /* JADX INFO: renamed from: k */
    public String mo10673k(Bitmap bitmap) {
        return m10671y(bitmap);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.x2
    /* JADX INFO: renamed from: q */
    public void mo10674q(Bitmap bitmap) {
        k kVarM10677n = this.f18258k.m10677n(com.bumptech.glide.util.kja0.m11233y(bitmap));
        this.f62705toq.m10705q(kVarM10677n, bitmap);
        Integer num = this.f62706zy.get(Integer.valueOf(kVarM10677n.f62707toq));
        this.f62706zy.put(Integer.valueOf(kVarM10677n.f62707toq), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.x2
    @dd
    public Bitmap removeLast() {
        Bitmap bitmapM10703g = this.f62705toq.m10703g();
        if (bitmapM10703g != null) {
            m10670n(Integer.valueOf(com.bumptech.glide.util.kja0.m11233y(bitmapM10703g)));
        }
        return bitmapM10703g;
    }

    public String toString() {
        return "SizeStrategy:\n  " + this.f62705toq + "\n  SortedSizes" + this.f62706zy;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.x2
    public String toq(int i2, int i3, Bitmap.Config config) {
        return f7l8(com.bumptech.glide.util.kja0.f7l8(i2, i3, config));
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.x2
    public int zy(Bitmap bitmap) {
        return com.bumptech.glide.util.kja0.m11233y(bitmap);
    }
}
