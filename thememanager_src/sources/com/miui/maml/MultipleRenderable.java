package com.miui.maml;

import com.miui.maml.RendererController;
import com.miui.maml.util.MamlLog;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class MultipleRenderable implements RendererController.IRenderable {
    private static final String LOG_TAG = "MultipleRenderable";
    private int mActiveCount;
    private ArrayList<RenderableInfo> mList = new ArrayList<>();

    private static class RenderableInfo {
        public boolean paused;

        /* JADX INFO: renamed from: r */
        public WeakReference<RendererController.IRenderable> f29458r;

        public RenderableInfo(RendererController.IRenderable iRenderable) {
            this.f29458r = new WeakReference<>(iRenderable);
        }
    }

    private RenderableInfo find(RendererController.IRenderable iRenderable) {
        int size = this.mList.size();
        for (int i2 = 0; i2 < size; i2++) {
            RenderableInfo renderableInfo = this.mList.get(i2);
            if (renderableInfo.f29458r.get() == iRenderable) {
                return renderableInfo;
            }
        }
        return null;
    }

    private int setPause(RendererController.IRenderable iRenderable, boolean z2) {
        MamlLog.m17850d(LOG_TAG, "setPause: " + z2 + " " + iRenderable);
        RenderableInfo renderableInfoFind = find(iRenderable);
        if (renderableInfoFind == null) {
            return this.mActiveCount;
        }
        if (renderableInfoFind.paused != z2) {
            renderableInfoFind.paused = z2;
            int i2 = this.mActiveCount;
            this.mActiveCount = z2 ? i2 - 1 : i2 + 1;
        }
        return this.mActiveCount;
    }

    public synchronized void add(RendererController.IRenderable iRenderable) {
        if (find(iRenderable) != null) {
            return;
        }
        MamlLog.m17850d(LOG_TAG, "add: " + iRenderable);
        this.mList.add(new RenderableInfo(iRenderable));
        this.mActiveCount = this.mActiveCount + 1;
    }

    @Override // com.miui.maml.RendererController.IRenderable
    public synchronized void doRender() {
        this.mActiveCount = 0;
        for (int size = this.mList.size() - 1; size >= 0; size--) {
            RenderableInfo renderableInfo = this.mList.get(size);
            if (!renderableInfo.paused) {
                RendererController.IRenderable iRenderable = renderableInfo.f29458r.get();
                if (iRenderable != null) {
                    iRenderable.doRender();
                    this.mActiveCount++;
                } else {
                    this.mList.remove(size);
                }
            }
        }
    }

    public synchronized int pause(RendererController.IRenderable iRenderable) {
        return setPause(iRenderable, true);
    }

    public synchronized void remove(RendererController.IRenderable iRenderable) {
        int size = this.mList.size();
        if (size == 0) {
            return;
        }
        for (int i2 = size - 1; i2 >= 0; i2--) {
            RenderableInfo renderableInfo = this.mList.get(i2);
            RendererController.IRenderable iRenderable2 = renderableInfo.f29458r.get();
            if (iRenderable2 == null || iRenderable2 == iRenderable) {
                if (!renderableInfo.paused) {
                    this.mActiveCount--;
                }
                this.mList.remove(i2);
                MamlLog.m17850d(LOG_TAG, "remove: " + iRenderable2);
            }
        }
    }

    public synchronized int resume(RendererController.IRenderable iRenderable) {
        return setPause(iRenderable, false);
    }

    public synchronized int size() {
        return this.mList.size();
    }
}
