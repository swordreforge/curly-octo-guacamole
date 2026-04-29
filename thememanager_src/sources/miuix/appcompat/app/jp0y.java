package miuix.appcompat.app;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: compiled from: IContentInsetState.java */
/* JADX INFO: loaded from: classes3.dex */
public interface jp0y {
    void bindViewWithContentInset(View view);

    Rect getContentInset();

    void onContentInsetChanged(Rect rect);

    void onDispatchNestedScrollOffset(int[] iArr);

    void onProcessBindViewWithContentInset(Rect rect);

    boolean requestDispatchContentInset();

    void setCorrectNestedScrollMotionEventEnabled(boolean z2);
}
