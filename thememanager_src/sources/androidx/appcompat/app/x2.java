package androidx.appcompat.app;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AbstractC0096k;

/* JADX INFO: compiled from: NavItemSelectedListener.java */
/* JADX INFO: loaded from: classes.dex */
class x2 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: k */
    private final AbstractC0096k.n f334k;

    public x2(AbstractC0096k.n nVar) {
        this.f334k = nVar;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
        AbstractC0096k.n nVar = this.f334k;
        if (nVar != null) {
            nVar.onNavigationItemSelected(i2, j2);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
