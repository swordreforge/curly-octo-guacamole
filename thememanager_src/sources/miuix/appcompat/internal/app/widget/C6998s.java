package miuix.appcompat.internal.app.widget;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.widget.SpinnerAdapter;
import androidx.appcompat.app.AbstractC0096k;
import androidx.fragment.app.ActivityC0891q;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.o1t;
import btvn.C1380k;
import gb.toq;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import miuix.animation.Folme;
import miuix.animation.IStateStyle;
import miuix.animation.base.AnimConfig;
import miuix.animation.controller.AnimState;
import miuix.animation.listener.TransitionListener;
import miuix.animation.listener.UpdateInfo;
import miuix.animation.property.ViewProperty;
import miuix.animation.utils.EaseManager;
import miuix.appcompat.app.AbstractC6946k;
import miuix.appcompat.app.InterfaceC6952n;
import miuix.appcompat.app.gvn7;
import miuix.appcompat.app.strategy.CommonActionBarStrategy;
import miuix.appcompat.internal.view.C7009g;
import miuix.appcompat.internal.view.C7010k;
import miuix.appcompat.internal.view.C7040n;
import miuix.appcompat.internal.view.C7041q;
import miuix.appcompat.internal.view.menu.action.ActionMenuView;
import miuix.appcompat.internal.view.menu.action.PhoneActionMenuView;
import miuix.appcompat.internal.view.menu.action.ResponsiveActionMenuView;
import miuix.appcompat.internal.view.toq;
import miuix.core.util.C7084p;
import miuix.core.util.C7085q;
import miuix.internal.util.C7164n;
import miuix.internal.util.C7172y;
import miuix.view.n7h;
import qh4d.InterfaceC7614k;
import xm.C7752g;
import xm.C7756y;
import zy.dd;

