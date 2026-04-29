package com.miui.maml.widget.edit;

import android.content.Intent;
import com.market.sdk.reflect.toq;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7396q;
import vy.C7718q;

/* JADX INFO: compiled from: MamlDownloadStatus.kt */
/* JADX INFO: loaded from: classes3.dex */
@d3(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0007\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u0012\u0010\u0005\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\"\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\b\"\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\b\"\u0014\u0010\n\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\b\"\u0014\u0010\u000b\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\b\"\u0014\u0010\f\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\b\"\u0014\u0010\r\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\b\"\u0014\u0010\u000e\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\b\"\u0014\u0010\u000f\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\b\"\u0014\u0010\u0010\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\b\"\u0014\u0010\u0011\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\b\"\u0014\u0010\u0012\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\b\"\u0014\u0010\u0013\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\b\"\u0014\u0010\u0015\u001a\u00020\u00148\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\"\u0014\u0010\u0017\u001a\u00020\u00148\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016\"\u0014\u0010\u0018\u001a\u00020\u00148\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016\"\u0014\u0010\u0019\u001a\u00020\u00148\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0016\"\u0014\u0010\u001a\u001a\u00020\u00148\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0016¨\u0006\u001b"}, d2 = {"Landroid/content/Intent;", C7718q.f97043a9, "Lcom/miui/maml/widget/edit/MamlDownloadStatus;", "createDownloadStatus", "Lkotlin/was;", "extendIntent", "", "STATE_DOWNLOAD", toq.f28131g, "STATE_DOWNLOAD_PARSE", "STATE_PARSE_DONE", "STATE_ERROR", "STATE_RIGHT_ERROR", "STATE_RIGHT_SUCCESS", "STATE_ERROR_NO_LOGIN", "CODE_FAIL_THEMEMANAGER_LOW_VERSION", "CODE_FAIL_CTA", "CODE_FAIL", "CODE_SUCCESS", "CODE_EXIST", "", "EXTRA_ID", "Ljava/lang/String;", "EXTRA_VER", "EXTRA_STATE", "EXTRA_PERCENT", "EXTRA_ERROR_MSG", "widget-edit_release"}, m22787k = 2, mv = {1, 4, 2})
public final class MamlDownloadStatusKt {
    public static final int CODE_EXIST = 1;
    public static final int CODE_FAIL = -1;
    public static final int CODE_FAIL_CTA = -2;
    public static final int CODE_FAIL_THEMEMANAGER_LOW_VERSION = -3;
    public static final int CODE_SUCCESS = 0;

    @InterfaceC7396q
    public static final String EXTRA_ERROR_MSG = "errorMsg";

    @InterfaceC7396q
    public static final String EXTRA_ID = "onlineId";

    @InterfaceC7396q
    public static final String EXTRA_PERCENT = "percent";

    @InterfaceC7396q
    public static final String EXTRA_STATE = "state";

    @InterfaceC7396q
    public static final String EXTRA_VER = "version";
    public static final int STATE_DOWNLOAD = 0;
    public static final int STATE_DOWNLOAD_PARSE = 1;
    public static final int STATE_ERROR = 3;
    public static final int STATE_ERROR_NO_LOGIN = 6;
    public static final int STATE_PARSE_DONE = 2;
    public static final int STATE_RIGHT_ERROR = 4;
    public static final int STATE_RIGHT_SUCCESS = 5;

    @InterfaceC7396q
    public static final MamlDownloadStatus createDownloadStatus(@InterfaceC7396q Intent intent) {
        d2ok.m23075h(intent, "intent");
        String stringExtra = intent.getStringExtra("onlineId");
        if (stringExtra == null) {
            stringExtra = "";
        }
        return new MamlDownloadStatus(stringExtra, intent.getIntExtra("version", 0), intent.getIntExtra("state", -100), intent.getIntExtra(EXTRA_PERCENT, -100), intent.getStringExtra(EXTRA_ERROR_MSG));
    }

    public static final void extendIntent(@InterfaceC7396q MamlDownloadStatus extendIntent, @InterfaceC7396q Intent intent) {
        d2ok.m23075h(extendIntent, "$this$extendIntent");
        d2ok.m23075h(intent, "intent");
        intent.putExtra("onlineId", extendIntent.getId());
        intent.putExtra("version", extendIntent.getMamlVersion());
        intent.putExtra("state", extendIntent.getState());
        intent.putExtra(EXTRA_PERCENT, extendIntent.getProgressPercent());
        String errorMsg = extendIntent.getErrorMsg();
        if (errorMsg == null || errorMsg.length() == 0) {
            return;
        }
        intent.putExtra(EXTRA_ERROR_MSG, extendIntent.getErrorMsg());
    }
}
