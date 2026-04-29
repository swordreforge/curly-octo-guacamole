package ixz;

import android.util.Log;
import com.bumptech.glide.EnumC3159p;
import com.bumptech.glide.load.C3086n;
import com.bumptech.glide.load.EnumC3050k;
import com.bumptech.glide.load.data.InterfaceC3000q;
import com.bumptech.glide.load.model.C3084y;
import com.bumptech.glide.util.qrj;
import com.bumptech.glide.util.zy;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import okhttp3.InterfaceC7435g;
import okhttp3.InterfaceC7519n;
import okhttp3.fti;
import okhttp3.jk;
import okhttp3.jp0y;
import zy.lvui;

/* JADX INFO: renamed from: ixz.k */
/* JADX INFO: compiled from: OkHttpStreamFetcher.java */
/* JADX INFO: loaded from: classes2.dex */
public class C6100k implements InterfaceC3000q<InputStream>, InterfaceC7435g {

    /* JADX INFO: renamed from: p */
    private static final String f35788p = "OkHttpFetcher";

    /* JADX INFO: renamed from: g */
    private jp0y f35789g;

    /* JADX INFO: renamed from: k */
    private final InterfaceC7519n.k f35790k;

    /* JADX INFO: renamed from: n */
    private InputStream f35791n;

    /* JADX INFO: renamed from: q */
    private final C3084y f35792q;

    /* JADX INFO: renamed from: s */
    private volatile InterfaceC7519n f35793s;

    /* JADX INFO: renamed from: y */
    private InterfaceC3000q.k<? super InputStream> f35794y;

    public C6100k(InterfaceC7519n.k kVar, C3084y c3084y) {
        this.f35790k = kVar;
        this.f35792q = c3084y;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3000q
    public void cancel() {
        InterfaceC7519n interfaceC7519n = this.f35793s;
        if (interfaceC7519n != null) {
            interfaceC7519n.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3000q
    /* JADX INFO: renamed from: g */
    public void mo10647g(@lvui EnumC3159p enumC3159p, @lvui InterfaceC3000q.k<? super InputStream> kVar) {
        jk.C7511k c7511kM27321t = new jk.C7511k().m27321t(this.f35792q.m10923y());
        for (Map.Entry<String, String> entry : this.f35792q.m10921n().entrySet()) {
            c7511kM27321t.m27316k(entry.getKey(), entry.getValue());
        }
        jk qVar = c7511kM27321t.toq();
        this.f35794y = kVar;
        this.f35793s = this.f35790k.mo27367k(qVar);
        this.f35793s.mo27031h(this);
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3000q
    @lvui
    /* JADX INFO: renamed from: k */
    public Class<InputStream> mo10634k() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3000q
    @lvui
    /* JADX INFO: renamed from: n */
    public EnumC3050k mo10648n() {
        return EnumC3050k.REMOTE;
    }

    @Override // okhttp3.InterfaceC7435g
    /* JADX INFO: renamed from: q */
    public void mo22383q(@lvui InterfaceC7519n interfaceC7519n, @lvui fti ftiVar) {
        this.f35789g = ftiVar.hyr();
        if (!ftiVar.m26884s()) {
            this.f35794y.zy(new C3086n(ftiVar.bek6(), ftiVar.i1()));
            return;
        }
        InputStream inputStreamZy = zy.zy(this.f35789g.m27327k(), ((jp0y) qrj.m11262q(this.f35789g)).x2());
        this.f35791n = inputStreamZy;
        this.f35794y.mo10657q(inputStreamZy);
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3000q
    public void toq() {
        try {
            InputStream inputStream = this.f35791n;
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (IOException unused) {
        }
        jp0y jp0yVar = this.f35789g;
        if (jp0yVar != null) {
            jp0yVar.close();
        }
        this.f35794y = null;
    }

    @Override // okhttp3.InterfaceC7435g
    public void zy(@lvui InterfaceC7519n interfaceC7519n, @lvui IOException iOException) {
        if (Log.isLoggable(f35788p, 3)) {
            Log.d(f35788p, "OkHttp failed to obtain result", iOException);
        }
        this.f35794y.zy(iOException);
    }
}
