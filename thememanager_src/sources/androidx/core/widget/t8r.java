package androidx.core.widget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.Editable;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.core.text.f7l8;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import zy.InterfaceC7830i;
import zy.InterfaceC7833l;
import zy.a9;
import zy.dd;
import zy.hb;
import zy.hyr;
import zy.lvui;
import zy.uv6;

/* JADX INFO: compiled from: TextViewCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class t8r {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static boolean f50981f7l8 = false;

    /* JADX INFO: renamed from: g */
    private static Field f4294g = null;

    /* JADX INFO: renamed from: k */
    private static final String f4295k = "TextViewCompat";

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static boolean f50982ld6 = false;

    /* JADX INFO: renamed from: n */
    private static boolean f4296n = false;

    /* JADX INFO: renamed from: p */
    private static Field f4297p = null;

    /* JADX INFO: renamed from: q */
    private static Field f4298q = null;

    /* JADX INFO: renamed from: s */
    private static boolean f4299s = false;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final int f50983toq = 0;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final int f50984x2 = 1;

    /* JADX INFO: renamed from: y */
    private static Field f4300y = null;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final int f50985zy = 1;

    /* JADX INFO: compiled from: TextViewCompat.java */
    @Retention(RetentionPolicy.SOURCE)
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public @interface f7l8 {
    }

    /* JADX INFO: renamed from: androidx.core.widget.t8r$g */
    /* JADX INFO: compiled from: TextViewCompat.java */
    @hyr(28)
    static class C0764g {
        private C0764g() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static String[] m3691k(DecimalFormatSymbols decimalFormatSymbols) {
            return decimalFormatSymbols.getDigitStrings();
        }

        @InterfaceC7830i
        static PrecomputedText.Params toq(TextView textView) {
            return textView.getTextMetricsParams();
        }

        @InterfaceC7830i
        static void zy(TextView textView, int i2) {
            textView.setFirstBaselineToTopHeight(i2);
        }
    }

    /* JADX INFO: renamed from: androidx.core.widget.t8r$k */
    /* JADX INFO: compiled from: TextViewCompat.java */
    @hyr(16)
    static class C0765k {
        private C0765k() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static boolean m3692k(TextView textView) {
            return textView.getIncludeFontPadding();
        }

        @InterfaceC7830i
        static int toq(TextView textView) {
            return textView.getMaxLines();
        }

        @InterfaceC7830i
        static int zy(TextView textView) {
            return textView.getMinLines();
        }
    }

    /* JADX INFO: renamed from: androidx.core.widget.t8r$n */
    /* JADX INFO: compiled from: TextViewCompat.java */
    @hyr(26)
    static class C0766n {
        private C0766n() {
        }

        @InterfaceC7830i
        static void f7l8(TextView textView, int[] iArr, int i2) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i2);
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: g */
        static void m3693g(TextView textView, int i2, int i3, int i4, int i5) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i2, i3, i4, i5);
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static int m3694k(TextView textView) {
            return textView.getAutoSizeMaxTextSize();
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: n */
        static int m3695n(TextView textView) {
            return textView.getAutoSizeTextType();
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: q */
        static int[] m3696q(TextView textView) {
            return textView.getAutoSizeTextAvailableSizes();
        }

        @InterfaceC7830i
        static int toq(TextView textView) {
            return textView.getAutoSizeMinTextSize();
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: y */
        static void m3697y(TextView textView, int i2) {
            textView.setAutoSizeTextTypeWithDefaults(i2);
        }

        @InterfaceC7830i
        static int zy(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }
    }

    /* JADX INFO: renamed from: androidx.core.widget.t8r$q */
    /* JADX INFO: compiled from: TextViewCompat.java */
    @hyr(24)
    static class C0767q {
        private C0767q() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static DecimalFormatSymbols m3698k(Locale locale) {
            return DecimalFormatSymbols.getInstance(locale);
        }
    }

    /* JADX INFO: compiled from: TextViewCompat.java */
    @hyr(17)
    static class toq {
        private toq() {
        }

        @InterfaceC7830i
        static void f7l8(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: g */
        static void m3699g(TextView textView, int i2, int i3, int i4, int i5) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(i2, i3, i4, i5);
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static Drawable[] m3700k(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: n */
        static void m3701n(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: q */
        static Locale m3702q(TextView textView) {
            return textView.getTextLocale();
        }

        @InterfaceC7830i
        static int toq(View view) {
            return view.getLayoutDirection();
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: y */
        static void m3703y(View view, int i2) {
            view.setTextDirection(i2);
        }

        @InterfaceC7830i
        static int zy(View view) {
            return view.getTextDirection();
        }
    }

    /* JADX INFO: renamed from: androidx.core.widget.t8r$y */
    /* JADX INFO: compiled from: TextViewCompat.java */
    @hyr(26)
    private static class ActionModeCallbackC0768y implements ActionMode.Callback {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private static final int f50986f7l8 = 100;

        /* JADX INFO: renamed from: g */
        private boolean f4301g = false;

        /* JADX INFO: renamed from: k */
        private final ActionMode.Callback f4302k;

        /* JADX INFO: renamed from: n */
        private boolean f4303n;

        /* JADX INFO: renamed from: q */
        private Method f4304q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final TextView f50987toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private Class<?> f50988zy;

        ActionModeCallbackC0768y(ActionMode.Callback callback, TextView textView) {
            this.f4302k = callback;
            this.f50987toq = textView;
        }

        private void f7l8(Menu menu) {
            Context context = this.f50987toq.getContext();
            PackageManager packageManager = context.getPackageManager();
            if (!this.f4301g) {
                this.f4301g = true;
                try {
                    Class<?> cls = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.f50988zy = cls;
                    this.f4304q = cls.getDeclaredMethod("removeItemAt", Integer.TYPE);
                    this.f4303n = true;
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    this.f50988zy = null;
                    this.f4304q = null;
                    this.f4303n = false;
                }
            }
            try {
                Method declaredMethod = (this.f4303n && this.f50988zy.isInstance(menu)) ? this.f4304q : menu.getClass().getDeclaredMethod("removeItemAt", Integer.TYPE);
                for (int size = menu.size() - 1; size >= 0; size--) {
                    MenuItem item = menu.getItem(size);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        declaredMethod.invoke(menu, Integer.valueOf(size));
                    }
                }
                List<ResolveInfo> listZy = zy(context, packageManager);
                for (int i2 = 0; i2 < listZy.size(); i2++) {
                    ResolveInfo resolveInfo = listZy.get(i2);
                    menu.add(0, 0, i2 + 100, resolveInfo.loadLabel(packageManager)).setIntent(toq(resolveInfo, this.f50987toq)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        /* JADX INFO: renamed from: g */
        private boolean m3704g(ResolveInfo resolveInfo, Context context) {
            if (context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                return true;
            }
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (!activityInfo.exported) {
                return false;
            }
            String str = activityInfo.permission;
            return str == null || context.checkSelfPermission(str) == 0;
        }

        /* JADX INFO: renamed from: k */
        private Intent m3705k() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        }

        /* JADX INFO: renamed from: n */
        private boolean m3706n(TextView textView) {
            return (textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled();
        }

        private Intent toq(ResolveInfo resolveInfo, TextView textView) {
            Intent intentPutExtra = m3705k().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !m3706n(textView));
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            return intentPutExtra.setClassName(activityInfo.packageName, activityInfo.name);
        }

        private List<ResolveInfo> zy(Context context, PackageManager packageManager) {
            ArrayList arrayList = new ArrayList();
            if (!(context instanceof Activity)) {
                return arrayList;
            }
            for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(m3705k(), 0)) {
                if (m3704g(resolveInfo, context)) {
                    arrayList.add(resolveInfo);
                }
            }
            return arrayList;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f4302k.onActionItemClicked(actionMode, menuItem);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f4302k.onCreateActionMode(actionMode, menu);
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
            this.f4302k.onDestroyActionMode(actionMode);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            f7l8(menu);
            return this.f4302k.onPrepareActionMode(actionMode, menu);
        }

        @lvui
        /* JADX INFO: renamed from: q */
        ActionMode.Callback m3707q() {
            return this.f4302k;
        }
    }

    /* JADX INFO: compiled from: TextViewCompat.java */
    @hyr(23)
    static class zy {
        private zy() {
        }

        @InterfaceC7830i
        static void f7l8(TextView textView, PorterDuff.Mode mode) {
            textView.setCompoundDrawableTintMode(mode);
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: g */
        static void m3708g(TextView textView, ColorStateList colorStateList) {
            textView.setCompoundDrawableTintList(colorStateList);
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static int m3709k(TextView textView) {
            return textView.getBreakStrategy();
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: n */
        static void m3710n(TextView textView, int i2) {
            textView.setBreakStrategy(i2);
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: q */
        static int m3711q(TextView textView) {
            return textView.getHyphenationFrequency();
        }

        @InterfaceC7830i
        static ColorStateList toq(TextView textView) {
            return textView.getCompoundDrawableTintList();
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: y */
        static void m3712y(TextView textView, int i2) {
            textView.setHyphenationFrequency(i2);
        }

        @InterfaceC7830i
        static PorterDuff.Mode zy(TextView textView) {
            return textView.getCompoundDrawableTintMode();
        }
    }

    private t8r() {
    }

    public static void a9(@lvui TextView textView, @hb int i2) {
        textView.setTextAppearance(i2);
    }

    private static int cdj(Field field, TextView textView) {
        try {
            return field.getInt(textView);
        } catch (IllegalAccessException unused) {
            Log.d(f4295k, "Could not retrieve value of " + field.getName() + " field.");
            return -1;
        }
    }

    @dd
    public static PorterDuff.Mode f7l8(@lvui TextView textView) {
        androidx.core.util.n7h.x2(textView);
        return zy.zy(textView);
    }

    public static void fn3e(@lvui TextView textView, @dd ColorStateList colorStateList) {
        androidx.core.util.n7h.x2(textView);
        zy.m3708g(textView, colorStateList);
    }

    public static void fti(@lvui TextView textView, @lvui f7l8.C0613k c0613k) {
        toq.m3703y(textView, qrj(c0613k.m2854q()));
        textView.getPaint().set(c0613k.m2853n());
        zy.m3710n(textView, c0613k.toq());
        zy.m3712y(textView, c0613k.zy());
    }

    public static void fu4(@lvui TextView textView, @zy.fn3e int i2, @zy.fn3e int i3, @zy.fn3e int i4, @zy.fn3e int i5) {
        toq.m3699g(textView, i2, i3, i4, i5);
    }

    @dd
    /* JADX INFO: renamed from: g */
    public static ColorStateList m3680g(@lvui TextView textView) {
        androidx.core.util.n7h.x2(textView);
        return zy.toq(textView);
    }

    @dd
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public static ActionMode.Callback gvn7(@lvui TextView textView, @dd ActionMode.Callback callback) {
        return (Build.VERSION.SDK_INT > 27 || (callback instanceof ActionModeCallbackC0768y) || callback == null) ? callback : new ActionModeCallbackC0768y(callback, textView);
    }

    /* JADX INFO: renamed from: h */
    private static Field m3681h(String str) {
        Field declaredField = null;
        try {
            declaredField = TextView.class.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (NoSuchFieldException unused) {
            Log.e(f4295k, "Could not retrieve " + str + " field.");
            return declaredField;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public static void m3682i(@lvui TextView textView, int i2) {
        if (Build.VERSION.SDK_INT >= 27) {
            C0766n.m3697y(textView, i2);
        } else if (textView instanceof androidx.core.widget.toq) {
            ((androidx.core.widget.toq) textView).setAutoSizeTextTypeWithDefaults(i2);
        }
    }

    public static void jk(@lvui TextView textView, @lvui androidx.core.text.f7l8 f7l8Var) {
        if (Build.VERSION.SDK_INT >= 29) {
            textView.setText(f7l8Var.m2849g());
        } else {
            if (!kja0(textView).m2852k(f7l8Var.m2850n())) {
                throw new IllegalArgumentException("Given text can not be applied to TextView.");
            }
            textView.setText(f7l8Var);
        }
    }

    @dd
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public static ActionMode.Callback jp0y(@dd ActionMode.Callback callback) {
        return callback instanceof ActionModeCallbackC0768y ? ((ActionModeCallbackC0768y) callback).m3707q() : callback;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    public static int m3683k(@lvui TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return C0766n.m3694k(textView);
        }
        if (textView instanceof androidx.core.widget.toq) {
            return ((androidx.core.widget.toq) textView).getAutoSizeMaxTextSize();
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void ki(@lvui TextView textView, int i2, int i3, int i4, int i5) throws IllegalArgumentException {
        if (Build.VERSION.SDK_INT >= 27) {
            C0766n.m3693g(textView, i2, i3, i4, i5);
        } else if (textView instanceof androidx.core.widget.toq) {
            ((androidx.core.widget.toq) textView).setAutoSizeTextTypeUniformWithConfiguration(i2, i3, i4, i5);
        }
    }

    @lvui
    public static f7l8.C0613k kja0(@lvui TextView textView) {
        if (Build.VERSION.SDK_INT >= 28) {
            return new f7l8.C0613k(C0764g.toq(textView));
        }
        f7l8.C0613k.k kVar = new f7l8.C0613k.k(new TextPaint(textView.getPaint()));
        kVar.toq(zy.m3709k(textView));
        kVar.zy(zy.m3711q(textView));
        kVar.m2856q(n7h(textView));
        return kVar.m2855k();
    }

    public static int ld6(@lvui TextView textView) {
        return C0765k.toq(textView);
    }

    public static void mcp(@lvui TextView textView, @InterfaceC7833l @a9(from = 0) int i2) {
        androidx.core.util.n7h.m2979s(i2);
        if (i2 != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i2 - r0, 1.0f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public static int m3684n(@lvui TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return C0766n.m3695n(textView);
        }
        if (textView instanceof androidx.core.widget.toq) {
            return ((androidx.core.widget.toq) textView).getAutoSizeTextType();
        }
        return 0;
    }

    @hyr(18)
    private static TextDirectionHeuristic n7h(@lvui TextView textView) {
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return TextDirectionHeuristics.LTR;
        }
        if (Build.VERSION.SDK_INT >= 28 && (textView.getInputType() & 15) == 3) {
            byte directionality = Character.getDirectionality(C0764g.m3691k(C0767q.m3698k(toq.m3702q(textView)))[0].codePointAt(0));
            return (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        boolean z2 = toq.toq(textView) == 1;
        switch (toq.zy(textView)) {
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            default:
                if (!z2) {
                }
                break;
        }
        return TextDirectionHeuristics.LTR;
    }

    public static void ni7(@lvui TextView textView, @dd Drawable drawable, @dd Drawable drawable2, @dd Drawable drawable3, @dd Drawable drawable4) {
        toq.m3701n(textView, drawable, drawable2, drawable3, drawable4);
    }

    public static void o1t(@lvui TextView textView, @lvui ActionMode.Callback callback) {
        textView.setCustomSelectionActionModeCallback(gvn7(textView, callback));
    }

    /* JADX INFO: renamed from: p */
    public static int m3685p(@lvui TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @lvui
    /* JADX INFO: renamed from: q */
    public static int[] m3686q(@lvui TextView textView) {
        return Build.VERSION.SDK_INT >= 27 ? C0766n.m3696q(textView) : textView instanceof androidx.core.widget.toq ? ((androidx.core.widget.toq) textView).getAutoSizeTextAvailableSizes() : new int[0];
    }

    @hyr(18)
    private static int qrj(@lvui TextDirectionHeuristic textDirectionHeuristic) {
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL || textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 1;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
            return 3;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
            return 4;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
            return 5;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 6;
        }
        return textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL ? 7 : 1;
    }

    /* JADX INFO: renamed from: s */
    public static int m3687s(@lvui TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    /* JADX INFO: renamed from: t */
    public static void m3688t(@lvui TextView textView, @InterfaceC7833l @a9(from = 0) int i2) {
        androidx.core.util.n7h.m2979s(i2);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i3 = C0765k.m3692k(textView) ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i2 > Math.abs(i3)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i2 - i3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void t8r(@lvui TextView textView, @lvui int[] iArr, int i2) throws IllegalArgumentException {
        if (Build.VERSION.SDK_INT >= 27) {
            C0766n.f7l8(textView, iArr, i2);
        } else if (textView instanceof androidx.core.widget.toq) {
            ((androidx.core.widget.toq) textView).setAutoSizeTextTypeUniformWithPresetSizes(iArr, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int toq(@lvui TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return C0766n.toq(textView);
        }
        if (textView instanceof androidx.core.widget.toq) {
            return ((androidx.core.widget.toq) textView).getAutoSizeMinTextSize();
        }
        return -1;
    }

    public static void wvg(@lvui TextView textView, @InterfaceC7833l @a9(from = 0) int i2) {
        androidx.core.util.n7h.m2979s(i2);
        if (Build.VERSION.SDK_INT >= 28) {
            C0764g.zy(textView, i2);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i3 = C0765k.m3692k(textView) ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i2 > Math.abs(i3)) {
            textView.setPadding(textView.getPaddingLeft(), i2 + i3, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static int x2(@lvui TextView textView) {
        return C0765k.zy(textView);
    }

    @lvui
    /* JADX INFO: renamed from: y */
    public static Drawable[] m3689y(@lvui TextView textView) {
        return toq.m3700k(textView);
    }

    /* JADX INFO: renamed from: z */
    public static void m3690z(@lvui TextView textView, @dd Drawable drawable, @dd Drawable drawable2, @dd Drawable drawable3, @dd Drawable drawable4) {
        toq.f7l8(textView, drawable, drawable2, drawable3, drawable4);
    }

    public static void zurt(@lvui TextView textView, @dd PorterDuff.Mode mode) {
        androidx.core.util.n7h.x2(textView);
        zy.f7l8(textView, mode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int zy(@lvui TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return C0766n.zy(textView);
        }
        if (textView instanceof androidx.core.widget.toq) {
            return ((androidx.core.widget.toq) textView).getAutoSizeStepGranularity();
        }
        return -1;
    }
}
