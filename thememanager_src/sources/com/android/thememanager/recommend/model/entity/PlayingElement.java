package com.android.thememanager.recommend.model.entity;

import p029m.zy;

/* JADX INFO: loaded from: classes2.dex */
public class PlayingElement {
    private boolean playing;

    public interface IPlaying {
        boolean isPlaying();

        boolean setPlaying(String uuid);
    }

    public boolean isPlaying() {
        return this.playing;
    }

    public boolean setPlaying(String uuid, String oldUuid) {
        boolean zM24738k = zy.m24738k(uuid, oldUuid);
        if (zM24738k == this.playing) {
            return false;
        }
        this.playing = zM24738k;
        return true;
    }
}
