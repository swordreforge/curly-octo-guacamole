package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import com.miui.maml.folme.AnimatedProperty;
import zy.yz;

/* JADX INFO: compiled from: AttributeStrategy.java */
/* JADX INFO: loaded from: classes2.dex */
class zy implements x2 {

    /* JADX INFO: renamed from: k */
    private final toq f18289k = new toq();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final C3012y<C3013k, Bitmap> f62727toq = new C3012y<>();

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.bitmap_recycle.zy$k */
    /* JADX INFO: compiled from: AttributeStrategy.java */
    @yz
    static class C3013k implements qrj {

        /* JADX INFO: renamed from: k */
        private final toq f18290k;

        /* JADX INFO: renamed from: q */
        private Bitmap.Config f18291q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private int f62728toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private int f62729zy;

        public C3013k(toq toqVar) {
            this.f18290k = toqVar;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C3013k)) {
                return false;
            }
            C3013k c3013k = (C3013k) obj;
            return this.f62728toq == c3013k.f62728toq && this.f62729zy == c3013k.f62729zy && this.f18291q == c3013k.f18291q;
        }

        public int hashCode() {
            int i2 = ((this.f62728toq * 31) + this.f62729zy) * 31;
            Bitmap.Config config = this.f18291q;
            return i2 + (config != null ? config.hashCode() : 0);
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.qrj
        /* JADX INFO: renamed from: k */
        public void mo10675k() {
            this.f18290k.zy(this);
        }

        public String toString() {
            return zy.m10707n(this.f62728toq, this.f62729zy, this.f18291q);
        }

        public void toq(int i2, int i3, Bitmap.Config config) {
            this.f62728toq = i2;
            this.f62729zy = i3;
            this.f18291q = config;
        }
    }

    /* JADX INFO: compiled from: AttributeStrategy.java */
    @yz
    static class toq extends AbstractC3010q<C3013k> {
        toq() {
        }

        /* JADX INFO: renamed from: n */
        C3013k m10708n(int i2, int i3, Bitmap.Config config) {
            C3013k qVar = toq();
            qVar.toq(i2, i3, config);
            return qVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.bumptech.glide.load.engine.bitmap_recycle.AbstractC3010q
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public C3013k mo10676k() {
            return new C3013k(this);
        }
    }

    zy() {
    }

    private static String f7l8(Bitmap bitmap) {
        return m10707n(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
    }

    /* JADX INFO: renamed from: n */
    static String m10707n(int i2, int i3, Bitmap.Config config) {
        return "[" + i2 + AnimatedProperty.PROPERTY_NAME_X + i3 + "], " + config;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.x2
    /* JADX INFO: renamed from: g */
    public Bitmap mo10672g(int i2, int i3, Bitmap.Config config) {
        return this.f62727toq.m10704k(this.f18289k.m10708n(i2, i3, config));
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.x2
    /* JADX INFO: renamed from: k */
    public String mo10673k(Bitmap bitmap) {
        return f7l8(bitmap);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.x2
    /* JADX INFO: renamed from: q */
    public void mo10674q(Bitmap bitmap) {
        this.f62727toq.m10705q(this.f18289k.m10708n(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig()), bitmap);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.x2
    public Bitmap removeLast() {
        return this.f62727toq.m10703g();
    }

    public String toString() {
        return "AttributeStrategy:\n  " + this.f62727toq;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.x2
    public String toq(int i2, int i3, Bitmap.Config config) {
        return m10707n(i2, i3, config);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.x2
    public int zy(Bitmap bitmap) {
        return com.bumptech.glide.util.kja0.m11233y(bitmap);
    }
}
