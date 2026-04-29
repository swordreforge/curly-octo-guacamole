package androidx.preference;

import android.R;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.android.thememanager.controller.online.InterfaceC1925p;
import zy.dd;
import zy.lvui;
import zy.uv6;

/* JADX INFO: compiled from: EditTextPreferenceDialogFragmentCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class zy extends ld6 {
    private static final String aj = "EditTextPreferenceDialogFragment.text";
    private static final int bs = 1000;
    private EditText ad;
    private CharSequence am;
    private final Runnable ay = new RunnableC1041k();
    private long be = -1;

    /* JADX INFO: renamed from: androidx.preference.zy$k */
    /* JADX INFO: compiled from: EditTextPreferenceDialogFragmentCompat.java */
    class RunnableC1041k implements Runnable {
        RunnableC1041k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            zy.this.gb();
        }
    }

    private void btvn(boolean z2) {
        this.be = z2 ? SystemClock.currentThreadTimeMillis() : -1L;
    }

    @lvui
    public static zy kbj(String str) {
        zy zyVar = new zy();
        Bundle bundle = new Bundle(1);
        bundle.putString(InterfaceC1925p.qn, str);
        zyVar.setArguments(bundle);
        return zyVar;
    }

    private boolean ob() {
        long j2 = this.be;
        return j2 != -1 && j2 + 1000 > SystemClock.currentThreadTimeMillis();
    }

    private EditTextPreference tww7() {
        return (EditTextPreference) yp31();
    }

    @Override // androidx.preference.ld6
    protected void el(@lvui View view) {
        super.el(view);
        EditText editText = (EditText) view.findViewById(R.id.edit);
        this.ad = editText;
        if (editText == null) {
            throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
        }
        editText.requestFocus();
        this.ad.setText(this.am);
        EditText editText2 = this.ad;
        editText2.setSelection(editText2.getText().length());
        if (tww7().pjz9() != null) {
            tww7().pjz9().m4642k(this.ad);
        }
    }

    @Override // androidx.preference.ld6
    @uv6({uv6.EnumC7844k.LIBRARY})
    protected void f1bi() {
        btvn(true);
        gb();
    }

    @Override // androidx.preference.ld6
    public void g0ad(boolean z2) {
        if (z2) {
            String string = this.ad.getText().toString();
            EditTextPreference editTextPreferenceTww7 = tww7();
            if (editTextPreferenceTww7.zy(string)) {
                editTextPreferenceTww7.bap7(string);
            }
        }
    }

    @uv6({uv6.EnumC7844k.LIBRARY})
    void gb() {
        if (ob()) {
            EditText editText = this.ad;
            if (editText == null || !editText.isFocused()) {
                btvn(false);
            } else if (((InputMethodManager) this.ad.getContext().getSystemService("input_method")).showSoftInput(this.ad, 0)) {
                btvn(false);
            } else {
                this.ad.removeCallbacks(this.ay);
                this.ad.postDelayed(this.ay, 50L);
            }
        }
    }

    @Override // androidx.preference.ld6, androidx.fragment.app.zy, androidx.fragment.app.Fragment
    public void onCreate(@dd Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.am = tww7().ngy();
        } else {
            this.am = bundle.getCharSequence(aj);
        }
    }

    @Override // androidx.preference.ld6, androidx.fragment.app.zy, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@lvui Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence(aj, this.am);
    }

    @Override // androidx.preference.ld6
    @uv6({uv6.EnumC7844k.LIBRARY})
    protected boolean zff0() {
        return true;
    }
}
