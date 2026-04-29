package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.appcompat.widget.lrht;
import androidx.core.graphics.C0541p;
import p023g.C6045k;
import p030n.C7397k;
import zy.InterfaceC7829h;
import zy.uv6;

/* JADX INFO: compiled from: AppCompatDrawableManager.java */
/* JADX INFO: loaded from: classes.dex */
@zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public final class ld6 {

    /* JADX INFO: renamed from: n */
    private static ld6 f1086n = null;

    /* JADX INFO: renamed from: q */
    private static final PorterDuff.Mode f1087q = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f46909toq = "AppCompatDrawableManag";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final boolean f46910zy = false;

    /* JADX INFO: renamed from: k */
    private lrht f1088k;

    /* JADX INFO: renamed from: androidx.appcompat.widget.ld6$k */
    /* JADX INFO: compiled from: AppCompatDrawableManager.java */
    class C0199k implements lrht.InterfaceC0200g {

        /* JADX INFO: renamed from: k */
        private final int[] f1090k = {C7397k.g.f92368dr, C7397k.g.f92361c8jq, C7397k.g.f42351k};

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final int[] f46911toq = {C7397k.g.f42365z, C7397k.g.f92416y9n, C7397k.g.f92374fti, C7397k.g.f92411wvg, C7397k.g.f42360t, C7397k.g.f92357a9, C7397k.g.f92382jk};

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final int[] f46912zy = {C7397k.g.f92415y2, C7397k.g.f92377gyi, C7397k.g.f92384ki, C7397k.g.f92388lv5, C7397k.g.f92403t8iq, C7397k.g.f42361u, C7397k.g.f92360bo};

        /* JADX INFO: renamed from: q */
        private final int[] f1092q = {C7397k.g.f92407uv6, C7397k.g.f42348h, C7397k.g.f92387lrht};

        /* JADX INFO: renamed from: n */
        private final int[] f1091n = {C7397k.g.f92363ch, C7397k.g.f92414xwq3};

        /* JADX INFO: renamed from: g */
        private final int[] f1089g = {C7397k.g.f42357q, C7397k.g.f42356p, C7397k.g.f42354n, C7397k.g.f92386ld6};

        C0199k() {
        }

        private ColorStateList f7l8(@zy.lvui Context context) {
            return m638y(context, 0);
        }

        /* JADX INFO: renamed from: g */
        private boolean m635g(int[] iArr, int i2) {
            for (int i3 : iArr) {
                if (i3 == i2) {
                    return true;
                }
            }
            return false;
        }

        private ColorStateList ld6(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            int i2 = C7397k.toq.f92863g1;
            ColorStateList colorStateListM691g = C0214o.m691g(context, i2);
            if (colorStateListM691g == null || !colorStateListM691g.isStateful()) {
                iArr[0] = C0214o.f46937zy;
                iArr2[0] = C0214o.zy(context, i2);
                iArr[1] = C0214o.f46934f7l8;
                iArr2[1] = C0214o.m694q(context, C7397k.toq.f92946qkj8);
                iArr[2] = C0214o.f1159p;
                iArr2[2] = C0214o.m694q(context, i2);
            } else {
                int[] iArr3 = C0214o.f46937zy;
                iArr[0] = iArr3;
                iArr2[0] = colorStateListM691g.getColorForState(iArr3, 0);
                iArr[1] = C0214o.f46934f7l8;
                iArr2[1] = C0214o.m694q(context, C7397k.toq.f92946qkj8);
                iArr[2] = C0214o.f1159p;
                iArr2[2] = colorStateListM691g.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        /* JADX INFO: renamed from: p */
        private ColorStateList m636p(@zy.lvui Context context) {
            return m638y(context, C0214o.m694q(context, C7397k.toq.f92974vq));
        }

        private void qrj(Drawable drawable, int i2, PorterDuff.Mode mode) {
            if (oc.m696k(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = ld6.f1087q;
            }
            drawable.setColorFilter(ld6.m629n(i2, mode));
        }

        /* JADX INFO: renamed from: s */
        private ColorStateList m637s(@zy.lvui Context context) {
            return m638y(context, C0214o.m694q(context, C7397k.toq.f42480d));
        }

        private LayerDrawable x2(@zy.lvui lrht lrhtVar, @zy.lvui Context context, @InterfaceC7829h int i2) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i2);
            Drawable drawableM650p = lrhtVar.m650p(context, C7397k.g.f92358a98o);
            Drawable drawableM650p2 = lrhtVar.m650p(context, C7397k.g.f42341a);
            if ((drawableM650p instanceof BitmapDrawable) && drawableM650p.getIntrinsicWidth() == dimensionPixelSize && drawableM650p.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) drawableM650p;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                drawableM650p.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableM650p.draw(canvas);
                bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
                bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((drawableM650p2 instanceof BitmapDrawable) && drawableM650p2.getIntrinsicWidth() == dimensionPixelSize && drawableM650p2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) drawableM650p2;
            } else {
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                drawableM650p2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableM650p2.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, R.id.background);
            layerDrawable.setId(1, R.id.secondaryProgress);
            layerDrawable.setId(2, R.id.progress);
            return layerDrawable;
        }

        /* JADX INFO: renamed from: y */
        private ColorStateList m638y(@zy.lvui Context context, @zy.x2 int i2) {
            int iM694q = C0214o.m694q(context, C7397k.toq.f92859fnq8);
            return new ColorStateList(new int[][]{C0214o.f46937zy, C0214o.f1156g, C0214o.f1160q, C0214o.f1159p}, new int[]{C0214o.zy(context, C7397k.toq.f92974vq), C0541p.m2536i(iM694q, i2), C0541p.m2536i(iM694q, i2), i2});
        }

        @Override // androidx.appcompat.widget.lrht.InterfaceC0200g
        /* JADX INFO: renamed from: k */
        public Drawable mo639k(@zy.lvui lrht lrhtVar, @zy.lvui Context context, int i2) {
            if (i2 == C7397k.g.f92362cdj) {
                return new LayerDrawable(new Drawable[]{lrhtVar.m650p(context, C7397k.g.f42348h), lrhtVar.m650p(context, C7397k.g.f92384ki)});
            }
            if (i2 == C7397k.g.f42345e) {
                return x2(lrhtVar, context, C7397k.n.f92520y9n);
            }
            if (i2 == C7397k.g.f92409vyq) {
                return x2(lrhtVar, context, C7397k.n.f42387b);
            }
            if (i2 == C7397k.g.f92397nn86) {
                return x2(lrhtVar, context, C7397k.n.f92455bf2);
            }
            return null;
        }

        @Override // androidx.appcompat.widget.lrht.InterfaceC0200g
        /* JADX INFO: renamed from: n */
        public boolean mo640n(@zy.lvui Context context, int i2, @zy.lvui Drawable drawable) {
            if (i2 == C7397k.g.f42342b) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.background);
                int i3 = C7397k.toq.f92947qo;
                qrj(drawableFindDrawableByLayerId, C0214o.m694q(context, i3), ld6.f1087q);
                qrj(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), C0214o.m694q(context, i3), ld6.f1087q);
                qrj(layerDrawable.findDrawableByLayerId(R.id.progress), C0214o.m694q(context, C7397k.toq.f92946qkj8), ld6.f1087q);
                return true;
            }
            if (i2 != C7397k.g.f42345e && i2 != C7397k.g.f92409vyq && i2 != C7397k.g.f92397nn86) {
                return false;
            }
            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
            qrj(layerDrawable2.findDrawableByLayerId(R.id.background), C0214o.zy(context, C7397k.toq.f92947qo), ld6.f1087q);
            Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress);
            int i4 = C7397k.toq.f92946qkj8;
            qrj(drawableFindDrawableByLayerId2, C0214o.m694q(context, i4), ld6.f1087q);
            qrj(layerDrawable2.findDrawableByLayerId(R.id.progress), C0214o.m694q(context, i4), ld6.f1087q);
            return true;
        }

        @Override // androidx.appcompat.widget.lrht.InterfaceC0200g
        /* JADX INFO: renamed from: q */
        public PorterDuff.Mode mo641q(int i2) {
            if (i2 == C7397k.g.f92418zp) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override // androidx.appcompat.widget.lrht.InterfaceC0200g
        public ColorStateList toq(@zy.lvui Context context, int i2) {
            if (i2 == C7397k.g.f92372fn3e) {
                return C6045k.m22274k(context, C7397k.q.f92603zurt);
            }
            if (i2 == C7397k.g.f42363x) {
                return C6045k.m22274k(context, C7397k.q.f42446z);
            }
            if (i2 == C7397k.g.f92418zp) {
                return ld6(context);
            }
            if (i2 == C7397k.g.f42359s) {
                return m636p(context);
            }
            if (i2 == C7397k.g.f92420zy) {
                return f7l8(context);
            }
            if (i2 == C7397k.g.f42364y) {
                return m637s(context);
            }
            if (i2 == C7397k.g.f92359bf2 || i2 == C7397k.g.f92380i1) {
                return C6045k.m22274k(context, C7397k.q.f92563fu4);
            }
            if (m635g(this.f46911toq, i2)) {
                return C0214o.m691g(context, C7397k.toq.f92947qo);
            }
            if (m635g(this.f1091n, i2)) {
                return C6045k.m22274k(context, C7397k.q.f92561fn3e);
            }
            if (m635g(this.f1089g, i2)) {
                return C6045k.m22274k(context, C7397k.q.f42430i);
            }
            if (i2 == C7397k.g.f92417yz) {
                return C6045k.m22274k(context, C7397k.q.f92583ni7);
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0061 A[RETURN] */
        @Override // androidx.appcompat.widget.lrht.InterfaceC0200g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean zy(@zy.lvui android.content.Context r7, int r8, @zy.lvui android.graphics.drawable.Drawable r9) {
            /*
                r6 = this;
                android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.ld6.m628k()
                int[] r1 = r6.f1090k
                boolean r1 = r6.m635g(r1, r8)
                r2 = 16842801(0x1010031, float:2.3693695E-38)
                r3 = -1
                r4 = 0
                r5 = 1
                if (r1 == 0) goto L17
                int r2 = p030n.C7397k.toq.f92947qo
            L14:
                r8 = r3
            L15:
                r1 = r5
                goto L44
            L17:
                int[] r1 = r6.f46912zy
                boolean r1 = r6.m635g(r1, r8)
                if (r1 == 0) goto L22
                int r2 = p030n.C7397k.toq.f92946qkj8
                goto L14
            L22:
                int[] r1 = r6.f1092q
                boolean r1 = r6.m635g(r1, r8)
                if (r1 == 0) goto L2d
                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
                goto L14
            L2d:
                int r1 = p030n.C7397k.g.f92364d2ok
                if (r8 != r1) goto L3c
                r2 = 16842800(0x1010030, float:2.3693693E-38)
                r8 = 1109603123(0x42233333, float:40.8)
                int r8 = java.lang.Math.round(r8)
                goto L15
            L3c:
                int r1 = p030n.C7397k.g.f42349i
                if (r8 != r1) goto L41
                goto L14
            L41:
                r8 = r3
                r1 = r4
                r2 = r1
            L44:
                if (r1 == 0) goto L61
                boolean r1 = androidx.appcompat.widget.oc.m696k(r9)
                if (r1 == 0) goto L50
                android.graphics.drawable.Drawable r9 = r9.mutate()
            L50:
                int r7 = androidx.appcompat.widget.C0214o.m694q(r7, r2)
                android.graphics.PorterDuffColorFilter r7 = androidx.appcompat.widget.ld6.m629n(r7, r0)
                r9.setColorFilter(r7)
                if (r8 == r3) goto L60
                r9.setAlpha(r8)
            L60:
                return r5
            L61:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ld6.C0199k.zy(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }
    }

    /* JADX INFO: renamed from: n */
    public static synchronized PorterDuffColorFilter m629n(int i2, PorterDuff.Mode mode) {
        return lrht.x2(i2, mode);
    }

    /* JADX INFO: renamed from: p */
    static void m630p(Drawable drawable, yz yzVar, int[] iArr) {
        lrht.ni7(drawable, yzVar, iArr);
    }

    /* JADX INFO: renamed from: s */
    public static synchronized void m631s() {
        if (f1086n == null) {
            ld6 ld6Var = new ld6();
            f1086n = ld6Var;
            ld6Var.f1088k = lrht.m648y();
            f1086n.f1088k.fn3e(new C0199k());
        }
    }

    public static synchronized ld6 toq() {
        if (f1086n == null) {
            m631s();
        }
        return f1086n;
    }

    public synchronized void f7l8(@zy.lvui Context context) {
        this.f1088k.t8r(context);
    }

    /* JADX INFO: renamed from: g */
    synchronized ColorStateList m632g(@zy.lvui Context context, @zy.fn3e int i2) {
        return this.f1088k.qrj(context, i2);
    }

    boolean ld6(@zy.lvui Context context, @zy.fn3e int i2, @zy.lvui Drawable drawable) {
        return this.f1088k.fu4(context, i2, drawable);
    }

    /* JADX INFO: renamed from: q */
    synchronized Drawable m633q(@zy.lvui Context context, @zy.fn3e int i2, boolean z2) {
        return this.f1088k.ld6(context, i2, z2);
    }

    /* JADX INFO: renamed from: y */
    synchronized Drawable m634y(@zy.lvui Context context, @zy.lvui ch chVar, @zy.fn3e int i2) {
        return this.f1088k.m649i(context, chVar, i2);
    }

    public synchronized Drawable zy(@zy.lvui Context context, @zy.fn3e int i2) {
        return this.f1088k.m650p(context, i2);
    }
}
