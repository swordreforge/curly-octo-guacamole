package miuix.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.preference.C1016i;
import androidx.preference.Preference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import miuix.preference.kja0;
import zy.dd;

/* JADX INFO: loaded from: classes2.dex */
public class TextPreference extends Preference {
    private int aj;
    private CharSequence be;
    private InterfaceC7287k bs;

    /* JADX INFO: renamed from: miuix.preference.TextPreference$k */
    public interface InterfaceC7287k<T extends TextPreference> {
        /* JADX INFO: renamed from: k */
        CharSequence m26474k(T t2);
    }

    public TextPreference(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, kja0.ki.nlg, i2, i3);
        CharSequence text = typedArrayObtainStyledAttributes.getText(kja0.ki.kls);
        String string = typedArrayObtainStyledAttributes.getString(kja0.ki.czt);
        typedArrayObtainStyledAttributes.recycle();
        if (!TextUtils.isEmpty(text)) {
            jbh(text.toString());
        }
        yl(cv06(context, string));
    }

    private InterfaceC7287k cv06(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            Constructor constructor = context.getClassLoader().loadClass(str).asSubclass(InterfaceC7287k.class).getConstructor(new Class[0]);
            constructor.setAccessible(true);
            return (InterfaceC7287k) constructor.newInstance(new Object[0]);
        } catch (ClassNotFoundException e2) {
            throw new IllegalStateException("Can't find provider: " + str, e2);
        } catch (IllegalAccessException e3) {
            throw new IllegalStateException("Can't access non-public constructor " + str, e3);
        } catch (InstantiationException e4) {
            throw new IllegalStateException("Could not instantiate the TextProvider: " + str, e4);
        } catch (NoSuchMethodException e6) {
            throw new IllegalStateException("Error creating TextProvider " + str, e6);
        } catch (InvocationTargetException e7) {
            throw new IllegalStateException("Could not instantiate the TextProvider: " + str, e7);
        }
    }

    public CharSequence h7am() {
        return vep5() != null ? vep5().m26474k(this) : this.be;
    }

    public void jbh(String str) {
        if (vep5() != null) {
            throw new IllegalStateException("Preference already has a TextProvider set.");
        }
        if (TextUtils.equals(str, this.be)) {
            return;
        }
        this.aj = 0;
        this.be = str;
        uv6();
    }

    public void mbx(int i2) {
        jbh(x2().getString(i2));
        this.aj = i2;
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: o */
    public void mo4638o(C1016i c1016i) {
        super.mo4638o(c1016i);
        TextView textView = (TextView) c1016i.itemView.findViewById(kja0.C7296p.lm5);
        if (textView != null) {
            CharSequence charSequenceH7am = h7am();
            if (TextUtils.isEmpty(charSequenceH7am)) {
                textView.setVisibility(8);
            } else {
                textView.setText(charSequenceH7am);
                textView.setVisibility(0);
            }
        }
    }

    @dd
    public final InterfaceC7287k vep5() {
        return this.bs;
    }

    public final void yl(@dd InterfaceC7287k interfaceC7287k) {
        this.bs = interfaceC7287k;
        uv6();
    }

    public TextPreference(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, kja0.cdj.cr3);
    }

    public TextPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, kja0.C7297q.yir);
    }

    public TextPreference(Context context) {
        this(context, null);
    }
}
