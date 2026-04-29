package androidx.appcompat.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.C0130p;
import androidx.appcompat.view.menu.ld6;
import androidx.appcompat.widget.C0184b;
import androidx.appcompat.widget.oc;
import androidx.core.view.C0744z;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p024h.InterfaceMenuC6069k;
import p030n.C7397k;
import zy.gvn7;
import zy.uv6;

/* JADX INFO: compiled from: SupportMenuInflater.java */
/* JADX INFO: loaded from: classes.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public class f7l8 extends MenuInflater {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final String f46671f7l8 = "group";

    /* JADX INFO: renamed from: g */
    private static final String f393g = "menu";

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    static final Class<?>[] f46672ld6;

    /* JADX INFO: renamed from: n */
    static final String f394n = "SupportMenuInflater";

    /* JADX INFO: renamed from: p */
    static final Class<?>[] f395p;

    /* JADX INFO: renamed from: s */
    static final int f396s = 0;

    /* JADX INFO: renamed from: y */
    private static final String f397y = "item";

    /* JADX INFO: renamed from: k */
    final Object[] f398k;

    /* JADX INFO: renamed from: q */
    private Object f399q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    final Object[] f46673toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    Context f46674zy;

    /* JADX INFO: renamed from: androidx.appcompat.view.f7l8$k */
    /* JADX INFO: compiled from: SupportMenuInflater.java */
    private static class MenuItemOnMenuItemClickListenerC0114k implements MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: n */
        private static final Class<?>[] f400n = {MenuItem.class};

        /* JADX INFO: renamed from: k */
        private Object f401k;

        /* JADX INFO: renamed from: q */
        private Method f402q;

        public MenuItemOnMenuItemClickListenerC0114k(Object obj, String str) {
            this.f401k = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f402q = cls.getMethod(str, f400n);
            } catch (Exception e2) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e2);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f402q.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f402q.invoke(this.f401k, menuItem)).booleanValue();
                }
                this.f402q.invoke(this.f401k, menuItem);
                return true;
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    /* JADX INFO: compiled from: SupportMenuInflater.java */
    private class toq {

        /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
        private static final boolean f46675d2ok = false;

        /* JADX INFO: renamed from: d3, reason: collision with root package name */
        private static final int f46676d3 = 0;

        /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
        private static final int f46677eqxt = 0;

        /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
        private static final int f46678gvn7 = 0;

        /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
        private static final int f46679jp0y = 0;

        /* JADX INFO: renamed from: lvui, reason: collision with root package name */
        private static final boolean f46680lvui = true;

        /* JADX INFO: renamed from: oc, reason: collision with root package name */
        private static final int f46681oc = 0;

        /* JADX INFO: renamed from: r */
        private static final boolean f403r = true;

        /* JADX INFO: renamed from: cdj, reason: collision with root package name */
        private int f46683cdj;

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private boolean f46684f7l8;

        /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
        private boolean f46685fn3e;

        /* JADX INFO: renamed from: fu4, reason: collision with root package name */
        private String f46687fu4;

        /* JADX INFO: renamed from: g */
        private boolean f404g;

        /* JADX INFO: renamed from: h */
        private char f405h;

        /* JADX INFO: renamed from: i */
        private boolean f406i;

        /* JADX INFO: renamed from: k */
        private Menu f407k;

        /* JADX INFO: renamed from: ki, reason: collision with root package name */
        private int f46689ki;

        /* JADX INFO: renamed from: kja0, reason: collision with root package name */
        private int f46690kja0;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        private CharSequence f46691ld6;

        /* JADX INFO: renamed from: mcp, reason: collision with root package name */
        private CharSequence f46692mcp;

        /* JADX INFO: renamed from: n */
        private int f408n;

        /* JADX INFO: renamed from: n7h, reason: collision with root package name */
        private char f46693n7h;

        /* JADX INFO: renamed from: ni7, reason: collision with root package name */
        private int f46694ni7;

        /* JADX INFO: renamed from: o1t, reason: collision with root package name */
        private String f46695o1t;

        /* JADX INFO: renamed from: p */
        private int f409p;

        /* JADX INFO: renamed from: q */
        private int f410q;

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        private int f46696qrj;

        /* JADX INFO: renamed from: s */
        private int f411s;

        /* JADX INFO: renamed from: t */
        private CharSequence f412t;

        /* JADX INFO: renamed from: t8r, reason: collision with root package name */
        private boolean f46697t8r;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private int f46698toq;

        /* JADX INFO: renamed from: wvg, reason: collision with root package name */
        androidx.core.view.toq f46699wvg;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        private CharSequence f46700x2;

        /* JADX INFO: renamed from: y */
        private boolean f413y;

        /* JADX INFO: renamed from: z */
        private String f414z;

        /* JADX INFO: renamed from: zurt, reason: collision with root package name */
        private int f46701zurt;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private int f46702zy;

        /* JADX INFO: renamed from: jk, reason: collision with root package name */
        private ColorStateList f46688jk = null;

        /* JADX INFO: renamed from: a9, reason: collision with root package name */
        private PorterDuff.Mode f46682a9 = null;

        public toq(Menu menu) {
            this.f407k = menu;
            m299y();
        }

        /* JADX INFO: renamed from: n */
        private <T> T m294n(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, f7l8.this.f46674zy.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e2) {
                Log.w(f7l8.f394n, "Cannot instantiate class: " + str, e2);
                return null;
            }
        }

        /* JADX INFO: renamed from: s */
        private void m295s(MenuItem menuItem) {
            boolean z2 = false;
            menuItem.setChecked(this.f46697t8r).setVisible(this.f406i).setEnabled(this.f46685fn3e).setCheckable(this.f46689ki >= 1).setTitleCondensed(this.f46700x2).setIcon(this.f46696qrj);
            int i2 = this.f46701zurt;
            if (i2 >= 0) {
                menuItem.setShowAsAction(i2);
            }
            if (this.f46695o1t != null) {
                if (f7l8.this.f46674zy.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new MenuItemOnMenuItemClickListenerC0114k(f7l8.this.toq(), this.f46695o1t));
            }
            if (this.f46689ki >= 2) {
                if (menuItem instanceof C0130p) {
                    ((C0130p) menuItem).ni7(true);
                } else if (menuItem instanceof ld6) {
                    ((ld6) menuItem).m358p(true);
                }
            }
            String str = this.f46687fu4;
            if (str != null) {
                menuItem.setActionView((View) m294n(str, f7l8.f395p, f7l8.this.f398k));
                z2 = true;
            }
            int i3 = this.f46694ni7;
            if (i3 > 0) {
                if (z2) {
                    Log.w(f7l8.f394n, "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i3);
                }
            }
            androidx.core.view.toq toqVar = this.f46699wvg;
            if (toqVar != null) {
                C0744z.x2(menuItem, toqVar);
            }
            C0744z.m3582h(menuItem, this.f412t);
            C0744z.ni7(menuItem, this.f46692mcp);
            C0744z.kja0(menuItem, this.f46693n7h, this.f46690kja0);
            C0744z.t8r(menuItem, this.f405h, this.f46683cdj);
            PorterDuff.Mode mode = this.f46682a9;
            if (mode != null) {
                C0744z.ki(menuItem, mode);
            }
            ColorStateList colorStateList = this.f46688jk;
            if (colorStateList != null) {
                C0744z.cdj(menuItem, colorStateList);
            }
        }

        private char zy(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        public void f7l8(AttributeSet attributeSet) {
            C0184b c0184bFti = C0184b.fti(f7l8.this.f46674zy, attributeSet, C7397k.qrj.xo);
            this.f411s = c0184bFti.fn3e(C7397k.qrj.cp, 0);
            this.f409p = (c0184bFti.kja0(C7397k.qrj.bmt3, this.f46702zy) & (-65536)) | (c0184bFti.kja0(C7397k.qrj.mq, this.f410q) & 65535);
            this.f46691ld6 = c0184bFti.fu4(C7397k.qrj.xnu);
            this.f46700x2 = c0184bFti.fu4(C7397k.qrj.wh);
            this.f46696qrj = c0184bFti.fn3e(C7397k.qrj.zaso, 0);
            this.f46693n7h = zy(c0184bFti.ni7(C7397k.qrj.vymi));
            this.f46690kja0 = c0184bFti.kja0(C7397k.qrj.b3fl, 4096);
            this.f405h = zy(c0184bFti.ni7(C7397k.qrj.jre));
            this.f46683cdj = c0184bFti.kja0(C7397k.qrj.wkrb, 4096);
            int i2 = C7397k.qrj.py7;
            if (c0184bFti.mcp(i2)) {
                this.f46689ki = c0184bFti.m547k(i2, false) ? 1 : 0;
            } else {
                this.f46689ki = this.f408n;
            }
            this.f46697t8r = c0184bFti.m547k(C7397k.qrj.wqp, false);
            this.f406i = c0184bFti.m547k(C7397k.qrj.c2, this.f404g);
            this.f46685fn3e = c0184bFti.m547k(C7397k.qrj.mkmm, this.f46684f7l8);
            this.f46701zurt = c0184bFti.kja0(C7397k.qrj.cyg, -1);
            this.f46695o1t = c0184bFti.ni7(C7397k.qrj.drpy);
            this.f46694ni7 = c0184bFti.fn3e(C7397k.qrj.je1q, 0);
            this.f46687fu4 = c0184bFti.ni7(C7397k.qrj.p6);
            String strNi7 = c0184bFti.ni7(C7397k.qrj.zxa9);
            this.f414z = strNi7;
            boolean z2 = strNi7 != null;
            if (z2 && this.f46694ni7 == 0 && this.f46687fu4 == null) {
                this.f46699wvg = (androidx.core.view.toq) m294n(strNi7, f7l8.f46672ld6, f7l8.this.f46673toq);
            } else {
                if (z2) {
                    Log.w(f7l8.f394n, "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.f46699wvg = null;
            }
            this.f412t = c0184bFti.fu4(C7397k.qrj.a7zh);
            this.f46692mcp = c0184bFti.fu4(C7397k.qrj.fupf);
            int i3 = C7397k.qrj.iw;
            if (c0184bFti.mcp(i3)) {
                this.f46682a9 = oc.m697n(c0184bFti.kja0(i3, -1), this.f46682a9);
            } else {
                this.f46682a9 = null;
            }
            int i4 = C7397k.qrj.ma8k;
            if (c0184bFti.mcp(i4)) {
                this.f46688jk = c0184bFti.m550q(i4);
            } else {
                this.f46688jk = null;
            }
            c0184bFti.d3();
            this.f413y = false;
        }

        /* JADX INFO: renamed from: g */
        public void m296g(AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = f7l8.this.f46674zy.obtainStyledAttributes(attributeSet, C7397k.qrj.jog);
            this.f46698toq = typedArrayObtainStyledAttributes.getResourceId(C7397k.qrj.rig, 0);
            this.f46702zy = typedArrayObtainStyledAttributes.getInt(C7397k.qrj.sm, 0);
            this.f410q = typedArrayObtainStyledAttributes.getInt(C7397k.qrj.jglj, 0);
            this.f408n = typedArrayObtainStyledAttributes.getInt(C7397k.qrj.ybb, 0);
            this.f404g = typedArrayObtainStyledAttributes.getBoolean(C7397k.qrj.zi4o, true);
            this.f46684f7l8 = typedArrayObtainStyledAttributes.getBoolean(C7397k.qrj.l0, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        /* JADX INFO: renamed from: k */
        public void m297k() {
            this.f413y = true;
            m295s(this.f407k.add(this.f46698toq, this.f411s, this.f409p, this.f46691ld6));
        }

        /* JADX INFO: renamed from: q */
        public boolean m298q() {
            return this.f413y;
        }

        public SubMenu toq() {
            this.f413y = true;
            SubMenu subMenuAddSubMenu = this.f407k.addSubMenu(this.f46698toq, this.f411s, this.f409p, this.f46691ld6);
            m295s(subMenuAddSubMenu.getItem());
            return subMenuAddSubMenu;
        }

        /* JADX INFO: renamed from: y */
        public void m299y() {
            this.f46698toq = 0;
            this.f46702zy = 0;
            this.f410q = 0;
            this.f408n = 0;
            this.f404g = true;
            this.f46684f7l8 = true;
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f395p = clsArr;
        f46672ld6 = clsArr;
    }

    public f7l8(Context context) {
        super(context);
        this.f46674zy = context;
        Object[] objArr = {context};
        this.f398k = objArr;
        this.f46673toq = objArr;
    }

    /* JADX INFO: renamed from: k */
    private Object m293k(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? m293k(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    private void zy(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        toq toqVar = new toq(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals(f393g)) {
                    throw new RuntimeException("Expecting menu, got " + name);
                }
                eventType = xmlPullParser.next();
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        String str = null;
        boolean z2 = false;
        boolean z3 = false;
        while (!z2) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != 2) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z3 && name2.equals(str)) {
                        str = null;
                        z3 = false;
                    } else if (name2.equals(f46671f7l8)) {
                        toqVar.m299y();
                    } else if (name2.equals(f397y)) {
                        if (!toqVar.m298q()) {
                            androidx.core.view.toq toqVar2 = toqVar.f46699wvg;
                            if (toqVar2 == null || !toqVar2.toq()) {
                                toqVar.m297k();
                            } else {
                                toqVar.toq();
                            }
                        }
                    } else if (name2.equals(f393g)) {
                        z2 = true;
                    }
                }
            } else if (!z3) {
                String name3 = xmlPullParser.getName();
                if (name3.equals(f46671f7l8)) {
                    toqVar.m296g(attributeSet);
                } else if (name3.equals(f397y)) {
                    toqVar.f7l8(attributeSet);
                } else if (name3.equals(f393g)) {
                    zy(xmlPullParser, attributeSet, toqVar.toq());
                } else {
                    str = name3;
                    z3 = true;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    @Override // android.view.MenuInflater
    public void inflate(@gvn7 int i2, Menu menu) {
        if (!(menu instanceof InterfaceMenuC6069k)) {
            super.inflate(i2, menu);
            return;
        }
        XmlResourceParser layout = null;
        try {
            try {
                try {
                    layout = this.f46674zy.getResources().getLayout(i2);
                    zy(layout, Xml.asAttributeSet(layout), menu);
                } catch (XmlPullParserException e2) {
                    throw new InflateException("Error inflating menu XML", e2);
                }
            } catch (IOException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } finally {
            if (layout != null) {
                layout.close();
            }
        }
    }

    Object toq() {
        if (this.f399q == null) {
            this.f399q = m293k(this.f46674zy);
        }
        return this.f399q;
    }
}
