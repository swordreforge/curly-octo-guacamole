package com.airbnb.lottie.animation.content;

import android.annotation.TargetApi;
import android.graphics.Path;
import com.airbnb.lottie.model.content.C1457s;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: MergePathsContent.java */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(19)
public class x2 implements n7h, InterfaceC1413p {

    /* JADX INFO: renamed from: g */
    private final C1457s f7865g;

    /* JADX INFO: renamed from: q */
    private final String f7868q;

    /* JADX INFO: renamed from: k */
    private final Path f7866k = new Path();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final Path f55895toq = new Path();

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final Path f55896zy = new Path();

    /* JADX INFO: renamed from: n */
    private final List<n7h> f7867n = new ArrayList();

    /* JADX INFO: renamed from: com.airbnb.lottie.animation.content.x2$k */
    /* JADX INFO: compiled from: MergePathsContent.java */
    static /* synthetic */ class C1416k {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ int[] f7869k;

        static {
            int[] iArr = new int[C1457s.k.values().length];
            f7869k = iArr;
            try {
                iArr[C1457s.k.MERGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7869k[C1457s.k.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7869k[C1457s.k.SUBTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7869k[C1457s.k.INTERSECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7869k[C1457s.k.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public x2(C1457s c1457s) {
        this.f7868q = c1457s.zy();
        this.f7865g = c1457s;
    }

    /* JADX INFO: renamed from: k */
    private void m5903k() {
        for (int i2 = 0; i2 < this.f7867n.size(); i2++) {
            this.f55896zy.addPath(this.f7867n.get(i2).getPath());
        }
    }

    @TargetApi(19)
    /* JADX INFO: renamed from: q */
    private void m5904q(Path.Op op) {
        this.f55895toq.reset();
        this.f7866k.reset();
        for (int size = this.f7867n.size() - 1; size >= 1; size--) {
            n7h n7hVar = this.f7867n.get(size);
            if (n7hVar instanceof C1414q) {
                C1414q c1414q = (C1414q) n7hVar;
                List<n7h> listM5899p = c1414q.m5899p();
                for (int size2 = listM5899p.size() - 1; size2 >= 0; size2--) {
                    Path path = listM5899p.get(size2).getPath();
                    path.transform(c1414q.ld6());
                    this.f55895toq.addPath(path);
                }
            } else {
                this.f55895toq.addPath(n7hVar.getPath());
            }
        }
        n7h n7hVar2 = this.f7867n.get(0);
        if (n7hVar2 instanceof C1414q) {
            C1414q c1414q2 = (C1414q) n7hVar2;
            List<n7h> listM5899p2 = c1414q2.m5899p();
            for (int i2 = 0; i2 < listM5899p2.size(); i2++) {
                Path path2 = listM5899p2.get(i2).getPath();
                path2.transform(c1414q2.ld6());
                this.f7866k.addPath(path2);
            }
        } else {
            this.f7866k.set(n7hVar2.getPath());
        }
        this.f55896zy.op(this.f7866k, this.f55895toq, op);
    }

    @Override // com.airbnb.lottie.animation.content.InterfaceC1413p
    public void f7l8(ListIterator<zy> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            zy zyVarPrevious = listIterator.previous();
            if (zyVarPrevious instanceof n7h) {
                this.f7867n.add((n7h) zyVarPrevious);
                listIterator.remove();
            }
        }
    }

    @Override // com.airbnb.lottie.animation.content.zy
    public String getName() {
        return this.f7868q;
    }

    @Override // com.airbnb.lottie.animation.content.n7h
    public Path getPath() {
        this.f55896zy.reset();
        if (this.f7865g.m6045q()) {
            return this.f55896zy;
        }
        int i2 = C1416k.f7869k[this.f7865g.toq().ordinal()];
        if (i2 == 1) {
            m5903k();
        } else if (i2 == 2) {
            m5904q(Path.Op.UNION);
        } else if (i2 == 3) {
            m5904q(Path.Op.REVERSE_DIFFERENCE);
        } else if (i2 == 4) {
            m5904q(Path.Op.INTERSECT);
        } else if (i2 == 5) {
            m5904q(Path.Op.XOR);
        }
        return this.f55896zy;
    }

    @Override // com.airbnb.lottie.animation.content.zy
    public void toq(List<zy> list, List<zy> list2) {
        for (int i2 = 0; i2 < this.f7867n.size(); i2++) {
            this.f7867n.get(i2).toq(list, list2);
        }
    }
}
