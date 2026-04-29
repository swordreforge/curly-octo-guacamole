package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.appcompat.widget.InterfaceC0218r;
import zy.uv6;

/* JADX INFO: loaded from: classes.dex */
@zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public class FitWindowsLinearLayout extends LinearLayout implements InterfaceC0218r {

    /* JADX INFO: renamed from: k */
    private InterfaceC0218r.k f804k;

    public FitWindowsLinearLayout(@zy.lvui Context context) {
        super(context);
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        InterfaceC0218r.k kVar = this.f804k;
        if (kVar != null) {
            kVar.mo144k(rect);
        }
        return super.fitSystemWindows(rect);
    }

    @Override // androidx.appcompat.widget.InterfaceC0218r
    public void setOnFitSystemWindowsListener(InterfaceC0218r.k kVar) {
        this.f804k = kVar;
    }

    public FitWindowsLinearLayout(@zy.lvui Context context, @zy.dd AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
