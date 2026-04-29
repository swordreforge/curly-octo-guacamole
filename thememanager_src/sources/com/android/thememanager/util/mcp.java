package com.android.thememanager.util;

import android.text.TextUtils;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.C1821p;
import java.util.List;
import java.util.Map;
import kotlin.collections.C6144h;
import miui.content.res.ThemeResources;
import miui.os.UserHandle;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: ConstantsExt.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class mcp {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private static final String f16640k = C1821p.n7h(ThemeResources.THEME_MAGIC_PATH) + "users/";

    @InterfaceC7396q
    public static final String[] f7l8() {
        return C1807g.lvui() ? xwq3.f16903k.x2() : xwq3.f16903k.ld6();
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: g */
    public static final Map<String, String> m9874g() {
        return C1807g.lvui() ? xwq3.f16903k.t8r() : xwq3.f16903k.kja0();
    }

    @InterfaceC7396q
    public static final List<String> ld6() {
        return C1807g.lvui() ? kotlin.collections.ni7.ki(InterfaceC1789q.gx2z, InterfaceC1789q.dh74) : kotlin.collections.ni7.ki("lockstyle_outer", "lockstyle_inner");
    }

    /* JADX INFO: renamed from: n */
    public static final long m9876n(@InterfaceC7396q String code) {
        kotlin.jvm.internal.d2ok.m23075h(code, "code");
        Long l2 = C1807g.lvui() ? xwq3.f16903k.ki().get(code) : xwq3.f16903k.n7h().get(code);
        if (l2 != null) {
            return l2.longValue();
        }
        return 0L;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: p */
    public static final String m9877p(@InterfaceC7396q String code) {
        kotlin.jvm.internal.d2ok.m23075h(code, "code");
        xwq3 xwq3Var = xwq3.f16903k;
        String[] strArrM10084s = xwq3Var.m10084s();
        if (C1807g.lvui()) {
            strArrM10084s = xwq3Var.m10083p();
        }
        return C6144h.ph5d(strArrM10084s, code) ? code : com.android.thememanager.basemodule.analysis.toq.lbeq;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: q */
    public static final String[] m9878q() {
        return C1807g.zurt() ? xwq3.f16903k.m10084s() : xwq3.f16903k.m10083p();
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: s */
    public static final String m9879s(@InterfaceC7395n String str) {
        if (TextUtils.isEmpty(str)) {
            return x2() + "preview/";
        }
        return m9879s(null) + str;
    }

    @InterfaceC7396q
    public static final Map<String, String> toq() {
        return C1807g.lvui() ? xwq3.f16903k.cdj() : xwq3.f16903k.qrj();
    }

    @InterfaceC7396q
    public static final String x2() {
        return f16640k + UserHandle.myUserId() + "/Theme/";
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: y */
    public static final String m9880y(@InterfaceC7396q String code) {
        kotlin.jvm.internal.d2ok.m23075h(code, "code");
        return x2() + code;
    }

    @InterfaceC7396q
    public static final String zy(long j2) {
        String str = C1807g.lvui() ? xwq3.f16903k.m10082i().get(Long.valueOf(j2)) : xwq3.f16903k.m10081h().get(Long.valueOf(j2));
        return str == null ? "" : str;
    }
}
