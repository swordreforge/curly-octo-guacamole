package com.miui.maml.widget.edit;

import android.content.Context;
import com.miui.maml.component.MamlView;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.ni7;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: widgetEditSave.kt */
/* JADX INFO: loaded from: classes3.dex */
@d3(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u0006\u0010 \u001a\u00020!R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u001a\u0010\u001c\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000b\"\u0004\b\u001e\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0012¨\u0006\""}, d2 = {"Lcom/miui/maml/widget/edit/MamlViewBuilder;", "", "context", "Landroid/content/Context;", "path", "", "type", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "autoRemoveCache", "", "getAutoRemoveCache", "()Z", "setAutoRemoveCache", "(Z)V", "getContext", "()Landroid/content/Context;", "innerPath", "getInnerPath", "()Ljava/lang/String;", "setInnerPath", "(Ljava/lang/String;)V", "mode", "", "getMode", "()I", "setMode", "(I)V", "getPath", "resetVar", "getResetVar", "setResetVar", "getType", "create", "Lcom/miui/maml/component/MamlView;", "widget-edit_release"}, m22787k = 1, mv = {1, 4, 2})
public final class MamlViewBuilder {
    private boolean autoRemoveCache;

    @InterfaceC7396q
    private final Context context;

    @InterfaceC7395n
    private String innerPath;
    private int mode;

    @InterfaceC7396q
    private final String path;
    private boolean resetVar;

    @InterfaceC7395n
    private final String type;

    public MamlViewBuilder(@InterfaceC7396q Context context, @InterfaceC7396q String path, @InterfaceC7395n String str) {
        d2ok.m23075h(context, "context");
        d2ok.m23075h(path, "path");
        this.context = context;
        this.path = path;
        this.type = str;
        this.mode = 1;
    }

    @InterfaceC7396q
    public final MamlView create() {
        return new MamlView(this.context, this.path, this.innerPath, this.mode, this.autoRemoveCache, this.type);
    }

    public final boolean getAutoRemoveCache() {
        return this.autoRemoveCache;
    }

    @InterfaceC7396q
    public final Context getContext() {
        return this.context;
    }

    @InterfaceC7395n
    public final String getInnerPath() {
        return this.innerPath;
    }

    public final int getMode() {
        return this.mode;
    }

    @InterfaceC7396q
    public final String getPath() {
        return this.path;
    }

    public final boolean getResetVar() {
        return this.resetVar;
    }

    @InterfaceC7395n
    public final String getType() {
        return this.type;
    }

    public final void setAutoRemoveCache(boolean z2) {
        this.autoRemoveCache = z2;
    }

    public final void setInnerPath(@InterfaceC7395n String str) {
        this.innerPath = str;
    }

    public final void setMode(int i2) {
        this.mode = i2;
    }

    public final void setResetVar(boolean z2) {
        this.resetVar = z2;
    }

    public /* synthetic */ MamlViewBuilder(Context context, String str, String str2, int i2, ni7 ni7Var) {
        this(context, str, (i2 & 4) != 0 ? null : str2);
    }
}
