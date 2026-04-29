package com.android.thememanager.author.viewmodel;

import android.app.Application;
import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.fti;
import com.android.thememanager.R;
import com.android.thememanager.author.viewmodel.AbstractC1671q;
import com.android.thememanager.basemodule.network.theme.f7l8;
import com.android.thememanager.basemodule.network.theme.model.CommonResponse;
import com.android.thememanager.basemodule.network.theme.model.EmptyResponse;
import com.android.thememanager.basemodule.utils.mcp;
import com.android.thememanager.basemodule.utils.nn86;
import com.android.thememanager.router.recommend.entity.AuthorEntity;
import com.android.thememanager.util.C2782h;
import kotlin.C6227f;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import retrofit2.C7639i;
import retrofit2.InterfaceC7648q;

/* JADX INFO: compiled from: AuthorWorksViewModel.kt */
/* JADX INFO: loaded from: classes.dex */
public final class toq extends androidx.lifecycle.toq {

    /* JADX INFO: renamed from: h */
    @InterfaceC7395n
    private AuthorEntity f9607h;

    /* JADX INFO: renamed from: i */
    @InterfaceC7396q
    private fti<C6227f<Boolean, Long>> f9608i;

    /* JADX INFO: renamed from: p */
    @InterfaceC7396q
    private fti<AbstractC1671q> f9609p;

    /* JADX INFO: renamed from: s */
    @InterfaceC7396q
    private final C7904toq f9610s;

    /* JADX INFO: renamed from: y */
    @InterfaceC7395n
    private retrofit2.toq<EmptyResponse> f9611y;

    /* JADX INFO: renamed from: com.android.thememanager.author.viewmodel.toq$k */
    /* JADX INFO: compiled from: AuthorWorksViewModel.kt */
    public final class C1672k implements InterfaceC7648q<EmptyResponse> {

        /* JADX INFO: renamed from: k */
        private final boolean f9612k;

        public C1672k(boolean z2) {
            this.f9612k = z2;
        }

        /* JADX INFO: renamed from: k */
        private final void m6546k() {
            if (mcp.m7139n()) {
                return;
            }
            nn86.m7150k(R.string.network_exception, 0);
        }

        @Override // retrofit2.InterfaceC7648q
        public void onFailure(@InterfaceC7396q retrofit2.toq<EmptyResponse> call, @InterfaceC7396q Throwable t2) {
            d2ok.m23075h(call, "call");
            d2ok.m23075h(t2, "t");
            Log.e("AuthorWorksViewModel", "AuthorFollowCallback failed: " + t2.getMessage());
            m6546k();
        }

        @Override // retrofit2.InterfaceC7648q
        public void onResponse(@InterfaceC7396q retrofit2.toq<EmptyResponse> call, @InterfaceC7396q C7639i<EmptyResponse> response) {
            d2ok.m23075h(call, "call");
            d2ok.m23075h(response, "response");
            if (!response.f7l8() || toq.this.m6545f() == null) {
                m6546k();
                return;
            }
            AuthorEntity authorEntityM6545f = toq.this.m6545f();
            d2ok.qrj(authorEntityM6545f);
            authorEntityM6545f.setFollow(this.f9612k);
            if (this.f9612k) {
                AuthorEntity authorEntityM6545f2 = toq.this.m6545f();
                d2ok.qrj(authorEntityM6545f2);
                authorEntityM6545f2.setFansNum(authorEntityM6545f2.getFansNum() + 1);
                C2782h.m9787k();
            } else {
                AuthorEntity authorEntityM6545f3 = toq.this.m6545f();
                d2ok.qrj(authorEntityM6545f3);
                authorEntityM6545f3.setFansNum(authorEntityM6545f3.getFansNum() - 1);
                C2782h.toq();
            }
            fti<C6227f<Boolean, Long>> ftiVarLrht = toq.this.lrht();
            Boolean boolValueOf = Boolean.valueOf(this.f9612k);
            AuthorEntity authorEntityM6545f4 = toq.this.m6545f();
            d2ok.qrj(authorEntityM6545f4);
            ftiVarLrht.cdj(new C6227f<>(boolValueOf, Long.valueOf(authorEntityM6545f4.getFansNum())));
        }

