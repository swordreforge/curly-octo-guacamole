package okio;

import androidx.constraintlayout.core.motion.utils.zurt;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6308r;
import kotlin.jvm.internal.a98o;
import kotlin.jvm.internal.lv5;
import l05.InterfaceC6769y;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: ForwardingFileSystem.kt */
/* JADX INFO: loaded from: classes4.dex */
@lv5({"SMAP\nForwardingFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ForwardingFileSystem.kt\nokio/ForwardingFileSystem\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,243:1\n1620#2,3:244\n1620#2,3:247\n*S KotlinDebug\n*F\n+ 1 ForwardingFileSystem.kt\nokio/ForwardingFileSystem\n*L\n166#1:244,3\n174#1:247,3\n*E\n"})
public abstract class ni7 extends zurt {

    /* JADX INFO: renamed from: n */
    @InterfaceC7396q
    private final zurt f43816n;

    /* JADX INFO: renamed from: okio.ni7$k */
    /* JADX INFO: compiled from: ForwardingFileSystem.kt */
    static final class C7570k extends AbstractC6308r implements cyoe.x2<ncyb, ncyb> {
        C7570k() {
            super(1);
        }

        @Override // cyoe.x2
        @InterfaceC7396q
        public final ncyb invoke(@InterfaceC7396q ncyb it) {
            kotlin.jvm.internal.d2ok.m23075h(it, "it");
            return ni7.this.x9kr(it, "listRecursively");
        }
    }

    public ni7(@InterfaceC7396q zurt delegate) {
        kotlin.jvm.internal.d2ok.m23075h(delegate, "delegate");
        this.f43816n = delegate;
    }

