package miuix.pickerwidget.widget;

import ab.C0006k;
import android.R;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.StateListDrawable;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Scroller;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.nmn5;
import androidx.core.view.C0683f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import miuix.animation.Folme;
import miuix.animation.IHoverStyle;
import miuix.animation.base.AnimConfig;
import miuix.internal.util.C7168p;
import miuix.pickerwidget.internal.util.async.C7233k;
import miuix.view.C7385p;
import miuix.view.HapticCompat;
import wtop.toq;

/* JADX INFO: loaded from: classes3.dex */
public class NumberPicker extends LinearLayout {
    private static final int afw = 800;
    private static final float cecm = 45.0f;
    private static final float eht = 0.9f;
    private static final int h06 = 10;
    private static final int kdv1 = 202;
    private static final int ls9 = 1;
    private static final int lw58 = 48;
    private static final int n5ij = 2;
    private static final int oyp = 300;
    private static final int qns = 8;
    private static final int us2t = -1;
    private static final String ut = "NumberPicker_sound_play";
    private static final long wh6 = 300;
    static final int zm = 3;

    /* JADX INFO: renamed from: a */
    private long f40897a;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private final Scroller f87998ab;
    private final boolean ac;
    private final int ad;
    private int aj;
    private int am;
    private RunnableC7240g an;
    private boolean ar;
    private float as;
    private int ax;
    private boolean ay;
    private int az;

    /* JADX INFO: renamed from: b */
    private f7l8 f40898b;
    private int ba;
    private final Scroller bb;
    private boolean bc;
    private final x2 bd;
    private boolean be;
    private VelocityTracker bg;
    private long bl;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private final Paint f87999bo;
    private int bp;
    private boolean bq;
    private int bs;
    private C7245q bu;
    private qrj bv;

    /* JADX INFO: renamed from: c */
    private int f40899c;
    private int cw14;

    /* JADX INFO: renamed from: d */
    private int f40900d;
    private CharSequence d1cy;
    private int dy;

    /* JADX INFO: renamed from: e */
    private int f40901e;
    private String ei;

    /* JADX INFO: renamed from: f */
    private String[] f40902f;

    /* JADX INFO: renamed from: g */
    private n7h f40903g;

    /* JADX INFO: renamed from: h */
    private final int f40904h;
    private float hp;

    /* JADX INFO: renamed from: i */
    private final int f40905i;
    private RunnableC7242n id;
    private float in;

    /* JADX INFO: renamed from: j */
    private int f40906j;

    /* JADX INFO: renamed from: k */
    private final int f40907k;
    private int k0;
    private float k6e;

    /* JADX INFO: renamed from: l */
    private int f40908l;

    /* JADX INFO: renamed from: m */
    private InterfaceC7244p f40909m;
    private float mjvl;

    /* JADX INFO: renamed from: n */
    private int f40910n;
    private int ndjo;

    /* JADX INFO: renamed from: o */
    private ld6 f40911o;

    /* JADX INFO: renamed from: p */
    private final int f40912p;

    /* JADX INFO: renamed from: q */
    private int f40913q;
    private int q7k9;

    /* JADX INFO: renamed from: r */
    private final int f40914r;

    /* JADX INFO: renamed from: s */
    private final int f40915s;
    private int s8y;
    private int sk1t;

    /* JADX INFO: renamed from: t */
    private final boolean f40916t;
    private int tgs;
    private int th6;
    private int tlhn;

    /* JADX INFO: renamed from: u */
    private final int[] f40917u;

    /* JADX INFO: renamed from: v */
    private int f40918v;
    private float vb6;

    /* JADX INFO: renamed from: w */
    private int f40919w;
    private Paint w97r;
    private final IHoverStyle wra;

    /* JADX INFO: renamed from: x */
    private final SparseArray<String> f40920x;
    private boolean xhv;
    private int xk5;
    private float xqx;
    private int xy8;

    /* JADX INFO: renamed from: y */
    private final EditText f40921y;
    private String yl25;

    /* JADX INFO: renamed from: z */
    private int f40922z;
    private float zmmu;
    private String zr5t;
    private boolean zsl;
    private static final int fn2 = toq.x2.f98530fti;
    private static final AtomicInteger nq0z = new AtomicInteger(0);
    static final f7l8 a7kc = new C7246s(2);
    private static final int[] k84 = {R.attr.state_pressed};
    private static final char[] gjxq = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

    public static class CustomEditText extends AppCompatEditText {
        public CustomEditText(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // android.widget.TextView
        public void onEditorAction(int i2) {
            super.onEditorAction(i2);
            if (i2 == 6) {
                clearFocus();
            }
        }
    }

    public interface f7l8 {
        /* JADX INFO: renamed from: k */
        String mo26361k(int i2);
    }

    /* JADX INFO: renamed from: miuix.pickerwidget.widget.NumberPicker$g */
    class RunnableC7240g implements Runnable {

        /* JADX INFO: renamed from: k */
        private boolean f40923k;

        RunnableC7240g() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void toq(boolean z2) {
            this.f40923k = z2;
        }

        @Override // java.lang.Runnable
        public void run() {
            NumberPicker.this.m26356t(this.f40923k);
            NumberPicker numberPicker = NumberPicker.this;
            numberPicker.postDelayed(this, numberPicker.f40897a);
        }
    }

    /* JADX INFO: renamed from: miuix.pickerwidget.widget.NumberPicker$k */
    class ViewOnHoverListenerC7241k implements View.OnHoverListener {
        ViewOnHoverListenerC7241k() {
        }

        @Override // android.view.View.OnHoverListener
        public boolean onHover(View view, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 9) {
                NumberPicker.this.zsl = true;
                NumberPicker.this.wra.setEffect(IHoverStyle.HoverEffect.NORMAL).hoverEnter(new AnimConfig[0]);
            } else if (actionMasked == 10) {
                NumberPicker.this.zsl = false;
                NumberPicker.this.wra.setEffect(IHoverStyle.HoverEffect.NORMAL).hoverExit(new AnimConfig[0]);
            }
            return false;
        }
    }

    public interface ld6 {
        /* JADX INFO: renamed from: k */
        void mo26324k(NumberPicker numberPicker, int i2, int i3);
    }

