package com.miui.maml.widget.edit;

import androidx.annotation.Keep;
import com.android.thememanager.settingssearch.C2690k;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: MamlDownloadStatus.kt */
/* JADX INFO: loaded from: classes3.dex */
@d3(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J=\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u001c"}, d2 = {"Lcom/miui/maml/widget/edit/MamlDownloadStatus;", "", "id", "", "mamlVersion", "", "state", "progressPercent", MamlDownloadStatusKt.EXTRA_ERROR_MSG, "(Ljava/lang/String;IIILjava/lang/String;)V", "getErrorMsg", "()Ljava/lang/String;", "getId", "getMamlVersion", "()I", "getProgressPercent", "getState", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", C2690k.k.f61039ld6, "hashCode", "toString", "widget-edit_release"}, m22787k = 1, mv = {1, 4, 2})
@Keep
public final class MamlDownloadStatus {

    @InterfaceC7395n
    private final String errorMsg;

    @InterfaceC7396q
    private final String id;
    private final int mamlVersion;
    private final int progressPercent;
    private final int state;

    public MamlDownloadStatus(@InterfaceC7396q String id, int i2, int i3, int i4, @InterfaceC7395n String str) {
        d2ok.m23075h(id, "id");
        this.id = id;
        this.mamlVersion = i2;
        this.state = i3;
        this.progressPercent = i4;
        this.errorMsg = str;
    }

    public static /* synthetic */ MamlDownloadStatus copy$default(MamlDownloadStatus mamlDownloadStatus, String str, int i2, int i3, int i4, String str2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = mamlDownloadStatus.id;
        }
        if ((i5 & 2) != 0) {
            i2 = mamlDownloadStatus.mamlVersion;
        }
        int i6 = i2;
        if ((i5 & 4) != 0) {
            i3 = mamlDownloadStatus.state;
        }
        int i7 = i3;
        if ((i5 & 8) != 0) {
            i4 = mamlDownloadStatus.progressPercent;
        }
        int i8 = i4;
        if ((i5 & 16) != 0) {
            str2 = mamlDownloadStatus.errorMsg;
        }
        return mamlDownloadStatus.copy(str, i6, i7, i8, str2);
    }

    @InterfaceC7396q
    public final String component1() {
        return this.id;
    }

    public final int component2() {
        return this.mamlVersion;
    }

    public final int component3() {
        return this.state;
    }

    public final int component4() {
        return this.progressPercent;
    }

    @InterfaceC7395n
    public final String component5() {
        return this.errorMsg;
    }

    @InterfaceC7396q
    public final MamlDownloadStatus copy(@InterfaceC7396q String id, int i2, int i3, int i4, @InterfaceC7395n String str) {
        d2ok.m23075h(id, "id");
        return new MamlDownloadStatus(id, i2, i3, i4, str);
    }

    public boolean equals(@InterfaceC7395n Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MamlDownloadStatus)) {
            return false;
        }
        MamlDownloadStatus mamlDownloadStatus = (MamlDownloadStatus) obj;
        return d2ok.f7l8(this.id, mamlDownloadStatus.id) && this.mamlVersion == mamlDownloadStatus.mamlVersion && this.state == mamlDownloadStatus.state && this.progressPercent == mamlDownloadStatus.progressPercent && d2ok.f7l8(this.errorMsg, mamlDownloadStatus.errorMsg);
    }

    @InterfaceC7395n
    public final String getErrorMsg() {
        return this.errorMsg;
    }

    @InterfaceC7396q
    public final String getId() {
        return this.id;
    }

    public final int getMamlVersion() {
        return this.mamlVersion;
    }

    public final int getProgressPercent() {
        return this.progressPercent;
    }

    public final int getState() {
        return this.state;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (((((((str != null ? str.hashCode() : 0) * 31) + Integer.hashCode(this.mamlVersion)) * 31) + Integer.hashCode(this.state)) * 31) + Integer.hashCode(this.progressPercent)) * 31;
        String str2 = this.errorMsg;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @InterfaceC7396q
    public String toString() {
        return "MamlDownloadStatus(id=" + this.id + ", mamlVersion=" + this.mamlVersion + ", state=" + this.state + ", progressPercent=" + this.progressPercent + ", errorMsg=" + this.errorMsg + ")";
    }
}
