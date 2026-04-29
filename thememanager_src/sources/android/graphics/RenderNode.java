package android.graphics;

import android.annotation.NonNull;
import android.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RenderNode {
    static {
        throw new NoClassDefFoundError();
    }

    public /* synthetic */ RenderNode(@Nullable String str) {
    }

    @NonNull
    public native /* synthetic */ RecordingCanvas beginRecording();

    public native /* synthetic */ void discardDisplayList();

    public native /* synthetic */ void endRecording();

    public native /* synthetic */ boolean setPosition(int i2, int i3, int i4, int i5);
}
