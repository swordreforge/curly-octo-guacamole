package com.android.thememanager.author.viewmodel;

import com.android.thememanager.author.fragment.C1667s;
import com.android.thememanager.basemodule.network.theme.f7l8;
import com.android.thememanager.basemodule.network.theme.model.CommonResponse;
import com.android.thememanager.router.recommend.entity.AuthorEntity;
import f7z0.InterfaceC6030g;
import f7z0.InterfaceC6032i;
import f7z0.ld6;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: com.android.thememanager.author.viewmodel.k */
/* JADX INFO: compiled from: AuthorWorksViewModel.kt */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1670k {
    @InterfaceC7396q
    @InterfaceC6030g("samedesign/info")
    @ld6({f7l8.f57594zurt, f7l8.f57582cdj})
    /* JADX INFO: renamed from: k */
    retrofit2.toq<CommonResponse<AuthorEntity>> m6542k(@InterfaceC7396q @InterfaceC6032i(C1667s.f57400toq) String str, @InterfaceC7396q @InterfaceC6032i("designerMiId") String str2, @InterfaceC7396q @InterfaceC6032i("designerId") String str3);
}
