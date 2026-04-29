package com.miui.maml.widget.edit;

import androidx.annotation.Keep;
import com.android.thememanager.settingssearch.C2690k;
import com.miui.maml.data.VariableNames;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.ni7;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: widgetEditSave.kt */
/* JADX INFO: loaded from: classes3.dex */
@d3(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J3\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\bHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, d2 = {"Lcom/miui/maml/widget/edit/DateSetSaveConfig;", "", "name", "", VariableNames.VAR_DATE, "", "repeatName", "repeatValue", "", "(Ljava/lang/String;JLjava/lang/String;I)V", "getDate", "()J", "setDate", "(J)V", "getName", "()Ljava/lang/String;", "getRepeatName", "getRepeatValue", "()I", "setRepeatValue", "(I)V", "component1", "component2", "component3", "component4", "copy", "equals", "", C2690k.k.f61039ld6, "hashCode", "toString", "widget-edit_release"}, m22787k = 1, mv = {1, 4, 2})
@Keep
public final class DateSetSaveConfig {
    private long date;

    @InterfaceC7396q
    private final String name;

    @InterfaceC7395n
    private final String repeatName;
    private int repeatValue;

    public DateSetSaveConfig(@InterfaceC7396q String name, long j2, @InterfaceC7395n String str, int i2) {
        d2ok.m23075h(name, "name");
        this.name = name;
        this.date = j2;
        this.repeatName = str;
        this.repeatValue = i2;
    }

    public static /* synthetic */ DateSetSaveConfig copy$default(DateSetSaveConfig dateSetSaveConfig, String str, long j2, String str2, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = dateSetSaveConfig.name;
        }
        if ((i3 & 2) != 0) {
            j2 = dateSetSaveConfig.date;
        }
        long j3 = j2;
        if ((i3 & 4) != 0) {
            str2 = dateSetSaveConfig.repeatName;
        }
        String str3 = str2;
        if ((i3 & 8) != 0) {
            i2 = dateSetSaveConfig.repeatValue;
        }
        return dateSetSaveConfig.copy(str, j3, str3, i2);
    }

    @InterfaceC7396q
    public final String component1() {
        return this.name;
    }

    public final long component2() {
        return this.date;
    }

    @InterfaceC7395n
    public final String component3() {
        return this.repeatName;
    }

    public final int component4() {
        return this.repeatValue;
    }

    @InterfaceC7396q
    public final DateSetSaveConfig copy(@InterfaceC7396q String name, long j2, @InterfaceC7395n String str, int i2) {
        d2ok.m23075h(name, "name");
        return new DateSetSaveConfig(name, j2, str, i2);
    }

    public boolean equals(@InterfaceC7395n Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DateSetSaveConfig)) {
            return false;
        }
        DateSetSaveConfig dateSetSaveConfig = (DateSetSaveConfig) obj;
        return d2ok.f7l8(this.name, dateSetSaveConfig.name) && this.date == dateSetSaveConfig.date && d2ok.f7l8(this.repeatName, dateSetSaveConfig.repeatName) && this.repeatValue == dateSetSaveConfig.repeatValue;
    }

    public final long getDate() {
        return this.date;
    }

    @InterfaceC7396q
    public final String getName() {
        return this.name;
    }

    @InterfaceC7395n
    public final String getRepeatName() {
        return this.repeatName;
    }

    public final int getRepeatValue() {
        return this.repeatValue;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (((str != null ? str.hashCode() : 0) * 31) + Long.hashCode(this.date)) * 31;
        String str2 = this.repeatName;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Integer.hashCode(this.repeatValue);
    }

    public final void setDate(long j2) {
        this.date = j2;
    }

    public final void setRepeatValue(int i2) {
        this.repeatValue = i2;
    }

    @InterfaceC7396q
    public String toString() {
        return "DateSetSaveConfig(name=" + this.name + ", date=" + this.date + ", repeatName=" + this.repeatName + ", repeatValue=" + this.repeatValue + ")";
    }

    public /* synthetic */ DateSetSaveConfig(String str, long j2, String str2, int i2, int i3, ni7 ni7Var) {
        this(str, j2, str2, (i3 & 8) != 0 ? 0 : i2);
    }
}
