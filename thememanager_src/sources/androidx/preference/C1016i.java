package androidx.preference;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.C0683f;
import androidx.preference.fn3e;
import androidx.recyclerview.widget.RecyclerView;
import zy.InterfaceC7843t;
import zy.dd;
import zy.lvui;
import zy.uv6;

/* JADX INFO: renamed from: androidx.preference.i */
/* JADX INFO: compiled from: PreferenceViewHolder.java */
/* JADX INFO: loaded from: classes.dex */
public class C1016i extends RecyclerView.fti {

    /* JADX INFO: renamed from: g */
    private boolean f5545g;

    /* JADX INFO: renamed from: k */
    @dd
    private final Drawable f5546k;

    /* JADX INFO: renamed from: n */
    private final SparseArray<View> f5547n;

    /* JADX INFO: renamed from: q */
    private ColorStateList f5548q;

    /* JADX INFO: renamed from: y */
    private boolean f5549y;

    C1016i(@lvui View view) {
        super(view);
        SparseArray<View> sparseArray = new SparseArray<>(4);
        this.f5547n = sparseArray;
        TextView textView = (TextView) view.findViewById(R.id.title);
        sparseArray.put(R.id.title, textView);
        sparseArray.put(R.id.summary, view.findViewById(R.id.summary));
        sparseArray.put(R.id.icon, view.findViewById(R.id.icon));
        int i2 = fn3e.C1007g.f5462k;
        sparseArray.put(i2, view.findViewById(i2));
        sparseArray.put(16908350, view.findViewById(16908350));
        this.f5546k = view.getBackground();
        if (textView != null) {
            this.f5548q = textView.getTextColors();
        }
    }

    @lvui
    @uv6({uv6.EnumC7844k.TESTS})
    public static C1016i ki(@lvui View view) {
        return new C1016i(view);
    }

    public View fn3e(@InterfaceC7843t int i2) {
        View view = this.f5547n.get(i2);
        if (view != null) {
            return view;
        }
        View viewFindViewById = this.itemView.findViewById(i2);
        if (viewFindViewById != null) {
            this.f5547n.put(i2, viewFindViewById);
        }
        return viewFindViewById;
    }

    public boolean fu4() {
        return this.f5549y;
    }

    public boolean ni7() {
        return this.f5545g;
    }

    public void o1t(boolean z2) {
        this.f5545g = z2;
    }

    public void wvg(boolean z2) {
        this.f5549y = z2;
    }

    /* JADX INFO: renamed from: z */
    void m4686z() {
        Drawable background = this.itemView.getBackground();
        Drawable drawable = this.f5546k;
        if (background != drawable) {
            C0683f.wlev(this.itemView, drawable);
        }
        TextView textView = (TextView) fn3e(R.id.title);
        if (textView == null || this.f5548q == null || textView.getTextColors().equals(this.f5548q)) {
            return;
        }
        textView.setTextColor(this.f5548q);
    }
}
