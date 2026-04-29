package miuix.appcompat.internal.view.menu;

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
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import com.android.internal.view.menu.MenuBuilder;
import gb.toq;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: MenuBuilder.java */
/* JADX INFO: loaded from: classes3.dex */
public class f7l8 extends MenuBuilder {

    /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
    public static final int f87009d2ok = 65535;

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    private static final String f87010dd = "android:menu:expandedactionview";

    /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
    public static final int f87011eqxt = 16;

    /* JADX INFO: renamed from: lvui, reason: collision with root package name */
    private static final String f87012lvui = "android:menu:presenters";

    /* JADX INFO: renamed from: oc, reason: collision with root package name */
    public static final int f87013oc = -65536;

    /* JADX INFO: renamed from: r */
    private static final String f39509r = "android:menu:actionviewstates";

    /* JADX INFO: renamed from: x9kr, reason: collision with root package name */
    private static final int[] f87014x9kr = {1, 4, 5, 3, 2, 0};

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    private ContextMenu.ContextMenuInfo f87020fu4;

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    private MenuItemC7036s f87021gvn7;

    /* JADX INFO: renamed from: h */
    private toq f39510h;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private boolean f87025kja0;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private boolean f87027n7h;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    Drawable f87029o1t;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private final Resources f87030qrj;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    View f87032wvg;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private final Context f87033x2;

    /* JADX INFO: renamed from: z */
    CharSequence f39513z;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private int f87028ni7 = 0;

    /* JADX INFO: renamed from: t */
    private boolean f39512t = false;

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    private boolean f87026mcp = false;

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    private boolean f87022jk = false;

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    private boolean f87015a9 = false;

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    private ArrayList<MenuItemC7036s> f87019fti = new ArrayList<>();

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    private CopyOnWriteArrayList<WeakReference<ld6>> f87023jp0y = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    private final Comparator<MenuItemC7036s> f87017d3 = new C7029k();

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private ArrayList<MenuItemC7036s> f87016cdj = new ArrayList<>();

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private ArrayList<MenuItemC7036s> f87024ki = new ArrayList<>();

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private boolean f87031t8r = true;

    /* JADX INFO: renamed from: i */
    private ArrayList<MenuItemC7036s> f39511i = new ArrayList<>();

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private ArrayList<MenuItemC7036s> f87018fn3e = new ArrayList<>();

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private boolean f87034zurt = true;

    /* JADX INFO: renamed from: miuix.appcompat.internal.view.menu.f7l8$k */
    /* JADX INFO: compiled from: MenuBuilder.java */
    class C7029k implements Comparator<MenuItemC7036s> {
        C7029k() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public int compare(MenuItemC7036s menuItemC7036s, MenuItemC7036s menuItemC7036s2) {
            return menuItemC7036s.toq() != menuItemC7036s2.toq() ? menuItemC7036s.toq() ? -1 : 1 : menuItemC7036s.m25371i() != menuItemC7036s2.m25371i() ? menuItemC7036s.m25371i() ? -1 : 1 : menuItemC7036s.getOrder() - menuItemC7036s2.getOrder();
        }
    }

    /* JADX INFO: compiled from: MenuBuilder.java */
    public interface toq {
        /* JADX INFO: renamed from: h */
        void mo25069h(f7l8 f7l8Var);

        /* JADX INFO: renamed from: s */
        boolean mo24868s(f7l8 f7l8Var, MenuItem menuItem);
    }

    /* JADX INFO: compiled from: MenuBuilder.java */
    public interface zy {
        boolean toq(MenuItemC7036s menuItemC7036s, int i2);
    }

    public f7l8(Context context) {
        this.f87033x2 = context;
        this.f87030qrj = context.getResources();
        i1(true);
    }

    private static int a9(int i2) {
        int i3 = ((-65536) & i2) >> 16;
        if (i3 >= 0) {
            int[] iArr = f87014x9kr;
            if (i3 < iArr.length) {
                return (i2 & 65535) | (iArr[i3] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    /* JADX INFO: renamed from: h */
    private static int m25331h(ArrayList<MenuItemC7036s> arrayList, int i2) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).m25373s() <= i2) {
                return size + 1;
            }
        }
        return 0;
    }

    private void i1(boolean z2) {
        this.f87025kja0 = z2 && this.f87030qrj.getConfiguration().keyboard != 1 && this.f87030qrj.getBoolean(toq.C6053n.f34876q);
    }

