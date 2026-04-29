package com.google.android.material.datepicker;

import android.app.DatePickerDialog;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import com.google.android.material.shape.C4108p;
import ij.C6095k;
import zwy.ViewOnTouchListenerC7823k;
import zy.InterfaceC7828g;
import zy.dd;
import zy.hb;
import zy.lvui;
import zy.uv6;

/* JADX INFO: renamed from: com.google.android.material.datepicker.s */
/* JADX INFO: compiled from: MaterialStyledDatePickerDialog.java */
/* JADX INFO: loaded from: classes2.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP, uv6.EnumC7844k.TESTS})
public class DatePickerDialogC4014s extends DatePickerDialog {

    /* JADX INFO: renamed from: g */
    @hb
    private static final int f24362g = C6095k.n7h.bf5;

    /* JADX INFO: renamed from: n */
    @InterfaceC7828g
    private static final int f24363n = 16843612;

    /* JADX INFO: renamed from: k */
    @lvui
    private final Drawable f24364k;

    /* JADX INFO: renamed from: q */
    @lvui
    private final Rect f24365q;

    public DatePickerDialogC4014s(@lvui Context context) {
        this(context, 0);
    }

    @Override // android.app.AlertDialog, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawable(this.f24364k);
        getWindow().getDecorView().setOnTouchListener(new ViewOnTouchListenerC7823k(this, this.f24365q));
    }

    public DatePickerDialogC4014s(@lvui Context context, int i2) {
        this(context, i2, null, -1, -1, -1);
    }

    public DatePickerDialogC4014s(@lvui Context context, @dd DatePickerDialog.OnDateSetListener onDateSetListener, int i2, int i3, int i4) {
        this(context, 0, onDateSetListener, i2, i3, i4);
    }

    public DatePickerDialogC4014s(@lvui Context context, int i2, @dd DatePickerDialog.OnDateSetListener onDateSetListener, int i3, int i4, int i5) {
        super(context, i2, onDateSetListener, i3, i4, i5);
        Context context2 = getContext();
        int iF7l8 = com.google.android.material.resources.toq.f7l8(getContext(), C6095k.zy.f80274sc, getClass().getCanonicalName());
        int i6 = f24362g;
        C4108p c4108p = new C4108p(context2, null, 16843612, i6);
        c4108p.m14867x(ColorStateList.valueOf(iF7l8));
        Rect rectM28238k = zwy.zy.m28238k(context2, 16843612, i6);
        this.f24365q = rectM28238k;
        this.f24364k = zwy.zy.toq(c4108p, rectM28238k);
    }
}
