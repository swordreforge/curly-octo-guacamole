package androidx.constraintlayout.motion.widget;

import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C0397q;
import java.util.HashMap;

/* JADX INFO: renamed from: androidx.constraintlayout.motion.widget.q */
/* JADX INFO: compiled from: DesignTool.java */
/* JADX INFO: loaded from: classes.dex */
public class C0376q implements fn3e {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final boolean f48235f7l8 = false;

    /* JADX INFO: renamed from: p */
    static final HashMap<String, String> f2368p;

    /* JADX INFO: renamed from: s */
    static final HashMap<Pair<Integer, Integer>, String> f2369s;

    /* JADX INFO: renamed from: y */
    private static final String f2370y = "DesignTool";

    /* JADX INFO: renamed from: k */
    private final MotionLayout f2372k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private t8r f48236toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private String f48237zy = null;

    /* JADX INFO: renamed from: q */
    private String f2374q = null;

    /* JADX INFO: renamed from: n */
    private int f2373n = -1;

    /* JADX INFO: renamed from: g */
    private int f2371g = -1;

    static {
        HashMap<Pair<Integer, Integer>, String> map = new HashMap<>();
        f2369s = map;
        HashMap<String, String> map2 = new HashMap<>();
        f2368p = map2;
        map.put(Pair.create(4, 4), "layout_constraintBottom_toBottomOf");
        map.put(Pair.create(4, 3), "layout_constraintBottom_toTopOf");
        map.put(Pair.create(3, 4), "layout_constraintTop_toBottomOf");
        map.put(Pair.create(3, 3), "layout_constraintTop_toTopOf");
        map.put(Pair.create(6, 6), "layout_constraintStart_toStartOf");
        map.put(Pair.create(6, 7), "layout_constraintStart_toEndOf");
        map.put(Pair.create(7, 6), "layout_constraintEnd_toStartOf");
        map.put(Pair.create(7, 7), "layout_constraintEnd_toEndOf");
        map.put(Pair.create(1, 1), "layout_constraintLeft_toLeftOf");
        map.put(Pair.create(1, 2), "layout_constraintLeft_toRightOf");
        map.put(Pair.create(2, 2), "layout_constraintRight_toRightOf");
        map.put(Pair.create(2, 1), "layout_constraintRight_toLeftOf");
        map.put(Pair.create(5, 5), "layout_constraintBaseline_toBaselineOf");
        map2.put("layout_constraintBottom_toBottomOf", "layout_marginBottom");
        map2.put("layout_constraintBottom_toTopOf", "layout_marginBottom");
        map2.put("layout_constraintTop_toBottomOf", "layout_marginTop");
        map2.put("layout_constraintTop_toTopOf", "layout_marginTop");
        map2.put("layout_constraintStart_toStartOf", "layout_marginStart");
        map2.put("layout_constraintStart_toEndOf", "layout_marginStart");
        map2.put("layout_constraintEnd_toStartOf", "layout_marginEnd");
        map2.put("layout_constraintEnd_toEndOf", "layout_marginEnd");
        map2.put("layout_constraintLeft_toLeftOf", "layout_marginLeft");
        map2.put("layout_constraintLeft_toRightOf", "layout_marginLeft");
        map2.put("layout_constraintRight_toRightOf", "layout_marginRight");
        map2.put("layout_constraintRight_toLeftOf", "layout_marginRight");
    }

    public C0376q(MotionLayout motionLayout) {
        this.f2372k = motionLayout;
    }

    private static int ld6(int dpi, String value) {
        int iIndexOf;
        if (value == null || (iIndexOf = value.indexOf(100)) == -1) {
            return 0;
        }
        return (int) ((Integer.valueOf(value.substring(0, iIndexOf)).intValue() * dpi) / 160.0f);
    }

    private static void n7h(int dpi, C0397q set, View view, HashMap<String, String> attributes, int type) {
        String str = attributes.get(type == 1 ? "layout_height" : "layout_width");
        if (str != null) {
            int iLd6 = str.equalsIgnoreCase("wrap_content") ? -2 : ld6(dpi, str);
            if (type == 0) {
                set.lrht(view.getId(), iLd6);
            } else {
                set.x9kr(view.getId(), iLd6);
            }
        }
    }

    /* JADX INFO: renamed from: p */
    private static void m1503p(int dpi, C0397q set, View view, HashMap<String, String> attributes, int from, int to) {
        String str = f2369s.get(Pair.create(Integer.valueOf(from), Integer.valueOf(to)));
        String str2 = attributes.get(str);
        if (str2 != null) {
            String str3 = f2368p.get(str);
            int iLd6 = str3 != null ? ld6(dpi, attributes.get(str3)) : 0;
            set.d2ok(view.getId(), from, Integer.parseInt(str2), to, iLd6);
        }
    }

