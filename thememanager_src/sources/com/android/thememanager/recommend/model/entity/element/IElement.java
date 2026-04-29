package com.android.thememanager.recommend.model.entity.element;

import com.android.thememanager.basemodule.resource.model.Resource;

/* JADX INFO: loaded from: classes2.dex */
public interface IElement {
    Resource getResource();

    boolean holdShowing();

    boolean isDownloaded();

    boolean isOutdated();

    boolean isShowOperation();

    void setDownloaded(boolean downloaded);

    void setOutdated(boolean outdated);

    void setShowOperation(boolean showOperation);
}
