package etdu;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: WidgetPreviewAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class zy implements ViewPager2.PageTransformer {
    @Override // androidx.viewpager2.widget.ViewPager2.PageTransformer
    public void transformPage(@InterfaceC7396q View page, float f2) {
        d2ok.m23075h(page, "page");
        Object tag = page.getTag();
        d2ok.n7h(tag, "null cannot be cast to non-null type com.android.thememanager.module.detail.PageTransformerObserver");
        ((InterfaceC6012k) tag).kja0(f2);
    }
}
