package androidx.core.widget;

import android.widget.ListView;
import zy.lvui;

/* JADX INFO: compiled from: ListViewAutoScrollHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class n7h extends AbstractViewOnTouchListenerC0752k {
    private final ListView bl;

    public n7h(@lvui ListView listView) {
        super(listView);
        this.bl = listView;
    }

    @Override // androidx.core.widget.AbstractViewOnTouchListenerC0752k
    /* JADX INFO: renamed from: k */
    public boolean mo3638k(int i2) {
        return false;
    }

    @Override // androidx.core.widget.AbstractViewOnTouchListenerC0752k
    public boolean toq(int i2) {
        ListView listView = this.bl;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i3 = firstVisiblePosition + childCount;
        if (i2 > 0) {
            if (i3 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else {
            if (i2 >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.core.widget.AbstractViewOnTouchListenerC0752k
    public void x2(int i2, int i3) {
        kja0.toq(this.bl, i3);
    }
}
