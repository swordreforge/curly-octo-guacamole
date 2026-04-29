package zsr0;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.views.f7l8;
import zy.lvui;

/* JADX INFO: renamed from: zsr0.k */
/* JADX INFO: compiled from: LocalLargeIconItemOffsetDecoration.java */
/* JADX INFO: loaded from: classes2.dex */
public class C7810k extends RecyclerView.kja0 {

    /* JADX INFO: renamed from: k */
    private int f46071k;

    /* JADX INFO: renamed from: q */
    private f7l8 f46072q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f100810toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private int f100811zy;

    public C7810k(f7l8 adapter, @lvui Context context) {
        this.f46071k = context.getResources().getDimensionPixelSize(R.dimen.rc_icon_mine_item_padding_lr);
        this.f100811zy = context.getResources().getDimensionPixelSize(R.dimen.rc_icon_mine_item_padding_top);
        this.f100810toq = context.getResources().getDimensionPixelSize(R.dimen.rc_large_icon_image_padding_bottom);
        this.f46072q = adapter;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.kja0
    /* JADX INFO: renamed from: n */
    public void mo4711n(@lvui Rect outRect, @lvui View view, @lvui RecyclerView parent, @lvui RecyclerView.mcp state) {
        int itemViewType = this.f46072q.getItemViewType(parent.getChildAdapterPosition(view));
        if (this.f46072q != null) {
            if (itemViewType == 1073741824) {
                int i2 = this.f46071k;
                outRect.set(i2, 0, i2, 0);
            } else {
                int i3 = this.f46071k;
                outRect.set(i3, 0, i3, this.f100810toq);
            }
        }
    }
}
