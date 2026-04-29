package androidx.vectordrawable.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.util.AttributeSet;
import android.util.Log;
import androidx.collection.C0247k;
import androidx.core.content.res.C0505q;
import androidx.core.content.res.C0506s;
import androidx.core.content.res.kja0;
import androidx.core.graphics.cdj;
import androidx.core.view.C0683f;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import zy.dd;
import zy.fn3e;
import zy.hyr;
import zy.lvui;
import zy.uv6;
import zy.x2;

/* JADX INFO: renamed from: androidx.vectordrawable.graphics.drawable.s */
/* JADX INFO: compiled from: VectorDrawableCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class C1257s extends AbstractC1259y {

    /* JADX INFO: renamed from: a */
    private static final int f6839a = 1;

    /* JADX INFO: renamed from: b */
    private static final int f6840b = 0;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private static final boolean f53603bo = false;

    /* JADX INFO: renamed from: c */
    private static final String f6841c = "path";

    /* JADX INFO: renamed from: e */
    private static final String f6842e = "vector";

    /* JADX INFO: renamed from: f */
    private static final String f6843f = "group";

    /* JADX INFO: renamed from: j */
    private static final int f6844j = 0;

    /* JADX INFO: renamed from: l */
    private static final String f6845l = "clip-path";

    /* JADX INFO: renamed from: m */
    private static final int f6846m = 2;

    /* JADX INFO: renamed from: o */
    private static final int f6847o = 1;

    /* JADX INFO: renamed from: r */
    static final PorterDuff.Mode f6848r = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: t */
    static final String f6849t = "VectorDrawableCompat";

    /* JADX INFO: renamed from: u */
    private static final int f6850u = 2048;

    /* JADX INFO: renamed from: x */
    private static final int f6851x = 2;

    /* JADX INFO: renamed from: g */
    private ColorFilter f6852g;

    /* JADX INFO: renamed from: h */
    private final float[] f6853h;

    /* JADX INFO: renamed from: i */
    private final Matrix f6854i;

    /* JADX INFO: renamed from: n */
    private PorterDuffColorFilter f6855n;

    /* JADX INFO: renamed from: p */
    private Drawable.ConstantState f6856p;

    /* JADX INFO: renamed from: q */
    private y f6857q;

    /* JADX INFO: renamed from: s */
    private boolean f6858s;

    /* JADX INFO: renamed from: y */
    private boolean f6859y;

    /* JADX INFO: renamed from: z */
    private final Rect f6860z;

    /* JADX INFO: renamed from: androidx.vectordrawable.graphics.drawable.s$n */
    /* JADX INFO: compiled from: VectorDrawableCompat.java */
    private static abstract class n {
        private n() {
        }

        /* JADX INFO: renamed from: k */
        public boolean mo5472k() {
            return false;
        }

        public boolean toq(int[] iArr) {
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.vectordrawable.graphics.drawable.s$toq */
    /* JADX INFO: compiled from: VectorDrawableCompat.java */
    private static class toq extends g {
        toq() {
        }

        /* JADX INFO: renamed from: p */
        private void m5475p(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f53613toq = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f6870k = cdj.m2391q(string2);
            }
            this.f53614zy = kja0.ld6(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        @Override // androidx.vectordrawable.graphics.drawable.C1257s.g
        /* JADX INFO: renamed from: n */
        public boolean mo5469n() {
            return true;
        }

        /* JADX INFO: renamed from: s */
        public void m5476s(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (kja0.ki(xmlPullParser, "pathData")) {
                TypedArray typedArrayT8r = kja0.t8r(resources, theme, attributeSet, C1254k.f53553d3);
                m5475p(typedArrayT8r, xmlPullParser);
                typedArrayT8r.recycle();
            }
        }

        toq(toq toqVar) {
            super(toqVar);
        }
    }

    /* JADX INFO: renamed from: androidx.vectordrawable.graphics.drawable.s$y */
    /* JADX INFO: compiled from: VectorDrawableCompat.java */
    private static class y extends Drawable.ConstantState {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        int[] f53621f7l8;

        /* JADX INFO: renamed from: g */
        Bitmap f6880g;

        /* JADX INFO: renamed from: k */
        int f6881k;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        boolean f53622ld6;

        /* JADX INFO: renamed from: n */
        boolean f6882n;

        /* JADX INFO: renamed from: p */
        int f6883p;

        /* JADX INFO: renamed from: q */
        PorterDuff.Mode f6884q;

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        Paint f53623qrj;

        /* JADX INFO: renamed from: s */
        PorterDuff.Mode f6885s;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        f7l8 f53624toq;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        boolean f53625x2;

        /* JADX INFO: renamed from: y */
        ColorStateList f6886y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        ColorStateList f53626zy;

        public y(y yVar) {
            this.f53626zy = null;
            this.f6884q = C1257s.f6848r;
            if (yVar != null) {
                this.f6881k = yVar.f6881k;
                f7l8 f7l8Var = new f7l8(yVar.f53624toq);
                this.f53624toq = f7l8Var;
                if (yVar.f53624toq.f6864n != null) {
                    f7l8Var.f6864n = new Paint(yVar.f53624toq.f6864n);
                }
                if (yVar.f53624toq.f6866q != null) {
                    this.f53624toq.f6866q = new Paint(yVar.f53624toq.f6866q);
                }
                this.f53626zy = yVar.f53626zy;
                this.f6884q = yVar.f6884q;
                this.f6882n = yVar.f6882n;
            }
        }

        public boolean f7l8() {
            return this.f53624toq.m5467g();
        }

        /* JADX INFO: renamed from: g */
        public boolean m5477g() {
            return this.f53624toq.getRootAlpha() < 255;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f6881k;
        }

        /* JADX INFO: renamed from: k */
        public boolean m5478k(int i2, int i3) {
            return i2 == this.f6880g.getWidth() && i3 == this.f6880g.getHeight();
        }

        /* JADX INFO: renamed from: n */
        public Paint m5479n(ColorFilter colorFilter) {
            if (!m5477g() && colorFilter == null) {
                return null;
            }
            if (this.f53623qrj == null) {
                Paint paint = new Paint();
                this.f53623qrj = paint;
                paint.setFilterBitmap(true);
            }
            this.f53623qrj.setAlpha(this.f53624toq.getRootAlpha());
            this.f53623qrj.setColorFilter(colorFilter);
            return this.f53623qrj;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @lvui
        public Drawable newDrawable() {
            return new C1257s(this);
        }

        /* JADX INFO: renamed from: p */
        public void m5480p(int i2, int i3) {
            this.f6880g.eraseColor(0);
            this.f53624toq.toq(new Canvas(this.f6880g), i2, i3, null);
        }

        /* JADX INFO: renamed from: q */
        public void m5481q(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f6880g, (Rect) null, rect, m5479n(colorFilter));
        }

        /* JADX INFO: renamed from: s */
        public void m5482s() {
            this.f6886y = this.f53626zy;
            this.f6885s = this.f6884q;
            this.f6883p = this.f53624toq.getRootAlpha();
            this.f53622ld6 = this.f6882n;
            this.f53625x2 = false;
        }

        public boolean toq() {
            return !this.f53625x2 && this.f6886y == this.f53626zy && this.f6885s == this.f6884q && this.f53622ld6 == this.f6882n && this.f6883p == this.f53624toq.getRootAlpha();
        }

        /* JADX INFO: renamed from: y */
        public boolean m5483y(int[] iArr) {
            boolean zF7l8 = this.f53624toq.f7l8(iArr);
            this.f53625x2 |= zF7l8;
            return zF7l8;
        }

        public void zy(int i2, int i3) {
            if (this.f6880g == null || !m5478k(i2, i3)) {
                this.f6880g = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
                this.f53625x2 = true;
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @lvui
        public Drawable newDrawable(Resources resources) {
            return new C1257s(this);
        }

        public y() {
            this.f53626zy = null;
            this.f6884q = C1257s.f6848r;
            this.f53624toq = new f7l8();
        }
    }

    C1257s() {
        this.f6858s = true;
        this.f6853h = new float[9];
        this.f6854i = new Matrix();
        this.f6860z = new Rect();
        this.f6857q = new y();
    }

    /* JADX INFO: renamed from: k */
    static int m5457k(int i2, float f2) {
        return (i2 & C0683f.f50797t8r) | (((int) (Color.alpha(i2) * f2)) << 24);
    }

    private void ld6(q qVar, int i2) {
        String str = "";
        for (int i3 = 0; i3 < i2; i3++) {
            str = str + "    ";
        }
        Log.v(f6849t, str + "current group is :" + qVar.getGroupName() + " rotation is " + qVar.f53620zy);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("matrix is :");
        sb.append(qVar.getLocalMatrix().toString());
        Log.v(f6849t, sb.toString());
        for (int i4 = 0; i4 < qVar.f53618toq.size(); i4++) {
            n nVar = qVar.f53618toq.get(i4);
            if (nVar instanceof q) {
                ld6((q) nVar, i2 + 1);
            } else {
                ((g) nVar).f7l8(i2 + 1);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public static C1257s m5458n(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        C1257s c1257s = new C1257s();
        c1257s.inflate(resources, xmlPullParser, attributeSet, theme);
        return c1257s;
    }

    /* JADX INFO: renamed from: p */
    private static PorterDuff.Mode m5459p(int i2, PorterDuff.Mode mode) {
        if (i2 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i2 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i2 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i2) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    @dd
    /* JADX INFO: renamed from: q */
    public static C1257s m5460q(@lvui Resources resources, @fn3e int i2, @dd Resources.Theme theme) {
        C1257s c1257s = new C1257s();
        c1257s.f6894k = C0506s.f7l8(resources, i2, theme);
        c1257s.f6856p = new s(c1257s.f6894k.getConstantState());
        return c1257s;
    }

    private void qrj(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException {
        y yVar = this.f6857q;
        f7l8 f7l8Var = yVar.f53624toq;
        yVar.f6884q = m5459p(kja0.ld6(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList colorStateListF7l8 = kja0.f7l8(typedArray, xmlPullParser, theme, "tint", 1);
        if (colorStateListF7l8 != null) {
            yVar.f53626zy = colorStateListF7l8;
        }
        yVar.f6882n = kja0.m2304n(typedArray, xmlPullParser, "autoMirrored", 5, yVar.f6882n);
        f7l8Var.f53607ld6 = kja0.m2305p(typedArray, xmlPullParser, "viewportWidth", 7, f7l8Var.f53607ld6);
        float fM2305p = kja0.m2305p(typedArray, xmlPullParser, "viewportHeight", 8, f7l8Var.f53611x2);
        f7l8Var.f53611x2 = fM2305p;
        if (f7l8Var.f53607ld6 <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (fM2305p <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        f7l8Var.f6867s = typedArray.getDimension(3, f7l8Var.f6867s);
        float dimension = typedArray.getDimension(2, f7l8Var.f6865p);
        f7l8Var.f6865p = dimension;
        if (f7l8Var.f6867s <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
        }
        f7l8Var.setAlpha(kja0.m2305p(typedArray, xmlPullParser, "alpha", 4, f7l8Var.getAlpha()));
        String string = typedArray.getString(0);
        if (string != null) {
            f7l8Var.f53608n7h = string;
            f7l8Var.f6862h.put(string, f7l8Var);
        }
    }

    /* JADX INFO: renamed from: s */
    private boolean m5461s() {
        return isAutoMirrored() && androidx.core.graphics.drawable.zy.m2441g(this) == 1;
    }

    /* JADX INFO: renamed from: y */
    private void m5462y(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        y yVar = this.f6857q;
        f7l8 f7l8Var = yVar.f53624toq;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(f7l8Var.f6868y);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z2 = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                q qVar = (q) arrayDeque.peek();
                if ("path".equals(name)) {
                    zy zyVar = new zy();
                    zyVar.ld6(resources, attributeSet, theme, xmlPullParser);
                    qVar.f53618toq.add(zyVar);
                    if (zyVar.getPathName() != null) {
                        f7l8Var.f6862h.put(zyVar.getPathName(), zyVar);
                    }
                    z2 = false;
                    yVar.f6881k = zyVar.f6871q | yVar.f6881k;
                } else if (f6845l.equals(name)) {
                    toq toqVar = new toq();
                    toqVar.m5476s(resources, attributeSet, theme, xmlPullParser);
                    qVar.f53618toq.add(toqVar);
                    if (toqVar.getPathName() != null) {
                        f7l8Var.f6862h.put(toqVar.getPathName(), toqVar);
                    }
                    yVar.f6881k = toqVar.f6871q | yVar.f6881k;
                } else if (f6843f.equals(name)) {
                    q qVar2 = new q();
                    qVar2.zy(resources, attributeSet, theme, xmlPullParser);
                    qVar.f53618toq.add(qVar2);
                    arrayDeque.push(qVar2);
                    if (qVar2.getGroupName() != null) {
                        f7l8Var.f6862h.put(qVar2.getGroupName(), qVar2);
                    }
                    yVar.f6881k = qVar2.f53616ld6 | yVar.f6881k;
                }
            } else if (eventType == 3 && f6843f.equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z2) {
            throw new XmlPullParserException("no path defined");
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC1259y, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f6894k;
        if (drawable == null) {
            return false;
        }
        androidx.core.graphics.drawable.zy.toq(drawable);
        return false;
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC1259y, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f6894k;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f6860z);
        if (this.f6860z.width() <= 0 || this.f6860z.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f6852g;
        if (colorFilter == null) {
            colorFilter = this.f6855n;
        }
        canvas.getMatrix(this.f6854i);
        this.f6854i.getValues(this.f6853h);
        float fAbs = Math.abs(this.f6853h[0]);
        float fAbs2 = Math.abs(this.f6853h[4]);
        float fAbs3 = Math.abs(this.f6853h[1]);
        float fAbs4 = Math.abs(this.f6853h[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iMin = Math.min(2048, (int) (this.f6860z.width() * fAbs));
        int iMin2 = Math.min(2048, (int) (this.f6860z.height() * fAbs2));
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        Rect rect = this.f6860z;
        canvas.translate(rect.left, rect.top);
        if (m5461s()) {
            canvas.translate(this.f6860z.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.f6860z.offsetTo(0, 0);
        this.f6857q.zy(iMin, iMin2);
        if (!this.f6858s) {
            this.f6857q.m5480p(iMin, iMin2);
        } else if (!this.f6857q.toq()) {
            this.f6857q.m5480p(iMin, iMin2);
            this.f6857q.m5482s();
        }
        this.f6857q.m5481q(canvas, colorFilter, this.f6860z);
        canvas.restoreToCount(iSave);
    }

    Object f7l8(String str) {
        return this.f6857q.f53624toq.f6862h.get(str);
    }

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: g */
    public float m5463g() {
        f7l8 f7l8Var;
        y yVar = this.f6857q;
        if (yVar == null || (f7l8Var = yVar.f53624toq) == null) {
            return 1.0f;
        }
        float f2 = f7l8Var.f6867s;
        if (f2 == 0.0f) {
            return 1.0f;
        }
        float f3 = f7l8Var.f6865p;
        if (f3 == 0.0f) {
            return 1.0f;
        }
        float f4 = f7l8Var.f53611x2;
        if (f4 == 0.0f) {
            return 1.0f;
        }
        float f5 = f7l8Var.f53607ld6;
        if (f5 == 0.0f) {
            return 1.0f;
        }
        return Math.min(f5 / f2, f4 / f3);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f6894k;
        return drawable != null ? androidx.core.graphics.drawable.zy.m2446q(drawable) : this.f6857q.f53624toq.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f6894k;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f6857q.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f6894k;
        return drawable != null ? androidx.core.graphics.drawable.zy.m2444n(drawable) : this.f6852g;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f6894k != null) {
            return new s(this.f6894k.getConstantState());
        }
        this.f6857q.f6881k = getChangingConfigurations();
        return this.f6857q;
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC1259y, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f6894k;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f6857q.f53624toq.f6865p;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f6894k;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f6857q.f53624toq.f6867s;
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC1259y, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC1259y, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f6894k;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC1259y, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC1259y, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC1259y, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f6894k;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f6894k;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f6894k;
        return drawable != null ? androidx.core.graphics.drawable.zy.m2448y(drawable) : this.f6857q.f6882n;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        y yVar;
        ColorStateList colorStateList;
        Drawable drawable = this.f6894k;
        return drawable != null ? drawable.isStateful() : super.isStateful() || ((yVar = this.f6857q) != null && (yVar.f7l8() || ((colorStateList = this.f6857q.f53626zy) != null && colorStateList.isStateful())));
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC1259y, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f6894k;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f6859y && super.mutate() == this) {
            this.f6857q = new y(this.f6857q);
            this.f6859y = true;
        }
        return this;
    }

    PorterDuffColorFilter n7h(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC1259y, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f6894k;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f6894k;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z2 = false;
        y yVar = this.f6857q;
        ColorStateList colorStateList = yVar.f53626zy;
        if (colorStateList != null && (mode = yVar.f6884q) != null) {
            this.f6855n = n7h(this.f6855n, colorStateList, mode);
            invalidateSelf();
            z2 = true;
        }
        if (!yVar.f7l8() || !yVar.m5483y(iArr)) {
            return z2;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j2) {
        Drawable drawable = this.f6894k;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j2);
        } else {
            super.scheduleSelf(runnable, j2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        Drawable drawable = this.f6894k;
        if (drawable != null) {
            drawable.setAlpha(i2);
        } else if (this.f6857q.f53624toq.getRootAlpha() != i2) {
            this.f6857q.f53624toq.setRootAlpha(i2);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z2) {
        Drawable drawable = this.f6894k;
        if (drawable != null) {
            androidx.core.graphics.drawable.zy.m2445p(drawable, z2);
        } else {
            this.f6857q.f6882n = z2;
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC1259y, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i2) {
        super.setChangingConfigurations(i2);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC1259y, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i2, PorterDuff.Mode mode) {
        super.setColorFilter(i2, mode);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC1259y, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z2) {
        super.setFilterBitmap(z2);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC1259y, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f2, float f3) {
        super.setHotspot(f2, f3);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC1259y, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i2, int i3, int i4, int i5) {
        super.setHotspotBounds(i2, i3, i4, i5);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC1259y, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.n7h
    public void setTint(int i2) {
        Drawable drawable = this.f6894k;
        if (drawable != null) {
            androidx.core.graphics.drawable.zy.n7h(drawable, i2);
        } else {
            setTintList(ColorStateList.valueOf(i2));
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.n7h
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f6894k;
        if (drawable != null) {
            androidx.core.graphics.drawable.zy.kja0(drawable, colorStateList);
            return;
        }
        y yVar = this.f6857q;
        if (yVar.f53626zy != colorStateList) {
            yVar.f53626zy = colorStateList;
            this.f6855n = n7h(this.f6855n, colorStateList, yVar.f6884q);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.n7h
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f6894k;
        if (drawable != null) {
            androidx.core.graphics.drawable.zy.m2442h(drawable, mode);
            return;
        }
        y yVar = this.f6857q;
        if (yVar.f6884q != mode) {
            yVar.f6884q = mode;
            this.f6855n = n7h(this.f6855n, yVar.f53626zy, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z2, boolean z3) {
        Drawable drawable = this.f6894k;
        return drawable != null ? drawable.setVisible(z2, z3) : super.setVisible(z2, z3);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f6894k;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    void x2(boolean z2) {
        this.f6858s = z2;
    }

    /* JADX INFO: renamed from: androidx.vectordrawable.graphics.drawable.s$s */
    /* JADX INFO: compiled from: VectorDrawableCompat.java */
    @hyr(24)
    private static class s extends Drawable.ConstantState {

        /* JADX INFO: renamed from: k */
        private final Drawable.ConstantState f6879k;

        public s(Drawable.ConstantState constantState) {
            this.f6879k = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f6879k.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f6879k.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            C1257s c1257s = new C1257s();
            c1257s.f6894k = (VectorDrawable) this.f6879k.newDrawable();
            return c1257s;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            C1257s c1257s = new C1257s();
            c1257s.f6894k = (VectorDrawable) this.f6879k.newDrawable(resources);
            return c1257s;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C1257s c1257s = new C1257s();
            c1257s.f6894k = (VectorDrawable) this.f6879k.newDrawable(resources, theme);
            return c1257s;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f6894k;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f6852g = colorFilter;
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: androidx.vectordrawable.graphics.drawable.s$g */
    /* JADX INFO: compiled from: VectorDrawableCompat.java */
    private static abstract class g extends n {

        /* JADX INFO: renamed from: n */
        protected static final int f6869n = 0;

        /* JADX INFO: renamed from: k */
        protected cdj.toq[] f6870k;

        /* JADX INFO: renamed from: q */
        int f6871q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        String f53613toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        int f53614zy;

        public g() {
            super();
            this.f6870k = null;
            this.f53614zy = 0;
        }

        public void f7l8(int i2) {
            String str = "";
            for (int i3 = 0; i3 < i2; i3++) {
                str = str + "    ";
            }
            Log.v(C1257s.f6849t, str + "current path is :" + this.f53613toq + " pathData is " + m5468g(this.f6870k));
        }

        /* JADX INFO: renamed from: g */
        public String m5468g(cdj.toq[] toqVarArr) {
            String str = " ";
            for (int i2 = 0; i2 < toqVarArr.length; i2++) {
                str = str + toqVarArr[i2].f3527k + ":";
                for (float f2 : toqVarArr[i2].f50425toq) {
                    str = str + f2 + ",";
                }
            }
            return str;
        }

        public cdj.toq[] getPathData() {
            return this.f6870k;
        }

        public String getPathName() {
            return this.f53613toq;
        }

        /* JADX INFO: renamed from: n */
        public boolean mo5469n() {
            return false;
        }

        /* JADX INFO: renamed from: q */
        public boolean mo5470q() {
            return false;
        }

        public void setPathData(cdj.toq[] toqVarArr) {
            if (cdj.toq(this.f6870k, toqVarArr)) {
                cdj.ld6(this.f6870k, toqVarArr);
            } else {
                this.f6870k = cdj.m2387g(toqVarArr);
            }
        }

        /* JADX INFO: renamed from: y */
        public void m5471y(Path path) {
            path.reset();
            cdj.toq[] toqVarArr = this.f6870k;
            if (toqVarArr != null) {
                cdj.toq.m2395n(toqVarArr, path);
            }
        }

        public void zy(Resources.Theme theme) {
        }

        public g(g gVar) {
            super();
            this.f6870k = null;
            this.f53614zy = 0;
            this.f53613toq = gVar.f53613toq;
            this.f6871q = gVar.f6871q;
            this.f6870k = cdj.m2387g(gVar.f6870k);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f6894k;
        if (drawable != null) {
            androidx.core.graphics.drawable.zy.f7l8(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        y yVar = this.f6857q;
        yVar.f53624toq = new f7l8();
        TypedArray typedArrayT8r = kja0.t8r(resources, theme, attributeSet, C1254k.f6818k);
        qrj(typedArrayT8r, xmlPullParser, theme);
        typedArrayT8r.recycle();
        yVar.f6881k = getChangingConfigurations();
        yVar.f53625x2 = true;
        m5462y(resources, xmlPullParser, attributeSet, theme);
        this.f6855n = n7h(this.f6855n, yVar.f53626zy, yVar.f6884q);
    }

    C1257s(@lvui y yVar) {
        this.f6858s = true;
        this.f6853h = new float[9];
        this.f6854i = new Matrix();
        this.f6860z = new Rect();
        this.f6857q = yVar;
        this.f6855n = n7h(this.f6855n, yVar.f53626zy, yVar.f6884q);
    }

    /* JADX INFO: renamed from: androidx.vectordrawable.graphics.drawable.s$zy */
    /* JADX INFO: compiled from: VectorDrawableCompat.java */
    private static class zy extends g {

        /* JADX INFO: renamed from: cdj, reason: collision with root package name */
        float f53627cdj;

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        C0505q f53628f7l8;

        /* JADX INFO: renamed from: g */
        private int[] f6887g;

        /* JADX INFO: renamed from: h */
        Paint.Join f6888h;

        /* JADX INFO: renamed from: kja0, reason: collision with root package name */
        Paint.Cap f53629kja0;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        float f53630ld6;

        /* JADX INFO: renamed from: n7h, reason: collision with root package name */
        float f53631n7h;

        /* JADX INFO: renamed from: p */
        float f6889p;

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        float f53632qrj;

        /* JADX INFO: renamed from: s */
        C0505q f6890s;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        float f53633x2;

        /* JADX INFO: renamed from: y */
        float f6891y;

        zy() {
            this.f6891y = 0.0f;
            this.f6889p = 1.0f;
            this.f53630ld6 = 1.0f;
            this.f53633x2 = 0.0f;
            this.f53632qrj = 1.0f;
            this.f53631n7h = 0.0f;
            this.f53629kja0 = Paint.Cap.BUTT;
            this.f6888h = Paint.Join.MITER;
            this.f53627cdj = 4.0f;
        }

        /* JADX INFO: renamed from: p */
        private Paint.Join m5484p(int i2, Paint.Join join) {
            return i2 != 0 ? i2 != 1 ? i2 != 2 ? join : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER;
        }

        /* JADX INFO: renamed from: s */
        private Paint.Cap m5485s(int i2, Paint.Cap cap) {
            return i2 != 0 ? i2 != 1 ? i2 != 2 ? cap : Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }

        private void x2(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f6887g = null;
            if (kja0.ki(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f53613toq = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f6870k = cdj.m2391q(string2);
                }
                this.f6890s = kja0.m2307s(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
                this.f53630ld6 = kja0.m2305p(typedArray, xmlPullParser, "fillAlpha", 12, this.f53630ld6);
                this.f53629kja0 = m5485s(kja0.ld6(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f53629kja0);
                this.f6888h = m5484p(kja0.ld6(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f6888h);
                this.f53627cdj = kja0.m2305p(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f53627cdj);
                this.f53628f7l8 = kja0.m2307s(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                this.f6889p = kja0.m2305p(typedArray, xmlPullParser, "strokeAlpha", 11, this.f6889p);
                this.f6891y = kja0.m2305p(typedArray, xmlPullParser, "strokeWidth", 4, this.f6891y);
                this.f53632qrj = kja0.m2305p(typedArray, xmlPullParser, "trimPathEnd", 6, this.f53632qrj);
                this.f53631n7h = kja0.m2305p(typedArray, xmlPullParser, "trimPathOffset", 7, this.f53631n7h);
                this.f53633x2 = kja0.m2305p(typedArray, xmlPullParser, "trimPathStart", 5, this.f53633x2);
                this.f53614zy = kja0.ld6(typedArray, xmlPullParser, "fillType", 13, this.f53614zy);
            }
        }

        float getFillAlpha() {
            return this.f53630ld6;
        }

        @x2
        int getFillColor() {
            return this.f6890s.m2322n();
        }

        float getStrokeAlpha() {
            return this.f6889p;
        }

        @x2
        int getStrokeColor() {
            return this.f53628f7l8.m2322n();
        }

        float getStrokeWidth() {
            return this.f6891y;
        }

        float getTrimPathEnd() {
            return this.f53632qrj;
        }

        float getTrimPathOffset() {
            return this.f53631n7h;
        }

        float getTrimPathStart() {
            return this.f53633x2;
        }

        @Override // androidx.vectordrawable.graphics.drawable.C1257s.n
        /* JADX INFO: renamed from: k */
        public boolean mo5472k() {
            return this.f6890s.m2324s() || this.f53628f7l8.m2324s();
        }

        public void ld6(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayT8r = kja0.t8r(resources, theme, attributeSet, C1254k.f6816i);
            x2(typedArrayT8r, xmlPullParser, theme);
            typedArrayT8r.recycle();
        }

        @Override // androidx.vectordrawable.graphics.drawable.C1257s.g
        /* JADX INFO: renamed from: q */
        public boolean mo5470q() {
            return this.f6887g != null;
        }

        void setFillAlpha(float f2) {
            this.f53630ld6 = f2;
        }

        void setFillColor(int i2) {
            this.f6890s.ld6(i2);
        }

        void setStrokeAlpha(float f2) {
            this.f6889p = f2;
        }

        void setStrokeColor(int i2) {
            this.f53628f7l8.ld6(i2);
        }

        void setStrokeWidth(float f2) {
            this.f6891y = f2;
        }

        void setTrimPathEnd(float f2) {
            this.f53632qrj = f2;
        }

        void setTrimPathOffset(float f2) {
            this.f53631n7h = f2;
        }

        void setTrimPathStart(float f2) {
            this.f53633x2 = f2;
        }

        @Override // androidx.vectordrawable.graphics.drawable.C1257s.n
        public boolean toq(int[] iArr) {
            return this.f53628f7l8.m2323p(iArr) | this.f6890s.m2323p(iArr);
        }

        @Override // androidx.vectordrawable.graphics.drawable.C1257s.g
        public void zy(Resources.Theme theme) {
        }

        zy(zy zyVar) {
            super(zyVar);
            this.f6891y = 0.0f;
            this.f6889p = 1.0f;
            this.f53630ld6 = 1.0f;
            this.f53633x2 = 0.0f;
            this.f53632qrj = 1.0f;
            this.f53631n7h = 0.0f;
            this.f53629kja0 = Paint.Cap.BUTT;
            this.f6888h = Paint.Join.MITER;
            this.f53627cdj = 4.0f;
            this.f6887g = zyVar.f6887g;
            this.f53628f7l8 = zyVar.f53628f7l8;
            this.f6891y = zyVar.f6891y;
            this.f6889p = zyVar.f6889p;
            this.f6890s = zyVar.f6890s;
            this.f53614zy = zyVar.f53614zy;
            this.f53630ld6 = zyVar.f53630ld6;
            this.f53633x2 = zyVar.f53633x2;
            this.f53632qrj = zyVar.f53632qrj;
            this.f53631n7h = zyVar.f53631n7h;
            this.f53629kja0 = zyVar.f53629kja0;
            this.f6888h = zyVar.f6888h;
            this.f53627cdj = zyVar.f53627cdj;
        }
    }

    /* JADX INFO: renamed from: androidx.vectordrawable.graphics.drawable.s$f7l8 */
    /* JADX INFO: compiled from: VectorDrawableCompat.java */
    private static class f7l8 {

        /* JADX INFO: renamed from: cdj, reason: collision with root package name */
        private static final Matrix f53604cdj = new Matrix();

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private int f53605f7l8;

        /* JADX INFO: renamed from: g */
        private PathMeasure f6861g;

        /* JADX INFO: renamed from: h */
        final C0247k<String, Object> f6862h;

        /* JADX INFO: renamed from: k */
        private final Path f6863k;

        /* JADX INFO: renamed from: kja0, reason: collision with root package name */
        Boolean f53606kja0;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        float f53607ld6;

        /* JADX INFO: renamed from: n */
        Paint f6864n;

        /* JADX INFO: renamed from: n7h, reason: collision with root package name */
        String f53608n7h;

        /* JADX INFO: renamed from: p */
        float f6865p;

        /* JADX INFO: renamed from: q */
        Paint f6866q;

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        int f53609qrj;

        /* JADX INFO: renamed from: s */
        float f6867s;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final Path f53610toq;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        float f53611x2;

        /* JADX INFO: renamed from: y */
        final q f6868y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final Matrix f53612zy;

        public f7l8() {
            this.f53612zy = new Matrix();
            this.f6867s = 0.0f;
            this.f6865p = 0.0f;
            this.f53607ld6 = 0.0f;
            this.f53611x2 = 0.0f;
            this.f53609qrj = 255;
            this.f53608n7h = null;
            this.f53606kja0 = null;
            this.f6862h = new C0247k<>();
            this.f6868y = new q();
            this.f6863k = new Path();
            this.f53610toq = new Path();
        }

        /* JADX INFO: renamed from: k */
        private static float m5464k(float f2, float f3, float f4, float f5) {
            return (f2 * f5) - (f3 * f4);
        }

        /* JADX INFO: renamed from: n */
        private float m5465n(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float fHypot = (float) Math.hypot(fArr[0], fArr[1]);
            float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
            float fM5464k = m5464k(fArr[0], fArr[1], fArr[2], fArr[3]);
            float fMax = Math.max(fHypot, fHypot2);
            if (fMax > 0.0f) {
                return Math.abs(fM5464k) / fMax;
            }
            return 0.0f;
        }

        /* JADX INFO: renamed from: q */
        private void m5466q(q qVar, g gVar, Canvas canvas, int i2, int i3, ColorFilter colorFilter) {
            float f2 = i2 / this.f53607ld6;
            float f3 = i3 / this.f53611x2;
            float fMin = Math.min(f2, f3);
            Matrix matrix = qVar.f6873k;
            this.f53612zy.set(matrix);
            this.f53612zy.postScale(f2, f3);
            float fM5465n = m5465n(matrix);
            if (fM5465n == 0.0f) {
                return;
            }
            gVar.m5471y(this.f6863k);
            Path path = this.f6863k;
            this.f53610toq.reset();
            if (gVar.mo5469n()) {
                this.f53610toq.setFillType(gVar.f53614zy == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                this.f53610toq.addPath(path, this.f53612zy);
                canvas.clipPath(this.f53610toq);
                return;
            }
            zy zyVar = (zy) gVar;
            float f4 = zyVar.f53633x2;
            if (f4 != 0.0f || zyVar.f53632qrj != 1.0f) {
                float f5 = zyVar.f53631n7h;
                float f6 = (f4 + f5) % 1.0f;
                float f7 = (zyVar.f53632qrj + f5) % 1.0f;
                if (this.f6861g == null) {
                    this.f6861g = new PathMeasure();
                }
                this.f6861g.setPath(this.f6863k, false);
                float length = this.f6861g.getLength();
                float f8 = f6 * length;
                float f9 = f7 * length;
                path.reset();
                if (f8 > f9) {
                    this.f6861g.getSegment(f8, length, path, true);
                    this.f6861g.getSegment(0.0f, f9, path, true);
                } else {
                    this.f6861g.getSegment(f8, f9, path, true);
                }
                path.rLineTo(0.0f, 0.0f);
            }
            this.f53610toq.addPath(path, this.f53612zy);
            if (zyVar.f6890s.x2()) {
                C0505q c0505q = zyVar.f6890s;
                if (this.f6864n == null) {
                    Paint paint = new Paint(1);
                    this.f6864n = paint;
                    paint.setStyle(Paint.Style.FILL);
                }
                Paint paint2 = this.f6864n;
                if (c0505q.m2325y()) {
                    Shader shaderM2321g = c0505q.m2321g();
                    shaderM2321g.setLocalMatrix(this.f53612zy);
                    paint2.setShader(shaderM2321g);
                    paint2.setAlpha(Math.round(zyVar.f53630ld6 * 255.0f));
                } else {
                    paint2.setShader(null);
                    paint2.setAlpha(255);
                    paint2.setColor(C1257s.m5457k(c0505q.m2322n(), zyVar.f53630ld6));
                }
                paint2.setColorFilter(colorFilter);
                this.f53610toq.setFillType(zyVar.f53614zy == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                canvas.drawPath(this.f53610toq, paint2);
            }
            if (zyVar.f53628f7l8.x2()) {
                C0505q c0505q2 = zyVar.f53628f7l8;
                if (this.f6866q == null) {
                    Paint paint3 = new Paint(1);
                    this.f6866q = paint3;
                    paint3.setStyle(Paint.Style.STROKE);
                }
                Paint paint4 = this.f6866q;
                Paint.Join join = zyVar.f6888h;
                if (join != null) {
                    paint4.setStrokeJoin(join);
                }
                Paint.Cap cap = zyVar.f53629kja0;
                if (cap != null) {
                    paint4.setStrokeCap(cap);
                }
                paint4.setStrokeMiter(zyVar.f53627cdj);
                if (c0505q2.m2325y()) {
                    Shader shaderM2321g2 = c0505q2.m2321g();
                    shaderM2321g2.setLocalMatrix(this.f53612zy);
                    paint4.setShader(shaderM2321g2);
                    paint4.setAlpha(Math.round(zyVar.f6889p * 255.0f));
                } else {
                    paint4.setShader(null);
                    paint4.setAlpha(255);
                    paint4.setColor(C1257s.m5457k(c0505q2.m2322n(), zyVar.f6889p));
                }
                paint4.setColorFilter(colorFilter);
                paint4.setStrokeWidth(zyVar.f6891y * fMin * fM5465n);
                canvas.drawPath(this.f53610toq, paint4);
            }
        }

        private void zy(q qVar, Matrix matrix, Canvas canvas, int i2, int i3, ColorFilter colorFilter) {
            qVar.f6873k.set(matrix);
            qVar.f6873k.preConcat(qVar.f6875p);
            canvas.save();
            for (int i4 = 0; i4 < qVar.f53618toq.size(); i4++) {
                n nVar = qVar.f53618toq.get(i4);
                if (nVar instanceof q) {
                    zy((q) nVar, qVar.f6873k, canvas, i2, i3, colorFilter);
                } else if (nVar instanceof g) {
                    m5466q(qVar, (g) nVar, canvas, i2, i3, colorFilter);
                }
            }
            canvas.restore();
        }

        public boolean f7l8(int[] iArr) {
            return this.f6868y.toq(iArr);
        }

        /* JADX INFO: renamed from: g */
        public boolean m5467g() {
            if (this.f53606kja0 == null) {
                this.f53606kja0 = Boolean.valueOf(this.f6868y.mo5472k());
            }
            return this.f53606kja0.booleanValue();
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f53609qrj;
        }

        public void setAlpha(float f2) {
            setRootAlpha((int) (f2 * 255.0f));
        }

        public void setRootAlpha(int i2) {
            this.f53609qrj = i2;
        }

        public void toq(Canvas canvas, int i2, int i3, ColorFilter colorFilter) {
            zy(this.f6868y, f53604cdj, canvas, i2, i3, colorFilter);
        }

        public f7l8(f7l8 f7l8Var) {
            this.f53612zy = new Matrix();
            this.f6867s = 0.0f;
            this.f6865p = 0.0f;
            this.f53607ld6 = 0.0f;
            this.f53611x2 = 0.0f;
            this.f53609qrj = 255;
            this.f53608n7h = null;
            this.f53606kja0 = null;
            C0247k<String, Object> c0247k = new C0247k<>();
            this.f6862h = c0247k;
            this.f6868y = new q(f7l8Var.f6868y, c0247k);
            this.f6863k = new Path(f7l8Var.f6863k);
            this.f53610toq = new Path(f7l8Var.f53610toq);
            this.f6867s = f7l8Var.f6867s;
            this.f6865p = f7l8Var.f6865p;
            this.f53607ld6 = f7l8Var.f53607ld6;
            this.f53611x2 = f7l8Var.f53611x2;
            this.f53605f7l8 = f7l8Var.f53605f7l8;
            this.f53609qrj = f7l8Var.f53609qrj;
            this.f53608n7h = f7l8Var.f53608n7h;
            String str = f7l8Var.f53608n7h;
            if (str != null) {
                c0247k.put(str, this);
            }
            this.f53606kja0 = f7l8Var.f53606kja0;
        }
    }

    /* JADX INFO: renamed from: androidx.vectordrawable.graphics.drawable.s$q */
    /* JADX INFO: compiled from: VectorDrawableCompat.java */
    private static class q extends n {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private float f53615f7l8;

        /* JADX INFO: renamed from: g */
        private float f6872g;

        /* JADX INFO: renamed from: k */
        final Matrix f6873k;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        int f53616ld6;

        /* JADX INFO: renamed from: n */
        private float f6874n;

        /* JADX INFO: renamed from: p */
        final Matrix f6875p;

        /* JADX INFO: renamed from: q */
        private float f6876q;

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        private String f53617qrj;

        /* JADX INFO: renamed from: s */
        private float f6877s;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final ArrayList<n> f53618toq;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        private int[] f53619x2;

        /* JADX INFO: renamed from: y */
        private float f6878y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        float f53620zy;

        public q(q qVar, C0247k<String, Object> c0247k) {
            g toqVar;
            super();
            this.f6873k = new Matrix();
            this.f53618toq = new ArrayList<>();
            this.f53620zy = 0.0f;
            this.f6876q = 0.0f;
            this.f6874n = 0.0f;
            this.f6872g = 1.0f;
            this.f53615f7l8 = 1.0f;
            this.f6878y = 0.0f;
            this.f6877s = 0.0f;
            Matrix matrix = new Matrix();
            this.f6875p = matrix;
            this.f53617qrj = null;
            this.f53620zy = qVar.f53620zy;
            this.f6876q = qVar.f6876q;
            this.f6874n = qVar.f6874n;
            this.f6872g = qVar.f6872g;
            this.f53615f7l8 = qVar.f53615f7l8;
            this.f6878y = qVar.f6878y;
            this.f6877s = qVar.f6877s;
            this.f53619x2 = qVar.f53619x2;
            String str = qVar.f53617qrj;
            this.f53617qrj = str;
            this.f53616ld6 = qVar.f53616ld6;
            if (str != null) {
                c0247k.put(str, this);
            }
            matrix.set(qVar.f6875p);
            ArrayList<n> arrayList = qVar.f53618toq;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                n nVar = arrayList.get(i2);
                if (nVar instanceof q) {
                    this.f53618toq.add(new q((q) nVar, c0247k));
                } else {
                    if (nVar instanceof zy) {
                        toqVar = new zy((zy) nVar);
                    } else {
                        if (!(nVar instanceof toq)) {
                            throw new IllegalStateException("Unknown object in the tree!");
                        }
                        toqVar = new toq((toq) nVar);
                    }
                    this.f53618toq.add(toqVar);
                    String str2 = toqVar.f53613toq;
                    if (str2 != null) {
                        c0247k.put(str2, toqVar);
                    }
                }
            }
        }

        /* JADX INFO: renamed from: n */
        private void m5473n(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f53619x2 = null;
            this.f53620zy = kja0.m2305p(typedArray, xmlPullParser, "rotation", 5, this.f53620zy);
            this.f6876q = typedArray.getFloat(1, this.f6876q);
            this.f6874n = typedArray.getFloat(2, this.f6874n);
            this.f6872g = kja0.m2305p(typedArray, xmlPullParser, "scaleX", 3, this.f6872g);
            this.f53615f7l8 = kja0.m2305p(typedArray, xmlPullParser, "scaleY", 4, this.f53615f7l8);
            this.f6878y = kja0.m2305p(typedArray, xmlPullParser, "translateX", 6, this.f6878y);
            this.f6877s = kja0.m2305p(typedArray, xmlPullParser, "translateY", 7, this.f6877s);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f53617qrj = string;
            }
            m5474q();
        }

        /* JADX INFO: renamed from: q */
        private void m5474q() {
            this.f6875p.reset();
            this.f6875p.postTranslate(-this.f6876q, -this.f6874n);
            this.f6875p.postScale(this.f6872g, this.f53615f7l8);
            this.f6875p.postRotate(this.f53620zy, 0.0f, 0.0f);
            this.f6875p.postTranslate(this.f6878y + this.f6876q, this.f6877s + this.f6874n);
        }

        public String getGroupName() {
            return this.f53617qrj;
        }

        public Matrix getLocalMatrix() {
            return this.f6875p;
        }

        public float getPivotX() {
            return this.f6876q;
        }

        public float getPivotY() {
            return this.f6874n;
        }

        public float getRotation() {
            return this.f53620zy;
        }

        public float getScaleX() {
            return this.f6872g;
        }

        public float getScaleY() {
            return this.f53615f7l8;
        }

        public float getTranslateX() {
            return this.f6878y;
        }

        public float getTranslateY() {
            return this.f6877s;
        }

        @Override // androidx.vectordrawable.graphics.drawable.C1257s.n
        /* JADX INFO: renamed from: k */
        public boolean mo5472k() {
            for (int i2 = 0; i2 < this.f53618toq.size(); i2++) {
                if (this.f53618toq.get(i2).mo5472k()) {
                    return true;
                }
            }
            return false;
        }

        public void setPivotX(float f2) {
            if (f2 != this.f6876q) {
                this.f6876q = f2;
                m5474q();
            }
        }

        public void setPivotY(float f2) {
            if (f2 != this.f6874n) {
                this.f6874n = f2;
                m5474q();
            }
        }

        public void setRotation(float f2) {
            if (f2 != this.f53620zy) {
                this.f53620zy = f2;
                m5474q();
            }
        }

        public void setScaleX(float f2) {
            if (f2 != this.f6872g) {
                this.f6872g = f2;
                m5474q();
            }
        }

        public void setScaleY(float f2) {
            if (f2 != this.f53615f7l8) {
                this.f53615f7l8 = f2;
                m5474q();
            }
        }

        public void setTranslateX(float f2) {
            if (f2 != this.f6878y) {
                this.f6878y = f2;
                m5474q();
            }
        }

        public void setTranslateY(float f2) {
            if (f2 != this.f6877s) {
                this.f6877s = f2;
                m5474q();
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.C1257s.n
        public boolean toq(int[] iArr) {
            boolean qVar = false;
            for (int i2 = 0; i2 < this.f53618toq.size(); i2++) {
                qVar |= this.f53618toq.get(i2).toq(iArr);
            }
            return qVar;
        }

        public void zy(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayT8r = kja0.t8r(resources, theme, attributeSet, C1254k.f53571ld6);
            m5473n(typedArrayT8r, xmlPullParser);
            typedArrayT8r.recycle();
        }

        public q() {
            super();
            this.f6873k = new Matrix();
            this.f53618toq = new ArrayList<>();
            this.f53620zy = 0.0f;
            this.f6876q = 0.0f;
            this.f6874n = 0.0f;
            this.f6872g = 1.0f;
            this.f53615f7l8 = 1.0f;
            this.f6878y = 0.0f;
            this.f6877s = 0.0f;
            this.f6875p = new Matrix();
            this.f53617qrj = null;
        }
    }
}
