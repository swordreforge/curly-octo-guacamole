package androidx.preference;

import android.R;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import com.android.thememanager.controller.online.InterfaceC1925p;
import zy.dd;
import zy.lvui;
import zy.uv6;

/* JADX INFO: compiled from: EditTextPreferenceDialogFragment.java */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class toq extends AbstractDialogFragmentC1026p {

    /* JADX INFO: renamed from: o */
    private static final String f5609o = "EditTextPreferenceDialogFragment.text";

    /* JADX INFO: renamed from: e */
    private EditText f5610e;

    /* JADX INFO: renamed from: j */
    private CharSequence f5611j;

    @Deprecated
    public toq() {
    }

    @lvui
    @Deprecated
    /* JADX INFO: renamed from: s */
    public static toq m4723s(String str) {
        toq toqVar = new toq();
        Bundle bundle = new Bundle(1);
        bundle.putString(InterfaceC1925p.qn, str);
        toqVar.setArguments(bundle);
        return toqVar;
    }

    /* JADX INFO: renamed from: y */
    private EditTextPreference m4724y() {
        return (EditTextPreference) m4706k();
    }

    @Override // androidx.preference.AbstractDialogFragmentC1026p
    @Deprecated
    /* JADX INFO: renamed from: n */
    public void mo4683n(boolean z2) {
        if (z2) {
            String string = this.f5610e.getText().toString();
            if (m4724y().zy(string)) {
                m4724y().bap7(string);
            }
        }
    }

    @Override // androidx.preference.AbstractDialogFragmentC1026p, android.app.DialogFragment, android.app.Fragment
    public void onCreate(@dd Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.f5611j = m4724y().ngy();
        } else {
            this.f5611j = bundle.getCharSequence(f5609o);
        }
    }

    @Override // androidx.preference.AbstractDialogFragmentC1026p, android.app.DialogFragment, android.app.Fragment
    public void onSaveInstanceState(@lvui Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence(f5609o, this.f5611j);
    }

    @Override // androidx.preference.AbstractDialogFragmentC1026p
    @uv6({uv6.EnumC7844k.LIBRARY})
    protected boolean toq() {
        return true;
    }

    @Override // androidx.preference.AbstractDialogFragmentC1026p
    protected void zy(@lvui View view) {
        super.zy(view);
        EditText editText = (EditText) view.findViewById(R.id.edit);
        this.f5610e = editText;
        editText.requestFocus();
        EditText editText2 = this.f5610e;
        if (editText2 == null) {
            throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
        }
        editText2.setText(this.f5611j);
        EditText editText3 = this.f5610e;
        editText3.setSelection(editText3.getText().length());
    }
}
