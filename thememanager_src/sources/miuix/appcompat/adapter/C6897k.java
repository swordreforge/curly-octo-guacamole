package miuix.appcompat.adapter;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import gb.toq;
import zy.dd;
import zy.lvui;

/* JADX INFO: renamed from: miuix.appcompat.adapter.k */
/* JADX INFO: compiled from: SpinnerDoubleLineContentAdapter.java */
/* JADX INFO: loaded from: classes3.dex */
public class C6897k extends ArrayAdapter {

    /* JADX INFO: renamed from: y */
    private static final int f38729y = toq.C6054p.xknm;

    /* JADX INFO: renamed from: g */
    private LayoutInflater f38730g;

    /* JADX INFO: renamed from: k */
    protected CharSequence[] f38731k;

    /* JADX INFO: renamed from: n */
    protected Drawable[] f38732n;

    /* JADX INFO: renamed from: q */
    protected CharSequence[] f38733q;

    /* JADX INFO: renamed from: miuix.appcompat.adapter.k$toq */
    /* JADX INFO: compiled from: SpinnerDoubleLineContentAdapter.java */
    private static class toq {

        /* JADX INFO: renamed from: k */
        ImageView f38734k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        TextView f86731toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        TextView f86732zy;

        private toq() {
        }
    }

    protected C6897k(Context context, int i2) {
        super(context, i2);
        this.f38730g = LayoutInflater.from(context);
    }

    /* JADX INFO: renamed from: g */
    private CharSequence m24817g(int i2) {
        CharSequence[] charSequenceArr = this.f38733q;
        if (charSequenceArr == null || i2 >= charSequenceArr.length) {
            return null;
        }
        return charSequenceArr[i2];
    }

    /* JADX INFO: renamed from: q */
    private Drawable m24818q(int i2) {
        Drawable[] drawableArr = this.f38732n;
        if (drawableArr == null || i2 >= drawableArr.length) {
            return null;
        }
        return drawableArr[i2];
    }

    private CharSequence toq(int i2) {
        CharSequence[] charSequenceArr = this.f38731k;
        if (charSequenceArr == null || i2 >= charSequenceArr.length) {
            return null;
        }
        return charSequenceArr[i2];
    }

    public void f7l8(CharSequence[] charSequenceArr) {
        this.f38731k = charSequenceArr;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public int getCount() {
        CharSequence[] charSequenceArr = this.f38731k;
        if (charSequenceArr == null) {
            return 0;
        }
        return charSequenceArr.length;
    }

    @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i2, @dd View view, @lvui ViewGroup viewGroup) {
        if (view == null || view.getTag(f38729y) == null) {
            view = this.f38730g.inflate(toq.qrj.f76776zkd, viewGroup, false);
            toq toqVar = new toq();
            toqVar.f38734k = (ImageView) view.findViewById(R.id.icon);
            toqVar.f86731toq = (TextView) view.findViewById(R.id.title);
            toqVar.f86732zy = (TextView) view.findViewById(R.id.summary);
            view.setTag(f38729y, toqVar);
        }
        CharSequence qVar = toq(i2);
        CharSequence charSequenceM24817g = m24817g(i2);
        Drawable drawableM24818q = m24818q(i2);
        Object tag = view.getTag(f38729y);
        if (tag != null) {
            toq toqVar2 = (toq) tag;
            if (TextUtils.isEmpty(qVar)) {
                toqVar2.f86731toq.setVisibility(8);
            } else {
                toqVar2.f86731toq.setText(qVar);
                toqVar2.f86731toq.setVisibility(0);
            }
            if (TextUtils.isEmpty(charSequenceM24817g)) {
                toqVar2.f86732zy.setVisibility(8);
            } else {
                toqVar2.f86732zy.setText(charSequenceM24817g);
                toqVar2.f86732zy.setVisibility(0);
            }
            if (drawableM24818q != null) {
                toqVar2.f38734k.setImageDrawable(drawableM24818q);
                toqVar2.f38734k.setVisibility(0);
            } else {
                toqVar2.f38734k.setVisibility(8);
            }
        }
        return view;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    @dd
    public Object getItem(int i2) {
        CharSequence[] charSequenceArr = this.f38731k;
        if (charSequenceArr == null || i2 < 0 || i2 >= charSequenceArr.length) {
            return null;
        }
        return charSequenceArr[i2];
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public long getItemId(int i2) {
        return i2;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    /* JADX INFO: renamed from: k */
    public CharSequence[] m24819k() {
        return this.f38731k;
    }

    /* JADX INFO: renamed from: n */
    public CharSequence[] m24820n() {
        return this.f38733q;
    }

    /* JADX INFO: renamed from: p */
    public void m24821p(CharSequence[] charSequenceArr) {
        this.f38733q = charSequenceArr;
    }

    /* JADX INFO: renamed from: s */
    public void m24822s(Drawable[] drawableArr) {
        this.f38732n = drawableArr;
    }

    /* JADX INFO: renamed from: y */
    public void m24823y(int[] iArr) {
        if (iArr == null) {
            m24822s(null);
            return;
        }
        Drawable[] drawableArr = new Drawable[iArr.length];
        Resources resources = getContext().getResources();
        for (int i2 = 0; i2 < iArr.length; i2++) {
            int i3 = iArr[i2];
            if (i3 > 0) {
                drawableArr[i2] = resources.getDrawable(i3);
            } else {
                drawableArr[i2] = null;
            }
        }
        m24822s(drawableArr);
    }

    public Drawable[] zy() {
        return this.f38732n;
    }

    public C6897k(Context context, CharSequence[] charSequenceArr, CharSequence[] charSequenceArr2, int[] iArr) {
        this(context, 0);
        this.f38731k = charSequenceArr;
        this.f38733q = charSequenceArr2;
        m24823y(iArr);
    }
}
