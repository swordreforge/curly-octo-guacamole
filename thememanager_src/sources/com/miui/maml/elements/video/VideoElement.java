package com.miui.maml.elements.video;

import android.text.TextUtils;
import android.view.View;
import com.android.thememanager.superwallpaper.view.MamlPreview;
import com.miui.maml.ScreenElementRoot;
import com.miui.maml.elements.ViewHolderScreenElement;
import com.miui.maml.util.MamlLog;
import com.miui.maml.util.MamlMediaDataSource;
import org.w3c.dom.Element;

/* JADX INFO: loaded from: classes3.dex */
public class VideoElement extends ViewHolderScreenElement {
    public static final String LOG_TAG = "VideoElement";
    public static final String TAG_NAME = "Video";
    private MamlMediaDataSource mSource;
    private BaseVideoView mView;

    public VideoElement(Element element, ScreenElementRoot screenElementRoot) {
        super(element, screenElementRoot);
        load();
    }

    private void load() {
        if (getRoot().getMamlSurface() != null) {
            SurfaceVideoView surfaceVideoView = new SurfaceVideoView(this.mRoot.getContext().mContext, getRoot().getMamlSurface());
            this.mView = surfaceVideoView;
            if (this.mLayer == 1) {
                surfaceVideoView.setZOrderOnTop(true);
            }
        } else {
            this.mView = new NormalVideoView(this.mRoot.getContext().mContext);
        }
        this.mView.setName(this.mName);
        this.mView.setFormat(-2);
        this.mView.setBackgroundColor(0);
    }

    public void config(boolean z2, int i2, String str) {
        MamlLog.m17850d(LOG_TAG, "config: path " + str + " looping " + z2 + " scaleMode " + i2);
        if (this.mView == null) {
            return;
        }
        MamlMediaDataSource mamlMediaDataSource = this.mSource;
        if (mamlMediaDataSource == null || !TextUtils.equals(mamlMediaDataSource.getPath(), str)) {
            this.mSource = new MamlMediaDataSource(getContext().mContext, getContext().mResourceManager, str);
        }
        this.mView.setLooping(z2);
        this.mView.setScaleMode(i2);
        this.mView.setVideoDataSource(this.mSource);
    }

    @Override // com.miui.maml.elements.ViewHolderScreenElement, com.miui.maml.elements.ElementGroup, com.miui.maml.elements.AnimatedScreenElement, com.miui.maml.elements.ScreenElement
    protected void doTick(long j2) {
        super.doTick(j2);
        BaseVideoView baseVideoView = this.mView;
        if (baseVideoView != null) {
            baseVideoView.doTick();
        }
    }

    @Override // com.miui.maml.elements.ViewHolderScreenElement, com.miui.maml.elements.ElementGroup, com.miui.maml.elements.AnimatedScreenElement, com.miui.maml.elements.ScreenElement
    public void finish() {
        super.finish();
        MamlMediaDataSource mamlMediaDataSource = this.mSource;
        if (mamlMediaDataSource != null) {
            mamlMediaDataSource.close();
        }
    }

    @Override // com.miui.maml.elements.ViewHolderScreenElement
    protected View getView() {
        return this.mView;
    }

    @Override // com.miui.maml.elements.ViewHolderScreenElement, com.miui.maml.elements.ElementGroupRC, com.miui.maml.elements.ElementGroup, com.miui.maml.elements.AnimatedScreenElement, com.miui.maml.elements.ScreenElement
    public void init() {
        super.init();
        BaseVideoView baseVideoView = this.mView;
        if (baseVideoView != null) {
            baseVideoView.init(getVariables());
        }
    }

    @Override // com.miui.maml.elements.ViewHolderScreenElement
    protected void onViewAdded(View view) {
        super.onViewAdded(view);
    }

    @Override // com.miui.maml.elements.ViewHolderScreenElement
    protected void onViewRemoved(View view) {
        super.onViewRemoved(view);
        stop();
    }

    @Override // com.miui.maml.elements.ElementGroup, com.miui.maml.elements.AnimatedScreenElement, com.miui.maml.elements.ScreenElement
    public void pause() {
        MamlLog.m17850d(LOG_TAG, "pause");
        BaseVideoView baseVideoView = this.mView;
        if (baseVideoView != null) {
            baseVideoView.pause();
        }
    }

    public void play() {
        MamlLog.m17850d(LOG_TAG, MamlPreview.f16155c);
        MamlMediaDataSource mamlMediaDataSource = this.mSource;
        if (mamlMediaDataSource != null) {
            mamlMediaDataSource.tryToGenerateMemoryFile();
        }
        BaseVideoView baseVideoView = this.mView;
        if (baseVideoView != null) {
            baseVideoView.start();
        }
    }

    public void seekTo(int i2) {
        MamlLog.m17850d(LOG_TAG, "seekTo " + i2);
        BaseVideoView baseVideoView = this.mView;
        if (baseVideoView != null) {
            baseVideoView.seekTo(i2);
        }
    }

    public void setVolume(float f2) {
        MamlLog.m17850d(LOG_TAG, "setVolume " + f2);
        BaseVideoView baseVideoView = this.mView;
        if (baseVideoView != null) {
            baseVideoView.setVolume(f2);
        }
    }

    public void stop() {
        MamlLog.m17850d(LOG_TAG, "stop");
        BaseVideoView baseVideoView = this.mView;
        if (baseVideoView != null) {
            baseVideoView.stopPlayback();
        }
        MamlMediaDataSource mamlMediaDataSource = this.mSource;
        if (mamlMediaDataSource != null) {
            mamlMediaDataSource.releaseMemoryFile();
        }
    }

    @Override // com.miui.maml.elements.ViewHolderScreenElement
    protected void updateView() {
        BaseVideoView baseVideoView = this.mView;
        if (baseVideoView != null) {
            if (this.mUpdatePosition || this.mUpdateTranslation || this.mUpdateSize) {
                onUpdateView(baseVideoView);
            }
        }
    }
}
