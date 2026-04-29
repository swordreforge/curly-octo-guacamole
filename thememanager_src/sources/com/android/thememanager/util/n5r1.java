package com.android.thememanager.util;

import android.graphics.Bitmap;
import com.android.thememanager.util.hyr;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: ImageCacheDecoder.java */
/* JADX INFO: loaded from: classes2.dex */
public class n5r1 extends hyr {

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    protected C2795k f61361ki;

    /* JADX INFO: renamed from: com.android.thememanager.util.n5r1$k */
    /* JADX INFO: compiled from: ImageCacheDecoder.java */
    protected class C2795k {

        /* JADX INFO: renamed from: k */
        private int f16647k;

        /* JADX INFO: renamed from: q */
        protected Map<String, C2775f> f16649q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        protected int f61362toq = 0;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        protected Map<String, Bitmap> f61363zy;

        public C2795k(int cacheCapacity) {
            this.f16647k = Math.max(3, (cacheCapacity & 1) == 0 ? cacheCapacity + 1 : cacheCapacity);
            this.f61363zy = Collections.synchronizedMap(new HashMap(this.f16647k));
            this.f16649q = Collections.synchronizedMap(new HashMap(this.f16647k));
        }

        private boolean f7l8(C2775f decodeInfoA, C2775f decodeInfoB) {
            return decodeInfoA.f16418n == decodeInfoB.f16418n && decodeInfoA.f16419q == decodeInfoB.f16419q;
        }

        /* JADX INFO: renamed from: y */
        private boolean m9882y() {
            return this.f61363zy.size() >= this.f16647k;
        }

        /* JADX INFO: renamed from: g */
        public boolean m9883g(int index) {
            return Math.abs(index - this.f61362toq) <= this.f16647k / 2;
        }

        /* JADX INFO: renamed from: k */
        public synchronized void m9884k(Bitmap b2, C2775f decodeInfo) {
            while (m9882y()) {
                m9886p(decodeInfo);
            }
            this.f61363zy.put(decodeInfo.m9717q(), b2);
            this.f16649q.put(decodeInfo.m9717q(), decodeInfo);
        }

        public void ld6(int index) {
            this.f61362toq = index;
        }

        /* JADX INFO: renamed from: n */
        public int m9885n() {
            return this.f61362toq;
        }

        /* JADX INFO: renamed from: p */
        public synchronized Bitmap m9886p(C2775f decodeInfo) {
            Iterator<String> it = this.f61363zy.keySet().iterator();
            if (it.hasNext()) {
                String next = it.next();
                while (it.hasNext()) {
                    String next2 = it.next();
                    if (zy(next2, next, decodeInfo) > zy(next, next2, decodeInfo)) {
                        next = next2;
                    }
                }
                C2775f c2775f = this.f16649q.get(next);
                if (m9888s(decodeInfo, c2775f)) {
                    Bitmap bitmapRemove = this.f61363zy.remove(next);
                    this.f16649q.remove(next);
                    if (f7l8(decodeInfo, c2775f)) {
                        return bitmapRemove;
                    }
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: q */
        public Bitmap m9887q(String decodeCacheKey) {
            return this.f61363zy.get(decodeCacheKey);
        }

        /* JADX INFO: renamed from: s */
        protected boolean m9888s(C2775f decodeInfo, C2775f selectDecodeInfo) {
            return m9882y() || (f7l8(decodeInfo, selectDecodeInfo) && ((toq) decodeInfo).f16650s == ((toq) selectDecodeInfo).f16650s);
        }

        public synchronized void toq() {
            this.f61363zy.clear();
            this.f16649q.clear();
        }

        protected int zy(String computeKey, String referenceKey, C2775f decodeInfo) {
            int i2 = ((toq) decodeInfo).f16650s;
            int i3 = ((toq) this.f16649q.get(computeKey)).f16650s;
            int i4 = ((toq) this.f16649q.get(referenceKey)).f16650s;
            int i5 = i3 == i2 ? 2 : 0;
            return Math.abs(this.f61362toq - i3) > Math.abs(this.f61362toq - i4) ? i5 + 1 : i5;
        }
    }

    public n5r1(int cacheSize) {
        this.f61361ki = o1t(cacheSize);
    }

    public void a9(int index) {
        this.f61361ki.ld6(index);
    }

    @Override // com.android.thememanager.util.hyr
    protected hyr.C2783g f7l8(C2775f decodeInfo) {
        hyr.C2783g c2783gF7l8 = super.f7l8(decodeInfo);
        if (!this.f61361ki.m9883g(((toq) decodeInfo).f16650s)) {
            c2783gF7l8.f16555k = true;
        }
        return c2783gF7l8;
    }

    public int jk() {
        return this.f61361ki.m9885n();
    }

    public Bitmap mcp(String localPath, int decodeWidth, int decodeHeight) {
        C2775f c2775f = new C2775f(localPath, null);
        c2775f.f16419q = decodeWidth;
        c2775f.f16418n = decodeHeight;
        return wvg(c2775f);
    }

    @Override // com.android.thememanager.util.hyr
    protected boolean n7h(C2775f decodeInfo) {
        return super.n7h(decodeInfo) && this.f61361ki.m9883g(((toq) decodeInfo).f16650s) && this.f61361ki.m9887q(decodeInfo.m9717q()) == null;
    }

    protected C2795k o1t(int cacheCapacity) {
        return new C2795k(cacheCapacity);
    }

    /* JADX INFO: renamed from: t */
    public Bitmap m9881t(String localPath) {
        return wvg(new C2775f(localPath, null));
    }

    @Override // com.android.thememanager.util.hyr
    public void toq(boolean stopRunngingJob) {
        if (!stopRunngingJob) {
            throw new RuntimeException("You must set the stopRunngingJob to be true");
        }
        this.f61361ki.toq();
        super.toq(true);
    }

    public Bitmap wvg(C2775f decodeInfo) {
        return this.f61361ki.m9887q(decodeInfo.m9717q());
    }

    @Override // com.android.thememanager.util.hyr
    protected Bitmap zy(C2775f decodeInfo) {
        decodeInfo.f16420y = this.f61361ki.m9886p(decodeInfo);
        Bitmap bitmapZy = super.zy(decodeInfo);
        if (bitmapZy != null) {
            this.f61361ki.m9884k(bitmapZy, decodeInfo);
        }
        return bitmapZy;
    }

    /* JADX INFO: compiled from: ImageCacheDecoder.java */
    public static class toq extends C2775f {

        /* JADX INFO: renamed from: s */
        public int f16650s;

        public toq(int useIndex, String localPath, String onlinePath) {
            super(localPath, onlinePath);
            this.f16650s = useIndex;
        }

        @Override // com.android.thememanager.util.C2775f
        /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
        public toq clone() {
            return new toq(this);
        }

        public toq(toq other) {
            super(other);
            this.f16650s = other.f16650s;
        }
    }
}
