package com.android.thememanager.detail.theme.model;

import android.graphics.BitmapFactory;
import android.text.TextUtils;
import com.android.thememanager.basemodule.resource.C1791k;
import com.android.thememanager.basemodule.resource.C1792n;
import com.android.thememanager.basemodule.resource.C1795s;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.android.thememanager.basemodule.resource.model.PathEntry;
import com.android.thememanager.basemodule.resource.model.RelatedResource;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.resource.model.ResourceLocalProperties;
import com.android.thememanager.basemodule.utils.ki;
import com.android.thememanager.basemodule.utils.kja0;
import com.android.thememanager.basemodule.utils.y9n;
import com.android.thememanager.network.entity.WidgetPreviewInfo;
import com.android.thememanager.router.detail.entity.ResourceCommentItem;
import com.android.thememanager.router.detail.entity.RewardData;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p001b.InterfaceC1356n;
import p001b.toq;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class OnlineResourceDetail implements Serializable {
    private static final long serialVersionUID = 1;
    public String adEid;
    public String adInfo;
    public List<String> adTagIds;
    public String adTrackId;
    public Integer adaptedIconsCount;
    public float averageScore;
    public String bigVideoUrl;
    public boolean bought;
    public boolean canTrial;
    public String category;
    public boolean classicReprint;
    public boolean collect;
    public ResourceCommentItem comment;
    public int commentCount;
    public String description;
    public String descriptionPic;
    public List<WidgetPreviewInfo> descriptionPics;
    public String designerIcon;
    public String designerId;
    public String designerMiId;
    public String designerName;
    public String downloadUrlRoot;
    public boolean enableIconMask;
    public int fansNum;
    public long fileSize;
    public boolean follow;
    public ArrayList<Integer> fontWeightList;
    public String frontCover;
    public String gifUrl;
    public boolean hasAod;
    public String imageUrl;
    public int isOfficialIcons;
    public String largeIconsUrl_1x1;
    public String largeIconsUrl_1x2;
    public String largeIconsUrl_2x1;
    public String largeIconsUrl_2x2;
    public boolean like;
    public Integer likeCount;
    public String moduleId;
    public String name;
    public int originPrice;
    public String packId;
    public int postCount;
    public int previewPriorityDisplayIdx;
    public int productCount;
    public String productId;
    public String productPackageName;
    public int productPrice;
    public String productType;
    public RewardData rewardData;
    public float score;
    public String shareUrl;
    public String smallVideoUrl;
    public String snapshotAspectRatio;
    public List<String> snapshotsUrl;
    public String status;
    public String tags;
    public String themeBoardLink;
    public String trackId;
    public String trialButtonTitle;
    public long trialTime;
    public int uiVersion;
    public List<UIUpdateLog> updateLogs;
    public String videoUrl;
    public String widgetDarkPreview;

    @dd
    public String widgetDeepLink;
    public String widgetPreview;
    public List<WidgetPreviewInfo> widgetPreviewInfos;
    public String widgetProductId;
    public String widgetSubjectId;

    public enum Status {
        ONLINE,
        OFFLINE,
        HIDDEN
    }

    private static void filterPreviews(OnlineResourceDetail detail, List<String> previews, @lvui Resource resource, @lvui String resourceCode) {
        if (kja0.qrj(previews)) {
            return;
        }
        if ("theme".equals(resourceCode)) {
            Iterator<RelatedResource> it = resource.getSubResources().iterator();
            while (it.hasNext()) {
                String resourceCode2 = it.next().getResourceCode();
                String strNi7 = toq.ni7(resourceCode2);
                if (!com.android.thememanager.basemodule.analysis.toq.lbeq.equals(strNi7) && !"framework".equals(strNi7) && !C1792n.m6947t(resource.getLocalPlatform(), strNi7)) {
                    String strM5743p = toq.m5743p(resourceCode2);
                    Iterator<String> it2 = previews.iterator();
                    while (it2.hasNext()) {
                        String next = it2.next();
                        if (next == null || next.contains(strM5743p)) {
                            it2.remove();
                        }
                    }
                }
            }
            for (String str : InterfaceC1789q.mkj5) {
                Iterator<String> it3 = previews.iterator();
                while (it3.hasNext()) {
                    String next2 = it3.next();
                    if (next2 == null || (next2.contains(str) && previews.size() > 1)) {
                        it3.remove();
                    }
                }
            }
            return;
        }
        if ("icons".equals(resourceCode)) {
            Iterator<String> it4 = previews.iterator();
            while (it4.hasNext()) {
                String next3 = it4.next();
                if (next3 == null || next3.contains(InterfaceC1789q.gm) || next3.contains(InterfaceC1789q.y9h3)) {
                    it4.remove();
                }
            }
            return;
        }
        if (!"largeicons".equals(resourceCode) || y9n.mcp(previews)) {
            return;
        }
        for (String str2 : previews) {
            if (detail.largeIconsUrl_1x1 == null && str2.contains(InterfaceC1356n.f7200k)) {
                detail.largeIconsUrl_1x1 = str2;
            } else if (detail.largeIconsUrl_2x1 == null && str2.contains(InterfaceC1356n.f53838toq)) {
                detail.largeIconsUrl_2x1 = str2;
            } else if (detail.largeIconsUrl_1x2 == null && str2.contains(InterfaceC1356n.f53839zy)) {
                detail.largeIconsUrl_1x2 = str2;
            } else if (detail.largeIconsUrl_2x2 == null && str2.contains(InterfaceC1356n.f7201q)) {
                detail.largeIconsUrl_2x2 = str2;
            } else if (detail.imageUrl == null && str2.contains(com.android.thememanager.basemodule.resource.constants.toq.pwca)) {
                detail.imageUrl = str2;
            }
        }
    }

    public static OnlineResourceDetail fromResource(@lvui Resource resource, @lvui String str) {
        OnlineResourceDetail onlineResourceDetail = new OnlineResourceDetail();
        onlineResourceDetail.name = resource.getTitle();
        onlineResourceDetail.productId = resource.getProductId();
        onlineResourceDetail.packId = resource.getOnlineId();
        onlineResourceDetail.status = (resource.isOnShelf() ? Status.ONLINE : Status.OFFLINE).name();
        onlineResourceDetail.category = resource.getCategory();
        onlineResourceDetail.fontWeightList = resource.getFontWeightList();
        if (TextUtils.isEmpty(onlineResourceDetail.category)) {
            onlineResourceDetail.category = toq.n7h(str);
        }
        onlineResourceDetail.uiVersion = resource.getLocalInfo().getPlatform();
        onlineResourceDetail.trialTime = resource.getTrialTime();
        onlineResourceDetail.tags = resource.getLocalInfo().getTags();
        onlineResourceDetail.description = resource.getLocalInfo().getDescription();
        onlineResourceDetail.averageScore = resource.getScore();
        onlineResourceDetail.designerName = resource.getLocalInfo().getDesigner();
        int i2 = 0;
        onlineResourceDetail.hasAod = C1792n.ni7(resource, "aod") || C1792n.ni7(resource, "spaod");
        onlineResourceDetail.adaptedIconsCount = resource.getIconsCount();
        onlineResourceDetail.snapshotsUrl = new C1795s(resource, C1791k.getInstance(str)).m6969q();
        onlineResourceDetail.widgetSubjectId = resource.getWidgetSubjectId();
        onlineResourceDetail.widgetProductId = resource.getWidgetProductId();
        onlineResourceDetail.widgetDeepLink = resource.getOnlineInfo().getWidgetDeepLink();
        onlineResourceDetail.widgetPreview = resource.getWidgetPreview();
        onlineResourceDetail.widgetDarkPreview = resource.getWidgetDarkPreview();
        onlineResourceDetail.isOfficialIcons = resource.getLocalInfo().isOfficial() ? 1 : 0;
        onlineResourceDetail.productPackageName = resource.getLocalInfo().getLargeIconPackageName();
        if (resource.hasCheckBoughtStatus()) {
            onlineResourceDetail.bought = resource.isProductBought();
        }
        filterPreviews(onlineResourceDetail, onlineResourceDetail.snapshotsUrl, resource, str);
        if (!kja0.qrj(onlineResourceDetail.snapshotsUrl)) {
            if (ResourceLocalProperties.ResourceStorageType.SYSTEM == resource.getResourceStorageType() || ResourceLocalProperties.ResourceStorageType.PRECUST == resource.getResourceStorageType()) {
                onlineResourceDetail.snapshotAspectRatio = "1080:2340";
            } else {
                BitmapFactory.Options qVar = ki.toq(onlineResourceDetail.snapshotsUrl.get(0));
                if (qVar.outWidth != 0 && qVar.outHeight != 0) {
                    onlineResourceDetail.snapshotAspectRatio = qVar.outWidth + ":" + qVar.outHeight;
                }
            }
            while (true) {
                if (i2 >= onlineResourceDetail.snapshotsUrl.size()) {
                    break;
                }
                if (onlineResourceDetail.snapshotsUrl.get(i2).contains(com.android.thememanager.basemodule.resource.constants.toq.gj)) {
                    onlineResourceDetail.previewPriorityDisplayIdx = i2;
                    break;
                }
                i2++;
            }
        }
        return onlineResourceDetail;
    }

    public String getId() {
        String str = this.packId;
        return str != null ? str : this.moduleId;
    }

    public Resource toResource() {
        Resource resource = new Resource();
        resource.setOnlineId(this.packId);
        resource.setProductId(this.productId);
        resource.setAssemblyId(this.productId);
        resource.setOnShelf(!Status.OFFLINE.name().equals(this.status));
        resource.setOriginPrice(this.originPrice);
        resource.setProductPrice(this.productPrice);
        resource.setProductBought(this.bought);
        resource.setScore(this.averageScore);
        resource.setTrialTime(this.trialTime);
        resource.setCategory(this.category);
        resource.setIconsCount(this.adaptedIconsCount);
        resource.setFontWeightList(this.fontWeightList);
        resource.getOnlineInfo().setTitle(this.name);
        resource.getOnlineInfo().setPlatform(this.uiVersion);
        resource.getOnlineInfo().setDescription(this.description);
        resource.getOnlineInfo().setTags(this.tags);
        resource.getOnlineInfo().setWidgetSubjectId(this.widgetSubjectId);
        resource.getOnlineInfo().setWidgetProductId(this.widgetProductId);
        resource.getOnlineInfo().setWidgetDeepLink(this.widgetDeepLink);
        resource.getOnlineInfo().setWidgetPreview(this.widgetPreview);
        resource.getOnlineInfo().setWidgetDarkPreview(this.widgetDarkPreview);
        resource.getLocalInfo().setIsOfficial(this.isOfficialIcons == 1);
        resource.getLocalInfo().setLageIconPackageName(this.productPackageName);
        resource.getLocalInfo().setDesigner(this.designerName);
        if (!kja0.qrj(this.snapshotsUrl)) {
            ArrayList arrayList = new ArrayList(this.snapshotsUrl.size());
            for (String str : this.snapshotsUrl) {
                PathEntry pathEntry = new PathEntry();
                pathEntry.setOnlinePath(str);
                arrayList.add(pathEntry);
            }
            resource.setPreviews(arrayList);
        }
        if (this.productPackageName != null) {
            List<PathEntry> previews = resource.getPreviews();
            if (previews == null) {
                previews = new ArrayList<>();
            }
            if (this.largeIconsUrl_1x1 != null) {
                PathEntry pathEntry2 = new PathEntry();
                pathEntry2.setOnlinePath(this.largeIconsUrl_1x1);
                previews.add(pathEntry2);
            }
            if (this.largeIconsUrl_2x1 != null) {
                PathEntry pathEntry3 = new PathEntry();
                pathEntry3.setOnlinePath(this.largeIconsUrl_2x1);
                previews.add(pathEntry3);
            }
            if (this.largeIconsUrl_1x2 != null) {
                PathEntry pathEntry4 = new PathEntry();
                pathEntry4.setOnlinePath(this.largeIconsUrl_1x2);
                previews.add(pathEntry4);
            }
            if (this.largeIconsUrl_2x2 != null) {
                PathEntry pathEntry5 = new PathEntry();
                pathEntry5.setOnlinePath(this.largeIconsUrl_2x2);
                previews.add(pathEntry5);
            }
            resource.setPreviews(previews);
        }
        return resource;
    }
}
