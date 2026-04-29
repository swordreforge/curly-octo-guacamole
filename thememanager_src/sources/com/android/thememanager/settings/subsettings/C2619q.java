package com.android.thememanager.settings.subsettings;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.ActivityC0891q;
import androidx.recyclerview.widget.RecyclerView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.base.C1718n;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.android.thememanager.basemodule.resource.model.PathEntry;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.resource.model.ResourceInfo;
import com.android.thememanager.basemodule.utils.hyr;
import com.android.thememanager.detail.video.model.RemoteVideoResource;
import com.android.thememanager.router.detail.entity.VideoInfo;
import com.android.thememanager.router.detail.entity.VideoInfoUtils;
import i1.C6077k;
import java.util.ArrayList;
import java.util.List;
import p001b.InterfaceC1357q;
import zy.dd;
import zy.lvui;

/* JADX INFO: renamed from: com.android.thememanager.settings.subsettings.q */
/* JADX INFO: compiled from: OneImageViewHolder.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2619q extends RecyclerView.fti implements InterfaceC2616k, com.android.thememanager.basemodule.analysis.toq {

    /* JADX INFO: renamed from: g */
    private final ImageView f15477g;

    /* JADX INFO: renamed from: h */
    private float f15478h;

    /* JADX INFO: renamed from: k */
    private final ImageView f15479k;

    /* JADX INFO: renamed from: n */
    private final ImageView f15480n;

    /* JADX INFO: renamed from: p */
    private boolean f15481p;

    /* JADX INFO: renamed from: q */
    private final ImageView f15482q;

    /* JADX INFO: renamed from: s */
    private String f15483s;

    /* JADX INFO: renamed from: y */
    private final C1718n f15484y;

    C2619q(View view, C1718n helper, boolean isNightMode, float imageScalingFactor) {
        super(view);
        this.f15481p = isNightMode;
        this.f15484y = helper;
        this.f15478h = imageScalingFactor;
        this.f15479k = (ImageView) view.findViewById(R.id.thumbnail);
        this.f15482q = (ImageView) view.findViewById(R.id.flag_type);
        this.f15480n = (ImageView) view.findViewById(R.id.flag_cloud);
        this.f15477g = (ImageView) view.findViewById(R.id.flag_mode);
        C6077k.o1t(view);
    }

    private void fn3e(Resource item, List<Resource> list, int type, ActivityC0891q activity) {
        boolean zWvg = wvg(item);
        List<Resource> listNi7 = ni7(list, zWvg, type, item);
        int iIndexOf = listNi7.indexOf(item);
        if (this.f15484y.m6718q()) {
            com.android.thememanager.x2.f17856k.m10531k().toq(listNi7.get(iIndexOf), zWvg, activity);
            return;
        }
        if (zWvg) {
            Intent intentT8r = com.android.thememanager.v9.f7l8.t8r(activity, VideoInfoUtils.fromResourceList(listNi7), iIndexOf);
            com.android.thememanager.basemodule.analysis.f7l8.m6612q(intentT8r, com.android.thememanager.basemodule.analysis.toq.nr0);
            com.android.thememanager.basemodule.analysis.f7l8.zy(intentT8r, "personalize");
            activity.startActivity(intentT8r);
        } else {
            Intent intentMcp = com.android.thememanager.toq.mcp(activity, listNi7, com.android.thememanager.basemodule.analysis.toq.npjo);
            intentMcp.addFlags(536870912);
            intentMcp.putExtra(InterfaceC1357q.f53879gvn7, iIndexOf);
            intentMcp.putExtra(InterfaceC1357q.f53965y2, type == 4 ? 2 : 1);
            if (type == 1) {
                intentMcp.putExtra(InterfaceC1357q.f53851c8jq, true);
            }
            activity.startActivity(intentMcp);
        }
        if (TextUtils.isEmpty(this.f15483s)) {
            return;
        }
        this.f15484y.zy().d8wk(this.f15483s, String.valueOf(iIndexOf));
    }

    @dd
    private String fu4(@lvui Resource resource) {
        PathEntry pathEntry;
        if (resource.getThumbnails().size() <= 0 || (pathEntry = resource.getThumbnails().get(0)) == null) {
            return null;
        }
        return TextUtils.isEmpty(pathEntry.getOnlinePath()) ? pathEntry.getLocalPath() : pathEntry.getOnlinePath();
    }

    private void jk(int wallpaper_type, Resource item, boolean supportDarkMode) {
        int i2 = R.drawable.wallpaper_setting_item_type_motion_icon;
        if (wallpaper_type != 2) {
            if (wallpaper_type != 8) {
                this.f15480n.setVisibility(8);
                this.f15482q.setVisibility(8);
                this.f15477g.setVisibility(8);
                return;
            } else if (!(!"wallpaper".equalsIgnoreCase(item.getCategory()))) {
                this.f15482q.setVisibility(8);
                return;
            } else {
                this.f15482q.setImageResource(R.drawable.wallpaper_setting_item_type_motion_icon);
                this.f15482q.setVisibility(0);
                return;
            }
        }
        mcp(wallpaper_type, item);
        boolean z2 = !"wallpaper".equalsIgnoreCase(item.getCategory());
        boolean zEqualsIgnoreCase = InterfaceC1789q.y6.equalsIgnoreCase(item.getCategory());
        if (z2) {
            ImageView imageView = this.f15482q;
            if (zEqualsIgnoreCase) {
                i2 = R.drawable.ic_typeicon_single_24h;
            }
            imageView.setImageResource(i2);
            this.f15482q.setVisibility(0);
        } else {
            this.f15482q.setVisibility(8);
        }
        this.f15477g.setVisibility(supportDarkMode ? 0 : 8);
    }

    private List<Resource> ni7(List<Resource> list, boolean isVideo, int type, Resource currentItem) {
        ArrayList arrayList = new ArrayList();
        if ((currentItem != null ? list.indexOf(currentItem) : -1) > 0 && type == 1) {
            arrayList.add(currentItem);
            return arrayList;
        }
        for (Resource resource : list) {
            if (resource != null && isVideo == wvg(resource)) {
                arrayList.add(resource);
            }
        }
        return arrayList;
    }

    private boolean o1t(Resource resource) {
        if ("wallpaper".equals(resource.getCategory())) {
            return true;
        }
        VideoInfo videoInfoFromResource = VideoInfoUtils.fromResource(resource);
        return new RemoteVideoResource(videoInfoFromResource.path, videoInfoFromResource.previewPath, videoInfoFromResource.name, videoInfoFromResource.onlineId, videoInfoFromResource.sizeBytes, hyr.zy(",", videoInfoFromResource.innerTags)).isDownloaded();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public /* synthetic */ void m9180t(Resource resource, List list, int i2, ActivityC0891q activityC0891q, View view) {
        fn3e(resource, list, i2, activityC0891q);
    }

    public static boolean wvg(Resource resource) {
        if (!TextUtils.isEmpty(resource.getCategory())) {
            return !"wallpaper".equals(resource.getCategory());
        }
        String contentPath = resource.getContentPath();
        String onlinePath = resource.getOnlinePath();
        if ((onlinePath == null || !onlinePath.endsWith("mp4")) && !resource.hasVideo() && TextUtils.isEmpty(resource.getDownloadPath())) {
            return contentPath != null && (contentPath.endsWith("mp4") || contentPath.contains(".video"));
        }
        return true;
    }

    @dd
    /* JADX INFO: renamed from: z */
    private String m9181z(int type, @lvui Resource r2) {
        if (type != 4) {
            String contentPath = r2.getContentPath();
            return TextUtils.isEmpty(contentPath) ? r2.getOnlineId() : contentPath;
        }
        ResourceInfo onlineInfo = r2.getOnlineInfo();
        if (onlineInfo != null) {
            return TextUtils.isEmpty(onlineInfo.getTrackId()) ? r2.getOnlineId() : onlineInfo.getTrackId();
        }
        return null;
    }

    public void mcp(int wallpaperType, Resource item) {
        this.f15480n.setVisibility(!TextUtils.isEmpty(item.getContentPath()) || o1t(item) ? 8 : 0);
    }

    @Override // com.android.thememanager.settings.subsettings.InterfaceC2616k
    /* JADX INFO: renamed from: n */
    public void mo9024n() {
        if (TextUtils.isEmpty(this.f15483s)) {
            return;
        }
        this.f15484y.zy().n5r1(this.f15483s);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void oc(final int r17, final java.util.List<com.android.thememanager.basemodule.resource.model.Resource> r18, int r19) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.settings.subsettings.C2619q.oc(int, java.util.List, int):void");
    }

    @Override // com.android.thememanager.settings.subsettings.InterfaceC2616k
    public void zy() {
        if (TextUtils.isEmpty(this.f15483s)) {
            return;
        }
        this.f15484y.zy().ncyb(this.f15483s);
    }
}
