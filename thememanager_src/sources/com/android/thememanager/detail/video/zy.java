package com.android.thememanager.detail.video;

import android.net.Uri;
import android.util.Log;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.fti;
import androidx.lifecycle.lrht;
import com.android.thememanager.C2320q;
import com.android.thememanager.basemodule.account.C1688q;
import com.android.thememanager.basemodule.base.C1723y;
import com.android.thememanager.basemodule.network.theme.AbstractC1770g;
import com.android.thememanager.basemodule.network.theme.f7l8;
import com.android.thememanager.basemodule.network.theme.model.EmptyResponse;
import com.android.thememanager.basemodule.utils.C1822q;
import com.android.thememanager.detail.video.model.VideoRequestInterface;
import com.google.gson.kja0;
import ek5k.C6002g;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import miuix.core.util.C7083n;
import retrofit2.C7639i;
import retrofit2.InterfaceC7648q;
import zy.lvui;

/* JADX INFO: compiled from: VideoDetailFragmentVM.java */
/* JADX INFO: loaded from: classes2.dex */
public class zy extends lrht {

    /* JADX INFO: renamed from: p */
    private static final String f11572p = "VideoDetailFragVM";

    /* JADX INFO: renamed from: g */
    private fti<String> f11573g;

    /* JADX INFO: renamed from: s */
    private final fti<C1723y<Boolean>> f11574s = new fti<>();

    /* JADX INFO: renamed from: y */
    private fti<kja0> f11575y;

    /* JADX INFO: renamed from: com.android.thememanager.detail.video.zy$k */
    /* JADX INFO: compiled from: VideoDetailFragmentVM.java */
    private static class C2031k extends AbstractC1770g {

        /* JADX INFO: renamed from: s */
        private final boolean f11576s;

        /* JADX INFO: renamed from: y */
        private final fti<C1723y<Boolean>> f11577y;

        public C2031k(fti<C1723y<Boolean>> data, boolean addLike) {
            this.f11577y = data;
            this.f11576s = addLike;
        }

        @Override // com.android.thememanager.basemodule.network.theme.AbstractC1770g
        protected void toq(retrofit2.toq<EmptyResponse> call, C7639i<EmptyResponse> response) {
            this.f11577y.cdj(new C1723y<>(Boolean.valueOf(this.f11576s)));
        }
    }

    /* JADX INFO: compiled from: VideoDetailFragmentVM.java */
    private static class toq implements InterfaceC7648q<kja0> {

        /* JADX INFO: renamed from: k */
        private final fti<kja0> f11578k;

        toq(fti<kja0> data) {
            this.f11578k = data;
        }

        @Override // retrofit2.InterfaceC7648q
        public void onFailure(@lvui retrofit2.toq<kja0> call, @lvui Throwable t2) {
            Log.w(zy.f11572p, "load video detail fail. " + t2);
        }

        @Override // retrofit2.InterfaceC7648q
        public void onResponse(@lvui retrofit2.toq<kja0> call, C7639i<kja0> response) {
            if (response.m27986k() == null) {
                return;
            }
            this.f11578k.cdj(response.m27986k());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public /* synthetic */ void m7886c(Uri uri) {
        String str = C2320q.wvg() + C1822q.zy(uri.toString());
        File file = new File(str);
        try {
            InputStream inputStreamOpenInputStream = bf2.toq.toq().getContentResolver().openInputStream(uri);
            try {
                C7083n.m25589q(inputStreamOpenInputStream, file);
                this.f11573g.n7h(str);
                if (inputStreamOpenInputStream != null) {
                    inputStreamOpenInputStream.close();
                }
            } finally {
            }
        } catch (IOException e2) {
            Log.w(f11572p, "fail copyVideo " + e2);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m7887f(boolean add, String onlineId) {
        C2031k c2031k = new C2031k(this.f11574s, add);
        if (add) {
            was.toq.toq(onlineId, c2031k);
        } else {
            was.toq.m28126q(onlineId, c2031k);
        }
    }

    public LiveData<String> hyr(final Uri copyUri) {
        if (this.f11573g == null) {
            this.f11573g = new fti<>();
        }
        C6002g.m22240g(new Runnable() { // from class: com.android.thememanager.detail.video.toq
            @Override // java.lang.Runnable
            public final void run() {
                this.f11425k.m7886c(copyUri);
            }
        });
        return this.f11573g;
    }

    public LiveData<C1723y<Boolean>> lrht() {
        return this.f11574s;
    }

    public LiveData<kja0> uv6(String onlineId) {
        if (this.f11575y == null) {
            this.f11575y = new fti<>();
            (C1688q.cdj().o1t() ? ((VideoRequestInterface) f7l8.m6882h().qrj(VideoRequestInterface.class)).getSafeVideoDetail(onlineId) : ((VideoRequestInterface) f7l8.m6882h().qrj(VideoRequestInterface.class)).getVideoDetail(onlineId)).mo27954p(new toq(this.f11575y));
        }
        return this.f11575y;
    }
}
