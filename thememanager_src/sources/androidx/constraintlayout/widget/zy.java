package androidx.constraintlayout.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.android.thememanager.util.hb;
import com.google.android.exoplayer2.text.ttml.C3678q;

/* JADX INFO: compiled from: ConstraintProperties.java */
/* JADX INFO: loaded from: classes.dex */
public class zy {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final int f50009f7l8 = 5;

    /* JADX INFO: renamed from: g */
    public static final int f3048g = 4;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    public static final int f50010kja0 = 0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public static final int f50011ld6 = 0;

    /* JADX INFO: renamed from: n */
    public static final int f3049n = 3;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    public static final int f50012n7h = 1;

    /* JADX INFO: renamed from: p */
    public static final int f3050p = -1;

    /* JADX INFO: renamed from: q */
    public static final int f3051q = 2;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    public static final int f50013qrj = -2;

    /* JADX INFO: renamed from: s */
    public static final int f3052s = 7;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final int f50014x2 = 0;

    /* JADX INFO: renamed from: y */
    public static final int f3053y = 6;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final int f50015zy = 1;

    /* JADX INFO: renamed from: k */
    ConstraintLayout.toq f3054k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    View f50016toq;

    public zy(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ConstraintLayout.toq)) {
            throw new RuntimeException("Only children of ConstraintLayout.LayoutParams supported");
        }
        this.f3054k = (ConstraintLayout.toq) layoutParams;
        this.f50016toq = view;
    }

    private String eqxt(int side) {
        switch (side) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return hb.f61266fu4;
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return C3678q.f65807ch;
            default:
                return "undefined";
        }
    }

    public zy a9() {
        ConstraintLayout.toq toqVar = this.f3054k;
        int i2 = toqVar.f2650p;
        int i3 = toqVar.f48496ld6;
        if (i2 != -1 || i3 != -1) {
            zy zyVar = new zy(((ViewGroup) this.f50016toq.getParent()).findViewById(i2));
            zy zyVar2 = new zy(((ViewGroup) this.f50016toq.getParent()).findViewById(i3));
            ConstraintLayout.toq toqVar2 = this.f3054k;
            if (i2 != -1 && i3 != -1) {
                zyVar.qrj(4, i3, 3, 0);
                zyVar2.qrj(3, i2, 4, 0);
            } else if (i2 != -1 || i3 != -1) {
                int i4 = toqVar2.f48516x2;
                if (i4 != -1) {
                    zyVar.qrj(4, i4, 4, 0);
                } else {
                    int i5 = toqVar2.f2653s;
                    if (i5 != -1) {
                        zyVar2.qrj(3, i5, 3, 0);
                    }
                }
            }
        }
        mcp(3);
        mcp(4);
        return this;
    }

    /* JADX INFO: renamed from: c */
    public zy m1711c(int visibility) {
        this.f50016toq.setVisibility(visibility);
        return this;
    }

    public zy cdj(int height) {
        this.f3054k.f2640f = height;
        return this;
    }

    public zy d2ok(float transformPivotX, float transformPivotY) {
        this.f50016toq.setPivotX(transformPivotX);
        this.f50016toq.setPivotY(transformPivotY);
        return this;
    }

    public zy d3(float scaleX) {
        this.f50016toq.setScaleY(scaleX);
        return this;
    }

    public zy dd(float translationX, float translationY) {
        this.f50016toq.setTranslationX(translationX);
        this.f50016toq.setTranslationY(translationY);
        return this;
    }

    /* JADX INFO: renamed from: f */
    public zy m1712f(float weight) {
        this.f3054k.f48499lvui = weight;
        return this;
    }

    public zy f7l8(int toView) {
        if (toView == 0) {
            m1713g(0, 1, 0, 0, 2, 0, 0.5f);
        } else {
            m1713g(toView, 2, 0, toView, 1, 0, 0.5f);
        }
        return this;
    }

    public zy fn3e(int width) {
        ((ViewGroup.MarginLayoutParams) this.f3054k).width = width;
        return this;
    }

    public zy fti(float rotation) {
        this.f50016toq.setRotation(rotation);
        return this;
    }

    public zy fu4(int anchor, int value) {
        switch (anchor) {
            case 1:
                this.f3054k.f48504ni7 = value;
                return this;
            case 2:
                this.f3054k.f2658z = value;
                return this;
            case 3:
                this.f3054k.f48487fu4 = value;
                return this;
            case 4:
                this.f3054k.f48507o1t = value;
                return this;
            case 5:
                throw new IllegalArgumentException("baseline does not support margins");
            case 6:
                this.f3054k.f48515wvg = value;
                return this;
            case 7:
                this.f3054k.f2654t = value;
                return this;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    /* JADX INFO: renamed from: g */
    public zy m1713g(int firstID, int firstSide, int firstMargin, int secondId, int secondSide, int secondMargin, float bias) {
        if (firstMargin < 0) {
            throw new IllegalArgumentException("margin must be > 0");
        }
        if (secondMargin < 0) {
            throw new IllegalArgumentException("margin must be > 0");
        }
        if (bias <= 0.0f || bias > 1.0f) {
            throw new IllegalArgumentException("bias must be between 0 and 1 inclusive");
        }
        if (firstSide == 1 || firstSide == 2) {
            qrj(1, firstID, firstSide, firstMargin);
            qrj(2, secondId, secondSide, secondMargin);
            this.f3054k.f48493jp0y = bias;
        } else if (firstSide == 6 || firstSide == 7) {
            qrj(6, firstID, firstSide, firstMargin);
            qrj(7, secondId, secondSide, secondMargin);
            this.f3054k.f48493jp0y = bias;
        } else {
            qrj(3, firstID, firstSide, firstMargin);
            qrj(4, secondId, secondSide, secondMargin);
            this.f3054k.f48488gvn7 = bias;
        }
        return this;
    }

    public zy gvn7(float rotationY) {
        this.f50016toq.setRotationY(rotationY);
        return this;
    }

    /* JADX INFO: renamed from: h */
    public zy m1714h(int height) {
        ((ViewGroup.MarginLayoutParams) this.f3054k).height = height;
        return this;
    }

    public zy hyr(int chainStyle) {
        this.f3054k.f48481dd = chainStyle;
        return this;
    }

    /* JADX INFO: renamed from: i */
    public zy m1715i(int width) {
        this.f3054k.f2646l = width;
        return this;
    }

    public zy jk() {
        ConstraintLayout.toq toqVar = this.f3054k;
        int i2 = toqVar.f2641g;
        int i3 = toqVar.f48484f7l8;
        if (i2 == -1 && i3 == -1) {
            int i4 = toqVar.f48511t8r;
            int i5 = toqVar.f48485fn3e;
            if (i4 != -1 || i5 != -1) {
                zy zyVar = new zy(((ViewGroup) this.f50016toq.getParent()).findViewById(i4));
                zy zyVar2 = new zy(((ViewGroup) this.f50016toq.getParent()).findViewById(i5));
                ConstraintLayout.toq toqVar2 = this.f3054k;
                if (i4 != -1 && i5 != -1) {
                    zyVar.qrj(7, i5, 6, 0);
                    zyVar2.qrj(6, i2, 7, 0);
                } else if (i2 != -1 || i5 != -1) {
                    int i6 = toqVar2.f2657y;
                    if (i6 != -1) {
                        zyVar.qrj(7, i6, 7, 0);
                    } else {
                        int i7 = toqVar2.f2648n;
                        if (i7 != -1) {
                            zyVar2.qrj(6, i7, 6, 0);
                        }
                    }
                }
            }
            mcp(6);
            mcp(7);
        } else {
            zy zyVar3 = new zy(((ViewGroup) this.f50016toq.getParent()).findViewById(i2));
            zy zyVar4 = new zy(((ViewGroup) this.f50016toq.getParent()).findViewById(i3));
            ConstraintLayout.toq toqVar3 = this.f3054k;
            if (i2 != -1 && i3 != -1) {
                zyVar3.qrj(2, i3, 1, 0);
                zyVar4.qrj(1, i2, 2, 0);
            } else if (i2 != -1 || i3 != -1) {
                int i8 = toqVar3.f2657y;
                if (i8 != -1) {
                    zyVar3.qrj(2, i8, 2, 0);
                } else {
                    int i9 = toqVar3.f2648n;
                    if (i9 != -1) {
                        zyVar4.qrj(1, i9, 1, 0);
                    }
                }
            }
            mcp(1);
            mcp(2);
        }
        return this;
    }

    public zy jp0y(float rotationX) {
        this.f50016toq.setRotationX(rotationX);
        return this;
    }

    /* JADX INFO: renamed from: k */
    public zy m1716k(int leftId, int rightId) {
        qrj(1, leftId, leftId == 0 ? 1 : 2, 0);
        qrj(2, rightId, rightId == 0 ? 2 : 1, 0);
        if (leftId != 0) {
            new zy(((ViewGroup) this.f50016toq.getParent()).findViewById(leftId)).qrj(2, this.f50016toq.getId(), 1, 0);
        }
        if (rightId != 0) {
            new zy(((ViewGroup) this.f50016toq.getParent()).findViewById(rightId)).qrj(1, this.f50016toq.getId(), 2, 0);
        }
        return this;
    }

    public zy ki(int width) {
        this.f3054k.f48490hyr = width;
        return this;
    }

    public zy kja0(int width) {
        this.f3054k.f48517x9kr = width;
        return this;
    }

    /* JADX INFO: renamed from: l */
    public zy m1717l(float translationZ) {
        this.f50016toq.setTranslationZ(translationZ);
        return this;
    }

    public zy ld6(int toView) {
        if (toView == 0) {
            m1713g(0, 3, 0, 0, 4, 0, 0.5f);
        } else {
            m1713g(toView, 4, 0, toView, 3, 0, 0.5f);
        }
        return this;
    }

    public zy lvui(float transformPivotX) {
        this.f50016toq.setPivotX(transformPivotX);
        return this;
    }

    public zy mcp(int anchor) {
        switch (anchor) {
            case 1:
                ConstraintLayout.toq toqVar = this.f3054k;
                toqVar.f2641g = -1;
                toqVar.f2648n = -1;
                ((ViewGroup.MarginLayoutParams) toqVar).leftMargin = -1;
                toqVar.f48504ni7 = Integer.MIN_VALUE;
                return this;
            case 2:
                ConstraintLayout.toq toqVar2 = this.f3054k;
                toqVar2.f2657y = -1;
                toqVar2.f48484f7l8 = -1;
                ((ViewGroup.MarginLayoutParams) toqVar2).rightMargin = -1;
                toqVar2.f2658z = Integer.MIN_VALUE;
                return this;
            case 3:
                ConstraintLayout.toq toqVar3 = this.f3054k;
                toqVar3.f2650p = -1;
                toqVar3.f2653s = -1;
                ((ViewGroup.MarginLayoutParams) toqVar3).topMargin = -1;
                toqVar3.f48487fu4 = Integer.MIN_VALUE;
                return this;
            case 4:
                ConstraintLayout.toq toqVar4 = this.f3054k;
                toqVar4.f48496ld6 = -1;
                toqVar4.f48516x2 = -1;
                ((ViewGroup.MarginLayoutParams) toqVar4).bottomMargin = -1;
                toqVar4.f48507o1t = Integer.MIN_VALUE;
                return this;
            case 5:
                this.f3054k.f48509qrj = -1;
                return this;
            case 6:
                ConstraintLayout.toq toqVar5 = this.f3054k;
                toqVar5.f48511t8r = -1;
                toqVar5.f2643i = -1;
                toqVar5.setMarginStart(-1);
                this.f3054k.f48515wvg = Integer.MIN_VALUE;
                return this;
            case 7:
                ConstraintLayout.toq toqVar6 = this.f3054k;
                toqVar6.f48485fn3e = -1;
                toqVar6.f48522zurt = -1;
                toqVar6.setMarginEnd(-1);
                this.f3054k.f2654t = Integer.MIN_VALUE;
                return this;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    /* JADX INFO: renamed from: n */
    public void m1718n() {
    }

    public zy n5r1(float bias) {
        this.f3054k.f48488gvn7 = bias;
        return this;
    }

    public zy n7h(int height) {
        this.f3054k.f48503ncyb = height;
        return this;
    }

    public zy ncyb(float translationY) {
        this.f50016toq.setTranslationY(translationY);
        return this;
    }

    public zy ni7(float elevation) {
        this.f50016toq.setElevation(elevation);
        return this;
    }

    public zy o1t(int chainStyle) {
        this.f3054k.f2652r = chainStyle;
        return this;
    }

    public zy oc(float scaleY) {
        return this;
    }

    /* JADX INFO: renamed from: p */
    public zy m1719p(int startId, int startSide, int startMargin, int endId, int endSide, int endMargin, float bias) {
        qrj(6, startId, startSide, startMargin);
        qrj(7, endId, endSide, endMargin);
        this.f3054k.f48493jp0y = bias;
        return this;
    }

    /* JADX INFO: renamed from: q */
    public zy m1720q(float alpha) {
        this.f50016toq.setAlpha(alpha);
        return this;
    }

    public zy qrj(int startSide, int endID, int endSide, int margin) {
        switch (startSide) {
            case 1:
                if (endSide == 1) {
                    ConstraintLayout.toq toqVar = this.f3054k;
                    toqVar.f2648n = endID;
                    toqVar.f2641g = -1;
                } else {
                    if (endSide != 2) {
                        throw new IllegalArgumentException("Left to " + eqxt(endSide) + " undefined");
                    }
                    ConstraintLayout.toq toqVar2 = this.f3054k;
                    toqVar2.f2641g = endID;
                    toqVar2.f2648n = -1;
                }
                ((ViewGroup.MarginLayoutParams) this.f3054k).leftMargin = margin;
                return this;
            case 2:
                if (endSide == 1) {
                    ConstraintLayout.toq toqVar3 = this.f3054k;
                    toqVar3.f48484f7l8 = endID;
                    toqVar3.f2657y = -1;
                } else {
                    if (endSide != 2) {
                        throw new IllegalArgumentException("right to " + eqxt(endSide) + " undefined");
                    }
                    ConstraintLayout.toq toqVar4 = this.f3054k;
                    toqVar4.f2657y = endID;
                    toqVar4.f48484f7l8 = -1;
                }
                ((ViewGroup.MarginLayoutParams) this.f3054k).rightMargin = margin;
                return this;
            case 3:
                if (endSide == 3) {
                    ConstraintLayout.toq toqVar5 = this.f3054k;
                    toqVar5.f2653s = endID;
                    toqVar5.f2650p = -1;
                    toqVar5.f48509qrj = -1;
                    toqVar5.f48502n7h = -1;
                    toqVar5.f48495kja0 = -1;
                } else {
                    if (endSide != 4) {
                        throw new IllegalArgumentException("right to " + eqxt(endSide) + " undefined");
                    }
                    ConstraintLayout.toq toqVar6 = this.f3054k;
                    toqVar6.f2650p = endID;
                    toqVar6.f2653s = -1;
                    toqVar6.f48509qrj = -1;
                    toqVar6.f48502n7h = -1;
                    toqVar6.f48495kja0 = -1;
                }
                ((ViewGroup.MarginLayoutParams) this.f3054k).topMargin = margin;
                return this;
            case 4:
                if (endSide == 4) {
                    ConstraintLayout.toq toqVar7 = this.f3054k;
                    toqVar7.f48516x2 = endID;
                    toqVar7.f48496ld6 = -1;
                    toqVar7.f48509qrj = -1;
                    toqVar7.f48502n7h = -1;
                    toqVar7.f48495kja0 = -1;
                } else {
                    if (endSide != 3) {
                        throw new IllegalArgumentException("right to " + eqxt(endSide) + " undefined");
                    }
                    ConstraintLayout.toq toqVar8 = this.f3054k;
                    toqVar8.f48496ld6 = endID;
                    toqVar8.f48516x2 = -1;
                    toqVar8.f48509qrj = -1;
                    toqVar8.f48502n7h = -1;
                    toqVar8.f48495kja0 = -1;
                }
                ((ViewGroup.MarginLayoutParams) this.f3054k).bottomMargin = margin;
                return this;
            case 5:
                if (endSide == 5) {
                    ConstraintLayout.toq toqVar9 = this.f3054k;
                    toqVar9.f48509qrj = endID;
                    toqVar9.f48516x2 = -1;
                    toqVar9.f48496ld6 = -1;
                    toqVar9.f2653s = -1;
                    toqVar9.f2650p = -1;
                }
                if (endSide == 3) {
                    ConstraintLayout.toq toqVar10 = this.f3054k;
                    toqVar10.f48502n7h = endID;
                    toqVar10.f48516x2 = -1;
                    toqVar10.f48496ld6 = -1;
                    toqVar10.f2653s = -1;
                    toqVar10.f2650p = -1;
                } else {
                    if (endSide != 4) {
                        throw new IllegalArgumentException("right to " + eqxt(endSide) + " undefined");
                    }
                    ConstraintLayout.toq toqVar11 = this.f3054k;
                    toqVar11.f48495kja0 = endID;
                    toqVar11.f48516x2 = -1;
                    toqVar11.f48496ld6 = -1;
                    toqVar11.f2653s = -1;
                    toqVar11.f2650p = -1;
                }
                this.f3054k.f48492jk = margin;
                return this;
            case 6:
                if (endSide == 6) {
                    ConstraintLayout.toq toqVar12 = this.f3054k;
                    toqVar12.f2643i = endID;
                    toqVar12.f48511t8r = -1;
                } else {
                    if (endSide != 7) {
                        throw new IllegalArgumentException("right to " + eqxt(endSide) + " undefined");
                    }
                    ConstraintLayout.toq toqVar13 = this.f3054k;
                    toqVar13.f48511t8r = endID;
                    toqVar13.f2643i = -1;
                }
                this.f3054k.setMarginStart(margin);
                return this;
            case 7:
                if (endSide == 7) {
                    ConstraintLayout.toq toqVar14 = this.f3054k;
                    toqVar14.f48522zurt = endID;
                    toqVar14.f48485fn3e = -1;
                } else {
                    if (endSide != 6) {
                        throw new IllegalArgumentException("right to " + eqxt(endSide) + " undefined");
                    }
                    ConstraintLayout.toq toqVar15 = this.f3054k;
                    toqVar15.f48485fn3e = endID;
                    toqVar15.f48522zurt = -1;
                }
                this.f3054k.setMarginEnd(margin);
                return this;
            default:
                throw new IllegalArgumentException(eqxt(startSide) + " to " + eqxt(endSide) + " unknown");
        }
    }

    /* JADX INFO: renamed from: r */
    public zy m1721r(float transformPivotY) {
        this.f50016toq.setPivotY(transformPivotY);
        return this;
    }

    /* JADX INFO: renamed from: s */
    public zy m1722s(int toView) {
        if (toView == 0) {
            m1713g(0, 6, 0, 0, 7, 0, 0.5f);
        } else {
            m1713g(toView, 7, 0, toView, 6, 0, 0.5f);
        }
        return this;
    }

    /* JADX INFO: renamed from: t */
    public zy m1723t(int anchor, int value) {
        switch (anchor) {
            case 1:
                ((ViewGroup.MarginLayoutParams) this.f3054k).leftMargin = value;
                return this;
            case 2:
                ((ViewGroup.MarginLayoutParams) this.f3054k).rightMargin = value;
                return this;
            case 3:
                ((ViewGroup.MarginLayoutParams) this.f3054k).topMargin = value;
                return this;
            case 4:
                ((ViewGroup.MarginLayoutParams) this.f3054k).bottomMargin = value;
                return this;
            case 5:
                throw new IllegalArgumentException("baseline does not support margins");
            case 6:
                this.f3054k.setMarginStart(value);
                return this;
            case 7:
                this.f3054k.setMarginEnd(value);
                return this;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public zy t8r(int height) {
        this.f3054k.f48501n5r1 = height;
        return this;
    }

    public zy toq(int leftId, int rightId) {
        qrj(6, leftId, leftId == 0 ? 6 : 7, 0);
        qrj(7, rightId, rightId == 0 ? 7 : 6, 0);
        if (leftId != 0) {
            new zy(((ViewGroup) this.f50016toq.getParent()).findViewById(leftId)).qrj(7, this.f50016toq.getId(), 6, 0);
        }
        if (rightId != 0) {
            new zy(((ViewGroup) this.f50016toq.getParent()).findViewById(rightId)).qrj(6, this.f50016toq.getId(), 7, 0);
        }
        return this;
    }

    public zy wvg(float weight) {
        this.f3054k.f48479d2ok = weight;
        return this;
    }

    public zy x2(int topId, int topSide, int topMargin, int bottomId, int bottomSide, int bottomMargin, float bias) {
        qrj(3, topId, topSide, topMargin);
        qrj(4, bottomId, bottomSide, bottomMargin);
        this.f3054k.f48488gvn7 = bias;
        return this;
    }

    public zy x9kr(float translationX) {
        this.f50016toq.setTranslationX(translationX);
        return this;
    }

    /* JADX INFO: renamed from: y */
    public zy m1724y(int leftId, int leftSide, int leftMargin, int rightId, int rightSide, int rightMargin, float bias) {
        qrj(1, leftId, leftSide, leftMargin);
        qrj(2, rightId, rightSide, rightMargin);
        this.f3054k.f48493jp0y = bias;
        return this;
    }

    /* JADX INFO: renamed from: z */
    public zy m1725z(float bias) {
        this.f3054k.f48493jp0y = bias;
        return this;
    }

    public zy zurt(String ratio) {
        this.f3054k.f48480d3 = ratio;
        return this;
    }

    public zy zy(int topId, int bottomId) {
        qrj(3, topId, topId == 0 ? 3 : 4, 0);
        qrj(4, bottomId, bottomId == 0 ? 4 : 3, 0);
        if (topId != 0) {
            new zy(((ViewGroup) this.f50016toq.getParent()).findViewById(topId)).qrj(4, this.f50016toq.getId(), 3, 0);
        }
        if (bottomId != 0) {
            new zy(((ViewGroup) this.f50016toq.getParent()).findViewById(bottomId)).qrj(3, this.f50016toq.getId(), 4, 0);
        }
        return this;
    }
}
