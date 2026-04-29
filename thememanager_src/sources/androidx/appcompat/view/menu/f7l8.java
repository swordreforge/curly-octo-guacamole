package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.content.C0498q;
import androidx.core.view.ch;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p024h.InterfaceMenuC6069k;
import zy.lvui;
import zy.uv6;

/* JADX INFO: compiled from: MenuBuilder.java */
/* JADX INFO: loaded from: classes.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public class f7l8 implements InterfaceMenuC6069k {

    /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
    private static final String f46706d2ok = "MenuBuilder";

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    private static final String f46707dd = "android:menu:expandedactionview";

    /* JADX INFO: renamed from: lvui, reason: collision with root package name */
    private static final String f46708lvui = "android:menu:presenters";

    /* JADX INFO: renamed from: r */
    private static final String f454r = "android:menu:actionviewstates";

    /* JADX INFO: renamed from: x9kr, reason: collision with root package name */
    private static final int[] f46709x9kr = {1, 4, 5, 3, 2, 0};

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    private C0130p f46712d3;

    /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
    private boolean f46713eqxt;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    private ContextMenu.ContextMenuInfo f46716fu4;

    /* JADX INFO: renamed from: h */
    private InterfaceC0118k f455h;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private boolean f46721kja0;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private boolean f46723n7h;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    Drawable f46725o1t;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private final Resources f46727qrj;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    View f46729wvg;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private final Context f46730x2;

    /* JADX INFO: renamed from: z */
    CharSequence f458z;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private int f46724ni7 = 0;

    /* JADX INFO: renamed from: t */
    private boolean f457t = false;

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    private boolean f46722mcp = false;

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    private boolean f46718jk = false;

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    private boolean f46710a9 = false;

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    private boolean f46715fti = false;

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    private ArrayList<C0130p> f46719jp0y = new ArrayList<>();

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    private CopyOnWriteArrayList<WeakReference<n7h>> f46717gvn7 = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: oc, reason: collision with root package name */
    private boolean f46726oc = false;

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private ArrayList<C0130p> f46711cdj = new ArrayList<>();

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private ArrayList<C0130p> f46720ki = new ArrayList<>();

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private boolean f46728t8r = true;

    /* JADX INFO: renamed from: i */
    private ArrayList<C0130p> f456i = new ArrayList<>();

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private ArrayList<C0130p> f46714fn3e = new ArrayList<>();

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private boolean f46731zurt = true;

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.f7l8$k */
    /* JADX INFO: compiled from: MenuBuilder.java */
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public interface InterfaceC0118k {
        /* JADX INFO: renamed from: k */
        boolean mo117k(@lvui f7l8 f7l8Var, @lvui MenuItem menuItem);

        void toq(@lvui f7l8 f7l8Var);
    }

    /* JADX INFO: compiled from: MenuBuilder.java */
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public interface toq {
        /* JADX INFO: renamed from: q */
        boolean mo314q(C0130p c0130p);
    }

    public f7l8(Context context) {
        this.f46730x2 = context;
        this.f46727qrj = context.getResources();
        i1(true);
    }

    private static int a9(int i2) {
        int i3 = ((-65536) & i2) >> 16;
        if (i3 >= 0) {
            int[] iArr = f46709x9kr;
            if (i3 < iArr.length) {
                return (i2 & 65535) | (iArr[i3] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    private static int cdj(ArrayList<C0130p> arrayList, int i2) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).m374s() <= i2) {
                return size + 1;
            }
        }
        return 0;
    }

    private void i1(boolean z2) {
        this.f46721kja0 = z2 && this.f46727qrj.getConfiguration().keyboard != 1 && ch.f7l8(ViewConfiguration.get(this.f46730x2), this.f46730x2);
    }

    /* JADX INFO: renamed from: l */
    private void m319l(int i2, boolean z2) {
        if (i2 < 0 || i2 >= this.f46711cdj.size()) {
            return;
        }
        this.f46711cdj.remove(i2);
        if (z2) {
            mo336r(true);
        }
    }

    private void ld6(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(f46708lvui);
        if (sparseParcelableArray == null || this.f46717gvn7.isEmpty()) {
            return;
        }
        for (WeakReference<n7h> weakReference : this.f46717gvn7) {
            n7h n7hVar = weakReference.get();
            if (n7hVar == null) {
                this.f46717gvn7.remove(weakReference);
            } else {
                int id = n7hVar.getId();
                if (id > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(id)) != null) {
                    n7hVar.mo352k(parcelable);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o */
    private void m320o(int i2, CharSequence charSequence, int i3, Drawable drawable, View view) {
        Resources resourcesFti = fti();
        if (view != null) {
            this.f46729wvg = view;
            this.f458z = null;
            this.f46725o1t = null;
        } else {
            if (i2 > 0) {
                this.f458z = resourcesFti.getText(i2);
            } else if (charSequence != null) {
                this.f458z = charSequence;
            }
            if (i3 > 0) {
                this.f46725o1t = C0498q.m2259s(fu4(), i3);
            } else if (drawable != null) {
                this.f46725o1t = drawable;
            }
            this.f46729wvg = null;
        }
        mo336r(false);
    }

    /* JADX INFO: renamed from: p */
    private void m321p(boolean z2) {
        if (this.f46717gvn7.isEmpty()) {
            return;
        }
        m323a();
        for (WeakReference<n7h> weakReference : this.f46717gvn7) {
            n7h n7hVar = weakReference.get();
            if (n7hVar == null) {
                this.f46717gvn7.remove(weakReference);
            } else {
                n7hVar.mo355q(z2);
            }
        }
        a98o();
    }

    private boolean qrj(t8r t8rVar, n7h n7hVar) {
        if (this.f46717gvn7.isEmpty()) {
            return false;
        }
        boolean zMo354p = n7hVar != null ? n7hVar.mo354p(t8rVar) : false;
        for (WeakReference<n7h> weakReference : this.f46717gvn7) {
            n7h n7hVar2 = weakReference.get();
            if (n7hVar2 == null) {
                this.f46717gvn7.remove(weakReference);
            } else if (!zMo354p) {
                zMo354p = n7hVar2.mo354p(t8rVar);
            }
        }
        return zMo354p;
    }

    private void x2(Bundle bundle) {
        Parcelable parcelableZy;
        if (this.f46717gvn7.isEmpty()) {
            return;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        for (WeakReference<n7h> weakReference : this.f46717gvn7) {
            n7h n7hVar = weakReference.get();
            if (n7hVar == null) {
                this.f46717gvn7.remove(weakReference);
            } else {
                int id = n7hVar.getId();
                if (id > 0 && (parcelableZy = n7hVar.zy()) != null) {
                    sparseArray.put(id, parcelableZy);
                }
            }
        }
        bundle.putSparseParcelableArray(f46708lvui, sparseArray);
    }

    /* JADX INFO: renamed from: y */
    private C0130p m322y(int i2, int i3, int i4, int i5, CharSequence charSequence, int i6) {
        return new C0130p(this, i2, i3, i4, i5, charSequence, i6);
    }

    /* JADX INFO: renamed from: a */
    public void m323a() {
        if (this.f457t) {
            return;
        }
        this.f457t = true;
        this.f46722mcp = false;
        this.f46718jk = false;
    }

    public void a98o() {
        this.f457t = false;
        if (this.f46722mcp) {
            this.f46722mcp = false;
            mo336r(this.f46718jk);
        }
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return mo332k(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i2, int i3, int i4, ComponentName componentName, Intent[] intentArr, Intent intent, int i5, MenuItem[] menuItemArr) {
        int i6;
        PackageManager packageManager = this.f46730x2.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i5 & 1) == 0) {
            removeGroup(i2);
        }
        for (int i7 = 0; i7 < size; i7++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i7);
            int i8 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i8 < 0 ? intent : intentArr[i8]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i2, i3, i4, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i6 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i6] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* JADX INFO: renamed from: b */
    public void m324b(boolean z2) {
        this.f46713eqxt = z2;
    }

    public void bf2(boolean z2) {
        if (this.f46721kja0 == z2) {
            return;
        }
        i1(z2);
        mo336r(false);
    }

    /* JADX INFO: renamed from: c */
    public void m325c(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = getItem(i2);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt(f46707dd, item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((t8r) item.getSubMenu()).m325c(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(ni7(), sparseArray);
        }
    }

    @Override // android.view.Menu
    public void clear() {
        C0130p c0130p = this.f46712d3;
        if (c0130p != null) {
            f7l8(c0130p);
        }
        this.f46711cdj.clear();
        mo336r(true);
    }

    public void clearHeader() {
        this.f46725o1t = null;
        this.f458z = null;
        this.f46729wvg = null;
        mo336r(false);
    }

    @Override // android.view.Menu
    public void close() {
        m328g(true);
    }

    void d2ok(C0130p c0130p) {
        this.f46731zurt = true;
        mo336r(true);
    }

    public boolean d3() {
        return this.f46726oc;
    }

    public boolean dd(MenuItem menuItem, int i2) {
        return x9kr(menuItem, null, i2);
    }

    /* JADX INFO: renamed from: e */
    public f7l8 m326e(int i2) {
        this.f46724ni7 = i2;
        return this;
    }

    protected f7l8 ek5k(CharSequence charSequence) {
        m320o(0, charSequence, 0, null, null);
        return this;
    }

    public boolean eqxt() {
        return this.f46721kja0;
    }

    /* JADX INFO: renamed from: f */
    public void m327f(Bundle bundle) {
        ld6(bundle);
    }

    public boolean f7l8(C0130p c0130p) {
        boolean zLd6 = false;
        if (!this.f46717gvn7.isEmpty() && this.f46712d3 == c0130p) {
            m323a();
            for (WeakReference<n7h> weakReference : this.f46717gvn7) {
                n7h n7hVar = weakReference.get();
                if (n7hVar != null) {
                    zLd6 = n7hVar.ld6(this, c0130p);
                    if (zLd6) {
                        break;
                    }
                } else {
                    this.f46717gvn7.remove(weakReference);
                }
            }
            a98o();
            if (zLd6) {
                this.f46712d3 = null;
            }
        }
        return zLd6;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i2) {
        MenuItem menuItemFindItem;
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            C0130p c0130p = this.f46711cdj.get(i3);
            if (c0130p.getItemId() == i2) {
                return c0130p;
            }
            if (c0130p.hasSubMenu() && (menuItemFindItem = c0130p.getSubMenu().findItem(i2)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public void fn3e() {
        ArrayList<C0130p> arrayListGvn7 = gvn7();
        if (this.f46731zurt) {
            boolean zMo353n = false;
            for (WeakReference<n7h> weakReference : this.f46717gvn7) {
                n7h n7hVar = weakReference.get();
                if (n7hVar == null) {
                    this.f46717gvn7.remove(weakReference);
                } else {
                    zMo353n |= n7hVar.mo353n();
                }
            }
            if (zMo353n) {
                this.f456i.clear();
                this.f46714fn3e.clear();
                int size = arrayListGvn7.size();
                for (int i2 = 0; i2 < size; i2++) {
                    C0130p c0130p = arrayListGvn7.get(i2);
                    if (c0130p.kja0()) {
                        this.f456i.add(c0130p);
                    } else {
                        this.f46714fn3e.add(c0130p);
                    }
                }
            } else {
                this.f456i.clear();
                this.f46714fn3e.clear();
                this.f46714fn3e.addAll(gvn7());
            }
            this.f46731zurt = false;
        }
    }

    Resources fti() {
        return this.f46727qrj;
    }

    public Context fu4() {
        return this.f46730x2;
    }

    /* JADX INFO: renamed from: g */
    public final void m328g(boolean z2) {
        if (this.f46715fti) {
            return;
        }
        this.f46715fti = true;
        for (WeakReference<n7h> weakReference : this.f46717gvn7) {
            n7h n7hVar = weakReference.get();
            if (n7hVar == null) {
                this.f46717gvn7.remove(weakReference);
            } else {
                n7hVar.f7l8(this, z2);
            }
        }
        this.f46715fti = false;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i2) {
        return this.f46711cdj.get(i2);
    }

    @lvui
    public ArrayList<C0130p> gvn7() {
        if (!this.f46728t8r) {
            return this.f46720ki;
        }
        this.f46720ki.clear();
        int size = this.f46711cdj.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0130p c0130p = this.f46711cdj.get(i2);
            if (c0130p.isVisible()) {
                this.f46720ki.add(c0130p);
            }
        }
        this.f46728t8r = false;
        this.f46731zurt = true;
        return this.f46720ki;
    }

    /* JADX INFO: renamed from: h */
    public int m329h(int i2, int i3) {
        int size = size();
        if (i3 < 0) {
            i3 = 0;
        }
        while (i3 < size) {
            if (this.f46711cdj.get(i3).getGroupId() == i2) {
                return i3;
            }
            i3++;
        }
        return -1;
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.f46713eqxt) {
            return true;
        }
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f46711cdj.get(i2).isVisible()) {
                return true;
            }
        }
        return false;
    }

    protected f7l8 hb(int i2) {
        m320o(0, null, i2, null, null);
        return this;
    }

    public void hyr(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(ni7());
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = getItem(i2);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((t8r) item.getSubMenu()).hyr(bundle);
            }
        }
        int i3 = bundle.getInt(f46707dd);
        if (i3 <= 0 || (menuItemFindItem = findItem(i3)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    /* JADX INFO: renamed from: i */
    void m330i(List<C0130p> list, int i2, KeyEvent keyEvent) {
        boolean zOc = oc();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i2 == 67) {
            int size = this.f46711cdj.size();
            for (int i3 = 0; i3 < size; i3++) {
                C0130p c0130p = this.f46711cdj.get(i3);
                if (c0130p.hasSubMenu()) {
                    ((f7l8) c0130p.getSubMenu()).m330i(list, i2, keyEvent);
                }
                char alphabeticShortcut = zOc ? c0130p.getAlphabeticShortcut() : c0130p.getNumericShortcut();
                if (((modifiers & InterfaceMenuC6069k.f35068n) == ((zOc ? c0130p.getAlphabeticModifiers() : c0130p.getNumericModifiers()) & InterfaceMenuC6069k.f35068n)) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (zOc && alphabeticShortcut == '\b' && i2 == 67)) && c0130p.isEnabled()) {
                        list.add(c0130p);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i2, KeyEvent keyEvent) {
        return t8r(i2, keyEvent) != null;
    }

    /* JADX INFO: renamed from: j */
    protected f7l8 m331j(Drawable drawable) {
        m320o(0, null, 0, drawable, null);
        return this;
    }

    boolean jk() {
        return this.f46710a9;
    }

    public f7l8 jp0y() {
        return this;
    }

    /* JADX INFO: renamed from: k */
    protected MenuItem mo332k(int i2, int i3, int i4, CharSequence charSequence) {
        int iA9 = a9(i4);
        C0130p c0130pM322y = m322y(i2, i3, i4, iA9, charSequence, this.f46724ni7);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f46716fu4;
        if (contextMenuInfo != null) {
            c0130pM322y.m377z(contextMenuInfo);
        }
        ArrayList<C0130p> arrayList = this.f46711cdj;
        arrayList.add(cdj(arrayList, iA9), c0130pM322y);
        mo336r(true);
        return c0130pM322y;
    }

    public int ki(int i2) {
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            if (this.f46711cdj.get(i3).getItemId() == i2) {
                return i3;
            }
        }
        return -1;
    }

    public int kja0(int i2) {
        return m329h(i2, 0);
    }

    public void lrht(Bundle bundle) {
        x2(bundle);
    }

    void lvui(C0130p c0130p) {
        this.f46728t8r = true;
        mo336r(true);
    }

    /* JADX INFO: renamed from: m */
    protected f7l8 m333m(int i2) {
        m320o(i2, null, 0, null, null);
        return this;
    }

    public ArrayList<C0130p> mcp() {
        fn3e();
        return this.f46714fn3e;
    }

    /* JADX INFO: renamed from: n */
    public void m334n() {
        this.f457t = true;
        clear();
        clearHeader();
        this.f46717gvn7.clear();
        this.f457t = false;
        this.f46722mcp = false;
        this.f46718jk = false;
        mo336r(true);
    }

    public void n5r1(n7h n7hVar) {
        for (WeakReference<n7h> weakReference : this.f46717gvn7) {
            n7h n7hVar2 = weakReference.get();
            if (n7hVar2 == null || n7hVar2 == n7hVar) {
                this.f46717gvn7.remove(weakReference);
            }
        }
    }

    public boolean n7h(C0130p c0130p) {
        boolean zMo367y = false;
        if (this.f46717gvn7.isEmpty()) {
            return false;
        }
        m323a();
        for (WeakReference<n7h> weakReference : this.f46717gvn7) {
            n7h n7hVar = weakReference.get();
            if (n7hVar != null) {
                zMo367y = n7hVar.mo367y(this, c0130p);
                if (zMo367y) {
                    break;
                }
            } else {
                this.f46717gvn7.remove(weakReference);
            }
        }
        a98o();
        if (zMo367y) {
            this.f46712d3 = c0130p;
        }
        return zMo367y;
    }

    public void ncyb(int i2) {
        m319l(i2, true);
    }

    protected String ni7() {
        return f454r;
    }

    void nn86(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f46711cdj.size();
        m323a();
        for (int i2 = 0; i2 < size; i2++) {
            C0130p c0130p = this.f46711cdj.get(i2);
            if (c0130p.getGroupId() == groupId && c0130p.m370h() && c0130p.isCheckable()) {
                c0130p.zurt(c0130p == menuItem);
            }
        }
        a98o();
    }

    public Drawable o1t() {
        return this.f46725o1t;
    }

    boolean oc() {
        return this.f46723n7h;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i2, int i3) {
        return dd(findItem(i2), i3);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i2, KeyEvent keyEvent, int i3) {
        C0130p c0130pT8r = t8r(i2, keyEvent);
        boolean zDd = c0130pT8r != null ? dd(c0130pT8r, i3) : false;
        if ((i3 & 2) != 0) {
            m328g(true);
        }
        return zDd;
    }

    /* JADX INFO: renamed from: q */
    public void m335q() {
        InterfaceC0118k interfaceC0118k = this.f455h;
        if (interfaceC0118k != null) {
            interfaceC0118k.toq(this);
        }
    }

    /* JADX INFO: renamed from: r */
    public void mo336r(boolean z2) {
        if (this.f457t) {
            this.f46722mcp = true;
            if (z2) {
                this.f46718jk = true;
                return;
            }
            return;
        }
        if (z2) {
            this.f46728t8r = true;
            this.f46731zurt = true;
        }
        m321p(z2);
    }

    @Override // android.view.Menu
    public void removeGroup(int i2) {
        int iKja0 = kja0(i2);
        if (iKja0 >= 0) {
            int size = this.f46711cdj.size() - iKja0;
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (i3 >= size || this.f46711cdj.get(iKja0).getGroupId() != i2) {
                    break;
                }
                m319l(iKja0, false);
                i3 = i4;
            }
            mo336r(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i2) {
        m319l(ki(i2), true);
    }

    /* JADX INFO: renamed from: s */
    boolean mo337s(@lvui f7l8 f7l8Var, @lvui MenuItem menuItem) {
        InterfaceC0118k interfaceC0118k = this.f455h;
        return interfaceC0118k != null && interfaceC0118k.mo117k(f7l8Var, menuItem);
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i2, boolean z2, boolean z3) {
        int size = this.f46711cdj.size();
        for (int i3 = 0; i3 < size; i3++) {
            C0130p c0130p = this.f46711cdj.get(i3);
            if (c0130p.getGroupId() == i2) {
                c0130p.ni7(z3);
                c0130p.setCheckable(z2);
            }
        }
    }

    @Override // p024h.InterfaceMenuC6069k, android.view.Menu
    public void setGroupDividerEnabled(boolean z2) {
        this.f46726oc = z2;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i2, boolean z2) {
        int size = this.f46711cdj.size();
        for (int i3 = 0; i3 < size; i3++) {
            C0130p c0130p = this.f46711cdj.get(i3);
            if (c0130p.getGroupId() == i2) {
                c0130p.setEnabled(z2);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i2, boolean z2) {
        int size = this.f46711cdj.size();
        boolean z3 = false;
        for (int i3 = 0; i3 < size; i3++) {
            C0130p c0130p = this.f46711cdj.get(i3);
            if (c0130p.getGroupId() == i2 && c0130p.m375t(z2)) {
                z3 = true;
            }
        }
        if (z3) {
            mo336r(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z2) {
        this.f46723n7h = z2;
        mo336r(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f46711cdj.size();
    }

    /* JADX INFO: renamed from: t */
    public View m338t() {
        return this.f46729wvg;
    }

    C0130p t8r(int i2, KeyEvent keyEvent) {
        ArrayList<C0130p> arrayList = this.f46719jp0y;
        arrayList.clear();
        m330i(arrayList, i2, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean zOc = oc();
        for (int i3 = 0; i3 < size; i3++) {
            C0130p c0130p = arrayList.get(i3);
            char alphabeticShortcut = zOc ? c0130p.getAlphabeticShortcut() : c0130p.getNumericShortcut();
            char[] cArr = keyData.meta;
            if ((alphabeticShortcut == cArr[0] && (metaState & 2) == 0) || ((alphabeticShortcut == cArr[2] && (metaState & 2) != 0) || (zOc && alphabeticShortcut == '\b' && i2 == 67))) {
                return c0130p;
            }
        }
        return null;
    }

    public void toq(n7h n7hVar) {
        zy(n7hVar, this.f46730x2);
    }

    public void uv6(InterfaceC0118k interfaceC0118k) {
        this.f455h = interfaceC0118k;
    }

    public void vyq(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f46716fu4 = contextMenuInfo;
    }

    public CharSequence wvg() {
        return this.f458z;
    }

    public boolean x9kr(MenuItem menuItem, n7h n7hVar, int i2) {
        C0130p c0130p = (C0130p) menuItem;
        if (c0130p == null || !c0130p.isEnabled()) {
            return false;
        }
        boolean zN7h = c0130p.n7h();
        androidx.core.view.toq toqVarMo345k = c0130p.mo345k();
        boolean z2 = toqVarMo345k != null && toqVarMo345k.toq();
        if (c0130p.qrj()) {
            zN7h |= c0130p.expandActionView();
            if (zN7h) {
                m328g(true);
            }
        } else if (c0130p.hasSubMenu() || z2) {
            if ((i2 & 4) == 0) {
                m328g(false);
            }
            if (!c0130p.hasSubMenu()) {
                c0130p.wvg(new t8r(fu4(), this, c0130p));
            }
            t8r t8rVar = (t8r) c0130p.getSubMenu();
            if (z2) {
                toqVarMo345k.f7l8(t8rVar);
            }
            zN7h |= qrj(t8rVar, n7hVar);
            if (!zN7h) {
                m328g(true);
            }
        } else if ((i2 & 1) == 0) {
            m328g(true);
        }
        return zN7h;
    }

    public void y9n(boolean z2) {
        this.f46710a9 = z2;
    }

    protected f7l8 yz(View view) {
        m320o(0, null, 0, null, view);
        return this;
    }

    /* JADX INFO: renamed from: z */
    public C0130p m339z() {
        return this.f46712d3;
    }

    public ArrayList<C0130p> zurt() {
        fn3e();
        return this.f456i;
    }

    public void zy(n7h n7hVar, Context context) {
        this.f46717gvn7.add(new WeakReference<>(n7hVar));
        n7hVar.x2(context, this);
        this.f46731zurt = true;
    }

    @Override // android.view.Menu
    public MenuItem add(int i2) {
        return mo332k(0, 0, 0, this.f46727qrj.getString(i2));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i2) {
        return addSubMenu(0, 0, 0, this.f46727qrj.getString(i2));
    }

    @Override // android.view.Menu
    public MenuItem add(int i2, int i3, int i4, CharSequence charSequence) {
        return mo332k(i2, i3, i4, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i2, int i3, int i4, CharSequence charSequence) {
        C0130p c0130p = (C0130p) mo332k(i2, i3, i4, charSequence);
        t8r t8rVar = new t8r(this.f46730x2, this, c0130p);
        c0130p.wvg(t8rVar);
        return t8rVar;
    }

    @Override // android.view.Menu
    public MenuItem add(int i2, int i3, int i4, int i5) {
        return mo332k(i2, i3, i4, this.f46727qrj.getString(i5));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i2, int i3, int i4, int i5) {
        return addSubMenu(i2, i3, i4, this.f46727qrj.getString(i5));
    }
}
