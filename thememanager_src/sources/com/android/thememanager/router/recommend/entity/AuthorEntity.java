package com.android.thememanager.router.recommend.entity;

import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.ni7;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: AuthorEntity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class AuthorEntity {

    @InterfaceC7395n
    private String designerDescription;

    @InterfaceC7395n
    private String designerIcon;

    @InterfaceC7395n
    private Long designerId;
    private int designerLevel;

    @InterfaceC7395n
    private Long designerMiId;

    @InterfaceC7395n
    private String designerName;
    private long fansNum;
    private boolean follow;
    private boolean largeIcons;
    private long productCount;
    private boolean theme;
    private boolean widget;

    public AuthorEntity() {
        this(null, null, null, 0, null, null, 0L, false, 0L, false, false, false, 4095, null);
    }

    public AuthorEntity(@InterfaceC7395n String str, @InterfaceC7395n String str2, @InterfaceC7395n Long l2, int i2, @InterfaceC7395n Long l3, @InterfaceC7395n String str3, long j2, boolean z2, long j3, boolean z3, boolean z5, boolean z6) {
        this.designerDescription = str;
        this.designerIcon = str2;
        this.designerId = l2;
        this.designerLevel = i2;
        this.designerMiId = l3;
        this.designerName = str3;
        this.fansNum = j2;
        this.follow = z2;
        this.productCount = j3;
        this.theme = z3;
        this.widget = z5;
        this.largeIcons = z6;
    }

    @InterfaceC7395n
    public final String component1() {
        return this.designerDescription;
    }

    public final boolean component10() {
        return this.theme;
    }

    public final boolean component11() {
        return this.widget;
    }

    public final boolean component12() {
        return this.largeIcons;
    }

    @InterfaceC7395n
    public final String component2() {
        return this.designerIcon;
    }

    @InterfaceC7395n
    public final Long component3() {
        return this.designerId;
    }

    public final int component4() {
        return this.designerLevel;
    }

    @InterfaceC7395n
    public final Long component5() {
        return this.designerMiId;
    }

    @InterfaceC7395n
    public final String component6() {
        return this.designerName;
    }

    public final long component7() {
        return this.fansNum;
    }

    public final boolean component8() {
        return this.follow;
    }

    public final long component9() {
        return this.productCount;
    }

    @InterfaceC7396q
    public final AuthorEntity copy(@InterfaceC7395n String str, @InterfaceC7395n String str2, @InterfaceC7395n Long l2, int i2, @InterfaceC7395n Long l3, @InterfaceC7395n String str3, long j2, boolean z2, long j3, boolean z3, boolean z5, boolean z6) {
        return new AuthorEntity(str, str2, l2, i2, l3, str3, j2, z2, j3, z3, z5, z6);
    }

    public boolean equals(@InterfaceC7395n Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthorEntity)) {
            return false;
        }
        AuthorEntity authorEntity = (AuthorEntity) obj;
        return d2ok.f7l8(this.designerDescription, authorEntity.designerDescription) && d2ok.f7l8(this.designerIcon, authorEntity.designerIcon) && d2ok.f7l8(this.designerId, authorEntity.designerId) && this.designerLevel == authorEntity.designerLevel && d2ok.f7l8(this.designerMiId, authorEntity.designerMiId) && d2ok.f7l8(this.designerName, authorEntity.designerName) && this.fansNum == authorEntity.fansNum && this.follow == authorEntity.follow && this.productCount == authorEntity.productCount && this.theme == authorEntity.theme && this.widget == authorEntity.widget && this.largeIcons == authorEntity.largeIcons;
    }

    @InterfaceC7395n
    public final String getDesignerDescription() {
        return this.designerDescription;
    }

    @InterfaceC7395n
    public final String getDesignerIcon() {
        return this.designerIcon;
    }

    @InterfaceC7395n
    public final Long getDesignerId() {
        return this.designerId;
    }

    public final int getDesignerLevel() {
        return this.designerLevel;
    }

    @InterfaceC7395n
    public final Long getDesignerMiId() {
        return this.designerMiId;
    }

    @InterfaceC7395n
    public final String getDesignerName() {
        return this.designerName;
    }

    public final long getFansNum() {
        return this.fansNum;
    }

    public final boolean getFollow() {
        return this.follow;
    }

    public final boolean getLargeIcons() {
        return this.largeIcons;
    }

    public final long getProductCount() {
        return this.productCount;
    }

    public final boolean getTheme() {
        return this.theme;
    }

    public final boolean getWidget() {
        return this.widget;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [int] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8, types: [int] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [int] */
    /* JADX WARN: Type inference failed for: r2v14 */
    public int hashCode() {
        String str = this.designerDescription;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.designerIcon;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l2 = this.designerId;
        int iHashCode3 = (((iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31) + Integer.hashCode(this.designerLevel)) * 31;
        Long l3 = this.designerMiId;
        int iHashCode4 = (iHashCode3 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str3 = this.designerName;
        int iHashCode5 = (((iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31) + Long.hashCode(this.fansNum)) * 31;
        boolean z2 = this.follow;
        ?? r1 = z2;
        if (z2) {
            r1 = 1;
        }
        int iHashCode6 = (((iHashCode5 + r1) * 31) + Long.hashCode(this.productCount)) * 31;
        boolean z3 = this.theme;
        ?? r12 = z3;
        if (z3) {
            r12 = 1;
        }
        int i2 = (iHashCode6 + r12) * 31;
        boolean z5 = this.widget;
        ?? r13 = z5;
        if (z5) {
            r13 = 1;
        }
        int i3 = (i2 + r13) * 31;
        boolean z6 = this.largeIcons;
        return i3 + (z6 ? 1 : z6);
    }

    public final void setDesignerDescription(@InterfaceC7395n String str) {
        this.designerDescription = str;
    }

    public final void setDesignerIcon(@InterfaceC7395n String str) {
        this.designerIcon = str;
    }

    public final void setDesignerId(@InterfaceC7395n Long l2) {
        this.designerId = l2;
    }

    public final void setDesignerLevel(int i2) {
        this.designerLevel = i2;
    }

    public final void setDesignerMiId(@InterfaceC7395n Long l2) {
        this.designerMiId = l2;
    }

    public final void setDesignerName(@InterfaceC7395n String str) {
        this.designerName = str;
    }

    public final void setFansNum(long j2) {
        this.fansNum = j2;
    }

    public final void setFollow(boolean z2) {
        this.follow = z2;
    }

    public final void setLargeIcons(boolean z2) {
        this.largeIcons = z2;
    }

    public final void setProductCount(long j2) {
        this.productCount = j2;
    }

    public final void setTheme(boolean z2) {
        this.theme = z2;
    }

    public final void setWidget(boolean z2) {
        this.widget = z2;
    }

    @InterfaceC7396q
    public String toString() {
        return "AuthorEntity(designerDescription=" + this.designerDescription + ", designerIcon=" + this.designerIcon + ", designerId=" + this.designerId + ", designerLevel=" + this.designerLevel + ", designerMiId=" + this.designerMiId + ", designerName=" + this.designerName + ", fansNum=" + this.fansNum + ", follow=" + this.follow + ", productCount=" + this.productCount + ", theme=" + this.theme + ", widget=" + this.widget + ", largeIcons=" + this.largeIcons + ')';
    }

    public /* synthetic */ AuthorEntity(String str, String str2, Long l2, int i2, Long l3, String str3, long j2, boolean z2, long j3, boolean z3, boolean z5, boolean z6, int i3, ni7 ni7Var) {
        this((i3 & 1) != 0 ? null : str, (i3 & 2) != 0 ? null : str2, (i3 & 4) != 0 ? null : l2, (i3 & 8) != 0 ? 0 : i2, (i3 & 16) != 0 ? null : l3, (i3 & 32) == 0 ? str3 : null, (i3 & 64) != 0 ? 0L : j2, (i3 & 128) != 0 ? false : z2, (i3 & 256) == 0 ? j3 : 0L, (i3 & 512) != 0 ? false : z3, (i3 & 1024) != 0 ? false : z5, (i3 & 2048) == 0 ? z6 : false);
    }
}