    /* JADX INFO: renamed from: miuix.pickerwidget.widget.NumberPicker$n */
    class RunnableC7242n implements Runnable {
        RunnableC7242n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NumberPicker.this.ay = true;
        }
    }

    private static class n7h extends Handler {

        /* JADX INFO: renamed from: k */
        private static final C7243k f40927k = new C7243k(null);

        /* JADX INFO: renamed from: q */
        private static final int f40928q = 2;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private static final int f88000toq = 0;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private static final int f88001zy = 1;

        n7h(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i2 = message.what;
            if (i2 == 0) {
                f40927k.m26365k((Context) message.obj, message.arg1);
            } else if (i2 == 1) {
                f40927k.toq();
            } else {
                if (i2 != 2) {
                    return;
                }
                f40927k.zy(message.arg1);
            }
        }

        /* JADX INFO: renamed from: k */
        void m26363k(Context context, int i2) {
            Message messageObtainMessage = obtainMessage(0, i2, 0);
            messageObtainMessage.obj = context;
            sendMessage(messageObtainMessage);
        }

        /* JADX INFO: renamed from: q */
        void m26364q() {
            removeMessages(1);
        }

        void toq() {
            sendMessage(obtainMessage(1));
        }

        void zy(int i2) {
            sendMessage(obtainMessage(2, i2, 0));
        }

        /* JADX INFO: renamed from: miuix.pickerwidget.widget.NumberPicker$n7h$k */
        private static class C7243k {

            /* JADX INFO: renamed from: n */
            private static final long f40929n = 50;

            /* JADX INFO: renamed from: k */
            private Set<Integer> f40930k;

            /* JADX INFO: renamed from: q */
            private long f40931q;

            /* JADX INFO: renamed from: toq, reason: collision with root package name */
            private SoundPool f88002toq;

            /* JADX INFO: renamed from: zy, reason: collision with root package name */
            private int f88003zy;

            private C7243k() {
                this.f40930k = new androidx.collection.zy();
            }

            /* JADX INFO: renamed from: k */
            void m26365k(Context context, int i2) {
                if (this.f88002toq == null) {
                    SoundPool soundPool = new SoundPool(1, 1, 0);
                    this.f88002toq = soundPool;
                    this.f88003zy = soundPool.load(context, toq.n7h.f45189k, 1);
                }
                this.f40930k.add(Integer.valueOf(i2));
            }

            void toq() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                SoundPool soundPool = this.f88002toq;
                if (soundPool == null || jCurrentTimeMillis - this.f40931q <= f40929n) {
                    return;
                }
                soundPool.play(this.f88003zy, 1.0f, 1.0f, 0, 0, 1.0f);
                this.f40931q = jCurrentTimeMillis;
            }

            void zy(int i2) {
                SoundPool soundPool;
                if (this.f40930k.remove(Integer.valueOf(i2)) && this.f40930k.isEmpty() && (soundPool = this.f88002toq) != null) {
                    soundPool.release();
                    this.f88002toq = null;
                }
            }

            /* synthetic */ C7243k(ViewOnHoverListenerC7241k viewOnHoverListenerC7241k) {
                this();
            }
        }
    }

    /* JADX INFO: renamed from: miuix.pickerwidget.widget.NumberPicker$p */
    public interface InterfaceC7244p {

        /* JADX INFO: renamed from: k */
        public static final int f40932k = 0;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public static final int f88004toq = 1;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public static final int f88005zy = 2;

        /* JADX INFO: renamed from: k */
        void m26366k(NumberPicker numberPicker, int i2);
    }

    /* JADX INFO: renamed from: miuix.pickerwidget.widget.NumberPicker$q */
    class C7245q extends AccessibilityNodeProvider {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private static final int f88006f7l8 = 2;

        /* JADX INFO: renamed from: g */
        private static final int f40933g = 1;

        /* JADX INFO: renamed from: n */
        private static final int f40934n = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: y */
        private static final int f40935y = 3;

        /* JADX INFO: renamed from: k */
        private final Rect f40936k = new Rect();

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final int[] f88007toq = new int[2];

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private int f88008zy = Integer.MIN_VALUE;

        C7245q() {
        }

        private boolean f7l8() {
            return NumberPicker.this.getWrapSelectorWheel() || NumberPicker.this.getValue() > NumberPicker.this.getMinValue();
        }

        /* JADX INFO: renamed from: g */
        private String m26367g() {
            int iM26354r = NumberPicker.this.f40906j + 1;
            if (NumberPicker.this.bq) {
                iM26354r = NumberPicker.this.m26354r(iM26354r);
            }
            if (iM26354r <= NumberPicker.this.f40901e) {
                return NumberPicker.this.f40902f == null ? NumberPicker.this.oc(iM26354r) : NumberPicker.this.f40902f[iM26354r - NumberPicker.this.f40899c];
            }
            return null;
        }

        /* JADX INFO: renamed from: k */
        private AccessibilityNodeInfo m26368k(int i2, int i3, int i4, int i5) {
            AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
            accessibilityNodeInfoObtain.setClassName(NumberPicker.class.getName());
            accessibilityNodeInfoObtain.setPackageName(NumberPicker.this.getContext().getPackageName());
            accessibilityNodeInfoObtain.setSource(NumberPicker.this);
            if (f7l8()) {
                accessibilityNodeInfoObtain.addChild(NumberPicker.this, 3);
            }
            accessibilityNodeInfoObtain.addChild(NumberPicker.this, 2);
            if (m26373y()) {
                accessibilityNodeInfoObtain.addChild(NumberPicker.this, 1);
            }
            accessibilityNodeInfoObtain.setParent((View) NumberPicker.this.getParentForAccessibility());
            accessibilityNodeInfoObtain.setEnabled(NumberPicker.this.isEnabled());
            accessibilityNodeInfoObtain.setScrollable(true);
            Rect rect = this.f40936k;
            rect.set(i2, i3, i4, i5);
            accessibilityNodeInfoObtain.setBoundsInParent(rect);
            accessibilityNodeInfoObtain.setVisibleToUser(NumberPicker.this.getVisibility() == 0);
            int[] iArr = this.f88007toq;
            NumberPicker.this.getLocationOnScreen(iArr);
            rect.offset(iArr[0], iArr[1]);
            accessibilityNodeInfoObtain.setBoundsInScreen(rect);
            if (this.f88008zy != -1) {
                accessibilityNodeInfoObtain.addAction(64);
            }
            if (this.f88008zy == -1) {
                accessibilityNodeInfoObtain.addAction(128);
            }
            if (NumberPicker.this.isEnabled()) {
                if (NumberPicker.this.getWrapSelectorWheel() || NumberPicker.this.getValue() < NumberPicker.this.getMaxValue()) {
                    accessibilityNodeInfoObtain.addAction(4096);
                }
                if (NumberPicker.this.getWrapSelectorWheel() || NumberPicker.this.getValue() > NumberPicker.this.getMinValue()) {
                    accessibilityNodeInfoObtain.addAction(8192);
                }
            }
            return accessibilityNodeInfoObtain;
        }

        /* JADX INFO: renamed from: n */
        private String m26369n() {
            int iM26354r = NumberPicker.this.f40906j - 1;
            if (NumberPicker.this.bq) {
                iM26354r = NumberPicker.this.m26354r(iM26354r);
            }
            if (iM26354r >= NumberPicker.this.f40899c) {
                return NumberPicker.this.f40902f == null ? NumberPicker.this.oc(iM26354r) : NumberPicker.this.f40902f[iM26354r - NumberPicker.this.f40899c];
            }
            return null;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        /* JADX INFO: renamed from: p */
        private void m26370p(int i2) {
            if (((AccessibilityManager) NumberPicker.this.getContext().getSystemService("accessibility")).isEnabled()) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i2);
                NumberPicker.this.f40921y.onInitializeAccessibilityEvent(accessibilityEventObtain);
                NumberPicker.this.f40921y.onPopulateAccessibilityEvent(accessibilityEventObtain);
                accessibilityEventObtain.setSource(NumberPicker.this, 2);
                NumberPicker numberPicker = NumberPicker.this;
                numberPicker.requestSendAccessibilityEvent(numberPicker, accessibilityEventObtain);
            }
        }

        /* JADX INFO: renamed from: q */
        private void m26371q(String str, int i2, List<AccessibilityNodeInfo> list) {
            if (i2 == 1) {
                String strM26367g = m26367g();
                if (TextUtils.isEmpty(strM26367g) || !strM26367g.toString().toLowerCase().contains(str)) {
                    return;
                }
                list.add(createAccessibilityNodeInfo(1));
                return;
            }
            if (i2 != 2) {
                if (i2 != 3) {
                    return;
                }
                String strM26369n = m26369n();
                if (TextUtils.isEmpty(strM26369n) || !strM26369n.toString().toLowerCase().contains(str)) {
                    return;
                }
                list.add(createAccessibilityNodeInfo(3));
                return;
            }
            Editable text = NumberPicker.this.f40921y.getText();
            if (!TextUtils.isEmpty(text) && text.toString().toLowerCase().contains(str)) {
                list.add(createAccessibilityNodeInfo(2));
                return;
            }
            Editable text2 = NumberPicker.this.f40921y.getText();
            if (TextUtils.isEmpty(text2) || !text2.toString().toLowerCase().contains(str)) {
                return;
            }
            list.add(createAccessibilityNodeInfo(2));
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        /* JADX INFO: renamed from: s */
        private void m26372s(int i2, int i3, String str) {
            if (((AccessibilityManager) NumberPicker.this.getContext().getSystemService("accessibility")).isEnabled()) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i3);
                accessibilityEventObtain.setClassName(Button.class.getName());
                accessibilityEventObtain.setPackageName(NumberPicker.this.getContext().getPackageName());
                accessibilityEventObtain.getText().add(str);
                accessibilityEventObtain.setEnabled(NumberPicker.this.isEnabled());
                accessibilityEventObtain.setSource(NumberPicker.this, i2);
                NumberPicker numberPicker = NumberPicker.this;
                numberPicker.requestSendAccessibilityEvent(numberPicker, accessibilityEventObtain);
            }
        }

        private AccessibilityNodeInfo toq(int i2, String str, int i3, int i4, int i5, int i6) {
            AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
            accessibilityNodeInfoObtain.setClassName(Button.class.getName());
            accessibilityNodeInfoObtain.setPackageName(NumberPicker.this.getContext().getPackageName());
            accessibilityNodeInfoObtain.setSource(NumberPicker.this, i2);
            accessibilityNodeInfoObtain.setParent(NumberPicker.this);
            accessibilityNodeInfoObtain.setText(str);
            accessibilityNodeInfoObtain.setClickable(true);
            accessibilityNodeInfoObtain.setLongClickable(true);
            accessibilityNodeInfoObtain.setEnabled(NumberPicker.this.isEnabled());
            Rect rect = this.f40936k;
            rect.set(i3, i4, i5, i6);
            accessibilityNodeInfoObtain.setVisibleToUser(NumberPicker.this.getVisibility() == 0);
            accessibilityNodeInfoObtain.setBoundsInParent(rect);
            int[] iArr = this.f88007toq;
            NumberPicker.this.getLocationOnScreen(iArr);
            rect.offset(iArr[0], iArr[1]);
            accessibilityNodeInfoObtain.setBoundsInScreen(rect);
            if (this.f88008zy != i2) {
                accessibilityNodeInfoObtain.addAction(64);
            }
            if (this.f88008zy == i2) {
                accessibilityNodeInfoObtain.addAction(128);
            }
            if (NumberPicker.this.isEnabled()) {
                accessibilityNodeInfoObtain.addAction(16);
            }
            return accessibilityNodeInfoObtain;
        }

        /* JADX INFO: renamed from: y */
        private boolean m26373y() {
            return NumberPicker.this.getWrapSelectorWheel() || NumberPicker.this.getValue() < NumberPicker.this.getMaxValue();
        }

        private AccessibilityNodeInfo zy(int i2, int i3, int i4, int i5) {
            AccessibilityNodeInfo accessibilityNodeInfoCreateAccessibilityNodeInfo = NumberPicker.this.f40921y.createAccessibilityNodeInfo();
            accessibilityNodeInfoCreateAccessibilityNodeInfo.setSource(NumberPicker.this, 2);
            if (this.f88008zy != 2) {
                accessibilityNodeInfoCreateAccessibilityNodeInfo.addAction(64);
            }
            if (this.f88008zy == 2) {
                accessibilityNodeInfoCreateAccessibilityNodeInfo.addAction(128);
            }
            Rect rect = this.f40936k;
            rect.set(i2, i3, i4, i5);
            accessibilityNodeInfoCreateAccessibilityNodeInfo.setVisibleToUser(NumberPicker.this.getVisibility() == 0);
            accessibilityNodeInfoCreateAccessibilityNodeInfo.setBoundsInParent(rect);
            int[] iArr = this.f88007toq;
            NumberPicker.this.getLocationOnScreen(iArr);
            rect.offset(iArr[0], iArr[1]);
            accessibilityNodeInfoCreateAccessibilityNodeInfo.setBoundsInScreen(rect);
            return accessibilityNodeInfoCreateAccessibilityNodeInfo;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i2) {
            return i2 != -1 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? super.createAccessibilityNodeInfo(i2) : toq(3, m26369n(), NumberPicker.this.getScrollX(), NumberPicker.this.getScrollY(), NumberPicker.this.getScrollX() + (NumberPicker.this.getRight() - NumberPicker.this.getLeft()), NumberPicker.this.aj + NumberPicker.this.ad) : zy(NumberPicker.this.getScrollX(), NumberPicker.this.aj + NumberPicker.this.ad, NumberPicker.this.getScrollX() + (NumberPicker.this.getRight() - NumberPicker.this.getLeft()), NumberPicker.this.bs - NumberPicker.this.ad) : toq(1, m26367g(), NumberPicker.this.getScrollX(), NumberPicker.this.bs - NumberPicker.this.ad, NumberPicker.this.getScrollX() + (NumberPicker.this.getRight() - NumberPicker.this.getLeft()), NumberPicker.this.getScrollY() + (NumberPicker.this.getBottom() - NumberPicker.this.getTop())) : m26368k(NumberPicker.this.getScrollX(), NumberPicker.this.getScrollY(), NumberPicker.this.getScrollX() + (NumberPicker.this.getRight() - NumberPicker.this.getLeft()), NumberPicker.this.getScrollY() + (NumberPicker.this.getBottom() - NumberPicker.this.getTop()));
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i2) {
            if (TextUtils.isEmpty(str)) {
                return Collections.emptyList();
            }
            String lowerCase = str.toLowerCase();
            ArrayList arrayList = new ArrayList();
            if (i2 == -1) {
                m26371q(lowerCase, 3, arrayList);
                m26371q(lowerCase, 2, arrayList);
                m26371q(lowerCase, 1, arrayList);
                return arrayList;
            }
            if (i2 != 1 && i2 != 2 && i2 != 3) {
                return super.findAccessibilityNodeInfosByText(str, i2);
            }
            m26371q(lowerCase, i2, arrayList);
            return arrayList;
        }

        public void ld6(int i2, int i3) {
            if (i2 == 1) {
                if (m26373y()) {
                    m26372s(i2, i3, m26367g());
                }
            } else if (i2 == 2) {
                m26370p(i3);
            } else if (i2 == 3 && f7l8()) {
                m26372s(i2, i3, m26369n());
            }
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i2, int i3, Bundle bundle) {
            if (i2 != -1) {
                if (i2 == 1) {
                    if (i3 == 16) {
                        if (!NumberPicker.this.isEnabled()) {
                            return false;
                        }
                        NumberPicker.this.m26356t(true);
                        ld6(i2, 1);
                        return true;
                    }
                    if (i3 == 64) {
                        if (this.f88008zy == i2) {
                            return false;
                        }
                        this.f88008zy = i2;
                        ld6(i2, 32768);
                        NumberPicker numberPicker = NumberPicker.this;
                        numberPicker.invalidate(0, numberPicker.bs, NumberPicker.this.getRight(), NumberPicker.this.getBottom());
                        return true;
                    }
                    if (i3 != 128 || this.f88008zy != i2) {
                        return false;
                    }
                    this.f88008zy = Integer.MIN_VALUE;
                    ld6(i2, 65536);
                    NumberPicker numberPicker2 = NumberPicker.this;
                    numberPicker2.invalidate(0, numberPicker2.bs, NumberPicker.this.getRight(), NumberPicker.this.getBottom());
                    return true;
                }
                if (i2 == 2) {
                    if (i3 == 1) {
                        if (!NumberPicker.this.isEnabled() || NumberPicker.this.f40921y.isFocused()) {
                            return false;
                        }
                        return NumberPicker.this.f40921y.requestFocus();
                    }
                    if (i3 == 2) {
                        if (!NumberPicker.this.isEnabled() || !NumberPicker.this.f40921y.isFocused()) {
                            return false;
                        }
                        NumberPicker.this.f40921y.clearFocus();
                        return true;
                    }
                    if (i3 == 16) {
                        return NumberPicker.this.isEnabled();
                    }
                    if (i3 == 64) {
                        if (this.f88008zy == i2) {
                            return false;
                        }
                        this.f88008zy = i2;
                        ld6(i2, 32768);
                        NumberPicker.this.f40921y.invalidate();
                        return true;
                    }
                    if (i3 != 128) {
                        return NumberPicker.this.f40921y.performAccessibilityAction(i3, bundle);
                    }
                    if (this.f88008zy != i2) {
                        return false;
                    }
                    this.f88008zy = Integer.MIN_VALUE;
                    ld6(i2, 65536);
                    NumberPicker.this.f40921y.invalidate();
                    return true;
                }
                if (i2 == 3) {
                    if (i3 == 16) {
                        if (!NumberPicker.this.isEnabled()) {
                            return false;
                        }
                        NumberPicker.this.m26356t(i2 == 1);
                        ld6(i2, 1);
                        return true;
                    }
                    if (i3 == 64) {
                        if (this.f88008zy == i2) {
                            return false;
                        }
                        this.f88008zy = i2;
                        ld6(i2, 32768);
                        NumberPicker numberPicker3 = NumberPicker.this;
                        numberPicker3.invalidate(0, 0, numberPicker3.getRight(), NumberPicker.this.aj);
                        return true;
                    }
                    if (i3 != 128 || this.f88008zy != i2) {
                        return false;
                    }
                    this.f88008zy = Integer.MIN_VALUE;
                    ld6(i2, 65536);
                    NumberPicker numberPicker4 = NumberPicker.this;
                    numberPicker4.invalidate(0, 0, numberPicker4.getRight(), NumberPicker.this.aj);
                    return true;
                }
            } else {
                if (i3 == 64) {
                    if (this.f88008zy == i2) {
                        return false;
                    }
                    this.f88008zy = i2;
                    return true;
                }
                if (i3 == 128) {
                    if (this.f88008zy != i2) {
                        return false;
                    }
                    this.f88008zy = Integer.MIN_VALUE;
                    return true;
                }
                if (i3 == 4096) {
                    if (!NumberPicker.this.isEnabled() || (!NumberPicker.this.getWrapSelectorWheel() && NumberPicker.this.getValue() >= NumberPicker.this.getMaxValue())) {
                        return false;
                    }
                    NumberPicker.this.m26356t(true);
                    return true;
                }
                if (i3 == 8192) {
                    if (!NumberPicker.this.isEnabled() || (!NumberPicker.this.getWrapSelectorWheel() && NumberPicker.this.getValue() <= NumberPicker.this.getMinValue())) {
                        return false;
                    }
                    NumberPicker.this.m26356t(false);
                    return true;
                }
            }
            return super.performAction(i2, i3, bundle);
        }
    }

    class qrj implements Runnable {

        /* JADX INFO: renamed from: k */
        private int f40938k;

        /* JADX INFO: renamed from: q */
        private int f40940q;

        qrj() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f40940q < NumberPicker.this.f40921y.length()) {
                NumberPicker.this.f40921y.setSelection(this.f40938k, this.f40940q);
            }
        }
    }

    class toq implements View.OnTouchListener {
        toq() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 1 && actionMasked != 3) {
                return false;
            }
            NumberPicker.this.gvn7();
            return false;
        }
    }

    class x2 implements Runnable {

        /* JADX INFO: renamed from: p */
        public static final int f40943p = 2;

        /* JADX INFO: renamed from: s */
        public static final int f40944s = 1;

        /* JADX INFO: renamed from: g */
        private int f40945g;

        /* JADX INFO: renamed from: n */
        private int f40947n;

        /* JADX INFO: renamed from: k */
        private final int f40946k = 1;

        /* JADX INFO: renamed from: q */
        private final int f40948q = 2;

        x2() {
        }

        /* JADX INFO: renamed from: k */
        public void m26375k(int i2) {
            zy();
            this.f40945g = 1;
            this.f40947n = i2;
            NumberPicker.this.postDelayed(this, ViewConfiguration.getTapTimeout());
        }

        @Override // java.lang.Runnable
        public void run() {
            int i2 = this.f40945g;
            if (i2 == 1) {
                int i3 = this.f40947n;
                if (i3 == 1) {
                    NumberPicker.this.ar = true;
                    NumberPicker numberPicker = NumberPicker.this;
                    numberPicker.invalidate(0, numberPicker.bs, NumberPicker.this.getRight(), NumberPicker.this.getBottom());
                    return;
                } else {
                    if (i3 != 2) {
                        return;
                    }
                    NumberPicker.this.bc = true;
                    NumberPicker numberPicker2 = NumberPicker.this;
                    numberPicker2.invalidate(0, 0, numberPicker2.getRight(), NumberPicker.this.aj);
                    return;
                }
            }
            if (i2 != 2) {
                return;
            }
            int i4 = this.f40947n;
            if (i4 == 1) {
                if (!NumberPicker.this.ar) {
                    NumberPicker.this.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                }
                NumberPicker.m26359y(NumberPicker.this, 1);
                NumberPicker numberPicker3 = NumberPicker.this;
                numberPicker3.invalidate(0, numberPicker3.bs, NumberPicker.this.getRight(), NumberPicker.this.getBottom());
                return;
            }
            if (i4 != 2) {
                return;
            }
            if (!NumberPicker.this.bc) {
                NumberPicker.this.postDelayed(this, ViewConfiguration.getPressedStateDuration());
            }
            NumberPicker.x2(NumberPicker.this, 1);
            NumberPicker numberPicker4 = NumberPicker.this;
            numberPicker4.invalidate(0, 0, numberPicker4.getRight(), NumberPicker.this.aj);
        }

        public void toq(int i2) {
            zy();
            this.f40945g = 2;
            this.f40947n = i2;
            NumberPicker.this.post(this);
        }

        public void zy() {
            this.f40945g = 0;
            this.f40947n = 0;
            NumberPicker.this.removeCallbacks(this);
            if (NumberPicker.this.ar) {
                NumberPicker.this.ar = false;
                NumberPicker numberPicker = NumberPicker.this;
                numberPicker.invalidate(0, numberPicker.bs, NumberPicker.this.getRight(), NumberPicker.this.getBottom());
            }
            if (NumberPicker.this.bc) {
                NumberPicker.this.bc = false;
                NumberPicker numberPicker2 = NumberPicker.this;
                numberPicker2.invalidate(0, 0, numberPicker2.getRight(), NumberPicker.this.aj);
            }
        }
    }

    /* JADX INFO: renamed from: miuix.pickerwidget.widget.NumberPicker$y */
    class C7247y extends NumberKeyListener {
        C7247y() {
        }

        @Override // android.text.method.NumberKeyListener, android.text.InputFilter
        public CharSequence filter(CharSequence charSequence, int i2, int i3, Spanned spanned, int i4, int i5) {
            if (NumberPicker.this.f40902f == null) {
                CharSequence charSequenceFilter = super.filter(charSequence, i2, i3, spanned, i4, i5);
                if (charSequenceFilter == null) {
                    charSequenceFilter = charSequence.subSequence(i2, i3);
                }
                String str = String.valueOf(spanned.subSequence(0, i4)) + ((Object) charSequenceFilter) + ((Object) spanned.subSequence(i5, spanned.length()));
                return "".equals(str) ? str : (NumberPicker.this.d2ok(str) > NumberPicker.this.f40901e || str.length() > String.valueOf(NumberPicker.this.f40901e).length()) ? "" : charSequenceFilter;
            }
            String strValueOf = String.valueOf(charSequence.subSequence(i2, i3));
            if (TextUtils.isEmpty(strValueOf)) {
                return "";
            }
            String str2 = String.valueOf(spanned.subSequence(0, i4)) + ((Object) strValueOf) + ((Object) spanned.subSequence(i5, spanned.length()));
            String lowerCase = String.valueOf(str2).toLowerCase();
            for (String str3 : NumberPicker.this.f40902f) {
                if (str3.toLowerCase().startsWith(lowerCase)) {
                    NumberPicker.this.y9n(str2.length(), str3.length());
                    return str3.subSequence(i4, str3.length());
                }
            }
            return "";
        }

        @Override // android.text.method.NumberKeyListener
        protected char[] getAcceptedChars() {
            return NumberPicker.gjxq;
        }

        @Override // android.text.method.KeyListener
        public int getInputType() {
            return 1;
        }
    }

    class zy implements View.OnFocusChangeListener {
        zy() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z2) {
            if (z2) {
                NumberPicker.this.f40921y.selectAll();
            } else {
                NumberPicker.this.f40921y.setSelection(0, 0);
                NumberPicker.this.m26357u(view);
            }
        }
    }

    public NumberPicker(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: a */
    private void m26338a() {
        RunnableC7240g runnableC7240g = this.an;
        if (runnableC7240g != null) {
            removeCallbacks(runnableC7240g);
        }
    }

    private float a9(Canvas canvas, float f2, float f3) {
        float f4 = this.f40919w;
        SparseArray<String> sparseArray = this.f40920x;
        for (int i2 : this.f40917u) {
            String str = sparseArray.get(i2);
            float fAbs = Math.abs(f3 - f4) / this.f40918v;
            int i3 = this.sk1t;
            float f5 = i3;
            float f6 = this.vb6;
            if (f5 > f6) {
                i3 = (int) f6;
            } else {
                float width = getWidth() / this.f87999bo.measureText(str);
                if (width < 1.0f) {
                    i3 = (int) (this.sk1t * width);
                }
            }
            float fLvui = lvui(fAbs, i3, this.dy);
            this.f87999bo.setTextSize(fLvui);
            this.f87999bo.setColor(eqxt(fAbs, this.q7k9, false));
            canvas.drawText(str, f2, ((fLvui - this.dy) / 2.0f) + f4, this.f87999bo);
            if (fAbs < 1.0f) {
                this.f87999bo.setColor(eqxt(fAbs, this.th6, true));
                canvas.drawText(str, f2, ((fLvui - this.dy) / 2.0f) + f4, this.f87999bo);
            }
            f4 += this.f40918v;
        }
        return f4;
    }

    private void a98o() {
        RunnableC7242n runnableC7242n = this.id;
        if (runnableC7242n != null) {
            removeCallbacks(runnableC7242n);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m26339b() {
        lrht();
        invalidate();
    }

    private void bf2() {
        n7h n7hVar = this.f40903g;
        if (n7hVar != null) {
            n7hVar.zy(this.f40907k);
            this.f40903g = null;
        }
    }

    /* JADX INFO: renamed from: c */
    private void m26340c() {
        lrht();
        float bottom = (getBottom() - getTop()) - (this.f40917u.length * this.f40914r);
        if (bottom < 0.0f) {
            bottom = 0.0f;
        }
        int length = (int) ((bottom / r0.length) + 0.5f);
        this.f40908l = length;
        this.f40918v = this.f40914r + length;
        int baseline = (this.f40921y.getBaseline() + this.f40921y.getTop()) - (this.f40918v * 1);
        this.f40900d = baseline;
        this.f40919w = baseline;
        t8iq();
    }

    private void ch() {
        n7h n7hVar = this.f40903g;
        if (n7hVar != null) {
            n7hVar.m26364q();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int d2ok(String str) {
        try {
            if (this.f40902f == null) {
                return Integer.parseInt(str);
            }
            for (int i2 = 0; i2 < this.f40902f.length; i2++) {
                str = str.toLowerCase();
                if (this.f40902f[i2].toLowerCase().startsWith(str)) {
                    return this.f40899c + i2;
                }
            }
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return this.f40899c;
        }
    }

    private void d3(int i2) {
        this.bp = 0;
        if (i2 > 0) {
            this.f87998ab.fling(0, 0, 0, i2, 0, 0, 0, Integer.MAX_VALUE);
        } else {
            this.f87998ab.fling(0, Integer.MAX_VALUE, 0, i2, 0, 0, 0, Integer.MAX_VALUE);
        }
        invalidate();
    }

    private void dd(int[] iArr) {
        if (iArr.length - 1 >= 0) {
            System.arraycopy(iArr, 1, iArr, 0, iArr.length - 1);
        }
        int i2 = iArr[iArr.length - 2] + 1;
        if (this.bq && i2 > this.f40901e) {
            i2 = this.f40899c;
        }
        iArr[iArr.length - 1] = i2;
        fti(i2);
    }

    /* JADX INFO: renamed from: e */
    private boolean m26341e(Scroller scroller) {
        scroller.forceFinished(true);
        int finalY = scroller.getFinalY() - scroller.getCurrY();
        int i2 = this.f40900d - ((this.f40919w + finalY) % this.f40918v);
        if (i2 == 0) {
            return false;
        }
        int iAbs = Math.abs(i2);
        int i3 = this.f40918v;
        if (iAbs > i3 / 2) {
            i2 = i2 > 0 ? i2 - i3 : i2 + i3;
        }
        scrollBy(0, finalY + i2);
        return true;
    }

    private void ek5k() {
        RunnableC7242n runnableC7242n = this.id;
        if (runnableC7242n == null) {
            this.id = new RunnableC7242n();
        } else {
            removeCallbacks(runnableC7242n);
        }
        postDelayed(this.id, ViewConfiguration.getLongPressTimeout());
    }

    private int eqxt(float f2, int i2, boolean z2) {
        if (f2 >= 1.0f) {
            return i2;
        }
        return (((int) (z2 ? ((-f2) * Color.alpha(i2)) + Color.alpha(i2) : f2 * Color.alpha(i2))) << 24) | (i2 & C0683f.f50797t8r);
    }

    /* JADX INFO: renamed from: f */
    private void m26342f() {
        setVerticalFadingEdgeEnabled(true);
        setFadingEdgeLength(((getBottom() - getTop()) - this.f40914r) / 2);
    }

    private void fti(int i2) {
        String strOc;
        SparseArray<String> sparseArray = this.f40920x;
        if (sparseArray.get(i2) != null) {
            return;
        }
        int i3 = this.f40899c;
        if (i2 < i3 || i2 > this.f40901e) {
            strOc = "";
        } else {
            String[] strArr = this.f40902f;
            strOc = strArr != null ? strArr[i2 - i3] : oc(i2);
        }
        sparseArray.put(i2, strOc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gvn7() {
        if (this.zsl) {
            this.zsl = false;
            this.wra.setEffect(IHoverStyle.HoverEffect.NORMAL).hoverExit(new AnimConfig[0]);
        }
    }

    private void hb(int i2) {
        if (this.am == i2) {
            return;
        }
        if (i2 == 0) {
            String str = this.zr5t;
            if (str != null && !str.equals(this.f40921y.getText().toString())) {
                this.f40921y.setText(this.zr5t);
            }
            this.zr5t = null;
            ch();
        }
        this.am = i2;
        InterfaceC7244p interfaceC7244p = this.f40909m;
        if (interfaceC7244p != null) {
            interfaceC7244p.m26366k(this, i2);
        }
    }

    private void hyr() {
        this.mjvl = getContext().getResources().getDimensionPixelSize(toq.f7l8.f97424cv06);
        this.vb6 = getContext().getResources().getDimensionPixelSize(toq.f7l8.f97448h7am);
    }

    private void i1() {
        RunnableC7240g runnableC7240g = this.an;
        if (runnableC7240g != null) {
            removeCallbacks(runnableC7240g);
        }
        qrj qrjVar = this.bv;
        if (qrjVar != null) {
            removeCallbacks(qrjVar);
        }
        RunnableC7242n runnableC7242n = this.id;
        if (runnableC7242n != null) {
            removeCallbacks(runnableC7242n);
        }
        this.bd.zy();
    }

    /* JADX INFO: renamed from: j */
    private void m26346j(Scroller scroller) {
        if (scroller == this.f87998ab) {
            if (!jp0y()) {
                t8iq();
            }
            hb(0);
        } else if (this.am != 1) {
            t8iq();
        }
    }

    private void jk(Canvas canvas, float f2, float f3, float f4) {
        if (TextUtils.isEmpty(this.d1cy) || uv6()) {
            return;
        }
        float fMeasureText = this.w97r.measureText(this.d1cy.toString());
        canvas.drawText(this.d1cy.toString(), nmn5.toq(this) ? Math.max(((f2 - (this.zmmu / 2.0f)) - this.f40913q) - fMeasureText, 0.0f) : Math.min(f2 + (this.zmmu / 2.0f) + this.f40913q, getWidth() - fMeasureText), (f3 - (this.sk1t / 2.0f)) + (this.xk5 / 2.0f) + this.f40910n, this.w97r);
    }

    private boolean jp0y() {
        int i2 = this.f40900d - this.f40919w;
        if (i2 == 0) {
            return false;
        }
        this.bp = 0;
        int iAbs = Math.abs(i2);
        int i3 = this.f40918v;
        if (iAbs > i3 / 2) {
            if (i2 > 0) {
                i3 = -i3;
            }
            i2 += i3;
        }
        this.bb.startScroll(0, 0, 0, i2, 800);
        invalidate();
        return true;
    }

    /* JADX INFO: renamed from: l */
    private Paint m26348l() {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setTextSize(this.sk1t);
        paint.setTypeface(this.f40921y.getTypeface());
        paint.setColor(this.f40921y.getTextColors().getColorForState(LinearLayout.ENABLED_STATE_SET, -1));
        return paint;
    }

    private void lrht() {
        this.f40920x.clear();
        int[] iArr = this.f40917u;
        int value = getValue();
        for (int i2 = 0; i2 < this.f40917u.length; i2++) {
            int iM26354r = (i2 - 1) + value;
            if (this.bq) {
                iM26354r = m26354r(iM26354r);
            }
            iArr[i2] = iM26354r;
            fti(iM26354r);
        }
    }

    private void lv5() {
        String str;
        float f2;
        if (this.f40916t) {
            String str2 = null;
            float f3 = -1.0f;
            this.f87999bo.setTextSize(this.sk1t);
            String[] strArr = this.f40902f;
            int i2 = 0;
            if (strArr == null) {
                float f4 = 0.0f;
                int i3 = 0;
                while (i2 < 9) {
                    float fMeasureText = this.f87999bo.measureText(String.valueOf(i2));
                    if (fMeasureText > f4) {
                        f4 = fMeasureText;
                        i3 = i2;
                    }
                    i2++;
                }
                int length = oc(this.f40901e).length();
                f2 = (int) (length * f4);
                char[] cArr = new char[length];
                Arrays.fill(cArr, (char) (i3 + 48));
                str = new String(cArr);
            } else {
                int length2 = strArr.length;
                while (i2 < length2) {
                    String str3 = this.f40902f[i2];
                    float fMeasureText2 = this.f87999bo.measureText(str3);
                    if (fMeasureText2 > f3) {
                        str2 = str3;
                        f3 = fMeasureText2;
                    }
                    i2++;
                }
                float f5 = f3;
                str = str2;
                f2 = f5;
            }
            this.zmmu = f2;
            this.yl25 = str;
            float paddingLeft = f2 + this.f40921y.getPaddingLeft() + this.f40921y.getPaddingRight() + getPaddingLeft() + getPaddingRight();
            if (this.f40922z != paddingLeft) {
                int i4 = this.f40905i;
                if (paddingLeft > i4) {
                    this.f40922z = (int) paddingLeft;
                } else {
                    this.f40922z = i4;
                }
            }
        }
    }

    private float lvui(float f2, int i2, int i3) {
        return f2 >= 1.0f ? i3 : (f2 * (i3 - i2)) + i2;
    }

    /* JADX INFO: renamed from: m */
    private void m26349m() {
        n7h n7hVar = this.f40903g;
        if (n7hVar != null) {
            n7hVar.toq();
        }
    }

    private void mcp(int[] iArr) {
        if (iArr.length - 1 >= 0) {
            System.arraycopy(iArr, 0, iArr, 1, iArr.length - 1);
        }
        int i2 = iArr[1] - 1;
        if (this.bq && i2 < this.f40899c) {
            i2 = this.f40901e;
        }
        iArr[0] = i2;
        fti(i2);
    }

    private void n5r1() {
        if (this.f40903g == null) {
            n7h n7hVar = new n7h(C7233k.m26310k(ut));
            this.f40903g = n7hVar;
            n7hVar.m26363k(getContext().getApplicationContext(), this.f40907k);
        }
    }

    private void ncyb() {
        Paint paint = new Paint();
        this.w97r = paint;
        paint.setAntiAlias(true);
        this.w97r.setFakeBoldText(true);
        this.w97r.setColor(this.ndjo);
        this.w97r.setTextSize(this.xk5);
    }

    private void nmn5(float f2) {
        if (getLabelWidth() > 0.0f) {
            int i2 = this.s8y;
            this.xk5 = i2;
            this.w97r.setTextSize(i2);
            while ((this.zmmu / 2.0f) + f2 + this.f40913q + getLabelWidth() > getWidth()) {
                int i3 = this.xk5;
                if (i3 <= this.mjvl) {
                    return;
                }
                int i4 = (int) (i3 * this.hp);
                this.xk5 = i4;
                this.w97r.setTextSize(i4);
            }
        }
    }

    private void nn86(int i2) {
        sendAccessibilityEvent(4);
        m26349m();
        HapticCompat.m26766g(this, C7385p.f92234d3, C7385p.f92251qrj);
        ld6 ld6Var = this.f40911o;
        if (ld6Var != null) {
            ld6Var.mo26324k(this, i2, this.f40906j);
        }
    }

    /* JADX INFO: renamed from: o */
    private void m26351o(AttributeSet attributeSet, int i2) {
        Resources resources = getResources();
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, toq.cdj.h4g, i2, toq.C7737h.le9);
        this.d1cy = typedArrayObtainStyledAttributes.getText(toq.cdj.eh);
        this.sk1t = typedArrayObtainStyledAttributes.getDimensionPixelSize(toq.cdj.an, resources.getDimensionPixelOffset(toq.f7l8.f97523zkd));
        this.dy = typedArrayObtainStyledAttributes.getDimensionPixelSize(toq.cdj.fvqg, resources.getDimensionPixelOffset(toq.f7l8.f97459jz5));
        this.xk5 = typedArrayObtainStyledAttributes.getDimensionPixelSize(toq.cdj.u3gu, resources.getDimensionPixelOffset(toq.f7l8.f97418bwp));
        this.th6 = typedArrayObtainStyledAttributes.getColor(toq.cdj.ngvg, resources.getColor(toq.C7736g.f45096a));
        this.q7k9 = typedArrayObtainStyledAttributes.getColor(toq.cdj.ek, resources.getColor(toq.C7736g.f45119x));
        this.ndjo = typedArrayObtainStyledAttributes.getColor(toq.cdj.fn9, resources.getColor(toq.C7736g.f97675t8iq));
        this.tgs = typedArrayObtainStyledAttributes.getDimensionPixelSize(toq.cdj.qspg, resources.getDimensionPixelOffset(toq.f7l8.f97460kcsr));
        typedArrayObtainStyledAttributes.recycle();
        this.s8y = this.xk5;
        this.cw14 = this.sk1t;
        this.xy8 = this.dy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String oc(int i2) {
        f7l8 f7l8Var = this.f40898b;
        return f7l8Var != null ? f7l8Var.mo26361k(i2) : C0006k.toq(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public int m26354r(int i2) {
        int i3 = this.f40901e;
        if (i2 > i3) {
            int i4 = this.f40899c;
            return (i4 + ((i2 - i3) % (i3 - i4))) - 1;
        }
        int i5 = this.f40899c;
        return i2 < i5 ? (i3 - ((i5 - i2) % (i3 - i5))) + 1 : i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public void m26356t(boolean z2) {
        if (!this.ac) {
            if (z2) {
                m26358x(this.f40906j + 1, true);
                return;
            } else {
                m26358x(this.f40906j - 1, true);
                return;
            }
        }
        this.f40921y.setVisibility(4);
        if (!m26341e(this.f87998ab)) {
            m26341e(this.bb);
        }
        this.bp = 0;
        if (z2) {
            this.f87998ab.startScroll(0, 0, 0, -this.f40918v, 300);
        } else {
            this.f87998ab.startScroll(0, 0, 0, this.f40918v, 300);
        }
        invalidate();
    }

    private boolean t8iq() {
        String displayedMaxText = getDisplayedMaxText();
        if (TextUtils.isEmpty(displayedMaxText)) {
            return false;
        }
        if (this.am != 0) {
            this.zr5t = displayedMaxText;
            return true;
        }
        if (displayedMaxText.equals(this.f40921y.getText().toString())) {
            return true;
        }
        this.f40921y.setText(displayedMaxText);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public void m26357u(View view) {
        String strValueOf = String.valueOf(((TextView) view).getText());
        if (TextUtils.isEmpty(strValueOf)) {
            t8iq();
        } else {
            m26358x(d2ok(strValueOf), true);
        }
    }

    private boolean uv6() {
        if (this.ei == null) {
            this.ei = (String) C7168p.toq(C7168p.zy("android.os.SystemProperties"), String.class, "get", new Class[]{String.class, String.class}, "ro.product.mod_device", "");
        }
        return this.ei.endsWith("_global");
    }

    private int vyq(int i2, int i3) {
        if (i3 == -1) {
            return i2;
        }
        int size = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
        }
        if (mode == 0) {
            return View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        }
        if (mode == 1073741824) {
            return i2;
        }
        throw new IllegalArgumentException("Unknown measure mode: " + mode);
    }

    /* JADX INFO: renamed from: x */
    private void m26358x(int i2, boolean z2) {
        int iM26354r = this.bq ? m26354r(i2) : Math.min(Math.max(i2, this.f40899c), this.f40901e);
        int i3 = this.f40906j;
        if (i3 == iM26354r) {
            return;
        }
        this.f40906j = iM26354r;
        t8iq();
        if (z2) {
            nn86(i3);
        }
        lrht();
        invalidate();
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, byte] */
    static /* synthetic */ boolean x2(NumberPicker numberPicker, int i2) {
        ?? r2 = (byte) (i2 ^ (numberPicker.bc ? 1 : 0));
        numberPicker.bc = r2;
        return r2;
    }

    private void x9kr() {
        this.f40921y.setOnFocusChangeListener(new zy());
        this.f40921y.setFilters(new InputFilter[]{new C7247y()});
        this.f40921y.setRawInputType(2);
        this.f40921y.setImeOptions(6);
        this.f40921y.setVisibility(4);
        this.f40921y.setGravity(androidx.core.view.qrj.f50865toq);
        this.f40921y.setScaleX(0.0f);
        this.f40921y.setSaveEnabled(false);
        EditText editText = this.f40921y;
        editText.setPadding(this.tgs, editText.getPaddingTop(), this.tgs, this.f40921y.getPaddingRight());
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, byte] */
    /* JADX INFO: renamed from: y */
    static /* synthetic */ boolean m26359y(NumberPicker numberPicker, int i2) {
        ?? r2 = (byte) (i2 ^ (numberPicker.ar ? 1 : 0));
        numberPicker.ar = r2;
        return r2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y9n(int i2, int i3) {
        qrj qrjVar = this.bv;
        if (qrjVar == null) {
            this.bv = new qrj();
        } else {
            removeCallbacks(qrjVar);
        }
        this.bv.f40938k = i2;
        this.bv.f40940q = i3;
        post(this.bv);
    }

    private void yz(boolean z2, long j2) {
        RunnableC7240g runnableC7240g = this.an;
        if (runnableC7240g == null) {
            this.an = new RunnableC7240g();
        } else {
            removeCallbacks(runnableC7240g);
        }
        this.an.toq(z2);
        postDelayed(this.an, j2);
    }

    private int zp(int i2, int i3, int i4) {
        return i2 != -1 ? View.resolveSizeAndState(Math.max(i2, i3), i4, 0) : i3;
    }

    @Override // android.view.View
    public void computeScroll() {
        Scroller scroller = this.f87998ab;
        if (scroller.isFinished()) {
            scroller = this.bb;
            if (scroller.isFinished()) {
                return;
            }
        }
        scroller.computeScrollOffset();
        int currY = scroller.getCurrY();
        if (this.bp == 0) {
            this.bp = scroller.getStartY();
        }
        scrollBy(0, currY - this.bp);
        this.bp = currY;
        if (scroller.isFinished()) {
            m26346j(scroller);
        } else {
            invalidate();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x004c, code lost:
    
        requestFocus();
        r5.tlhn = r0;
        i1();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005a, code lost:
    
        if (r5.f87998ab.isFinished() == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005c, code lost:
    
        if (r0 != 20) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005e, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0060, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0061, code lost:
    
        m26356t(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0064, code lost:
    
        return true;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean dispatchKeyEvent(android.view.KeyEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getKeyCode()
            r1 = 19
            r2 = 20
            if (r0 == r1) goto L19
            if (r0 == r2) goto L19
            r1 = 23
            if (r0 == r1) goto L15
            r1 = 66
            if (r0 == r1) goto L15
            goto L65
        L15:
            r5.i1()
            goto L65
        L19:
            boolean r1 = r5.ac
            if (r1 != 0) goto L1e
            goto L65
        L1e:
            int r1 = r6.getAction()
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 == r3) goto L28
            goto L65
        L28:
            int r1 = r5.tlhn
            if (r1 != r0) goto L65
            r6 = -1
            r5.tlhn = r6
            return r3
        L30:
            boolean r1 = r5.bq
            if (r1 != 0) goto L42
            if (r0 != r2) goto L37
            goto L42
        L37:
            int r1 = r5.getValue()
            int r4 = r5.getMinValue()
            if (r1 <= r4) goto L65
            goto L4c
        L42:
            int r1 = r5.getValue()
            int r4 = r5.getMaxValue()
            if (r1 >= r4) goto L65
        L4c:
            r5.requestFocus()
            r5.tlhn = r0
            r5.i1()
            android.widget.Scroller r6 = r5.f87998ab
            boolean r6 = r6.isFinished()
            if (r6 == 0) goto L64
            if (r0 != r2) goto L60
            r6 = r3
            goto L61
        L60:
            r6 = 0
        L61:
            r5.m26356t(r6)
        L64:
            return r3
        L65:
            boolean r6 = super.dispatchKeyEvent(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.pickerwidget.widget.NumberPicker.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 3) {
            i1();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 3) {
            i1();
        }
        return super.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        lv5();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return NumberPicker.class.getName();
    }

    @Override // android.view.View
    protected float getBottomFadingEdgeStrength() {
        return eht;
    }

    protected String getDisplayedMaxText() {
        String str = this.yl25;
        return str == null ? "" : str;
    }

    protected float getDisplayedMaxTextWidth() {
        float textSize = this.f87999bo.getTextSize();
        this.f87999bo.setTextSize(this.cw14);
        float fMeasureText = this.f87999bo.measureText(getDisplayedMaxText());
        this.f87999bo.setTextSize(textSize);
        return fMeasureText;
    }

    public String[] getDisplayedValues() {
        return this.f40902f;
    }

    protected float getLabelWidth() {
        if (TextUtils.isEmpty(this.d1cy) || uv6()) {
            return 0.0f;
        }
        return this.w97r.measureText(this.d1cy.toString());
    }

    public int getMarginLabelLeft() {
        return this.f40913q;
    }

    public int getMaxValue() {
        return this.f40901e;
    }

    public int getMinValue() {
        return this.f40899c;
    }

    public int getOriginTextSizeHighlight() {
        return this.cw14;
    }

    public int getOriginTextSizeHint() {
        return this.xy8;
    }

    public float getOriginalLabelWidth() {
        if (TextUtils.isEmpty(this.d1cy) || uv6()) {
            return 0.0f;
        }
        float textSize = this.w97r.getTextSize();
        this.w97r.setTextSize(this.s8y);
        float fMeasureText = this.w97r.measureText(this.d1cy.toString());
        this.w97r.setTextSize(textSize);
        return fMeasureText;
    }

    public int getTextSizeHighlight() {
        return this.sk1t;
    }

    public int getTextSizeHint() {
        return this.dy;
    }

    @Override // android.view.View
    protected float getTopFadingEdgeStrength() {
        return eht;
    }

    public int getValue() {
        return this.f40906j;
    }

    public boolean getWrapSelectorWheel() {
        return this.bq;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        n5r1();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        hyr();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        bf2();
        i1();
        C7233k.toq(ut);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onDraw(Canvas canvas) {
        if (!this.ac) {
            super.onDraw(canvas);
            return;
        }
        float right = (((getRight() - getLeft()) + getPaddingLeft()) - getPaddingRight()) / 2;
        float f2 = this.f40900d + (this.f40918v * 1);
        jk(canvas, right, f2, a9(canvas, right, f2));
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (isEnabled()) {
            accessibilityNodeInfo.setScrollable(true);
            accessibilityNodeInfo.addAction(8192);
            accessibilityNodeInfo.addAction(4096);
            int i2 = Build.VERSION.SDK_INT;
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS);
            accessibilityNodeInfo.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(0, this.f40899c - 1, this.f40901e + 1, this.f40906j));
            StringBuilder sb = new StringBuilder();
            String[] strArr = this.f40902f;
            sb.append(strArr == null ? oc(this.f40906j) : strArr[this.f40906j - this.f40899c]);
            sb.append(TextUtils.isEmpty(this.d1cy) ? "" : this.d1cy);
            accessibilityNodeInfo.setContentDescription(sb.toString());
            if (i2 >= 30) {
                accessibilityNodeInfo.setStateDescription(getContext().getString(toq.kja0.f97992f1bi));
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.ac || !isEnabled() || motionEvent.getActionMasked() != 0) {
            return false;
        }
        i1();
        this.f40921y.setVisibility(4);
        float y3 = motionEvent.getY();
        this.in = y3;
        this.as = y3;
        this.bl = motionEvent.getEventTime();
        this.ay = false;
        this.be = false;
        float f2 = this.in;
        if (f2 < this.aj) {
            if (this.am == 0) {
                this.bd.m26375k(2);
            }
        } else if (f2 > this.bs && this.am == 0) {
            this.bd.m26375k(1);
        }
        if (!this.f87998ab.isFinished()) {
            this.f87998ab.forceFinished(true);
            this.bb.forceFinished(true);
            hb(0);
        } else if (this.bb.isFinished()) {
            float f3 = this.in;
            if (f3 < this.aj) {
                yz(false, ViewConfiguration.getLongPressTimeout());
            } else if (f3 > this.bs) {
                yz(true, ViewConfiguration.getLongPressTimeout());
            } else {
                this.be = true;
                ek5k();
            }
        } else {
            this.f87998ab.forceFinished(true);
            this.bb.forceFinished(true);
        }
        return true;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        if (!this.ac) {
            super.onLayout(z2, i2, i3, i4, i5);
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int measuredWidth2 = this.f40921y.getMeasuredWidth();
        int measuredHeight2 = this.f40921y.getMeasuredHeight();
        int i6 = (measuredWidth - measuredWidth2) / 2;
        int i7 = (measuredHeight - measuredHeight2) / 2;
        this.f40921y.layout(i6, i7, measuredWidth2 + i6, measuredHeight2 + i7);
        if (z2) {
            m26340c();
            m26342f();
            int height = getHeight();
            int i8 = this.f40915s;
            int i9 = this.ad;
            int i10 = ((height - i8) / 2) - i9;
            this.aj = i10;
            this.bs = i10 + (i9 * 2) + i8;
        }
        nmn5((((getRight() - getLeft()) + getPaddingLeft()) - getPaddingRight()) / 2.0f);
        Drawable background = getBackground();
        int i11 = this.f40922z + 20;
        if (this.xhv && (background instanceof StateListDrawable)) {
            StateListDrawable stateListDrawable = (StateListDrawable) background;
            if (Build.VERSION.SDK_INT >= 29) {
                int stateCount = stateListDrawable.getStateCount();
                for (int i12 = 0; i12 < stateCount; i12++) {
                    Drawable stateDrawable = stateListDrawable.getStateDrawable(i12);
                    if (stateDrawable instanceof LayerDrawable) {
                        LayerDrawable layerDrawable = (LayerDrawable) stateDrawable;
                        int numberOfLayers = layerDrawable.getNumberOfLayers();
                        for (int i13 = 0; i13 < numberOfLayers; i13++) {
                            Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(layerDrawable.getId(i13));
                            if (drawableFindDrawableByLayerId instanceof GradientDrawable) {
                                ((GradientDrawable) drawableFindDrawableByLayerId).setSize(getWidth() > i11 ? i11 : getWidth(), getHeight());
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        if (!this.ac) {
            super.onMeasure(i2, i3);
        } else {
            super.onMeasure(vyq(i2, this.f40922z), vyq(i3, this.f40904h));
            setMeasuredDimension(zp(this.f40905i, getMeasuredWidth(), i2), zp(this.f40912p, getMeasuredHeight(), i3));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.pickerwidget.widget.NumberPicker.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i2, Bundle bundle) {
        if (super.performAccessibilityAction(i2, bundle)) {
            return true;
        }
        if (!isEnabled()) {
            return false;
        }
        if (i2 != 4096 && i2 != 8192) {
            return false;
        }
        m26356t(i2 == 4096);
        return true;
    }

    @Override // android.view.View
    public void scrollBy(int i2, int i3) {
        int[] iArr = this.f40917u;
        boolean z2 = this.bq;
        if (!z2 && i3 > 0 && iArr[1] <= this.f40899c) {
            this.f40919w = this.f40900d;
            return;
        }
        if (!z2 && i3 < 0 && iArr[1] >= this.f40901e) {
            this.f40919w = this.f40900d;
            return;
        }
        this.f40919w += i3;
        while (true) {
            int i4 = this.f40919w;
            if (i4 - this.f40900d <= this.f40908l) {
                break;
            }
            this.f40919w = i4 - this.f40918v;
            mcp(iArr);
            m26358x(iArr[1], true);
            if (!this.bq && iArr[1] <= this.f40899c) {
                this.f40919w = this.f40900d;
            }
        }
        while (true) {
            int i5 = this.f40919w;
            if (i5 - this.f40900d >= (-this.f40908l)) {
                return;
            }
            this.f40919w = i5 + this.f40918v;
            dd(iArr);
            m26358x(iArr[1], true);
            if (!this.bq && iArr[1] >= this.f40901e) {
                this.f40919w = this.f40900d;
            }
        }
    }

    public void setDisplayedValues(String[] strArr) {
        if (this.f40902f == strArr) {
            return;
        }
        this.f40902f = strArr;
        if (strArr != null) {
            this.f40921y.setRawInputType(524289);
        } else {
            this.f40921y.setRawInputType(2);
        }
        t8iq();
        lrht();
        lv5();
    }

    public void setFormatter(f7l8 f7l8Var) {
        if (f7l8Var == this.f40898b) {
            return;
        }
        this.f40898b = f7l8Var;
        lrht();
        t8iq();
    }

    public void setLabel(String str) {
        CharSequence charSequence = this.d1cy;
        if ((charSequence != null || str == null) && (charSequence == null || charSequence.equals(str))) {
            return;
        }
        this.d1cy = str;
        invalidate();
    }

    public void setLabelTextSizeThreshold(float f2) {
        this.mjvl = Math.max(f2, 0.0f);
    }

    public void setLabelTextSizeTrimFactor(float f2) {
        if (f2 <= 0.0f || f2 >= 1.0f) {
            return;
        }
        this.hp = f2;
    }

    public void setMaxFlingSpeedFactor(float f2) {
        if (f2 >= 0.0f) {
            this.xqx = f2;
        }
    }

    public void setMaxValue(int i2) {
        if (this.f40901e == i2) {
            return;
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("maxValue must be >= 0");
        }
        this.f40901e = i2;
        if (i2 < this.f40906j) {
            this.f40906j = i2;
        }
        setWrapSelectorWheel(i2 - this.f40899c > this.f40917u.length);
        lrht();
        t8iq();
        lv5();
        invalidate();
    }

    public void setMeasureBackgroundEnabled(boolean z2) {
        this.xhv = z2;
    }

    public void setMinValue(int i2) {
        if (this.f40899c == i2) {
            return;
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("minValue must be >= 0");
        }
        this.f40899c = i2;
        if (i2 > this.f40906j) {
            this.f40906j = i2;
        }
        setWrapSelectorWheel(this.f40901e - i2 > this.f40917u.length);
        lrht();
        t8iq();
        lv5();
        invalidate();
    }

    public void setOnLongPressUpdateInterval(long j2) {
        this.f40897a = j2;
    }

    public void setOnScrollListener(InterfaceC7244p interfaceC7244p) {
        this.f40909m = interfaceC7244p;
    }

    public void setOnValueChangedListener(ld6 ld6Var) {
        this.f40911o = ld6Var;
    }

    public void setTextSizeHighlight(int i2) {
        this.sk1t = i2;
        this.f87999bo.setTextSize(i2);
        this.zmmu = this.f87999bo.measureText(this.yl25);
        m26340c();
        invalidate();
    }

    public void setTextSizeHint(int i2) {
        this.dy = i2;
        invalidate();
    }

    public void setTextSizeTrimFactor(float f2) {
        if (f2 <= 0.0f || f2 >= 1.0f) {
            return;
        }
        this.k6e = f2;
    }

    public void setValue(int i2) {
        m26358x(i2, false);
    }

    public void setWrapSelectorWheel(boolean z2) {
        boolean z3 = this.f40901e - this.f40899c >= this.f40917u.length;
        if ((!z2 || z3) && z2 != this.bq) {
            this.bq = z2;
        }
        m26339b();
    }

    /* JADX INFO: renamed from: miuix.pickerwidget.widget.NumberPicker$s */
    static class C7246s implements f7l8 {

        /* JADX INFO: renamed from: k */
        private final int f40941k;

        public C7246s() {
            this.f40941k = -1;
        }

        @Override // miuix.pickerwidget.widget.NumberPicker.f7l8
        /* JADX INFO: renamed from: k */
        public String mo26361k(int i2) {
            return C0006k.zy(this.f40941k, i2);
        }

        public C7246s(int i2) {
            this.f40941k = i2;
        }
    }

    public NumberPicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, toq.C7741q.f98247kz28);
    }

    public NumberPicker(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f40907k = nq0z.incrementAndGet();
        this.f40913q = 1;
        this.f40910n = 2;
        this.f40922z = 400;
        this.f40897a = 300L;
        this.f40920x = new SparseArray<>();
        this.f40917u = new int[3];
        this.f40900d = Integer.MIN_VALUE;
        this.am = 0;
        this.tlhn = -1;
        this.k6e = 0.95f;
        this.hp = 0.8f;
        this.xqx = 1.0f;
        this.zsl = false;
        this.xhv = true;
        float f2 = getResources().getDisplayMetrics().density;
        this.f40913q = getResources().getDimensionPixelOffset(toq.f7l8.f97522z4);
        this.f40910n = getResources().getDimensionPixelOffset(toq.f7l8.f97520yqrt);
        m26351o(attributeSet, i2);
        n5r1();
        this.ac = true;
        this.ad = (int) TypedValue.applyDimension(1, 2.0f, getResources().getDisplayMetrics());
        this.f40915s = (int) (cecm * f2);
        this.f40912p = -1;
        this.f40904h = (int) (f2 * 202.0f);
        this.f40905i = -1;
        this.f40922z = -1;
        this.f40916t = true;
        this.bd = new x2();
        setWillNotDraw(!true);
        ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(toq.x2.f98530fti, (ViewGroup) this, true);
        EditText editText = (EditText) findViewById(toq.C7742s.f98432ktq);
        this.f40921y = editText;
        x9kr();
        hyr();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.az = viewConfiguration.getScaledTouchSlop();
        this.ba = viewConfiguration.getScaledMinimumFlingVelocity();
        this.ax = viewConfiguration.getScaledMaximumFlingVelocity() / 8;
        this.f40914r = (int) editText.getTextSize();
        this.f87999bo = m26348l();
        ncyb();
        this.f87998ab = new Scroller(getContext(), null, true);
        this.bb = new Scroller(getContext(), new DecelerateInterpolator(2.5f));
        t8iq();
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.wra = Folme.useAt(this).hover();
        setOnHoverListener(new ViewOnHoverListenerC7241k());
        setOnTouchListener(new toq());
    }
}
