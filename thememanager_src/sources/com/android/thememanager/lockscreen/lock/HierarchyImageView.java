package com.android.thememanager.lockscreen.lock;

import android.content.Context;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.android.thememanager.lockscreen.lock.wallpaper.t8r;
import com.miui.keyguardtemplate.C5115y;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.ni7;
import l05.InterfaceC6768s;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: HierarchyImageView.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class HierarchyImageView extends AppCompatImageView implements t8r {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC6768s
    public HierarchyImageView(@InterfaceC7396q Context context) {
        this(context, null, 0, 6, null);
        d2ok.m23075h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC6768s
    public HierarchyImageView(@InterfaceC7396q Context context, @InterfaceC7395n AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        d2ok.m23075h(context, "context");
    }

    public /* synthetic */ HierarchyImageView(Context context, AttributeSet attributeSet, int i2, int i3, ni7 ni7Var) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i2);
    }

    @Override // com.android.thememanager.lockscreen.lock.wallpaper.t8r
    /* JADX INFO: renamed from: h */
    public void mo8039h(@InterfaceC7395n Matrix matrix) {
        if (getVisibility() != 0 || getDrawable() == null) {
            return;
        }
        setImageMatrix(matrix);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @InterfaceC6768s
    public HierarchyImageView(@InterfaceC7396q Context context, @InterfaceC7395n AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        d2ok.m23075h(context, "context");
        setScaleType(ImageView.ScaleType.MATRIX);
        C5115y.zy(this, "doodle", " uniform shader doodle;\n vec4 main(vec2 coord) {\n     vec4 color = doodle.eval(coord);\n     return color;\n}", "doodle", " uniform shader doodle;\n vec4 main(vec2 coord) {\n     vec4 color = doodle.eval(coord);\n     return color;\n}");
    }
}
