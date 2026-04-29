package com.airbnb.lottie;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.lottie.model.C1471n;
import com.airbnb.lottie.utils.C1510q;
import com.airbnb.lottie.utils.C1512y;
import com.airbnb.lottie.value.C1517p;
import com.airbnb.lottie.vyq;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import p023g.C6045k;
import zy.InterfaceC7828g;

/* JADX INFO: loaded from: classes.dex */
public class LottieAnimationView extends AppCompatImageView {

    /* JADX INFO: renamed from: c */
    private final Set<InterfaceC1438l> f7774c;

    /* JADX INFO: renamed from: e */
    @zy.dd
    private C1429c<ld6> f7775e;

    /* JADX INFO: renamed from: f */
    private final Set<zy> f7776f;

    /* JADX INFO: renamed from: g */
    private final x9kr<ld6> f7777g;

    /* JADX INFO: renamed from: h */
    private final C1504r f7778h;

    /* JADX INFO: renamed from: i */
    private String f7779i;

    /* JADX INFO: renamed from: j */
    @zy.dd
    private ld6 f7780j;

    /* JADX INFO: renamed from: l */
    private boolean f7781l;

    /* JADX INFO: renamed from: p */
    @zy.fn3e
    private int f7782p;

    /* JADX INFO: renamed from: r */
    private boolean f7783r;

    /* JADX INFO: renamed from: s */
    @zy.dd
    private x9kr<Throwable> f7784s;

    /* JADX INFO: renamed from: t */
    private boolean f7785t;

    /* JADX INFO: renamed from: y */
    private final x9kr<Throwable> f7786y;

    /* JADX INFO: renamed from: z */
    @zy.n5r1
    private int f7787z;

    /* JADX INFO: renamed from: o */
    private static final String f7773o = LottieAnimationView.class.getSimpleName();

    /* JADX INFO: renamed from: m */
    private static final x9kr<Throwable> f7772m = new x9kr() { // from class: com.airbnb.lottie.s
        @Override // com.airbnb.lottie.x9kr
        public final void onResult(Object obj) {
            LottieAnimationView.ncyb((Throwable) obj);
        }
    };

