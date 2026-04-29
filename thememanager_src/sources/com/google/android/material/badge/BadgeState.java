package com.google.android.material.badge;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.google.android.material.internal.cdj;
import com.google.android.material.resources.C4092q;
import ij.C6095k;
import java.util.Locale;
import n2t.C7398k;
import zy.InterfaceC7824b;
import zy.InterfaceC7828g;
import zy.InterfaceC7831j;
import zy.dd;
import zy.hb;
import zy.lvui;
import zy.ncyb;
import zy.nn86;
import zy.uv6;
import zy.x2;

/* JADX INFO: loaded from: classes2.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP})
public final class BadgeState {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final String f67355f7l8 = "badge";

    /* JADX INFO: renamed from: g */
    private static final int f23883g = 4;

    /* JADX INFO: renamed from: k */
    private final State f23884k;

    /* JADX INFO: renamed from: n */
    final float f23885n;

    /* JADX INFO: renamed from: q */
    final float f23886q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final State f67356toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    final float f67357zy;

    BadgeState(Context context, @InterfaceC7824b int i2, @InterfaceC7828g int i3, @hb int i4, @dd State state) {
        State state2 = new State();
        this.f67356toq = state2;
        state = state == null ? new State() : state;
        if (i2 != 0) {
            state.f23890k = i2;
        }
        TypedArray qVar = toq(context, state.f23890k, i3, i4);
        Resources resources = context.getResources();
        this.f67357zy = qVar.getDimensionPixelSize(C6095k.kja0.cb, resources.getDimensionPixelSize(C6095k.g.t8fp));
        this.f23885n = qVar.getDimensionPixelSize(C6095k.kja0.ae4, resources.getDimensionPixelSize(C6095k.g.yvs));
        this.f23886q = qVar.getDimensionPixelSize(C6095k.kja0.ie, resources.getDimensionPixelSize(C6095k.g.km9o));
        state2.f23892q = state.f23892q == -2 ? 255 : state.f23892q;
        state2.contentDescriptionNumberless = state.contentDescriptionNumberless == null ? context.getString(C6095k.qrj.f35701v) : state.contentDescriptionNumberless;
        state2.f23894y = state.f23894y == 0 ? C6095k.x2.f35731k : state.f23894y;
        state2.f23893s = state.f23893s == 0 ? C6095k.qrj.f35683d : state.f23893s;
        state2.isVisible = Boolean.valueOf(state.isVisible == null || state.isVisible.booleanValue());
        state2.f23889g = state.f23889g == -2 ? qVar.getInt(C6095k.kja0.rig, 4) : state.f23889g;
        if (state.f23891n != -2) {
            state2.f23891n = state.f23891n;
        } else {
            int i5 = C6095k.kja0.zi4o;
            if (qVar.hasValue(i5)) {
                state2.f23891n = qVar.getInt(i5, 0);
            } else {
                state2.f23891n = -1;
            }
        }
        state2.backgroundColor = Integer.valueOf(state.backgroundColor == null ? zurt(context, qVar, C6095k.kja0.ln) : state.backgroundColor.intValue());
        if (state.badgeTextColor != null) {
            state2.badgeTextColor = state.badgeTextColor;
        } else {
            int i6 = C6095k.kja0.d9i;
            if (qVar.hasValue(i6)) {
                state2.badgeTextColor = Integer.valueOf(zurt(context, qVar, i6));
            } else {
                state2.badgeTextColor = Integer.valueOf(new C4092q(context, C6095k.n7h.fl).m14744s().getDefaultColor());
            }
        }
        state2.badgeGravity = Integer.valueOf(state.badgeGravity == null ? qVar.getInt(C6095k.kja0.qexj, 8388661) : state.badgeGravity.intValue());
        state2.horizontalOffsetWithoutText = Integer.valueOf(state.horizontalOffsetWithoutText == null ? qVar.getDimensionPixelOffset(C6095k.kja0.jog, 0) : state.horizontalOffsetWithoutText.intValue());
        state2.verticalOffsetWithoutText = Integer.valueOf(state.horizontalOffsetWithoutText == null ? qVar.getDimensionPixelOffset(C6095k.kja0.sm, 0) : state.verticalOffsetWithoutText.intValue());
        state2.horizontalOffsetWithText = Integer.valueOf(state.horizontalOffsetWithText == null ? qVar.getDimensionPixelOffset(C6095k.kja0.l0, state2.horizontalOffsetWithoutText.intValue()) : state.horizontalOffsetWithText.intValue());
        state2.verticalOffsetWithText = Integer.valueOf(state.verticalOffsetWithText == null ? qVar.getDimensionPixelOffset(C6095k.kja0.jglj, state2.verticalOffsetWithoutText.intValue()) : state.verticalOffsetWithText.intValue());
        state2.additionalHorizontalOffset = Integer.valueOf(state.additionalHorizontalOffset == null ? 0 : state.additionalHorizontalOffset.intValue());
        state2.additionalVerticalOffset = Integer.valueOf(state.additionalVerticalOffset != null ? state.additionalVerticalOffset.intValue() : 0);
        qVar.recycle();
        if (state.numberLocale == null) {
            state2.numberLocale = Locale.getDefault(Locale.Category.FORMAT);
        } else {
            state2.numberLocale = state.numberLocale;
        }
        this.f23884k = state;
    }

    private TypedArray toq(Context context, @InterfaceC7824b int i2, @InterfaceC7828g int i3, @hb int i4) {
        AttributeSet attributeSet;
        int styleAttribute;
        if (i2 != 0) {
            AttributeSet attributeSetM26798k = C7398k.m26798k(context, i2, f67355f7l8);
            styleAttribute = attributeSetM26798k.getStyleAttribute();
            attributeSet = attributeSetM26798k;
        } else {
            attributeSet = null;
            styleAttribute = 0;
        }
        return cdj.m14534p(context, attributeSet, C6095k.kja0.b6, i3, styleAttribute == 0 ? i4 : styleAttribute, new int[0]);
    }

    private static int zurt(Context context, @lvui TypedArray typedArray, @InterfaceC7831j int i2) {
        return com.google.android.material.resources.zy.m14753k(context, typedArray, i2).getDefaultColor();
    }

    void a9(@ncyb int i2) {
        this.f23884k.f23894y = i2;
        this.f67356toq.f23894y = i2;
    }

    State cdj() {
        return this.f23884k;
    }

    void d2ok(@zy.cdj(unit = 1) int i2) {
        this.f23884k.verticalOffsetWithoutText = Integer.valueOf(i2);
        this.f67356toq.verticalOffsetWithoutText = Integer.valueOf(i2);
    }

    void d3(int i2) {
        this.f23884k.f23891n = i2;
        this.f67356toq.f23891n = i2;
    }

    void eqxt(@zy.cdj(unit = 1) int i2) {
        this.f23884k.verticalOffsetWithText = Integer.valueOf(i2);
        this.f67356toq.verticalOffsetWithText = Integer.valueOf(i2);
    }

    int f7l8() {
        return this.f67356toq.badgeGravity.intValue();
    }

    boolean fn3e() {
        return this.f67356toq.isVisible.booleanValue();
    }

    void fti(@zy.cdj(unit = 1) int i2) {
        this.f23884k.horizontalOffsetWithText = Integer.valueOf(i2);
        this.f67356toq.horizontalOffsetWithText = Integer.valueOf(i2);
    }

    void fu4(@zy.cdj(unit = 1) int i2) {
        this.f23884k.additionalVerticalOffset = Integer.valueOf(i2);
        this.f67356toq.additionalVerticalOffset = Integer.valueOf(i2);
    }

    @x2
    /* JADX INFO: renamed from: g */
    int m14060g() {
        return this.f67356toq.backgroundColor.intValue();
    }

    void gvn7(int i2) {
        this.f23884k.f23889g = i2;
        this.f67356toq.f23889g = i2;
    }

    /* JADX INFO: renamed from: h */
    Locale m14061h() {
        return this.f67356toq.numberLocale;
    }

    /* JADX INFO: renamed from: i */
    boolean m14062i() {
        return this.f67356toq.f23891n != -1;
    }

    void jk(CharSequence charSequence) {
        this.f23884k.contentDescriptionNumberless = charSequence;
        this.f67356toq.contentDescriptionNumberless = charSequence;
    }

    void jp0y(@zy.cdj(unit = 1) int i2) {
        this.f23884k.horizontalOffsetWithoutText = Integer.valueOf(i2);
        this.f67356toq.horizontalOffsetWithoutText = Integer.valueOf(i2);
    }

    /* JADX INFO: renamed from: k */
    void m14063k() {
        d3(-1);
    }

    @zy.cdj(unit = 1)
    int ki() {
        return this.f67356toq.verticalOffsetWithText.intValue();
    }

    int kja0() {
        return this.f67356toq.f23891n;
    }

    @ncyb
    int ld6() {
        return this.f67356toq.f23894y;
    }

    void lvui(boolean z2) {
        this.f23884k.isVisible = Boolean.valueOf(z2);
        this.f67356toq.isVisible = Boolean.valueOf(z2);
    }

    void mcp(@nn86 int i2) {
        this.f23884k.f23893s = i2;
        this.f67356toq.f23893s = i2;
    }

    /* JADX INFO: renamed from: n */
    int m14064n() {
        return this.f67356toq.f23892q;
    }

    int n7h() {
        return this.f67356toq.f23889g;
    }

    void ni7(@zy.cdj(unit = 1) int i2) {
        this.f23884k.additionalHorizontalOffset = Integer.valueOf(i2);
        this.f67356toq.additionalHorizontalOffset = Integer.valueOf(i2);
    }

    void o1t(@x2 int i2) {
        this.f23884k.backgroundColor = Integer.valueOf(i2);
        this.f67356toq.backgroundColor = Integer.valueOf(i2);
    }

    void oc(Locale locale) {
        this.f23884k.numberLocale = locale;
        this.f67356toq.numberLocale = locale;
    }

    /* JADX INFO: renamed from: p */
    CharSequence m14065p() {
        return this.f67356toq.contentDescriptionNumberless;
    }

    @zy.cdj(unit = 1)
    /* JADX INFO: renamed from: q */
    int m14066q() {
        return this.f67356toq.additionalVerticalOffset.intValue();
    }

    @zy.cdj(unit = 1)
    int qrj() {
        return this.f67356toq.horizontalOffsetWithoutText.intValue();
    }

    @nn86
    /* JADX INFO: renamed from: s */
    int m14067s() {
        return this.f67356toq.f23893s;
    }

    /* JADX INFO: renamed from: t */
    void m14068t(@x2 int i2) {
        this.f23884k.badgeTextColor = Integer.valueOf(i2);
        this.f67356toq.badgeTextColor = Integer.valueOf(i2);
    }

    @zy.cdj(unit = 1)
    int t8r() {
        return this.f67356toq.verticalOffsetWithoutText.intValue();
    }

    void wvg(int i2) {
        this.f23884k.badgeGravity = Integer.valueOf(i2);
        this.f67356toq.badgeGravity = Integer.valueOf(i2);
    }

    @zy.cdj(unit = 1)
    int x2() {
        return this.f67356toq.horizontalOffsetWithText.intValue();
    }

    @x2
    /* JADX INFO: renamed from: y */
    int m14069y() {
        return this.f67356toq.badgeTextColor.intValue();
    }

    /* JADX INFO: renamed from: z */
    void m14070z(int i2) {
        this.f23884k.f23892q = i2;
        this.f67356toq.f23892q = i2;
    }

    @zy.cdj(unit = 1)
    int zy() {
        return this.f67356toq.additionalHorizontalOffset.intValue();
    }

    public static final class State implements Parcelable {
        public static final Parcelable.Creator<State> CREATOR = new Parcelable.Creator<State>() { // from class: com.google.android.material.badge.BadgeState.State.1
            @Override // android.os.Parcelable.Creator
            @lvui
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public State createFromParcel(@lvui Parcel parcel) {
                return new State(parcel);
            }

            @Override // android.os.Parcelable.Creator
            @lvui
            /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
            public State[] newArray(int i2) {
                return new State[i2];
            }
        };

        /* JADX INFO: renamed from: h */
        private static final int f23887h = -2;

        /* JADX INFO: renamed from: p */
        private static final int f23888p = -1;

        @zy.cdj(unit = 1)
        private Integer additionalHorizontalOffset;

        @zy.cdj(unit = 1)
        private Integer additionalVerticalOffset;

        @x2
        private Integer backgroundColor;
        private Integer badgeGravity;

        @x2
        private Integer badgeTextColor;

        @dd
        private CharSequence contentDescriptionNumberless;

        /* JADX INFO: renamed from: g */
        private int f23889g;

        @zy.cdj(unit = 1)
        private Integer horizontalOffsetWithText;

        @zy.cdj(unit = 1)
        private Integer horizontalOffsetWithoutText;
        private Boolean isVisible;

        /* JADX INFO: renamed from: k */
        @InterfaceC7824b
        private int f23890k;

        /* JADX INFO: renamed from: n */
        private int f23891n;
        private Locale numberLocale;

        /* JADX INFO: renamed from: q */
        private int f23892q;

        /* JADX INFO: renamed from: s */
        @nn86
        private int f23893s;

        @zy.cdj(unit = 1)
        private Integer verticalOffsetWithText;

        @zy.cdj(unit = 1)
        private Integer verticalOffsetWithoutText;

        /* JADX INFO: renamed from: y */
        @ncyb
        private int f23894y;

        public State() {
            this.f23892q = 255;
            this.f23891n = -2;
            this.f23889g = -2;
            this.isVisible = Boolean.TRUE;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@lvui Parcel parcel, int i2) {
            parcel.writeInt(this.f23890k);
            parcel.writeSerializable(this.backgroundColor);
            parcel.writeSerializable(this.badgeTextColor);
            parcel.writeInt(this.f23892q);
            parcel.writeInt(this.f23891n);
            parcel.writeInt(this.f23889g);
            CharSequence charSequence = this.contentDescriptionNumberless;
            parcel.writeString(charSequence == null ? null : charSequence.toString());
            parcel.writeInt(this.f23894y);
            parcel.writeSerializable(this.badgeGravity);
            parcel.writeSerializable(this.horizontalOffsetWithoutText);
            parcel.writeSerializable(this.verticalOffsetWithoutText);
            parcel.writeSerializable(this.horizontalOffsetWithText);
            parcel.writeSerializable(this.verticalOffsetWithText);
            parcel.writeSerializable(this.additionalHorizontalOffset);
            parcel.writeSerializable(this.additionalVerticalOffset);
            parcel.writeSerializable(this.isVisible);
            parcel.writeSerializable(this.numberLocale);
        }

        State(@lvui Parcel parcel) {
            this.f23892q = 255;
            this.f23891n = -2;
            this.f23889g = -2;
            this.isVisible = Boolean.TRUE;
            this.f23890k = parcel.readInt();
            this.backgroundColor = (Integer) parcel.readSerializable();
            this.badgeTextColor = (Integer) parcel.readSerializable();
            this.f23892q = parcel.readInt();
            this.f23891n = parcel.readInt();
            this.f23889g = parcel.readInt();
            this.contentDescriptionNumberless = parcel.readString();
            this.f23894y = parcel.readInt();
            this.badgeGravity = (Integer) parcel.readSerializable();
            this.horizontalOffsetWithoutText = (Integer) parcel.readSerializable();
            this.verticalOffsetWithoutText = (Integer) parcel.readSerializable();
            this.horizontalOffsetWithText = (Integer) parcel.readSerializable();
            this.verticalOffsetWithText = (Integer) parcel.readSerializable();
            this.additionalHorizontalOffset = (Integer) parcel.readSerializable();
            this.additionalVerticalOffset = (Integer) parcel.readSerializable();
            this.isVisible = (Boolean) parcel.readSerializable();
            this.numberLocale = (Locale) parcel.readSerializable();
        }
    }
}
