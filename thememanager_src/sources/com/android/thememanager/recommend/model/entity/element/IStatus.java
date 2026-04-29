package com.android.thememanager.recommend.model.entity.element;

import androidx.lifecycle.InterfaceC0954z;
import androidx.lifecycle.fti;
import androidx.lifecycle.jp0y;
import com.android.thememanager.router.app.entity.ThemeStatus;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public interface IStatus extends IElement {
    int getStatus();

    String getTaskId();

    fti<ThemeStatus> getThemeStatus();

    void refresh();

    void registerThemeStatusObserver(InterfaceC0954z owner, @lvui jp0y<? super ThemeStatus> observer);

    void removeThemeStatusObserver();

    int reqBoughtState();

    void setReqBoughtState(int state);
}
