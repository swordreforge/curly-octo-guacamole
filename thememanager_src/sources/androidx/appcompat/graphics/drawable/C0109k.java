package androidx.appcompat.graphics.drawable;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import android.util.Xml;
import androidx.appcompat.graphics.drawable.C0110n;
import androidx.appcompat.graphics.drawable.toq;
import androidx.appcompat.widget.lrht;
import androidx.collection.C0252s;
import androidx.core.content.res.kja0;
import androidx.core.graphics.drawable.n7h;
import androidx.vectordrawable.graphics.drawable.C1257s;
import f7l8.C6028k;
import f7l8.toq;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import zy.dd;
import zy.fn3e;
import zy.hyr;
import zy.lvui;

/* JADX INFO: renamed from: androidx.appcompat.graphics.drawable.k */
/* JADX INFO: compiled from: AnimatedStateListDrawableCompat.java */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"RestrictedAPI"})
public class C0109k extends C0110n implements n7h {

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private static final String f46629ab = ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable";
    private static final String bb = ": <transition> tag requires 'fromId' & 'toId' attributes";
    private static final String bp = ": <item> tag requires a 'drawable' attribute or child tag defining a drawable";

    /* JADX INFO: renamed from: d */
    private static final String f340d = "transition";

    /* JADX INFO: renamed from: v */
    private static final String f341v = C0109k.class.getSimpleName();

    /* JADX INFO: renamed from: w */
    private static final String f342w = "item";

    /* JADX INFO: renamed from: a */
    private f7l8 f343a;

    /* JADX INFO: renamed from: b */
    private zy f344b;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private boolean f46630bo;

    /* JADX INFO: renamed from: u */
    private int f345u;

    /* JADX INFO: renamed from: x */
    private int f346x;

    /* JADX INFO: renamed from: androidx.appcompat.graphics.drawable.k$f7l8 */
    /* JADX INFO: compiled from: AnimatedStateListDrawableCompat.java */
    private static abstract class f7l8 {
        private f7l8() {
        }

        /* JADX INFO: renamed from: k */
        public boolean mo259k() {
            return false;
        }

        /* JADX INFO: renamed from: q */
        public abstract void mo260q();

        public void toq() {
        }

        public abstract void zy();
    }

    /* JADX INFO: renamed from: androidx.appcompat.graphics.drawable.k$g */
    /* JADX INFO: compiled from: AnimatedStateListDrawableCompat.java */
    private static class g implements TimeInterpolator {

        /* JADX INFO: renamed from: k */
        private int[] f347k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private int f46631toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private int f46632zy;

        g(AnimationDrawable animationDrawable, boolean z2) {
            toq(animationDrawable, z2);
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f2) {
            int i2 = (int) ((f2 * this.f46632zy) + 0.5f);
            int i3 = this.f46631toq;
            int[] iArr = this.f347k;
            int i4 = 0;
            while (i4 < i3) {
                int i5 = iArr[i4];
                if (i2 < i5) {
                    break;
                }
                i2 -= i5;
                i4++;
            }
            return (i4 / i3) + (i4 < i3 ? i2 / this.f46632zy : 0.0f);
        }

        /* JADX INFO: renamed from: k */
        int m261k() {
            return this.f46632zy;
        }

        int toq(AnimationDrawable animationDrawable, boolean z2) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f46631toq = numberOfFrames;
            int[] iArr = this.f347k;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f347k = new int[numberOfFrames];
            }
            int[] iArr2 = this.f347k;
            int i2 = 0;
            for (int i3 = 0; i3 < numberOfFrames; i3++) {
                int duration = animationDrawable.getDuration(z2 ? (numberOfFrames - i3) - 1 : i3);
                iArr2[i3] = duration;
                i2 += duration;
            }
            this.f46632zy = i2;
            return i2;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.graphics.drawable.k$n */
    /* JADX INFO: compiled from: AnimatedStateListDrawableCompat.java */
    private static class n extends f7l8 {

        /* JADX INFO: renamed from: k */
        private final ObjectAnimator f348k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final boolean f46633toq;

