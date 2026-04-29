package miuix.appcompat.app;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.DialogC0107y;
import androidx.arch.core.executor.AbstractC0231q;
import androidx.arch.core.executor.C0230k;
import androidx.lifecycle.InterfaceC0954z;
import androidx.room.AbstractC1141t;
import gb.toq;
import java.lang.reflect.InvocationTargetException;
import miuix.appcompat.app.AlertController;
import miuix.appcompat.internal.widget.DialogParentPanel2;
import miuix.appcompat.widget.toq;
import miuix.reflect.C7320k;
import miuix.view.C7385p;
import miuix.view.HapticCompat;
import zy.InterfaceC7828g;
import zy.InterfaceC7837n;
import zy.hb;
import zy.nn86;

/* JADX INFO: compiled from: AlertDialog.java */
/* JADX INFO: loaded from: classes3.dex */
public class ki extends DialogC0107y implements DialogInterface {

    /* JADX INFO: renamed from: g */
    private toq f38948g;

    /* JADX INFO: renamed from: n */
    final AlertController f38949n;

    /* JADX INFO: renamed from: y */
    private toq.InterfaceC7064k f38950y;

    /* JADX INFO: renamed from: miuix.appcompat.app.ki$k */
    /* JADX INFO: compiled from: AlertDialog.java */
    public static class C6947k {

        /* JADX INFO: renamed from: k */
        private final AlertController.AlertParams f38951k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final int f86892toq;

        public C6947k(@zy.lvui Context context) {
            this(context, ki.a9(context, 0));
        }

