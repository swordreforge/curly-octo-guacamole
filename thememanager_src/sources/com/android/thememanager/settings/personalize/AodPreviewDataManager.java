package com.android.thememanager.settings.personalize;

import android.app.WallpaperManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.util.Pair;
import androidx.lifecycle.InterfaceC0928g;
import androidx.lifecycle.InterfaceC0954z;
import androidx.lifecycle.o1t;
import com.android.thememanager.settings.personalize.activity.PersonalizeActivity;
import com.android.thememanager.settings.personalize.holder.C2562k;
import com.android.thememanager.settings.personalize.presenter.PersonalizeViewModel;
import com.android.thememanager.settings.personalize.task.C2583k;
import com.android.thememanager.settings.personalize.view.AodCardView;
import com.android.thememanager.settings.superwallpaper.C2656k;
import com.android.thememanager.settings.superwallpaper.activity.data.C2640k;
import com.android.thememanager.settings.superwallpaper.activity.data.SuperWallpaperSummaryData;
import com.android.thememanager.settings.superwallpaper.utils.C2663k;
import cyoe.InterfaceC5979h;
import kotlin.C6318m;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.intrinsics.C6199q;
import kotlin.coroutines.jvm.internal.InterfaceC6205g;
import kotlin.coroutines.jvm.internal.kja0;
import kotlin.jvm.internal.d2ok;
import kotlin.was;
import kotlinx.coroutines.InterfaceC6556f;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: AodPreviewDataManager.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class AodPreviewDataManager implements InterfaceC0928g {

    /* JADX INFO: renamed from: f */
    private final int f15166f;

    /* JADX INFO: renamed from: g */
    private int f15167g;

    /* JADX INFO: renamed from: h */
    private float f15168h;

    /* JADX INFO: renamed from: i */
    @InterfaceC7395n
    private SuperWallpaperSummaryData f15169i;

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private PersonalizeActivity f15170k;

    /* JADX INFO: renamed from: l */
    private boolean f15171l;

    /* JADX INFO: renamed from: n */
    @InterfaceC7395n
    private String f15172n;

    /* JADX INFO: renamed from: p */
    private float f15173p;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private final PersonalizeViewModel f15174q;

    /* JADX INFO: renamed from: r */
    @InterfaceC7395n
    private Icon f15175r;

    /* JADX INFO: renamed from: s */
    private float f15176s;

    /* JADX INFO: renamed from: t */
    @InterfaceC7395n
    private AodCardView f15177t;

    /* JADX INFO: renamed from: y */
    private float f15178y;

    /* JADX INFO: renamed from: z */
    @InterfaceC7395n
    private C2562k f15179z;

    /* JADX INFO: renamed from: com.android.thememanager.settings.personalize.AodPreviewDataManager$k */
    /* JADX INFO: compiled from: AodPreviewDataManager.kt */
    @InterfaceC6205g(m22755c = "com.android.thememanager.settings.personalize.AodPreviewDataManager$loadPreviewWallpaper$1", m22756f = "AodPreviewDataManager.kt", m22757i = {}, m22758l = {103}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
    static final class C2533k extends kja0 implements InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super was>, Object> {
        int label;

        C2533k(InterfaceC6216q<? super C2533k> interfaceC6216q) {
            super(2, interfaceC6216q);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            return AodPreviewDataManager.this.new C2533k(interfaceC6216q);
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
            return ((C2533k) create(interfaceC6556f, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            Object objX2 = C6199q.x2();
            int i2 = this.label;
            if (i2 == 0) {
                C6318m.n7h(obj);
                C2583k c2583k = C2583k.f15304k;
                int i3 = AodPreviewDataManager.this.f15167g;
                float f2 = AodPreviewDataManager.this.f15178y;
                float f3 = AodPreviewDataManager.this.f15176s;
                float f4 = AodPreviewDataManager.this.f15173p;
                float f5 = AodPreviewDataManager.this.f15168h;
                int i4 = AodPreviewDataManager.this.f15166f;
                this.label = 1;
                obj = c2583k.m9100k(i3, f2, f3, f4, f5, i4, this);
                if (obj == objX2) {
                    return objX2;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6318m.n7h(obj);
            }
            Pair pair = (Pair) obj;
            if (pair != null) {
                AodPreviewDataManager.this.f15174q.gc3c((Bitmap) pair.first);
                AodPreviewDataManager.this.f15174q.zkd((Bitmap) pair.second);
            } else {
                AodPreviewDataManager.this.f15174q.gc3c(null);
                AodPreviewDataManager.this.f15174q.zkd(null);
            }
            AodPreviewDataManager.this.n7h();
            return was.f36763k;
        }
    }

    /* JADX INFO: compiled from: AodPreviewDataManager.kt */
    @InterfaceC6205g(m22755c = "com.android.thememanager.settings.personalize.AodPreviewDataManager$loadSuperWallpaper$1", m22756f = "AodPreviewDataManager.kt", m22757i = {}, m22758l = {82}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
    static final class toq extends kja0 implements InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super was>, Object> {
        int label;

        toq(InterfaceC6216q<? super toq> interfaceC6216q) {
            super(2, interfaceC6216q);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            return AodPreviewDataManager.this.new toq(interfaceC6216q);
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
            return ((toq) create(interfaceC6556f, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            Object objX2 = C6199q.x2();
            int i2 = this.label;
            if (i2 == 0) {
                C6318m.n7h(obj);
                PersonalizeViewModel personalizeViewModel = AodPreviewDataManager.this.f15174q;
                this.label = 1;
                if (personalizeViewModel.ikck(this) == objX2) {
                    return objX2;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6318m.n7h(obj);
            }
            AodPreviewDataManager.this.o1t();
            return was.f36763k;
        }
    }

    public AodPreviewDataManager(@InterfaceC7396q PersonalizeActivity mContext, @InterfaceC7396q PersonalizeViewModel mVM) {
        d2ok.m23075h(mContext, "mContext");
        d2ok.m23075h(mVM, "mVM");
        this.f15170k = mContext;
        this.f15174q = mVM;
        this.f15166f = mContext.getResources().getConfiguration().densityDpi;
    }

    private final void fu4() {
        kotlinx.coroutines.x2.m24649g(o1t.m4467k(this.f15170k), null, null, new C2533k(null), 3, null);
    }

    /* JADX INFO: renamed from: h */
    private final void m9040h(SuperWallpaperSummaryData superWallpaperSummaryData) {
        if ((superWallpaperSummaryData != null ? superWallpaperSummaryData.f15594f : null) != null) {
            WallpaperManager wallpaperManagerM8007k = com.android.thememanager.kja0.m8007k();
            this.f15175r = (wallpaperManagerM8007k.getWallpaperInfo() == null || !C2656k.m9246y(wallpaperManagerM8007k.getWallpaperInfo().getServiceInfo())) ? superWallpaperSummaryData.f15594f.f15611g : superWallpaperSummaryData.f15594f.f15619y;
            this.f15171l = d2ok.f7l8(C2656k.f60915gvn7, superWallpaperSummaryData.f15591b);
        }
        qrj();
    }

    private final void kja0() {
        if (!this.f15171l) {
            fu4();
            return;
        }
        this.f15174q.gc3c(null);
        this.f15174q.zkd(null);
        n7h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n7h() {
        C2562k c2562k = this.f15179z;
        if (c2562k != null) {
            d2ok.qrj(c2562k);
            if (c2562k.getPreviewType() == 0) {
                C2562k c2562k2 = this.f15179z;
                d2ok.qrj(c2562k2);
                c2562k2.mo9066k(this.f15174q.yz());
            } else {
                C2562k c2562k3 = this.f15179z;
                d2ok.qrj(c2562k3);
                c2562k3.mo9066k(this.f15174q.y9n());
            }
        }
        AodCardView aodCardView = this.f15177t;
        if (aodCardView != null) {
            d2ok.qrj(aodCardView);
            if (aodCardView.getPreviewType() == 0) {
                AodCardView aodCardView2 = this.f15177t;
                d2ok.qrj(aodCardView2);
                aodCardView2.mo9066k(this.f15174q.yz());
            } else {
                AodCardView aodCardView3 = this.f15177t;
                d2ok.qrj(aodCardView3);
                aodCardView3.mo9066k(this.f15174q.y9n());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o1t() {
        SuperWallpaperSummaryData superWallpaperSummaryDataM9221s = C2640k.m9216n().m9221s(this.f15172n);
        this.f15169i = superWallpaperSummaryDataM9221s;
        m9040h(superWallpaperSummaryDataM9221s);
        kja0();
    }

    private final void qrj() {
        C2562k c2562k = this.f15179z;
        if (c2562k != null) {
            c2562k.n7h(this.f15175r);
        }
        AodCardView aodCardView = this.f15177t;
        if (aodCardView != null) {
            aodCardView.n7h(this.f15175r);
        }
    }

    /* JADX INFO: renamed from: z */
    private final void m9047z() {
        SuperWallpaperSummaryData superWallpaperSummaryDataM9221s = C2640k.m9216n().m9221s(this.f15172n);
        this.f15169i = superWallpaperSummaryDataM9221s;
        if (superWallpaperSummaryDataM9221s == null) {
            kotlinx.coroutines.x2.m24649g(o1t.m4467k(this.f15170k), null, null, new toq(null), 3, null);
        } else {
            m9040h(superWallpaperSummaryDataM9221s);
            kja0();
        }
    }

    @InterfaceC7395n
    public final Icon cdj() {
        return this.f15175r;
    }

    @InterfaceC7395n
    public final Bitmap fn3e() {
        return this.f15174q.y9n();
    }

    @InterfaceC7395n
    public final Bitmap ki() {
        return this.f15174q.yz();
    }

    public final void ld6(@InterfaceC7395n AodCardView aodCardView) {
        if (aodCardView != null) {
            this.f15177t = aodCardView;
        }
    }

    public final void ni7(@InterfaceC7395n Bundle bundle) {
        this.f15167g = C2663k.m9269q(this.f15170k);
        if (bundle == null) {
            this.f15169i = null;
            this.f15172n = null;
            this.f15178y = 0.0f;
            this.f15176s = 0.0f;
            this.f15173p = 0.0f;
            this.f15168h = 0.0f;
        } else {
            this.f15172n = bundle.getString("id");
            this.f15178y = bundle.getFloat("clock_position_x");
            this.f15176s = bundle.getFloat("clock_position_y");
            this.f15173p = bundle.getFloat("dual_clock_position_x_anchor_right");
            this.f15168h = bundle.getFloat("dual_clock_position_y");
        }
        wvg();
    }

    @Override // androidx.lifecycle.InterfaceC0928g, androidx.lifecycle.ld6
    public void onDestroy(@InterfaceC7396q InterfaceC0954z owner) {
        d2ok.m23075h(owner, "owner");
        C2562k c2562k = this.f15179z;
        if (c2562k != null) {
            c2562k.release();
        }
        AodCardView aodCardView = this.f15177t;
        if (aodCardView != null) {
            aodCardView.release();
        }
    }

    public final void wvg() {
        if (this.f15167g == 1) {
            m9047z();
            return;
        }
        this.f15175r = null;
        fu4();
        qrj();
    }

    public final void x2(@InterfaceC7395n C2562k c2562k) {
        if (c2562k != null) {
            this.f15179z = c2562k;
        }
    }
}