        n(AnimationDrawable animationDrawable, boolean z2, boolean z3) {
            super();
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i2 = z2 ? numberOfFrames - 1 : 0;
            int i3 = z2 ? 0 : numberOfFrames - 1;
            g gVar = new g(animationDrawable, z2);
            ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i2, i3);
            C6028k.toq.m22265k(objectAnimatorOfInt, true);
            objectAnimatorOfInt.setDuration(gVar.m261k());
            objectAnimatorOfInt.setInterpolator(gVar);
            this.f46633toq = z3;
            this.f348k = objectAnimatorOfInt;
        }

        @Override // androidx.appcompat.graphics.drawable.C0109k.f7l8
        /* JADX INFO: renamed from: k */
        public boolean mo259k() {
            return this.f46633toq;
        }

        @Override // androidx.appcompat.graphics.drawable.C0109k.f7l8
        /* JADX INFO: renamed from: q */
        public void mo260q() {
            this.f348k.cancel();
        }

        @Override // androidx.appcompat.graphics.drawable.C0109k.f7l8
        public void toq() {
            this.f348k.reverse();
        }

        @Override // androidx.appcompat.graphics.drawable.C0109k.f7l8
        public void zy() {
            this.f348k.start();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.graphics.drawable.k$q */
    /* JADX INFO: compiled from: AnimatedStateListDrawableCompat.java */
    private static class q extends f7l8 {

        /* JADX INFO: renamed from: k */
        private final androidx.vectordrawable.graphics.drawable.zy f349k;

        q(androidx.vectordrawable.graphics.drawable.zy zyVar) {
            super();
            this.f349k = zyVar;
        }

        @Override // androidx.appcompat.graphics.drawable.C0109k.f7l8
        /* JADX INFO: renamed from: q */
        public void mo260q() {
            this.f349k.stop();
        }

        @Override // androidx.appcompat.graphics.drawable.C0109k.f7l8
        public void zy() {
            this.f349k.start();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.graphics.drawable.k$toq */
    /* JADX INFO: compiled from: AnimatedStateListDrawableCompat.java */
    private static class toq extends f7l8 {

        /* JADX INFO: renamed from: k */
        private final Animatable f350k;

        toq(Animatable animatable) {
            super();
            this.f350k = animatable;
        }

        @Override // androidx.appcompat.graphics.drawable.C0109k.f7l8
        /* JADX INFO: renamed from: q */
        public void mo260q() {
            this.f350k.stop();
        }

        @Override // androidx.appcompat.graphics.drawable.C0109k.f7l8
        public void zy() {
            this.f350k.start();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.graphics.drawable.k$zy */
    /* JADX INFO: compiled from: AnimatedStateListDrawableCompat.java */
    static class zy extends C0110n.k {

        /* JADX INFO: renamed from: lvui, reason: collision with root package name */
        private static final long f46634lvui = 4294967296L;

        /* JADX INFO: renamed from: r */
        private static final long f351r = 8589934592L;

        /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
        androidx.collection.n7h<Integer> f46635d2ok;

        /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
        C0252s<Long> f46636eqxt;

        zy(@dd zy zyVar, @lvui C0109k c0109k, @dd Resources resources) {
            super(zyVar, c0109k, resources);
            if (zyVar != null) {
                this.f46636eqxt = zyVar.f46636eqxt;
                this.f46635d2ok = zyVar.f46635d2ok;
            } else {
                this.f46636eqxt = new C0252s<>();
                this.f46635d2ok = new androidx.collection.n7h<>();
            }
        }

        private static long gvn7(int i2, int i3) {
            return ((long) i3) | (((long) i2) << 32);
        }

        boolean d2ok(int i2, int i3) {
            return (this.f46636eqxt.kja0(gvn7(i2, i3), -1L).longValue() & f46634lvui) != 0;
        }

        int d3(int i2) {
            if (i2 < 0) {
                return 0;
            }
            return this.f46635d2ok.kja0(i2, 0).intValue();
        }

        int eqxt(int i2, int i3) {
            return (int) this.f46636eqxt.kja0(gvn7(i2, i3), -1L).longValue();
        }

        int fti(@lvui int[] iArr, @lvui Drawable drawable, int i2) {
            int iJk = super.jk(iArr, drawable);
            this.f46635d2ok.fn3e(iJk, Integer.valueOf(i2));
            return iJk;
        }

        int jp0y(int i2, int i3, @lvui Drawable drawable, boolean z2) {
            int iM282k = super.m282k(drawable);
            long jGvn7 = gvn7(i2, i3);
            long j2 = z2 ? f351r : 0L;
            long j3 = iM282k;
            this.f46636eqxt.m878k(jGvn7, Long.valueOf(j3 | j2));
            if (z2) {
                this.f46636eqxt.m878k(gvn7(i3, i2), Long.valueOf(f46634lvui | j3 | j2));
            }
            return iM282k;
        }

        boolean lvui(int i2, int i3) {
            return (this.f46636eqxt.kja0(gvn7(i2, i3), -1L).longValue() & f351r) != 0;
        }

        @Override // androidx.appcompat.graphics.drawable.C0110n.k, android.graphics.drawable.Drawable.ConstantState
        @lvui
        public Drawable newDrawable() {
            return new C0109k(this, null);
        }

        int oc(@lvui int[] iArr) {
            int iA9 = super.a9(iArr);
            return iA9 >= 0 ? iA9 : super.a9(StateSet.WILD_CARD);
        }

        @Override // androidx.appcompat.graphics.drawable.C0110n.k, androidx.appcompat.graphics.drawable.toq.AbstractC0113q
        void zurt() {
            this.f46636eqxt = this.f46636eqxt.clone();
            this.f46635d2ok = this.f46635d2ok.clone();
        }

        @Override // androidx.appcompat.graphics.drawable.C0110n.k, android.graphics.drawable.Drawable.ConstantState
        @lvui
        public Drawable newDrawable(Resources resources) {
            return new C0109k(this, resources);
        }
    }

    public C0109k() {
        this(null, null);
    }

    private int a9(@lvui Context context, @lvui Resources resources, @lvui XmlPullParser xmlPullParser, @lvui AttributeSet attributeSet, @dd Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray typedArrayT8r = kja0.t8r(resources, theme, attributeSet, toq.C8045toq.f34694y);
        int resourceId = typedArrayT8r.getResourceId(toq.C8045toq.f34693s, 0);
        int resourceId2 = typedArrayT8r.getResourceId(toq.C8045toq.f34691p, -1);
        Drawable drawableM650p = resourceId2 > 0 ? lrht.m648y().m650p(context, resourceId2) : null;
        typedArrayT8r.recycle();
        int[] iArrM262h = m262h(attributeSet);
        if (drawableM650p == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + bp);
            }
            drawableM650p = xmlPullParser.getName().equals("vector") ? C1257s.m5458n(resources, xmlPullParser, attributeSet, theme) : C6028k.zy.m22266k(resources, xmlPullParser, attributeSet, theme);
        }
        if (drawableM650p != null) {
            return this.f344b.fti(iArrM262h, drawableM650p, resourceId);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + bp);
    }

    private int fti(@lvui Context context, @lvui Resources resources, @lvui XmlPullParser xmlPullParser, @lvui AttributeSet attributeSet, @dd Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray typedArrayT8r = kja0.t8r(resources, theme, attributeSet, toq.C8045toq.f75154ld6);
        int resourceId = typedArrayT8r.getResourceId(toq.C8045toq.f75155n7h, -1);
        int resourceId2 = typedArrayT8r.getResourceId(toq.C8045toq.f75157qrj, -1);
        int resourceId3 = typedArrayT8r.getResourceId(toq.C8045toq.f75160x2, -1);
        Drawable drawableM650p = resourceId3 > 0 ? lrht.m648y().m650p(context, resourceId3) : null;
        boolean z2 = typedArrayT8r.getBoolean(toq.C8045toq.f75153kja0, false);
        typedArrayT8r.recycle();
        if (drawableM650p == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + f46629ab);
            }
            drawableM650p = xmlPullParser.getName().equals("animated-vector") ? androidx.vectordrawable.graphics.drawable.zy.m5489n(context, resources, xmlPullParser, attributeSet, theme) : C6028k.zy.m22266k(resources, xmlPullParser, attributeSet, theme);
        }
        if (drawableM650p == null) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + f46629ab);
        }
        if (resourceId != -1 && resourceId2 != -1) {
            return this.f344b.jp0y(resourceId, resourceId2, drawableM650p, z2);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + bb);
    }

    private void fu4(TypedArray typedArray) {
        zy zyVar = this.f344b;
        zyVar.f386q |= C6028k.zy.toq(typedArray);
        zyVar.m287t(typedArray.getBoolean(toq.C8045toq.f34692q, zyVar.f387s));
        zyVar.fu4(typedArray.getBoolean(toq.C8045toq.f34690n, zyVar.f46668x2));
        zyVar.m289z(typedArray.getInt(toq.C8045toq.f34686g, zyVar.f46667wvg));
        zyVar.o1t(typedArray.getInt(toq.C8045toq.f75149f7l8, zyVar.f388t));
        setDither(typedArray.getBoolean(toq.C8045toq.f75159toq, zyVar.f46653fu4));
    }

    private void jk() {
        onStateChange(getState());
    }

    private boolean jp0y(int i2) {
        int iM277q;
        int iEqxt;
        f7l8 toqVar;
        f7l8 f7l8Var = this.f343a;
        if (f7l8Var == null) {
            iM277q = m277q();
        } else {
            if (i2 == this.f346x) {
                return true;
            }
            if (i2 == this.f345u && f7l8Var.mo259k()) {
                f7l8Var.toq();
                this.f346x = this.f345u;
                this.f345u = i2;
                return true;
            }
            iM277q = this.f346x;
            f7l8Var.mo260q();
        }
        this.f343a = null;
        this.f345u = -1;
        this.f346x = -1;
        zy zyVar = this.f344b;
        int iD3 = zyVar.d3(iM277q);
        int iD32 = zyVar.d3(i2);
        if (iD32 == 0 || iD3 == 0 || (iEqxt = zyVar.eqxt(iD3, iD32)) < 0) {
            return false;
        }
        boolean zLvui = zyVar.lvui(iD3, iD32);
        m278y(iEqxt);
        Object current = getCurrent();
        if (current instanceof AnimationDrawable) {
            toqVar = new n((AnimationDrawable) current, zyVar.d2ok(iD3, iD32), zLvui);
        } else {
            if (!(current instanceof androidx.vectordrawable.graphics.drawable.zy)) {
                if (current instanceof Animatable) {
                    toqVar = new toq((Animatable) current);
                }
                return false;
            }
            toqVar = new q((androidx.vectordrawable.graphics.drawable.zy) current);
        }
        toqVar.zy();
        this.f343a = toqVar;
        this.f345u = iM277q;
        this.f346x = i2;
        return true;
    }

    public static C0109k mcp(@lvui Context context, @lvui Resources resources, @lvui XmlPullParser xmlPullParser, @lvui AttributeSet attributeSet, @dd Resources.Theme theme) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            C0109k c0109k = new C0109k();
            c0109k.zurt(context, resources, xmlPullParser, attributeSet, theme);
            return c0109k;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    private void ni7(@lvui Context context, @lvui Resources resources, @lvui XmlPullParser xmlPullParser, @lvui AttributeSet attributeSet, @dd Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth) {
                if (xmlPullParser.getName().equals(f342w)) {
                    a9(context, resources, xmlPullParser, attributeSet, theme);
                } else if (xmlPullParser.getName().equals(f340d)) {
                    fti(context, resources, xmlPullParser, attributeSet, theme);
                }
            }
        }
    }

    @dd
    /* JADX INFO: renamed from: t */
    public static C0109k m256t(@lvui Context context, @fn3e int i2, @dd Resources.Theme theme) {
        int next;
        try {
            Resources resources = context.getResources();
            XmlResourceParser xml = resources.getXml(i2);
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next == 2) {
                return mcp(context, resources, xml, attributeSetAsAttributeSet, theme);
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException e2) {
            Log.e(f341v, "parser error", e2);
            return null;
        } catch (XmlPullParserException e3) {
            Log.e(f341v, "parser error", e3);
            return null;
        }
    }

    @Override // androidx.appcompat.graphics.drawable.C0110n, androidx.appcompat.graphics.drawable.toq, android.graphics.drawable.Drawable
    @hyr(21)
    public /* bridge */ /* synthetic */ void applyTheme(@lvui Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // androidx.appcompat.graphics.drawable.toq, android.graphics.drawable.Drawable
    @hyr(21)
    public /* bridge */ /* synthetic */ boolean canApplyTheme() {
        return super.canApplyTheme();
    }

    @Override // androidx.appcompat.graphics.drawable.toq, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void draw(@lvui Canvas canvas) {
        super.draw(canvas);
    }

    @Override // androidx.appcompat.graphics.drawable.toq, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // androidx.appcompat.graphics.drawable.toq, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getChangingConfigurations() {
        return super.getChangingConfigurations();
    }

    @Override // androidx.appcompat.graphics.drawable.toq, android.graphics.drawable.Drawable
    @lvui
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // androidx.appcompat.graphics.drawable.toq, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void getHotspotBounds(@lvui Rect rect) {
        super.getHotspotBounds(rect);
    }

    @Override // androidx.appcompat.graphics.drawable.toq, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getIntrinsicHeight() {
        return super.getIntrinsicHeight();
    }

    @Override // androidx.appcompat.graphics.drawable.toq, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getIntrinsicWidth() {
        return super.getIntrinsicWidth();
    }

    @Override // androidx.appcompat.graphics.drawable.toq, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // androidx.appcompat.graphics.drawable.toq, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // androidx.appcompat.graphics.drawable.toq, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // androidx.appcompat.graphics.drawable.toq, android.graphics.drawable.Drawable
    @hyr(21)
    public /* bridge */ /* synthetic */ void getOutline(@lvui Outline outline) {
        super.getOutline(outline);
    }

    @Override // androidx.appcompat.graphics.drawable.toq, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(@lvui Rect rect) {
        return super.getPadding(rect);
    }

    @Override // androidx.appcompat.graphics.drawable.toq, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void invalidateDrawable(@lvui Drawable drawable) {
        super.invalidateDrawable(drawable);
    }

    @Override // androidx.appcompat.graphics.drawable.toq, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean isAutoMirrored() {
        return super.isAutoMirrored();
    }

    @Override // androidx.appcompat.graphics.drawable.C0110n, androidx.appcompat.graphics.drawable.toq, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // androidx.appcompat.graphics.drawable.toq, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        f7l8 f7l8Var = this.f343a;
        if (f7l8Var != null) {
            f7l8Var.mo260q();
            this.f343a = null;
            m278y(this.f346x);
            this.f346x = -1;
            this.f345u = -1;
        }
    }

    @Override // androidx.appcompat.graphics.drawable.toq
    public /* bridge */ /* synthetic */ void ld6(int i2) {
        super.ld6(i2);
    }

    @Override // androidx.appcompat.graphics.drawable.C0110n, androidx.appcompat.graphics.drawable.toq, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f46630bo && super.mutate() == this) {
            this.f344b.zurt();
            this.f46630bo = true;
        }
        return this;
    }

    @Override // androidx.appcompat.graphics.drawable.C0110n
    public /* bridge */ /* synthetic */ void n7h(int[] iArr, Drawable drawable) {
        super.n7h(iArr, drawable);
    }

    public <T extends Drawable & Animatable> void o1t(int i2, int i3, @lvui T t2, boolean z2) {
        if (t2 == null) {
            throw new IllegalArgumentException("Transition drawable must not be null");
        }
        this.f344b.jp0y(i2, i3, t2, z2);
    }

    @Override // androidx.appcompat.graphics.drawable.toq, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean onLayoutDirectionChanged(int i2) {
        return super.onLayoutDirectionChanged(i2);
    }

    @Override // androidx.appcompat.graphics.drawable.C0110n, androidx.appcompat.graphics.drawable.toq, android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        int iOc = this.f344b.oc(iArr);
        boolean z2 = iOc != m277q() && (jp0y(iOc) || m278y(iOc));
        Drawable current = getCurrent();
        return current != null ? z2 | current.setState(iArr) : z2;
    }

    @Override // androidx.appcompat.graphics.drawable.C0110n, androidx.appcompat.graphics.drawable.toq
    /* JADX INFO: renamed from: s */
    void mo257s(@lvui toq.AbstractC0113q abstractC0113q) {
        super.mo257s(abstractC0113q);
        if (abstractC0113q instanceof zy) {
            this.f344b = (zy) abstractC0113q;
        }
    }

    @Override // androidx.appcompat.graphics.drawable.toq, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void scheduleDrawable(@lvui Drawable drawable, @lvui Runnable runnable, long j2) {
        super.scheduleDrawable(drawable, runnable, j2);
    }

    @Override // androidx.appcompat.graphics.drawable.toq, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(int i2) {
        super.setAlpha(i2);
    }

    @Override // androidx.appcompat.graphics.drawable.toq, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAutoMirrored(boolean z2) {
        super.setAutoMirrored(z2);
    }

    @Override // androidx.appcompat.graphics.drawable.toq, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // androidx.appcompat.graphics.drawable.toq, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setDither(boolean z2) {
        super.setDither(z2);
    }

    @Override // androidx.appcompat.graphics.drawable.toq, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f2, float f3) {
        super.setHotspot(f2, f3);
    }

    @Override // androidx.appcompat.graphics.drawable.toq, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i2, int i3, int i4, int i5) {
        super.setHotspotBounds(i2, i3, i4, i5);
    }

    @Override // androidx.appcompat.graphics.drawable.toq, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.n7h
    public /* bridge */ /* synthetic */ void setTintList(ColorStateList colorStateList) {
        super.setTintList(colorStateList);
    }

    @Override // androidx.appcompat.graphics.drawable.toq, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.n7h
    public /* bridge */ /* synthetic */ void setTintMode(@lvui PorterDuff.Mode mode) {
        super.setTintMode(mode);
    }

    @Override // androidx.appcompat.graphics.drawable.toq, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z2, boolean z3) {
        boolean visible = super.setVisible(z2, z3);
        f7l8 f7l8Var = this.f343a;
        if (f7l8Var != null && (visible || z3)) {
            if (z2) {
                f7l8Var.zy();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    @Override // androidx.appcompat.graphics.drawable.C0110n, androidx.appcompat.graphics.drawable.toq
    void toq() {
        super.toq();
        this.f46630bo = false;
    }

    @Override // androidx.appcompat.graphics.drawable.toq, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void unscheduleDrawable(@lvui Drawable drawable, @lvui Runnable runnable) {
        super.unscheduleDrawable(drawable, runnable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.appcompat.graphics.drawable.C0110n, androidx.appcompat.graphics.drawable.toq
    /* JADX INFO: renamed from: wvg, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public zy zy() {
        return new zy(this.f344b, this, null);
    }

    @Override // androidx.appcompat.graphics.drawable.toq
    public /* bridge */ /* synthetic */ void x2(int i2) {
        super.x2(i2);
    }

    /* JADX INFO: renamed from: z */
    public void m258z(@lvui int[] iArr, @lvui Drawable drawable, int i2) {
        if (drawable == null) {
            throw new IllegalArgumentException("Drawable must not be null");
        }
        this.f344b.fti(iArr, drawable, i2);
        onStateChange(getState());
    }

    @Override // androidx.appcompat.graphics.drawable.C0110n
    public void zurt(@lvui Context context, @lvui Resources resources, @lvui XmlPullParser xmlPullParser, @lvui AttributeSet attributeSet, @dd Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray typedArrayT8r = kja0.t8r(resources, theme, attributeSet, toq.C8045toq.f34689k);
        setVisible(typedArrayT8r.getBoolean(toq.C8045toq.f75162zy, true), true);
        fu4(typedArrayT8r);
        qrj(resources);
        typedArrayT8r.recycle();
        ni7(context, resources, xmlPullParser, attributeSet, theme);
        jk();
    }

    C0109k(@dd zy zyVar, @dd Resources resources) {
        super(null);
        this.f346x = -1;
        this.f345u = -1;
        mo257s(new zy(zyVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }
}
