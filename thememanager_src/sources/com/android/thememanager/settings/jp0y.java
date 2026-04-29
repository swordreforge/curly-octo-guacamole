package com.android.thememanager.settings;

import android.app.Activity;
import android.graphics.ColorSpace;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.android.thememanager.R;
import com.android.thememanager.activity.C1582h;
import com.android.thememanager.basemodule.imageloader.x2;
import com.android.thememanager.basemodule.resource.model.PathEntry;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.C1812k;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.utils.y9n;
import com.android.thememanager.router.detail.entity.VideoInfoUtils;
import com.android.thememanager.settings.subsettings.InterfaceC2616k;
import com.android.thememanager.util.bo;
import com.android.thememanager.util.ch;
import com.android.thememanager.wallpaper.C2949g;
import i1.C6077k;
import java.io.File;
import java.util.List;

/* JADX INFO: compiled from: WallpaperListItemViewHolder.java */
/* JADX INFO: loaded from: classes2.dex */
public class jp0y extends RecyclerView.fti implements InterfaceC2616k {

    /* JADX INFO: renamed from: g */
    private ImageView f15076g;

    /* JADX INFO: renamed from: h */
    private String f15077h;

    /* JADX INFO: renamed from: i */
    private x2.C1735g f15078i;

    /* JADX INFO: renamed from: k */
    private Activity f15079k;

    /* JADX INFO: renamed from: n */
    private ImageView f15080n;

    /* JADX INFO: renamed from: p */
    private boolean f15081p;

    /* JADX INFO: renamed from: q */
    private C1582h f15082q;

    /* JADX INFO: renamed from: s */
    private boolean f15083s;

    /* JADX INFO: renamed from: y */
    private ImageView f15084y;

    /* JADX INFO: renamed from: z */
    private ImageView f15085z;

    public jp0y(C1582h fragment, @zy.lvui View itemView, boolean isSquare, boolean isVideo) {
        super(itemView);
        this.f15082q = fragment;
        this.f15079k = fragment.getActivity();
        this.f15083s = isSquare;
        this.f15081p = isVideo;
        this.f15080n = (ImageView) itemView.findViewById(R.id.thumbnail);
        this.f15076g = (ImageView) itemView.findViewById(R.id.label);
        this.f15084y = (ImageView) itemView.findViewById(R.id.flag_type);
        this.f15085z = (ImageView) itemView.findViewById(R.id.device_icon_view);
        ni7();
        C6077k.o1t(itemView);
    }

    private String fn3e(String localPath) {
        if (!TextUtils.isEmpty(localPath) && com.android.thememanager.basemodule.utils.o1t.m7179z() && (ch.vyq(localPath) || ch.n5r1(localPath))) {
            return zsr0.toq.m28220k(localPath);
        }
        return null;
    }

    public static String fu4(List<Resource> resources, int position, int category, boolean video) {
        Resource resource = resources.get(position);
        if (video) {
            return resource.getContentPath();
        }
        if (category == 8) {
            return resource.getContentPath();
        }
        if (category != 4) {
            return TextUtils.isEmpty(resource.getOnlineInfo().getTrackId()) ? resource.getOnlineId() : resource.getOnlineInfo().getTrackId();
        }
        String trackId = resource.getOnlineInfo().getTrackId();
        return TextUtils.isEmpty(trackId) ? resource.getContentPath() : trackId;
    }

    private void ki(Resource resource, boolean enableDynamicLabel, boolean supportDarkMode) {
        if (resource == null) {
            return;
        }
        if (enableDynamicLabel && VideoInfoUtils.isDynamicVideoInfo(resource.getContentPath())) {
            this.f15076g.setImageResource(R.drawable.ic_typeicon_single_24h);
            this.f15076g.setVisibility(0);
        } else if (!supportDarkMode) {
            this.f15076g.setVisibility(8);
        } else {
            this.f15076g.setImageResource(R.drawable.wallpaper_setting_item_mode_icon);
            this.f15076g.setVisibility(0);
        }
    }

    private void ni7() {
        int i2 = this.f15083s ? R.drawable.thumbnail_big_corner_bg_grey : R.drawable.thumbnail_bg_grey;
        if (this.f15081p) {
            this.f15084y.setImageResource(R.drawable.wallpaper_setting_item_type_motion_icon);
            this.f15084y.setVisibility(0);
        }
        this.f15078i = com.android.thememanager.basemodule.imageloader.x2.fn3e().jk(0).gvn7(i2).m6795z(true);
    }

