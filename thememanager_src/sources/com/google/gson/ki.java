package com.google.gson;

import com.google.gson.internal.C4899k;
import com.google.gson.internal.C4909y;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: compiled from: JsonPrimitive.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ki extends x2 {

    /* JADX INFO: renamed from: k */
    private final Object f27819k;

    public ki(Boolean bool) {
        this.f27819k = C4899k.toq(bool);
    }

    /* JADX INFO: renamed from: z */
    private static boolean m17211z(ki kiVar) {
        Object obj = kiVar.f27819k;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    @Override // com.google.gson.x2
    public short cdj() {
        return o1t() ? mo17213h().shortValue() : Short.parseShort(ki());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ki.class != obj.getClass()) {
            return false;
        }
        ki kiVar = (ki) obj;
        if (this.f27819k == null) {
            return kiVar.f27819k == null;
        }
        if (m17211z(this) && m17211z(kiVar)) {
            return mo17213h().longValue() == kiVar.mo17213h().longValue();
        }
        Object obj2 = this.f27819k;
        if (!(obj2 instanceof Number) || !(kiVar.f27819k instanceof Number)) {
            return obj2.equals(kiVar.f27819k);
        }
        double dDoubleValue = mo17213h().doubleValue();
        double dDoubleValue2 = kiVar.mo17213h().doubleValue();
        if (dDoubleValue != dDoubleValue2) {
            return Double.isNaN(dDoubleValue) && Double.isNaN(dDoubleValue2);
        }
        return true;
    }

    @Override // com.google.gson.x2
    public char f7l8() {
        return ki().charAt(0);
    }

    public boolean fu4() {
        return this.f27819k instanceof Boolean;
    }

    @Override // com.google.gson.x2
    /* JADX INFO: renamed from: g */
    public byte mo17212g() {
        return o1t() ? mo17213h().byteValue() : Byte.parseByte(ki());
    }

    @Override // com.google.gson.x2
    /* JADX INFO: renamed from: h */
    public Number mo17213h() {
        Object obj = this.f27819k;
        return obj instanceof String ? new C4909y((String) obj) : (Number) obj;
    }

    public int hashCode() {
        long jDoubleToLongBits;
        if (this.f27819k == null) {
            return 31;
        }
        if (m17211z(this)) {
            jDoubleToLongBits = mo17213h().longValue();
        } else {
            Object obj = this.f27819k;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(mo17213h().doubleValue());
        }
        return (int) ((jDoubleToLongBits >>> 32) ^ jDoubleToLongBits);
    }

    @Override // com.google.gson.x2
    public String ki() {
        return o1t() ? mo17213h().toString() : fu4() ? ((Boolean) this.f27819k).toString() : (String) this.f27819k;
    }

    @Override // com.google.gson.x2
    public long kja0() {
        return o1t() ? mo17213h().longValue() : Long.parseLong(ki());
    }

    @Override // com.google.gson.x2
    /* JADX INFO: renamed from: n */
    public boolean mo17215n() {
        return fu4() ? ((Boolean) this.f27819k).booleanValue() : Boolean.parseBoolean(ki());
    }

    @Override // com.google.gson.x2
    /* JADX INFO: renamed from: ni7, reason: merged with bridge method [inline-methods] */
    public ki mo17214k() {
        return this;
    }

    public boolean o1t() {
        return this.f27819k instanceof Number;
    }

    @Override // com.google.gson.x2
    /* JADX INFO: renamed from: p */
    public int mo17216p() {
        return o1t() ? mo17213h().intValue() : Integer.parseInt(ki());
    }

    @Override // com.google.gson.x2
    /* JADX INFO: renamed from: s */
    public float mo17217s() {
        return o1t() ? mo17213h().floatValue() : Float.parseFloat(ki());
    }

    @Override // com.google.gson.x2
    public BigDecimal toq() {
        Object obj = this.f27819k;
        return obj instanceof BigDecimal ? (BigDecimal) obj : new BigDecimal(this.f27819k.toString());
    }

    public boolean wvg() {
        return this.f27819k instanceof String;
    }

    @Override // com.google.gson.x2
    /* JADX INFO: renamed from: y */
    public double mo17218y() {
        return o1t() ? mo17213h().doubleValue() : Double.parseDouble(ki());
    }

    @Override // com.google.gson.x2
    public BigInteger zy() {
        Object obj = this.f27819k;
        return obj instanceof BigInteger ? (BigInteger) obj : new BigInteger(this.f27819k.toString());
    }

    public ki(Number number) {
        this.f27819k = C4899k.toq(number);
    }

    public ki(String str) {
        this.f27819k = C4899k.toq(str);
    }

    public ki(Character ch2) {
        this.f27819k = ((Character) C4899k.toq(ch2)).toString();
    }
}
