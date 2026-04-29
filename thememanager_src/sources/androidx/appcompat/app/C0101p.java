package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.InflateException;
import android.view.View;
import androidx.appcompat.view.C0136q;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatCheckedTextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.AppCompatToggleButton;
import androidx.appcompat.widget.ek5k;
import androidx.core.view.C0683f;
import com.miui.maml.elements.ButtonScreenElement;
import com.miui.maml.util.ConfigFile;
import com.xiaomi.onetrack.api.C5693g;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p030n.C7397k;
import zy.dd;
import zy.lvui;

/* JADX INFO: renamed from: androidx.appcompat.app.p */
/* JADX INFO: compiled from: AppCompatViewInflater.java */
/* JADX INFO: loaded from: classes.dex */
public class C0101p {

    /* JADX INFO: renamed from: y */
    private static final String f308y = "AppCompatViewInflater";

    /* JADX INFO: renamed from: k */
    private final Object[] f309k = new Object[2];

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final Class<?>[] f46613toq = {Context.class, AttributeSet.class};

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final int[] f46614zy = {R.attr.onClick};

    /* JADX INFO: renamed from: q */
    private static final int[] f306q = {R.attr.accessibilityHeading};

    /* JADX INFO: renamed from: n */
    private static final int[] f305n = {R.attr.accessibilityPaneTitle};

    /* JADX INFO: renamed from: g */
    private static final int[] f304g = {R.attr.screenReaderFocusable};

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final String[] f46612f7l8 = {"android.widget.", "android.view.", "android.webkit."};

    /* JADX INFO: renamed from: s */
    private static final androidx.collection.qrj<String, Constructor<? extends View>> f307s = new androidx.collection.qrj<>();

    /* JADX INFO: renamed from: androidx.appcompat.app.p$k */
    /* JADX INFO: compiled from: AppCompatViewInflater.java */
    private static class k implements View.OnClickListener {

        /* JADX INFO: renamed from: g */
        private Context f310g;

        /* JADX INFO: renamed from: k */
        private final View f311k;

        /* JADX INFO: renamed from: n */
        private Method f312n;

        /* JADX INFO: renamed from: q */
        private final String f313q;

        public k(@lvui View view, @lvui String str) {
            this.f311k = view;
            this.f313q = str;
        }

