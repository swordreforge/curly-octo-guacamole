package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.core.widgets.C0339g;
import androidx.constraintlayout.core.widgets.C0341n;
import androidx.constraintlayout.core.widgets.C0342p;
import androidx.constraintlayout.core.widgets.InterfaceC0344s;
import androidx.constraintlayout.widget.C0394g;
import androidx.constraintlayout.widget.C0397q;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class ConstraintHelper extends View {

    /* JADX INFO: renamed from: g */
    protected InterfaceC0344s f2598g;

    /* JADX INFO: renamed from: h */
    private View[] f2599h;

    /* JADX INFO: renamed from: i */
    protected HashMap<Integer, String> f2600i;

    /* JADX INFO: renamed from: k */
    protected int[] f2601k;

    /* JADX INFO: renamed from: n */
    protected Context f2602n;

    /* JADX INFO: renamed from: p */
    protected String f2603p;

    /* JADX INFO: renamed from: q */
    protected int f2604q;

    /* JADX INFO: renamed from: s */
    protected String f2605s;

    /* JADX INFO: renamed from: y */
    protected boolean f2606y;

    public ConstraintHelper(Context context) {
        super(context);
        this.f2601k = new int[32];
        this.f2606y = false;
        this.f2599h = null;
        this.f2600i = new HashMap<>();
        this.f2602n = context;
        mo1374z(null);
    }

    private int fn3e(ConstraintLayout container, String idString) {
        Resources resources;
        if (idString == null || container == null || (resources = this.f2602n.getResources()) == null) {
            return 0;
        }
        int childCount = container.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = container.getChildAt(i2);
            if (childAt.getId() != -1) {
                String resourceEntryName = null;
                try {
                    resourceEntryName = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                }
                if (idString.equals(resourceEntryName)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: i */
    private int[] m1618i(View view, String referenceIdString) {
        String[] strArrSplit = referenceIdString.split(",");
        view.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i2 = 0;
        for (String str : strArrSplit) {
            int iZurt = zurt(str.trim());
            if (iZurt != 0) {
                iArr[i2] = iZurt;
                i2++;
            }
        }
        return i2 != strArrSplit.length ? Arrays.copyOf(iArr, i2) : iArr;
    }

    private void n7h(String tagString) {
        if (tagString == null || tagString.length() == 0 || this.f2602n == null) {
            return;
        }
        String strTrim = tagString.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.toq) && strTrim.equals(((ConstraintLayout.toq) layoutParams).f2644j)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    qrj(childAt.getId());
                }
            }
        }
    }

    private void qrj(int id) {
        if (id == getId()) {
            return;
        }
        int i2 = this.f2604q + 1;
        int[] iArr = this.f2601k;
        if (i2 > iArr.length) {
            this.f2601k = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f2601k;
        int i3 = this.f2604q;
        iArr2[i3] = id;
        this.f2604q = i3 + 1;
    }

    private void x2(String idString) {
        if (idString == null || idString.length() == 0 || this.f2602n == null) {
            return;
        }
        String strTrim = idString.trim();
        if (getParent() instanceof ConstraintLayout) {
        }
        int iZurt = zurt(strTrim);
        if (iZurt != 0) {
            this.f2600i.put(Integer.valueOf(iZurt), strTrim);
            qrj(iZurt);
            return;
        }
        Log.w("ConstraintHelper", "Could not find id of \"" + strTrim + "\"");
    }

    private int zurt(String referenceId) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int iFn3e = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object objLvui = constraintLayout.lvui(0, referenceId);
            if (objLvui instanceof Integer) {
                iFn3e = ((Integer) objLvui).intValue();
            }
        }
        if (iFn3e == 0 && constraintLayout != null) {
            iFn3e = fn3e(constraintLayout, referenceId);
        }
        if (iFn3e == 0) {
            try {
                iFn3e = C0394g.f7l8.class.getField(referenceId).getInt(null);
            } catch (Exception unused) {
            }
        }
        return iFn3e == 0 ? this.f2602n.getResources().getIdentifier(referenceId, "id", this.f2602n.getPackageName()) : iFn3e;
    }

    public void a9(ConstraintLayout container) {
    }

    protected void cdj(ConstraintLayout container) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i2 = 0; i2 < this.f2604q; i2++) {
            View viewDd = container.dd(this.f2601k[i2]);
            if (viewDd != null) {
                viewDd.setVisibility(visibility);
                if (elevation > 0.0f) {
                    viewDd.setTranslationZ(viewDd.getTranslationZ() + elevation);
                }
            }
        }
    }

    public void d3() {
        if (this.f2598g == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.toq) {
            ((ConstraintLayout.toq) layoutParams).f48518y2 = (C0341n) this.f2598g;
        }
    }

    public void fti(ConstraintLayout container) {
    }

    public int fu4(final int id) {
        int i2 = -1;
        for (int i3 : this.f2601k) {
            i2++;
            if (i3 == id) {
                return i2;
            }
        }
        return i2;
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f2601k, this.f2604q);
    }

    public void gvn7(ConstraintLayout container) {
        String str;
        int iFn3e;
        if (isInEditMode()) {
            setIds(this.f2605s);
        }
        InterfaceC0344s interfaceC0344s = this.f2598g;
        if (interfaceC0344s == null) {
            return;
        }
        interfaceC0344s.toq();
        for (int i2 = 0; i2 < this.f2604q; i2++) {
            int i3 = this.f2601k[i2];
            View viewDd = container.dd(i3);
            if (viewDd == null && (iFn3e = fn3e(container, (str = this.f2600i.get(Integer.valueOf(i3))))) != 0) {
                this.f2601k[i2] = iFn3e;
                this.f2600i.put(Integer.valueOf(iFn3e), str);
                viewDd = container.dd(iFn3e);
            }
            if (viewDd != null) {
                this.f2598g.mo1333k(container.x9kr(viewDd));
            }
        }
        this.f2598g.zy(container.f2621n);
    }

    /* JADX INFO: renamed from: h */
    protected void m1619h() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        cdj((ConstraintLayout) parent);
    }

    public void jk(ConstraintLayout container) {
    }

    public void jp0y(C0339g container, InterfaceC0344s helper, SparseArray<C0341n> map) {
        helper.toq();
        for (int i2 = 0; i2 < this.f2604q; i2++) {
            helper.mo1333k(map.get(this.f2601k[i2]));
        }
    }

    protected void ki(ConstraintLayout container) {
    }

    public void kja0(View view) {
        if (view == this) {
            return;
        }
        if (view.getId() == -1) {
            Log.e("ConstraintHelper", "Views added to a ConstraintHelper need to have an id");
        } else {
            if (view.getParent() == null) {
                Log.e("ConstraintHelper", "Views added to a ConstraintHelper need to have a parent");
                return;
            }
            this.f2605s = null;
            qrj(view.getId());
            requestLayout();
        }
    }

    public void mcp(ConstraintLayout container) {
    }

    protected View[] ni7(ConstraintLayout layout) {
        View[] viewArr = this.f2599h;
        if (viewArr == null || viewArr.length != this.f2604q) {
            this.f2599h = new View[this.f2604q];
        }
        for (int i2 = 0; i2 < this.f2604q; i2++) {
            this.f2599h[i2] = layout.dd(this.f2601k[i2]);
        }
        return this.f2599h;
    }

    public void o1t(C0397q.k constraint, C0342p child, ConstraintLayout.toq layoutParams, SparseArray<C0341n> mapIdToWidget) {
        C0397q.toq toqVar = constraint.f2964n;
        int[] iArr = toqVar.f49946i1;
        if (iArr != null) {
            setReferencedIds(iArr);
        } else {
            String str = toqVar.f49930a98o;
            if (str != null) {
                if (str.length() > 0) {
                    C0397q.toq toqVar2 = constraint.f2964n;
                    toqVar2.f49946i1 = m1618i(this, toqVar2.f49930a98o);
                } else {
                    constraint.f2964n.f49946i1 = null;
                }
            }
        }
        if (child == null) {
            return;
        }
        child.toq();
        if (constraint.f2964n.f49946i1 == null) {
            return;
        }
        int i2 = 0;
        while (true) {
            int[] iArr2 = constraint.f2964n.f49946i1;
            if (i2 >= iArr2.length) {
                return;
            }
            C0341n c0341n = mapIdToWidget.get(iArr2[i2]);
            if (c0341n != null) {
                child.mo1333k(c0341n);
            }
            i2++;
        }
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f2605s;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f2603p;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (this.f2606y) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    protected void setIds(String idList) {
        this.f2605s = idList;
        if (idList == null) {
            return;
        }
        int i2 = 0;
        this.f2604q = 0;
        while (true) {
            int iIndexOf = idList.indexOf(44, i2);
            if (iIndexOf == -1) {
                x2(idList.substring(i2));
                return;
            } else {
                x2(idList.substring(i2, iIndexOf));
                i2 = iIndexOf + 1;
            }
        }
    }

    protected void setReferenceTags(String tagList) {
        this.f2603p = tagList;
        if (tagList == null) {
            return;
        }
        int i2 = 0;
        this.f2604q = 0;
        while (true) {
            int iIndexOf = tagList.indexOf(44, i2);
            if (iIndexOf == -1) {
                n7h(tagList.substring(i2));
                return;
            } else {
                n7h(tagList.substring(i2, iIndexOf));
                i2 = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] ids) {
        this.f2605s = null;
        this.f2604q = 0;
        for (int i2 : ids) {
            qrj(i2);
        }
    }

    @Override // android.view.View
    public void setTag(int key, Object tag) {
        super.setTag(key, tag);
        if (tag == null && this.f2605s == null) {
            qrj(key);
        }
    }

    /* JADX INFO: renamed from: t */
    public void mo1375t(C0341n widget, boolean isRtl) {
    }

    public boolean t8r(final int id) {
        for (int i2 : this.f2601k) {
            if (i2 == id) {
                return true;
            }
        }
        return false;
    }

    public int wvg(View view) {
        int i2;
        int id = view.getId();
        int i3 = -1;
        if (id == -1) {
            return -1;
        }
        this.f2605s = null;
        int i4 = 0;
        while (true) {
            if (i4 >= this.f2604q) {
                break;
            }
            if (this.f2601k[i4] == id) {
                int i5 = i4;
                while (true) {
                    i2 = this.f2604q;
                    if (i5 >= i2 - 1) {
                        break;
                    }
                    int[] iArr = this.f2601k;
                    int i6 = i5 + 1;
                    iArr[i5] = iArr[i6];
                    i5 = i6;
                }
                this.f2601k[i2 - 1] = 0;
                this.f2604q = i2 - 1;
                i3 = i4;
            } else {
                i4++;
            }
        }
        requestLayout();
        return i3;
    }

    /* JADX INFO: renamed from: z */
    protected void mo1374z(AttributeSet attrs) {
        if (attrs != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attrs, C0394g.qrj.c4);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == C0394g.qrj.c2lu) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f2605s = string;
                    setIds(string);
                } else if (index == C0394g.qrj.ep5q) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.f2603p = string2;
                    setReferenceTags(string2);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public ConstraintHelper(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f2601k = new int[32];
        this.f2606y = false;
        this.f2599h = null;
        this.f2600i = new HashMap<>();
        this.f2602n = context;
        mo1374z(attrs);
    }

    public ConstraintHelper(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f2601k = new int[32];
        this.f2606y = false;
        this.f2599h = null;
        this.f2600i = new HashMap<>();
        this.f2602n = context;
        mo1374z(attrs);
    }
}
