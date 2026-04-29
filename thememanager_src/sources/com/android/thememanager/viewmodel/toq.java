package com.android.thememanager.viewmodel;

import android.app.Application;
import android.os.SystemClock;
import androidx.lifecycle.fti;
import androidx.lifecycle.uv6;
import com.android.thememanager.model.FloatingWindowRequestModel;
import com.android.thememanager.router.recommend.entity.UIPage;
import cyoe.InterfaceC5979h;
import kotlin.C6318m;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.intrinsics.C6199q;
import kotlin.coroutines.jvm.internal.InterfaceC6205g;
import kotlin.coroutines.jvm.internal.kja0;
import kotlin.jvm.internal.d2ok;
import kotlin.was;
import kotlinx.coroutines.InterfaceC6556f;
import kotlinx.coroutines.x2;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: ThemeResourceTabVM.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class toq extends androidx.lifecycle.toq {

    /* JADX INFO: renamed from: s */
    private long f17744s;

    /* JADX INFO: renamed from: y */
    @InterfaceC7396q
    private final fti<UIPage> f17745y;

    /* JADX INFO: renamed from: com.android.thememanager.viewmodel.toq$k */
    /* JADX INFO: compiled from: ThemeResourceTabVM.kt */
    @InterfaceC6205g(m22755c = "com.android.thememanager.viewmodel.ThemeResourceTabVM$requestFloatWindowData$1", m22756f = "ThemeResourceTabVM.kt", m22757i = {}, m22758l = {}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
    static final class C2948k extends kja0 implements InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super was>, Object> {
        int label;

        C2948k(InterfaceC6216q<? super C2948k> interfaceC6216q) {
            super(2, interfaceC6216q);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            return toq.this.new C2948k(interfaceC6216q);
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
            return ((C2948k) create(interfaceC6556f, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            C6199q.x2();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C6318m.n7h(obj);
            FloatingWindowRequestModel.INSTANCE.requestFloatingWindowData(toq.this);
            return was.f36763k;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public toq(@InterfaceC7396q Application app) {
        super(app);
        d2ok.m23075h(app, "app");
        this.f17745y = new fti<>();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m10460c() {
        return this.f17745y.m4388g() != null;
    }

    /* JADX INFO: renamed from: f */
    public final long m10461f() {
        return this.f17744s;
    }

    @InterfaceC7396q
    public final fti<UIPage> hyr() {
        return this.f17745y;
    }

    public final boolean lrht(long j2) {
        return j2 - this.f17744s > 1000;
    }

    public final void uv6() {
        this.f17744s = SystemClock.elapsedRealtime();
        x2.m24649g(uv6.m4473k(this), null, null, new C2948k(null), 3, null);
    }

    public final void vyq(long j2) {
        this.f17744s = j2;
    }
}
