package miuix.appcompat.internal.view.menu;

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

/* JADX INFO: compiled from: ImmersionMenuAdapter.java */
/* JADX INFO: loaded from: classes3.dex */
public class zy extends BaseAdapter {

    /* JADX INFO: renamed from: k */
    private LayoutInflater f39575k;

    /* JADX INFO: renamed from: n */
    private Context f39576n;

    /* JADX INFO: renamed from: q */
    private ArrayList<MenuItem> f39577q;

    /* JADX INFO: compiled from: ImmersionMenuAdapter.java */
    private static class toq {

        /* JADX INFO: renamed from: k */
        ImageView f39578k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        TextView f87072toq;

        private toq() {
        }
    }

    protected zy(Context context, Menu menu) {
        this.f39575k = LayoutInflater.from(context);
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        this.f39577q = arrayList;
        m25378k(menu, arrayList);
        this.f39576n = context;
    }

    /* JADX INFO: renamed from: k */
    private void m25378k(Menu menu, ArrayList<MenuItem> arrayList) {
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
        return this.f39577q.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i2) {
        return i2;
    }

    @Override // android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f39575k.inflate(toq.qrj.f76693dr, viewGroup, false);
            toq toqVar = new toq();
            toqVar.f39578k = (ImageView) view.findViewById(R.id.icon);
            toqVar.f87072toq = (TextView) view.findViewById(R.id.text1);
            view.setTag(toqVar);
            C7169q.toq(view);
        }
        miuix.internal.util.ld6.m25946q(view, i2, getCount());
        Object tag = view.getTag();
        if (tag != null) {
            toq toqVar2 = (toq) tag;
            MenuItem item = getItem(i2);
            if (item.getIcon() != null) {
                toqVar2.f39578k.setImageDrawable(item.getIcon());
                toqVar2.f39578k.setVisibility(0);
            } else {
                toqVar2.f39578k.setVisibility(8);
            }
            toqVar2.f87072toq.setText(item.getTitle());
        }
        return view;
    }

    /* JADX INFO: renamed from: q */
    public void m25379q(Menu menu) {
        m25378k(menu, this.f39577q);
        notifyDataSetChanged();
    }

    protected boolean toq(MenuItem menuItem) {
        return menuItem.isVisible();
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
    public MenuItem getItem(int i2) {
        return this.f39577q.get(i2);
    }
}
