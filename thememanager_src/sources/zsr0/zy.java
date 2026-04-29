package zsr0;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.views.BatchOperationAdapter;
import zy.lvui;

/* JADX INFO: compiled from: RemoteLargeIconItemOffsetDecoration.java */
/* JADX INFO: loaded from: classes2.dex */
public class zy extends RecyclerView.kja0 {

    /* JADX INFO: renamed from: k */
    private int f46073k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f100812toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private BatchOperationAdapter f100813zy;

    public zy(BatchOperationAdapter adapter, @lvui Context context) {
        this.f46073k = context.getResources().getDimensionPixelSize(R.dimen.rc_icon_mine_item_padding_lr);
        this.f100812toq = context.getResources().getDimensionPixelSize(R.dimen.rc_icon_mine_item_padding_bottom);
        this.f100813zy = adapter;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.kja0
    /* JADX INFO: renamed from: n */
    public void mo4711n(Rect outRect, View view, RecyclerView parent, RecyclerView.mcp state) {
        int itemViewType = this.f100813zy.getItemViewType(parent.getChildAdapterPosition(view));
        if (this.f100813zy != null) {
            if (itemViewType == 9) {
                int i2 = this.f46073k;
                outRect.set(i2, 0, i2, this.f100812toq);
            } else {
                int i3 = this.f46073k;
                outRect.set(i3, 0, i3, 0);
            }
        }
    }
}
