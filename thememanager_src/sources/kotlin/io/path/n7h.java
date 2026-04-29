package kotlin.io.path;

import cyoe.InterfaceC5979h;
import java.nio.file.FileSystemLoopException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C6144h;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.jvm.internal.InterfaceC6205g;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.d3;
import kotlin.jvm.internal.lv5;
import kotlin.was;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: PathTreeWalk.kt */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC6261g
public final class n7h implements kotlin.sequences.qrj<Path> {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final Path f36348k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private final EnumC6262h[] f81815toq;

    /* JADX INFO: renamed from: kotlin.io.path.n7h$k */
    /* JADX INFO: compiled from: PathTreeWalk.kt */
    @InterfaceC6205g(m22755c = "kotlin.io.path.PathTreeWalk$bfsIterator$1", m22756f = "PathTreeWalk.kt", m22757i = {0, 0, 0, 0, 0, 0, 1, 1, 1}, m22758l = {184, 190}, m22759m = "invokeSuspend", m22760n = {"$this$iterator", "queue", "entriesReader", "pathNode", "this_$iv", "path$iv", "$this$iterator", "queue", "entriesReader"}, m22761s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2"})
    @lv5({"SMAP\nPathTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk$bfsIterator$1\n+ 2 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk\n*L\n1#1,177:1\n45#2,15:178\n*S KotlinDebug\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk$bfsIterator$1\n*L\n98#1:178,15\n*E\n"})
    static final class C6266k extends kotlin.coroutines.jvm.internal.ld6 implements InterfaceC5979h<kotlin.sequences.kja0<? super Path>, InterfaceC6216q<? super was>, Object> {
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        C6266k(InterfaceC6216q<? super C6266k> interfaceC6216q) {
            super(2, interfaceC6216q);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            C6266k c6266k = n7h.this.new C6266k(interfaceC6216q);
            c6266k.L$0 = obj;
            return c6266k;
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q kotlin.sequences.kja0<? super Path> kja0Var, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
            return ((C6266k) create(kja0Var, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0087  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00f4  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00f2 -> B:11:0x0080). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00f4 -> B:11:0x0080). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @mub.InterfaceC7395n
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@mub.InterfaceC7396q java.lang.Object r15) throws java.nio.file.FileSystemLoopException {
            /*
                Method dump skipped, instruction units count: 305
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.io.path.n7h.C6266k.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: compiled from: PathTreeWalk.kt */
    @InterfaceC6205g(m22755c = "kotlin.io.path.PathTreeWalk$dfsIterator$1", m22756f = "PathTreeWalk.kt", m22757i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3}, m22758l = {184, 190, 199, 205}, m22759m = "invokeSuspend", m22760n = {"$this$iterator", "stack", "entriesReader", "startNode", "this_$iv", "path$iv", "$this$iterator", "stack", "entriesReader", "$this$iterator", "stack", "entriesReader", "pathNode", "this_$iv", "path$iv", "$this$iterator", "stack", "entriesReader"}, m22761s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2"})
    @lv5({"SMAP\nPathTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk$dfsIterator$1\n+ 2 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk\n*L\n1#1,177:1\n45#2,15:178\n45#2,15:193\n*S KotlinDebug\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk$dfsIterator$1\n*L\n67#1:178,15\n78#1:193,15\n*E\n"})
    static final class toq extends kotlin.coroutines.jvm.internal.ld6 implements InterfaceC5979h<kotlin.sequences.kja0<? super Path>, InterfaceC6216q<? super was>, Object> {
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        toq(InterfaceC6216q<? super toq> interfaceC6216q) {
            super(2, interfaceC6216q);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            toq toqVar = n7h.this.new toq(interfaceC6216q);
            toqVar.L$0 = obj;
            return toqVar;
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q kotlin.sequences.kja0<? super Path> kja0Var, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
            return ((toq) create(kja0Var, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0103  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0147  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x01cf  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x01cd -> B:36:0x0140). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x01cf -> B:36:0x0140). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @mub.InterfaceC7395n
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@mub.InterfaceC7396q java.lang.Object r19) throws java.nio.file.FileSystemLoopException {
            /*
                Method dump skipped, instruction units count: 536
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.io.path.n7h.toq.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public n7h(@InterfaceC7396q Path start, @InterfaceC7396q EnumC6262h[] options) {
        d2ok.m23075h(start, "start");
        d2ok.m23075h(options, "options");
        this.f36348k = start;
        this.f81815toq = options;
    }

    private final Iterator<Path> f7l8() {
        return kotlin.sequences.cdj.m23418k(new C6266k(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LinkOption[] ld6() {
        return C6267p.f36349k.m22978k(m22976s());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public final boolean m22974p() {
        return C6144h.ph5d(this.f81815toq, EnumC6262h.INCLUDE_DIRECTORIES);
    }

    private final Object qrj(kotlin.sequences.kja0<? super Path> kja0Var, x2 x2Var, C6268q c6268q, cyoe.x2<? super List<x2>, was> x2Var2, InterfaceC6216q<? super was> interfaceC6216q) throws FileSystemLoopException {
        Path pathM22991q = x2Var.m22991q();
        LinkOption[] linkOptionArrLd6 = ld6();
        LinkOption[] linkOptionArr = (LinkOption[]) Arrays.copyOf(linkOptionArrLd6, linkOptionArrLd6.length);
        if (Files.isDirectory(pathM22991q, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length))) {
            if (kja0.zy(x2Var)) {
                throw new FileSystemLoopException(pathM22991q.toString());
            }
            if (m22974p()) {
                d3.m23089n(0);
                kja0Var.toq(pathM22991q, interfaceC6216q);
                d3.m23089n(1);
            }
            LinkOption[] linkOptionArrLd62 = ld6();
            LinkOption[] linkOptionArr2 = (LinkOption[]) Arrays.copyOf(linkOptionArrLd62, linkOptionArrLd62.length);
            if (Files.isDirectory(pathM22991q, (LinkOption[]) Arrays.copyOf(linkOptionArr2, linkOptionArr2.length))) {
                x2Var2.invoke(c6268q.zy(x2Var));
            }
        } else if (Files.exists(pathM22991q, (LinkOption[]) Arrays.copyOf(new LinkOption[]{LinkOption.NOFOLLOW_LINKS}, 1))) {
            d3.m23089n(0);
            kja0Var.toq(pathM22991q, interfaceC6216q);
            d3.m23089n(1);
            return was.f36763k;
        }
        return was.f36763k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public final boolean m22976s() {
        return C6144h.ph5d(this.f81815toq, EnumC6262h.FOLLOW_LINKS);
    }

    private final boolean x2() {
        return C6144h.ph5d(this.f81815toq, EnumC6262h.BREADTH_FIRST);
    }

    /* JADX INFO: renamed from: y */
    private final Iterator<Path> m22977y() {
        return kotlin.sequences.cdj.m23418k(new toq(null));
    }

    @Override // kotlin.sequences.qrj
    @InterfaceC7396q
    public Iterator<Path> iterator() {
        return x2() ? f7l8() : m22977y();
    }
}
