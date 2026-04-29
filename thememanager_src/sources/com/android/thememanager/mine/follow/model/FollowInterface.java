package com.android.thememanager.mine.follow.model;

import com.android.thememanager.basemodule.network.theme.f7l8;
import com.android.thememanager.basemodule.network.theme.model.EmptyResponse;
import com.android.thememanager.controller.online.InterfaceC1925p;
import f7z0.InterfaceC6034n;
import f7z0.kja0;
import f7z0.ld6;
import f7z0.t8r;
import f7z0.zy;
import retrofit2.toq;

/* JADX INFO: loaded from: classes2.dex */
public interface FollowInterface {
    @InterfaceC6034n
    @ld6({f7l8.f57592t8r, "request_analytics_flag:/app/v9/safe/auth/social/follow"})
    @kja0("safe/auth/social/follow/{authorId}")
    toq<EmptyResponse> follow(@t8r("authorId") String authorId, @zy(InterfaceC1925p.vyee) boolean follow, @zy(InterfaceC1925p.l8) String followerName);
}
