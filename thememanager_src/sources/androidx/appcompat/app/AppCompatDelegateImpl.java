package androidx.appcompat.app;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.app.toq;
import androidx.appcompat.view.C0115g;
import androidx.appcompat.view.C0135n;
import androidx.appcompat.view.C0136q;
import androidx.appcompat.view.WindowCallbackC0137s;
import androidx.appcompat.view.menu.C0128n;
import androidx.appcompat.view.menu.f7l8;
import androidx.appcompat.view.menu.n7h;
import androidx.appcompat.view.toq;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.C0184b;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.InterfaceC0218r;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.appcompat.widget.ch;
import androidx.appcompat.widget.gvn7;
import androidx.appcompat.widget.nmn5;
import androidx.core.app.ni7;
import androidx.core.content.C0498q;
import androidx.core.content.res.C0506s;
import androidx.core.view.C0683f;
import androidx.core.view.C0690h;
import androidx.core.view.eqxt;
import androidx.core.view.gyi;
import androidx.core.view.kja0;
import androidx.core.view.tfm;
import androidx.core.view.xwq3;
import androidx.lifecycle.InterfaceC0954z;
import androidx.lifecycle.kja0;
import com.google.android.exoplayer2.extractor.ts.wvg;
import java.lang.Thread;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import p023g.C6045k;
import p030n.C7397k;
import zy.InterfaceC7842s;
import zy.InterfaceC7843t;
import zy.dd;
import zy.hb;
import zy.hyr;
import zy.lvui;
import zy.uv6;
import zy.yz;

/* JADX INFO: loaded from: classes.dex */
@uv6({uv6.EnumC7844k.LIBRARY})
class AppCompatDelegateImpl extends androidx.appcompat.app.f7l8 implements f7l8.InterfaceC0118k, LayoutInflater.Factory2 {
    static final String d1cy = ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.";
    private static boolean ndjo;

    /* JADX INFO: renamed from: a */
    AbstractC0096k f188a;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    ActionBarContextView f46541ab;
    boolean ac;
    boolean ad;
    private boolean aj;
    private boolean am;
    private boolean an;
    boolean ar;
    private View as;
    boolean ax;
    private PanelFeatureState[] ay;
    private boolean az;

    /* JADX INFO: renamed from: b */
    final InterfaceC0094g f189b;
    boolean ba;
    PopupWindow bb;
    private Configuration bc;
    private int bd;
    private PanelFeatureState be;
    private boolean bg;
    private TextView bl;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private gvn7 f46542bo;
    Runnable bp;
    boolean bq;
    private boolean bs;
    private int bu;
    gyi bv;

    /* JADX INFO: renamed from: d */
    private zurt f190d;
    private final Runnable dy;

    /* JADX INFO: renamed from: e */
    final Object f191e;
    private boolean id;
    ViewGroup in;

    /* JADX INFO: renamed from: j */
    final Context f192j;
    private boolean k0;
    private Rect k6e;

    /* JADX INFO: renamed from: m */
    private C0080h f193m;
    private androidx.appcompat.app.ld6 mjvl;

    /* JADX INFO: renamed from: o */
    Window f194o;
    private C0101p s8y;
    int sk1t;
    private ki tgs;
    private boolean tlhn;

    /* JADX INFO: renamed from: u */
    private CharSequence f195u;

    /* JADX INFO: renamed from: v */
    private C0086p f196v;
    private boolean vb6;

    /* JADX INFO: renamed from: w */
    androidx.appcompat.view.toq f197w;
    private boolean w97r;

    /* JADX INFO: renamed from: x */
    MenuInflater f198x;
    private Rect xk5;
    private ki yl25;
    boolean zmmu;
    private static final androidx.collection.qrj<String, Integer> hp = new androidx.collection.qrj<>();
    private static final boolean cw14 = false;
    private static final int[] xy8 = {R.attr.windowBackground};
    private static final boolean th6 = !"robolectric".equals(Build.FINGERPRINT);
    private static final boolean q7k9 = true;

    protected static final class PanelFeatureState {

        /* JADX INFO: renamed from: cdj, reason: collision with root package name */
        boolean f46543cdj = false;

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        ViewGroup f46544f7l8;

        /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
        Bundle f46545fn3e;

        /* JADX INFO: renamed from: g */
        int f199g;

        /* JADX INFO: renamed from: h */
        public boolean f200h;

        /* JADX INFO: renamed from: i */
        Bundle f201i;

        /* JADX INFO: renamed from: k */
        int f202k;

        /* JADX INFO: renamed from: ki, reason: collision with root package name */
        boolean f46546ki;

        /* JADX INFO: renamed from: kja0, reason: collision with root package name */
        boolean f46547kja0;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        C0128n f46548ld6;

        /* JADX INFO: renamed from: n */
        int f203n;

        /* JADX INFO: renamed from: n7h, reason: collision with root package name */
        boolean f46549n7h;

        /* JADX INFO: renamed from: p */
        androidx.appcompat.view.menu.f7l8 f204p;

        /* JADX INFO: renamed from: q */
        int f205q;

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        boolean f46550qrj;

        /* JADX INFO: renamed from: s */
        View f206s;

        /* JADX INFO: renamed from: t8r, reason: collision with root package name */
        boolean f46551t8r;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        int f46552toq;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        Context f46553x2;

        /* JADX INFO: renamed from: y */
        View f207y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        int f46554zy;

        @SuppressLint({"BanParcelableUsage"})
        private static class SavedState implements Parcelable {
            public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState.SavedState.1
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
                public SavedState createFromParcel(Parcel parcel) {
                    return SavedState.m130k(parcel, null);
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
                public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return SavedState.m130k(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
                public SavedState[] newArray(int i2) {
                    return new SavedState[i2];
                }
            };

            /* JADX INFO: renamed from: k */
            int f208k;

            /* JADX INFO: renamed from: n */
            Bundle f209n;

            /* JADX INFO: renamed from: q */
            boolean f210q;

            SavedState() {
            }

            /* JADX INFO: renamed from: k */
            static SavedState m130k(Parcel parcel, ClassLoader classLoader) {
                SavedState savedState = new SavedState();
                savedState.f208k = parcel.readInt();
                boolean z2 = parcel.readInt() == 1;
                savedState.f210q = z2;
                if (z2) {
                    savedState.f209n = parcel.readBundle(classLoader);
                }
                return savedState;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i2) {
                parcel.writeInt(this.f208k);
                parcel.writeInt(this.f210q ? 1 : 0);
                if (this.f210q) {
                    parcel.writeBundle(this.f209n);
                }
            }
        }

        PanelFeatureState(int i2) {
            this.f202k = i2;
        }

        void f7l8(androidx.appcompat.view.menu.f7l8 f7l8Var) {
            C0128n c0128n;
            androidx.appcompat.view.menu.f7l8 f7l8Var2 = this.f204p;
            if (f7l8Var == f7l8Var2) {
                return;
            }
            if (f7l8Var2 != null) {
                f7l8Var2.n5r1(this.f46548ld6);
            }
            this.f204p = f7l8Var;
            if (f7l8Var == null || (c0128n = this.f46548ld6) == null) {
                return;
            }
            f7l8Var.toq(c0128n);
        }

        /* JADX INFO: renamed from: g */
        Parcelable m125g() {
            SavedState savedState = new SavedState();
            savedState.f208k = this.f202k;
            savedState.f210q = this.f46547kja0;
            if (this.f204p != null) {
                Bundle bundle = new Bundle();
                savedState.f209n = bundle;
                this.f204p.lrht(bundle);
            }
            return savedState;
        }

        /* JADX INFO: renamed from: k */
        void m126k() {
            Bundle bundle;
            androidx.appcompat.view.menu.f7l8 f7l8Var = this.f204p;
            if (f7l8Var == null || (bundle = this.f201i) == null) {
                return;
            }
            f7l8Var.m327f(bundle);
            this.f201i = null;
        }

        /* JADX INFO: renamed from: n */
        void m127n(Parcelable parcelable) {
            SavedState savedState = (SavedState) parcelable;
            this.f202k = savedState.f208k;
            this.f46551t8r = savedState.f210q;
            this.f201i = savedState.f209n;
            this.f207y = null;
            this.f46544f7l8 = null;
        }

        /* JADX INFO: renamed from: q */
        public boolean m128q() {
            if (this.f207y == null) {
                return false;
            }
            return this.f206s != null || this.f46548ld6.m365g().getCount() > 0;
        }

        public void toq() {
            androidx.appcompat.view.menu.f7l8 f7l8Var = this.f204p;
            if (f7l8Var != null) {
                f7l8Var.n5r1(this.f46548ld6);
            }
            this.f46548ld6 = null;
        }

