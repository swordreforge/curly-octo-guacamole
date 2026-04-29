package py;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: py.k */
/* JADX INFO: compiled from: GridStickyDecoration.java */
/* JADX INFO: loaded from: classes2.dex */
public class C7611k extends RecyclerView.kja0 {
    @Override // androidx.recyclerview.widget.RecyclerView.kja0
    /* JADX INFO: renamed from: s */
    public void mo4713s(Canvas c2, RecyclerView parent, RecyclerView.mcp state) {
        View childAt;
        super.mo4713s(c2, parent, state);
        int itemCount = parent.getAdapter().getItemCount();
        int iFindLastVisibleItemPosition = ((LinearLayoutManager) parent.getLayoutManager()).findLastVisibleItemPosition();
        int iFindFirstCompletelyVisibleItemPosition = ((LinearLayoutManager) parent.getLayoutManager()).findFirstCompletelyVisibleItemPosition();
        int i2 = itemCount - 1;
        if (iFindLastVisibleItemPosition != i2 || (childAt = parent.getLayoutManager().getChildAt(i2)) == null) {
            return;
        }
        if (iFindFirstCompletelyVisibleItemPosition != 0 || iFindLastVisibleItemPosition <= 0) {
            childAt.setTranslationY(0.0f);
            return;
        }
        int height = parent.getHeight() - childAt.getBottom();
        if (height > 0) {
            childAt.setTranslationY(height);
        }
    }
}
