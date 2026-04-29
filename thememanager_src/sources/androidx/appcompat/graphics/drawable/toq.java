package androidx.appcompat.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import com.android.thememanager.router.app.entity.ThemeStatus;
import zy.dd;
import zy.hyr;
import zy.lvui;
import zy.uv6;

/* JADX INFO: compiled from: DrawableContainer.java */
/* JADX INFO: loaded from: classes.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
class toq extends Drawable implements Drawable.Callback {

    /* JADX INFO: renamed from: c */
    private static final boolean f364c = true;

    /* JADX INFO: renamed from: f */
    private static final String f365f = "DrawableContainer";

    /* JADX INFO: renamed from: l */
    private static final boolean f366l = false;

    /* JADX INFO: renamed from: g */
    private Drawable f367g;

    /* JADX INFO: renamed from: h */
    private boolean f368h;

    /* JADX INFO: renamed from: i */
    private Runnable f369i;

    /* JADX INFO: renamed from: k */
    private AbstractC0113q f370k;

    /* JADX INFO: renamed from: n */
    private Drawable f371n;

    /* JADX INFO: renamed from: q */
    private Rect f373q;

    /* JADX INFO: renamed from: r */
    private zy f374r;

    /* JADX INFO: renamed from: s */
    private boolean f375s;

    /* JADX INFO: renamed from: t */
    private long f376t;

    /* JADX INFO: renamed from: z */
    private long f378z;

    /* JADX INFO: renamed from: y */
    private int f377y = 255;

    /* JADX INFO: renamed from: p */
    private int f372p = -1;

    /* JADX INFO: renamed from: androidx.appcompat.graphics.drawable.toq$k */
    /* JADX INFO: compiled from: DrawableContainer.java */
    class RunnableC0112k implements Runnable {
        RunnableC0112k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            toq.this.m275k(true);
            toq.this.invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.graphics.drawable.toq$q */
    /* JADX INFO: compiled from: DrawableContainer.java */
    static abstract class AbstractC0113q extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a9, reason: collision with root package name */
        boolean f46647a9;

        /* JADX INFO: renamed from: cdj, reason: collision with root package name */
        int f46648cdj;

        /* JADX INFO: renamed from: d3, reason: collision with root package name */
        boolean f46649d3;

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        Drawable[] f46650f7l8;

        /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
        boolean f46651fn3e;

        /* JADX INFO: renamed from: fti, reason: collision with root package name */
        ColorStateList f46652fti;

        /* JADX INFO: renamed from: fu4, reason: collision with root package name */
        boolean f46653fu4;

        /* JADX INFO: renamed from: g */
        SparseArray<Drawable.ConstantState> f380g;

        /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
        boolean f46654gvn7;

        /* JADX INFO: renamed from: h */
        int f381h;

        /* JADX INFO: renamed from: i */
        boolean f382i;

        /* JADX INFO: renamed from: jk, reason: collision with root package name */
        ColorFilter f46655jk;

        /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
        PorterDuff.Mode f46656jp0y;

        /* JADX INFO: renamed from: k */
        final toq f383k;

        /* JADX INFO: renamed from: ki, reason: collision with root package name */
        boolean f46657ki;

        /* JADX INFO: renamed from: kja0, reason: collision with root package name */
        int f46658kja0;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        Rect f46659ld6;

        /* JADX INFO: renamed from: mcp, reason: collision with root package name */
        boolean f46660mcp;

        /* JADX INFO: renamed from: n */
        int f384n;

        /* JADX INFO: renamed from: n7h, reason: collision with root package name */
        int f46661n7h;

        /* JADX INFO: renamed from: ni7, reason: collision with root package name */
        boolean f46662ni7;

        /* JADX INFO: renamed from: o1t, reason: collision with root package name */
        int f46663o1t;

        /* JADX INFO: renamed from: p */
        boolean f385p;

        /* JADX INFO: renamed from: q */
        int f386q;

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        boolean f46664qrj;

        /* JADX INFO: renamed from: s */
        boolean f387s;

        /* JADX INFO: renamed from: t */
        int f388t;

        /* JADX INFO: renamed from: t8r, reason: collision with root package name */
        int f46665t8r;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        Resources f46666toq;

        /* JADX INFO: renamed from: wvg, reason: collision with root package name */
        int f46667wvg;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        boolean f46668x2;

        /* JADX INFO: renamed from: y */
        int f389y;

        /* JADX INFO: renamed from: z */
        boolean f390z;

        /* JADX INFO: renamed from: zurt, reason: collision with root package name */
        boolean f46669zurt;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        int f46670zy;

        AbstractC0113q(AbstractC0113q abstractC0113q, toq toqVar, Resources resources) {
            this.f387s = false;
            this.f46668x2 = false;
            this.f46653fu4 = true;
            this.f46667wvg = 0;
            this.f388t = 0;
            this.f383k = toqVar;
            this.f46666toq = resources != null ? resources : abstractC0113q != null ? abstractC0113q.f46666toq : null;
            int iF7l8 = toq.f7l8(resources, abstractC0113q != null ? abstractC0113q.f46670zy : 0);
            this.f46670zy = iF7l8;
            if (abstractC0113q == null) {
                this.f46650f7l8 = new Drawable[10];
                this.f389y = 0;
                return;
            }
            this.f386q = abstractC0113q.f386q;
            this.f384n = abstractC0113q.f384n;
            this.f46669zurt = true;
            this.f46662ni7 = true;
            this.f387s = abstractC0113q.f387s;
            this.f46668x2 = abstractC0113q.f46668x2;
            this.f46653fu4 = abstractC0113q.f46653fu4;
            this.f390z = abstractC0113q.f390z;
            this.f46663o1t = abstractC0113q.f46663o1t;
            this.f46667wvg = abstractC0113q.f46667wvg;
            this.f388t = abstractC0113q.f388t;
            this.f46660mcp = abstractC0113q.f46660mcp;
            this.f46655jk = abstractC0113q.f46655jk;
            this.f46647a9 = abstractC0113q.f46647a9;
            this.f46652fti = abstractC0113q.f46652fti;
            this.f46656jp0y = abstractC0113q.f46656jp0y;
            this.f46654gvn7 = abstractC0113q.f46654gvn7;
            this.f46649d3 = abstractC0113q.f46649d3;
            if (abstractC0113q.f46670zy == iF7l8) {
                if (abstractC0113q.f385p) {
                    this.f46659ld6 = abstractC0113q.f46659ld6 != null ? new Rect(abstractC0113q.f46659ld6) : null;
                    this.f385p = true;
                }
                if (abstractC0113q.f46664qrj) {
                    this.f46661n7h = abstractC0113q.f46661n7h;
                    this.f46658kja0 = abstractC0113q.f46658kja0;
                    this.f381h = abstractC0113q.f381h;
                    this.f46648cdj = abstractC0113q.f46648cdj;
                    this.f46664qrj = true;
                }
            }
            if (abstractC0113q.f46657ki) {
                this.f46665t8r = abstractC0113q.f46665t8r;
                this.f46657ki = true;
            }
            if (abstractC0113q.f382i) {
                this.f46651fn3e = abstractC0113q.f46651fn3e;
                this.f382i = true;
            }
            Drawable[] drawableArr = abstractC0113q.f46650f7l8;
            this.f46650f7l8 = new Drawable[drawableArr.length];
            this.f389y = abstractC0113q.f389y;
            SparseArray<Drawable.ConstantState> sparseArray = abstractC0113q.f380g;
            if (sparseArray != null) {
                this.f380g = sparseArray.clone();
            } else {
                this.f380g = new SparseArray<>(this.f389y);
            }
            int i2 = this.f389y;
            for (int i3 = 0; i3 < i2; i3++) {
                Drawable drawable = drawableArr[i3];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f380g.put(i3, constantState);
                    } else {
                        this.f46650f7l8[i3] = drawableArr[i3];
                    }
                }
            }
        }

        /* JADX INFO: renamed from: g */
        private void m279g() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f380g;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i2 = 0; i2 < size; i2++) {
                    this.f46650f7l8[this.f380g.keyAt(i2)] = ni7(this.f380g.valueAt(i2).newDrawable(this.f46666toq));
                }
                this.f380g = null;
            }
        }

        private Drawable ni7(Drawable drawable) {
            androidx.core.graphics.drawable.zy.qrj(drawable, this.f46663o1t);
            Drawable drawableMutate = drawable.mutate();
            drawableMutate.setCallback(this.f383k);
            return drawableMutate;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @hyr(21)
        public boolean canApplyTheme() {
            int i2 = this.f389y;
            Drawable[] drawableArr = this.f46650f7l8;
            for (int i3 = 0; i3 < i2; i3++) {
                Drawable drawable = drawableArr[i3];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.f380g.get(i3);
                    if (constantState != null && C7851toq.m290k(constantState)) {
                        return true;
                    }
                } else if (androidx.core.graphics.drawable.zy.toq(drawable)) {
                    return true;
                }
            }
            return false;
        }

        public final int cdj() {
            if (this.f46657ki) {
                return this.f46665t8r;
            }
            m279g();
            int i2 = this.f389y;
            Drawable[] drawableArr = this.f46650f7l8;
            int opacity = i2 > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i3 = 1; i3 < i2; i3++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i3].getOpacity());
            }
            this.f46665t8r = opacity;
            this.f46657ki = true;
            return opacity;
        }

        final int f7l8() {
            return this.f46650f7l8.length;
        }

        public final boolean fn3e() {
            if (this.f382i) {
                return this.f46651fn3e;
            }
            m279g();
            int i2 = this.f389y;
            Drawable[] drawableArr = this.f46650f7l8;
            boolean z2 = false;
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    break;
                }
                if (drawableArr[i3].isStateful()) {
                    z2 = true;
                    break;
                }
                i3++;
            }
            this.f46651fn3e = z2;
            this.f382i = true;
            return z2;
        }

        public final void fu4(boolean z2) {
            this.f46668x2 = z2;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f386q | this.f384n;
        }

        /* JADX INFO: renamed from: h */
        public final int m280h() {
            return this.f388t;
        }

        /* JADX INFO: renamed from: i */
        public final boolean m281i() {
            return this.f46668x2;
        }

        /* JADX INFO: renamed from: k */
        public final int m282k(Drawable drawable) {
            int i2 = this.f389y;
            if (i2 >= this.f46650f7l8.length) {
                ki(i2, i2 + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f383k);
            this.f46650f7l8[i2] = drawable;
            this.f389y++;
            this.f384n = drawable.getChangingConfigurations() | this.f384n;
            t8r();
            this.f46659ld6 = null;
            this.f385p = false;
            this.f46664qrj = false;
            this.f46669zurt = false;
            return i2;
        }

        public void ki(int i2, int i3) {
            Drawable[] drawableArr = new Drawable[i3];
            Drawable[] drawableArr2 = this.f46650f7l8;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i2);
            }
            this.f46650f7l8 = drawableArr;
        }

        public final int kja0() {
            return this.f46667wvg;
        }

        public final int ld6() {
            if (!this.f46664qrj) {
                m283n();
            }
            return this.f46648cdj;
        }

        final void mcp(Resources resources) {
            if (resources != null) {
                this.f46666toq = resources;
                int iF7l8 = toq.f7l8(resources, this.f46670zy);
                int i2 = this.f46670zy;
                this.f46670zy = iF7l8;
                if (i2 != iF7l8) {
                    this.f46664qrj = false;
                    this.f385p = false;
                }
            }
        }

        /* JADX INFO: renamed from: n */
        protected void m283n() {
            this.f46664qrj = true;
            m279g();
            int i2 = this.f389y;
            Drawable[] drawableArr = this.f46650f7l8;
            this.f46658kja0 = -1;
            this.f46661n7h = -1;
            this.f46648cdj = 0;
            this.f381h = 0;
            for (int i3 = 0; i3 < i2; i3++) {
                Drawable drawable = drawableArr[i3];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f46661n7h) {
                    this.f46661n7h = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f46658kja0) {
                    this.f46658kja0 = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f381h) {
                    this.f381h = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f46648cdj) {
                    this.f46648cdj = minimumHeight;
                }
            }
        }

        public final int n7h() {
            if (!this.f46664qrj) {
                m283n();
            }
            return this.f46661n7h;
        }

        public final void o1t(int i2) {
            this.f388t = i2;
        }

        /* JADX INFO: renamed from: p */
        public final int m284p() {
            if (!this.f46664qrj) {
                m283n();
            }
            return this.f46658kja0;
        }

        /* JADX INFO: renamed from: q */
        final void m285q() {
            this.f390z = false;
        }

        public final Rect qrj() {
            Rect rect = null;
            if (this.f387s) {
                return null;
            }
            Rect rect2 = this.f46659ld6;
            if (rect2 != null || this.f385p) {
                return rect2;
            }
            m279g();
            Rect rect3 = new Rect();
            int i2 = this.f389y;
            Drawable[] drawableArr = this.f46650f7l8;
            for (int i3 = 0; i3 < i2; i3++) {
                if (drawableArr[i3].getPadding(rect3)) {
                    if (rect == null) {
                        rect = new Rect(0, 0, 0, 0);
                    }
                    int i4 = rect3.left;
                    if (i4 > rect.left) {
                        rect.left = i4;
                    }
                    int i5 = rect3.top;
                    if (i5 > rect.top) {
                        rect.top = i5;
                    }
                    int i6 = rect3.right;
                    if (i6 > rect.right) {
                        rect.right = i6;
                    }
                    int i7 = rect3.bottom;
                    if (i7 > rect.bottom) {
                        rect.bottom = i7;
                    }
                }
            }
            this.f385p = true;
            this.f46659ld6 = rect;
            return rect;
        }

        /* JADX INFO: renamed from: s */
        public final int m286s() {
            return this.f389y;
        }

        /* JADX INFO: renamed from: t */
        public final void m287t(boolean z2) {
            this.f387s = z2;
        }

        void t8r() {
            this.f46657ki = false;
            this.f382i = false;
        }

        @hyr(21)
        final void toq(Resources.Theme theme) {
            if (theme != null) {
                m279g();
                int i2 = this.f389y;
                Drawable[] drawableArr = this.f46650f7l8;
                for (int i3 = 0; i3 < i2; i3++) {
                    Drawable drawable = drawableArr[i3];
                    if (drawable != null && androidx.core.graphics.drawable.zy.toq(drawable)) {
                        androidx.core.graphics.drawable.zy.m2443k(drawableArr[i3], theme);
                        this.f384n |= drawableArr[i3].getChangingConfigurations();
                    }
                }
                mcp(C7851toq.zy(theme));
            }
        }

        final boolean wvg(int i2, int i3) {
            int i4 = this.f389y;
            Drawable[] drawableArr = this.f46650f7l8;
            boolean z2 = false;
            for (int i5 = 0; i5 < i4; i5++) {
                Drawable drawable = drawableArr[i5];
                if (drawable != null) {
                    boolean zQrj = androidx.core.graphics.drawable.zy.qrj(drawable, i2);
                    if (i5 == i3) {
                        z2 = zQrj;
                    }
                }
            }
            this.f46663o1t = i2;
            return z2;
        }

        public final int x2() {
            if (!this.f46664qrj) {
                m283n();
            }
            return this.f381h;
        }

        /* JADX INFO: renamed from: y */
        public final Drawable m288y(int i2) {
            int iIndexOfKey;
            Drawable drawable = this.f46650f7l8[i2];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f380g;
            if (sparseArray == null || (iIndexOfKey = sparseArray.indexOfKey(i2)) < 0) {
                return null;
            }
            Drawable drawableNi7 = ni7(this.f380g.valueAt(iIndexOfKey).newDrawable(this.f46666toq));
            this.f46650f7l8[i2] = drawableNi7;
            this.f380g.removeAt(iIndexOfKey);
            if (this.f380g.size() == 0) {
                this.f380g = null;
            }
            return drawableNi7;
        }

        /* JADX INFO: renamed from: z */
        public final void m289z(int i2) {
            this.f46667wvg = i2;
        }

        void zurt() {
            int i2 = this.f389y;
            Drawable[] drawableArr = this.f46650f7l8;
            for (int i3 = 0; i3 < i2; i3++) {
                Drawable drawable = drawableArr[i3];
                if (drawable != null) {
                    drawable.mutate();
                }
            }
            this.f390z = true;
        }

        public boolean zy() {
            if (this.f46669zurt) {
                return this.f46662ni7;
            }
            m279g();
            this.f46669zurt = true;
            int i2 = this.f389y;
            Drawable[] drawableArr = this.f46650f7l8;
            for (int i3 = 0; i3 < i2; i3++) {
                if (drawableArr[i3].getConstantState() == null) {
                    this.f46662ni7 = false;
                    return false;
                }
            }
            this.f46662ni7 = true;
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.graphics.drawable.toq$toq, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DrawableContainer.java */
    @hyr(21)
    private static class C7851toq {
        private C7851toq() {
        }

        /* JADX INFO: renamed from: k */
        public static boolean m290k(Drawable.ConstantState constantState) {
            return constantState.canApplyTheme();
        }

        public static void toq(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }

        public static Resources zy(Resources.Theme theme) {
            return theme.getResources();
        }
    }

    /* JADX INFO: compiled from: DrawableContainer.java */
    static class zy implements Drawable.Callback {

        /* JADX INFO: renamed from: k */
        private Drawable.Callback f391k;

        zy() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(@lvui Drawable drawable) {
        }

        /* JADX INFO: renamed from: k */
        public Drawable.Callback m291k() {
            Drawable.Callback callback = this.f391k;
            this.f391k = null;
            return callback;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(@lvui Drawable drawable, @lvui Runnable runnable, long j2) {
            Drawable.Callback callback = this.f391k;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j2);
            }
        }

        public zy toq(Drawable.Callback callback) {
            this.f391k = callback;
            return this;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(@lvui Drawable drawable, @lvui Runnable runnable) {
            Drawable.Callback callback = this.f391k;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    toq() {
    }

    static int f7l8(@dd Resources resources, int i2) {
        if (resources != null) {
            i2 = resources.getDisplayMetrics().densityDpi;
        }
        return i2 == 0 ? ThemeStatus.Redeem.REDEEMING : i2;
    }

    /* JADX INFO: renamed from: g */
    private boolean m273g() {
        return isAutoMirrored() && androidx.core.graphics.drawable.zy.m2441g(this) == 1;
    }

    /* JADX INFO: renamed from: n */
    private void m274n(Drawable drawable) {
        if (this.f374r == null) {
            this.f374r = new zy();
        }
        drawable.setCallback(this.f374r.toq(drawable.getCallback()));
        try {
            if (this.f370k.f46667wvg <= 0 && this.f375s) {
                drawable.setAlpha(this.f377y);
            }
            AbstractC0113q abstractC0113q = this.f370k;
            if (abstractC0113q.f46647a9) {
                drawable.setColorFilter(abstractC0113q.f46655jk);
            } else {
                if (abstractC0113q.f46654gvn7) {
                    androidx.core.graphics.drawable.zy.kja0(drawable, abstractC0113q.f46652fti);
                }
                AbstractC0113q abstractC0113q2 = this.f370k;
                if (abstractC0113q2.f46649d3) {
                    androidx.core.graphics.drawable.zy.m2442h(drawable, abstractC0113q2.f46656jp0y);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f370k.f46653fu4);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            androidx.core.graphics.drawable.zy.qrj(drawable, androidx.core.graphics.drawable.zy.m2441g(this));
            androidx.core.graphics.drawable.zy.m2445p(drawable, this.f370k.f46660mcp);
            Rect rect = this.f373q;
            if (rect != null) {
                androidx.core.graphics.drawable.zy.x2(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.f374r.m291k());
        }
    }

    @Override // android.graphics.drawable.Drawable
    @hyr(21)
    public void applyTheme(@lvui Resources.Theme theme) {
        this.f370k.toq(theme);
    }

    @Override // android.graphics.drawable.Drawable
    @hyr(21)
    public boolean canApplyTheme() {
        return this.f370k.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@lvui Canvas canvas) {
        Drawable drawable = this.f371n;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f367g;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f377y;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f370k.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (!this.f370k.zy()) {
            return null;
        }
        this.f370k.f386q = getChangingConfigurations();
        return this.f370k;
    }

    @Override // android.graphics.drawable.Drawable
    @lvui
    public Drawable getCurrent() {
        return this.f371n;
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(@lvui Rect rect) {
        Rect rect2 = this.f373q;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.f370k.m281i()) {
            return this.f370k.m284p();
        }
        Drawable drawable = this.f371n;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.f370k.m281i()) {
            return this.f370k.n7h();
        }
        Drawable drawable = this.f371n;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        if (this.f370k.m281i()) {
            return this.f370k.ld6();
        }
        Drawable drawable = this.f371n;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        if (this.f370k.m281i()) {
            return this.f370k.x2();
        }
        Drawable drawable = this.f371n;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f371n;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f370k.cdj();
    }

    @Override // android.graphics.drawable.Drawable
    @hyr(21)
    public void getOutline(@lvui Outline outline) {
        Drawable drawable = this.f371n;
        if (drawable != null) {
            C7851toq.toq(drawable, outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@lvui Rect rect) {
        boolean padding;
        Rect rectQrj = this.f370k.qrj();
        if (rectQrj != null) {
            rect.set(rectQrj);
            padding = (rectQrj.right | ((rectQrj.left | rectQrj.top) | rectQrj.bottom)) != 0;
        } else {
            Drawable drawable = this.f371n;
            padding = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (m273g()) {
            int i2 = rect.left;
            rect.left = rect.right;
            rect.right = i2;
        }
        return padding;
    }

    public void invalidateDrawable(@lvui Drawable drawable) {
        AbstractC0113q abstractC0113q = this.f370k;
        if (abstractC0113q != null) {
            abstractC0113q.t8r();
        }
        if (drawable != this.f371n || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f370k.f46660mcp;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.f370k.fn3e();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z2;
        Drawable drawable = this.f367g;
        boolean z3 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f367g = null;
            z2 = true;
        } else {
            z2 = false;
        }
        Drawable drawable2 = this.f371n;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f375s) {
                this.f371n.setAlpha(this.f377y);
            }
        }
        if (this.f376t != 0) {
            this.f376t = 0L;
            z2 = true;
        }
        if (this.f378z != 0) {
            this.f378z = 0L;
        } else {
            z3 = z2;
        }
        if (z3) {
            invalidateSelf();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void m275k(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f375s = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f371n
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r7 = 0
            if (r3 == 0) goto L36
            long r9 = r13.f378z
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L38
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L22
            int r9 = r13.f377y
            r3.setAlpha(r9)
            r13.f378z = r7
            goto L38
        L22:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r9 = (int) r9
            androidx.appcompat.graphics.drawable.toq$q r10 = r13.f370k
            int r10 = r10.f46667wvg
            int r9 = r9 / r10
            int r9 = 255 - r9
            int r10 = r13.f377y
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = r0
            goto L39
        L36:
            r13.f378z = r7
        L38:
            r3 = r6
        L39:
            android.graphics.drawable.Drawable r9 = r13.f367g
            if (r9 == 0) goto L61
            long r10 = r13.f376t
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 == 0) goto L63
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L50
            r9.setVisible(r6, r6)
            r0 = 0
            r13.f367g = r0
            r13.f376t = r7
            goto L63
        L50:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            androidx.appcompat.graphics.drawable.toq$q r4 = r13.f370k
            int r4 = r4.f388t
            int r3 = r3 / r4
            int r4 = r13.f377y
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L64
        L61:
            r13.f376t = r7
        L63:
            r0 = r3
        L64:
            if (r14 == 0) goto L70
            if (r0 == 0) goto L70
            java.lang.Runnable r14 = r13.f369i
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.graphics.drawable.toq.m275k(boolean):void");
    }

    public void ld6(int i2) {
        this.f370k.f46667wvg = i2;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f368h && super.mutate() == this) {
            AbstractC0113q abstractC0113qZy = zy();
            abstractC0113qZy.zurt();
            mo257s(abstractC0113qZy);
            this.f368h = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f367g;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f371n;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i2) {
        return this.f370k.wvg(i2, m277q());
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i2) {
        Drawable drawable = this.f367g;
        if (drawable != null) {
            return drawable.setLevel(i2);
        }
        Drawable drawable2 = this.f371n;
        if (drawable2 != null) {
            return drawable2.setLevel(i2);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f367g;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f371n;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    void m276p(int i2) {
        m278y(i2);
    }

    /* JADX INFO: renamed from: q */
    int m277q() {
        return this.f372p;
    }

    final void qrj(Resources resources) {
        this.f370k.mcp(resources);
    }

    /* JADX INFO: renamed from: s */
    void mo257s(AbstractC0113q abstractC0113q) {
        this.f370k = abstractC0113q;
        int i2 = this.f372p;
        if (i2 >= 0) {
            Drawable drawableM288y = abstractC0113q.m288y(i2);
            this.f371n = drawableM288y;
            if (drawableM288y != null) {
                m274n(drawableM288y);
            }
        }
        this.f367g = null;
    }

    public void scheduleDrawable(@lvui Drawable drawable, @lvui Runnable runnable, long j2) {
        if (drawable != this.f371n || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        if (this.f375s && this.f377y == i2) {
            return;
        }
        this.f375s = true;
        this.f377y = i2;
        Drawable drawable = this.f371n;
        if (drawable != null) {
            if (this.f378z == 0) {
                drawable.setAlpha(i2);
            } else {
                m275k(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z2) {
        AbstractC0113q abstractC0113q = this.f370k;
        if (abstractC0113q.f46660mcp != z2) {
            abstractC0113q.f46660mcp = z2;
            Drawable drawable = this.f371n;
            if (drawable != null) {
                androidx.core.graphics.drawable.zy.m2445p(drawable, z2);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        AbstractC0113q abstractC0113q = this.f370k;
        abstractC0113q.f46647a9 = true;
        if (abstractC0113q.f46655jk != colorFilter) {
            abstractC0113q.f46655jk = colorFilter;
            Drawable drawable = this.f371n;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z2) {
        AbstractC0113q abstractC0113q = this.f370k;
        if (abstractC0113q.f46653fu4 != z2) {
            abstractC0113q.f46653fu4 = z2;
            Drawable drawable = this.f371n;
            if (drawable != null) {
                drawable.setDither(z2);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f2, float f3) {
        Drawable drawable = this.f371n;
        if (drawable != null) {
            androidx.core.graphics.drawable.zy.ld6(drawable, f2, f3);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i2, int i3, int i4, int i5) {
        Rect rect = this.f373q;
        if (rect == null) {
            this.f373q = new Rect(i2, i3, i4, i5);
        } else {
            rect.set(i2, i3, i4, i5);
        }
        Drawable drawable = this.f371n;
        if (drawable != null) {
            androidx.core.graphics.drawable.zy.x2(drawable, i2, i3, i4, i5);
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.n7h
    public void setTintList(ColorStateList colorStateList) {
        AbstractC0113q abstractC0113q = this.f370k;
        abstractC0113q.f46654gvn7 = true;
        if (abstractC0113q.f46652fti != colorStateList) {
            abstractC0113q.f46652fti = colorStateList;
            androidx.core.graphics.drawable.zy.kja0(this.f371n, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.n7h
    public void setTintMode(@lvui PorterDuff.Mode mode) {
        AbstractC0113q abstractC0113q = this.f370k;
        abstractC0113q.f46649d3 = true;
        if (abstractC0113q.f46656jp0y != mode) {
            abstractC0113q.f46656jp0y = mode;
            androidx.core.graphics.drawable.zy.m2442h(this.f371n, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z2, boolean z3) {
        boolean visible = super.setVisible(z2, z3);
        Drawable drawable = this.f367g;
        if (drawable != null) {
            drawable.setVisible(z2, z3);
        }
        Drawable drawable2 = this.f371n;
        if (drawable2 != null) {
            drawable2.setVisible(z2, z3);
        }
        return visible;
    }

    void toq() {
        this.f370k.m285q();
        this.f368h = false;
    }

    public void unscheduleDrawable(@lvui Drawable drawable, @lvui Runnable runnable) {
        if (drawable != this.f371n || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }

    public void x2(int i2) {
        this.f370k.f388t = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /* JADX INFO: renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    boolean m278y(int r10) {
        /*
            r9 = this;
            int r0 = r9.f372p
            r1 = 0
            if (r10 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            androidx.appcompat.graphics.drawable.toq$q r0 = r9.f370k
            int r0 = r0.f388t
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L2e
            android.graphics.drawable.Drawable r0 = r9.f367g
            if (r0 == 0) goto L1a
            r0.setVisible(r1, r1)
        L1a:
            android.graphics.drawable.Drawable r0 = r9.f371n
            if (r0 == 0) goto L29
            r9.f367g = r0
            androidx.appcompat.graphics.drawable.toq$q r0 = r9.f370k
            int r0 = r0.f388t
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f376t = r0
            goto L35
        L29:
            r9.f367g = r4
            r9.f376t = r5
            goto L35
        L2e:
            android.graphics.drawable.Drawable r0 = r9.f371n
            if (r0 == 0) goto L35
            r0.setVisible(r1, r1)
        L35:
            if (r10 < 0) goto L55
            androidx.appcompat.graphics.drawable.toq$q r0 = r9.f370k
            int r1 = r0.f389y
            if (r10 >= r1) goto L55
            android.graphics.drawable.Drawable r0 = r0.m288y(r10)
            r9.f371n = r0
            r9.f372p = r10
            if (r0 == 0) goto L5a
            androidx.appcompat.graphics.drawable.toq$q r10 = r9.f370k
            int r10 = r10.f46667wvg
            if (r10 <= 0) goto L51
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f378z = r2
        L51:
            r9.m274n(r0)
            goto L5a
        L55:
            r9.f371n = r4
            r10 = -1
            r9.f372p = r10
        L5a:
            long r0 = r9.f378z
            int r10 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            r0 = 1
            if (r10 != 0) goto L67
            long r1 = r9.f376t
            int r10 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r10 == 0) goto L79
        L67:
            java.lang.Runnable r10 = r9.f369i
            if (r10 != 0) goto L73
            androidx.appcompat.graphics.drawable.toq$k r10 = new androidx.appcompat.graphics.drawable.toq$k
            r10.<init>()
            r9.f369i = r10
            goto L76
        L73:
            r9.unscheduleSelf(r10)
        L76:
            r9.m275k(r0)
        L79:
            r9.invalidateSelf()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.graphics.drawable.toq.m278y(int):boolean");
    }

    AbstractC0113q zy() {
        return this.f370k;
    }
}
