package com.android.thememanager.view;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.ActivityC0891q;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.android.thememanager.basemodule.utils.y9n;
import com.android.thememanager.recommend.view.C2451n;
import com.android.thememanager.router.recommend.entity.UICard;
import com.android.thememanager.router.recommend.entity.UIPage;
import com.android.thememanager.util.C2763c;
import com.android.thememanager.util.C2823z;
import com.android.thememanager.util.v0af;
import cyoe.InterfaceC5979h;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.C6318m;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.intrinsics.C6199q;
import kotlin.coroutines.jvm.internal.InterfaceC6205g;
import kotlin.was;
import kotlinx.coroutines.C6481a;
import kotlinx.coroutines.C6708p;
import kotlinx.coroutines.InterfaceC6556f;
import miuix.view.C7385p;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: FloatingWindowManager.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class x2 {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    @InterfaceC7395n
    private SharedPreferences f61548f7l8;

    /* JADX INFO: renamed from: g */
    @InterfaceC7395n
    private UICard f17719g;

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final com.android.thememanager.viewmodel.toq f17720k;

    /* JADX INFO: renamed from: n */
    @InterfaceC7395n
    private String f17721n;

    /* JADX INFO: renamed from: q */
    @InterfaceC7395n
    private String f17722q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private WeakReference<ActivityC0891q> f61549toq;

    /* JADX INFO: renamed from: y */
    @InterfaceC7395n
    private SharedPreferences.Editor f17723y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7395n
    private C2945y f61550zy;

    /* JADX INFO: renamed from: com.android.thememanager.view.x2$k */
    /* JADX INFO: compiled from: FloatingWindowManager.kt */
    @InterfaceC6205g(m22755c = "com.android.thememanager.view.FloatingWindowManager$statsForFloatingWindowClick$1", m22756f = "FloatingWindowManager.kt", m22757i = {}, m22758l = {214}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
    static final class C2943k extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super was>, Object> {
        final /* synthetic */ UICard $card;
        final /* synthetic */ String $exposePageId;
        int label;

        /* JADX INFO: renamed from: com.android.thememanager.view.x2$k$k */
        /* JADX INFO: compiled from: FloatingWindowManager.kt */
        @InterfaceC6205g(m22755c = "com.android.thememanager.view.FloatingWindowManager$statsForFloatingWindowClick$1$picType$1", m22756f = "FloatingWindowManager.kt", m22757i = {}, m22758l = {}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
        static final class k extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super String>, Object> {
            final /* synthetic */ UICard $card;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            k(UICard uICard, InterfaceC6216q<? super k> interfaceC6216q) {
                super(2, interfaceC6216q);
                this.$card = uICard;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
            @InterfaceC7396q
            public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
                return new k(this.$card, interfaceC6216q);
            }

            @Override // cyoe.InterfaceC5979h
            @InterfaceC7395n
            public final Object invoke(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7395n InterfaceC6216q<? super String> interfaceC6216q) {
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
                return C2763c.t8r(this.$card.imageUrl);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2943k(UICard uICard, String str, InterfaceC6216q<? super C2943k> interfaceC6216q) {
            super(2, interfaceC6216q);
            this.$card = uICard;
            this.$exposePageId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            return x2.this.new C2943k(this.$card, this.$exposePageId, interfaceC6216q);
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
            return ((C2943k) create(interfaceC6556f, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) throws Throwable {
            Object objX2 = C6199q.x2();
            int i2 = this.label;
            if (i2 == 0) {
                C6318m.n7h(obj);
                kotlinx.coroutines.dd ddVarZy = C6481a.zy();
                k kVar = new k(this.$card, null);
                this.label = 1;
                obj = C6708p.m24523y(ddVarZy, kVar, this);
                if (obj == objX2) {
                    return objX2;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6318m.n7h(obj);
            }
            String str = (String) obj;
            UIPage uIPageM4388g = x2.this.f7l8().hyr().m4388g();
            ArrayMap<String, Object> arrayMapM6654q = C1706p.m6654q(uIPageM4388g != null ? uIPageM4388g.uuid : null, this.$card.trackId, null);
            kotlin.jvm.internal.d2ok.kja0(arrayMapM6654q, "getClickParam(...)");
            kotlin.jvm.internal.d2ok.qrj(str);
            arrayMapM6654q.put(com.android.thememanager.basemodule.analysis.toq.u5, kotlin.text.fti.lk(str, "gif", false, 2, null) ? com.android.thememanager.basemodule.analysis.toq.li : com.android.thememanager.basemodule.analysis.toq.gd);
            arrayMapM6654q.put("cardIndx", kotlin.coroutines.jvm.internal.toq.m22765g(this.$card.cardTypeOrdinal));
            arrayMapM6654q.put(com.android.thememanager.basemodule.analysis.toq.i0, this.$card.cardUuid);
            arrayMapM6654q.put(com.android.thememanager.basemodule.analysis.toq.xtsf, this.$exposePageId);
            arrayMapM6654q.put(com.android.thememanager.basemodule.analysis.toq.btl, this.$card.cardType);
            arrayMapM6654q.put(com.android.thememanager.basemodule.analysis.toq.ewa, kotlin.coroutines.jvm.internal.toq.m22766k(this.$card.isNonStanAd));
            C1708s.f7l8().ld6().ni7(arrayMapM6654q);
            return was.f36763k;
        }
    }

    /* JADX INFO: compiled from: FloatingWindowManager.kt */
    @InterfaceC6205g(m22755c = "com.android.thememanager.view.FloatingWindowManager$statsForFloatingWindowExpose$1", m22756f = "FloatingWindowManager.kt", m22757i = {}, m22758l = {C7385p.f42281z}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
    static final class toq extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super was>, Object> {
        final /* synthetic */ UICard $card;
        final /* synthetic */ String $exposePageId;
        int label;

        /* JADX INFO: renamed from: com.android.thememanager.view.x2$toq$k */
        /* JADX INFO: compiled from: FloatingWindowManager.kt */
        @InterfaceC6205g(m22755c = "com.android.thememanager.view.FloatingWindowManager$statsForFloatingWindowExpose$1$picType$1", m22756f = "FloatingWindowManager.kt", m22757i = {}, m22758l = {}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
        static final class C2944k extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super String>, Object> {
            final /* synthetic */ UICard $card;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2944k(UICard uICard, InterfaceC6216q<? super C2944k> interfaceC6216q) {
                super(2, interfaceC6216q);
                this.$card = uICard;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
            @InterfaceC7396q
            public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
                return new C2944k(this.$card, interfaceC6216q);
            }

            @Override // cyoe.InterfaceC5979h
            @InterfaceC7395n
            public final Object invoke(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7395n InterfaceC6216q<? super String> interfaceC6216q) {
                return ((C2944k) create(interfaceC6556f, interfaceC6216q)).invokeSuspend(was.f36763k);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
            @InterfaceC7395n
            public final Object invokeSuspend(@InterfaceC7396q Object obj) {
                C6199q.x2();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6318m.n7h(obj);
                return C2763c.t8r(this.$card.imageUrl);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        toq(UICard uICard, String str, InterfaceC6216q<? super toq> interfaceC6216q) {
            super(2, interfaceC6216q);
            this.$card = uICard;
            this.$exposePageId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            return x2.this.new toq(this.$card, this.$exposePageId, interfaceC6216q);
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
            return ((toq) create(interfaceC6556f, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) throws Throwable {
            Object objX2 = C6199q.x2();
            int i2 = this.label;
            if (i2 == 0) {
                C6318m.n7h(obj);
                kotlinx.coroutines.dd ddVarZy = C6481a.zy();
                C2944k c2944k = new C2944k(this.$card, null);
                this.label = 1;
                obj = C6708p.m24523y(ddVarZy, c2944k, this);
                if (obj == objX2) {
                    return objX2;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6318m.n7h(obj);
            }
            String str = (String) obj;
            UIPage uIPageM4388g = x2.this.f7l8().hyr().m4388g();
            ArrayMap<String, Object> arrayMapX2 = C1706p.x2(uIPageM4388g != null ? uIPageM4388g.uuid : null, this.$card.trackId, null, null);
            kotlin.jvm.internal.d2ok.kja0(arrayMapX2, "getExposeParam(...)");
            kotlin.jvm.internal.d2ok.qrj(str);
            arrayMapX2.put(com.android.thememanager.basemodule.analysis.toq.u5, kotlin.text.fti.lk(str, "gif", false, 2, null) ? com.android.thememanager.basemodule.analysis.toq.li : com.android.thememanager.basemodule.analysis.toq.gd);
            arrayMapX2.put("cardIndx", kotlin.coroutines.jvm.internal.toq.m22765g(this.$card.cardTypeOrdinal));
            arrayMapX2.put(com.android.thememanager.basemodule.analysis.toq.i0, this.$card.cardUuid);
            arrayMapX2.put(com.android.thememanager.basemodule.analysis.toq.xtsf, this.$exposePageId);
            arrayMapX2.put(com.android.thememanager.basemodule.analysis.toq.btl, this.$card.cardType);
            arrayMapX2.put(com.android.thememanager.basemodule.analysis.toq.ewa, kotlin.coroutines.jvm.internal.toq.m22766k(this.$card.isNonStanAd));
            C1708s.f7l8().ld6().cdj(arrayMapX2);
            return was.f36763k;
        }
    }

    public x2(@InterfaceC7396q com.android.thememanager.viewmodel.toq vm) {
        kotlin.jvm.internal.d2ok.m23075h(vm, "vm");
        this.f17720k = vm;
    }

    private final void cdj(UICard uICard, String str) {
        androidx.lifecycle.ki kiVarM4467k;
        if (uICard == null || TextUtils.isEmpty(uICard.imageUrl) || TextUtils.isEmpty(str)) {
            return;
        }
        WeakReference<ActivityC0891q> weakReference = this.f61549toq;
        if (weakReference == null) {
            kotlin.jvm.internal.d2ok.n5r1("mActivityRef");
            weakReference = null;
        }
        ActivityC0891q activityC0891q = weakReference.get();
        if (activityC0891q == null || (kiVarM4467k = androidx.lifecycle.o1t.m4467k(activityC0891q)) == null) {
            return;
        }
        kotlinx.coroutines.x2.m24649g(kiVarM4467k, null, null, new C2943k(uICard, str, null), 3, null);
    }

    /* JADX INFO: renamed from: g */
    private final String m10441g(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        return str2 + '_' + str;
    }

    private final void ki(UICard uICard, String str) {
        androidx.lifecycle.ki kiVarM4467k;
        if (TextUtils.isEmpty(uICard.imageUrl)) {
            return;
        }
        WeakReference<ActivityC0891q> weakReference = this.f61549toq;
        if (weakReference == null) {
            kotlin.jvm.internal.d2ok.n5r1("mActivityRef");
            weakReference = null;
        }
        ActivityC0891q activityC0891q = weakReference.get();
        if (activityC0891q == null || (kiVarM4467k = androidx.lifecycle.o1t.m4467k(activityC0891q)) == null) {
            return;
        }
        kotlinx.coroutines.x2.m24649g(kiVarM4467k, null, null, new toq(uICard, str, null), 3, null);
    }

    private final boolean ld6() {
        return this.f61550zy != null;
    }

    /* JADX INFO: renamed from: n */
    private final UICard m10443n(String str) {
        if (!TextUtils.isEmpty(str) && kja0()) {
            UIPage uIPageM4388g = this.f17720k.hyr().m4388g();
            kotlin.jvm.internal.d2ok.qrj(uIPageM4388g);
            for (UICard uICard : uIPageM4388g.cards) {
                if (kotlin.jvm.internal.d2ok.f7l8(InterfaceC1789q.km71, uICard.cardType)) {
                    List<String> list = uICard.hoverDisplayPosition;
                    if (list != null && list.contains(str)) {
                        return uICard;
                    }
                }
            }
        }
        return null;
    }

    private final boolean n7h(String str) {
        return (kotlin.jvm.internal.d2ok.f7l8("resourcecategory", str) || kotlin.jvm.internal.d2ok.f7l8("daily", str)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final void m10444p(x2 this$0, View view) {
        kotlin.jvm.internal.d2ok.m23075h(this$0, "this$0");
        if (this$0.f17719g == null) {
            return;
        }
        WeakReference<ActivityC0891q> weakReference = this$0.f61549toq;
        WeakReference<ActivityC0891q> weakReference2 = null;
        if (weakReference == null) {
            kotlin.jvm.internal.d2ok.n5r1("mActivityRef");
            weakReference = null;
        }
        if (weakReference.get() != null) {
            C2451n.toq toqVarM8797g = C2451n.m8797g();
            UICard uICard = this$0.f17719g;
            C2451n.toq toqVarM8809s = toqVarM8797g.m8809s(uICard != null ? uICard.cardType : null);
            this$0.cdj(this$0.f17719g, this$0.f17721n);
            C2823z c2823z = C2823z.f16914k;
            WeakReference<ActivityC0891q> weakReference3 = this$0.f61549toq;
            if (weakReference3 == null) {
                kotlin.jvm.internal.d2ok.n5r1("mActivityRef");
            } else {
                weakReference2 = weakReference3;
            }
            ActivityC0891q activityC0891q = weakReference2.get();
            UICard uICard2 = this$0.f17719g;
            kotlin.jvm.internal.d2ok.qrj(toqVarM8809s);
            c2823z.m10094k(activityC0891q, uICard2, toqVarM8809s);
        }
    }

    /* JADX INFO: renamed from: q */
    private final boolean m10445q(UICard uICard) {
        if (uICard != null && !TextUtils.isEmpty(uICard.imageUrl) && uICard.link != null) {
            return true;
        }
        Log.w("FloatingWindowManager", "checkData: is fail");
        return false;
    }

    private final boolean qrj() {
        v0af.C2813k c2813kM10046k = v0af.f16853k.m10046k();
        SharedPreferences sharedPreferences = this.f61548f7l8;
        kotlin.jvm.internal.d2ok.qrj(sharedPreferences);
        int i2 = sharedPreferences.getInt("current_year", 0);
        SharedPreferences sharedPreferences2 = this.f61548f7l8;
        kotlin.jvm.internal.d2ok.qrj(sharedPreferences2);
        int i3 = sharedPreferences2.getInt("current_month", 0);
        SharedPreferences sharedPreferences3 = this.f61548f7l8;
        kotlin.jvm.internal.d2ok.qrj(sharedPreferences3);
        return c2813kM10046k.m10052s(i2, i3, sharedPreferences3.getInt("current_day", 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final void m10446s(C2945y this_apply, x2 this$0, View view) {
        kotlin.jvm.internal.d2ok.m23075h(this_apply, "$this_apply");
        kotlin.jvm.internal.d2ok.m23075h(this$0, "this$0");
        this_apply.m10450k();
        SharedPreferences.Editor editor = this$0.f17723y;
        kotlin.jvm.internal.d2ok.qrj(editor);
        editor.putBoolean("close_status", true);
        v0af.C2813k c2813kM10046k = v0af.f16853k.m10046k();
        SharedPreferences.Editor editor2 = this$0.f17723y;
        kotlin.jvm.internal.d2ok.qrj(editor2);
        editor2.putInt("current_year", c2813kM10046k.m10053y());
        SharedPreferences.Editor editor3 = this$0.f17723y;
        kotlin.jvm.internal.d2ok.qrj(editor3);
        editor3.putInt("current_month", c2813kM10046k.f7l8());
        SharedPreferences.Editor editor4 = this$0.f17723y;
        kotlin.jvm.internal.d2ok.qrj(editor4);
        editor4.putInt("current_day", c2813kM10046k.m10048g());
        SharedPreferences.Editor editor5 = this$0.f17723y;
        kotlin.jvm.internal.d2ok.qrj(editor5);
        editor5.apply();
    }

    private final boolean x2(String str) {
        return str != null && kotlin.jvm.internal.d2ok.f7l8(str, this.f17722q);
    }

    private final void zy() {
        if (this.f61548f7l8 == null) {
            SharedPreferences sharedPreferences = bf2.toq.toq().getSharedPreferences("floating_window_pref", 0);
            this.f61548f7l8 = sharedPreferences;
            this.f17723y = sharedPreferences != null ? sharedPreferences.edit() : null;
        }
    }

    @InterfaceC7396q
    public final com.android.thememanager.viewmodel.toq f7l8() {
        return this.f17720k;
    }

    /* JADX INFO: renamed from: h */
    public final void m10447h() {
        if (this.f61550zy != null) {
            this.f61550zy = null;
        }
    }

    public final boolean kja0() {
        if (this.f17720k.hyr().m4388g() != null) {
            UIPage uIPageM4388g = this.f17720k.hyr().m4388g();
            kotlin.jvm.internal.d2ok.qrj(uIPageM4388g);
            if (!y9n.mcp(uIPageM4388g.cards)) {
                return true;
            }
        }
        return false;
    }

    public final void t8r(@InterfaceC7396q String type, @InterfaceC7395n String str) {
        kotlin.jvm.internal.d2ok.m23075h(type, "type");
        if (ld6()) {
            zy();
            if (!n7h(type)) {
                C2945y c2945y = this.f61550zy;
                if (c2945y != null) {
                    c2945y.m10450k();
                }
                this.f17722q = type;
                return;
            }
            SharedPreferences sharedPreferences = this.f61548f7l8;
            kotlin.jvm.internal.d2ok.qrj(sharedPreferences);
            if (sharedPreferences.getBoolean("close_status", false)) {
                Log.w("FloatingWindowManager", "updateData: today is already close");
                C2945y c2945y2 = this.f61550zy;
                if (c2945y2 != null) {
                    c2945y2.m10450k();
                    return;
                }
                return;
            }
            if (!kja0()) {
                Log.w("FloatingWindowManager", "updateData: no data");
                C2945y c2945y3 = this.f61550zy;
                if (c2945y3 != null) {
                    c2945y3.m10450k();
                    return;
                }
                return;
            }
            String strM10441g = m10441g(type, str);
            if (x2(strM10441g)) {
                Log.w("FloatingWindowManager", "updateData: isRepeatUpdate: " + strM10441g + " lastUpdate: " + this.f17722q);
                return;
            }
            UICard uICardM10443n = m10443n(strM10441g);
            WeakReference<ActivityC0891q> weakReference = this.f61549toq;
            WeakReference<ActivityC0891q> weakReference2 = null;
            if (weakReference == null) {
                kotlin.jvm.internal.d2ok.n5r1("mActivityRef");
                weakReference = null;
            }
            if (weakReference.get() == null || !m10445q(uICardM10443n)) {
                C2945y c2945y4 = this.f61550zy;
                if (c2945y4 != null) {
                    c2945y4.m10450k();
                }
            } else {
                this.f17721n = strM10441g;
                this.f17719g = uICardM10443n;
                kotlin.jvm.internal.d2ok.qrj(uICardM10443n);
                String str2 = this.f17721n;
                kotlin.jvm.internal.d2ok.qrj(str2);
                ki(uICardM10443n, str2);
                Log.w("FloatingWindowManager", "updateData: " + this.f17721n);
                C2945y c2945y5 = this.f61550zy;
                if (c2945y5 != null) {
                    WeakReference<ActivityC0891q> weakReference3 = this.f61549toq;
                    if (weakReference3 == null) {
                        kotlin.jvm.internal.d2ok.n5r1("mActivityRef");
                    } else {
                        weakReference2 = weakReference3;
                    }
                    c2945y5.m10453y(weakReference2.get(), uICardM10443n);
                }
                C2945y c2945y6 = this.f61550zy;
                if (c2945y6 != null) {
                    c2945y6.f7l8();
                }
            }
            this.f17722q = strM10441g;
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m10448y(@InterfaceC7395n ActivityC0891q activityC0891q) {
        if (ld6() || activityC0891q == null) {
            return;
        }
        zy();
        if (qrj()) {
            SharedPreferences.Editor editor = this.f17723y;
            kotlin.jvm.internal.d2ok.qrj(editor);
            editor.clear();
            SharedPreferences.Editor editor2 = this.f17723y;
            kotlin.jvm.internal.d2ok.qrj(editor2);
            editor2.apply();
            Log.w("FloatingWindowManager", "initFloatBallView: already second day clear sp data");
        } else {
            SharedPreferences sharedPreferences = this.f61548f7l8;
            kotlin.jvm.internal.d2ok.qrj(sharedPreferences);
            if (sharedPreferences.getBoolean("close_status", false)) {
                Log.w("FloatingWindowManager", "initFloatBallView: today is already close, second day can display");
                return;
            }
        }
        this.f61549toq = new WeakReference<>(activityC0891q);
        final C2945y qVar = new C2945y().toq(activityC0891q, activityC0891q.getResources().getDimensionPixelSize(R.dimen.floating_window_margin_bottom), activityC0891q.getResources().getDimensionPixelSize(R.dimen.floating_window_margin_end));
        this.f61550zy = qVar;
        if (qVar != null) {
            qVar.m10451n(new View.OnClickListener() { // from class: com.android.thememanager.view.p
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    x2.m10446s(qVar, this, view);
                }
            });
            qVar.m10449g(new View.OnClickListener() { // from class: com.android.thememanager.view.ld6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    x2.m10444p(this.f17621k, view);
                }
            });
        }
    }
}
