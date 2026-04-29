package com.android.thememanager.activity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.thememanager.R;
import com.android.thememanager.detail.video.util.FastVideoPlayer;
import com.android.thememanager.detail.video.util.VideoDetailPlayer;
import com.android.thememanager.router.detail.entity.VideoInfo;

/* JADX INFO: compiled from: VideoDetailFragment.java */
/* JADX INFO: loaded from: classes.dex */
public class m58i extends lvui {
    public static m58i izu(VideoInfo videoInfo, int position, int applyFlag) {
        m58i m58iVar = new m58i();
        Bundle bundle = new Bundle();
        bundle.putSerializable(lvui.hp, videoInfo);
        bundle.putInt("position", position);
        bundle.putInt(lvui.xy8, applyFlag);
        m58iVar.setArguments(bundle);
        return m58iVar;
    }

    @Override // dr.InterfaceC5994k
    public void bz2() {
        if (vc()) {
            this.bc = new FastVideoPlayer(bf2.toq.toq());
        } else {
            this.bc = new VideoDetailPlayer(bf2.toq.toq());
        }
    }

    @Override // dr.InterfaceC5994k
    public View ixz() {
        return LayoutInflater.from(getActivity()).inflate(R.layout.de_video_operation_bar, (ViewGroup) null);
    }

    @Override // dr.InterfaceC5994k
    public boolean was(int screenWidth, int screenHeight) {
        return VideoSizeConfirm.zy(this.as, this.bg);
    }
}