/* JADX INFO: renamed from: miuix.appcompat.internal.app.widget.s */
/* JADX INFO: compiled from: ActionBarImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public class C6998s extends AbstractC6946k {

    /* JADX INFO: renamed from: c8jq, reason: collision with root package name */
    private static final int f86928c8jq = -1;

    /* JADX INFO: renamed from: lv5, reason: collision with root package name */
    private static final int f86929lv5 = 1;

    /* JADX INFO: renamed from: nmn5, reason: collision with root package name */
    private static final int f86930nmn5 = 0;

    /* JADX INFO: renamed from: t8iq, reason: collision with root package name */
    private static final int f86931t8iq = -1;

    /* JADX INFO: renamed from: u */
    public static final boolean f39276u = true;

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    private SecondaryTabContainerView f86933a9;

    /* JADX INFO: renamed from: b */
    private Rect f39278b;

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private Context f86936cdj;

    /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
    private FragmentManager f86938d2ok;

    /* JADX INFO: renamed from: ek5k, reason: collision with root package name */
    private int f86941ek5k;

    /* JADX INFO: renamed from: f */
    private boolean f39281f;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private ActionBarView f86943fn3e;

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    private zurt f86944fti;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    private PhoneActionMenuView f86945fu4;

    /* JADX INFO: renamed from: h */
    ActionMode f39282h;

    /* JADX INFO: renamed from: hyr, reason: collision with root package name */
    private boolean f86948hyr;

    /* JADX INFO: renamed from: i */
    private ActionBarContainer f39283i;

    /* JADX INFO: renamed from: j */
    private IStateStyle f39284j;

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    private SecondaryTabContainerView f86950jk;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private Context f86952ki;

    /* JADX INFO: renamed from: l */
    private boolean f39285l;

    /* JADX INFO: renamed from: lrht, reason: collision with root package name */
    private boolean f86953lrht;

    /* JADX INFO: renamed from: m */
    private boolean f39286m;

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    private ScrollingTabContainerView f86955mcp;

    /* JADX INFO: renamed from: n5r1, reason: collision with root package name */
    private boolean f86956n5r1;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private ActionBarContainer f86958ni7;

    /* JADX INFO: renamed from: nn86, reason: collision with root package name */
    private IStateStyle f86959nn86;

    /* JADX INFO: renamed from: o */
    private int f39287o;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    private View.OnClickListener f86960o1t;

    /* JADX INFO: renamed from: oc, reason: collision with root package name */
    private y f86961oc;

    /* JADX INFO: renamed from: r */
    private boolean f39288r;

    /* JADX INFO: renamed from: t */
    private ScrollingTabContainerView f39289t;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private ActionBarOverlayLayout f86962t8r;

    /* JADX INFO: renamed from: uv6, reason: collision with root package name */
    private C7040n f86963uv6;

    /* JADX INFO: renamed from: vyq, reason: collision with root package name */
    private SearchActionModeView f86964vyq;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    private fn3e f86965wvg;

    /* JADX INFO: renamed from: x9kr, reason: collision with root package name */
    private int f86966x9kr;

    /* JADX INFO: renamed from: yz, reason: collision with root package name */
    private btvn.zy f86968yz;

    /* JADX INFO: renamed from: z */
    private View f39291z;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private ActionBarContextView f86970zurt;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private static AbstractC0096k.f7l8 f86927bo = new k();

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    private static final Integer f86932y2 = -1;

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    private final HashMap<View, Integer> f86951jp0y = new HashMap<>();

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    private final HashSet<InterfaceC7614k> f86946gvn7 = new HashSet<>();

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    private ArrayList<y> f86939d3 = new ArrayList<>();

    /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
    private boolean f86942eqxt = false;

    /* JADX INFO: renamed from: lvui, reason: collision with root package name */
    private int f86954lvui = -1;

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    private ArrayList<AbstractC0096k.q> f86940dd = new ArrayList<>();

    /* JADX INFO: renamed from: ncyb, reason: collision with root package name */
    private int f86957ncyb = 0;

    /* JADX INFO: renamed from: c */
    private boolean f39279c = true;

    /* JADX INFO: renamed from: e */
    private toq.InterfaceC7042k f39280e = new toq();

    /* JADX INFO: renamed from: hb, reason: collision with root package name */
    private boolean f86947hb = false;

    /* JADX INFO: renamed from: y9n, reason: collision with root package name */
    private int f86967y9n = -1;

    /* JADX INFO: renamed from: bf2, reason: collision with root package name */
    private int f86935bf2 = 0;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    private int f86949i1 = 0;

    /* JADX INFO: renamed from: a98o, reason: collision with root package name */
    private int f86934a98o = 0;

    /* JADX INFO: renamed from: a */
    private int f39277a = 0;

    /* JADX INFO: renamed from: zp, reason: collision with root package name */
    private int f86969zp = 0;

    /* JADX INFO: renamed from: x */
    private float f39290x = 0.0f;

    /* JADX INFO: renamed from: ch, reason: collision with root package name */
    private final TransitionListener f86937ch = new f7l8();

    /* JADX INFO: renamed from: miuix.appcompat.internal.app.widget.s$f7l8 */
    /* JADX INFO: compiled from: ActionBarImpl.java */
    class f7l8 extends TransitionListener {
        f7l8() {
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onBegin(Object obj) {
            super.onBegin(obj);
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onCancel(Object obj) {
            super.onCancel(obj);
            C6998s.this.f86947hb = false;
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onComplete(Object obj) {
            super.onComplete(obj);
            C6998s.this.f86947hb = false;
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onUpdate(Object obj, Collection<UpdateInfo> collection) {
            super.onUpdate(obj, collection);
            float translationY = (C6998s.this.f39290x - C6998s.this.f39283i.getTranslationY()) / C6998s.this.f39290x;
            C6998s.this.f86934a98o = (int) Math.max(0.0f, r4.f86969zp * translationY);
            C6998s.this.f86949i1 = (int) Math.max(0.0f, r4.f39277a * translationY);
            C6998s.this.f86962t8r.m25147j();
            C6998s.this.mete();
        }
    }

    /* JADX INFO: renamed from: miuix.appcompat.internal.app.widget.s$g */
    /* JADX INFO: compiled from: ActionBarImpl.java */
    class g implements View.OnClickListener {
        g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ActionMode actionMode = C6998s.this.f39282h;
            if (actionMode != null) {
                actionMode.finish();
            }
        }
    }

    /* JADX INFO: renamed from: miuix.appcompat.internal.app.widget.s$k */
    /* JADX INFO: compiled from: ActionBarImpl.java */
    class k implements AbstractC0096k.f7l8 {
        k() {
        }

        @Override // androidx.appcompat.app.AbstractC0096k.f7l8
        public void fn3e(AbstractC0096k.g gVar, o1t o1tVar) {
            y yVar = (y) gVar;
            if (yVar.f86975zy != null) {
                yVar.f86975zy.fn3e(gVar, o1tVar);
            }
            if (yVar.f86974toq != null) {
                yVar.f86974toq.fn3e(gVar, o1tVar);
            }
        }

        @Override // androidx.appcompat.app.AbstractC0096k.f7l8
        /* JADX INFO: renamed from: p */
        public void mo201p(AbstractC0096k.g gVar, o1t o1tVar) {
            y yVar = (y) gVar;
            if (yVar.f86975zy != null) {
                yVar.f86975zy.mo201p(gVar, o1tVar);
            }
            if (yVar.f86974toq != null) {
                yVar.f86974toq.mo201p(gVar, o1tVar);
            }
        }

        @Override // androidx.appcompat.app.AbstractC0096k.f7l8
        /* JADX INFO: renamed from: z */
        public void mo202z(AbstractC0096k.g gVar, o1t o1tVar) {
            y yVar = (y) gVar;
            if (yVar.f86975zy != null) {
                yVar.f86975zy.mo202z(gVar, o1tVar);
            }
            if (yVar.f86974toq != null) {
                yVar.f86974toq.mo202z(gVar, o1tVar);
            }
        }
    }

    /* JADX INFO: renamed from: miuix.appcompat.internal.app.widget.s$n */
    /* JADX INFO: compiled from: ActionBarImpl.java */
    class n implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: k */
        int f39294k = 0;

        n() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void toq() {
            C6998s c6998s = C6998s.this;
            c6998s.kq2f(c6998s.f86943fn3e, C6998s.this.f86970zurt);
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            int i10 = i4 - i2;
            if (this.f39294k != i10 || C6998s.this.f39285l) {
                C6998s.this.f39285l = false;
                this.f39294k = i10;
                C6998s.this.f86943fn3e.post(new Runnable() { // from class: miuix.appcompat.internal.app.widget.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f39273k.toq();
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: miuix.appcompat.internal.app.widget.s$q */
    /* JADX INFO: compiled from: ActionBarImpl.java */
    class q implements ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: k */
        int f39296k = 0;

        q() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            int measuredWidth = C6998s.this.f86962t8r.getMeasuredWidth();
            if (this.f39296k == measuredWidth && !C6998s.this.f39285l) {
                return true;
            }
            C6998s.this.f39285l = false;
            this.f39296k = measuredWidth;
            C6998s c6998s = C6998s.this;
            c6998s.kq2f(c6998s.f86943fn3e, C6998s.this.f86970zurt);
            C6998s.this.f86962t8r.getViewTreeObserver().removeOnPreDrawListener(this);
            return false;
        }
    }

    /* JADX INFO: renamed from: miuix.appcompat.internal.app.widget.s$s */
    /* JADX INFO: compiled from: ActionBarImpl.java */
    private static class s extends TransitionListener {

        /* JADX INFO: renamed from: k */
        private WeakReference<View> f39298k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private WeakReference<C6998s> f86971toq;

        public s(View view, C6998s c6998s) {
            this.f39298k = new WeakReference<>(view);
            this.f86971toq = new WeakReference<>(c6998s);
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onComplete(Object obj) {
            super.onComplete(obj);
            C6998s c6998s = this.f86971toq.get();
            View view = this.f39298k.get();
            if (view == null || c6998s == null || c6998s.f39279c) {
                return;
            }
            view.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: miuix.appcompat.internal.app.widget.s$toq */
    /* JADX INFO: compiled from: ActionBarImpl.java */
    class toq implements toq.InterfaceC7042k {
        toq() {
        }

        @Override // miuix.appcompat.internal.view.toq.InterfaceC7042k
        /* JADX INFO: renamed from: k */
        public void mo25228k(ActionMode actionMode) {
            C6998s.this.btvn(false);
            C6998s.this.f39282h = null;
        }
    }

    /* JADX INFO: renamed from: miuix.appcompat.internal.app.widget.s$y */
    /* JADX INFO: compiled from: ActionBarImpl.java */
    public class y extends AbstractC0096k.g {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private CharSequence f86972f7l8;

        /* JADX INFO: renamed from: g */
        private CharSequence f39300g;

        /* JADX INFO: renamed from: n */
        private Drawable f39301n;

        /* JADX INFO: renamed from: q */
        private Object f39303q;

        /* JADX INFO: renamed from: s */
        private View f39304s;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private AbstractC0096k.f7l8 f86974toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private AbstractC0096k.f7l8 f86975zy;

        /* JADX INFO: renamed from: y */
        private int f39305y = -1;

        /* JADX INFO: renamed from: p */
        public boolean f39302p = true;

        public y() {
        }

        @Override // androidx.appcompat.app.AbstractC0096k.g
        public AbstractC0096k.g cdj(CharSequence charSequence) {
            this.f39300g = charSequence;
            if (this.f39305y >= 0) {
                C6998s.this.f39289t.m25183h(this.f39305y);
                C6998s.this.f86955mcp.m25183h(this.f39305y);
                C6998s.this.f86950jk.mcp(this.f39305y);
                C6998s.this.f86950jk.mcp(this.f39305y);
            }
            return this;
        }

        @Override // androidx.appcompat.app.AbstractC0096k.g
        public void f7l8() {
            C6998s.this.ixz(this, false);
        }

        public AbstractC0096k.g fn3e(AbstractC0096k.f7l8 f7l8Var) {
            this.f86975zy = f7l8Var;
            return this;
        }

        @Override // androidx.appcompat.app.AbstractC0096k.g
        /* JADX INFO: renamed from: g */
        public CharSequence mo177g() {
            return this.f39300g;
        }

        @Override // androidx.appcompat.app.AbstractC0096k.g
        /* JADX INFO: renamed from: h */
        public AbstractC0096k.g mo178h(int i2) {
            return cdj(C6998s.this.f86936cdj.getResources().getText(i2));
        }

        /* JADX INFO: renamed from: i */
        public AbstractC0096k.f7l8 m25229i() {
            return C6998s.f86927bo;
        }

        @Override // androidx.appcompat.app.AbstractC0096k.g
        /* JADX INFO: renamed from: k */
        public CharSequence mo179k() {
            return this.f86972f7l8;
        }

        @Override // androidx.appcompat.app.AbstractC0096k.g
        public AbstractC0096k.g kja0(Object obj) {
            this.f39303q = obj;
            return this;
        }

        @Override // androidx.appcompat.app.AbstractC0096k.g
        public AbstractC0096k.g ld6(View view) {
            this.f39304s = view;
            if (!C6998s.this.f86943fn3e.zurt()) {
                C6998s.this.f86943fn3e.setExpandState(0);
                C6998s.this.dxef(false);
            }
            if (this.f39305y >= 0) {
                C6998s.this.f39289t.m25183h(this.f39305y);
            }
            return this;
        }

        @Override // androidx.appcompat.app.AbstractC0096k.g
        /* JADX INFO: renamed from: n */
        public Object mo180n() {
            return this.f39303q;
        }

        @Override // androidx.appcompat.app.AbstractC0096k.g
        public AbstractC0096k.g n7h(AbstractC0096k.f7l8 f7l8Var) {
            this.f86974toq = f7l8Var;
            return this;
        }

        @Override // androidx.appcompat.app.AbstractC0096k.g
        /* JADX INFO: renamed from: p */
        public AbstractC0096k.g mo181p(int i2) {
            return ld6(LayoutInflater.from(C6998s.this.wvg()).inflate(i2, (ViewGroup) null));
        }

        @Override // androidx.appcompat.app.AbstractC0096k.g
        /* JADX INFO: renamed from: q */
        public int mo182q() {
            return this.f39305y;
        }

        @Override // androidx.appcompat.app.AbstractC0096k.g
        public AbstractC0096k.g qrj(Drawable drawable) {
            this.f39301n = drawable;
            if (this.f39305y >= 0) {
                C6998s.this.f39289t.m25183h(this.f39305y);
                C6998s.this.f86955mcp.m25183h(this.f39305y);
                C6998s.this.f86950jk.mcp(this.f39305y);
                C6998s.this.f86933a9.mcp(this.f39305y);
            }
            return this;
        }

        @Override // androidx.appcompat.app.AbstractC0096k.g
        /* JADX INFO: renamed from: s */
        public AbstractC0096k.g mo183s(CharSequence charSequence) {
            this.f86972f7l8 = charSequence;
            if (this.f39305y >= 0) {
                C6998s.this.f39289t.m25183h(this.f39305y);
                C6998s.this.f86955mcp.m25183h(this.f39305y);
                C6998s.this.f86950jk.mcp(this.f39305y);
                C6998s.this.f86933a9.mcp(this.f39305y);
            }
            return this;
        }

        @Override // androidx.appcompat.app.AbstractC0096k.g
        public View toq() {
            return this.f39304s;
        }

        @Override // androidx.appcompat.app.AbstractC0096k.g
        public AbstractC0096k.g x2(int i2) {
            return qrj(C6998s.this.f86936cdj.getResources().getDrawable(i2));
        }

        @Override // androidx.appcompat.app.AbstractC0096k.g
        /* JADX INFO: renamed from: y */
        public AbstractC0096k.g mo184y(int i2) {
            return mo183s(C6998s.this.f86936cdj.getResources().getText(i2));
        }

        public void zurt(int i2) {
            this.f39305y = i2;
        }

        @Override // androidx.appcompat.app.AbstractC0096k.g
        public Drawable zy() {
            return this.f39301n;
        }
    }

    /* JADX INFO: renamed from: miuix.appcompat.internal.app.widget.s$zy */
    /* JADX INFO: compiled from: ActionBarImpl.java */
    class zy implements View.OnClickListener {
        zy() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (C6998s.this.f86945fu4 == null || !C6998s.this.f86945fu4.jp0y()) {
                return;
            }
            C6998s.this.f86945fu4.getPresenter().hb(true);
        }
    }

    public C6998s(miuix.appcompat.app.t8r t8rVar, ViewGroup viewGroup) {
        this.f86936cdj = t8rVar;
        this.f86938d2ok = t8rVar.getSupportFragmentManager();
        d1ts(viewGroup);
        this.f86943fn3e.setWindowTitle(t8rVar.getTitle());
    }

    private IStateStyle b2(boolean z2, String str, AnimState animState) {
        int iNyj = nyj();
        if (z2) {
            AnimConfig animConfig = new AnimConfig();
            animConfig.setEase(EaseManager.getStyle(-2, 0.9f, 0.25f));
            AnimState animStateAdd = new AnimState(str).add(ViewProperty.TRANSLATION_Y, 0.0d).add(ViewProperty.ALPHA, 1.0d);
            IStateStyle iStateStyleState = Folme.useAt(this.f86958ni7).state();
            if (animState != null) {
                animState.setTag(str);
                iStateStyleState = iStateStyleState.setTo(animState);
            }
            return iStateStyleState.to(animStateAdd, animConfig);
        }
        AnimConfig animConfig2 = new AnimConfig();
        animConfig2.setEase(EaseManager.getStyle(-2, 1.0f, 0.35f));
        animConfig2.addListeners(new s(this.f86958ni7, this));
        AnimState animStateAdd2 = new AnimState(str).add(ViewProperty.TRANSLATION_Y, iNyj + 100).add(ViewProperty.ALPHA, 0.0d);
        IStateStyle iStateStyleState2 = Folme.useAt(this.f86958ni7).state();
        if (animState != null) {
            animState.setTag(str);
            iStateStyleState2 = iStateStyleState2.setTo(animState);
        }
        return iStateStyleState2.to(animStateAdd2, animConfig2);
    }

    private btvn.toq c25(ActionBarContainer actionBarContainer, ActionBarView actionBarView) {
        btvn.toq toqVar = new btvn.toq();
        toqVar.f7296k = this.f86962t8r.getDeviceType();
        toqVar.f54032toq = C7085q.m25607s(this.f86936cdj).f87379f7l8;
        if (actionBarContainer != null && actionBarView != null) {
            float f2 = actionBarView.getContext().getResources().getDisplayMetrics().density;
            Point pointN7h = C7085q.n7h(actionBarView.getContext());
            int i2 = pointN7h.x;
            toqVar.f54034zy = i2;
            toqVar.f7297n = pointN7h.y;
            toqVar.f7299q = miuix.core.util.ld6.m25577i(f2, i2);
            toqVar.f7295g = miuix.core.util.ld6.m25577i(f2, toqVar.f7297n);
            int measuredWidth = actionBarContainer.getMeasuredWidth();
            toqVar.f54027f7l8 = measuredWidth;
            if (measuredWidth == 0) {
                toqVar.f54027f7l8 = this.f86962t8r.getMeasuredWidth();
            }
            toqVar.f7300s = miuix.core.util.ld6.m25577i(f2, toqVar.f54027f7l8);
            int measuredHeight = actionBarView.getMeasuredHeight();
            toqVar.f7301y = measuredHeight;
            toqVar.f7298p = miuix.core.util.ld6.m25577i(f2, measuredHeight);
            toqVar.f54029ld6 = actionBarView.zurt();
            toqVar.f54033x2 = actionBarView.getExpandState();
            toqVar.f54031qrj = actionBarView.fn3e();
            toqVar.f54030n7h = actionBarView.pc();
            toqVar.f54028kja0 = actionBarView.getEndActionMenuItemLimit();
        }
        return toqVar;
    }

    private void cn02(AbstractC0096k.g gVar, int i2) {
        y yVar = (y) gVar;
        if (yVar.m25229i() == null) {
            throw new IllegalStateException("Action Bar Tab must have a Callback");
        }
        yVar.zurt(i2);
        this.f86939d3.add(i2, yVar);
        int size = this.f86939d3.size();
        while (true) {
            i2++;
            if (i2 >= size) {
                return;
            } else {
                this.f86939d3.get(i2).zurt(i2);
            }
        }
    }

    private ActionMode exv8(ActionMode.Callback callback) {
        return callback instanceof n7h.toq ? new C7009g(this.f86936cdj, callback) : new C7041q(this.f86936cdj, callback);
    }

    private void gb() {
        ViewStub viewStub = (ViewStub) this.f86962t8r.findViewById(toq.C6054p.f76379n2t);
        this.f86962t8r.setContentMask(viewStub != null ? viewStub.inflate() : this.f86962t8r.findViewById(toq.C6054p.f76389nsb));
    }

    private void hyow(boolean z2, boolean z3) {
        ViewStub viewStub = (ViewStub) this.f86962t8r.findViewById(toq.C6054p.fupf);
        ActionBarContainer actionBarContainer = viewStub != null ? (ActionBarContainer) viewStub.inflate() : (ActionBarContainer) this.f86962t8r.findViewById(toq.C6054p.cyg);
        if (actionBarContainer != null) {
            this.f86943fn3e.setSplitView(actionBarContainer);
            this.f86943fn3e.setSplitActionBar(z2);
            this.f86943fn3e.setSplitWhenNarrow(z3);
            ViewStub viewStub2 = (ViewStub) this.f86962t8r.findViewById(toq.C6054p.f34888b);
            if (viewStub2 != null) {
                this.f86970zurt = (ActionBarContextView) viewStub2.inflate();
            } else {
                this.f86970zurt = (ActionBarContextView) this.f86962t8r.findViewById(toq.C6054p.f76455y9n);
            }
            ActionBarContextView actionBarContextView = this.f86970zurt;
            if (actionBarContextView != null) {
                this.f39283i.setActionBarContextView(actionBarContextView);
                this.f86962t8r.setActionBarContextView(this.f86970zurt);
                this.f86970zurt.setSplitView(actionBarContainer);
                this.f86970zurt.setSplitActionBar(z2);
                this.f86970zurt.setSplitWhenNarrow(z3);
            }
        }
    }

    private Integer i3x9(View view) {
        Integer num = this.f86951jp0y.get(view);
        return Integer.valueOf(Objects.equals(num, f86932y2) ? 0 : num.intValue());
    }

    private void k4jz(boolean z2) {
        vg(z2, true, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void kl7m(int i2, float f2, int i3, int i4) {
        this.f39277a = i3;
        this.f86969zp = i4;
        float height = (this.f39283i.getHeight() + this.f39283i.getTranslationY()) / this.f39283i.getHeight();
        float f3 = this.f39290x;
        if (f3 != 0.0f) {
            height = (f3 - this.f39283i.getTranslationY()) / this.f39290x;
        }
        if (this.f39283i.getHeight() == 0) {
            height = 1.0f;
        }
        this.f86949i1 = (int) (this.f39277a * height);
        this.f86934a98o = (int) (this.f86969zp * height);
    }

    private void kq(boolean z2) {
        this.f39283i.setTabContainer(null);
        this.f86943fn3e.setEmbeddedTabView(this.f39289t, this.f86955mcp, this.f86950jk, this.f86933a9);
        boolean z3 = fn3e() == 2;
        ScrollingTabContainerView scrollingTabContainerView = this.f39289t;
        if (scrollingTabContainerView != null) {
            if (z3) {
                scrollingTabContainerView.setVisibility(0);
            } else {
                scrollingTabContainerView.setVisibility(8);
            }
            this.f39289t.setEmbeded(true);
        }
        ScrollingTabContainerView scrollingTabContainerView2 = this.f86955mcp;
        if (scrollingTabContainerView2 != null) {
            if (z3) {
                scrollingTabContainerView2.setVisibility(0);
            } else {
                scrollingTabContainerView2.setVisibility(8);
            }
            this.f86955mcp.setEmbeded(true);
        }
        SecondaryTabContainerView secondaryTabContainerView = this.f86950jk;
        if (secondaryTabContainerView != null) {
            if (z3) {
                secondaryTabContainerView.setVisibility(0);
            } else {
                secondaryTabContainerView.setVisibility(8);
            }
        }
        SecondaryTabContainerView secondaryTabContainerView2 = this.f86933a9;
        if (secondaryTabContainerView2 != null) {
            if (z3) {
                secondaryTabContainerView2.setVisibility(0);
            } else {
                secondaryTabContainerView2.setVisibility(8);
            }
        }
        this.f86943fn3e.setCollapsable(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kq2f(ActionBarView actionBarView, ActionBarContextView actionBarContextView) {
        if (this.f86968yz == null) {
            return;
        }
        int iEtdu = etdu();
        C1380k c1380kConfig = this.f86968yz.config(this, c25(this.f39283i, this.f86943fn3e));
        if (actionBarView != null && c1380kConfig != null) {
            if (!actionBarView.zurt() || c1380kConfig.f7292k) {
                if (!actionBarView.fn3e() || !c1380kConfig.f54026zy) {
                    actionBarView.setExpandState(c1380kConfig.f54025toq, false, true);
                }
                actionBarView.setResizable(c1380kConfig.f54026zy);
            }
            if (!actionBarView.pc() || c1380kConfig.f7294q) {
                actionBarView.setEndActionMenuItemLimit(c1380kConfig.f7293n);
            }
        }
        if (actionBarContextView != null && c1380kConfig != null && (!actionBarContextView.zurt() || c1380kConfig.f7292k)) {
            if (!actionBarContextView.fn3e() || !c1380kConfig.f54026zy) {
                actionBarContextView.setExpandState(c1380kConfig.f54025toq, false, true);
            }
            actionBarContextView.setResizable(c1380kConfig.f54026zy);
        }
        this.f39287o = etdu();
        this.f39286m = jz5();
        int i2 = this.f39287o;
        if (i2 != 1 || iEtdu == i2 || this.f39278b == null) {
            return;
        }
        Iterator<View> it = this.f86951jp0y.keySet().iterator();
        while (it.hasNext()) {
            this.f86951jp0y.put(it.next(), Integer.valueOf(this.f39278b.top));
        }
        Iterator<InterfaceC7614k> it2 = this.f86946gvn7.iterator();
        while (it2.hasNext()) {
            it2.next().onContentInsetChanged(this.f39278b);
        }
        ActionBarContainer actionBarContainer = this.f39283i;
        if (actionBarContainer != null) {
            actionBarContainer.setActionBarBlurByNestedScrolled(false);
        }
    }

    private void le7() {
        this.f86964vyq.measure(ViewGroup.getChildMeasureSpec(this.f86962t8r.getMeasuredWidth(), 0, this.f86964vyq.getLayoutParams().width), ViewGroup.getChildMeasureSpec(this.f86962t8r.getMeasuredHeight(), 0, this.f86964vyq.getLayoutParams().height));
    }

    private void lk(View view, int i2) {
        int top = view.getTop();
        int i3 = this.f86949i1;
        if (top != i3 + i2) {
            view.offsetTopAndBottom((Math.max(0, i3) + i2) - top);
        }
    }

    private void mi1u(boolean z2) {
        vwb(z2, true, null);
    }

    private void mj() {
        if (this.f86961oc != null) {
            n5r1(null);
        }
        this.f86939d3.clear();
        ScrollingTabContainerView scrollingTabContainerView = this.f39289t;
        if (scrollingTabContainerView != null) {
            scrollingTabContainerView.x2();
        }
        ScrollingTabContainerView scrollingTabContainerView2 = this.f86955mcp;
        if (scrollingTabContainerView2 != null) {
            scrollingTabContainerView2.x2();
        }
        SecondaryTabContainerView secondaryTabContainerView = this.f86950jk;
        if (secondaryTabContainerView != null) {
            secondaryTabContainerView.o1t();
        }
        SecondaryTabContainerView secondaryTabContainerView2 = this.f86933a9;
        if (secondaryTabContainerView2 != null) {
            secondaryTabContainerView2.o1t();
        }
        this.f86954lvui = -1;
    }

    private int nyj() {
        View childAt;
        int height = this.f86958ni7.getHeight();
        if (this.f86958ni7.getChildCount() != 1 || (childAt = this.f86958ni7.getChildAt(0)) == null) {
            return height;
        }
        if (childAt instanceof ResponsiveActionMenuView) {
            return height;
        }
        if (!(childAt instanceof PhoneActionMenuView)) {
            return height;
        }
        PhoneActionMenuView phoneActionMenuView = (PhoneActionMenuView) childAt;
        return !phoneActionMenuView.jp0y() ? phoneActionMenuView.getCollapsedHeight() : height;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void oph() {
        kq2f(this.f86943fn3e, this.f86970zurt);
    }

    private void pnt2(boolean z2) {
        xtb7(z2, true, null);
    }

    private void sb1e(boolean z2) {
        if (this.f86958ni7.getChildCount() == 2 && (this.f86958ni7.getChildAt(1) instanceof PhoneActionMenuView)) {
            PhoneActionMenuView phoneActionMenuView = (PhoneActionMenuView) this.f86958ni7.getChildAt(1);
            this.f86945fu4 = phoneActionMenuView;
            if (!phoneActionMenuView.jp0y() || this.f39291z == null) {
                return;
            }
            if (z2) {
                this.f86962t8r.wvg(this.f86960o1t).toq().start();
            } else {
                this.f86962t8r.wvg(null).m25153k().start();
            }
        }
    }

    private int tjz5() {
        return ((mo159h() & 32768) != 0 ? 32768 : 0) | ((mo159h() & 16384) != 0 ? 16384 : 0);
    }

    private void vg(boolean z2, boolean z3, AnimState animState) {
        if (xm(this.f86956n5r1, this.f86948hyr, this.f39281f)) {
            if (this.f39279c) {
                return;
            }
            this.f39279c = true;
            vwb(z2, z3, animState);
            return;
        }
        if (this.f39279c) {
            this.f39279c = false;
            xtb7(z2, z3, animState);
        }
    }

    private void vwb(boolean z2, boolean z3, AnimState animState) {
        AnimState currentState;
        IStateStyle iStateStyle = this.f86959nn86;
        if (iStateStyle == null || !this.f86947hb) {
            currentState = null;
        } else {
            currentState = iStateStyle.getCurrentState();
            this.f86959nn86.cancel();
        }
        boolean z5 = (b7() || z2) && z3;
        if (this.f39282h instanceof miuix.view.n7h) {
            this.f39283i.setVisibility(this.f86962t8r.d2ok() ? 4 : 8);
        } else {
            this.f39283i.setVisibility(0);
        }
        if (z5) {
            this.f86959nn86 = z5(true, "ShowActionBar", currentState, animState);
        } else {
            this.f39283i.setTranslationY(0.0f);
            this.f39283i.setAlpha(1.0f);
        }
    }

    private static boolean xm(boolean z2, boolean z3, boolean z5) {
        if (z5) {
            return true;
        }
        return (z2 || z3) ? false : true;
    }

    private void xtb7(boolean z2, boolean z3, AnimState animState) {
        AnimState currentState;
        IStateStyle iStateStyle = this.f86959nn86;
        if (iStateStyle == null || !this.f86947hb) {
            currentState = null;
        } else {
            currentState = iStateStyle.getCurrentState();
            this.f86959nn86.cancel();
        }
        if ((b7() || z2) && z3) {
            this.f86959nn86 = z5(false, "HideActionBar", currentState, animState);
            return;
        }
        this.f39283i.setTranslationY(-r4.getHeight());
        this.f39283i.setAlpha(0.0f);
        this.f86934a98o = 0;
        this.f86949i1 = 0;
        this.f39283i.setVisibility(8);
    }

    public static C6998s xzl(View view) {
        while (view != null) {
            if (view instanceof ActionBarOverlayLayout) {
                return (C6998s) ((ActionBarOverlayLayout) view).getActionBar();
            }
            view = view.getParent() instanceof View ? (View) view.getParent() : null;
        }
        return null;
    }

    private IStateStyle z5(boolean z2, String str, AnimState animState, AnimState animState2) {
        AnimState animStateAdd;
        AnimState animStateAdd2;
        int height = this.f39283i.getHeight();
        if (height == 0) {
            int childMeasureSpec = ViewGroup.getChildMeasureSpec(this.f86962t8r.getMeasuredWidth(), 0, this.f86962t8r.getLayoutParams().width);
            int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f86962t8r.getMeasuredHeight(), 0, this.f86962t8r.getLayoutParams().height);
            this.f39283i.measure(childMeasureSpec, childMeasureSpec2);
            kq2f(this.f86943fn3e, this.f86970zurt);
            this.f39283i.measure(childMeasureSpec, childMeasureSpec2);
            height = this.f39283i.getMeasuredHeight();
        }
        int i2 = -height;
        this.f39290x = i2;
        AnimConfig animConfig = new AnimConfig();
        animConfig.addListeners(this.f86937ch);
        if (z2) {
            animConfig.setEase(EaseManager.getStyle(-2, 0.9f, 0.25f));
            animStateAdd = animState2 == null ? new AnimState(str).add(ViewProperty.TRANSLATION_Y, 0.0d).add(ViewProperty.ALPHA, 1.0d) : animState2;
            animStateAdd2 = (animState == null && animState2 == null) ? new AnimState(str).add(ViewProperty.TRANSLATION_Y, i2).add(ViewProperty.ALPHA, 0.0d) : animState;
        } else {
            animConfig.setEase(EaseManager.getStyle(-2, 1.0f, 0.35f));
            animConfig.addListeners(new s(this.f39283i, this));
            AnimState animStateAdd3 = animState2 == null ? new AnimState(str).add(ViewProperty.TRANSLATION_Y, i2).add(ViewProperty.ALPHA, 0.0d) : animState2;
            if (animState == null && animState2 == null) {
                animStateAdd = animStateAdd3;
                animStateAdd2 = new AnimState(str).add(ViewProperty.TRANSLATION_Y, 0.0d).add(ViewProperty.ALPHA, 1.0d);
            } else {
                animStateAdd = animStateAdd3;
            }
        }
        IStateStyle iStateStyleState = Folme.useAt(this.f39283i).state();
        if (animStateAdd2 != null) {
            animStateAdd2.setTag(str);
            iStateStyleState = iStateStyleState.setTo(animStateAdd2);
        }
        iStateStyleState.to(animStateAdd, animConfig);
        this.f86947hb = true;
        return iStateStyleState;
    }

    private void z617() {
        if (this.f39289t != null) {
            this.f86943fn3e.d8wk();
            return;
        }
        CollapseTabContainer collapseTabContainer = new CollapseTabContainer(this.f86936cdj);
        ExpandTabContainer expandTabContainer = new ExpandTabContainer(this.f86936cdj);
        SecondaryCollapseTabContainer secondaryCollapseTabContainer = new SecondaryCollapseTabContainer(this.f86936cdj);
        SecondaryExpandTabContainer secondaryExpandTabContainer = new SecondaryExpandTabContainer(this.f86936cdj);
        collapseTabContainer.setVisibility(0);
        expandTabContainer.setVisibility(0);
        secondaryCollapseTabContainer.setVisibility(0);
        secondaryExpandTabContainer.setVisibility(0);
        this.f86943fn3e.setEmbeddedTabView(collapseTabContainer, expandTabContainer, secondaryCollapseTabContainer, secondaryExpandTabContainer);
        collapseTabContainer.setEmbeded(true);
        this.f39289t = collapseTabContainer;
        this.f86955mcp = expandTabContainer;
        this.f86950jk = secondaryCollapseTabContainer;
        this.f86933a9 = secondaryExpandTabContainer;
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    /* JADX INFO: renamed from: a */
    public void mo152a(boolean z2) {
        this.f86943fn3e.setHomeButtonEnabled(z2);
    }

    @Override // miuix.appcompat.app.AbstractC6946k
    public void a5id(int i2, int i3, int i4) {
        this.f86950jk.setTextAppearance(i2, i3, i4);
        this.f86933a9.setTextAppearance(i2, i3, i4);
    }

    ActionBarOverlayLayout ab() {
        return this.f86962t8r;
    }

    public void anhx(Boolean bool) {
        ActionBarContainer actionBarContainer;
        if ((mo159h() & 16384) == 0 || (actionBarContainer = this.f86958ni7) == null) {
            return;
        }
        actionBarContainer.setSplitActionBarBlur(bool);
    }

    @Override // miuix.appcompat.app.AbstractC6946k
    public void b3e(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = this.f86962t8r;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.hyr(view);
        }
    }

    boolean b7() {
        return this.f86953lrht;
    }

    @Override // miuix.appcompat.app.AbstractC6946k
    public void b8(boolean z2) {
        kq(z2);
    }

    @Override // miuix.appcompat.app.AbstractC6946k
    public void b9ub(int i2, int i3) {
        this.f39289t.setTextAppearance(i2, i3);
    }

    @Override // miuix.appcompat.app.AbstractC6946k
    public void bap7(ActivityC0891q activityC0891q, boolean z2) {
        if (uj2j()) {
            return;
        }
        mo169r();
        t8iq(2);
        this.f86965wvg = new fn3e(this, this.f86938d2ok, activityC0891q.getLifecycle(), z2);
        gbni(this.f39289t);
        gbni(this.f86955mcp);
        gbni(this.f86950jk);
        gbni(this.f86933a9);
        ActionBarContainer actionBarContainer = this.f86958ni7;
        if (actionBarContainer != null) {
            gbni(actionBarContainer);
        }
    }

    @Override // miuix.appcompat.app.AbstractC6946k
    public void bek6(InterfaceC6952n interfaceC6952n) {
        this.f39283i.eqxt(interfaceC6952n);
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    @SuppressLint({"RestrictedApi"})
    public void bo(boolean z2) {
        this.f86953lrht = z2;
        if (z2) {
            return;
        }
        if (fti()) {
            mi1u(false);
        } else {
            pnt2(false);
        }
    }

    void btvn(boolean z2) {
        if (z2) {
            j3y2();
        } else {
            kt06();
        }
        this.f86944fti.mo25127y(z2);
        if (this.f39289t == null || this.f86943fn3e.ukdy() || !this.f86943fn3e.mbx()) {
            return;
        }
        this.f39289t.setEnabled(!z2);
        this.f86955mcp.setEnabled(!z2);
        this.f86950jk.setEnabled(!z2);
        this.f86933a9.setEnabled(!z2);
    }

    @Override // miuix.appcompat.app.AbstractC6946k
    public View bwp(int i2) {
        return this.f86943fn3e.cdj(i2);
    }

    @Override // miuix.appcompat.app.AbstractC6946k
    public void bz2(boolean z2, AnimState animState) {
        if (this.f86956n5r1) {
            return;
        }
        this.f86956n5r1 = true;
        vg(false, z2, animState);
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    /* JADX INFO: renamed from: c */
    public void mo154c(View view) {
        this.f86943fn3e.setCustomNavigationView(view);
    }

    @Override // miuix.appcompat.app.AbstractC6946k
    public int cfr() {
        return this.f39283i.getExpandedHeight();
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public void ch(SpinnerAdapter spinnerAdapter, AbstractC0096k.n nVar) {
        this.f86943fn3e.setDropdownAdapter(spinnerAdapter);
        this.f86943fn3e.setCallback(nVar);
    }

    @Override // miuix.appcompat.app.AbstractC6946k
    public void cnbm(int i2, int i3, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        this.f39289t.setTabIconWithPosition(i2, i3, drawable, drawable2, drawable3, drawable4);
        this.f86955mcp.setTabIconWithPosition(i2, i3, drawable, drawable2, drawable3, drawable4);
        this.f86950jk.setTabIconWithPosition(i2, i3, drawable, drawable2, drawable3, drawable4);
        this.f86933a9.setTabIconWithPosition(i2, i3, drawable, drawable2, drawable3, drawable4);
    }

    @Override // miuix.appcompat.app.AbstractC6946k
    public void cv06() {
        this.f86965wvg.ld6();
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    /* JADX INFO: renamed from: d */
    public void mo155d() {
        kx3(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void d1ts(@dd ViewGroup viewGroup) {
        int iLd6;
        C7040n c7040n;
        if (viewGroup == null) {
            return;
        }
        TypedValue typedValueX2 = C7164n.x2(this.f86936cdj, toq.C6055q.f34917e);
        if (typedValueX2 != null) {
            try {
                this.f86968yz = (btvn.zy) Class.forName(typedValueX2.string.toString()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Exception unused) {
            }
        }
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) viewGroup;
        this.f86962t8r = actionBarOverlayLayout;
        actionBarOverlayLayout.setActionBar(this);
        ActionBarView actionBarView = (ActionBarView) viewGroup.findViewById(toq.C6054p.f76448x9kr);
        this.f86943fn3e = actionBarView;
        if (actionBarView != null && (c7040n = this.f86963uv6) != null) {
            actionBarView.setExtraPaddingPolicy(c7040n);
        }
        this.f86970zurt = (ActionBarContextView) viewGroup.findViewById(toq.C6054p.f76455y9n);
        this.f39283i = (ActionBarContainer) viewGroup.findViewById(toq.C6054p.f76334hyr);
        this.f86958ni7 = (ActionBarContainer) viewGroup.findViewById(toq.C6054p.cyg);
        View viewFindViewById = viewGroup.findViewById(toq.C6054p.f76389nsb);
        this.f39291z = viewFindViewById;
        if (viewFindViewById != null) {
            this.f86960o1t = new zy();
        }
        ActionBarView actionBarView2 = this.f86943fn3e;
        if (actionBarView2 == null && this.f86970zurt == null && this.f39283i == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f86966x9kr = actionBarView2.m28299do() ? 1 : 0;
        Object[] objArr = (this.f86943fn3e.getDisplayOptions() & 4) != 0;
        if (objArr != false) {
            this.f39288r = true;
        }
        C7010k qVar = C7010k.toq(this.f86936cdj);
        mo152a(qVar.m25257k() || objArr == true);
        kq(qVar.f7l8());
        boolean z2 = C7084p.m25593g() && !C7172y.m25998k();
        ActionBarContainer actionBarContainer = this.f39283i;
        if (actionBarContainer != null) {
            actionBarContainer.setSupportBlur(z2);
        }
        ActionBarContainer actionBarContainer2 = this.f86958ni7;
        if (actionBarContainer2 != null) {
            actionBarContainer2.setSupportBlur(z2);
        }
        if (z2 && (iLd6 = C7164n.ld6(this.f86936cdj, toq.C6055q.f76513ew, 0)) != 0) {
            int iMo159h = mo159h();
            if ((iLd6 & 1) != 0) {
                iMo159h |= 32768;
            }
            if ((iLd6 & 2) != 0) {
                iMo159h |= 16384;
            }
            mo156e(iMo159h);
        }
        if (this.f86968yz == null) {
            this.f86968yz = new CommonActionBarStrategy();
        }
        this.f86962t8r.getViewTreeObserver().addOnPreDrawListener(new q());
        this.f86962t8r.addOnLayoutChangeListener(new n());
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public void d3(Configuration configuration) {
        this.f39285l = true;
        kq(C7010k.toq(this.f86936cdj).f7l8());
        SearchActionModeView searchActionModeView = this.f86964vyq;
        if (searchActionModeView == null || searchActionModeView.isAttachedToWindow()) {
            return;
        }
        this.f86964vyq.onConfigurationChanged(configuration);
    }

    @Override // miuix.appcompat.app.AbstractC6946k
    public void d8wk(int i2) {
        ActionBarView actionBarView = this.f86943fn3e;
        if (actionBarView == null || !actionBarView.jbh()) {
            return;
        }
        this.f86943fn3e.xwq3(i2);
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public void dd(AbstractC0096k.q qVar) {
        this.f86940dd.remove(qVar);
    }

    @Override // miuix.appcompat.app.AbstractC6946k
    /* JADX INFO: renamed from: do */
    public void mo28298do(btvn.zy zyVar) {
        this.f86968yz = zyVar;
        this.f86962t8r.post(new Runnable() { // from class: miuix.appcompat.internal.app.widget.f7l8
            @Override // java.lang.Runnable
            public final void run() {
                this.f39235k.oph();
            }
        });
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public void dr(CharSequence charSequence) {
        this.f86943fn3e.setSubtitle(charSequence);
    }

    @Override // miuix.appcompat.app.AbstractC6946k
    public void dxef(boolean z2) {
        this.f86943fn3e.setResizable(z2);
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    /* JADX INFO: renamed from: e */
    public void mo156e(int i2) {
        if ((i2 & 4) != 0) {
            this.f39288r = true;
        }
        this.f86943fn3e.setDisplayOptions(i2);
        int displayOptions = this.f86943fn3e.getDisplayOptions();
        ActionBarContainer actionBarContainer = this.f39283i;
        if (actionBarContainer != null) {
            actionBarContainer.setEnableBlur((displayOptions & 32768) != 0);
        }
        ActionBarContainer actionBarContainer2 = this.f86958ni7;
        if (actionBarContainer2 != null) {
            actionBarContainer2.setEnableBlur((i2 & 16384) != 0);
        }
    }

    @Override // miuix.appcompat.app.AbstractC6946k
    public void e5(boolean z2) {
        this.f86943fn3e.setProgressBarVisibility(z2);
    }

    @Override // miuix.appcompat.app.AbstractC6946k
    public void ebn(boolean z2) {
        ActionBarContextView actionBarContextView = this.f86970zurt;
        if (actionBarContextView != null) {
            actionBarContextView.setActionModeAnim(z2);
        }
    }

    @Override // miuix.appcompat.app.AbstractC6946k
    public int etdu() {
        return this.f86943fn3e.getExpandState();
    }

    @Override // miuix.appcompat.app.AbstractC6946k
    public void ew(boolean z2) {
        this.f86965wvg.m25212i(z2);
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    /* JADX INFO: renamed from: f */
    public void mo157f(int i2) {
        mo154c(LayoutInflater.from(wvg()).inflate(i2, (ViewGroup) this.f86943fn3e, false));
    }

    public View f3f() {
        ActionBarOverlayLayout actionBarOverlayLayout = this.f86962t8r;
        if (actionBarOverlayLayout != null) {
            return actionBarOverlayLayout.findViewById(R.id.content);
        }
        return null;
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public void f7l8(AbstractC0096k.q qVar) {
        this.f86940dd.add(qVar);
    }

    public void f7z0(@dd Boolean bool) {
        ActionBarContainer actionBarContainer;
        if ((mo159h() & 32768) == 0 || (actionBarContainer = this.f39283i) == null) {
            return;
        }
        actionBarContainer.setActionBarBlur(bool);
    }

    void fh(C7040n c7040n) {
        if (this.f86963uv6 != c7040n) {
            this.f86963uv6 = c7040n;
            ActionBarView actionBarView = this.f86943fn3e;
            if (actionBarView != null) {
                actionBarView.setExtraPaddingPolicy(c7040n);
            }
            SearchActionModeView searchActionModeView = this.f86964vyq;
            if (searchActionModeView != null) {
                searchActionModeView.setExtraPaddingPolicy(this.f86963uv6);
            }
        }
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public int fn3e() {
        return this.f86943fn3e.getNavigationMode();
    }

    @Override // miuix.appcompat.app.AbstractC6946k
    public void fnq8(int i2, int i3) {
        ActionBarView actionBarView = this.f86943fn3e;
        if (actionBarView == null || !actionBarView.jbh()) {
            return;
        }
        this.f86943fn3e.gyi(i2, i3);
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public boolean fti() {
        return this.f39279c;
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public CharSequence fu4() {
        return this.f86943fn3e.getSubtitle();
    }

    @Override // miuix.appcompat.app.AbstractC6946k
    public int g1(String str, AbstractC0096k.g gVar, int i2, Class<? extends Fragment> cls, Bundle bundle, boolean z2) {
        return this.f86965wvg.m25213n(str, gVar, i2, cls, bundle, z2);
    }

    @Override // miuix.appcompat.app.AbstractC6946k
    public void ga(boolean z2) {
        this.f86943fn3e.setProgressBarIndeterminateVisibility(z2);
    }

    @Override // miuix.appcompat.app.AbstractC6946k
    public void gbni(AbstractC6946k.k kVar) {
        this.f86965wvg.f7l8(kVar);
    }

    @Override // miuix.appcompat.app.AbstractC6946k
    public void gc3c(AnimState animState) {
        bz2(true, animState);
    }

    @Override // miuix.appcompat.app.AbstractC6946k
    public void gcp(View.OnClickListener onClickListener) {
        this.f86943fn3e.setSubTitleClickListener(onClickListener);
    }

    public ActionMode ge(ActionMode.Callback callback) {
        Rect baseInnerInsets;
        ActionMode actionMode = this.f39282h;
        if (actionMode != null) {
            actionMode.finish();
        }
        ActionMode actionModeExv8 = exv8(callback);
        zurt zurtVar = this.f86944fti;
        if (((zurtVar instanceof SearchActionModeView) && (actionModeExv8 instanceof C7009g)) || ((zurtVar instanceof ActionBarContextView) && (actionModeExv8 instanceof C7041q))) {
            zurtVar.ld6();
            this.f86944fti.mo25122n();
        }
        zurt zurtVarQh4d = qh4d(callback);
        this.f86944fti = zurtVarQh4d;
        if (zurtVarQh4d == null) {
            throw new IllegalStateException("not set windowSplitActionBar true in activity style!");
        }
        if (!(actionModeExv8 instanceof miuix.appcompat.internal.view.toq)) {
            return null;
        }
        miuix.appcompat.internal.view.toq toqVar = (miuix.appcompat.internal.view.toq) actionModeExv8;
        toqVar.zurt(zurtVarQh4d);
        if ((toqVar instanceof C7009g) && (baseInnerInsets = this.f86962t8r.getBaseInnerInsets()) != null) {
            ((C7009g) toqVar).ni7(baseInnerInsets);
        }
        toqVar.fn3e(this.f39280e);
        if (!toqVar.m25393i()) {
            return null;
        }
        actionModeExv8.invalidate();
        this.f86944fti.f7l8(actionModeExv8);
        btvn(true);
        ActionBarContainer actionBarContainer = this.f86958ni7;
        if (actionBarContainer != null && this.f86966x9kr == 1 && actionBarContainer.getVisibility() != 0) {
            this.f86958ni7.setVisibility(0);
        }
        zurt zurtVar2 = this.f86944fti;
        if (zurtVar2 instanceof ActionBarContextView) {
            ((ActionBarContextView) zurtVar2).sendAccessibilityEvent(32);
        }
        this.f39282h = actionModeExv8;
        return actionModeExv8;
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public AbstractC0096k.g gvn7() {
        return new y();
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public void gyi(int i2) {
        dr(this.f86936cdj.getString(i2));
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    /* JADX INFO: renamed from: h */
    public int mo159h() {
        return this.f86943fn3e.getDisplayOptions();
    }

    @Override // miuix.appcompat.app.AbstractC6946k
    public void h4b(int i2) {
        this.f86943fn3e.setProgress(i2);
    }

    @Override // miuix.appcompat.app.AbstractC6946k
    public void h7am(AbstractC0096k.g gVar) {
        this.f86965wvg.n7h(gVar);
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public void hb(boolean z2) {
        int iTjz5 = tjz5();
        nn86((z2 ? 16 : 0) | iTjz5, iTjz5 | 16);
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public void hyr(Drawable drawable) {
        this.f39283i.setPrimaryBackground(drawable);
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    /* JADX INFO: renamed from: i */
    public int mo160i() {
        int navigationMode = this.f86943fn3e.getNavigationMode();
        if (navigationMode != 1) {
            if (navigationMode != 2) {
                return 0;
            }
            return this.f86939d3.size();
        }
        SpinnerAdapter dropdownAdapter = this.f86943fn3e.getDropdownAdapter();
        if (dropdownAdapter != null) {
            return dropdownAdapter.getCount();
        }
        return 0;
    }

    void i1an(AbstractC0096k.g gVar) {
        ula6(gVar, o1t() == 0);
    }

    @Override // miuix.appcompat.app.AbstractC6946k
    public void i9jn() {
        ActionBarView actionBarView = this.f86943fn3e;
        if (actionBarView == null || !actionBarView.jbh()) {
            return;
        }
        this.f86943fn3e.gbni();
    }

    @Override // miuix.appcompat.app.AbstractC6946k
    public void ij(View view) {
        this.f86943fn3e.setEndView(view);
    }

    @Override // miuix.appcompat.app.AbstractC6946k
    public void ix(int i2) {
        this.f86965wvg.fn3e(i2);
    }

    @Override // miuix.appcompat.app.AbstractC6946k
    public void ixz(AbstractC0096k.g gVar, boolean z2) {
        if (this.f86942eqxt) {
            this.f86942eqxt = false;
            return;
        }
        this.f86942eqxt = true;
        Context context = this.f86936cdj;
        if ((context instanceof Activity) && (((Activity) context).isDestroyed() || ((Activity) this.f86936cdj).isFinishing())) {
            return;
        }
        if (fn3e() != 2) {
            this.f86954lvui = gVar != null ? gVar.mo182q() : -1;
            return;
        }
        o1t o1tVarT8r = this.f86938d2ok.ki().t8r();
        y yVar = this.f86961oc;
        if (yVar != gVar) {
            this.f39289t.setTabSelected(gVar != null ? gVar.mo182q() : -1, z2);
            this.f86955mcp.setTabSelected(gVar != null ? gVar.mo182q() : -1, z2);
            this.f86950jk.setTabSelected(gVar != null ? gVar.mo182q() : -1);
            this.f86933a9.setTabSelected(gVar != null ? gVar.mo182q() : -1);
            y yVar2 = this.f86961oc;
            if (yVar2 != null) {
                yVar2.m25229i().fn3e(this.f86961oc, o1tVarT8r);
            }
            y yVar3 = (y) gVar;
            this.f86961oc = yVar3;
            if (yVar3 != null) {
                yVar3.f39302p = z2;
                yVar3.m25229i().mo201p(this.f86961oc, o1tVarT8r);
            }
        } else if (yVar != null) {
            yVar.m25229i().mo202z(this.f86961oc, o1tVarT8r);
            this.f39289t.m25182g(gVar.mo182q());
            this.f86955mcp.m25182g(gVar.mo182q());
            this.f86950jk.ni7(gVar.mo182q());
            this.f86933a9.ni7(gVar.mo182q());
        }
        if (!o1tVarT8r.ni7()) {
            o1tVarT8r.qrj();
        }
        this.f86942eqxt = false;
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    /* JADX INFO: renamed from: j */
    public void mo161j(boolean z2) {
        int iTjz5 = tjz5();
        nn86((z2 ? 2 : 0) | iTjz5, iTjz5 | 2);
    }

    void j3y2() {
        if (this.f39281f) {
            return;
        }
        this.f39281f = true;
        k4jz(false);
        this.f39287o = etdu();
        this.f39286m = jz5();
        if (this.f86944fti instanceof SearchActionModeView) {
            dxef(false);
        } else {
            this.f39283i.x9kr();
            ((ActionBarContextView) this.f86944fti).setExpandState(this.f39287o);
            ((ActionBarContextView) this.f86944fti).setResizable(this.f39286m);
        }
        this.f86941ek5k = this.f86943fn3e.getImportantForAccessibility();
        this.f86943fn3e.setImportantForAccessibility(4);
        this.f86943fn3e.ga(this.f86944fti instanceof SearchActionModeView, (mo159h() & 32768) != 0);
    }

    @Override // miuix.appcompat.app.AbstractC6946k
    public void jbh(int i2) {
        this.f86965wvg.qrj(i2);
    }

    @Override // miuix.appcompat.app.AbstractC6946k
    public boolean jz5() {
        return this.f86943fn3e.fn3e();
    }

    @Override // miuix.appcompat.app.AbstractC6946k
    public View kcsr(int i2) {
        return this.f86943fn3e.mo25119h(i2);
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public int ki() {
        return this.f39283i.getHeight();
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public View kja0() {
        return this.f86943fn3e.getCustomNavigationView();
    }

    int kjd(View view, int i2) {
        if (this.f86951jp0y.containsKey(view)) {
            Integer numI3x9 = i3x9(view);
            if (numI3x9.intValue() > i2) {
                this.f86951jp0y.put(view, Integer.valueOf(i2));
                lk(view, i2);
                return numI3x9.intValue() - i2;
            }
        }
        return 0;
    }

    void kt06() {
        if (this.f39281f) {
            this.f39281f = false;
            this.f86943fn3e.wlev((mo159h() & 32768) != 0);
            k4jz(false);
            if (this.f86944fti instanceof SearchActionModeView) {
                dxef(this.f39286m);
            } else {
                this.f39283i.t8r();
                this.f39286m = ((ActionBarContextView) this.f86944fti).fn3e();
                this.f39287o = ((ActionBarContextView) this.f86944fti).getExpandState();
                dxef(this.f39286m);
                this.f86943fn3e.setExpandState(this.f39287o);
            }
            this.f86943fn3e.setImportantForAccessibility(this.f86941ek5k);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // miuix.appcompat.app.AbstractC6946k
    public void ktq(View view) {
        if (view == 0) {
            Log.w("miuix-appcompat", "warning!! the view is null on registerCoordinateScrollView!!");
            return;
        }
        if (view instanceof InterfaceC7614k) {
            InterfaceC7614k interfaceC7614k = (InterfaceC7614k) view;
            this.f86946gvn7.add(interfaceC7614k);
            Rect rect = this.f39278b;
            if (rect != null) {
                interfaceC7614k.onContentInsetChanged(rect);
            }
        } else {
            HashMap<View, Integer> map = this.f86951jp0y;
            Rect rect2 = this.f39278b;
            map.put(view, Integer.valueOf(rect2 != null ? rect2.top : f86932y2.intValue()));
            Rect rect3 = this.f39278b;
            if (rect3 != null) {
                this.f86951jp0y.put(view, Integer.valueOf(rect3.top));
                lk(view, this.f39278b.top);
            }
        }
        if (this.f39283i.getActionBarCoordinateListener() == null) {
            this.f39283i.setActionBarCoordinateListener(ovdh());
        }
    }

    @Override // miuix.appcompat.app.AbstractC6946k
    public void kx3(AnimState animState) {
        m2t(true, animState);
    }

    public boolean kz28() {
        return false;
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public void ld6(AbstractC0096k.g gVar, boolean z2) {
        if (uj2j()) {
            throw new IllegalStateException("Cannot add tab directly in fragment view pager mode!\n Please using addFragmentTab().");
        }
        ula6(gVar, z2);
    }

    @Override // miuix.appcompat.app.AbstractC6946k
    public void lh(ActivityC0891q activityC0891q) {
        bap7(activityC0891q, true);
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public void lrht(View view, AbstractC0096k.toq toqVar) {
        view.setLayoutParams(toqVar);
        this.f86943fn3e.setCustomNavigationView(view);
    }

    @Override // miuix.appcompat.app.AbstractC6946k
    public btvn.zy ltg8() {
        return this.f86968yz;
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public void lv5(Drawable drawable) {
        this.f86943fn3e.setLogo(drawable);
    }

    @Override // miuix.appcompat.app.AbstractC6946k
    public void lw(View view) {
        this.f86943fn3e.setStartView(view);
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    /* JADX INFO: renamed from: m */
    public void mo164m(boolean z2) {
        int iTjz5 = tjz5();
        nn86((z2 ? 1 : 0) | iTjz5, iTjz5 | 1);
    }

    int m28(View view, int i2) {
        int i3 = 0;
        for (View view2 : this.f86951jp0y.keySet()) {
            int iIntValue = i3x9(view2).intValue();
            int i4 = iIntValue - i2;
            Rect rect = this.f39278b;
            int iMin = Math.min(i4, rect == null ? 0 : rect.top);
            if (iIntValue < iMin) {
                this.f86951jp0y.put(view2, Integer.valueOf(iMin));
                lk(view2, iMin);
                if (view == view2) {
                    i3 = iIntValue - iMin;
                }
            }
        }
        return i3;
    }

    @Override // miuix.appcompat.app.AbstractC6946k
    public void m2t(boolean z2, AnimState animState) {
        if (this.f86956n5r1) {
            this.f86956n5r1 = false;
            vg(false, z2, animState);
        }
    }

    @Override // miuix.appcompat.app.AbstractC6946k
    public C7752g m4() {
        ActionBarView actionBarView = this.f86943fn3e;
        if (actionBarView != null) {
            return actionBarView.getCollapseTitle();
        }
        return null;
    }

    @Override // miuix.appcompat.app.AbstractC6946k
    public void m58i(int i2, int i3, int i4, int i5, int i6, int i7) {
        cnbm(i2, i3, i4 != 0 ? this.f86936cdj.getDrawable(i4) : null, i5 != 0 ? this.f86936cdj.getDrawable(i5) : null, i6 != 0 ? this.f86936cdj.getDrawable(i6) : null, i7 != 0 ? this.f86936cdj.getDrawable(i7) : null);
    }

    void m8(AbstractC0096k.g gVar, int i2, boolean z2) {
        z617();
        this.f39289t.m25185q(gVar, i2, z2);
        this.f86955mcp.m25185q(gVar, i2, z2);
        this.f86950jk.fn3e(gVar, i2, z2);
        this.f86933a9.fn3e(gVar, i2, z2);
        cn02(gVar, i2);
        if (z2) {
            n5r1(gVar);
        }
    }

    @Override // miuix.appcompat.app.AbstractC6946k
    public void mbx(String str) {
        this.f86965wvg.kja0(str);
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public void mcp() {
        gc3c(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    void mete() {
        if (this.f86951jp0y.size() == 0 && this.f86946gvn7.size() == 0) {
            this.f39283i.setActionBarCoordinateListener(null);
            return;
        }
        for (View view : this.f86951jp0y.keySet()) {
            lk(view, i3x9(view).intValue());
        }
        Iterator<InterfaceC7614k> it = this.f86946gvn7.iterator();
        while (it.hasNext()) {
            View view2 = (View) ((InterfaceC7614k) it.next());
            if (view2 instanceof qh4d.toq) {
                ((qh4d.toq) view2).mo26141k(this.f86949i1, this.f86934a98o);
            }
            lk(view2, 0);
        }
    }

    public void mub(boolean z2) {
        this.f39283i.setIsMiuixFloating(z2);
        SearchActionModeView searchActionModeView = this.f86964vyq;
        if (searchActionModeView != null) {
            searchActionModeView.oc();
        }
    }

    @Override // miuix.appcompat.app.AbstractC6946k
    public void n2t(int i2, boolean z2, boolean z3) {
        this.f86943fn3e.setExpandStateByUser(i2);
        this.f86943fn3e.setExpandState(i2, z2, z3);
        ActionBarContextView actionBarContextView = this.f86970zurt;
        if (actionBarContextView != null) {
            actionBarContextView.setExpandStateByUser(i2);
            this.f86970zurt.setExpandState(i2, z2, z3);
        }
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public void n5r1(AbstractC0096k.g gVar) {
        ixz(gVar, true);
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public void ncyb(int i2) {
        if (uj2j()) {
            throw new IllegalStateException("Cannot add tab directly in fragment view pager mode!\n Please using addFragmentTab().");
        }
        sc(i2);
    }

    @Override // miuix.appcompat.app.AbstractC6946k
    public void ngy(int i2, boolean z2) {
        this.f86965wvg.ki(i2, z2);
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public AbstractC0096k.g ni7() {
        return this.f86961oc;
    }

    @Override // miuix.appcompat.app.AbstractC6946k
    public void nme(boolean z2) {
        this.f86943fn3e.setTitleClickable(z2);
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public void nmn5(int i2) {
        this.f86943fn3e.setLogo(i2);
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public void nn86(int i2, int i3) {
        int displayOptions = this.f86943fn3e.getDisplayOptions();
        if ((i3 & 4) != 0) {
            this.f39288r = true;
        }
        this.f86943fn3e.setDisplayOptions((i2 & i3) | ((~i3) & displayOptions));
        int displayOptions2 = this.f86943fn3e.getDisplayOptions();
        ActionBarContainer actionBarContainer = this.f39283i;
        if (actionBarContainer != null) {
            actionBarContainer.setEnableBlur((32768 & displayOptions2) != 0);
        }
        ActionBarContainer actionBarContainer2 = this.f86958ni7;
        if (actionBarContainer2 != null) {
            actionBarContainer2.setEnableBlur((displayOptions2 & 16384) != 0);
        }
    }

    @Override // miuix.appcompat.app.AbstractC6946k
    public void nsb(int i2) {
        this.f86943fn3e.setExpandStateByUser(i2);
        this.f86943fn3e.setExpandState(i2);
        ActionBarContextView actionBarContextView = this.f86970zurt;
        if (actionBarContextView != null) {
            actionBarContextView.setExpandStateByUser(i2);
            this.f86970zurt.setExpandState(i2);
        }
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    /* JADX INFO: renamed from: o */
    public void mo166o(boolean z2) {
        int iTjz5 = tjz5();
        nn86((z2 ? 8 : 0) | iTjz5, iTjz5 | 8);
    }

    @Override // miuix.appcompat.app.AbstractC6946k
    public void o05(int i2, boolean z2) {
        this.f39289t.setBadgeVisibility(i2, z2);
        this.f86955mcp.setBadgeVisibility(i2, z2);
        this.f86950jk.setBadgeVisibility(i2, z2);
        this.f86933a9.setBadgeVisibility(i2, z2);
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public int o1t() {
        return this.f86939d3.size();
    }

    @Override // miuix.appcompat.app.AbstractC6946k
    public void oc() {
    }

    @Override // miuix.appcompat.app.AbstractC6946k
    public void oki(int i2, boolean z2) {
        this.f86950jk.setTabBadgeDisappearOnClick(i2, z2);
        this.f86933a9.setTabBadgeDisappearOnClick(i2, z2);
    }

    protected InterfaceC6990g ovdh() {
        return new InterfaceC6990g() { // from class: miuix.appcompat.internal.app.widget.y
            @Override // miuix.appcompat.internal.app.widget.InterfaceC6990g
            /* JADX INFO: renamed from: k */
            public final void mo25223k(int i2, float f2, int i3, int i4) {
                this.f39339k.kl7m(i2, f2, i3, i4);
            }
        };
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    /* JADX INFO: renamed from: p */
    public void mo167p(AbstractC0096k.g gVar, int i2, boolean z2) {
        if (uj2j()) {
            throw new IllegalStateException("Cannot add tab directly in fragment view pager mode!\n Please using addFragmentTab().");
        }
        m8(gVar, i2, z2);
    }

    @Override // miuix.appcompat.app.AbstractC6946k
    public void pc(int i2) {
        this.f86943fn3e.setUserSetEndActionMenuItemLimit(true);
        this.f86943fn3e.setEndActionMenuItemLimit(i2);
    }

    @Override // miuix.appcompat.app.AbstractC6946k
    public void pjz9(int i2, int i3) {
        this.f86955mcp.setTextAppearance(i2, i3);
    }

    @Override // miuix.appcompat.app.AbstractC6946k
    public void ps(boolean z2, boolean z3) {
        if (this.f86943fn3e.m28299do()) {
            if (z2) {
                this.f86958ni7.dd(z3);
            } else {
                this.f86958ni7.zurt(z3);
            }
        }
    }

    @Override // miuix.appcompat.app.AbstractC6946k
    public void py(MenuItem menuItem) {
        ActionBarView actionBarView = this.f86943fn3e;
        if (actionBarView == null || !actionBarView.jbh()) {
            return;
        }
        this.f86943fn3e.was(menuItem);
    }

    public zurt qh4d(ActionMode.Callback callback) {
        zurt zurtVar;
        int i2;
        if (callback instanceof n7h.toq) {
            if (this.f86964vyq == null) {
                SearchActionModeView searchActionModeViewXblq = xblq();
                this.f86964vyq = searchActionModeViewXblq;
                searchActionModeViewXblq.setExtraPaddingPolicy(this.f86963uv6);
            }
            if (this.f86962t8r != this.f86964vyq.getParent()) {
                this.f86962t8r.addView(this.f86964vyq);
            }
            le7();
            this.f86964vyq.toq(this.f86943fn3e);
            zurtVar = this.f86964vyq;
        } else {
            zurtVar = this.f86970zurt;
            if (zurtVar == null) {
                throw new IllegalStateException("not set windowSplitActionBar true in activity style!");
            }
        }
        if ((zurtVar instanceof ActionBarContextView) && (i2 = this.f86967y9n) != -1) {
            ((ActionBarContextView) zurtVar).setActionMenuItemLimit(i2);
        }
        return zurtVar;
    }

    @Override // miuix.appcompat.app.AbstractC6946k
    public void qkj8(int i2) {
        fnq8(i2, 2);
    }

    @Override // miuix.appcompat.app.AbstractC6946k
    public void qo(MenuItem menuItem) {
        tfm(menuItem, 2);
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    /* JADX INFO: renamed from: r */
    public void mo169r() {
        if (uj2j()) {
            throw new IllegalStateException("Cannot add tab directly in fragment view pager mode!\n Please using addFragmentTab().");
        }
        wwp();
    }

    @Override // miuix.appcompat.app.AbstractC6946k
    public void r25n(View view) {
        this.f86965wvg.t8r(view);
    }

    @Override // miuix.appcompat.app.AbstractC6946k
    public View r8s8() {
        return this.f86943fn3e;
    }

    @Override // miuix.appcompat.app.AbstractC6946k
    public void ra(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = this.f86962t8r;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.nn86(view);
        }
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    /* JADX INFO: renamed from: s */
    public void mo170s(AbstractC0096k.g gVar, int i2) {
        mo167p(gVar, i2, this.f86939d3.isEmpty());
    }

    void sc(int i2) {
        if (this.f39289t == null) {
            return;
        }
        y yVar = this.f86961oc;
        int iMo182q = yVar != null ? yVar.mo182q() : this.f86954lvui;
        this.f39289t.qrj(i2);
        this.f86955mcp.qrj(i2);
        this.f86950jk.wvg(i2);
        this.f86933a9.wvg(i2);
        y yVarRemove = this.f86939d3.remove(i2);
        if (yVarRemove != null) {
            yVarRemove.zurt(-1);
        }
        int size = this.f86939d3.size();
        for (int i3 = i2; i3 < size; i3++) {
            this.f86939d3.get(i3).zurt(i3);
        }
        if (iMo182q == i2) {
            n5r1(this.f86939d3.isEmpty() ? null : this.f86939d3.get(Math.max(0, i2 - 1)));
        }
        if (this.f86939d3.isEmpty()) {
            this.f86954lvui = -1;
        }
    }

    @Override // miuix.appcompat.app.AbstractC6946k
    public int se() {
        return this.f86965wvg.m25214p();
    }

    @Override // miuix.appcompat.app.AbstractC6946k
    public C7756y sok() {
        ActionBarView actionBarView = this.f86943fn3e;
        if (actionBarView != null) {
            return actionBarView.getExpandTitle();
        }
        return null;
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    /* JADX INFO: renamed from: t */
    public CharSequence mo171t() {
        return this.f86943fn3e.getTitle();
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public void t8iq(int i2) {
        if (this.f86943fn3e.getNavigationMode() == 2) {
            this.f86954lvui = zurt();
            n5r1(null);
            this.f39289t.setVisibility(8);
            this.f86955mcp.setVisibility(8);
            this.f86950jk.setVisibility(8);
            this.f86933a9.setVisibility(8);
        }
        this.f86943fn3e.setNavigationMode(i2);
        if (i2 == 2) {
            z617();
            this.f39289t.setVisibility(0);
            this.f86955mcp.setVisibility(0);
            this.f86950jk.setVisibility(0);
            this.f86933a9.setVisibility(0);
            int i3 = this.f86954lvui;
            if (i3 != -1) {
                mo172u(i3);
                this.f86954lvui = -1;
            }
        }
        this.f86943fn3e.setCollapsable(false);
    }

    @Override // miuix.appcompat.app.AbstractC6946k
    public void tfm(MenuItem menuItem, int i2) {
        ActionBarView actionBarView = this.f86943fn3e;
        if (actionBarView == null || !actionBarView.jbh()) {
            return;
        }
        this.f86943fn3e.dr(menuItem, i2);
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    /* JADX INFO: renamed from: u */
    public void mo172u(int i2) {
        int navigationMode = this.f86943fn3e.getNavigationMode();
        if (navigationMode == 1) {
            this.f86943fn3e.setDropdownSelectedPosition(i2);
        } else {
            if (navigationMode != 2) {
                throw new IllegalStateException("setSelectedNavigationIndex not valid for current navigation mode");
            }
            n5r1(this.f86939d3.get(i2));
        }
    }

    @Override // miuix.appcompat.app.AbstractC6946k
    public void u38j(boolean z2) {
    }

    @Override // miuix.appcompat.app.AbstractC6946k
    public void uc(String str, int i2, Class<? extends Fragment> cls, Bundle bundle, boolean z2) {
        this.f86965wvg.cdj(str, i2, cls, bundle, z2);
    }

    @Override // miuix.appcompat.app.AbstractC6946k
    public boolean uj2j() {
        return this.f86965wvg != null;
    }

    @Override // miuix.appcompat.app.AbstractC6946k
    public void ukdy(int i2) {
        this.f86967y9n = i2;
        this.f86943fn3e.setActionMenuItemLimit(i2);
        zurt zurtVar = this.f86944fti;
        if (zurtVar instanceof ActionBarContextView) {
            ((ActionBarContextView) zurtVar).setActionMenuItemLimit(this.f86967y9n);
        }
    }

    void ula6(AbstractC0096k.g gVar, boolean z2) {
        z617();
        this.f39289t.m25184n(gVar, z2);
        this.f86955mcp.m25184n(gVar, z2);
        this.f86950jk.zurt(gVar, z2);
        this.f86933a9.zurt(gVar, z2);
        cn02(gVar, this.f86939d3.size());
        if (z2) {
            n5r1(gVar);
        }
    }

    void uo(AbstractC0096k.g gVar, int i2) {
        m8(gVar, i2, i2 == o1t());
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    /* JADX INFO: renamed from: v */
    public void mo173v(CharSequence charSequence) {
        this.f86943fn3e.setTitle(charSequence);
    }

    @Override // miuix.appcompat.app.AbstractC6946k
    public View v0af() {
        return this.f86943fn3e.getEndView();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // miuix.appcompat.app.AbstractC6946k
    public void v5yj(View view) {
        if (view instanceof InterfaceC7614k) {
            this.f86946gvn7.remove((InterfaceC7614k) view);
        } else {
            this.f86951jp0y.remove(view);
        }
        if (this.f86951jp0y.size() == 0 && this.f86946gvn7.size() == 0) {
            this.f39283i.setActionBarCoordinateListener(null);
        }
    }

    @Override // miuix.appcompat.app.AbstractC6946k
    public void vep5(Fragment fragment) {
        this.f86965wvg.x2(fragment);
    }

    @Override // miuix.appcompat.app.AbstractC6946k
    public void vq(InterfaceC6952n interfaceC6952n) {
        this.f39283i.cdj(interfaceC6952n);
    }

    int vss1(View view) {
        if (this.f86951jp0y.containsKey(view)) {
            return i3x9(view).intValue();
        }
        return -1;
    }

    @Override // miuix.appcompat.app.AbstractC6946k
    public void vy(int i2, int i3) {
        this.f86950jk.setTextAppearance(i2, i3);
        this.f86933a9.setTextAppearance(i2, i3);
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public void vyq(boolean z2) {
        int iTjz5 = tjz5();
        nn86((z2 ? 4 : 0) | iTjz5, iTjz5 | 4);
    }

    @Override // miuix.appcompat.app.AbstractC6946k
    /* JADX INFO: renamed from: w */
    public void mo25018w(boolean z2) {
        m2t(z2, null);
    }

    @Override // miuix.appcompat.app.AbstractC6946k
    public Fragment w831(int i2) {
        return this.f86965wvg.m25216y(i2);
    }

    @Override // miuix.appcompat.app.AbstractC6946k
    public int was(String str, AbstractC0096k.g gVar, Class<? extends Fragment> cls, Bundle bundle, boolean z2) {
        return this.f86965wvg.m25210g(str, gVar, cls, bundle, z2);
    }

    @Override // miuix.appcompat.app.AbstractC6946k
    public void wlev(boolean z2) {
        this.f86943fn3e.setProgressBarIndeterminate(z2);
    }

    @Override // miuix.appcompat.app.AbstractC6946k
    public void wo() {
        d8wk(2);
    }

    public ActionBarContainer wtop() {
        return this.f39283i;
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public Context wvg() {
        if (this.f86952ki == null) {
            TypedValue typedValue = new TypedValue();
            this.f86936cdj.getTheme().resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                this.f86952ki = new ContextThemeWrapper(this.f86936cdj, i2);
            } else {
                this.f86952ki = this.f86936cdj;
            }
        }
        return this.f86952ki;
    }

    void wwp() {
        mj();
    }

    @Override // miuix.appcompat.app.AbstractC6946k
    public void wx16(View view) {
        if (view instanceof InterfaceC7614k) {
            if (this.f86946gvn7.contains(view)) {
                lk(view, 0);
            }
        } else if (this.f86951jp0y.containsKey(view)) {
            HashMap<View, Integer> map = this.f86951jp0y;
            Rect rect = this.f39278b;
            map.put(view, Integer.valueOf(rect != null ? rect.top : f86932y2.intValue()));
            Rect rect2 = this.f39278b;
            lk(view, rect2 != null ? rect2.top : 0);
        }
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    /* JADX INFO: renamed from: x */
    public void mo174x(Drawable drawable) {
        this.f86943fn3e.setIcon(drawable);
    }

    public void x7o(boolean z2) {
        if (!z2 || C7084p.m25595n(wvg())) {
            SearchActionModeView searchActionModeView = this.f86964vyq;
            if (searchActionModeView != null) {
                searchActionModeView.ncyb(z2);
            }
            this.f39283i.ncyb(z2);
        }
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public void x9kr(AbstractC0096k.g gVar) {
        if (uj2j()) {
            throw new IllegalStateException("Cannot add tab directly in fragment view pager mode!\n Please using addFragmentTab().");
        }
        zuf(gVar);
    }

    public SearchActionModeView xblq() {
        SearchActionModeView searchActionModeView = (SearchActionModeView) LayoutInflater.from(wvg()).inflate(toq.qrj.f76697etdu, (ViewGroup) this.f86962t8r, false);
        searchActionModeView.setOverlayModeView(this.f86962t8r);
        searchActionModeView.setOnBackClickListener(new g());
        return searchActionModeView;
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public void xwq3(int i2) {
        mo173v(this.f86936cdj.getString(i2));
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    /* JADX INFO: renamed from: y */
    public void mo175y(AbstractC0096k.g gVar) {
        ld6(gVar, this.f86939d3.isEmpty());
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public void y2(Drawable drawable) {
        if (this.f86958ni7 != null) {
            for (int i2 = 0; i2 < this.f86958ni7.getChildCount(); i2++) {
                if (this.f86958ni7.getChildAt(i2) instanceof ActionMenuView) {
                    this.f86958ni7.getChildAt(i2).setBackground(drawable);
                }
            }
        }
    }

    @Override // miuix.appcompat.app.AbstractC6946k
    public void yl(AbstractC6946k.k kVar) {
        this.f86965wvg.m25211h(kVar);
    }

    @Override // miuix.appcompat.app.AbstractC6946k
    public View yqrt() {
        return this.f86943fn3e.getStartView();
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    /* JADX INFO: renamed from: z */
    public AbstractC0096k.g mo176z(int i2) {
        return this.f86939d3.get(i2);
    }

    @Override // miuix.appcompat.app.AbstractC6946k
    public int z4() {
        return this.f86965wvg.m25215s();
    }

    int z4j7() {
        zurt zurtVar;
        if (this.f39282h != null && (zurtVar = this.f86944fti) != null) {
            return zurtVar.getViewHeight();
        }
        if (this.f86943fn3e.mbx()) {
            return 0;
        }
        return this.f86943fn3e.getCollapsedHeight();
    }

    void z8(Rect rect) {
        this.f39278b = rect;
        int i2 = rect.top;
        int i3 = i2 - this.f86935bf2;
        this.f86935bf2 = i2;
        Iterator<InterfaceC7614k> it = this.f86946gvn7.iterator();
        while (it.hasNext()) {
            it.next().onContentInsetChanged(rect);
        }
        for (View view : this.f86951jp0y.keySet()) {
            Integer num = this.f86951jp0y.get(view);
            if (num != null && i3 != 0) {
                if (num.equals(f86932y2)) {
                    num = 0;
                } else if (num.intValue() == 0) {
                }
                int iMax = Math.max(0, num.intValue() + i3);
                this.f86951jp0y.put(view, Integer.valueOf(iMax));
                lk(view, iMax);
            }
        }
    }

    @Override // miuix.appcompat.app.AbstractC6946k
    public void zkd(boolean z2) {
        bz2(z2, null);
    }

    void zma(int i2) {
        z617();
        this.f39289t.m25183h(i2);
        this.f86955mcp.m25183h(i2);
        this.f86950jk.mcp(i2);
        this.f86933a9.mcp(i2);
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public void zp(int i2) {
        this.f86943fn3e.setIcon(i2);
    }

    @Override // miuix.appcompat.app.AbstractC6946k
    public void zsr0(int i2) {
        ActionBarView actionBarView = this.f86943fn3e;
        if (actionBarView == null || !actionBarView.jbh()) {
            return;
        }
        this.f86943fn3e.g1(i2);
    }

    void zuf(AbstractC0096k.g gVar) {
        sc(gVar.mo182q());
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public int zurt() {
        y yVar;
        int navigationMode = this.f86943fn3e.getNavigationMode();
        if (navigationMode == 1) {
            return this.f86943fn3e.getDropdownSelectedPosition();
        }
        if (navigationMode == 2 && (yVar = this.f86961oc) != null) {
            return yVar.mo182q();
        }
        return -1;
    }

    @Override // miuix.appcompat.app.AbstractC6946k
    public void zwy(int i2, boolean z2) {
        this.f86943fn3e.setExpandStateByUser(i2);
        this.f86943fn3e.setExpandState(i2, z2, false);
        ActionBarContextView actionBarContextView = this.f86970zurt;
        if (actionBarContextView != null) {
            actionBarContextView.setExpandStateByUser(i2);
            this.f86970zurt.setExpandState(i2, z2, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C6998s(Fragment fragment) {
        this.f86936cdj = ((gvn7) fragment).getThemedContext();
        this.f86938d2ok = fragment.getChildFragmentManager();
        d1ts((ViewGroup) fragment.getView());
        ActivityC0891q activity = fragment.getActivity();
        this.f86943fn3e.setWindowTitle(activity != null ? activity.getTitle() : null);
    }

    public C6998s(Dialog dialog, ViewGroup viewGroup) {
        this.f86936cdj = dialog.getContext();
        d1ts(viewGroup);
    }
}
