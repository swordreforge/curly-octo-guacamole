package com.android.thememanager.activity;

import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.android.thememanager.detail.video.model.RemoteVideoResource;
import com.android.thememanager.router.detail.entity.VideoInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: VideoDetailPagerAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public class cnbm extends androidx.fragment.app.fu4 {

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private static final String f57297ki = "VideoDetailPagerAdapter";

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    int f57298cdj;

    /* JADX INFO: renamed from: h */
    private final ArrayList<VideoInfo> f8977h;

    public cnbm(FragmentManager fm, ArrayList<VideoInfo> videoInfos, int applyFlag) {
        super(fm);
        this.f8977h = videoInfos;
        this.f57298cdj = applyFlag;
    }

    public VideoInfo fu4(int index) {
        ArrayList<VideoInfo> arrayList = this.f8977h;
        if (arrayList == null || index < 0) {
            return null;
        }
        int size = arrayList.size();
        return index >= size ? this.f8977h.get(size - 1) : this.f8977h.get(index);
    }

    @Override // androidx.viewpager.widget.AbstractC1288k
    /* JADX INFO: renamed from: n */
    public int mo5575n() {
        return this.f8977h.size();
    }

    public VideoInfo ni7(int position) {
        if (position >= 0 && position < this.f8977h.size()) {
            return this.f8977h.get(position);
        }
        Log.w(f57297ki, "getData: position is out of Index " + position);
        return null;
    }

    public boolean o1t(int position) {
        VideoInfo videoInfoFu4 = fu4(position);
        if (videoInfoFu4 == null) {
            return false;
        }
        return new RemoteVideoResource(videoInfoFu4.path, videoInfoFu4.previewPath, videoInfoFu4.name, videoInfoFu4.onlineId, videoInfoFu4.sizeBytes, com.android.thememanager.basemodule.utils.hyr.zy(",", videoInfoFu4.innerTags)).isDownloaded();
    }

    public void wvg(List<VideoInfo> videoInfos) {
        this.f8977h.addAll(videoInfos);
        x2();
    }

    /* JADX INFO: renamed from: z */
    public ArrayList<VideoInfo> m6400z() {
        return this.f8977h;
    }

    @Override // androidx.fragment.app.fu4
    /* JADX INFO: renamed from: zurt */
    public Fragment getItem(int position) {
        return m58i.izu(this.f8977h.get(position), position, this.f57298cdj);
    }
}
