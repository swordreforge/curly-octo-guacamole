package kotlin.sequences;

import cyoe.InterfaceC5979h;
import java.util.Iterator;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import kotlin.was;
import kotlin.yz;
import mub.InterfaceC7396q;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: SequenceBuilder.kt */
/* JADX INFO: loaded from: classes3.dex */
public class cdj {

    /* JADX INFO: renamed from: g */
    private static final int f36585g = 5;

    /* JADX INFO: renamed from: k */
    private static final int f36586k = 0;

    /* JADX INFO: renamed from: n */
    private static final int f36587n = 4;

    /* JADX INFO: renamed from: q */
    private static final int f36588q = 3;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final int f81862toq = 1;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final int f81863zy = 2;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlin.sequences.cdj$k */
    /* JADX INFO: compiled from: Sequences.kt */
    @lv5({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 SequenceBuilder.kt\nkotlin/sequences/SequencesKt__SequenceBuilderKt\n*L\n1#1,680:1\n26#2:681\n*E\n"})
    public static final class C6384k<T> implements qrj<T> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ InterfaceC5979h f36589k;

        public C6384k(InterfaceC5979h interfaceC5979h) {
            this.f36589k = interfaceC5979h;
        }

        @Override // kotlin.sequences.qrj
        @InterfaceC7396q
        public Iterator<T> iterator() {
            return cdj.m23418k(this.f36589k);
        }
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    /* JADX INFO: renamed from: k */
    public static <T> Iterator<T> m23418k(@InterfaceC7396q @kotlin.toq InterfaceC5979h<? super kja0<? super T>, ? super InterfaceC6216q<? super was>, ? extends Object> block) {
        d2ok.m23075h(block, "block");
        n7h n7hVar = new n7h();
        n7hVar.x2(kotlin.coroutines.intrinsics.zy.zy(block, n7hVar, n7hVar));
        return n7hVar;
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    public static <T> qrj<T> toq(@InterfaceC7396q @kotlin.toq InterfaceC5979h<? super kja0<? super T>, ? super InterfaceC6216q<? super was>, ? extends Object> block) {
        d2ok.m23075h(block, "block");
        return new C6384k(block);
    }
}
