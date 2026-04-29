package kotlin.jvm.internal;

import cyoe.InterfaceC5978g;
import cyoe.InterfaceC5979h;
import cyoe.InterfaceC5980i;
import cyoe.InterfaceC5981k;
import cyoe.InterfaceC5982n;
import cyoe.InterfaceC5983p;
import cyoe.InterfaceC5984q;
import cyoe.InterfaceC5985s;
import cyoe.InterfaceC5986y;
import java.io.Serializable;

/* JADX INFO: compiled from: FunctionImpl.java */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.ld6(level = kotlin.qrj.ERROR, message = "This class is no longer supported, do not use it.")
@Deprecated
public abstract class fti implements kotlin.zurt, Serializable, InterfaceC5981k, cyoe.x2, InterfaceC5979h, cyoe.cdj, cyoe.ki, cyoe.t8r, InterfaceC5980i, cyoe.fn3e, cyoe.zurt, cyoe.ni7, cyoe.toq, cyoe.zy, InterfaceC5984q, InterfaceC5982n, InterfaceC5978g, cyoe.f7l8, InterfaceC5986y, InterfaceC5985s, InterfaceC5983p, cyoe.ld6, cyoe.qrj, cyoe.n7h, cyoe.kja0 {
    /* JADX INFO: renamed from: k */
    private void m23103k(int i2) {
        if (getArity() != i2) {
            toq(i2);
        }
    }

    private void toq(int i2) {
        throw new IllegalStateException("Wrong function arity, expected: " + i2 + ", actual: " + getArity());
    }

    public abstract int getArity();

    @Override // cyoe.InterfaceC5981k
    public Object invoke() {
        m23103k(0);
        return invokeVararg(new Object[0]);
    }

    public Object invokeVararg(Object... objArr) {
        throw new UnsupportedOperationException();
    }

    @Override // cyoe.x2
    public Object invoke(Object obj) {
        m23103k(1);
        return invokeVararg(obj);
    }

    @Override // cyoe.InterfaceC5979h
    public Object invoke(Object obj, Object obj2) {
        m23103k(2);
        return invokeVararg(obj, obj2);
    }

    @Override // cyoe.cdj
    public Object invoke(Object obj, Object obj2, Object obj3) {
        m23103k(3);
        return invokeVararg(obj, obj2, obj3);
    }

    @Override // cyoe.ki
    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        m23103k(4);
        return invokeVararg(obj, obj2, obj3, obj4);
    }

    @Override // cyoe.t8r
    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        m23103k(5);
        return invokeVararg(obj, obj2, obj3, obj4, obj5);
    }

    @Override // cyoe.InterfaceC5980i
    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        m23103k(6);
        return invokeVararg(obj, obj2, obj3, obj4, obj5, obj6);
    }

    @Override // cyoe.fn3e
    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        m23103k(7);
        return invokeVararg(obj, obj2, obj3, obj4, obj5, obj6, obj7);
    }

    @Override // cyoe.zurt
    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        m23103k(8);
        return invokeVararg(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8);
    }

    @Override // cyoe.ni7
    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        m23103k(9);
        return invokeVararg(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9);
    }

    @Override // cyoe.toq
    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        m23103k(10);
        return invokeVararg(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10);
    }

    @Override // cyoe.zy
    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11) {
        m23103k(11);
        return invokeVararg(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11);
    }

    @Override // cyoe.InterfaceC5984q
    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12) {
        m23103k(12);
        return invokeVararg(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12);
    }

    @Override // cyoe.InterfaceC5982n
    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13) {
        m23103k(13);
        return invokeVararg(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13);
    }

    @Override // cyoe.InterfaceC5978g
    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14) {
        m23103k(14);
        return invokeVararg(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14);
    }

    @Override // cyoe.f7l8
    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15) {
        m23103k(15);
        return invokeVararg(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15);
    }

    @Override // cyoe.InterfaceC5986y
    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16) {
        m23103k(16);
        return invokeVararg(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16);
    }

    @Override // cyoe.InterfaceC5985s
    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17) {
        m23103k(17);
        return invokeVararg(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17);
    }

    @Override // cyoe.InterfaceC5983p
    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18) {
        m23103k(18);
        return invokeVararg(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18);
    }

    @Override // cyoe.ld6
    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19) {
        m23103k(19);
        return invokeVararg(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19);
    }

    @Override // cyoe.qrj
    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19, Object obj20) {
        m23103k(20);
        return invokeVararg(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19, obj20);
    }

    @Override // cyoe.n7h
    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19, Object obj20, Object obj21) {
        m23103k(21);
        return invokeVararg(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19, obj20, obj21);
    }

    @Override // cyoe.kja0
    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19, Object obj20, Object obj21, Object obj22) {
        m23103k(22);
        return invokeVararg(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19, obj20, obj21, obj22);
    }
}
