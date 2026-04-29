package com.android.thememanager.comment.view.fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.async.AbstractC1712k;
import com.android.thememanager.basemodule.network.theme.model.CommonResponse;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.utils.kja0;
import com.android.thememanager.basemodule.views.ItemOrderLayout;
import com.android.thememanager.comment.model.CommentRequestInterface;
import com.android.thememanager.comment.model.ResourceComment;
import com.android.thememanager.comment.model.ResourceCommentGroup;
import com.android.thememanager.comment.view.activity.ResourceCommentsActivity;
import com.android.thememanager.router.detail.entity.ResourceCommentItem;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import retrofit2.C7639i;

/* JADX INFO: compiled from: ResourceCommentsAdapter.java */
/* JADX INFO: loaded from: classes2.dex */
public class ld6 extends AbstractC1712k<ResourceCommentGroup> {

    /* JADX INFO: renamed from: e */
    private WeakReference<ResourceCommentsActivity> f10763e;

    /* JADX INFO: renamed from: j */
    private WeakReference<n7h> f10764j;

    /* JADX INFO: renamed from: m */
    private Resource f10765m;

    /* JADX INFO: renamed from: o */
    private ResourceComment f10766o;

    /* JADX INFO: compiled from: ResourceCommentsAdapter.java */
    private static class toq extends AbstractC1712k.q<ResourceCommentGroup> {

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        private long f57890ld6;

        private toq() {
        }

        private boolean cdj() {
            return Long.MAX_VALUE == this.f57890ld6;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.android.thememanager.basemodule.async.AbstractC1712k.q, com.android.thememanager.basemodule.async.AbstractAsyncTaskC1714q, android.os.AsyncTask
        /* JADX INFO: renamed from: p */
        public void onPostExecute(List<ResourceCommentGroup> result) {
            super.onPostExecute(result);
            WeakReference<AbstractC1712k> weakReference = this.f9829g;
            ld6 ld6Var = weakReference != null ? (ld6) weakReference.get() : null;
            if (ld6Var == null) {
                return;
            }
            toq((com.android.thememanager.basemodule.async.toq) ld6Var.f10764j.get());
            ResourceCommentsActivity resourceCommentsActivityLvui = ld6Var.lvui();
            if (C1819o.eqxt(resourceCommentsActivityLvui) && cdj()) {
                resourceCommentsActivityLvui.sok();
            }
        }

        @Override // com.android.thememanager.basemodule.async.AbstractC1712k.q
        /* JADX INFO: renamed from: s */
        protected List<ResourceCommentGroup> mo6404s(AbstractC1712k.n params) {
            WeakReference<AbstractC1712k> weakReference = this.f9829g;
            ld6 ld6Var = weakReference != null ? (ld6) weakReference.get() : null;
            if (ld6Var == null || ld6Var.lvui() == null) {
                return null;
            }
            if (ld6Var.m7437r() != null && !ld6Var.m7437r().hasMore) {
                return null;
            }
            this.f57890ld6 = ld6Var.m7437r() == null ? Long.MAX_VALUE : ld6Var.m7437r().maxUpdateTime;
            try {
                C7639i<CommonResponse<ResourceComment>> c7639iF7l8 = ((CommentRequestInterface) com.android.thememanager.basemodule.network.theme.f7l8.m6882h().qrj(CommentRequestInterface.class)).getComments(ld6Var.dd().getOnlineId(), this.f57890ld6).f7l8();
                if (com.android.thememanager.basemodule.network.theme.toq.m6892k(c7639iF7l8)) {
                    ld6Var.x9kr(c7639iF7l8.m27986k().apiData);
                    if (cdj() && ld6Var.m7437r().commentOverview != null) {
                        com.android.thememanager.comment.util.zy.m7426g(ld6Var.m7437r().commentOverview, ld6Var.dd());
                    }
                    a98o.zy zyVar = new a98o.zy();
                    List<ResourceCommentGroup> list = ld6Var.m7437r().topComments;
                    boolean z2 = true;
                    if (cdj() && !kja0.qrj(list)) {
                        zyVar.addAll(list);
                        list.get(0).main.isWonderfulFirst = true;
                    }
                    List<ResourceCommentGroup> list2 = ld6Var.m7437r().comments;
                    if (!kja0.qrj(list2)) {
                        zyVar.addAll(list2);
                        if (cdj()) {
                            list2.get(0).main.isAllFirst = true;
                        }
                    }
                    if (ld6Var.m7437r().hasMore) {
                        z2 = false;
                    }
                    zyVar.setLast(z2);
                    return zyVar;
                }
            } catch (IOException e2) {
                e2.printStackTrace();
            }
            return null;
        }
    }

