package com.android.thememanager.view;

import android.content.Context;
import android.content.DialogInterface;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.base.AbstractActivityC1717k;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.model.WallpaperApplyInfos;
import com.android.thememanager.util.uc;
import cyoe.InterfaceC5979h;
import java.util.ArrayList;
import java.util.List;
import kotlin.C6318m;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.intrinsics.C6199q;
import kotlin.coroutines.jvm.internal.AbstractC6209q;
import kotlin.coroutines.jvm.internal.InterfaceC6205g;
import kotlin.jvm.internal.lv5;
import kotlin.was;
import kotlinx.coroutines.InterfaceC6556f;
import miuix.appcompat.app.ki;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import zy.nn86;

/* JADX INFO: compiled from: WallpaperChooseDialog.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ncyb implements com.android.thememanager.basemodule.analysis.toq {

    /* JADX INFO: renamed from: i */
    @InterfaceC7396q
    public static final toq f17639i = new toq(null);

    /* JADX INFO: renamed from: t */
    public static final int f17640t = 2;

    /* JADX INFO: renamed from: z */
    public static final int f17641z = 1;

    /* JADX INFO: renamed from: g */
    @InterfaceC7395n
    private String f17642g;

    /* JADX INFO: renamed from: h */
    @InterfaceC7396q
    private final DialogInterface.OnClickListener f17643h;

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final AbstractActivityC1717k f17644k;

    /* JADX INFO: renamed from: n */
    @InterfaceC7395n
    private String f17645n;

    /* JADX INFO: renamed from: p */
    private C2934q f17646p;

    /* JADX INFO: renamed from: q */
    private boolean f17647q;

    /* JADX INFO: renamed from: s */
    @InterfaceC7395n
    private miuix.appcompat.app.ki f17648s;

    /* JADX INFO: renamed from: y */
    @InterfaceC7395n
    private zy f17649y;

    /* JADX INFO: renamed from: com.android.thememanager.view.ncyb$g */
    /* JADX INFO: compiled from: WallpaperChooseDialog.kt */
    @InterfaceC6205g(m22755c = "com.android.thememanager.view.WallpaperChooseDialog$updateWallpaperGalleryEnableAsync$support$1", m22756f = "WallpaperChooseDialog.kt", m22757i = {}, m22758l = {}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
    static final class C2931g extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super Boolean>, Object> {
        int label;

        C2931g(InterfaceC6216q<? super C2931g> interfaceC6216q) {
            super(2, interfaceC6216q);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            return new C2931g(interfaceC6216q);
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7395n InterfaceC6216q<? super Boolean> interfaceC6216q) {
            return ((C2931g) create(interfaceC6556f, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            C6199q.x2();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C6318m.n7h(obj);
            return kotlin.coroutines.jvm.internal.toq.m22766k(com.android.thememanager.share.ld6.n7h(bf2.toq.toq(), uc.f16819f) && !com.theme.loopwallpaper.controller.toq.kja0());
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.view.ncyb$k */
    /* JADX INFO: compiled from: WallpaperChooseDialog.kt */
    @InterfaceC6205g(m22755c = "com.android.thememanager.view.WallpaperChooseDialog$1", m22756f = "WallpaperChooseDialog.kt", m22757i = {}, m22758l = {99}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
    static final class C2932k extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super was>, Object> {
        int label;

        C2932k(InterfaceC6216q<? super C2932k> interfaceC6216q) {
            super(2, interfaceC6216q);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            return ncyb.this.new C2932k(interfaceC6216q);
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
            return ((C2932k) create(interfaceC6556f, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            Object objX2 = C6199q.x2();
            int i2 = this.label;
            if (i2 == 0) {
                C6318m.n7h(obj);
                ncyb ncybVar = ncyb.this;
                this.label = 1;
                if (ncybVar.t8r(this) == objX2) {
                    return objX2;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6318m.n7h(obj);
            }
            return was.f36763k;
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.view.ncyb$n */
    /* JADX INFO: compiled from: WallpaperChooseDialog.kt */
    @InterfaceC6205g(m22755c = "com.android.thememanager.view.WallpaperChooseDialog", m22756f = "WallpaperChooseDialog.kt", m22757i = {0}, m22758l = {217}, m22759m = "updateWallpaperGalleryEnableAsync", m22760n = {"this"}, m22761s = {"L$0"})
    static final class C2933n extends AbstractC6209q {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C2933n(InterfaceC6216q<? super C2933n> interfaceC6216q) {
            super(interfaceC6216q);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ncyb.this.t8r(this);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.view.ncyb$q */
    /* JADX INFO: compiled from: WallpaperChooseDialog.kt */
    @lv5({"SMAP\nWallpaperChooseDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WallpaperChooseDialog.kt\ncom/android/thememanager/view/WallpaperChooseDialog$WallpaperDialogParams\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,337:1\n1#2:338\n*E\n"})
    private static final class C2934q {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        public static final int f61527f7l8 = 4;

        /* JADX INFO: renamed from: g */
        public static final int f17650g = 3;

        /* JADX INFO: renamed from: n */
        public static final int f17651n = 2;

        /* JADX INFO: renamed from: q */
        public static final int f17652q = 1;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @InterfaceC7396q
        public static final k f61528zy = new k(null);

        /* JADX INFO: renamed from: k */
        @InterfaceC7396q
        private final List<Integer> f17653k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @InterfaceC7396q
        private final List<Integer> f61529toq;

        /* JADX INFO: renamed from: com.android.thememanager.view.ncyb$q$k */
        /* JADX INFO: compiled from: WallpaperChooseDialog.kt */
        public static final class k {
            private k() {
            }

            public /* synthetic */ k(kotlin.jvm.internal.ni7 ni7Var) {
                this();
            }

            @InterfaceC7396q
            /* JADX INFO: renamed from: k */
            public final C2934q m10414k(@InterfaceC7395n @nn86 int[] iArr, @InterfaceC7395n int[] iArr2) {
                return new C2934q(iArr, iArr2, null);
            }
        }

        private C2934q(@nn86 int[] iArr, int[] iArr2) {
            if (!((iArr == null || iArr2 == null || iArr.length != iArr2.length) ? false : true)) {
                throw new IllegalArgumentException("param error".toString());
            }
            this.f17653k = new ArrayList(iArr.length);
            for (int i2 : iArr) {
                this.f17653k.add(Integer.valueOf(i2));
            }
            this.f61529toq = new ArrayList(iArr2.length);
            for (int i3 : iArr2) {
                this.f61529toq.add(Integer.valueOf(i3));
            }
        }

        public /* synthetic */ C2934q(int[] iArr, int[] iArr2, kotlin.jvm.internal.ni7 ni7Var) {
            this(iArr, iArr2);
        }

        /* JADX INFO: renamed from: k */
        public final int m10412k(int i2) {
            if (i2 >= 0 && i2 < this.f61529toq.size()) {
                return this.f61529toq.get(i2).intValue();
            }
            throw new IllegalArgumentException(("error position : " + i2).toString());
        }

        /* JADX INFO: renamed from: q */
        public final boolean m10413q(@nn86 int i2, int i3) {
            int iIndexOf = this.f61529toq.indexOf(Integer.valueOf(i3));
            if (iIndexOf >= 0) {
                this.f17653k.set(iIndexOf, Integer.valueOf(i2));
                return true;
            }
            this.f17653k.add(Integer.valueOf(i2));
            this.f61529toq.add(Integer.valueOf(i3));
            return true;
        }

        @InterfaceC7396q
        public final String[] toq(@InterfaceC7396q Context context) {
            kotlin.jvm.internal.d2ok.m23075h(context, "context");
            String[] strArr = new String[this.f17653k.size()];
            int size = this.f17653k.size();
            for (int i2 = 0; i2 < size; i2++) {
                strArr[i2] = context.getResources().getString(this.f17653k.get(i2).intValue());
            }
            return strArr;
        }

        public final boolean zy(int i2) {
            int iIndexOf = this.f61529toq.indexOf(Integer.valueOf(i2));
            if (iIndexOf < 0 || iIndexOf >= this.f61529toq.size()) {
                return false;
            }
            this.f61529toq.remove(iIndexOf);
            this.f17653k.remove(iIndexOf);
            return true;
        }
    }

    /* JADX INFO: compiled from: WallpaperChooseDialog.kt */
    public static final class toq {
        private toq() {
        }

        public /* synthetic */ toq(kotlin.jvm.internal.ni7 ni7Var) {
            this();
        }

        @l05.qrj
        public static /* synthetic */ void toq() {
        }

        /* JADX INFO: renamed from: k */
        public final int m10415k() {
            boolean zKi = com.theme.loopwallpaper.controller.toq.ki(0);
            int i2 = com.theme.loopwallpaper.controller.toq.ki(1) ? 19 : 3;
            return zKi ? i2 | 8 : i2;
        }
    }

    /* JADX INFO: compiled from: WallpaperChooseDialog.kt */
    public interface zy {
        /* JADX INFO: renamed from: k */
        void mo6447k(int i2, @InterfaceC7395n WallpaperApplyInfos wallpaperApplyInfos);
    }

    public ncyb(@InterfaceC7396q AbstractActivityC1717k context) {
        kotlin.jvm.internal.d2ok.m23075h(context, "context");
        this.f17644k = context;
        this.f17643h = new DialogInterface.OnClickListener() { // from class: com.android.thememanager.view.x9kr
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                ncyb.m10409s(this.f17724k, dialogInterface, i2);
            }
        };
        f7l8();
        m10407p();
        kotlinx.coroutines.x2.m24649g(androidx.lifecycle.o1t.m4467k(context), null, null, new C2932k(null), 3, null);
    }

    private final void cdj() {
        boolean zKi = com.theme.loopwallpaper.controller.toq.ki(0);
        boolean zKi2 = com.theme.loopwallpaper.controller.toq.ki(1);
        kja0((zKi || com.android.thememanager.util.d2ok.m9689p().qrj(bf2.toq.toq())) ? R.string.wallpaper_loop_add_to_loop_lock_wallpaper : R.string.wallpaper_set_as_lockscreen, 1, true);
        kja0(zKi2 ? R.string.wallpaper_loop_add_to_loop_desk_wallpaper : R.string.wallpaper_set_as_desktop, 2, true);
    }

    private final void f7l8() {
        this.f17646p = C2934q.f61528zy.m10414k(new int[]{R.string.wallpaper_set_as_lockscreen, R.string.wallpaper_set_as_desktop, R.string.wallpaper_apply_full}, new int[]{1, 2, 3});
        n7h(this.f17642g, this.f17645n);
        cdj();
    }

    /* JADX INFO: renamed from: g */
    private final WallpaperApplyInfos m10404g(boolean z2, boolean z3) {
        if (com.android.thememanager.util.d2ok.m9689p().qrj(bf2.toq.toq())) {
            WallpaperApplyInfos wallpaperApplyInfos = new WallpaperApplyInfos();
            wallpaperApplyInfos.syncFashionGalleryStatus(true);
            return wallpaperApplyInfos;
        }
        if (!C1807g.zurt()) {
            return null;
        }
        WallpaperApplyInfos.ApplyCode applyCode = WallpaperApplyInfos.ApplyCode.BOTH_SCREEN;
        WallpaperApplyInfos.ApplyCode applyCode2 = z2 ? WallpaperApplyInfos.ApplyCode.BOTH_LOCK_HOME : z3 ? WallpaperApplyInfos.ApplyCode.LOCK : WallpaperApplyInfos.ApplyCode.HOME;
        WallpaperApplyInfos wallpaperApplyInfos2 = new WallpaperApplyInfos();
        wallpaperApplyInfos2.updateFoldApplyStatus(true, applyCode, applyCode2);
        return wallpaperApplyInfos2;
    }

    /* JADX INFO: renamed from: h */
    static /* synthetic */ void m10405h(ncyb ncybVar, int i2, int i3, boolean z2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        ncybVar.kja0(i2, i3, z2);
    }

    private final void kja0(@nn86 int i2, int i3, boolean z2) {
        boolean zZy;
        C2934q c2934q = null;
        if (z2) {
            C2934q c2934q2 = this.f17646p;
            if (c2934q2 == null) {
                kotlin.jvm.internal.d2ok.n5r1("mDialogParams");
            } else {
                c2934q = c2934q2;
            }
            zZy = c2934q.m10413q(i2, i3);
        } else {
            C2934q c2934q3 = this.f17646p;
            if (c2934q3 == null) {
                kotlin.jvm.internal.d2ok.n5r1("mDialogParams");
            } else {
                c2934q = c2934q3;
            }
            zZy = c2934q.zy(i3);
        }
        if (zZy) {
            m10407p();
        }
    }

    /* JADX INFO: renamed from: p */
    private final void m10407p() {
        miuix.appcompat.app.ki kiVar = this.f17648s;
        if (kiVar != null) {
            kiVar.n7h();
        }
        ki.C6947k c6947kLrht = new ki.C6947k(this.f17644k, 2131951635).lrht(R.string.wallpaper_settings);
        C2934q c2934q = this.f17646p;
        if (c2934q == null) {
            kotlin.jvm.internal.d2ok.n5r1("mDialogParams");
            c2934q = null;
        }
        this.f17648s = c6947kLrht.ni7(c2934q.toq(this.f17644k), this.f17643h).mcp(R.string.miuix_compat_dialog_cancel, null).m25037g();
    }

    /* JADX INFO: renamed from: q */
    public static final int m10408q() {
        return f17639i.m10415k();
    }

    private final void qrj(boolean z2, boolean z3) {
        if (z2) {
            C1708s.f7l8().ld6().ni7(C1706p.zy(com.android.thememanager.basemodule.analysis.toq.ghw9));
        }
        if (z3) {
            C1708s.f7l8().ld6().ni7(C1706p.zy(com.android.thememanager.basemodule.analysis.toq.em));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final void m10409s(ncyb this$0, DialogInterface dialogInterface, int i2) {
        zy zyVar;
        kotlin.jvm.internal.d2ok.m23075h(this$0, "this$0");
        C2934q c2934q = this$0.f17646p;
        if (c2934q == null) {
            kotlin.jvm.internal.d2ok.n5r1("mDialogParams");
            c2934q = null;
        }
        int iM10412k = c2934q.m10412k(i2);
        if (iM10412k == 1) {
            boolean zKi = com.theme.loopwallpaper.controller.toq.ki(0);
            this$0.qrj(zKi, false);
            zy zyVar2 = this$0.f17649y;
            if (zyVar2 != null) {
                int i3 = zKi ? 9 : 1;
                kotlin.jvm.internal.d2ok.qrj(zyVar2);
                zyVar2.mo6447k(i3, this$0.m10404g(false, true));
                return;
            }
            return;
        }
        if (iM10412k == 2) {
            boolean zKi2 = com.theme.loopwallpaper.controller.toq.ki(1);
            this$0.qrj(false, zKi2);
            zy zyVar3 = this$0.f17649y;
            if (zyVar3 != null) {
                int i4 = zKi2 ? 18 : 2;
                kotlin.jvm.internal.d2ok.qrj(zyVar3);
                zyVar3.mo6447k(i4, this$0.m10404g(false, false));
                return;
            }
            return;
        }
        if (iM10412k != 3) {
            if (iM10412k == 4 && (zyVar = this$0.f17649y) != null) {
                kotlin.jvm.internal.d2ok.qrj(zyVar);
                zyVar.mo6447k(32, null);
                return;
            }
            return;
        }
        boolean zKi3 = com.theme.loopwallpaper.controller.toq.ki(0);
        boolean zKi4 = com.theme.loopwallpaper.controller.toq.ki(1);
        this$0.qrj(zKi3, zKi4);
        zy zyVar4 = this$0.f17649y;
        if (zyVar4 != null) {
            int i5 = zKi4 ? 19 : 3;
            if (zKi3) {
                i5 |= 8;
            }
            kotlin.jvm.internal.d2ok.qrj(zyVar4);
            zyVar4.mo6447k(i5, this$0.m10404g(true, false));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t8r(kotlin.coroutines.InterfaceC6216q<? super kotlin.was> r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.android.thememanager.view.ncyb.C2933n
            if (r0 == 0) goto L13
            r0 = r6
            com.android.thememanager.view.ncyb$n r0 = (com.android.thememanager.view.ncyb.C2933n) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.android.thememanager.view.ncyb$n r0 = new com.android.thememanager.view.ncyb$n
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.toq.x2()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.L$0
            com.android.thememanager.view.ncyb r0 = (com.android.thememanager.view.ncyb) r0
            kotlin.C6318m.n7h(r6)
            goto L4e
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L35:
            kotlin.C6318m.n7h(r6)
            kotlinx.coroutines.dd r6 = ek5k.f7l8.m22238k()
            com.android.thememanager.view.ncyb$g r2 = new com.android.thememanager.view.ncyb$g
            r4 = 0
            r2.<init>(r4)
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r6 = kotlinx.coroutines.C6708p.m24523y(r6, r2, r0)
            if (r6 != r1) goto L4d
            return r1
        L4d:
            r0 = r5
        L4e:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r0.ki(r6)
            kotlin.was r6 = kotlin.was.f36763k
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.view.ncyb.t8r(kotlin.coroutines.q):java.lang.Object");
    }

    public final void ki(boolean z2) {
        this.f17647q = z2;
        n7h(this.f17642g, this.f17645n);
    }

    public final void ld6(@InterfaceC7395n zy zyVar) {
        this.f17649y = zyVar;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: n */
    public final AbstractActivityC1717k m10410n() {
        return this.f17644k;
    }

    public final void n7h(@InterfaceC7395n String str, @InterfaceC7395n String str2) {
        this.f17645n = str2;
        this.f17642g = str;
        if (this.f17646p == null) {
            kotlin.jvm.internal.d2ok.n5r1("mDialogParams");
        }
        if (!this.f17647q || p029m.zy.toq(str2) || p029m.zy.toq(str)) {
            kja0(0, 4, false);
        } else {
            kja0(R.string.wallpaper_group_set_loop, 4, true);
        }
    }

    public final void x2() {
        cdj();
        miuix.appcompat.app.ki kiVar = this.f17648s;
        if (kiVar != null) {
            kiVar.show();
        }
    }

    /* JADX INFO: renamed from: y */
    public final boolean m10411y() {
        miuix.appcompat.app.ki kiVar = this.f17648s;
        return kiVar != null && kiVar.isShowing();
    }

    public final void zy() {
        miuix.appcompat.app.ki kiVar;
        miuix.appcompat.app.ki kiVar2 = this.f17648s;
        if (!(kiVar2 != null && kiVar2.isShowing()) || (kiVar = this.f17648s) == null) {
            return;
        }
        kiVar.dismiss();
    }
}
