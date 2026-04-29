package com.xiaomi.analytics;

import com.xiaomi.analytics.internal.v1.InterfaceC5615k;

/* JADX INFO: loaded from: classes3.dex */
public class PolicyConfiguration {
    private static final String DEFAULT_PRIVACY_KEY = "privacy_policy";
    private static final String DEFAULT_PRIVACY_VALUE_NO = "privacy_no";
    private static final String DEFAULT_PRIVACY_VALUE_USER = "privacy_user";
    private Privacy mPrivacy;

    public enum Privacy {
        NO,
        USER
    }

    private void applyPrivacy(InterfaceC5615k interfaceC5615k) {
        Privacy privacy = this.mPrivacy;
        if (privacy == null || interfaceC5615k == null) {
            return;
        }
        if (privacy == Privacy.NO) {
            interfaceC5615k.setDefaultPolicy(DEFAULT_PRIVACY_KEY, DEFAULT_PRIVACY_VALUE_NO);
        } else {
            interfaceC5615k.setDefaultPolicy(DEFAULT_PRIVACY_KEY, DEFAULT_PRIVACY_VALUE_USER);
        }
    }

    public void apply(InterfaceC5615k interfaceC5615k) {
        if (interfaceC5615k != null) {
            applyPrivacy(interfaceC5615k);
        }
    }

    public PolicyConfiguration setPrivacy(Privacy privacy) {
        this.mPrivacy = privacy;
        return this;
    }
}
