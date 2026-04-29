package com.miui.maml.widget.edit;

import android.content.Context;
import android.util.Log;
import java.io.File;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import miui.drm.DrmManager;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: MamlDrmUtil.kt */
/* JADX INFO: loaded from: classes3.dex */
@d3(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u001e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005¨\u0006\u0007"}, d2 = {"isLegal", "Lmiui/drm/DrmManager$DrmResult;", "context", "Landroid/content/Context;", "productId", "", "resPath", "widget-edit_release"}, m22787k = 2, mv = {1, 4, 2})
public final class MamlDrmUtilKt {
    @InterfaceC7396q
    public static final DrmManager.DrmResult isLegal(@InterfaceC7396q Context context, @InterfaceC7396q String productId, @InterfaceC7396q String resPath) {
        d2ok.m23075h(context, "context");
        d2ok.m23075h(productId, "productId");
        d2ok.m23075h(resPath, "resPath");
        if (!MamlutilKt.themeManagerSupportPaidWidget(context)) {
            Log.w(MamlutilKt.TAG, "MAML productId " + productId + ", DRM RESULT = DRM_ERROR_UNKNOWN, ThemeManager not support paid widget.");
            return DrmManager.DrmResult.DRM_ERROR_UNKNOWN;
        }
        File file = new File(resPath, productId + ".zip");
        File file2 = new File(resPath, productId + ".right");
        if (!file.exists()) {
            Log.w(MamlutilKt.TAG, "MAML productId " + productId + ", DRM RESULT = DRM_ERROR_UNKNOWN, zip file not found.");
            return DrmManager.DrmResult.DRM_ERROR_UNKNOWN;
        }
        DrmManager.DrmResult drmResultIsLegal = DrmManager.isLegal(context, file, file2);
        d2ok.kja0(drmResultIsLegal, "DrmManager.isLegal(conte… contentFile, rightsFile)");
        Log.i(MamlutilKt.TAG, "MAML productId " + productId + ", DRM RESULT = " + drmResultIsLegal);
        return drmResultIsLegal;
    }
}
