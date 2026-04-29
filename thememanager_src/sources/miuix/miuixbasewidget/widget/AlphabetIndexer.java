package miuix.miuixbasewidget.widget;

import android.R;
import android.annotation.NonNull;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.VibrationAttributes;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SectionIndexer;
import android.widget.TextView;
import androidx.appcompat.widget.nmn5;
import androidx.core.view.qrj;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import miuix.animation.Folme;
import miuix.animation.IVisibleStyle;
import miuix.animation.base.AnimConfig;
import miuix.animation.listener.TransitionListener;
import miuix.animation.listener.UpdateInfo;
import miuix.animation.property.FloatProperty;
import miuix.animation.property.ViewProperty;
import miuix.core.util.C7080i;
import miuix.view.C7385p;
import miuix.view.HapticCompat;
import p023g.C6045k;
import vwb.toq;
import zy.dd;
import zy.hyr;
import zy.lvui;

/* JADX INFO: loaded from: classes3.dex */
public class AlphabetIndexer extends LinearLayout {
    public static final String ad = "!";
    public static final int aj = 0;
    private static final String am = "♥";
    public static final int ay = 0;
    private static final int be = 1;
    public static final int bs = 1;

    /* JADX INFO: renamed from: a */
    HashMap<Object, Integer> f40524a;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private View f87828ab;
    private int ac;
    private boolean an;
    private View.OnLayoutChangeListener as;
    private int ax;
    private VibrationAttributes az;

    /* JADX INFO: renamed from: b */
    private int f40525b;
    private boolean ba;
    private ImageView bb;
    private miuix.util.toq bg;
    private View bl;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private f7l8 f87829bo;
    private TextPaint bp;
    private Handler bq;
    private boolean bv;

    /* JADX INFO: renamed from: c */
    private int f40526c;

    /* JADX INFO: renamed from: d */
    @dd
    private InterfaceC7187n f40527d;

    /* JADX INFO: renamed from: e */
    private int f40528e;

    /* JADX INFO: renamed from: f */
    private boolean f40529f;

    /* JADX INFO: renamed from: g */
    private int f40530g;

    /* JADX INFO: renamed from: h */
    private int f40531h;

    /* JADX INFO: renamed from: i */
    private int f40532i;
    private int id;
    private SectionIndexer in;

    /* JADX INFO: renamed from: j */
    private int f40533j;

    /* JADX INFO: renamed from: k */
    private final int f40534k;

    /* JADX INFO: renamed from: l */
    private int f40535l;

    /* JADX INFO: renamed from: m */
    private int f40536m;

    /* JADX INFO: renamed from: n */
    private int f40537n;

    /* JADX INFO: renamed from: o */
    private Drawable f40538o;

    /* JADX INFO: renamed from: p */
    private int f40539p;

    /* JADX INFO: renamed from: q */
    private int f40540q;

    /* JADX INFO: renamed from: r */
    private int f40541r;

    /* JADX INFO: renamed from: s */
    private int f40542s;

    /* JADX INFO: renamed from: t */
    private int f40543t;

    /* JADX INFO: renamed from: u */
    private AnimConfig f40544u;

    /* JADX INFO: renamed from: v */
    private int f40545v;

    /* JADX INFO: renamed from: w */
    private TextView f40546w;

    /* JADX INFO: renamed from: x */
    private AnimConfig f40547x;

    /* JADX INFO: renamed from: y */
    private int f40548y;

    /* JADX INFO: renamed from: z */
    private int f40549z;

    private static class f7l8 {

        /* JADX INFO: renamed from: k */
        String[] f40550k;

        /* JADX INFO: renamed from: n */
        int f40551n;

        /* JADX INFO: renamed from: q */
        int f40552q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        int f87830toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        int f87831zy;

        f7l8(Context context, TypedArray typedArray) {
            Resources resources = context.getResources();
            CharSequence[] textArray = typedArray.getTextArray(toq.kja0.txs);
            if (textArray != null) {
                this.f40550k = new String[textArray.length];
                int length = textArray.length;
                int i2 = 0;
                int i3 = 0;
                while (i2 < length) {
                    this.f40550k[i3] = textArray[i2].toString();
                    i2++;
                    i3++;
                }
            } else {
                this.f40550k = resources.getStringArray(toq.zy.f97038toq);
            }
            ColorStateList colorStateListM22274k = C6045k.m22274k(context, typedArray.getResourceId(toq.kja0.g0, toq.C7709g.f44764v));
            this.f40552q = colorStateListM22274k.getColorForState(new int[]{R.attr.state_selected}, resources.getColor(toq.C7709g.f95765ch));
            this.f87831zy = colorStateListM22274k.getColorForState(new int[]{R.attr.state_activated}, resources.getColor(toq.C7709g.f95746a98o));
            this.f87830toq = colorStateListM22274k.getColorForState(new int[0], resources.getColor(toq.C7709g.f95803gyi));
            this.f40551n = typedArray.getDimensionPixelSize(toq.kja0.q0, resources.getDimensionPixelSize(toq.f7l8.f95738zkd));
        }
    }

    /* JADX INFO: renamed from: miuix.miuixbasewidget.widget.AlphabetIndexer$g */
    public class C7185g {

        /* JADX INFO: renamed from: k */
        int f40553k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        int f87832toq;

        public C7185g() {
        }
    }

