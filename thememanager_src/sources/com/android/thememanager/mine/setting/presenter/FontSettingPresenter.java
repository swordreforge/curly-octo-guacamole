package com.android.thememanager.mine.setting.presenter;

import android.text.TextUtils;
import androidx.lifecycle.InterfaceC0954z;
import androidx.lifecycle.fti;
import androidx.lifecycle.jp0y;
import com.android.thememanager.C2320q;
import com.android.thememanager.basemodule.base.BasePresenter;
import com.android.thememanager.basemodule.network.theme.f7l8;
import com.android.thememanager.basemodule.network.theme.model.CommonResponse;
import com.android.thememanager.basemodule.resource.C1791k;
import com.android.thememanager.basemodule.resource.C1795s;
import com.android.thememanager.basemodule.resource.model.PathEntry;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.mine.setting.model.FontSettingRequestInterface;
import com.google.gson.kja0;
import ek5k.C6002g;
import java.io.File;
import java.util.List;
import r8s8.InterfaceC7629k;
import retrofit2.toq;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class FontSettingPresenter extends BasePresenter<InterfaceC7629k.toq> implements InterfaceC7629k.k {

    /* JADX INFO: renamed from: q */
    private fti<List<Resource>> f12950q = new fti<>();

    /* JADX INFO: renamed from: com.android.thememanager.mine.setting.presenter.FontSettingPresenter$k */
    class RunnableC2198k implements Runnable {
        RunnableC2198k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FontSettingPresenter.this.f12950q.n7h(C2320q.jk("fonts"));
        }
    }

    private void jk() {
        C6002g.m22240g(new RunnableC2198k());
    }

    @Override // r8s8.InterfaceC7629k.k
    public toq<CommonResponse<kja0>> getLoadMoreCall(int cardStart) {
        return ((FontSettingRequestInterface) f7l8.m6882h().qrj(FontSettingRequestInterface.class)).getSettingsFontList(cardStart, Integer.MAX_VALUE);
    }

    @Override // r8s8.InterfaceC7629k.k
    public toq<CommonResponse<kja0>> getRefreshCall() {
        return ((FontSettingRequestInterface) f7l8.m6882h().qrj(FontSettingRequestInterface.class)).getSettingsFontList(0, Integer.MAX_VALUE);
    }

    @Override // r8s8.InterfaceC7629k.k
    /* JADX INFO: renamed from: h */
    public String mo8297h(Resource resource) {
        C1795s c1795s = new C1795s(resource, C1791k.getFont());
        List<String> listM6967n = c1795s.m6967n();
        String str = listM6967n.isEmpty() ? null : listM6967n.get(0);
        if (!TextUtils.isEmpty(str) && new File(str).isFile()) {
            return str;
        }
        List<PathEntry> listM6968p = c1795s.m6968p();
        PathEntry pathEntry = listM6968p.isEmpty() ? null : listM6968p.get(0);
        if (pathEntry == null || pathEntry.getLocalPath() == null) {
            return null;
        }
        return pathEntry.getLocalPath();
    }

    @Override // r8s8.InterfaceC7629k.k
    public String n7h(Resource resource) {
        return new C1795s(resource, C1791k.getFont()).m6971y();
    }

    @Override // com.android.thememanager.basemodule.base.BasePresenter, androidx.lifecycle.InterfaceC0928g, androidx.lifecycle.ld6
    public void t8r(@lvui InterfaceC0954z owner) {
        super.t8r(owner);
        jk();
    }

    @Override // r8s8.InterfaceC7629k.k
    public void x2(InterfaceC0954z lifecycleOwner, jp0y<List<Resource>> observer) {
        this.f12950q.m4391p(lifecycleOwner, observer);
    }
}
