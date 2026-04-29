package com.android.thememanager.viewmodel;

import android.app.Application;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.fti;
import androidx.lifecycle.uv6;
import com.android.thememanager.basemodule.network.theme.model.CommonResponse;
import com.android.thememanager.controller.online.ld6;
import com.android.thememanager.controller.x2;
import com.android.thememanager.v9.model.UserMessage;
import cyoe.InterfaceC5979h;
import ek5k.f7l8;
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

/* JADX INFO: renamed from: com.android.thememanager.viewmodel.k */
/* JADX INFO: compiled from: AccountFragmentVM.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C2947k extends androidx.lifecycle.toq {

    /* JADX INFO: renamed from: y */
    @InterfaceC7396q
    private final fti<UserMessage> f17743y;

    /* JADX INFO: renamed from: com.android.thememanager.viewmodel.k$k */
    /* JADX INFO: compiled from: AccountFragmentVM.kt */
    @InterfaceC6205g(m22755c = "com.android.thememanager.viewmodel.AccountFragmentVM$loadUserMessage$1", m22756f = "AccountFragmentVM.kt", m22757i = {}, m22758l = {}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
    static final class k extends kja0 implements InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super was>, Object> {
        final /* synthetic */ x2 $controller;
        int label;
        final /* synthetic */ C2947k this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(x2 x2Var, C2947k c2947k, InterfaceC6216q<? super k> interfaceC6216q) {
            super(2, interfaceC6216q);
            this.$controller = x2Var;
            this.this$0 = c2947k;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            return new k(this.$controller, this.this$0, interfaceC6216q);
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
            return ((k) create(interfaceC6556f, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            C6199q.x2();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C6318m.n7h(obj);
            CommonResponse commonResponseMo7476p = this.$controller.m7690k().mo7476p(ld6.g1(), true, UserMessage.class);
            UserMessage userMessage = null;
            if ((commonResponseMo7476p != null ? (UserMessage) commonResponseMo7476p.apiData : null) != null && commonResponseMo7476p.apiCode == 0) {
                userMessage = (UserMessage) commonResponseMo7476p.apiData;
            }
            this.this$0.f17743y.n7h(userMessage);
            return was.f36763k;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2947k(@InterfaceC7396q Application app) {
        super(app);
        d2ok.m23075h(app, "app");
        this.f17743y = new fti<>();
    }

    /* JADX INFO: renamed from: c */
    public final void m10458c(@InterfaceC7396q x2 controller) {
        d2ok.m23075h(controller, "controller");
        kotlinx.coroutines.x2.m24649g(uv6.m4473k(this), f7l8.zy(), null, new k(controller, this, null), 2, null);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: f */
    public final LiveData<UserMessage> m10459f() {
        return this.f17743y;
    }
}
