package com.android.thememanager.controller.online;

import android.app.Activity;
import android.view.View;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.account.C1688q;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.nn86;
import com.android.thememanager.controller.online.AbstractC1918k;
import com.android.thememanager.controller.online.wvg;
import com.android.thememanager.detail.widget.LikeCountBubble;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: compiled from: WallpaperDetailTask.java */
/* JADX INFO: loaded from: classes2.dex */
public class mcp implements InterfaceC1925p, com.android.thememanager.basemodule.analysis.toq {

    /* JADX INFO: renamed from: g */
    private AbstractC1918k.k<Boolean> f10946g;

    /* JADX INFO: renamed from: k */
    private String f10947k;

    /* JADX INFO: renamed from: n */
    private boolean f10948n;

    /* JADX INFO: renamed from: q */
    private boolean f10949q;

    /* JADX INFO: renamed from: s */
    private zy f10950s;

    /* JADX INFO: renamed from: y */
    private AbstractC1918k.k<List<wvg.toq>> f10951y;

    /* JADX INFO: renamed from: com.android.thememanager.controller.online.mcp$k */
    /* JADX INFO: compiled from: WallpaperDetailTask.java */
    class C1920k implements C1688q.n {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ WeakReference f10953k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ com.android.thememanager.fu4 f10954n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ Activity f10955q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ Resource f57947toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        final /* synthetic */ String f57948zy;

        /* JADX INFO: renamed from: com.android.thememanager.controller.online.mcp$k$k */
        /* JADX INFO: compiled from: WallpaperDetailTask.java */
        class k implements AbstractC1918k.k<Boolean> {
            k() {
            }

            @Override // com.android.thememanager.controller.online.AbstractC1918k.k
            /* JADX INFO: renamed from: k */
            public void mo6418k() {
                mcp.this.f10949q = true;
            }

            @Override // com.android.thememanager.controller.online.AbstractC1918k.k
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public void zy(Boolean result) {
                mcp.this.f10949q = false;
                if (result.booleanValue()) {
                    boolean zContains = EnumC1933t.FAVORITE.contains(C1920k.this.f57947toq);
                    if (mcp.this.f10950s != null) {
                        mcp.this.f10950s.cdj(zContains);
                        return;
                    }
                    View view = (View) C1920k.this.f10953k.get();
                    if (view != null) {
                        view.setSelected(zContains);
                    }
                    String str = zContains ? "FAVOURITE" : "DIS_FAVOURITE";
                    C1920k c1920k = C1920k.this;
                    com.android.thememanager.basemodule.analysis.kja0.m6641s(str, c1920k.f57948zy, c1920k.f57947toq.getOnlineInfo().getTrackId(), null);
                    C1708s.toq toqVarLd6 = C1708s.f7l8().ld6();
                    String str2 = zContains ? "FAVOURITE" : "DIS_FAVOURITE";
                    C1920k c1920k2 = C1920k.this;
                    toqVarLd6.n5r1(str2, C1706p.kja0(c1920k2.f57948zy, c1920k2.f57947toq.getOnlineInfo().getTrackId(), ""));
                }
            }

            @Override // com.android.thememanager.controller.online.AbstractC1918k.k
            public Resource[] toq() {
                return new Resource[]{C1920k.this.f57947toq};
            }
        }

        C1920k(final WeakReference val$refView, final Resource val$cloneResource, final String val$pageId, final Activity val$activity, final com.android.thememanager.fu4 val$resContext) {
            this.f10953k = val$refView;
            this.f57947toq = val$cloneResource;
            this.f57948zy = val$pageId;
            this.f10955q = val$activity;
            this.f10954n = val$resContext;
        }

        @Override // com.android.thememanager.basemodule.account.C1688q.n
        public void loginFail(C1688q.g loginError) {
        }

        @Override // com.android.thememanager.basemodule.account.C1688q.n
        public void loginSuccess() {
            boolean z2 = ((View) this.f10953k.get()) != null ? !r0.isSelected() : false;
            mcp.this.f10946g = new k();
            o1t.zy().m7604n(z2, this.f10955q, this.f10954n, mcp.this.f10946g);
        }
    }

    /* JADX INFO: compiled from: WallpaperDetailTask.java */
    class toq implements C1688q.n {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ View f10958k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ Activity f10959n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ String f10960q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ Resource f57949toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        final /* synthetic */ LikeCountBubble f57950zy;

