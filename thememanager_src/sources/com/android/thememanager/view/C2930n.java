package com.android.thememanager.view;

import android.app.Dialog;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import androidx.fragment.app.ActivityC0891q;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.android.thememanager.basemodule.utils.C1812k;
import com.android.thememanager.recommend.view.C2451n;
import com.android.thememanager.router.recommend.entity.UICard;
import com.android.thememanager.router.recommend.entity.UIPage;
import com.android.thememanager.util.C2763c;
import com.android.thememanager.util.C2823z;
import com.android.thememanager.util.gc3c;
import com.android.thememanager.util.v0af;
import com.android.thememanager.view.C2930n;
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
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: com.android.thememanager.view.n */
/* JADX INFO: compiled from: BulletHandler.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C2930n {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final WeakReference<ActivityC0891q> f17633k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7395n
    private SharedPreferences f61522toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7395n
    private SharedPreferences.Editor f61523zy;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: com.android.thememanager.view.n$k */
    /* JADX INFO: compiled from: BulletHandler.kt */
    final class k extends Dialog {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ C2930n f17634k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(@InterfaceC7395n final C2930n c2930n, @InterfaceC7396q final ActivityC0891q activityC0891q, @InterfaceC7395n final UICard card, final String str) {
            super(activityC0891q, R.style.BulletLayout);
            kotlin.jvm.internal.d2ok.m23075h(card, "card");
            this.f17634k = c2930n;
            kotlin.jvm.internal.d2ok.qrj(activityC0891q);
            View viewInflate = LayoutInflater.from(activityC0891q).inflate(R.layout.bullet_layout, (ViewGroup) null);
            setContentView(viewInflate);
            Window window = getWindow();
            if (window != null) {
                window.setLayout(-1, -1);
            }
            Window window2 = getWindow();
            kotlin.jvm.internal.d2ok.qrj(window2);
            window2.setWindowAnimations(R.style.BulletDialogAnimation);
            ImageView imageView = (ImageView) viewInflate.findViewById(R.id.content);
            com.android.thememanager.basemodule.imageloader.x2.zy(activityC0891q, card.imageUrl, imageView);
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.view.toq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C2930n.k.m10403q(this.f17702k, activityC0891q, card, str, view);
                }
            });
            C1812k.toq(imageView, card.title);
            viewInflate.findViewById(R.id.cancel).setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.view.zy
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C2930n.k.m10402n(c2930n, card, str, activityC0891q, this, view);
                }
            });
            viewInflate.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.view.q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C2930n.k.m10400g(c2930n, card, str, activityC0891q, this, view);
                }
            });
        }

        private final void f7l8(ActivityC0891q activityC0891q, UICard uICard, String str) {
            C2451n.toq toqVarM8809s = C2451n.m8797g().toq(uICard.link.productType).m8809s(uICard.cardType);
            C2823z c2823z = C2823z.f16914k;
            kotlin.jvm.internal.d2ok.qrj(toqVarM8809s);
            c2823z.m10094k(activityC0891q, uICard, toqVarM8809s);
            this.f17634k.kja0(uICard, com.android.thememanager.basemodule.analysis.toq.hm78, str);
            if (gc3c.cdj(activityC0891q)) {
                dismiss();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: g */
        public static final void m10400g(C2930n this$0, UICard card, String str, ActivityC0891q activityC0891q, k this$1, View view) {
            kotlin.jvm.internal.d2ok.m23075h(this$0, "this$0");
            kotlin.jvm.internal.d2ok.m23075h(card, "$card");
            kotlin.jvm.internal.d2ok.m23075h(this$1, "this$1");
            this$0.kja0(card, com.android.thememanager.basemodule.analysis.toq.rc, str);
            if (gc3c.cdj(activityC0891q)) {
                this$1.dismiss();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: n */
        public static final void m10402n(C2930n this$0, UICard card, String str, ActivityC0891q activityC0891q, k this$1, View view) {
            kotlin.jvm.internal.d2ok.m23075h(this$0, "this$0");
            kotlin.jvm.internal.d2ok.m23075h(card, "$card");
            kotlin.jvm.internal.d2ok.m23075h(this$1, "this$1");
            this$0.kja0(card, com.android.thememanager.basemodule.analysis.toq.vv3, str);
            if (gc3c.cdj(activityC0891q)) {
                this$1.dismiss();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: q */
        public static final void m10403q(k this$0, ActivityC0891q activityC0891q, UICard card, String str, View view) {
            kotlin.jvm.internal.d2ok.m23075h(this$0, "this$0");
            kotlin.jvm.internal.d2ok.m23075h(card, "$card");
            this$0.f7l8(activityC0891q, card, str);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.view.n$q */
    /* JADX INFO: compiled from: BulletHandler.kt */
    @InterfaceC6205g(m22755c = "com.android.thememanager.view.BulletHandler$statsForBulletExpose$1", m22756f = "BulletHandler.kt", m22757i = {}, m22758l = {114}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
    static final class q extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super was>, Object> {
        final /* synthetic */ UICard $card;
        final /* synthetic */ String $pageId;
        int label;

        /* JADX INFO: renamed from: com.android.thememanager.view.n$q$k */
        /* JADX INFO: compiled from: BulletHandler.kt */
        @InterfaceC6205g(m22755c = "com.android.thememanager.view.BulletHandler$statsForBulletExpose$1$picType$1", m22756f = "BulletHandler.kt", m22757i = {}, m22758l = {}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
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
        q(String str, UICard uICard, InterfaceC6216q<? super q> interfaceC6216q) {
            super(2, interfaceC6216q);
            this.$pageId = str;
            this.$card = uICard;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            return new q(this.$pageId, this.$card, interfaceC6216q);
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
            return ((q) create(interfaceC6556f, interfaceC6216q)).invokeSuspend(was.f36763k);
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
            ArrayMap<String, Object> arrayMapX2 = C1706p.x2(this.$pageId, this.$card.trackId, null, null);
            kotlin.jvm.internal.d2ok.kja0(arrayMapX2, "getExposeParam(...)");
            kotlin.jvm.internal.d2ok.qrj(str);
            arrayMapX2.put(com.android.thememanager.basemodule.analysis.toq.u5, kotlin.text.fti.lk(str, "gif", false, 2, null) ? com.android.thememanager.basemodule.analysis.toq.li : com.android.thememanager.basemodule.analysis.toq.gd);
            arrayMapX2.put("cardIndx", kotlin.coroutines.jvm.internal.toq.m22765g(this.$card.cardTypeOrdinal));
            arrayMapX2.put(com.android.thememanager.basemodule.analysis.toq.i0, this.$card.cardUuid);
            arrayMapX2.put(com.android.thememanager.basemodule.analysis.toq.btl, this.$card.cardType);
            arrayMapX2.put(com.android.thememanager.basemodule.analysis.toq.ewa, kotlin.coroutines.jvm.internal.toq.m22766k(this.$card.isNonStanAd));
            C1708s.f7l8().ld6().cdj(arrayMapX2);
            return was.f36763k;
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.view.n$toq */
    /* JADX INFO: compiled from: BulletHandler.kt */
    @InterfaceC6205g(m22755c = "com.android.thememanager.view.BulletHandler$initBullet$1", m22756f = "BulletHandler.kt", m22757i = {}, m22758l = {}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
    static final class toq extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super was>, Object> {
        final /* synthetic */ UIPage $uiPage;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        toq(UIPage uIPage, InterfaceC6216q<? super toq> interfaceC6216q) {
            super(2, interfaceC6216q);
            this.$uiPage = uIPage;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            return C2930n.this.new toq(this.$uiPage, interfaceC6216q);
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
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
            C2930n c2930n = C2930n.this;
            List<UICard> cards = this.$uiPage.cards;
            kotlin.jvm.internal.d2ok.kja0(cards, "cards");
            UICard uICardX2 = c2930n.x2(cards);
            if (C2930n.this.ld6(uICardX2)) {
                v0af.C2813k c2813kM10046k = v0af.f16853k.m10046k();
                if (C2930n.this.n7h(c2813kM10046k)) {
                    SharedPreferences.Editor editor = C2930n.this.f61523zy;
                    kotlin.jvm.internal.d2ok.qrj(editor);
                    editor.clear();
                    SharedPreferences.Editor editor2 = C2930n.this.f61523zy;
                    kotlin.jvm.internal.d2ok.qrj(editor2);
                    editor2.apply();
                } else {
                    SharedPreferences sharedPreferences = C2930n.this.f61522toq;
                    kotlin.jvm.internal.d2ok.qrj(sharedPreferences);
                    int i2 = sharedPreferences.getInt("current_display_count", 0);
                    kotlin.jvm.internal.d2ok.qrj(uICardX2);
                    if (i2 >= uICardX2.popDisplayTimes) {
                        Log.d("BulletHandler", "initBullet:today is already display " + uICardX2.popDisplayTimes);
                        return was.f36763k;
                    }
                }
                ActivityC0891q activityC0891q = (ActivityC0891q) C2930n.this.f17633k.get();
                if (gc3c.cdj(activityC0891q)) {
                    String str = this.$uiPage.uuid;
                    C2930n c2930n2 = C2930n.this;
                    kotlin.jvm.internal.d2ok.qrj(uICardX2);
                    new k(c2930n2, activityC0891q, uICardX2, str).show();
                    C2930n.this.m10398s(c2813kM10046k, uICardX2, str);
                }
            } else {
                Log.w("BulletHandler", "initBullet: check(card) fail");
            }
            return was.f36763k;
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.view.n$zy */
    /* JADX INFO: compiled from: BulletHandler.kt */
    @InterfaceC6205g(m22755c = "com.android.thememanager.view.BulletHandler$statsForBulletClick$1", m22756f = "BulletHandler.kt", m22757i = {}, m22758l = {132}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
    static final class zy extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super was>, Object> {
        final /* synthetic */ UICard $card;
        final /* synthetic */ String $clickType;
        final /* synthetic */ String $pageId;
        int label;

        /* JADX INFO: renamed from: com.android.thememanager.view.n$zy$k */
        /* JADX INFO: compiled from: BulletHandler.kt */
        @InterfaceC6205g(m22755c = "com.android.thememanager.view.BulletHandler$statsForBulletClick$1$picType$1", m22756f = "BulletHandler.kt", m22757i = {}, m22758l = {}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
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
        zy(String str, UICard uICard, String str2, InterfaceC6216q<? super zy> interfaceC6216q) {
            super(2, interfaceC6216q);
            this.$pageId = str;
            this.$card = uICard;
            this.$clickType = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            return new zy(this.$pageId, this.$card, this.$clickType, interfaceC6216q);
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
            return ((zy) create(interfaceC6556f, interfaceC6216q)).invokeSuspend(was.f36763k);
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
            ArrayMap<String, Object> arrayMapM6654q = C1706p.m6654q(this.$pageId, this.$card.trackId, null);
            kotlin.jvm.internal.d2ok.kja0(arrayMapM6654q, "getClickParam(...)");
            kotlin.jvm.internal.d2ok.qrj(str);
            arrayMapM6654q.put(com.android.thememanager.basemodule.analysis.toq.u5, kotlin.text.fti.lk(str, "gif", false, 2, null) ? com.android.thememanager.basemodule.analysis.toq.li : com.android.thememanager.basemodule.analysis.toq.gd);
            arrayMapM6654q.put("cardIndx", kotlin.coroutines.jvm.internal.toq.m22765g(this.$card.cardTypeOrdinal));
            arrayMapM6654q.put(com.android.thememanager.basemodule.analysis.toq.i0, this.$card.cardUuid);
            arrayMapM6654q.put("click_element_type", this.$clickType);
            arrayMapM6654q.put(com.android.thememanager.basemodule.analysis.toq.btl, this.$card.cardType);
            arrayMapM6654q.put(com.android.thememanager.basemodule.analysis.toq.ewa, kotlin.coroutines.jvm.internal.toq.m22766k(this.$card.isNonStanAd));
            C1708s.f7l8().ld6().ni7(arrayMapM6654q);
            return was.f36763k;
        }
    }

    public C2930n(@InterfaceC7396q ActivityC0891q activity) {
        kotlin.jvm.internal.d2ok.m23075h(activity, "activity");
        this.f17633k = new WeakReference<>(activity);
    }

    /* JADX INFO: renamed from: h */
    private final void m10393h(UICard uICard, String str) {
        ActivityC0891q activityC0891q;
        androidx.lifecycle.ki kiVarM4467k;
        if (TextUtils.isEmpty(uICard.imageUrl) || (activityC0891q = this.f17633k.get()) == null || (kiVarM4467k = androidx.lifecycle.o1t.m4467k(activityC0891q)) == null) {
            return;
        }
        kotlinx.coroutines.x2.m24649g(kiVarM4467k, null, null, new q(str, uICard, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void kja0(UICard uICard, String str, String str2) {
        ActivityC0891q activityC0891q;
        androidx.lifecycle.ki kiVarM4467k;
        if (TextUtils.isEmpty(uICard.imageUrl) || (activityC0891q = this.f17633k.get()) == null || (kiVarM4467k = androidx.lifecycle.o1t.m4467k(activityC0891q)) == null) {
            return;
        }
        kotlinx.coroutines.x2.m24649g(kiVarM4467k, null, null, new zy(str2, uICard, str, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean ld6(UICard uICard) {
        return (uICard == null || TextUtils.isEmpty(uICard.cardUuid) || TextUtils.isEmpty(uICard.imageUrl) || uICard.popDisplayTimes <= 0 || uICard.link == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean n7h(v0af.C2813k c2813k) {
        if (this.f61522toq == null) {
            m10396p();
        }
        SharedPreferences sharedPreferences = this.f61522toq;
        kotlin.jvm.internal.d2ok.qrj(sharedPreferences);
        int i2 = sharedPreferences.getInt("current_year", 0);
        SharedPreferences sharedPreferences2 = this.f61522toq;
        kotlin.jvm.internal.d2ok.qrj(sharedPreferences2);
        int i3 = sharedPreferences2.getInt("current_month", 0);
        SharedPreferences sharedPreferences3 = this.f61522toq;
        kotlin.jvm.internal.d2ok.qrj(sharedPreferences3);
        return c2813k.m10052s(i2, i3, sharedPreferences3.getInt("current_day", 0));
    }

    /* JADX INFO: renamed from: p */
    private final void m10396p() {
        SharedPreferences sharedPreferences = bf2.toq.toq().getSharedPreferences("bullet_pref", 0);
        this.f61522toq = sharedPreferences;
        kotlin.jvm.internal.d2ok.qrj(sharedPreferences);
        this.f61523zy = sharedPreferences.edit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public final void m10398s(v0af.C2813k c2813k, UICard uICard, String str) {
        if (this.f61522toq == null) {
            m10396p();
        }
        SharedPreferences.Editor editor = this.f61523zy;
        kotlin.jvm.internal.d2ok.qrj(editor);
        editor.putInt("current_year", c2813k.m10053y());
        SharedPreferences.Editor editor2 = this.f61523zy;
        kotlin.jvm.internal.d2ok.qrj(editor2);
        editor2.putInt("current_month", c2813k.f7l8());
        SharedPreferences.Editor editor3 = this.f61523zy;
        kotlin.jvm.internal.d2ok.qrj(editor3);
        editor3.putInt("current_day", c2813k.m10048g());
        SharedPreferences.Editor editor4 = this.f61523zy;
        kotlin.jvm.internal.d2ok.qrj(editor4);
        SharedPreferences sharedPreferences = this.f61522toq;
        kotlin.jvm.internal.d2ok.qrj(sharedPreferences);
        editor4.putInt("current_display_count", sharedPreferences.getInt("current_display_count", 0) + 1);
        SharedPreferences.Editor editor5 = this.f61523zy;
        kotlin.jvm.internal.d2ok.qrj(editor5);
        editor5.apply();
        m10393h(uICard, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UICard x2(List<? extends UICard> list) {
        for (UICard uICard : list) {
            if (kotlin.jvm.internal.d2ok.f7l8(InterfaceC1789q.b10b, uICard.cardType)) {
                return uICard;
            }
        }
        return null;
    }

    public final void qrj(@InterfaceC7395n UIPage uIPage) {
        androidx.lifecycle.ki kiVarM4467k;
        if ((uIPage != null ? uIPage.cards : null) == null || uIPage.cards.isEmpty()) {
            return;
        }
        if (this.f61522toq == null) {
            m10396p();
        }
        ActivityC0891q activityC0891q = this.f17633k.get();
        if (activityC0891q == null || (kiVarM4467k = androidx.lifecycle.o1t.m4467k(activityC0891q)) == null) {
            return;
        }
        kotlinx.coroutines.x2.m24649g(kiVarM4467k, null, null, new toq(uIPage, null), 3, null);
    }
}