    public ld6(ResourceCommentsActivity activity, n7h fragment, Resource resource) {
        this.f10763e = new WeakReference<>(activity);
        this.f10764j = new WeakReference<>(fragment);
        this.f10765m = resource;
        fti(2);
    }

    public Resource dd() {
        return this.f10765m;
    }

    @Override // com.android.thememanager.basemodule.async.AbstractC1712k
    protected List<AbstractC1712k.q> ki() {
        ArrayList arrayList = new ArrayList();
        n7h n7hVar = this.f10764j.get();
        if (n7hVar != null) {
            toq toqVar = new toq();
            toqVar.n7h(true);
            toqVar.m6700k(n7hVar);
            toqVar.qrj(this);
            arrayList.add(toqVar);
        }
        return arrayList;
    }

    public ResourceCommentsActivity lvui() {
        WeakReference<ResourceCommentsActivity> weakReference = this.f10763e;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* JADX INFO: renamed from: r */
    public ResourceComment m7437r() {
        return this.f10766o;
    }

    @Override // com.android.thememanager.basemodule.async.AbstractC1712k
    protected View toq(View view, List<ResourceCommentGroup> data, int position, int groupPos, int group) {
        int dimensionPixelSize;
        int i2;
        ResourceCommentsActivity resourceCommentsActivity = this.f10763e.get();
        String string = null;
        if (view == null) {
            view = LayoutInflater.from(resourceCommentsActivity).inflate(R.layout.resource_comment_list_item, (ViewGroup) null, false);
            ItemOrderLayout itemOrderLayout = (ItemOrderLayout) view.findViewById(R.id.tags);
            itemOrderLayout.setItemFactory(new com.android.thememanager.comment.util.toq(resourceCommentsActivity));
            itemOrderLayout.setGap(resourceCommentsActivity.getResources().getDimensionPixelSize(R.dimen.de_hot_recommend_text_gap));
        }
        ResourceCommentGroup resourceCommentGroup = data.get(0);
        TextView textView = (TextView) view.findViewById(R.id.title);
        View viewFindViewById = view.findViewById(R.id.container);
        View viewFindViewById2 = view.findViewById(R.id.divider);
        ResourceCommentItem resourceCommentItem = resourceCommentGroup.main;
        int i3 = 8;
        if (resourceCommentItem.isWonderfulFirst) {
            string = resourceCommentsActivity.getResources().getString(R.string.resource_comment_wonderful_comments);
            dimensionPixelSize = 0;
            i2 = 0;
            i3 = 0;
        } else if (resourceCommentItem.isAllFirst) {
            int dimensionPixelSize2 = resourceCommentsActivity.getResources().getDimensionPixelSize(R.dimen.de_comment_list_padding_bottom);
            i2 = 8;
            i3 = 0;
            string = resourceCommentsActivity.getResources().getString(R.string.resource_comment_all_comments);
            dimensionPixelSize = dimensionPixelSize2;
        } else {
            dimensionPixelSize = resourceCommentsActivity.getResources().getDimensionPixelSize(R.dimen.de_comment_list_padding_bottom);
            i2 = 8;
        }
        textView.setVisibility(i3);
        if (string != null) {
            textView.setText(string);
        }
        viewFindViewById2.setVisibility(i2);
        viewFindViewById.setPadding(0, 0, 0, dimensionPixelSize);
        C1893p.m7438k(view, resourceCommentGroup, this.f10765m, this.f10764j.get());
        return view;
    }

    public void x9kr(ResourceComment mComment) {
        this.f10766o = mComment;
    }
}
