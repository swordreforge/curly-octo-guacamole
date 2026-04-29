package com.google.android.material.navigation;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.C0130p;
import androidx.appcompat.view.menu.f7l8;
import androidx.appcompat.widget.C0184b;
import androidx.core.content.C0498q;
import androidx.core.view.C0683f;
import androidx.core.view.qrj;
import androidx.core.view.tfm;
import androidx.customview.view.AbsSavedState;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.internal.C4051p;
import com.google.android.material.internal.C4054s;
import com.google.android.material.internal.ScrimInsetsFrameLayout;
import com.google.android.material.shape.C4103h;
import com.google.android.material.shape.C4108p;
import com.google.android.material.shape.kja0;
import com.google.android.material.shape.ld6;
import h4b.C6070k;
import ij.C6095k;
import p023g.C6045k;
import p030n.C7397k;
import zy.InterfaceC7829h;
import zy.InterfaceC7833l;
import zy.InterfaceC7843t;
import zy.cdj;
import zy.dd;
import zy.fn3e;
import zy.gvn7;
import zy.hb;
import zy.lvui;
import zy.uv6;

/* JADX INFO: loaded from: classes2.dex */
public class NavigationView extends ScrimInsetsFrameLayout {

    /* JADX INFO: renamed from: x */
    private static final int f24733x = 1;

    /* JADX INFO: renamed from: c */
    private int f24734c;

    /* JADX INFO: renamed from: e */
    @InterfaceC7833l
    private int f24735e;

    /* JADX INFO: renamed from: f */
    private boolean f24736f;

    /* JADX INFO: renamed from: h */
    zy f24737h;

    /* JADX INFO: renamed from: i */
    private final int f24738i;

    /* JADX INFO: renamed from: j */
    @dd
    private Path f24739j;

    /* JADX INFO: renamed from: l */
    private boolean f24740l;

    /* JADX INFO: renamed from: o */
    private final RectF f24741o;

    /* JADX INFO: renamed from: p */
    private final C4051p f24742p;

    /* JADX INFO: renamed from: r */
    private ViewTreeObserver.OnGlobalLayoutListener f24743r;

    /* JADX INFO: renamed from: s */
    @lvui
    private final C4054s f24744s;

    /* JADX INFO: renamed from: t */
    private MenuInflater f24745t;

    /* JADX INFO: renamed from: z */
    private final int[] f24746z;

    /* JADX INFO: renamed from: m */
    private static final int[] f24732m = {R.attr.state_checked};

    /* JADX INFO: renamed from: b */
    private static final int[] f24731b = {-16842910};

    /* JADX INFO: renamed from: a */
    private static final int f24730a = C6095k.n7h.n68g;

    /* JADX INFO: renamed from: com.google.android.material.navigation.NavigationView$k */
    class C4069k implements f7l8.InterfaceC0118k {
        C4069k() {
        }

        @Override // androidx.appcompat.view.menu.f7l8.InterfaceC0118k
        /* JADX INFO: renamed from: k */
        public boolean mo117k(f7l8 f7l8Var, MenuItem menuItem) {
            zy zyVar = NavigationView.this.f24737h;
            return zyVar != null && zyVar.m14674k(menuItem);
        }

        @Override // androidx.appcompat.view.menu.f7l8.InterfaceC0118k
        public void toq(f7l8 f7l8Var) {
        }
    }

