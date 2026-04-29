package com.google.android.exoplayer2.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import com.google.android.exoplayer2.ui.C3748h;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: StyledPlayerControlViewLayoutManager.java */
/* JADX INFO: loaded from: classes2.dex */
final class dd {

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    private static final long f66087a9 = 250;

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    private static final int f66088d3 = 2;

    /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
    private static final int f66089eqxt = 4;

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    private static final long f66090fti = 250;

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    private static final int f66091gvn7 = 1;

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    private static final long f66092jk = 2000;

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    private static final int f66093jp0y = 0;

    /* JADX INFO: renamed from: oc, reason: collision with root package name */
    private static final int f66094oc = 3;

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private final ValueAnimator f66095cdj;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    @zy.dd
    private final ViewGroup f66096f7l8;

    /* JADX INFO: renamed from: g */
    @zy.dd
    private final ViewGroup f22574g;

    /* JADX INFO: renamed from: h */
    private final AnimatorSet f22575h;

    /* JADX INFO: renamed from: k */
    private final StyledPlayerControlView f22577k;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private final ValueAnimator f66099ki;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private final AnimatorSet f66100kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    @zy.dd
    private final View f66101ld6;

    /* JADX INFO: renamed from: n */
    @zy.dd
    private final ViewGroup f22578n;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private final AnimatorSet f66103n7h;

    /* JADX INFO: renamed from: p */
    @zy.dd
    private final View f22579p;

    /* JADX INFO: renamed from: q */
    @zy.dd
    private final ViewGroup f22580q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private final AnimatorSet f66106qrj;

    /* JADX INFO: renamed from: s */
    @zy.dd
    private final ViewGroup f22581s;

    /* JADX INFO: renamed from: t */
    private boolean f22582t;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @zy.dd
    private final View f66108toq;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    private boolean f66109wvg;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private final AnimatorSet f66110x2;

    /* JADX INFO: renamed from: y */
    @zy.dd
    private final ViewGroup f22583y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @zy.dd
    private final ViewGroup f66112zy;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private final Runnable f66107t8r = new Runnable() { // from class: com.google.android.exoplayer2.ui.jp0y
        @Override // java.lang.Runnable
        public final void run() {
            this.f22787k.m13275o();
        }
    };

