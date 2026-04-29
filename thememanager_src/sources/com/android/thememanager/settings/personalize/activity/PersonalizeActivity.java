package com.android.thememanager.settings.personalize.activity;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.graphics.Outline;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Looper;
import android.os.MessageQueue;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.fti;
import androidx.lifecycle.jp0y;
import androidx.recyclerview.widget.RecyclerView;
import com.android.thememanager.R;
import com.android.thememanager.ThemeResourceProxyTabActivity;
import com.android.thememanager.activity.ThemePreferenceActivity;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.base.AbstractActivityC1717k;
import com.android.thememanager.basemodule.base.C1723y;
import com.android.thememanager.basemodule.network.theme.model.CommonResponse;
import com.android.thememanager.basemodule.privacy.C1781k;
import com.android.thememanager.basemodule.utils.C1812k;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.utils.a9;
import com.android.thememanager.basemodule.utils.lvui;
import com.android.thememanager.basemodule.utils.mcp;
import com.android.thememanager.basemodule.utils.nn86;
import com.android.thememanager.basemodule.utils.o1t;
import com.android.thememanager.basemodule.utils.x9kr;
import com.android.thememanager.basemodule.utils.y9n;
import com.android.thememanager.lockscreen.lock.ClockInfo;
import com.android.thememanager.lockscreen.lock.DoodleInfo;
import com.android.thememanager.lockscreen.lock.SignatureInfo;
import com.android.thememanager.lockscreen.lock.TemplateConfig;
import com.android.thememanager.lockscreen.lock.WallpaperInfo;
import com.android.thememanager.ncyb;
import com.android.thememanager.recommend.model.entity.element.PersonalizeRecommendTitleElement;
import com.android.thememanager.recommend.model.entity.element.SettingStaggerLocalBannerGroupElement;
import com.android.thememanager.recommend.view.listview.C2367n;
import com.android.thememanager.router.recommend.entity.IRecommendListView;
import com.android.thememanager.router.recommend.entity.UIDrawableWithLink;
import com.android.thememanager.router.recommend.entity.UIElement;
import com.android.thememanager.router.recommend.entity.UILink;
import com.android.thememanager.router.recommend.entity.UIPage;
import com.android.thememanager.settings.ViewOnClickListenerC2517i;
import com.android.thememanager.settings.personalize.presenter.InterfaceC2579k;
import com.android.thememanager.settings.personalize.presenter.PersonalizeViewModel;
import com.android.thememanager.settings.personalize.view.LockScreenCardView;
import com.android.thememanager.settings.personalize.view.ThemeCardView;
import com.android.thememanager.settings.personalize.view.WallpaperCardView;
import com.android.thememanager.settings.presenter.ThemeSettingsPresenter;
import com.android.thememanager.settings.superwallpaper.utils.C2663k;
import com.android.thememanager.settings.superwallpaper.utils.C2670y;
import com.android.thememanager.settings.superwallpaper.widget.FindMoreButton;
import com.android.thememanager.view.ThemePreferenceView;
import com.android.thememanager.wallpaper.C2949g;
import com.android.thememanager.wallpaper.InterfaceC2950k;
import cyoe.InterfaceC5979h;
import i1.C6077k;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.C6318m;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.intrinsics.C6199q;
import kotlin.coroutines.jvm.internal.InterfaceC6205g;
import kotlin.jvm.internal.AbstractC6308r;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.ni7;
import kotlin.was;
import kotlinx.coroutines.C6481a;
import kotlinx.coroutines.C6708p;
import kotlinx.coroutines.InterfaceC6556f;
import kotlinx.coroutines.dd;
import miuix.appcompat.app.AbstractC6946k;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import p023g.C6045k;
import uj2j.C7688k;
import uj2j.C7689q;
import yz.C7794k;

