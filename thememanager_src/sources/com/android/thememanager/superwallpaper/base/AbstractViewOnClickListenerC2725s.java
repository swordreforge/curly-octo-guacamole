package com.android.thememanager.superwallpaper.base;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.thememanager.R;
import com.android.thememanager.activity.kja0;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.guideview.RestoreHomeIconHelper;
import com.android.thememanager.basemodule.utils.C1812k;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.utils.lvui;
import com.android.thememanager.basemodule.utils.y9n;
import com.android.thememanager.module.detail.view.C2258d;
import com.android.thememanager.settings.C2687z;
import com.android.thememanager.superwallpaper.base.AbstractC2723p;
import com.android.thememanager.superwallpaper.view.SuperWallpaperPreviewLayout;
import com.android.thememanager.superwallpaper.view.SuperWallpaperProgressBar;
import com.android.thememanager.util.dd;
import com.android.thememanager.widget.LinearGradientView;
import cv06.InterfaceC5977k;
import h7am.C6071k;
import i1.C6077k;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.android.thememanager.superwallpaper.base.s */
/* JADX INFO: compiled from: BaseSuperWallpaperDetailActivity.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractViewOnClickListenerC2725s extends kja0 implements InterfaceC5977k, View.OnClickListener, ld6, AbstractC2723p.k, RestoreHomeIconHelper.toq {
    public static final int aj = 1;
    private static final long ar = 250;
    private static final long bc = 220;
    private static final int bd = 300;
    public static final int be = 0;
    public static final int bs = 2;
    private static final long bu = 500;
    private static final int k0 = 100;

    /* JADX INFO: renamed from: a */
    private GestureDetector f16116a;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private TextView f61150ab;
    private ValueAnimator ac;
    private long ad;
    private C2258d am;
    private View an;
    private View as;
    private AbstractC2721k ax;
    private p000a.zy ay = new k();
    private View az;

    /* JADX INFO: renamed from: b */
    private SuperWallpaperPreviewLayout f16117b;
    private RecyclerView ba;
    private TextView bb;
    private View bg;
    private ImageView bl;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private TextView f61151bo;
    private TextView bp;
    private LinearGradientView bq;
    private TextView bv;

    /* JADX INFO: renamed from: c */
    protected boolean f16118c;

    /* JADX INFO: renamed from: d */
    private TextView f16119d;

    /* JADX INFO: renamed from: e */
    protected View f16120e;
    private ImageView id;
    private ImageView in;

    /* JADX INFO: renamed from: j */
    protected AbstractC2723p f16121j;

    /* JADX INFO: renamed from: m */
    private SuperWallpaperProgressBar f16122m;

    /* JADX INFO: renamed from: o */
    protected ArrayList<InterfaceC5977k.k> f16123o;

    /* JADX INFO: renamed from: u */
    private TextView f16124u;

    /* JADX INFO: renamed from: v */
    private TextView f16125v;

    /* JADX INFO: renamed from: w */
    private TextView f16126w;

    /* JADX INFO: renamed from: x */
    protected InterfaceC5977k.toq f16127x;

    /* JADX INFO: renamed from: com.android.thememanager.superwallpaper.base.s$k */
    /* JADX INFO: compiled from: BaseSuperWallpaperDetailActivity.java */
    class k implements p000a.zy {
        k() {
        }

        @Override // p000a.zy
        /* JADX INFO: renamed from: k */
        public void mo0k() {
            C2687z.kja0();
            AbstractViewOnClickListenerC2725s.this.se();
        }

        @Override // p000a.zy
        public void toq(boolean openDialog) {
            if (openDialog) {
                lvui.ki(AbstractViewOnClickListenerC2725s.this, false);
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.superwallpaper.base.s$toq */
    /* JADX INFO: compiled from: BaseSuperWallpaperDetailActivity.java */
    class toq implements GestureDetector.OnGestureListener {
        toq() {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent e2) {
            return false;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
            if (e1 != null && e2 != null && !AbstractViewOnClickListenerC2725s.this.f16118c) {
                if (e1.getRawX() - e2.getRawX() < 100.0f) {
                    AbstractViewOnClickListenerC2725s abstractViewOnClickListenerC2725s = AbstractViewOnClickListenerC2725s.this;
                    if (abstractViewOnClickListenerC2725s.f16127x != InterfaceC5977k.toq.AOD) {
                        abstractViewOnClickListenerC2725s.o1t(false);
                    }
                    return true;
                }
                if (e2.getRawX() - e1.getRawX() < 100.0f) {
                    AbstractViewOnClickListenerC2725s abstractViewOnClickListenerC2725s2 = AbstractViewOnClickListenerC2725s.this;
                    if (abstractViewOnClickListenerC2725s2.f16127x != InterfaceC5977k.toq.DESKTOP) {
                        abstractViewOnClickListenerC2725s2.o1t(true);
                    }
                    return true;
                }
            }
            return false;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent e2) {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
            return false;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public void onShowPress(MotionEvent e2) {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent e2) {
            AbstractViewOnClickListenerC2725s abstractViewOnClickListenerC2725s = AbstractViewOnClickListenerC2725s.this;
            if (abstractViewOnClickListenerC2725s.f16118c) {
                return true;
            }
            abstractViewOnClickListenerC2725s.o1t(true);
            return true;
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.superwallpaper.base.s$zy */
    /* JADX INFO: compiled from: BaseSuperWallpaperDetailActivity.java */
    static /* synthetic */ class zy {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ int[] f16130k;

        static {
            int[] iArr = new int[InterfaceC5977k.k.EnumC8043k.values().length];
            f16130k = iArr;
            try {
                iArr[InterfaceC5977k.k.EnumC8043k.SCENE_CHANGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16130k[InterfaceC5977k.k.EnumC8043k.SCENE_PAUSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16130k[InterfaceC5977k.k.EnumC8043k.SCENE_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16130k[InterfaceC5977k.k.EnumC8043k.SCENE_DESTROY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private void b3e() {
        Animator animatorLd6 = this.f16117b.ld6(!this.f16118c);
        Animator animatorF7l8 = this.f16122m.f7l8(!this.f16118c);
        ArrayList arrayList = new ArrayList();
        if (animatorLd6 != null) {
            arrayList.add(animatorLd6);
        }
        if (animatorF7l8 != null) {
            arrayList.add(animatorF7l8);
        }
        AnimatorSet animatorSet = null;
        if (arrayList.size() > 0) {
            animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
        }
        if (animatorSet != null) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.setDuration(300L);
            if (this.f16118c) {
                animatorSet2.playSequentially(animatorSet, this.ac);
            } else {
                animatorSet2.playSequentially(this.ac, animatorSet);
            }
            animatorSet2.start();
        } else {
            this.ac.start();
        }
        this.bq.toq(this.f16118c);
    }

    private InterfaceC5977k.toq cv06() {
        return InterfaceC5977k.toq.AOD;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ebn() {
        this.f16121j.ld6(this);
    }

    private void lh(TextView textView, String info) {
        if (TextUtils.isEmpty(info)) {
            textView.setVisibility(8);
        } else {
            textView.setText(info);
            textView.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void nsb() {
        this.f16120e.animate().alpha(0.0f).setDuration(bc).setStartDelay(500L).setInterpolator(AnimationUtils.loadInterpolator(this, 17563663)).withEndAction(new Runnable() { // from class: com.android.thememanager.superwallpaper.base.y
            @Override // java.lang.Runnable
            public final void run() {
                this.f16133k.pc();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void pc() {
        this.f16120e.setVisibility(4);
    }

    private void pjz9(boolean hasLandPosition) {
        if (!hasLandPosition) {
            this.as.setVisibility(8);
        } else {
            this.as.setVisibility(0);
            this.f61151bo.setText(this.f16121j.mo9490g());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void se() {
        if (!C1819o.m7153f() || PreferenceManager.getDefaultSharedPreferences(this).getBoolean(C2258d.bb, false)) {
            this.f16121j.ld6(this);
            return;
        }
        if (this.am == null) {
            C2258d c2258dEl = C2258d.el(true);
            this.am = c2258dEl;
            c2258dEl.imd(new C2258d.zy() { // from class: com.android.thememanager.superwallpaper.base.n
                @Override // com.android.thememanager.module.detail.view.C2258d.zy
                /* JADX INFO: renamed from: k */
                public final void mo8402k() {
                    this.f16109k.ebn();
                }
            });
        }
        this.am.cyoe(getSupportFragmentManager(), null);
    }

    private boolean ukdy() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z2 = jCurrentTimeMillis - this.ad < 300;
        this.ad = jCurrentTimeMillis;
        return z2;
    }

    private void wx16() {
        this.f16116a = new GestureDetector(this, new toq());
    }

    private void yl() {
        ImageView imageView = (ImageView) findViewById(R.id.choose_position_back_btn);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.superwallpaper.base.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f16106k.onClick(view);
            }
        });
        imageView.setBackground(getDrawable(R.drawable.btn_half_tran_bg));
        C6077k.m22369i(imageView);
        C1812k.m7106k(imageView, R.string.accessibiliy_description_content_back);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void zwy(ValueAnimator valueAnimator) {
        if (this.an == null || this.f16122m == null) {
            return;
        }
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (!this.f16118c) {
            fFloatValue = 1.0f - fFloatValue;
        }
        this.an.setAlpha(fFloatValue);
        if (fFloatValue > 0.0f && this.an.getVisibility() != 0) {
            this.an.setVisibility(0);
        }
        if (fFloatValue == 0.0f) {
            this.an.setVisibility(8);
        }
    }

    protected abstract int bek6();

    public void bz2() {
        this.f16121j.toq();
        ArrayMap arrayMap = new ArrayMap(2);
        arrayMap.put("title", vep5());
        arrayMap.put(com.android.thememanager.basemodule.analysis.toq.gg7, Integer.valueOf(this.f16121j.m9496y()));
        C1708s.f7l8().ld6().ni7(C1706p.n7h(h7am(), "APPLY", arrayMap));
        com.android.thememanager.basemodule.analysis.kja0.m6641s("T_CLICK", h7am(), "APPLY", this.f16121j.m9496y() + "");
    }

    @Override // com.android.thememanager.superwallpaper.base.ld6
    public Activity getActivity() {
        return this;
    }

    public void gvn7(boolean isSuccess) {
    }

    protected abstract String h7am();

    protected void ixz() {
        this.bg = findViewById(R.id.apply_btn_container);
        this.as = findViewById(R.id.choose_position_btn_container);
        this.az = findViewById(R.id.back_btn_container);
        C1819o.kja0(this, (ViewGroup) findViewById(R.id.back_btn_container));
        this.id = (ImageView) findViewById(R.id.apply_super_wallpaper_blur_bg);
        this.in = (ImageView) findViewById(R.id.choose_super_wallpaper_blur_bg);
        this.bl = (ImageView) findViewById(R.id.back_blur_bg);
        this.id.setBackgroundResource(R.drawable.super_wallpaper_btn_not_support_blur_bg);
        this.in.setBackgroundResource(R.drawable.super_wallpaper_btn_not_support_blur_bg);
        this.bl.setBackgroundResource(R.drawable.btn_half_tran_bg);
        SuperWallpaperProgressBar superWallpaperProgressBar = (SuperWallpaperProgressBar) findViewById(R.id.progressbar_container);
        this.f16122m = superWallpaperProgressBar;
        superWallpaperProgressBar.setSuperWallpaperScene(this);
        SuperWallpaperPreviewLayout superWallpaperPreviewLayout = (SuperWallpaperPreviewLayout) findViewById(R.id.super_wallpaper_preview);
        this.f16117b = superWallpaperPreviewLayout;
        superWallpaperPreviewLayout.setPresenter(this.f16121j);
        TextView textView = (TextView) findViewById(R.id.apply_super_wallpaper_button);
        this.f16124u = textView;
        dd.m9704k(textView, dd.f16402k);
        this.f16124u.setOnClickListener(this);
        TextView textView2 = (TextView) findViewById(R.id.choose_super_wallpaper_button);
        this.f61151bo = textView2;
        dd.m9704k(textView2, dd.f16402k);
        this.f61151bo.setOnClickListener(this);
        TextView textView3 = (TextView) findViewById(R.id.position_title);
        this.f16125v = textView3;
        dd.m9704k(textView3, dd.f16403q);
        TextView textView4 = (TextView) findViewById(R.id.position_content);
        this.bv = textView4;
        dd.m9704k(textView4, dd.f61228toq);
        this.ba = (RecyclerView) findViewById(R.id.position_list);
        TextView textView5 = (TextView) findViewById(R.id.view_height_title);
        this.f16126w = textView5;
        dd.m9704k(textView5, dd.f61228toq);
        TextView textView6 = (TextView) findViewById(R.id.view_height_value);
        this.f61150ab = textView6;
        dd.m9704k(textView6, dd.f61229zy);
        TextView textView7 = (TextView) findViewById(R.id.coordinate_longitude);
        this.bb = textView7;
        dd.m9704k(textView7, dd.f61229zy);
        TextView textView8 = (TextView) findViewById(R.id.coordinate_latitude);
        this.bp = textView8;
        dd.m9704k(textView8, dd.f61229zy);
        TextView textView9 = (TextView) findViewById(R.id.coordinate_title);
        this.f16119d = textView9;
        dd.m9704k(textView9, dd.f61228toq);
        this.bv = (TextView) findViewById(R.id.position_content);
        this.ba = (RecyclerView) findViewById(R.id.position_list);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(0);
        this.ba.setLayoutManager(linearLayoutManager);
        this.bq = (LinearGradientView) findViewById(R.id.super_wallpaper_mask);
        View viewFindViewById = findViewById(R.id.choose_container);
        this.an = viewFindViewById;
        viewFindViewById.setAlpha(0.0f);
        this.an.setVisibility(8);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.ac = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        this.ac.setDuration(250L);
        this.ac.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.android.thememanager.superwallpaper.base.f7l8
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f16105k.zwy(valueAnimator);
            }
        });
        this.f16120e = findViewById(R.id.loading);
        yl();
        wx16();
        y9n.o1t(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void jbh() {
        this.f16120e.post(new Runnable() { // from class: com.android.thememanager.superwallpaper.base.q
            @Override // java.lang.Runnable
            public final void run() {
                this.f16115k.nsb();
            }
        });
    }

    protected abstract AbstractC2723p ktq();

    public AbstractC2723p mbx() {
        return this.f16121j;
    }

    protected void n2t(InterfaceC5977k.k.EnumC8043k event) {
        for (InterfaceC5977k.k kVar : this.f16123o) {
            int i2 = zy.f16130k[event.ordinal()];
            if (i2 == 1) {
                kVar.mo9489k(this.f16127x);
            } else if (i2 == 2) {
                kVar.toq();
            } else if (i2 == 3) {
                kVar.zy();
            } else if (i2 == 4) {
                kVar.mo9524q();
            }
        }
    }

    @Override // com.android.thememanager.basemodule.guideview.RestoreHomeIconHelper.toq
    public void ni7() {
    }

    @Override // cv06.InterfaceC5977k
    public void o1t(boolean isSequence) {
        InterfaceC5977k.toq[] toqVarArrValues = InterfaceC5977k.toq.values();
        int i2 = isSequence ? 1 : -1;
        InterfaceC5977k.toq toqVar = this.f16127x;
        if (toqVar == null) {
            this.f16127x = cv06();
        } else {
            this.f16127x = toqVarArrValues[((toqVar.index() + toqVarArrValues.length) + i2) % toqVarArrValues.length];
        }
        Log.d(C6071k.f35077k, "BaseSuperWallpaperDetailActivity changeScene:" + this.f16127x);
        n2t(InterfaceC5977k.k.EnumC8043k.SCENE_CHANGE);
    }

    @Override // com.android.thememanager.activity.kja0, com.android.thememanager.basemodule.base.AbstractActivityC1717k, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        this.f16117b.setVisibility(8);
        super.onBackPressed();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v2) {
        if (ukdy()) {
            return;
        }
        int id = v2.getId();
        if (id == R.id.choose_position_back_btn) {
            finish();
            return;
        }
        if (id == R.id.apply_super_wallpaper_button) {
            if (lvui.qrj(this, this.ay)) {
                return;
            }
            se();
            return;
        }
        if (id == R.id.choose_super_wallpaper_button) {
            boolean z2 = !this.f16118c;
            this.f16118c = z2;
            if (z2) {
                this.ba.scrollToPosition(this.f16121j.m9496y());
                this.f61151bo.setSelected(true);
                this.f61151bo.setTextColor(getResources().getColor(R.color.super_wallpaper_select_btn_text_color));
                b3e();
                this.f16127x = InterfaceC5977k.toq.DESKTOP;
                n2t(InterfaceC5977k.k.EnumC8043k.SCENE_CHANGE);
                n2t(InterfaceC5977k.k.EnumC8043k.SCENE_PAUSE);
            } else {
                b3e();
                this.f61151bo.setSelected(false);
                this.f61151bo.setTextColor(getResources().getColor(R.color.super_wallpaper_btn_text_color));
                n2t(InterfaceC5977k.k.EnumC8043k.SCENE_CHANGE);
            }
            ArrayMap arrayMap = new ArrayMap(2);
            arrayMap.put("title", vep5());
            C1708s.f7l8().ld6().ni7(C1706p.n7h(h7am(), com.android.thememanager.basemodule.analysis.toq.sm, arrayMap));
            com.android.thememanager.basemodule.analysis.kja0.m6641s("T_CLICK", h7am(), com.android.thememanager.basemodule.analysis.toq.sm, vep5());
        }
    }

    @Override // com.android.thememanager.activity.kja0, com.android.thememanager.basemodule.base.AbstractActivityC1717k, miuix.appcompat.app.t8r, androidx.fragment.app.ActivityC0891q, androidx.activity.ComponentActivity, androidx.core.app.cdj, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        sok();
        C1819o.vyq(this);
        super.onCreate(savedInstanceState);
        if (!zkd()) {
            finish();
            return;
        }
        this.f16121j = ktq();
        ixz();
        uc();
        ArrayMap arrayMap = new ArrayMap(2);
        arrayMap.put("title", vep5());
        C1708s.f7l8().ld6().n5r1(com.android.thememanager.basemodule.analysis.toq.cjaj, C1706p.n7h(h7am(), null, arrayMap));
        com.android.thememanager.basemodule.analysis.kja0.m6641s(com.android.thememanager.basemodule.analysis.toq.cjaj, h7am(), null, vep5());
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, miuix.appcompat.app.t8r, androidx.fragment.app.ActivityC0891q, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        if (this.f16123o != null) {
            n2t(InterfaceC5977k.k.EnumC8043k.SCENE_DESTROY);
        }
    }

    @Override // com.android.thememanager.activity.kja0, com.android.thememanager.basemodule.base.AbstractActivityC1717k, androidx.fragment.app.ActivityC0891q, android.app.Activity
    protected void onPause() {
        super.onPause();
        n2t(InterfaceC5977k.k.EnumC8043k.SCENE_PAUSE);
        Log.d(C6071k.f35077k, "BaseSuperWallpaperDetailActivity onPause:");
    }

    @Override // com.android.thememanager.activity.kja0, com.android.thememanager.basemodule.base.AbstractActivityC1717k, androidx.fragment.app.ActivityC0891q, android.app.Activity
    protected void onResume() {
        super.onResume();
        n2t(InterfaceC5977k.k.EnumC8043k.SCENE_RESUME);
        Log.d(C6071k.f35077k, "BaseSuperWallpaperDetailActivity onResume:" + this.f16118c);
    }

    @Override // android.app.Activity
    public boolean onTouchEvent(MotionEvent event) {
        return this.f16116a.onTouchEvent(event);
    }

    @Override // com.android.thememanager.activity.kja0
    protected int r8s8() {
        return R.layout.activity_super_wallpaper_detail;
    }

    protected void uc() {
        ArrayList<InterfaceC5977k.k> arrayList = new ArrayList<>();
        this.f16123o = arrayList;
        arrayList.add(this.f16122m);
        this.f16123o.add(this.f16117b);
        this.f16121j.m9491k(this);
        this.f16121j.m9491k(this.f16117b);
    }

    protected abstract AbstractC2721k uj2j();

    protected abstract String vep5();

    public void vyq(int position) {
        if (this.f16121j.f7l8() == null) {
            return;
        }
        if (this.ba != null && this.ax != null && this.f16121j.f7l8() != null && !this.f16118c) {
            this.ba.smoothScrollToPosition(position);
        }
        Log.d(C6071k.f35077k, "BaseSuperWallpaperDetailActivity onLandPositionChanged:" + position);
        for (vep5.toq toqVar : this.f16121j.f7l8()) {
            if (toqVar.m28105g() == this.f16121j.m9496y()) {
                lh(this.f16125v, toqVar.m28110p());
                lh(this.bv, toqVar.toq());
                String strX2 = toqVar.x2();
                if (TextUtils.isEmpty(strX2)) {
                    this.f16126w.setVisibility(8);
                    this.f61150ab.setVisibility(8);
                } else {
                    this.f61150ab.setText(strX2);
                    this.f16126w.setVisibility(0);
                    this.f61150ab.setVisibility(0);
                }
                lh(this.bb, toqVar.m28111q());
                lh(this.bp, toqVar.zy());
                if (TextUtils.isEmpty(toqVar.m28111q()) && TextUtils.isEmpty(toqVar.zy())) {
                    this.f16119d.setVisibility(8);
                } else {
                    this.f16119d.setVisibility(0);
                }
            }
        }
    }

    @Override // com.android.thememanager.superwallpaper.base.ld6
    public void wvg() {
        Log.d(C6071k.f35077k, "BaseSuperWallpaperDetailActivity onLandDataLoadFinished");
        ArrayList<vep5.toq> arrayListF7l8 = this.f16121j.f7l8();
        boolean z2 = arrayListF7l8 != null && arrayListF7l8.size() > 1;
        if (z2) {
            if (this.ax == null) {
                AbstractC2721k abstractC2721kUj2j = uj2j();
                this.ax = abstractC2721kUj2j;
                this.ba.setAdapter(abstractC2721kUj2j);
            }
            this.ax.notifyDataSetChanged();
        }
        pjz9(z2);
        findViewById(R.id.btn_container).setVisibility(0);
        o1t(true);
    }

    protected abstract boolean zkd();

    @Override // cv06.InterfaceC5977k
    public InterfaceC5977k.toq zurt() {
        return this.f16127x;
    }
}