    private static void qrj(C0397q set, View view, HashMap<String, String> attributes, int type) {
        String str = attributes.get(type == 1 ? "layout_constraintVertical_bias" : "layout_constraintHorizontal_bias");
        if (str != null) {
            if (type == 0) {
                set.zkd(view.getId(), Float.parseFloat(str));
            } else if (type == 1) {
                set.nsb(view.getId(), Float.parseFloat(str));
            }
        }
    }

    private static void x2(int dpi, C0397q set, View view, HashMap<String, String> attributes) {
        String str = attributes.get("layout_editor_absoluteX");
        if (str != null) {
            set.sok(view.getId(), ld6(dpi, str));
        }
        String str2 = attributes.get("layout_editor_absoluteY");
        if (str2 != null) {
            set.cfr(view.getId(), ld6(dpi, str2));
        }
    }

    public void a9(String start, String end) {
        MotionLayout motionLayout = this.f2372k;
        if (motionLayout.bl == null) {
            motionLayout.bl = this.f48236toq;
        }
        int iUj2j = motionLayout.uj2j(start);
        int iUj2j2 = this.f2372k.uj2j(end);
        this.f2372k.setTransition(iUj2j, iUj2j2);
        this.f2373n = iUj2j;
        this.f2371g = iUj2j2;
        this.f48237zy = start;
        this.f2374q = end;
    }

    public int cdj(Object view, float[] key) {
        t8r t8rVar = this.f2372k.bl;
        if (t8rVar == null) {
            return -1;
        }
        int iM1529i = t8rVar.m1529i() / 16;
        kja0 kja0Var = this.f2372k.ay.get(view);
        if (kja0Var == null) {
            return 0;
        }
        kja0Var.m1474n(key, null);
        return iM1529i;
    }

    @Override // androidx.constraintlayout.motion.widget.fn3e
    public void f7l8(int dpi, String constraintSetId, Object opaqueView, Object opaqueAttributes) {
        View view = (View) opaqueView;
        HashMap map = (HashMap) opaqueAttributes;
        int iUj2j = this.f2372k.uj2j(constraintSetId);
        C0397q c0397qKja0 = this.f2372k.bl.kja0(iUj2j);
        if (c0397qKja0 == null) {
            return;
        }
        c0397qKja0.a9(view.getId());
        n7h(dpi, c0397qKja0, view, map, 0);
        n7h(dpi, c0397qKja0, view, map, 1);
        m1503p(dpi, c0397qKja0, view, map, 6, 6);
        m1503p(dpi, c0397qKja0, view, map, 6, 7);
        m1503p(dpi, c0397qKja0, view, map, 7, 7);
        m1503p(dpi, c0397qKja0, view, map, 7, 6);
        m1503p(dpi, c0397qKja0, view, map, 1, 1);
        m1503p(dpi, c0397qKja0, view, map, 1, 2);
        m1503p(dpi, c0397qKja0, view, map, 2, 2);
        m1503p(dpi, c0397qKja0, view, map, 2, 1);
        m1503p(dpi, c0397qKja0, view, map, 3, 3);
        m1503p(dpi, c0397qKja0, view, map, 3, 4);
        m1503p(dpi, c0397qKja0, view, map, 4, 3);
        m1503p(dpi, c0397qKja0, view, map, 4, 4);
        m1503p(dpi, c0397qKja0, view, map, 5, 5);
        qrj(c0397qKja0, view, map, 0);
        qrj(c0397qKja0, view, map, 1);
        x2(dpi, c0397qKja0, view, map);
        this.f2372k.n2t(iUj2j, c0397qKja0);
        this.f2372k.requestLayout();
    }

    public int fn3e(Object view, int type, int[] info) {
        kja0 kja0Var = this.f2372k.ay.get((View) view);
        if (kja0Var == null) {
            return 0;
        }
        return kja0Var.fu4(type, info);
    }

    public void fti(Object view, int debugMode) {
        kja0 kja0Var;
        if ((view instanceof View) && (kja0Var = this.f2372k.ay.get(view)) != null) {
            kja0Var.n5r1(debugMode);
            this.f2372k.invalidate();
        }
    }

    public Object fu4(Object view, int type, int position) {
        if (this.f2372k.bl == null) {
            return null;
        }
        int id = ((View) view).getId();
        MotionLayout motionLayout = this.f2372k;
        return motionLayout.bl.m1539z(motionLayout.getContext(), type, id, position);
    }

