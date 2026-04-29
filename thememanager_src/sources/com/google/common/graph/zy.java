package com.google.common.graph;

import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7731k;

/* JADX INFO: compiled from: AbstractGraph.java */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7731k
public abstract class zy<N> extends AbstractC4627k<N> implements fu4<N> {
    @Override // com.google.common.graph.fu4
    public final boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fu4)) {
            return false;
        }
        fu4 fu4Var = (fu4) obj;
        return mo16193n() == fu4Var.mo16193n() && qrj().equals(fu4Var.qrj()) && zy().equals(fu4Var.zy());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.AbstractC4627k, com.google.common.graph.InterfaceC4648y
    public /* bridge */ /* synthetic */ int f7l8(Object obj) {
        return super.f7l8(obj);
    }

    @Override // com.google.common.graph.AbstractC4627k, com.google.common.graph.InterfaceC4648y, com.google.common.graph.InterfaceC4618f
    /* JADX INFO: renamed from: g */
    public /* bridge */ /* synthetic */ boolean mo16190g(t8r t8rVar) {
        return super.mo16190g(t8rVar);
    }

    @Override // com.google.common.graph.fu4
    public final int hashCode() {
        return zy().hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.AbstractC4627k, com.google.common.graph.InterfaceC4648y
    public /* bridge */ /* synthetic */ int n7h(Object obj) {
        return super.n7h(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.AbstractC4627k, com.google.common.graph.InterfaceC4648y, com.google.common.graph.InterfaceC4618f
    /* JADX INFO: renamed from: q */
    public /* bridge */ /* synthetic */ boolean mo16195q(Object obj, Object obj2) {
        return super.mo16195q(obj, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.AbstractC4627k, com.google.common.graph.InterfaceC4648y
    /* JADX INFO: renamed from: s */
    public /* bridge */ /* synthetic */ int mo16213s(Object obj) {
        return super.mo16213s(obj);
    }

    public String toString() {
        return "isDirected: " + mo16193n() + ", allowsSelfLoops: " + mo16194p() + ", nodes: " + qrj() + ", edges: " + zy();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.AbstractC4627k, com.google.common.graph.InterfaceC4648y
    public /* bridge */ /* synthetic */ Set x2(Object obj) {
        return super.x2(obj);
    }

    @Override // com.google.common.graph.AbstractC4627k, com.google.common.graph.InterfaceC4648y
    public /* bridge */ /* synthetic */ Set zy() {
        return super.zy();
    }
}
