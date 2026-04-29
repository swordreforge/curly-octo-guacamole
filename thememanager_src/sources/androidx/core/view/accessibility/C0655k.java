package androidx.core.view.accessibility;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
import zy.lvui;
import zy.uv6;

/* JADX INFO: renamed from: androidx.core.view.accessibility.k */
/* JADX INFO: compiled from: AccessibilityClickableSpanCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0655k extends ClickableSpan {

    /* JADX INFO: renamed from: g */
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public static final String f3914g = "ACCESSIBILITY_CLICKABLE_SPAN_ID";

    /* JADX INFO: renamed from: k */
    private final int f3915k;

    /* JADX INFO: renamed from: n */
    private final int f3916n;

    /* JADX INFO: renamed from: q */
    private final ki f3917q;

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public C0655k(int i2, @lvui ki kiVar, int i3) {
        this.f3915k = i2;
        this.f3917q = kiVar;
        this.f3916n = i3;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(@lvui View view) {
        Bundle bundle = new Bundle();
        bundle.putInt(f3914g, this.f3915k);
        this.f3917q.qo(this.f3916n, bundle);
    }
}