    @Override // androidx.constraintlayout.motion.widget.fn3e
    /* JADX INFO: renamed from: g */
    public void mo1437g(Object view, int position, String name, Object value) {
        t8r t8rVar = this.f2372k.bl;
        if (t8rVar != null) {
            t8rVar.a98o((View) view, position, name, value);
            MotionLayout motionLayout = this.f2372k;
            motionLayout.bc = position / 100.0f;
            motionLayout.k0 = 0.0f;
            motionLayout.cv06();
            this.f2372k.gbni(true);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m1504h(String set) {
        MotionLayout motionLayout = this.f2372k;
        if (motionLayout.bl == null) {
            motionLayout.bl = this.f48236toq;
        }
        int iUj2j = motionLayout.uj2j(set);
        System.out.println(" dumping  " + set + " (" + iUj2j + ")");
        try {
            this.f2372k.bl.kja0(iUj2j).yz(this.f2372k.bl, new int[0]);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: i */
    public String m1505i() {
        int endState = this.f2372k.getEndState();
        if (this.f2371g == endState) {
            return this.f2374q;
        }
        String strEtdu = this.f2372k.etdu(endState);
        if (strEtdu != null) {
            this.f2374q = strEtdu;
            this.f2371g = endState;
        }
        return strEtdu;
    }

    public void jk(String id) {
        if (id == null) {
            id = "motion_base";
        }
        if (this.f48237zy == id) {
            return;
        }
        this.f48237zy = id;
        this.f2374q = null;
        MotionLayout motionLayout = this.f2372k;
        if (motionLayout.bl == null) {
            motionLayout.bl = this.f48236toq;
        }
        int iUj2j = motionLayout.uj2j(id);
        this.f2373n = iUj2j;
        if (iUj2j != 0) {
            if (iUj2j == this.f2372k.getStartState()) {
                this.f2372k.setProgress(0.0f);
            } else if (iUj2j == this.f2372k.getEndState()) {
                this.f2372k.setProgress(1.0f);
            } else {
                this.f2372k.ebn(iUj2j);
                this.f2372k.setProgress(1.0f);
            }
        }
        this.f2372k.requestLayout();
    }

    @Override // androidx.constraintlayout.motion.widget.fn3e
    /* JADX INFO: renamed from: k */
    public long mo1438k() {
        return this.f2372k.getTransitionTimeMs();
    }

    public int ki(Object view, float[] path, int len) {
        MotionLayout motionLayout = this.f2372k;
        if (motionLayout.bl == null) {
            return -1;
        }
        kja0 kja0Var = motionLayout.ay.get(view);
        if (kja0Var == null) {
            return 0;
        }
        kja0Var.m1469g(path, len);
        return len;
    }

    public void kja0(boolean disable) {
        this.f2372k.wo(disable);
    }

    public void mcp(Object keyFrame, String tag, Object value) {
        if (keyFrame instanceof AbstractC0368g) {
            ((AbstractC0368g) keyFrame).mo1433p(tag, value);
            this.f2372k.cv06();
            this.f2372k.bd = true;
        }
    }

    @Override // androidx.constraintlayout.motion.widget.fn3e
    /* JADX INFO: renamed from: n */
    public void mo1439n(float position) {
        MotionLayout motionLayout = this.f2372k;
        if (motionLayout.bl == null) {
            motionLayout.bl = this.f48236toq;
        }
        motionLayout.setProgress(position);
        this.f2372k.gbni(true);
        this.f2372k.requestLayout();
        this.f2372k.invalidate();
    }

    public Object ni7(int type, int target, int position) {
        MotionLayout motionLayout = this.f2372k;
        t8r t8rVar = motionLayout.bl;
        if (t8rVar == null) {
            return null;
        }
        return t8rVar.m1539z(motionLayout.getContext(), type, target, position);
    }

    public String o1t() {
        int startState = this.f2372k.getStartState();
        if (this.f2373n == startState) {
            return this.f48237zy;
        }
        String strEtdu = this.f2372k.etdu(startState);
        if (strEtdu != null) {
            this.f48237zy = strEtdu;
            this.f2373n = startState;
        }
        return this.f2372k.etdu(startState);
    }

    @Override // androidx.constraintlayout.motion.widget.fn3e
    /* JADX INFO: renamed from: q */
    public boolean mo1440q(Object view, int position, int type, float x3, float y3) {
        if (!(view instanceof View)) {
            return false;
        }
        MotionLayout motionLayout = this.f2372k;
        if (motionLayout.bl != null) {
            kja0 kja0Var = motionLayout.ay.get(view);
            MotionLayout motionLayout2 = this.f2372k;
            int i2 = (int) (motionLayout2.bs * 100.0f);
            if (kja0Var != null) {
                View view2 = (View) view;
                if (motionLayout2.bl.n5r1(view2, i2)) {
                    float fM1480z = kja0Var.m1480z(2, x3, y3);
                    float fM1480z2 = kja0Var.m1480z(5, x3, y3);
                    this.f2372k.bl.a98o(view2, i2, "motion:percentX", Float.valueOf(fM1480z));
                    this.f2372k.bl.a98o(view2, i2, "motion:percentY", Float.valueOf(fM1480z2));
                    this.f2372k.cv06();
                    this.f2372k.gbni(true);
                    this.f2372k.invalidate();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.constraintlayout.motion.widget.fn3e
    /* JADX INFO: renamed from: s */
    public Object mo1441s(Object viewObject, float x3, float y3) {
        kja0 kja0Var;
        View view = (View) viewObject;
        MotionLayout motionLayout = this.f2372k;
        if (motionLayout.bl == null) {
            return -1;
        }
        if (view == null || (kja0Var = motionLayout.ay.get(view)) == null) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        return kja0Var.m1478t(viewGroup.getWidth(), viewGroup.getHeight(), x3, y3);
    }

    /* JADX INFO: renamed from: t */
    public boolean m1506t() {
        return (this.f48237zy == null || this.f2374q == null) ? false : true;
    }

    public void t8r(Object view, float[] path) {
        t8r t8rVar = this.f2372k.bl;
        if (t8rVar == null) {
            return;
        }
        int iM1529i = t8rVar.m1529i() / 16;
        kja0 kja0Var = this.f2372k.ay.get(view);
        if (kja0Var == null) {
            return;
        }
        kja0Var.m1479y(path, iM1529i);
    }

    @Override // androidx.constraintlayout.motion.widget.fn3e
    public int toq(int cmd, String type, Object viewObject, float[] in, int inLength, float[] out, int outLength) {
        kja0 kja0Var;
        View view = (View) viewObject;
        if (cmd != 0) {
            MotionLayout motionLayout = this.f2372k;
            if (motionLayout.bl == null || view == null || (kja0Var = motionLayout.ay.get(view)) == null) {
                return -1;
            }
        } else {
            kja0Var = null;
        }
        if (cmd == 0) {
            return 1;
        }
        if (cmd == 1) {
            int iM1529i = this.f2372k.bl.m1529i() / 16;
            kja0Var.m1469g(out, iM1529i);
            return iM1529i;
        }
        if (cmd == 2) {
            int iM1529i2 = this.f2372k.bl.m1529i() / 16;
            kja0Var.m1474n(out, null);
            return iM1529i2;
        }
        if (cmd != 3) {
            return -1;
        }
        int iM1529i3 = this.f2372k.bl.m1529i() / 16;
        return kja0Var.x2(type, out, outLength);
    }

    public String wvg() {
        if (this.f48237zy != null && this.f2374q != null) {
            float fM1507z = m1507z();
            if (fM1507z <= 0.01f) {
                return this.f48237zy;
            }
            if (fM1507z >= 0.99f) {
                return this.f2374q;
            }
        }
        return this.f48237zy;
    }

    @Override // androidx.constraintlayout.motion.widget.fn3e
    /* JADX INFO: renamed from: y */
    public float mo1442y(Object view, int type, float x3, float y3) {
        kja0 kja0Var;
        if ((view instanceof View) && (kja0Var = this.f2372k.ay.get((View) view)) != null) {
            return kja0Var.m1480z(type, x3, y3);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: z */
    public float m1507z() {
        return this.f2372k.getProgress();
    }

    public int zurt(Object view, int[] type, float[] pos) {
        kja0 kja0Var = this.f2372k.ay.get((View) view);
        if (kja0Var == null) {
            return 0;
        }
        return kja0Var.o1t(type, pos);
    }

    @Override // androidx.constraintlayout.motion.widget.fn3e
    public Boolean zy(Object keyFrame, Object view, float x3, float y3, String[] attribute, float[] value) {
        if (!(keyFrame instanceof ld6)) {
            return Boolean.FALSE;
        }
        View view2 = (View) view;
        this.f2372k.ay.get(view2).m1476r(view2, (ld6) keyFrame, x3, y3, attribute, value);
        this.f2372k.cv06();
        this.f2372k.bd = true;
        return Boolean.TRUE;
    }
}