    /* JADX INFO: renamed from: i */
    private final Runnable f22576i = new Runnable() { // from class: com.google.android.exoplayer2.ui.oc
        @Override // java.lang.Runnable
        public final void run() {
            this.f22833k.jk();
        }
    };

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private final Runnable f66097fn3e = new Runnable() { // from class: com.google.android.exoplayer2.ui.eqxt
        @Override // java.lang.Runnable
        public final void run() {
            this.f22607k.gvn7();
        }
    };

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private final Runnable f66111zurt = new Runnable() { // from class: com.google.android.exoplayer2.ui.d2ok
        @Override // java.lang.Runnable
        public final void run() {
            this.f22572k.jp0y();
        }
    };

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private final Runnable f66104ni7 = new Runnable() { // from class: com.google.android.exoplayer2.ui.lvui
        @Override // java.lang.Runnable
        public final void run() {
            this.f22821k.a9();
        }
    };

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    private final View.OnLayoutChangeListener f66098fu4 = new View.OnLayoutChangeListener() { // from class: com.google.android.exoplayer2.ui.r
        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            this.f22842k.n5r1(view, i2, i3, i4, i5, i6, i7, i8, i9);
        }
    };

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    private boolean f66102mcp = true;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    private int f66105o1t = 0;

    /* JADX INFO: renamed from: z */
    private final List<View> f22584z = new ArrayList();

    /* JADX INFO: compiled from: StyledPlayerControlViewLayoutManager.java */
    class f7l8 extends AnimatorListenerAdapter {
        f7l8() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            dd.this.nn86(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            dd.this.nn86(4);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.dd$g */
    /* JADX INFO: compiled from: StyledPlayerControlViewLayoutManager.java */
    class C3739g extends AnimatorListenerAdapter {
        C3739g() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            dd.this.nn86(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            dd.this.nn86(4);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.dd$k */
    /* JADX INFO: compiled from: StyledPlayerControlViewLayoutManager.java */
    class C3740k extends AnimatorListenerAdapter {
        C3740k() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (dd.this.f66108toq != null) {
                dd.this.f66108toq.setVisibility(4);
            }
            if (dd.this.f66112zy != null) {
                dd.this.f66112zy.setVisibility(4);
            }
            if (dd.this.f22578n != null) {
                dd.this.f22578n.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (!(dd.this.f22579p instanceof DefaultTimeBar) || dd.this.f66109wvg) {
                return;
            }
            ((DefaultTimeBar) dd.this.f22579p).m13171y(250L);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.dd$n */
    /* JADX INFO: compiled from: StyledPlayerControlViewLayoutManager.java */
    class C3741n extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ StyledPlayerControlView f22588k;

        C3741n(StyledPlayerControlView styledPlayerControlView) {
            this.f22588k = styledPlayerControlView;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            dd.this.nn86(2);
            if (dd.this.f22582t) {
                this.f22588k.post(dd.this.f66107t8r);
                dd.this.f22582t = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            dd.this.nn86(3);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.dd$q */
    /* JADX INFO: compiled from: StyledPlayerControlViewLayoutManager.java */
    class C3742q extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ StyledPlayerControlView f22590k;

        C3742q(StyledPlayerControlView styledPlayerControlView) {
            this.f22590k = styledPlayerControlView;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            dd.this.nn86(2);
            if (dd.this.f22582t) {
                this.f22590k.post(dd.this.f66107t8r);
                dd.this.f22582t = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            dd.this.nn86(3);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.dd$s */
    /* JADX INFO: compiled from: StyledPlayerControlViewLayoutManager.java */
    class C3743s extends AnimatorListenerAdapter {
        C3743s() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (dd.this.f22583y != null) {
                dd.this.f22583y.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (dd.this.f22574g != null) {
                dd.this.f22574g.setVisibility(0);
            }
        }
    }

    /* JADX INFO: compiled from: StyledPlayerControlViewLayoutManager.java */
    class toq extends AnimatorListenerAdapter {
        toq() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (dd.this.f66108toq != null) {
                dd.this.f66108toq.setVisibility(0);
            }
            if (dd.this.f66112zy != null) {
                dd.this.f66112zy.setVisibility(0);
            }
            if (dd.this.f22578n != null) {
                dd.this.f22578n.setVisibility(dd.this.f66109wvg ? 0 : 4);
            }
            if (!(dd.this.f22579p instanceof DefaultTimeBar) || dd.this.f66109wvg) {
                return;
            }
            ((DefaultTimeBar) dd.this.f22579p).fn3e(250L);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.dd$y */
    /* JADX INFO: compiled from: StyledPlayerControlViewLayoutManager.java */
    class C3744y extends AnimatorListenerAdapter {
        C3744y() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (dd.this.f22574g != null) {
                dd.this.f22574g.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (dd.this.f22583y != null) {
                dd.this.f22583y.setVisibility(0);
                dd.this.f22583y.setTranslationX(dd.this.f22583y.getWidth());
                dd.this.f22583y.scrollTo(dd.this.f22583y.getWidth(), 0);
            }
        }
    }

    /* JADX INFO: compiled from: StyledPlayerControlViewLayoutManager.java */
    class zy extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ StyledPlayerControlView f22595k;

        zy(StyledPlayerControlView styledPlayerControlView) {
            this.f22595k = styledPlayerControlView;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            dd.this.nn86(1);
            if (dd.this.f22582t) {
                this.f22595k.post(dd.this.f66107t8r);
                dd.this.f22582t = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            dd.this.nn86(3);
        }
    }

    public dd(StyledPlayerControlView styledPlayerControlView) {
        this.f22577k = styledPlayerControlView;
        this.f66108toq = styledPlayerControlView.findViewById(C3748h.f7l8.f66223y9n);
        this.f66112zy = (ViewGroup) styledPlayerControlView.findViewById(C3748h.f7l8.f22624j);
        this.f22578n = (ViewGroup) styledPlayerControlView.findViewById(C3748h.f7l8.f66172lv5);
        ViewGroup viewGroup = (ViewGroup) styledPlayerControlView.findViewById(C3748h.f7l8.f66186nn86);
        this.f22580q = viewGroup;
        this.f22581s = (ViewGroup) styledPlayerControlView.findViewById(C3748h.f7l8.f66156i9jn);
        View viewFindViewById = styledPlayerControlView.findViewById(C3748h.f7l8.f66178mu);
        this.f22579p = viewFindViewById;
        this.f22574g = (ViewGroup) styledPlayerControlView.findViewById(C3748h.f7l8.f22619e);
        this.f66096f7l8 = (ViewGroup) styledPlayerControlView.findViewById(C3748h.f7l8.f66155i1);
        this.f22583y = (ViewGroup) styledPlayerControlView.findViewById(C3748h.f7l8.f66115a98o);
        View viewFindViewById2 = styledPlayerControlView.findViewById(C3748h.f7l8.f66222y2);
        this.f66101ld6 = viewFindViewById2;
        View viewFindViewById3 = styledPlayerControlView.findViewById(C3748h.f7l8.f66120bo);
        if (viewFindViewById2 != null && viewFindViewById3 != null) {
            viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.exoplayer2.ui.mcp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f22822k.m13268f(view);
                }
            });
            viewFindViewById3.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.exoplayer2.ui.mcp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f22822k.m13268f(view);
                }
            });
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.exoplayer2.ui.jk
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f22786k.eqxt(valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new C3740k());
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.exoplayer2.ui.a9
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f22562k.d2ok(valueAnimator);
            }
        });
        valueAnimatorOfFloat2.addListener(new toq());
        Resources resources = styledPlayerControlView.getResources();
        int i2 = C3748h.q.f66350fti;
        float dimension = resources.getDimension(i2) - resources.getDimension(C3748h.q.f66347eqxt);
        float dimension2 = resources.getDimension(i2);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f66110x2 = animatorSet;
        animatorSet.setDuration(250L);
        animatorSet.addListener(new zy(styledPlayerControlView));
        animatorSet.play(valueAnimatorOfFloat).with(dd(0.0f, dimension, viewFindViewById)).with(dd(0.0f, dimension, viewGroup));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f66106qrj = animatorSet2;
        animatorSet2.setDuration(250L);
        animatorSet2.addListener(new C3742q(styledPlayerControlView));
        animatorSet2.play(dd(dimension, dimension2, viewFindViewById)).with(dd(dimension, dimension2, viewGroup));
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.f66103n7h = animatorSet3;
        animatorSet3.setDuration(250L);
        animatorSet3.addListener(new C3741n(styledPlayerControlView));
        animatorSet3.play(valueAnimatorOfFloat).with(dd(0.0f, dimension2, viewFindViewById)).with(dd(0.0f, dimension2, viewGroup));
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.f66100kja0 = animatorSet4;
        animatorSet4.setDuration(250L);
        animatorSet4.addListener(new C3739g());
        animatorSet4.play(valueAnimatorOfFloat2).with(dd(dimension, 0.0f, viewFindViewById)).with(dd(dimension, 0.0f, viewGroup));
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.f22575h = animatorSet5;
        animatorSet5.setDuration(250L);
        animatorSet5.addListener(new f7l8());
        animatorSet5.play(valueAnimatorOfFloat2).with(dd(dimension2, 0.0f, viewFindViewById)).with(dd(dimension2, 0.0f, viewGroup));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f66095cdj = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.setDuration(250L);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.exoplayer2.ui.gvn7
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f22614k.lvui(valueAnimator);
            }
        });
        valueAnimatorOfFloat3.addListener(new C3744y());
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.f66099ki = valueAnimatorOfFloat4;
        valueAnimatorOfFloat4.setDuration(250L);
        valueAnimatorOfFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.exoplayer2.ui.d3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f22573k.m13278r(valueAnimator);
            }
        });
        valueAnimatorOfFloat4.addListener(new C3743s());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a9() {
        nn86(2);
    }

    /* JADX INFO: renamed from: c */
    private void m13267c(Runnable runnable, long j2) {
        if (j2 >= 0) {
            this.f22577k.postDelayed(runnable, j2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d2ok(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = this.f66108toq;
        if (view != null) {
            view.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup = this.f66112zy;
        if (viewGroup != null) {
            viewGroup.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup2 = this.f22578n;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(fFloatValue);
        }
    }

    private static ObjectAnimator dd(float f2, float f3, View view) {
        return ObjectAnimator.ofFloat(view, "translationY", f2, f3);
    }

    private boolean ek5k() {
        int width = (this.f22577k.getWidth() - this.f22577k.getPaddingLeft()) - this.f22577k.getPaddingRight();
        int height = (this.f22577k.getHeight() - this.f22577k.getPaddingBottom()) - this.f22577k.getPaddingTop();
        int iM13280t = m13280t(this.f66112zy);
        ViewGroup viewGroup = this.f66112zy;
        int paddingLeft = iM13280t - (viewGroup != null ? viewGroup.getPaddingLeft() + this.f66112zy.getPaddingRight() : 0);
        int iO1t = o1t(this.f66112zy);
        ViewGroup viewGroup2 = this.f66112zy;
        return width <= Math.max(paddingLeft, m13280t(this.f22581s) + m13280t(this.f66101ld6)) || height <= (iO1t - (viewGroup2 != null ? viewGroup2.getPaddingTop() + this.f66112zy.getPaddingBottom() : 0)) + (o1t(this.f22580q) * 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void eqxt(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = this.f66108toq;
        if (view != null) {
            view.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup = this.f66112zy;
        if (viewGroup != null) {
            viewGroup.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup2 = this.f22578n;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(fFloatValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public void m13268f(View view) {
        uv6();
        if (view.getId() == C3748h.f7l8.f66222y2) {
            this.f66095cdj.start();
        } else if (view.getId() == C3748h.f7l8.f66120bo) {
            this.f66099ki.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gvn7() {
        this.f66106qrj.start();
    }

    private boolean hb(View view) {
        int id = view.getId();
        return id == C3748h.f7l8.f66186nn86 || id == C3748h.f7l8.f22618d || id == C3748h.f7l8.f22635u || id == C3748h.f7l8.f66141fnq8 || id == C3748h.f7l8.f66195qo || id == C3748h.f7l8.f22615a || id == C3748h.f7l8.f66229zp;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hyr() {
        int i2;
        if (this.f22574g == null || this.f66096f7l8 == null) {
            return;
        }
        int width = (this.f22577k.getWidth() - this.f22577k.getPaddingLeft()) - this.f22577k.getPaddingRight();
        while (true) {
            if (this.f66096f7l8.getChildCount() <= 1) {
                break;
            }
            int childCount = this.f66096f7l8.getChildCount() - 2;
            View childAt = this.f66096f7l8.getChildAt(childCount);
            this.f66096f7l8.removeViewAt(childCount);
            this.f22574g.addView(childAt, 0);
        }
        View view = this.f66101ld6;
        if (view != null) {
            view.setVisibility(8);
        }
        int iM13280t = m13280t(this.f22581s);
        int childCount2 = this.f22574g.getChildCount() - 1;
        for (int i3 = 0; i3 < childCount2; i3++) {
            iM13280t += m13280t(this.f22574g.getChildAt(i3));
        }
        if (iM13280t <= width) {
            ViewGroup viewGroup = this.f22583y;
            if (viewGroup == null || viewGroup.getVisibility() != 0 || this.f66099ki.isStarted()) {
                return;
            }
            this.f66095cdj.cancel();
            this.f66099ki.start();
            return;
        }
        View view2 = this.f66101ld6;
        if (view2 != null) {
            view2.setVisibility(0);
            iM13280t += m13280t(this.f66101ld6);
        }
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < childCount2; i4++) {
            View childAt2 = this.f22574g.getChildAt(i4);
            iM13280t -= m13280t(childAt2);
            arrayList.add(childAt2);
            if (iM13280t <= width) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        this.f22574g.removeViews(0, arrayList.size());
        for (i2 = 0; i2 < arrayList.size(); i2++) {
            this.f66096f7l8.addView((View) arrayList.get(i2), this.f66096f7l8.getChildCount() - 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jk() {
        this.f66103n7h.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jp0y() {
        this.f66110x2.start();
        m13267c(this.f66097fn3e, 2000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lvui(ValueAnimator valueAnimator) {
        m13282z(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public void m13273m() {
        ViewGroup viewGroup = this.f22578n;
        if (viewGroup != null) {
            viewGroup.setVisibility(this.f66109wvg ? 0 : 4);
        }
        View view = this.f22579p;
        if (view != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            int dimensionPixelSize = this.f22577k.getResources().getDimensionPixelSize(C3748h.q.f66345dd);
            if (this.f66109wvg) {
                dimensionPixelSize = 0;
            }
            marginLayoutParams.bottomMargin = dimensionPixelSize;
            this.f22579p.setLayoutParams(marginLayoutParams);
            View view2 = this.f22579p;
            if (view2 instanceof DefaultTimeBar) {
                DefaultTimeBar defaultTimeBar = (DefaultTimeBar) view2;
                if (this.f66109wvg) {
                    defaultTimeBar.m13170s(true);
                } else {
                    int i2 = this.f66105o1t;
                    if (i2 == 1) {
                        defaultTimeBar.m13170s(false);
                    } else if (i2 != 3) {
                        defaultTimeBar.m13168i();
                    }
                }
            }
        }
        for (View view3 : this.f22584z) {
            view3.setVisibility((this.f66109wvg && hb(view3)) ? 4 : 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n5r1(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        boolean zEk5k = ek5k();
        if (this.f66109wvg != zEk5k) {
            this.f66109wvg = zEk5k;
            view.post(new Runnable() { // from class: com.google.android.exoplayer2.ui.t
                @Override // java.lang.Runnable
                public final void run() {
                    this.f22844k.m13273m();
                }
            });
        }
        boolean z2 = i4 - i2 != i8 - i6;
        if (this.f66109wvg || !z2) {
            return;
        }
        view.post(new Runnable() { // from class: com.google.android.exoplayer2.ui.fti
            @Override // java.lang.Runnable
            public final void run() {
                this.f22610k.hyr();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void nn86(int i2) {
        int i3 = this.f66105o1t;
        this.f66105o1t = i2;
        if (i2 == 2) {
            this.f22577k.setVisibility(8);
        } else if (i3 == 2) {
            this.f22577k.setVisibility(0);
        }
        if (i3 != i2) {
            this.f22577k.bf2();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public void m13275o() {
        if (!this.f66102mcp) {
            nn86(0);
            uv6();
            return;
        }
        int i2 = this.f66105o1t;
        if (i2 == 1) {
            this.f66100kja0.start();
        } else if (i2 == 2) {
            this.f22575h.start();
        } else if (i2 == 3) {
            this.f22582t = true;
        } else if (i2 == 4) {
            return;
        }
        uv6();
    }

    private static int o1t(@zy.dd View view) {
        if (view == null) {
            return 0;
        }
        int height = view.getHeight();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return height;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return height + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public /* synthetic */ void m13278r(ValueAnimator valueAnimator) {
        m13282z(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: renamed from: t */
    private static int m13280t(@zy.dd View view) {
        if (view == null) {
            return 0;
        }
        int width = view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return width;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return width + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
    }

    /* JADX INFO: renamed from: z */
    private void m13282z(float f2) {
        if (this.f22583y != null) {
            this.f22583y.setTranslationX((int) (r0.getWidth() * (1.0f - f2)));
        }
        ViewGroup viewGroup = this.f22581s;
        if (viewGroup != null) {
            viewGroup.setAlpha(1.0f - f2);
        }
        ViewGroup viewGroup2 = this.f22574g;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(1.0f - f2);
        }
    }

    public boolean d3() {
        return this.f66102mcp;
    }

    /* JADX INFO: renamed from: e */
    public void m13283e(@zy.dd View view, boolean z2) {
        if (view == null) {
            return;
        }
        if (!z2) {
            view.setVisibility(8);
            this.f22584z.remove(view);
            return;
        }
        if (this.f66109wvg && hb(view)) {
            view.setVisibility(4);
        } else {
            view.setVisibility(0);
        }
        this.f22584z.add(view);
    }

    public void fti() {
        int i2 = this.f66105o1t;
        if (i2 == 3 || i2 == 2) {
            return;
        }
        lrht();
        a9();
    }

    /* JADX INFO: renamed from: j */
    public void m13284j() {
        if (!this.f22577k.m13222b()) {
            this.f22577k.setVisibility(0);
            this.f22577k.m13225u();
            this.f22577k.m13226x();
        }
        m13275o();
    }

    /* JADX INFO: renamed from: l */
    public void m13285l(boolean z2, int i2, int i3, int i4, int i5) {
        View view = this.f66108toq;
        if (view != null) {
            view.layout(0, 0, i4 - i2, i5 - i3);
        }
    }

    public void lrht() {
        this.f22577k.removeCallbacks(this.f66104ni7);
        this.f22577k.removeCallbacks(this.f22576i);
        this.f22577k.removeCallbacks(this.f66111zurt);
        this.f22577k.removeCallbacks(this.f66097fn3e);
    }

    public void mcp() {
        int i2 = this.f66105o1t;
        if (i2 == 3 || i2 == 2) {
            return;
        }
        lrht();
        if (!this.f66102mcp) {
            a9();
        } else if (this.f66105o1t == 1) {
            gvn7();
        } else {
            jk();
        }
    }

    public void ncyb() {
        this.f22577k.removeOnLayoutChangeListener(this.f66098fu4);
    }

    public boolean oc() {
        return this.f66105o1t == 0 && this.f22577k.m13222b();
    }

    public void uv6() {
        if (this.f66105o1t == 3) {
            return;
        }
        lrht();
        int showTimeoutMs = this.f22577k.getShowTimeoutMs();
        if (showTimeoutMs > 0) {
            if (!this.f66102mcp) {
                m13267c(this.f66104ni7, showTimeoutMs);
            } else if (this.f66105o1t == 1) {
                m13267c(this.f66097fn3e, 2000L);
            } else {
                m13267c(this.f66111zurt, showTimeoutMs);
            }
        }
    }

    public void vyq(boolean z2) {
        this.f66102mcp = z2;
    }

    public boolean wvg(@zy.dd View view) {
        return view != null && this.f22584z.contains(view);
    }

    public void x9kr() {
        this.f22577k.addOnLayoutChangeListener(this.f66098fu4);
    }
}