        /* JADX INFO: renamed from: k */
        private void m223k(@dd Context context) {
            String str;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f313q, View.class)) != null) {
                        this.f312n = method;
                        this.f310g = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            int id = this.f311k.getId();
            if (id == -1) {
                str = "";
            } else {
                str = " with id '" + this.f311k.getContext().getResources().getResourceEntryName(id) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f313q + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f311k.getClass() + str);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(@lvui View view) {
            if (this.f312n == null) {
                m223k(this.f311k.getContext());
            }
            try {
                this.f312n.invoke(this.f310g, view);
            } catch (IllegalAccessException e2) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e2);
            } catch (InvocationTargetException e3) {
                throw new IllegalStateException("Could not execute method for android:onClick", e3);
            }
        }
    }

    private static Context fn3e(Context context, AttributeSet attributeSet, boolean z2, boolean z3) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7397k.qrj.u4, 0, 0);
        int resourceId = z2 ? typedArrayObtainStyledAttributes.getResourceId(C7397k.qrj.hfwa, 0) : 0;
        if (z3 && resourceId == 0 && (resourceId = typedArrayObtainStyledAttributes.getResourceId(C7397k.qrj.h4g, 0)) != 0) {
            Log.i(f308y, "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        typedArrayObtainStyledAttributes.recycle();
        return resourceId != 0 ? ((context instanceof C0136q) && ((C0136q) context).zy() == resourceId) ? context : new C0136q(context, resourceId) : context;
    }

    /* JADX INFO: renamed from: i */
    private View m214i(Context context, String str, AttributeSet attributeSet) {
        if (str.equals(C5693g.ae)) {
            str = attributeSet.getAttributeValue(null, C5693g.f31802r);
        }
        try {
            Object[] objArr = this.f309k;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 != str.indexOf(46)) {
                return t8r(context, str, null);
            }
            int i2 = 0;
            while (true) {
                String[] strArr = f46612f7l8;
                if (i2 >= strArr.length) {
                    return null;
                }
                View viewT8r = t8r(context, str, strArr[i2]);
                if (viewT8r != null) {
                    return viewT8r;
                }
                i2++;
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr2 = this.f309k;
            objArr2[0] = null;
            objArr2[1] = null;
        }
    }

    /* JADX INFO: renamed from: k */
    private void m215k(@lvui Context context, @lvui View view, @lvui AttributeSet attributeSet) {
        if (Build.VERSION.SDK_INT > 28) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f306q);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            C0683f.n2t(view, typedArrayObtainStyledAttributes.getBoolean(0, false));
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f305n);
        if (typedArrayObtainStyledAttributes2.hasValue(0)) {
            C0683f.ngy(view, typedArrayObtainStyledAttributes2.getString(0));
        }
        typedArrayObtainStyledAttributes2.recycle();
        TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f304g);
        if (typedArrayObtainStyledAttributes3.hasValue(0)) {
            C0683f.o5(view, typedArrayObtainStyledAttributes3.getBoolean(0, false));
        }
        typedArrayObtainStyledAttributes3.recycle();
    }

    private View t8r(Context context, String str, String str2) throws InflateException, ClassNotFoundException {
        String str3;
        androidx.collection.qrj<String, Constructor<? extends View>> qrjVar = f307s;
        Constructor<? extends View> constructor = qrjVar.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f46613toq);
            qrjVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return constructor.newInstance(this.f309k);
    }

    private void toq(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if ((context instanceof ContextWrapper) && C0683f.d8wk(view)) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f46614zy);
            String string = typedArrayObtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new k(view, string));
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private void zurt(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }

    @dd
    protected View cdj(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    @lvui
    protected AppCompatEditText f7l8(Context context, AttributeSet attributeSet) {
        return new AppCompatEditText(context, attributeSet);
    }

    @lvui
    /* JADX INFO: renamed from: g */
    protected AppCompatCheckedTextView m216g(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckedTextView(context, attributeSet);
    }

    @lvui
    /* JADX INFO: renamed from: h */
    protected AppCompatToggleButton m217h(Context context, AttributeSet attributeSet) {
        return new AppCompatToggleButton(context, attributeSet);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    final View ki(View view, String str, @lvui Context context, @lvui AttributeSet attributeSet, boolean z2, boolean z3, boolean z5, boolean z6) {
        View viewX2;
        Context context2 = (!z2 || view == null) ? context : view.getContext();
        if (z3 || z5) {
            context2 = fn3e(context2, attributeSet, z3, z5);
        }
        if (z6) {
            context2 = ek5k.toq(context2);
        }
        str.hashCode();
        byte b2 = -1;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    b2 = 0;
                }
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    b2 = 1;
                }
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    b2 = 2;
                }
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    b2 = 3;
                }
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    b2 = 4;
                }
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    b2 = 5;
                }
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    b2 = 6;
                }
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    b2 = 7;
                }
                break;
            case 799298502:
                if (str.equals("ToggleButton")) {
                    b2 = 8;
                }
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    b2 = 9;
                }
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    b2 = 10;
                }
                break;
            case 1601505219:
                if (str.equals(ConfigFile.TAG_CHECK_BOX)) {
                    b2 = com.google.common.base.zy.f68132qrj;
                }
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    b2 = com.google.common.base.zy.f68128n7h;
                }
                break;
            case 2001146706:
                if (str.equals(ButtonScreenElement.TAG_NAME)) {
                    b2 = com.google.common.base.zy.f68124kja0;
                }
                break;
        }
        switch (b2) {
            case 0:
                viewX2 = x2(context2, attributeSet);
                zurt(viewX2, str);
                break;
            case 1:
                viewX2 = m216g(context2, attributeSet);
                zurt(viewX2, str);
                break;
            case 2:
                viewX2 = m219p(context2, attributeSet);
                zurt(viewX2, str);
                break;
            case 3:
                viewX2 = kja0(context2, attributeSet);
                zurt(viewX2, str);
                break;
            case 4:
                viewX2 = m222y(context2, attributeSet);
                zurt(viewX2, str);
                break;
            case 5:
                viewX2 = qrj(context2, attributeSet);
                zurt(viewX2, str);
                break;
            case 6:
                viewX2 = n7h(context2, attributeSet);
                zurt(viewX2, str);
                break;
            case 7:
                viewX2 = ld6(context2, attributeSet);
                zurt(viewX2, str);
                break;
            case 8:
                viewX2 = m217h(context2, attributeSet);
                zurt(viewX2, str);
                break;
            case 9:
                viewX2 = m221s(context2, attributeSet);
                zurt(viewX2, str);
                break;
            case 10:
                viewX2 = zy(context2, attributeSet);
                zurt(viewX2, str);
                break;
            case 11:
                viewX2 = mo218n(context2, attributeSet);
                zurt(viewX2, str);
                break;
            case 12:
                viewX2 = f7l8(context2, attributeSet);
                zurt(viewX2, str);
                break;
            case 13:
                viewX2 = mo220q(context2, attributeSet);
                zurt(viewX2, str);
                break;
            default:
                viewX2 = cdj(context2, str, attributeSet);
                break;
        }
        if (viewX2 == null && context != context2) {
            viewX2 = m214i(context2, str, attributeSet);
        }
        if (viewX2 != null) {
            toq(viewX2, attributeSet);
            m215k(context2, viewX2, attributeSet);
        }
        return viewX2;
    }

    @lvui
    protected AppCompatTextView kja0(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    @lvui
    protected AppCompatRadioButton ld6(Context context, AttributeSet attributeSet) {
        return new AppCompatRadioButton(context, attributeSet);
    }

    @lvui
    /* JADX INFO: renamed from: n */
    protected AppCompatCheckBox mo218n(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckBox(context, attributeSet);
    }

    @lvui
    protected AppCompatSpinner n7h(Context context, AttributeSet attributeSet) {
        return new AppCompatSpinner(context, attributeSet);
    }

    @lvui
    /* JADX INFO: renamed from: p */
    protected AppCompatMultiAutoCompleteTextView m219p(Context context, AttributeSet attributeSet) {
        return new AppCompatMultiAutoCompleteTextView(context, attributeSet);
    }

    @lvui
    /* JADX INFO: renamed from: q */
    protected AppCompatButton mo220q(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    @lvui
    protected AppCompatSeekBar qrj(Context context, AttributeSet attributeSet) {
        return new AppCompatSeekBar(context, attributeSet);
    }

    @lvui
    /* JADX INFO: renamed from: s */
    protected AppCompatImageView m221s(Context context, AttributeSet attributeSet) {
        return new AppCompatImageView(context, attributeSet);
    }

    @lvui
    protected AppCompatRatingBar x2(Context context, AttributeSet attributeSet) {
        return new AppCompatRatingBar(context, attributeSet);
    }

    @lvui
    /* JADX INFO: renamed from: y */
    protected AppCompatImageButton m222y(Context context, AttributeSet attributeSet) {
        return new AppCompatImageButton(context, attributeSet);
    }

    @lvui
    protected AppCompatAutoCompleteTextView zy(Context context, AttributeSet attributeSet) {
        return new AppCompatAutoCompleteTextView(context, attributeSet);
    }
}
