package com.android.thememanager.clockmessage;

import com.android.thememanager.basemodule.network.theme.f7l8;
import com.android.thememanager.basemodule.network.theme.model.CommonResponse;
import com.android.thememanager.basemodule.network.theme.model.EmptyResponse;
import com.android.thememanager.controller.online.InterfaceC1925p;
import f7z0.InterfaceC6030g;
import f7z0.InterfaceC6032i;
import f7z0.InterfaceC6034n;
import f7z0.kja0;
import f7z0.ld6;

/* JADX INFO: renamed from: com.android.thememanager.clockmessage.k */
/* JADX INFO: compiled from: ClockMessageInterface.java */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1872k {
    @InterfaceC6034n
    @ld6({f7l8.f57582cdj, f7l8.f57592t8r})
    @kja0("safe/auth/community/message/read")
    /* JADX INFO: renamed from: k */
    retrofit2.toq<CommonResponse<EmptyResponse>> m7388k(@f7z0.zy("moduleId") String moduleId, @f7z0.zy(InterfaceC1925p.j60k) String messageType);

    @InterfaceC6030g("safe/auth/community/messageInfo")
    @ld6({f7l8.f57582cdj, f7l8.f57592t8r})
    retrofit2.toq<CommonResponse<com.android.thememanager.clockmessage.model.toq>> toq(@InterfaceC6032i("moduleId") String moduleId, @InterfaceC6032i("agree") Boolean agree);

    @InterfaceC6030g("community/widget/activity")
    @ld6({f7l8.f57582cdj, f7l8.f57594zurt})
    retrofit2.toq<CommonResponse<com.android.thememanager.clockmessage.model.toq>> zy();
}
