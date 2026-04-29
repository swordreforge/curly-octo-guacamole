package com.android.thememanager.mine.setting.presenter;

import android.util.Pair;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.fti;
import androidx.lifecycle.lrht;
import com.android.thememanager.basemodule.network.theme.AbstractC1777n;
import com.android.thememanager.basemodule.network.theme.f7l8;
import com.android.thememanager.mine.setting.model.SupportTheme;
import com.android.thememanager.mine.setting.model.SupportThemeRequestInterface;
import zy.lvui;

/* JADX INFO: renamed from: com.android.thememanager.mine.setting.presenter.k */
/* JADX INFO: compiled from: SupportThemeVM.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2199k extends lrht {

    /* JADX INFO: renamed from: g */
    private final fti<SupportTheme> f12952g = new fti<>();

    /* JADX INFO: renamed from: y */
    private final fti<Pair<Integer, Exception>> f12953y = new fti<>();

    /* JADX INFO: renamed from: com.android.thememanager.mine.setting.presenter.k$k */
    /* JADX INFO: compiled from: SupportThemeVM.java */
    class k extends AbstractC1777n<SupportTheme> {
        k() {
        }

        @Override // com.android.thememanager.basemodule.network.theme.AbstractC1777n
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public void onResponse(@lvui SupportTheme response) {
            C2199k.this.f12952g.cdj(response);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.mine.setting.presenter.k$toq */
    /* JADX INFO: compiled from: SupportThemeVM.java */
    class toq extends AbstractC1777n<SupportTheme> {
        toq() {
        }

        @Override // com.android.thememanager.basemodule.network.theme.AbstractC1777n
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public void onResponse(@lvui SupportTheme response) {
            C2199k.this.f12952g.cdj(response);
        }

        @Override // com.android.thememanager.basemodule.network.theme.AbstractC1777n
        public void onFailure(int httpCode, int apiCode, String message, Exception e2) {
            super.onFailure(httpCode, apiCode, message, e2);
            C2199k.this.f12953y.cdj(Pair.create(Integer.valueOf(httpCode), e2));
        }
    }

    /* JADX INFO: renamed from: c */
    public LiveData<Pair<Integer, Exception>> m8298c() {
        return this.f12953y;
    }

    /* JADX INFO: renamed from: f */
    public LiveData<SupportTheme> m8299f() {
        if (this.f12952g.m4388g() == null) {
            ((SupportThemeRequestInterface) f7l8.m6882h().qrj(SupportThemeRequestInterface.class)).fetchSupportCount().mo27954p(new k());
        }
        return this.f12952g;
    }

    public void lrht() {
        ((SupportThemeRequestInterface) f7l8.m6882h().qrj(SupportThemeRequestInterface.class)).supportTheme(null).mo27954p(new toq());
    }
}