        public final boolean toq() {
            return this.f9612k;
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.author.viewmodel.toq$toq, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AuthorWorksViewModel.kt */
    public final class C7904toq implements InterfaceC7648q<CommonResponse<AuthorEntity>> {
        public C7904toq() {
        }

        @Override // retrofit2.InterfaceC7648q
        public void onFailure(@InterfaceC7396q retrofit2.toq<CommonResponse<AuthorEntity>> call, @InterfaceC7396q Throwable t2) {
            d2ok.m23075h(call, "call");
            d2ok.m23075h(t2, "t");
            toq.this.m6543c().cdj(AbstractC1671q.toq.f9605k);
        }

        @Override // retrofit2.InterfaceC7648q
        public void onResponse(@InterfaceC7396q retrofit2.toq<CommonResponse<AuthorEntity>> call, @InterfaceC7396q C7639i<CommonResponse<AuthorEntity>> response) {
            d2ok.m23075h(call, "call");
            d2ok.m23075h(response, "response");
            if (!response.f7l8()) {
                toq.this.m6543c().cdj(AbstractC1671q.toq.f9605k);
                return;
            }
            CommonResponse<AuthorEntity> commonResponseM27986k = response.m27986k();
            AuthorEntity authorEntity = commonResponseM27986k != null ? commonResponseM27986k.apiData : null;
            if (authorEntity == null) {
                toq.this.m6543c().cdj(AbstractC1671q.k.f9602k);
            } else {
                toq.this.vyq(authorEntity);
                toq.this.m6543c().cdj(AbstractC1671q.n.f9603k);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public toq(@InterfaceC7396q Application application) {
        super(application);
        d2ok.m23075h(application, "application");
        this.f9610s = new C7904toq();
        this.f9609p = new fti<>();
        this.f9608i = new fti<>();
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: c */
    public final fti<AbstractC1671q> m6543c() {
        return this.f9609p;
    }

    /* JADX INFO: renamed from: e */
    public final void m6544e(@InterfaceC7396q fti<AbstractC1671q> ftiVar) {
        d2ok.m23075h(ftiVar, "<set-?>");
        this.f9609p = ftiVar;
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: f */
    public final AuthorEntity m6545f() {
        return this.f9607h;
    }

    public final void hyr(boolean z2) {
        if (this.f9607h == null) {
            return;
        }
        retrofit2.toq<EmptyResponse> toqVar = this.f9611y;
        if (toqVar != null) {
            toqVar.cancel();
        }
        AuthorEntity authorEntity = this.f9607h;
        d2ok.qrj(authorEntity);
        String strValueOf = String.valueOf(authorEntity.getDesignerMiId());
        AuthorEntity authorEntity2 = this.f9607h;
        d2ok.qrj(authorEntity2);
        this.f9611y = was.toq.m28125n(strValueOf, z2, authorEntity2.getDesignerName(), new C1672k(z2));
    }

    @InterfaceC7396q
    public final fti<C6227f<Boolean, Long>> lrht() {
        return this.f9608i;
    }

    public final void nn86(@InterfaceC7396q fti<C6227f<Boolean, Long>> ftiVar) {
        d2ok.m23075h(ftiVar, "<set-?>");
        this.f9608i = ftiVar;
    }

    public final void uv6(@InterfaceC7395n String str, @InterfaceC7395n String str2, @InterfaceC7395n String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str3)) {
            this.f9609p.cdj(AbstractC1671q.toq.f9605k);
            Log.w("AuthorWorksViewModel", "loadAuthorInfo: designerName or designerId is null");
            return;
        }
        InterfaceC1670k interfaceC1670k = (InterfaceC1670k) f7l8.m6882h().toq(InterfaceC1670k.class);
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "0";
        }
        if (str3 == null) {
            str3 = "0";
        }
        interfaceC1670k.m6542k(str, str2, str3).mo27954p(this.f9610s);
        this.f9609p.cdj(AbstractC1671q.q.f9604k);
    }

    public final void vyq(@InterfaceC7395n AuthorEntity authorEntity) {
        this.f9607h = authorEntity;
    }
}
