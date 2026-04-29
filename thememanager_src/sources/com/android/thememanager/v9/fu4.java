package com.android.thememanager.v9;

import androidx.lifecycle.fti;
import androidx.lifecycle.lrht;
import com.android.thememanager.basemodule.network.theme.model.CommonResponse;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.android.thememanager.router.recommend.entity.UICard;
import com.android.thememanager.router.recommend.entity.UIElement;
import com.android.thememanager.router.recommend.entity.UIPage;
import com.android.thememanager.router.recommend.entity.UIResult;
import ek5k.C6002g;
import java.util.List;
import retrofit2.C7639i;
import retrofit2.InterfaceC7648q;
import yqrt.C7792k;
import yz.C7794k;
import zy.dd;
import zy.lvui;
import zy.y9n;

/* JADX INFO: compiled from: WallpaperSubjectViewModel.java */
/* JADX INFO: loaded from: classes2.dex */
public class fu4 extends lrht {

    /* JADX INFO: renamed from: z */
    private static final String f17102z = "WallSubViewModel";

    /* JADX INFO: renamed from: s */
    private retrofit2.toq<CommonResponse<UIPage>> f17107s;

    /* JADX INFO: renamed from: y */
    private retrofit2.toq<CommonResponse<UIPage>> f17108y;

    /* JADX INFO: renamed from: p */
    private int f17106p = -1;

    /* JADX INFO: renamed from: h */
    private final fti<UICard> f17104h = new fti<>();

    /* JADX INFO: renamed from: i */
    private final fti<UIResult> f17105i = new fti<>();

    /* JADX INFO: renamed from: g */
    private final t8r f17103g = (t8r) com.android.thememanager.basemodule.network.theme.f7l8.m6882h().m6571n(t8r.class, C6002g.ld6());

    /* JADX INFO: renamed from: com.android.thememanager.v9.fu4$k */
    /* JADX INFO: compiled from: WallpaperSubjectViewModel.java */
    class C2858k implements InterfaceC7648q<CommonResponse<UIPage>> {
        C2858k() {
        }

        @Override // retrofit2.InterfaceC7648q
        public void onFailure(@lvui retrofit2.toq<CommonResponse<UIPage>> call, @lvui Throwable t2) {
            fu4.this.f17104h.n7h(null);
            fu4.this.f17106p = -1;
            C7794k.m28196p(fu4.f17102z, call + " .FAIL:" + t2);
        }

        @Override // retrofit2.InterfaceC7648q
        public void onResponse(@lvui retrofit2.toq<CommonResponse<UIPage>> call, @lvui C7639i<CommonResponse<UIPage>> r2) {
            if (r2.m27986k() != null && r2.m27986k().apiData != null && r2.m27986k().apiData.cards != null && r2.m27986k().apiData.cards.size() > 0) {
                fu4.this.f17104h.n7h(r2.m27986k().apiData.cards.get(0));
                return;
            }
            fu4.this.f17104h.n7h(null);
            fu4.this.f17106p = -1;
            C7794k.m28196p(fu4.f17102z, "response. fail. " + r2.m27986k());
        }
    }

    /* JADX INFO: compiled from: WallpaperSubjectViewModel.java */
    class toq implements InterfaceC7648q<CommonResponse<UIPage>> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ int f17110k;

        toq(final int val$page) {
            this.f17110k = val$page;
        }

        @Override // retrofit2.InterfaceC7648q
        public void onFailure(@lvui retrofit2.toq<CommonResponse<UIPage>> call, @lvui Throwable t2) {
            fu4.this.nn86(null, this.f17110k == 0);
            C7794k.m28196p(fu4.f17102z, call + " .FAIL:" + t2);
        }

        @Override // retrofit2.InterfaceC7648q
        public void onResponse(@lvui retrofit2.toq<CommonResponse<UIPage>> call, @lvui C7639i<CommonResponse<UIPage>> response) {
            if (response.m27986k() != null) {
                C7794k.m28195n(fu4.f17102z, "load complete.");
                fu4.this.nn86(response.m27986k().apiData, this.f17110k == 0);
            } else {
                fu4.this.nn86(null, this.f17110k == 0);
                C7794k.m28196p(fu4.f17102z, "response. but body null !");
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private retrofit2.toq<CommonResponse<UIPage>> m10176c(String subjectUuid, int page, String type, boolean subject) {
        return p029m.zy.toq(subjectUuid) ? this.f17103g.toq(String.valueOf(page), type) : this.f17103g.m10203k(String.valueOf(page), type, String.valueOf(subject), subjectUuid);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @y9n
    public void nn86(@dd UIPage page, boolean firstPage) {
        List<UIElement> qVar = page == null ? null : new C7792k(false).toq(page.cards, firstPage, page.hasMore);
        if (page == null) {
            this.f17105i.n7h(null);
        } else {
            this.f17105i.n7h(new UIResult(qVar, page.hasMore, page.category, -1, page.adTagIds, page.uuid));
        }
    }

    /* JADX INFO: renamed from: e */
    public void m10178e(String uuid, int page, boolean subject) {
        if (this.f17106p == page) {
            return;
        }
        this.f17106p = page;
        retrofit2.toq<CommonResponse<UIPage>> toqVarM10176c = m10176c(uuid, page, InterfaceC1925p.p7p2, subject);
        this.f17108y = toqVarM10176c;
        toqVarM10176c.mo27954p(new C2858k());
    }

    public fti<UIResult> lrht() {
        return this.f17105i;
    }

    @Override // androidx.lifecycle.lrht
    protected void ncyb() {
        retrofit2.toq<CommonResponse<UIPage>> toqVar = this.f17108y;
        if (toqVar != null) {
            toqVar.cancel();
        }
        retrofit2.toq<CommonResponse<UIPage>> toqVar2 = this.f17107s;
        if (toqVar2 != null) {
            toqVar2.cancel();
        }
    }

    public fti<UICard> uv6() {
        return this.f17104h;
    }

    void vyq(String subjectUuid, int page, boolean subject) {
        retrofit2.toq<CommonResponse<UIPage>> toqVarM10176c = m10176c(subjectUuid, page, InterfaceC1925p.rd5, subject);
        this.f17107s = toqVarM10176c;
        toqVarM10176c.mo27954p(new toq(page));
    }
}
