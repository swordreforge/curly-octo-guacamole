package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import zy.dd;
import zy.hyr;
import zy.yz;

/* JADX INFO: compiled from: SizeConfigStrategy.java */
/* JADX INFO: loaded from: classes2.dex */
@hyr(19)
public class kja0 implements x2 {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final Bitmap.Config[] f62708f7l8;

    /* JADX INFO: renamed from: g */
    private static final Bitmap.Config[] f18260g;

    /* JADX INFO: renamed from: n */
    private static final Bitmap.Config[] f18261n;

    /* JADX INFO: renamed from: q */
    private static final int f18262q = 8;

    /* JADX INFO: renamed from: s */
    private static final Bitmap.Config[] f18263s;

    /* JADX INFO: renamed from: y */
    private static final Bitmap.Config[] f18264y;

    /* JADX INFO: renamed from: k */
    private final zy f18265k = new zy();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final C3012y<toq, Bitmap> f62709toq = new C3012y<>();

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final Map<Bitmap.Config, NavigableMap<Integer, Integer>> f62710zy = new HashMap();

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.bitmap_recycle.kja0$k */
    /* JADX INFO: compiled from: SizeConfigStrategy.java */
    static /* synthetic */ class C3006k {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ int[] f18266k;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f18266k = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18266k[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18266k[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18266k[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: compiled from: SizeConfigStrategy.java */
    @yz
    static class zy extends AbstractC3010q<toq> {
        zy() {
        }

        /* JADX INFO: renamed from: n */
        public toq m10683n(int i2, Bitmap.Config config) {
            toq qVar = toq();
            qVar.toq(i2, config);
            return qVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.bumptech.glide.load.engine.bitmap_recycle.AbstractC3010q
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public toq mo10676k() {
            return new toq(this);
        }
    }

    static {
        Bitmap.Config[] configArr = (Bitmap.Config[]) Arrays.copyOf(new Bitmap.Config[]{Bitmap.Config.ARGB_8888, null}, 3);
        configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        f18261n = configArr;
        f18260g = configArr;
        f62708f7l8 = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f18264y = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f18263s = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    private toq f7l8(int i2, Bitmap.Config config) {
        toq toqVarM10683n = this.f18265k.m10683n(i2, config);
        for (Bitmap.Config config2 : m10681s(config)) {
            Integer numCeilingKey = m10680p(config2).ceilingKey(Integer.valueOf(i2));
            if (numCeilingKey != null && numCeilingKey.intValue() <= i2 * 8) {
                if (numCeilingKey.intValue() == i2) {
                    if (config2 == null) {
                        if (config == null) {
                            return toqVarM10683n;
                        }
                    } else if (config2.equals(config)) {
                        return toqVarM10683n;
                    }
                }
                this.f18265k.zy(toqVarM10683n);
                return this.f18265k.m10683n(numCeilingKey.intValue(), config2);
            }
        }
        return toqVarM10683n;
    }

    /* JADX INFO: renamed from: n */
    private void m10679n(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> navigableMapM10680p = m10680p(bitmap.getConfig());
        Integer num2 = navigableMapM10680p.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                navigableMapM10680p.remove(num);
                return;
            } else {
                navigableMapM10680p.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + mo10673k(bitmap) + ", this: " + this);
    }

    /* JADX INFO: renamed from: p */
    private NavigableMap<Integer, Integer> m10680p(Bitmap.Config config) {
        NavigableMap<Integer, Integer> navigableMap = this.f62710zy.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f62710zy.put(config, treeMap);
        return treeMap;
    }

    /* JADX INFO: renamed from: s */
    private static Bitmap.Config[] m10681s(Bitmap.Config config) {
        if (Bitmap.Config.RGBA_F16.equals(config)) {
            return f18260g;
        }
        int i2 = C3006k.f18266k[config.ordinal()];
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? new Bitmap.Config[]{config} : f18263s : f18264y : f62708f7l8 : f18261n;
    }

    /* JADX INFO: renamed from: y */
    static String m10682y(int i2, Bitmap.Config config) {
        return "[" + i2 + "](" + config + ")";
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.x2
    @dd
    /* JADX INFO: renamed from: g */
    public Bitmap mo10672g(int i2, int i3, Bitmap.Config config) {
        toq toqVarF7l8 = f7l8(com.bumptech.glide.util.kja0.f7l8(i2, i3, config), config);
        Bitmap bitmapM10704k = this.f62709toq.m10704k(toqVarF7l8);
        if (bitmapM10704k != null) {
            m10679n(Integer.valueOf(toqVarF7l8.f62711toq), bitmapM10704k);
            bitmapM10704k.reconfigure(i2, i3, config);
        }
        return bitmapM10704k;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.x2
    /* JADX INFO: renamed from: k */
    public String mo10673k(Bitmap bitmap) {
        return m10682y(com.bumptech.glide.util.kja0.m11233y(bitmap), bitmap.getConfig());
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.x2
    /* JADX INFO: renamed from: q */
    public void mo10674q(Bitmap bitmap) {
        toq toqVarM10683n = this.f18265k.m10683n(com.bumptech.glide.util.kja0.m11233y(bitmap), bitmap.getConfig());
        this.f62709toq.m10705q(toqVarM10683n, bitmap);
        NavigableMap<Integer, Integer> navigableMapM10680p = m10680p(bitmap.getConfig());
        Integer num = navigableMapM10680p.get(Integer.valueOf(toqVarM10683n.f62711toq));
        navigableMapM10680p.put(Integer.valueOf(toqVarM10683n.f62711toq), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.x2
    @dd
    public Bitmap removeLast() {
        Bitmap bitmapM10703g = this.f62709toq.m10703g();
        if (bitmapM10703g != null) {
            m10679n(Integer.valueOf(com.bumptech.glide.util.kja0.m11233y(bitmapM10703g)), bitmapM10703g);
        }
        return bitmapM10703g;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SizeConfigStrategy{groupedMap=");
        sb.append(this.f62709toq);
        sb.append(", sortedSizes=(");
        for (Map.Entry<Bitmap.Config, NavigableMap<Integer, Integer>> entry : this.f62710zy.entrySet()) {
            sb.append(entry.getKey());
            sb.append('[');
            sb.append(entry.getValue());
            sb.append("], ");
        }
        if (!this.f62710zy.isEmpty()) {
            sb.replace(sb.length() - 2, sb.length(), "");
        }
        sb.append(")}");
        return sb.toString();
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.x2
    public String toq(int i2, int i3, Bitmap.Config config) {
        return m10682y(com.bumptech.glide.util.kja0.f7l8(i2, i3, config), config);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.x2
    public int zy(Bitmap bitmap) {
        return com.bumptech.glide.util.kja0.m11233y(bitmap);
    }

    /* JADX INFO: compiled from: SizeConfigStrategy.java */
    @yz
    static final class toq implements qrj {

        /* JADX INFO: renamed from: k */
        private final zy f18267k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        int f62711toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private Bitmap.Config f62712zy;

        public toq(zy zyVar) {
            this.f18267k = zyVar;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof toq)) {
                return false;
            }
            toq toqVar = (toq) obj;
            return this.f62711toq == toqVar.f62711toq && com.bumptech.glide.util.kja0.m11231q(this.f62712zy, toqVar.f62712zy);
        }

        public int hashCode() {
            int i2 = this.f62711toq * 31;
            Bitmap.Config config = this.f62712zy;
            return i2 + (config != null ? config.hashCode() : 0);
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.qrj
        /* JADX INFO: renamed from: k */
        public void mo10675k() {
            this.f18267k.zy(this);
        }

        public String toString() {
            return kja0.m10682y(this.f62711toq, this.f62712zy);
        }

        public void toq(int i2, Bitmap.Config config) {
            this.f62711toq = i2;
            this.f62712zy = config;
        }

        @yz
        toq(zy zyVar, int i2, Bitmap.Config config) {
            this(zyVar);
            toq(i2, config);
        }
    }
}
