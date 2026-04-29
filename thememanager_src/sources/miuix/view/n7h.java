package miuix.view;

import android.view.ActionMode;
import android.view.View;
import android.widget.EditText;

/* JADX INFO: compiled from: SearchActionMode.java */
/* JADX INFO: loaded from: classes3.dex */
public interface n7h {

    /* JADX INFO: renamed from: miuix.view.n7h$k */
    /* JADX INFO: compiled from: SearchActionMode.java */
    public interface InterfaceC7384k {
        /* JADX INFO: renamed from: k */
        void mo25151k(int i2);

        void toq(boolean z2);
    }

    /* JADX INFO: compiled from: SearchActionMode.java */
    public interface toq extends ActionMode.Callback {
    }

    void f7l8(View view);

    /* JADX INFO: renamed from: g */
    void mo25253g(boolean z2);

    View getCustomView();

    /* JADX INFO: renamed from: k */
    void mo25254k(InterfaceC7382k interfaceC7382k);

    void ld6(View view);

    EditText qrj();

    void setCustomView(View view);

    void t8r(View view);

    void toq(InterfaceC7382k interfaceC7382k);

    /* JADX INFO: renamed from: y */
    void mo25255y(InterfaceC7384k interfaceC7384k);

    void zy();
}
