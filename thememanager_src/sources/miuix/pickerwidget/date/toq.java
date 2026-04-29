package miuix.pickerwidget.date;

import android.content.Context;
import android.content.res.Resources;
import java.util.Locale;
import miuix.core.util.cdj;
import wtop.toq;
import zy.lvui;

/* JADX INFO: compiled from: CalendarFormatSymbols.java */
/* JADX INFO: loaded from: classes3.dex */
public class toq {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static cdj<toq> f87981toq;

    /* JADX INFO: renamed from: k */
    private Resources f40814k;

    /* JADX INFO: renamed from: miuix.pickerwidget.date.toq$k */
    /* JADX INFO: compiled from: CalendarFormatSymbols.java */
    class C7231k extends cdj<toq> {
        C7231k() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // miuix.core.util.cdj
        /* JADX INFO: renamed from: f7l8, reason: merged with bridge method [inline-methods] */
        public toq toq(Object obj) {
            return new toq((Context) obj, null);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // miuix.core.util.cdj
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public void mo25522g(toq toqVar, Object obj) {
            super.mo25522g(toqVar, obj);
            toqVar.fn3e((Context) obj);
        }
    }

    /* synthetic */ toq(Context context, C7231k c7231k) {
        this(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fn3e(@lvui Context context) {
        this.f40814k = context.getResources();
    }

    public static toq n7h(@lvui Context context) {
        if (f87981toq == null) {
            f87981toq = new C7231k();
        }
        return f87981toq.m25525q(context);
    }

    public String[] cdj() {
        return this.f40814k.getStringArray(toq.zy.f98740qrj);
    }

    public String[] f7l8() {
        return this.f40814k.getStringArray(toq.zy.f45292g);
    }

    /* JADX INFO: renamed from: g */
    public String[] m26293g() {
        return this.f40814k.getStringArray(toq.zy.f45295n);
    }

    /* JADX INFO: renamed from: h */
    public String[] m26294h() {
        return this.f40814k.getStringArray(toq.zy.f45293h);
    }

    /* JADX INFO: renamed from: i */
    public String[] m26295i() {
        return this.f40814k.getStringArray(toq.zy.f98737kja0);
    }

    public String[] ki() {
        return this.f40814k.getStringArray(toq.zy.f98735cdj);
    }

    public String[] kja0() {
        return this.f40814k.getStringArray(toq.zy.f98742x2);
    }

    public String[] ld6() {
        return this.f40814k.getStringArray(toq.zy.f45296p);
    }

    /* JADX INFO: renamed from: n */
    public String[] m26296n() {
        return this.f40814k.getStringArray(toq.zy.f45297q);
    }

    /* JADX INFO: renamed from: p */
    public String[] m26297p() {
        return this.f40814k.getStringArray(toq.zy.f45298s);
    }

    /* JADX INFO: renamed from: q */
    public String[] m26298q() {
        return this.f40814k.getStringArray(toq.zy.f98743zy);
    }

    public String[] qrj() {
        return this.f40814k.getStringArray(toq.zy.f98738ld6);
    }

    /* JADX INFO: renamed from: s */
    public String[] m26299s() {
        return this.f40814k.getStringArray(toq.zy.f45299y);
    }

    public String[] t8r() {
        return this.f40814k.getStringArray(toq.zy.f98739n7h);
    }

    public String[] toq() {
        return this.f40814k.getStringArray(toq.zy.f45294k);
    }

    public Locale x2() {
        return Locale.getDefault();
    }

    /* JADX INFO: renamed from: y */
    public String[] m26300y() {
        return this.f40814k.getStringArray(toq.zy.f98736f7l8);
    }

    public String[] zy() {
        return this.f40814k.getStringArray(toq.zy.f98741toq);
    }

    private toq(@lvui Context context) {
        this.f40814k = context.getResources();
    }
}
