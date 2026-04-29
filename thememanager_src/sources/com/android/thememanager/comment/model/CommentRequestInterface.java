package com.android.thememanager.comment.model;

import com.android.thememanager.basemodule.network.theme.f7l8;
import com.android.thememanager.basemodule.network.theme.model.CommonResponse;
import com.android.thememanager.controller.online.InterfaceC1925p;
import f7z0.InterfaceC6030g;
import f7z0.InterfaceC6032i;
import f7z0.InterfaceC6034n;
import f7z0.kja0;
import f7z0.ld6;
import f7z0.t8r;
import f7z0.zy;
import retrofit2.toq;

/* JADX INFO: loaded from: classes2.dex */
public interface CommentRequestInterface {
    @InterfaceC6034n
    @ld6({f7l8.f57592t8r, f7l8.f57582cdj, "request_analytics_flag:/app/v9/safe/auth/comment/theme"})
    @kja0("safe/auth/comment/theme/{resourceId}")
    toq<CommonResponse<CommentResult>> doComment(@t8r("resourceId") String resourceId, @zy("commentValue") String commentValue, @zy("versionName") String versionName);

    @InterfaceC6034n
    @ld6({f7l8.f57592t8r, f7l8.f57582cdj, "request_analytics_flag:/app/v9/safe/auth/comment/theme"})
    @kja0("safe/auth/comment/theme/{resourceId}/{commentId}")
    toq<CommonResponse<CommentResult>> doSubComment(@t8r("resourceId") String resourceId, @t8r("commentId") String commentId, @zy("commentValue") String commentValue, @zy("versionName") String versionName);

    @InterfaceC6030g("comment/theme/detail/{resourceId}/{commentId}")
    @ld6({f7l8.f57594zurt, f7l8.f57582cdj, "request_analytics_flag:/app/v9/comment/theme/detail"})
    toq<CommonResponse<ResourceComment>> getCommentDetail(@t8r("resourceId") String resourceId, @t8r("commentId") String commentId);

    @InterfaceC6030g("comment/theme/input/{resourceId}")
    @ld6({f7l8.f57594zurt, f7l8.f57582cdj, "request_analytics_flag:/app/v9/comment/theme/input"})
    toq<CommonResponse<ResourceCommentTags>> getCommentTags(@t8r("resourceId") String resourceId);

    @InterfaceC6030g("comment/theme/detail/{resourceId}")
    @ld6({f7l8.f57594zurt, f7l8.f57582cdj, "request_analytics_flag:/app/v9/comment/theme/detail"})
    toq<CommonResponse<ResourceComment>> getComments(@t8r("resourceId") String resourceId, @InterfaceC6032i(InterfaceC1925p.b2bv) long maxUpdateTime);

    @InterfaceC6034n
    @ld6({f7l8.f57592t8r, f7l8.f57582cdj, "request_analytics_flag:/app/v9/safe/auth/comment/theme/like"})
    @kja0("safe/auth/comment/theme/like/{resourceId}/{commentId}")
    toq<CommonResponse<LikeCommentResult>> likeComment(@t8r("resourceId") String resourceId, @t8r("commentId") String commentId, @zy("isLike") boolean isLike);
}