        public C6947k a9(@nn86 int i2, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.f38951k;
            alertParams.mNeutralButtonText = alertParams.mContext.getText(i2);
            this.f38951k.mNeutralButtonListener = onClickListener;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C6947k m25034c(CharSequence[] charSequenceArr, int i2, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.f38951k;
            alertParams.mItems = charSequenceArr;
            alertParams.mOnClickListener = onClickListener;
            alertParams.mCheckedItem = i2;
            alertParams.mIsSingleChoice = true;
            return this;
        }

        public C6947k cdj(boolean z2) {
            this.f38951k.mHapticFeedbackEnabled = z2;
            return this;
        }

        public C6947k d2ok(DialogInterface.OnKeyListener onKeyListener) {
            this.f38951k.mOnKeyListener = onKeyListener;
            return this;
        }

        public C6947k d3(InterfaceC6949q interfaceC6949q) {
            this.f38951k.mOnDialogShowAnimListener = interfaceC6949q;
            return this;
        }

        public C6947k dd(@nn86 int i2, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.f38951k;
            alertParams.mPositiveButtonText = alertParams.mContext.getText(i2);
            this.f38951k.mPositiveButtonListener = onClickListener;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C6947k m25035e(int i2) {
            AlertController.AlertParams alertParams = this.f38951k;
            alertParams.mView = null;
            alertParams.mViewLayoutResId = i2;
            return this;
        }

        public C6947k eqxt(AdapterView.OnItemSelectedListener onItemSelectedListener) {
            this.f38951k.mOnItemSelectedListener = onItemSelectedListener;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public C6947k m25036f(ListAdapter listAdapter, int i2, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.f38951k;
            alertParams.mAdapter = listAdapter;
            alertParams.mOnClickListener = onClickListener;
            alertParams.mCheckedItem = i2;
            alertParams.mIsSingleChoice = true;
            return this;
        }

        @zy.lvui
        public Context f7l8() {
            return this.f38951k.mContext;
        }

        public C6947k fn3e(int i2, int i3) {
            AlertController.AlertParams alertParams = this.f38951k;
            alertParams.iconWidth = i2;
            alertParams.iconHeight = i3;
            return this;
        }

        public C6947k fti(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.f38951k;
            alertParams.mNeutralButtonText = charSequence;
            alertParams.mNeutralButtonListener = onClickListener;
            return this;
        }

        public C6947k fu4(@nn86 int i2) {
            AlertController.AlertParams alertParams = this.f38951k;
            alertParams.mMessage = alertParams.mContext.getText(i2);
            return this;
        }

        @zy.lvui
        /* JADX INFO: renamed from: g */
        public ki m25037g() {
            ki kiVar = new ki(this.f38951k.mContext, this.f86892toq);
            this.f38951k.apply(kiVar.f38949n);
            kiVar.setCancelable(this.f38951k.mCancelable);
            if (this.f38951k.mCancelable) {
                kiVar.setCanceledOnTouchOutside(true);
            }
            kiVar.setOnCancelListener(this.f38951k.mOnCancelListener);
            kiVar.setOnDismissListener(this.f38951k.mOnDismissListener);
            kiVar.setOnShowListener(this.f38951k.mOnShowListener);
            kiVar.m25024c(this.f38951k.mOnDialogShowAnimListener);
            DialogInterface.OnKeyListener onKeyListener = this.f38951k.mOnKeyListener;
            if (onKeyListener != null) {
                kiVar.setOnKeyListener(onKeyListener);
            }
            return kiVar;
        }

        public C6947k gvn7(DialogInterface.OnCancelListener onCancelListener) {
            this.f38951k.mOnCancelListener = onCancelListener;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public C6947k m25038h(boolean z2) {
            this.f38951k.mEnableEnterAnim = z2;
            return this;
        }

        public ki hb() {
            ki kiVarM25037g = m25037g();
            kiVarM25037g.show();
            return kiVarM25037g;
        }

        public C6947k hyr(Cursor cursor, int i2, String str, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.f38951k;
            alertParams.mCursor = cursor;
            alertParams.mOnClickListener = onClickListener;
            alertParams.mCheckedItem = i2;
            alertParams.mLabelColumn = str;
            alertParams.mIsSingleChoice = true;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public C6947k m25039i(@InterfaceC7828g int i2) {
            TypedValue typedValue = new TypedValue();
            this.f38951k.mContext.getTheme().resolveAttribute(i2, typedValue, true);
            this.f38951k.mIconId = typedValue.resourceId;
            return this;
        }

        /* JADX INFO: renamed from: j */
        public C6947k m25040j(boolean z2) {
            this.f38951k.mSmallIcon = z2;
            return this;
        }

        public C6947k jk(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.f38951k;
            alertParams.mNegativeButtonText = charSequence;
            alertParams.mNegativeButtonListener = onClickListener;
            return this;
        }

        public C6947k jp0y(int i2) {
            this.f38951k.mNonImmersiveDialogHeight = i2;
            return this;
        }

        /* JADX INFO: renamed from: k */
        public C6947k m25041k(CharSequence charSequence, DialogInterface.OnClickListener onClickListener, int i2) {
            this.f38951k.mExtraButtonList.add(new AlertController.ButtonInfo(charSequence, R.attr.buttonBarButtonStyle, onClickListener, i2));
            return this;
        }

        public C6947k ki(@zy.fn3e int i2) {
            this.f38951k.mIconId = i2;
            return this;
        }

        public C6947k kja0(boolean z2) {
            this.f38951k.mEnableDialogImmersive = z2;
            return this;
        }

        @Deprecated
        /* JADX INFO: renamed from: l */
        public C6947k m25042l(boolean z2) {
            this.f38951k.mPreferLandscape = z2;
            return this;
        }

        public C6947k ld6(@nn86 int i2) {
            AlertController.AlertParams alertParams = this.f38951k;
            alertParams.mComment = alertParams.mContext.getText(i2);
            return this;
        }

        public C6947k lrht(@nn86 int i2) {
            AlertController.AlertParams alertParams = this.f38951k;
            alertParams.mTitle = alertParams.mContext.getText(i2);
            return this;
        }

        public C6947k lvui(InterfaceC6948n interfaceC6948n) {
            this.f38951k.mPanelSizeChangedListener = interfaceC6948n;
            return this;
        }

        public C6947k mcp(@nn86 int i2, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.f38951k;
            alertParams.mNegativeButtonText = alertParams.mContext.getText(i2);
            this.f38951k.mNegativeButtonListener = onClickListener;
            return this;
        }

        /* JADX INFO: renamed from: n */
        public C6947k m25043n() {
            this.f38951k.mExtraButtonList.clear();
            return this;
        }

        public C6947k n5r1(@InterfaceC7837n int i2, int i3, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.f38951k;
            alertParams.mItems = alertParams.mContext.getResources().getTextArray(i2);
            AlertController.AlertParams alertParams2 = this.f38951k;
            alertParams2.mOnClickListener = onClickListener;
            alertParams2.mCheckedItem = i3;
            alertParams2.mIsSingleChoice = true;
            return this;
        }

        public C6947k n7h(@zy.dd View view) {
            this.f38951k.mCustomTitleView = view;
            return this;
        }

        public C6947k ncyb(boolean z2) {
            this.f38951k.mPreferLandscape = z2;
            return this;
        }

        public C6947k ni7(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.f38951k;
            alertParams.mItems = charSequenceArr;
            alertParams.mOnClickListener = onClickListener;
            return this;
        }

        public C6947k nn86(View view) {
            AlertController.AlertParams alertParams = this.f38951k;
            alertParams.mView = view;
            alertParams.mViewLayoutResId = 0;
            return this;
        }

        public C6947k o1t(@InterfaceC7837n int i2, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.AlertParams alertParams = this.f38951k;
            alertParams.mItems = alertParams.mContext.getResources().getTextArray(i2);
            AlertController.AlertParams alertParams2 = this.f38951k;
            alertParams2.mOnCheckboxClickListener = onMultiChoiceClickListener;
            alertParams2.mCheckedItems = zArr;
            alertParams2.mIsMultiChoice = true;
            return this;
        }

        public C6947k oc(DialogInterface.OnDismissListener onDismissListener) {
            this.f38951k.mOnDismissListener = onDismissListener;
            return this;
        }

        /* JADX INFO: renamed from: p */
        public C6947k m25044p(boolean z2, CharSequence charSequence) {
            AlertController.AlertParams alertParams = this.f38951k;
            alertParams.mIsChecked = z2;
            alertParams.mCheckBoxMessage = charSequence;
            return this;
        }

        /* JADX INFO: renamed from: q */
        public C6947k m25045q(CharSequence charSequence, DialogInterface.OnClickListener onClickListener, int i2) {
            this.f38951k.mExtraButtonList.add(new AlertController.ButtonInfo(charSequence, R.attr.buttonBarPositiveButtonStyle, onClickListener, i2));
            return this;
        }

        public C6947k qrj(Cursor cursor, DialogInterface.OnClickListener onClickListener, String str) {
            AlertController.AlertParams alertParams = this.f38951k;
            alertParams.mCursor = cursor;
            alertParams.mLabelColumn = str;
            alertParams.mOnClickListener = onClickListener;
            return this;
        }

        /* JADX INFO: renamed from: r */
        public C6947k m25046r(DialogInterface.OnShowListener onShowListener) {
            this.f38951k.mOnShowListener = onShowListener;
            return this;
        }

        /* JADX INFO: renamed from: s */
        public C6947k m25047s(boolean z2) {
            this.f38951k.mCancelable = z2;
            return this;
        }

        /* JADX INFO: renamed from: t */
        public C6947k m25048t(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.AlertParams alertParams = this.f38951k;
            alertParams.mItems = charSequenceArr;
            alertParams.mOnCheckboxClickListener = onMultiChoiceClickListener;
            alertParams.mCheckedItems = zArr;
            alertParams.mIsMultiChoice = true;
            return this;
        }

        public C6947k t8r(@zy.dd Drawable drawable) {
            this.f38951k.mIcon = drawable;
            return this;
        }

        public C6947k toq(CharSequence charSequence, DialogInterface.OnClickListener onClickListener, int i2) {
            this.f38951k.mExtraButtonList.add(new AlertController.ButtonInfo(charSequence, R.attr.buttonBarNegativeButtonStyle, onClickListener, i2));
            return this;
        }

        public C6947k uv6(@zy.dd CharSequence charSequence) {
            this.f38951k.mTitle = charSequence;
            return this;
        }

        public C6947k vyq(boolean z2) {
            this.f38951k.mLiteVersion = z2 ? AbstractC1141t.f52393qrj : 0;
            return this;
        }

        public C6947k wvg(Cursor cursor, String str, String str2, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.AlertParams alertParams = this.f38951k;
            alertParams.mCursor = cursor;
            alertParams.mOnCheckboxClickListener = onMultiChoiceClickListener;
            alertParams.mIsCheckedColumn = str;
            alertParams.mLabelColumn = str2;
            alertParams.mIsMultiChoice = true;
            return this;
        }

        public C6947k x2(@zy.dd CharSequence charSequence) {
            this.f38951k.mComment = charSequence;
            return this;
        }

        public C6947k x9kr(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.f38951k;
            alertParams.mPositiveButtonText = charSequence;
            alertParams.mPositiveButtonListener = onClickListener;
            return this;
        }

        /* JADX INFO: renamed from: y */
        public C6947k m25049y(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.f38951k;
            alertParams.mAdapter = listAdapter;
            alertParams.mOnClickListener = onClickListener;
            return this;
        }

        /* JADX INFO: renamed from: z */
        public C6947k m25050z(@zy.dd CharSequence charSequence) {
            this.f38951k.mMessage = charSequence;
            return this;
        }

        public C6947k zurt(@InterfaceC7837n int i2, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.f38951k;
            alertParams.mItems = alertParams.mContext.getResources().getTextArray(i2);
            this.f38951k.mOnClickListener = onClickListener;
            return this;
        }

        public C6947k zy(CharSequence charSequence, DialogInterface.OnClickListener onClickListener, int i2) {
            this.f38951k.mExtraButtonList.add(new AlertController.ButtonInfo(charSequence, R.attr.buttonBarNeutralButtonStyle, onClickListener, i2));
            return this;
        }

        public C6947k(@zy.lvui Context context, @hb int i2) {
            this.f38951k = new AlertController.AlertParams(new ContextThemeWrapper(context, ki.a9(context, i2)));
            this.f86892toq = i2;
        }
    }

    /* JADX INFO: renamed from: miuix.appcompat.app.ki$n */
    /* JADX INFO: compiled from: AlertDialog.java */
    public interface InterfaceC6948n {
        /* JADX INFO: renamed from: k */
        void m25051k(ki kiVar, DialogParentPanel2 dialogParentPanel2);
    }

    /* JADX INFO: renamed from: miuix.appcompat.app.ki$q */
    /* JADX INFO: compiled from: AlertDialog.java */
    public interface InterfaceC6949q {
        void onShowAnimComplete();

        void onShowAnimStart();
    }

    /* JADX INFO: compiled from: AlertDialog.java */
    class toq {

        /* JADX INFO: renamed from: k */
        @zy.dd
        private Object f38952k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private AbstractC0231q f86893toq;

        /* JADX INFO: renamed from: miuix.appcompat.app.ki$toq$k */
        /* JADX INFO: compiled from: AlertDialog.java */
        class C6950k extends androidx.arch.core.executor.zy {

            /* JADX INFO: renamed from: n */
            private final Object f38954n = new Object();

            /* JADX INFO: renamed from: q */
            @zy.dd
            private volatile Handler f38955q;

            C6950k() {
            }

            /* JADX INFO: renamed from: n */
            private Handler m25054n(@zy.lvui Looper looper) {
                if (Build.VERSION.SDK_INT >= 28) {
                    return Handler.createAsync(looper);
                }
                try {
                    return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
                } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
                    return new Handler(looper);
                } catch (InvocationTargetException unused2) {
                    return new Handler(looper);
                }
            }

            @Override // androidx.arch.core.executor.zy, androidx.arch.core.executor.AbstractC0231q
            /* JADX INFO: renamed from: q */
            public void mo765q(Runnable runnable) {
                if (this.f38955q == null) {
                    synchronized (this.f38954n) {
                        if (this.f38955q == null) {
                            this.f38955q = m25054n(Looper.myLooper());
                        }
                    }
                }
                this.f38955q.post(runnable);
            }

            @Override // androidx.arch.core.executor.zy, androidx.arch.core.executor.AbstractC0231q
            public boolean zy() {
                return true;
            }
        }

        toq() {
        }

        @SuppressLint({"RestrictedApi"})
        /* JADX INFO: renamed from: k */
        private AbstractC0231q m25052k() {
            return new C6950k();
        }

        /* JADX WARN: Finally extract failed */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
        @android.annotation.SuppressLint({"RestrictedApi"})
        /* JADX INFO: renamed from: q */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        void m25053q() {
            /*
                r4 = this;
                java.lang.String r0 = "MiuixDialog"
                java.lang.Class<androidx.arch.core.executor.k> r1 = androidx.arch.core.executor.C0230k.class
                androidx.arch.core.executor.k r2 = androidx.arch.core.executor.C0230k.m762g()     // Catch: java.lang.Throwable -> L2e java.lang.reflect.InvocationTargetException -> L30 java.lang.NoSuchMethodException -> L54 java.lang.IllegalAccessException -> L78
                java.lang.String r3 = "mDelegate"
                java.lang.Object r0 = miuix.reflect.C7320k.qrj(r1, r2, r3)     // Catch: java.lang.Throwable -> L2e java.lang.reflect.InvocationTargetException -> L30 java.lang.NoSuchMethodException -> L54 java.lang.IllegalAccessException -> L78
                if (r0 == 0) goto L16
                java.lang.Object r1 = r4.f38952k
                if (r0 == r1) goto L16
                r4.f38952k = r0
            L16:
                androidx.arch.core.executor.q r1 = r4.f86893toq
                if (r0 != r1) goto L24
                androidx.arch.core.executor.k r0 = androidx.arch.core.executor.C0230k.m762g()
                boolean r0 = r0.zy()
                if (r0 != 0) goto L9c
            L24:
                androidx.arch.core.executor.k r0 = androidx.arch.core.executor.C0230k.m762g()
                androidx.arch.core.executor.q r1 = r4.f86893toq
                r0.m766y(r1)
                goto L9c
            L2e:
                r0 = move-exception
                goto L9d
            L30:
                r1 = move-exception
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
                r2.<init>()     // Catch: java.lang.Throwable -> L2e
                java.lang.String r3 = "onStop() taskExecutor get failed InvocationTargetException "
                r2.append(r3)     // Catch: java.lang.Throwable -> L2e
                r2.append(r1)     // Catch: java.lang.Throwable -> L2e
                java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> L2e
                android.util.Log.d(r0, r1)     // Catch: java.lang.Throwable -> L2e
                androidx.arch.core.executor.q r0 = r4.f86893toq
                if (r0 != 0) goto L24
                androidx.arch.core.executor.k r0 = androidx.arch.core.executor.C0230k.m762g()
                boolean r0 = r0.zy()
                if (r0 != 0) goto L9c
                goto L24
            L54:
                r1 = move-exception
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
                r2.<init>()     // Catch: java.lang.Throwable -> L2e
                java.lang.String r3 = "onStop() taskExecutor get failed NoSuchMethodException "
                r2.append(r3)     // Catch: java.lang.Throwable -> L2e
                r2.append(r1)     // Catch: java.lang.Throwable -> L2e
                java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> L2e
                android.util.Log.d(r0, r1)     // Catch: java.lang.Throwable -> L2e
                androidx.arch.core.executor.q r0 = r4.f86893toq
                if (r0 != 0) goto L24
                androidx.arch.core.executor.k r0 = androidx.arch.core.executor.C0230k.m762g()
                boolean r0 = r0.zy()
                if (r0 != 0) goto L9c
                goto L24
            L78:
                r1 = move-exception
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
                r2.<init>()     // Catch: java.lang.Throwable -> L2e
                java.lang.String r3 = "onStop() taskExecutor get failed IllegalAccessException "
                r2.append(r3)     // Catch: java.lang.Throwable -> L2e
                r2.append(r1)     // Catch: java.lang.Throwable -> L2e
                java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> L2e
                android.util.Log.d(r0, r1)     // Catch: java.lang.Throwable -> L2e
                androidx.arch.core.executor.q r0 = r4.f86893toq
                if (r0 != 0) goto L24
                androidx.arch.core.executor.k r0 = androidx.arch.core.executor.C0230k.m762g()
                boolean r0 = r0.zy()
                if (r0 != 0) goto L9c
                goto L24
            L9c:
                return
            L9d:
                androidx.arch.core.executor.q r1 = r4.f86893toq
                if (r1 != 0) goto Lab
                androidx.arch.core.executor.k r1 = androidx.arch.core.executor.C0230k.m762g()
                boolean r1 = r1.zy()
                if (r1 != 0) goto Lb4
            Lab:
                androidx.arch.core.executor.k r1 = androidx.arch.core.executor.C0230k.m762g()
                androidx.arch.core.executor.q r2 = r4.f86893toq
                r1.m766y(r2)
            Lb4:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: miuix.appcompat.app.ki.toq.m25053q():void");
        }

        @SuppressLint({"RestrictedApi"})
        void toq() {
            try {
                try {
                    try {
                        Object objQrj = C7320k.qrj(C0230k.class, C0230k.m762g(), "mDelegate");
                        if (objQrj != null) {
                            this.f38952k = objQrj;
                        }
                    } catch (IllegalAccessException e2) {
                        Log.d("MiuixDialog", "onCreate() taskExecutor get failed IllegalAccessException " + e2);
                    }
                } catch (NoSuchMethodException e3) {
                    Log.d("MiuixDialog", "onCreate() taskExecutor get failed NoSuchMethodException " + e3);
                } catch (InvocationTargetException e4) {
                    Log.d("MiuixDialog", "onCreate() taskExecutor get failed InvocationTargetException " + e4);
                }
            } finally {
                this.f86893toq = m25052k();
                C0230k.m762g().m766y(this.f86893toq);
            }
        }

        @SuppressLint({"RestrictedApi"})
        void zy() {
            if (this.f38952k instanceof AbstractC0231q) {
                C0230k.m762g().m766y((AbstractC0231q) this.f38952k);
            }
        }
    }

    /* JADX INFO: compiled from: AlertDialog.java */
    public interface zy {
        /* JADX INFO: renamed from: k */
        void m25055k();
    }

    protected ki(@zy.lvui Context context) {
        this(context, 0);
    }

    static int a9(@zy.lvui Context context, @hb int i2) {
        if (((i2 >>> 24) & 255) >= 1) {
            return i2;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(toq.C6055q.n4kc, typedValue, true);
        return typedValue.resourceId;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void fn3e() {
        this.f38949n.n5r1(this.f38950y);
    }

    private Context fu4(Context context) {
        return context == null ? getContext() : context.getClass() == ContextThemeWrapper.class ? context : getContext();
    }

    /* JADX INFO: renamed from: i */
    private boolean m25023i() {
        return TextUtils.equals("android.ui", Thread.currentThread().getName()) || TextUtils.equals("android.imms", Thread.currentThread().getName()) || TextUtils.equals("system_server", Thread.currentThread().getName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void zurt() {
        View decorView;
        if (getWindow() == null || (decorView = getWindow().getDecorView()) == null || !decorView.isAttachedToWindow()) {
            return;
        }
        m25033z();
    }

    /* JADX INFO: renamed from: c */
    public void m25024c(InterfaceC6949q interfaceC6949q) {
        this.f38949n.ebn(interfaceC6949q);
    }

    public ListView cdj() {
        return this.f38949n.m24848b();
    }

    public void d2ok(boolean z2) {
        this.f38949n.h7am(z2);
    }

    public void d3(ViewGroup.LayoutParams layoutParams) {
        this.f38949n.b3e(layoutParams);
    }

    public void dd(int i2) {
        this.f38949n.vep5(i2);
    }

    @Override // androidx.appcompat.app.DialogC0107y, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        View decorView = getWindow().getDecorView();
        if (!this.f38949n.m24849v()) {
            ld6(decorView);
            return;
        }
        Activity activityKja0 = kja0();
        if (activityKja0 == null || !activityKja0.isFinishing()) {
            qrj(decorView);
        } else {
            ld6(decorView);
        }
    }

    @Override // androidx.appcompat.app.DialogC0107y, android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.f38949n.hyr(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX INFO: renamed from: e */
    public void m25025e(View view) {
        this.f38949n.zwy(view);
    }

    public void eqxt(boolean z2) {
        this.f38949n.cv06(z2);
    }

    /* JADX INFO: renamed from: f */
    public void m25026f(zy zyVar) {
        this.f38949n.yl(zyVar);
    }

    public void fti(int i2, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        this.f38949n.zkd(i2, charSequence, onClickListener, null);
    }

    public void gvn7(int i2, CharSequence charSequence, Message message) {
        this.f38949n.zkd(i2, charSequence, null, message);
    }

    /* JADX INFO: renamed from: h */
    public Button m25027h(int i2) {
        return this.f38949n.lrht(i2);
    }

    public void hyr(int i2) {
        this.f38949n.ixz(i2);
    }

    public void jk(View view, boolean z2) {
        this.f38949n.yqrt(view, z2);
    }

    public TextView ki() {
        return this.f38949n.bf2();
    }

    Activity kja0() {
        Activity ownerActivity = getOwnerActivity();
        Context context = getContext();
        while (ownerActivity == null && context != null) {
            if (context instanceof Activity) {
                ownerActivity = (Activity) context;
            } else {
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
        }
        return ownerActivity;
    }

    /* JADX INFO: renamed from: l */
    public void m25028l(int i2, int i3) {
        this.f38949n.jbh(i2, i3);
    }

    void ld6(View view) {
        if (view == null || view.isAttachedToWindow()) {
            super.dismiss();
        }
    }

    public void lrht(boolean z2) {
        this.f38949n.ukdy(z2);
    }

    public void mcp(View view) {
        jk(view, true);
    }

    public void n5r1(CharSequence charSequence) {
        this.f38949n.wx16(charSequence);
    }

    public void n7h() {
        if (getWindow().getDecorView().isAttachedToWindow()) {
            m25033z();
        }
    }

    public void ncyb(int i2) {
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(i2, typedValue, true);
        this.f38949n.vep5(typedValue.resourceId);
    }

    protected void ni7() {
    }

    public void o1t(int i2) {
        wvg(i2, true);
    }

    public void oc(View view) {
        this.f38949n.bek6(view);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        View decorView = getWindow().getDecorView();
        if (decorView != null && this.f38949n.f38738b) {
            HapticCompat.performHapticFeedbackAsync(decorView, C7385p.f92235eqxt, C7385p.f42272h);
        }
        this.f38949n.i9jn();
    }

    @Override // androidx.appcompat.app.DialogC0107y, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        toq toqVar;
        if (m25023i() && (toqVar = this.f38948g) != null) {
            toqVar.toq();
        }
        if (this.f38949n.m24849v() || !this.f38949n.f86752f7l8) {
            getWindow().setWindowAnimations(0);
        }
        super.onCreate(bundle);
        this.f38949n.bo(bundle);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f38949n.r8s8();
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        this.f38949n.v0af();
    }

    @Override // androidx.appcompat.app.DialogC0107y, android.app.Dialog
    protected void onStop() {
        toq toqVar;
        toq toqVar2;
        if (m25023i() && (toqVar2 = this.f38948g) != null) {
            toqVar2.m25053q();
        }
        super.onStop();
        this.f38949n.etdu();
        if (!m25023i() || (toqVar = this.f38948g) == null) {
            return;
        }
        toqVar.zy();
    }

    /* JADX INFO: renamed from: p */
    public void m25029p() {
        this.f38949n.dd();
    }

    void qrj(View view) {
        if (view == null) {
            super.dismiss();
        } else if (view.getHandler() != null) {
            x2(view);
        } else {
            ld6(view);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m25030r(boolean z2) {
        this.f38949n.f38738b = z2;
    }

    /* JADX INFO: renamed from: s */
    public void m25031s(CharSequence charSequence, @InterfaceC7828g int i2, Message message) {
        this.f38949n.fti(new AlertController.ButtonInfo(charSequence, i2, message));
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z2) {
        super.setCancelable(z2);
        this.f38949n.bz2(z2);
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z2) {
        super.setCanceledOnTouchOutside(z2);
        this.f38949n.uj2j(z2);
    }

    @Override // androidx.appcompat.app.DialogC0107y, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f38949n.pc(charSequence);
    }

    public boolean t8r() {
        return this.f38949n.gyi();
    }

    @Deprecated
    public void uv6(boolean z2) {
        this.f38949n.ukdy(z2);
    }

    public void vyq(boolean z2) {
        this.f38949n.ij(z2);
    }

    public void wvg(int i2, boolean z2) {
        this.f38949n.z4(i2, z2);
    }

    void x2(View view) {
        if (Thread.currentThread() == view.getHandler().getLooper().getThread()) {
            this.f38949n.n5r1(this.f38950y);
        } else {
            view.post(new Runnable() { // from class: miuix.appcompat.app.h
                @Override // java.lang.Runnable
                public final void run() {
                    this.f38940k.fn3e();
                }
            });
        }
    }

    public void x9kr(Drawable drawable) {
        this.f38949n.mbx(drawable);
    }

    /* JADX INFO: renamed from: y */
    public void m25032y(CharSequence charSequence, @InterfaceC7828g int i2, DialogInterface.OnClickListener onClickListener, int i3) {
        this.f38949n.fti(new AlertController.ButtonInfo(charSequence, i2, onClickListener, i3));
    }

    /* JADX INFO: renamed from: z */
    void m25033z() {
        super.dismiss();
    }

    protected ki(@zy.lvui Context context, @hb int i2) {
        super(context, a9(context, i2));
        this.f38950y = new toq.InterfaceC7064k() { // from class: miuix.appcompat.app.cdj
            @Override // miuix.appcompat.widget.toq.InterfaceC7064k
            public final void end() {
                this.f38783k.zurt();
            }
        };
        this.f38949n = new AlertController(fu4(context), this, getWindow());
        if (this instanceof InterfaceC0954z) {
            this.f38948g = new toq();
        }
    }

    protected ki(@zy.lvui Context context, boolean z2, @zy.dd DialogInterface.OnCancelListener onCancelListener) {
        this(context, 0);
        setCancelable(z2);
        setOnCancelListener(onCancelListener);
    }
}
