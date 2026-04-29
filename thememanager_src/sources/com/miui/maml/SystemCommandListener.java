package com.miui.maml;

import android.text.TextUtils;
import com.miui.maml.ScreenElementRoot;

/* JADX INFO: loaded from: classes3.dex */
public class SystemCommandListener implements ScreenElementRoot.OnExternCommandListener {
    private static final String CLEAR_RESOURCE = "__clearResource";
    private static final String REQUEST_UPDATE = "__requestUpdate";
    private ScreenElementRoot mRoot;

    public SystemCommandListener(ScreenElementRoot screenElementRoot) {
        this.mRoot = screenElementRoot;
    }

    @Override // com.miui.maml.ScreenElementRoot.OnExternCommandListener
    public void onCommand(String str, Double d2, String str2) {
        if (!CLEAR_RESOURCE.equals(str)) {
            if (REQUEST_UPDATE.equals(str)) {
                this.mRoot.requestUpdate();
            }
        } else if (!TextUtils.isEmpty(str2)) {
            this.mRoot.getContext().mResourceManager.clear(str2);
        } else {
            ResourceManager resourceManager = this.mRoot.getContext().mResourceManager;
            ResourceManager.clear();
        }
    }
}