    private static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.airbnb.lottie.LottieAnimationView.SavedState.1
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        };

        /* JADX INFO: renamed from: g */
        boolean f7788g;

        /* JADX INFO: renamed from: k */
        String f7789k;

        /* JADX INFO: renamed from: n */
        float f7790n;

        /* JADX INFO: renamed from: p */
        int f7791p;

        /* JADX INFO: renamed from: q */
        int f7792q;

        /* JADX INFO: renamed from: s */
        int f7793s;

        /* JADX INFO: renamed from: y */
        String f7794y;

        /* synthetic */ SavedState(Parcel parcel, C1406k c1406k) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeString(this.f7789k);
            parcel.writeFloat(this.f7790n);
            parcel.writeInt(this.f7788g ? 1 : 0);
            parcel.writeString(this.f7794y);
            parcel.writeInt(this.f7793s);
            parcel.writeInt(this.f7791p);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f7789k = parcel.readString();
            this.f7790n = parcel.readFloat();
            this.f7788g = parcel.readInt() == 1;
            this.f7794y = parcel.readString();
            this.f7793s = parcel.readInt();
            this.f7791p = parcel.readInt();
        }
    }

    /* JADX INFO: renamed from: com.airbnb.lottie.LottieAnimationView$k */
    class C1406k implements x9kr<Throwable> {
        C1406k() {
        }

        @Override // com.airbnb.lottie.x9kr
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public void onResult(Throwable th) {
            if (LottieAnimationView.this.f7782p != 0) {
                LottieAnimationView lottieAnimationView = LottieAnimationView.this;
                lottieAnimationView.setImageResource(lottieAnimationView.f7782p);
            }
            (LottieAnimationView.this.f7784s == null ? LottieAnimationView.f7772m : LottieAnimationView.this.f7784s).onResult(th);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    class toq<T> extends C1517p<T> {

        /* JADX INFO: renamed from: q */
        final /* synthetic */ com.airbnb.lottie.value.x2 f7797q;

        toq(com.airbnb.lottie.value.x2 x2Var) {
            this.f7797q = x2Var;
        }

        @Override // com.airbnb.lottie.value.C1517p
        /* JADX INFO: renamed from: k */
        public T mo5884k(com.airbnb.lottie.value.toq<T> toqVar) {
            return (T) this.f7797q.m6295k(toqVar);
        }
    }

    private enum zy {
        SET_ANIMATION,
        SET_PROGRESS,
        SET_REPEAT_MODE,
        SET_REPEAT_COUNT,
        SET_IMAGE_ASSETS,
        PLAY_OPTION
    }

    public LottieAnimationView(Context context) {
        super(context);
        this.f7777g = new x9kr() { // from class: com.airbnb.lottie.y
            @Override // com.airbnb.lottie.x9kr
            public final void onResult(Object obj) {
                this.f8540k.setComposition((ld6) obj);
            }
        };
        this.f7786y = new C1406k();
        this.f7782p = 0;
        this.f7778h = new C1504r();
        this.f7785t = false;
        this.f7783r = false;
        this.f7781l = true;
        this.f7776f = new HashSet();
        this.f7774c = new HashSet();
        d2ok(null, vyq.zy.f57137l05);
    }

    private void a9() {
        this.f7780j = null;
        this.f7778h.m6234t();
    }

    private void d2ok(@zy.dd AttributeSet attributeSet, @InterfaceC7828g int i2) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, vyq.n7h.j1s, i2, 0);
        this.f7781l = typedArrayObtainStyledAttributes.getBoolean(vyq.n7h.ze, true);
        int i3 = vyq.n7h.dmw0;
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i3);
        int i4 = vyq.n7h.b6i9;
        boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(i4);
        int i5 = vyq.n7h.ym;
        boolean zHasValue3 = typedArrayObtainStyledAttributes.hasValue(i5);
        if (zHasValue && zHasValue2) {
            throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
        }
        if (zHasValue) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(i3, 0);
            if (resourceId != 0) {
                setAnimation(resourceId);
            }
        } else if (zHasValue2) {
            String string2 = typedArrayObtainStyledAttributes.getString(i4);
            if (string2 != null) {
                setAnimation(string2);
            }
        } else if (zHasValue3 && (string = typedArrayObtainStyledAttributes.getString(i5)) != null) {
            setAnimationFromUrl(string);
        }
        setFallbackResource(typedArrayObtainStyledAttributes.getResourceId(vyq.n7h.xknm, 0));
        if (typedArrayObtainStyledAttributes.getBoolean(vyq.n7h.tvn8, false)) {
            this.f7783r = true;
        }
        if (typedArrayObtainStyledAttributes.getBoolean(vyq.n7h.bao0, false)) {
            this.f7778h.mbx(-1);
        }
        int i6 = vyq.n7h.te;
        if (typedArrayObtainStyledAttributes.hasValue(i6)) {
            setRepeatMode(typedArrayObtainStyledAttributes.getInt(i6, 1));
        }
        int i7 = vyq.n7h.ff8y;
        if (typedArrayObtainStyledAttributes.hasValue(i7)) {
            setRepeatCount(typedArrayObtainStyledAttributes.getInt(i7, -1));
        }
        int i8 = vyq.n7h.t8o;
        if (typedArrayObtainStyledAttributes.hasValue(i8)) {
            setSpeed(typedArrayObtainStyledAttributes.getFloat(i8, 1.0f));
        }
        int i9 = vyq.n7h.km9o;
        if (typedArrayObtainStyledAttributes.hasValue(i9)) {
            setClipToCompositionBounds(typedArrayObtainStyledAttributes.getBoolean(i9, true));
        }
        setImageAssetsFolder(typedArrayObtainStyledAttributes.getString(vyq.n7h.uew));
        setProgress(typedArrayObtainStyledAttributes.getFloat(vyq.n7h.s9de, 0.0f));
        jp0y(typedArrayObtainStyledAttributes.getBoolean(vyq.n7h.a4ph, false));
        int i10 = vyq.n7h.li5y;
        if (typedArrayObtainStyledAttributes.hasValue(i10)) {
            wvg(new C1471n("**"), n5r1.f56126eqxt, new C1517p(new nn86(C6045k.m22274k(getContext(), typedArrayObtainStyledAttributes.getResourceId(i10, -1)).getDefaultColor())));
        }
        int i11 = vyq.n7h.gg7;
        if (typedArrayObtainStyledAttributes.hasValue(i11)) {
            EnumC1430e enumC1430e = EnumC1430e.AUTOMATIC;
            int iOrdinal = typedArrayObtainStyledAttributes.getInt(i11, enumC1430e.ordinal());
            if (iOrdinal >= EnumC1430e.values().length) {
                iOrdinal = enumC1430e.ordinal();
            }
            setRenderMode(EnumC1430e.values()[iOrdinal]);
        }
        setIgnoreDisabledSystemAnimations(typedArrayObtainStyledAttributes.getBoolean(vyq.n7h.bp, false));
        typedArrayObtainStyledAttributes.recycle();
        this.f7778h.wx16(Boolean.valueOf(C1512y.m6258g(getContext()) != 0.0f));
    }

    private C1429c<ld6> d3(@zy.n5r1 final int i2) {
        return isInEditMode() ? new C1429c<>(new Callable() { // from class: com.airbnb.lottie.f7l8
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f7936k.x9kr(i2);
            }
        }, true) : this.f7781l ? ni7.mcp(getContext(), i2) : ni7.jk(getContext(), i2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ hyr dd(String str) throws Exception {
        return this.f7781l ? ni7.cdj(getContext(), str) : ni7.ki(getContext(), str, null);
    }

    private C1429c<ld6> gvn7(final String str) {
        return isInEditMode() ? new C1429c<>(new Callable() { // from class: com.airbnb.lottie.p
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f8135k.dd(str);
            }
        }, true) : this.f7781l ? ni7.kja0(getContext(), str) : ni7.m6126h(getContext(), str, null);
    }

    private void jk() {
        C1429c<ld6> c1429c = this.f7775e;
        if (c1429c != null) {
            c1429c.m5951p(this.f7777g);
            this.f7775e.m5953s(this.f7786y);
        }
    }

    /* JADX INFO: renamed from: m */
    private void m5872m() {
        boolean zLvui = lvui();
        setImageDrawable(null);
        setImageDrawable(this.f7778h);
        if (zLvui) {
            this.f7778h.py();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void ncyb(Throwable th) {
        if (!C1512y.ld6(th)) {
            throw new IllegalStateException("Unable to parse composition", th);
        }
        C1510q.m6253g("Unable to load composition.", th);
    }

    private void setCompositionTask(C1429c<ld6> c1429c) {
        this.f7776f.add(zy.SET_ANIMATION);
        a9();
        jk();
        this.f7775e = c1429c.m5952q(this.f7777g).zy(this.f7786y);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ hyr x9kr(int i2) throws Exception {
        return this.f7781l ? ni7.a9(getContext(), i2) : ni7.fti(getContext(), i2, null);
    }

    /* JADX INFO: renamed from: c */
    public void m5873c() {
        this.f7774c.clear();
    }

    /* JADX INFO: renamed from: e */
    public boolean m5874e(@zy.lvui InterfaceC1438l interfaceC1438l) {
        return this.f7774c.remove(interfaceC1438l);
    }

    @zy.dd
    public Bitmap ek5k(String str, @zy.dd Bitmap bitmap) {
        return this.f7778h.m28250do(str, bitmap);
    }

    public boolean eqxt() {
        return this.f7778h.bf2();
    }

    /* JADX INFO: renamed from: f */
    public void m5875f() {
        this.f7778h.tfm();
    }

    @Deprecated
    public void fti() {
        this.f7778h.fti();
    }

    @zy.hyr(api = 19)
    public void fu4(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f7778h.fn3e(animatorPauseListener);
    }

    public boolean getClipToCompositionBounds() {
        return this.f7778h.dd();
    }

    @zy.dd
    public ld6 getComposition() {
        return this.f7780j;
    }

    public long getDuration() {
        ld6 ld6Var = this.f7780j;
        if (ld6Var != null) {
            return (long) ld6Var.m5977q();
        }
        return 0L;
    }

    public int getFrame() {
        return this.f7778h.n5r1();
    }

    @zy.dd
    public String getImageAssetsFolder() {
        return this.f7778h.m6227c();
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.f7778h.uv6();
    }

    public float getMaxFrame() {
        return this.f7778h.vyq();
    }

    public float getMinFrame() {
        return this.f7778h.m6228e();
    }

    @zy.dd
    public uv6 getPerformanceTracker() {
        return this.f7778h.nn86();
    }

    @zy.zurt(from = 0.0d, to = 1.0d)
    public float getProgress() {
        return this.f7778h.hb();
    }

    public EnumC1430e getRenderMode() {
        return this.f7778h.m6230j();
    }

    public int getRepeatCount() {
        return this.f7778h.m6232o();
    }

    public int getRepeatMode() {
        return this.f7778h.m6231m();
    }

    public float getSpeed() {
        return this.f7778h.ek5k();
    }

    public List<C1471n> hb(C1471n c1471n) {
        return this.f7778h.zsr0(c1471n);
    }

    @zy.oc
    public void hyr() {
        this.f7776f.add(zy.PLAY_OPTION);
        this.f7778h.qo();
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if ((drawable instanceof C1504r) && ((C1504r) drawable).m6230j() == EnumC1430e.SOFTWARE) {
            this.f7778h.invalidateSelf();
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@zy.lvui Drawable drawable) {
        Drawable drawable2 = getDrawable();
        C1504r c1504r = this.f7778h;
        if (drawable2 == c1504r) {
            super.invalidateDrawable(c1504r);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @zy.oc
    /* JADX INFO: renamed from: j */
    public void m5876j() {
        this.f7776f.add(zy.PLAY_OPTION);
        this.f7778h.py();
    }

    public void jp0y(boolean z2) {
        this.f7778h.d3(z2);
    }

    @Deprecated
    /* JADX INFO: renamed from: l */
    public void m5877l(boolean z2) {
        this.f7778h.mbx(z2 ? -1 : 0);
    }

    public void lrht() {
        this.f7778h.wo();
    }

    public boolean lvui() {
        return this.f7778h.a98o();
    }

    @zy.oc
    public void mcp() {
        this.f7776f.add(zy.PLAY_OPTION);
        this.f7778h.wvg();
    }

    @zy.oc
    public void n5r1() {
        this.f7783r = false;
        this.f7778h.fnq8();
    }

    public void ni7(Animator.AnimatorListener animatorListener) {
        this.f7778h.m6229i(animatorListener);
    }

    public void nn86(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f7778h.was(animatorUpdateListener);
    }

    /* JADX INFO: renamed from: o */
    public void m5878o() {
        this.f7778h.i9jn();
    }

    public boolean o1t(@zy.lvui InterfaceC1438l interfaceC1438l) {
        ld6 ld6Var = this.f7780j;
        if (ld6Var != null) {
            interfaceC1438l.m5970k(ld6Var);
        }
        return this.f7774c.add(interfaceC1438l);
    }

    public boolean oc() {
        return this.f7778h.m6226b();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode() || !this.f7783r) {
            return;
        }
        this.f7778h.qo();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        int i2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f7779i = savedState.f7789k;
        Set<zy> set = this.f7776f;
        zy zyVar = zy.SET_ANIMATION;
        if (!set.contains(zyVar) && !TextUtils.isEmpty(this.f7779i)) {
            setAnimation(this.f7779i);
        }
        this.f7787z = savedState.f7792q;
        if (!this.f7776f.contains(zyVar) && (i2 = this.f7787z) != 0) {
            setAnimation(i2);
        }
        if (!this.f7776f.contains(zy.SET_PROGRESS)) {
            setProgress(savedState.f7790n);
        }
        if (!this.f7776f.contains(zy.PLAY_OPTION) && savedState.f7788g) {
            hyr();
        }
        if (!this.f7776f.contains(zy.SET_IMAGE_ASSETS)) {
            setImageAssetsFolder(savedState.f7794y);
        }
        if (!this.f7776f.contains(zy.SET_REPEAT_MODE)) {
            setRepeatMode(savedState.f7793s);
        }
        if (this.f7776f.contains(zy.SET_REPEAT_COUNT)) {
            return;
        }
        setRepeatCount(savedState.f7791p);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f7789k = this.f7779i;
        savedState.f7792q = this.f7787z;
        savedState.f7790n = this.f7778h.hb();
        savedState.f7788g = this.f7778h.m6225a();
        savedState.f7794y = this.f7778h.m6227c();
        savedState.f7793s = this.f7778h.m6231m();
        savedState.f7791p = this.f7778h.m6232o();
        return savedState;
    }

    /* JADX INFO: renamed from: r */
    public boolean m5879r() {
        return this.f7778h.ch();
    }

    public void setAnimation(@zy.n5r1 int i2) {
        this.f7787z = i2;
        this.f7779i = null;
        setCompositionTask(d3(i2));
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        setAnimationFromJson(str, null);
    }

    public void setAnimationFromUrl(String str) {
        setCompositionTask(this.f7781l ? ni7.jp0y(getContext(), str) : ni7.gvn7(getContext(), str, null));
    }

    public void setApplyingOpacityToLayersEnabled(boolean z2) {
        this.f7778h.r8s8(z2);
    }

    public void setCacheComposition(boolean z2) {
        this.f7781l = z2;
    }

    public void setClipToCompositionBounds(boolean z2) {
        this.f7778h.m4(z2);
    }

    public void setComposition(@zy.lvui ld6 ld6Var) {
        if (C1476n.f8106k) {
            Log.v(f7773o, "Set Composition \n" + ld6Var);
        }
        this.f7778h.setCallback(this);
        this.f7780j = ld6Var;
        this.f7785t = true;
        boolean zV0af = this.f7778h.v0af(ld6Var);
        this.f7785t = false;
        if (getDrawable() != this.f7778h || zV0af) {
            if (!zV0af) {
                m5872m();
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator<InterfaceC1438l> it = this.f7774c.iterator();
            while (it.hasNext()) {
                it.next().m5970k(ld6Var);
            }
        }
    }

    public void setFailureListener(@zy.dd x9kr<Throwable> x9krVar) {
        this.f7784s = x9krVar;
    }

    public void setFallbackResource(@zy.fn3e int i2) {
        this.f7782p = i2;
    }

    public void setFontAssetDelegate(com.airbnb.lottie.zy zyVar) {
        this.f7778h.etdu(zyVar);
    }

    public void setFrame(int i2) {
        this.f7778h.sok(i2);
    }

    public void setIgnoreDisabledSystemAnimations(boolean z2) {
        this.f7778h.cfr(z2);
    }

    public void setImageAssetDelegate(InterfaceC1503q interfaceC1503q) {
        this.f7778h.w831(interfaceC1503q);
    }

    public void setImageAssetsFolder(String str) {
        this.f7778h.z4(str);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        jk();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        jk();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i2) {
        jk();
        super.setImageResource(i2);
    }

    public void setMaintainOriginalImageBounds(boolean z2) {
        this.f7778h.yqrt(z2);
    }

    public void setMaxFrame(int i2) {
        this.f7778h.kcsr(i2);
    }

    public void setMaxProgress(@zy.zurt(from = 0.0d, to = 1.0d) float f2) {
        this.f7778h.se(f2);
    }

    public void setMinAndMaxFrame(String str) {
        this.f7778h.zkd(str);
    }

    public void setMinAndMaxProgress(@zy.zurt(from = 0.0d, to = 1.0d) float f2, @zy.zurt(from = 0.0d, to = 1.0d) float f3) {
        this.f7778h.uj2j(f2, f3);
    }

    public void setMinFrame(int i2) {
        this.f7778h.jz5(i2);
    }

    public void setMinProgress(float f2) {
        this.f7778h.b3e(f2);
    }

    public void setOutlineMasksAndMattes(boolean z2) {
        this.f7778h.bek6(z2);
    }

    public void setPerformanceTrackingEnabled(boolean z2) {
        this.f7778h.cv06(z2);
    }

    public void setProgress(@zy.zurt(from = 0.0d, to = 1.0d) float f2) {
        this.f7776f.add(zy.SET_PROGRESS);
        this.f7778h.h7am(f2);
    }

    public void setRenderMode(EnumC1430e enumC1430e) {
        this.f7778h.vep5(enumC1430e);
    }

    public void setRepeatCount(int i2) {
        this.f7776f.add(zy.SET_REPEAT_COUNT);
        this.f7778h.mbx(i2);
    }

    public void setRepeatMode(int i2) {
        this.f7776f.add(zy.SET_REPEAT_MODE);
        this.f7778h.jbh(i2);
    }

    public void setSafeMode(boolean z2) {
        this.f7778h.yl(z2);
    }

    public void setSpeed(float f2) {
        this.f7778h.uc(f2);
    }

    public void setTextDelegate(hb hbVar) {
        this.f7778h.ixz(hbVar);
    }

    /* JADX INFO: renamed from: t */
    public <T> void m5880t(C1471n c1471n, T t2, com.airbnb.lottie.value.x2<T> x2Var) {
        this.f7778h.ni7(c1471n, t2, new toq(x2Var));
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        C1504r c1504r;
        if (!this.f7785t && drawable == (c1504r = this.f7778h) && c1504r.a98o()) {
            n5r1();
        } else if (!this.f7785t && (drawable instanceof C1504r)) {
            C1504r c1504r2 = (C1504r) drawable;
            if (c1504r2.a98o()) {
                c1504r2.fnq8();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public void uv6(Animator.AnimatorListener animatorListener) {
        this.f7778h.d8wk(animatorListener);
    }

    @zy.hyr(api = 19)
    public void vyq(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f7778h.g1(animatorPauseListener);
    }

    public <T> void wvg(C1471n c1471n, T t2, C1517p<T> c1517p) {
        this.f7778h.ni7(c1471n, t2, c1517p);
    }

    /* JADX INFO: renamed from: z */
    public void m5881z(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f7778h.zurt(animatorUpdateListener);
    }

    public void setAnimationFromJson(String str, @zy.dd String str2) {
        setAnimation(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public void setMaxFrame(String str) {
        this.f7778h.bwp(str);
    }

    public void setMinAndMaxFrame(String str, String str2, boolean z2) {
        this.f7778h.bz2(str, str2, z2);
    }

    public void setMinFrame(String str) {
        this.f7778h.ktq(str);
    }

    public void setMinAndMaxFrame(int i2, int i3) {
        this.f7778h.gc3c(i2, i3);
    }

    public void setAnimation(String str) {
        this.f7779i = str;
        this.f7787z = 0;
        setCompositionTask(gvn7(str));
    }

    public void setAnimationFromUrl(String str, @zy.dd String str2) {
        setCompositionTask(ni7.gvn7(getContext(), str, str2));
    }

    public void setAnimation(InputStream inputStream, @zy.dd String str) {
        setCompositionTask(ni7.m6127i(inputStream, str));
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7777g = new x9kr() { // from class: com.airbnb.lottie.y
            @Override // com.airbnb.lottie.x9kr
            public final void onResult(Object obj) {
                this.f8540k.setComposition((ld6) obj);
            }
        };
        this.f7786y = new C1406k();
        this.f7782p = 0;
        this.f7778h = new C1504r();
        this.f7785t = false;
        this.f7783r = false;
        this.f7781l = true;
        this.f7776f = new HashSet();
        this.f7774c = new HashSet();
        d2ok(attributeSet, vyq.zy.f57137l05);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f7777g = new x9kr() { // from class: com.airbnb.lottie.y
            @Override // com.airbnb.lottie.x9kr
            public final void onResult(Object obj) {
                this.f8540k.setComposition((ld6) obj);
            }
        };
        this.f7786y = new C1406k();
        this.f7782p = 0;
        this.f7778h = new C1504r();
        this.f7785t = false;
        this.f7783r = false;
        this.f7781l = true;
        this.f7776f = new HashSet();
        this.f7774c = new HashSet();
        d2ok(attributeSet, i2);
    }
}