    /* JADX INFO: renamed from: t */
    private void m9022t(final int position, final List<Resource> resources) {
        String localPath;
        Resource resource = resources.get(position);
        String contentPath = resource.getContentPath();
        String strFn3e = fn3e(contentPath);
        if (!TextUtils.isEmpty(strFn3e) && C1819o.d2ok(this.itemView.getContext())) {
            contentPath = strFn3e;
        }
        if (TextUtils.isEmpty(contentPath)) {
            localPath = (resource.getThumbnails() == null || resource.getThumbnails().size() <= 0) ? null : resource.getThumbnails().get(0).getLocalPath();
        } else {
            localPath = com.android.thememanager.h5.f7l8.f12010h + contentPath;
        }
        com.android.thememanager.basemodule.imageloader.x2.m6782y(this.f15079k, localPath, this.f15080n, this.f15078i);
        ki(resource, true, !TextUtils.isEmpty(strFn3e));
    }

    private void wvg(final int position, final List<Resource> resources) {
        Resource resource = resources.get(position);
        String contentPath = resource.getContentPath();
        String strFn3e = fn3e(contentPath);
        if (!TextUtils.isEmpty(strFn3e) && C1819o.d2ok(this.itemView.getContext())) {
            contentPath = strFn3e;
        }
        if (C1807g.zurt() && !y9n.mcp(resource.getThumbnails())) {
            PathEntry pathEntry = resource.getThumbnails().get(0);
            if ("sensor".equals(resource.getCategory())) {
                contentPath = C1807g.wvg() ? pathEntry.getLocalPath() : zsr0.toq.toq(pathEntry.getLocalPath());
            } else if ("video".equals(resource.getCategory()) && new File(pathEntry.getLocalPath()).exists()) {
                contentPath = pathEntry.getLocalPath();
            }
        }
        this.f15078i.m6792l(true).dd((C2949g.f17747k.ld6() ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.LINEAR_SRGB).name());
        com.android.thememanager.basemodule.imageloader.x2.m6782y(this.f15079k, com.android.thememanager.h5.f7l8.f12010h + contentPath, this.f15080n, this.f15078i);
        ki(resource, false, TextUtils.isEmpty(strFn3e) ^ true);
    }

    /* JADX INFO: renamed from: z */
    private void m9023z(final int position, final List<Resource> resources) {
        Resource resource = resources.get(position);
        com.android.thememanager.basemodule.imageloader.x2.f7l8(this.f15079k, (resource.getThumbnails() == null || resource.getThumbnails().size() <= 0) ? null : resource.getThumbnails().get(0).getOnlinePath(), this.f15080n, com.android.thememanager.basemodule.imageloader.x2.ki(position, 0.0f), 0);
        this.f15076g.setVisibility(VideoInfoUtils.isDynamicVideoInfo(resource.getContentPath()) ? 0 : 8);
        if (!C1807g.lvui()) {
            this.f15085z.setVisibility(4);
        } else if (!C1807g.f10328q.equals(resource.getDeviceType())) {
            this.f15085z.setVisibility(4);
        } else {
            this.f15085z.setImageResource(R.drawable.wallpaper_phone_icon);
            this.f15085z.setVisibility(0);
        }
    }

    @Override // com.android.thememanager.settings.subsettings.InterfaceC2616k
    /* JADX INFO: renamed from: n */
    public void mo9024n() {
        if (this.f15082q == null || TextUtils.isEmpty(this.f15077h)) {
            return;
        }
        this.f15082q.n5r1(this.f15077h);
    }

    public void o1t(List<Resource> resources, int position, int category) {
        this.f15077h = fu4(resources, position, category, this.f15081p);
        Resource resource = resources.get(position);
        String title = resource.getTitle();
        String contentPath = resource.getContentPath();
        if (TextUtils.isEmpty(title) && !TextUtils.isEmpty(contentPath)) {
            title = bo.m9620g(contentPath);
        }
        C1812k.toq(this.f15080n, title);
        if (category != 4) {
            if (category == 8) {
                wvg(position, resources);
                return;
            }
            if (category == 12 || category == 16) {
                m9023z(position, resources);
                return;
            } else if (category != 20) {
                throw new IllegalArgumentException("unknown category." + category);
            }
        }
        m9022t(position, resources);
    }

    @Override // com.android.thememanager.settings.subsettings.InterfaceC2616k
    public void zy() {
        if (this.f15082q == null || TextUtils.isEmpty(this.f15077h)) {
            return;
        }
        this.f15082q.ncyb(this.f15077h);
    }
}