    /* JADX INFO: renamed from: miuix.miuixbasewidget.widget.AlphabetIndexer$k */
    class ViewOnLayoutChangeListenerC7186k implements View.OnLayoutChangeListener {
        ViewOnLayoutChangeListenerC7186k() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            int i10 = i5 - i3;
            if (i9 - i7 != i10) {
                AlphabetIndexer.this.x9kr(i10);
            }
        }
    }

    /* JADX INFO: renamed from: miuix.miuixbasewidget.widget.AlphabetIndexer$n */
    public interface InterfaceC7187n {
        int getItemCount();

        /* JADX INFO: renamed from: k */
        int m26063k();

        /* JADX INFO: renamed from: q */
        int m26064q();

        void toq();

        void zy(int i2);
    }

    /* JADX INFO: renamed from: miuix.miuixbasewidget.widget.AlphabetIndexer$q */
    class HandlerC7188q extends Handler {
        HandlerC7188q() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                return;
            }
            AlphabetIndexer.this.wvg();
        }
    }

    class toq extends TransitionListener {
        toq() {
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onComplete(Object obj) {
            super.onComplete(obj);
            if (AlphabetIndexer.this.isPressed() || !AlphabetIndexer.this.ba) {
                return;
            }
            AlphabetIndexer.this.lvui(0);
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onUpdate(Object obj, Collection<UpdateInfo> collection) {
            super.onUpdate(obj, collection);
            for (UpdateInfo updateInfo : collection) {
                if (updateInfo.property == ViewProperty.SCALE_X) {
                    AlphabetIndexer.this.hyr(updateInfo.getFloatValue());
                    return;
                }
            }
        }
    }

    class zy extends TransitionListener {
        zy() {
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onBegin(Object obj, Collection<UpdateInfo> collection) {
            super.onBegin(obj, collection);
            Iterator<UpdateInfo> it = collection.iterator();
            while (it.hasNext()) {
                if (it.next().property == ViewProperty.AUTO_ALPHA) {
                    AlphabetIndexer.this.bv = false;
                    return;
                }
            }
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onUpdate(Object obj, Collection<UpdateInfo> collection) {
            super.onUpdate(obj, collection);
            for (UpdateInfo updateInfo : collection) {
                FloatProperty floatProperty = updateInfo.property;
                if (floatProperty == ViewProperty.SCALE_X) {
                    AlphabetIndexer.this.hyr(updateInfo.getFloatValue());
                } else if (floatProperty == ViewProperty.AUTO_ALPHA && !AlphabetIndexer.this.bv) {
                    AlphabetIndexer.this.n5r1(updateInfo.getFloatValue());
                }
            }
        }
    }

    public AlphabetIndexer(Context context) {
        this(context, null);
    }

    @hyr(api = 30)
    private void cdj(int i2) {
        getHapticFeedbackCompat().fn3e(getUsageAlarmVibrationAttributes(), i2);
    }

    private void d2ok() {
        TextView textView = this.f40546w;
        if (textView != null) {
            Folme.useAt(textView).visible().setFlags(1L).setScale(0.0f, IVisibleStyle.VisibleType.HIDE).setScale(1.0f, IVisibleStyle.VisibleType.SHOW).show(this.f40547x);
        }
    }

    private void d3() {
        this.f40549z = 0;
        this.f40531h = 0;
        this.f40543t = -1;
        this.f87828ab = null;
        this.bb = null;
        removeAllViews();
    }

    private void dd(int i2) {
        View childAt = getChildAt(0);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
        layoutParams.bottomMargin = i2;
        layoutParams.topMargin = i2;
        childAt.setLayoutParams(layoutParams);
        this.f40548y = i2;
    }

    private C7185g eqxt(int i2, SectionIndexer sectionIndexer, boolean z2) {
        if (this.f40527d == null) {
            return null;
        }
        int iNi7 = z2 ? ni7(i2, sectionIndexer) : zurt(i2, sectionIndexer);
        if (iNi7 >= 0) {
            C7185g c7185gFu4 = fu4(sectionIndexer, iNi7);
            oc(sectionIndexer, c7185gFu4);
            return c7185gFu4;
        }
        this.f40527d.zy(0);
        C7185g c7185g = new C7185g();
        c7185g.f87832toq = 0;
        c7185g.f40553k = 0;
        return c7185g;
    }

    /* JADX INFO: renamed from: f */
    private void m26049f() {
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(toq.f7l8.f95704se);
        setPadding(getPaddingStart(), dimensionPixelOffset, getPaddingEnd(), dimensionPixelOffset);
    }

    private int fn3e(String str) {
        int i2 = this.f40541r;
        int i3 = 0;
        while (true) {
            String[] strArr = this.f87829bo.f40550k;
            if (i3 >= strArr.length) {
                break;
            }
            if (TextUtils.equals(str, strArr[i3])) {
                i2 = i3;
            }
            i3++;
        }
        if (i2 == -1) {
            return 0;
        }
        return i2;
    }

    private C7185g fu4(SectionIndexer sectionIndexer, int i2) {
        C7185g c7185g = new C7185g();
        int itemCount = this.f40527d.getItemCount();
        int listOffset = getListOffset();
        float f2 = (1.0f / itemCount) / 8.0f;
        Object[] sections = sectionIndexer.getSections();
        if (sections == null || sections.length <= 1) {
            int iRound = Math.round(i2 * itemCount);
            c7185g.f40553k = -1;
            c7185g.f87832toq = iRound + listOffset;
        } else {
            int length = sections.length;
            int i3 = i2 >= length ? length - 1 : i2;
            c7185g.f40553k = i3;
            int positionForSection = sectionIndexer.getPositionForSection(i3);
            int i4 = i3 + 1;
            int positionForSection2 = i3 < length + (-1) ? sectionIndexer.getPositionForSection(i4) : itemCount;
            int i5 = i3;
            if (positionForSection2 == positionForSection) {
                int positionForSection3 = positionForSection;
                while (true) {
                    if (i5 <= 0) {
                        break;
                    }
                    i5--;
                    positionForSection3 = sectionIndexer.getPositionForSection(i5);
                    if (positionForSection3 != positionForSection) {
                        c7185g.f40553k = i5;
                        break;
                    }
                    if (i5 == 0) {
                        c7185g.f40553k = 0;
                        break;
                    }
                }
                i5 = i3;
                positionForSection = positionForSection3;
            }
            int i6 = i4 + 1;
            while (i6 < length && sectionIndexer.getPositionForSection(i6) == positionForSection2) {
                i6++;
                i4++;
            }
            float f3 = length;
            float f4 = i5 / f3;
            float f5 = i4 / f3;
            float f6 = i2 / f3;
            if (i5 != i3 || f6 - f4 >= f2) {
                positionForSection += Math.round(((positionForSection2 - positionForSection) * (f6 - f4)) / (f5 - f4));
            }
            int i7 = itemCount - 1;
            if (positionForSection > i7) {
                positionForSection = i7;
            }
            c7185g.f87832toq = positionForSection + listOffset;
        }
        return c7185g;
    }

    private miuix.util.toq getHapticFeedbackCompat() {
        if (this.bg == null) {
            this.bg = new miuix.util.toq(getContext());
        }
        return this.bg;
    }

    private int getListOffset() {
        InterfaceC7187n interfaceC7187n = this.f40527d;
        if (interfaceC7187n == null) {
            return 0;
        }
        return interfaceC7187n.m26063k();
    }

    private int getMarginBottom() {
        return ((ViewGroup.MarginLayoutParams) getLayoutParams()).bottomMargin;
    }

    private int getMarginTop() {
        return ((ViewGroup.MarginLayoutParams) getLayoutParams()).topMargin;
    }

    private int getMarinEnd() {
        return ((ViewGroup.MarginLayoutParams) getLayoutParams()).getMarginEnd();
    }

    private SectionIndexer getSectionIndexer() {
        return this.in;
    }

    @hyr(api = 30)
    private VibrationAttributes getUsageAlarmVibrationAttributes() {
        if (this.az == null) {
            this.az = new Object() { // from class: android.os.VibrationAttributes.Builder
                static {
                    throw new NoClassDefFoundError();
                }

                @NonNull
                public native /* synthetic */ VibrationAttributes build();

                @NonNull
                public native /* synthetic */ Builder setUsage(int i2);
            }.setUsage(17).build();
        }
        return this.az;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0044 A[EDGE_INSN: B:26:0x0044->B:19:0x0044 BREAK  A[LOOP:0: B:13:0x0031->B:18:0x0041]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void gvn7() {
        /*
            r5 = this;
            miuix.miuixbasewidget.widget.AlphabetIndexer$n r0 = r5.f40527d
            if (r0 != 0) goto L5
            return
        L5:
            android.widget.SectionIndexer r0 = r5.getSectionIndexer()
            if (r0 != 0) goto Lc
            return
        Lc:
            miuix.miuixbasewidget.widget.AlphabetIndexer$n r1 = r5.f40527d
            int r1 = r1.m26064q()
            int r2 = r5.getListOffset()
            int r1 = r1 - r2
            int r1 = r0.getSectionForPosition(r1)
            r2 = -1
            if (r1 == r2) goto L44
            java.lang.Object[] r0 = r0.getSections()
            r0 = r0[r1]
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L44
            java.lang.String r0 = r0.toUpperCase()
            r1 = 0
        L31:
            miuix.miuixbasewidget.widget.AlphabetIndexer$f7l8 r3 = r5.f87829bo
            java.lang.String[] r3 = r3.f40550k
            int r4 = r3.length
            if (r1 >= r4) goto L44
            r3 = r3[r1]
            boolean r3 = android.text.TextUtils.equals(r0, r3)
            if (r3 == 0) goto L41
            goto L45
        L41:
            int r1 = r1 + 1
            goto L31
        L44:
            r1 = r2
        L45:
            if (r1 == r2) goto L4d
            int r0 = r5.f40541r
            if (r0 == r1) goto L4d
            r5.f40541r = r1
        L4d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.miuixbasewidget.widget.AlphabetIndexer.gvn7():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hyr(float f2) {
        float width = (this.f40546w.getWidth() / 2) * (1.0f - f2);
        if (nmn5.toq(this)) {
            width *= -1.0f;
        }
        this.f40546w.setTranslationX(width);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0057 A[PHI: r0
      0x0057: PHI (r0v8 int) = (r0v7 int), (r0v12 int) binds: [B:30:0x0055, B:23:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int m26051i(int r7) {
        /*
            r6 = this;
            miuix.miuixbasewidget.widget.AlphabetIndexer$f7l8 r0 = r6.f87829bo
            java.lang.String[] r0 = r0.f40550k
            int r0 = r0.length
            int r1 = r0 + (-1)
            if (r7 <= r1) goto Lb
            r2 = r1
            goto Lc
        Lb:
            r2 = r7
        Lc:
            int r3 = r6.getChildCount()
            if (r3 == r0) goto L5a
            int r3 = r6.f40531h
            r4 = 1
            if (r3 <= r4) goto L5a
            if (r7 <= r4) goto L5a
            int r0 = r0 + (-2)
            r5 = 0
            if (r7 < r0) goto L2a
            int r7 = r6.f40549z
            int r7 = r7 * 2
            int r7 = r7 + r4
            if (r2 != r1) goto L26
            goto L27
        L26:
            r4 = r5
        L27:
            int r2 = r7 + r4
            goto L5a
        L2a:
            int r0 = r6.f40532i
            if (r0 <= 0) goto L4e
            int r1 = r3 + 1
            int r1 = r1 * r0
            if (r7 >= r1) goto L3e
            int r3 = r3 + r4
            int r7 = r7 - r4
            int r0 = r7 / r3
            int r7 = r7 % r3
            int r0 = r0 * 2
            int r0 = r0 + r4
            if (r7 != 0) goto L58
            goto L57
        L3e:
            int r1 = r7 - r0
            int r1 = r1 - r4
            int r1 = r1 / r3
            int r7 = r7 - r0
            int r7 = r7 - r4
            int r7 = r7 % r3
            int r1 = r1 * 2
            int r1 = r1 + r4
            if (r7 != 0) goto L4b
            r4 = r5
        L4b:
            int r2 = r1 + r4
            goto L5a
        L4e:
            int r7 = r7 - r4
            int r0 = r7 / r3
            int r7 = r7 % r3
            int r0 = r0 * 2
            int r0 = r0 + r4
            if (r7 != 0) goto L58
        L57:
            r4 = r5
        L58:
            int r2 = r0 + r4
        L5a:
            int r7 = r6.jk(r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.miuixbasewidget.widget.AlphabetIndexer.m26051i(int):int");
    }

    private int jk(int i2) {
        if (i2 < 0) {
            return 0;
        }
        return i2 >= getChildCount() ? getChildCount() - 1 : i2;
    }

    private void jp0y(AttributeSet attributeSet, int i2) {
        Resources resources = getContext().getResources();
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, toq.kja0.ts4, i2, toq.n7h.l7o);
        this.f87829bo = new f7l8(getContext(), typedArrayObtainStyledAttributes);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(toq.kja0.jzp, true);
        this.f40529f = z2;
        if (z2) {
            this.f40526c = typedArrayObtainStyledAttributes.getDimensionPixelSize(toq.kja0.g2h, resources.getDimensionPixelSize(toq.f7l8.f95614bwp));
            this.f40528e = typedArrayObtainStyledAttributes.getColor(toq.kja0.avdu, resources.getColor(toq.C7709g.f95928y2));
            this.f40533j = typedArrayObtainStyledAttributes.getResourceId(toq.kja0.g74f, toq.n7h.cc1);
            this.f40538o = typedArrayObtainStyledAttributes.getDrawable(toq.kja0.vllq);
            this.f40537n = resources.getDimensionPixelOffset(toq.f7l8.f95716v0af);
            this.f40530g = resources.getDimensionPixelOffset(toq.f7l8.f95736z4);
            int i3 = toq.f7l8.f95632etdu;
            this.f40548y = resources.getDimensionPixelOffset(i3);
            this.f40542s = resources.getDimensionPixelOffset(i3);
            this.f40539p = resources.getDimensionPixelOffset(toq.f7l8.f95618cfr);
            this.f40525b = resources.getDimensionPixelOffset(toq.f7l8.f95713uj2j);
            this.f40536m = resources.getDimensionPixelOffset(toq.f7l8.f95615bz2);
            this.id = resources.getDimensionPixelOffset(toq.f7l8.f95722w831);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void ki(CharSequence charSequence) {
        int iFn3e;
        int i2;
        if (TextUtils.isEmpty(charSequence) || (i2 = this.f40543t) == (iFn3e = fn3e(charSequence.toString().toUpperCase()))) {
            return;
        }
        x2(i2);
        setChecked(iFn3e);
    }

    private void kja0() {
        if (this.f40529f) {
            FrameLayout frameLayout = (FrameLayout) getParent();
            this.f40546w = new TextView(getContext());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f40525b, this.f40536m, qrj.f50866zy);
            layoutParams.topMargin = ((FrameLayout.LayoutParams) getLayoutParams()).topMargin;
            layoutParams.setMarginEnd(this.id + getMarinEnd());
            this.f40546w.setLayoutParams(layoutParams);
            this.f40546w.setTextAlignment(5);
            this.f40546w.setBackgroundDrawable(this.f40538o);
            this.f40546w.setGravity(16);
            this.f40546w.setTextSize(0, this.f40526c);
            this.f40546w.setTextColor(this.f40528e);
            this.f40546w.setVisibility(0);
            this.f40546w.setAlpha(0.0f);
            this.f40546w.setScaleX(0.0f);
            this.f40546w.setScaleY(0.0f);
            this.f40546w.setTextAppearance(this.f40533j);
            this.bp = this.f40546w.getPaint();
            frameLayout.addView(this.f40546w);
        }
    }

    /* JADX INFO: renamed from: l */
    private void m26053l() {
        TextView textView = this.f40546w;
        if (textView != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
            layoutParams.setMarginEnd(this.id + getMarinEnd());
            this.f40546w.setLayoutParams(layoutParams);
        }
    }

    private int ld6(int i2) {
        int iM26051i = m26051i(i2);
        View childAt = getChildAt(iM26051i);
        if (childAt == null) {
            return 0;
        }
        int top = (childAt.getTop() + childAt.getBottom()) / 2;
        if (top <= 0) {
            top = (int) (((((double) (iM26051i + 1)) + 0.5d) * ((double) this.f40537n)) + ((double) getPaddingTop()));
        }
        return top + getMarginTop();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lvui(int i2) {
        this.bq.removeMessages(1);
        this.bq.sendMessageDelayed(this.bq.obtainMessage(1), i2 <= 0 ? 0L : i2);
    }

    private void mcp() {
        AnimConfig animConfig = new AnimConfig();
        this.f40547x = animConfig;
        animConfig.addListeners(new toq());
        AnimConfig animConfig2 = new AnimConfig();
        this.f40544u = animConfig2;
        animConfig2.addListeners(new zy());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n5r1(float f2) {
        TextView textView = this.f40546w;
        textView.setTextColor(textView.getTextColors().withAlpha((int) (f2 * 255.0f)));
    }

    private void n7h(int i2) {
        int i3;
        int i4;
        int marginTop = getMarginTop() <= 0 ? getMarginTop() + (this.f40536m / 2) + 1 : getMarginTop();
        int marginBottom = getMarginBottom() <= 0 ? getMarginBottom() + (this.f40536m / 2) + 1 : getMarginBottom();
        int paddingTop = (i2 - getPaddingTop()) - getPaddingBottom();
        if (paddingTop + marginTop + marginBottom >= i2) {
            paddingTop -= marginTop + marginBottom;
        }
        int length = this.f87829bo.f40550k.length;
        int i5 = this.f40537n;
        int i6 = this.f40539p;
        int i7 = i5 + (i6 * 2);
        int i8 = this.f40530g + i7 + (i6 * 2);
        int i9 = paddingTop - (i7 * 3);
        int i10 = i9 / i8;
        this.f40549z = i10;
        if (i10 < 1) {
            this.f40549z = 1;
        }
        int i11 = i9 % i8;
        int i12 = length - 3;
        int i13 = this.f40549z;
        int i14 = i12 / i13;
        this.f40531h = i14;
        if (i14 < 2) {
            this.f40531h = 2;
            int i15 = i12 / 2;
            i11 += i8 * (i13 - i15);
            this.f40549z = i15;
        }
        int i16 = this.f40531h;
        int i17 = this.f40549z;
        this.f40532i = i12 - (i16 * i17);
        this.f40548y = i6;
        if (i11 > 0) {
            this.f40548y = i6 + ((i11 / 2) / ((i17 * 2) + 3));
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 1;
        int i18 = this.f40548y;
        layoutParams.bottomMargin = i18;
        layoutParams.topMargin = i18;
        layoutParams.weight = 1.0f;
        Typeface typefaceCreate = Typeface.create(com.android.thememanager.util.dd.f16402k, 0);
        for (int i19 = 0; i19 < length; i19++) {
            int i20 = this.f40531h;
            int i21 = this.f40532i;
            if (i19 < (i20 + 1) * i21) {
                i20++;
                i3 = i19;
            } else {
                i3 = i19 - ((i20 + 1) * i21);
            }
            if (i19 <= 1 || i19 >= length - 2 || (i4 = (i3 - 1) % i20) == 0) {
                String str = this.f87829bo.f40550k[i19];
                TextView textView = new TextView(getContext());
                textView.setTypeface(typefaceCreate);
                textView.setGravity(17);
                textView.setHeight(this.f40537n);
                textView.setIncludeFontPadding(false);
                textView.setTextColor(this.f87829bo.f87830toq);
                textView.setTextSize(0, this.f87829bo.f40551n);
                if (TextUtils.equals(str, ad)) {
                    str = am;
                }
                textView.setText(str);
                textView.setImportantForAccessibility(2);
                attachViewToParent(textView, -1, layoutParams);
            } else if (i4 == 1) {
                ImageView imageView = new ImageView(getContext());
                if (this.bb == null) {
                    this.bb = imageView;
                }
                imageView.setMaxHeight(this.f40530g);
                imageView.setMaxWidth(this.f40530g);
                imageView.setImageResource(toq.C7715y.vddr);
                imageView.setImportantForAccessibility(2);
                attachViewToParent(imageView, -1, layoutParams);
            }
        }
        this.an = true;
    }

    private void ncyb(C7185g c7185g, Object[] objArr) {
        int i2;
        if (c7185g == null || (i2 = c7185g.f40553k) < 0 || objArr == null) {
            return;
        }
        String string = objArr[i2].toString();
        if (TextUtils.isEmpty(string)) {
            return;
        }
        String upperCase = string.toUpperCase();
        CharSequence charSequenceSubSequence = upperCase.subSequence(0, 1);
        c7185g.f40553k = fn3e(upperCase);
        t8r(charSequenceSubSequence, ld6(r4));
    }

    private int ni7(int i2, SectionIndexer sectionIndexer) {
        Object[] sections = sectionIndexer == null ? null : sectionIndexer.getSections();
        if (sections != null && (getHeight() - getPaddingTop()) - getPaddingBottom() > 0 && i2 >= 0) {
            return i2 >= sections.length ? sections.length : i2;
        }
        return -1;
    }

    private boolean o1t() {
        TextView textView = this.f40546w;
        return textView != null && textView.getVisibility() == 0 && this.f40546w.getAlpha() == 1.0f;
    }

    private void oc(@lvui SectionIndexer sectionIndexer, C7185g c7185g) {
        InterfaceC7187n interfaceC7187n = this.f40527d;
        if (interfaceC7187n == null) {
            return;
        }
        interfaceC7187n.toq();
        Object[] sections = sectionIndexer.getSections();
        this.f40527d.zy(c7185g.f87832toq);
        ncyb(c7185g, sections);
    }

    /* JADX INFO: renamed from: p */
    private int m26055p(float f2) {
        int height = this.f40537n + (this.f40548y * 2);
        View childAt = getChildAt(0);
        if (childAt != null) {
            height = (((ViewGroup.MarginLayoutParams) childAt.getLayoutParams()).topMargin * 2) + childAt.getHeight();
        }
        int length = this.f87829bo.f40550k.length;
        int childCount = getChildCount();
        float f3 = height;
        if (f2 <= f3 || (length == childCount && !this.an)) {
            return (int) (f2 / f3);
        }
        int i2 = height * 2;
        if (f2 > (getHeight() - getPaddingTop()) - i2) {
            return (length - 2) + (((int) (f2 - ((getHeight() - getPaddingTop()) - i2))) / height);
        }
        int height2 = this.f40530g + (this.f40548y * 2);
        ImageView imageView = this.bb;
        if (imageView != null) {
            height2 = imageView.getHeight() + (this.f40548y * 2);
        }
        int i3 = height2 + height;
        int i4 = (int) (f2 - f3);
        int i5 = i4 / i3;
        int i6 = i4 % i3 > height ? 1 : 0;
        int i7 = this.f40532i;
        if (i5 < i7) {
            return ((this.f40531h + 1) * i5) + 1 + i6;
        }
        int i8 = this.f40531h;
        return ((i8 + 1) * i7) + 1 + (i8 * (i5 - i7)) + i6;
    }

    private void qrj(int i2) {
        this.f40548y = i2;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 1;
        layoutParams.bottomMargin = i2;
        layoutParams.topMargin = i2;
        layoutParams.weight = 1.0f;
        Typeface typefaceCreate = Typeface.create(com.android.thememanager.util.dd.f16402k, 0);
        for (String str : this.f87829bo.f40550k) {
            TextView textView = new TextView(getContext());
            textView.setTypeface(typefaceCreate);
            textView.setGravity(17);
            textView.setHeight(this.f40537n);
            textView.setIncludeFontPadding(false);
            textView.setTextColor(this.f87829bo.f87830toq);
            textView.setTextSize(0, this.f87829bo.f40551n);
            if (TextUtils.equals(str, ad)) {
                str = am;
            }
            textView.setText(str);
            textView.setImportantForAccessibility(2);
            attachViewToParent(textView, -1, layoutParams);
        }
        this.an = false;
    }

    /* JADX INFO: renamed from: r */
    private void m26057r(View view, boolean z2) {
        if (view instanceof TextView) {
            ((TextView) view).setTextColor(z2 ? this.f87829bo.f40552q : this.f87829bo.f87830toq);
        } else if (view instanceof ImageView) {
            ((ImageView) view).setImageResource(z2 ? toq.C7715y.d6c : toq.C7715y.vddr);
        }
    }

    private void setChecked(int i2) {
        this.f40543t = i2;
        View view = this.f87828ab;
        if (view != null) {
            m26057r(view, false);
        }
        View childAt = getChildAt(m26051i(i2));
        this.f87828ab = childAt;
        m26057r(childAt, true);
        View view2 = this.f87828ab;
        if (view2 != null) {
            view2.requestLayout();
        }
    }

    /* JADX INFO: renamed from: t */
    private void m26058t() {
        this.f40535l = qrj.f50866zy;
        setGravity(1);
        setOrientation(1);
        mcp();
        qrj(this.f40542s);
        setClickable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        setFocusable(true);
        setFocusableInTouchMode(true);
        this.ax = getResources().getConfiguration().screenHeightDp;
    }

    private void t8r(CharSequence charSequence, float f2) {
        if (this.f40527d == null || this.f40546w == null) {
            return;
        }
        this.bv = true;
        if (TextUtils.equals(charSequence, ad)) {
            charSequence = am;
        }
        if (!TextUtils.equals(this.f40546w.getText(), charSequence)) {
            if (Build.VERSION.SDK_INT < 30) {
                HapticCompat.m26766g(this, C7385p.f92240gvn7, C7385p.f92251qrj);
            } else if (HapticCompat.zy(HapticCompat.InterfaceC7379k.f42262b)) {
                cdj(C7385p.f92240gvn7);
            } else {
                cdj(C7385p.f92251qrj);
            }
        }
        this.f40546w.setTranslationY(f2 - getMarginTop());
        n5r1(1.0f);
        this.f40546w.setText(charSequence);
        this.f40546w.setPaddingRelative((this.f40536m - ((int) this.bp.measureText(charSequence.toString()))) / 2, 0, 0, 0);
        this.f40546w.setVisibility(0);
        d2ok();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wvg() {
        TextView textView = this.f40546w;
        if (textView != null) {
            Folme.useAt(textView).visible().setFlags(1L).setScale(1.0f, IVisibleStyle.VisibleType.SHOW).setScale(0.0f, IVisibleStyle.VisibleType.HIDE).hide(this.f40544u);
        }
    }

    private void x2(int i2) {
        if (i2 < 0) {
            return;
        }
        View childAt = getChildAt(m26051i(i2));
        if (childAt instanceof TextView) {
            ((TextView) childAt).setTextColor(this.f87829bo.f87830toq);
        } else if (childAt instanceof ImageView) {
            ((ImageView) childAt).setImageResource(toq.C7715y.vddr);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x9kr(int i2) {
        int sectionForPosition;
        int i3;
        View childAt = getChildAt(0);
        int height = childAt.getHeight();
        int length = (this.f87829bo.f40550k.length * (this.f40537n + (this.f40539p * 2))) + getPaddingTop() + getPaddingBottom();
        int marginTop = getMarginTop() <= 0 ? getMarginTop() + (this.f40536m / 2) + 1 : getMarginTop();
        int marginBottom = getMarginBottom() <= 0 ? getMarginBottom() + (this.f40536m / 2) + 1 : getMarginBottom();
        if (length + marginTop + marginBottom > i2) {
            if (getChildCount() > 0) {
                d3();
            }
            n7h(i2);
            SectionIndexer sectionIndexer = getSectionIndexer();
            InterfaceC7187n interfaceC7187n = this.f40527d;
            if (interfaceC7187n == null || sectionIndexer == null || (i3 = this.f40543t) == (sectionForPosition = sectionIndexer.getSectionForPosition(interfaceC7187n.m26064q()))) {
                return;
            }
            x2(i3);
            setChecked(sectionForPosition);
            return;
        }
        int paddingTop = ((((((i2 - getPaddingTop()) - getPaddingBottom()) - marginTop) - marginBottom) / this.f87829bo.f40550k.length) - this.f40537n) / 2;
        if (getChildCount() != this.f87829bo.f40550k.length) {
            d3();
            qrj(Math.min(this.f40542s, paddingTop));
            return;
        }
        if (Math.min(this.f40542s, paddingTop) != this.f40548y) {
            dd(Math.min(this.f40542s, paddingTop));
            return;
        }
        if (height == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            layoutParams.height = this.f40537n;
            int i4 = this.f40548y;
            layoutParams.topMargin = i4;
            layoutParams.bottomMargin = i4;
            childAt.setLayoutParams(layoutParams);
            return;
        }
        if (height != this.f40537n) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            layoutParams2.height = this.f40537n;
            layoutParams2.topMargin = 0;
            layoutParams2.bottomMargin = 0;
            childAt.setLayoutParams(layoutParams2);
        }
    }

    /* JADX INFO: renamed from: z */
    public static int m26060z(View view) {
        Point point = new Point();
        C7080i.kja0(view.getContext(), point);
        view.measure(View.MeasureSpec.makeMeasureSpec(point.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(point.y, Integer.MIN_VALUE));
        return view.getMeasuredHeight();
    }

    private int zurt(int i2, SectionIndexer sectionIndexer) {
        Object[] sections = sectionIndexer == null ? null : sectionIndexer.getSections();
        if (sections == null || (getHeight() - getPaddingTop()) - getPaddingBottom() <= 0 || i2 < 0) {
            return -1;
        }
        if (i2 >= this.f87829bo.f40550k.length) {
            return sections.length;
        }
        this.f40524a.clear();
        for (int i3 = 0; i3 < sections.length; i3++) {
            this.f40524a.put(sections[i3].toString().toUpperCase(), Integer.valueOf(i3));
        }
        String[] strArr = this.f87829bo.f40550k;
        int i4 = 0;
        while (true) {
            int i5 = i4 + i2;
            if (i5 >= strArr.length && i2 < i4) {
                return 0;
            }
            int i6 = i2 - i4;
            if (i5 < strArr.length && this.f40524a.containsKey(strArr[i5])) {
                return this.f40524a.get(strArr[i5]).intValue();
            }
            if (i6 >= 0 && this.f40524a.containsKey(strArr[i6])) {
                return this.f40524a.get(strArr[i6]).intValue();
            }
            i4++;
        }
    }

    public void a9(int i2) {
        this.f40545v = i2;
    }

    public void fti(int i2, int i3) {
        SectionIndexer sectionIndexer;
        gvn7();
        if (this.f40527d == null || (sectionIndexer = getSectionIndexer()) == null) {
            return;
        }
        ki((String) sectionIndexer.getSections()[sectionIndexer.getSectionForPosition(this.f40527d.m26064q())]);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    public int getIndexerIntrinsicWidth() {
        Drawable background = getBackground();
        if (background != null) {
            return background.getIntrinsicWidth();
        }
        return 0;
    }

    /* JADX INFO: renamed from: h */
    public void m26061h() {
        if (this.f40527d != null) {
            lvui(0);
            FrameLayout frameLayout = (FrameLayout) getParent();
            TextView textView = this.f40546w;
            if (textView != null) {
                frameLayout.removeView(textView);
            }
            setVisibility(8);
            this.f40527d = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        View view = (View) getParent();
        this.bl = view;
        if (view != null) {
            view.addOnLayoutChangeListener(this.as);
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i2 = configuration.screenHeightDp;
        if (i2 != this.ax) {
            this.ax = i2;
            this.f40542s = getResources().getDimensionPixelOffset(toq.f7l8.f95632etdu);
            m26049f();
            m26053l();
            d3();
            qrj(this.f40542s);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        View view = this.bl;
        if (view != null) {
            view.removeOnLayoutChangeListener(this.as);
            this.bl = null;
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int sectionForPosition;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        SectionIndexer sectionIndexer = getSectionIndexer();
        if (!isEnabled() || this.f40527d == null || sectionIndexer == null || sectionIndexer.getSections() == null || (sectionForPosition = sectionIndexer.getSectionForPosition(this.f40527d.m26064q() - getListOffset())) < 0 || sectionForPosition >= sectionIndexer.getSections().length) {
            return;
        }
        if (sectionForPosition > 0) {
            accessibilityNodeInfo.addAction(8192);
        }
        if (sectionForPosition < sectionIndexer.getSections().length - 1) {
            accessibilityNodeInfo.addAction(4096);
        }
        int i2 = Build.VERSION.SDK_INT;
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS);
        accessibilityNodeInfo.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(0, -1.0f, sectionIndexer.getSections().length - 1, sectionForPosition));
        Object obj = sectionIndexer.getSections()[sectionForPosition];
        if (obj instanceof String) {
            String string = (String) obj;
            if (TextUtils.equals(string, ad)) {
                string = getContext().getString(toq.qrj.f96583jk);
            }
            accessibilityNodeInfo.setContentDescription(string);
        }
        if (i2 >= 30) {
            accessibilityNodeInfo.setStateDescription(getContext().getString(toq.qrj.f96588mcp));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0072  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            miuix.miuixbasewidget.widget.AlphabetIndexer$n r0 = r6.f40527d
            r1 = 0
            if (r0 == 0) goto L7b
            int r0 = r6.getVisibility()
            if (r0 == 0) goto Ld
            goto L7b
        Ld:
            android.widget.SectionIndexer r0 = r6.getSectionIndexer()
            if (r0 != 0) goto L17
            r6.lvui(r1)
            return r1
        L17:
            int r2 = r7.getActionMasked()
            float r3 = r7.getY()
            int r4 = r6.getPaddingTop()
            float r4 = (float) r4
            float r3 = r3 - r4
            r4 = 0
            int r5 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r5 < 0) goto L2b
            goto L2c
        L2b:
            r3 = r4
        L2c:
            r4 = 1
            if (r2 == 0) goto L56
            if (r2 == r4) goto L3e
            r5 = 2
            if (r2 == r5) goto L64
            r5 = 3
            if (r2 == r5) goto L3e
            r5 = 5
            if (r2 == r5) goto L56
            r0 = 6
            if (r2 == r0) goto L3e
            goto L7a
        L3e:
            int r0 = r7.getActionIndex()
            int r7 = r7.getPointerId(r0)
            if (r7 == 0) goto L49
            goto L7a
        L49:
            r6.setPressed(r1)
            boolean r7 = r6.o1t()
            if (r7 == 0) goto L7a
            r6.lvui(r1)
            goto L7a
        L56:
            int r2 = r7.getActionIndex()
            int r7 = r7.getPointerId(r2)
            if (r7 == 0) goto L61
            goto L7a
        L61:
            r6.setPressed(r4)
        L64:
            int r7 = r6.m26055p(r3)
            miuix.miuixbasewidget.widget.AlphabetIndexer$g r7 = r6.eqxt(r7, r0, r1)
            int r0 = r6.f40543t
            int r1 = r7.f40553k
            if (r0 == r1) goto L7a
            r6.x2(r0)
            int r7 = r7.f40553k
            r6.setChecked(r7)
        L7a:
            return r4
        L7b:
            r6.lvui(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.miuixbasewidget.widget.AlphabetIndexer.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i2, Bundle bundle) {
        InterfaceC7187n interfaceC7187n;
        if (super.performAccessibilityAction(i2, bundle)) {
            return true;
        }
        SectionIndexer sectionIndexer = getSectionIndexer();
        if (!isEnabled() || (interfaceC7187n = this.f40527d) == null || sectionIndexer == null) {
            return false;
        }
        if (i2 != 4096 && i2 != 8192) {
            return false;
        }
        int sectionForPosition = sectionIndexer.getSectionForPosition(interfaceC7187n.m26064q() - getListOffset());
        int i3 = i2 == 4096 ? sectionForPosition + 1 : sectionForPosition - 1;
        if (i3 <= sectionIndexer.getSections().length - 1 && i3 >= 0) {
            setChecked(eqxt(i3, sectionIndexer, true).f40553k);
            Object string = sectionIndexer.getSections()[ni7(i3, sectionIndexer)];
            if (string instanceof String) {
                String string2 = getContext().getString(toq.qrj.f96577a9);
                Object[] objArr = new Object[1];
                if (TextUtils.equals((String) string, ad)) {
                    string = getContext().getString(toq.qrj.f96583jk);
                }
                objArr[0] = string;
                announceForAccessibility(String.format(string2, objArr));
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: s */
    public void m26062s(InterfaceC7187n interfaceC7187n) {
        if (this.f40527d == interfaceC7187n) {
            return;
        }
        m26061h();
        if (interfaceC7187n == null) {
            return;
        }
        this.f40541r = -1;
        this.f40527d = interfaceC7187n;
        kja0();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.gravity = this.f40535l | 48;
        int i2 = layoutParams.bottomMargin;
        int i3 = this.f40536m;
        layoutParams.bottomMargin = i2 + (i3 / 2) + 1;
        layoutParams.topMargin += (i3 / 2) + 1;
        setLayoutParams(layoutParams);
    }

    public void setSectionIndexer(SectionIndexer sectionIndexer) {
        this.in = sectionIndexer;
    }

    public void setVerticalPosition(boolean z2) {
        this.f40535l = z2 ? qrj.f50866zy : qrj.f50865toq;
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        if (i2 != 0) {
            lvui(0);
            x2(this.f40541r);
        }
    }

    public AlphabetIndexer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, toq.C7713q.dmw0);
    }

    public AlphabetIndexer(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f40534k = -1;
        this.f40531h = 1;
        this.f40532i = 0;
        this.f40549z = 0;
        this.f40543t = -1;
        this.f40524a = new HashMap<>();
        this.f40545v = 0;
        this.an = false;
        this.bl = null;
        this.as = new ViewOnLayoutChangeListenerC7186k();
        this.ba = true;
        this.ax = -1;
        this.bq = new HandlerC7188q();
        this.ac = -1;
        jp0y(attributeSet, i2);
        m26058t();
    }
}
