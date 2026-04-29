package androidx.transition;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.transition.jk;
import java.util.ArrayList;

/* JADX INFO: compiled from: GhostViewHolder.java */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ViewConstructor"})
class ki extends FrameLayout {

    /* JADX INFO: renamed from: k */
    @zy.lvui
    private ViewGroup f6683k;

    /* JADX INFO: renamed from: q */
    private boolean f6684q;

    ki(ViewGroup viewGroup) {
        super(viewGroup.getContext());
        setClipChildren(false);
        this.f6683k = viewGroup;
        viewGroup.setTag(jk.f7l8.f52512c8jq, this);
        C1194e.toq(this.f6683k).zy(this);
        this.f6684q = true;
    }

    /* JADX INFO: renamed from: g */
    private static boolean m5366g(ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        if (arrayList.isEmpty() || arrayList2.isEmpty() || arrayList.get(0) != arrayList2.get(0)) {
            return true;
        }
        int iMin = Math.min(arrayList.size(), arrayList2.size());
        for (int i2 = 1; i2 < iMin; i2++) {
            View view = arrayList.get(i2);
            View view2 = arrayList2.get(i2);
            if (view != view2) {
                return m5367n(view, view2);
            }
        }
        return arrayList2.size() == iMin;
    }

    /* JADX INFO: renamed from: n */
    private static boolean m5367n(View view, View view2) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        int childCount = viewGroup.getChildCount();
        if (view.getZ() != view2.getZ()) {
            return view.getZ() > view2.getZ();
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(C1194e.m5323k(viewGroup, i2));
            if (childAt == view) {
                return false;
            }
            if (childAt == view2) {
                break;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: q */
    private static void m5368q(View view, ArrayList<View> arrayList) {
        Object parent = view.getParent();
        if (parent instanceof ViewGroup) {
            m5368q((View) parent, arrayList);
        }
        arrayList.add(view);
    }

    static ki toq(@zy.lvui ViewGroup viewGroup) {
        return (ki) viewGroup.getTag(jk.f7l8.f52512c8jq);
    }

    private int zy(ArrayList<View> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int childCount = getChildCount() - 1;
        int i2 = 0;
        while (i2 <= childCount) {
            int i3 = (i2 + childCount) / 2;
            m5368q(((C1215i) getChildAt(i3)).f6464n, arrayList2);
            if (m5366g(arrayList, arrayList2)) {
                i2 = i3 + 1;
            } else {
                childCount = i3 - 1;
            }
            arrayList2.clear();
        }
        return i2;
    }

    void f7l8() {
        if (!this.f6684q) {
            throw new IllegalStateException("This GhostViewHolder is detached!");
        }
        C1194e.toq(this.f6683k).mo5306q(this);
        C1194e.toq(this.f6683k).zy(this);
    }

    /* JADX INFO: renamed from: k */
    void m5369k(C1215i c1215i) {
        ArrayList<View> arrayList = new ArrayList<>();
        m5368q(c1215i.f6464n, arrayList);
        int iZy = zy(arrayList);
        if (iZy < 0 || iZy >= getChildCount()) {
            addView(c1215i);
        } else {
            addView(c1215i, iZy);
        }
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        if (!this.f6684q) {
            throw new IllegalStateException("This GhostViewHolder is detached!");
        }
        super.onViewAdded(view);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if ((getChildCount() == 1 && getChildAt(0) == view) || getChildCount() == 0) {
            this.f6683k.setTag(jk.f7l8.f52512c8jq, null);
            C1194e.toq(this.f6683k).mo5306q(this);
            this.f6684q = false;
        }
    }
}
