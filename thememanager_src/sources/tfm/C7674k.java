package tfm;

import java.io.Serializable;
import qo.C7618k;

/* JADX INFO: renamed from: tfm.k */
/* JADX INFO: compiled from: Information.java */
/* JADX INFO: loaded from: classes2.dex */
public class C7674k implements Serializable {
    private static final long serialVersionUID = 1;
    public String cmUrl;
    public String conditionIds;
    public String content;
    public String dislikeUrl;

    @e5.zy("imgId")
    public String imageId;
    public String imageUrl;

    @e5.zy("isLike")
    public boolean isLiked;

    @e5.zy("likeNum")
    public int likeNumber;
    public String likeUrl;
    public k link;
    public String title;
    public String tvmUrl;
    public boolean visible;

    /* JADX INFO: renamed from: tfm.k$k */
    /* JADX INFO: compiled from: Information.java */
    public static class k implements Serializable {
        private static final long serialVersionUID = 1;
        public String adTagId;
        public String eid;
        public String link;
        public String productType;
        public String title;
        public String traceId;
        public String trackId;
        public String type;
    }

    public C7618k toInformationModel() {
        String str = com.android.thememanager.maml.model.toq.f12616s + this.imageId;
        String str2 = this.imageUrl;
        C7618k c7618k = new C7618k();
        c7618k.imageId = this.imageId;
        c7618k.title = this.title;
        c7618k.content = this.content;
        c7618k.cmUrl = this.cmUrl;
        c7618k.tvmUrl = this.tvmUrl;
        c7618k.likeUrl = this.likeUrl;
        c7618k.dislikeUrl = this.dislikeUrl;
        c7618k.imageLocalPath = str;
        c7618k.imageOnlineUrl = str2;
        c7618k.isLiked = this.isLiked;
        c7618k.likeNumber = this.likeNumber;
        k kVar = this.link;
        if (kVar != null) {
            c7618k.detail = kVar.title;
            c7618k.url = kVar.link;
        }
        return c7618k;
    }
}