/* JADX INFO: compiled from: PersonalizeActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class PersonalizeActivity extends AbstractActivityC1717k implements View.OnClickListener, InterfaceC2950k, InterfaceC2579k<PersonalizeViewModel> {

    @InterfaceC7396q
    public static final C2537k ad = new C2537k(null);

    @InterfaceC7396q
    public static final String aj = "com.android.thememanager.action.REQUEST_PERMISSION";

    @InterfaceC7396q
    private static final String am = "PersonalizeActivity";
    public static final float ay = 0.5935185f;
    public static final float be = 0.30648148f;

    /* JADX INFO: renamed from: a */
    private IRecommendListView f15180a;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private int f60803ab;
    private boolean as;
    private boolean az;

    /* JADX INFO: renamed from: b */
    private com.android.thememanager.settings.personalize.f7l8 f15181b;
    private int bb;
    private boolean bg;

    @InterfaceC7395n
    private View bl;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private RecyclerView f60804bo;
    private int bp;

    /* JADX INFO: renamed from: c */
    private ThemePreferenceView f15182c;

    /* JADX INFO: renamed from: d */
    private PersonalizeViewModel f15183d;

    /* JADX INFO: renamed from: e */
    private ThemePreferenceView f15184e;

    /* JADX INFO: renamed from: f */
    private WallpaperCardView f15185f;

    @InterfaceC7395n
    private TextView id;

    @InterfaceC7395n
    private FindMoreButton in;

    /* JADX INFO: renamed from: j */
    private ThemePreferenceView f15186j;

    /* JADX INFO: renamed from: l */
    private ThemeCardView f15187l;

    /* JADX INFO: renamed from: m */
    private ThemePreferenceView f15188m;

    /* JADX INFO: renamed from: o */
    private ThemePreferenceView f15189o;

    /* JADX INFO: renamed from: r */
    private LockScreenCardView f15190r;

    /* JADX INFO: renamed from: u */
    private View f15191u;

    /* JADX INFO: renamed from: v */
    private ViewStub f15192v;

    /* JADX INFO: renamed from: w */
    private int f15193w;

    /* JADX INFO: renamed from: x */
    private ThemeSettingsPresenter f15194x;

    @InterfaceC7396q
    private final AtomicBoolean bv = new AtomicBoolean(false);

    @InterfaceC7396q
    private final AtomicBoolean an = new AtomicBoolean(false);

    @InterfaceC7396q
    private final jp0y<Intent> ba = new jp0y() { // from class: com.android.thememanager.settings.personalize.activity.ld6
        @Override // androidx.lifecycle.jp0y
        public final void toq(Object obj) {
            PersonalizeActivity.g0ad(this.f15208k, (Intent) obj);
        }
    };

    @InterfaceC7396q
    private final p000a.zy ax = new t8r();

    @InterfaceC7396q
    private final jp0y<Intent> bq = new jp0y() { // from class: com.android.thememanager.settings.personalize.activity.x2
        @Override // androidx.lifecycle.jp0y
        public final void toq(Object obj) {
            PersonalizeActivity.imd(this.f15215k, (Intent) obj);
        }
    };

    @InterfaceC7396q
    private final ViewOutlineProvider ac = new C2536i();

    /* JADX INFO: compiled from: PersonalizeActivity.kt */
    public static final class cdj extends RecyclerView.fn3e {
        cdj() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.fn3e
        public void onScrollStateChanged(@InterfaceC7396q RecyclerView recyclerView, int i2) {
            d2ok.m23075h(recyclerView, "recyclerView");
            PersonalizeActivity.this.bp = i2;
            super.onScrollStateChanged(recyclerView, i2);
            PersonalizeActivity.this.vy(0);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.fn3e
        public void onScrolled(@InterfaceC7396q RecyclerView recyclerView, int i2, int i3) {
            d2ok.m23075h(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i2, i3);
            PersonalizeActivity.this.bb += i3;
            PersonalizeActivity.this.lw();
            PersonalizeActivity.this.vy(i3);
            PersonalizeActivity.this.wlev();
        }
    }

    /* JADX INFO: compiled from: PersonalizeActivity.kt */
    static final class f7l8 extends AbstractC6308r implements cyoe.x2<TemplateConfig, was> {
        f7l8() {
            super(1);
        }

        @Override // cyoe.x2
        public /* bridge */ /* synthetic */ was invoke(TemplateConfig templateConfig) {
            invoke2(templateConfig);
            return was.f36763k;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(TemplateConfig templateConfig) {
            if (templateConfig != null) {
                PersonalizeActivity personalizeActivity = PersonalizeActivity.this;
                WallpaperInfo wallpaperInfo = templateConfig.getWallpaperInfo();
                PersonalizeViewModel personalizeViewModel = null;
                if ((wallpaperInfo != null ? Integer.valueOf(wallpaperInfo.getMagicType()) : null) == null) {
                    return;
                }
                PersonalizeViewModel personalizeViewModel2 = personalizeActivity.f15183d;
                if (personalizeViewModel2 == null) {
                    d2ok.n5r1("mVM");
                    personalizeViewModel2 = null;
                }
                Integer numM4388g = personalizeViewModel2.y2().m4388g();
                WallpaperInfo wallpaperInfo2 = templateConfig.getWallpaperInfo();
                if (!d2ok.f7l8(numM4388g, wallpaperInfo2 != null ? Integer.valueOf(wallpaperInfo2.getMagicType()) : null)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("MagicTypeData changed new magicType is ");
                    WallpaperInfo wallpaperInfo3 = templateConfig.getWallpaperInfo();
                    sb.append(wallpaperInfo3 != null ? Integer.valueOf(wallpaperInfo3.getMagicType()) : null);
                    Log.d(PersonalizeActivity.am, sb.toString());
                    PersonalizeViewModel personalizeViewModel3 = personalizeActivity.f15183d;
                    if (personalizeViewModel3 == null) {
                        d2ok.n5r1("mVM");
                        personalizeViewModel3 = null;
                    }
                    fti<Integer> ftiVarY2 = personalizeViewModel3.y2();
                    WallpaperInfo wallpaperInfo4 = templateConfig.getWallpaperInfo();
                    ftiVarY2.cdj(wallpaperInfo4 != null ? Integer.valueOf(wallpaperInfo4.getMagicType()) : null);
                }
                PersonalizeViewModel personalizeViewModel4 = personalizeActivity.f15183d;
                if (personalizeViewModel4 == null) {
                    d2ok.n5r1("mVM");
                    personalizeViewModel4 = null;
                }
                Boolean boolM4388g = personalizeViewModel4.m9087u().m4388g();
                WallpaperInfo wallpaperInfo5 = templateConfig.getWallpaperInfo();
                if (!d2ok.f7l8(boolM4388g, wallpaperInfo5 != null ? Boolean.valueOf(wallpaperInfo5.getEnableBlur()) : null)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("EnableBlurData changed");
                    WallpaperInfo wallpaperInfo6 = templateConfig.getWallpaperInfo();
                    sb2.append(wallpaperInfo6 != null ? Boolean.valueOf(wallpaperInfo6.getEnableBlur()) : null);
                    Log.d(PersonalizeActivity.am, sb2.toString());
                    PersonalizeViewModel personalizeViewModel5 = personalizeActivity.f15183d;
                    if (personalizeViewModel5 == null) {
                        d2ok.n5r1("mVM");
                        personalizeViewModel5 = null;
                    }
                    fti<Boolean> ftiVarM9087u = personalizeViewModel5.m9087u();
                    WallpaperInfo wallpaperInfo7 = templateConfig.getWallpaperInfo();
                    ftiVarM9087u.cdj(wallpaperInfo7 != null ? Boolean.valueOf(wallpaperInfo7.getEnableBlur()) : null);
                }
                ClockInfo clockInfo = templateConfig.getClockInfo();
                PersonalizeViewModel personalizeViewModel6 = personalizeActivity.f15183d;
                if (personalizeViewModel6 == null) {
                    d2ok.n5r1("mVM");
                    personalizeViewModel6 = null;
                }
                if (!d2ok.f7l8(personalizeViewModel6.zp().m4388g(), clockInfo)) {
                    Log.d(PersonalizeActivity.am, "ClockInfoData changed, templateId is " + templateConfig.getClockInfo().getTemplateId());
                    PersonalizeViewModel personalizeViewModel7 = personalizeActivity.f15183d;
                    if (personalizeViewModel7 == null) {
                        d2ok.n5r1("mVM");
                        personalizeViewModel7 = null;
                    }
                    personalizeViewModel7.zp().cdj(templateConfig.getClockInfo());
                }
                SignatureInfo signatureInfo = templateConfig.getSignatureInfo();
                if (signatureInfo != null) {
                    PersonalizeViewModel personalizeViewModel8 = personalizeActivity.f15183d;
                    if (personalizeViewModel8 == null) {
                        d2ok.n5r1("mVM");
                        personalizeViewModel8 = null;
                    }
                    if (!d2ok.f7l8(personalizeViewModel8.c8jq().m4388g(), signatureInfo)) {
                        Log.d(PersonalizeActivity.am, "signatureInfo changed ");
                        PersonalizeViewModel personalizeViewModel9 = personalizeActivity.f15183d;
                        if (personalizeViewModel9 == null) {
                            d2ok.n5r1("mVM");
                            personalizeViewModel9 = null;
                        }
                        personalizeViewModel9.c8jq().cdj(signatureInfo);
                    }
                }
                DoodleInfo doodle = templateConfig.getDoodle();
                if (doodle != null) {
                    PersonalizeViewModel personalizeViewModel10 = personalizeActivity.f15183d;
                    if (personalizeViewModel10 == null) {
                        d2ok.n5r1("mVM");
                        personalizeViewModel10 = null;
                    }
                    if (d2ok.f7l8(personalizeViewModel10.nmn5().m4388g(), doodle)) {
                        return;
                    }
                    Log.d(PersonalizeActivity.am, "DoodleInfoData changed ");
                    PersonalizeViewModel personalizeViewModel11 = personalizeActivity.f15183d;
                    if (personalizeViewModel11 == null) {
                        d2ok.n5r1("mVM");
                    } else {
                        personalizeViewModel = personalizeViewModel11;
                    }
                    personalizeViewModel.nmn5().cdj(doodle);
                }
            }
        }
    }

    /* JADX INFO: compiled from: PersonalizeActivity.kt */
    @InterfaceC6205g(m22755c = "com.android.thememanager.settings.personalize.activity.PersonalizeActivity$updateLockScreenClockView$1", m22756f = "PersonalizeActivity.kt", m22757i = {}, m22758l = {483, 488}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
    static final class fn3e extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super was>, Object> {
        int label;

        fn3e(InterfaceC6216q<? super fn3e> interfaceC6216q) {
            super(2, interfaceC6216q);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            return PersonalizeActivity.this.new fn3e(interfaceC6216q);
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
            return ((fn3e) create(interfaceC6556f, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x009e  */
        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @mub.InterfaceC7395n
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@mub.InterfaceC7396q java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.toq.x2()
                int r1 = r9.label
                java.lang.String r2 = "mVM"
                r3 = 2
                r4 = 1
                java.lang.String r5 = "mLockScreenView"
                r6 = 0
                if (r1 == 0) goto L24
                if (r1 == r4) goto L20
                if (r1 != r3) goto L18
                kotlin.C6318m.n7h(r10)
                goto L9a
            L18:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L20:
                kotlin.C6318m.n7h(r10)
                goto L3c
            L24:
                kotlin.C6318m.n7h(r10)
                com.android.thememanager.settings.personalize.activity.PersonalizeActivity r10 = com.android.thememanager.settings.personalize.activity.PersonalizeActivity.this
                com.android.thememanager.settings.personalize.presenter.PersonalizeViewModel r10 = com.android.thememanager.settings.personalize.activity.PersonalizeActivity.ebn(r10)
                if (r10 != 0) goto L33
                kotlin.jvm.internal.d2ok.n5r1(r2)
                r10 = r6
            L33:
                r9.label = r4
                java.lang.Object r10 = r10.yqrt(r9)
                if (r10 != r0) goto L3c
                return r0
            L3c:
                android.util.Pair r10 = (android.util.Pair) r10
                com.android.thememanager.settings.personalize.activity.PersonalizeActivity r1 = com.android.thememanager.settings.personalize.activity.PersonalizeActivity.this
                com.android.thememanager.settings.personalize.view.LockScreenCardView r1 = com.android.thememanager.settings.personalize.activity.PersonalizeActivity.vep5(r1)
                if (r1 != 0) goto L4a
                kotlin.jvm.internal.d2ok.n5r1(r5)
                r1 = r6
            L4a:
                java.lang.Object r7 = r10.first
                java.lang.String r8 = "first"
                kotlin.jvm.internal.d2ok.kja0(r7, r8)
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r7 = r7.booleanValue()
                r1.o1t(r7)
                com.android.thememanager.settings.personalize.activity.PersonalizeActivity r1 = com.android.thememanager.settings.personalize.activity.PersonalizeActivity.this
                com.android.thememanager.settings.personalize.view.LockScreenCardView r1 = com.android.thememanager.settings.personalize.activity.PersonalizeActivity.vep5(r1)
                if (r1 != 0) goto L66
                kotlin.jvm.internal.d2ok.n5r1(r5)
                r1 = r6
            L66:
                java.lang.Object r10 = r10.second
                java.lang.String r7 = "second"
                kotlin.jvm.internal.d2ok.kja0(r10, r7)
                java.lang.Number r10 = (java.lang.Number) r10
                int r10 = r10.intValue()
                r1.setClockStyle(r10)
                com.android.thememanager.settings.personalize.activity.PersonalizeActivity r10 = com.android.thememanager.settings.personalize.activity.PersonalizeActivity.this
                com.android.thememanager.settings.personalize.view.LockScreenCardView r10 = com.android.thememanager.settings.personalize.activity.PersonalizeActivity.vep5(r10)
                if (r10 != 0) goto L82
                kotlin.jvm.internal.d2ok.n5r1(r5)
                r10 = r6
            L82:
                r10.setClockViewVisible(r4)
                com.android.thememanager.settings.personalize.activity.PersonalizeActivity r10 = com.android.thememanager.settings.personalize.activity.PersonalizeActivity.this
                com.android.thememanager.settings.personalize.presenter.PersonalizeViewModel r10 = com.android.thememanager.settings.personalize.activity.PersonalizeActivity.ebn(r10)
                if (r10 != 0) goto L91
                kotlin.jvm.internal.d2ok.n5r1(r2)
                r10 = r6
            L91:
                r9.label = r3
                java.lang.Object r10 = r10.qo(r9)
                if (r10 != r0) goto L9a
                return r0
            L9a:
                java.lang.Integer r10 = (java.lang.Integer) r10
                if (r10 == 0) goto Lb2
                com.android.thememanager.settings.personalize.activity.PersonalizeActivity r0 = com.android.thememanager.settings.personalize.activity.PersonalizeActivity.this
                com.android.thememanager.settings.personalize.view.LockScreenCardView r0 = com.android.thememanager.settings.personalize.activity.PersonalizeActivity.vep5(r0)
                if (r0 != 0) goto Laa
                kotlin.jvm.internal.d2ok.n5r1(r5)
                goto Lab
            Laa:
                r6 = r0
            Lab:
                int r10 = r10.intValue()
                r6.ni7(r10)
            Lb2:
                kotlin.was r10 = kotlin.was.f36763k
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.settings.personalize.activity.PersonalizeActivity.fn3e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.settings.personalize.activity.PersonalizeActivity$g */
    /* JADX INFO: compiled from: PersonalizeActivity.kt */
    public static final class C2534g extends IRecommendListView.CallBack<UIPage> {
        C2534g() {
        }

        @Override // com.android.thememanager.router.recommend.entity.IRecommendListView.CallBack
        public void onParseUICardFinish(@InterfaceC7396q List<UIElement> uiElements, boolean z2) {
            d2ok.m23075h(uiElements, "uiElements");
            if (C1819o.eqxt(PersonalizeActivity.this)) {
                if (!z2) {
                    IRecommendListView iRecommendListView = PersonalizeActivity.this.f15180a;
                    if (iRecommendListView == null) {
                        d2ok.n5r1("mRecommendListView");
                        iRecommendListView = null;
                    }
                    if (iRecommendListView.getElementSize() != 0) {
                        return;
                    }
                }
                PersonalizeActivity.this.wt(uiElements);
            }
        }

        @Override // com.android.thememanager.router.recommend.entity.IRecommendListView.CallBack
        public void onRecommendListScroll(@InterfaceC7396q IRecommendListView listView, @InterfaceC7396q RecyclerView recyclerView, int i2, int i3) {
            d2ok.m23075h(listView, "listView");
            d2ok.m23075h(recyclerView, "recyclerView");
            super.onRecommendListScroll(listView, recyclerView, i2, i3);
        }

        @Override // com.android.thememanager.router.recommend.entity.IRecommendListView.CallBack
        public void onRecommendLoadFail(boolean z2) {
            super.onRecommendLoadFail(z2);
            IRecommendListView iRecommendListView = PersonalizeActivity.this.f15180a;
            if (iRecommendListView == null) {
                d2ok.n5r1("mRecommendListView");
                iRecommendListView = null;
            }
            if (iRecommendListView.getElementSize() == 0) {
                PersonalizeActivity.this.ob(true);
            }
        }

        @Override // com.android.thememanager.router.recommend.entity.IRecommendListView.CallBack
        public void onRecommendLoadSuccess(boolean z2) {
            PersonalizeActivity.this.ob(false);
            super.onRecommendLoadSuccess(z2);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.settings.personalize.activity.PersonalizeActivity$h */
    /* JADX INFO: compiled from: PersonalizeActivity.kt */
    static final class C2535h extends AbstractC6308r implements cyoe.x2<Boolean, was> {
        C2535h() {
            super(1);
        }

        @Override // cyoe.x2
        public /* bridge */ /* synthetic */ was invoke(Boolean bool) {
            invoke2(bool);
            return was.f36763k;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@InterfaceC7395n Boolean bool) {
            if (bool != null) {
                PersonalizeActivity personalizeActivity = PersonalizeActivity.this;
                bool.booleanValue();
                LockScreenCardView lockScreenCardView = personalizeActivity.f15190r;
                if (lockScreenCardView == null) {
                    d2ok.n5r1("mLockScreenView");
                    lockScreenCardView = null;
                }
                lockScreenCardView.m9114t(bool.booleanValue());
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.settings.personalize.activity.PersonalizeActivity$i */
    /* JADX INFO: compiled from: PersonalizeActivity.kt */
    public static final class C2536i extends ViewOutlineProvider {
        C2536i() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(@InterfaceC7396q View view, @InterfaceC7396q Outline outline) {
            d2ok.m23075h(view, "view");
            d2ok.m23075h(outline, "outline");
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), PersonalizeActivity.this.getResources().getDimensionPixelSize(R.dimen.personalize_card_corner_radius));
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.settings.personalize.activity.PersonalizeActivity$k */
    /* JADX INFO: compiled from: PersonalizeActivity.kt */
    public static final class C2537k {
        private C2537k() {
        }

        public /* synthetic */ C2537k(ni7 ni7Var) {
            this();
        }
    }

    /* JADX INFO: compiled from: PersonalizeActivity.kt */
    @InterfaceC6205g(m22755c = "com.android.thememanager.settings.personalize.activity.PersonalizeActivity$initRecommendListView$2$1", m22756f = "PersonalizeActivity.kt", m22757i = {}, m22758l = {}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
    static final class ki extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super was>, Object> {
        int label;

        ki(InterfaceC6216q<? super ki> interfaceC6216q) {
            super(2, interfaceC6216q);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            return PersonalizeActivity.this.new ki(interfaceC6216q);
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
            return ((ki) create(interfaceC6556f, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            C6199q.x2();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C6318m.n7h(obj);
            IRecommendListView iRecommendListView = PersonalizeActivity.this.f15180a;
            if (iRecommendListView == null) {
                d2ok.n5r1("mRecommendListView");
                iRecommendListView = null;
            }
            iRecommendListView.refreshData();
            return was.f36763k;
        }
    }

    /* JADX INFO: compiled from: PersonalizeActivity.kt */
    static final class kja0 extends AbstractC6308r implements cyoe.x2<Boolean, was> {
        kja0() {
            super(1);
        }

        @Override // cyoe.x2
        public /* bridge */ /* synthetic */ was invoke(Boolean bool) {
            invoke2(bool);
            return was.f36763k;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@InterfaceC7395n Boolean bool) {
            if (bool != null) {
                PersonalizeActivity personalizeActivity = PersonalizeActivity.this;
                bool.booleanValue();
                LockScreenCardView lockScreenCardView = null;
                if (ncyb.n7h(true)) {
                    LockScreenCardView lockScreenCardView2 = personalizeActivity.f15190r;
                    if (lockScreenCardView2 == null) {
                        d2ok.n5r1("mLockScreenView");
                    } else {
                        lockScreenCardView = lockScreenCardView2;
                    }
                    lockScreenCardView.mcp(bool.booleanValue());
                    return;
                }
                LockScreenCardView lockScreenCardView3 = personalizeActivity.f15190r;
                if (lockScreenCardView3 == null) {
                    d2ok.n5r1("mLockScreenView");
                } else {
                    lockScreenCardView = lockScreenCardView3;
                }
                lockScreenCardView.mcp(false);
            }
        }
    }

    /* JADX INFO: compiled from: PersonalizeActivity.kt */
    static final class ld6 extends AbstractC6308r implements cyoe.x2<ClockInfo, was> {
        ld6() {
            super(1);
        }

        @Override // cyoe.x2
        public /* bridge */ /* synthetic */ was invoke(ClockInfo clockInfo) {
            invoke2(clockInfo);
            return was.f36763k;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@InterfaceC7395n ClockInfo clockInfo) {
            if (clockInfo != null) {
                LockScreenCardView lockScreenCardView = PersonalizeActivity.this.f15190r;
                if (lockScreenCardView == null) {
                    d2ok.n5r1("mLockScreenView");
                    lockScreenCardView = null;
                }
                lockScreenCardView.a9(clockInfo);
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.settings.personalize.activity.PersonalizeActivity$n */
    /* JADX INFO: compiled from: PersonalizeActivity.kt */
    public static final class C2538n implements IRecommendListView.Request {
        C2538n() {
        }

        @Override // com.android.thememanager.router.recommend.entity.IRecommendListView.Request
        @InterfaceC7396q
        public retrofit2.toq<CommonResponse<com.google.gson.kja0>> getLoadMoreCall(int i2) {
            ThemeSettingsPresenter themeSettingsPresenter = PersonalizeActivity.this.f15194x;
            if (themeSettingsPresenter == null) {
                d2ok.n5r1("mPresenter");
                themeSettingsPresenter = null;
            }
            retrofit2.toq<CommonResponse<com.google.gson.kja0>> loadMoreCall = themeSettingsPresenter.getLoadMoreCall(i2);
            d2ok.kja0(loadMoreCall, "getLoadMoreCall(...)");
            return loadMoreCall;
        }

        @Override // com.android.thememanager.router.recommend.entity.IRecommendListView.Request
        @InterfaceC7396q
        public retrofit2.toq<CommonResponse<com.google.gson.kja0>> getRefreshCall() {
            ThemeSettingsPresenter themeSettingsPresenter = PersonalizeActivity.this.f15194x;
            if (themeSettingsPresenter == null) {
                d2ok.n5r1("mPresenter");
                themeSettingsPresenter = null;
            }
            retrofit2.toq<CommonResponse<com.google.gson.kja0>> refreshCall = themeSettingsPresenter.getRefreshCall();
            d2ok.kja0(refreshCall, "getRefreshCall(...)");
            return refreshCall;
        }
    }

    /* JADX INFO: compiled from: PersonalizeActivity.kt */
    static final class n7h extends AbstractC6308r implements cyoe.x2<Integer, was> {
        n7h() {
            super(1);
        }

        @Override // cyoe.x2
        public /* bridge */ /* synthetic */ was invoke(Integer num) {
            invoke2(num);
            return was.f36763k;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@InterfaceC7395n Integer num) {
            if (num != null) {
                PersonalizeActivity personalizeActivity = PersonalizeActivity.this;
                num.intValue();
                LockScreenCardView lockScreenCardView = personalizeActivity.f15190r;
                if (lockScreenCardView == null) {
                    d2ok.n5r1("mLockScreenView");
                    lockScreenCardView = null;
                }
                lockScreenCardView.jk(num.intValue());
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.settings.personalize.activity.PersonalizeActivity$p */
    /* JADX INFO: compiled from: PersonalizeActivity.kt */
    static final class C2539p extends AbstractC6308r implements cyoe.x2<C1723y<uj2j.toq>, was> {
        C2539p() {
            super(1);
        }

        @Override // cyoe.x2
        public /* bridge */ /* synthetic */ was invoke(C1723y<uj2j.toq> c1723y) {
            invoke2(c1723y);
            return was.f36763k;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(C1723y<uj2j.toq> c1723y) {
            uj2j.toq toqVarZy = c1723y.zy();
            if (toqVarZy != null) {
                PersonalizeActivity personalizeActivity = PersonalizeActivity.this;
                LockScreenCardView lockScreenCardView = personalizeActivity.f15190r;
                LockScreenCardView lockScreenCardView2 = null;
                if (lockScreenCardView == null) {
                    d2ok.n5r1("mLockScreenView");
                    lockScreenCardView = null;
                }
                lockScreenCardView.m9113i(toqVarZy);
                if (toqVarZy.zy()) {
                    if (o1t.m7171i() || toqVarZy.m28081q()) {
                        return;
                    }
                    personalizeActivity.gb();
                    return;
                }
                LockScreenCardView lockScreenCardView3 = personalizeActivity.f15190r;
                if (lockScreenCardView3 == null) {
                    d2ok.n5r1("mLockScreenView");
                } else {
                    lockScreenCardView2 = lockScreenCardView3;
                }
                lockScreenCardView2.setClockViewVisible(false);
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.settings.personalize.activity.PersonalizeActivity$q */
    /* JADX INFO: compiled from: PersonalizeActivity.kt */
    public static final class C2540q extends AnimatorListenerAdapter {
        C2540q() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@InterfaceC7396q Animator animation) {
            d2ok.m23075h(animation, "animation");
            PersonalizeActivity.this.kbj();
        }
    }

    /* JADX INFO: compiled from: PersonalizeActivity.kt */
    static final class qrj extends AbstractC6308r implements cyoe.x2<DoodleInfo, was> {
        qrj() {
            super(1);
        }

        @Override // cyoe.x2
        public /* bridge */ /* synthetic */ was invoke(DoodleInfo doodleInfo) {
            invoke2(doodleInfo);
            return was.f36763k;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(DoodleInfo doodleInfo) {
            if (doodleInfo != null) {
                LockScreenCardView lockScreenCardView = PersonalizeActivity.this.f15190r;
                if (lockScreenCardView == null) {
                    d2ok.n5r1("mLockScreenView");
                    lockScreenCardView = null;
                }
                lockScreenCardView.wvg(doodleInfo);
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.settings.personalize.activity.PersonalizeActivity$s */
    /* JADX INFO: compiled from: PersonalizeActivity.kt */
    static final class C2541s extends AbstractC6308r implements cyoe.x2<C7688k, was> {
        C2541s() {
            super(1);
        }

        @Override // cyoe.x2
        public /* bridge */ /* synthetic */ was invoke(C7688k c7688k) {
            invoke2(c7688k);
            return was.f36763k;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(C7688k c7688k) {
            WallpaperCardView wallpaperCardView = PersonalizeActivity.this.f15185f;
            if (wallpaperCardView == null) {
                d2ok.n5r1("mWallpaperCardView");
                wallpaperCardView = null;
            }
            d2ok.qrj(c7688k);
            wallpaperCardView.ld6(c7688k);
        }
    }

    /* JADX INFO: compiled from: PersonalizeActivity.kt */
    public static final class t8r implements p000a.zy {
        t8r() {
        }

        @Override // p000a.zy
        /* JADX INFO: renamed from: k */
        public void mo0k() {
            PersonalizeViewModel personalizeViewModel = PersonalizeActivity.this.f15183d;
            if (personalizeViewModel == null) {
                d2ok.n5r1("mVM");
                personalizeViewModel = null;
            }
            personalizeViewModel.tfm(4);
        }

        @Override // p000a.zy
        public void toq(boolean z2) {
            if (z2) {
                lvui.ki(PersonalizeActivity.this, false);
            }
        }
    }

    /* JADX INFO: compiled from: PersonalizeActivity.kt */
    private static final class toq extends RecyclerView.kja0 {
        @Override // androidx.recyclerview.widget.RecyclerView.kja0
        /* JADX INFO: renamed from: n */
        public void mo4711n(@InterfaceC7396q Rect outRect, @InterfaceC7396q View view, @InterfaceC7396q RecyclerView parent, @InterfaceC7396q RecyclerView.mcp state) {
            int childAdapterPosition;
            d2ok.m23075h(outRect, "outRect");
            d2ok.m23075h(view, "view");
            d2ok.m23075h(parent, "parent");
            d2ok.m23075h(state, "state");
            if (parent.getChildAdapterPosition(view) == 0 || parent.getChildAdapterPosition(view) - 1 < 0) {
                return;
            }
            int dimensionPixelSize = view.getResources().getDimensionPixelSize(R.dimen.setting_personalize_recycle_half_margin);
            if (childAdapterPosition % 2 == 1) {
                outRect.left = dimensionPixelSize;
                outRect.right = dimensionPixelSize / 2;
            } else {
                outRect.right = dimensionPixelSize;
                outRect.left = dimensionPixelSize / 2;
            }
            int dimensionPixelSize2 = view.getResources().getDimensionPixelSize(R.dimen.wallpaper_setting_item_half_margin);
            outRect.bottom = dimensionPixelSize2;
            outRect.top = dimensionPixelSize2;
        }
    }

    /* JADX INFO: compiled from: PersonalizeActivity.kt */
    static final class x2 extends AbstractC6308r implements cyoe.x2<SignatureInfo, was> {
        x2() {
            super(1);
        }

        @Override // cyoe.x2
        public /* bridge */ /* synthetic */ was invoke(SignatureInfo signatureInfo) {
            invoke2(signatureInfo);
            return was.f36763k;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@InterfaceC7395n SignatureInfo signatureInfo) {
            if (signatureInfo != null) {
                LockScreenCardView lockScreenCardView = PersonalizeActivity.this.f15190r;
                if (lockScreenCardView == null) {
                    d2ok.n5r1("mLockScreenView");
                    lockScreenCardView = null;
                }
                lockScreenCardView.fti(signatureInfo);
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.settings.personalize.activity.PersonalizeActivity$y */
    /* JADX INFO: compiled from: PersonalizeActivity.kt */
    static final class C2542y extends AbstractC6308r implements cyoe.x2<C7689q, was> {
        C2542y() {
            super(1);
        }

        @Override // cyoe.x2
        public /* bridge */ /* synthetic */ was invoke(C7689q c7689q) {
            invoke2(c7689q);
            return was.f36763k;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(C7689q c7689q) {
            ThemeCardView themeCardView = PersonalizeActivity.this.f15187l;
            if (themeCardView == null) {
                d2ok.n5r1("mThemeCardView");
                themeCardView = null;
            }
            d2ok.qrj(c7689q);
            themeCardView.kja0(c7689q);
        }
    }

    /* JADX INFO: compiled from: PersonalizeActivity.kt */
    @InterfaceC6205g(m22755c = "com.android.thememanager.settings.personalize.activity.PersonalizeActivity$handleNotifyAndFingerItem$1", m22756f = "PersonalizeActivity.kt", m22757i = {}, m22758l = {468}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
    static final class zy extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super was>, Object> {
        int label;

        /* JADX INFO: renamed from: com.android.thememanager.settings.personalize.activity.PersonalizeActivity$zy$k */
        /* JADX INFO: compiled from: PersonalizeActivity.kt */
        @InterfaceC6205g(m22755c = "com.android.thememanager.settings.personalize.activity.PersonalizeActivity$handleNotifyAndFingerItem$1$1", m22756f = "PersonalizeActivity.kt", m22757i = {}, m22758l = {}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
        static final class C2543k extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super was>, Object> {
            int label;
            final /* synthetic */ PersonalizeActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2543k(PersonalizeActivity personalizeActivity, InterfaceC6216q<? super C2543k> interfaceC6216q) {
                super(2, interfaceC6216q);
                this.this$0 = personalizeActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
            @InterfaceC7396q
            public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
                return new C2543k(this.this$0, interfaceC6216q);
            }

            @Override // cyoe.InterfaceC5979h
            @InterfaceC7395n
            public final Object invoke(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
                return ((C2543k) create(interfaceC6556f, interfaceC6216q)).invokeSuspend(was.f36763k);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
            @InterfaceC7395n
            public final Object invokeSuspend(@InterfaceC7396q Object obj) {
                C6199q.x2();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6318m.n7h(obj);
                this.this$0.as = C2663k.qrj();
                PersonalizeActivity personalizeActivity = this.this$0;
                personalizeActivity.bg = C2670y.m9309s(personalizeActivity);
                return was.f36763k;
            }
        }

        zy(InterfaceC6216q<? super zy> interfaceC6216q) {
            super(2, interfaceC6216q);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            return PersonalizeActivity.this.new zy(interfaceC6216q);
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
            return ((zy) create(interfaceC6556f, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            Object objX2 = C6199q.x2();
            int i2 = this.label;
            ThemePreferenceView themePreferenceView = null;
            if (i2 == 0) {
                C6318m.n7h(obj);
                dd ddVarZy = C6481a.zy();
                C2543k c2543k = new C2543k(PersonalizeActivity.this, null);
                this.label = 1;
                if (C6708p.m24523y(ddVarZy, c2543k, this) == objX2) {
                    return objX2;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6318m.n7h(obj);
            }
            if (!PersonalizeActivity.this.as) {
                ThemePreferenceView themePreferenceView2 = PersonalizeActivity.this.f15189o;
                if (themePreferenceView2 == null) {
                    d2ok.n5r1("mNotifyLightItem");
                    themePreferenceView2 = null;
                }
                themePreferenceView2.setVisibility(8);
            }
            if (!PersonalizeActivity.this.bg) {
                ThemePreferenceView themePreferenceView3 = PersonalizeActivity.this.f15188m;
                if (themePreferenceView3 == null) {
                    d2ok.n5r1("mFingerStyleItem");
                } else {
                    themePreferenceView = themePreferenceView3;
                }
                themePreferenceView.setVisibility(8);
            }
            return was.f36763k;
        }
    }

    private final void b8() {
        TextView textViewOki = oki();
        if (textViewOki == null) {
            return;
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(textViewOki, "alpha", textViewOki.getAlpha(), 0.0f).setDuration(200L);
        d2ok.kja0(duration, "setDuration(...)");
        duration.addListener(new C2540q());
        duration.start();
    }

    private final void b9ub() {
        kotlinx.coroutines.x2.m24649g(androidx.lifecycle.o1t.m4467k(this), null, null, new zy(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bih(cyoe.x2 tmp0, Object obj) {
        d2ok.m23075h(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    private final void bqie() {
        ob(false);
        IRecommendListView iRecommendListView = this.f15180a;
        if (iRecommendListView == null) {
            d2ok.n5r1("mRecommendListView");
            iRecommendListView = null;
        }
        iRecommendListView.refreshData();
    }

    private final void cnbm() {
        if (o1t.fn3e()) {
            ThemePreferenceView themePreferenceView = this.f15186j;
            if (themePreferenceView == null) {
                d2ok.n5r1("mFontItemView");
                themePreferenceView = null;
            }
            themePreferenceView.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void cyoe(final PersonalizeActivity this$0, View view) {
        d2ok.m23075h(this$0, "this$0");
        if (!C1781k.toq(bf2.toq.toq())) {
            this$0.m6712j(null, true, null);
        }
        if (mcp.m7139n()) {
            boolean zF7l8 = com.android.thememanager.basemodule.privacy.x2.f7l8();
            this$0.f1bi(zF7l8);
            if (zF7l8) {
                com.android.thememanager.basemodule.privacy.x2.m6916q(this$0, new p000a.toq() { // from class: com.android.thememanager.settings.personalize.activity.p
                    @Override // p000a.toq
                    public final void onSuccess() {
                        PersonalizeActivity.r6ty(this.f15211k);
                    }
                });
            } else {
                this$0.bqie();
            }
        }
    }

    private final void ec() {
        if (this.in != null) {
            return;
        }
        View viewFindViewById = findViewById(R.id.viewStub);
        d2ok.kja0(viewFindViewById, "findViewById(...)");
        View viewInflate = ((ViewStub) viewFindViewById).inflate();
        d2ok.n7h(viewInflate, "null cannot be cast to non-null type com.android.thememanager.settings.superwallpaper.widget.FindMoreButton");
        FindMoreButton findMoreButton = (FindMoreButton) viewInflate;
        findMoreButton.setFindMoreText(getString(R.string.find_more_free_theme));
        findMoreButton.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.settings.personalize.activity.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PersonalizeActivity.o5(this.f15213k, view);
            }
        });
        C6077k.fu4(findMoreButton);
        ViewGroup.LayoutParams layoutParams = findMoreButton.getLayoutParams();
        d2ok.n7h(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = -marginLayoutParams.height;
        findMoreButton.setLayoutParams(marginLayoutParams);
        this.in = findMoreButton;
    }

    private final void el() {
        yw();
        yp31();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ew(View view) {
        Intent intent = new Intent();
        intent.setClass(view.getContext(), ThemePreferenceActivity.class);
        view.getContext().startActivity(intent);
    }

    private final void f1bi(boolean z2) {
        View view = this.bl;
        if (view != null) {
            d2ok.qrj(view);
            View viewFindViewById = view.findViewById(R.id.offline_title);
            d2ok.n7h(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) viewFindViewById).setText(z2 ? R.string.local_mode_hint : R.string.wallpaper_online_tip);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g0ad(PersonalizeActivity this$0, Intent intent) {
        d2ok.m23075h(this$0, "this$0");
        if (TextUtils.equals(intent.getAction(), "com.android.thememanager.action.REQUEST_PERMISSION")) {
            lvui.m7131s(this$0, this$0.ax);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ga(PersonalizeActivity this$0) {
        d2ok.m23075h(this$0, "this$0");
        FindMoreButton findMoreButton = this$0.in;
        if (findMoreButton != null) {
            findMoreButton.ki();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void gb() {
        kotlinx.coroutines.x2.m24649g(androidx.lifecycle.o1t.m4467k(this), null, null, new fn3e(null), 3, null);
    }

    private final void gcp() {
        this.f15194x = new ThemeSettingsPresenter();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void imd(PersonalizeActivity this$0, Intent intent) {
        d2ok.m23075h(this$0, "this$0");
        if (!com.android.thememanager.basemodule.privacy.x2.f7l8() || this$0.bl == null) {
            return;
        }
        IRecommendListView iRecommendListView = this$0.f15180a;
        IRecommendListView iRecommendListView2 = null;
        if (iRecommendListView == null) {
            d2ok.n5r1("mRecommendListView");
            iRecommendListView = null;
        }
        if (iRecommendListView.getElementSize() > 0) {
            IRecommendListView iRecommendListView3 = this$0.f15180a;
            if (iRecommendListView3 == null) {
                d2ok.n5r1("mRecommendListView");
                iRecommendListView3 = null;
            }
            iRecommendListView3.clearData();
            IRecommendListView iRecommendListView4 = this$0.f15180a;
            if (iRecommendListView4 == null) {
                d2ok.n5r1("mRecommendListView");
            } else {
                iRecommendListView2 = iRecommendListView4;
            }
            iRecommendListView2.scrollTop();
            this$0.bb = 0;
            if (this$0.an.getAndSet(false)) {
                FindMoreButton findMoreButton = this$0.in;
                d2ok.qrj(findMoreButton);
                findMoreButton.n7h();
            }
            this$0.ob(true);
        }
    }

    private final void ix() {
        C1708s.f7l8().ld6().cdj(C1706p.kja0("personalize", "personalize_wallpaper_card", ""));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void kbj() {
        TextView textViewOki = oki();
        if (textViewOki == null) {
            return;
        }
        if (this.bb >= this.f60803ab) {
            AbstractC6946k abstractC6946kM6709b = m6709b();
            if (abstractC6946kM6709b != null) {
                abstractC6946kM6709b.xwq3(R.string.present_online_themes);
            }
            textViewOki.setText(R.string.present_online_themes);
        } else {
            AbstractC6946k abstractC6946kM6709b2 = m6709b();
            if (abstractC6946kM6709b2 != null) {
                abstractC6946kM6709b2.xwq3(R.string.personalize_title);
            }
            textViewOki.setText(R.string.personalize_title);
        }
        ObjectAnimator.ofFloat(textViewOki, "alpha", textViewOki.getAlpha(), 1.0f).setDuration(200L).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void kiv(cyoe.x2 tmp0, Object obj) {
        d2ok.m23075h(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    private final C2367n kx3() {
        C2367n c2367n = new C2367n();
        c2367n.setContext(this).setRefresh(false).setLayoutManagerType(0).setCardDivider(false).setItemDecoration(new toq()).setNeedFootTip(false).setResCode("theme").setPicker(false).setSettingPage(true).setStaggerHolderWidth(((C1819o.jk(this) - (getResources().getDimensionPixelSize(R.dimen.wallpaper_setting_item_half_margin) * 2)) - (getResources().getDimensionPixelSize(R.dimen.setting_personalize_recycle_half_margin) * 2)) / 2).setStaggerDecorationSize(getResources().getDimensionPixelSize(R.dimen.setting_personalize_recycle_half_margin)).setRequest(new C2538n()).setCallBack(new C2534g());
        return c2367n;
    }

    private final void l05() {
        if (this.bl != null) {
            return;
        }
        View view = this.f15191u;
        ViewStub viewStub = null;
        if (view == null) {
            d2ok.n5r1("mHeaderView");
            view = null;
        }
        View viewFindViewById = view.findViewById(R.id.offline);
        d2ok.kja0(viewFindViewById, "findViewById(...)");
        ViewStub viewStub2 = (ViewStub) viewFindViewById;
        this.f15192v = viewStub2;
        if (viewStub2 == null) {
            d2ok.n5r1("mOfflineViewStub");
        } else {
            viewStub = viewStub2;
        }
        View viewInflate = viewStub.inflate();
        d2ok.n7h(viewInflate, "null cannot be cast to non-null type android.widget.LinearLayout");
        LinearLayout linearLayout = (LinearLayout) viewInflate;
        TextView textView = (TextView) linearLayout.findViewById(R.id.offline_title);
        if (textView != null) {
            textView.setText(com.android.thememanager.basemodule.privacy.x2.f7l8() ? R.string.local_mode_hint : R.string.wallpaper_online_tip);
        }
        C6077k.m22369i(linearLayout);
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.settings.personalize.activity.kja0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                PersonalizeActivity.cyoe(this.f15207k, view2);
            }
        });
        this.bl = linearLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void lw() {
        int i2 = this.f60803ab;
        if (i2 == 0) {
            return;
        }
        if (this.bb >= i2) {
            if (this.bv.getAndSet(true)) {
                return;
            }
            b8();
        } else if (this.bv.getAndSet(false)) {
            b8();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m2t(cyoe.x2 tmp0, Object obj) {
        d2ok.m23075h(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nnh(cyoe.x2 tmp0, Object obj) {
        d2ok.m23075h(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o5(PersonalizeActivity this$0, View view) {
        d2ok.m23075h(this$0, "this$0");
        Intent intent = new Intent();
        intent.setAction(ThemeResourceProxyTabActivity.bl);
        intent.setPackage(bf2.toq.toq().getPackageName());
        intent.putExtra("EXTRA_TAB_ID", "theme");
        this$0.startActivity(intent);
        C1708s.f7l8().ld6().ni7(C1706p.zy(com.android.thememanager.basemodule.analysis.toq.bz4g));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ob(boolean z2) {
        if (this.bl == null) {
            l05();
        }
        View view = this.bl;
        if (view == null) {
            return;
        }
        view.setVisibility(z2 ? 0 : 8);
    }

    private final TextView oki() {
        TextView textView = this.id;
        if (textView != null) {
            return textView;
        }
        if (!C1819o.eqxt(this)) {
            return null;
        }
        TextView textView2 = (TextView) findViewById(R.id.action_bar_title);
        this.id = textView2;
        return textView2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ps(cyoe.x2 tmp0, Object obj) {
        d2ok.m23075h(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    private final void r25n() {
        if (!y9n.vyq() || a9.m6999s(y9n.f10446p)) {
            return;
        }
        ImageView imageView = new ImageView(this);
        C1812k.m7106k(imageView, R.string.accessibiliy_description_content_more);
        imageView.setBackgroundResource(R.drawable.action_immersion);
        setActionBarRightMenu(imageView);
        AbstractC6946k abstractC6946kM6709b = m6709b();
        if (abstractC6946kM6709b != null) {
            abstractC6946kM6709b.vyq(true);
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.settings.personalize.activity.qrj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PersonalizeActivity.ew(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r6ty(PersonalizeActivity this$0) {
        d2ok.m23075h(this$0, "this$0");
        this$0.bqie();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ra(cyoe.x2 tmp0, Object obj) {
        d2ok.m23075h(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    private final void rp() {
        View view = this.f15191u;
        ThemePreferenceView themePreferenceView = null;
        if (view == null) {
            d2ok.n5r1("mHeaderView");
            view = null;
        }
        View viewFindViewById = view.findViewById(R.id.aod_item);
        d2ok.kja0(viewFindViewById, "findViewById(...)");
        this.f15182c = (ThemePreferenceView) viewFindViewById;
        if (C2663k.qrj()) {
            ThemePreferenceView themePreferenceView2 = this.f15182c;
            if (themePreferenceView2 == null) {
                d2ok.n5r1("mAodItemView");
                themePreferenceView2 = null;
            }
            themePreferenceView2.setIcon(C6045k.toq(this, R.drawable.personalize_item_aod_icon));
            ThemePreferenceView themePreferenceView3 = this.f15182c;
            if (themePreferenceView3 == null) {
                d2ok.n5r1("mAodItemView");
                themePreferenceView3 = null;
            }
            TextView titleView = themePreferenceView3.getTitleView();
            if (titleView != null) {
                titleView.setText(R.string.personalize_aod_title);
            }
            ThemePreferenceView themePreferenceView4 = this.f15182c;
            if (themePreferenceView4 == null) {
                d2ok.n5r1("mAodItemView");
                themePreferenceView4 = null;
            }
            themePreferenceView4.setOnClickListener(this);
        } else {
            ThemePreferenceView themePreferenceView5 = this.f15182c;
            if (themePreferenceView5 == null) {
                d2ok.n5r1("mAodItemView");
                themePreferenceView5 = null;
            }
            themePreferenceView5.setVisibility(8);
        }
        View view2 = this.f15191u;
        if (view2 == null) {
            d2ok.n5r1("mHeaderView");
            view2 = null;
        }
        View viewFindViewById2 = view2.findViewById(R.id.icon_item);
        d2ok.kja0(viewFindViewById2, "findViewById(...)");
        ThemePreferenceView themePreferenceView6 = (ThemePreferenceView) viewFindViewById2;
        this.f15184e = themePreferenceView6;
        if (themePreferenceView6 == null) {
            d2ok.n5r1("mIconItemView");
            themePreferenceView6 = null;
        }
        themePreferenceView6.setIcon(C6045k.toq(this, R.drawable.personalize_item_icon));
        ThemePreferenceView themePreferenceView7 = this.f15184e;
        if (themePreferenceView7 == null) {
            d2ok.n5r1("mIconItemView");
            themePreferenceView7 = null;
        }
        TextView titleView2 = themePreferenceView7.getTitleView();
        if (titleView2 != null) {
            titleView2.setText(R.string.personalize_icon_title);
        }
        View view3 = this.f15191u;
        if (view3 == null) {
            d2ok.n5r1("mHeaderView");
            view3 = null;
        }
        View viewFindViewById3 = view3.findViewById(R.id.font_item);
        d2ok.kja0(viewFindViewById3, "findViewById(...)");
        ThemePreferenceView themePreferenceView8 = (ThemePreferenceView) viewFindViewById3;
        this.f15186j = themePreferenceView8;
        if (themePreferenceView8 == null) {
            d2ok.n5r1("mFontItemView");
            themePreferenceView8 = null;
        }
        themePreferenceView8.setIcon(C6045k.toq(this, R.drawable.personalize_item_font_icon));
        ThemePreferenceView themePreferenceView9 = this.f15186j;
        if (themePreferenceView9 == null) {
            d2ok.n5r1("mFontItemView");
            themePreferenceView9 = null;
        }
        TextView titleView3 = themePreferenceView9.getTitleView();
        if (titleView3 != null) {
            titleView3.setText(R.string.theme_component_title_font);
        }
        cnbm();
        View view4 = this.f15191u;
        if (view4 == null) {
            d2ok.n5r1("mHeaderView");
            view4 = null;
        }
        View viewFindViewById4 = view4.findViewById(R.id.notify_light_item);
        d2ok.kja0(viewFindViewById4, "findViewById(...)");
        ThemePreferenceView themePreferenceView10 = (ThemePreferenceView) viewFindViewById4;
        this.f15189o = themePreferenceView10;
        if (themePreferenceView10 == null) {
            d2ok.n5r1("mNotifyLightItem");
            themePreferenceView10 = null;
        }
        themePreferenceView10.setIcon(C6045k.toq(this, R.drawable.personalize_setting_notify_icon));
        ThemePreferenceView themePreferenceView11 = this.f15189o;
        if (themePreferenceView11 == null) {
            d2ok.n5r1("mNotifyLightItem");
            themePreferenceView11 = null;
        }
        TextView titleView4 = themePreferenceView11.getTitleView();
        if (titleView4 != null) {
            titleView4.setText(R.string.personalize_notify_style_title);
        }
        View view5 = this.f15191u;
        if (view5 == null) {
            d2ok.n5r1("mHeaderView");
            view5 = null;
        }
        View viewFindViewById5 = view5.findViewById(R.id.finger_style_item);
        d2ok.kja0(viewFindViewById5, "findViewById(...)");
        ThemePreferenceView themePreferenceView12 = (ThemePreferenceView) viewFindViewById5;
        this.f15188m = themePreferenceView12;
        if (themePreferenceView12 == null) {
            d2ok.n5r1("mFingerStyleItem");
            themePreferenceView12 = null;
        }
        themePreferenceView12.setIcon(C6045k.toq(this, R.drawable.personalize_setting_finger_icon));
        ThemePreferenceView themePreferenceView13 = this.f15188m;
        if (themePreferenceView13 == null) {
            d2ok.n5r1("mFingerStyleItem");
            themePreferenceView13 = null;
        }
        TextView titleView5 = themePreferenceView13.getTitleView();
        if (titleView5 != null) {
            titleView5.setText(R.string.personalize_fingerprint_style_title);
        }
        b9ub();
        ThemePreferenceView themePreferenceView14 = this.f15184e;
        if (themePreferenceView14 == null) {
            d2ok.n5r1("mIconItemView");
            themePreferenceView14 = null;
        }
        themePreferenceView14.setOnClickListener(this);
        ThemePreferenceView themePreferenceView15 = this.f15186j;
        if (themePreferenceView15 == null) {
            d2ok.n5r1("mFontItemView");
            themePreferenceView15 = null;
        }
        themePreferenceView15.setOnClickListener(this);
        ThemePreferenceView themePreferenceView16 = this.f15189o;
        if (themePreferenceView16 == null) {
            d2ok.n5r1("mNotifyLightItem");
            themePreferenceView16 = null;
        }
        themePreferenceView16.setOnClickListener(this);
        ThemePreferenceView themePreferenceView17 = this.f15188m;
        if (themePreferenceView17 == null) {
            d2ok.n5r1("mFingerStyleItem");
        } else {
            themePreferenceView = themePreferenceView17;
        }
        themePreferenceView.setOnClickListener(this);
    }

    private final void tww7() {
        LockScreenCardView lockScreenCardView = this.f15190r;
        WallpaperCardView wallpaperCardView = null;
        if (lockScreenCardView == null) {
            d2ok.n5r1("mLockScreenView");
            lockScreenCardView = null;
        }
        lockScreenCardView.release();
        ThemeCardView themeCardView = this.f15187l;
        if (themeCardView == null) {
            d2ok.n5r1("mThemeCardView");
            themeCardView = null;
        }
        themeCardView.release();
        WallpaperCardView wallpaperCardView2 = this.f15185f;
        if (wallpaperCardView2 == null) {
            d2ok.n5r1("mWallpaperCardView");
        } else {
            wallpaperCardView = wallpaperCardView2;
        }
        wallpaperCardView.release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u38j(cyoe.x2 tmp0, Object obj) {
        d2ok.m23075h(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void uf(cyoe.x2 tmp0, Object obj) {
        d2ok.m23075h(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v5yj(cyoe.x2 tmp0, Object obj) {
        d2ok.m23075h(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void vy(int i2) {
        int i3;
        int i4;
        IRecommendListView iRecommendListView = this.f15180a;
        RecyclerView recyclerView = null;
        if (iRecommendListView == null) {
            d2ok.n5r1("mRecommendListView");
            iRecommendListView = null;
        }
        if (iRecommendListView.getElementSize() == 0) {
            return;
        }
        View view = this.f15191u;
        if (view == null) {
            d2ok.n5r1("mHeaderView");
            view = null;
        }
        this.f15193w = view.findViewById(R.id.item_view).getBottom() - 100;
        View view2 = this.f15191u;
        if (view2 == null) {
            d2ok.n5r1("mHeaderView");
            view2 = null;
        }
        int height = view2.getHeight();
        this.f60803ab = height;
        if (height == 0) {
            return;
        }
        boolean z2 = true;
        if (i2 == 0 || this.bp != 1) {
            if (i2 != 0 || this.bp == 0) {
                if (i2 >= 0 ? (i3 = this.bb) <= this.f15193w || i3 >= height : (i4 = this.bb) <= height || i4 + i2 >= height) {
                    z2 = false;
                }
                if (z2) {
                    RecyclerView recyclerView2 = this.f60804bo;
                    if (recyclerView2 == null) {
                        d2ok.n5r1("mRecycleView");
                    } else {
                        recyclerView = recyclerView2;
                    }
                    recyclerView.smoothScrollBy(0, this.f60803ab - this.bb);
                }
            }
        }
    }

    /* JADX INFO: renamed from: w */
    private final void m9048w() {
        PersonalizeViewModel personalizeViewModel = this.f15183d;
        PersonalizeViewModel personalizeViewModel2 = null;
        if (personalizeViewModel == null) {
            d2ok.n5r1("mVM");
            personalizeViewModel = null;
        }
        fti<C7689q> ftiVarDr = personalizeViewModel.dr();
        final C2542y c2542y = new C2542y();
        ftiVarDr.m4391p(this, new jp0y() { // from class: com.android.thememanager.settings.personalize.activity.h
            @Override // androidx.lifecycle.jp0y
            public final void toq(Object obj) {
                PersonalizeActivity.ps(c2542y, obj);
            }
        });
        PersonalizeViewModel personalizeViewModel3 = this.f15183d;
        if (personalizeViewModel3 == null) {
            d2ok.n5r1("mVM");
            personalizeViewModel3 = null;
        }
        fti<C7688k> ftiVarM9089x = personalizeViewModel3.m9089x();
        final C2541s c2541s = new C2541s();
        ftiVarM9089x.m4391p(this, new jp0y() { // from class: com.android.thememanager.settings.personalize.activity.cdj
            @Override // androidx.lifecycle.jp0y
            public final void toq(Object obj) {
                PersonalizeActivity.v5yj(c2541s, obj);
            }
        });
        PersonalizeViewModel personalizeViewModel4 = this.f15183d;
        if (personalizeViewModel4 == null) {
            d2ok.n5r1("mVM");
            personalizeViewModel4 = null;
        }
        fti<C1723y<uj2j.toq>> ftiVarBo = personalizeViewModel4.bo();
        final C2539p c2539p = new C2539p();
        ftiVarBo.m4391p(this, new jp0y() { // from class: com.android.thememanager.settings.personalize.activity.ki
            @Override // androidx.lifecycle.jp0y
            public final void toq(Object obj) {
                PersonalizeActivity.ra(c2539p, obj);
            }
        });
        if (o1t.m7171i()) {
            PersonalizeViewModel personalizeViewModel5 = this.f15183d;
            if (personalizeViewModel5 == null) {
                d2ok.n5r1("mVM");
                personalizeViewModel5 = null;
            }
            fti<ClockInfo> ftiVarZp = personalizeViewModel5.zp();
            final ld6 ld6Var = new ld6();
            ftiVarZp.m4391p(this, new jp0y() { // from class: com.android.thememanager.settings.personalize.activity.toq
                @Override // androidx.lifecycle.jp0y
                public final void toq(Object obj) {
                    PersonalizeActivity.nnh(ld6Var, obj);
                }
            });
            PersonalizeViewModel personalizeViewModel6 = this.f15183d;
            if (personalizeViewModel6 == null) {
                d2ok.n5r1("mVM");
                personalizeViewModel6 = null;
            }
            fti<SignatureInfo> ftiVarC8jq = personalizeViewModel6.c8jq();
            final x2 x2Var = new x2();
            ftiVarC8jq.m4391p(this, new jp0y() { // from class: com.android.thememanager.settings.personalize.activity.zy
                @Override // androidx.lifecycle.jp0y
                public final void toq(Object obj) {
                    PersonalizeActivity.uf(x2Var, obj);
                }
            });
            PersonalizeViewModel personalizeViewModel7 = this.f15183d;
            if (personalizeViewModel7 == null) {
                d2ok.n5r1("mVM");
                personalizeViewModel7 = null;
            }
            fti<DoodleInfo> ftiVarNmn5 = personalizeViewModel7.nmn5();
            final qrj qrjVar = new qrj();
            ftiVarNmn5.m4391p(this, new jp0y() { // from class: com.android.thememanager.settings.personalize.activity.q
                @Override // androidx.lifecycle.jp0y
                public final void toq(Object obj) {
                    PersonalizeActivity.kiv(qrjVar, obj);
                }
            });
            PersonalizeViewModel personalizeViewModel8 = this.f15183d;
            if (personalizeViewModel8 == null) {
                d2ok.n5r1("mVM");
                personalizeViewModel8 = null;
            }
            fti<Integer> ftiVarY2 = personalizeViewModel8.y2();
            final n7h n7hVar = new n7h();
            ftiVarY2.m4391p(this, new jp0y() { // from class: com.android.thememanager.settings.personalize.activity.n
                @Override // androidx.lifecycle.jp0y
                public final void toq(Object obj) {
                    PersonalizeActivity.z4t(n7hVar, obj);
                }
            });
            PersonalizeViewModel personalizeViewModel9 = this.f15183d;
            if (personalizeViewModel9 == null) {
                d2ok.n5r1("mVM");
                personalizeViewModel9 = null;
            }
            fti<Boolean> ftiVarM9087u = personalizeViewModel9.m9087u();
            final kja0 kja0Var = new kja0();
            ftiVarM9087u.m4391p(this, new jp0y() { // from class: com.android.thememanager.settings.personalize.activity.g
                @Override // androidx.lifecycle.jp0y
                public final void toq(Object obj) {
                    PersonalizeActivity.bih(kja0Var, obj);
                }
            });
            PersonalizeViewModel personalizeViewModel10 = this.f15183d;
            if (personalizeViewModel10 == null) {
                d2ok.n5r1("mVM");
                personalizeViewModel10 = null;
            }
            fti<Boolean> ftiVarT8iq = personalizeViewModel10.t8iq();
            final C2535h c2535h = new C2535h();
            ftiVarT8iq.m4391p(this, new jp0y() { // from class: com.android.thememanager.settings.personalize.activity.f7l8
                @Override // androidx.lifecycle.jp0y
                public final void toq(Object obj) {
                    PersonalizeActivity.m2t(c2535h, obj);
                }
            });
        }
        PersonalizeViewModel personalizeViewModel11 = this.f15183d;
        if (personalizeViewModel11 == null) {
            d2ok.n5r1("mVM");
        } else {
            personalizeViewModel2 = personalizeViewModel11;
        }
        fti<TemplateConfig> ftiVarGyi = personalizeViewModel2.gyi();
        final f7l8 f7l8Var = new f7l8();
        ftiVarGyi.m4391p(this, new jp0y() { // from class: com.android.thememanager.settings.personalize.activity.y
            @Override // androidx.lifecycle.jp0y
            public final void toq(Object obj) {
                PersonalizeActivity.u38j(f7l8Var, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void wlev() {
        FindMoreButton findMoreButton;
        int i2 = this.f60803ab;
        if (i2 == 0) {
            return;
        }
        if (this.bb < i2) {
            if (!this.an.getAndSet(false) || (findMoreButton = this.in) == null) {
                return;
            }
            findMoreButton.n7h();
            return;
        }
        if (this.an.getAndSet(true)) {
            return;
        }
        FindMoreButton findMoreButton2 = this.in;
        if (findMoreButton2 != null) {
            if (findMoreButton2 != null) {
                findMoreButton2.ki();
            }
        } else {
            ec();
            FindMoreButton findMoreButton3 = this.in;
            if (findMoreButton3 != null) {
                findMoreButton3.post(new Runnable() { // from class: com.android.thememanager.settings.personalize.activity.n7h
                    @Override // java.lang.Runnable
                    public final void run() {
                        PersonalizeActivity.ga(this.f15210k);
                    }
                });
            }
        }
    }

    private final void yp31() {
        gcp();
        IRecommendListView iRecommendListViewBuild = kx3().build();
        d2ok.kja0(iRecommendListViewBuild, "build(...)");
        this.f15180a = iRecommendListViewBuild;
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.root_container);
        IRecommendListView iRecommendListView = this.f15180a;
        RecyclerView recyclerView = null;
        if (iRecommendListView == null) {
            d2ok.n5r1("mRecommendListView");
            iRecommendListView = null;
        }
        View view = this.f15191u;
        if (view == null) {
            d2ok.n5r1("mHeaderView");
            view = null;
        }
        iRecommendListView.addHeaderView(view);
        IRecommendListView iRecommendListView2 = this.f15180a;
        if (iRecommendListView2 == null) {
            d2ok.n5r1("mRecommendListView");
            iRecommendListView2 = null;
        }
        frameLayout.addView(iRecommendListView2, 0);
        IRecommendListView iRecommendListView3 = this.f15180a;
        if (iRecommendListView3 == null) {
            d2ok.n5r1("mRecommendListView");
            iRecommendListView3 = null;
        }
        View viewFindViewById = iRecommendListView3.findViewById(R.id.recyclerView);
        d2ok.kja0(viewFindViewById, "findViewById(...)");
        RecyclerView recyclerView2 = (RecyclerView) viewFindViewById;
        this.f60804bo = recyclerView2;
        if (recyclerView2 == null) {
            d2ok.n5r1("mRecycleView");
        } else {
            recyclerView = recyclerView2;
        }
        recyclerView.addOnScrollListener(new cdj());
        Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: com.android.thememanager.settings.personalize.activity.k
            @Override // android.os.MessageQueue.IdleHandler
            public final boolean queueIdle() {
                return PersonalizeActivity.zff0(this.f15205k);
            }
        });
    }

    private final void yw() {
        View viewInflate = LayoutInflater.from(this).inflate(R.layout.personalize_header_view, (ViewGroup) findViewById(R.id.root_container), false);
        d2ok.kja0(viewInflate, "inflate(...)");
        this.f15191u = viewInflate;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
        View view = this.f15191u;
        WallpaperCardView wallpaperCardView = null;
        if (view == null) {
            d2ok.n5r1("mHeaderView");
            view = null;
        }
        view.setLayoutParams(layoutParams);
        View view2 = this.f15191u;
        if (view2 == null) {
            d2ok.n5r1("mHeaderView");
            view2 = null;
        }
        View viewFindViewById = view2.findViewById(R.id.lock_screen_view);
        d2ok.kja0(viewFindViewById, "findViewById(...)");
        this.f15190r = (LockScreenCardView) viewFindViewById;
        View view3 = this.f15191u;
        if (view3 == null) {
            d2ok.n5r1("mHeaderView");
            view3 = null;
        }
        View viewFindViewById2 = view3.findViewById(R.id.theme_card_view);
        d2ok.kja0(viewFindViewById2, "findViewById(...)");
        this.f15187l = (ThemeCardView) viewFindViewById2;
        View view4 = this.f15191u;
        if (view4 == null) {
            d2ok.n5r1("mHeaderView");
            view4 = null;
        }
        View viewFindViewById3 = view4.findViewById(R.id.wallpaper_card_view);
        d2ok.kja0(viewFindViewById3, "findViewById(...)");
        this.f15185f = (WallpaperCardView) viewFindViewById3;
        Point pointFn3e = y9n.fn3e();
        int iM23305t = kotlin.ranges.fn3e.m23305t(pointFn3e.x, pointFn3e.y);
        kotlin.ranges.fn3e.fn3e(pointFn3e.x, pointFn3e.y);
        float f2 = iM23305t;
        int i2 = (int) (0.525f * f2);
        int i3 = (int) (i2 * 2.131068f);
        LockScreenCardView lockScreenCardView = this.f15190r;
        if (lockScreenCardView == null) {
            d2ok.n5r1("mLockScreenView");
            lockScreenCardView = null;
        }
        ViewGroup.LayoutParams layoutParams2 = lockScreenCardView.getLayoutParams();
        d2ok.n7h(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.toq toqVar = (ConstraintLayout.toq) layoutParams2;
        ((ViewGroup.MarginLayoutParams) toqVar).width = i2;
        ((ViewGroup.MarginLayoutParams) toqVar).height = i3;
        LockScreenCardView lockScreenCardView2 = this.f15190r;
        if (lockScreenCardView2 == null) {
            d2ok.n5r1("mLockScreenView");
            lockScreenCardView2 = null;
        }
        lockScreenCardView2.setLayoutParams(toqVar);
        int i4 = (int) (f2 * 0.38148147f);
        int dimension = (i3 - (((int) getResources().getDimension(R.dimen.personalize_top_card_margin)) * 1)) / 2;
        ThemeCardView themeCardView = this.f15187l;
        if (themeCardView == null) {
            d2ok.n5r1("mThemeCardView");
            themeCardView = null;
        }
        ViewGroup.LayoutParams layoutParams3 = themeCardView.getLayoutParams();
        d2ok.n7h(layoutParams3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.toq toqVar2 = (ConstraintLayout.toq) layoutParams3;
        ((ViewGroup.MarginLayoutParams) toqVar2).height = dimension;
        ((ViewGroup.MarginLayoutParams) toqVar2).width = i4;
        int dimensionPixelOffset = ((i4 - (getResources().getDimensionPixelOffset(R.dimen.personalize_theme_card_lock_margin_start) * 2)) - getResources().getDimensionPixelOffset(R.dimen.personalize_theme_card_desk_margin_start)) / 2;
        int i5 = (int) (((double) dimensionPixelOffset) / 0.462d);
        ThemeCardView themeCardView2 = this.f15187l;
        if (themeCardView2 == null) {
            d2ok.n5r1("mThemeCardView");
            themeCardView2 = null;
        }
        themeCardView2.m9118s(dimensionPixelOffset, i5);
        WallpaperCardView wallpaperCardView2 = this.f15185f;
        if (wallpaperCardView2 == null) {
            d2ok.n5r1("mWallpaperCardView");
            wallpaperCardView2 = null;
        }
        ViewGroup.LayoutParams layoutParams4 = wallpaperCardView2.getLayoutParams();
        d2ok.n7h(layoutParams4, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.toq toqVar3 = (ConstraintLayout.toq) layoutParams4;
        ((ViewGroup.MarginLayoutParams) toqVar3).width = i4;
        ((ViewGroup.MarginLayoutParams) toqVar3).height = dimension;
        ThemeCardView themeCardView3 = this.f15187l;
        if (themeCardView3 == null) {
            d2ok.n5r1("mThemeCardView");
            themeCardView3 = null;
        }
        themeCardView3.setClipToOutline(true);
        ThemeCardView themeCardView4 = this.f15187l;
        if (themeCardView4 == null) {
            d2ok.n5r1("mThemeCardView");
            themeCardView4 = null;
        }
        themeCardView4.setOutlineProvider(this.ac);
        WallpaperCardView wallpaperCardView3 = this.f15185f;
        if (wallpaperCardView3 == null) {
            d2ok.n5r1("mWallpaperCardView");
            wallpaperCardView3 = null;
        }
        wallpaperCardView3.setClipToOutline(true);
        WallpaperCardView wallpaperCardView4 = this.f15185f;
        if (wallpaperCardView4 == null) {
            d2ok.n5r1("mWallpaperCardView");
            wallpaperCardView4 = null;
        }
        wallpaperCardView4.setOutlineProvider(this.ac);
        View[] viewArr = new View[3];
        LockScreenCardView lockScreenCardView3 = this.f15190r;
        if (lockScreenCardView3 == null) {
            d2ok.n5r1("mLockScreenView");
            lockScreenCardView3 = null;
        }
        viewArr[0] = lockScreenCardView3;
        ThemeCardView themeCardView5 = this.f15187l;
        if (themeCardView5 == null) {
            d2ok.n5r1("mThemeCardView");
            themeCardView5 = null;
        }
        viewArr[1] = themeCardView5;
        WallpaperCardView wallpaperCardView5 = this.f15185f;
        if (wallpaperCardView5 == null) {
            d2ok.n5r1("mWallpaperCardView");
        } else {
            wallpaperCardView = wallpaperCardView5;
        }
        viewArr[2] = wallpaperCardView;
        C6077k.jk(viewArr);
        rp();
        ix();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z4t(cyoe.x2 tmp0, Object obj) {
        d2ok.m23075h(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean zff0(PersonalizeActivity this$0) {
        d2ok.m23075h(this$0, "this$0");
        kotlinx.coroutines.x2.m24649g(androidx.lifecycle.o1t.m4467k(this$0), null, null, this$0.new ki(null), 3, null);
        return false;
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k
    @InterfaceC7396q
    /* JADX INFO: renamed from: a */
    public String mo6345a() {
        return "personalize";
    }

    @Override // com.android.thememanager.wallpaper.InterfaceC2950k
    /* JADX INFO: renamed from: g */
    public void mo6375g() {
        getWindow().setColorMode(C2949g.f17747k.ld6() ? 1 : 0);
        PersonalizeViewModel personalizeViewModel = this.f15183d;
        if (personalizeViewModel == null) {
            d2ok.n5r1("mVM");
            personalizeViewModel = null;
        }
        personalizeViewModel.tfm(4);
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k
    /* JADX INFO: renamed from: m */
    protected int mo6344m() {
        return 1;
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k
    protected boolean mu() {
        return false;
    }

    @Override // com.android.thememanager.settings.personalize.presenter.InterfaceC2579k
    @InterfaceC7396q
    /* JADX INFO: renamed from: o05, reason: merged with bridge method [inline-methods] */
    public PersonalizeViewModel fti() {
        PersonalizeViewModel personalizeViewModel = this.f15183d;
        if (personalizeViewModel != null) {
            return personalizeViewModel;
        }
        d2ok.n5r1("mVM");
        return null;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@InterfaceC7395n View view) {
        String str;
        String str2;
        if (view == null) {
            Log.d(am, "click view is null.");
            return;
        }
        Intent intentM9126k = null;
        switch (view.getId()) {
            case R.id.aod_item /* 2131427466 */:
                intentM9126k = com.android.thememanager.settings.personalize.x2.m9126k(com.android.thememanager.settings.personalize.x2.f15356g);
                str = "personalize_aod_card";
                str2 = "aod";
                break;
            case R.id.finger_style_item /* 2131427954 */:
                intentM9126k = com.android.thememanager.settings.personalize.x2.m9126k(com.android.thememanager.settings.personalize.x2.f15359p);
                str2 = com.android.thememanager.basemodule.analysis.toq.un3l;
                str = com.android.thememanager.basemodule.analysis.toq.z0;
                break;
            case R.id.font_item /* 2131427981 */:
                if (C1819o.dd(this)) {
                    nn86.m7150k(R.string.multiwindow_no_support, 0);
                    return;
                } else if (o1t.fu4()) {
                    nn86.m7150k(R.string.personalize_second_space_not_support_set_font, 0);
                    return;
                } else {
                    intentM9126k = com.android.thememanager.settings.personalize.x2.m9126k(com.android.thememanager.settings.personalize.x2.f60839f7l8);
                    str = "personalize_font_card";
                    str2 = com.android.thememanager.basemodule.analysis.toq.azf;
                }
                break;
            case R.id.icon_item /* 2131428080 */:
                intentM9126k = com.android.thememanager.settings.personalize.x2.m9126k(com.android.thememanager.settings.personalize.x2.f15362y);
                str = "personalize_icon_card";
                str2 = "icon";
                break;
            case R.id.notify_light_item /* 2131428420 */:
                intentM9126k = com.android.thememanager.settings.personalize.x2.m9126k(com.android.thememanager.settings.personalize.x2.f15361s);
                str = com.android.thememanager.basemodule.analysis.toq.da;
                str2 = com.android.thememanager.basemodule.analysis.toq.ume;
                break;
            default:
                str = null;
                str2 = null;
                break;
        }
        if (intentM9126k != null) {
            intentM9126k.putExtra(x9kr.f10438g, "personalize");
            try {
                startActivity(intentM9126k);
            } catch (Exception e2) {
                C7794k.m28198s(am, "startActivity error: ", e2);
            }
            ArrayMap<String, Object> arrayMapM6679k = com.android.thememanager.basemodule.analysis.zy.m6679k();
            if (str2 != null) {
                d2ok.qrj(arrayMapM6679k);
                arrayMapM6679k.put("cardIndx", com.android.thememanager.basemodule.analysis.toq.ume);
            }
            C1708s.f7l8().ld6().ni7(C1706p.n7h("personalize", str, arrayMapM6679k));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00be  */
    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, miuix.appcompat.app.t8r, androidx.fragment.app.ActivityC0891q, androidx.activity.ComponentActivity, androidx.core.app.cdj, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onCreate(@mub.InterfaceC7395n android.os.Bundle r5) {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.settings.personalize.activity.PersonalizeActivity.onCreate(android.os.Bundle):void");
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, miuix.appcompat.app.t8r, androidx.fragment.app.ActivityC0891q, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        tww7();
        C2949g.f17747k.m10468s(this);
        com.android.thememanager.basemodule.utils.ni7.m7146k().m7147n(com.android.thememanager.basemodule.privacy.x2.f57643qrj, this.bq);
        com.android.thememanager.settings.personalize.f7l8 f7l8Var = this.f15181b;
        if (f7l8Var == null) {
            d2ok.n5r1("lockScreenTipController");
            f7l8Var = null;
        }
        f7l8Var.qrj();
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, androidx.fragment.app.ActivityC0891q, android.app.Activity
    protected void onPause() {
        super.onPause();
        PersonalizeViewModel personalizeViewModel = this.f15183d;
        if (personalizeViewModel == null) {
            d2ok.n5r1("mVM");
            personalizeViewModel = null;
        }
        personalizeViewModel.lh(this);
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, androidx.fragment.app.ActivityC0891q, android.app.Activity
    protected void onResume() {
        super.onResume();
        PersonalizeViewModel personalizeViewModel = null;
        if (o1t.m7171i()) {
            PersonalizeViewModel personalizeViewModel2 = this.f15183d;
            if (personalizeViewModel2 == null) {
                d2ok.n5r1("mVM");
            } else {
                personalizeViewModel = personalizeViewModel2;
            }
            personalizeViewModel.r8s8();
            return;
        }
        PersonalizeViewModel personalizeViewModel3 = this.f15183d;
        if (personalizeViewModel3 == null) {
            d2ok.n5r1("mVM");
        } else {
            personalizeViewModel = personalizeViewModel3;
        }
        personalizeViewModel.tfm(4);
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, androidx.fragment.app.ActivityC0891q, android.app.Activity
    protected void onStart() {
        super.onStart();
        com.android.thememanager.basemodule.utils.ni7.m7146k().toq("com.android.thememanager.action.REQUEST_PERMISSION", this.ba);
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, miuix.appcompat.app.t8r, androidx.fragment.app.ActivityC0891q, android.app.Activity
    protected void onStop() {
        super.onStop();
        com.android.thememanager.basemodule.utils.ni7.m7146k().m7147n("com.android.thememanager.action.REQUEST_PERMISSION", this.ba);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        if (!z2 || isFinishing() || this.az) {
            return;
        }
        this.az = true;
        com.android.thememanager.settings.personalize.f7l8 f7l8Var = this.f15181b;
        LockScreenCardView lockScreenCardView = null;
        if (f7l8Var == null) {
            d2ok.n5r1("lockScreenTipController");
            f7l8Var = null;
        }
        LockScreenCardView lockScreenCardView2 = this.f15190r;
        if (lockScreenCardView2 == null) {
            d2ok.n5r1("mLockScreenView");
        } else {
            lockScreenCardView = lockScreenCardView2;
        }
        f7l8Var.m9056s(this, lockScreenCardView);
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k
    /* JADX INFO: renamed from: u */
    protected void mo6714u() {
        IRecommendListView iRecommendListView = this.f15180a;
        if (iRecommendListView == null) {
            d2ok.n5r1("mRecommendListView");
            iRecommendListView = null;
        }
        iRecommendListView.refreshData();
    }

    public final void wt(@InterfaceC7396q List<UIElement> uiElements) {
        d2ok.m23075h(uiElements, "uiElements");
        if (uiElements.size() < 2) {
            return;
        }
        String string = bf2.toq.toq().getString(R.string.present_online_themes);
        d2ok.kja0(string, "getString(...)");
        uiElements.set(0, new PersonalizeRecommendTitleElement(string));
        SettingStaggerLocalBannerGroupElement settingStaggerLocalBannerGroupElement = new SettingStaggerLocalBannerGroupElement();
        ArrayList arrayList = new ArrayList(2);
        settingStaggerLocalBannerGroupElement.mBanners = arrayList;
        UIDrawableWithLink uIDrawableWithLink = new UIDrawableWithLink();
        uIDrawableWithLink.drawable = R.drawable.rc_theme_setting_local_banner_all;
        uIDrawableWithLink.title = bf2.toq.toq().getString(R.string.theme_setting_all);
        UILink uILink = new UILink();
        uILink.link = ViewOnClickListenerC2517i.ac;
        uILink.productType = "THEME";
        uILink.title = bf2.toq.toq().getString(R.string.theme_setting_all);
        uILink.trackId = ViewOnClickListenerC2517i.ax;
        uILink.type = "HREF";
        uIDrawableWithLink.link = uILink;
        arrayList.add(uIDrawableWithLink);
        UIDrawableWithLink uIDrawableWithLink2 = new UIDrawableWithLink();
        uIDrawableWithLink2.drawable = R.drawable.rc_theme_setting_local_banner_category;
        uIDrawableWithLink2.title = bf2.toq.toq().getString(R.string.resource_category);
        UILink uILink2 = new UILink();
        uILink2.link = ViewOnClickListenerC2517i.ad;
        uILink2.productType = "THEME";
        uILink2.title = bf2.toq.toq().getString(R.string.resource_category);
        uILink2.trackId = ViewOnClickListenerC2517i.bq;
        uILink2.type = "HREF";
        uIDrawableWithLink2.link = uILink2;
        arrayList.add(uIDrawableWithLink2);
        uiElements.set(1, settingStaggerLocalBannerGroupElement);
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k
    protected void y2(int i2) {
        super.y2(i2);
        if (i2 == 1) {
            lvui.m7131s(this, this.ax);
        }
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, com.android.thememanager.basemodule.privacy.C1781k.f7l8
    public void y9n(boolean z2) {
        super.y9n(z2);
        if (z2) {
            lvui.m7131s(this, this.ax);
        }
    }
}
