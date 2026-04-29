package androidx.core.graphics;

import android.graphics.Canvas;
import android.graphics.Picture;
import com.android.thememanager.controller.online.InterfaceC1925p;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import kotlin.was;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: androidx.core.graphics.i */
/* JADX INFO: compiled from: Picture.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a6\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0086\b¨\u0006\n"}, d2 = {"Landroid/graphics/Picture;", "", "width", InterfaceC1925p.byf, "Lkotlin/Function1;", "Landroid/graphics/Canvas;", "Lkotlin/was;", "Lkotlin/fn3e;", "block", "k", "core-ktx_release"}, m22787k = 2, mv = {1, 4, 0})
public final class C0534i {
    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public static final Picture m2488k(@InterfaceC7396q Picture record, int i2, int i3, @InterfaceC7396q cyoe.x2<? super Canvas, was> block) {
        d2ok.cdj(record, "$this$record");
        d2ok.cdj(block, "block");
        Canvas c2 = record.beginRecording(i2, i3);
        try {
            d2ok.m23085y(c2, "c");
            block.invoke(c2);
            return record;
        } finally {
            kotlin.jvm.internal.d3.m23090q(1);
            record.endRecording();
            kotlin.jvm.internal.d3.zy(1);
        }
    }
}