    @Override // okio.zurt
    @InterfaceC7395n
    public fn3e a9(@InterfaceC7396q ncyb path) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(path, "path");
        fn3e fn3eVarA9 = this.f43816n.a9(dd(path, "metadataOrNull", "path"));
        if (fn3eVarA9 == null) {
            return null;
        }
        return fn3eVarA9.m27620s() == null ? fn3eVarA9 : fn3eVarA9.m27616k((251 & 1) != 0 ? fn3eVarA9.f43711k : false, (251 & 2) != 0 ? fn3eVarA9.f94269toq : false, (251 & 4) != 0 ? fn3eVarA9.f94270zy : x9kr(fn3eVarA9.m27620s(), "metadataOrNull"), (251 & 8) != 0 ? fn3eVarA9.f43713q : null, (251 & 16) != 0 ? fn3eVarA9.f43712n : null, (251 & 32) != 0 ? fn3eVarA9.f43710g : null, (251 & 64) != 0 ? fn3eVarA9.f94268f7l8 : null, (251 & 128) != 0 ? fn3eVarA9.f43714y : null);
    }

    @InterfaceC7396q
    public ncyb dd(@InterfaceC7396q ncyb path, @InterfaceC7396q String functionName, @InterfaceC7396q String parameterName) {
        kotlin.jvm.internal.d2ok.m23075h(path, "path");
        kotlin.jvm.internal.d2ok.m23075h(functionName, "functionName");
        kotlin.jvm.internal.d2ok.m23075h(parameterName, "parameterName");
        return path;
    }

    @Override // okio.zurt
    @InterfaceC7396q
    public vyq eqxt(@InterfaceC7396q ncyb file, boolean z2) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(file, "file");
        return this.f43816n.eqxt(dd(file, "sink", "file"), z2);
    }

    @Override // okio.zurt
    public void f7l8(@InterfaceC7396q ncyb source, @InterfaceC7396q ncyb target) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(source, "source");
        kotlin.jvm.internal.d2ok.m23075h(target, "target");
        this.f43816n.f7l8(dd(source, "atomicMove", "source"), dd(target, "atomicMove", zurt.InterfaceC0290k.f47416lvui));
    }

    @Override // okio.zurt
    @InterfaceC7396q
    public AbstractC7549i fti(@InterfaceC7396q ncyb file) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(file, "file");
        return this.f43816n.fti(dd(file, "openReadOnly", "file"));
    }

    @Override // okio.zurt
    @InterfaceC7396q
    public AbstractC7549i gvn7(@InterfaceC7396q ncyb file, boolean z2, boolean z3) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(file, "file");
        return this.f43816n.gvn7(dd(file, "openReadWrite", "file"), z2, z3);
    }

    @Override // okio.zurt
    /* JADX INFO: renamed from: h */
    public void mo27608h(@InterfaceC7396q ncyb source, @InterfaceC7396q ncyb target) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(source, "source");
        kotlin.jvm.internal.d2ok.m23075h(target, "target");
        this.f43816n.mo27608h(dd(source, "createSymlink", "source"), dd(target, "createSymlink", zurt.InterfaceC0290k.f47416lvui));
    }

    @Override // okio.zurt
    public void ki(@InterfaceC7396q ncyb path, boolean z2) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(path, "path");
        this.f43816n.ki(dd(path, "delete", "path"), z2);
    }

    @Override // okio.zurt
    @InterfaceC7396q
    public nn86 lvui(@InterfaceC7396q ncyb file) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(file, "file");
        return this.f43816n.lvui(dd(file, "source", "file"));
    }

    @Override // okio.zurt
    @InterfaceC7396q
    /* JADX INFO: renamed from: n */
    public vyq mo27625n(@InterfaceC7396q ncyb file, boolean z2) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(file, "file");
        return this.f43816n.mo27625n(dd(file, "appendingSink", "file"), z2);
    }

    @Override // okio.zurt
    public void n7h(@InterfaceC7396q ncyb dir, boolean z2) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(dir, "dir");
        this.f43816n.n7h(dd(dir, "createDirectory", "dir"), z2);
    }

    @Override // okio.zurt
    @InterfaceC7395n
    public List<ncyb> o1t(@InterfaceC7396q ncyb dir) {
        kotlin.jvm.internal.d2ok.m23075h(dir, "dir");
        List<ncyb> listO1t = this.f43816n.o1t(dd(dir, "listOrNull", "dir"));
        if (listO1t == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listO1t.iterator();
        while (it.hasNext()) {
            arrayList.add(x9kr((ncyb) it.next(), "listOrNull"));
        }
        kotlin.collections.wvg.bf2(arrayList);
        return arrayList;
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "delegate")
    /* JADX INFO: renamed from: r */
    public final zurt m27829r() {
        return this.f43816n;
    }

    @Override // okio.zurt
    @InterfaceC7396q
    /* JADX INFO: renamed from: t */
    public kotlin.sequences.qrj<ncyb> mo27830t(@InterfaceC7396q ncyb dir, boolean z2) {
        kotlin.jvm.internal.d2ok.m23075h(dir, "dir");
        return kotlin.sequences.fn3e.b3e(this.f43816n.mo27830t(dd(dir, "listRecursively", "dir"), z2), new C7570k());
    }

    @InterfaceC7396q
    public String toString() {
        return a98o.m23050q(getClass()).zurt() + '(' + this.f43816n + ')';
    }

    @InterfaceC7396q
    public ncyb x9kr(@InterfaceC7396q ncyb path, @InterfaceC7396q String functionName) {
        kotlin.jvm.internal.d2ok.m23075h(path, "path");
        kotlin.jvm.internal.d2ok.m23075h(functionName, "functionName");
        return path;
    }

    @Override // okio.zurt
    @InterfaceC7396q
    /* JADX INFO: renamed from: y */
    public ncyb mo27626y(@InterfaceC7396q ncyb path) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(path, "path");
        return x9kr(this.f43816n.mo27626y(dd(path, "canonicalize", "path")), "canonicalize");
    }

    @Override // okio.zurt
    @InterfaceC7396q
    /* JADX INFO: renamed from: z */
    public List<ncyb> mo27627z(@InterfaceC7396q ncyb dir) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(dir, "dir");
        List<ncyb> listMo27627z = this.f43816n.mo27627z(dd(dir, "list", "dir"));
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listMo27627z.iterator();
        while (it.hasNext()) {
            arrayList.add(x9kr((ncyb) it.next(), "list"));
        }
        kotlin.collections.wvg.bf2(arrayList);
        return arrayList;
    }
}
