package com.android.thememanager.v9;

import com.android.thememanager.v9.model.UIElement;
import com.android.thememanager.v9.model.UIProduct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.android.thememanager.v9.i */
/* JADX INFO: compiled from: WallpaperEndlessListHandler.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2864i {

    /* JADX INFO: renamed from: k */
    public List<UIProduct> f17151k = new ArrayList();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public int f61475toq = -1;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public boolean f61476zy = true;

    /* JADX INFO: renamed from: k */
    private void m10181k(List<UIElement> uiElements) {
        Iterator<UIElement> it = uiElements.iterator();
        while (it.hasNext()) {
            this.f17151k.addAll(it.next().products);
        }
    }

    public void toq(boolean clear, List<UIElement> uiElements, int pageIndex, boolean hasMore) {
        if (clear) {
            this.f17151k.clear();
        }
        if (uiElements == null || uiElements.isEmpty()) {
            return;
        }
        Iterator<UIElement> it = uiElements.iterator();
        while (it.hasNext()) {
            it.next().wallpaperHandler = this;
        }
        m10181k(uiElements);
        this.f61475toq = pageIndex;
        this.f61476zy = hasMore;
    }
}
