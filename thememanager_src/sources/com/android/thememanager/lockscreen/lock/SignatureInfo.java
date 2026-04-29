package com.android.thememanager.lockscreen.lock;

import androidx.annotation.Keep;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.ni7;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: TemplateConfig.kt */
/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class SignatureInfo {
    private int alignment;

    @InterfaceC7396q
    private String content;
    private boolean isAutoPrimaryColor;
    private int primaryColor;

    @InterfaceC7396q
    private final String templateId;

    public SignatureInfo(@InterfaceC7396q String templateId, @InterfaceC7396q String content, int i2, int i3, boolean z2) {
        d2ok.m23075h(templateId, "templateId");
        d2ok.m23075h(content, "content");
        this.templateId = templateId;
        this.content = content;
        this.primaryColor = i2;
        this.alignment = i3;
        this.isAutoPrimaryColor = z2;
    }

    public static /* synthetic */ SignatureInfo copy$default(SignatureInfo signatureInfo, String str, String str2, int i2, int i3, boolean z2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = signatureInfo.templateId;
        }
        if ((i4 & 2) != 0) {
            str2 = signatureInfo.content;
        }
        String str3 = str2;
        if ((i4 & 4) != 0) {
            i2 = signatureInfo.primaryColor;
        }
        int i5 = i2;
        if ((i4 & 8) != 0) {
            i3 = signatureInfo.alignment;
        }
        int i6 = i3;
        if ((i4 & 16) != 0) {
            z2 = signatureInfo.isAutoPrimaryColor;
        }
        return signatureInfo.copy(str, str3, i5, i6, z2);
    }

    @InterfaceC7396q
    public final String component1() {
        return this.templateId;
    }

    @InterfaceC7396q
    public final String component2() {
        return this.content;
    }

    public final int component3() {
        return this.primaryColor;
    }

    public final int component4() {
        return this.alignment;
    }

    public final boolean component5() {
        return this.isAutoPrimaryColor;
    }

    @InterfaceC7396q
    public final SignatureInfo copy(@InterfaceC7396q String templateId, @InterfaceC7396q String content, int i2, int i3, boolean z2) {
        d2ok.m23075h(templateId, "templateId");
        d2ok.m23075h(content, "content");
        return new SignatureInfo(templateId, content, i2, i3, z2);
    }

    public boolean equals(@InterfaceC7395n Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignatureInfo)) {
            return false;
        }
        SignatureInfo signatureInfo = (SignatureInfo) obj;
        return d2ok.f7l8(this.templateId, signatureInfo.templateId) && d2ok.f7l8(this.content, signatureInfo.content) && this.primaryColor == signatureInfo.primaryColor && this.alignment == signatureInfo.alignment && this.isAutoPrimaryColor == signatureInfo.isAutoPrimaryColor;
    }

    public final int getAlignment() {
        return this.alignment;
    }

    @InterfaceC7396q
    public final String getContent() {
        return this.content;
    }

    public final int getPrimaryColor() {
        return this.primaryColor;
    }

    @InterfaceC7396q
    public final String getTemplateId() {
        return this.templateId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public int hashCode() {
        int iHashCode = ((((((this.templateId.hashCode() * 31) + this.content.hashCode()) * 31) + Integer.hashCode(this.primaryColor)) * 31) + Integer.hashCode(this.alignment)) * 31;
        boolean z2 = this.isAutoPrimaryColor;
        ?? r1 = z2;
        if (z2) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    public final boolean isAutoPrimaryColor() {
        return this.isAutoPrimaryColor;
    }

    public final void setAlignment(int i2) {
        this.alignment = i2;
    }

    public final void setAutoPrimaryColor(boolean z2) {
        this.isAutoPrimaryColor = z2;
    }

    public final void setContent(@InterfaceC7396q String str) {
        d2ok.m23075h(str, "<set-?>");
        this.content = str;
    }

    public final void setPrimaryColor(int i2) {
        this.primaryColor = i2;
    }

    @InterfaceC7396q
    public String toString() {
        return "SignatureInfo(templateId=" + this.templateId + ", content=" + this.content + ", primaryColor=" + this.primaryColor + ", alignment=" + this.alignment + ", isAutoPrimaryColor=" + this.isAutoPrimaryColor + ')';
    }

    public /* synthetic */ SignatureInfo(String str, String str2, int i2, int i3, boolean z2, int i4, ni7 ni7Var) {
        this(str, (i4 & 2) != 0 ? "" : str2, i2, i3, (i4 & 16) != 0 ? false : z2);
    }
}
