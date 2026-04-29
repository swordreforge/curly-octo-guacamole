package com.miui.maml.widget.edit.local;

import com.android.thememanager.settingssearch.C2690k;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.ni7;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: Manifest.kt */
/* JADX INFO: loaded from: classes3.dex */
@d3(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b(\b\u0086\b\u0018\u00002\u00020\u0001B\u0093\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000b\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000b\u0012\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000b\u0012\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\u0002\u0010\u000fJ\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010(\u001a\u00020\bHÆ\u0003J\t\u0010)\u001a\u00020\bHÆ\u0003J\u0015\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000bHÆ\u0003J\u0015\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000bHÆ\u0003J\u0015\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000bHÆ\u0003J\u0015\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000bHÆ\u0003J\u0097\u0001\u0010.\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000b2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000b2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000b2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000bHÆ\u0001J\u0013\u0010/\u001a\u00020\b2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u00020\u0005HÖ\u0001J\t\u00102\u001a\u00020\u0003HÖ\u0001R\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\t\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001d\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u001d\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001d\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010 \"\u0004\b$\u0010\"¨\u00063"}, d2 = {"Lcom/miui/maml/widget/edit/local/Manifest;", "", "version", "", "platform", "", "typeTag", "editable", "", "customEdit", "authors", "", "designers", "titles", "descriptions", "(Ljava/lang/String;ILjava/lang/String;ZZLjava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V", "getAuthors", "()Ljava/util/Map;", "getCustomEdit", "()Z", "setCustomEdit", "(Z)V", "getDescriptions", "getDesigners", "getEditable", "setEditable", "getPlatform", "()I", "setPlatform", "(I)V", "getTitles", "getTypeTag", "()Ljava/lang/String;", "setTypeTag", "(Ljava/lang/String;)V", "getVersion", "setVersion", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", C2690k.k.f61039ld6, "hashCode", "toString", "widget-edit_release"}, m22787k = 1, mv = {1, 4, 2})
public final class Manifest {

    @InterfaceC7396q
    private final Map<String, String> authors;
    private boolean customEdit;

    @InterfaceC7396q
    private final Map<String, String> descriptions;

    @InterfaceC7396q
    private final Map<String, String> designers;
    private boolean editable;
    private int platform;

    @InterfaceC7396q
    private final Map<String, String> titles;

    @InterfaceC7395n
    private String typeTag;

    @InterfaceC7395n
    private String version;

    public Manifest() {
        this(null, 0, null, false, false, null, null, null, null, 511, null);
    }

    public Manifest(@InterfaceC7395n String str, int i2, @InterfaceC7395n String str2, boolean z2, boolean z3, @InterfaceC7396q Map<String, String> authors, @InterfaceC7396q Map<String, String> designers, @InterfaceC7396q Map<String, String> titles, @InterfaceC7396q Map<String, String> descriptions) {
        d2ok.m23075h(authors, "authors");
        d2ok.m23075h(designers, "designers");
        d2ok.m23075h(titles, "titles");
        d2ok.m23075h(descriptions, "descriptions");
        this.version = str;
        this.platform = i2;
        this.typeTag = str2;
        this.editable = z2;
        this.customEdit = z3;
        this.authors = authors;
        this.designers = designers;
        this.titles = titles;
        this.descriptions = descriptions;
    }

    @InterfaceC7395n
    public final String component1() {
        return this.version;
    }

    public final int component2() {
        return this.platform;
    }

    @InterfaceC7395n
    public final String component3() {
        return this.typeTag;
    }

    public final boolean component4() {
        return this.editable;
    }

    public final boolean component5() {
        return this.customEdit;
    }

    @InterfaceC7396q
    public final Map<String, String> component6() {
        return this.authors;
    }

    @InterfaceC7396q
    public final Map<String, String> component7() {
        return this.designers;
    }

    @InterfaceC7396q
    public final Map<String, String> component8() {
        return this.titles;
    }

    @InterfaceC7396q
    public final Map<String, String> component9() {
        return this.descriptions;
    }

    @InterfaceC7396q
    public final Manifest copy(@InterfaceC7395n String str, int i2, @InterfaceC7395n String str2, boolean z2, boolean z3, @InterfaceC7396q Map<String, String> authors, @InterfaceC7396q Map<String, String> designers, @InterfaceC7396q Map<String, String> titles, @InterfaceC7396q Map<String, String> descriptions) {
        d2ok.m23075h(authors, "authors");
        d2ok.m23075h(designers, "designers");
        d2ok.m23075h(titles, "titles");
        d2ok.m23075h(descriptions, "descriptions");
        return new Manifest(str, i2, str2, z2, z3, authors, designers, titles, descriptions);
    }

    public boolean equals(@InterfaceC7395n Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Manifest)) {
            return false;
        }
        Manifest manifest = (Manifest) obj;
        return d2ok.f7l8(this.version, manifest.version) && this.platform == manifest.platform && d2ok.f7l8(this.typeTag, manifest.typeTag) && this.editable == manifest.editable && this.customEdit == manifest.customEdit && d2ok.f7l8(this.authors, manifest.authors) && d2ok.f7l8(this.designers, manifest.designers) && d2ok.f7l8(this.titles, manifest.titles) && d2ok.f7l8(this.descriptions, manifest.descriptions);
    }

    @InterfaceC7396q
    public final Map<String, String> getAuthors() {
        return this.authors;
    }

    public final boolean getCustomEdit() {
        return this.customEdit;
    }

    @InterfaceC7396q
    public final Map<String, String> getDescriptions() {
        return this.descriptions;
    }

    @InterfaceC7396q
    public final Map<String, String> getDesigners() {
        return this.designers;
    }

    public final boolean getEditable() {
        return this.editable;
    }

    public final int getPlatform() {
        return this.platform;
    }

    @InterfaceC7396q
    public final Map<String, String> getTitles() {
        return this.titles;
    }

    @InterfaceC7395n
    public final String getTypeTag() {
        return this.typeTag;
    }

    @InterfaceC7395n
    public final String getVersion() {
        return this.version;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v6, types: [int] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    public int hashCode() {
        String str = this.version;
        int iHashCode = (((str != null ? str.hashCode() : 0) * 31) + Integer.hashCode(this.platform)) * 31;
        String str2 = this.typeTag;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z2 = this.editable;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int i2 = (iHashCode2 + r2) * 31;
        boolean z3 = this.customEdit;
        int i3 = (i2 + (z3 ? 1 : z3)) * 31;
        Map<String, String> map = this.authors;
        int iHashCode3 = (i3 + (map != null ? map.hashCode() : 0)) * 31;
        Map<String, String> map2 = this.designers;
        int iHashCode4 = (iHashCode3 + (map2 != null ? map2.hashCode() : 0)) * 31;
        Map<String, String> map3 = this.titles;
        int iHashCode5 = (iHashCode4 + (map3 != null ? map3.hashCode() : 0)) * 31;
        Map<String, String> map4 = this.descriptions;
        return iHashCode5 + (map4 != null ? map4.hashCode() : 0);
    }

    public final void setCustomEdit(boolean z2) {
        this.customEdit = z2;
    }

    public final void setEditable(boolean z2) {
        this.editable = z2;
    }

    public final void setPlatform(int i2) {
        this.platform = i2;
    }

    public final void setTypeTag(@InterfaceC7395n String str) {
        this.typeTag = str;
    }

    public final void setVersion(@InterfaceC7395n String str) {
        this.version = str;
    }

    @InterfaceC7396q
    public String toString() {
        return "Manifest(version=" + this.version + ", platform=" + this.platform + ", typeTag=" + this.typeTag + ", editable=" + this.editable + ", customEdit=" + this.customEdit + ", authors=" + this.authors + ", designers=" + this.designers + ", titles=" + this.titles + ", descriptions=" + this.descriptions + ")";
    }

    public /* synthetic */ Manifest(String str, int i2, String str2, boolean z2, boolean z3, Map map, Map map2, Map map3, Map map4, int i3, ni7 ni7Var) {
        this((i3 & 1) != 0 ? null : str, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) == 0 ? str2 : null, (i3 & 8) != 0 ? false : z2, (i3 & 16) == 0 ? z3 : false, (i3 & 32) != 0 ? new LinkedHashMap() : map, (i3 & 64) != 0 ? new LinkedHashMap() : map2, (i3 & 128) != 0 ? new LinkedHashMap() : map3, (i3 & 256) != 0 ? new LinkedHashMap() : map4);
    }
}
