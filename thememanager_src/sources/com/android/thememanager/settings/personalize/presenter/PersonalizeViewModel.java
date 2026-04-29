package com.android.thememanager.settings.personalize.presenter;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.app.WallpaperColors;
import android.app.WallpaperInfo;
import android.app.WallpaperManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;
import android.util.Pair;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.fti;
import androidx.lifecycle.uv6;
import com.android.thememanager.C2964y;
import com.android.thememanager.basemodule.base.C1723y;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.utils.o1t;
import com.android.thememanager.basemodule.utils.qrj;
import com.android.thememanager.basemodule.utils.y9n;
import com.android.thememanager.lockscreen.lock.ClockInfo;
import com.android.thememanager.lockscreen.lock.DoodleInfo;
import com.android.thememanager.lockscreen.lock.SignatureInfo;
import com.android.thememanager.lockscreen.lock.TemplateConfig;
import com.android.thememanager.settings.eqxt;
import com.android.thememanager.settings.personalize.C2567p;
import com.android.thememanager.settings.personalize.activity.PersonalizeActivity;
import com.android.thememanager.settings.personalize.task.C2582g;
import com.android.thememanager.settings.personalize.task.C2584n;
import com.android.thememanager.settings.superwallpaper.activity.data.C2640k;
import com.android.thememanager.settings.superwallpaper.activity.data.SuperWallpaperSummaryData;
import com.android.thememanager.settings.superwallpaper.utils.C2670y;
import com.android.thememanager.util.C2763c;
import com.android.thememanager.wallpaper.C2951n;
import com.miui.miwallpaper.C5306p;
import com.miui.miwallpaper.IMiuiWallpaperManagerCallback;
import cyoe.InterfaceC5979h;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import kotlin.C6318m;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.intrinsics.C6199q;
import kotlin.coroutines.jvm.internal.AbstractC6209q;
import kotlin.coroutines.jvm.internal.InterfaceC6205g;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.ni7;
import kotlin.math.C6321q;
import kotlin.ranges.fn3e;
import kotlin.was;
import kotlinx.coroutines.C6481a;
import kotlinx.coroutines.C6708p;
import kotlinx.coroutines.InterfaceC6556f;
import kotlinx.coroutines.dd;
import kotlinx.coroutines.ek5k;
import kotlinx.coroutines.z4;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import uj2j.C7688k;
import uj2j.C7689q;

