package miuix.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.preference.C1016i;
import androidx.preference.Preference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import miuix.appcompat.adapter.C6897k;
import miuix.appcompat.internal.adapter.C6963k;
import miuix.appcompat.widget.Spinner;
import miuix.preference.kja0;
import zy.InterfaceC7837n;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class DropDownPreference extends Preference {
    private static final String tgs = "DropDownPreference";
    private static final Class<?>[] yl25 = {Context.class, AttributeSet.class};
    private static final CharSequence[] zmmu = new CharSequence[0];
    private ArrayAdapter aj;
    private Spinner ar;
    private CharSequence[] bc;
    private Drawable[] bd;
    private ArrayAdapter be;
    private String bs;
    private CharSequence[] bu;
    private boolean k0;
    private Handler tlhn;
    private final AdapterView.OnItemSelectedListener w97r;

    private static class f7l8 implements C6963k.toq {

        /* JADX INFO: renamed from: k */
        private DropDownPreference f41129k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private ArrayAdapter f88111toq;

        public f7l8(DropDownPreference dropDownPreference, ArrayAdapter arrayAdapter) {
            this.f41129k = dropDownPreference;
            this.f88111toq = arrayAdapter;
        }

        @Override // miuix.appcompat.internal.adapter.C6963k.toq
        /* JADX INFO: renamed from: k */
        public boolean mo25093k(int i2) {
            if (i2 < this.f41129k.bu.length && i2 >= 0) {
                return TextUtils.equals(this.f41129k.nsb(), this.f41129k.bu[i2]);
            }
            Log.e(DropDownPreference.tgs, "pos out of entries' length.");
            return false;
        }
    }

    /* JADX INFO: renamed from: miuix.preference.DropDownPreference$g */
    private static class C7277g extends C6897k {

        /* JADX INFO: renamed from: s */
        private CharSequence[] f41130s;

        C7277g(Context context, AttributeSet attributeSet, int i2, int i3) {
            int[] iArr;
            super(context, 0);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, kja0.ki.tdsa, i2, i3);
            this.f38731k = androidx.core.content.res.kja0.cdj(typedArrayObtainStyledAttributes, kja0.ki.wc6, 0);
            this.f41130s = androidx.core.content.res.kja0.cdj(typedArrayObtainStyledAttributes, kja0.ki.trbh, 0);
            this.f38733q = androidx.core.content.res.kja0.cdj(typedArrayObtainStyledAttributes, kja0.ki.ax, 0);
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(kja0.ki.e2, -1);
            typedArrayObtainStyledAttributes.recycle();
            if (resourceId > 0) {
                TypedArray typedArrayObtainTypedArray = context.getResources().obtainTypedArray(resourceId);
                iArr = new int[typedArrayObtainTypedArray.length()];
                for (int i4 = 0; i4 < typedArrayObtainTypedArray.length(); i4++) {
                    iArr[i4] = typedArrayObtainTypedArray.getResourceId(i4, 0);
                }
                typedArrayObtainTypedArray.recycle();
            } else {
                iArr = null;
            }
            m24823y(iArr);
        }

        public CharSequence[] ld6() {
            return this.f41130s;
        }

        public void x2(CharSequence[] charSequenceArr) {
            this.f41130s = charSequenceArr;
        }
    }

    /* JADX INFO: renamed from: miuix.preference.DropDownPreference$k */
    class C7278k implements AdapterView.OnItemSelectedListener {

        /* JADX INFO: renamed from: miuix.preference.DropDownPreference$k$k */
        class k implements Runnable {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ String f41132k;

            k(String str) {
                this.f41132k = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.f41132k.equals(DropDownPreference.this.nsb()) || !DropDownPreference.this.zy(this.f41132k)) {
                    return;
                }
                DropDownPreference.this.dxef(this.f41132k);
            }
        }

        C7278k() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
            if (i2 < 0 || i2 >= DropDownPreference.this.bu.length) {
                Log.d(DropDownPreference.tgs, "Illegal Position In Entry Values' Array. ");
            } else {
                DropDownPreference.this.tlhn.post(new k((String) DropDownPreference.this.bu[i2]));
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* JADX INFO: renamed from: miuix.preference.DropDownPreference$n */
    class ViewOnTouchListenerC7279n implements View.OnTouchListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ C1016i f41134k;

        ViewOnTouchListenerC7279n(C1016i c1016i) {
            this.f41134k = c1016i;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                float rawX = motionEvent.getRawX();
                float rawY = motionEvent.getRawY();
                DropDownPreference.this.ar.setFenceXFromView(view);
                DropDownPreference.this.ar.n7h(rawX, rawY);
                this.f41134k.itemView.setSelected(true);
                TextView textView = (TextView) this.f41134k.itemView.findViewById(R.id.title);
                if (textView != null) {
                    textView.setSelected(false);
                }
                TextView textView2 = (TextView) this.f41134k.itemView.findViewById(R.id.summary);
                if (textView2 != null) {
                    textView2.setSelected(false);
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: miuix.preference.DropDownPreference$q */
    class C7280q implements Spinner.f7l8 {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ C1016i f41136k;

        C7280q(C1016i c1016i) {
            this.f41136k = c1016i;
        }

        @Override // miuix.appcompat.widget.Spinner.f7l8
        /* JADX INFO: renamed from: k */
        public void mo25459k() {
            this.f41136k.itemView.setSelected(false);
        }
    }

    class toq implements Runnable {
        toq() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DropDownPreference.this.be.notifyDataSetChanged();
        }
    }

    class zy implements Runnable {
        zy() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DropDownPreference.this.ar.setOnItemSelectedListener(DropDownPreference.this.w97r);
        }
    }

    public DropDownPreference(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    private int m28300do(String str) {
        if (this.bu == null) {
            return -1;
        }
        int i2 = 0;
        while (true) {
            CharSequence[] charSequenceArr = this.bu;
            if (i2 >= charSequenceArr.length) {
                return -1;
            }
            if (TextUtils.equals(charSequenceArr[i2], str)) {
                return i2;
            }
            i2++;
        }
    }

    private ArrayAdapter n2t(Context context, AttributeSet attributeSet, String str) {
        try {
            Constructor constructor = context.getClassLoader().loadClass(str).asSubclass(ArrayAdapter.class).getConstructor(yl25);
            Object[] objArr = {context, attributeSet};
            constructor.setAccessible(true);
            return (ArrayAdapter) constructor.newInstance(objArr);
        } catch (ClassNotFoundException e2) {
            throw new IllegalStateException("Can't find Adapter: " + str, e2);
        } catch (IllegalAccessException e3) {
            throw new IllegalStateException("Can't access non-public constructor " + str, e3);
        } catch (InstantiationException e4) {
            e = e4;
            throw new IllegalStateException("Could not instantiate the Adapter: " + str, e);
        } catch (NoSuchMethodException e6) {
            throw new IllegalStateException("Error creating Adapter " + str, e6);
        } catch (InvocationTargetException e7) {
            e = e7;
            throw new IllegalStateException("Could not instantiate the Adapter: " + str, e);
        }
    }

    private void wx16(Spinner spinner) {
        spinner.setClickable(false);
        spinner.setLongClickable(false);
        spinner.setContextClickable(false);
    }

    private void yl() {
        ArrayAdapter arrayAdapter = this.aj;
        if (arrayAdapter instanceof C7277g) {
            this.bc = ((C7277g) arrayAdapter).m24819k();
            this.bu = ((C7277g) this.aj).ld6();
            this.bd = ((C7277g) this.aj).zy();
            return;
        }
        int count = arrayAdapter.getCount();
        this.bc = new CharSequence[this.aj.getCount()];
        for (int i2 = 0; i2 < count; i2++) {
            this.bc[i2] = this.aj.getItem(i2).toString();
        }
        this.bu = this.bc;
        this.bd = null;
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: a */
    protected Parcelable mo4640a() {
        Parcelable parcelableMo4640a = super.mo4640a();
        if (n5r1()) {
            return parcelableMo4640a;
        }
        SavedState savedState = new SavedState(parcelableMo4640a);
        savedState.f41128k = nsb();
        return savedState;
    }

    @Override // androidx.preference.Preference
    protected void a98o(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(SavedState.class)) {
            super.a98o(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.a98o(savedState.getSuperState());
        dxef(savedState.f41128k);
    }

    public void bap7(int[] iArr) {
        ArrayAdapter arrayAdapter = this.aj;
        if (arrayAdapter instanceof C7277g) {
            ((C7277g) arrayAdapter).m24823y(iArr);
            this.bd = ((C7277g) this.aj).zy();
        }
        uv6();
    }

    public void dxef(String str) {
        boolean z2 = !TextUtils.equals(this.bs, str);
        if (z2 || !this.k0) {
            this.bs = str;
            this.k0 = true;
            c8jq(str);
            if (z2) {
                uv6();
            }
        }
    }

    public void e5(CharSequence[] charSequenceArr) {
        ArrayAdapter arrayAdapter = this.aj;
        if (arrayAdapter instanceof C7277g) {
            ((C7277g) arrayAdapter).m24821p(charSequenceArr);
            uv6();
        }
    }

    public Drawable[] ebn() {
        return this.bd;
    }

    public void ga(CharSequence[] charSequenceArr) {
        ArrayAdapter arrayAdapter = this.aj;
        if (arrayAdapter instanceof C7277g) {
            ((C7277g) arrayAdapter).x2(charSequenceArr);
            this.be.notifyDataSetChanged();
            this.bu = charSequenceArr;
        }
    }

    public void h4b(Drawable[] drawableArr) {
        ArrayAdapter arrayAdapter = this.aj;
        if (arrayAdapter instanceof C7277g) {
            ((C7277g) arrayAdapter).m24822s(drawableArr);
            this.bd = ((C7277g) this.aj).zy();
        }
        uv6();
    }

    public CharSequence[] ij() {
        ArrayAdapter arrayAdapter = this.aj;
        if (arrayAdapter instanceof C7277g) {
            ((C7277g) arrayAdapter).m24820n();
        }
        return zmmu;
    }

    public int ixz(String str) {
        return m28300do(str);
    }

    public void lh(CharSequence[] charSequenceArr) {
        this.bc = charSequenceArr;
        ArrayAdapter arrayAdapter = this.aj;
        if (arrayAdapter instanceof C7277g) {
            ((C7277g) arrayAdapter).f7l8(charSequenceArr);
        } else {
            arrayAdapter.clear();
            this.aj.addAll(charSequenceArr);
            this.bu = this.bc;
        }
        Spinner spinner = this.ar;
        if (spinner != null) {
            spinner.setSelection(m28300do(nsb()));
        }
        uv6();
    }

    @Override // androidx.preference.Preference
    protected void lv5(View view) {
        Spinner spinner = this.ar;
        if (spinner != null) {
            spinner.performClick();
            Log.d(tgs, "trigger from perform click");
        }
    }

    public void ngy(@InterfaceC7837n int i2) {
        lh(x2().getResources().getTextArray(i2));
    }

    public String nsb() {
        return this.bs;
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: o */
    public void mo4638o(C1016i c1016i) {
        if (this.be.getCount() > 0) {
            Spinner spinner = (Spinner) c1016i.itemView.findViewById(kja0.C7296p.j3px);
            this.ar = spinner;
            spinner.setImportantForAccessibility(2);
            wx16(this.ar);
            this.ar.setAdapter((SpinnerAdapter) this.be);
            this.ar.setOnItemSelectedListener(null);
            this.ar.setSelection(m28300do(nsb()));
            this.ar.post(new zy());
            this.ar.setOnSpinnerDismissListener(new C7280q(c1016i));
            c1016i.itemView.setOnTouchListener(new ViewOnTouchListenerC7279n(c1016i));
        }
        super.mo4638o(c1016i);
    }

    public CharSequence[] pc() {
        ArrayAdapter arrayAdapter = this.aj;
        return arrayAdapter instanceof C7277g ? ((C7277g) arrayAdapter).ld6() : zmmu;
    }

    public void pjz9(ArrayAdapter arrayAdapter) {
        this.aj = arrayAdapter;
        this.be = uc();
        yl();
    }

    ArrayAdapter uc() {
        Context contextX2 = x2();
        ArrayAdapter arrayAdapter = this.aj;
        return new C6963k(contextX2, arrayAdapter, new f7l8(this, arrayAdapter));
    }

    public CharSequence[] ukdy() {
        return this.bc;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public void uv6() {
        super.uv6();
        if (this.be != null) {
            this.tlhn.post(new toq());
        }
    }

    public void vy(int i2) {
        dxef(this.bu[i2].toString());
        Spinner spinner = this.ar;
        if (spinner != null) {
            spinner.setSelection(i2);
        }
    }

    public void wlev(@InterfaceC7837n int i2) {
        ga(x2().getResources().getTextArray(i2));
    }

    @Override // androidx.preference.Preference
    protected Object y9n(TypedArray typedArray, int i2) {
        return typedArray.getString(i2);
    }

    @Override // androidx.preference.Preference
    protected void zp(Object obj) {
        dxef(a9((String) obj));
    }

    public int zwy() {
        return ixz(this.bs);
    }

    private static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: miuix.preference.DropDownPreference.SavedState.1
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
        String f41128k;

        SavedState(Parcel parcel) {
            super(parcel);
            this.f41128k = parcel.readString();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@lvui Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeString(this.f41128k);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, kja0.C7297q.kho);
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.tlhn = new Handler();
        this.w97r = new C7278k();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, kja0.ki.tdsa, i2, i3);
        String string = typedArrayObtainStyledAttributes.getString(kja0.ki.ru);
        typedArrayObtainStyledAttributes.recycle();
        if (!TextUtils.isEmpty(string)) {
            this.aj = n2t(context, attributeSet, string);
        } else {
            this.aj = new C7277g(context, attributeSet, i2, i3);
        }
        this.be = uc();
        yl();
    }
}
