package androidx.appcompat.app;

import android.app.Dialog;
import android.os.Bundle;
import zy.dd;
import zy.gvn7;
import zy.lvui;
import zy.uv6;

/* JADX INFO: renamed from: androidx.appcompat.app.s */
/* JADX INFO: compiled from: AppCompatDialogFragment.java */
/* JADX INFO: loaded from: classes.dex */
public class C0103s extends androidx.fragment.app.zy {
    public C0103s() {
    }

    @Override // androidx.fragment.app.zy
    @lvui
    public Dialog nnh(@dd Bundle bundle) {
        return new DialogC0107y(getContext(), v5yj());
    }

    @Override // androidx.fragment.app.zy
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public void rp(@lvui Dialog dialog, int i2) {
        if (!(dialog instanceof DialogC0107y)) {
            super.rp(dialog, i2);
            return;
        }
        DialogC0107y dialogC0107y = (DialogC0107y) dialog;
        if (i2 != 1 && i2 != 2) {
            if (i2 != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        dialogC0107y.m253n(1);
    }

    public C0103s(@gvn7 int i2) {
        super(i2);
    }
}
