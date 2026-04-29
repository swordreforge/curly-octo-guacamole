package androidx.cursoradapter.widget;

import android.database.Cursor;
import android.widget.Filter;

/* JADX INFO: compiled from: CursorFilter.java */
/* JADX INFO: loaded from: classes.dex */
class toq extends Filter {

    /* JADX INFO: renamed from: k */
    InterfaceC0775k f4327k;

    /* JADX INFO: renamed from: androidx.cursoradapter.widget.toq$k */
    /* JADX INFO: compiled from: CursorFilter.java */
    interface InterfaceC0775k {
        CharSequence convertToString(Cursor cursor);

        /* JADX INFO: renamed from: k */
        void mo602k(Cursor cursor);

        Cursor toq(CharSequence charSequence);

        Cursor zy();
    }

    toq(InterfaceC0775k interfaceC0775k) {
        this.f4327k = interfaceC0775k;
    }

    @Override // android.widget.Filter
    public CharSequence convertResultToString(Object obj) {
        return this.f4327k.convertToString((Cursor) obj);
    }

    @Override // android.widget.Filter
    protected Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor qVar = this.f4327k.toq(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (qVar != null) {
            filterResults.count = qVar.getCount();
            filterResults.values = qVar;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    @Override // android.widget.Filter
    protected void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor cursorZy = this.f4327k.zy();
        Object obj = filterResults.values;
        if (obj == null || obj == cursorZy) {
            return;
        }
        this.f4327k.mo602k((Cursor) obj);
    }
}
