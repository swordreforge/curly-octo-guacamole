package androidx.preference;

import android.R;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.preference.fn3e;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes.dex */
public class DropDownPreference extends ListPreference {
    private Spinner dy;
    private final ArrayAdapter sk1t;
    private final AdapterView.OnItemSelectedListener vb6;
    private final Context zmmu;

    /* JADX INFO: renamed from: androidx.preference.DropDownPreference$k */
    class C0988k implements AdapterView.OnItemSelectedListener {
        C0988k() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
            if (i2 >= 0) {
                String string = DropDownPreference.this.bap7()[i2].toString();
                if (string.equals(DropDownPreference.this.h4b()) || !DropDownPreference.this.zy(string)) {
                    return;
                }
                DropDownPreference.this.a5id(string);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public DropDownPreference(@lvui Context context) {
        this(context, null);
    }

    private void o05() {
        this.sk1t.clear();
        if (ngy() != null) {
            for (CharSequence charSequence : ngy()) {
                this.sk1t.add(charSequence.toString());
            }
        }
    }

    private int oki(String str) {
        CharSequence[] charSequenceArrBap7 = bap7();
        if (str == null || charSequenceArrBap7 == null) {
            return -1;
        }
        for (int length = charSequenceArrBap7.length - 1; length >= 0; length--) {
            if (TextUtils.equals(charSequenceArrBap7[length].toString(), str)) {
                return length;
            }
        }
        return -1;
    }

    @Override // androidx.preference.ListPreference
    public void e5(@lvui CharSequence[] charSequenceArr) {
        super.e5(charSequenceArr);
        o05();
    }

    @lvui
    protected ArrayAdapter gcp() {
        return new ArrayAdapter(this.zmmu, R.layout.simple_spinner_dropdown_item);
    }

    @Override // androidx.preference.ListPreference
    public void lw(int i2) {
        a5id(bap7()[i2].toString());
    }

    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    /* JADX INFO: renamed from: m */
    protected void mo4639m() {
        this.dy.performClick();
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: o */
    public void mo4638o(@lvui C1016i c1016i) {
        Spinner spinner = (Spinner) c1016i.itemView.findViewById(fn3e.C1007g.f5466y);
        this.dy = spinner;
        spinner.setAdapter((SpinnerAdapter) this.sk1t);
        this.dy.setOnItemSelectedListener(this.vb6);
        this.dy.setSelection(oki(h4b()));
        super.mo4638o(c1016i);
    }

    @Override // androidx.preference.Preference
    protected void uv6() {
        super.uv6();
        ArrayAdapter arrayAdapter = this.sk1t;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    public DropDownPreference(@lvui Context context, @dd AttributeSet attributeSet) {
        this(context, attributeSet, fn3e.C1008k.f51794n7h);
    }

    public DropDownPreference(@lvui Context context, @dd AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public DropDownPreference(@lvui Context context, @dd AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.vb6 = new C0988k();
        this.zmmu = context;
        this.sk1t = gcp();
        o05();
    }
}
