package miuix.appcompat.internal.adapter;

import android.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import gb.toq;
import zy.dd;
import zy.lvui;

/* JADX INFO: renamed from: miuix.appcompat.internal.adapter.k */
/* JADX INFO: compiled from: SpinnerCheckableArrayAdapter.java */
/* JADX INFO: loaded from: classes3.dex */
public class C6963k extends ArrayAdapter {

    /* JADX INFO: renamed from: g */
    public static final int f39020g = toq.C6054p.a4ph;

    /* JADX INFO: renamed from: k */
    private ArrayAdapter f39021k;

    /* JADX INFO: renamed from: n */
    private LayoutInflater f39022n;

    /* JADX INFO: renamed from: q */
    private toq f39023q;

    /* JADX INFO: renamed from: miuix.appcompat.internal.adapter.k$toq */
    /* JADX INFO: compiled from: SpinnerCheckableArrayAdapter.java */
    public interface toq {
        /* JADX INFO: renamed from: k */
        boolean mo25093k(int i2);
    }

    /* JADX INFO: renamed from: miuix.appcompat.internal.adapter.k$zy */
    /* JADX INFO: compiled from: SpinnerCheckableArrayAdapter.java */
    private static class zy {

        /* JADX INFO: renamed from: k */
        FrameLayout f39024k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        RadioButton f86899toq;

        private zy() {
        }
    }

    public C6963k(@lvui Context context, int i2, ArrayAdapter arrayAdapter, toq toqVar) {
        super(context, i2, R.id.text1);
        this.f39022n = LayoutInflater.from(context);
        this.f39021k = arrayAdapter;
        this.f39023q = toqVar;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public int getCount() {
        return this.f39021k.getCount();
    }

    @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i2, @dd View view, @lvui ViewGroup viewGroup) {
        boolean z2 = false;
        if (view == null || view.getTag(f39020g) == null) {
            view = this.f39022n.inflate(toq.qrj.f76683bz2, viewGroup, false);
            zy zyVar = new zy();
            zyVar.f39024k = (FrameLayout) view.findViewById(toq.C6054p.iw);
            zyVar.f86899toq = (RadioButton) view.findViewById(R.id.checkbox);
            view.setTag(f39020g, zyVar);
        }
        Object tag = view.getTag(f39020g);
        if (tag != null) {
            zy zyVar2 = (zy) tag;
            View dropDownView = this.f39021k.getDropDownView(i2, zyVar2.f39024k.getChildAt(0), viewGroup);
            zyVar2.f39024k.removeAllViews();
            zyVar2.f39024k.addView(dropDownView);
            toq toqVar = this.f39023q;
            if (toqVar != null && toqVar.mo25093k(i2)) {
                z2 = true;
            }
            zyVar2.f86899toq.setChecked(z2);
            view.setActivated(z2);
        }
        return view;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    @dd
    public Object getItem(int i2) {
        return this.f39021k.getItem(i2);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public long getItemId(int i2) {
        return this.f39021k.getItemId(i2);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return this.f39021k.hasStableIds();
    }

    @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        this.f39021k.notifyDataSetChanged();
    }

    public C6963k(@lvui Context context, ArrayAdapter arrayAdapter, toq toqVar) {
        this(context, toq.qrj.f76705gc3c, arrayAdapter, toqVar);
    }
}
