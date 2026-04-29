package com.android.thememanager.v9.data;

import android.content.Context;
import androidx.loader.content.AbstractC0959k;
import com.android.thememanager.C2082k;
import com.android.thememanager.basemodule.network.theme.model.CommonResponse;
import com.android.thememanager.controller.online.zurt;
import com.android.thememanager.fu4;
import com.android.thememanager.util.C2789j;
import com.android.thememanager.v9.model.UIElement;
import com.android.thememanager.v9.model.UIPage;
import com.android.thememanager.v9.model.UIResult;
import java.util.List;

/* JADX INFO: compiled from: OnlineResourceLoader.java */
/* JADX INFO: loaded from: classes2.dex */
public class zy extends AbstractC0959k<UIResult> {

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private static final String f61469fn3e = "OnlineResourceLoader";

    /* JADX INFO: renamed from: i */
    protected final f7l8 f17093i;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    protected final fu4 f61470ki;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    protected final zurt f61471t8r;

    public zy(Context context, fu4 resContext, zurt requestUrl, f7l8 parser) {
        super(context);
        this.f61470ki = resContext;
        this.f61471t8r = requestUrl;
        this.f17093i = parser;
        m4530h();
    }

    @Override // androidx.loader.content.AbstractC0959k, androidx.loader.content.zy
    protected void cdj() {
        C2789j.m9826k(f61469fn3e, "start loading %s", this.f61470ki.getResourceCode());
        super.cdj();
    }

    @Override // androidx.loader.content.zy
    /* JADX INFO: renamed from: i */
    protected void mo4527i() {
        super.mo4527i();
        toq();
    }

    @Override // androidx.loader.content.AbstractC0959k
    public void jk() {
        super.jk();
        C2789j.m9826k(f61469fn3e, "on canceled.", new Object[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.loader.content.AbstractC0959k
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public UIResult d3() {
        T t2;
        CommonResponse commonResponseMo7476p = C2082k.zy().m8001n().ld6(this.f61470ki).m7690k().mo7476p(this.f61471t8r, true, UIPage.class);
        if (commonResponseMo7476p == null || commonResponseMo7476p.apiCode != 0 || (t2 = commonResponseMo7476p.apiData) == 0 || ((UIPage) t2).cards == null) {
            return null;
        }
        List<UIElement> listM10150k = this.f17093i.m10150k(((UIPage) t2).cards);
        T t3 = commonResponseMo7476p.apiData;
        return new UIResult(listM10150k, ((UIPage) t3).hasMore, ((UIPage) t3).category, -1, ((UIPage) t3).adTagIds, ((UIPage) t3).uuid);
    }

    @Override // androidx.loader.content.zy
    protected void t8r() {
        super.t8r();
        if (wvg()) {
            m4537y();
        }
    }
}