        /* JADX INFO: renamed from: com.android.thememanager.controller.online.mcp$toq$k */
        /* JADX INFO: compiled from: WallpaperDetailTask.java */
        class C1921k implements AbstractC1918k.k<List<wvg.toq>> {
            C1921k() {
            }

            @Override // com.android.thememanager.controller.online.AbstractC1918k.k
            /* JADX INFO: renamed from: k */
            public void mo6418k() {
                mcp.this.f10948n = true;
            }

            @Override // com.android.thememanager.controller.online.AbstractC1918k.k
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public void zy(List<wvg.toq> results) {
                mcp.this.f10948n = false;
                if (results.size() > 0) {
                    if (mcp.this.f10950s != null) {
                        mcp.this.f10950s.mo7596c(results.get(0));
                        return;
                    }
                    boolean zContains = EnumC1933t.LIKE.contains(toq.this.f57949toq);
                    toq.this.f10958k.setSelected(zContains);
                    LikeCountBubble likeCountBubble = toq.this.f57950zy;
                    if (likeCountBubble != null) {
                        likeCountBubble.setCount(zContains, results.get(0).f57970zy);
                    }
                    toq.this.f57949toq.setLike(Boolean.valueOf(zContains));
                    toq.this.f57949toq.setLikeCount(Integer.valueOf(results.get(0).f57970zy));
                    String str = zContains ? "LIKE" : "DIS_LIKE";
                    toq toqVar = toq.this;
                    com.android.thememanager.basemodule.analysis.kja0.m6641s(str, toqVar.f10960q, toqVar.f57949toq.getOnlineInfo().getTrackId(), null);
                    C1708s.toq toqVarLd6 = C1708s.f7l8().ld6();
                    toq toqVar2 = toq.this;
                    toqVarLd6.n5r1(str, C1706p.kja0(toqVar2.f10960q, toqVar2.f57949toq.getOnlineInfo().getTrackId(), ""));
                }
            }

            @Override // com.android.thememanager.controller.online.AbstractC1918k.k
            public Resource[] toq() {
                return new Resource[]{toq.this.f57949toq};
            }
        }

        toq(final View val$like, final Resource val$resource, final LikeCountBubble val$likeCount, final String val$pageId, final Activity val$activity) {
            this.f10958k = val$like;
            this.f57949toq = val$resource;
            this.f57950zy = val$likeCount;
            this.f10960q = val$pageId;
            this.f10959n = val$activity;
        }

        @Override // com.android.thememanager.basemodule.account.C1688q.n
        public void loginFail(C1688q.g loginError) {
        }

        @Override // com.android.thememanager.basemodule.account.C1688q.n
        public void loginSuccess() {
            boolean z2 = !this.f10958k.isSelected();
            mcp.this.f10951y = new C1921k();
            wvg.zy().m7637q(z2, this.f10959n, mcp.this.f10951y);
        }
    }

    /* JADX INFO: compiled from: WallpaperDetailTask.java */
    public interface zy {
        /* JADX INFO: renamed from: c */
        void mo7596c(wvg.toq result);

        void cdj(boolean result);
    }

    public mcp(String sourceType) {
        this.f10947k = sourceType;
    }

    public void ld6() {
        this.f10950s = null;
    }

    /* JADX INFO: renamed from: p */
    public void m7591p(zy favoriteCallback) {
        this.f10950s = favoriteCallback;
    }

    /* JADX INFO: renamed from: s */
    public void m7592s(final Activity activity, final View like, final LikeCountBubble likeCount, final Resource resource, final String pageId) {
        if (this.f10948n) {
            return;
        }
        if (C1915g.m7550n()) {
            C1688q.cdj().fti(activity, new toq(like, resource, likeCount, pageId, activity));
        } else {
            nn86.m7150k(R.string.online_no_network, 0);
        }
    }

    /* JADX INFO: renamed from: y */
    public void m7593y(final Activity activity, final View view, final com.android.thememanager.fu4 resContext, Resource resource, final String pageId) {
        if (this.f10949q) {
            return;
        }
        if (!C1915g.m7550n()) {
            nn86.m7150k(R.string.online_no_network, 0);
            return;
        }
        C1688q.cdj().fti(activity, new C1920k(new WeakReference(view), resource.m28251clone(), pageId, activity, resContext));
    }
}