    private void ld6(Bundle bundle) {
        Parcelable parcelableZy;
        if (this.f87023jp0y.isEmpty()) {
            return;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        for (WeakReference<ld6> weakReference : this.f87023jp0y) {
            ld6 ld6Var = weakReference.get();
            if (ld6Var == null) {
                this.f87023jp0y.remove(weakReference);
            } else {
                int id = ld6Var.getId();
                if (id > 0 && (parcelableZy = ld6Var.zy()) != null) {
                    sparseArray.put(id, parcelableZy);
                }
            }
        }
        bundle.putSparseParcelableArray(f87012lvui, sparseArray);
    }

    private void ncyb(int i2, boolean z2) {
        if (i2 < 0 || i2 >= this.f87016cdj.size()) {
            return;
        }
        this.f87016cdj.remove(i2);
        if (z2) {
            lvui(true);
        }
    }

    /* JADX INFO: renamed from: o */
    private void m25332o(int i2, CharSequence charSequence, int i3, Drawable drawable, View view) {
        Resources resourcesFti = fti();
        if (view != null) {
            this.f87032wvg = view;
            this.f39513z = null;
            this.f87029o1t = null;
        } else {
            if (i2 > 0) {
                this.f39513z = resourcesFti.getText(i2);
            } else if (charSequence != null) {
                this.f39513z = charSequence;
            }
            if (i3 > 0) {
                this.f87029o1t = resourcesFti.getDrawable(i3);
            } else if (drawable != null) {
                this.f87029o1t = drawable;
            }
            this.f87032wvg = null;
        }
        lvui(false);
    }

    /* JADX INFO: renamed from: p */
    private void m25333p(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(f87012lvui);
        if (sparseParcelableArray == null || this.f87023jp0y.isEmpty()) {
            return;
        }
        for (WeakReference<ld6> weakReference : this.f87023jp0y) {
            ld6 ld6Var = weakReference.get();
            if (ld6Var == null) {
                this.f87023jp0y.remove(weakReference);
            } else {
                int id = ld6Var.getId();
                if (id > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(id)) != null) {
                    ld6Var.mo25175k(parcelable);
                }
            }
        }
    }

    /* JADX INFO: renamed from: s */
    private void m25334s(boolean z2) {
        if (this.f87023jp0y.isEmpty()) {
            return;
        }
        m25335a();
        for (WeakReference<ld6> weakReference : this.f87023jp0y) {
            ld6 ld6Var = weakReference.get();
            if (ld6Var == null) {
                this.f87023jp0y.remove(weakReference);
            } else {
                ld6Var.mo25178q(z2);
            }
        }
        a98o();
    }

    private boolean x2(qrj qrjVar, ld6 ld6Var) {
        if (this.f87023jp0y.isEmpty()) {
            return false;
        }
        boolean zN7h = ld6Var != null ? ld6Var.n7h(qrjVar) : false;
        for (WeakReference<ld6> weakReference : this.f87023jp0y) {
            ld6 ld6Var2 = weakReference.get();
            if (ld6Var2 == null) {
                this.f87023jp0y.remove(weakReference);
            } else if (!zN7h) {
                zN7h = ld6Var2.n7h(qrjVar);
            }
        }
        return zN7h;
    }

    /* JADX INFO: renamed from: a */
    public void m25335a() {
        if (this.f39512t) {
            return;
        }
        this.f39512t = true;
        this.f87026mcp = false;
    }

    public void a98o() {
        this.f39512t = false;
        if (this.f87026mcp) {
            this.f87026mcp = false;
            lvui(true);
        }
    }

    public MenuItem add(CharSequence charSequence) {
        return toq(0, 0, 0, charSequence);
    }

    public int addIntentOptions(int i2, int i3, int i4, ComponentName componentName, Intent[] intentArr, Intent intent, int i5, MenuItem[] menuItemArr) {
        int i6;
        PackageManager packageManager = this.f87033x2.getPackageManager();
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

    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* JADX INFO: renamed from: b */
    public void m25336b(boolean z2) {
        this.f39512t = z2;
    }

    public void bf2(boolean z2) {
        if (this.f87025kja0 == z2) {
            return;
        }
        i1(z2);
        lvui(false);
    }

    /* JADX INFO: renamed from: c */
    public void m25337c(Bundle bundle) {
        ld6(bundle);
    }

    public int cdj(int i2) {
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            if (this.f87016cdj.get(i3).getItemId() == i2) {
                return i3;
            }
        }
        return -1;
    }