/* JADX INFO: compiled from: PersonalizeViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class PersonalizeViewModel extends androidx.lifecycle.toq {

    @InterfaceC7396q
    public static final toq ac = new toq(null);
    private static final float ad = 0.60136676f;
    private static final float aj = 0.6326034f;
    private static final float am = 0.5927835f;
    private static final float ar = 0.3167702f;
    private static final float ay = 0.3166287f;
    public static final float bc = 0.525f;
    public static final float bd = 2.131068f;
    private static final float be = 0.24484536f;
    private static final float bs = 0.27980536f;
    public static final float bu = 0.38148147f;
    private static final float k0 = 0.6086956f;
    public static final int tgs = 3;
    public static final int tlhn = 1;
    public static final int w97r = 2;
    public static final int yl25 = 4;

    /* JADX INFO: renamed from: a */
    @InterfaceC7395n
    private Bitmap f15276a;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    @InterfaceC7396q
    private fti<DoodleInfo> f60825ab;
    private final WallpaperManager an;

    @InterfaceC7395n
    private BroadcastReceiver as;

    @InterfaceC7396q
    private final fti<C1723y<Boolean>> ax;
    private boolean az;

    /* JADX INFO: renamed from: b */
    private int f15277b;
    private final PackageManager ba;

    @InterfaceC7396q
    private fti<Integer> bb;

    @InterfaceC7395n
    private IntentFilter bg;
    private int bl;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    @InterfaceC7396q
    private fti<C7689q> f60826bo;

    @InterfaceC7396q
    private fti<Boolean> bp;

    @InterfaceC7396q
    private final PersonalizeViewModel$mWallpaperChangeListener$1 bq;

    @InterfaceC7396q
    private fti<Boolean> bv;

    /* JADX INFO: renamed from: c */
    @InterfaceC7395n
    private Bitmap f15278c;

    /* JADX INFO: renamed from: d */
    @InterfaceC7396q
    private fti<ClockInfo> f15279d;

    /* JADX INFO: renamed from: e */
    @InterfaceC7395n
    private Bitmap f15280e;

    /* JADX INFO: renamed from: f */
    @InterfaceC7396q
    private fti<C1723y<uj2j.toq>> f15281f;

    /* JADX INFO: renamed from: h */
    @InterfaceC7395n
    private Bitmap f15282h;

    /* JADX INFO: renamed from: i */
    @InterfaceC7395n
    private Bitmap f15283i;

    @InterfaceC7395n
    private List<? extends ResolveInfo> id;

    @InterfaceC7396q
    private Calendar in;

    /* JADX INFO: renamed from: j */
    @InterfaceC7395n
    private Bitmap f15284j;

    /* JADX INFO: renamed from: l */
    private boolean f15285l;

    /* JADX INFO: renamed from: m */
    @InterfaceC7395n
    private SuperWallpaperSummaryData f15286m;

    /* JADX INFO: renamed from: o */
    @InterfaceC7396q
    private fti<C7688k> f15287o;

    /* JADX INFO: renamed from: p */
    private int f15288p;

    /* JADX INFO: renamed from: r */
    @InterfaceC7395n
    private SuperWallpaperSummaryData f15289r;

    /* JADX INFO: renamed from: s */
    @InterfaceC7395n
    private String f15290s;

    /* JADX INFO: renamed from: t */
    private boolean f15291t;

    /* JADX INFO: renamed from: u */
    private boolean f15292u;

    /* JADX INFO: renamed from: v */
    @InterfaceC7396q
    private fti<TemplateConfig> f15293v;

    /* JADX INFO: renamed from: w */
    @InterfaceC7396q
    private fti<SignatureInfo> f15294w;

    /* JADX INFO: renamed from: x */
    @InterfaceC7395n
    private Bitmap f15295x;

    /* JADX INFO: renamed from: y */
    @InterfaceC7396q
    private final Application f15296y;

    /* JADX INFO: renamed from: z */
    private boolean f15297z;

    /* JADX INFO: compiled from: PersonalizeViewModel.kt */
    @InterfaceC6205g(m22755c = "com.android.thememanager.settings.personalize.presenter.PersonalizeViewModel$supportUnityWallpaper$2", m22756f = "PersonalizeViewModel.kt", m22757i = {}, m22758l = {}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
    static final class cdj extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super Boolean>, Object> {
        int label;

        cdj(InterfaceC6216q<? super cdj> interfaceC6216q) {
            super(2, interfaceC6216q);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            return new cdj(interfaceC6216q);
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7395n InterfaceC6216q<? super Boolean> interfaceC6216q) {
            return ((cdj) create(interfaceC6556f, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            C6199q.x2();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C6318m.n7h(obj);
            return kotlin.coroutines.jvm.internal.toq.m22766k(eqxt.f7l8());
        }
    }

    /* JADX INFO: compiled from: PersonalizeViewModel.kt */
    @InterfaceC6205g(m22755c = "com.android.thememanager.settings.personalize.presenter.PersonalizeViewModel$loadDeskPreview$2", m22756f = "PersonalizeViewModel.kt", m22757i = {}, m22758l = {479}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
    static final class f7l8 extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super Bitmap>, Object> {
        int label;

        f7l8(InterfaceC6216q<? super f7l8> interfaceC6216q) {
            super(2, interfaceC6216q);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            return PersonalizeViewModel.this.new f7l8(interfaceC6216q);
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7395n InterfaceC6216q<? super Bitmap> interfaceC6216q) {
            return ((f7l8) create(interfaceC6556f, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            Object objX2 = C6199q.x2();
            int i2 = this.label;
            if (i2 == 0) {
                C6318m.n7h(obj);
                com.android.thememanager.settings.personalize.task.toq toqVar = com.android.thememanager.settings.personalize.task.toq.f15308k;
                this.label = 1;
                obj = toqVar.m9103k(this);
                if (obj == objX2) {
                    return objX2;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6318m.n7h(obj);
            }
            Bitmap bitmap = (Bitmap) obj;
            if (bitmap != null) {
                return PersonalizeViewModel.this.z4(bitmap, false);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.settings.personalize.presenter.PersonalizeViewModel$g */
    /* JADX INFO: compiled from: PersonalizeViewModel.kt */
    @InterfaceC6205g(m22755c = "com.android.thememanager.settings.personalize.presenter.PersonalizeViewModel$loadBgWallpaper$1", m22756f = "PersonalizeViewModel.kt", m22757i = {}, m22758l = {558}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
    static final class C2568g extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super was>, Object> {
        final /* synthetic */ uj2j.zy $superWallpaperInfo;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2568g(uj2j.zy zyVar, InterfaceC6216q<? super C2568g> interfaceC6216q) {
            super(2, interfaceC6216q);
            this.$superWallpaperInfo = zyVar;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            return PersonalizeViewModel.this.new C2568g(this.$superWallpaperInfo, interfaceC6216q);
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
            return ((C2568g) create(interfaceC6556f, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            Object objX2 = C6199q.x2();
            int i2 = this.label;
            if (i2 == 0) {
                C6318m.n7h(obj);
                PersonalizeViewModel personalizeViewModel = PersonalizeViewModel.this;
                SuperWallpaperSummaryData superWallpaperSummaryData = personalizeViewModel.f15286m;
                int iF7l8 = this.$superWallpaperInfo.f7l8();
                int iLv5 = PersonalizeViewModel.this.lv5();
                String strM28083g = this.$superWallpaperInfo.m28083g();
                this.label = 1;
                obj = personalizeViewModel.zsr0(superWallpaperSummaryData, iF7l8, iLv5, strM28083g, this);
                if (obj == objX2) {
                    return objX2;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6318m.n7h(obj);
            }
            C7688k c7688k = (C7688k) obj;
            if (c7688k != null) {
                PersonalizeViewModel.this.m9089x().cdj(c7688k);
            }
            return was.f36763k;
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.settings.personalize.presenter.PersonalizeViewModel$h */
    /* JADX INFO: compiled from: PersonalizeViewModel.kt */
    public static final class C2569h extends BroadcastReceiver {
        C2569h() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(@InterfaceC7396q Context context, @InterfaceC7396q Intent intent) {
            d2ok.m23075h(context, "context");
            d2ok.m23075h(intent, "intent");
            if (d2ok.f7l8("android.intent.action.TIME_TICK", intent.getAction())) {
                PersonalizeViewModel.this.in.setTimeInMillis(System.currentTimeMillis());
                int i2 = PersonalizeViewModel.this.in.get(12);
                Log.d("PersonalizeVM", "mTimeTickRunnable " + i2 + ' ' + PersonalizeViewModel.this.bl);
                if (i2 != PersonalizeViewModel.this.bl) {
                    PersonalizeViewModel.this.bl = i2;
                    PersonalizeViewModel.this.v0af();
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.settings.personalize.presenter.PersonalizeViewModel$k */
    /* JADX INFO: compiled from: PersonalizeViewModel.kt */
    @InterfaceC6205g(m22755c = "com.android.thememanager.settings.personalize.presenter.PersonalizeViewModel$1", m22756f = "PersonalizeViewModel.kt", m22757i = {}, m22758l = {202}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
    static final class C2570k extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super was>, Object> {
        Object L$0;
        int label;

        /* JADX INFO: renamed from: com.android.thememanager.settings.personalize.presenter.PersonalizeViewModel$k$k */
        /* JADX INFO: compiled from: PersonalizeViewModel.kt */
        @InterfaceC6205g(m22755c = "com.android.thememanager.settings.personalize.presenter.PersonalizeViewModel$1$1", m22756f = "PersonalizeViewModel.kt", m22757i = {}, m22758l = {}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
        static final class k extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super List<? extends ResolveInfo>>, Object> {
            int label;
            final /* synthetic */ PersonalizeViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            k(PersonalizeViewModel personalizeViewModel, InterfaceC6216q<? super k> interfaceC6216q) {
                super(2, interfaceC6216q);
                this.this$0 = personalizeViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
            @InterfaceC7396q
            public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
                return new k(this.this$0, interfaceC6216q);
            }

            @Override // cyoe.InterfaceC5979h
            @InterfaceC7395n
            public final Object invoke(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7395n InterfaceC6216q<? super List<? extends ResolveInfo>> interfaceC6216q) {
                return ((k) create(interfaceC6556f, interfaceC6216q)).invokeSuspend(was.f36763k);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
            @InterfaceC7395n
            public final Object invokeSuspend(@InterfaceC7396q Object obj) {
                C6199q.x2();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6318m.n7h(obj);
                return this.this$0.etdu();
            }
        }

        C2570k(InterfaceC6216q<? super C2570k> interfaceC6216q) {
            super(2, interfaceC6216q);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            return PersonalizeViewModel.this.new C2570k(interfaceC6216q);
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
            return ((C2570k) create(interfaceC6556f, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) throws Throwable {
            PersonalizeViewModel personalizeViewModel;
            Object objX2 = C6199q.x2();
            int i2 = this.label;
            if (i2 == 0) {
                C6318m.n7h(obj);
                PersonalizeViewModel personalizeViewModel2 = PersonalizeViewModel.this;
                dd ddVarZy = C6481a.zy();
                k kVar = new k(PersonalizeViewModel.this, null);
                this.L$0 = personalizeViewModel2;
                this.label = 1;
                Object objM24523y = C6708p.m24523y(ddVarZy, kVar, this);
                if (objM24523y == objX2) {
                    return objX2;
                }
                personalizeViewModel = personalizeViewModel2;
                obj = objM24523y;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                personalizeViewModel = (PersonalizeViewModel) this.L$0;
                C6318m.n7h(obj);
            }
            personalizeViewModel.id = (List) obj;
            return was.f36763k;
        }
    }

    /* JADX INFO: compiled from: PersonalizeViewModel.kt */
    @InterfaceC6205g(m22755c = "com.android.thememanager.settings.personalize.presenter.PersonalizeViewModel", m22756f = "PersonalizeViewModel.kt", m22757i = {0, 1}, m22758l = {504, 511}, m22759m = "refreshClockView", m22760n = {"this", "this"}, m22761s = {"L$0", "L$0"})
    static final class kja0 extends AbstractC6209q {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        kja0(InterfaceC6216q<? super kja0> interfaceC6216q) {
            super(interfaceC6216q);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PersonalizeViewModel.this.yqrt(this);
        }
    }

    /* JADX INFO: compiled from: PersonalizeViewModel.kt */
    @InterfaceC6205g(m22755c = "com.android.thememanager.settings.personalize.presenter.PersonalizeViewModel$loadLockScreenSetting$1", m22756f = "PersonalizeViewModel.kt", m22757i = {}, m22758l = {489}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
    static final class ld6 extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super was>, Object> {
        int label;

        /* JADX INFO: renamed from: com.android.thememanager.settings.personalize.presenter.PersonalizeViewModel$ld6$k */
        /* JADX INFO: compiled from: PersonalizeViewModel.kt */
        @InterfaceC6205g(m22755c = "com.android.thememanager.settings.personalize.presenter.PersonalizeViewModel$loadLockScreenSetting$1$result$1", m22756f = "PersonalizeViewModel.kt", m22757i = {}, m22758l = {490}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
        static final class C2571k extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super TemplateConfig>, Object> {
            int label;

            C2571k(InterfaceC6216q<? super C2571k> interfaceC6216q) {
                super(2, interfaceC6216q);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
            @InterfaceC7396q
            public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
                return new C2571k(interfaceC6216q);
            }

            @Override // cyoe.InterfaceC5979h
            @InterfaceC7395n
            public final Object invoke(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7395n InterfaceC6216q<? super TemplateConfig> interfaceC6216q) {
                return ((C2571k) create(interfaceC6556f, interfaceC6216q)).invokeSuspend(was.f36763k);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
            @InterfaceC7395n
            public final Object invokeSuspend(@InterfaceC7396q Object obj) {
                Object objX2 = C6199q.x2();
                int i2 = this.label;
                if (i2 == 0) {
                    C6318m.n7h(obj);
                    this.label = 1;
                    if (ek5k.toq(300L, this) == objX2) {
                        return objX2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C6318m.n7h(obj);
                }
                return C2670y.m9306k();
            }
        }

        ld6(InterfaceC6216q<? super ld6> interfaceC6216q) {
            super(2, interfaceC6216q);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            return PersonalizeViewModel.this.new ld6(interfaceC6216q);
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
            return ((ld6) create(interfaceC6556f, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) throws Throwable {
            Object objX2 = C6199q.x2();
            int i2 = this.label;
            if (i2 == 0) {
                C6318m.n7h(obj);
                dd ddVarZy = C6481a.zy();
                C2571k c2571k = new C2571k(null);
                this.label = 1;
                obj = C6708p.m24523y(ddVarZy, c2571k, this);
                if (obj == objX2) {
                    return objX2;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6318m.n7h(obj);
            }
            PersonalizeViewModel.this.gyi().cdj((TemplateConfig) obj);
            boolean zO1t = o1t.o1t(bf2.toq.toq());
            if (!d2ok.f7l8(PersonalizeViewModel.this.t8iq().m4388g(), kotlin.coroutines.jvm.internal.toq.m22766k(zO1t))) {
                PersonalizeViewModel.this.t8iq().cdj(kotlin.coroutines.jvm.internal.toq.m22766k(zO1t));
            }
            return was.f36763k;
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.settings.personalize.presenter.PersonalizeViewModel$n */
    /* JADX INFO: compiled from: PersonalizeViewModel.kt */
    @InterfaceC6205g(m22755c = "com.android.thememanager.settings.personalize.presenter.PersonalizeViewModel$initWallpaper$1", m22756f = "PersonalizeViewModel.kt", m22757i = {}, m22758l = {250, 251}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
    static final class C2572n extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super was>, Object> {
        final /* synthetic */ int $which;
        Object L$0;
        int label;

        /* JADX INFO: renamed from: com.android.thememanager.settings.personalize.presenter.PersonalizeViewModel$n$k */
        /* JADX INFO: compiled from: PersonalizeViewModel.kt */
        @InterfaceC6205g(m22755c = "com.android.thememanager.settings.personalize.presenter.PersonalizeViewModel$initWallpaper$1$1", m22756f = "PersonalizeViewModel.kt", m22757i = {}, m22758l = {}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
        static final class k extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super List<? extends ResolveInfo>>, Object> {
            int label;
            final /* synthetic */ PersonalizeViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            k(PersonalizeViewModel personalizeViewModel, InterfaceC6216q<? super k> interfaceC6216q) {
                super(2, interfaceC6216q);
                this.this$0 = personalizeViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
            @InterfaceC7396q
            public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
                return new k(this.this$0, interfaceC6216q);
            }

            @Override // cyoe.InterfaceC5979h
            @InterfaceC7395n
            public final Object invoke(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7395n InterfaceC6216q<? super List<? extends ResolveInfo>> interfaceC6216q) {
                return ((k) create(interfaceC6556f, interfaceC6216q)).invokeSuspend(was.f36763k);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
            @InterfaceC7395n
            public final Object invokeSuspend(@InterfaceC7396q Object obj) {
                C6199q.x2();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6318m.n7h(obj);
                return this.this$0.etdu();
            }
        }

        /* JADX INFO: renamed from: com.android.thememanager.settings.personalize.presenter.PersonalizeViewModel$n$toq */
        /* JADX INFO: compiled from: PersonalizeViewModel.kt */
        @InterfaceC6205g(m22755c = "com.android.thememanager.settings.personalize.presenter.PersonalizeViewModel$initWallpaper$1$wallpaperInfo$1", m22756f = "PersonalizeViewModel.kt", m22757i = {}, m22758l = {}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
        static final class toq extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super WallpaperInfo>, Object> {
            int label;
            final /* synthetic */ PersonalizeViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            toq(PersonalizeViewModel personalizeViewModel, InterfaceC6216q<? super toq> interfaceC6216q) {
                super(2, interfaceC6216q);
                this.this$0 = personalizeViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
            @InterfaceC7396q
            public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
                return new toq(this.this$0, interfaceC6216q);
            }

            @Override // cyoe.InterfaceC5979h
            @InterfaceC7395n
            public final Object invoke(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7395n InterfaceC6216q<? super WallpaperInfo> interfaceC6216q) {
                return ((toq) create(interfaceC6556f, interfaceC6216q)).invokeSuspend(was.f36763k);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
            @InterfaceC7395n
            public final Object invokeSuspend(@InterfaceC7396q Object obj) {
                C6199q.x2();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6318m.n7h(obj);
                return this.this$0.an.getWallpaperInfo();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2572n(int i2, InterfaceC6216q<? super C2572n> interfaceC6216q) {
            super(2, interfaceC6216q);
            this.$which = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            return PersonalizeViewModel.this.new C2572n(this.$which, interfaceC6216q);
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
            return ((C2572n) create(interfaceC6556f, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x007a  */
        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @mub.InterfaceC7395n
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@mub.InterfaceC7396q java.lang.Object r12) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 499
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.settings.personalize.presenter.PersonalizeViewModel.C2572n.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: compiled from: PersonalizeViewModel.kt */
    @InterfaceC6205g(m22755c = "com.android.thememanager.settings.personalize.presenter.PersonalizeViewModel$loadThemePreview$1", m22756f = "PersonalizeViewModel.kt", m22757i = {}, m22758l = {398}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
    static final class n7h extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super was>, Object> {
        int label;

        /* JADX INFO: renamed from: com.android.thememanager.settings.personalize.presenter.PersonalizeViewModel$n7h$k */
        /* JADX INFO: compiled from: PersonalizeViewModel.kt */
        @InterfaceC6205g(m22755c = "com.android.thememanager.settings.personalize.presenter.PersonalizeViewModel$loadThemePreview$1$result$1", m22756f = "PersonalizeViewModel.kt", m22757i = {}, m22758l = {399}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
        static final class C2573k extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super C7689q>, Object> {
            int label;

            C2573k(InterfaceC6216q<? super C2573k> interfaceC6216q) {
                super(2, interfaceC6216q);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
            @InterfaceC7396q
            public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
                return new C2573k(interfaceC6216q);
            }

            @Override // cyoe.InterfaceC5979h
            @InterfaceC7395n
            public final Object invoke(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7395n InterfaceC6216q<? super C7689q> interfaceC6216q) {
                return ((C2573k) create(interfaceC6556f, interfaceC6216q)).invokeSuspend(was.f36763k);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
            @InterfaceC7395n
            public final Object invokeSuspend(@InterfaceC7396q Object obj) {
                Object objX2 = C6199q.x2();
                int i2 = this.label;
                if (i2 == 0) {
                    C6318m.n7h(obj);
                    C2582g c2582g = C2582g.f15303k;
                    this.label = 1;
                    obj = c2582g.m9099s(this);
                    if (obj == objX2) {
                        return objX2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C6318m.n7h(obj);
                }
                return obj;
            }
        }

        n7h(InterfaceC6216q<? super n7h> interfaceC6216q) {
            super(2, interfaceC6216q);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            return PersonalizeViewModel.this.new n7h(interfaceC6216q);
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
            return ((n7h) create(interfaceC6556f, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) throws Throwable {
            Object objX2 = C6199q.x2();
            int i2 = this.label;
            if (i2 == 0) {
                C6318m.n7h(obj);
                dd ddVarZy = C6481a.zy();
                C2573k c2573k = new C2573k(null);
                this.label = 1;
                obj = C6708p.m24523y(ddVarZy, c2573k, this);
                if (obj == objX2) {
                    return objX2;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6318m.n7h(obj);
            }
            PersonalizeViewModel.this.dr().cdj((C7689q) obj);
            return was.f36763k;
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.settings.personalize.presenter.PersonalizeViewModel$p */
    /* JADX INFO: compiled from: PersonalizeViewModel.kt */
    @InterfaceC6205g(m22755c = "com.android.thememanager.settings.personalize.presenter.PersonalizeViewModel$loadFingerStyle$2", m22756f = "PersonalizeViewModel.kt", m22757i = {}, m22758l = {}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
    static final class C2574p extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super Pair<Integer, Bitmap>>, Object> {
        int label;

        C2574p(InterfaceC6216q<? super C2574p> interfaceC6216q) {
            super(2, interfaceC6216q);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            return PersonalizeViewModel.this.new C2574p(interfaceC6216q);
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7395n InterfaceC6216q<? super Pair<Integer, Bitmap>> interfaceC6216q) {
            return ((C2574p) create(interfaceC6556f, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            C6199q.x2();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C6318m.n7h(obj);
            return C2670y.toq(PersonalizeViewModel.this.m9085b());
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.settings.personalize.presenter.PersonalizeViewModel$q */
    /* JADX INFO: compiled from: PersonalizeViewModel.kt */
    @InterfaceC6205g(m22755c = "com.android.thememanager.settings.personalize.presenter.PersonalizeViewModel$initLunarCalendar$2", m22756f = "PersonalizeViewModel.kt", m22757i = {}, m22758l = {}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
    static final class C2575q extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super Integer>, Object> {
        int label;

        C2575q(InterfaceC6216q<? super C2575q> interfaceC6216q) {
            super(2, interfaceC6216q);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            return new C2575q(interfaceC6216q);
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7395n InterfaceC6216q<? super Integer> interfaceC6216q) {
            return ((C2575q) create(interfaceC6556f, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            C6199q.x2();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C6318m.n7h(obj);
            int i2 = 0;
            try {
                i2 = Settings.System.getInt(bf2.toq.toq().getContentResolver(), "show_lunar_calendar");
            } catch (Settings.SettingNotFoundException e2) {
                e2.printStackTrace();
            }
            return kotlin.coroutines.jvm.internal.toq.m22765g(i2);
        }
    }

    /* JADX INFO: compiled from: PersonalizeViewModel.kt */
    @InterfaceC6205g(m22755c = "com.android.thememanager.settings.personalize.presenter.PersonalizeViewModel$loadLockWallpaper$1", m22756f = "PersonalizeViewModel.kt", m22757i = {}, m22758l = {391}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
    static final class qrj extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super was>, Object> {
        int label;

        qrj(InterfaceC6216q<? super qrj> interfaceC6216q) {
            super(2, interfaceC6216q);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            return PersonalizeViewModel.this.new qrj(interfaceC6216q);
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
            return ((qrj) create(interfaceC6556f, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            Object objX2 = C6199q.x2();
            int i2 = this.label;
            if (i2 == 0) {
                C6318m.n7h(obj);
                PersonalizeViewModel personalizeViewModel = PersonalizeViewModel.this;
                SuperWallpaperSummaryData superWallpaperSummaryData = personalizeViewModel.f15286m;
                int iM9088v = PersonalizeViewModel.this.m9088v();
                this.label = 1;
                obj = personalizeViewModel.kcsr(superWallpaperSummaryData, iM9088v, this);
                if (obj == objX2) {
                    return objX2;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6318m.n7h(obj);
            }
            PersonalizeViewModel.this.bo().cdj(new C1723y<>((uj2j.toq) obj));
            return was.f36763k;
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.settings.personalize.presenter.PersonalizeViewModel$s */
    /* JADX INFO: compiled from: PersonalizeViewModel.kt */
    @InterfaceC6205g(m22755c = "com.android.thememanager.settings.personalize.presenter.PersonalizeViewModel$loadDeskWp$1", m22756f = "PersonalizeViewModel.kt", m22757i = {}, m22758l = {378}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
    static final class C2576s extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super was>, Object> {
        final /* synthetic */ boolean $needReload;
        final /* synthetic */ uj2j.zy $superWallpaperInfo;
        int label;
        final /* synthetic */ PersonalizeViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2576s(boolean z2, PersonalizeViewModel personalizeViewModel, uj2j.zy zyVar, InterfaceC6216q<? super C2576s> interfaceC6216q) {
            super(2, interfaceC6216q);
            this.$needReload = z2;
            this.this$0 = personalizeViewModel;
            this.$superWallpaperInfo = zyVar;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            return new C2576s(this.$needReload, this.this$0, this.$superWallpaperInfo, interfaceC6216q);
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
            return ((C2576s) create(interfaceC6556f, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            Object objX2 = C6199q.x2();
            int i2 = this.label;
            if (i2 == 0) {
                C6318m.n7h(obj);
                Log.d("PersonalizeVM", "load desk super wallpaper data need reload：" + this.$needReload);
                PersonalizeViewModel personalizeViewModel = this.this$0;
                this.label = 1;
                obj = personalizeViewModel.ikck(this);
                if (obj == objX2) {
                    return objX2;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6318m.n7h(obj);
            }
            this.this$0.w831((SuperWallpaperSummaryData[]) obj, this.$superWallpaperInfo, false);
            return was.f36763k;
        }
    }

    /* JADX INFO: compiled from: PersonalizeViewModel.kt */
    public static final class toq {
        private toq() {
        }

        public /* synthetic */ toq(ni7 ni7Var) {
            this();
        }

        @l05.qrj
        /* JADX INFO: renamed from: q */
        public static /* synthetic */ void m9090q() {
        }

        @l05.qrj
        public static /* synthetic */ void toq() {
        }

        /* JADX INFO: renamed from: k */
        public final float m9091k() {
            if (C1807g.lvui()) {
                return C1819o.ncyb(bf2.toq.toq()) ? PersonalizeViewModel.am : PersonalizeViewModel.ad;
            }
            if (C1807g.zurt() && C1807g.wvg()) {
                return C1819o.ncyb(bf2.toq.toq()) ? PersonalizeViewModel.k0 : PersonalizeViewModel.aj;
            }
            return 0.525f;
        }

        public final float zy() {
            if (C1807g.lvui()) {
                return C1819o.ncyb(bf2.toq.toq()) ? PersonalizeViewModel.be : PersonalizeViewModel.ay;
            }
            if (C1807g.zurt() && C1807g.wvg()) {
                return C1819o.ncyb(bf2.toq.toq()) ? PersonalizeViewModel.ar : PersonalizeViewModel.bs;
            }
            return 0.38148147f;
        }
    }

    /* JADX INFO: compiled from: PersonalizeViewModel.kt */
    @InterfaceC6205g(m22755c = "com.android.thememanager.settings.personalize.presenter.PersonalizeViewModel$loadLockScreenWp$1", m22756f = "PersonalizeViewModel.kt", m22757i = {}, m22758l = {357}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
    static final class x2 extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super was>, Object> {
        final /* synthetic */ boolean $needReload;
        final /* synthetic */ uj2j.zy $superWallpaperInfo;
        int label;
        final /* synthetic */ PersonalizeViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x2(boolean z2, PersonalizeViewModel personalizeViewModel, uj2j.zy zyVar, InterfaceC6216q<? super x2> interfaceC6216q) {
            super(2, interfaceC6216q);
            this.$needReload = z2;
            this.this$0 = personalizeViewModel;
            this.$superWallpaperInfo = zyVar;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            return new x2(this.$needReload, this.this$0, this.$superWallpaperInfo, interfaceC6216q);
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
            return ((x2) create(interfaceC6556f, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            Object objX2 = C6199q.x2();
            int i2 = this.label;
            if (i2 == 0) {
                C6318m.n7h(obj);
                Log.d("PersonalizeVM", "load lock super wallpaper data need reload：" + this.$needReload);
                PersonalizeViewModel personalizeViewModel = this.this$0;
                this.label = 1;
                obj = personalizeViewModel.ikck(this);
                if (obj == objX2) {
                    return objX2;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6318m.n7h(obj);
            }
            this.this$0.w831((SuperWallpaperSummaryData[]) obj, this.$superWallpaperInfo, true);
            return was.f36763k;
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.settings.personalize.presenter.PersonalizeViewModel$y */
    /* JADX INFO: compiled from: PersonalizeViewModel.kt */
    @InterfaceC6205g(m22755c = "com.android.thememanager.settings.personalize.presenter.PersonalizeViewModel$loadDeskWallpaper$2", m22756f = "PersonalizeViewModel.kt", m22757i = {}, m22758l = {468}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
    static final class C2577y extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super C7688k>, Object> {
        final /* synthetic */ SuperWallpaperSummaryData $data;
        final /* synthetic */ int $dpi;
        final /* synthetic */ String $name;
        final /* synthetic */ int $style;
        int label;
        final /* synthetic */ PersonalizeViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2577y(SuperWallpaperSummaryData superWallpaperSummaryData, int i2, int i3, String str, PersonalizeViewModel personalizeViewModel, InterfaceC6216q<? super C2577y> interfaceC6216q) {
            super(2, interfaceC6216q);
            this.$data = superWallpaperSummaryData;
            this.$style = i2;
            this.$dpi = i3;
            this.$name = str;
            this.this$0 = personalizeViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            return new C2577y(this.$data, this.$style, this.$dpi, this.$name, this.this$0, interfaceC6216q);
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7395n InterfaceC6216q<? super C7688k> interfaceC6216q) {
            return ((C2577y) create(interfaceC6556f, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            Bitmap bitmapM28071n;
            Object objX2 = C6199q.x2();
            int i2 = this.label;
            if (i2 == 0) {
                C6318m.n7h(obj);
                com.android.thememanager.settings.personalize.task.zy zyVar = com.android.thememanager.settings.personalize.task.zy.f15309k;
                SuperWallpaperSummaryData superWallpaperSummaryData = this.$data;
                int i3 = this.$style;
                int i4 = this.$dpi;
                String str = this.$name;
                WallpaperManager wallpaperManagerM8007k = com.android.thememanager.kja0.m8007k();
                this.label = 1;
                obj = zyVar.toq(superWallpaperSummaryData, i3, i4, str, wallpaperManagerM8007k, this);
                if (obj == objX2) {
                    return objX2;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6318m.n7h(obj);
            }
            C7688k c7688k = (C7688k) obj;
            return (c7688k == null || (bitmapM28071n = c7688k.m28071n()) == null) ? c7688k : new C7688k(this.this$0.z4(bitmapM28071n, true), c7688k.m28069g());
        }
    }

    /* JADX INFO: compiled from: PersonalizeViewModel.kt */
    @InterfaceC6205g(m22755c = "com.android.thememanager.settings.personalize.presenter.PersonalizeViewModel$getSuperWallpaperData$2", m22756f = "PersonalizeViewModel.kt", m22757i = {0}, m22758l = {454}, m22759m = "invokeSuspend", m22760n = {"data"}, m22761s = {"L$0"})
    static final class zy extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super SuperWallpaperSummaryData[]>, Object> {
        Object L$0;
        int label;

        /* JADX INFO: renamed from: com.android.thememanager.settings.personalize.presenter.PersonalizeViewModel$zy$k */
        /* JADX INFO: compiled from: PersonalizeViewModel.kt */
        @InterfaceC6205g(m22755c = "com.android.thememanager.settings.personalize.presenter.PersonalizeViewModel$getSuperWallpaperData$2$1", m22756f = "PersonalizeViewModel.kt", m22757i = {}, m22758l = {}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
        static final class C2578k extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super was>, Object> {
            final /* synthetic */ SuperWallpaperSummaryData[] $data;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2578k(SuperWallpaperSummaryData[] superWallpaperSummaryDataArr, InterfaceC6216q<? super C2578k> interfaceC6216q) {
                super(2, interfaceC6216q);
                this.$data = superWallpaperSummaryDataArr;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
            @InterfaceC7396q
            public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
                return new C2578k(this.$data, interfaceC6216q);
            }

            @Override // cyoe.InterfaceC5979h
            @InterfaceC7395n
            public final Object invoke(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
                return ((C2578k) create(interfaceC6556f, interfaceC6216q)).invokeSuspend(was.f36763k);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
            @InterfaceC7395n
            public final Object invokeSuspend(@InterfaceC7396q Object obj) {
                C6199q.x2();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6318m.n7h(obj);
                C2640k.m9216n().qrj(this.$data);
                return was.f36763k;
            }
        }

        zy(InterfaceC6216q<? super zy> interfaceC6216q) {
            super(2, interfaceC6216q);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            return PersonalizeViewModel.this.new zy(interfaceC6216q);
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7395n InterfaceC6216q<? super SuperWallpaperSummaryData[]> interfaceC6216q) {
            return ((zy) create(interfaceC6556f, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) throws Throwable {
            Object objX2 = C6199q.x2();
            int i2 = this.label;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SuperWallpaperSummaryData[] superWallpaperSummaryDataArr = (SuperWallpaperSummaryData[]) this.L$0;
                C6318m.n7h(obj);
                return superWallpaperSummaryDataArr;
            }
            C6318m.n7h(obj);
            SuperWallpaperSummaryData[] superWallpaperSummaryDataArrM9217p = C2640k.m9217p(PersonalizeViewModel.this.m9085b());
            z4 z4VarM23813n = C6481a.m23813n();
            C2578k c2578k = new C2578k(superWallpaperSummaryDataArrM9217p, null);
            this.L$0 = superWallpaperSummaryDataArrM9217p;
            this.label = 1;
            return C6708p.m24523y(z4VarM23813n, c2578k, this) == objX2 ? objX2 : superWallpaperSummaryDataArrM9217p;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r7v4, types: [com.android.thememanager.settings.personalize.presenter.PersonalizeViewModel$mWallpaperChangeListener$1] */
    public PersonalizeViewModel(@InterfaceC7396q Application app) {
        super(app);
        d2ok.m23075h(app, "app");
        this.f15296y = app;
        this.f15291t = C2567p.x2();
        this.f15281f = new fti<>();
        this.f15287o = new fti<>();
        this.f15277b = app.getResources().getConfiguration().densityDpi;
        this.f60826bo = new fti<>();
        this.f15293v = new fti<>();
        this.f15279d = new fti<>();
        this.f15294w = new fti<>();
        this.f60825ab = new fti<>();
        this.bb = new fti<>();
        this.bp = new fti<>();
        this.bv = new fti<>();
        this.an = WallpaperManager.getInstance(app);
        Calendar calendar = Calendar.getInstance();
        d2ok.kja0(calendar, "getInstance(...)");
        this.in = calendar;
        this.ba = app.getPackageManager();
        kotlinx.coroutines.x2.m24649g(uv6.m4473k(this), null, null, new C2570k(null), 3, null);
        this.ax = new fti<>(new C1723y(Boolean.FALSE));
        this.bq = new IMiuiWallpaperManagerCallback.Stub() { // from class: com.android.thememanager.settings.personalize.presenter.PersonalizeViewModel$mWallpaperChangeListener$1
            @Override // com.miui.miwallpaper.IMiuiWallpaperManagerCallback
            public void onPartColorComputeComplete(@InterfaceC7395n Map<Object, Object> map, @InterfaceC7395n Map<Object, Object> map2) {
            }

            @Override // com.miui.miwallpaper.IMiuiWallpaperManagerCallback
            public void onWallpaperChanged(@InterfaceC7395n WallpaperColors wallpaperColors, @InterfaceC7395n String str, int i2) {
                boolean zWvg = C1807g.zurt() ? C1807g.wvg() : true;
                Log.d("PersonalizeVM", "receive wallpaper changed from miWallpaper: type " + str + " which " + i2 + " largeScreen " + zWvg);
                if ((i2 == 2 && zWvg) || (i2 == 8 && !zWvg)) {
                    this.this$0.tfm(1);
                    this.this$0.tfm(3);
                } else {
                    if (!(i2 == 1 && zWvg) && (i2 != 4 || zWvg)) {
                        return;
                    }
                    this.this$0.tfm(2);
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"QueryPermissionsNeeded"})
    public final List<ResolveInfo> etdu() {
        List<ResolveInfo> listQueryIntentServices = this.ba.queryIntentServices(new Intent("miui.service.wallpaper.SuperWallpaperService"), 128);
        d2ok.kja0(listQueryIntentServices, "queryIntentServices(...)");
        return listQueryIntentServices;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fnq8(Bundle bundle, String str, String str2, int i2, int i3, int i4) {
        Log.d("PersonalizeVM", "personalizeVM init data which: " + i4);
        if (i4 == 1) {
            m4(new uj2j.zy(str, null, i2, 2, null));
            return;
        }
        if (i4 == 2) {
            i9jn(new uj2j.zy(str, str2, i3));
        } else {
            if (i4 == 3) {
                sok();
                return;
            }
            m4(new uj2j.zy(str, null, i2, 2, null));
            sok();
            i9jn(new uj2j.zy(str, str2, i3));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void i9jn(uj2j.zy r12) {
        /*
            r11 = this;
            int r0 = r12.f7l8()
            r11.f15288p = r0
            java.lang.String r0 = r12.m28088y()
            r11.f15290s = r0
            int r0 = r12.f7l8()
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L43
            com.android.thememanager.settings.superwallpaper.activity.data.k r0 = com.android.thememanager.settings.superwallpaper.activity.data.C2640k.m9216n()
            java.lang.String r3 = r12.m28088y()
            com.android.thememanager.settings.superwallpaper.activity.data.SuperWallpaperSummaryData r0 = r0.m9221s(r3)
            r11.f15286m = r0
            r3 = 0
            if (r0 == 0) goto L28
            com.android.thememanager.settings.superwallpaper.activity.data.SuperWallpaperSummaryData$SuperWallpaperLandData r4 = r0.f15594f
            goto L29
        L28:
            r4 = r3
        L29:
            if (r4 != 0) goto L2d
            r4 = r2
            goto L2e
        L2d:
            r4 = r1
        L2e:
            if (r0 == 0) goto L32
            if (r4 == 0) goto L43
        L32:
            kotlinx.coroutines.f r5 = androidx.lifecycle.uv6.m4473k(r11)
            r6 = 0
            r7 = 0
            com.android.thememanager.settings.personalize.presenter.PersonalizeViewModel$s r8 = new com.android.thememanager.settings.personalize.presenter.PersonalizeViewModel$s
            r8.<init>(r4, r11, r12, r3)
            r9 = 3
            r10 = 0
            kotlinx.coroutines.C6708p.m24521n(r5, r6, r7, r8, r9, r10)
            goto L44
        L43:
            r1 = r2
        L44:
            if (r1 == 0) goto L49
            r11.was(r12)
        L49:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.settings.personalize.presenter.PersonalizeViewModel.i9jn(uj2j.zy):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void m4(uj2j.zy r12) {
        /*
            r11 = this;
            int r0 = r12.f7l8()
            r11.f15288p = r0
            java.lang.String r0 = r12.m28088y()
            r11.f15290s = r0
            int r0 = r11.f15288p
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L3f
            com.android.thememanager.settings.superwallpaper.activity.data.k r0 = com.android.thememanager.settings.superwallpaper.activity.data.C2640k.m9216n()
            java.lang.String r3 = r11.f15290s
            com.android.thememanager.settings.superwallpaper.activity.data.SuperWallpaperSummaryData r0 = r0.m9221s(r3)
            r11.f15286m = r0
            r3 = 0
            if (r0 == 0) goto L24
            com.android.thememanager.settings.superwallpaper.activity.data.SuperWallpaperSummaryData$SuperWallpaperLandData r4 = r0.f15594f
            goto L25
        L24:
            r4 = r3
        L25:
            if (r4 != 0) goto L29
            r4 = r2
            goto L2a
        L29:
            r4 = r1
        L2a:
            if (r0 == 0) goto L2e
            if (r4 == 0) goto L3f
        L2e:
            kotlinx.coroutines.f r5 = androidx.lifecycle.uv6.m4473k(r11)
            r6 = 0
            r7 = 0
            com.android.thememanager.settings.personalize.presenter.PersonalizeViewModel$x2 r8 = new com.android.thememanager.settings.personalize.presenter.PersonalizeViewModel$x2
            r8.<init>(r4, r11, r12, r3)
            r9 = 3
            r10 = 0
            kotlinx.coroutines.C6708p.m24521n(r5, r6, r7, r8, r9, r10)
            goto L40
        L3f:
            r1 = r2
        L40:
            if (r1 == 0) goto L45
            r11.v0af()
        L45:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.settings.personalize.presenter.PersonalizeViewModel.m4(uj2j.zy):void");
    }

    private final void ngy() {
        if (o1t.m7171i()) {
            C2951n.fn3e().bf2(this.bq);
        }
    }

    private final void sok() {
        kotlinx.coroutines.x2.m24649g(uv6.m4473k(this), null, null, new n7h(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v0af() {
        kotlinx.coroutines.x2.m24649g(uv6.m4473k(this), null, null, new qrj(null), 3, null);
    }

    public static final float vq() {
        return ac.zy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w831(SuperWallpaperSummaryData[] superWallpaperSummaryDataArr, uj2j.zy zyVar, boolean z2) {
        if (superWallpaperSummaryDataArr == null) {
            return;
        }
        SuperWallpaperSummaryData superWallpaperSummaryDataM9221s = C2640k.m9216n().m9221s(this.f15290s);
        this.f15286m = superWallpaperSummaryDataM9221s;
        if (superWallpaperSummaryDataM9221s != null) {
            if (z2) {
                v0af();
            } else {
                was(zyVar);
            }
        }
    }

    private final void was(uj2j.zy zyVar) {
        kotlinx.coroutines.x2.m24649g(uv6.m4473k(this), null, null, new C2568g(zyVar, null), 3, null);
    }

    public static final float xwq3() {
        return ac.m9091k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap z4(Bitmap bitmap, boolean z2) {
        int iM23305t;
        float fM23305t;
        int iG1;
        Bitmap bitmapZy;
        if (!C1807g.lvui()) {
            return bitmap;
        }
        float f2 = 0.5f;
        if (C1807g.lvui() && C1819o.m7164r(bf2.toq.toq())) {
            Activity activityM10533k = C2964y.toq().m10533k();
            if (activityM10533k != null && C1819o.dd(activityM10533k)) {
                f2 = 1.0f;
            }
            iM23305t = fn3e.m23305t(y9n.zurt().x, y9n.zurt().y);
        } else {
            if (!C1807g.a9() && C1807g.lvui()) {
                fM23305t = fn3e.m23305t(y9n.zurt().x, y9n.zurt().y);
                f2 = 0.8f;
                iG1 = C6321q.g1(fn3e.m23305t(bitmap.getHeight(), bitmap.getWidth()) / (fM23305t * f2));
                Log.i("PersonalizeVM", "optimizingBitmapMemory: scale = " + iG1);
                if (iG1 <= 1 && (bitmapZy = C2763c.zy(bitmap, 60, z2, Integer.valueOf(iG1))) != null) {
                    bitmap.recycle();
                    return bitmapZy;
                }
            }
            iM23305t = fn3e.m23305t(y9n.zurt().x, y9n.zurt().y);
        }
        fM23305t = iM23305t;
        iG1 = C6321q.g1(fn3e.m23305t(bitmap.getHeight(), bitmap.getWidth()) / (fM23305t * f2));
        Log.i("PersonalizeVM", "optimizingBitmapMemory: scale = " + iG1);
        return iG1 <= 1 ? bitmap : bitmap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zsr0(SuperWallpaperSummaryData superWallpaperSummaryData, int i2, int i3, String str, InterfaceC6216q<? super C7688k> interfaceC6216q) {
        return C6708p.m24523y(C6481a.zy(), new C2577y(superWallpaperSummaryData, i2, i3, str, this, null), interfaceC6216q);
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: a */
    public final Bitmap m9084a() {
        Bitmap bitmap = this.f15278c;
        if (bitmap != null) {
            d2ok.qrj(bitmap);
            if (!bitmap.isRecycled()) {
                return this.f15278c;
            }
        }
        return null;
    }

    @InterfaceC7395n
    public final Bitmap a98o() {
        Bitmap bitmapM9076p;
        Bitmap bitmap = this.f15284j;
        if (bitmap != null) {
            d2ok.qrj(bitmap);
            if (!bitmap.isRecycled()) {
                return this.f15284j;
            }
        }
        if (!C1807g.m7081r() || (bitmapM9076p = C2567p.n7h().m9076p(C2567p.n7h().qrj())) == null || bitmapM9076p.isRecycled()) {
            return null;
        }
        return bitmapM9076p;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: b */
    public final Application m9085b() {
        return this.f15296y;
    }

    public final void b3e(@InterfaceC7395n Bitmap bitmap) {
        this.f15278c = bitmap;
    }

    public final void bek6(@InterfaceC7396q fti<ClockInfo> ftiVar) {
        d2ok.m23075h(ftiVar, "<set-?>");
        this.f15279d = ftiVar;
    }

    @InterfaceC7395n
    public final SuperWallpaperSummaryData bf2() {
        return this.f15289r;
    }

    @InterfaceC7396q
    public final fti<C1723y<uj2j.toq>> bo() {
        return this.f15281f;
    }

    public final void bwp(@InterfaceC7396q PersonalizeActivity activity) {
        d2ok.m23075h(activity, "activity");
        if (this.az || com.android.thememanager.basemodule.utils.qrj.zy(qrj.toq.PERSONALIZE)) {
            return;
        }
        if (this.as == null) {
            this.as = new C2569h();
            this.bg = new IntentFilter("android.intent.action.TIME_TICK");
        }
        activity.registerReceiver(this.as, this.bg);
        this.az = true;
    }

    public final void bz2(boolean z2) {
        this.f15297z = z2;
    }

    @InterfaceC7396q
    public final fti<SignatureInfo> c8jq() {
        return this.f15294w;
    }

    @InterfaceC7396q
    public final LiveData<C1723y<Boolean>> cfr() {
        return this.ax;
    }

    public final void cv06(@InterfaceC7396q fti<C7688k> ftiVar) {
        d2ok.m23075h(ftiVar, "<set-?>");
        this.f15287o = ftiVar;
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: d */
    public final String m9086d() {
        return this.f15290s;
    }

    public final boolean d8wk() {
        return this.f15291t;
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final void m28259do(@InterfaceC7396q fti<C7689q> ftiVar) {
        d2ok.m23075h(ftiVar, "<set-?>");
        this.f60826bo = ftiVar;
    }

    @InterfaceC7396q
    public final fti<C7689q> dr() {
        return this.f60826bo;
    }

    public final void ebn(int i2) {
        this.f15288p = i2;
    }

    public final boolean g1() {
        return this.f15285l;
    }

    @InterfaceC7395n
    public final Object gbni(@InterfaceC7396q InterfaceC6216q<? super Bitmap> interfaceC6216q) {
        return C6708p.m24523y(C6481a.zy(), new f7l8(null), interfaceC6216q);
    }

    public final void gc3c(@InterfaceC7395n Bitmap bitmap) {
        this.f15276a = bitmap;
    }

    @InterfaceC7396q
    public final fti<TemplateConfig> gyi() {
        return this.f15293v;
    }

    public final void h7am(@InterfaceC7396q fti<DoodleInfo> ftiVar) {
        d2ok.m23075h(ftiVar, "<set-?>");
        this.f60825ab = ftiVar;
    }

    @InterfaceC7395n
    public final Bitmap i1() {
        Bitmap bitmap = this.f15280e;
        if (bitmap != null) {
            d2ok.qrj(bitmap);
            if (!bitmap.isRecycled()) {
                return this.f15280e;
            }
        }
        return null;
    }

    @InterfaceC7395n
    public final Object ikck(@InterfaceC7396q InterfaceC6216q<? super SuperWallpaperSummaryData[]> interfaceC6216q) {
        return C6708p.m24523y(C6481a.zy(), new zy(null), interfaceC6216q);
    }

    public final void ixz(@InterfaceC7396q fti<TemplateConfig> ftiVar) {
        d2ok.m23075h(ftiVar, "<set-?>");
        this.f15293v = ftiVar;
    }

    public final void jbh(@InterfaceC7396q fti<Boolean> ftiVar) {
        d2ok.m23075h(ftiVar, "<set-?>");
        this.bp = ftiVar;
    }

    public final void jz5(@InterfaceC7395n Bitmap bitmap) {
        this.f15280e = bitmap;
    }

    @InterfaceC7395n
    public final Object kcsr(@InterfaceC7395n SuperWallpaperSummaryData superWallpaperSummaryData, int i2, @InterfaceC7396q InterfaceC6216q<? super uj2j.toq> interfaceC6216q) {
        return C2584n.f15305k.zy(superWallpaperSummaryData, i2, interfaceC6216q);
    }

    public final void ktq(@InterfaceC7395n Bitmap bitmap) {
        this.f15284j = bitmap;
    }

    public final void lh(@InterfaceC7396q PersonalizeActivity activity) {
        d2ok.m23075h(activity, "activity");
        BroadcastReceiver broadcastReceiver = this.as;
        if (broadcastReceiver == null || !this.az) {
            return;
        }
        try {
            activity.unregisterReceiver(broadcastReceiver);
            this.as = null;
        } catch (Exception unused) {
            Log.w("PersonalizeVM", "unregister Receiver");
        }
        this.az = false;
    }

    @InterfaceC7395n
    public final Object ltg8(@InterfaceC7396q InterfaceC6216q<? super Pair<Integer, Bitmap>> interfaceC6216q) {
        return C6708p.m24523y(C6481a.zy(), new C2574p(null), interfaceC6216q);
    }

    public final int lv5() {
        return this.f15277b;
    }

    public final void mbx(@InterfaceC7396q fti<Boolean> ftiVar) {
        d2ok.m23075h(ftiVar, "<set-?>");
        this.bv = ftiVar;
    }

    @InterfaceC7395n
    public final Bitmap mu() {
        Bitmap bitmapM9076p;
        Bitmap bitmap = this.f15283i;
        if (bitmap != null) {
            d2ok.qrj(bitmap);
            if (!bitmap.isRecycled()) {
                return this.f15283i;
            }
        }
        if (!C1807g.m7081r() || (bitmapM9076p = C2567p.n7h().m9076p(C2567p.n7h().kja0())) == null || bitmapM9076p.isRecycled()) {
            return null;
        }
        return bitmapM9076p;
    }

    public final void n2t(@InterfaceC7395n Bitmap bitmap) {
        this.f15282h = bitmap;
    }

    @Override // androidx.lifecycle.lrht
    protected void ncyb() {
        super.ncyb();
        if (this.f15292u) {
            Log.d("PersonalizeVM", "unRegisterWallpaperChangeListener: ");
            ngy();
        }
    }

    @InterfaceC7396q
    public final fti<DoodleInfo> nmn5() {
        return this.f60825ab;
    }

    public final void nsb(boolean z2) {
        this.f15285l = z2;
    }

    public final void pc(@InterfaceC7395n String str) {
        this.f15290s = str;
    }

    @InterfaceC7395n
    public final Object pjz9(@InterfaceC7396q InterfaceC6216q<? super Boolean> interfaceC6216q) {
        return C6708p.m24523y(C6481a.zy(), new cdj(null), interfaceC6216q);
    }

    @InterfaceC7395n
    public final Bitmap qkj8() {
        Bitmap bitmapM9076p;
        Bitmap bitmap = this.f15282h;
        if (bitmap != null) {
            d2ok.qrj(bitmap);
            if (!bitmap.isRecycled()) {
                return this.f15282h;
            }
        }
        if (!C1807g.m7081r() || (bitmapM9076p = C2567p.n7h().m9076p(C2567p.n7h().m9075h())) == null || bitmapM9076p.isRecycled()) {
            return null;
        }
        return bitmapM9076p;
    }

    @InterfaceC7395n
    public final Object qo(@InterfaceC7396q InterfaceC6216q<? super Integer> interfaceC6216q) {
        return C6708p.m24523y(C6481a.zy(), new C2575q(null), interfaceC6216q);
    }

    public final void r8s8() {
        kotlinx.coroutines.x2.m24649g(uv6.m4473k(this), null, null, new ld6(null), 3, null);
    }

    public final void se() {
        if (!o1t.m7171i() || this.f15292u) {
            return;
        }
        C2951n.fn3e().hyr(this.bq, C5306p.f72418zurt);
        this.f15292u = true;
        Log.d("PersonalizeVM", "registerWallpaperChangeListener: ");
    }

    @InterfaceC7396q
    public final fti<Boolean> t8iq() {
        return this.bv;
    }

    public final void tfm(int i2) {
        kotlinx.coroutines.x2.m24649g(uv6.m4473k(this), null, null, new C2572n(i2, null), 3, null);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: u */
    public final fti<Boolean> m9087u() {
        return this.bp;
    }

    public final void uc(@InterfaceC7396q fti<Integer> ftiVar) {
        d2ok.m23075h(ftiVar, "<set-?>");
        this.bb = ftiVar;
    }

    public final void uj2j(@InterfaceC7395n SuperWallpaperSummaryData superWallpaperSummaryData) {
        this.f15289r = superWallpaperSummaryData;
    }

    public final void ukdy(boolean z2) {
        this.f15291t = z2;
    }

    /* JADX INFO: renamed from: v */
    public final int m9088v() {
        return this.f15288p;
    }

    public final void vep5(int i2) {
        this.f15277b = i2;
    }

    public final boolean wo() {
        return this.f15297z;
    }

    public final void wx16(@InterfaceC7396q fti<SignatureInfo> ftiVar) {
        d2ok.m23075h(ftiVar, "<set-?>");
        this.f15294w = ftiVar;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: x */
    public final fti<C7688k> m9089x() {
        return this.f15287o;
    }

    @InterfaceC7396q
    public final fti<Integer> y2() {
        return this.bb;
    }

    @InterfaceC7395n
    public final Bitmap y9n() {
        Bitmap bitmap = this.f15295x;
        if (bitmap != null) {
            d2ok.qrj(bitmap);
            if (!bitmap.isRecycled()) {
                return this.f15295x;
            }
        }
        return null;
    }

    public final void yl(@InterfaceC7396q fti<C1723y<uj2j.toq>> ftiVar) {
        d2ok.m23075h(ftiVar, "<set-?>");
        this.f15281f = ftiVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @mub.InterfaceC7395n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object yqrt(@mub.InterfaceC7396q kotlin.coroutines.InterfaceC6216q<? super android.util.Pair<java.lang.Boolean, java.lang.Integer>> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.android.thememanager.settings.personalize.presenter.PersonalizeViewModel.kja0
            if (r0 == 0) goto L13
            r0 = r8
            com.android.thememanager.settings.personalize.presenter.PersonalizeViewModel$kja0 r0 = (com.android.thememanager.settings.personalize.presenter.PersonalizeViewModel.kja0) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.android.thememanager.settings.personalize.presenter.PersonalizeViewModel$kja0 r0 = new com.android.thememanager.settings.personalize.presenter.PersonalizeViewModel$kja0
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.toq.x2()
            int r2 = r0.label
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L41
            if (r2 == r5) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r0 = r0.L$0
            com.android.thememanager.settings.personalize.presenter.PersonalizeViewModel r0 = (com.android.thememanager.settings.personalize.presenter.PersonalizeViewModel) r0
            kotlin.C6318m.n7h(r8)
            goto L7d
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L39:
            java.lang.Object r0 = r0.L$0
            com.android.thememanager.settings.personalize.presenter.PersonalizeViewModel r0 = (com.android.thememanager.settings.personalize.presenter.PersonalizeViewModel) r0
            kotlin.C6318m.n7h(r8)
            goto L5c
        L41:
            kotlin.C6318m.n7h(r8)
            int r8 = r7.f15288p
            if (r8 != 0) goto L63
            com.android.thememanager.settings.personalize.task.q r8 = com.android.thememanager.settings.personalize.task.C2585q.f15306k
            android.content.Context r2 = bf2.toq.toq()
            java.lang.String r3 = r7.f15290s
            r0.L$0 = r7
            r0.label = r5
            java.lang.Object r8 = r8.m9102k(r2, r4, r3, r0)
            if (r8 != r1) goto L5b
            return r1
        L5b:
            r0 = r7
        L5c:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            goto L86
        L63:
            if (r8 != r5) goto L84
            com.android.thememanager.settings.superwallpaper.activity.data.SuperWallpaperSummaryData r8 = r7.f15286m
            if (r8 == 0) goto L84
            com.android.thememanager.settings.personalize.task.q r8 = com.android.thememanager.settings.personalize.task.C2585q.f15306k
            android.content.Context r2 = bf2.toq.toq()
            java.lang.String r6 = r7.f15290s
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r8 = r8.m9102k(r2, r5, r6, r0)
            if (r8 != r1) goto L7c
            return r1
        L7c:
            r0 = r7
        L7d:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            goto L86
        L84:
            r0 = r7
            r8 = r4
        L86:
            android.content.Context r1 = bf2.toq.toq()
            android.content.ContentResolver r1 = r1.getContentResolver()
            java.lang.String r2 = "selected_keyguard_clock_position"
            int r1 = android.provider.Settings.System.getInt(r1, r2, r4)
            r0.f15297z = r8
            android.util.Pair r0 = new android.util.Pair
            java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.toq.m22766k(r8)
            java.lang.Integer r1 = kotlin.coroutines.jvm.internal.toq.m22765g(r1)
            r0.<init>(r8, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.settings.personalize.presenter.PersonalizeViewModel.yqrt(kotlin.coroutines.q):java.lang.Object");
    }

    @InterfaceC7395n
    public final Bitmap yz() {
        Bitmap bitmap = this.f15276a;
        if (bitmap != null) {
            d2ok.qrj(bitmap);
            if (!bitmap.isRecycled()) {
                return this.f15276a;
            }
        }
        return null;
    }

    public final void zkd(@InterfaceC7395n Bitmap bitmap) {
        this.f15295x = bitmap;
    }

    @InterfaceC7396q
    public final fti<ClockInfo> zp() {
        return this.f15279d;
    }

    public final void zwy(@InterfaceC7395n Bitmap bitmap) {
        this.f15283i = bitmap;
    }
}
