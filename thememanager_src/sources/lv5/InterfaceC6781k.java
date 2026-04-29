package lv5;

import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.comment.model.ResourceCommentGroup;
import com.android.thememanager.router.detail.entity.ResourceCommentItem;
import zy.lvui;

/* JADX INFO: renamed from: lv5.k */
/* JADX INFO: compiled from: ResourceCommentContract.java */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC6781k {

    /* JADX INFO: renamed from: lv5.k$k */
    /* JADX INFO: compiled from: ResourceCommentContract.java */
    public interface k {

        /* JADX INFO: renamed from: lv5.k$k$k, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ResourceCommentContract.java */
        public interface InterfaceC8092k {
            void nmn5(@lvui ResourceCommentItem commentItem);

            void zsr0(@lvui ResourceCommentGroup commentGroup, @lvui toq view);
        }

        /* JADX INFO: renamed from: k */
        void mo7414k(@lvui ResourceCommentItem commentItem, @lvui Resource resource);

        /* JADX INFO: renamed from: q */
        void mo7415q(@lvui ResourceCommentItem commentItem);

        void toq(@lvui ResourceCommentGroup commentGroup, @lvui toq view);

        void zy(InterfaceC8092k listener);
    }

    /* JADX INFO: renamed from: lv5.k$toq */
    /* JADX INFO: compiled from: ResourceCommentContract.java */
    public interface toq {
        /* JADX INFO: renamed from: g */
        void mo7434g(@lvui ResourceCommentGroup commentGroup);

        /* JADX INFO: renamed from: h */
        void mo7436h(@lvui k presenter);

        void toq(boolean isLike, int likeCount);
    }
}