    public void clear() {
        MenuItemC7036s menuItemC7036s = this.f87021gvn7;
        if (menuItemC7036s != null) {
            f7l8(menuItemC7036s);
        }
        this.f87016cdj.clear();
        lvui(true);
    }

    public void clearHeader() {
        this.f87029o1t = null;
        this.f39513z = null;
        this.f87032wvg = null;
        lvui(false);
    }

    public void close() {
        m25340g(true);
    }

    void d2ok(MenuItemC7036s menuItemC7036s) {
        this.f87031t8r = true;
        lvui(true);
    }

    boolean d3() {
        return this.f87027n7h;
    }

    public boolean dd(MenuItem menuItem, ld6 ld6Var, int i2) {
        MenuItemC7036s menuItemC7036s = (MenuItemC7036s) menuItem;
        if (menuItemC7036s == null || !menuItemC7036s.isEnabled()) {
            return false;
        }
        boolean zCdj = menuItemC7036s.cdj();
        ActionProvider actionProviderQrj = menuItemC7036s.qrj();
        boolean z2 = actionProviderQrj != null && actionProviderQrj.hasSubMenu();
        if (menuItemC7036s.m25370h()) {
            zCdj |= menuItemC7036s.expandActionView();
            if (zCdj) {
                m25340g(true);
            }
        } else if (menuItemC7036s.hasSubMenu() || z2) {
            if ((i2 & 4) == 0) {
                m25340g(false);
            }
            if (!menuItemC7036s.hasSubMenu()) {
                menuItemC7036s.jk(new qrj(fu4(), this, menuItemC7036s));
            }
            qrj qrjVar = (qrj) menuItemC7036s.getSubMenu();
            if (z2) {
                actionProviderQrj.onPrepareSubMenu(qrjVar);
            }
            zCdj |= x2(qrjVar, ld6Var);
            if (!zCdj) {
                m25340g(true);
            }
        } else if ((i2 & 1) == 0) {
            m25340g(true);
        }
        return zCdj;
    }

    /* JADX INFO: renamed from: e */
    void m25338e(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        Iterator<MenuItemC7036s> it = this.f87016cdj.iterator();
        while (it.hasNext()) {
            MenuItemC7036s next = it.next();
            if (next.getGroupId() == groupId && next.t8r() && next.isCheckable()) {
                next.m25376z(next == menuItem);
            }
        }
    }

    protected f7l8 ek5k(CharSequence charSequence) {
        m25332o(0, charSequence, 0, null, null);
        return this;
    }

    void eqxt(MenuItemC7036s menuItemC7036s) {
        this.f87034zurt = true;
        lvui(true);
    }

