package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.preference.Preference;
import androidx.preference.fn3e;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes.dex */
public class SeekBarPreference extends Preference {
    private static final String zmmu = "SeekBarPreference";
    int aj;
    boolean ar;
    SeekBar bc;
    boolean bd;
    int be;
    private int bs;
    private TextView bu;
    private int k0;
    private final SeekBar.OnSeekBarChangeListener tgs;
    private boolean tlhn;
    boolean w97r;
    private final View.OnKeyListener yl25;

    /* JADX INFO: renamed from: androidx.preference.SeekBarPreference$k */
    class C1002k implements SeekBar.OnSeekBarChangeListener {
        C1002k() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i2, boolean z2) {
            if (z2) {
                SeekBarPreference seekBarPreference = SeekBarPreference.this;
                if (seekBarPreference.w97r || !seekBarPreference.ar) {
                    seekBarPreference.zwy(seekBar);
                    return;
                }
            }
            SeekBarPreference seekBarPreference2 = SeekBarPreference.this;
            seekBarPreference2.n2t(i2 + seekBarPreference2.aj);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.ar = true;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.ar = false;
            int progress = seekBar.getProgress();
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if (progress + seekBarPreference.aj != seekBarPreference.be) {
                seekBarPreference.zwy(seekBar);
            }
        }
    }

    class toq implements View.OnKeyListener {
        toq() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i2, KeyEvent keyEvent) {
            if (keyEvent.getAction() != 0) {
                return false;
            }
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if ((!seekBarPreference.bd && (i2 == 21 || i2 == 22)) || i2 == 23 || i2 == 66) {
                return false;
            }
            SeekBar seekBar = seekBarPreference.bc;
            if (seekBar != null) {
                return seekBar.onKeyDown(i2, keyEvent);
            }
            Log.e(SeekBarPreference.zmmu, "SeekBar view is null and hence cannot be adjusted.");
            return false;
        }
    }

    public SeekBarPreference(@lvui Context context, @dd AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.tgs = new C1002k();
        this.yl25 = new toq();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, fn3e.ld6.f51820bz2, i2, i3);
        this.aj = typedArrayObtainStyledAttributes.getInt(fn3e.ld6.f51814b3e, 0);
        ixz(typedArrayObtainStyledAttributes.getInt(fn3e.ld6.f51858jz5, 100));
        ukdy(typedArrayObtainStyledAttributes.getInt(fn3e.ld6.f51816bek6, 0));
        this.bd = typedArrayObtainStyledAttributes.getBoolean(fn3e.ld6.f51862ktq, true);
        this.tlhn = typedArrayObtainStyledAttributes.getBoolean(fn3e.ld6.f51825cv06, false);
        this.w97r = typedArrayObtainStyledAttributes.getBoolean(fn3e.ld6.f51847h7am, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    private void nsb(int i2, boolean z2) {
        int i3 = this.aj;
        if (i2 < i3) {
            i2 = i3;
        }
        int i4 = this.bs;
        if (i2 > i4) {
            i2 = i4;
        }
        if (i2 != this.be) {
            this.be = i2;
            n2t(i2);
            bo(i2);
            if (z2) {
                uv6();
            }
        }
    }

    @Override // androidx.preference.Preference
    @dd
    /* JADX INFO: renamed from: a */
    protected Parcelable mo4640a() {
        Parcelable parcelableMo4640a = super.mo4640a();
        if (n5r1()) {
            return parcelableMo4640a;
        }
        SavedState savedState = new SavedState(parcelableMo4640a);
        savedState.f5438k = this.be;
        savedState.f5440q = this.aj;
        savedState.f5439n = this.bs;
        return savedState;
    }

    @Override // androidx.preference.Preference
    protected void a98o(@dd Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(SavedState.class)) {
            super.a98o(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.a98o(savedState.getSuperState());
        this.be = savedState.f5438k;
        this.aj = savedState.f5440q;
        this.bs = savedState.f5439n;
        uv6();
    }

    public int cv06() {
        return this.bs;
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public void m28247do(int i2) {
        int i3 = this.bs;
        if (i2 > i3) {
            i2 = i3;
        }
        if (i2 != this.aj) {
            this.aj = i2;
            uv6();
        }
    }

    public void ebn(boolean z2) {
        this.tlhn = z2;
        uv6();
    }

    public int h7am() {
        return this.aj;
    }

    public void ij(int i2) {
        nsb(i2, true);
    }

    public final void ixz(int i2) {
        int i3 = this.aj;
        if (i2 < i3) {
            i2 = i3;
        }
        if (i2 != this.bs) {
            this.bs = i2;
            uv6();
        }
    }

    public boolean jbh() {
        return this.w97r;
    }

    public boolean mbx() {
        return this.tlhn;
    }

    void n2t(int i2) {
        TextView textView = this.bu;
        if (textView != null) {
            textView.setText(String.valueOf(i2));
        }
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: o */
    public void mo4638o(@lvui C1016i c1016i) {
        super.mo4638o(c1016i);
        c1016i.itemView.setOnKeyListener(this.yl25);
        this.bc = (SeekBar) c1016i.fn3e(fn3e.C1007g.f5461g);
        TextView textView = (TextView) c1016i.fn3e(fn3e.C1007g.f51767f7l8);
        this.bu = textView;
        if (this.tlhn) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            this.bu = null;
        }
        SeekBar seekBar = this.bc;
        if (seekBar == null) {
            Log.e(zmmu, "SeekBar view is null in onBindViewHolder.");
            return;
        }
        seekBar.setOnSeekBarChangeListener(this.tgs);
        this.bc.setMax(this.bs - this.aj);
        int i2 = this.k0;
        if (i2 != 0) {
            this.bc.setKeyProgressIncrement(i2);
        } else {
            this.k0 = this.bc.getKeyProgressIncrement();
        }
        this.bc.setProgress(this.be - this.aj);
        n2t(this.be);
        this.bc.setEnabled(ncyb());
    }

    public void pc(boolean z2) {
        this.w97r = z2;
    }

    public boolean uc() {
        return this.bd;
    }

    public final void ukdy(int i2) {
        if (i2 != this.k0) {
            this.k0 = Math.min(this.bs - this.aj, Math.abs(i2));
            uv6();
        }
    }

    public final int vep5() {
        return this.k0;
    }

    public void wx16(boolean z2) {
        this.bd = z2;
    }

    @Override // androidx.preference.Preference
    @dd
    protected Object y9n(@lvui TypedArray typedArray, int i2) {
        return Integer.valueOf(typedArray.getInt(i2, 0));
    }

    public int yl() {
        return this.be;
    }

    @Override // androidx.preference.Preference
    protected void zp(Object obj) {
        if (obj == null) {
            obj = 0;
        }
        ij(mcp(((Integer) obj).intValue()));
    }

    void zwy(@lvui SeekBar seekBar) {
        int progress = this.aj + seekBar.getProgress();
        if (progress != this.be) {
            if (zy(Integer.valueOf(progress))) {
                nsb(progress, false);
            } else {
                seekBar.setProgress(this.be - this.aj);
                n2t(this.be);
            }
        }
    }

    private static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: androidx.preference.SeekBarPreference.SavedState.1
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        };

        /* JADX INFO: renamed from: k */
        int f5438k;

        /* JADX INFO: renamed from: n */
        int f5439n;

        /* JADX INFO: renamed from: q */
        int f5440q;

        SavedState(Parcel parcel) {
            super(parcel);
            this.f5438k = parcel.readInt();
            this.f5440q = parcel.readInt();
            this.f5439n = parcel.readInt();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f5438k);
            parcel.writeInt(this.f5440q);
            parcel.writeInt(this.f5439n);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public SeekBarPreference(@lvui Context context, @dd AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public SeekBarPreference(@lvui Context context, @dd AttributeSet attributeSet) {
        this(context, attributeSet, fn3e.C1008k.f51784hyr);
    }

    public SeekBarPreference(@lvui Context context) {
        this(context, null);
    }
}
