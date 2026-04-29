package miuix.internal.widget;

import android.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import gb.toq;
import java.util.ArrayList;
import miuix.internal.util.C7169q;

/* JADX INFO: renamed from: miuix.internal.widget.y */
/* JADX INFO: compiled from: PopupMenuAdapter.java */
/* JADX INFO: loaded from: classes3.dex */
public class C7183y extends BaseAdapter {

    /* JADX INFO: renamed from: k */
    private LayoutInflater f40505k;

    /* JADX INFO: renamed from: n */
    private Context f40506n;

    /* JADX INFO: renamed from: q */
    private ArrayList<MenuItem> f40507q;

    /* JADX INFO: renamed from: miuix.internal.widget.y$toq */
    /* JADX INFO: compiled from: PopupMenuAdapter.java */
    private static class toq {

        /* JADX INFO: renamed from: k */
        ImageView f40508k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        TextView f87827toq;

        private toq() {
        }
    }

    C7183y(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: k */
    private void m26046k(Menu menu, ArrayList<MenuItem> arrayList) {
        arrayList.clear();
        if (menu != null) {
            int size = menu.size();
            for (int i2 = 0; i2 < size; i2++) {
                MenuItem item = menu.getItem(i2);
                if (toq(item)) {
                    arrayList.add(item);
                }
            }
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f40507q.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i2) {
        return i2;
    }

    @Override // android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f40505k.inflate(toq.qrj.f76700fnq8, viewGroup, false);
            toq toqVar = new toq();
            toqVar.f40508k = (ImageView) view.findViewById(R.id.icon);
            toqVar.f87827toq = (TextView) view.findViewById(R.id.text1);
            view.setTag(toq.C6054p.km9o, toqVar);
            C7169q.toq(view);
        }
        miuix.internal.util.ld6.zy(view, i2, getCount());
        Object tag = view.getTag(toq.C6054p.km9o);
        if (tag != null) {
            toq toqVar2 = (toq) tag;
            MenuItem item = getItem(i2);
            if (item.getIcon() != null) {
                toqVar2.f40508k.setImageDrawable(item.getIcon());
                toqVar2.f40508k.setVisibility(0);
            } else {
                toqVar2.f40508k.setVisibility(8);
            }
            toqVar2.f87827toq.setText(item.getTitle());
        }
        return view;
    }

    /* JADX INFO: renamed from: q */
    public void m26047q(Menu menu) {
        m26046k(menu, this.f40507q);
        notifyDataSetChanged();
    }

    protected boolean toq(MenuItem menuItem) {
        return menuItem.isVisible();
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
    public MenuItem getItem(int i2) {
        return this.f40507q.get(i2);
    }

    protected C7183y(Context context, Menu menu) {
        this.f40505k = LayoutInflater.from(context);
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        this.f40507q = arrayList;
        if (menu != null) {
            m26046k(menu, arrayList);
        }
        this.f40506n = context;
    }
}