    /* JADX INFO: renamed from: f */
    public void m25339f(Bundle bundle) {
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
                    bundle.putInt(f87010dd, item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((qrj) item.getSubMenu()).m25339f(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(zurt(), sparseArray);
        }
    }

    public boolean f7l8(MenuItemC7036s menuItemC7036s) {
        boolean zX2 = false;
        if (!this.f87023jp0y.isEmpty() && this.f87021gvn7 == menuItemC7036s) {
            m25335a();
            for (WeakReference<ld6> weakReference : this.f87023jp0y) {
                ld6 ld6Var = weakReference.get();
                if (ld6Var != null) {
                    zX2 = ld6Var.x2(this, menuItemC7036s);
                    if (zX2) {
                        break;
                    }
                } else {
                    this.f87023jp0y.remove(weakReference);
                }
            }
            a98o();
            if (zX2) {
                this.f87021gvn7 = null;
            }
        }
        return zX2;
    }

    public MenuItem findItem(int i2) {
        MenuItem menuItemFindItem;
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            MenuItemC7036s menuItemC7036s = this.f87016cdj.get(i3);
            if (menuItemC7036s.getItemId() == i2) {
                return menuItemC7036s;
            }
            if (menuItemC7036s.hasSubMenu() && (menuItemFindItem = menuItemC7036s.getSubMenu().findItem(i2)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public ArrayList<MenuItemC7036s> fn3e() {
        m25341i();
        return this.f39511i;
    }

    Resources fti() {
        return this.f87030qrj;
    }

    public Context fu4() {
        return this.f87033x2;
    }

    /* JADX INFO: renamed from: g */
    final void m25340g(boolean z2) {
        if (this.f87015a9) {
            return;
        }
        this.f87015a9 = true;
        for (WeakReference<ld6> weakReference : this.f87023jp0y) {
            ld6 ld6Var = weakReference.get();
            if (ld6Var == null) {
                this.f87023jp0y.remove(weakReference);
            } else {
                ld6Var.f7l8(this, z2);
            }
        }
        this.f87015a9 = false;
    }

    public MenuItem getItem(int i2) {
        return this.f87016cdj.get(i2);
    }

    public ArrayList<MenuItemC7036s> gvn7() {
        if (!this.f87031t8r) {
            return this.f87024ki;
        }
        this.f87024ki.clear();
        for (MenuItemC7036s menuItemC7036s : this.f87016cdj) {
            if (menuItemC7036s.isVisible()) {
                this.f87024ki.add(menuItemC7036s);
            }
        }
        Collections.sort(this.f87024ki, this.f87017d3);
        this.f87031t8r = false;
        this.f87034zurt = true;
        return this.f87024ki;
    }

    public boolean hasVisibleItems() {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f87016cdj.get(i2).isVisible()) {
                return true;
            }
        }
        return false;
    }

    protected f7l8 hb(int i2) {
        m25332o(0, null, i2, null, null);
        return this;
    }

    public void hyr(Bundle bundle) {
        m25333p(bundle);
    }

    /* JADX INFO: renamed from: i */
    public void m25341i() {
        if (this.f87034zurt) {
            boolean zMo25176n = false;
            for (WeakReference<ld6> weakReference : this.f87023jp0y) {
                ld6 ld6Var = weakReference.get();
                if (ld6Var == null) {
                    this.f87023jp0y.remove(weakReference);
                } else {
                    zMo25176n |= ld6Var.mo25176n();
                }
            }
            this.f39511i.clear();
            this.f87018fn3e.clear();
            if (zMo25176n) {
                for (MenuItemC7036s menuItemC7036s : gvn7()) {
                    if (menuItemC7036s.ki()) {
                        this.f39511i.add(menuItemC7036s);
                    } else {
                        this.f87018fn3e.add(menuItemC7036s);
                    }
                }
            } else {
                this.f87018fn3e.addAll(gvn7());
            }
            this.f87034zurt = false;
        }
    }

    public boolean isShortcutKey(int i2, KeyEvent keyEvent) {
        return ki(i2, keyEvent) != null;
    }

    /* JADX INFO: renamed from: j */
    protected f7l8 m25342j(Drawable drawable) {
        m25332o(0, null, 0, drawable, null);
        return this;
    }

    boolean jk() {
        return this.f87022jk;
    }

    public f7l8 jp0y() {
        return this;
    }

    /* JADX INFO: renamed from: k */
    public MenuItem m25343k(MenuItemC7036s menuItemC7036s) {
        int iA9 = a9(menuItemC7036s.getOrder());
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f87020fu4;
        if (contextMenuInfo != null) {
            menuItemC7036s.mcp(contextMenuInfo);
        }
        ArrayList<MenuItemC7036s> arrayList = this.f87016cdj;
        arrayList.add(m25331h(arrayList, iA9), menuItemC7036s);
        lvui(true);
        return menuItemC7036s;
    }

    MenuItemC7036s ki(int i2, KeyEvent keyEvent) {
        ArrayList<MenuItemC7036s> arrayList = this.f87019fti;
        arrayList.clear();
        t8r(arrayList, i2, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        if (arrayList.size() == 1) {
            return arrayList.get(0);
        }
        boolean zD3 = d3();
        for (MenuItemC7036s menuItemC7036s : arrayList) {
            char alphabeticShortcut = zD3 ? menuItemC7036s.getAlphabeticShortcut() : menuItemC7036s.getNumericShortcut();
            char[] cArr = keyData.meta;
            if ((alphabeticShortcut == cArr[0] && (metaState & 2) == 0) || ((alphabeticShortcut == cArr[2] && (metaState & 2) != 0) || (zD3 && alphabeticShortcut == '\b' && i2 == 67))) {
                return menuItemC7036s;
            }
        }
        return null;
    }

    public int kja0(int i2, int i3) {
        int size = size();
        if (i3 < 0) {
            i3 = 0;
        }
        while (i3 < size) {
            if (this.f87016cdj.get(i3).getGroupId() == i2) {
                return i3;
            }
            i3++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: l */
    public void m25344l(ld6 ld6Var) {
        for (WeakReference<ld6> weakReference : this.f87023jp0y) {
            ld6 ld6Var2 = weakReference.get();
            if (ld6Var2 == null || ld6Var2 == ld6Var) {
                this.f87023jp0y.remove(weakReference);
            }
        }
    }

    public void lrht(toq toqVar) {
        this.f39510h = toqVar;
    }

    protected void lvui(boolean z2) {
        if (this.f39512t) {
            this.f87026mcp = true;
            return;
        }
        if (z2) {
            this.f87031t8r = true;
            this.f87034zurt = true;
        }
        m25334s(z2);
    }

    /* JADX INFO: renamed from: m */
    protected f7l8 m25345m(int i2) {
        m25332o(i2, null, 0, null, null);
        return this;
    }

    public ArrayList<MenuItemC7036s> mcp() {
        m25341i();
        return this.f87018fn3e;
    }

    /* JADX INFO: renamed from: n */
    public void m25346n() {
        this.f39512t = true;
        clear();
        clearHeader();
        this.f39512t = false;
        this.f87026mcp = false;
        lvui(true);
    }

    public void n5r1(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(zurt());
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = getItem(i2);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((qrj) item.getSubMenu()).n5r1(bundle);
            }
        }
        int i3 = bundle.getInt(f87010dd);
        if (i3 <= 0 || (menuItemFindItem = findItem(i3)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    public int n7h(int i2) {
        return kja0(i2, 0);
    }

    public toq ni7() {
        return this.f39510h;
    }

    public void nn86(boolean z2) {
        this.f87022jk = z2;
    }

    public Drawable o1t() {
        return this.f87029o1t;
    }

    public boolean oc() {
        return this.f87025kja0;
    }

    public boolean performIdentifierAction(int i2, int i3) {
        return m25348r(findItem(i2), i3);
    }

    public boolean performShortcut(int i2, KeyEvent keyEvent, int i3) {
        MenuItemC7036s menuItemC7036sKi = ki(i2, keyEvent);
        boolean zM25348r = menuItemC7036sKi != null ? m25348r(menuItemC7036sKi, i3) : false;
        if ((i3 & 2) != 0) {
            m25340g(true);
        }
        return zM25348r;
    }

    /* JADX INFO: renamed from: q */
    public void m25347q() {
        toq toqVar = this.f39510h;
        if (toqVar != null) {
            toqVar.mo25069h(this);
        }
    }

    public boolean qrj(MenuItemC7036s menuItemC7036s) {
        boolean zMo25177p = false;
        if (this.f87023jp0y.isEmpty()) {
            return false;
        }
        m25335a();
        for (WeakReference<ld6> weakReference : this.f87023jp0y) {
            ld6 ld6Var = weakReference.get();
            if (ld6Var != null) {
                zMo25177p = ld6Var.mo25177p(this, menuItemC7036s);
                if (zMo25177p) {
                    break;
                }
            } else {
                this.f87023jp0y.remove(weakReference);
            }
        }
        a98o();
        if (zMo25177p) {
            this.f87021gvn7 = menuItemC7036s;
        }
        return zMo25177p;
    }

    /* JADX INFO: renamed from: r */
    public boolean m25348r(MenuItem menuItem, int i2) {
        return dd(menuItem, null, i2);
    }

    public void removeGroup(int i2) {
        int iN7h = n7h(i2);
        if (iN7h >= 0) {
            int size = this.f87016cdj.size() - iN7h;
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (i3 >= size || this.f87016cdj.get(iN7h).getGroupId() != i2) {
                    break;
                }
                ncyb(iN7h, false);
                i3 = i4;
            }
            lvui(true);
        }
    }

    public void removeItem(int i2) {
        ncyb(cdj(i2), true);
    }

    public void setGroupCheckable(int i2, boolean z2, boolean z3) {
        for (MenuItemC7036s menuItemC7036s : this.f87016cdj) {
            if (menuItemC7036s.getGroupId() == i2) {
                menuItemC7036s.o1t(z3);
                menuItemC7036s.setCheckable(z2);
            }
        }
    }

    public void setGroupEnabled(int i2, boolean z2) {
        for (MenuItemC7036s menuItemC7036s : this.f87016cdj) {
            if (menuItemC7036s.getGroupId() == i2) {
                menuItemC7036s.setEnabled(z2);
            }
        }
    }

    public void setGroupVisible(int i2, boolean z2) {
        boolean z3 = false;
        for (MenuItemC7036s menuItemC7036s : this.f87016cdj) {
            if (menuItemC7036s.getGroupId() == i2 && menuItemC7036s.gvn7(z2)) {
                z3 = true;
            }
        }
        if (z3) {
            lvui(true);
        }
    }

    public void setQwertyMode(boolean z2) {
        this.f87027n7h = z2;
        lvui(false);
    }

    public int size() {
        return this.f87016cdj.size();
    }

    /* JADX INFO: renamed from: t */
    public View m25349t() {
        return this.f87032wvg;
    }

    void t8r(List<MenuItemC7036s> list, int i2, KeyEvent keyEvent) {
        boolean zD3 = d3();
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i2 == 67) {
            for (MenuItemC7036s menuItemC7036s : this.f87016cdj) {
                if (menuItemC7036s.hasSubMenu()) {
                    ((f7l8) menuItemC7036s.getSubMenu()).t8r(list, i2, keyEvent);
                }
                char alphabeticShortcut = zD3 ? menuItemC7036s.getAlphabeticShortcut() : menuItemC7036s.getNumericShortcut();
                if ((metaState & 5) == 0 && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if (alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (zD3 && alphabeticShortcut == '\b' && i2 == 67)) {
                        if (menuItemC7036s.isEnabled()) {
                            list.add(menuItemC7036s);
                        }
                    }
                }
            }
        }
    }

    protected MenuItem toq(int i2, int i3, int i4, CharSequence charSequence) {
        int iA9 = a9(i4);
        MenuItemC7036s menuItemC7036s = new MenuItemC7036s(this, i2, i3, i4, iA9, charSequence, this.f87028ni7);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f87020fu4;
        if (contextMenuInfo != null) {
            menuItemC7036s.mcp(contextMenuInfo);
        }
        ArrayList<MenuItemC7036s> arrayList = this.f87016cdj;
        arrayList.add(m25331h(arrayList, iA9), menuItemC7036s);
        lvui(true);
        return menuItemC7036s;
    }

    public void uv6(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f87020fu4 = contextMenuInfo;
    }

    public f7l8 vyq(int i2) {
        this.f87028ni7 = i2;
        return this;
    }

    public CharSequence wvg() {
        return this.f39513z;
    }

    public void x9kr(int i2) {
        ncyb(i2, true);
    }

    /* JADX INFO: renamed from: y */
    boolean mo25350y(f7l8 f7l8Var, MenuItem menuItem) {
        toq toqVar = this.f39510h;
        return toqVar != null && toqVar.mo24868s(f7l8Var, menuItem);
    }

    void y9n(boolean z2) {
        this.f87022jk = z2;
    }

    protected f7l8 yz(View view) {
        m25332o(0, null, 0, null, view);
        return this;
    }

    /* JADX INFO: renamed from: z */
    public MenuItemC7036s m25351z() {
        return this.f87021gvn7;
    }

    public void zp() {
        lvui(true);
    }

    protected String zurt() {
        return f39509r;
    }

    public void zy(ld6 ld6Var) {
        this.f87023jp0y.add(new WeakReference<>(ld6Var));
        ld6Var.mo25179s(this.f87033x2, this);
        this.f87034zurt = true;
    }

    public MenuItem add(int i2) {
        return toq(0, 0, 0, this.f87030qrj.getString(i2));
    }

    public SubMenu addSubMenu(int i2) {
        return addSubMenu(0, 0, 0, this.f87030qrj.getString(i2));
    }

    public MenuItem add(int i2, int i3, int i4, CharSequence charSequence) {
        return toq(i2, i3, i4, charSequence);
    }

    public SubMenu addSubMenu(int i2, int i3, int i4, CharSequence charSequence) {
        MenuItemC7036s menuItemC7036s = (MenuItemC7036s) toq(i2, i3, i4, charSequence);
        qrj qrjVar = new qrj(this.f87033x2, this, menuItemC7036s);
        menuItemC7036s.jk(qrjVar);
        return qrjVar;
    }

    public MenuItem add(int i2, int i3, int i4, int i5) {
        return toq(i2, i3, i4, this.f87030qrj.getString(i5));
    }

    public SubMenu addSubMenu(int i2, int i3, int i4, int i5) {
        return addSubMenu(i2, i3, i4, this.f87030qrj.getString(i5));
    }
}
