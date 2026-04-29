package com.android.thememanager;

import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.FieldPacker;
import android.renderscript.RSRuntimeException;
import android.renderscript.RenderScript;
import android.renderscript.Script;
import android.renderscript.ScriptC;
import android.renderscript.Type;

/* JADX INFO: compiled from: ScriptC_darken.java */
/* JADX INFO: loaded from: classes.dex */
public class wvg extends ScriptC {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final int f61588f7l8 = 0;

    /* JADX INFO: renamed from: g */
    private static final String f17846g = "darken";

    /* JADX INFO: renamed from: s */
    private static final int f17847s = 1;

    /* JADX INFO: renamed from: y */
    private static final int f17848y = 1;

    /* JADX INFO: renamed from: k */
    private Element f17849k;

    /* JADX INFO: renamed from: n */
    private byte f17850n;

    /* JADX INFO: renamed from: q */
    private byte f17851q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private Element f61589toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private FieldPacker f61590zy;

    public wvg(RenderScript rs) {
        super(rs, f17846g, hyr.m7987k(), hyr.zy());
        this.f17849k = Element.I8(rs);
        this.f61589toq = Element.U8_4(rs);
    }

    public byte f7l8() {
        return this.f17851q;
    }

    /* JADX INFO: renamed from: g */
    public byte m10524g() {
        return this.f17850n;
    }

    /* JADX INFO: renamed from: k */
    public void m10525k(Allocation ain, Allocation aout) {
        toq(ain, aout, null);
    }

    /* JADX INFO: renamed from: n */
    public Script.KernelID m10526n() {
        return createKernelID(1, 35, null, null);
    }

    /* JADX INFO: renamed from: q */
    public Script.FieldID m10527q() {
        return createFieldID(0, null);
    }

    /* JADX INFO: renamed from: s */
    public synchronized void m10528s(byte v2) {
        FieldPacker fieldPacker = this.f61590zy;
        if (fieldPacker != null) {
            fieldPacker.reset();
        } else {
            this.f61590zy = new FieldPacker(1);
        }
        this.f61590zy.addI8(v2);
        setVar(0, this.f61590zy);
        this.f17851q = v2;
    }

    public void toq(Allocation ain, Allocation aout, Script.LaunchOptions sc2) {
        if (!ain.getType().getElement().isCompatible(this.f61589toq)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        if (!aout.getType().getElement().isCompatible(this.f61589toq)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        Type type = ain.getType();
        Type type2 = aout.getType();
        if (type.getCount() != type2.getCount() || type.getX() != type2.getX() || type.getY() != type2.getY() || type.getZ() != type2.getZ() || type.hasFaces() != type2.hasFaces() || type.hasMipmaps() != type2.hasMipmaps()) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }
        forEach(1, ain, aout, (FieldPacker) null, sc2);
    }

    /* JADX INFO: renamed from: y */
    public synchronized void m10529y(byte v2) {
        FieldPacker fieldPacker = this.f61590zy;
        if (fieldPacker != null) {
            fieldPacker.reset();
        } else {
            this.f61590zy = new FieldPacker(1);
        }
        this.f61590zy.addI8(v2);
        setVar(1, this.f61590zy);
        this.f17850n = v2;
    }

    public Script.FieldID zy() {
        return createFieldID(1, null);
    }
}
