package com.android.thememanager.comment.presenter;

import android.os.AsyncTask;
import android.util.Pair;
import com.android.thememanager.basemodule.network.theme.f7l8;
import com.android.thememanager.basemodule.network.theme.model.CommonResponse;
import com.android.thememanager.basemodule.network.theme.toq;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.comment.model.CommentRequestInterface;
import com.android.thememanager.comment.model.LikeCommentResult;
import com.android.thememanager.comment.model.ResourceCommentGroup;
import com.android.thememanager.router.detail.entity.ResourceCommentItem;
import ek5k.C6002g;
import java.io.IOException;
import java.lang.ref.WeakReference;
import lv5.InterfaceC6781k;
import retrofit2.C7639i;
import zy.lvui;

/* JADX INFO: renamed from: com.android.thememanager.comment.presenter.k */
/* JADX INFO: compiled from: CommentPresenter.java */
/* JADX INFO: loaded from: classes2.dex */
public class C1878k implements InterfaceC6781k.k {

    /* JADX INFO: renamed from: k */
    private InterfaceC6781k.toq f10674k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private InterfaceC6781k.k.InterfaceC8092k f57873toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private k f57874zy;

    /* JADX INFO: renamed from: com.android.thememanager.comment.presenter.k$k */
    /* JADX INFO: compiled from: CommentPresenter.java */
    private static class k extends AsyncTask<String, Void, Pair<Boolean, Integer>> {

        /* JADX INFO: renamed from: k */
        private WeakReference<InterfaceC6781k.toq> f10675k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private ResourceCommentItem f57875toq;

        public k(InterfaceC6781k.toq view, ResourceCommentItem commentItem) {
            this.f10675k = new WeakReference<>(view);
            this.f57875toq = commentItem;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Pair<Boolean, Integer> doInBackground(String... params) {
            try {
                C7639i<CommonResponse<LikeCommentResult>> c7639iF7l8 = ((CommentRequestInterface) f7l8.m6882h().qrj(CommentRequestInterface.class)).likeComment(params[0], params[1], true ^ this.f57875toq.like.booleanValue()).f7l8();
                if (toq.m6892k(c7639iF7l8)) {
                    return new Pair<>(Boolean.valueOf(c7639iF7l8.m27986k().apiData.like), Integer.valueOf(c7639iF7l8.m27986k().apiData.likeCount));
                }
                return null;
            } catch (IOException unused) {
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Pair<Boolean, Integer> result) {
            InterfaceC6781k.toq toqVar = this.f10675k.get();
            if (toqVar == null || result == null) {
                return;
            }
            toqVar.toq(((Boolean) result.first).booleanValue(), ((Integer) result.second).intValue());
            ResourceCommentItem resourceCommentItem = this.f57875toq;
            resourceCommentItem.like = (Boolean) result.first;
            resourceCommentItem.likeCount = (Integer) result.second;
        }
    }

    public C1878k(InterfaceC6781k.toq view) {
        this.f10674k = view;
    }

    @Override // lv5.InterfaceC6781k.k
    /* JADX INFO: renamed from: k */
    public void mo7414k(@lvui ResourceCommentItem commentItem, @lvui Resource resource) {
        k kVar = this.f57874zy;
        if (kVar != null && kVar.getStatus() != AsyncTask.Status.FINISHED) {
            this.f57874zy.cancel(true);
        }
        k kVar2 = new k(this.f10674k, commentItem);
        this.f57874zy = kVar2;
        kVar2.executeOnExecutor(C6002g.x2(), resource.getOnlineId(), String.valueOf(commentItem.commentId));
    }

    @Override // lv5.InterfaceC6781k.k
    /* JADX INFO: renamed from: q */
    public void mo7415q(@lvui ResourceCommentItem commentItem) {
        InterfaceC6781k.k.InterfaceC8092k interfaceC8092k = this.f57873toq;
        if (interfaceC8092k != null) {
            interfaceC8092k.nmn5(commentItem);
        }
    }

    @Override // lv5.InterfaceC6781k.k
    public void toq(@lvui ResourceCommentGroup commentGroup, @lvui InterfaceC6781k.toq view) {
        InterfaceC6781k.k.InterfaceC8092k interfaceC8092k = this.f57873toq;
        if (interfaceC8092k != null) {
            interfaceC8092k.zsr0(commentGroup, view);
        }
    }

    @Override // lv5.InterfaceC6781k.k
    public void zy(InterfaceC6781k.k.InterfaceC8092k listener) {
        this.f57873toq = listener;
    }
}
