package miuix.appcompat.view.menu;

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

/* JADX INFO: renamed from: miuix.appcompat.view.menu.k */
/* JADX INFO: compiled from: MenuBuilder.java */
/* JADX INFO: loaded from: classes3.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public class C7045k implements InterfaceMenuC6069k {

    /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
    private static final String f87092d2ok = "MenuBuilder";

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    private static final String f87093dd = "android:menu:expandedactionview";

    /* JADX INFO: renamed from: lvui, reason: collision with root package name */
    private static final String f87094lvui = "android:menu:presenters";

    /* JADX INFO: renamed from: r */
    private static final String f39631r = "android:menu:actionviewstates";

    /* JADX INFO: renamed from: x9kr, reason: collision with root package name */
    private static final int[] f87095x9kr = {1, 4, 5, 3, 2, 0};

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    private miuix.appcompat.view.menu.toq f87098d3;

    /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
    private boolean f87099eqxt;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    private ContextMenu.ContextMenuInfo f87102fu4;

    /* JADX INFO: renamed from: h */
    private k f39632h;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private boolean f87107kja0;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private boolean f87109n7h;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    Drawable f87111o1t;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private final Resources f87113qrj;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    View f87115wvg;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private final Context f87116x2;

    /* JADX INFO: renamed from: z */
    CharSequence f39635z;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private int f87110ni7 = 0;

    /* JADX INFO: renamed from: t */
    private boolean f39634t = false;

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    private boolean f87108mcp = false;

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    private boolean f87104jk = false;

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    private boolean f87096a9 = false;

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    private boolean f87101fti = false;

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    private ArrayList<miuix.appcompat.view.menu.toq> f87105jp0y = new ArrayList<>();

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    private CopyOnWriteArrayList<WeakReference<zy>> f87103gvn7 = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: oc, reason: collision with root package name */
    private boolean f87112oc = false;

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private ArrayList<miuix.appcompat.view.menu.toq> f87097cdj = new ArrayList<>();

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private ArrayList<miuix.appcompat.view.menu.toq> f87106ki = new ArrayList<>();

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private boolean f87114t8r = true;

    /* JADX INFO: renamed from: i */
    private ArrayList<miuix.appcompat.view.menu.toq> f39633i = new ArrayList<>();

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private ArrayList<miuix.appcompat.view.menu.toq> f87100fn3e = new ArrayList<>();

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private boolean f87117zurt = true;

    /* JADX INFO: renamed from: miuix.appcompat.view.menu.k$k */
    /* JADX INFO: compiled from: MenuBuilder.java */
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public interface k {
        /* JADX INFO: renamed from: k */
        void m25429k(@lvui C7045k c7045k);

        boolean toq(@lvui C7045k c7045k, @lvui MenuItem menuItem);
    }

    /* JADX INFO: renamed from: miuix.appcompat.view.menu.k$toq */
    /* JADX INFO: compiled from: MenuBuilder.java */
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public interface toq {
        /* JADX INFO: renamed from: k */
        boolean m25430k(miuix.appcompat.view.menu.toq toqVar);
    }

    public C7045k(Context context) {
        this.f87116x2 = context;
        this.f87113qrj = context.getResources();
        i1(true);
    }

    private static int a9(int i2) {
        int i3 = ((-65536) & i2) >> 16;
        if (i3 >= 0) {
            int[] iArr = f87095x9kr;
            if (i3 < iArr.length) {
                return (i2 & 65535) | (iArr[i3] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    private static int cdj(ArrayList<miuix.appcompat.view.menu.toq> arrayList, int i2) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).m25438p() <= i2) {
                return size + 1;
            }
        }
        return 0;
    }

    private void i1(boolean z2) {
        this.f87107kja0 = z2 && this.f87113qrj.getConfiguration().keyboard != 1 && ch.f7l8(ViewConfiguration.get(this.f87116x2), this.f87116x2);
    }

    /* JADX INFO: renamed from: l */
    private void m25408l(int i2, boolean z2) {
        if (i2 < 0 || i2 >= this.f87097cdj.size()) {
            return;
        }
        this.f87097cdj.remove(i2);
        if (z2) {
            m25425r(true);
        }
    }

    private void ld6(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(f87094lvui);
        if (sparseParcelableArray == null || this.f87103gvn7.isEmpty()) {
            return;
        }
        for (WeakReference<zy> weakReference : this.f87103gvn7) {
            zy zyVar = weakReference.get();
            if (zyVar == null) {
                this.f87103gvn7.remove(weakReference);
            } else {
                int id = zyVar.getId();
                if (id > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(id)) != null) {
                    zyVar.m25443k(parcelable);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o */
    private void m25409o(int i2, CharSequence charSequence, int i3, Drawable drawable, View view) {
        Resources resourcesFti = fti();
        if (view != null) {
            this.f87115wvg = view;
            this.f39635z = null;
            this.f87111o1t = null;
        } else {
            if (i2 > 0) {
                this.f39635z = resourcesFti.getText(i2);
            } else if (charSequence != null) {
                this.f39635z = charSequence;
            }
            if (i3 > 0) {
                this.f87111o1t = C0498q.m2259s(fu4(), i3);
            } else if (drawable != null) {
                this.f87111o1t = drawable;
            }
            this.f87115wvg = null;
        }
        m25425r(false);
    }

    /* JADX INFO: renamed from: p */
    private void m25410p(boolean z2) {
        if (this.f87103gvn7.isEmpty()) {
            return;
        }
        m25412a();
        for (WeakReference<zy> weakReference : this.f87103gvn7) {
            zy zyVar = weakReference.get();
            if (zyVar == null) {
                this.f87103gvn7.remove(weakReference);
            } else {
                zyVar.m25446q(z2);
            }
        }
        a98o();
    }

    private boolean qrj(SubMenuC7046n subMenuC7046n, zy zyVar) {
        if (this.f87103gvn7.isEmpty()) {
            return false;
        }
        boolean zM25448y = zyVar != null ? zyVar.m25448y(subMenuC7046n) : false;
        for (WeakReference<zy> weakReference : this.f87103gvn7) {
            zy zyVar2 = weakReference.get();
            if (zyVar2 == null) {
                this.f87103gvn7.remove(weakReference);
            } else if (!zM25448y) {
                zM25448y = zyVar2.m25448y(subMenuC7046n);
            }
        }
        return zM25448y;
    }

    private void x2(Bundle bundle) {
        Parcelable parcelableZy;
        if (this.f87103gvn7.isEmpty()) {
            return;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        for (WeakReference<zy> weakReference : this.f87103gvn7) {
            zy zyVar = weakReference.get();
            if (zyVar == null) {
                this.f87103gvn7.remove(weakReference);
            } else {
                int id = zyVar.getId();
                if (id > 0 && (parcelableZy = zyVar.zy()) != null) {
                    sparseArray.put(id, parcelableZy);
                }
            }
        }
        bundle.putSparseParcelableArray(f87094lvui, sparseArray);
    }

    /* JADX INFO: renamed from: y */
    private miuix.appcompat.view.menu.toq m25411y(int i2, int i3, int i4, int i5, CharSequence charSequence, int i6) {
        return new miuix.appcompat.view.menu.toq(this, i2, i3, i4, i5, charSequence, i6);
    }

    /* JADX INFO: renamed from: a */
    public void m25412a() {
        if (this.f39634t) {
            return;
        }
        this.f39634t = true;
        this.f87108mcp = false;
        this.f87104jk = false;
    }

    public void a98o() {
        this.f39634t = false;
        if (this.f87108mcp) {
            this.f87108mcp = false;
            m25425r(this.f87104jk);
        }
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return m25421k(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i2, int i3, int i4, ComponentName componentName, Intent[] intentArr, Intent intent, int i5, MenuItem[] menuItemArr) {
        int i6;
        PackageManager packageManager = this.f87116x2.getPackageManager();
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
    public void m25413b(boolean z2) {
        this.f87099eqxt = z2;
    }

    public void bf2(boolean z2) {
        if (this.f87107kja0 == z2) {
            return;
        }
        i1(z2);
        m25425r(false);
    }

    /* JADX INFO: renamed from: c */
    public void m25414c(Bundle bundle) {
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
                    bundle.putInt(f87093dd, item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((SubMenuC7046n) item.getSubMenu()).m25414c(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(ni7(), sparseArray);
        }
    }

    @Override // android.view.Menu
    public void clear() {
        miuix.appcompat.view.menu.toq toqVar = this.f87098d3;
        if (toqVar != null) {
            f7l8(toqVar);
        }
        this.f87097cdj.clear();
        m25425r(true);
    }

    public void clearHeader() {
        this.f87111o1t = null;
        this.f39635z = null;
        this.f87115wvg = null;
        m25425r(false);
    }

    @Override // android.view.Menu
    public void close() {
        m25417g(true);
    }

    void d2ok(miuix.appcompat.view.menu.toq toqVar) {
        this.f87117zurt = true;
        m25425r(true);
    }

    public boolean d3() {
        return this.f87112oc;
    }

    public boolean dd(MenuItem menuItem, int i2) {
        return x9kr(menuItem, null, i2);
    }

    /* JADX INFO: renamed from: e */
    public C7045k m25415e(int i2) {
        this.f87110ni7 = i2;
        return this;
    }

    protected C7045k ek5k(CharSequence charSequence) {
        m25409o(0, charSequence, 0, null, null);
        return this;
    }

    public boolean eqxt() {
        return this.f87107kja0;
    }

    /* JADX INFO: renamed from: f */
    public void m25416f(Bundle bundle) {
        ld6(bundle);
    }

    public boolean f7l8(miuix.appcompat.view.menu.toq toqVar) {
        boolean zF7l8 = false;
        if (!this.f87103gvn7.isEmpty() && this.f87098d3 == toqVar) {
            m25412a();
            for (WeakReference<zy> weakReference : this.f87103gvn7) {
                zy zyVar = weakReference.get();
                if (zyVar != null) {
                    zF7l8 = zyVar.f7l8(this, toqVar);
                    if (zF7l8) {
                        break;
                    }
                } else {
                    this.f87103gvn7.remove(weakReference);
                }
            }
            a98o();
            if (zF7l8) {
                this.f87098d3 = null;
            }
        }
        return zF7l8;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i2) {
        MenuItem menuItemFindItem;
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            miuix.appcompat.view.menu.toq toqVar = this.f87097cdj.get(i3);
            if (toqVar.getItemId() == i2) {
                return toqVar;
            }
            if (toqVar.hasSubMenu() && (menuItemFindItem = toqVar.getSubMenu().findItem(i2)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public void fn3e() {
        ArrayList<miuix.appcompat.view.menu.toq> arrayListGvn7 = gvn7();
        if (this.f87117zurt) {
            boolean zM25444n = false;
            for (WeakReference<zy> weakReference : this.f87103gvn7) {
                zy zyVar = weakReference.get();
                if (zyVar == null) {
                    this.f87103gvn7.remove(weakReference);
                } else {
                    zM25444n |= zyVar.m25444n();
                }
            }
            if (zM25444n) {
                this.f39633i.clear();
                this.f87100fn3e.clear();
                int size = arrayListGvn7.size();
                for (int i2 = 0; i2 < size; i2++) {
                    miuix.appcompat.view.menu.toq toqVar = arrayListGvn7.get(i2);
                    if (toqVar.m25435h()) {
                        this.f39633i.add(toqVar);
                    } else {
                        this.f87100fn3e.add(toqVar);
                    }
                }
            } else {
                this.f39633i.clear();
                this.f87100fn3e.clear();
                this.f87100fn3e.addAll(gvn7());
            }
            this.f87117zurt = false;
        }
    }

    protected Resources fti() {
        return this.f87113qrj;
    }

    public Context fu4() {
        return this.f87116x2;
    }

    /* JADX INFO: renamed from: g */
    public final void m25417g(boolean z2) {
        if (this.f87101fti) {
            return;
        }
        this.f87101fti = true;
        for (WeakReference<zy> weakReference : this.f87103gvn7) {
            zy zyVar = weakReference.get();
            if (zyVar == null) {
                this.f87103gvn7.remove(weakReference);
            } else {
                zyVar.m25442g(this, z2);
            }
        }
        this.f87101fti = false;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i2) {
        return this.f87097cdj.get(i2);
    }

    @lvui
    public ArrayList<miuix.appcompat.view.menu.toq> gvn7() {
        if (!this.f87114t8r) {
            return this.f87106ki;
        }
        this.f87106ki.clear();
        int size = this.f87097cdj.size();
        for (int i2 = 0; i2 < size; i2++) {
            miuix.appcompat.view.menu.toq toqVar = this.f87097cdj.get(i2);
            if (toqVar.isVisible()) {
                this.f87106ki.add(toqVar);
            }
        }
        this.f87114t8r = false;
        this.f87117zurt = true;
        return this.f87106ki;
    }

    /* JADX INFO: renamed from: h */
    public int m25418h(int i2, int i3) {
        int size = size();
        if (i3 < 0) {
            i3 = 0;
        }
        while (i3 < size) {
            if (this.f87097cdj.get(i3).getGroupId() == i2) {
                return i3;
            }
            i3++;
        }
        return -1;
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.f87099eqxt) {
            return true;
        }
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f87097cdj.get(i2).isVisible()) {
                return true;
            }
        }
        return false;
    }

    protected C7045k hb(int i2) {
        m25409o(0, null, i2, null, null);
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
                ((SubMenuC7046n) item.getSubMenu()).hyr(bundle);
            }
        }
        int i3 = bundle.getInt(f87093dd);
        if (i3 <= 0 || (menuItemFindItem = findItem(i3)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    /* JADX INFO: renamed from: i */
    void m25419i(List<miuix.appcompat.view.menu.toq> list, int i2, KeyEvent keyEvent) {
        boolean zOc = oc();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i2 == 67) {
            int size = this.f87097cdj.size();
            for (int i3 = 0; i3 < size; i3++) {
                miuix.appcompat.view.menu.toq toqVar = this.f87097cdj.get(i3);
                if (toqVar.hasSubMenu()) {
                    ((C7045k) toqVar.getSubMenu()).m25419i(list, i2, keyEvent);
                }
                char alphabeticShortcut = zOc ? toqVar.getAlphabeticShortcut() : toqVar.getNumericShortcut();
                if (((modifiers & InterfaceMenuC6069k.f35068n) == ((zOc ? toqVar.getAlphabeticModifiers() : toqVar.getNumericModifiers()) & InterfaceMenuC6069k.f35068n)) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (zOc && alphabeticShortcut == '\b' && i2 == 67)) && toqVar.isEnabled()) {
                        list.add(toqVar);
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
    protected C7045k m25420j(Drawable drawable) {
        m25409o(0, null, 0, drawable, null);
        return this;
    }

    boolean jk() {
        return this.f87096a9;
    }

    public C7045k jp0y() {
        return this;
    }

    /* JADX INFO: renamed from: k */
    protected MenuItem m25421k(int i2, int i3, int i4, CharSequence charSequence) {
        int iA9 = a9(i4);
        miuix.appcompat.view.menu.toq toqVarM25411y = m25411y(i2, i3, i4, iA9, charSequence, this.f87110ni7);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f87102fu4;
        if (contextMenuInfo != null) {
            toqVarM25411y.m25440t(contextMenuInfo);
        }
        ArrayList<miuix.appcompat.view.menu.toq> arrayList = this.f87097cdj;
        arrayList.add(cdj(arrayList, iA9), toqVarM25411y);
        m25425r(true);
        return toqVarM25411y;
    }

    public int ki(int i2) {
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            if (this.f87097cdj.get(i3).getItemId() == i2) {
                return i3;
            }
        }
        return -1;
    }

    public int kja0(int i2) {
        return m25418h(i2, 0);
    }

    public void lrht(Bundle bundle) {
        x2(bundle);
    }

    void lvui(miuix.appcompat.view.menu.toq toqVar) {
        this.f87114t8r = true;
        m25425r(true);
    }

    /* JADX INFO: renamed from: m */
    protected C7045k m25422m(int i2) {
        m25409o(i2, null, 0, null, null);
        return this;
    }

    public ArrayList<miuix.appcompat.view.menu.toq> mcp() {
        fn3e();
        return this.f87100fn3e;
    }

    /* JADX INFO: renamed from: n */
    public void m25423n() {
        this.f39634t = true;
        clear();
        clearHeader();
        this.f87103gvn7.clear();
        this.f39634t = false;
        this.f87108mcp = false;
        this.f87104jk = false;
        m25425r(true);
    }

    public void n5r1(zy zyVar) {
        for (WeakReference<zy> weakReference : this.f87103gvn7) {
            zy zyVar2 = weakReference.get();
            if (zyVar2 == null || zyVar2 == zyVar) {
                this.f87103gvn7.remove(weakReference);
            }
        }
    }

    public boolean n7h(miuix.appcompat.view.menu.toq toqVar) {
        boolean zLd6 = false;
        if (this.f87103gvn7.isEmpty()) {
            return false;
        }
        m25412a();
        for (WeakReference<zy> weakReference : this.f87103gvn7) {
            zy zyVar = weakReference.get();
            if (zyVar != null) {
                zLd6 = zyVar.ld6(this, toqVar);
                if (zLd6) {
                    break;
                }
            } else {
                this.f87103gvn7.remove(weakReference);
            }
        }
        a98o();
        if (zLd6) {
            this.f87098d3 = toqVar;
        }
        return zLd6;
    }

    public void ncyb(int i2) {
        m25408l(i2, true);
    }

    protected String ni7() {
        return f39631r;
    }

    void nn86(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f87097cdj.size();
        m25412a();
        for (int i2 = 0; i2 < size; i2++) {
            miuix.appcompat.view.menu.toq toqVar = this.f87097cdj.get(i2);
            if (toqVar.getGroupId() == groupId && toqVar.cdj() && toqVar.isCheckable()) {
                toqVar.m25441z(toqVar == menuItem);
            }
        }
        a98o();
    }

    public Drawable o1t() {
        return this.f87111o1t;
    }

    boolean oc() {
        return this.f87109n7h;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i2, int i3) {
        return dd(findItem(i2), i3);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i2, KeyEvent keyEvent, int i3) {
        miuix.appcompat.view.menu.toq toqVarT8r = t8r(i2, keyEvent);
        boolean zDd = toqVarT8r != null ? dd(toqVarT8r, i3) : false;
        if ((i3 & 2) != 0) {
            m25417g(true);
        }
        return zDd;
    }

    /* JADX INFO: renamed from: q */
    public void m25424q() {
        k kVar = this.f39632h;
        if (kVar != null) {
            kVar.m25429k(this);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m25425r(boolean z2) {
        if (this.f39634t) {
            this.f87108mcp = true;
            if (z2) {
                this.f87104jk = true;
                return;
            }
            return;
        }
        if (z2) {
            this.f87114t8r = true;
            this.f87117zurt = true;
        }
        m25410p(z2);
    }

    @Override // android.view.Menu
    public void removeGroup(int i2) {
        int iKja0 = kja0(i2);
        if (iKja0 >= 0) {
            int size = this.f87097cdj.size() - iKja0;
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (i3 >= size || this.f87097cdj.get(iKja0).getGroupId() != i2) {
                    break;
                }
                m25408l(iKja0, false);
                i3 = i4;
            }
            m25425r(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i2) {
        m25408l(ki(i2), true);
    }

    /* JADX INFO: renamed from: s */
    boolean mo25426s(@lvui C7045k c7045k, @lvui MenuItem menuItem) {
        k kVar = this.f39632h;
        return kVar != null && kVar.toq(c7045k, menuItem);
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i2, boolean z2, boolean z3) {
        int size = this.f87097cdj.size();
        for (int i3 = 0; i3 < size; i3++) {
            miuix.appcompat.view.menu.toq toqVar = this.f87097cdj.get(i3);
            if (toqVar.getGroupId() == i2) {
                toqVar.o1t(z3);
                toqVar.setCheckable(z2);
            }
        }
    }

    @Override // p024h.InterfaceMenuC6069k, android.view.Menu
    public void setGroupDividerEnabled(boolean z2) {
        this.f87112oc = z2;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i2, boolean z2) {
        int size = this.f87097cdj.size();
        for (int i3 = 0; i3 < size; i3++) {
            miuix.appcompat.view.menu.toq toqVar = this.f87097cdj.get(i3);
            if (toqVar.getGroupId() == i2) {
                toqVar.setEnabled(z2);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i2, boolean z2) {
        int size = this.f87097cdj.size();
        boolean z3 = false;
        for (int i3 = 0; i3 < size; i3++) {
            miuix.appcompat.view.menu.toq toqVar = this.f87097cdj.get(i3);
            if (toqVar.getGroupId() == i2 && toqVar.fti(z2)) {
                z3 = true;
            }
        }
        if (z3) {
            m25425r(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z2) {
        this.f87109n7h = z2;
        m25425r(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f87097cdj.size();
    }

    /* JADX INFO: renamed from: t */
    public View m25427t() {
        return this.f87115wvg;
    }

    miuix.appcompat.view.menu.toq t8r(int i2, KeyEvent keyEvent) {
        ArrayList<miuix.appcompat.view.menu.toq> arrayList = this.f87105jp0y;
        arrayList.clear();
        m25419i(arrayList, i2, keyEvent);
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
            miuix.appcompat.view.menu.toq toqVar = arrayList.get(i3);
            char alphabeticShortcut = zOc ? toqVar.getAlphabeticShortcut() : toqVar.getNumericShortcut();
            char[] cArr = keyData.meta;
            if ((alphabeticShortcut == cArr[0] && (metaState & 2) == 0) || ((alphabeticShortcut == cArr[2] && (metaState & 2) != 0) || (zOc && alphabeticShortcut == '\b' && i2 == 67))) {
                return toqVar;
            }
        }
        return null;
    }

    public void toq(zy zyVar) {
        zy(zyVar, this.f87116x2);
    }

    public void uv6(k kVar) {
        this.f39632h = kVar;
    }

    public void vyq(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f87102fu4 = contextMenuInfo;
    }

    public CharSequence wvg() {
        return this.f39635z;
    }

    public boolean x9kr(MenuItem menuItem, zy zyVar, int i2) {
        miuix.appcompat.view.menu.toq toqVar = (miuix.appcompat.view.menu.toq) menuItem;
        if (toqVar == null || !toqVar.isEnabled()) {
            return false;
        }
        boolean zKja0 = toqVar.kja0();
        androidx.core.view.toq toqVarMo345k = toqVar.mo345k();
        boolean z2 = toqVarMo345k != null && toqVarMo345k.toq();
        if (toqVar.n7h()) {
            zKja0 |= toqVar.expandActionView();
            if (zKja0) {
                m25417g(true);
            }
        } else if (toqVar.hasSubMenu() || z2) {
            if ((i2 & 4) == 0) {
                m25417g(false);
            }
            if (!toqVar.hasSubMenu()) {
                toqVar.jk(new SubMenuC7046n(fu4(), this, toqVar));
            }
            SubMenuC7046n subMenuC7046n = (SubMenuC7046n) toqVar.getSubMenu();
            if (z2) {
                toqVarMo345k.f7l8(subMenuC7046n);
            }
            zKja0 |= qrj(subMenuC7046n, zyVar);
            if (!zKja0) {
                m25417g(true);
            }
        } else if ((i2 & 1) == 0) {
            m25417g(true);
        }
        return zKja0;
    }

    public void y9n(boolean z2) {
        this.f87096a9 = z2;
    }

    protected C7045k yz(View view) {
        m25409o(0, null, 0, null, view);
        return this;
    }

    /* JADX INFO: renamed from: z */
    public miuix.appcompat.view.menu.toq m25428z() {
        return this.f87098d3;
    }

    public ArrayList<miuix.appcompat.view.menu.toq> zurt() {
        fn3e();
        return this.f39633i;
    }

    public void zy(zy zyVar, Context context) {
        this.f87103gvn7.add(new WeakReference<>(zyVar));
        zyVar.m25447s(context, this);
        this.f87117zurt = true;
    }

    @Override // android.view.Menu
    public MenuItem add(int i2) {
        return m25421k(0, 0, 0, this.f87113qrj.getString(i2));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i2) {
        return addSubMenu(0, 0, 0, this.f87113qrj.getString(i2));
    }

    @Override // android.view.Menu
    public MenuItem add(int i2, int i3, int i4, CharSequence charSequence) {
        return m25421k(i2, i3, i4, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i2, int i3, int i4, CharSequence charSequence) {
        miuix.appcompat.view.menu.toq toqVar = (miuix.appcompat.view.menu.toq) m25421k(i2, i3, i4, charSequence);
        SubMenuC7046n subMenuC7046n = new SubMenuC7046n(this.f87116x2, this, toqVar);
        toqVar.jk(subMenuC7046n);
        return subMenuC7046n;
    }

    @Override // android.view.Menu
    public MenuItem add(int i2, int i3, int i4, int i5) {
        return m25421k(i2, i3, i4, this.f87113qrj.getString(i5));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i2, int i3, int i4, int i5) {
        return addSubMenu(i2, i3, i4, this.f87113qrj.getString(i5));
    }
}
