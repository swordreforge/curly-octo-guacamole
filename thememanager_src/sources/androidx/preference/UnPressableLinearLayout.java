package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import zy.dd;
import zy.lvui;
import zy.uv6;

/* JADX INFO: loaded from: classes.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public class UnPressableLinearLayout extends LinearLayout {
    public UnPressableLinearLayout(@lvui Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSetPressed(boolean z2) {
    }

    public UnPressableLinearLayout(@lvui Context context, @dd AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