    class toq implements ViewTreeObserver.OnGlobalLayoutListener {
        toq() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            NavigationView navigationView = NavigationView.this;
            navigationView.getLocationOnScreen(navigationView.f24746z);
            boolean z2 = NavigationView.this.f24746z[1] == 0;
            NavigationView.this.f24742p.fti(z2);
            NavigationView navigationView2 = NavigationView.this;
            navigationView2.setDrawTopInsetForeground(z2 && navigationView2.qrj());
            Activity activityM14636k = com.google.android.material.internal.zy.m14636k(NavigationView.this.getContext());
            if (activityM14636k != null) {
                boolean z3 = activityM14636k.findViewById(R.id.content).getHeight() == NavigationView.this.getHeight();
                boolean z5 = Color.alpha(activityM14636k.getWindow().getNavigationBarColor()) != 0;
                NavigationView navigationView3 = NavigationView.this;
                navigationView3.setDrawBottomInsetForeground(z3 && z5 && navigationView3.x2());
            }
        }
    }

    public interface zy {
        /* JADX INFO: renamed from: k */
        boolean m14674k(@lvui MenuItem menuItem);
    }

    public NavigationView(@lvui Context context) {
        this(context, null);
    }

    @lvui
    private Drawable f7l8(@lvui C0184b c0184b, @dd ColorStateList colorStateList) {
        C4108p c4108p = new C4108p(kja0.toq(getContext(), c0184b.fn3e(C6095k.kja0.esx1, 0), c0184b.fn3e(C6095k.kja0.x41, 0)).qrj());
        c4108p.m14867x(colorStateList);
        return new InsetDrawable((Drawable) c4108p, c0184b.f7l8(C6095k.kja0.bs, 0), c0184b.f7l8(C6095k.kja0.q1j, 0), c0184b.f7l8(C6095k.kja0.yhcu, 0), c0184b.f7l8(C6095k.kja0.kw5, 0));
    }

    @lvui
    /* JADX INFO: renamed from: g */
    private Drawable m14666g(@lvui C0184b c0184b) {
        return f7l8(c0184b, com.google.android.material.resources.zy.toq(getContext(), c0184b, C6095k.kja0.pavv));
    }

    private MenuInflater getMenuInflater() {
        if (this.f24745t == null) {
            this.f24745t = new androidx.appcompat.view.f7l8(getContext());
        }
        return this.f24745t;
    }

    /* JADX INFO: renamed from: h */
    private void m14667h() {
        this.f24743r = new toq();
        getViewTreeObserver().addOnGlobalLayoutListener(this.f24743r);
    }

    @dd
    /* JADX INFO: renamed from: n */
    private ColorStateList m14668n(int i2) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i2, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateListM22274k = C6045k.m22274k(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(C7397k.toq.f92982wo, typedValue, true)) {
            return null;
        }
        int i3 = typedValue.data;
        int defaultColor = colorStateListM22274k.getDefaultColor();
        int[] iArr = f24731b;
        return new ColorStateList(new int[][]{iArr, f24732m, FrameLayout.EMPTY_STATE_SET}, new int[]{colorStateListM22274k.getColorForState(iArr, defaultColor), i3, defaultColor});
    }

    private void n7h(@InterfaceC7833l int i2, @InterfaceC7833l int i3) {
        if (!(getParent() instanceof DrawerLayout) || this.f24735e <= 0 || !(getBackground() instanceof C4108p)) {
            this.f24739j = null;
            this.f24741o.setEmpty();
            return;
        }
        C4108p c4108p = (C4108p) getBackground();
        kja0.toq toqVarZurt = c4108p.getShapeAppearanceModel().zurt();
        if (qrj.m3432q(this.f24734c, C0683f.m3159e(this)) == 3) {
            toqVarZurt.x9kr(this.f24735e);
            toqVarZurt.mcp(this.f24735e);
        } else {
            toqVarZurt.eqxt(this.f24735e);
            toqVarZurt.fu4(this.f24735e);
        }
        c4108p.setShapeAppearanceModel(toqVarZurt.qrj());
        if (this.f24739j == null) {
            this.f24739j = new Path();
        }
        this.f24739j.reset();
        this.f24741o.set(0.0f, 0.0f, i2, i3);
        C4103h.ld6().m14814q(c4108p.getShapeAppearanceModel(), c4108p.o1t(), this.f24741o, this.f24739j);
        invalidate();
    }

    /* JADX INFO: renamed from: s */
    private boolean m14669s(@lvui C0184b c0184b) {
        return c0184b.mcp(C6095k.kja0.esx1) || c0184b.mcp(C6095k.kja0.x41);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(@lvui Canvas canvas) {
        if (this.f24739j == null) {
            super.dispatchDraw(canvas);
            return;
        }
        int iSave = canvas.save();
        canvas.clipPath(this.f24739j);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(iSave);
    }

    @dd
    public MenuItem getCheckedItem() {
        return this.f24742p.kja0();
    }

    @InterfaceC7833l
    public int getDividerInsetEnd() {
        return this.f24742p.m14573h();
    }

    @InterfaceC7833l
    public int getDividerInsetStart() {
        return this.f24742p.cdj();
    }

    public int getHeaderCount() {
        return this.f24742p.ki();
    }

    @dd
    public Drawable getItemBackground() {
        return this.f24742p.m14574i();
    }

    @cdj
    public int getItemHorizontalPadding() {
        return this.f24742p.fn3e();
    }

    @cdj
    public int getItemIconPadding() {
        return this.f24742p.zurt();
    }

    @dd
    public ColorStateList getItemIconTintList() {
        return this.f24742p.m14578z();
    }

    public int getItemMaxLines() {
        return this.f24742p.ni7();
    }

    @dd
    public ColorStateList getItemTextColor() {
        return this.f24742p.fu4();
    }

    @InterfaceC7833l
    public int getItemVerticalPadding() {
        return this.f24742p.o1t();
    }

    @lvui
    public Menu getMenu() {
        return this.f24744s;
    }

    @InterfaceC7833l
    public int getSubheaderInsetEnd() {
        return this.f24742p.wvg();
    }

    @InterfaceC7833l
    public int getSubheaderInsetStart() {
        return this.f24742p.m14577t();
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    /* JADX INFO: renamed from: k */
    protected void mo14530k(@lvui tfm tfmVar) {
        this.f24742p.n7h(tfmVar);
    }

    public void kja0(@lvui View view) {
        this.f24742p.a9(view);
    }

    public void ld6(int i2) {
        this.f24742p.m14571e(true);
        getMenuInflater().inflate(i2, this.f24744s);
        this.f24742p.m14571e(false);
        this.f24742p.mo355q(false);
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ld6.m14843n(this);
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f24743r);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i2), this.f24738i), 1073741824);
        } else if (mode == 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(this.f24738i, 1073741824);
        }
        super.onMeasure(i2, i3);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f24744s.m327f(savedState.f24747q);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.f24747q = bundle;
        this.f24744s.lrht(bundle);
        return savedState;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        n7h(i2, i3);
    }

    /* JADX INFO: renamed from: p */
    public View m14670p(@gvn7 int i2) {
        return this.f24742p.mcp(i2);
    }

    /* JADX INFO: renamed from: q */
    public void m14671q(@lvui View view) {
        this.f24742p.qrj(view);
    }

    public boolean qrj() {
        return this.f24740l;
    }

    public void setBottomInsetScrimEnabled(boolean z2) {
        this.f24736f = z2;
    }

    public void setCheckedItem(@InterfaceC7843t int i2) {
        MenuItem menuItemFindItem = this.f24744s.findItem(i2);
        if (menuItemFindItem != null) {
            this.f24742p.jp0y((C0130p) menuItemFindItem);
        }
    }

    public void setDividerInsetEnd(@InterfaceC7833l int i2) {
        this.f24742p.gvn7(i2);
    }

    public void setDividerInsetStart(@InterfaceC7833l int i2) {
        this.f24742p.d3(i2);
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        ld6.m14844q(this, f2);
    }

    public void setItemBackground(@dd Drawable drawable) {
        this.f24742p.eqxt(drawable);
    }

    public void setItemBackgroundResource(@fn3e int i2) {
        setItemBackground(C0498q.m2259s(getContext(), i2));
    }

    public void setItemHorizontalPadding(@cdj int i2) {
        this.f24742p.lvui(i2);
    }

    public void setItemHorizontalPaddingResource(@InterfaceC7829h int i2) {
        this.f24742p.lvui(getResources().getDimensionPixelSize(i2));
    }

    public void setItemIconPadding(@cdj int i2) {
        this.f24742p.m14576r(i2);
    }

    public void setItemIconPaddingResource(int i2) {
        this.f24742p.m14576r(getResources().getDimensionPixelSize(i2));
    }

    public void setItemIconSize(@cdj int i2) {
        this.f24742p.dd(i2);
    }

    public void setItemIconTintList(@dd ColorStateList colorStateList) {
        this.f24742p.x9kr(colorStateList);
    }

    public void setItemMaxLines(int i2) {
        this.f24742p.ncyb(i2);
    }

    public void setItemTextAppearance(@hb int i2) {
        this.f24742p.m14575l(i2);
    }

    public void setItemTextColor(@dd ColorStateList colorStateList) {
        this.f24742p.n5r1(colorStateList);
    }

    public void setItemVerticalPadding(@InterfaceC7833l int i2) {
        this.f24742p.hyr(i2);
    }

    public void setItemVerticalPaddingResource(@InterfaceC7829h int i2) {
        this.f24742p.hyr(getResources().getDimensionPixelSize(i2));
    }

    public void setNavigationItemSelectedListener(@dd zy zyVar) {
        this.f24737h = zyVar;
    }

    @Override // android.view.View
    public void setOverScrollMode(int i2) {
        super.setOverScrollMode(i2);
        C4051p c4051p = this.f24742p;
        if (c4051p != null) {
            c4051p.m14572f(i2);
        }
    }

    public void setSubheaderInsetEnd(@InterfaceC7833l int i2) {
        this.f24742p.uv6(i2);
    }

    public void setSubheaderInsetStart(@InterfaceC7833l int i2) {
        this.f24742p.uv6(i2);
    }

    public void setTopInsetScrimEnabled(boolean z2) {
        this.f24740l = z2;
    }

    public boolean x2() {
        return this.f24736f;
    }

    /* JADX INFO: renamed from: y */
    public View m14672y(int i2) {
        return this.f24742p.t8r(i2);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.navigation.NavigationView.SavedState.1
            @Override // android.os.Parcelable.Creator
            @dd
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(@lvui Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            @lvui
            /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(@lvui Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @lvui
            /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        };

        /* JADX INFO: renamed from: q */
        @dd
        public Bundle f24747q;

        public SavedState(@lvui Parcel parcel, @dd ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f24747q = parcel.readBundle(classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@lvui Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeBundle(this.f24747q);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public NavigationView(@lvui Context context, @dd AttributeSet attributeSet) {
        this(context, attributeSet, C6095k.zy.kaf);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NavigationView(@lvui Context context, @dd AttributeSet attributeSet, int i2) {
        ColorStateList colorStateListM14668n;
        int i3 = f24730a;
        super(C6070k.zy(context, attributeSet, i2, i3), attributeSet, i2);
        C4051p c4051p = new C4051p();
        this.f24742p = c4051p;
        this.f24746z = new int[2];
        this.f24740l = true;
        this.f24736f = true;
        this.f24734c = 0;
        this.f24735e = 0;
        this.f24741o = new RectF();
        Context context2 = getContext();
        C4054s c4054s = new C4054s(context2);
        this.f24744s = c4054s;
        C0184b c0184bLd6 = com.google.android.material.internal.cdj.ld6(context2, attributeSet, C6095k.kja0.tvyk, i2, i3, new int[0]);
        int i4 = C6095k.kja0.aj;
        if (c0184bLd6.mcp(i4)) {
            C0683f.wlev(this, c0184bLd6.m553y(i4));
        }
        this.f24735e = c0184bLd6.f7l8(C6095k.kja0.hn4z, 0);
        this.f24734c = c0184bLd6.kja0(C6095k.kja0.ce2, 0);
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            kja0 kja0VarQrj = kja0.m14820n(context2, attributeSet, i2, i3).qrj();
            Drawable background = getBackground();
            C4108p c4108p = new C4108p(kja0VarQrj);
            if (background instanceof ColorDrawable) {
                c4108p.m14867x(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
            }
            c4108p.m14856e(context2);
            C0683f.wlev(this, c4108p);
        }
        if (c0184bLd6.mcp(C6095k.kja0.srp)) {
            setElevation(c0184bLd6.f7l8(r2, 0));
        }
        setFitsSystemWindows(c0184bLd6.m547k(C6095k.kja0.o9ja, false));
        this.f24738i = c0184bLd6.f7l8(C6095k.kja0.tgr, 0);
        int i5 = C6095k.kja0.nvs3;
        ColorStateList colorStateListM550q = c0184bLd6.mcp(i5) ? c0184bLd6.m550q(i5) : null;
        int i6 = C6095k.kja0.dew6;
        int iFn3e = c0184bLd6.mcp(i6) ? c0184bLd6.fn3e(i6, 0) : 0;
        if (iFn3e == 0 && colorStateListM550q == null) {
            colorStateListM550q = m14668n(R.attr.textColorSecondary);
        }
        int i7 = C6095k.kja0.f5;
        if (c0184bLd6.mcp(i7)) {
            colorStateListM14668n = c0184bLd6.m550q(i7);
        } else {
            colorStateListM14668n = m14668n(R.attr.textColorSecondary);
        }
        int i8 = C6095k.kja0.kxwi;
        int iFn3e2 = c0184bLd6.mcp(i8) ? c0184bLd6.fn3e(i8, 0) : 0;
        int i9 = C6095k.kja0.ucas;
        if (c0184bLd6.mcp(i9)) {
            setItemIconSize(c0184bLd6.f7l8(i9, 0));
        }
        int i10 = C6095k.kja0.m5pq;
        ColorStateList colorStateListM550q2 = c0184bLd6.mcp(i10) ? c0184bLd6.m550q(i10) : null;
        if (iFn3e2 == 0 && colorStateListM550q2 == null) {
            colorStateListM550q2 = m14668n(R.attr.textColorPrimary);
        }
        Drawable drawableM553y = c0184bLd6.m553y(C6095k.kja0.ul9p);
        if (drawableM553y == null && m14669s(c0184bLd6)) {
            drawableM553y = m14666g(c0184bLd6);
            ColorStateList qVar = com.google.android.material.resources.zy.toq(context2, c0184bLd6, C6095k.kja0.ve1q);
            if (qVar != null) {
                c4051p.d2ok(new RippleDrawable(com.google.android.material.ripple.toq.m14763q(qVar), null, f7l8(c0184bLd6, null)));
            }
        }
        int i11 = C6095k.kja0.j0;
        if (c0184bLd6.mcp(i11)) {
            setItemHorizontalPadding(c0184bLd6.f7l8(i11, 0));
        }
        int i12 = C6095k.kja0.f8i;
        if (c0184bLd6.mcp(i12)) {
            setItemVerticalPadding(c0184bLd6.f7l8(i12, 0));
        }
        setDividerInsetStart(c0184bLd6.f7l8(C6095k.kja0.vog, 0));
        setDividerInsetEnd(c0184bLd6.f7l8(C6095k.kja0.egc1, 0));
        setSubheaderInsetStart(c0184bLd6.f7l8(C6095k.kja0.dci, 0));
        setSubheaderInsetEnd(c0184bLd6.f7l8(C6095k.kja0.wp, 0));
        setTopInsetScrimEnabled(c0184bLd6.m547k(C6095k.kja0.ppa, this.f24740l));
        setBottomInsetScrimEnabled(c0184bLd6.m547k(C6095k.kja0.fwd, this.f24736f));
        int iF7l8 = c0184bLd6.f7l8(C6095k.kja0.x76, 0);
        setItemMaxLines(c0184bLd6.kja0(C6095k.kja0.jom, 1));
        c4054s.uv6(new C4069k());
        c4051p.oc(1);
        c4051p.x2(context2, c4054s);
        if (iFn3e != 0) {
            c4051p.vyq(iFn3e);
        }
        c4051p.m14570c(colorStateListM550q);
        c4051p.x9kr(colorStateListM14668n);
        c4051p.m14572f(getOverScrollMode());
        if (iFn3e2 != 0) {
            c4051p.m14575l(iFn3e2);
        }
        c4051p.n5r1(colorStateListM550q2);
        c4051p.eqxt(drawableM553y);
        c4051p.m14576r(iF7l8);
        c4054s.toq(c4051p);
        addView((View) c4051p.toq(this));
        int i13 = C6095k.kja0.arkx;
        if (c0184bLd6.mcp(i13)) {
            ld6(c0184bLd6.fn3e(i13, 0));
        }
        int i14 = C6095k.kja0.ooq6;
        if (c0184bLd6.mcp(i14)) {
            m14670p(c0184bLd6.fn3e(i14, 0));
        }
        c0184bLd6.d3();
        m14667h();
    }

    public void setCheckedItem(@lvui MenuItem menuItem) {
        MenuItem menuItemFindItem = this.f24744s.findItem(menuItem.getItemId());
        if (menuItemFindItem != null) {
            this.f24742p.jp0y((C0130p) menuItemFindItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }
}
