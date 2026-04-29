package com.android.thememanager.util;

import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.C1821p;
import java.io.File;
import kotlin.collections.C6144h;
import miui.os.UserHandle;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: com.android.thememanager.util.t */
/* JADX INFO: compiled from: ConstantsExt.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C2807t {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final C2807t f16801k = new C2807t();

    private C2807t() {
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ca  */
    @l05.qrj
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m9996k(@mub.InterfaceC7396q android.content.Context r13, @mub.InterfaceC7396q java.lang.String r14, @mub.InterfaceC7396q java.lang.String r15, @mub.InterfaceC7396q com.android.thememanager.basemodule.resource.model.Resource r16) {
        /*
            Method dump skipped, instruction units count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.util.C2807t.m9996k(android.content.Context, java.lang.String, java.lang.String, com.android.thememanager.basemodule.resource.model.Resource):void");
    }

    @l05.qrj
    public static final boolean toq(@InterfaceC7396q String code) {
        kotlin.jvm.internal.d2ok.m23075h(code, "code");
        return C1807g.m7081r() && C6144h.ph5d(mcp.f7l8(), code);
    }

    private final void zy() {
        String strX2 = mcp.x2();
        File file = new File(strX2);
        if (!file.exists()) {
            file.mkdirs();
            C1821p.zy(mcp.f16640k, 511);
            C1821p.zy(mcp.f16640k + UserHandle.myUserId(), 511);
        }
        C1821p.zy(strX2, 511);
    }
}