        /* JADX INFO: renamed from: y */
        void m129y(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme themeNewTheme = context.getResources().newTheme();
            themeNewTheme.setTo(context.getTheme());
            themeNewTheme.resolveAttribute(C7397k.toq.f93013zy, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                themeNewTheme.applyStyle(i2, true);
            }
            themeNewTheme.resolveAttribute(C7397k.toq.f92862g0ad, typedValue, true);
            int i3 = typedValue.resourceId;
            if (i3 != 0) {
                themeNewTheme.applyStyle(i3, true);
            } else {
                themeNewTheme.applyStyle(C7397k.x2.nod, true);
            }
            C0136q c0136q = new C0136q(context, 0);
            c0136q.getTheme().setTo(themeNewTheme);
            this.f46553x2 = c0136q;
            TypedArray typedArrayObtainStyledAttributes = c0136q.obtainStyledAttributes(C7397k.qrj.f92638e5);
            this.f46552toq = typedArrayObtainStyledAttributes.getResourceId(C7397k.qrj.f92713mub, 0);
            this.f199g = typedArrayObtainStyledAttributes.getResourceId(C7397k.qrj.f92771vy, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        androidx.appcompat.view.menu.kja0 zy(n7h.InterfaceC0129k interfaceC0129k) {
            if (this.f204p == null) {
                return null;
            }
            if (this.f46548ld6 == null) {
                C0128n c0128n = new C0128n(this.f46553x2, C7397k.p.f92527cdj);
                this.f46548ld6 = c0128n;
                c0128n.mo356s(interfaceC0129k);
                this.f204p.toq(this.f46548ld6);
            }
            return this.f46548ld6.toq(this.f46544f7l8);
        }
    }

    private class cdj extends ki {

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final PowerManager f46555zy;

        cdj(@lvui Context context) {
            super();
            this.f46555zy = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.ki
        /* JADX INFO: renamed from: n */
        public void mo132n() {
            AppCompatDelegateImpl.this.mo119n();
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.ki
        IntentFilter toq() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.ki
        public int zy() {
            return qrj.m145k(this.f46555zy) ? 2 : 1;
        }
    }

    class f7l8 extends xwq3 {
        f7l8() {
        }

        @Override // androidx.core.view.xwq3, androidx.core.view.dr
        public void toq(View view) {
            AppCompatDelegateImpl.this.f46541ab.setAlpha(1.0f);
            AppCompatDelegateImpl.this.bv.fn3e(null);
            AppCompatDelegateImpl.this.bv = null;
        }

        @Override // androidx.core.view.xwq3, androidx.core.view.dr
        public void zy(View view) {
            AppCompatDelegateImpl.this.f46541ab.setVisibility(0);
            if (AppCompatDelegateImpl.this.f46541ab.getParent() instanceof View) {
                C0683f.m28243do((View) AppCompatDelegateImpl.this.f46541ab.getParent());
            }
        }
    }

    private class fn3e extends ContentFrameLayout {
        public fn3e(Context context) {
            super(context);
        }

        private boolean toq(int i2, int i3) {
            return i2 < -5 || i3 < -5 || i2 > getWidth() + 5 || i3 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return AppCompatDelegateImpl.this.yz(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !toq((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            AppCompatDelegateImpl.this.hb(0);
            return true;
        }

        @Override // android.view.View
        public void setBackgroundResource(int i2) {
            setBackgroundDrawable(C6045k.toq(getContext(), i2));
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AppCompatDelegateImpl$g */
    class RunnableC0079g implements Runnable {

        /* JADX INFO: renamed from: androidx.appcompat.app.AppCompatDelegateImpl$g$k */
        class k extends xwq3 {
            k() {
            }

            @Override // androidx.core.view.xwq3, androidx.core.view.dr
            public void toq(View view) {
                AppCompatDelegateImpl.this.f46541ab.setAlpha(1.0f);
                AppCompatDelegateImpl.this.bv.fn3e(null);
                AppCompatDelegateImpl.this.bv = null;
            }

            @Override // androidx.core.view.xwq3, androidx.core.view.dr
            public void zy(View view) {
                AppCompatDelegateImpl.this.f46541ab.setVisibility(0);
            }
        }

        RunnableC0079g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            appCompatDelegateImpl.bb.showAtLocation(appCompatDelegateImpl.f46541ab, 55, 0, 0);
            AppCompatDelegateImpl.this.m111b();
            if (!AppCompatDelegateImpl.this.ltg8()) {
                AppCompatDelegateImpl.this.f46541ab.setAlpha(1.0f);
                AppCompatDelegateImpl.this.f46541ab.setVisibility(0);
            } else {
                AppCompatDelegateImpl.this.f46541ab.setAlpha(0.0f);
                AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl2.bv = C0683f.f7l8(appCompatDelegateImpl2.f46541ab).toq(1.0f);
                AppCompatDelegateImpl.this.bv.fn3e(new k());
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AppCompatDelegateImpl$h */
    class C0080h extends WindowCallbackC0137s {

        /* JADX INFO: renamed from: q */
        private InterfaceC0088s f217q;

        C0080h(Window.Callback callback) {
            super(callback);
        }

        @Override // androidx.appcompat.view.WindowCallbackC0137s, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return AppCompatDelegateImpl.this.yz(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // androidx.appcompat.view.WindowCallbackC0137s, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || AppCompatDelegateImpl.this.qkj8(keyEvent.getKeyCode(), keyEvent);
        }

        @Override // androidx.appcompat.view.WindowCallbackC0137s, android.view.Window.Callback
        public void onContentChanged() {
        }

        @Override // androidx.appcompat.view.WindowCallbackC0137s, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i2, Menu menu) {
            if (i2 != 0 || (menu instanceof androidx.appcompat.view.menu.f7l8)) {
                return super.onCreatePanelMenu(i2, menu);
            }
            return false;
        }

        @Override // androidx.appcompat.view.WindowCallbackC0137s, android.view.Window.Callback
        public View onCreatePanelView(int i2) {
            View viewOnCreatePanelView;
            InterfaceC0088s interfaceC0088s = this.f217q;
            return (interfaceC0088s == null || (viewOnCreatePanelView = interfaceC0088s.onCreatePanelView(i2)) == null) ? super.onCreatePanelView(i2) : viewOnCreatePanelView;
        }

        @Override // androidx.appcompat.view.WindowCallbackC0137s, android.view.Window.Callback
        public boolean onMenuOpened(int i2, Menu menu) {
            super.onMenuOpened(i2, menu);
            AppCompatDelegateImpl.this.tfm(i2);
            return true;
        }

        @Override // androidx.appcompat.view.WindowCallbackC0137s, android.view.Window.Callback
        public void onPanelClosed(int i2, Menu menu) {
            super.onPanelClosed(i2, menu);
            AppCompatDelegateImpl.this.wo(i2);
        }

        @Override // androidx.appcompat.view.WindowCallbackC0137s, android.view.Window.Callback
        public boolean onPreparePanel(int i2, View view, Menu menu) {
            androidx.appcompat.view.menu.f7l8 f7l8Var = menu instanceof androidx.appcompat.view.menu.f7l8 ? (androidx.appcompat.view.menu.f7l8) menu : null;
            if (i2 == 0 && f7l8Var == null) {
                return false;
            }
            if (f7l8Var != null) {
                f7l8Var.m324b(true);
            }
            InterfaceC0088s interfaceC0088s = this.f217q;
            boolean zOnPreparePanel = interfaceC0088s != null && interfaceC0088s.mo146k(i2);
            if (!zOnPreparePanel) {
                zOnPreparePanel = super.onPreparePanel(i2, view, menu);
            }
            if (f7l8Var != null) {
                f7l8Var.m324b(false);
            }
            return zOnPreparePanel;
        }

        @Override // androidx.appcompat.view.WindowCallbackC0137s, android.view.Window.Callback
        @hyr(24)
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i2) {
            androidx.appcompat.view.menu.f7l8 f7l8Var;
            PanelFeatureState panelFeatureStateLv5 = AppCompatDelegateImpl.this.lv5(0, true);
            if (panelFeatureStateLv5 == null || (f7l8Var = panelFeatureStateLv5.f204p) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i2);
            } else {
                super.onProvideKeyboardShortcuts(list, f7l8Var, i2);
            }
        }

        @Override // androidx.appcompat.view.WindowCallbackC0137s, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        @Override // androidx.appcompat.view.WindowCallbackC0137s, android.view.Window.Callback
        @hyr(23)
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i2) {
            return (AppCompatDelegateImpl.this.fu4() && i2 == 0) ? zy(callback) : super.onWindowStartingActionMode(callback, i2);
        }

        void toq(@dd InterfaceC0088s interfaceC0088s) {
            this.f217q = interfaceC0088s;
        }

        final ActionMode zy(ActionMode.Callback callback) {
            C0115g.k kVar = new C0115g.k(AppCompatDelegateImpl.this.f192j, callback);
            androidx.appcompat.view.toq toqVarHyr = AppCompatDelegateImpl.this.hyr(kVar);
            if (toqVarHyr != null) {
                return kVar.m301n(toqVarHyr);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AppCompatDelegateImpl$i */
    @hyr(17)
    private static class C0081i {
        private C0081i() {
        }

        /* JADX INFO: renamed from: k */
        static void m133k(ContextThemeWrapper contextThemeWrapper, Configuration configuration) {
            contextThemeWrapper.applyOverrideConfiguration(configuration);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AppCompatDelegateImpl$k */
    class C0082k implements Thread.UncaughtExceptionHandler {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Thread.UncaughtExceptionHandler f218k;

        C0082k(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f218k = uncaughtExceptionHandler;
        }

        /* JADX INFO: renamed from: k */
        private boolean m134k(Throwable th) {
            String message;
            if (!(th instanceof Resources.NotFoundException) || (message = th.getMessage()) == null) {
                return false;
            }
            return message.contains("drawable") || message.contains("Drawable");
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(@lvui Thread thread, @lvui Throwable th) {
            if (!m134k(th)) {
                this.f218k.uncaughtException(thread, th);
                return;
            }
            Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + AppCompatDelegateImpl.d1cy);
            notFoundException.initCause(th.getCause());
            notFoundException.setStackTrace(th.getStackTrace());
            this.f218k.uncaughtException(thread, notFoundException);
        }
    }

    @uv6({uv6.EnumC7844k.LIBRARY})
    @yz
    abstract class ki {

        /* JADX INFO: renamed from: k */
        private BroadcastReceiver f219k;

        /* JADX INFO: renamed from: androidx.appcompat.app.AppCompatDelegateImpl$ki$k */
        class C0083k extends BroadcastReceiver {
            C0083k() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                ki.this.mo132n();
            }
        }

        ki() {
        }

        /* JADX INFO: renamed from: g */
        void m135g() {
            m136k();
            IntentFilter qVar = toq();
            if (qVar == null || qVar.countActions() == 0) {
                return;
            }
            if (this.f219k == null) {
                this.f219k = new C0083k();
            }
            AppCompatDelegateImpl.this.f192j.registerReceiver(this.f219k, qVar);
        }

        /* JADX INFO: renamed from: k */
        void m136k() {
            BroadcastReceiver broadcastReceiver = this.f219k;
            if (broadcastReceiver != null) {
                try {
                    AppCompatDelegateImpl.this.f192j.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f219k = null;
            }
        }

        /* JADX INFO: renamed from: n */
        abstract void mo132n();

        /* JADX INFO: renamed from: q */
        boolean m137q() {
            return this.f219k != null;
        }

        @dd
        abstract IntentFilter toq();

        abstract int zy();
    }

    @hyr(26)
    static class kja0 {
        private kja0() {
        }

        /* JADX INFO: renamed from: k */
        static void m138k(@lvui Configuration configuration, @lvui Configuration configuration2, @lvui Configuration configuration3) {
            int i2 = configuration.colorMode & 3;
            int i3 = configuration2.colorMode;
            if (i2 != (i3 & 3)) {
                configuration3.colorMode |= i3 & 3;
            }
            int i4 = configuration.colorMode & 12;
            int i5 = configuration2.colorMode;
            if (i4 != (i5 & 12)) {
                configuration3.colorMode |= i5 & 12;
            }
        }
    }

    class ld6 implements toq.InterfaceC0138k {

        /* JADX INFO: renamed from: k */
        private toq.InterfaceC0138k f221k;

        /* JADX INFO: renamed from: androidx.appcompat.app.AppCompatDelegateImpl$ld6$k */
        class C0084k extends xwq3 {
            C0084k() {
            }

            @Override // androidx.core.view.xwq3, androidx.core.view.dr
            public void toq(View view) {
                AppCompatDelegateImpl.this.f46541ab.setVisibility(8);
                AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                PopupWindow popupWindow = appCompatDelegateImpl.bb;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (appCompatDelegateImpl.f46541ab.getParent() instanceof View) {
                    C0683f.m28243do((View) AppCompatDelegateImpl.this.f46541ab.getParent());
                }
                AppCompatDelegateImpl.this.f46541ab.m411i();
                AppCompatDelegateImpl.this.bv.fn3e(null);
                AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl2.bv = null;
                C0683f.m28243do(appCompatDelegateImpl2.in);
            }
        }

        public ld6(toq.InterfaceC0138k interfaceC0138k) {
            this.f221k = interfaceC0138k;
        }

        @Override // androidx.appcompat.view.toq.InterfaceC0138k
        /* JADX INFO: renamed from: k */
        public void mo139k(androidx.appcompat.view.toq toqVar) {
            this.f221k.mo139k(toqVar);
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl.bb != null) {
                appCompatDelegateImpl.f194o.getDecorView().removeCallbacks(AppCompatDelegateImpl.this.bp);
            }
            AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl2.f46541ab != null) {
                appCompatDelegateImpl2.m111b();
                AppCompatDelegateImpl appCompatDelegateImpl3 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl3.bv = C0683f.f7l8(appCompatDelegateImpl3.f46541ab).toq(0.0f);
                AppCompatDelegateImpl.this.bv.fn3e(new C0084k());
            }
            AppCompatDelegateImpl appCompatDelegateImpl4 = AppCompatDelegateImpl.this;
            InterfaceC0094g interfaceC0094g = appCompatDelegateImpl4.f189b;
            if (interfaceC0094g != null) {
                interfaceC0094g.jp0y(appCompatDelegateImpl4.f197w);
            }
            AppCompatDelegateImpl appCompatDelegateImpl5 = AppCompatDelegateImpl.this;
            appCompatDelegateImpl5.f197w = null;
            C0683f.m28243do(appCompatDelegateImpl5.in);
        }

        @Override // androidx.appcompat.view.toq.InterfaceC0138k
        /* JADX INFO: renamed from: q */
        public boolean mo140q(androidx.appcompat.view.toq toqVar, Menu menu) {
            C0683f.m28243do(AppCompatDelegateImpl.this.in);
            return this.f221k.mo140q(toqVar, menu);
        }

        @Override // androidx.appcompat.view.toq.InterfaceC0138k
        public boolean toq(androidx.appcompat.view.toq toqVar, Menu menu) {
            return this.f221k.toq(toqVar, menu);
        }

        @Override // androidx.appcompat.view.toq.InterfaceC0138k
        public boolean zy(androidx.appcompat.view.toq toqVar, MenuItem menuItem) {
            return this.f221k.zy(toqVar, menuItem);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AppCompatDelegateImpl$n */
    class C0085n implements ContentFrameLayout.InterfaceC0161k {
        C0085n() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.InterfaceC0161k
        /* JADX INFO: renamed from: k */
        public void mo141k() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.InterfaceC0161k
        public void onDetachedFromWindow() {
            AppCompatDelegateImpl.this.ek5k();
        }
    }

    @hyr(24)
    static class n7h {
        private n7h() {
        }

        /* JADX INFO: renamed from: k */
        static void m142k(@lvui Configuration configuration, @lvui Configuration configuration2, @lvui Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AppCompatDelegateImpl$p */
    private final class C0086p implements n7h.InterfaceC0129k {
        C0086p() {
        }

        @Override // androidx.appcompat.view.menu.n7h.InterfaceC0129k
        public void f7l8(@lvui androidx.appcompat.view.menu.f7l8 f7l8Var, boolean z2) {
            AppCompatDelegateImpl.this.m113e(f7l8Var);
        }

        @Override // androidx.appcompat.view.menu.n7h.InterfaceC0129k
        /* JADX INFO: renamed from: y */
        public boolean mo143y(@lvui androidx.appcompat.view.menu.f7l8 f7l8Var) {
            Window.Callback callbackBo = AppCompatDelegateImpl.this.bo();
            if (callbackBo == null) {
                return true;
            }
            callbackBo.onMenuOpened(108, f7l8Var);
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AppCompatDelegateImpl$q */
    class C0087q implements InterfaceC0218r.k {
        C0087q() {
        }

        @Override // androidx.appcompat.widget.InterfaceC0218r.k
        /* JADX INFO: renamed from: k */
        public void mo144k(Rect rect) {
            rect.top = AppCompatDelegateImpl.this.w831(null, rect);
        }
    }

    @hyr(21)
    static class qrj {
        private qrj() {
        }

        /* JADX INFO: renamed from: k */
        static boolean m145k(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AppCompatDelegateImpl$s */
    interface InterfaceC0088s {
        /* JADX INFO: renamed from: k */
        boolean mo146k(int i2);

        @dd
        View onCreatePanelView(int i2);
    }

    private class t8r extends ki {

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final C0095h f46558zy;

        t8r(@lvui C0095h c0095h) {
            super();
            this.f46558zy = c0095h;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.ki
        /* JADX INFO: renamed from: n */
        public void mo132n() {
            AppCompatDelegateImpl.this.mo119n();
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.ki
        IntentFilter toq() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.ki
        public int zy() {
            return this.f46558zy.m200q() ? 2 : 1;
        }
    }

    class toq implements Runnable {
        toq() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if ((appCompatDelegateImpl.sk1t & 1) != 0) {
                appCompatDelegateImpl.y9n(0);
            }
            AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
            if ((appCompatDelegateImpl2.sk1t & 4096) != 0) {
                appCompatDelegateImpl2.y9n(108);
            }
            AppCompatDelegateImpl appCompatDelegateImpl3 = AppCompatDelegateImpl.this;
            appCompatDelegateImpl3.zmmu = false;
            appCompatDelegateImpl3.sk1t = 0;
        }
    }

    @hyr(17)
    static class x2 {
        private x2() {
        }

        /* JADX INFO: renamed from: k */
        static Context m147k(@lvui Context context, @lvui Configuration configuration) {
            return context.createConfigurationContext(configuration);
        }

        static void toq(@lvui Configuration configuration, @lvui Configuration configuration2, @lvui Configuration configuration3) {
            int i2 = configuration.densityDpi;
            int i3 = configuration2.densityDpi;
            if (i2 != i3) {
                configuration3.densityDpi = i3;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AppCompatDelegateImpl$y */
    private class C0089y implements toq.InterfaceC7850toq {
        C0089y() {
        }

        @Override // androidx.appcompat.app.toq.InterfaceC7850toq
        /* JADX INFO: renamed from: k */
        public Context mo148k() {
            return AppCompatDelegateImpl.this.zp();
        }

        @Override // androidx.appcompat.app.toq.InterfaceC7850toq
        /* JADX INFO: renamed from: n */
        public void mo149n(int i2) {
            AbstractC0096k abstractC0096kT8r = AppCompatDelegateImpl.this.t8r();
            if (abstractC0096kT8r != null) {
                abstractC0096kT8r.mo153b(i2);
            }
        }

        @Override // androidx.appcompat.app.toq.InterfaceC7850toq
        /* JADX INFO: renamed from: q */
        public Drawable mo150q() {
            C0184b c0184bFti = C0184b.fti(mo148k(), null, new int[]{C7397k.toq.f92924ngy});
            Drawable drawableM553y = c0184bFti.m553y(0);
            c0184bFti.d3();
            return drawableM553y;
        }

        @Override // androidx.appcompat.app.toq.InterfaceC7850toq
        public boolean toq() {
            AbstractC0096k abstractC0096kT8r = AppCompatDelegateImpl.this.t8r();
            return (abstractC0096kT8r == null || (abstractC0096kT8r.mo159h() & 4) == 0) ? false : true;
        }

        @Override // androidx.appcompat.app.toq.InterfaceC7850toq
        public void zy(Drawable drawable, int i2) {
            AbstractC0096k abstractC0096kT8r = AppCompatDelegateImpl.this.t8r();
            if (abstractC0096kT8r != null) {
                abstractC0096kT8r.a98o(drawable);
                abstractC0096kT8r.mo153b(i2);
            }
        }
    }

    private final class zurt implements n7h.InterfaceC0129k {
        zurt() {
        }

        @Override // androidx.appcompat.view.menu.n7h.InterfaceC0129k
        public void f7l8(@lvui androidx.appcompat.view.menu.f7l8 f7l8Var, boolean z2) {
            androidx.appcompat.view.menu.f7l8 f7l8VarJp0y = f7l8Var.jp0y();
            boolean z3 = f7l8VarJp0y != f7l8Var;
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (z3) {
                f7l8Var = f7l8VarJp0y;
            }
            PanelFeatureState panelFeatureStateA98o = appCompatDelegateImpl.a98o(f7l8Var);
            if (panelFeatureStateA98o != null) {
                if (!z3) {
                    AppCompatDelegateImpl.this.m116j(panelFeatureStateA98o, z2);
                } else {
                    AppCompatDelegateImpl.this.vyq(panelFeatureStateA98o.f202k, panelFeatureStateA98o, f7l8VarJp0y);
                    AppCompatDelegateImpl.this.m116j(panelFeatureStateA98o, true);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.n7h.InterfaceC0129k
        /* JADX INFO: renamed from: y */
        public boolean mo143y(@lvui androidx.appcompat.view.menu.f7l8 f7l8Var) {
            Window.Callback callbackBo;
            if (f7l8Var != f7l8Var.jp0y()) {
                return true;
            }
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (!appCompatDelegateImpl.ba || (callbackBo = appCompatDelegateImpl.bo()) == null || AppCompatDelegateImpl.this.ar) {
                return true;
            }
            callbackBo.onMenuOpened(108, f7l8Var);
            return true;
        }
    }

    class zy implements eqxt {
        zy() {
        }

        @Override // androidx.core.view.eqxt
        /* JADX INFO: renamed from: k */
        public tfm mo151k(View view, tfm tfmVar) {
            int iKi = tfmVar.ki();
            int iW831 = AppCompatDelegateImpl.this.w831(tfmVar, null);
            if (iKi != iW831) {
                tfmVar = tfmVar.jk(tfmVar.m3467h(), iW831, tfmVar.cdj(), tfmVar.kja0());
            }
            return C0683f.bz2(view, tfmVar);
        }
    }

    AppCompatDelegateImpl(Activity activity, InterfaceC0094g interfaceC0094g) {
        this(activity, null, interfaceC0094g, activity);
    }

    @lvui
    /* JADX INFO: renamed from: a */
    private static Configuration m104a(@lvui Configuration configuration, @dd Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (configuration2 != null && configuration.diff(configuration2) != 0) {
            float f2 = configuration.fontScale;
            float f3 = configuration2.fontScale;
            if (f2 != f3) {
                configuration3.fontScale = f3;
            }
            int i2 = configuration.mcc;
            int i3 = configuration2.mcc;
            if (i2 != i3) {
                configuration3.mcc = i3;
            }
            int i4 = configuration.mnc;
            int i5 = configuration2.mnc;
            if (i4 != i5) {
                configuration3.mnc = i5;
            }
            n7h.m142k(configuration, configuration2, configuration3);
            int i6 = configuration.touchscreen;
            int i7 = configuration2.touchscreen;
            if (i6 != i7) {
                configuration3.touchscreen = i7;
            }
            int i8 = configuration.keyboard;
            int i9 = configuration2.keyboard;
            if (i8 != i9) {
                configuration3.keyboard = i9;
            }
            int i10 = configuration.keyboardHidden;
            int i11 = configuration2.keyboardHidden;
            if (i10 != i11) {
                configuration3.keyboardHidden = i11;
            }
            int i12 = configuration.navigation;
            int i13 = configuration2.navigation;
            if (i12 != i13) {
                configuration3.navigation = i13;
            }
            int i14 = configuration.navigationHidden;
            int i15 = configuration2.navigationHidden;
            if (i14 != i15) {
                configuration3.navigationHidden = i15;
            }
            int i16 = configuration.orientation;
            int i17 = configuration2.orientation;
            if (i16 != i17) {
                configuration3.orientation = i17;
            }
            int i18 = configuration.screenLayout & 15;
            int i19 = configuration2.screenLayout;
            if (i18 != (i19 & 15)) {
                configuration3.screenLayout |= i19 & 15;
            }
            int i20 = configuration.screenLayout & wvg.f64653fu4;
            int i21 = configuration2.screenLayout;
            if (i20 != (i21 & wvg.f64653fu4)) {
                configuration3.screenLayout |= i21 & wvg.f64653fu4;
            }
            int i22 = configuration.screenLayout & 48;
            int i23 = configuration2.screenLayout;
            if (i22 != (i23 & 48)) {
                configuration3.screenLayout |= i23 & 48;
            }
            int i24 = configuration.screenLayout & 768;
            int i25 = configuration2.screenLayout;
            if (i24 != (i25 & 768)) {
                configuration3.screenLayout |= i25 & 768;
            }
            kja0.m138k(configuration, configuration2, configuration3);
            int i26 = configuration.uiMode & 15;
            int i27 = configuration2.uiMode;
            if (i26 != (i27 & 15)) {
                configuration3.uiMode |= i27 & 15;
            }
            int i28 = configuration.uiMode & 48;
            int i29 = configuration2.uiMode;
            if (i28 != (i29 & 48)) {
                configuration3.uiMode |= i29 & 48;
            }
            int i30 = configuration.screenWidthDp;
            int i31 = configuration2.screenWidthDp;
            if (i30 != i31) {
                configuration3.screenWidthDp = i31;
            }
            int i32 = configuration.screenHeightDp;
            int i33 = configuration2.screenHeightDp;
            if (i32 != i33) {
                configuration3.screenHeightDp = i33;
            }
            int i34 = configuration.smallestScreenWidthDp;
            int i35 = configuration2.smallestScreenWidthDp;
            if (i34 != i35) {
                configuration3.smallestScreenWidthDp = i35;
            }
            x2.toq(configuration, configuration2, configuration3);
        }
        return configuration3;
    }

    private void bf2() {
        if (this.id) {
            return;
        }
        this.in = m107m();
        CharSequence charSequenceM122u = m122u();
        if (!TextUtils.isEmpty(charSequenceM122u)) {
            gvn7 gvn7Var = this.f46542bo;
            if (gvn7Var != null) {
                gvn7Var.setWindowTitle(charSequenceM122u);
            } else if (was() != null) {
                was().ikck(charSequenceM122u);
            } else {
                TextView textView = this.bl;
                if (textView != null) {
                    textView.setText(charSequenceM122u);
                }
            }
        }
        m105c();
        d8wk(this.in);
        this.id = true;
        PanelFeatureState panelFeatureStateLv5 = lv5(0, false);
        if (this.ar) {
            return;
        }
        if (panelFeatureStateLv5 == null || panelFeatureStateLv5.f204p == null) {
            xwq3(108);
        }
    }

    /* JADX INFO: renamed from: c */
    private void m105c() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.in.findViewById(R.id.content);
        View decorView = this.f194o.getDecorView();
        contentFrameLayout.setDecorPadding(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray typedArrayObtainStyledAttributes = this.f192j.obtainStyledAttributes(C7397k.qrj.f92638e5);
        typedArrayObtainStyledAttributes.getValue(C7397k.qrj.vahq, contentFrameLayout.getMinWidthMajor());
        typedArrayObtainStyledAttributes.getValue(C7397k.qrj.vc, contentFrameLayout.getMinWidthMinor());
        int i2 = C7397k.qrj.sb;
        if (typedArrayObtainStyledAttributes.hasValue(i2)) {
            typedArrayObtainStyledAttributes.getValue(i2, contentFrameLayout.getFixedWidthMajor());
        }
        int i3 = C7397k.qrj.eklw;
        if (typedArrayObtainStyledAttributes.hasValue(i3)) {
            typedArrayObtainStyledAttributes.getValue(i3, contentFrameLayout.getFixedWidthMinor());
        }
        int i4 = C7397k.qrj.vddr;
        if (typedArrayObtainStyledAttributes.hasValue(i4)) {
            typedArrayObtainStyledAttributes.getValue(i4, contentFrameLayout.getFixedHeightMajor());
        }
        int i5 = C7397k.qrj.d6c;
        if (typedArrayObtainStyledAttributes.hasValue(i5)) {
            typedArrayObtainStyledAttributes.getValue(i5, contentFrameLayout.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    private boolean c8jq(PanelFeatureState panelFeatureState) {
        View view = panelFeatureState.f206s;
        if (view != null) {
            panelFeatureState.f207y = view;
            return true;
        }
        if (panelFeatureState.f204p == null) {
            return false;
        }
        if (this.f190d == null) {
            this.f190d = new zurt();
        }
        View view2 = (View) panelFeatureState.zy(this.f190d);
        panelFeatureState.f207y = view2;
        return view2 != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void cfr(int i2, boolean z2, @dd Configuration configuration) {
        Resources resources = this.f192j.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i2 | (resources.getConfiguration().uiMode & (-49));
        resources.updateConfiguration(configuration2, null);
        int i3 = this.bd;
        if (i3 != 0) {
            this.f192j.setTheme(i3);
            this.f192j.getTheme().applyStyle(this.bd, true);
        }
        if (z2) {
            Object obj = this.f191e;
            if (obj instanceof Activity) {
                Activity activity = (Activity) obj;
                if (activity instanceof InterfaceC0954z) {
                    if (((InterfaceC0954z) activity).getLifecycle().toq().isAtLeast(kja0.zy.CREATED)) {
                        activity.onConfigurationChanged(configuration2);
                    }
                } else {
                    if (!this.k0 || this.ar) {
                        return;
                    }
                    activity.onConfigurationChanged(configuration2);
                }
            }
        }
    }

    private boolean dr(PanelFeatureState panelFeatureState) {
        Context context = this.f192j;
        int i2 = panelFeatureState.f202k;
        if ((i2 == 0 || i2 == 108) && this.f46542bo != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(C7397k.toq.f42492p, typedValue, true);
            Resources.Theme themeNewTheme = null;
            if (typedValue.resourceId != 0) {
                themeNewTheme = context.getResources().newTheme();
                themeNewTheme.setTo(theme);
                themeNewTheme.applyStyle(typedValue.resourceId, true);
                themeNewTheme.resolveAttribute(C7397k.toq.f92901ld6, typedValue, true);
            } else {
                theme.resolveAttribute(C7397k.toq.f92901ld6, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (themeNewTheme == null) {
                    themeNewTheme = context.getResources().newTheme();
                    themeNewTheme.setTo(theme);
                }
                themeNewTheme.applyStyle(typedValue.resourceId, true);
            }
            if (themeNewTheme != null) {
                C0136q c0136q = new C0136q(context, 0);
                c0136q.getTheme().setTo(themeNewTheme);
                context = c0136q;
            }
        }
        androidx.appcompat.view.menu.f7l8 f7l8Var = new androidx.appcompat.view.menu.f7l8(context);
        f7l8Var.uv6(this);
        panelFeatureState.f7l8(f7l8Var);
        return true;
    }

    @dd
    private ActivityC0097n etdu() {
        for (Context baseContext = this.f192j; baseContext != null; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
            if (baseContext instanceof ActivityC0097n) {
                return (ActivityC0097n) baseContext;
            }
            if (!(baseContext instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    private boolean m106f(boolean z2) {
        if (this.ar) {
            return false;
        }
        int iUv6 = uv6();
        boolean zSok = sok(ikck(this.f192j, iUv6), z2);
        if (iUv6 == 0) {
            nmn5(this.f192j).m135g();
        } else {
            ki kiVar = this.tgs;
            if (kiVar != null) {
                kiVar.m136k();
            }
        }
        if (iUv6 == 3) {
            m110x(this.f192j).m135g();
        } else {
            ki kiVar2 = this.yl25;
            if (kiVar2 != null) {
                kiVar2.m136k();
            }
        }
        return zSok;
    }

    private void g1(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        int i2;
        ViewGroup.LayoutParams layoutParams;
        if (panelFeatureState.f46547kja0 || this.ar) {
            return;
        }
        if (panelFeatureState.f202k == 0) {
            if ((this.f192j.getResources().getConfiguration().screenLayout & 15) == 4) {
                return;
            }
        }
        Window.Callback callbackBo = bo();
        if (callbackBo != null && !callbackBo.onMenuOpened(panelFeatureState.f202k, panelFeatureState.f204p)) {
            m116j(panelFeatureState, true);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f192j.getSystemService("window");
        if (windowManager != null && zsr0(panelFeatureState, keyEvent)) {
            ViewGroup viewGroup = panelFeatureState.f46544f7l8;
            if (viewGroup != null && !panelFeatureState.f46543cdj) {
                View view = panelFeatureState.f206s;
                if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                    i2 = -1;
                }
                panelFeatureState.f46549n7h = false;
                WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(i2, -2, panelFeatureState.f205q, panelFeatureState.f203n, 1002, 8519680, -3);
                layoutParams2.gravity = panelFeatureState.f46554zy;
                layoutParams2.windowAnimations = panelFeatureState.f199g;
                windowManager.addView(panelFeatureState.f46544f7l8, layoutParams2);
                panelFeatureState.f46547kja0 = true;
            }
            if (viewGroup == null) {
                if (!gyi(panelFeatureState) || panelFeatureState.f46544f7l8 == null) {
                    return;
                }
            } else if (panelFeatureState.f46543cdj && viewGroup.getChildCount() > 0) {
                panelFeatureState.f46544f7l8.removeAllViews();
            }
            if (!c8jq(panelFeatureState) || !panelFeatureState.m128q()) {
                panelFeatureState.f46543cdj = true;
                return;
            }
            ViewGroup.LayoutParams layoutParams3 = panelFeatureState.f207y.getLayoutParams();
            if (layoutParams3 == null) {
                layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
            }
            panelFeatureState.f46544f7l8.setBackgroundResource(panelFeatureState.f46552toq);
            ViewParent parent = panelFeatureState.f207y.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(panelFeatureState.f207y);
            }
            panelFeatureState.f46544f7l8.addView(panelFeatureState.f207y, layoutParams3);
            if (!panelFeatureState.f207y.hasFocus()) {
                panelFeatureState.f207y.requestFocus();
            }
            i2 = -2;
            panelFeatureState.f46549n7h = false;
            WindowManager.LayoutParams layoutParams22 = new WindowManager.LayoutParams(i2, -2, panelFeatureState.f205q, panelFeatureState.f203n, 1002, 8519680, -3);
            layoutParams22.gravity = panelFeatureState.f46554zy;
            layoutParams22.windowAnimations = panelFeatureState.f199g;
            windowManager.addView(panelFeatureState.f46544f7l8, layoutParams22);
            panelFeatureState.f46547kja0 = true;
        }
    }

    private boolean gbni(PanelFeatureState panelFeatureState, int i2, KeyEvent keyEvent, int i3) {
        androidx.appcompat.view.menu.f7l8 f7l8Var;
        boolean zPerformShortcut = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((panelFeatureState.f46550qrj || zsr0(panelFeatureState, keyEvent)) && (f7l8Var = panelFeatureState.f204p) != null) {
            zPerformShortcut = f7l8Var.performShortcut(i2, keyEvent, i3);
        }
        if (zPerformShortcut && (i3 & 1) == 0 && this.f46542bo == null) {
            m116j(panelFeatureState, true);
        }
        return zPerformShortcut;
    }

    private boolean gyi(PanelFeatureState panelFeatureState) {
        panelFeatureState.m129y(zp());
        panelFeatureState.f46544f7l8 = new fn3e(panelFeatureState.f46553x2);
        panelFeatureState.f46554zy = 81;
        return true;
    }

    private void i1() {
        if (this.f194o == null) {
            Object obj = this.f191e;
            if (obj instanceof Activity) {
                lrht(((Activity) obj).getWindow());
            }
        }
        if (this.f194o == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    private int i9jn(int i2) {
        if (i2 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        }
        if (i2 != 9) {
            return i2;
        }
        Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
        return 109;
    }

    private void lrht(@lvui Window window) {
        if (this.f194o != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof C0080h) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        C0080h c0080h = new C0080h(callback);
        this.f193m = c0080h;
        window.setCallback(c0080h);
        C0184b c0184bFti = C0184b.fti(this.f192j, null, xy8);
        Drawable drawableM551s = c0184bFti.m551s(0);
        if (drawableM551s != null) {
            window.setBackgroundDrawable(drawableM551s);
        }
        c0184bFti.d3();
        this.f194o = window;
    }

    /* JADX INFO: renamed from: m */
    private ViewGroup m107m() {
        ViewGroup viewGroup;
        TypedArray typedArrayObtainStyledAttributes = this.f192j.obtainStyledAttributes(C7397k.qrj.f92638e5);
        int i2 = C7397k.qrj.oaex;
        if (!typedArrayObtainStyledAttributes.hasValue(i2)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(C7397k.qrj.izu, false)) {
            d3(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(i2, false)) {
            d3(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(C7397k.qrj.vh, false)) {
            d3(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(C7397k.qrj.jyr, false)) {
            d3(10);
        }
        this.ac = typedArrayObtainStyledAttributes.getBoolean(C7397k.qrj.f92637dxef, false);
        typedArrayObtainStyledAttributes.recycle();
        i1();
        this.f194o.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f192j);
        if (this.ad) {
            viewGroup = this.bq ? (ViewGroup) layoutInflaterFrom.inflate(C7397k.p.f92538ni7, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(C7397k.p.f92545zurt, (ViewGroup) null);
        } else if (this.ac) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(C7397k.p.f92540qrj, (ViewGroup) null);
            this.ax = false;
            this.ba = false;
        } else if (this.ba) {
            TypedValue typedValue = new TypedValue();
            this.f192j.getTheme().resolveAttribute(C7397k.toq.f42492p, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C0136q(this.f192j, typedValue.resourceId) : this.f192j).inflate(C7397k.p.f92531fu4, (ViewGroup) null);
            gvn7 gvn7Var = (gvn7) viewGroup.findViewById(C7397k.f7l8.f92318fu4);
            this.f46542bo = gvn7Var;
            gvn7Var.setWindowCallback(bo());
            if (this.ax) {
                this.f46542bo.mo425y(109);
            }
            if (this.bg) {
                this.f46542bo.mo425y(2);
            }
            if (this.az) {
                this.f46542bo.mo425y(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.ba + ", windowActionBarOverlay: " + this.ax + ", android:windowIsFloating: " + this.ac + ", windowActionModeOverlay: " + this.bq + ", windowNoTitle: " + this.ad + " }");
        }
        C0683f.kx3(viewGroup, new zy());
        if (this.f46542bo == null) {
            this.bl = (TextView) viewGroup.findViewById(C7397k.f7l8.f92342t8iq);
        }
        nmn5.zy(viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(C7397k.f7l8.f92344toq);
        ViewGroup viewGroup2 = (ViewGroup) this.f194o.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f194o.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new C0085n());
        return viewGroup;
    }

    private ki nmn5(@lvui Context context) {
        if (this.tgs == null) {
            this.tgs = new t8r(C0095h.m198k(context));
        }
        return this.tgs;
    }

    private void nn86() {
        ki kiVar = this.tgs;
        if (kiVar != null) {
            kiVar.m136k();
        }
        ki kiVar2 = this.yl25;
        if (kiVar2 != null) {
            kiVar2.m136k();
        }
    }

    @lvui
    /* JADX INFO: renamed from: o */
    private Configuration m108o(@lvui Context context, int i2, @dd Configuration configuration) {
        int i3 = i2 != 1 ? i2 != 2 ? context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i3 | (configuration2.uiMode & (-49));
        return configuration2;
    }

    private void py(boolean z2) {
        gvn7 gvn7Var = this.f46542bo;
        if (gvn7Var == null || !gvn7Var.zy() || (ViewConfiguration.get(this.f192j).hasPermanentMenuKey() && !this.f46542bo.mo418g())) {
            PanelFeatureState panelFeatureStateLv5 = lv5(0, true);
            panelFeatureStateLv5.f46543cdj = true;
            m116j(panelFeatureStateLv5, false);
            g1(panelFeatureStateLv5, null);
            return;
        }
        Window.Callback callbackBo = bo();
        if (this.f46542bo.mo423q() && z2) {
            this.f46542bo.hideOverflowMenu();
            if (this.ar) {
                return;
            }
            callbackBo.onPanelClosed(108, lv5(0, true).f204p);
            return;
        }
        if (callbackBo == null || this.ar) {
            return;
        }
        if (this.zmmu && (this.sk1t & 1) != 0) {
            this.f194o.getDecorView().removeCallbacks(this.dy);
            this.dy.run();
        }
        PanelFeatureState panelFeatureStateLv52 = lv5(0, true);
        androidx.appcompat.view.menu.f7l8 f7l8Var = panelFeatureStateLv52.f204p;
        if (f7l8Var == null || panelFeatureStateLv52.f46546ki || !callbackBo.onPreparePanel(0, panelFeatureStateLv52.f206s, f7l8Var)) {
            return;
        }
        callbackBo.onMenuOpened(108, panelFeatureStateLv52.f204p);
        this.f46542bo.showOverflowMenu();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean qo(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            androidx.appcompat.view.toq r0 = r4.f197w
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            r0 = 1
            androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState r2 = r4.lv5(r5, r0)
            if (r5 != 0) goto L43
            androidx.appcompat.widget.gvn7 r5 = r4.f46542bo
            if (r5 == 0) goto L43
            boolean r5 = r5.zy()
            if (r5 == 0) goto L43
            android.content.Context r5 = r4.f192j
            android.view.ViewConfiguration r5 = android.view.ViewConfiguration.get(r5)
            boolean r5 = r5.hasPermanentMenuKey()
            if (r5 != 0) goto L43
            androidx.appcompat.widget.gvn7 r5 = r4.f46542bo
            boolean r5 = r5.mo423q()
            if (r5 != 0) goto L3c
            boolean r5 = r4.ar
            if (r5 != 0) goto L62
            boolean r5 = r4.zsr0(r2, r6)
            if (r5 == 0) goto L62
            androidx.appcompat.widget.gvn7 r5 = r4.f46542bo
            boolean r0 = r5.showOverflowMenu()
            goto L68
        L3c:
            androidx.appcompat.widget.gvn7 r5 = r4.f46542bo
            boolean r0 = r5.hideOverflowMenu()
            goto L68
        L43:
            boolean r5 = r2.f46547kja0
            if (r5 != 0) goto L64
            boolean r3 = r2.f46549n7h
            if (r3 == 0) goto L4c
            goto L64
        L4c:
            boolean r5 = r2.f46550qrj
            if (r5 == 0) goto L62
            boolean r5 = r2.f46546ki
            if (r5 == 0) goto L5b
            r2.f46550qrj = r1
            boolean r5 = r4.zsr0(r2, r6)
            goto L5c
        L5b:
            r5 = r0
        L5c:
            if (r5 == 0) goto L62
            r4.g1(r2, r6)
            goto L68
        L62:
            r0 = r1
            goto L68
        L64:
            r4.m116j(r2, r0)
            r0 = r5
        L68:
            if (r0 == 0) goto L85
            android.content.Context r5 = r4.f192j
            android.content.Context r5 = r5.getApplicationContext()
            java.lang.String r6 = "audio"
            java.lang.Object r5 = r5.getSystemService(r6)
            android.media.AudioManager r5 = (android.media.AudioManager) r5
            if (r5 == 0) goto L7e
            r5.playSoundEffect(r1)
            goto L85
        L7e:
            java.lang.String r5 = "AppCompatDelegate"
            java.lang.String r6 = "Couldn't get audio manager"
            android.util.Log.w(r5, r6)
        L85:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.qo(int, android.view.KeyEvent):boolean");
    }

    private boolean r8s8(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f194o.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || C0683f.zsr0((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean sok(int r7, boolean r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.f192j
            r1 = 0
            android.content.res.Configuration r0 = r6.m108o(r0, r7, r1)
            boolean r2 = r6.m109v()
            android.content.res.Configuration r3 = r6.bc
            if (r3 != 0) goto L19
            android.content.Context r3 = r6.f192j
            android.content.res.Resources r3 = r3.getResources()
            android.content.res.Configuration r3 = r3.getConfiguration()
        L19:
            int r3 = r3.uiMode
            r3 = r3 & 48
            int r0 = r0.uiMode
            r0 = r0 & 48
            r4 = 1
            if (r3 == r0) goto L4b
            if (r8 == 0) goto L4b
            if (r2 != 0) goto L4b
            boolean r8 = r6.bs
            if (r8 == 0) goto L4b
            boolean r8 = androidx.appcompat.app.AppCompatDelegateImpl.th6
            if (r8 != 0) goto L34
            boolean r8 = r6.k0
            if (r8 == 0) goto L4b
        L34:
            java.lang.Object r8 = r6.f191e
            boolean r5 = r8 instanceof android.app.Activity
            if (r5 == 0) goto L4b
            android.app.Activity r8 = (android.app.Activity) r8
            boolean r8 = r8.isChild()
            if (r8 != 0) goto L4b
            java.lang.Object r8 = r6.f191e
            android.app.Activity r8 = (android.app.Activity) r8
            androidx.core.app.toq.a9(r8)
            r8 = r4
            goto L4c
        L4b:
            r8 = 0
        L4c:
            if (r8 != 0) goto L54
            if (r3 == r0) goto L54
            r6.cfr(r0, r2, r1)
            goto L55
        L54:
            r4 = r8
        L55:
            if (r4 == 0) goto L62
            java.lang.Object r8 = r6.f191e
            boolean r0 = r8 instanceof androidx.appcompat.app.ActivityC0097n
            if (r0 == 0) goto L62
            androidx.appcompat.app.n r8 = (androidx.appcompat.app.ActivityC0097n) r8
            r8.m210m(r7)
        L62:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.sok(int, boolean):boolean");
    }

    private int uv6() {
        int i2 = this.bu;
        return i2 != -100 ? i2 : androidx.appcompat.app.f7l8.kja0();
    }

    /* JADX INFO: renamed from: v */
    private boolean m109v() {
        if (!this.w97r && (this.f191e instanceof Activity)) {
            PackageManager packageManager = this.f192j.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(this.f192j, this.f191e.getClass()), Build.VERSION.SDK_INT >= 29 ? 269221888 : 786432);
                this.tlhn = (activityInfo == null || (activityInfo.configChanges & 512) == 0) ? false : true;
            } catch (PackageManager.NameNotFoundException e2) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e2);
                this.tlhn = false;
            }
        }
        this.w97r = true;
        return this.tlhn;
    }

    private void v0af() {
        if (this.id) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    private boolean vq(int i2, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        PanelFeatureState panelFeatureStateLv5 = lv5(i2, true);
        if (panelFeatureStateLv5.f46547kja0) {
            return false;
        }
        return zsr0(panelFeatureStateLv5, keyEvent);
    }

    /* JADX INFO: renamed from: x */
    private ki m110x(@lvui Context context) {
        if (this.yl25 == null) {
            this.yl25 = new cdj(context);
        }
        return this.yl25;
    }

    private void xwq3(int i2) {
        this.sk1t = (1 << i2) | this.sk1t;
        if (this.zmmu) {
            return;
        }
        C0683f.mbx(this.f194o.getDecorView(), this.dy);
        this.zmmu = true;
    }

    private void y2() {
        bf2();
        if (this.ba && this.f188a == null) {
            Object obj = this.f191e;
            if (obj instanceof Activity) {
                this.f188a = new androidx.appcompat.app.cdj((Activity) this.f191e, this.ax);
            } else if (obj instanceof Dialog) {
                this.f188a = new androidx.appcompat.app.cdj((Dialog) this.f191e);
            }
            AbstractC0096k abstractC0096k = this.f188a;
            if (abstractC0096k != null) {
                abstractC0096k.uv6(this.vb6);
            }
        }
    }

    private void z4(View view) {
        view.setBackgroundColor((C0683f.m3158d(view) & 8192) != 0 ? C0498q.m2252g(this.f192j, C7397k.q.f92560f7l8) : C0498q.m2252g(this.f192j, C7397k.q.f42428g));
    }

    private boolean zsr0(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        gvn7 gvn7Var;
        gvn7 gvn7Var2;
        gvn7 gvn7Var3;
        if (this.ar) {
            return false;
        }
        if (panelFeatureState.f46550qrj) {
            return true;
        }
        PanelFeatureState panelFeatureState2 = this.be;
        if (panelFeatureState2 != null && panelFeatureState2 != panelFeatureState) {
            m116j(panelFeatureState2, false);
        }
        Window.Callback callbackBo = bo();
        if (callbackBo != null) {
            panelFeatureState.f206s = callbackBo.onCreatePanelView(panelFeatureState.f202k);
        }
        int i2 = panelFeatureState.f202k;
        boolean z2 = i2 == 0 || i2 == 108;
        if (z2 && (gvn7Var3 = this.f46542bo) != null) {
            gvn7Var3.setMenuPrepared();
        }
        if (panelFeatureState.f206s == null && (!z2 || !(was() instanceof androidx.appcompat.app.n7h))) {
            androidx.appcompat.view.menu.f7l8 f7l8Var = panelFeatureState.f204p;
            if (f7l8Var == null || panelFeatureState.f46546ki) {
                if (f7l8Var == null && (!dr(panelFeatureState) || panelFeatureState.f204p == null)) {
                    return false;
                }
                if (z2 && this.f46542bo != null) {
                    if (this.f196v == null) {
                        this.f196v = new C0086p();
                    }
                    this.f46542bo.setMenu(panelFeatureState.f204p, this.f196v);
                }
                panelFeatureState.f204p.m323a();
                if (!callbackBo.onCreatePanelMenu(panelFeatureState.f202k, panelFeatureState.f204p)) {
                    panelFeatureState.f7l8(null);
                    if (z2 && (gvn7Var = this.f46542bo) != null) {
                        gvn7Var.setMenu(null, this.f196v);
                    }
                    return false;
                }
                panelFeatureState.f46546ki = false;
            }
            panelFeatureState.f204p.m323a();
            Bundle bundle = panelFeatureState.f46545fn3e;
            if (bundle != null) {
                panelFeatureState.f204p.hyr(bundle);
                panelFeatureState.f46545fn3e = null;
            }
            if (!callbackBo.onPreparePanel(0, panelFeatureState.f206s, panelFeatureState.f204p)) {
                if (z2 && (gvn7Var2 = this.f46542bo) != null) {
                    gvn7Var2.setMenu(null, this.f196v);
                }
                panelFeatureState.f204p.a98o();
                return false;
            }
            boolean z3 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            panelFeatureState.f200h = z3;
            panelFeatureState.f204p.setQwertyMode(z3);
            panelFeatureState.f204p.a98o();
        }
        panelFeatureState.f46550qrj = true;
        panelFeatureState.f46549n7h = false;
        this.be = panelFeatureState;
        return true;
    }

    @Override // androidx.appcompat.app.f7l8
    public void a9() {
        mo119n();
    }

    PanelFeatureState a98o(Menu menu) {
        PanelFeatureState[] panelFeatureStateArr = this.ay;
        int length = panelFeatureStateArr != null ? panelFeatureStateArr.length : 0;
        for (int i2 = 0; i2 < length; i2++) {
            PanelFeatureState panelFeatureState = panelFeatureStateArr[i2];
            if (panelFeatureState != null && panelFeatureState.f204p == menu) {
                return panelFeatureState;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    void m111b() {
        gyi gyiVar = this.bv;
        if (gyiVar != null) {
            gyiVar.m3298q();
        }
    }

    final Window.Callback bo() {
        return this.f194o.getCallback();
    }

    @Override // androidx.appcompat.app.f7l8
    public int cdj() {
        return this.bu;
    }

    @lvui
    @uv6({uv6.EnumC7844k.LIBRARY})
    @yz
    final ki ch() {
        return nmn5(this.f192j);
    }

    /* JADX INFO: renamed from: d */
    boolean m112d() {
        androidx.appcompat.view.toq toqVar = this.f197w;
        if (toqVar != null) {
            toqVar.zy();
            return true;
        }
        AbstractC0096k abstractC0096kT8r = t8r();
        return abstractC0096kT8r != null && abstractC0096kT8r.qrj();
    }

    @Override // androidx.appcompat.app.f7l8
    public void d2ok(View view) {
        bf2();
        ViewGroup viewGroup = (ViewGroup) this.in.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f193m.m399k().onContentChanged();
    }

    @Override // androidx.appcompat.app.f7l8
    public boolean d3(int i2) {
        int iI9jn = i9jn(i2);
        if (this.ad && iI9jn == 108) {
            return false;
        }
        if (this.ba && iI9jn == 1) {
            this.ba = false;
        }
        if (iI9jn == 1) {
            v0af();
            this.ad = true;
            return true;
        }
        if (iI9jn == 2) {
            v0af();
            this.bg = true;
            return true;
        }
        if (iI9jn == 5) {
            v0af();
            this.az = true;
            return true;
        }
        if (iI9jn == 10) {
            v0af();
            this.bq = true;
            return true;
        }
        if (iI9jn == 108) {
            v0af();
            this.ba = true;
            return true;
        }
        if (iI9jn != 109) {
            return this.f194o.requestFeature(iI9jn);
        }
        v0af();
        this.ax = true;
        return true;
    }

    void d8wk(ViewGroup viewGroup) {
    }

    @Override // androidx.appcompat.app.f7l8
    public void dd(boolean z2) {
        this.an = z2;
    }

    /* JADX INFO: renamed from: e */
    void m113e(@lvui androidx.appcompat.view.menu.f7l8 f7l8Var) {
        if (this.am) {
            return;
        }
        this.am = true;
        this.f46542bo.mo424s();
        Window.Callback callbackBo = bo();
        if (callbackBo != null && !this.ar) {
            callbackBo.onPanelClosed(108, f7l8Var);
        }
        this.am = false;
    }

    void ek5k() {
        androidx.appcompat.view.menu.f7l8 f7l8Var;
        gvn7 gvn7Var = this.f46542bo;
        if (gvn7Var != null) {
            gvn7Var.mo424s();
        }
        if (this.bb != null) {
            this.f194o.getDecorView().removeCallbacks(this.bp);
            if (this.bb.isShowing()) {
                try {
                    this.bb.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.bb = null;
        }
        m111b();
        PanelFeatureState panelFeatureStateLv5 = lv5(0, false);
        if (panelFeatureStateLv5 == null || (f7l8Var = panelFeatureStateLv5.f204p) == null) {
            return;
        }
        f7l8Var.close();
    }

    @Override // androidx.appcompat.app.f7l8
    public void eqxt(int i2) {
        bf2();
        ViewGroup viewGroup = (ViewGroup) this.in.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f192j).inflate(i2, viewGroup);
        this.f193m.m399k().onContentChanged();
    }

    @Override // androidx.appcompat.app.f7l8
    public void fn3e() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f192j);
        if (layoutInflaterFrom.getFactory() == null) {
            C0690h.m3309q(layoutInflaterFrom, this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof AppCompatDelegateImpl) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    boolean fnq8(int i2, KeyEvent keyEvent) {
        if (i2 == 4) {
            boolean z2 = this.aj;
            this.aj = false;
            PanelFeatureState panelFeatureStateLv5 = lv5(0, false);
            if (panelFeatureStateLv5 != null && panelFeatureStateLv5.f46547kja0) {
                if (!z2) {
                    m116j(panelFeatureStateLv5, true);
                }
                return true;
            }
            if (m112d()) {
                return true;
            }
        } else if (i2 == 82) {
            qo(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.f7l8
    public void fti() {
        AbstractC0096k abstractC0096kT8r = t8r();
        if (abstractC0096kT8r != null) {
            abstractC0096kT8r.bo(false);
        }
    }

    @Override // androidx.appcompat.app.f7l8
    public boolean fu4() {
        return this.an;
    }

    @Override // androidx.appcompat.app.f7l8
    /* JADX INFO: renamed from: h */
    public final toq.InterfaceC7850toq mo114h() {
        return new C0089y();
    }

    void hb(int i2) {
        m116j(lv5(i2, true), true);
    }

    @Override // androidx.appcompat.app.f7l8
    public androidx.appcompat.view.toq hyr(@lvui toq.InterfaceC0138k interfaceC0138k) {
        InterfaceC0094g interfaceC0094g;
        if (interfaceC0138k == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        androidx.appcompat.view.toq toqVar = this.f197w;
        if (toqVar != null) {
            toqVar.zy();
        }
        ld6 ld6Var = new ld6(interfaceC0138k);
        AbstractC0096k abstractC0096kT8r = t8r();
        if (abstractC0096kT8r != null) {
            androidx.appcompat.view.toq toqVarMu = abstractC0096kT8r.mu(ld6Var);
            this.f197w = toqVarMu;
            if (toqVarMu != null && (interfaceC0094g = this.f189b) != null) {
                interfaceC0094g.mo196t(toqVarMu);
            }
        }
        if (this.f197w == null) {
            this.f197w = m4(ld6Var);
        }
        return this.f197w;
    }

    @Override // androidx.appcompat.app.f7l8
    /* JADX INFO: renamed from: i */
    public boolean mo115i(int i2) {
        int iI9jn = i9jn(i2);
        return (iI9jn != 1 ? iI9jn != 2 ? iI9jn != 5 ? iI9jn != 10 ? iI9jn != 108 ? iI9jn != 109 ? false : this.ax : this.ba : this.bq : this.az : this.bg : this.ad) || this.f194o.hasFeature(i2);
    }

    int ikck(@lvui Context context, int i2) {
        if (i2 == -100) {
            return -1;
        }
        if (i2 != -1) {
            if (i2 == 0) {
                if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                return nmn5(context).zy();
            }
            if (i2 != 1 && i2 != 2) {
                if (i2 == 3) {
                    return m110x(context).zy();
                }
                throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: j */
    void m116j(PanelFeatureState panelFeatureState, boolean z2) {
        ViewGroup viewGroup;
        gvn7 gvn7Var;
        if (z2 && panelFeatureState.f202k == 0 && (gvn7Var = this.f46542bo) != null && gvn7Var.mo423q()) {
            m113e(panelFeatureState.f204p);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f192j.getSystemService("window");
        if (windowManager != null && panelFeatureState.f46547kja0 && (viewGroup = panelFeatureState.f46544f7l8) != null) {
            windowManager.removeView(viewGroup);
            if (z2) {
                vyq(panelFeatureState.f202k, panelFeatureState, null);
            }
        }
        panelFeatureState.f46550qrj = false;
        panelFeatureState.f46549n7h = false;
        panelFeatureState.f46547kja0 = false;
        panelFeatureState.f207y = null;
        panelFeatureState.f46543cdj = true;
        if (this.be == panelFeatureState) {
            this.be = null;
        }
    }

    @Override // androidx.appcompat.app.f7l8
    public void jk(Bundle bundle) {
    }

    @Override // androidx.appcompat.view.menu.f7l8.InterfaceC0118k
    /* JADX INFO: renamed from: k */
    public boolean mo117k(@lvui androidx.appcompat.view.menu.f7l8 f7l8Var, @lvui MenuItem menuItem) {
        PanelFeatureState panelFeatureStateA98o;
        Window.Callback callbackBo = bo();
        if (callbackBo == null || this.ar || (panelFeatureStateA98o = a98o(f7l8Var.jp0y())) == null) {
            return false;
        }
        return callbackBo.onMenuItemSelected(panelFeatureStateA98o.f202k, menuItem);
    }

    @Override // androidx.appcompat.app.f7l8
    public MenuInflater ki() {
        if (this.f198x == null) {
            y2();
            AbstractC0096k abstractC0096k = this.f188a;
            this.f198x = new androidx.appcompat.view.f7l8(abstractC0096k != null ? abstractC0096k.wvg() : this.f192j);
        }
        return this.f198x;
    }

    @Override // androidx.appcompat.app.f7l8
    /* JADX INFO: renamed from: l */
    public void mo118l(@hb int i2) {
        this.bd = i2;
    }

    final boolean ltg8() {
        ViewGroup viewGroup;
        return this.id && (viewGroup = this.in) != null && C0683f.v0af(viewGroup);
    }

    protected PanelFeatureState lv5(int i2, boolean z2) {
        PanelFeatureState[] panelFeatureStateArr = this.ay;
        if (panelFeatureStateArr == null || panelFeatureStateArr.length <= i2) {
            PanelFeatureState[] panelFeatureStateArr2 = new PanelFeatureState[i2 + 1];
            if (panelFeatureStateArr != null) {
                System.arraycopy(panelFeatureStateArr, 0, panelFeatureStateArr2, 0, panelFeatureStateArr.length);
            }
            this.ay = panelFeatureStateArr2;
            panelFeatureStateArr = panelFeatureStateArr2;
        }
        PanelFeatureState panelFeatureState = panelFeatureStateArr[i2];
        if (panelFeatureState != null) {
            return panelFeatureState;
        }
        PanelFeatureState panelFeatureState2 = new PanelFeatureState(i2);
        panelFeatureStateArr[i2] = panelFeatureState2;
        return panelFeatureState2;
    }

    @Override // androidx.appcompat.app.f7l8
    public void lvui(View view, ViewGroup.LayoutParams layoutParams) {
        bf2();
        ViewGroup viewGroup = (ViewGroup) this.in.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f193m.m399k().onContentChanged();
    }

    androidx.appcompat.view.toq m4(@lvui toq.InterfaceC0138k interfaceC0138k) {
        androidx.appcompat.view.toq toqVarLvui;
        Context c0136q;
        InterfaceC0094g interfaceC0094g;
        m111b();
        androidx.appcompat.view.toq toqVar = this.f197w;
        if (toqVar != null) {
            toqVar.zy();
        }
        if (!(interfaceC0138k instanceof ld6)) {
            interfaceC0138k = new ld6(interfaceC0138k);
        }
        InterfaceC0094g interfaceC0094g2 = this.f189b;
        if (interfaceC0094g2 == null || this.ar) {
            toqVarLvui = null;
        } else {
            try {
                toqVarLvui = interfaceC0094g2.lvui(interfaceC0138k);
            } catch (AbstractMethodError unused) {
                toqVarLvui = null;
            }
        }
        if (toqVarLvui != null) {
            this.f197w = toqVarLvui;
        } else {
            if (this.f46541ab == null) {
                if (this.ac) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = this.f192j.getTheme();
                    theme.resolveAttribute(C7397k.toq.f42492p, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = this.f192j.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        c0136q = new C0136q(this.f192j, 0);
                        c0136q.getTheme().setTo(themeNewTheme);
                    } else {
                        c0136q = this.f192j;
                    }
                    this.f46541ab = new ActionBarContextView(c0136q);
                    PopupWindow popupWindow = new PopupWindow(c0136q, (AttributeSet) null, C7397k.toq.f42502z);
                    this.bb = popupWindow;
                    androidx.core.widget.cdj.m3621q(popupWindow, 2);
                    this.bb.setContentView(this.f46541ab);
                    this.bb.setWidth(-1);
                    c0136q.getTheme().resolveAttribute(C7397k.toq.f42493q, typedValue, true);
                    this.f46541ab.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, c0136q.getResources().getDisplayMetrics()));
                    this.bb.setHeight(-2);
                    this.bp = new RunnableC0079g();
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) this.in.findViewById(C7397k.f7l8.f92348x2);
                    if (viewStubCompat != null) {
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(zp()));
                        this.f46541ab = (ActionBarContextView) viewStubCompat.m526k();
                    }
                }
            }
            if (this.f46541ab != null) {
                m111b();
                this.f46541ab.m411i();
                C0135n c0135n = new C0135n(this.f46541ab.getContext(), this.f46541ab, interfaceC0138k, this.bb == null);
                if (interfaceC0138k.toq(c0135n, c0135n.mo188n())) {
                    c0135n.ld6();
                    this.f46541ab.cdj(c0135n);
                    this.f197w = c0135n;
                    if (ltg8()) {
                        this.f46541ab.setAlpha(0.0f);
                        gyi qVar = C0683f.f7l8(this.f46541ab).toq(1.0f);
                        this.bv = qVar;
                        qVar.fn3e(new f7l8());
                    } else {
                        this.f46541ab.setAlpha(1.0f);
                        this.f46541ab.setVisibility(0);
                        if (this.f46541ab.getParent() instanceof View) {
                            C0683f.m28243do((View) this.f46541ab.getParent());
                        }
                    }
                    if (this.bb != null) {
                        this.f194o.getDecorView().post(this.bp);
                    }
                } else {
                    this.f197w = null;
                }
            }
        }
        androidx.appcompat.view.toq toqVar2 = this.f197w;
        if (toqVar2 != null && (interfaceC0094g = this.f189b) != null) {
            interfaceC0094g.mo196t(toqVar2);
        }
        return this.f197w;
    }

    @Override // androidx.appcompat.app.f7l8
    public void mcp() {
        AbstractC0096k abstractC0096kT8r = t8r();
        if (abstractC0096kT8r != null) {
            abstractC0096kT8r.bo(true);
        }
    }

    boolean mu(int i2, KeyEvent keyEvent) {
        if (i2 == 4) {
            this.aj = (keyEvent.getFlags() & 128) != 0;
        } else if (i2 == 82) {
            vq(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.f7l8
    /* JADX INFO: renamed from: n */
    public boolean mo119n() {
        return m106f(true);
    }

    @Override // androidx.appcompat.app.f7l8
    public final void n5r1(CharSequence charSequence) {
        this.f195u = charSequence;
        gvn7 gvn7Var = this.f46542bo;
        if (gvn7Var != null) {
            gvn7Var.setWindowTitle(charSequence);
            return;
        }
        if (was() != null) {
            was().ikck(charSequence);
            return;
        }
        TextView textView = this.bl;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // androidx.appcompat.app.f7l8
    @dd
    public <T extends View> T n7h(@InterfaceC7843t int i2) {
        bf2();
        return (T) this.f194o.findViewById(i2);
    }

    @Override // androidx.appcompat.app.f7l8
    public void ncyb(Toolbar toolbar) {
        if (this.f191e instanceof Activity) {
            AbstractC0096k abstractC0096kT8r = t8r();
            if (abstractC0096kT8r instanceof androidx.appcompat.app.cdj) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.f198x = null;
            if (abstractC0096kT8r != null) {
                abstractC0096kT8r.oc();
            }
            this.f188a = null;
            if (toolbar != null) {
                androidx.appcompat.app.n7h n7hVar = new androidx.appcompat.app.n7h(toolbar, m122u(), this.f193m);
                this.f188a = n7hVar;
                this.f193m.toq(n7hVar.f46608ld6);
            } else {
                this.f193m.toq(null);
            }
            zurt();
        }
    }

    @Override // androidx.appcompat.app.f7l8
    public void o1t(Bundle bundle) {
        this.bs = true;
        m106f(false);
        i1();
        Object obj = this.f191e;
        if (obj instanceof Activity) {
            String strM1953q = null;
            try {
                strM1953q = ni7.m1953q((Activity) obj);
            } catch (IllegalArgumentException unused) {
            }
            if (strM1953q != null) {
                AbstractC0096k abstractC0096kWas = was();
                if (abstractC0096kWas == null) {
                    this.vb6 = true;
                } else {
                    abstractC0096kWas.uv6(true);
                }
            }
            androidx.appcompat.app.f7l8.zy(this);
        }
        this.bc = new Configuration(this.f192j.getResources().getConfiguration());
        this.k0 = true;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return qrj(view, str, context, attributeSet);
    }

    @Override // androidx.appcompat.app.f7l8
    /* JADX INFO: renamed from: q */
    public void mo120q(View view, ViewGroup.LayoutParams layoutParams) {
        bf2();
        ((ViewGroup) this.in.findViewById(R.id.content)).addView(view, layoutParams);
        this.f193m.m399k().onContentChanged();
    }

    boolean qkj8(int i2, KeyEvent keyEvent) {
        AbstractC0096k abstractC0096kT8r = t8r();
        if (abstractC0096kT8r != null && abstractC0096kT8r.eqxt(i2, keyEvent)) {
            return true;
        }
        PanelFeatureState panelFeatureState = this.be;
        if (panelFeatureState != null && gbni(panelFeatureState, keyEvent.getKeyCode(), keyEvent, 1)) {
            PanelFeatureState panelFeatureState2 = this.be;
            if (panelFeatureState2 != null) {
                panelFeatureState2.f46549n7h = true;
            }
            return true;
        }
        if (this.be == null) {
            PanelFeatureState panelFeatureStateLv5 = lv5(0, true);
            zsr0(panelFeatureStateLv5, keyEvent);
            boolean zGbni = gbni(panelFeatureStateLv5, keyEvent.getKeyCode(), keyEvent, 1);
            panelFeatureStateLv5.f46550qrj = false;
            if (zGbni) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.app.f7l8
    public View qrj(View view, String str, @lvui Context context, @lvui AttributeSet attributeSet) {
        boolean z2;
        boolean z3 = false;
        if (this.s8y == null) {
            String string = this.f192j.obtainStyledAttributes(C7397k.qrj.f92638e5).getString(C7397k.qrj.qla);
            if (string == null) {
                this.s8y = new C0101p();
            } else {
                try {
                    this.s8y = (C0101p) this.f192j.getClassLoader().loadClass(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.s8y = new C0101p();
                }
            }
        }
        boolean z5 = cw14;
        boolean zR8s8 = true;
        if (z5) {
            if (this.mjvl == null) {
                this.mjvl = new androidx.appcompat.app.ld6();
            }
            if (this.mjvl.m205k(attributeSet)) {
                z2 = true;
            } else {
                if (attributeSet instanceof XmlPullParser) {
                    if (((XmlPullParser) attributeSet).getDepth() > 1) {
                    }
                    z2 = z3;
                } else {
                    zR8s8 = r8s8((ViewParent) view);
                }
                z3 = zR8s8;
                z2 = z3;
            }
        } else {
            z2 = z3;
        }
        return this.s8y.ki(view, str, context, attributeSet, z2, z5, true, ch.m570q());
    }

    @Override // androidx.appcompat.app.f7l8
    /* JADX INFO: renamed from: t */
    public void mo121t(Bundle bundle) {
        bf2();
    }

    ViewGroup t8iq() {
        return this.in;
    }

    @Override // androidx.appcompat.app.f7l8
    public AbstractC0096k t8r() {
        y2();
        return this.f188a;
    }

    void tfm(int i2) {
        AbstractC0096k abstractC0096kT8r;
        if (i2 != 108 || (abstractC0096kT8r = t8r()) == null) {
            return;
        }
        abstractC0096kT8r.n7h(true);
    }

    @Override // androidx.appcompat.view.menu.f7l8.InterfaceC0118k
    public void toq(@lvui androidx.appcompat.view.menu.f7l8 f7l8Var) {
        py(true);
    }

    /* JADX INFO: renamed from: u */
    final CharSequence m122u() {
        Object obj = this.f191e;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.f195u;
    }

    void vyq(int i2, PanelFeatureState panelFeatureState, Menu menu) {
        if (menu == null) {
            if (panelFeatureState == null && i2 >= 0) {
                PanelFeatureState[] panelFeatureStateArr = this.ay;
                if (i2 < panelFeatureStateArr.length) {
                    panelFeatureState = panelFeatureStateArr[i2];
                }
            }
            if (panelFeatureState != null) {
                menu = panelFeatureState.f204p;
            }
        }
        if ((panelFeatureState == null || panelFeatureState.f46547kja0) && !this.ar) {
            this.f193m.m399k().onPanelClosed(i2, menu);
        }
    }

    final int w831(@dd tfm tfmVar, @dd Rect rect) {
        boolean z2;
        boolean z3;
        int iKi = tfmVar != null ? tfmVar.ki() : rect != null ? rect.top : 0;
        ActionBarContextView actionBarContextView = this.f46541ab;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z2 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f46541ab.getLayoutParams();
            if (this.f46541ab.isShown()) {
                if (this.k6e == null) {
                    this.k6e = new Rect();
                    this.xk5 = new Rect();
                }
                Rect rect2 = this.k6e;
                Rect rect3 = this.xk5;
                if (tfmVar == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(tfmVar.m3467h(), tfmVar.ki(), tfmVar.cdj(), tfmVar.kja0());
                }
                nmn5.m687k(this.in, rect2, rect3);
                int i2 = rect2.top;
                int i3 = rect2.left;
                int i4 = rect2.right;
                tfm tfmVarM3178x = C0683f.m3178x(this.in);
                int iM3467h = tfmVarM3178x == null ? 0 : tfmVarM3178x.m3467h();
                int iCdj = tfmVarM3178x == null ? 0 : tfmVarM3178x.cdj();
                if (marginLayoutParams.topMargin == i2 && marginLayoutParams.leftMargin == i3 && marginLayoutParams.rightMargin == i4) {
                    z3 = false;
                } else {
                    marginLayoutParams.topMargin = i2;
                    marginLayoutParams.leftMargin = i3;
                    marginLayoutParams.rightMargin = i4;
                    z3 = true;
                }
                if (i2 <= 0 || this.as != null) {
                    View view = this.as;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        int i5 = marginLayoutParams2.height;
                        int i6 = marginLayoutParams.topMargin;
                        if (i5 != i6 || marginLayoutParams2.leftMargin != iM3467h || marginLayoutParams2.rightMargin != iCdj) {
                            marginLayoutParams2.height = i6;
                            marginLayoutParams2.leftMargin = iM3467h;
                            marginLayoutParams2.rightMargin = iCdj;
                            this.as.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(this.f192j);
                    this.as = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iM3467h;
                    layoutParams.rightMargin = iCdj;
                    this.in.addView(this.as, -1, layoutParams);
                }
                View view3 = this.as;
                z = view3 != null;
                if (z && view3.getVisibility() != 0) {
                    z4(this.as);
                }
                if (!this.bq && z) {
                    iKi = 0;
                }
                z2 = z;
                z = z3;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z2 = false;
            } else {
                z2 = false;
                z = false;
            }
            if (z) {
                this.f46541ab.setLayoutParams(marginLayoutParams);
            }
        }
        View view4 = this.as;
        if (view4 != null) {
            view4.setVisibility(z2 ? 0 : 8);
        }
        return iKi;
    }

    final AbstractC0096k was() {
        return this.f188a;
    }

    void wo(int i2) {
        if (i2 == 108) {
            AbstractC0096k abstractC0096kT8r = t8r();
            if (abstractC0096kT8r != null) {
                abstractC0096kT8r.n7h(false);
                return;
            }
            return;
        }
        if (i2 == 0) {
            PanelFeatureState panelFeatureStateLv5 = lv5(i2, true);
            if (panelFeatureStateLv5.f46547kja0) {
                m116j(panelFeatureStateLv5, false);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    @Override // androidx.appcompat.app.f7l8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void wvg() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f191e
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L9
            androidx.appcompat.app.f7l8.jp0y(r3)
        L9:
            boolean r0 = r3.zmmu
            if (r0 == 0) goto L18
            android.view.Window r0 = r3.f194o
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.dy
            r0.removeCallbacks(r1)
        L18:
            r0 = 1
            r3.ar = r0
            int r0 = r3.bu
            r1 = -100
            if (r0 == r1) goto L45
            java.lang.Object r0 = r3.f191e
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L45
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L45
            androidx.collection.qrj<java.lang.String, java.lang.Integer> r0 = androidx.appcompat.app.AppCompatDelegateImpl.hp
            java.lang.Object r1 = r3.f191e
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.bu
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L54
        L45:
            androidx.collection.qrj<java.lang.String, java.lang.Integer> r0 = androidx.appcompat.app.AppCompatDelegateImpl.hp
            java.lang.Object r1 = r3.f191e
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L54:
            androidx.appcompat.app.k r0 = r3.f188a
            if (r0 == 0) goto L5b
            r0.oc()
        L5b:
            r3.nn86()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.wvg():void");
    }

    @Override // androidx.appcompat.app.f7l8
    @hyr(17)
    public void x9kr(int i2) {
        if (this.bu != i2) {
            this.bu = i2;
            if (this.bs) {
                mo119n();
            }
        }
    }

    @Override // androidx.appcompat.app.f7l8
    @lvui
    @InterfaceC7842s
    /* JADX INFO: renamed from: y */
    public Context mo123y(@lvui Context context) {
        this.bs = true;
        int iIkck = ikck(context, uv6());
        if (q7k9 && (context instanceof ContextThemeWrapper)) {
            try {
                C0081i.m133k((ContextThemeWrapper) context, m108o(context, iIkck, null));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof C0136q) {
            try {
                ((C0136q) context).m397k(m108o(context, iIkck, null));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!th6) {
            return super.mo123y(context);
        }
        Configuration configuration = new Configuration();
        configuration.uiMode = -1;
        configuration.fontScale = 0.0f;
        Configuration configuration2 = x2.m147k(context, configuration).getResources().getConfiguration();
        Configuration configuration3 = context.getResources().getConfiguration();
        configuration2.uiMode = configuration3.uiMode;
        Configuration configurationM108o = m108o(context, iIkck, configuration2.equals(configuration3) ? null : m104a(configuration2, configuration3));
        C0136q c0136q = new C0136q(context, C7397k.x2.vddr);
        c0136q.m397k(configurationM108o);
        boolean z2 = false;
        try {
            z2 = context.getTheme() != null;
        } catch (NullPointerException unused3) {
        }
        if (z2) {
            C0506s.y.m2342k(c0136q.getTheme());
        }
        return super.mo123y(c0136q);
    }

    void y9n(int i2) {
        PanelFeatureState panelFeatureStateLv5;
        PanelFeatureState panelFeatureStateLv52 = lv5(i2, true);
        if (panelFeatureStateLv52.f204p != null) {
            Bundle bundle = new Bundle();
            panelFeatureStateLv52.f204p.m325c(bundle);
            if (bundle.size() > 0) {
                panelFeatureStateLv52.f46545fn3e = bundle;
            }
            panelFeatureStateLv52.f204p.m323a();
            panelFeatureStateLv52.f204p.clear();
        }
        panelFeatureStateLv52.f46546ki = true;
        panelFeatureStateLv52.f46543cdj = true;
        if ((i2 != 108 && i2 != 0) || this.f46542bo == null || (panelFeatureStateLv5 = lv5(0, false)) == null) {
            return;
        }
        panelFeatureStateLv5.f46550qrj = false;
        zsr0(panelFeatureStateLv5, null);
    }

    boolean yz(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f191e;
        if (((obj instanceof kja0.InterfaceC0703k) || (obj instanceof DialogC0107y)) && (decorView = this.f194o.getDecorView()) != null && androidx.core.view.kja0.m3361q(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f193m.m399k().dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? mu(keyCode, keyEvent) : fnq8(keyCode, keyEvent);
    }

    @Override // androidx.appcompat.app.f7l8
    /* JADX INFO: renamed from: z */
    public void mo124z(Configuration configuration) {
        AbstractC0096k abstractC0096kT8r;
        if (this.ba && this.id && (abstractC0096kT8r = t8r()) != null) {
            abstractC0096kT8r.d3(configuration);
        }
        androidx.appcompat.widget.ld6.toq().f7l8(this.f192j);
        this.bc = new Configuration(this.f192j.getResources().getConfiguration());
        m106f(false);
    }

    final Context zp() {
        AbstractC0096k abstractC0096kT8r = t8r();
        Context contextWvg = abstractC0096kT8r != null ? abstractC0096kT8r.wvg() : null;
        return contextWvg == null ? this.f192j : contextWvg;
    }

    @Override // androidx.appcompat.app.f7l8
    public void zurt() {
        AbstractC0096k abstractC0096kT8r = t8r();
        if (abstractC0096kT8r == null || !abstractC0096kT8r.jk()) {
            xwq3(0);
        }
    }

    AppCompatDelegateImpl(Dialog dialog, InterfaceC0094g interfaceC0094g) {
        this(dialog.getContext(), dialog.getWindow(), interfaceC0094g, dialog);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    AppCompatDelegateImpl(Context context, Window window, InterfaceC0094g interfaceC0094g) {
        this(context, window, interfaceC0094g, context);
    }

    AppCompatDelegateImpl(Context context, Activity activity, InterfaceC0094g interfaceC0094g) {
        this(context, null, interfaceC0094g, activity);
    }

    private AppCompatDelegateImpl(Context context, Window window, InterfaceC0094g interfaceC0094g, Object obj) {
        androidx.collection.qrj<String, Integer> qrjVar;
        Integer num;
        ActivityC0097n activityC0097nEtdu;
        this.bv = null;
        this.an = true;
        this.bu = -100;
        this.dy = new toq();
        this.f192j = context;
        this.f189b = interfaceC0094g;
        this.f191e = obj;
        if (this.bu == -100 && (obj instanceof Dialog) && (activityC0097nEtdu = etdu()) != null) {
            this.bu = activityC0097nEtdu.m209e().cdj();
        }
        if (this.bu == -100 && (num = (qrjVar = hp).get(obj.getClass().getName())) != null) {
            this.bu = num.intValue();
            qrjVar.remove(obj.getClass().getName());
        }
        if (window != null) {
            lrht(window);
        }
        androidx.appcompat.widget.ld6.m631s();
    }
}
