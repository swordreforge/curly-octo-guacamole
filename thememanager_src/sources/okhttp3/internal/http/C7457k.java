package okhttp3.internal.http;

import b7.C1359g;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import mub.InterfaceC7396q;
import okhttp3.a9;
import okhttp3.fti;
import okhttp3.fu4;
import okhttp3.jk;
import okhttp3.jp0y;
import okhttp3.n7h;
import okhttp3.ni7;
import okhttp3.qrj;
import okio.C7576t;

/* JADX INFO: renamed from: okhttp3.internal.http.k */
/* JADX INFO: compiled from: BridgeInterceptor.kt */
/* JADX INFO: loaded from: classes4.dex */
@lv5({"SMAP\nBridgeInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BridgeInterceptor.kt\nokhttp3/internal/http/BridgeInterceptor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,117:1\n1864#2,3:118\n*S KotlinDebug\n*F\n+ 1 BridgeInterceptor.kt\nokhttp3/internal/http/BridgeInterceptor\n*L\n111#1:118,3\n*E\n"})
public final class C7457k implements ni7 {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final n7h f43138k;

    public C7457k(@InterfaceC7396q n7h cookieJar) {
        d2ok.m23075h(cookieJar, "cookieJar");
        this.f43138k = cookieJar;
    }

    private final String toq(List<qrj> list) {
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                kotlin.collections.ni7.lrht();
            }
            qrj qrjVar = (qrj) obj;
            if (i2 > 0) {
                sb.append("; ");
            }
            sb.append(qrjVar.t8r());
            sb.append('=');
            sb.append(qrjVar.o1t());
            i2 = i3;
        }
        String string = sb.toString();
        d2ok.kja0(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @Override // okhttp3.ni7
    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public fti mo6886k(@InterfaceC7396q ni7.InterfaceC7521k chain) throws IOException {
        jp0y jp0yVarHyr;
        d2ok.m23075h(chain, "chain");
        jk jkVarZy = chain.zy();
        jk.C7511k c7511kN7h = jkVarZy.n7h();
        a9 a9VarM27305g = jkVarZy.m27305g();
        if (a9VarM27305g != null) {
            fu4 qVar = a9VarM27305g.toq();
            if (qVar != null) {
                c7511kN7h.n7h(com.google.common.net.zy.f68571zy, qVar.toString());
            }
            long jMo26833k = a9VarM27305g.mo26833k();
            if (jMo26833k != -1) {
                c7511kN7h.n7h(com.google.common.net.zy.f68551toq, String.valueOf(jMo26833k));
                c7511kN7h.m27315i(com.google.common.net.zy.f27247d);
            } else {
                c7511kN7h.n7h(com.google.common.net.zy.f27247d, "chunked");
                c7511kN7h.m27315i(com.google.common.net.zy.f68551toq);
            }
        }
        boolean z2 = false;
        if (jkVarZy.m27311s(com.google.common.net.zy.f68570zurt) == null) {
            c7511kN7h.n7h(com.google.common.net.zy.f68570zurt, C1359g.yz(jkVarZy.cdj(), false, 1, null));
        }
        if (jkVarZy.m27311s(com.google.common.net.zy.f68524kja0) == null) {
            c7511kN7h.n7h(com.google.common.net.zy.f68524kja0, "Keep-Alive");
        }
        if (jkVarZy.m27311s(com.google.common.net.zy.f27259p) == null && jkVarZy.m27311s(com.google.common.net.zy.f68521jp0y) == null) {
            c7511kN7h.n7h(com.google.common.net.zy.f27259p, "gzip");
            z2 = true;
        }
        List<qrj> listMo27368k = this.f43138k.mo27368k(jkVarZy.cdj());
        if (!listMo27368k.isEmpty()) {
            c7511kN7h.n7h("Cookie", toq(listMo27368k));
        }
        if (jkVarZy.m27311s("User-Agent") == null) {
            c7511kN7h.n7h("User-Agent", C1359g.f7242p);
        }
        fti ftiVarMo27071q = chain.mo27071q(c7511kN7h.toq());
        C7459n.f7l8(this.f43138k, jkVarZy.cdj(), ftiVarMo27071q.ltg8());
        fti.C7433k c7433kA9 = ftiVarMo27071q.ij().a9(jkVarZy);
        if (z2 && kotlin.text.a9.e5("gzip", fti.g1(ftiVarMo27071q, com.google.common.net.zy.f68552uv6, null, 2, null), true) && C7459n.zy(ftiVarMo27071q) && (jp0yVarHyr = ftiVarMo27071q.hyr()) != null) {
            C7576t c7576t = new C7576t(jp0yVarHyr.y9n());
            c7433kA9.ni7(ftiVarMo27071q.ltg8().m26862p().x2(com.google.common.net.zy.f68552uv6).x2(com.google.common.net.zy.f68551toq).m26870s());
            c7433kA9.toq(new C7463y(fti.g1(ftiVarMo27071q, com.google.common.net.zy.f68571zy, null, 2, null), -1L, okio.d2ok.m27592n(c7576t)));
        }
        return c7433kA9.zy();
    }
}
