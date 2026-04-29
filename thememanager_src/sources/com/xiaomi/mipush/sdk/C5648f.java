package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.xiaomi.push.oph;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.xiaomi.mipush.sdk.f */
/* JADX INFO: loaded from: classes3.dex */
public class C5648f implements InterfaceC5654k {

    /* JADX INFO: renamed from: n */
    private static volatile C5648f f31345n;

    /* JADX INFO: renamed from: k */
    private Context f31346k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private fn3e f73136toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private boolean f73137zy = false;

    /* JADX INFO: renamed from: q */
    private Map<hyr, InterfaceC5654k> f31347q = new HashMap();

    private C5648f(Context context) {
        this.f31346k = context.getApplicationContext();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x019b  */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m19437g() {
        /*
            Method dump skipped, instruction units count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.mipush.sdk.C5648f.m19437g():void");
    }

    /* JADX INFO: renamed from: n */
    public static C5648f m19438n(Context context) {
        if (f31345n == null) {
            synchronized (C5648f.class) {
                if (f31345n == null) {
                    f31345n = new C5648f(context);
                }
            }
        }
        return f31345n;
    }

    public void f7l8(fn3e fn3eVar) {
        this.f73136toq = fn3eVar;
        this.f73137zy = com.xiaomi.push.service.a9.m21550q(this.f31346k).qrj(oph.AggregatePushSwitch.m21370a(), true);
        if (this.f73136toq.m19455q() || this.f73136toq.toq() || this.f73136toq.m19452k() || this.f73136toq.zy()) {
            com.xiaomi.push.service.a9.m21550q(this.f31346k).m21554p(new C5641c(this, 101, "assemblePush"));
        }
    }

    @Override // com.xiaomi.mipush.sdk.InterfaceC5654k
    /* JADX INFO: renamed from: k */
    public void mo19439k() {
        com.xiaomi.channel.commonutils.logger.zy.kja0("ASSEMBLE_PUSH : assemble push unregister");
        for (InterfaceC5654k interfaceC5654k : this.f31347q.values()) {
            if (interfaceC5654k != null) {
                interfaceC5654k.mo19439k();
            }
        }
        this.f31347q.clear();
    }

    /* JADX INFO: renamed from: p */
    public boolean m19440p(hyr hyrVar) {
        return this.f31347q.containsKey(hyrVar);
    }

    /* JADX INFO: renamed from: q */
    public InterfaceC5654k m19441q(hyr hyrVar) {
        return this.f31347q.get(hyrVar);
    }

    public boolean qrj(hyr hyrVar) {
        int i2 = lrht.f31400k[hyrVar.ordinal()];
        boolean zM19452k = false;
        if (i2 == 1) {
            fn3e fn3eVar = this.f73136toq;
            if (fn3eVar != null) {
                return fn3eVar.m19455q();
            }
            return false;
        }
        if (i2 == 2) {
            fn3e fn3eVar2 = this.f73136toq;
            if (fn3eVar2 != null) {
                return fn3eVar2.toq();
            }
            return false;
        }
        if (i2 == 3) {
            fn3e fn3eVar3 = this.f73136toq;
            if (fn3eVar3 != null) {
                zM19452k = fn3eVar3.m19452k();
            }
        } else if (i2 != 4) {
            return false;
        }
        fn3e fn3eVar4 = this.f73136toq;
        return fn3eVar4 != null ? fn3eVar4.zy() : zM19452k;
    }

    /* JADX INFO: renamed from: s */
    public void m19442s(hyr hyrVar, InterfaceC5654k interfaceC5654k) {
        if (interfaceC5654k != null) {
            if (this.f31347q.containsKey(hyrVar)) {
                this.f31347q.remove(hyrVar);
            }
            this.f31347q.put(hyrVar, interfaceC5654k);
        }
    }

    @Override // com.xiaomi.mipush.sdk.InterfaceC5654k
    public void toq() {
        com.xiaomi.channel.commonutils.logger.zy.kja0("ASSEMBLE_PUSH : assemble push register");
        if (this.f31347q.size() <= 0) {
            m19437g();
        }
        if (this.f31347q.size() > 0) {
            for (InterfaceC5654k interfaceC5654k : this.f31347q.values()) {
                if (interfaceC5654k != null) {
                    interfaceC5654k.toq();
                }
            }
            uv6.m19564s(this.f31346k);
        }
    }

    /* JADX INFO: renamed from: y */
    public void m19443y(hyr hyrVar) {
        this.f31347q.remove(hyrVar);
    }
}
