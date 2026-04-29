package kotlin.streams.jdk8;

import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import kotlin.collections.kja0;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import kotlin.sequences.qrj;
import kotlin.yz;
import l05.InterfaceC6769y;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: Streams.kt */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC6769y(name = "StreamsKt")
public final class toq {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlin.streams.jdk8.toq$k */
    /* JADX INFO: compiled from: Sequences.kt */
    @lv5({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 Streams.kt\nkotlin/streams/jdk8/StreamsKt\n*L\n1#1,680:1\n31#2:681\n*E\n"})
    public static final class C6424k<T> implements qrj<T> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Stream f36658k;

        public C6424k(Stream stream) {
            this.f36658k = stream;
        }

        @Override // kotlin.sequences.qrj
        @InterfaceC7396q
        public Iterator<T> iterator() {
            Iterator<T> it = this.f36658k.iterator();
            d2ok.kja0(it, "iterator()");
            return it;
        }
    }

    /* JADX INFO: renamed from: kotlin.streams.jdk8.toq$q */
    /* JADX INFO: compiled from: Sequences.kt */
    @lv5({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 Streams.kt\nkotlin/streams/jdk8/StreamsKt\n*L\n1#1,680:1\n55#2:681\n*E\n"})
    public static final class C6425q implements qrj<Double> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ DoubleStream f36659k;

        public C6425q(DoubleStream doubleStream) {
            this.f36659k = doubleStream;
        }

        @Override // kotlin.sequences.qrj
        @InterfaceC7396q
        public Iterator<Double> iterator() {
            Iterator<Double> it = this.f36659k.iterator();
            d2ok.kja0(it, "iterator()");
            return it;
        }
    }

    /* JADX INFO: renamed from: kotlin.streams.jdk8.toq$toq, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Sequences.kt */
    @lv5({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 Streams.kt\nkotlin/streams/jdk8/StreamsKt\n*L\n1#1,680:1\n39#2:681\n*E\n"})
    public static final class C8061toq implements qrj<Integer> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ IntStream f36660k;

        public C8061toq(IntStream intStream) {
            this.f36660k = intStream;
        }

        @Override // kotlin.sequences.qrj
        @InterfaceC7396q
        public Iterator<Integer> iterator() {
            Iterator<Integer> it = this.f36660k.iterator();
            d2ok.kja0(it, "iterator()");
            return it;
        }
    }

    /* JADX INFO: compiled from: Sequences.kt */
    @lv5({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 Streams.kt\nkotlin/streams/jdk8/StreamsKt\n*L\n1#1,680:1\n47#2:681\n*E\n"})
    public static final class zy implements qrj<Long> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ LongStream f36661k;

        public zy(LongStream longStream) {
            this.f36661k = longStream;
        }

        @Override // kotlin.sequences.qrj
        @InterfaceC7396q
        public Iterator<Long> iterator() {
            Iterator<Long> it = this.f36661k.iterator();
            d2ok.kja0(it, "iterator()");
            return it;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Spliterator f7l8(qrj this_asStream) {
        d2ok.m23075h(this_asStream, "$this_asStream");
        return Spliterators.spliteratorUnknownSize(this_asStream.iterator(), 16);
    }

    @InterfaceC7396q
    @yz(version = "1.2")
    /* JADX INFO: renamed from: g */
    public static final <T> Stream<T> m23495g(@InterfaceC7396q final qrj<? extends T> qrjVar) {
        d2ok.m23075h(qrjVar, "<this>");
        Stream<T> stream = StreamSupport.stream(new Supplier() { // from class: kotlin.streams.jdk8.k
            @Override // java.util.function.Supplier
            public final Object get() {
                return toq.f7l8(qrjVar);
            }
        }, 16, false);
        d2ok.kja0(stream, "stream({ Spliterators.sp…literator.ORDERED, false)");
        return stream;
    }

    @InterfaceC7396q
    @yz(version = "1.2")
    public static final <T> List<T> ld6(@InterfaceC7396q Stream<T> stream) {
        d2ok.m23075h(stream, "<this>");
        Object objCollect = stream.collect(Collectors.toList());
        d2ok.kja0(objCollect, "collect(Collectors.toList<T>())");
        return (List) objCollect;
    }

    @InterfaceC7396q
    @yz(version = "1.2")
    /* JADX INFO: renamed from: n */
    public static final <T> qrj<T> m23497n(@InterfaceC7396q Stream<T> stream) {
        d2ok.m23075h(stream, "<this>");
        return new C6424k(stream);
    }

    @InterfaceC7396q
    @yz(version = "1.2")
    /* JADX INFO: renamed from: p */
    public static final List<Long> m23498p(@InterfaceC7396q LongStream longStream) {
        d2ok.m23075h(longStream, "<this>");
        long[] array = longStream.toArray();
        d2ok.kja0(array, "toArray()");
        return kja0.t8r(array);
    }

    @InterfaceC7396q
    @yz(version = "1.2")
    /* JADX INFO: renamed from: q */
    public static final qrj<Long> m23499q(@InterfaceC7396q LongStream longStream) {
        d2ok.m23075h(longStream, "<this>");
        return new zy(longStream);
    }

    @InterfaceC7396q
    @yz(version = "1.2")
    /* JADX INFO: renamed from: s */
    public static final List<Integer> m23500s(@InterfaceC7396q IntStream intStream) {
        d2ok.m23075h(intStream, "<this>");
        int[] array = intStream.toArray();
        d2ok.kja0(array, "toArray()");
        return kja0.ki(array);
    }

    @InterfaceC7396q
    @yz(version = "1.2")
    public static final qrj<Double> toq(@InterfaceC7396q DoubleStream doubleStream) {
        d2ok.m23075h(doubleStream, "<this>");
        return new C6425q(doubleStream);
    }

    @InterfaceC7396q
    @yz(version = "1.2")
    /* JADX INFO: renamed from: y */
    public static final List<Double> m23501y(@InterfaceC7396q DoubleStream doubleStream) {
        d2ok.m23075h(doubleStream, "<this>");
        double[] array = doubleStream.toArray();
        d2ok.kja0(array, "toArray()");
        return kja0.m22513h(array);
    }

    @InterfaceC7396q
    @yz(version = "1.2")
    public static final qrj<Integer> zy(@InterfaceC7396q IntStream intStream) {
        d2ok.m23075h(intStream, "<this>");
        return new C8061toq(intStream);
    }
}
