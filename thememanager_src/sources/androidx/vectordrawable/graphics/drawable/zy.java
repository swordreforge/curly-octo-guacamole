package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.collection.C0247k;
import androidx.core.content.res.C0506s;
import androidx.core.content.res.kja0;
import androidx.vectordrawable.graphics.drawable.toq;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import zy.dd;
import zy.fn3e;
import zy.hyr;
import zy.lvui;

/* JADX INFO: compiled from: AnimatedVectorDrawableCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class zy extends AbstractC1259y implements androidx.vectordrawable.graphics.drawable.toq {

    /* JADX INFO: renamed from: i */
    private static final String f6895i = "AnimatedVDCompat";

    /* JADX INFO: renamed from: r */
    private static final boolean f6896r = false;

    /* JADX INFO: renamed from: t */
    private static final String f6897t = "target";

    /* JADX INFO: renamed from: z */
    private static final String f6898z = "animated-vector";

    /* JADX INFO: renamed from: g */
    private ArgbEvaluator f6899g;

    /* JADX INFO: renamed from: h */
    final Drawable.Callback f6900h;

    /* JADX INFO: renamed from: n */
    private Context f6901n;

    /* JADX INFO: renamed from: p */
    ArrayList<toq.AbstractC1258k> f6902p;

    /* JADX INFO: renamed from: q */
    private C7897zy f6903q;

    /* JADX INFO: renamed from: s */
    private Animator.AnimatorListener f6904s;

    /* JADX INFO: renamed from: y */
    C1261q f6905y;

    /* JADX INFO: renamed from: androidx.vectordrawable.graphics.drawable.zy$k */
    /* JADX INFO: compiled from: AnimatedVectorDrawableCompat.java */
    class C1260k implements Drawable.Callback {
        C1260k() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            zy.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
            zy.this.scheduleSelf(runnable, j2);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            zy.this.unscheduleSelf(runnable);
        }
    }

    /* JADX INFO: compiled from: AnimatedVectorDrawableCompat.java */
    class toq extends AnimatorListenerAdapter {
        toq() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ArrayList arrayList = new ArrayList(zy.this.f6902p);
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((toq.AbstractC1258k) arrayList.get(i2)).toq(zy.this);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ArrayList arrayList = new ArrayList(zy.this.f6902p);
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((toq.AbstractC1258k) arrayList.get(i2)).zy(zy.this);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.vectordrawable.graphics.drawable.zy$zy, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AnimatedVectorDrawableCompat.java */
    private static class C7897zy extends Drawable.ConstantState {

        /* JADX INFO: renamed from: k */
        int f6909k;

        /* JADX INFO: renamed from: n */
        C0247k<Animator, String> f6910n;

        /* JADX INFO: renamed from: q */
        ArrayList<Animator> f6911q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        C1257s f53634toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        AnimatorSet f53635zy;

        public C7897zy(Context context, C7897zy c7897zy, Drawable.Callback callback, Resources resources) {
            if (c7897zy != null) {
                this.f6909k = c7897zy.f6909k;
                C1257s c1257s = c7897zy.f53634toq;
                if (c1257s != null) {
                    Drawable.ConstantState constantState = c1257s.getConstantState();
                    if (resources != null) {
                        this.f53634toq = (C1257s) constantState.newDrawable(resources);
                    } else {
                        this.f53634toq = (C1257s) constantState.newDrawable();
                    }
                    C1257s c1257s2 = (C1257s) this.f53634toq.mutate();
                    this.f53634toq = c1257s2;
                    c1257s2.setCallback(callback);
                    this.f53634toq.setBounds(c7897zy.f53634toq.getBounds());
                    this.f53634toq.x2(false);
                }
                ArrayList<Animator> arrayList = c7897zy.f6911q;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f6911q = new ArrayList<>(size);
                    this.f6910n = new C0247k<>(size);
                    for (int i2 = 0; i2 < size; i2++) {
                        Animator animator = c7897zy.f6911q.get(i2);
                        Animator animatorClone = animator.clone();
                        String str = c7897zy.f6910n.get(animator);
                        animatorClone.setTarget(this.f53634toq.f7l8(str));
                        this.f6911q.add(animatorClone);
                        this.f6910n.put(animatorClone, str);
                    }
                    m5494k();
                }
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f6909k;
        }

        /* JADX INFO: renamed from: k */
        public void m5494k() {
            if (this.f53635zy == null) {
                this.f53635zy = new AnimatorSet();
            }
            this.f53635zy.playTogether(this.f6911q);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    zy() {
        this(null, null, null);
    }

    @hyr(23)
    private static void f7l8(@lvui AnimatedVectorDrawable animatedVectorDrawable, @lvui toq.AbstractC1258k abstractC1258k) {
        animatedVectorDrawable.registerAnimationCallback(abstractC1258k.m5486k());
    }

    /* JADX INFO: renamed from: g */
    public static void m5487g(Drawable drawable, toq.AbstractC1258k abstractC1258k) {
        if (drawable == null || abstractC1258k == null || !(drawable instanceof Animatable)) {
            return;
        }
        f7l8((AnimatedVectorDrawable) drawable, abstractC1258k);
    }

    /* JADX INFO: renamed from: k */
    public static void m5488k(Drawable drawable) {
        if (drawable instanceof Animatable) {
            ((AnimatedVectorDrawable) drawable).clearAnimationCallbacks();
        }
    }

    public static boolean ld6(Drawable drawable, toq.AbstractC1258k abstractC1258k) {
        if (drawable == null || abstractC1258k == null || !(drawable instanceof Animatable)) {
            return false;
        }
        return x2((AnimatedVectorDrawable) drawable, abstractC1258k);
    }

    /* JADX INFO: renamed from: n */
    public static zy m5489n(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        zy zyVar = new zy(context);
        zyVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return zyVar;
    }

    /* JADX INFO: renamed from: p */
    private void m5490p(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i2 = 0; i2 < childAnimations.size(); i2++) {
                m5490p(childAnimations.get(i2));
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f6899g == null) {
                    this.f6899g = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.f6899g);
            }
        }
    }

    @dd
    /* JADX INFO: renamed from: q */
    public static zy m5491q(@lvui Context context, @fn3e int i2) {
        zy zyVar = new zy(context);
        Drawable drawableF7l8 = C0506s.f7l8(context.getResources(), i2, context.getTheme());
        zyVar.f6894k = drawableF7l8;
        drawableF7l8.setCallback(zyVar.f6900h);
        zyVar.f6905y = new C1261q(zyVar.f6894k.getConstantState());
        return zyVar;
    }

    /* JADX INFO: renamed from: s */
    private void m5492s(String str, Animator animator) {
        animator.setTarget(this.f6903q.f53634toq.f7l8(str));
        C7897zy c7897zy = this.f6903q;
        if (c7897zy.f6911q == null) {
            c7897zy.f6911q = new ArrayList<>();
            this.f6903q.f6910n = new C0247k<>();
        }
        this.f6903q.f6911q.add(animator);
        this.f6903q.f6910n.put(animator, str);
    }

    @hyr(23)
    private static boolean x2(AnimatedVectorDrawable animatedVectorDrawable, toq.AbstractC1258k abstractC1258k) {
        return animatedVectorDrawable.unregisterAnimationCallback(abstractC1258k.m5486k());
    }

    /* JADX INFO: renamed from: y */
    private void m5493y() {
        Animator.AnimatorListener animatorListener = this.f6904s;
        if (animatorListener != null) {
            this.f6903q.f53635zy.removeListener(animatorListener);
            this.f6904s = null;
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC1259y, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f6894k;
        if (drawable != null) {
            androidx.core.graphics.drawable.zy.m2443k(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f6894k;
        if (drawable != null) {
            return androidx.core.graphics.drawable.zy.toq(drawable);
        }
        return false;
    }

    @Override // androidx.vectordrawable.graphics.drawable.toq
    public void clearAnimationCallbacks() {
        Drawable drawable = this.f6894k;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).clearAnimationCallbacks();
            return;
        }
        m5493y();
        ArrayList<toq.AbstractC1258k> arrayList = this.f6902p;
        if (arrayList == null) {
            return;
        }
        arrayList.clear();
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
        this.f6903q.f53634toq.draw(canvas);
        if (this.f6903q.f53635zy.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f6894k;
        return drawable != null ? androidx.core.graphics.drawable.zy.m2446q(drawable) : this.f6903q.f53634toq.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f6894k;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f6903q.f6909k;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f6894k;
        return drawable != null ? androidx.core.graphics.drawable.zy.m2444n(drawable) : this.f6903q.f53634toq.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f6894k != null) {
            return new C1261q(this.f6894k.getConstantState());
        }
        return null;
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC1259y, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f6894k;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f6903q.f53634toq.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f6894k;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f6903q.f53634toq.getIntrinsicWidth();
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
        return drawable != null ? drawable.getOpacity() : this.f6903q.f53634toq.getOpacity();
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
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f6894k;
        if (drawable != null) {
            androidx.core.graphics.drawable.zy.f7l8(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (f6898z.equals(name)) {
                    TypedArray typedArrayT8r = kja0.t8r(resources, theme, attributeSet, C1254k.f53574lvui);
                    int resourceId = typedArrayT8r.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C1257s c1257sM5460q = C1257s.m5460q(resources, resourceId, theme);
                        c1257sM5460q.x2(false);
                        c1257sM5460q.setCallback(this.f6900h);
                        C1257s c1257s = this.f6903q.f53634toq;
                        if (c1257s != null) {
                            c1257s.setCallback(null);
                        }
                        this.f6903q.f53634toq = c1257sM5460q;
                    }
                    typedArrayT8r.recycle();
                } else if ("target".equals(name)) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, C1254k.f53554dd);
                    String string = typedArrayObtainAttributes.getString(0);
                    int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f6901n;
                        if (context == null) {
                            typedArrayObtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        m5492s(string, C1255n.m5451p(context, resourceId2));
                    }
                    typedArrayObtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.f6903q.m5494k();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f6894k;
        return drawable != null ? androidx.core.graphics.drawable.zy.m2448y(drawable) : this.f6903q.f53634toq.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.f6894k;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f6903q.f53635zy.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f6894k;
        return drawable != null ? drawable.isStateful() : this.f6903q.f53634toq.isStateful();
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
        }
        return this;
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC1259y, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f6894k;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f6903q.f53634toq.setBounds(rect);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC1259y, android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i2) {
        Drawable drawable = this.f6894k;
        return drawable != null ? drawable.setLevel(i2) : this.f6903q.f53634toq.setLevel(i2);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f6894k;
        return drawable != null ? drawable.setState(iArr) : this.f6903q.f53634toq.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        Drawable drawable = this.f6894k;
        if (drawable != null) {
            drawable.setAlpha(i2);
        } else {
            this.f6903q.f53634toq.setAlpha(i2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z2) {
        Drawable drawable = this.f6894k;
        if (drawable != null) {
            androidx.core.graphics.drawable.zy.m2445p(drawable, z2);
        } else {
            this.f6903q.f53634toq.setAutoMirrored(z2);
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
            this.f6903q.f53634toq.setTint(i2);
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.n7h
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f6894k;
        if (drawable != null) {
            androidx.core.graphics.drawable.zy.kja0(drawable, colorStateList);
        } else {
            this.f6903q.f53634toq.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.n7h
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f6894k;
        if (drawable != null) {
            androidx.core.graphics.drawable.zy.m2442h(drawable, mode);
        } else {
            this.f6903q.f53634toq.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z2, boolean z3) {
        Drawable drawable = this.f6894k;
        if (drawable != null) {
            return drawable.setVisible(z2, z3);
        }
        this.f6903q.f53634toq.setVisible(z2, z3);
        return super.setVisible(z2, z3);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.f6894k;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else {
            if (this.f6903q.f53635zy.isStarted()) {
                return;
            }
            this.f6903q.f53635zy.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.f6894k;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f6903q.f53635zy.end();
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.toq
    public void toq(@lvui toq.AbstractC1258k abstractC1258k) {
        Drawable drawable = this.f6894k;
        if (drawable != null) {
            f7l8((AnimatedVectorDrawable) drawable, abstractC1258k);
            return;
        }
        if (abstractC1258k == null) {
            return;
        }
        if (this.f6902p == null) {
            this.f6902p = new ArrayList<>();
        }
        if (this.f6902p.contains(abstractC1258k)) {
            return;
        }
        this.f6902p.add(abstractC1258k);
        if (this.f6904s == null) {
            this.f6904s = new toq();
        }
        this.f6903q.f53635zy.addListener(this.f6904s);
    }

    @Override // androidx.vectordrawable.graphics.drawable.toq
    public boolean zy(@lvui toq.AbstractC1258k abstractC1258k) {
        Drawable drawable = this.f6894k;
        if (drawable != null) {
            x2((AnimatedVectorDrawable) drawable, abstractC1258k);
        }
        ArrayList<toq.AbstractC1258k> arrayList = this.f6902p;
        if (arrayList == null || abstractC1258k == null) {
            return false;
        }
        boolean zRemove = arrayList.remove(abstractC1258k);
        if (this.f6902p.size() == 0) {
            m5493y();
        }
        return zRemove;
    }

    private zy(@dd Context context) {
        this(context, null, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f6894k;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f6903q.f53634toq.setColorFilter(colorFilter);
        }
    }

    /* JADX INFO: renamed from: androidx.vectordrawable.graphics.drawable.zy$q */
    /* JADX INFO: compiled from: AnimatedVectorDrawableCompat.java */
    @hyr(24)
    private static class C1261q extends Drawable.ConstantState {

        /* JADX INFO: renamed from: k */
        private final Drawable.ConstantState f6907k;

        public C1261q(Drawable.ConstantState constantState) {
            this.f6907k = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f6907k.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f6907k.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            zy zyVar = new zy();
            Drawable drawableNewDrawable = this.f6907k.newDrawable();
            zyVar.f6894k = drawableNewDrawable;
            drawableNewDrawable.setCallback(zyVar.f6900h);
            return zyVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            zy zyVar = new zy();
            Drawable drawableNewDrawable = this.f6907k.newDrawable(resources);
            zyVar.f6894k = drawableNewDrawable;
            drawableNewDrawable.setCallback(zyVar.f6900h);
            return zyVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            zy zyVar = new zy();
            Drawable drawableNewDrawable = this.f6907k.newDrawable(resources, theme);
            zyVar.f6894k = drawableNewDrawable;
            drawableNewDrawable.setCallback(zyVar.f6900h);
            return zyVar;
        }
    }

    private zy(@dd Context context, @dd C7897zy c7897zy, @dd Resources resources) {
        this.f6899g = null;
        this.f6904s = null;
        this.f6902p = null;
        C1260k c1260k = new C1260k();
        this.f6900h = c1260k;
        this.f6901n = context;
        if (c7897zy != null) {
            this.f6903q = c7897zy;
        } else {
            this.f6903q = new C7897zy(context, c7897zy, c1260k, resources);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
