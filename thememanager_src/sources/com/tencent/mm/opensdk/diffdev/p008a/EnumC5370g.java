package com.tencent.mm.opensdk.diffdev.p008a;

import com.miui.clock.module.toq;

/* JADX INFO: renamed from: com.tencent.mm.opensdk.diffdev.a.g */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC5370g {
    UUID_EXPIRED(402),
    UUID_CANCELED(403),
    UUID_SCANED(toq.f7l8.f29213n),
    UUID_CONFIRM(toq.f7l8.f29211g),
    UUID_KEEP_CONNECT(408),
    UUID_ERROR(500);

    private int code;

    EnumC5370g(int i2) {
        this.code = i2;
    }

    public final int getCode() {
        return this.code;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "UUIDStatusCode:" + this.code;
    }
}
