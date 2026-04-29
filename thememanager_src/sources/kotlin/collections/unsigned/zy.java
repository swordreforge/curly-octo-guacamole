package kotlin.collections.unsigned;

import cyoe.InterfaceC5979h;
import cyoe.InterfaceC5981k;
import cyoe.cdj;
import cyoe.x2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.C6220d;
import kotlin.C6227f;
import kotlin.C6475u;
import kotlin.InterfaceC6232i;
import kotlin.bo;
import kotlin.collections.C6140e;
import kotlin.collections.C6144h;
import kotlin.collections.C6163t;
import kotlin.collections.a9;
import kotlin.collections.fu4;
import kotlin.collections.jk;
import kotlin.collections.kja0;
import kotlin.collections.n5r1;
import kotlin.collections.ncyb;
import kotlin.collections.ni7;
import kotlin.collections.x9kr;
import kotlin.collections.zurt;
import kotlin.dr;
import kotlin.gyi;
import kotlin.hb;
import kotlin.hyr;
import kotlin.i9jn;
import kotlin.ikck;
import kotlin.internal.InterfaceC6234g;
import kotlin.jvm.internal.AbstractC6308r;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import kotlin.ki;
import kotlin.ld6;
import kotlin.nmn5;
import kotlin.qo;
import kotlin.random.AbstractC6332g;
import kotlin.ranges.fn3e;
import kotlin.tfm;
import kotlin.was;
import kotlin.yz;
import l05.InterfaceC6769y;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: _UArrays.kt */
/* JADX INFO: loaded from: classes3.dex */
@lv5({"SMAP\n_UArrays.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _UArrays.kt\nkotlin/collections/unsigned/UArraysKt___UArraysKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,10733:1\n3775#1:10734\n3783#1:10735\n3791#1:10736\n3799#1:10737\n3775#1:10738\n3783#1:10739\n3791#1:10740\n3799#1:10741\n3775#1:10742\n3783#1:10743\n3791#1:10744\n3799#1:10745\n3775#1:10795\n3783#1:10796\n3791#1:10797\n3799#1:10798\n3775#1:10799\n3783#1:10800\n3791#1:10801\n3799#1:10802\n3775#1:10803\n3783#1:10804\n3791#1:10805\n3799#1:10806\n3775#1:10863\n3783#1:10864\n3791#1:10865\n3799#1:10866\n3775#1:10867\n3783#1:10868\n3791#1:10869\n3799#1:10870\n3775#1:10871\n3783#1:10872\n3791#1:10873\n3799#1:10874\n3775#1:10875\n3783#1:10876\n3791#1:10877\n3799#1:10878\n3775#1:10879\n3783#1:10880\n3791#1:10881\n3799#1:10882\n3775#1:10883\n3783#1:10884\n3791#1:10885\n3799#1:10886\n3775#1:10887\n3783#1:10888\n3791#1:10889\n3799#1:10890\n3775#1:10891\n3783#1:10892\n3791#1:10893\n3799#1:10894\n3775#1:10895\n3783#1:10896\n3791#1:10897\n3799#1:10898\n3775#1:10899\n3783#1:10900\n3791#1:10901\n3799#1:10902\n3775#1:10903\n3783#1:10904\n3791#1:10905\n3799#1:10906\n3775#1:10907\n3783#1:10908\n3791#1:10909\n3799#1:10910\n3775#1:10911\n3783#1:10912\n3791#1:10913\n3799#1:10914\n3775#1:10915\n3783#1:10916\n3791#1:10917\n3799#1:10918\n3775#1:10919\n3783#1:10920\n3791#1:10921\n3799#1:10922\n3775#1:10923\n3783#1:10924\n3791#1:10925\n3799#1:10926\n3775#1:10927\n3783#1:10928\n3791#1:10929\n3799#1:10930\n3775#1:10931\n3783#1:10932\n3791#1:10933\n3799#1:10934\n3775#1:10935\n3783#1:10936\n3791#1:10937\n3799#1:10938\n3775#1:10939\n3783#1:10940\n3791#1:10941\n3799#1:10942\n3775#1:10943\n3783#1:10944\n3791#1:10945\n3799#1:10946\n3775#1:10947\n3783#1:10948\n3791#1:10949\n3799#1:10950\n3775#1:10951\n3783#1:10952\n3791#1:10953\n3799#1:10954\n3775#1:10955\n3783#1:10956\n3791#1:10957\n3799#1:10958\n3775#1:10959\n3783#1:10960\n3791#1:10961\n3799#1:10962\n3775#1:10963\n3783#1:10964\n3791#1:10965\n3799#1:10966\n3775#1:10967\n3783#1:10968\n3791#1:10969\n3799#1:10970\n3775#1:10971\n3783#1:10972\n3791#1:10973\n3799#1:10974\n3775#1:10975\n3783#1:10976\n3791#1:10977\n3799#1:10978\n3775#1:10979\n3783#1:10980\n3791#1:10981\n3799#1:10982\n3775#1:10983\n3783#1:10984\n3791#1:10985\n3799#1:10986\n3775#1:10987\n3783#1:10988\n3791#1:10989\n3799#1:10990\n3775#1:10991\n3783#1:10992\n3791#1:10993\n3799#1:10994\n3775#1:10995\n3783#1:10996\n3791#1:10997\n3799#1:10998\n3775#1:10999\n3783#1:11000\n3791#1:11001\n3799#1:11002\n3775#1:11003\n3783#1:11004\n3791#1:11005\n3799#1:11006\n3775#1:11007\n3783#1:11008\n3791#1:11009\n3799#1:11010\n3775#1:11011\n3783#1:11012\n3791#1:11013\n3799#1:11014\n1663#2,6:10746\n1675#2,6:10752\n1639#2,6:10758\n1651#2,6:10764\n1771#2,6:10770\n1783#2,6:10776\n1747#2,6:10782\n1759#2,6:10788\n1#3:10794\n372#4,7:10807\n372#4,7:10814\n372#4,7:10821\n372#4,7:10828\n372#4,7:10835\n372#4,7:10842\n372#4,7:10849\n372#4,7:10856\n*S KotlinDebug\n*F\n+ 1 _UArrays.kt\nkotlin/collections/unsigned/UArraysKt___UArraysKt\n*L\n326#1:10734\n338#1:10735\n350#1:10736\n362#1:10737\n692#1:10738\n702#1:10739\n712#1:10740\n722#1:10741\n733#1:10742\n744#1:10743\n755#1:10744\n766#1:10745\n1718#1:10795\n1735#1:10796\n1752#1:10797\n1769#1:10798\n2546#1:10799\n2563#1:10800\n2580#1:10801\n2597#1:10802\n2913#1:10803\n2929#1:10804\n2945#1:10805\n2961#1:10806\n5573#1:10863\n5593#1:10864\n5613#1:10865\n5633#1:10866\n5654#1:10867\n5676#1:10868\n5698#1:10869\n5720#1:10870\n5833#1:10871\n5852#1:10872\n5871#1:10873\n5890#1:10874\n5912#1:10875\n5941#1:10876\n5970#1:10877\n5999#1:10878\n6024#1:10879\n6049#1:10880\n6074#1:10881\n6099#1:10882\n6129#1:10883\n6152#1:10884\n6175#1:10885\n6198#1:10886\n6221#1:10887\n6244#1:10888\n6267#1:10889\n6290#1:10890\n6311#1:10891\n6334#1:10892\n6357#1:10893\n6380#1:10894\n6403#1:10895\n6424#1:10896\n6445#1:10897\n6466#1:10898\n6487#1:10899\n6508#1:10900\n6529#1:10901\n6550#1:10902\n6569#1:10903\n6590#1:10904\n6611#1:10905\n6632#1:10906\n6655#1:10907\n6678#1:10908\n6701#1:10909\n6724#1:10910\n6745#1:10911\n6766#1:10912\n6787#1:10913\n6808#1:10914\n6825#1:10915\n6840#1:10916\n6855#1:10917\n6870#1:10918\n6889#1:10919\n6908#1:10920\n6927#1:10921\n6946#1:10922\n6961#1:10923\n6976#1:10924\n6991#1:10925\n7006#1:10926\n7025#1:10927\n7044#1:10928\n7063#1:10929\n7082#1:10930\n7104#1:10931\n7133#1:10932\n7162#1:10933\n7191#1:10934\n7216#1:10935\n7241#1:10936\n7266#1:10937\n7291#1:10938\n7321#1:10939\n7344#1:10940\n7367#1:10941\n7390#1:10942\n7413#1:10943\n7436#1:10944\n7459#1:10945\n7482#1:10946\n7503#1:10947\n7526#1:10948\n7549#1:10949\n7572#1:10950\n7595#1:10951\n7616#1:10952\n7637#1:10953\n7658#1:10954\n7679#1:10955\n7700#1:10956\n7721#1:10957\n7742#1:10958\n7761#1:10959\n7782#1:10960\n7803#1:10961\n7824#1:10962\n7847#1:10963\n7870#1:10964\n7893#1:10965\n7916#1:10966\n7937#1:10967\n7958#1:10968\n7979#1:10969\n8000#1:10970\n8017#1:10971\n8032#1:10972\n8047#1:10973\n8062#1:10974\n8081#1:10975\n8100#1:10976\n8119#1:10977\n8138#1:10978\n8153#1:10979\n8168#1:10980\n8183#1:10981\n8198#1:10982\n8416#1:10983\n8441#1:10984\n8466#1:10985\n8491#1:10986\n8516#1:10987\n8541#1:10988\n8566#1:10989\n8591#1:10990\n8615#1:10991\n8639#1:10992\n8663#1:10993\n8687#1:10994\n8712#1:10995\n8737#1:10996\n8762#1:10997\n8787#1:10998\n8809#1:10999\n8834#1:11000\n8859#1:11001\n8884#1:11002\n8909#1:11003\n8935#1:11004\n8961#1:11005\n8987#1:11006\n9012#1:11007\n9037#1:11008\n9062#1:11009\n9087#1:11010\n9113#1:11011\n9138#1:11012\n9163#1:11013\n9188#1:11014\n816#1:10746,6\n826#1:10752,6\n836#1:10758,6\n846#1:10764,6\n856#1:10770,6\n866#1:10776,6\n876#1:10782,6\n886#1:10788,6\n4791#1:10807,7\n4811#1:10814,7\n4831#1:10821,7\n4851#1:10828,7\n4872#1:10835,7\n4893#1:10842,7\n4914#1:10849,7\n4935#1:10856,7\n*E\n"})
public class zy extends kotlin.collections.unsigned.toq {

    /* JADX INFO: renamed from: kotlin.collections.unsigned.zy$k */
    /* JADX INFO: compiled from: _UArrays.kt */
    static final class C6169k extends AbstractC6308r implements InterfaceC5981k<Iterator<? extends gyi>> {
        final /* synthetic */ int[] $this_withIndex;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C6169k(int[] iArr) {
            super(0);
            this.$this_withIndex = iArr;
        }

        @Override // cyoe.InterfaceC5981k
        @InterfaceC7396q
        public final Iterator<? extends gyi> invoke() {
            return dr.t8r(this.$this_withIndex);
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.unsigned.zy$q */
    /* JADX INFO: compiled from: _UArrays.kt */
    static final class C6170q extends AbstractC6308r implements InterfaceC5981k<Iterator<? extends qo>> {
        final /* synthetic */ short[] $this_withIndex;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C6170q(short[] sArr) {
            super(0);
            this.$this_withIndex = sArr;
        }

        @Override // cyoe.InterfaceC5981k
        @InterfaceC7396q
        public final Iterator<? extends qo> invoke() {
            return tfm.t8r(this.$this_withIndex);
        }
    }

    /* JADX INFO: compiled from: _UArrays.kt */
    static final class toq extends AbstractC6308r implements InterfaceC5981k<Iterator<? extends ikck>> {
        final /* synthetic */ long[] $this_withIndex;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        toq(long[] jArr) {
            super(0);
            this.$this_withIndex = jArr;
        }

        @Override // cyoe.InterfaceC5981k
        @InterfaceC7396q
        public final Iterator<? extends ikck> invoke() {
            return C6220d.t8r(this.$this_withIndex);
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.unsigned.zy$zy, reason: collision with other inner class name */
    /* JADX INFO: compiled from: _UArrays.kt */
    static final class C8053zy extends AbstractC6308r implements InterfaceC5981k<Iterator<? extends C6475u>> {
        final /* synthetic */ byte[] $this_withIndex;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C8053zy(byte[] bArr) {
            super(0);
            this.$this_withIndex = bArr;
        }

        @Override // cyoe.InterfaceC5981k
        @InterfaceC7396q
        public final Iterator<? extends C6475u> invoke() {
            return bo.t8r(this.$this_withIndex);
        }
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    /* JADX INFO: renamed from: a */
    private static final byte[] m22641a(byte[] bArr) {
        d2ok.m23075h(bArr, "<this>");
        return bo.m22412g(bArr);
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final int a3dw(long[] indexOf, long j2) {
        d2ok.m23075h(indexOf, "$this$indexOf");
        return C6144h.que(indexOf, j2);
    }

    @InterfaceC7395n
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final C6475u a46k(@InterfaceC7396q byte[] singleOrNull) {
        d2ok.m23075h(singleOrNull, "$this$singleOrNull");
        if (bo.n7h(singleOrNull) == 1) {
            return C6475u.zy(bo.x2(singleOrNull, 0));
        }
        return null;
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final <R extends Comparable<? super R>> R a4ph(short[] maxOfOrNull, x2<? super qo, ? extends R> selector) {
        d2ok.m23075h(maxOfOrNull, "$this$maxOfOrNull");
        d2ok.m23075h(selector, "selector");
        if (tfm.cdj(maxOfOrNull)) {
            return null;
        }
        R rInvoke = selector.invoke(qo.zy(tfm.x2(maxOfOrNull, 0)));
        n5r1 it = new kotlin.ranges.x2(1, C6144h.orxw(maxOfOrNull)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(qo.zy(tfm.x2(maxOfOrNull, it.nextInt())));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final Iterable<x9kr<C6475u>> a5(@InterfaceC7396q byte[] withIndex) {
        d2ok.m23075h(withIndex, "$this$withIndex");
        return new ncyb(new C8053zy(withIndex));
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final List<qo> a5id(short[] dropLastWhile, x2<? super qo, Boolean> predicate) {
        d2ok.m23075h(dropLastWhile, "$this$dropLastWhile");
        d2ok.m23075h(predicate, "predicate");
        for (int iOrxw = C6144h.orxw(dropLastWhile); -1 < iOrxw; iOrxw--) {
            if (!predicate.invoke(qo.zy(tfm.x2(dropLastWhile, iOrxw))).booleanValue()) {
                return wu7(dropLastWhile, iOrxw + 1);
            }
        }
        return ni7.a9();
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final <R> R a5rs(long[] minOfWith, Comparator<? super R> comparator, x2<? super ikck, ? extends R> selector) {
        d2ok.m23075h(minOfWith, "$this$minOfWith");
        d2ok.m23075h(comparator, "comparator");
        d2ok.m23075h(selector, "selector");
        if (C6220d.cdj(minOfWith)) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(ikck.zy(C6220d.x2(minOfWith, 0)));
        n5r1 it = new kotlin.ranges.x2(1, C6144h.hmvj(minOfWith)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(ikck.zy(C6220d.x2(minOfWith, it.nextInt())));
            if (comparator.compare(rInvoke, rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final <R, C extends Collection<? super R>> C a7zh(int[] mapIndexedTo, C destination, InterfaceC5979h<? super Integer, ? super gyi, ? extends R> transform) {
        d2ok.m23075h(mapIndexedTo, "$this$mapIndexedTo");
        d2ok.m23075h(destination, "destination");
        d2ok.m23075h(transform, "transform");
        int iN7h = dr.n7h(mapIndexedTo);
        int i2 = 0;
        int i3 = 0;
        while (i2 < iN7h) {
            destination.add(transform.invoke(Integer.valueOf(i3), gyi.zy(dr.x2(mapIndexedTo, i2))));
            i2++;
            i3++;
        }
        return destination;
    }

    @yz(version = "1.3")
    @InterfaceC6232i
    public static /* synthetic */ void a8p6(byte[] bArr) {
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final short[] a98o(short[] asShortArray) {
        d2ok.m23075h(asShortArray, "$this$asShortArray");
        return asShortArray;
    }

    @InterfaceC7395n
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final C6475u ab(@InterfaceC7396q byte[] firstOrNull) {
        d2ok.m23075h(firstOrNull, "$this$firstOrNull");
        if (bo.cdj(firstOrNull)) {
            return null;
        }
        return C6475u.zy(bo.x2(firstOrNull, 0));
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final byte ae4(byte[] last) {
        d2ok.m23075h(last, "$this$last");
        return C6475u.ld6(C6144h.lt(last));
    }

    @yz(version = "1.3")
    @InterfaceC6232i
    public static final void afv(@InterfaceC7396q short[] sortDescending) {
        d2ok.m23075h(sortDescending, "$this$sortDescending");
        if (tfm.n7h(sortDescending) > 1) {
            jrla(sortDescending);
            C6144h.tgj1(sortDescending);
        }
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final <R, C extends Collection<? super R>> C ahb(int[] mapTo, C destination, x2<? super gyi, ? extends R> transform) {
        d2ok.m23075h(mapTo, "$this$mapTo");
        d2ok.m23075h(destination, "destination");
        d2ok.m23075h(transform, "transform");
        int iN7h = dr.n7h(mapTo);
        for (int i2 = 0; i2 < iN7h; i2++) {
            destination.add(transform.invoke(gyi.zy(dr.x2(mapTo, i2))));
        }
        return destination;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final byte ahy0(byte[] single, x2<? super C6475u, Boolean> predicate) {
        d2ok.m23075h(single, "$this$single");
        d2ok.m23075h(predicate, "predicate");
        int iN7h = bo.n7h(single);
        C6475u c6475uZy = null;
        boolean z2 = false;
        for (int i2 = 0; i2 < iN7h; i2++) {
            byte bX2 = bo.x2(single, i2);
            if (predicate.invoke(C6475u.zy(bX2)).booleanValue()) {
                if (z2) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                c6475uZy = C6475u.zy(bX2);
                z2 = true;
            }
        }
        if (z2) {
            return c6475uZy.bf2();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final <K> Map<K, List<ikck>> alcv(long[] groupBy, x2<? super ikck, ? extends K> keySelector) {
        d2ok.m23075h(groupBy, "$this$groupBy");
        d2ok.m23075h(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int iN7h = C6220d.n7h(groupBy);
        for (int i2 = 0; i2 < iN7h; i2++) {
            long jX2 = C6220d.x2(groupBy, i2);
            K kInvoke = keySelector.invoke(ikck.zy(jX2));
            Object arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(ikck.zy(jX2));
        }
        return linkedHashMap;
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final int[] an(int[] onEach, x2<? super gyi, was> action) {
        d2ok.m23075h(onEach, "$this$onEach");
        d2ok.m23075h(action, "action");
        int iN7h = dr.n7h(onEach);
        for (int i2 = 0; i2 < iN7h; i2++) {
            action.invoke(gyi.zy(dr.x2(onEach, i2)));
        }
        return onEach;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final <R> R anhx(short[] fold, R r2, InterfaceC5979h<? super R, ? super qo, ? extends R> operation) {
        d2ok.m23075h(fold, "$this$fold");
        d2ok.m23075h(operation, "operation");
        int iN7h = tfm.n7h(fold);
        for (int i2 = 0; i2 < iN7h; i2++) {
            r2 = operation.invoke(r2, qo.zy(tfm.x2(fold, i2)));
        }
        return r2;
    }

    @InterfaceC7396q
    public static final kotlin.ranges.x2 anw(@InterfaceC7396q byte[] indices) {
        d2ok.m23075h(indices, "$this$indices");
        return C6144h.ttq(indices);
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final short ap23(short[] getOrElse, int i2, x2<? super Integer, qo> defaultValue) {
        d2ok.m23075h(getOrElse, "$this$getOrElse");
        d2ok.m23075h(defaultValue, "defaultValue");
        return (i2 < 0 || i2 > C6144h.orxw(getOrElse)) ? defaultValue.invoke(Integer.valueOf(i2)).bf2() : tfm.x2(getOrElse, i2);
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final Double aq2a(byte[] minOfOrNull, x2<? super C6475u, Double> selector) {
        d2ok.m23075h(minOfOrNull, "$this$minOfOrNull");
        d2ok.m23075h(selector, "selector");
        if (bo.cdj(minOfOrNull)) {
            return null;
        }
        double dDoubleValue = selector.invoke(C6475u.zy(bo.x2(minOfOrNull, 0))).doubleValue();
        n5r1 it = new kotlin.ranges.x2(1, C6144h.vl(minOfOrNull)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, selector.invoke(C6475u.zy(bo.x2(minOfOrNull, it.nextInt()))).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final byte ar4(byte[] reduceIndexed, cdj<? super Integer, ? super C6475u, ? super C6475u, C6475u> operation) {
        d2ok.m23075h(reduceIndexed, "$this$reduceIndexed");
        d2ok.m23075h(operation, "operation");
        if (bo.cdj(reduceIndexed)) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        byte bX2 = bo.x2(reduceIndexed, 0);
        n5r1 it = new kotlin.ranges.x2(1, C6144h.vl(reduceIndexed)).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            bX2 = operation.invoke(Integer.valueOf(iNextInt), C6475u.zy(bX2), C6475u.zy(bo.x2(reduceIndexed, iNextInt))).bf2();
        }
        return bX2;
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final List<gyi> as(@InterfaceC7396q int[] takeLast, int i2) {
        d2ok.m23075h(takeLast, "$this$takeLast");
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
        }
        if (i2 == 0) {
            return ni7.a9();
        }
        int iN7h = dr.n7h(takeLast);
        if (i2 >= iN7h) {
            return a9.wr(dr.toq(takeLast));
        }
        if (i2 == 1) {
            return zurt.ld6(gyi.zy(dr.x2(takeLast, iN7h - 1)));
        }
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = iN7h - i2; i3 < iN7h; i3++) {
            arrayList.add(gyi.zy(dr.x2(takeLast, i3)));
        }
        return arrayList;
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final gyi azf(int[] reduceRightIndexedOrNull, cdj<? super Integer, ? super gyi, ? super gyi, gyi> operation) {
        d2ok.m23075h(reduceRightIndexedOrNull, "$this$reduceRightIndexedOrNull");
        d2ok.m23075h(operation, "operation");
        int iSrpc = C6144h.srpc(reduceRightIndexedOrNull);
        if (iSrpc < 0) {
            return null;
        }
        int iX2 = dr.x2(reduceRightIndexedOrNull, iSrpc);
        for (int i2 = iSrpc - 1; i2 >= 0; i2--) {
            iX2 = operation.invoke(Integer.valueOf(i2), gyi.zy(dr.x2(reduceRightIndexedOrNull, i2)), gyi.zy(iX2)).a98o();
        }
        return gyi.zy(iX2);
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final byte[] azz1(byte[] toByteArray) {
        d2ok.m23075h(toByteArray, "$this$toByteArray");
        byte[] bArrCopyOf = Arrays.copyOf(toByteArray, toByteArray.length);
        d2ok.kja0(bArrCopyOf, "copyOf(this, size)");
        return bArrCopyOf;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    /* JADX INFO: renamed from: b */
    private static final byte[] m22642b(byte[] asByteArray) {
        d2ok.m23075h(asByteArray, "$this$asByteArray");
        return asByteArray;
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final long[] b1(@InterfaceC7396q long[] sortedArray) {
        d2ok.m23075h(sortedArray, "$this$sortedArray");
        if (C6220d.cdj(sortedArray)) {
            return sortedArray;
        }
        long[] jArrCopyOf = Arrays.copyOf(sortedArray, sortedArray.length);
        d2ok.kja0(jArrCopyOf, "copyOf(this, size)");
        long[] jArrM22779g = C6220d.m22779g(jArrCopyOf);
        ca(jArrM22779g);
        return jArrM22779g;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final <R> R b2(int[] foldIndexed, R r2, cdj<? super Integer, ? super R, ? super gyi, ? extends R> operation) {
        d2ok.m23075h(foldIndexed, "$this$foldIndexed");
        d2ok.m23075h(operation, "operation");
        int iN7h = dr.n7h(foldIndexed);
        int i2 = 0;
        int i3 = 0;
        while (i2 < iN7h) {
            r2 = operation.invoke(Integer.valueOf(i3), r2, gyi.zy(dr.x2(foldIndexed, i2)));
            i2++;
            i3++;
        }
        return r2;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final int[] b3e(int[] copyInto, int[] destination, int i2, int i3, int i4) {
        d2ok.m23075h(copyInto, "$this$copyInto");
        d2ok.m23075h(destination, "destination");
        kja0.xwq3(copyInto, destination, i2, i3, i4);
        return destination;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final <R> List<R> b3fl(short[] mapIndexed, InterfaceC5979h<? super Integer, ? super qo, ? extends R> transform) {
        d2ok.m23075h(mapIndexed, "$this$mapIndexed");
        d2ok.m23075h(transform, "transform");
        ArrayList arrayList = new ArrayList(tfm.n7h(mapIndexed));
        int iN7h = tfm.n7h(mapIndexed);
        int i2 = 0;
        int i3 = 0;
        while (i2 < iN7h) {
            arrayList.add(transform.invoke(Integer.valueOf(i3), qo.zy(tfm.x2(mapIndexed, i2))));
            i2++;
            i3++;
        }
        return arrayList;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final int b6(byte[] indexOfLast, x2<? super C6475u, Boolean> predicate) {
        d2ok.m23075h(indexOfLast, "$this$indexOfLast");
        d2ok.m23075h(predicate, "predicate");
        int length = indexOfLast.length - 1;
        if (length < 0) {
            return -1;
        }
        while (true) {
            int i2 = length - 1;
            if (predicate.invoke(C6475u.zy(C6475u.ld6(indexOfLast[length]))).booleanValue()) {
                return length;
            }
            if (i2 < 0) {
                return -1;
            }
            length = i2;
        }
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final Float b6i9(short[] maxOfOrNull, x2<? super qo, Float> selector) {
        d2ok.m23075h(maxOfOrNull, "$this$maxOfOrNull");
        d2ok.m23075h(selector, "selector");
        if (tfm.cdj(maxOfOrNull)) {
            return null;
        }
        float fFloatValue = selector.invoke(qo.zy(tfm.x2(maxOfOrNull, 0))).floatValue();
        n5r1 it = new kotlin.ranges.x2(1, C6144h.orxw(maxOfOrNull)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, selector.invoke(qo.zy(tfm.x2(maxOfOrNull, it.nextInt()))).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final long[] b6t2(@InterfaceC7396q long[] sliceArray, @InterfaceC7396q Collection<Integer> indices) {
        d2ok.m23075h(sliceArray, "$this$sliceArray");
        d2ok.m23075h(indices, "indices");
        return C6220d.m22779g(C6144h.oml3(sliceArray, indices));
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final <R, C extends Collection<? super R>> C b7(long[] flatMapIndexedTo, C destination, InterfaceC5979h<? super Integer, ? super ikck, ? extends Iterable<? extends R>> transform) {
        d2ok.m23075h(flatMapIndexedTo, "$this$flatMapIndexedTo");
        d2ok.m23075h(destination, "destination");
        d2ok.m23075h(transform, "transform");
        int iN7h = C6220d.n7h(flatMapIndexedTo);
        int i2 = 0;
        int i3 = 0;
        while (i2 < iN7h) {
            C6163t.zp(destination, transform.invoke(Integer.valueOf(i3), ikck.zy(C6220d.x2(flatMapIndexedTo, i2))));
            i2++;
            i3++;
        }
        return destination;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final byte b8(byte[] elementAtOrElse, int i2, x2<? super Integer, C6475u> defaultValue) {
        d2ok.m23075h(elementAtOrElse, "$this$elementAtOrElse");
        d2ok.m23075h(defaultValue, "defaultValue");
        return (i2 < 0 || i2 > C6144h.vl(elementAtOrElse)) ? defaultValue.invoke(Integer.valueOf(i2)).bf2() : bo.x2(elementAtOrElse, i2);
    }

    @yz(version = "1.7")
    @InterfaceC6769y(name = "maxOrThrow-U")
    @InterfaceC6232i
    public static final byte b972(@InterfaceC7396q byte[] max) {
        d2ok.m23075h(max, "$this$max");
        if (bo.cdj(max)) {
            throw new NoSuchElementException();
        }
        byte bX2 = bo.x2(max, 0);
        n5r1 it = new kotlin.ranges.x2(1, C6144h.vl(max)).iterator();
        while (it.hasNext()) {
            byte bX22 = bo.x2(max, it.nextInt());
            if (d2ok.m23076i(bX2 & 255, bX22 & 255) < 0) {
                bX2 = bX22;
            }
        }
        return bX2;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final long b9ub(long[] elementAtOrElse, int i2, x2<? super Integer, ikck> defaultValue) {
        d2ok.m23075h(elementAtOrElse, "$this$elementAtOrElse");
        d2ok.m23075h(defaultValue, "defaultValue");
        return (i2 < 0 || i2 > C6144h.hmvj(elementAtOrElse)) ? defaultValue.invoke(Integer.valueOf(i2)).a98o() : C6220d.x2(elementAtOrElse, i2);
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final <R> R bao0(short[] maxOfWith, Comparator<? super R> comparator, x2<? super qo, ? extends R> selector) {
        d2ok.m23075h(maxOfWith, "$this$maxOfWith");
        d2ok.m23075h(comparator, "comparator");
        d2ok.m23075h(selector, "selector");
        if (tfm.cdj(maxOfWith)) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(qo.zy(tfm.x2(maxOfWith, 0)));
        n5r1 it = new kotlin.ranges.x2(1, C6144h.orxw(maxOfWith)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(qo.zy(tfm.x2(maxOfWith, it.nextInt())));
            if (comparator.compare(rInvoke, rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final List<C6475u> bap7(@InterfaceC7396q byte[] dropLast, int i2) {
        d2ok.m23075h(dropLast, "$this$dropLast");
        if (i2 >= 0) {
            return hi(dropLast, fn3e.fn3e(bo.n7h(dropLast) - i2, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final <R, C extends Collection<? super R>> C bb(byte[] mapTo, C destination, x2<? super C6475u, ? extends R> transform) {
        d2ok.m23075h(mapTo, "$this$mapTo");
        d2ok.m23075h(destination, "destination");
        d2ok.m23075h(transform, "transform");
        int iN7h = bo.n7h(mapTo);
        for (int i2 = 0; i2 < iN7h; i2++) {
            destination.add(transform.invoke(C6475u.zy(bo.x2(mapTo, i2))));
        }
        return destination;
    }

    @InterfaceC7395n
    @yz(version = "1.4")
    @InterfaceC6232i
    public static final ikck bbg(@InterfaceC7396q long[] minOrNull) {
        d2ok.m23075h(minOrNull, "$this$minOrNull");
        if (C6220d.cdj(minOrNull)) {
            return null;
        }
        long jX2 = C6220d.x2(minOrNull, 0);
        n5r1 it = new kotlin.ranges.x2(1, C6144h.hmvj(minOrNull)).iterator();
        while (it.hasNext()) {
            long jX22 = C6220d.x2(minOrNull, it.nextInt());
            if (Long.compareUnsigned(jX2, jX22) > 0) {
                jX2 = jX22;
            }
        }
        return ikck.zy(jX2);
    }

    static /* synthetic */ int[] bek6(int[] copyInto, int[] destination, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i2 = 0;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = dr.n7h(copyInto);
        }
        d2ok.m23075h(copyInto, "$this$copyInto");
        d2ok.m23075h(destination, "destination");
        kja0.xwq3(copyInto, destination, i2, i3, i4);
        return destination;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final int[] bf2(int[] asIntArray) {
        d2ok.m23075h(asIntArray, "$this$asIntArray");
        return asIntArray;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final <K, M extends Map<? super K, List<C6475u>>> M bf5(byte[] groupByTo, M destination, x2<? super C6475u, ? extends K> keySelector) {
        d2ok.m23075h(groupByTo, "$this$groupByTo");
        d2ok.m23075h(destination, "destination");
        d2ok.m23075h(keySelector, "keySelector");
        int iN7h = bo.n7h(groupByTo);
        for (int i2 = 0; i2 < iN7h; i2++) {
            byte bX2 = bo.x2(groupByTo, i2);
            K kInvoke = keySelector.invoke(C6475u.zy(bX2));
            Object arrayList = destination.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(C6475u.zy(bX2));
        }
        return destination;
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final Iterable<x9kr<gyi>> bg(@InterfaceC7396q int[] withIndex) {
        d2ok.m23075h(withIndex, "$this$withIndex");
        return new ncyb(new C6169k(withIndex));
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6769y(name = "sumOfDouble")
    @InterfaceC6232i
    private static final double bhar(short[] sumOf, x2<? super qo, Double> selector) {
        d2ok.m23075h(sumOf, "$this$sumOf");
        d2ok.m23075h(selector, "selector");
        int iN7h = tfm.n7h(sumOf);
        double dDoubleValue = 0.0d;
        for (int i2 = 0; i2 < iN7h; i2++) {
            dDoubleValue += selector.invoke(qo.zy(tfm.x2(sumOf, i2))).doubleValue();
        }
        return dDoubleValue;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final List<qo> bih(short[] filter, x2<? super qo, Boolean> predicate) {
        d2ok.m23075h(filter, "$this$filter");
        d2ok.m23075h(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int iN7h = tfm.n7h(filter);
        for (int i2 = 0; i2 < iN7h; i2++) {
            short sX2 = tfm.x2(filter, i2);
            if (predicate.invoke(qo.zy(sX2)).booleanValue()) {
                arrayList.add(qo.zy(sX2));
            }
        }
        return arrayList;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final int bl(short[] sum) {
        d2ok.m23075h(sum, "$this$sum");
        int iLd6 = gyi.ld6(0);
        int iN7h = tfm.n7h(sum);
        for (int i2 = 0; i2 < iN7h; i2++) {
            iLd6 = gyi.ld6(iLd6 + gyi.ld6(tfm.x2(sum, i2) & qo.f36486g));
        }
        return iLd6;
    }

    @InterfaceC7395n
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final ikck bmt3(@InterfaceC7396q long[] lastOrNull) {
        d2ok.m23075h(lastOrNull, "$this$lastOrNull");
        if (C6220d.cdj(lastOrNull)) {
            return null;
        }
        return ikck.zy(C6220d.x2(lastOrNull, C6220d.n7h(lastOrNull) - 1));
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final <V, M extends Map<? super gyi, ? super V>> M bo(int[] associateWithTo, M destination, x2<? super gyi, ? extends V> valueSelector) {
        d2ok.m23075h(associateWithTo, "$this$associateWithTo");
        d2ok.m23075h(destination, "destination");
        d2ok.m23075h(valueSelector, "valueSelector");
        int iN7h = dr.n7h(associateWithTo);
        for (int i2 = 0; i2 < iN7h; i2++) {
            int iX2 = dr.x2(associateWithTo, i2);
            destination.put(gyi.zy(iX2), valueSelector.invoke(gyi.zy(iX2)));
        }
        return destination;
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final <R> List<R> bogl(short[] runningFoldIndexed, R r2, cdj<? super Integer, ? super R, ? super qo, ? extends R> operation) {
        d2ok.m23075h(runningFoldIndexed, "$this$runningFoldIndexed");
        d2ok.m23075h(operation, "operation");
        if (tfm.cdj(runningFoldIndexed)) {
            return zurt.ld6(r2);
        }
        ArrayList arrayList = new ArrayList(tfm.n7h(runningFoldIndexed) + 1);
        arrayList.add(r2);
        int iN7h = tfm.n7h(runningFoldIndexed);
        for (int i2 = 0; i2 < iN7h; i2++) {
            r2 = operation.invoke(Integer.valueOf(i2), r2, qo.zy(tfm.x2(runningFoldIndexed, i2)));
            arrayList.add(r2);
        }
        return arrayList;
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final <R> R bp(long[] maxOfWith, Comparator<? super R> comparator, x2<? super ikck, ? extends R> selector) {
        d2ok.m23075h(maxOfWith, "$this$maxOfWith");
        d2ok.m23075h(comparator, "comparator");
        d2ok.m23075h(selector, "selector");
        if (C6220d.cdj(maxOfWith)) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(ikck.zy(C6220d.x2(maxOfWith, 0)));
        n5r1 it = new kotlin.ranges.x2(1, C6144h.hmvj(maxOfWith)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(ikck.zy(C6220d.x2(maxOfWith, it.nextInt())));
            if (comparator.compare(rInvoke, rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final <C extends Collection<? super qo>> C bqie(short[] filterNotTo, C destination, x2<? super qo, Boolean> predicate) {
        d2ok.m23075h(filterNotTo, "$this$filterNotTo");
        d2ok.m23075h(destination, "destination");
        d2ok.m23075h(predicate, "predicate");
        int iN7h = tfm.n7h(filterNotTo);
        for (int i2 = 0; i2 < iN7h; i2++) {
            short sX2 = tfm.x2(filterNotTo, i2);
            if (!predicate.invoke(qo.zy(sX2)).booleanValue()) {
                destination.add(qo.zy(sX2));
            }
        }
        return destination;
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final long[] bru(@InterfaceC7396q long[] plus, @InterfaceC7396q Collection<ikck> elements) {
        d2ok.m23075h(plus, "$this$plus");
        d2ok.m23075h(elements, "elements");
        int iN7h = C6220d.n7h(plus);
        long[] jArrCopyOf = Arrays.copyOf(plus, C6220d.n7h(plus) + elements.size());
        d2ok.kja0(jArrCopyOf, "copyOf(this, newSize)");
        Iterator<ikck> it = elements.iterator();
        while (it.hasNext()) {
            jArrCopyOf[iN7h] = it.next().a98o();
            iN7h++;
        }
        return C6220d.m22779g(jArrCopyOf);
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final <K> Map<K, List<qo>> brv(short[] groupBy, x2<? super qo, ? extends K> keySelector) {
        d2ok.m23075h(groupBy, "$this$groupBy");
        d2ok.m23075h(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int iN7h = tfm.n7h(groupBy);
        for (int i2 = 0; i2 < iN7h; i2++) {
            short sX2 = tfm.x2(groupBy, i2);
            K kInvoke = keySelector.invoke(qo.zy(sX2));
            Object arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(qo.zy(sX2));
        }
        return linkedHashMap;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final <C extends Collection<? super C6475u>> C btvn(byte[] filterTo, C destination, x2<? super C6475u, Boolean> predicate) {
        d2ok.m23075h(filterTo, "$this$filterTo");
        d2ok.m23075h(destination, "destination");
        d2ok.m23075h(predicate, "predicate");
        int iN7h = bo.n7h(filterTo);
        for (int i2 = 0; i2 < iN7h; i2++) {
            byte bX2 = bo.x2(filterTo, i2);
            if (predicate.invoke(C6475u.zy(bX2)).booleanValue()) {
                destination.add(C6475u.zy(bX2));
            }
        }
        return destination;
    }

    @InterfaceC6234g
    @yz(version = "1.7")
    @InterfaceC6769y(name = "minByOrThrow-U")
    @InterfaceC6232i
    private static final <R extends Comparable<? super R>> short bv(short[] minBy, x2<? super qo, ? extends R> selector) {
        d2ok.m23075h(minBy, "$this$minBy");
        d2ok.m23075h(selector, "selector");
        if (tfm.cdj(minBy)) {
            throw new NoSuchElementException();
        }
        short sX2 = tfm.x2(minBy, 0);
        int iOrxw = C6144h.orxw(minBy);
        if (iOrxw == 0) {
            return sX2;
        }
        R rInvoke = selector.invoke(qo.zy(sX2));
        n5r1 it = new kotlin.ranges.x2(1, iOrxw).iterator();
        while (it.hasNext()) {
            short sX22 = tfm.x2(minBy, it.nextInt());
            R rInvoke2 = selector.invoke(qo.zy(sX22));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                sX2 = sX22;
                rInvoke = rInvoke2;
            }
        }
        return sX2;
    }

    @InterfaceC7396q
    @yz(version = "1.4")
    @InterfaceC6232i
    public static String bwp(@InterfaceC7395n short[] sArr) {
        String strUo;
        return (sArr == null || (strUo = a9.uo(tfm.toq(sArr), ", ", "[", "]", 0, null, null, 56, null)) == null) ? "null" : strUo;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final short[] bz2(short[] copyInto, short[] destination, int i2, int i3, int i4) {
        d2ok.m23075h(copyInto, "$this$copyInto");
        d2ok.m23075h(destination, "destination");
        kja0.m22510d(copyInto, destination, i2, i3, i4);
        return destination;
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final <R> List<R> bz4g(byte[] runningFold, R r2, InterfaceC5979h<? super R, ? super C6475u, ? extends R> operation) {
        d2ok.m23075h(runningFold, "$this$runningFold");
        d2ok.m23075h(operation, "operation");
        if (bo.cdj(runningFold)) {
            return zurt.ld6(r2);
        }
        ArrayList arrayList = new ArrayList(bo.n7h(runningFold) + 1);
        arrayList.add(r2);
        int iN7h = bo.n7h(runningFold);
        for (int i2 = 0; i2 < iN7h; i2++) {
            r2 = operation.invoke(r2, C6475u.zy(bo.x2(runningFold, i2)));
            arrayList.add(r2);
        }
        return arrayList;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final short[] c08(short[] reversedArray) {
        d2ok.m23075h(reversedArray, "$this$reversedArray");
        return tfm.m23651g(C6144h.n9v(reversedArray));
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final ikck c2(long[] lastOrNull, x2<? super ikck, Boolean> predicate) {
        d2ok.m23075h(lastOrNull, "$this$lastOrNull");
        d2ok.m23075h(predicate, "predicate");
        int iN7h = C6220d.n7h(lastOrNull) - 1;
        if (iN7h < 0) {
            return null;
        }
        while (true) {
            int i2 = iN7h - 1;
            long jX2 = C6220d.x2(lastOrNull, iN7h);
            if (predicate.invoke(ikck.zy(jX2)).booleanValue()) {
                return ikck.zy(jX2);
            }
            if (i2 < 0) {
                return null;
            }
            iN7h = i2;
        }
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final C6475u c25(byte[] firstOrNull, x2<? super C6475u, Boolean> predicate) {
        d2ok.m23075h(firstOrNull, "$this$firstOrNull");
        d2ok.m23075h(predicate, "predicate");
        int iN7h = bo.n7h(firstOrNull);
        for (int i2 = 0; i2 < iN7h; i2++) {
            byte bX2 = bo.x2(firstOrNull, i2);
            if (predicate.invoke(C6475u.zy(bX2)).booleanValue()) {
                return C6475u.zy(bX2);
            }
        }
        return null;
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final short[] c2lu(short[] onEachIndexed, InterfaceC5979h<? super Integer, ? super qo, was> action) {
        d2ok.m23075h(onEachIndexed, "$this$onEachIndexed");
        d2ok.m23075h(action, "action");
        int iN7h = tfm.n7h(onEachIndexed);
        int i2 = 0;
        int i3 = 0;
        while (i2 < iN7h) {
            action.invoke(Integer.valueOf(i3), qo.zy(tfm.x2(onEachIndexed, i2)));
            i2++;
            i3++;
        }
        return onEachIndexed;
    }

    @i9jn(markerClass = {ki.class})
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final <R> List<R> c3(int[] scan, R r2, InterfaceC5979h<? super R, ? super gyi, ? extends R> operation) {
        d2ok.m23075h(scan, "$this$scan");
        d2ok.m23075h(operation, "operation");
        if (dr.cdj(scan)) {
            return zurt.ld6(r2);
        }
        ArrayList arrayList = new ArrayList(dr.n7h(scan) + 1);
        arrayList.add(r2);
        int iN7h = dr.n7h(scan);
        for (int i2 = 0; i2 < iN7h; i2++) {
            r2 = operation.invoke(r2, gyi.zy(dr.x2(scan, i2)));
            arrayList.add(r2);
        }
        return arrayList;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final void c3sl(long[] reverse) {
        d2ok.m23075h(reverse, "$this$reverse");
        C6144h.sxq(reverse);
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final <R> R c4(int[] minOfWith, Comparator<? super R> comparator, x2<? super gyi, ? extends R> selector) {
        d2ok.m23075h(minOfWith, "$this$minOfWith");
        d2ok.m23075h(comparator, "comparator");
        d2ok.m23075h(selector, "selector");
        if (dr.cdj(minOfWith)) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(gyi.zy(dr.x2(minOfWith, 0)));
        n5r1 it = new kotlin.ranges.x2(1, C6144h.srpc(minOfWith)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(gyi.zy(dr.x2(minOfWith, it.nextInt())));
            if (comparator.compare(rInvoke, rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @hyr
    @InterfaceC6234g
    @yz(version = "1.5")
    @InterfaceC6769y(name = "sumOfUInt")
    @InterfaceC6232i
    private static final int c4k8(byte[] sumOf, x2<? super C6475u, gyi> selector) {
        d2ok.m23075h(sumOf, "$this$sumOf");
        d2ok.m23075h(selector, "selector");
        int iLd6 = gyi.ld6(0);
        int iN7h = bo.n7h(sumOf);
        for (int i2 = 0; i2 < iN7h; i2++) {
            iLd6 = gyi.ld6(iLd6 + selector.invoke(C6475u.zy(bo.x2(sumOf, i2))).a98o());
        }
        return iLd6;
    }

    @yz(version = "1.4")
    @InterfaceC6232i
    public static final void c4my(@InterfaceC7396q byte[] sort, int i2, int i3) {
        d2ok.m23075h(sort, "$this$sort");
        kotlin.collections.zy.Companion.m22683q(i2, i3, bo.n7h(sort));
        kotlin.collections.lv5.m22556p(sort, i2, i3);
    }

    @yz(version = "1.7")
    @InterfaceC6769y(name = "maxOrThrow-U")
    @InterfaceC6232i
    public static final short c7g(@InterfaceC7396q short[] max) {
        d2ok.m23075h(max, "$this$max");
        if (tfm.cdj(max)) {
            throw new NoSuchElementException();
        }
        short sX2 = tfm.x2(max, 0);
        n5r1 it = new kotlin.ranges.x2(1, C6144h.orxw(max)).iterator();
        while (it.hasNext()) {
            short sX22 = tfm.x2(max, it.nextInt());
            if (d2ok.m23076i(sX2 & qo.f36486g, 65535 & sX22) < 0) {
                sX2 = sX22;
            }
        }
        return sX2;
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final <V, M extends Map<? super ikck, ? super V>> M c8jq(long[] associateWithTo, M destination, x2<? super ikck, ? extends V> valueSelector) {
        d2ok.m23075h(associateWithTo, "$this$associateWithTo");
        d2ok.m23075h(destination, "destination");
        d2ok.m23075h(valueSelector, "valueSelector");
        int iN7h = C6220d.n7h(associateWithTo);
        for (int i2 = 0; i2 < iN7h; i2++) {
            long jX2 = C6220d.x2(associateWithTo, i2);
            destination.put(ikck.zy(jX2), valueSelector.invoke(ikck.zy(jX2)));
        }
        return destination;
    }

    @kotlin.x2(warningSince = "1.5")
    @InterfaceC6234g
    @ld6(message = "Use sumOf instead.", replaceWith = @hb(expression = "this.sumOf(selector)", imports = {}))
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final int c8n3(int[] sumBy, x2<? super gyi, gyi> selector) {
        d2ok.m23075h(sumBy, "$this$sumBy");
        d2ok.m23075h(selector, "selector");
        int iN7h = dr.n7h(sumBy);
        int iLd6 = 0;
        for (int i2 = 0; i2 < iN7h; i2++) {
            iLd6 = gyi.ld6(iLd6 + selector.invoke(gyi.zy(dr.x2(sumBy, i2))).a98o());
        }
        return iLd6;
    }

    @yz(version = "1.3")
    @InterfaceC6232i
    public static final void ca(@InterfaceC7396q long[] sort) {
        d2ok.m23075h(sort, "$this$sort");
        if (C6220d.n7h(sort) > 1) {
            kotlin.collections.lv5.m22558s(sort, 0, C6220d.n7h(sort));
        }
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final int cb(short[] indexOfLast, x2<? super qo, Boolean> predicate) {
        d2ok.m23075h(indexOfLast, "$this$indexOfLast");
        d2ok.m23075h(predicate, "predicate");
        int length = indexOfLast.length - 1;
        if (length < 0) {
            return -1;
        }
        while (true) {
            int i2 = length - 1;
            if (predicate.invoke(qo.zy(qo.ld6(indexOfLast[length]))).booleanValue()) {
                return length;
            }
            if (i2 < 0) {
                return -1;
            }
            length = i2;
        }
    }

    @yz(version = "1.7")
    @InterfaceC6769y(name = "maxWithOrThrow-U")
    @InterfaceC6232i
    public static final byte cc1(@InterfaceC7396q byte[] maxWith, @InterfaceC7396q Comparator<? super C6475u> comparator) {
        d2ok.m23075h(maxWith, "$this$maxWith");
        d2ok.m23075h(comparator, "comparator");
        if (bo.cdj(maxWith)) {
            throw new NoSuchElementException();
        }
        byte bX2 = bo.x2(maxWith, 0);
        n5r1 it = new kotlin.ranges.x2(1, C6144h.vl(maxWith)).iterator();
        while (it.hasNext()) {
            byte bX22 = bo.x2(maxWith, it.nextInt());
            if (comparator.compare(C6475u.zy(bX2), C6475u.zy(bX22)) < 0) {
                bX2 = bX22;
            }
        }
        return bX2;
    }

    @yz(version = "1.3")
    @InterfaceC6232i
    public static final void ceo(@InterfaceC7396q int[] sort) {
        d2ok.m23075h(sort, "$this$sort");
        if (dr.n7h(sort) > 1) {
            kotlin.collections.lv5.x2(sort, 0, dr.n7h(sort));
        }
    }

    @yz(version = "1.4")
    @InterfaceC6232i
    public static final int cfr(@InterfaceC7395n int[] iArr) {
        if (iArr == null) {
            iArr = null;
        }
        return Arrays.hashCode(iArr);
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final short[] ch(short[] sArr) {
        d2ok.m23075h(sArr, "<this>");
        return tfm.m23651g(sArr);
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final List<qo> cin(@InterfaceC7396q short[] takeLast, int i2) {
        d2ok.m23075h(takeLast, "$this$takeLast");
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
        }
        if (i2 == 0) {
            return ni7.a9();
        }
        int iN7h = tfm.n7h(takeLast);
        if (i2 >= iN7h) {
            return a9.wr(tfm.toq(takeLast));
        }
        if (i2 == 1) {
            return zurt.ld6(qo.zy(tfm.x2(takeLast, iN7h - 1)));
        }
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = iN7h - i2; i3 < iN7h; i3++) {
            arrayList.add(qo.zy(tfm.x2(takeLast, i3)));
        }
        return arrayList;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final <K, V> Map<K, List<V>> cjaj(short[] groupBy, x2<? super qo, ? extends K> keySelector, x2<? super qo, ? extends V> valueTransform) {
        d2ok.m23075h(groupBy, "$this$groupBy");
        d2ok.m23075h(keySelector, "keySelector");
        d2ok.m23075h(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int iN7h = tfm.n7h(groupBy);
        for (int i2 = 0; i2 < iN7h; i2++) {
            short sX2 = tfm.x2(groupBy, i2);
            K kInvoke = keySelector.invoke(qo.zy(sX2));
            List<V> arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(kInvoke, arrayList);
            }
            arrayList.add(valueTransform.invoke(qo.zy(sX2)));
        }
        return linkedHashMap;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final qo cn02(short[] find, x2<? super qo, Boolean> predicate) {
        d2ok.m23075h(find, "$this$find");
        d2ok.m23075h(predicate, "predicate");
        int iN7h = tfm.n7h(find);
        for (int i2 = 0; i2 < iN7h; i2++) {
            short sX2 = tfm.x2(find, i2);
            if (predicate.invoke(qo.zy(sX2)).booleanValue()) {
                return qo.zy(sX2);
            }
        }
        return null;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final int cnbm(int[] elementAtOrElse, int i2, x2<? super Integer, gyi> defaultValue) {
        d2ok.m23075h(elementAtOrElse, "$this$elementAtOrElse");
        d2ok.m23075h(defaultValue, "defaultValue");
        return (i2 < 0 || i2 > C6144h.srpc(elementAtOrElse)) ? defaultValue.invoke(Integer.valueOf(i2)).a98o() : dr.x2(elementAtOrElse, i2);
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final gyi cns(int[] singleOrNull, x2<? super gyi, Boolean> predicate) {
        d2ok.m23075h(singleOrNull, "$this$singleOrNull");
        d2ok.m23075h(predicate, "predicate");
        int iN7h = dr.n7h(singleOrNull);
        boolean z2 = false;
        gyi gyiVarZy = null;
        for (int i2 = 0; i2 < iN7h; i2++) {
            int iX2 = dr.x2(singleOrNull, i2);
            if (predicate.invoke(gyi.zy(iX2)).booleanValue()) {
                if (z2) {
                    return null;
                }
                gyiVarZy = gyi.zy(iX2);
                z2 = true;
            }
        }
        if (z2) {
            return gyiVarZy;
        }
        return null;
    }

    @InterfaceC7395n
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final C6475u cp(@InterfaceC7396q byte[] lastOrNull) {
        d2ok.m23075h(lastOrNull, "$this$lastOrNull");
        if (bo.cdj(lastOrNull)) {
            return null;
        }
        return C6475u.zy(bo.x2(lastOrNull, bo.n7h(lastOrNull) - 1));
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final <K, M extends Map<? super K, List<gyi>>> M cr3(int[] groupByTo, M destination, x2<? super gyi, ? extends K> keySelector) {
        d2ok.m23075h(groupByTo, "$this$groupByTo");
        d2ok.m23075h(destination, "destination");
        d2ok.m23075h(keySelector, "keySelector");
        int iN7h = dr.n7h(groupByTo);
        for (int i2 = 0; i2 < iN7h; i2++) {
            int iX2 = dr.x2(groupByTo, i2);
            K kInvoke = keySelector.invoke(gyi.zy(iX2));
            Object arrayList = destination.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(gyi.zy(iX2));
        }
        return destination;
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final Float crha(int[] minOfOrNull, x2<? super gyi, Float> selector) {
        d2ok.m23075h(minOfOrNull, "$this$minOfOrNull");
        d2ok.m23075h(selector, "selector");
        if (dr.cdj(minOfOrNull)) {
            return null;
        }
        float fFloatValue = selector.invoke(gyi.zy(dr.x2(minOfOrNull, 0))).floatValue();
        n5r1 it = new kotlin.ranges.x2(1, C6144h.srpc(minOfOrNull)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, selector.invoke(gyi.zy(dr.x2(minOfOrNull, it.nextInt()))).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @kotlin.x2(warningSince = "1.5")
    @InterfaceC6234g
    @ld6(message = "Use sumOf instead.", replaceWith = @hb(expression = "this.sumOf(selector)", imports = {}))
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final int ct(short[] sumBy, x2<? super qo, gyi> selector) {
        d2ok.m23075h(sumBy, "$this$sumBy");
        d2ok.m23075h(selector, "selector");
        int iN7h = tfm.n7h(sumBy);
        int iLd6 = 0;
        for (int i2 = 0; i2 < iN7h; i2++) {
            iLd6 = gyi.ld6(iLd6 + selector.invoke(qo.zy(tfm.x2(sumBy, i2))).a98o());
        }
        return iLd6;
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final <R> List<R> cud(long[] runningFoldIndexed, R r2, cdj<? super Integer, ? super R, ? super ikck, ? extends R> operation) {
        d2ok.m23075h(runningFoldIndexed, "$this$runningFoldIndexed");
        d2ok.m23075h(operation, "operation");
        if (C6220d.cdj(runningFoldIndexed)) {
            return zurt.ld6(r2);
        }
        ArrayList arrayList = new ArrayList(C6220d.n7h(runningFoldIndexed) + 1);
        arrayList.add(r2);
        int iN7h = C6220d.n7h(runningFoldIndexed);
        for (int i2 = 0; i2 < iN7h; i2++) {
            r2 = operation.invoke(Integer.valueOf(i2), r2, ikck.zy(C6220d.x2(runningFoldIndexed, i2)));
            arrayList.add(r2);
        }
        return arrayList;
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final <R> R cun(int[] minOfWithOrNull, Comparator<? super R> comparator, x2<? super gyi, ? extends R> selector) {
        d2ok.m23075h(minOfWithOrNull, "$this$minOfWithOrNull");
        d2ok.m23075h(comparator, "comparator");
        d2ok.m23075h(selector, "selector");
        if (dr.cdj(minOfWithOrNull)) {
            return null;
        }
        R rInvoke = selector.invoke(gyi.zy(dr.x2(minOfWithOrNull, 0)));
        n5r1 it = new kotlin.ranges.x2(1, C6144h.srpc(minOfWithOrNull)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(gyi.zy(dr.x2(minOfWithOrNull, it.nextInt())));
            if (comparator.compare(rInvoke, rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final int[] cv06(int[] copyOf) {
        d2ok.m23075h(copyOf, "$this$copyOf");
        int[] iArrCopyOf = Arrays.copyOf(copyOf, copyOf.length);
        d2ok.kja0(iArrCopyOf, "copyOf(this, size)");
        return dr.m22802g(iArrCopyOf);
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final List<C6475u> cw(byte[] takeWhile, x2<? super C6475u, Boolean> predicate) {
        d2ok.m23075h(takeWhile, "$this$takeWhile");
        d2ok.m23075h(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int iN7h = bo.n7h(takeWhile);
        for (int i2 = 0; i2 < iN7h; i2++) {
            byte bX2 = bo.x2(takeWhile, i2);
            if (!predicate.invoke(C6475u.zy(bX2)).booleanValue()) {
                break;
            }
            arrayList.add(C6475u.zy(bX2));
        }
        return arrayList;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final <R, C extends Collection<? super R>> C cyg(long[] mapTo, C destination, x2<? super ikck, ? extends R> transform) {
        d2ok.m23075h(mapTo, "$this$mapTo");
        d2ok.m23075h(destination, "destination");
        d2ok.m23075h(transform, "transform");
        int iN7h = C6220d.n7h(mapTo);
        for (int i2 = 0; i2 < iN7h; i2++) {
            destination.add(transform.invoke(ikck.zy(C6220d.x2(mapTo, i2))));
        }
        return destination;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final <C extends Collection<? super qo>> C cyoe(short[] filterIndexedTo, C destination, InterfaceC5979h<? super Integer, ? super qo, Boolean> predicate) {
        d2ok.m23075h(filterIndexedTo, "$this$filterIndexedTo");
        d2ok.m23075h(destination, "destination");
        d2ok.m23075h(predicate, "predicate");
        int iN7h = tfm.n7h(filterIndexedTo);
        int i2 = 0;
        int i3 = 0;
        while (i2 < iN7h) {
            short sX2 = tfm.x2(filterIndexedTo, i2);
            int i4 = i3 + 1;
            if (predicate.invoke(Integer.valueOf(i3), qo.zy(sX2)).booleanValue()) {
                destination.add(qo.zy(sX2));
            }
            i2++;
            i3 = i4;
        }
        return destination;
    }

    @kotlin.x2(warningSince = "1.5")
    @InterfaceC6234g
    @ld6(message = "Use sumOf instead.", replaceWith = @hb(expression = "this.sumOf(selector)", imports = {}))
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final double czxz(byte[] sumByDouble, x2<? super C6475u, Double> selector) {
        d2ok.m23075h(sumByDouble, "$this$sumByDouble");
        d2ok.m23075h(selector, "selector");
        int iN7h = bo.n7h(sumByDouble);
        double dDoubleValue = 0.0d;
        for (int i2 = 0; i2 < iN7h; i2++) {
            dDoubleValue += selector.invoke(C6475u.zy(bo.x2(sumByDouble, i2))).doubleValue();
        }
        return dDoubleValue;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    /* JADX INFO: renamed from: d */
    private static final int m22643d(int[] component2) {
        d2ok.m23075h(component2, "$this$component2");
        return dr.x2(component2, 1);
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final <R> List<R> d1ts(short[] flatMap, x2<? super qo, ? extends Iterable<? extends R>> transform) {
        d2ok.m23075h(flatMap, "$this$flatMap");
        d2ok.m23075h(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int iN7h = tfm.n7h(flatMap);
        for (int i2 = 0; i2 < iN7h; i2++) {
            C6163t.zp(arrayList, transform.invoke(qo.zy(tfm.x2(flatMap, i2))));
        }
        return arrayList;
    }

    public static final int d6c(@InterfaceC7396q byte[] lastIndex) {
        d2ok.m23075h(lastIndex, "$this$lastIndex");
        return C6144h.vl(lastIndex);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final <K, V, M extends Map<? super K, List<V>>> M d6od(short[] groupByTo, M destination, x2<? super qo, ? extends K> keySelector, x2<? super qo, ? extends V> valueTransform) {
        d2ok.m23075h(groupByTo, "$this$groupByTo");
        d2ok.m23075h(destination, "destination");
        d2ok.m23075h(keySelector, "keySelector");
        d2ok.m23075h(valueTransform, "valueTransform");
        int iN7h = tfm.n7h(groupByTo);
        for (int i2 = 0; i2 < iN7h; i2++) {
            short sX2 = tfm.x2(groupByTo, i2);
            K kInvoke = keySelector.invoke(qo.zy(sX2));
            Object arrayList = destination.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(valueTransform.invoke(qo.zy(sX2)));
        }
        return destination;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final int d7y(int[] reduceIndexed, cdj<? super Integer, ? super gyi, ? super gyi, gyi> operation) {
        d2ok.m23075h(reduceIndexed, "$this$reduceIndexed");
        d2ok.m23075h(operation, "operation");
        if (dr.cdj(reduceIndexed)) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        int iX2 = dr.x2(reduceIndexed, 0);
        n5r1 it = new kotlin.ranges.x2(1, C6144h.srpc(reduceIndexed)).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            iX2 = operation.invoke(Integer.valueOf(iNextInt), gyi.zy(iX2), gyi.zy(dr.x2(reduceIndexed, iNextInt))).a98o();
        }
        return iX2;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final int d8wk(int[] component4) {
        d2ok.m23075h(component4, "$this$component4");
        return dr.x2(component4, 3);
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final int d9i(int[] last) {
        d2ok.m23075h(last, "$this$last");
        return gyi.ld6(C6144h.bhh(last));
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final int[] da(int[] plus, int[] elements) {
        d2ok.m23075h(plus, "$this$plus");
        d2ok.m23075h(elements, "elements");
        return dr.m22802g(kja0.le7(plus, elements));
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final long dbf(long[] getOrElse, int i2, x2<? super Integer, ikck> defaultValue) {
        d2ok.m23075h(getOrElse, "$this$getOrElse");
        d2ok.m23075h(defaultValue, "defaultValue");
        return (i2 < 0 || i2 > C6144h.hmvj(getOrElse)) ? defaultValue.invoke(Integer.valueOf(i2)).a98o() : C6220d.x2(getOrElse, i2);
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final List<C6227f<qo, qo>> de95(@InterfaceC7396q short[] zip, @InterfaceC7396q short[] other) {
        d2ok.m23075h(zip, "$this$zip");
        d2ok.m23075h(other, "other");
        int iMin = Math.min(tfm.n7h(zip), tfm.n7h(other));
        ArrayList arrayList = new ArrayList(iMin);
        for (int i2 = 0; i2 < iMin; i2++) {
            arrayList.add(nmn5.m23230k(qo.zy(tfm.x2(zip, i2)), qo.zy(tfm.x2(other, i2))));
        }
        return arrayList;
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final qo dgmt(short[] reduceIndexedOrNull, cdj<? super Integer, ? super qo, ? super qo, qo> operation) {
        d2ok.m23075h(reduceIndexedOrNull, "$this$reduceIndexedOrNull");
        d2ok.m23075h(operation, "operation");
        if (tfm.cdj(reduceIndexedOrNull)) {
            return null;
        }
        short sX2 = tfm.x2(reduceIndexedOrNull, 0);
        n5r1 it = new kotlin.ranges.x2(1, C6144h.orxw(reduceIndexedOrNull)).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            sX2 = operation.invoke(Integer.valueOf(iNextInt), qo.zy(sX2), qo.zy(tfm.x2(reduceIndexedOrNull, iNextInt))).bf2();
        }
        return qo.zy(sX2);
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final <R extends Comparable<? super R>> R dhzo(int[] minOfOrNull, x2<? super gyi, ? extends R> selector) {
        d2ok.m23075h(minOfOrNull, "$this$minOfOrNull");
        d2ok.m23075h(selector, "selector");
        if (dr.cdj(minOfOrNull)) {
            return null;
        }
        R rInvoke = selector.invoke(gyi.zy(dr.x2(minOfOrNull, 0)));
        n5r1 it = new kotlin.ranges.x2(1, C6144h.srpc(minOfOrNull)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(gyi.zy(dr.x2(minOfOrNull, it.nextInt())));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @hyr
    @InterfaceC6234g
    @yz(version = "1.5")
    @InterfaceC6769y(name = "sumOfULong")
    @InterfaceC6232i
    private static final long dkhc(byte[] sumOf, x2<? super C6475u, ikck> selector) {
        d2ok.m23075h(sumOf, "$this$sumOf");
        d2ok.m23075h(selector, "selector");
        long jLd6 = ikck.ld6(0L);
        int iN7h = bo.n7h(sumOf);
        for (int i2 = 0; i2 < iN7h; i2++) {
            jLd6 = ikck.ld6(jLd6 + selector.invoke(C6475u.zy(bo.x2(sumOf, i2))).a98o());
        }
        return jLd6;
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final <R extends Comparable<? super R>> R dm(long[] maxOfOrNull, x2<? super ikck, ? extends R> selector) {
        d2ok.m23075h(maxOfOrNull, "$this$maxOfOrNull");
        d2ok.m23075h(selector, "selector");
        if (C6220d.cdj(maxOfOrNull)) {
            return null;
        }
        R rInvoke = selector.invoke(ikck.zy(C6220d.x2(maxOfOrNull, 0)));
        n5r1 it = new kotlin.ranges.x2(1, C6144h.hmvj(maxOfOrNull)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(ikck.zy(C6220d.x2(maxOfOrNull, it.nextInt())));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final <R> R dmw0(long[] maxOfWithOrNull, Comparator<? super R> comparator, x2<? super ikck, ? extends R> selector) {
        d2ok.m23075h(maxOfWithOrNull, "$this$maxOfWithOrNull");
        d2ok.m23075h(comparator, "comparator");
        d2ok.m23075h(selector, "selector");
        if (C6220d.cdj(maxOfWithOrNull)) {
            return null;
        }
        R rInvoke = selector.invoke(ikck.zy(C6220d.x2(maxOfWithOrNull, 0)));
        n5r1 it = new kotlin.ranges.x2(1, C6144h.hmvj(maxOfWithOrNull)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(ikck.zy(C6220d.x2(maxOfWithOrNull, it.nextInt())));
            if (comparator.compare(rInvoke, rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    /* JADX INFO: renamed from: do, reason: not valid java name */
    private static final byte[] m28277do(byte[] copyOfRange, int i2, int i3) {
        d2ok.m23075h(copyOfRange, "$this$copyOfRange");
        return bo.m22412g(kja0.zkd(copyOfRange, i2, i3));
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final int dr(int[] component1) {
        d2ok.m23075h(component1, "$this$component1");
        return dr.x2(component1, 0);
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final <R> List<R> drpy(short[] map, x2<? super qo, ? extends R> transform) {
        d2ok.m23075h(map, "$this$map");
        d2ok.m23075h(transform, "transform");
        ArrayList arrayList = new ArrayList(tfm.n7h(map));
        int iN7h = tfm.n7h(map);
        for (int i2 = 0; i2 < iN7h; i2++) {
            arrayList.add(transform.invoke(qo.zy(tfm.x2(map, i2))));
        }
        return arrayList;
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final short[] dw(@InterfaceC7396q short[] sortedArrayDescending) {
        d2ok.m23075h(sortedArrayDescending, "$this$sortedArrayDescending");
        if (tfm.cdj(sortedArrayDescending)) {
            return sortedArrayDescending;
        }
        short[] sArrCopyOf = Arrays.copyOf(sortedArrayDescending, sortedArrayDescending.length);
        d2ok.kja0(sArrCopyOf, "copyOf(this, size)");
        short[] sArrM23651g = tfm.m23651g(sArrCopyOf);
        afv(sArrM23651g);
        return sArrM23651g;
    }

    @yz(version = "1.7")
    @InterfaceC6769y(name = "minWithOrThrow-U")
    @InterfaceC6232i
    public static final int dwra(@InterfaceC7396q int[] minWith, @InterfaceC7396q Comparator<? super gyi> comparator) {
        d2ok.m23075h(minWith, "$this$minWith");
        d2ok.m23075h(comparator, "comparator");
        if (dr.cdj(minWith)) {
            throw new NoSuchElementException();
        }
        int iX2 = dr.x2(minWith, 0);
        n5r1 it = new kotlin.ranges.x2(1, C6144h.srpc(minWith)).iterator();
        while (it.hasNext()) {
            int iX22 = dr.x2(minWith, it.nextInt());
            if (comparator.compare(gyi.zy(iX2), gyi.zy(iX22)) > 0) {
                iX2 = iX22;
            }
        }
        return iX2;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final List<ikck> dxef(long[] dropLastWhile, x2<? super ikck, Boolean> predicate) {
        d2ok.m23075h(dropLastWhile, "$this$dropLastWhile");
        d2ok.m23075h(predicate, "predicate");
        for (int iHmvj = C6144h.hmvj(dropLastWhile); -1 < iHmvj; iHmvj--) {
            if (!predicate.invoke(ikck.zy(C6220d.x2(dropLastWhile, iHmvj))).booleanValue()) {
                return z3jl(dropLastWhile, iHmvj + 1);
            }
        }
        return ni7.a9();
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final int dyer(int[] reduce, InterfaceC5979h<? super gyi, ? super gyi, gyi> operation) {
        d2ok.m23075h(reduce, "$this$reduce");
        d2ok.m23075h(operation, "operation");
        if (dr.cdj(reduce)) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        int iX2 = dr.x2(reduce, 0);
        n5r1 it = new kotlin.ranges.x2(1, C6144h.srpc(reduce)).iterator();
        while (it.hasNext()) {
            iX2 = operation.invoke(gyi.zy(iX2), gyi.zy(dr.x2(reduce, it.nextInt()))).a98o();
        }
        return iX2;
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6769y(name = "sumOfDouble")
    @InterfaceC6232i
    private static final double dzm(byte[] sumOf, x2<? super C6475u, Double> selector) {
        d2ok.m23075h(sumOf, "$this$sumOf");
        d2ok.m23075h(selector, "selector");
        int iN7h = bo.n7h(sumOf);
        double dDoubleValue = 0.0d;
        for (int i2 = 0; i2 < iN7h; i2++) {
            dDoubleValue += selector.invoke(C6475u.zy(bo.x2(sumOf, i2))).doubleValue();
        }
        return dDoubleValue;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    /* JADX INFO: renamed from: e */
    private static final boolean m22644e(short[] all, x2<? super qo, Boolean> predicate) {
        d2ok.m23075h(all, "$this$all");
        d2ok.m23075h(predicate, "predicate");
        int iN7h = tfm.n7h(all);
        for (int i2 = 0; i2 < iN7h; i2++) {
            if (!predicate.invoke(qo.zy(tfm.x2(all, i2))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6769y(name = "sumOfInt")
    @InterfaceC6232i
    private static final int e10(long[] sumOf, x2<? super ikck, Integer> selector) {
        d2ok.m23075h(sumOf, "$this$sumOf");
        d2ok.m23075h(selector, "selector");
        int iN7h = C6220d.n7h(sumOf);
        int iIntValue = 0;
        for (int i2 = 0; i2 < iN7h; i2++) {
            iIntValue += selector.invoke(ikck.zy(C6220d.x2(sumOf, i2))).intValue();
        }
        return iIntValue;
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final long[] e1c(@InterfaceC7396q long[] sortedArrayDescending) {
        d2ok.m23075h(sortedArrayDescending, "$this$sortedArrayDescending");
        if (C6220d.cdj(sortedArrayDescending)) {
            return sortedArrayDescending;
        }
        long[] jArrCopyOf = Arrays.copyOf(sortedArrayDescending, sortedArrayDescending.length);
        d2ok.kja0(jArrCopyOf, "copyOf(this, size)");
        long[] jArrM22779g = C6220d.m22779g(jArrCopyOf);
        o3(jArrM22779g);
        return jArrM22779g;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final void e4e(byte[] forEachIndexed, InterfaceC5979h<? super Integer, ? super C6475u, was> action) {
        d2ok.m23075h(forEachIndexed, "$this$forEachIndexed");
        d2ok.m23075h(action, "action");
        int iN7h = bo.n7h(forEachIndexed);
        int i2 = 0;
        int i3 = 0;
        while (i2 < iN7h) {
            action.invoke(Integer.valueOf(i3), C6475u.zy(bo.x2(forEachIndexed, i2)));
            i2++;
            i3++;
        }
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final List<C6475u> e5(byte[] dropLastWhile, x2<? super C6475u, Boolean> predicate) {
        d2ok.m23075h(dropLastWhile, "$this$dropLastWhile");
        d2ok.m23075h(predicate, "predicate");
        for (int iVl = C6144h.vl(dropLastWhile); -1 < iVl; iVl--) {
            if (!predicate.invoke(C6475u.zy(bo.x2(dropLastWhile, iVl))).booleanValue()) {
                return hi(dropLastWhile, iVl + 1);
            }
        }
        return ni7.a9();
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final List<gyi> e8vv(@InterfaceC7396q int[] slice, @InterfaceC7396q Iterable<Integer> indices) {
        d2ok.m23075h(slice, "$this$slice");
        d2ok.m23075h(indices, "indices");
        int iVyq = fu4.vyq(indices, 10);
        if (iVyq == 0) {
            return ni7.a9();
        }
        ArrayList arrayList = new ArrayList(iVyq);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(gyi.zy(dr.x2(slice, it.next().intValue())));
        }
        return arrayList;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final boolean e9(int[] none) {
        d2ok.m23075h(none, "$this$none");
        return dr.cdj(none);
    }

    @InterfaceC6234g
    @yz(version = "1.7")
    @InterfaceC6769y(name = "maxByOrThrow-U")
    @InterfaceC6232i
    private static final <R extends Comparable<? super R>> long e9s(long[] maxBy, x2<? super ikck, ? extends R> selector) {
        d2ok.m23075h(maxBy, "$this$maxBy");
        d2ok.m23075h(selector, "selector");
        if (C6220d.cdj(maxBy)) {
            throw new NoSuchElementException();
        }
        long jX2 = C6220d.x2(maxBy, 0);
        int iHmvj = C6144h.hmvj(maxBy);
        if (iHmvj == 0) {
            return jX2;
        }
        R rInvoke = selector.invoke(ikck.zy(jX2));
        n5r1 it = new kotlin.ranges.x2(1, iHmvj).iterator();
        while (it.hasNext()) {
            long jX22 = C6220d.x2(maxBy, it.nextInt());
            R rInvoke2 = selector.invoke(ikck.zy(jX22));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                jX2 = jX22;
                rInvoke = rInvoke2;
            }
        }
        return jX2;
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final <R extends Comparable<? super R>> R ebaq(short[] minOf, x2<? super qo, ? extends R> selector) {
        d2ok.m23075h(minOf, "$this$minOf");
        d2ok.m23075h(selector, "selector");
        if (tfm.cdj(minOf)) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(qo.zy(tfm.x2(minOf, 0)));
        n5r1 it = new kotlin.ranges.x2(1, C6144h.orxw(minOf)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(qo.zy(tfm.x2(minOf, it.nextInt())));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final long ebmm(long[] sum) {
        d2ok.m23075h(sum, "$this$sum");
        return ikck.ld6(C6144h.du(sum));
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final int[] ebn(int[] copyOfRange, int i2, int i3) {
        d2ok.m23075h(copyOfRange, "$this$copyOfRange");
        return dr.m22802g(kja0.ktq(copyOfRange, i2, i3));
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final List<C6475u> ec(byte[] filterIndexed, InterfaceC5979h<? super Integer, ? super C6475u, Boolean> predicate) {
        d2ok.m23075h(filterIndexed, "$this$filterIndexed");
        d2ok.m23075h(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int iN7h = bo.n7h(filterIndexed);
        int i2 = 0;
        int i3 = 0;
        while (i2 < iN7h) {
            byte bX2 = bo.x2(filterIndexed, i2);
            int i4 = i3 + 1;
            if (predicate.invoke(Integer.valueOf(i3), C6475u.zy(bX2)).booleanValue()) {
                arrayList.add(C6475u.zy(bX2));
            }
            i2++;
            i3 = i4;
        }
        return arrayList;
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final long[] eg6(@InterfaceC7396q long[] sliceArray, @InterfaceC7396q kotlin.ranges.x2 indices) {
        d2ok.m23075h(sliceArray, "$this$sliceArray");
        d2ok.m23075h(indices, "indices");
        return C6220d.m22779g(C6144h.v1uh(sliceArray, indices));
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final boolean eh(int[] none, x2<? super gyi, Boolean> predicate) {
        d2ok.m23075h(none, "$this$none");
        d2ok.m23075h(predicate, "predicate");
        int iN7h = dr.n7h(none);
        for (int i2 = 0; i2 < iN7h; i2++) {
            if (predicate.invoke(gyi.zy(dr.x2(none, i2))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final boolean ek(long[] none, x2<? super ikck, Boolean> predicate) {
        d2ok.m23075h(none, "$this$none");
        d2ok.m23075h(predicate, "predicate");
        int iN7h = C6220d.n7h(none);
        for (int i2 = 0; i2 < iN7h; i2++) {
            if (predicate.invoke(ikck.zy(C6220d.x2(none, i2))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final boolean ek5k(int[] any, x2<? super gyi, Boolean> predicate) {
        d2ok.m23075h(any, "$this$any");
        d2ok.m23075h(predicate, "predicate");
        int iN7h = dr.n7h(any);
        for (int i2 = 0; i2 < iN7h; i2++) {
            if (predicate.invoke(gyi.zy(dr.x2(any, i2))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static final int eklw(@InterfaceC7396q long[] lastIndex) {
        d2ok.m23075h(lastIndex, "$this$lastIndex");
        return C6144h.hmvj(lastIndex);
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final List<ikck> el(long[] filterNot, x2<? super ikck, Boolean> predicate) {
        d2ok.m23075h(filterNot, "$this$filterNot");
        d2ok.m23075h(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int iN7h = C6220d.n7h(filterNot);
        for (int i2 = 0; i2 < iN7h; i2++) {
            long jX2 = C6220d.x2(filterNot, i2);
            if (!predicate.invoke(ikck.zy(jX2)).booleanValue()) {
                arrayList.add(ikck.zy(jX2));
            }
        }
        return arrayList;
    }

    @i9jn(markerClass = {ki.class})
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final <R> List<R> em(long[] scanIndexed, R r2, cdj<? super Integer, ? super R, ? super ikck, ? extends R> operation) {
        d2ok.m23075h(scanIndexed, "$this$scanIndexed");
        d2ok.m23075h(operation, "operation");
        if (C6220d.cdj(scanIndexed)) {
            return zurt.ld6(r2);
        }
        ArrayList arrayList = new ArrayList(C6220d.n7h(scanIndexed) + 1);
        arrayList.add(r2);
        int iN7h = C6220d.n7h(scanIndexed);
        for (int i2 = 0; i2 < iN7h; i2++) {
            r2 = operation.invoke(Integer.valueOf(i2), r2, ikck.zy(C6220d.x2(scanIndexed, i2)));
            arrayList.add(r2);
        }
        return arrayList;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final long[] ep5q(long[] plus, long j2) {
        d2ok.m23075h(plus, "$this$plus");
        return C6220d.m22779g(kja0.mub(plus, j2));
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final void erbd(int[] forEach, x2<? super gyi, was> action) {
        d2ok.m23075h(forEach, "$this$forEach");
        d2ok.m23075h(action, "action");
        int iN7h = dr.n7h(forEach);
        for (int i2 = 0; i2 < iN7h; i2++) {
            action.invoke(gyi.zy(dr.x2(forEach, i2)));
        }
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final byte es7(byte[] getOrElse, int i2, x2<? super Integer, C6475u> defaultValue) {
        d2ok.m23075h(getOrElse, "$this$getOrElse");
        d2ok.m23075h(defaultValue, "defaultValue");
        return (i2 < 0 || i2 > C6144h.vl(getOrElse)) ? defaultValue.invoke(Integer.valueOf(i2)).bf2() : bo.x2(getOrElse, i2);
    }

    @yz(version = "1.4")
    @InterfaceC6232i
    public static boolean etdu(@InterfaceC7395n long[] jArr, @InterfaceC7395n long[] jArr2) {
        if (jArr == null) {
            jArr = null;
        }
        if (jArr2 == null) {
            jArr2 = null;
        }
        return Arrays.equals(jArr, jArr2);
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final <K> Map<K, List<C6475u>> eu(byte[] groupBy, x2<? super C6475u, ? extends K> keySelector) {
        d2ok.m23075h(groupBy, "$this$groupBy");
        d2ok.m23075h(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int iN7h = bo.n7h(groupBy);
        for (int i2 = 0; i2 < iN7h; i2++) {
            byte bX2 = bo.x2(groupBy, i2);
            K kInvoke = keySelector.invoke(C6475u.zy(bX2));
            Object arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(C6475u.zy(bX2));
        }
        return linkedHashMap;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final gyi ew(int[] elementAtOrNull, int i2) {
        d2ok.m23075h(elementAtOrNull, "$this$elementAtOrNull");
        return oei(elementAtOrNull, i2);
    }

    @yz(version = "1.4")
    @InterfaceC6232i
    public static final void ew08(@InterfaceC7396q long[] shuffle, @InterfaceC7396q AbstractC6332g random) {
        d2ok.m23075h(shuffle, "$this$shuffle");
        d2ok.m23075h(random, "random");
        for (int iHmvj = C6144h.hmvj(shuffle); iHmvj > 0; iHmvj--) {
            int iNextInt = random.nextInt(iHmvj + 1);
            long jX2 = C6220d.x2(shuffle, iHmvj);
            C6220d.m22781i(shuffle, iHmvj, C6220d.x2(shuffle, iNextInt));
            C6220d.m22781i(shuffle, iNextInt, jX2);
        }
    }

    @yz(version = "1.7")
    @InterfaceC6769y(name = "maxWithOrThrow-U")
    @InterfaceC6232i
    public static final long ex76(@InterfaceC7396q long[] maxWith, @InterfaceC7396q Comparator<? super ikck> comparator) {
        d2ok.m23075h(maxWith, "$this$maxWith");
        d2ok.m23075h(comparator, "comparator");
        if (C6220d.cdj(maxWith)) {
            throw new NoSuchElementException();
        }
        long jX2 = C6220d.x2(maxWith, 0);
        n5r1 it = new kotlin.ranges.x2(1, C6144h.hmvj(maxWith)).iterator();
        while (it.hasNext()) {
            long jX22 = C6220d.x2(maxWith, it.nextInt());
            if (comparator.compare(ikck.zy(jX2), ikck.zy(jX22)) < 0) {
                jX2 = jX22;
            }
        }
        return jX2;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final ikck exv8(long[] findLast, x2<? super ikck, Boolean> predicate) {
        d2ok.m23075h(findLast, "$this$findLast");
        d2ok.m23075h(predicate, "predicate");
        int iN7h = C6220d.n7h(findLast) - 1;
        if (iN7h >= 0) {
            while (true) {
                int i2 = iN7h - 1;
                long jX2 = C6220d.x2(findLast, iN7h);
                if (predicate.invoke(ikck.zy(jX2)).booleanValue()) {
                    return ikck.zy(jX2);
                }
                if (i2 < 0) {
                    break;
                }
                iN7h = i2;
            }
        }
        return null;
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final Double f1(int[] minOfOrNull, x2<? super gyi, Double> selector) {
        d2ok.m23075h(minOfOrNull, "$this$minOfOrNull");
        d2ok.m23075h(selector, "selector");
        if (dr.cdj(minOfOrNull)) {
            return null;
        }
        double dDoubleValue = selector.invoke(gyi.zy(dr.x2(minOfOrNull, 0))).doubleValue();
        n5r1 it = new kotlin.ranges.x2(1, C6144h.srpc(minOfOrNull)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, selector.invoke(gyi.zy(dr.x2(minOfOrNull, it.nextInt()))).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final <C extends Collection<? super gyi>> C f1bi(int[] filterNotTo, C destination, x2<? super gyi, Boolean> predicate) {
        d2ok.m23075h(filterNotTo, "$this$filterNotTo");
        d2ok.m23075h(destination, "destination");
        d2ok.m23075h(predicate, "predicate");
        int iN7h = dr.n7h(filterNotTo);
        for (int i2 = 0; i2 < iN7h; i2++) {
            int iX2 = dr.x2(filterNotTo, i2);
            if (!predicate.invoke(gyi.zy(iX2)).booleanValue()) {
                destination.add(gyi.zy(iX2));
            }
        }
        return destination;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final List<gyi> f1w3(int[] takeWhile, x2<? super gyi, Boolean> predicate) {
        d2ok.m23075h(takeWhile, "$this$takeWhile");
        d2ok.m23075h(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int iN7h = dr.n7h(takeWhile);
        for (int i2 = 0; i2 < iN7h; i2++) {
            int iX2 = dr.x2(takeWhile, i2);
            if (!predicate.invoke(gyi.zy(iX2)).booleanValue()) {
                break;
            }
            arrayList.add(gyi.zy(iX2));
        }
        return arrayList;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final int f26p(byte[] indexOf, byte b2) {
        d2ok.m23075h(indexOf, "$this$indexOf");
        return C6144h.m7(indexOf, b2);
    }

    @InterfaceC7395n
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final ikck f3f(@InterfaceC7396q long[] firstOrNull) {
        d2ok.m23075h(firstOrNull, "$this$firstOrNull");
        if (C6220d.cdj(firstOrNull)) {
            return null;
        }
        return ikck.zy(C6220d.x2(firstOrNull, 0));
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final int[] f4(int[] toIntArray) {
        d2ok.m23075h(toIntArray, "$this$toIntArray");
        int[] iArrCopyOf = Arrays.copyOf(toIntArray, toIntArray.length);
        d2ok.kja0(iArrCopyOf, "copyOf(this, size)");
        return iArrCopyOf;
    }

    @InterfaceC7395n
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final gyi f4f(@InterfaceC7396q int[] singleOrNull) {
        d2ok.m23075h(singleOrNull, "$this$singleOrNull");
        if (dr.n7h(singleOrNull) == 1) {
            return gyi.zy(dr.x2(singleOrNull, 0));
        }
        return null;
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final <R> List<R> f7(long[] runningFold, R r2, InterfaceC5979h<? super R, ? super ikck, ? extends R> operation) {
        d2ok.m23075h(runningFold, "$this$runningFold");
        d2ok.m23075h(operation, "operation");
        if (C6220d.cdj(runningFold)) {
            return zurt.ld6(r2);
        }
        ArrayList arrayList = new ArrayList(C6220d.n7h(runningFold) + 1);
        arrayList.add(r2);
        int iN7h = C6220d.n7h(runningFold);
        for (int i2 = 0; i2 < iN7h; i2++) {
            r2 = operation.invoke(r2, ikck.zy(C6220d.x2(runningFold, i2)));
            arrayList.add(r2);
        }
        return arrayList;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final <R> R f7z0(long[] fold, R r2, InterfaceC5979h<? super R, ? super ikck, ? extends R> operation) {
        d2ok.m23075h(fold, "$this$fold");
        d2ok.m23075h(operation, "operation");
        int iN7h = C6220d.n7h(fold);
        for (int i2 = 0; i2 < iN7h; i2++) {
            r2 = operation.invoke(r2, ikck.zy(C6220d.x2(fold, i2)));
        }
        return r2;
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final <R extends Comparable<? super R>> R fai(short[] minOfOrNull, x2<? super qo, ? extends R> selector) {
        d2ok.m23075h(minOfOrNull, "$this$minOfOrNull");
        d2ok.m23075h(selector, "selector");
        if (tfm.cdj(minOfOrNull)) {
            return null;
        }
        R rInvoke = selector.invoke(qo.zy(tfm.x2(minOfOrNull, 0)));
        n5r1 it = new kotlin.ranges.x2(1, C6144h.orxw(minOfOrNull)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(qo.zy(tfm.x2(minOfOrNull, it.nextInt())));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final float fbr(byte[] maxOf, x2<? super C6475u, Float> selector) {
        d2ok.m23075h(maxOf, "$this$maxOf");
        d2ok.m23075h(selector, "selector");
        if (bo.cdj(maxOf)) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(C6475u.zy(bo.x2(maxOf, 0))).floatValue();
        n5r1 it = new kotlin.ranges.x2(1, C6144h.vl(maxOf)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, selector.invoke(C6475u.zy(bo.x2(maxOf, it.nextInt()))).floatValue());
        }
        return fFloatValue;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final int fe(byte[] sum) {
        d2ok.m23075h(sum, "$this$sum");
        int iLd6 = gyi.ld6(0);
        int iN7h = bo.n7h(sum);
        for (int i2 = 0; i2 < iN7h; i2++) {
            iLd6 = gyi.ld6(iLd6 + gyi.ld6(bo.x2(sum, i2) & 255));
        }
        return iLd6;
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @hyr
    @InterfaceC6234g
    @yz(version = "1.5")
    @InterfaceC6769y(name = "sumOfUInt")
    @InterfaceC6232i
    private static final int feb(int[] sumOf, x2<? super gyi, gyi> selector) {
        d2ok.m23075h(sumOf, "$this$sumOf");
        d2ok.m23075h(selector, "selector");
        int iLd6 = gyi.ld6(0);
        int iN7h = dr.n7h(sumOf);
        for (int i2 = 0; i2 < iN7h; i2++) {
            iLd6 = gyi.ld6(iLd6 + selector.invoke(gyi.zy(dr.x2(sumOf, i2))).a98o());
        }
        return iLd6;
    }

    @InterfaceC7396q
    public static final kotlin.ranges.x2 ff(@InterfaceC7396q int[] indices) {
        d2ok.m23075h(indices, "$this$indices");
        return C6144h.h5bu(indices);
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final <R> R ff8y(short[] maxOfWithOrNull, Comparator<? super R> comparator, x2<? super qo, ? extends R> selector) {
        d2ok.m23075h(maxOfWithOrNull, "$this$maxOfWithOrNull");
        d2ok.m23075h(comparator, "comparator");
        d2ok.m23075h(selector, "selector");
        if (tfm.cdj(maxOfWithOrNull)) {
            return null;
        }
        R rInvoke = selector.invoke(qo.zy(tfm.x2(maxOfWithOrNull, 0)));
        n5r1 it = new kotlin.ranges.x2(1, C6144h.orxw(maxOfWithOrNull)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(qo.zy(tfm.x2(maxOfWithOrNull, it.nextInt())));
            if (comparator.compare(rInvoke, rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final Float ffy(byte[] minOfOrNull, x2<? super C6475u, Float> selector) {
        d2ok.m23075h(minOfOrNull, "$this$minOfOrNull");
        d2ok.m23075h(selector, "selector");
        if (bo.cdj(minOfOrNull)) {
            return null;
        }
        float fFloatValue = selector.invoke(C6475u.zy(bo.x2(minOfOrNull, 0))).floatValue();
        n5r1 it = new kotlin.ranges.x2(1, C6144h.vl(minOfOrNull)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, selector.invoke(C6475u.zy(bo.x2(minOfOrNull, it.nextInt()))).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final <R> R fh(byte[] fold, R r2, InterfaceC5979h<? super R, ? super C6475u, ? extends R> operation) {
        d2ok.m23075h(fold, "$this$fold");
        d2ok.m23075h(operation, "operation");
        int iN7h = bo.n7h(fold);
        for (int i2 = 0; i2 < iN7h; i2++) {
            r2 = operation.invoke(r2, C6475u.zy(bo.x2(fold, i2)));
        }
        return r2;
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final <R extends Comparable<? super R>> R fjcj(long[] minOfOrNull, x2<? super ikck, ? extends R> selector) {
        d2ok.m23075h(minOfOrNull, "$this$minOfOrNull");
        d2ok.m23075h(selector, "selector");
        if (C6220d.cdj(minOfOrNull)) {
            return null;
        }
        R rInvoke = selector.invoke(ikck.zy(C6220d.x2(minOfOrNull, 0)));
        n5r1 it = new kotlin.ranges.x2(1, C6144h.hmvj(minOfOrNull)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(ikck.zy(C6220d.x2(minOfOrNull, it.nextInt())));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final short fjxh(short[] reduceRight, InterfaceC5979h<? super qo, ? super qo, qo> operation) {
        d2ok.m23075h(reduceRight, "$this$reduceRight");
        d2ok.m23075h(operation, "operation");
        int iOrxw = C6144h.orxw(reduceRight);
        if (iOrxw < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        short sX2 = tfm.x2(reduceRight, iOrxw);
        for (int i2 = iOrxw - 1; i2 >= 0; i2--) {
            sX2 = operation.invoke(qo.zy(tfm.x2(reduceRight, i2)), qo.zy(sX2)).bf2();
        }
        return sX2;
    }

    @yz(version = "1.3")
    @InterfaceC6232i
    public static final int fl(@InterfaceC7396q int[] random, @InterfaceC7396q AbstractC6332g random2) {
        d2ok.m23075h(random, "$this$random");
        d2ok.m23075h(random2, "random");
        if (dr.cdj(random)) {
            throw new NoSuchElementException("Array is empty.");
        }
        return dr.x2(random, random2.nextInt(dr.n7h(random)));
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final float fm(int[] minOf, x2<? super gyi, Float> selector) {
        d2ok.m23075h(minOf, "$this$minOf");
        d2ok.m23075h(selector, "selector");
        if (dr.cdj(minOf)) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(gyi.zy(dr.x2(minOf, 0))).floatValue();
        n5r1 it = new kotlin.ranges.x2(1, C6144h.srpc(minOf)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, selector.invoke(gyi.zy(dr.x2(minOf, it.nextInt()))).floatValue());
        }
        return fFloatValue;
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final byte[] fn9(byte[] onEach, x2<? super C6475u, was> action) {
        d2ok.m23075h(onEach, "$this$onEach");
        d2ok.m23075h(action, "action");
        int iN7h = bo.n7h(onEach);
        for (int i2 = 0; i2 < iN7h; i2++) {
            action.invoke(C6475u.zy(bo.x2(onEach, i2)));
        }
        return onEach;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final int fnq8(int[] component3) {
        d2ok.m23075h(component3, "$this$component3");
        return dr.x2(component3, 2);
    }

    @InterfaceC7395n
    @yz(version = "1.4")
    @InterfaceC6232i
    public static final C6475u fpn(@InterfaceC7396q byte[] maxWithOrNull, @InterfaceC7396q Comparator<? super C6475u> comparator) {
        d2ok.m23075h(maxWithOrNull, "$this$maxWithOrNull");
        d2ok.m23075h(comparator, "comparator");
        if (bo.cdj(maxWithOrNull)) {
            return null;
        }
        byte bX2 = bo.x2(maxWithOrNull, 0);
        n5r1 it = new kotlin.ranges.x2(1, C6144h.vl(maxWithOrNull)).iterator();
        while (it.hasNext()) {
            byte bX22 = bo.x2(maxWithOrNull, it.nextInt());
            if (comparator.compare(C6475u.zy(bX2), C6475u.zy(bX22)) < 0) {
                bX2 = bX22;
            }
        }
        return C6475u.zy(bX2);
    }

    @kotlin.x2(warningSince = "1.5")
    @InterfaceC6234g
    @ld6(message = "Use sumOf instead.", replaceWith = @hb(expression = "this.sumOf(selector)", imports = {}))
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final int fpx(byte[] sumBy, x2<? super C6475u, gyi> selector) {
        d2ok.m23075h(sumBy, "$this$sumBy");
        d2ok.m23075h(selector, "selector");
        int iN7h = bo.n7h(sumBy);
        int iLd6 = 0;
        for (int i2 = 0; i2 < iN7h; i2++) {
            iLd6 = gyi.ld6(iLd6 + selector.invoke(C6475u.zy(bo.x2(sumBy, i2))).a98o());
        }
        return iLd6;
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final <R extends Comparable<? super R>> gyi fq(int[] minByOrNull, x2<? super gyi, ? extends R> selector) {
        d2ok.m23075h(minByOrNull, "$this$minByOrNull");
        d2ok.m23075h(selector, "selector");
        if (dr.cdj(minByOrNull)) {
            return null;
        }
        int iX2 = dr.x2(minByOrNull, 0);
        int iSrpc = C6144h.srpc(minByOrNull);
        if (iSrpc == 0) {
            return gyi.zy(iX2);
        }
        R rInvoke = selector.invoke(gyi.zy(iX2));
        n5r1 it = new kotlin.ranges.x2(1, iSrpc).iterator();
        while (it.hasNext()) {
            int iX22 = dr.x2(minByOrNull, it.nextInt());
            R rInvoke2 = selector.invoke(gyi.zy(iX22));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                iX2 = iX22;
                rInvoke = rInvoke2;
            }
        }
        return gyi.zy(iX2);
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final byte fu7m(byte[] reduceRightIndexed, cdj<? super Integer, ? super C6475u, ? super C6475u, C6475u> operation) {
        d2ok.m23075h(reduceRightIndexed, "$this$reduceRightIndexed");
        d2ok.m23075h(operation, "operation");
        int iVl = C6144h.vl(reduceRightIndexed);
        if (iVl < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        byte bX2 = bo.x2(reduceRightIndexed, iVl);
        for (int i2 = iVl - 1; i2 >= 0; i2--) {
            bX2 = operation.invoke(Integer.valueOf(i2), C6475u.zy(bo.x2(reduceRightIndexed, i2)), C6475u.zy(bX2)).bf2();
        }
        return bX2;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final <R, C extends Collection<? super R>> C fupf(short[] mapTo, C destination, x2<? super qo, ? extends R> transform) {
        d2ok.m23075h(mapTo, "$this$mapTo");
        d2ok.m23075h(destination, "destination");
        d2ok.m23075h(transform, "transform");
        int iN7h = tfm.n7h(mapTo);
        for (int i2 = 0; i2 < iN7h; i2++) {
            destination.add(transform.invoke(qo.zy(tfm.x2(mapTo, i2))));
        }
        return destination;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final void fv(byte[] reverse) {
        d2ok.m23075h(reverse, "$this$reverse");
        C6144h.lo(reverse);
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final short[] fvqg(short[] onEach, x2<? super qo, was> action) {
        d2ok.m23075h(onEach, "$this$onEach");
        d2ok.m23075h(action, "action");
        int iN7h = tfm.n7h(onEach);
        for (int i2 = 0; i2 < iN7h; i2++) {
            action.invoke(qo.zy(tfm.x2(onEach, i2)));
        }
        return onEach;
    }

    @yz(version = "1.4")
    @InterfaceC6232i
    public static final void fw(@InterfaceC7396q short[] shuffle) {
        d2ok.m23075h(shuffle, "$this$shuffle");
        hf7(shuffle, AbstractC6332g.Default);
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final <R, V> List<V> fz(short[] zip, R[] other, InterfaceC5979h<? super qo, ? super R, ? extends V> transform) {
        d2ok.m23075h(zip, "$this$zip");
        d2ok.m23075h(other, "other");
        d2ok.m23075h(transform, "transform");
        int iMin = Math.min(tfm.n7h(zip), other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i2 = 0; i2 < iMin; i2++) {
            arrayList.add(transform.invoke(qo.zy(tfm.x2(zip, i2)), other[i2]));
        }
        return arrayList;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final List<qo> g0ad(short[] filterNot, x2<? super qo, Boolean> predicate) {
        d2ok.m23075h(filterNot, "$this$filterNot");
        d2ok.m23075h(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int iN7h = tfm.n7h(filterNot);
        for (int i2 = 0; i2 < iN7h; i2++) {
            short sX2 = tfm.x2(filterNot, i2);
            if (!predicate.invoke(qo.zy(sX2)).booleanValue()) {
                arrayList.add(qo.zy(sX2));
            }
        }
        return arrayList;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final byte g1(byte[] component4) {
        d2ok.m23075h(component4, "$this$component4");
        return bo.x2(component4, 3);
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final <R extends Comparable<? super R>> R g41(long[] maxOf, x2<? super ikck, ? extends R> selector) {
        d2ok.m23075h(maxOf, "$this$maxOf");
        d2ok.m23075h(selector, "selector");
        if (C6220d.cdj(maxOf)) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(ikck.zy(C6220d.x2(maxOf, 0)));
        n5r1 it = new kotlin.ranges.x2(1, C6144h.hmvj(maxOf)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(ikck.zy(C6220d.x2(maxOf, it.nextInt())));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final List<ikck> g6(@InterfaceC7396q long[] sortedDescending) {
        d2ok.m23075h(sortedDescending, "$this$sortedDescending");
        long[] jArrCopyOf = Arrays.copyOf(sortedDescending, sortedDescending.length);
        d2ok.kja0(jArrCopyOf, "copyOf(this, size)");
        long[] jArrM22779g = C6220d.m22779g(jArrCopyOf);
        ca(jArrM22779g);
        return hw(jArrM22779g);
    }

    @InterfaceC7395n
    @yz(version = "1.4")
    @InterfaceC6232i
    public static final qo g6i(@InterfaceC7396q short[] minWithOrNull, @InterfaceC7396q Comparator<? super qo> comparator) {
        d2ok.m23075h(minWithOrNull, "$this$minWithOrNull");
        d2ok.m23075h(comparator, "comparator");
        if (tfm.cdj(minWithOrNull)) {
            return null;
        }
        short sX2 = tfm.x2(minWithOrNull, 0);
        n5r1 it = new kotlin.ranges.x2(1, C6144h.orxw(minWithOrNull)).iterator();
        while (it.hasNext()) {
            short sX22 = tfm.x2(minWithOrNull, it.nextInt());
            if (comparator.compare(qo.zy(sX2), qo.zy(sX22)) > 0) {
                sX2 = sX22;
            }
        }
        return qo.zy(sX2);
    }

    @InterfaceC6234g
    @yz(version = "1.7")
    @InterfaceC6769y(name = "minByOrThrow-U")
    @InterfaceC6232i
    private static final <R extends Comparable<? super R>> int g8(int[] minBy, x2<? super gyi, ? extends R> selector) {
        d2ok.m23075h(minBy, "$this$minBy");
        d2ok.m23075h(selector, "selector");
        if (dr.cdj(minBy)) {
            throw new NoSuchElementException();
        }
        int iX2 = dr.x2(minBy, 0);
        int iSrpc = C6144h.srpc(minBy);
        if (iSrpc == 0) {
            return iX2;
        }
        R rInvoke = selector.invoke(gyi.zy(iX2));
        n5r1 it = new kotlin.ranges.x2(1, iSrpc).iterator();
        while (it.hasNext()) {
            int iX22 = dr.x2(minBy, it.nextInt());
            R rInvoke2 = selector.invoke(gyi.zy(iX22));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                iX2 = iX22;
                rInvoke = rInvoke2;
            }
        }
        return iX2;
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final List<ikck> ga(@InterfaceC7396q long[] dropLast, int i2) {
        d2ok.m23075h(dropLast, "$this$dropLast");
        if (i2 >= 0) {
            return z3jl(dropLast, fn3e.fn3e(C6220d.n7h(dropLast) - i2, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final byte[] gai(@InterfaceC7396q byte[] sortedArrayDescending) {
        d2ok.m23075h(sortedArrayDescending, "$this$sortedArrayDescending");
        if (bo.cdj(sortedArrayDescending)) {
            return sortedArrayDescending;
        }
        byte[] bArrCopyOf = Arrays.copyOf(sortedArrayDescending, sortedArrayDescending.length);
        d2ok.kja0(bArrCopyOf, "copyOf(this, size)");
        byte[] bArrM22412g = bo.m22412g(bArrCopyOf);
        n6(bArrM22412g);
        return bArrM22412g;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final <C extends Collection<? super gyi>> C gb(int[] filterTo, C destination, x2<? super gyi, Boolean> predicate) {
        d2ok.m23075h(filterTo, "$this$filterTo");
        d2ok.m23075h(destination, "destination");
        d2ok.m23075h(predicate, "predicate");
        int iN7h = dr.n7h(filterTo);
        for (int i2 = 0; i2 < iN7h; i2++) {
            int iX2 = dr.x2(filterTo, i2);
            if (predicate.invoke(gyi.zy(iX2)).booleanValue()) {
                destination.add(gyi.zy(iX2));
            }
        }
        return destination;
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final List<gyi> gb7o(@InterfaceC7396q int[] sorted) {
        d2ok.m23075h(sorted, "$this$sorted");
        int[] iArrCopyOf = Arrays.copyOf(sorted, sorted.length);
        d2ok.kja0(iArrCopyOf, "copyOf(this, size)");
        int[] iArrM22802g = dr.m22802g(iArrCopyOf);
        ceo(iArrM22802g);
        return kotlin.collections.unsigned.toq.m22623k(iArrM22802g);
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final short gbni(short[] component4) {
        d2ok.m23075h(component4, "$this$component4");
        return tfm.x2(component4, 3);
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final long[] gc3c(long[] copyInto, long[] destination, int i2, int i3, int i4) {
        d2ok.m23075h(copyInto, "$this$copyInto");
        d2ok.m23075h(destination, "destination");
        kja0.m22522v(copyInto, destination, i2, i3, i4);
        return destination;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final List<ikck> gcp(long[] dropWhile, x2<? super ikck, Boolean> predicate) {
        d2ok.m23075h(dropWhile, "$this$dropWhile");
        d2ok.m23075h(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int iN7h = C6220d.n7h(dropWhile);
        boolean z2 = false;
        for (int i2 = 0; i2 < iN7h; i2++) {
            long jX2 = C6220d.x2(dropWhile, i2);
            if (z2) {
                arrayList.add(ikck.zy(jX2));
            } else if (!predicate.invoke(ikck.zy(jX2)).booleanValue()) {
                arrayList.add(ikck.zy(jX2));
                z2 = true;
            }
        }
        return arrayList;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final <R> R ge(short[] foldIndexed, R r2, cdj<? super Integer, ? super R, ? super qo, ? extends R> operation) {
        d2ok.m23075h(foldIndexed, "$this$foldIndexed");
        d2ok.m23075h(operation, "operation");
        int iN7h = tfm.n7h(foldIndexed);
        int i2 = 0;
        int i3 = 0;
        while (i2 < iN7h) {
            r2 = operation.invoke(Integer.valueOf(i3), r2, qo.zy(tfm.x2(foldIndexed, i2)));
            i2++;
            i3++;
        }
        return r2;
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final int[] gg(@InterfaceC7396q gyi[] gyiVarArr) {
        d2ok.m23075h(gyiVarArr, "<this>");
        int length = gyiVarArr.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = gyiVarArr[i2].a98o();
        }
        return dr.m22802g(iArr);
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final <R> R gg7(byte[] maxOfWithOrNull, Comparator<? super R> comparator, x2<? super C6475u, ? extends R> selector) {
        d2ok.m23075h(maxOfWithOrNull, "$this$maxOfWithOrNull");
        d2ok.m23075h(comparator, "comparator");
        d2ok.m23075h(selector, "selector");
        if (bo.cdj(maxOfWithOrNull)) {
            return null;
        }
        R rInvoke = selector.invoke(C6475u.zy(bo.x2(maxOfWithOrNull, 0)));
        n5r1 it = new kotlin.ranges.x2(1, C6144h.vl(maxOfWithOrNull)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(C6475u.zy(bo.x2(maxOfWithOrNull, it.nextInt())));
            if (comparator.compare(rInvoke, rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final <R, V> List<V> ggci(long[] zip, Iterable<? extends R> other, InterfaceC5979h<? super ikck, ? super R, ? extends V> transform) {
        d2ok.m23075h(zip, "$this$zip");
        d2ok.m23075h(other, "other");
        d2ok.m23075h(transform, "transform");
        int iN7h = C6220d.n7h(zip);
        ArrayList arrayList = new ArrayList(Math.min(fu4.vyq(other, 10), iN7h));
        int i2 = 0;
        for (R r2 : other) {
            if (i2 >= iN7h) {
                break;
            }
            arrayList.add(transform.invoke(ikck.zy(C6220d.x2(zip, i2)), r2));
            i2++;
        }
        return arrayList;
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final List<qo> gge(@InterfaceC7396q short[] sortedDescending) {
        d2ok.m23075h(sortedDescending, "$this$sortedDescending");
        short[] sArrCopyOf = Arrays.copyOf(sortedDescending, sortedDescending.length);
        d2ok.kja0(sArrCopyOf, "copyOf(this, size)");
        short[] sArrM23651g = tfm.m23651g(sArrCopyOf);
        jrla(sArrM23651g);
        return gir(sArrM23651g);
    }

    @i9jn(markerClass = {ki.class})
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final <R> List<R> ghw9(short[] scanIndexed, R r2, cdj<? super Integer, ? super R, ? super qo, ? extends R> operation) {
        d2ok.m23075h(scanIndexed, "$this$scanIndexed");
        d2ok.m23075h(operation, "operation");
        if (tfm.cdj(scanIndexed)) {
            return zurt.ld6(r2);
        }
        ArrayList arrayList = new ArrayList(tfm.n7h(scanIndexed) + 1);
        arrayList.add(r2);
        int iN7h = tfm.n7h(scanIndexed);
        for (int i2 = 0; i2 < iN7h; i2++) {
            r2 = operation.invoke(Integer.valueOf(i2), r2, qo.zy(tfm.x2(scanIndexed, i2)));
            arrayList.add(r2);
        }
        return arrayList;
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final List<qo> gir(@InterfaceC7396q short[] reversed) {
        d2ok.m23075h(reversed, "$this$reversed");
        if (tfm.cdj(reversed)) {
            return ni7.a9();
        }
        List<qo> listXzk4 = a9.xzk4(tfm.toq(reversed));
        jk.vep5(listXzk4);
        return listXzk4;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final List<ikck> gjbz(long[] takeWhile, x2<? super ikck, Boolean> predicate) {
        d2ok.m23075h(takeWhile, "$this$takeWhile");
        d2ok.m23075h(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int iN7h = C6220d.n7h(takeWhile);
        for (int i2 = 0; i2 < iN7h; i2++) {
            long jX2 = C6220d.x2(takeWhile, i2);
            if (!predicate.invoke(ikck.zy(jX2)).booleanValue()) {
                break;
            }
            arrayList.add(ikck.zy(jX2));
        }
        return arrayList;
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final List<C6475u> gk(@InterfaceC7396q byte[] reversed) {
        d2ok.m23075h(reversed, "$this$reversed");
        if (bo.cdj(reversed)) {
            return ni7.a9();
        }
        List<C6475u> listXzk4 = a9.xzk4(bo.toq(reversed));
        jk.vep5(listXzk4);
        return listXzk4;
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final <R extends Comparable<? super R>> R gl8t(long[] minOf, x2<? super ikck, ? extends R> selector) {
        d2ok.m23075h(minOf, "$this$minOf");
        d2ok.m23075h(selector, "selector");
        if (C6220d.cdj(minOf)) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(ikck.zy(C6220d.x2(minOf, 0)));
        n5r1 it = new kotlin.ranges.x2(1, C6144h.hmvj(minOf)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(ikck.zy(C6220d.x2(minOf, it.nextInt())));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @i9jn(markerClass = {ki.class})
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final ikck goq(long[] randomOrNull) {
        d2ok.m23075h(randomOrNull, "$this$randomOrNull");
        return qe(randomOrNull, AbstractC6332g.Default);
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6769y(name = "sumOfInt")
    @InterfaceC6232i
    private static final int gs9(byte[] sumOf, x2<? super C6475u, Integer> selector) {
        d2ok.m23075h(sumOf, "$this$sumOf");
        d2ok.m23075h(selector, "selector");
        int iN7h = bo.n7h(sumOf);
        int iIntValue = 0;
        for (int i2 = 0; i2 < iN7h; i2++) {
            iIntValue += selector.invoke(C6475u.zy(bo.x2(sumOf, i2))).intValue();
        }
        return iIntValue;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final <K, V> Map<K, List<V>> gw(int[] groupBy, x2<? super gyi, ? extends K> keySelector, x2<? super gyi, ? extends V> valueTransform) {
        d2ok.m23075h(groupBy, "$this$groupBy");
        d2ok.m23075h(keySelector, "keySelector");
        d2ok.m23075h(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int iN7h = dr.n7h(groupBy);
        for (int i2 = 0; i2 < iN7h; i2++) {
            int iX2 = dr.x2(groupBy, i2);
            K kInvoke = keySelector.invoke(gyi.zy(iX2));
            List<V> arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(kInvoke, arrayList);
            }
            arrayList.add(valueTransform.invoke(gyi.zy(iX2)));
        }
        return linkedHashMap;
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @hyr
    @InterfaceC6234g
    @yz(version = "1.5")
    @InterfaceC6769y(name = "sumOfULong")
    @InterfaceC6232i
    private static final long gy40(int[] sumOf, x2<? super gyi, ikck> selector) {
        d2ok.m23075h(sumOf, "$this$sumOf");
        d2ok.m23075h(selector, "selector");
        long jLd6 = ikck.ld6(0L);
        int iN7h = dr.n7h(sumOf);
        for (int i2 = 0; i2 < iN7h; i2++) {
            jLd6 = ikck.ld6(jLd6 + selector.invoke(gyi.zy(dr.x2(sumOf, i2))).a98o());
        }
        return jLd6;
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final <V, M extends Map<? super qo, ? super V>> M gyi(short[] associateWithTo, M destination, x2<? super qo, ? extends V> valueSelector) {
        d2ok.m23075h(associateWithTo, "$this$associateWithTo");
        d2ok.m23075h(destination, "destination");
        d2ok.m23075h(valueSelector, "valueSelector");
        int iN7h = tfm.n7h(associateWithTo);
        for (int i2 = 0; i2 < iN7h; i2++) {
            short sX2 = tfm.x2(associateWithTo, i2);
            destination.put(qo.zy(sX2), valueSelector.invoke(qo.zy(sX2)));
        }
        return destination;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final long gz(long[] reduce, InterfaceC5979h<? super ikck, ? super ikck, ikck> operation) {
        d2ok.m23075h(reduce, "$this$reduce");
        d2ok.m23075h(operation, "operation");
        if (C6220d.cdj(reduce)) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        long jX2 = C6220d.x2(reduce, 0);
        n5r1 it = new kotlin.ranges.x2(1, C6144h.hmvj(reduce)).iterator();
        while (it.hasNext()) {
            jX2 = operation.invoke(ikck.zy(jX2), ikck.zy(C6220d.x2(reduce, it.nextInt()))).a98o();
        }
        return jX2;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final short[] h39(short[] plus, short[] elements) {
        d2ok.m23075h(plus, "$this$plus");
        d2ok.m23075h(elements, "elements");
        return tfm.m23651g(kja0.b2(plus, elements));
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final List<qo> h4b(@InterfaceC7396q short[] dropLast, int i2) {
        d2ok.m23075h(dropLast, "$this$dropLast");
        if (i2 >= 0) {
            return wu7(dropLast, fn3e.fn3e(tfm.n7h(dropLast) - i2, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final boolean h4g(byte[] none) {
        d2ok.m23075h(none, "$this$none");
        return bo.cdj(none);
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final short[] h7(short[] sArr) {
        d2ok.m23075h(sArr, "<this>");
        short[] sArrCopyOf = Arrays.copyOf(sArr, sArr.length);
        d2ok.kja0(sArrCopyOf, "copyOf(this, size)");
        return tfm.m23651g(sArrCopyOf);
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final byte[] h7am(byte[] copyOf) {
        d2ok.m23075h(copyOf, "$this$copyOf");
        byte[] bArrCopyOf = Arrays.copyOf(copyOf, copyOf.length);
        d2ok.kja0(bArrCopyOf, "copyOf(this, size)");
        return bo.m22412g(bArrCopyOf);
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final byte[] h8k(byte[] onEachIndexed, InterfaceC5979h<? super Integer, ? super C6475u, was> action) {
        d2ok.m23075h(onEachIndexed, "$this$onEachIndexed");
        d2ok.m23075h(action, "action");
        int iN7h = bo.n7h(onEachIndexed);
        int i2 = 0;
        int i3 = 0;
        while (i2 < iN7h) {
            action.invoke(Integer.valueOf(i3), C6475u.zy(bo.x2(onEachIndexed, i2)));
            i2++;
            i3++;
        }
        return onEachIndexed;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final boolean hb(byte[] any) {
        d2ok.m23075h(any, "$this$any");
        return C6144h.zaso(any);
    }

    @InterfaceC7395n
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final ikck hcy(@InterfaceC7396q long[] singleOrNull) {
        d2ok.m23075h(singleOrNull, "$this$singleOrNull");
        if (C6220d.n7h(singleOrNull) == 1) {
            return ikck.zy(C6220d.x2(singleOrNull, 0));
        }
        return null;
    }

    @yz(version = "1.7")
    @InterfaceC6769y(name = "maxWithOrThrow-U")
    @InterfaceC6232i
    public static final short hczd(@InterfaceC7396q short[] maxWith, @InterfaceC7396q Comparator<? super qo> comparator) {
        d2ok.m23075h(maxWith, "$this$maxWith");
        d2ok.m23075h(comparator, "comparator");
        if (tfm.cdj(maxWith)) {
            throw new NoSuchElementException();
        }
        short sX2 = tfm.x2(maxWith, 0);
        n5r1 it = new kotlin.ranges.x2(1, C6144h.orxw(maxWith)).iterator();
        while (it.hasNext()) {
            short sX22 = tfm.x2(maxWith, it.nextInt());
            if (comparator.compare(qo.zy(sX2), qo.zy(sX22)) < 0) {
                sX2 = sX22;
            }
        }
        return sX2;
    }

    @yz(version = "1.4")
    @InterfaceC6232i
    public static final void hf7(@InterfaceC7396q short[] shuffle, @InterfaceC7396q AbstractC6332g random) {
        d2ok.m23075h(shuffle, "$this$shuffle");
        d2ok.m23075h(random, "random");
        for (int iOrxw = C6144h.orxw(shuffle); iOrxw > 0; iOrxw--) {
            int iNextInt = random.nextInt(iOrxw + 1);
            short sX2 = tfm.x2(shuffle, iOrxw);
            tfm.m23653i(shuffle, iOrxw, tfm.x2(shuffle, iNextInt));
            tfm.m23653i(shuffle, iNextInt, sX2);
        }
    }

    @yz(version = "1.7")
    @InterfaceC6769y(name = "minWithOrThrow-U")
    @InterfaceC6232i
    public static final byte hfwa(@InterfaceC7396q byte[] minWith, @InterfaceC7396q Comparator<? super C6475u> comparator) {
        d2ok.m23075h(minWith, "$this$minWith");
        d2ok.m23075h(comparator, "comparator");
        if (bo.cdj(minWith)) {
            throw new NoSuchElementException();
        }
        byte bX2 = bo.x2(minWith, 0);
        n5r1 it = new kotlin.ranges.x2(1, C6144h.vl(minWith)).iterator();
        while (it.hasNext()) {
            byte bX22 = bo.x2(minWith, it.nextInt());
            if (comparator.compare(C6475u.zy(bX2), C6475u.zy(bX22)) > 0) {
                bX2 = bX22;
            }
        }
        return bX2;
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final <R> List<C6227f<ikck, R>> hgj(@InterfaceC7396q long[] zip, @InterfaceC7396q R[] other) {
        d2ok.m23075h(zip, "$this$zip");
        d2ok.m23075h(other, "other");
        int iMin = Math.min(C6220d.n7h(zip), other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i2 = 0; i2 < iMin; i2++) {
            long jX2 = C6220d.x2(zip, i2);
            arrayList.add(nmn5.m23230k(ikck.zy(jX2), other[i2]));
        }
        return arrayList;
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final List<C6475u> hi(@InterfaceC7396q byte[] take, int i2) {
        d2ok.m23075h(take, "$this$take");
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
        }
        if (i2 == 0) {
            return ni7.a9();
        }
        if (i2 >= bo.n7h(take)) {
            return a9.wr(bo.toq(take));
        }
        if (i2 == 1) {
            return zurt.ld6(C6475u.zy(bo.x2(take, 0)));
        }
        ArrayList arrayList = new ArrayList(i2);
        int iN7h = bo.n7h(take);
        int i3 = 0;
        for (int i4 = 0; i4 < iN7h; i4++) {
            arrayList.add(C6475u.zy(bo.x2(take, i4)));
            i3++;
            if (i3 == i2) {
                break;
            }
        }
        return arrayList;
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final List<gyi> hk(@InterfaceC7396q int[] reversed) {
        d2ok.m23075h(reversed, "$this$reversed");
        if (dr.cdj(reversed)) {
            return ni7.a9();
        }
        List<gyi> listXzk4 = a9.xzk4(dr.toq(reversed));
        jk.vep5(listXzk4);
        return listXzk4;
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final <R> List<R> hk2l(short[] runningFold, R r2, InterfaceC5979h<? super R, ? super qo, ? extends R> operation) {
        d2ok.m23075h(runningFold, "$this$runningFold");
        d2ok.m23075h(operation, "operation");
        if (tfm.cdj(runningFold)) {
            return zurt.ld6(r2);
        }
        ArrayList arrayList = new ArrayList(tfm.n7h(runningFold) + 1);
        arrayList.add(r2);
        int iN7h = tfm.n7h(runningFold);
        for (int i2 = 0; i2 < iN7h; i2++) {
            r2 = operation.invoke(r2, qo.zy(tfm.x2(runningFold, i2)));
            arrayList.add(r2);
        }
        return arrayList;
    }

    @yz(version = "1.4")
    @InterfaceC6232i
    public static final void hql(@InterfaceC7396q int[] sort, int i2, int i3) {
        d2ok.m23075h(sort, "$this$sort");
        kotlin.collections.zy.Companion.m22683q(i2, i3, dr.n7h(sort));
        kotlin.collections.lv5.x2(sort, i2, i3);
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final ikck hs6(long[] reduceIndexedOrNull, cdj<? super Integer, ? super ikck, ? super ikck, ikck> operation) {
        d2ok.m23075h(reduceIndexedOrNull, "$this$reduceIndexedOrNull");
        d2ok.m23075h(operation, "operation");
        if (C6220d.cdj(reduceIndexedOrNull)) {
            return null;
        }
        long jX2 = C6220d.x2(reduceIndexedOrNull, 0);
        n5r1 it = new kotlin.ranges.x2(1, C6144h.hmvj(reduceIndexedOrNull)).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            jX2 = operation.invoke(Integer.valueOf(iNextInt), ikck.zy(jX2), ikck.zy(C6220d.x2(reduceIndexedOrNull, iNextInt))).a98o();
        }
        return ikck.zy(jX2);
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final <R> List<C6227f<gyi, R>> hut(@InterfaceC7396q int[] zip, @InterfaceC7396q R[] other) {
        d2ok.m23075h(zip, "$this$zip");
        d2ok.m23075h(other, "other");
        int iMin = Math.min(dr.n7h(zip), other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i2 = 0; i2 < iMin; i2++) {
            int iX2 = dr.x2(zip, i2);
            arrayList.add(nmn5.m23230k(gyi.zy(iX2), other[i2]));
        }
        return arrayList;
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final byte[] huy(@InterfaceC7396q byte[] plus, @InterfaceC7396q Collection<C6475u> elements) {
        d2ok.m23075h(plus, "$this$plus");
        d2ok.m23075h(elements, "elements");
        int iN7h = bo.n7h(plus);
        byte[] bArrCopyOf = Arrays.copyOf(plus, bo.n7h(plus) + elements.size());
        d2ok.kja0(bArrCopyOf, "copyOf(this, newSize)");
        Iterator<C6475u> it = elements.iterator();
        while (it.hasNext()) {
            bArrCopyOf[iN7h] = it.next().bf2();
            iN7h++;
        }
        return bo.m22412g(bArrCopyOf);
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final List<ikck> hw(@InterfaceC7396q long[] reversed) {
        d2ok.m23075h(reversed, "$this$reversed");
        if (C6220d.cdj(reversed)) {
            return ni7.a9();
        }
        List<ikck> listXzk4 = a9.xzk4(C6220d.toq(reversed));
        jk.vep5(listXzk4);
        return listXzk4;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final qo hyow(short[] findLast, x2<? super qo, Boolean> predicate) {
        d2ok.m23075h(findLast, "$this$findLast");
        d2ok.m23075h(predicate, "predicate");
        int iN7h = tfm.n7h(findLast) - 1;
        if (iN7h >= 0) {
            while (true) {
                int i2 = iN7h - 1;
                short sX2 = tfm.x2(findLast, iN7h);
                if (predicate.invoke(qo.zy(sX2)).booleanValue()) {
                    return qo.zy(sX2);
                }
                if (i2 < 0) {
                    break;
                }
                iN7h = i2;
            }
        }
        return null;
    }

    @InterfaceC7395n
    @yz(version = "1.4")
    @InterfaceC6232i
    public static final C6475u hzl(@InterfaceC7396q byte[] minWithOrNull, @InterfaceC7396q Comparator<? super C6475u> comparator) {
        d2ok.m23075h(minWithOrNull, "$this$minWithOrNull");
        d2ok.m23075h(comparator, "comparator");
        if (bo.cdj(minWithOrNull)) {
            return null;
        }
        byte bX2 = bo.x2(minWithOrNull, 0);
        n5r1 it = new kotlin.ranges.x2(1, C6144h.vl(minWithOrNull)).iterator();
        while (it.hasNext()) {
            byte bX22 = bo.x2(minWithOrNull, it.nextInt());
            if (comparator.compare(C6475u.zy(bX2), C6475u.zy(bX22)) > 0) {
                bX2 = bX22;
            }
        }
        return C6475u.zy(bX2);
    }

    @InterfaceC7395n
    @yz(version = "1.4")
    @InterfaceC6232i
    public static final qo i0(@InterfaceC7396q short[] maxWithOrNull, @InterfaceC7396q Comparator<? super qo> comparator) {
        d2ok.m23075h(maxWithOrNull, "$this$maxWithOrNull");
        d2ok.m23075h(comparator, "comparator");
        if (tfm.cdj(maxWithOrNull)) {
            return null;
        }
        short sX2 = tfm.x2(maxWithOrNull, 0);
        n5r1 it = new kotlin.ranges.x2(1, C6144h.orxw(maxWithOrNull)).iterator();
        while (it.hasNext()) {
            short sX22 = tfm.x2(maxWithOrNull, it.nextInt());
            if (comparator.compare(qo.zy(sX2), qo.zy(sX22)) < 0) {
                sX2 = sX22;
            }
        }
        return qo.zy(sX2);
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final long i03a(long[] random) {
        d2ok.m23075h(random, "$this$random");
        return pgi(random, AbstractC6332g.Default);
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final long[] i1(long[] asLongArray) {
        d2ok.m23075h(asLongArray, "$this$asLongArray");
        return asLongArray;
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final <R> List<R> i1an(byte[] flatMapIndexed, InterfaceC5979h<? super Integer, ? super C6475u, ? extends Iterable<? extends R>> transform) {
        d2ok.m23075h(flatMapIndexed, "$this$flatMapIndexed");
        d2ok.m23075h(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int iN7h = bo.n7h(flatMapIndexed);
        int i2 = 0;
        int i3 = 0;
        while (i2 < iN7h) {
            C6163t.zp(arrayList, transform.invoke(Integer.valueOf(i3), C6475u.zy(bo.x2(flatMapIndexed, i2))));
            i2++;
            i3++;
        }
        return arrayList;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final gyi i3x9(int[] firstOrNull, x2<? super gyi, Boolean> predicate) {
        d2ok.m23075h(firstOrNull, "$this$firstOrNull");
        d2ok.m23075h(predicate, "predicate");
        int iN7h = dr.n7h(firstOrNull);
        for (int i2 = 0; i2 < iN7h; i2++) {
            int iX2 = dr.x2(firstOrNull, i2);
            if (predicate.invoke(gyi.zy(iX2)).booleanValue()) {
                return gyi.zy(iX2);
            }
        }
        return null;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final <R, V> List<V> i49(byte[] zip, R[] other, InterfaceC5979h<? super C6475u, ? super R, ? extends V> transform) {
        d2ok.m23075h(zip, "$this$zip");
        d2ok.m23075h(other, "other");
        d2ok.m23075h(transform, "transform");
        int iMin = Math.min(bo.n7h(zip), other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i2 = 0; i2 < iMin; i2++) {
            arrayList.add(transform.invoke(C6475u.zy(bo.x2(zip, i2)), other[i2]));
        }
        return arrayList;
    }

    @i9jn(markerClass = {ki.class})
    @InterfaceC7395n
    @yz(version = "1.4")
    @InterfaceC6232i
    public static final C6475u i4w(@InterfaceC7396q byte[] randomOrNull, @InterfaceC7396q AbstractC6332g random) {
        d2ok.m23075h(randomOrNull, "$this$randomOrNull");
        d2ok.m23075h(random, "random");
        if (bo.cdj(randomOrNull)) {
            return null;
        }
        return C6475u.zy(bo.x2(randomOrNull, random.nextInt(bo.n7h(randomOrNull))));
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final List<ikck> i7(long[] runningReduceIndexed, cdj<? super Integer, ? super ikck, ? super ikck, ikck> operation) {
        d2ok.m23075h(runningReduceIndexed, "$this$runningReduceIndexed");
        d2ok.m23075h(operation, "operation");
        if (C6220d.cdj(runningReduceIndexed)) {
            return ni7.a9();
        }
        long jX2 = C6220d.x2(runningReduceIndexed, 0);
        ArrayList arrayList = new ArrayList(C6220d.n7h(runningReduceIndexed));
        arrayList.add(ikck.zy(jX2));
        int iN7h = C6220d.n7h(runningReduceIndexed);
        for (int i2 = 1; i2 < iN7h; i2++) {
            jX2 = operation.invoke(Integer.valueOf(i2), ikck.zy(jX2), ikck.zy(C6220d.x2(runningReduceIndexed, i2))).a98o();
            arrayList.add(ikck.zy(jX2));
        }
        return arrayList;
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final double i8(long[] maxOf, x2<? super ikck, Double> selector) {
        d2ok.m23075h(maxOf, "$this$maxOf");
        d2ok.m23075h(selector, "selector");
        if (C6220d.cdj(maxOf)) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(ikck.zy(C6220d.x2(maxOf, 0))).doubleValue();
        n5r1 it = new kotlin.ranges.x2(1, C6144h.hmvj(maxOf)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, selector.invoke(ikck.zy(C6220d.x2(maxOf, it.nextInt()))).doubleValue());
        }
        return dDoubleValue;
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6769y(name = "sumOfLong")
    @InterfaceC6232i
    private static final long i8fu(int[] sumOf, x2<? super gyi, Long> selector) {
        d2ok.m23075h(sumOf, "$this$sumOf");
        d2ok.m23075h(selector, "selector");
        int iN7h = dr.n7h(sumOf);
        long jLongValue = 0;
        for (int i2 = 0; i2 < iN7h; i2++) {
            jLongValue += selector.invoke(gyi.zy(dr.x2(sumOf, i2))).longValue();
        }
        return jLongValue;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final byte i8gn(byte[] reduce, InterfaceC5979h<? super C6475u, ? super C6475u, C6475u> operation) {
        d2ok.m23075h(reduce, "$this$reduce");
        d2ok.m23075h(operation, "operation");
        if (bo.cdj(reduce)) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        byte bX2 = bo.x2(reduce, 0);
        n5r1 it = new kotlin.ranges.x2(1, C6144h.vl(reduce)).iterator();
        while (it.hasNext()) {
            bX2 = operation.invoke(C6475u.zy(bX2), C6475u.zy(bo.x2(reduce, it.nextInt()))).bf2();
        }
        return bX2;
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @hyr
    @InterfaceC6234g
    @yz(version = "1.5")
    @InterfaceC6769y(name = "sumOfULong")
    @InterfaceC6232i
    private static final long i9(short[] sumOf, x2<? super qo, ikck> selector) {
        d2ok.m23075h(sumOf, "$this$sumOf");
        d2ok.m23075h(selector, "selector");
        long jLd6 = ikck.ld6(0L);
        int iN7h = tfm.n7h(sumOf);
        for (int i2 = 0; i2 < iN7h; i2++) {
            jLd6 = ikck.ld6(jLd6 + selector.invoke(qo.zy(tfm.x2(sumOf, i2))).a98o());
        }
        return jLd6;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final long i9jn(long[] component5) {
        d2ok.m23075h(component5, "$this$component5");
        return C6220d.x2(component5, 4);
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @yz(version = "1.5")
    @InterfaceC6769y(name = "sumOfUInt")
    public static final int ia(@InterfaceC7396q gyi[] gyiVarArr) {
        d2ok.m23075h(gyiVarArr, "<this>");
        int iLd6 = 0;
        for (gyi gyiVar : gyiVarArr) {
            iLd6 = gyi.ld6(iLd6 + gyiVar.a98o());
        }
        return iLd6;
    }

    @i9jn(markerClass = {ki.class})
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final C6475u iby(byte[] randomOrNull) {
        d2ok.m23075h(randomOrNull, "$this$randomOrNull");
        return i4w(randomOrNull, AbstractC6332g.Default);
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final void id(short[] reverse, int i2, int i3) {
        d2ok.m23075h(reverse, "$this$reverse");
        C6144h.c7j(reverse, i2, i3);
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final byte ie(byte[] last, x2<? super C6475u, Boolean> predicate) {
        d2ok.m23075h(last, "$this$last");
        d2ok.m23075h(predicate, "predicate");
        int iN7h = bo.n7h(last) - 1;
        if (iN7h >= 0) {
            while (true) {
                int i2 = iN7h - 1;
                byte bX2 = bo.x2(last, iN7h);
                if (!predicate.invoke(C6475u.zy(bX2)).booleanValue()) {
                    if (i2 < 0) {
                        break;
                    }
                    iN7h = i2;
                } else {
                    return bX2;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final int ih(int[] random) {
        d2ok.m23075h(random, "$this$random");
        return fl(random, AbstractC6332g.Default);
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final int ij(long[] count, x2<? super ikck, Boolean> predicate) {
        d2ok.m23075h(count, "$this$count");
        d2ok.m23075h(predicate, "predicate");
        int iN7h = C6220d.n7h(count);
        int i2 = 0;
        for (int i3 = 0; i3 < iN7h; i3++) {
            if (predicate.invoke(ikck.zy(C6220d.x2(count, i3))).booleanValue()) {
                i2++;
            }
        }
        return i2;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final short ikck(short[] component1) {
        d2ok.m23075h(component1, "$this$component1");
        return tfm.x2(component1, 0);
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final List<gyi> iks(int[] runningReduceIndexed, cdj<? super Integer, ? super gyi, ? super gyi, gyi> operation) {
        d2ok.m23075h(runningReduceIndexed, "$this$runningReduceIndexed");
        d2ok.m23075h(operation, "operation");
        if (dr.cdj(runningReduceIndexed)) {
            return ni7.a9();
        }
        int iX2 = dr.x2(runningReduceIndexed, 0);
        ArrayList arrayList = new ArrayList(dr.n7h(runningReduceIndexed));
        arrayList.add(gyi.zy(iX2));
        int iN7h = dr.n7h(runningReduceIndexed);
        for (int i2 = 1; i2 < iN7h; i2++) {
            iX2 = operation.invoke(Integer.valueOf(i2), gyi.zy(iX2), gyi.zy(dr.x2(runningReduceIndexed, i2))).a98o();
            arrayList.add(gyi.zy(iX2));
        }
        return arrayList;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final <C extends Collection<? super ikck>> C imd(long[] filterNotTo, C destination, x2<? super ikck, Boolean> predicate) {
        d2ok.m23075h(filterNotTo, "$this$filterNotTo");
        d2ok.m23075h(destination, "destination");
        d2ok.m23075h(predicate, "predicate");
        int iN7h = C6220d.n7h(filterNotTo);
        for (int i2 = 0; i2 < iN7h; i2++) {
            long jX2 = C6220d.x2(filterNotTo, i2);
            if (!predicate.invoke(ikck.zy(jX2)).booleanValue()) {
                destination.add(ikck.zy(jX2));
            }
        }
        return destination;
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final int[] in(@InterfaceC7396q int[] sortedArrayDescending) {
        d2ok.m23075h(sortedArrayDescending, "$this$sortedArrayDescending");
        if (dr.cdj(sortedArrayDescending)) {
            return sortedArrayDescending;
        }
        int[] iArrCopyOf = Arrays.copyOf(sortedArrayDescending, sortedArrayDescending.length);
        d2ok.kja0(iArrCopyOf, "copyOf(this, size)");
        int[] iArrM22802g = dr.m22802g(iArrCopyOf);
        zxe(iArrM22802g);
        return iArrM22802g;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final int ip(int[] getOrElse, int i2, x2<? super Integer, gyi> defaultValue) {
        d2ok.m23075h(getOrElse, "$this$getOrElse");
        d2ok.m23075h(defaultValue, "defaultValue");
        return (i2 < 0 || i2 > C6144h.srpc(getOrElse)) ? defaultValue.invoke(Integer.valueOf(i2)).a98o() : dr.x2(getOrElse, i2);
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final short[] iqz(@InterfaceC7396q short[] plus, @InterfaceC7396q Collection<qo> elements) {
        d2ok.m23075h(plus, "$this$plus");
        d2ok.m23075h(elements, "elements");
        int iN7h = tfm.n7h(plus);
        short[] sArrCopyOf = Arrays.copyOf(plus, tfm.n7h(plus) + elements.size());
        d2ok.kja0(sArrCopyOf, "copyOf(this, newSize)");
        Iterator<qo> it = elements.iterator();
        while (it.hasNext()) {
            sArrCopyOf[iN7h] = it.next().bf2();
            iN7h++;
        }
        return tfm.m23651g(sArrCopyOf);
    }

    @yz(version = "1.7")
    @InterfaceC6769y(name = "minOrThrow-U")
    @InterfaceC6232i
    public static final byte irh(@InterfaceC7396q byte[] min) {
        d2ok.m23075h(min, "$this$min");
        if (bo.cdj(min)) {
            throw new NoSuchElementException();
        }
        byte bX2 = bo.x2(min, 0);
        n5r1 it = new kotlin.ranges.x2(1, C6144h.vl(min)).iterator();
        while (it.hasNext()) {
            byte bX22 = bo.x2(min, it.nextInt());
            if (d2ok.m23076i(bX2 & 255, bX22 & 255) > 0) {
                bX2 = bX22;
            }
        }
        return bX2;
    }

    @yz(version = "1.4")
    @InterfaceC6232i
    public static final void iroj(@InterfaceC7396q long[] sort, int i2, int i3) {
        d2ok.m23075h(sort, "$this$sort");
        kotlin.collections.zy.Companion.m22683q(i2, i3, C6220d.n7h(sort));
        kotlin.collections.lv5.m22558s(sort, i2, i3);
    }

    @InterfaceC6234g
    @yz(version = "1.7")
    @InterfaceC6769y(name = "maxByOrThrow-U")
    @InterfaceC6232i
    private static final <R extends Comparable<? super R>> int is(int[] maxBy, x2<? super gyi, ? extends R> selector) {
        d2ok.m23075h(maxBy, "$this$maxBy");
        d2ok.m23075h(selector, "selector");
        if (dr.cdj(maxBy)) {
            throw new NoSuchElementException();
        }
        int iX2 = dr.x2(maxBy, 0);
        int iSrpc = C6144h.srpc(maxBy);
        if (iSrpc == 0) {
            return iX2;
        }
        R rInvoke = selector.invoke(gyi.zy(iX2));
        n5r1 it = new kotlin.ranges.x2(1, iSrpc).iterator();
        while (it.hasNext()) {
            int iX22 = dr.x2(maxBy, it.nextInt());
            R rInvoke2 = selector.invoke(gyi.zy(iX22));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                iX2 = iX22;
                rInvoke = rInvoke2;
            }
        }
        return iX2;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final boolean ivs(long[] none) {
        d2ok.m23075h(none, "$this$none");
        return C6220d.cdj(none);
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final <R, C extends Collection<? super R>> C iw(byte[] mapIndexedTo, C destination, InterfaceC5979h<? super Integer, ? super C6475u, ? extends R> transform) {
        d2ok.m23075h(mapIndexedTo, "$this$mapIndexedTo");
        d2ok.m23075h(destination, "destination");
        d2ok.m23075h(transform, "transform");
        int iN7h = bo.n7h(mapIndexedTo);
        int i2 = 0;
        int i3 = 0;
        while (i2 < iN7h) {
            destination.add(transform.invoke(Integer.valueOf(i3), C6475u.zy(bo.x2(mapIndexedTo, i2))));
            i2++;
            i3++;
        }
        return destination;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final ikck ix(long[] elementAtOrNull, int i2) {
        d2ok.m23075h(elementAtOrNull, "$this$elementAtOrNull");
        return s31(elementAtOrNull, i2);
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final long[] ixz(long[] copyOfRange, int i2, int i3) {
        d2ok.m23075h(copyOfRange, "$this$copyOfRange");
        return C6220d.m22779g(kja0.b3e(copyOfRange, i2, i3));
    }

    @yz(version = "1.3")
    @InterfaceC6232i
    public static /* synthetic */ void iz(int[] iArr) {
    }

    @yz(version = "1.3")
    @InterfaceC6232i
    public static /* synthetic */ void izu(short[] sArr) {
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    /* JADX INFO: renamed from: j */
    private static final boolean m22645j(byte[] any, x2<? super C6475u, Boolean> predicate) {
        d2ok.m23075h(any, "$this$any");
        d2ok.m23075h(predicate, "predicate");
        int iN7h = bo.n7h(any);
        for (int i2 = 0; i2 < iN7h; i2++) {
            if (predicate.invoke(C6475u.zy(bo.x2(any, i2))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final Double j1s(long[] maxOfOrNull, x2<? super ikck, Double> selector) {
        d2ok.m23075h(maxOfOrNull, "$this$maxOfOrNull");
        d2ok.m23075h(selector, "selector");
        if (C6220d.cdj(maxOfOrNull)) {
            return null;
        }
        double dDoubleValue = selector.invoke(ikck.zy(C6220d.x2(maxOfOrNull, 0))).doubleValue();
        n5r1 it = new kotlin.ranges.x2(1, C6144h.hmvj(maxOfOrNull)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, selector.invoke(ikck.zy(C6220d.x2(maxOfOrNull, it.nextInt()))).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final <R extends Comparable<? super R>> R j3px(byte[] maxOf, x2<? super C6475u, ? extends R> selector) {
        d2ok.m23075h(maxOf, "$this$maxOf");
        d2ok.m23075h(selector, "selector");
        if (bo.cdj(maxOf)) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(C6475u.zy(bo.x2(maxOf, 0)));
        n5r1 it = new kotlin.ranges.x2(1, C6144h.vl(maxOf)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(C6475u.zy(bo.x2(maxOf, it.nextInt())));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final <R> R j3y2(byte[] foldIndexed, R r2, cdj<? super Integer, ? super R, ? super C6475u, ? extends R> operation) {
        d2ok.m23075h(foldIndexed, "$this$foldIndexed");
        d2ok.m23075h(operation, "operation");
        int iN7h = bo.n7h(foldIndexed);
        int i2 = 0;
        int i3 = 0;
        while (i2 < iN7h) {
            r2 = operation.invoke(Integer.valueOf(i3), r2, C6475u.zy(bo.x2(foldIndexed, i2)));
            i2++;
            i3++;
        }
        return r2;
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final List<qo> j9nl(short[] runningReduce, InterfaceC5979h<? super qo, ? super qo, qo> operation) {
        d2ok.m23075h(runningReduce, "$this$runningReduce");
        d2ok.m23075h(operation, "operation");
        if (tfm.cdj(runningReduce)) {
            return ni7.a9();
        }
        short sX2 = tfm.x2(runningReduce, 0);
        ArrayList arrayList = new ArrayList(tfm.n7h(runningReduce));
        arrayList.add(qo.zy(sX2));
        int iN7h = tfm.n7h(runningReduce);
        for (int i2 = 1; i2 < iN7h; i2++) {
            sX2 = operation.invoke(qo.zy(sX2), qo.zy(tfm.x2(runningReduce, i2))).bf2();
            arrayList.add(qo.zy(sX2));
        }
        return arrayList;
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @yz(version = "1.5")
    @InterfaceC6769y(name = "sumOfUByte")
    public static final int jb7a(@InterfaceC7396q C6475u[] c6475uArr) {
        d2ok.m23075h(c6475uArr, "<this>");
        int iLd6 = 0;
        for (C6475u c6475u : c6475uArr) {
            iLd6 = gyi.ld6(iLd6 + gyi.ld6(c6475u.bf2() & 255));
        }
        return iLd6;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final int jb9(long[] indexOfFirst, x2<? super ikck, Boolean> predicate) {
        d2ok.m23075h(indexOfFirst, "$this$indexOfFirst");
        d2ok.m23075h(predicate, "predicate");
        int length = indexOfFirst.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (predicate.invoke(ikck.zy(ikck.ld6(indexOfFirst[i2]))).booleanValue()) {
                return i2;
            }
        }
        return -1;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final short[] jbh(short[] copyOf, int i2) {
        d2ok.m23075h(copyOf, "$this$copyOf");
        short[] sArrCopyOf = Arrays.copyOf(copyOf, i2);
        d2ok.kja0(sArrCopyOf, "copyOf(this, newSize)");
        return tfm.m23651g(sArrCopyOf);
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final qo jcwh(short[] reduceRightIndexedOrNull, cdj<? super Integer, ? super qo, ? super qo, qo> operation) {
        d2ok.m23075h(reduceRightIndexedOrNull, "$this$reduceRightIndexedOrNull");
        d2ok.m23075h(operation, "operation");
        int iOrxw = C6144h.orxw(reduceRightIndexedOrNull);
        if (iOrxw < 0) {
            return null;
        }
        short sX2 = tfm.x2(reduceRightIndexedOrNull, iOrxw);
        for (int i2 = iOrxw - 1; i2 >= 0; i2--) {
            sX2 = operation.invoke(Integer.valueOf(i2), qo.zy(tfm.x2(reduceRightIndexedOrNull, i2)), qo.zy(sX2)).bf2();
        }
        return qo.zy(sX2);
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final <R> List<R> je1q(byte[] mapIndexed, InterfaceC5979h<? super Integer, ? super C6475u, ? extends R> transform) {
        d2ok.m23075h(mapIndexed, "$this$mapIndexed");
        d2ok.m23075h(transform, "transform");
        ArrayList arrayList = new ArrayList(bo.n7h(mapIndexed));
        int iN7h = bo.n7h(mapIndexed);
        int i2 = 0;
        int i3 = 0;
        while (i2 < iN7h) {
            arrayList.add(transform.invoke(Integer.valueOf(i3), C6475u.zy(bo.x2(mapIndexed, i2))));
            i2++;
            i3++;
        }
        return arrayList;
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final <R> List<C6227f<C6475u, R>> jek(@InterfaceC7396q byte[] zip, @InterfaceC7396q R[] other) {
        d2ok.m23075h(zip, "$this$zip");
        d2ok.m23075h(other, "other");
        int iMin = Math.min(bo.n7h(zip), other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i2 = 0; i2 < iMin; i2++) {
            byte bX2 = bo.x2(zip, i2);
            arrayList.add(nmn5.m23230k(C6475u.zy(bX2), other[i2]));
        }
        return arrayList;
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final int[] jerf(int[] onEachIndexed, InterfaceC5979h<? super Integer, ? super gyi, was> action) {
        d2ok.m23075h(onEachIndexed, "$this$onEachIndexed");
        d2ok.m23075h(action, "action");
        int iN7h = dr.n7h(onEachIndexed);
        int i2 = 0;
        int i3 = 0;
        while (i2 < iN7h) {
            action.invoke(Integer.valueOf(i3), gyi.zy(dr.x2(onEachIndexed, i2)));
            i2++;
            i3++;
        }
        return onEachIndexed;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final int jglj(long[] lastIndexOf, long j2) {
        d2ok.m23075h(lastIndexOf, "$this$lastIndexOf");
        return C6144h.mxfl(lastIndexOf, j2);
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final List<ikck> jhn(@InterfaceC7396q long[] sorted) {
        d2ok.m23075h(sorted, "$this$sorted");
        long[] jArrCopyOf = Arrays.copyOf(sorted, sorted.length);
        d2ok.kja0(jArrCopyOf, "copyOf(this, size)");
        long[] jArrM22779g = C6220d.m22779g(jArrCopyOf);
        ca(jArrM22779g);
        return kotlin.collections.unsigned.toq.zy(jArrM22779g);
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final int jl(int[] reduceRight, InterfaceC5979h<? super gyi, ? super gyi, gyi> operation) {
        d2ok.m23075h(reduceRight, "$this$reduceRight");
        d2ok.m23075h(operation, "operation");
        int iSrpc = C6144h.srpc(reduceRight);
        if (iSrpc < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        int iX2 = dr.x2(reduceRight, iSrpc);
        for (int i2 = iSrpc - 1; i2 >= 0; i2--) {
            iX2 = operation.invoke(gyi.zy(dr.x2(reduceRight, i2)), gyi.zy(iX2)).a98o();
        }
        return iX2;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final long jog(long[] last, x2<? super ikck, Boolean> predicate) {
        d2ok.m23075h(last, "$this$last");
        d2ok.m23075h(predicate, "predicate");
        int iN7h = C6220d.n7h(last) - 1;
        if (iN7h >= 0) {
            while (true) {
                int i2 = iN7h - 1;
                long jX2 = C6220d.x2(last, iN7h);
                if (!predicate.invoke(ikck.zy(jX2)).booleanValue()) {
                    if (i2 < 0) {
                        break;
                    }
                    iN7h = i2;
                } else {
                    return jX2;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @InterfaceC7395n
    @yz(version = "1.4")
    @InterfaceC6232i
    public static final qo jp(@InterfaceC7396q short[] maxOrNull) {
        d2ok.m23075h(maxOrNull, "$this$maxOrNull");
        if (tfm.cdj(maxOrNull)) {
            return null;
        }
        short sX2 = tfm.x2(maxOrNull, 0);
        n5r1 it = new kotlin.ranges.x2(1, C6144h.orxw(maxOrNull)).iterator();
        while (it.hasNext()) {
            short sX22 = tfm.x2(maxOrNull, it.nextInt());
            if (d2ok.m23076i(sX2 & qo.f36486g, 65535 & sX22) < 0) {
                sX2 = sX22;
            }
        }
        return qo.zy(sX2);
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final <R> List<R> jre(long[] map, x2<? super ikck, ? extends R> transform) {
        d2ok.m23075h(map, "$this$map");
        d2ok.m23075h(transform, "transform");
        ArrayList arrayList = new ArrayList(C6220d.n7h(map));
        int iN7h = C6220d.n7h(map);
        for (int i2 = 0; i2 < iN7h; i2++) {
            arrayList.add(transform.invoke(ikck.zy(C6220d.x2(map, i2))));
        }
        return arrayList;
    }

    @yz(version = "1.3")
    @InterfaceC6232i
    public static final void jrla(@InterfaceC7396q short[] sort) {
        d2ok.m23075h(sort, "$this$sort");
        if (tfm.n7h(sort) > 1) {
            kotlin.collections.lv5.ld6(sort, 0, tfm.n7h(sort));
        }
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final gyi[] jswb(@InterfaceC7396q int[] toTypedArray) {
        d2ok.m23075h(toTypedArray, "$this$toTypedArray");
        int iN7h = dr.n7h(toTypedArray);
        gyi[] gyiVarArr = new gyi[iN7h];
        for (int i2 = 0; i2 < iN7h; i2++) {
            gyiVarArr[i2] = gyi.zy(dr.x2(toTypedArray, i2));
        }
        return gyiVarArr;
    }

    @InterfaceC7395n
    @yz(version = "1.4")
    @InterfaceC6232i
    public static final qo jut(@InterfaceC7396q short[] minOrNull) {
        d2ok.m23075h(minOrNull, "$this$minOrNull");
        if (tfm.cdj(minOrNull)) {
            return null;
        }
        short sX2 = tfm.x2(minOrNull, 0);
        n5r1 it = new kotlin.ranges.x2(1, C6144h.orxw(minOrNull)).iterator();
        while (it.hasNext()) {
            short sX22 = tfm.x2(minOrNull, it.nextInt());
            if (d2ok.m23076i(sX2 & qo.f36486g, 65535 & sX22) > 0) {
                sX2 = sX22;
            }
        }
        return qo.zy(sX2);
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final long[] jute(long[] jArr) {
        d2ok.m23075h(jArr, "<this>");
        long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
        d2ok.kja0(jArrCopyOf, "copyOf(this, size)");
        return C6220d.m22779g(jArrCopyOf);
    }

    public static final int jyr(@InterfaceC7396q int[] lastIndex) {
        d2ok.m23075h(lastIndex, "$this$lastIndex");
        return C6144h.srpc(lastIndex);
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final byte[] jz5(byte[] copyInto, byte[] destination, int i2, int i3, int i4) {
        d2ok.m23075h(copyInto, "$this$copyInto");
        d2ok.m23075h(destination, "destination");
        kja0.y2(copyInto, destination, i2, i3, i4);
        return destination;
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @hyr
    @InterfaceC6234g
    @yz(version = "1.5")
    @InterfaceC6769y(name = "sumOfUInt")
    @InterfaceC6232i
    private static final int k0ir(short[] sumOf, x2<? super qo, gyi> selector) {
        d2ok.m23075h(sumOf, "$this$sumOf");
        d2ok.m23075h(selector, "selector");
        int iLd6 = gyi.ld6(0);
        int iN7h = tfm.n7h(sumOf);
        for (int i2 = 0; i2 < iN7h; i2++) {
            iLd6 = gyi.ld6(iLd6 + selector.invoke(qo.zy(tfm.x2(sumOf, i2))).a98o());
        }
        return iLd6;
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final float k2b8(long[] maxOf, x2<? super ikck, Float> selector) {
        d2ok.m23075h(maxOf, "$this$maxOf");
        d2ok.m23075h(selector, "selector");
        if (C6220d.cdj(maxOf)) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(ikck.zy(C6220d.x2(maxOf, 0))).floatValue();
        n5r1 it = new kotlin.ranges.x2(1, C6144h.hmvj(maxOf)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, selector.invoke(ikck.zy(C6220d.x2(maxOf, it.nextInt()))).floatValue());
        }
        return fFloatValue;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final <R> R k4jz(int[] foldRightIndexed, R r2, cdj<? super Integer, ? super gyi, ? super R, ? extends R> operation) {
        d2ok.m23075h(foldRightIndexed, "$this$foldRightIndexed");
        d2ok.m23075h(operation, "operation");
        for (int iSrpc = C6144h.srpc(foldRightIndexed); iSrpc >= 0; iSrpc--) {
            r2 = operation.invoke(Integer.valueOf(iSrpc), gyi.zy(dr.x2(foldRightIndexed, iSrpc)), r2);
        }
        return r2;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final List<C6475u> kaf(byte[] takeLastWhile, x2<? super C6475u, Boolean> predicate) {
        d2ok.m23075h(takeLastWhile, "$this$takeLastWhile");
        d2ok.m23075h(predicate, "predicate");
        for (int iVl = C6144h.vl(takeLastWhile); -1 < iVl; iVl--) {
            if (!predicate.invoke(C6475u.zy(bo.x2(takeLastWhile, iVl))).booleanValue()) {
                return n2t(takeLastWhile, iVl + 1);
            }
        }
        return a9.wr(bo.toq(takeLastWhile));
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final <C extends Collection<? super qo>> C kbj(short[] filterTo, C destination, x2<? super qo, Boolean> predicate) {
        d2ok.m23075h(filterTo, "$this$filterTo");
        d2ok.m23075h(destination, "destination");
        d2ok.m23075h(predicate, "predicate");
        int iN7h = tfm.n7h(filterTo);
        for (int i2 = 0; i2 < iN7h; i2++) {
            short sX2 = tfm.x2(filterTo, i2);
            if (predicate.invoke(qo.zy(sX2)).booleanValue()) {
                destination.add(qo.zy(sX2));
            }
        }
        return destination;
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final <R> List<R> kcdz(int[] runningFoldIndexed, R r2, cdj<? super Integer, ? super R, ? super gyi, ? extends R> operation) {
        d2ok.m23075h(runningFoldIndexed, "$this$runningFoldIndexed");
        d2ok.m23075h(operation, "operation");
        if (dr.cdj(runningFoldIndexed)) {
            return zurt.ld6(r2);
        }
        ArrayList arrayList = new ArrayList(dr.n7h(runningFoldIndexed) + 1);
        arrayList.add(r2);
        int iN7h = dr.n7h(runningFoldIndexed);
        for (int i2 = 0; i2 < iN7h; i2++) {
            r2 = operation.invoke(Integer.valueOf(i2), r2, gyi.zy(dr.x2(runningFoldIndexed, i2)));
            arrayList.add(r2);
        }
        return arrayList;
    }

    @InterfaceC7396q
    @yz(version = "1.4")
    @InterfaceC6232i
    public static String kcsr(@InterfaceC7395n int[] iArr) {
        String strUo;
        return (iArr == null || (strUo = a9.uo(dr.toq(iArr), ", ", "[", "]", 0, null, null, 56, null)) == null) ? "null" : strUo;
    }

    @yz(version = "1.7")
    @InterfaceC6769y(name = "maxOrThrow-U")
    @InterfaceC6232i
    public static final long kho(@InterfaceC7396q long[] max) {
        d2ok.m23075h(max, "$this$max");
        if (C6220d.cdj(max)) {
            throw new NoSuchElementException();
        }
        long jX2 = C6220d.x2(max, 0);
        n5r1 it = new kotlin.ranges.x2(1, C6144h.hmvj(max)).iterator();
        while (it.hasNext()) {
            long jX22 = C6220d.x2(max, it.nextInt());
            if (Long.compareUnsigned(jX2, jX22) < 0) {
                jX2 = jX22;
            }
        }
        return jX2;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final List<ikck> kiv(long[] filter, x2<? super ikck, Boolean> predicate) {
        d2ok.m23075h(filter, "$this$filter");
        d2ok.m23075h(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int iN7h = C6220d.n7h(filter);
        for (int i2 = 0; i2 < iN7h; i2++) {
            long jX2 = C6220d.x2(filter, i2);
            if (predicate.invoke(ikck.zy(jX2)).booleanValue()) {
                arrayList.add(ikck.zy(jX2));
            }
        }
        return arrayList;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final <R> R kjd(short[] foldRightIndexed, R r2, cdj<? super Integer, ? super qo, ? super R, ? extends R> operation) {
        d2ok.m23075h(foldRightIndexed, "$this$foldRightIndexed");
        d2ok.m23075h(operation, "operation");
        for (int iOrxw = C6144h.orxw(foldRightIndexed); iOrxw >= 0; iOrxw--) {
            r2 = operation.invoke(Integer.valueOf(iOrxw), qo.zy(tfm.x2(foldRightIndexed, iOrxw)), r2);
        }
        return r2;
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final List<qo> kl(@InterfaceC7396q short[] slice, @InterfaceC7396q kotlin.ranges.x2 indices) {
        d2ok.m23075h(slice, "$this$slice");
        d2ok.m23075h(indices, "indices");
        return indices.isEmpty() ? ni7.a9() : kotlin.collections.unsigned.toq.m22627q(tfm.m23651g(kja0.cv06(slice, indices.mo2951k().intValue(), indices.zy().intValue() + 1)));
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final <R, C extends Collection<? super R>> C kl7m(long[] flatMapTo, C destination, x2<? super ikck, ? extends Iterable<? extends R>> transform) {
        d2ok.m23075h(flatMapTo, "$this$flatMapTo");
        d2ok.m23075h(destination, "destination");
        d2ok.m23075h(transform, "transform");
        int iN7h = C6220d.n7h(flatMapTo);
        for (int i2 = 0; i2 < iN7h; i2++) {
            C6163t.zp(destination, transform.invoke(ikck.zy(C6220d.x2(flatMapTo, i2))));
        }
        return destination;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final List<qo> klfn(short[] takeLastWhile, x2<? super qo, Boolean> predicate) {
        d2ok.m23075h(takeLastWhile, "$this$takeLastWhile");
        d2ok.m23075h(predicate, "predicate");
        for (int iOrxw = C6144h.orxw(takeLastWhile); -1 < iOrxw; iOrxw--) {
            if (!predicate.invoke(qo.zy(tfm.x2(takeLastWhile, iOrxw))).booleanValue()) {
                return pjz9(takeLastWhile, iOrxw + 1);
            }
        }
        return a9.wr(tfm.toq(takeLastWhile));
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final Double km9o(int[] maxOfOrNull, x2<? super gyi, Double> selector) {
        d2ok.m23075h(maxOfOrNull, "$this$maxOfOrNull");
        d2ok.m23075h(selector, "selector");
        if (dr.cdj(maxOfOrNull)) {
            return null;
        }
        double dDoubleValue = selector.invoke(gyi.zy(dr.x2(maxOfOrNull, 0))).doubleValue();
        n5r1 it = new kotlin.ranges.x2(1, C6144h.srpc(maxOfOrNull)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, selector.invoke(gyi.zy(dr.x2(maxOfOrNull, it.nextInt()))).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final List<gyi> kn7(@InterfaceC7396q int[] sortedDescending) {
        d2ok.m23075h(sortedDescending, "$this$sortedDescending");
        int[] iArrCopyOf = Arrays.copyOf(sortedDescending, sortedDescending.length);
        d2ok.kja0(iArrCopyOf, "copyOf(this, size)");
        int[] iArrM22802g = dr.m22802g(iArrCopyOf);
        ceo(iArrM22802g);
        return hk(iArrM22802g);
    }

    @InterfaceC7395n
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final qo koj(@InterfaceC7396q short[] getOrNull, int i2) {
        d2ok.m23075h(getOrNull, "$this$getOrNull");
        if (i2 < 0 || i2 > C6144h.orxw(getOrNull)) {
            return null;
        }
        return qo.zy(tfm.x2(getOrNull, i2));
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final <V> List<V> kp3(int[] zip, int[] other, InterfaceC5979h<? super gyi, ? super gyi, ? extends V> transform) {
        d2ok.m23075h(zip, "$this$zip");
        d2ok.m23075h(other, "other");
        d2ok.m23075h(transform, "transform");
        int iMin = Math.min(dr.n7h(zip), dr.n7h(other));
        ArrayList arrayList = new ArrayList(iMin);
        for (int i2 = 0; i2 < iMin; i2++) {
            arrayList.add(transform.invoke(gyi.zy(dr.x2(zip, i2)), gyi.zy(dr.x2(other, i2))));
        }
        return arrayList;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final <R> R kq(int[] fold, R r2, InterfaceC5979h<? super R, ? super gyi, ? extends R> operation) {
        d2ok.m23075h(fold, "$this$fold");
        d2ok.m23075h(operation, "operation");
        int iN7h = dr.n7h(fold);
        for (int i2 = 0; i2 < iN7h; i2++) {
            r2 = operation.invoke(r2, gyi.zy(dr.x2(fold, i2)));
        }
        return r2;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final C6475u kq2f(byte[] find, x2<? super C6475u, Boolean> predicate) {
        d2ok.m23075h(find, "$this$find");
        d2ok.m23075h(predicate, "predicate");
        int iN7h = bo.n7h(find);
        for (int i2 = 0; i2 < iN7h; i2++) {
            byte bX2 = bo.x2(find, i2);
            if (predicate.invoke(C6475u.zy(bX2)).booleanValue()) {
                return C6475u.zy(bX2);
            }
        }
        return null;
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final <R> List<C6227f<qo, R>> kro(@InterfaceC7396q short[] zip, @InterfaceC7396q R[] other) {
        d2ok.m23075h(zip, "$this$zip");
        d2ok.m23075h(other, "other");
        int iMin = Math.min(tfm.n7h(zip), other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i2 = 0; i2 < iMin; i2++) {
            short sX2 = tfm.x2(zip, i2);
            arrayList.add(nmn5.m23230k(qo.zy(sX2), other[i2]));
        }
        return arrayList;
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final float krto(short[] maxOf, x2<? super qo, Float> selector) {
        d2ok.m23075h(maxOf, "$this$maxOf");
        d2ok.m23075h(selector, "selector");
        if (tfm.cdj(maxOf)) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(qo.zy(tfm.x2(maxOf, 0))).floatValue();
        n5r1 it = new kotlin.ranges.x2(1, C6144h.orxw(maxOf)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, selector.invoke(qo.zy(tfm.x2(maxOf, it.nextInt()))).floatValue());
        }
        return fFloatValue;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final <R> List<R> kt06(int[] flatMap, x2<? super gyi, ? extends Iterable<? extends R>> transform) {
        d2ok.m23075h(flatMap, "$this$flatMap");
        d2ok.m23075h(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int iN7h = dr.n7h(flatMap);
        for (int i2 = 0; i2 < iN7h; i2++) {
            C6163t.zp(arrayList, transform.invoke(gyi.zy(dr.x2(flatMap, i2))));
        }
        return arrayList;
    }

    static /* synthetic */ byte[] ktq(byte[] copyInto, byte[] destination, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i2 = 0;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = bo.n7h(copyInto);
        }
        d2ok.m23075h(copyInto, "$this$copyInto");
        d2ok.m23075h(destination, "destination");
        kja0.y2(copyInto, destination, i2, i3, i4);
        return destination;
    }

    @yz(version = "1.3")
    @InterfaceC6232i
    public static final void kx3(@InterfaceC7396q int[] fill, int i2, int i3, int i4) {
        d2ok.m23075h(fill, "$this$fill");
        kja0.e5(fill, i2, i3, i4);
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final <R> List<R> kz28(long[] flatMap, x2<? super ikck, ? extends Iterable<? extends R>> transform) {
        d2ok.m23075h(flatMap, "$this$flatMap");
        d2ok.m23075h(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int iN7h = C6220d.n7h(flatMap);
        for (int i2 = 0; i2 < iN7h; i2++) {
            C6163t.zp(arrayList, transform.invoke(ikck.zy(C6220d.x2(flatMap, i2))));
        }
        return arrayList;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final long l0(long[] last) {
        d2ok.m23075h(last, "$this$last");
        return ikck.ld6(C6144h.gj(last));
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final <C extends Collection<? super gyi>> C l05(int[] filterIndexedTo, C destination, InterfaceC5979h<? super Integer, ? super gyi, Boolean> predicate) {
        d2ok.m23075h(filterIndexedTo, "$this$filterIndexedTo");
        d2ok.m23075h(destination, "destination");
        d2ok.m23075h(predicate, "predicate");
        int iN7h = dr.n7h(filterIndexedTo);
        int i2 = 0;
        int i3 = 0;
        while (i2 < iN7h) {
            int iX2 = dr.x2(filterIndexedTo, i2);
            int i4 = i3 + 1;
            if (predicate.invoke(Integer.valueOf(i3), gyi.zy(iX2)).booleanValue()) {
                destination.add(gyi.zy(iX2));
            }
            i2++;
            i3 = i4;
        }
        return destination;
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final <R extends Comparable<? super R>> R l0u(int[] minOf, x2<? super gyi, ? extends R> selector) {
        d2ok.m23075h(minOf, "$this$minOf");
        d2ok.m23075h(selector, "selector");
        if (dr.cdj(minOf)) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(gyi.zy(dr.x2(minOf, 0)));
        n5r1 it = new kotlin.ranges.x2(1, C6144h.srpc(minOf)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(gyi.zy(dr.x2(minOf, it.nextInt())));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final Iterable<x9kr<ikck>> l42(@InterfaceC7396q long[] withIndex) {
        d2ok.m23075h(withIndex, "$this$withIndex");
        return new ncyb(new toq(withIndex));
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final byte l5o(byte[] reduceRight, InterfaceC5979h<? super C6475u, ? super C6475u, C6475u> operation) {
        d2ok.m23075h(reduceRight, "$this$reduceRight");
        d2ok.m23075h(operation, "operation");
        int iVl = C6144h.vl(reduceRight);
        if (iVl < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        byte bX2 = bo.x2(reduceRight, iVl);
        for (int i2 = iVl - 1; i2 >= 0; i2--) {
            bX2 = operation.invoke(C6475u.zy(bo.x2(reduceRight, i2)), C6475u.zy(bX2)).bf2();
        }
        return bX2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final <K, V, M extends Map<? super K, List<V>>> M l7o(int[] groupByTo, M destination, x2<? super gyi, ? extends K> keySelector, x2<? super gyi, ? extends V> valueTransform) {
        d2ok.m23075h(groupByTo, "$this$groupByTo");
        d2ok.m23075h(destination, "destination");
        d2ok.m23075h(keySelector, "keySelector");
        d2ok.m23075h(valueTransform, "valueTransform");
        int iN7h = dr.n7h(groupByTo);
        for (int i2 = 0; i2 < iN7h; i2++) {
            int iX2 = dr.x2(groupByTo, i2);
            K kInvoke = keySelector.invoke(gyi.zy(iX2));
            Object arrayList = destination.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(valueTransform.invoke(gyi.zy(iX2)));
        }
        return destination;
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final <R extends Comparable<? super R>> C6475u l92(byte[] maxByOrNull, x2<? super C6475u, ? extends R> selector) {
        d2ok.m23075h(maxByOrNull, "$this$maxByOrNull");
        d2ok.m23075h(selector, "selector");
        if (bo.cdj(maxByOrNull)) {
            return null;
        }
        byte bX2 = bo.x2(maxByOrNull, 0);
        int iVl = C6144h.vl(maxByOrNull);
        if (iVl == 0) {
            return C6475u.zy(bX2);
        }
        R rInvoke = selector.invoke(C6475u.zy(bX2));
        n5r1 it = new kotlin.ranges.x2(1, iVl).iterator();
        while (it.hasNext()) {
            byte bX22 = bo.x2(maxByOrNull, it.nextInt());
            R rInvoke2 = selector.invoke(C6475u.zy(bX22));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                bX2 = bX22;
                rInvoke = rInvoke2;
            }
        }
        return C6475u.zy(bX2);
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final byte[] lay(byte[] reversedArray) {
        d2ok.m23075h(reversedArray, "$this$reversedArray");
        return bo.m22412g(C6144h.ji83(reversedArray));
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final byte[] lbeq(@InterfaceC7396q byte[] sortedArray) {
        d2ok.m23075h(sortedArray, "$this$sortedArray");
        if (bo.cdj(sortedArray)) {
            return sortedArray;
        }
        byte[] bArrCopyOf = Arrays.copyOf(sortedArray, sortedArray.length);
        d2ok.kja0(bArrCopyOf, "copyOf(this, size)");
        byte[] bArrM22412g = bo.m22412g(bArrCopyOf);
        os3j(bArrM22412g);
        return bArrM22412g;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final <R, C extends Collection<? super R>> C le7(int[] flatMapTo, C destination, x2<? super gyi, ? extends Iterable<? extends R>> transform) {
        d2ok.m23075h(flatMapTo, "$this$flatMapTo");
        d2ok.m23075h(destination, "destination");
        d2ok.m23075h(transform, "transform");
        int iN7h = dr.n7h(flatMapTo);
        for (int i2 = 0; i2 < iN7h; i2++) {
            C6163t.zp(destination, transform.invoke(gyi.zy(dr.x2(flatMapTo, i2))));
        }
        return destination;
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final double le9(short[] maxOf, x2<? super qo, Double> selector) {
        d2ok.m23075h(maxOf, "$this$maxOf");
        d2ok.m23075h(selector, "selector");
        if (tfm.cdj(maxOf)) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(qo.zy(tfm.x2(maxOf, 0))).doubleValue();
        n5r1 it = new kotlin.ranges.x2(1, C6144h.orxw(maxOf)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, selector.invoke(qo.zy(tfm.x2(maxOf, it.nextInt()))).doubleValue());
        }
        return dDoubleValue;
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final C6475u lflh(byte[] reduceIndexedOrNull, cdj<? super Integer, ? super C6475u, ? super C6475u, C6475u> operation) {
        d2ok.m23075h(reduceIndexedOrNull, "$this$reduceIndexedOrNull");
        d2ok.m23075h(operation, "operation");
        if (bo.cdj(reduceIndexedOrNull)) {
            return null;
        }
        byte bX2 = bo.x2(reduceIndexedOrNull, 0);
        n5r1 it = new kotlin.ranges.x2(1, C6144h.vl(reduceIndexedOrNull)).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            bX2 = operation.invoke(Integer.valueOf(iNextInt), C6475u.zy(bX2), C6475u.zy(bo.x2(reduceIndexedOrNull, iNextInt))).bf2();
        }
        return C6475u.zy(bX2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final <K, V, M extends Map<? super K, List<V>>> M lg4k(byte[] groupByTo, M destination, x2<? super C6475u, ? extends K> keySelector, x2<? super C6475u, ? extends V> valueTransform) {
        d2ok.m23075h(groupByTo, "$this$groupByTo");
        d2ok.m23075h(destination, "destination");
        d2ok.m23075h(keySelector, "keySelector");
        d2ok.m23075h(valueTransform, "valueTransform");
        int iN7h = bo.n7h(groupByTo);
        for (int i2 = 0; i2 < iN7h; i2++) {
            byte bX2 = bo.x2(groupByTo, i2);
            K kInvoke = keySelector.invoke(C6475u.zy(bX2));
            Object arrayList = destination.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(valueTransform.invoke(C6475u.zy(bX2)));
        }
        return destination;
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final List<ikck> lh(@InterfaceC7396q long[] drop, int i2) {
        d2ok.m23075h(drop, "$this$drop");
        if (i2 >= 0) {
            return z75m(drop, fn3e.fn3e(C6220d.n7h(drop) - i2, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final Float li5y(int[] maxOfOrNull, x2<? super gyi, Float> selector) {
        d2ok.m23075h(maxOfOrNull, "$this$maxOfOrNull");
        d2ok.m23075h(selector, "selector");
        if (dr.cdj(maxOfOrNull)) {
            return null;
        }
        float fFloatValue = selector.invoke(gyi.zy(dr.x2(maxOfOrNull, 0))).floatValue();
        n5r1 it = new kotlin.ranges.x2(1, C6144h.srpc(maxOfOrNull)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, selector.invoke(gyi.zy(dr.x2(maxOfOrNull, it.nextInt()))).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final int lk(int[] first, x2<? super gyi, Boolean> predicate) {
        d2ok.m23075h(first, "$this$first");
        d2ok.m23075h(predicate, "predicate");
        int iN7h = dr.n7h(first);
        for (int i2 = 0; i2 < iN7h; i2++) {
            int iX2 = dr.x2(first, i2);
            if (predicate.invoke(gyi.zy(iX2)).booleanValue()) {
                return iX2;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final float lm(int[] maxOf, x2<? super gyi, Float> selector) {
        d2ok.m23075h(maxOf, "$this$maxOf");
        d2ok.m23075h(selector, "selector");
        if (dr.cdj(maxOf)) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(gyi.zy(dr.x2(maxOf, 0))).floatValue();
        n5r1 it = new kotlin.ranges.x2(1, C6144h.srpc(maxOf)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, selector.invoke(gyi.zy(dr.x2(maxOf, it.nextInt()))).floatValue());
        }
        return fFloatValue;
    }

    @InterfaceC6234g
    @yz(version = "1.7")
    @InterfaceC6769y(name = "minByOrThrow-U")
    @InterfaceC6232i
    private static final <R extends Comparable<? super R>> byte lm5(byte[] minBy, x2<? super C6475u, ? extends R> selector) {
        d2ok.m23075h(minBy, "$this$minBy");
        d2ok.m23075h(selector, "selector");
        if (bo.cdj(minBy)) {
            throw new NoSuchElementException();
        }
        byte bX2 = bo.x2(minBy, 0);
        int iVl = C6144h.vl(minBy);
        if (iVl == 0) {
            return bX2;
        }
        R rInvoke = selector.invoke(C6475u.zy(bX2));
        n5r1 it = new kotlin.ranges.x2(1, iVl).iterator();
        while (it.hasNext()) {
            byte bX22 = bo.x2(minBy, it.nextInt());
            R rInvoke2 = selector.invoke(C6475u.zy(bX22));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                bX2 = bX22;
                rInvoke = rInvoke2;
            }
        }
        return bX2;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final int ln(long[] indexOfLast, x2<? super ikck, Boolean> predicate) {
        d2ok.m23075h(indexOfLast, "$this$indexOfLast");
        d2ok.m23075h(predicate, "predicate");
        int length = indexOfLast.length - 1;
        if (length < 0) {
            return -1;
        }
        while (true) {
            int i2 = length - 1;
            if (predicate.invoke(ikck.zy(ikck.ld6(indexOfLast[length]))).booleanValue()) {
                return length;
            }
            if (i2 < 0) {
                return -1;
            }
            length = i2;
        }
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final boolean lrht(byte[] all, x2<? super C6475u, Boolean> predicate) {
        d2ok.m23075h(all, "$this$all");
        d2ok.m23075h(predicate, "predicate");
        int iN7h = bo.n7h(all);
        for (int i2 = 0; i2 < iN7h; i2++) {
            if (!predicate.invoke(C6475u.zy(bo.x2(all, i2))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final short ltg8(short[] component5) {
        d2ok.m23075h(component5, "$this$component5");
        return tfm.x2(component5, 4);
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final <V> Map<ikck, V> lv5(long[] associateWith, x2<? super ikck, ? extends V> valueSelector) {
        d2ok.m23075h(associateWith, "$this$associateWith");
        d2ok.m23075h(valueSelector, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(fn3e.fn3e(C6140e.m22479p(C6220d.n7h(associateWith)), 16));
        int iN7h = C6220d.n7h(associateWith);
        for (int i2 = 0; i2 < iN7h; i2++) {
            long jX2 = C6220d.x2(associateWith, i2);
            linkedHashMap.put(ikck.zy(jX2), valueSelector.invoke(ikck.zy(jX2)));
        }
        return linkedHashMap;
    }

    @i9jn(markerClass = {ki.class})
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final gyi lv7(int[] reduceOrNull, InterfaceC5979h<? super gyi, ? super gyi, gyi> operation) {
        d2ok.m23075h(reduceOrNull, "$this$reduceOrNull");
        d2ok.m23075h(operation, "operation");
        if (dr.cdj(reduceOrNull)) {
            return null;
        }
        int iX2 = dr.x2(reduceOrNull, 0);
        n5r1 it = new kotlin.ranges.x2(1, C6144h.srpc(reduceOrNull)).iterator();
        while (it.hasNext()) {
            iX2 = operation.invoke(gyi.zy(iX2), gyi.zy(dr.x2(reduceOrNull, it.nextInt()))).a98o();
        }
        return gyi.zy(iX2);
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final List<C6475u> lw(byte[] dropWhile, x2<? super C6475u, Boolean> predicate) {
        d2ok.m23075h(dropWhile, "$this$dropWhile");
        d2ok.m23075h(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int iN7h = bo.n7h(dropWhile);
        boolean z2 = false;
        for (int i2 = 0; i2 < iN7h; i2++) {
            byte bX2 = bo.x2(dropWhile, i2);
            if (z2) {
                arrayList.add(C6475u.zy(bX2));
            } else if (!predicate.invoke(C6475u.zy(bX2)).booleanValue()) {
                arrayList.add(C6475u.zy(bX2));
                z2 = true;
            }
        }
        return arrayList;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final <V> List<V> lx(short[] zip, short[] other, InterfaceC5979h<? super qo, ? super qo, ? extends V> transform) {
        d2ok.m23075h(zip, "$this$zip");
        d2ok.m23075h(other, "other");
        d2ok.m23075h(transform, "transform");
        int iMin = Math.min(tfm.n7h(zip), tfm.n7h(other));
        ArrayList arrayList = new ArrayList(iMin);
        for (int i2 = 0; i2 < iMin; i2++) {
            arrayList.add(transform.invoke(qo.zy(tfm.x2(zip, i2)), qo.zy(tfm.x2(other, i2))));
        }
        return arrayList;
    }

    @InterfaceC7395n
    @yz(version = "1.4")
    @InterfaceC6232i
    public static final gyi lz(@InterfaceC7396q int[] minOrNull) {
        d2ok.m23075h(minOrNull, "$this$minOrNull");
        if (dr.cdj(minOrNull)) {
            return null;
        }
        int iX2 = dr.x2(minOrNull, 0);
        n5r1 it = new kotlin.ranges.x2(1, C6144h.srpc(minOrNull)).iterator();
        while (it.hasNext()) {
            int iX22 = dr.x2(minOrNull, it.nextInt());
            if (Integer.compareUnsigned(iX2, iX22) > 0) {
                iX2 = iX22;
            }
        }
        return gyi.zy(iX2);
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final long lzd(long[] single, x2<? super ikck, Boolean> predicate) {
        d2ok.m23075h(single, "$this$single");
        d2ok.m23075h(predicate, "predicate");
        int iN7h = C6220d.n7h(single);
        ikck ikckVarZy = null;
        boolean z2 = false;
        for (int i2 = 0; i2 < iN7h; i2++) {
            long jX2 = C6220d.x2(single, i2);
            if (predicate.invoke(ikck.zy(jX2)).booleanValue()) {
                if (z2) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                ikckVarZy = ikck.zy(jX2);
                z2 = true;
            }
        }
        if (z2) {
            return ikckVarZy.a98o();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    /* JADX INFO: renamed from: m */
    private static final boolean m22646m(long[] any) {
        d2ok.m23075h(any, "$this$any");
        return C6144h.jre(any);
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final List<qo> m0c6(@InterfaceC7396q short[] slice, @InterfaceC7396q Iterable<Integer> indices) {
        d2ok.m23075h(slice, "$this$slice");
        d2ok.m23075h(indices, "indices");
        int iVyq = fu4.vyq(indices, 10);
        if (iVyq == 0) {
            return ni7.a9();
        }
        ArrayList arrayList = new ArrayList(iVyq);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(qo.zy(tfm.x2(slice, it.next().intValue())));
        }
        return arrayList;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final List<gyi> m1(int[] takeLastWhile, x2<? super gyi, Boolean> predicate) {
        d2ok.m23075h(takeLastWhile, "$this$takeLastWhile");
        d2ok.m23075h(predicate, "predicate");
        for (int iSrpc = C6144h.srpc(takeLastWhile); -1 < iSrpc; iSrpc--) {
            if (!predicate.invoke(gyi.zy(dr.x2(takeLastWhile, iSrpc))).booleanValue()) {
                return ngy(takeLastWhile, iSrpc + 1);
            }
        }
        return a9.wr(dr.toq(takeLastWhile));
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final C6475u m24(byte[] singleOrNull, x2<? super C6475u, Boolean> predicate) {
        d2ok.m23075h(singleOrNull, "$this$singleOrNull");
        d2ok.m23075h(predicate, "predicate");
        int iN7h = bo.n7h(singleOrNull);
        boolean z2 = false;
        C6475u c6475uZy = null;
        for (int i2 = 0; i2 < iN7h; i2++) {
            byte bX2 = bo.x2(singleOrNull, i2);
            if (predicate.invoke(C6475u.zy(bX2)).booleanValue()) {
                if (z2) {
                    return null;
                }
                c6475uZy = C6475u.zy(bX2);
                z2 = true;
            }
        }
        if (z2) {
            return c6475uZy;
        }
        return null;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final <R> R m28(long[] foldRightIndexed, R r2, cdj<? super Integer, ? super ikck, ? super R, ? extends R> operation) {
        d2ok.m23075h(foldRightIndexed, "$this$foldRightIndexed");
        d2ok.m23075h(operation, "operation");
        for (int iHmvj = C6144h.hmvj(foldRightIndexed); iHmvj >= 0; iHmvj--) {
            r2 = operation.invoke(Integer.valueOf(iHmvj), ikck.zy(C6220d.x2(foldRightIndexed, iHmvj)), r2);
        }
        return r2;
    }

    @yz(version = "1.3")
    @InterfaceC6232i
    public static final void m2t(@InterfaceC7396q short[] fill, short s2, int i2, int i3) {
        d2ok.m23075h(fill, "$this$fill");
        kja0.a5id(fill, s2, i2, i3);
    }

    @yz(version = "1.4")
    @InterfaceC6232i
    public static boolean m4(@InterfaceC7395n int[] iArr, @InterfaceC7395n int[] iArr2) {
        if (iArr == null) {
            iArr = null;
        }
        if (iArr2 == null) {
            iArr2 = null;
        }
        return Arrays.equals(iArr, iArr2);
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final Double m4ll(long[] minOfOrNull, x2<? super ikck, Double> selector) {
        d2ok.m23075h(minOfOrNull, "$this$minOfOrNull");
        d2ok.m23075h(selector, "selector");
        if (C6220d.cdj(minOfOrNull)) {
            return null;
        }
        double dDoubleValue = selector.invoke(ikck.zy(C6220d.x2(minOfOrNull, 0))).doubleValue();
        n5r1 it = new kotlin.ranges.x2(1, C6144h.hmvj(minOfOrNull)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, selector.invoke(ikck.zy(C6220d.x2(minOfOrNull, it.nextInt()))).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final short m58i(short[] elementAtOrElse, int i2, x2<? super Integer, qo> defaultValue) {
        d2ok.m23075h(elementAtOrElse, "$this$elementAtOrElse");
        d2ok.m23075h(defaultValue, "defaultValue");
        return (i2 < 0 || i2 > C6144h.orxw(elementAtOrElse)) ? defaultValue.invoke(Integer.valueOf(i2)).bf2() : tfm.x2(elementAtOrElse, i2);
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final <R> List<R> m8(long[] flatMapIndexed, InterfaceC5979h<? super Integer, ? super ikck, ? extends Iterable<? extends R>> transform) {
        d2ok.m23075h(flatMapIndexed, "$this$flatMapIndexed");
        d2ok.m23075h(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int iN7h = C6220d.n7h(flatMapIndexed);
        int i2 = 0;
        int i3 = 0;
        while (i2 < iN7h) {
            C6163t.zp(arrayList, transform.invoke(Integer.valueOf(i3), ikck.zy(C6220d.x2(flatMapIndexed, i2))));
            i2++;
            i3++;
        }
        return arrayList;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final <R, C extends Collection<? super R>> C ma8k(short[] mapIndexedTo, C destination, InterfaceC5979h<? super Integer, ? super qo, ? extends R> transform) {
        d2ok.m23075h(mapIndexedTo, "$this$mapIndexedTo");
        d2ok.m23075h(destination, "destination");
        d2ok.m23075h(transform, "transform");
        int iN7h = tfm.n7h(mapIndexedTo);
        int i2 = 0;
        int i3 = 0;
        while (i2 < iN7h) {
            destination.add(transform.invoke(Integer.valueOf(i3), qo.zy(tfm.x2(mapIndexedTo, i2))));
            i2++;
            i3++;
        }
        return destination;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final long[] mbx(long[] copyOf) {
        d2ok.m23075h(copyOf, "$this$copyOf");
        long[] jArrCopyOf = Arrays.copyOf(copyOf, copyOf.length);
        d2ok.kja0(jArrCopyOf, "copyOf(this, size)");
        return C6220d.m22779g(jArrCopyOf);
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final double mc(int[] minOf, x2<? super gyi, Double> selector) {
        d2ok.m23075h(minOf, "$this$minOf");
        d2ok.m23075h(selector, "selector");
        if (dr.cdj(minOf)) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(gyi.zy(dr.x2(minOf, 0))).doubleValue();
        n5r1 it = new kotlin.ranges.x2(1, C6144h.srpc(minOf)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, selector.invoke(gyi.zy(dr.x2(minOf, it.nextInt()))).doubleValue());
        }
        return dDoubleValue;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final <R> R mete(short[] foldRight, R r2, InterfaceC5979h<? super qo, ? super R, ? extends R> operation) {
        d2ok.m23075h(foldRight, "$this$foldRight");
        d2ok.m23075h(operation, "operation");
        for (int iOrxw = C6144h.orxw(foldRight); iOrxw >= 0; iOrxw--) {
            r2 = operation.invoke(qo.zy(tfm.x2(foldRight, iOrxw)), r2);
        }
        return r2;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final List<ikck> mgf(long[] takeLastWhile, x2<? super ikck, Boolean> predicate) {
        d2ok.m23075h(takeLastWhile, "$this$takeLastWhile");
        d2ok.m23075h(predicate, "predicate");
        for (int iHmvj = C6144h.hmvj(takeLastWhile); -1 < iHmvj; iHmvj--) {
            if (!predicate.invoke(ikck.zy(C6220d.x2(takeLastWhile, iHmvj))).booleanValue()) {
                return lh(takeLastWhile, iHmvj + 1);
            }
        }
        return a9.wr(C6220d.toq(takeLastWhile));
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final int[] mho(int[] plus, int i2) {
        d2ok.m23075h(plus, "$this$plus");
        return dr.m22802g(kja0.kl7m(plus, i2));
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final long mi1u(long[] first, x2<? super ikck, Boolean> predicate) {
        d2ok.m23075h(first, "$this$first");
        d2ok.m23075h(predicate, "predicate");
        int iN7h = C6220d.n7h(first);
        for (int i2 = 0; i2 < iN7h; i2++) {
            long jX2 = C6220d.x2(first, i2);
            if (predicate.invoke(ikck.zy(jX2)).booleanValue()) {
                return jX2;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final gyi mj(int[] find, x2<? super gyi, Boolean> predicate) {
        d2ok.m23075h(find, "$this$find");
        d2ok.m23075h(predicate, "predicate");
        int iN7h = dr.n7h(find);
        for (int i2 = 0; i2 < iN7h; i2++) {
            int iX2 = dr.x2(find, i2);
            if (predicate.invoke(gyi.zy(iX2)).booleanValue()) {
                return gyi.zy(iX2);
            }
        }
        return null;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final byte mjed(byte[] single) {
        d2ok.m23075h(single, "$this$single");
        return C6475u.ld6(C6144h.yzs4(single));
    }

    @InterfaceC7395n
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final gyi mkmm(@InterfaceC7396q int[] lastOrNull) {
        d2ok.m23075h(lastOrNull, "$this$lastOrNull");
        if (dr.cdj(lastOrNull)) {
            return null;
        }
        return gyi.zy(dr.x2(lastOrNull, dr.n7h(lastOrNull) - 1));
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final <R, V> List<V> ml(int[] zip, Iterable<? extends R> other, InterfaceC5979h<? super gyi, ? super R, ? extends V> transform) {
        d2ok.m23075h(zip, "$this$zip");
        d2ok.m23075h(other, "other");
        d2ok.m23075h(transform, "transform");
        int iN7h = dr.n7h(zip);
        ArrayList arrayList = new ArrayList(Math.min(fu4.vyq(other, 10), iN7h));
        int i2 = 0;
        for (R r2 : other) {
            if (i2 >= iN7h) {
                break;
            }
            arrayList.add(transform.invoke(gyi.zy(dr.x2(zip, i2)), r2));
            i2++;
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final <K, V, M extends Map<? super K, List<V>>> M mla(long[] groupByTo, M destination, x2<? super ikck, ? extends K> keySelector, x2<? super ikck, ? extends V> valueTransform) {
        d2ok.m23075h(groupByTo, "$this$groupByTo");
        d2ok.m23075h(destination, "destination");
        d2ok.m23075h(keySelector, "keySelector");
        d2ok.m23075h(valueTransform, "valueTransform");
        int iN7h = C6220d.n7h(groupByTo);
        for (int i2 = 0; i2 < iN7h; i2++) {
            long jX2 = C6220d.x2(groupByTo, i2);
            K kInvoke = keySelector.invoke(ikck.zy(jX2));
            Object arrayList = destination.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(valueTransform.invoke(ikck.zy(jX2)));
        }
        return destination;
    }

    @yz(version = "1.4")
    @InterfaceC6232i
    public static final void mle(@InterfaceC7396q byte[] sortDescending, int i2, int i3) {
        d2ok.m23075h(sortDescending, "$this$sortDescending");
        c4my(sortDescending, i2, i3);
        C6144h.vx(sortDescending, i2, i3);
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final <R> R mn(long[] minOfWithOrNull, Comparator<? super R> comparator, x2<? super ikck, ? extends R> selector) {
        d2ok.m23075h(minOfWithOrNull, "$this$minOfWithOrNull");
        d2ok.m23075h(comparator, "comparator");
        d2ok.m23075h(selector, "selector");
        if (C6220d.cdj(minOfWithOrNull)) {
            return null;
        }
        R rInvoke = selector.invoke(ikck.zy(C6220d.x2(minOfWithOrNull, 0)));
        n5r1 it = new kotlin.ranges.x2(1, C6144h.hmvj(minOfWithOrNull)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(ikck.zy(C6220d.x2(minOfWithOrNull, it.nextInt())));
            if (comparator.compare(rInvoke, rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final List<ikck> mpzf(@InterfaceC7396q long[] slice, @InterfaceC7396q Iterable<Integer> indices) {
        d2ok.m23075h(slice, "$this$slice");
        d2ok.m23075h(indices, "indices");
        int iVyq = fu4.vyq(indices, 10);
        if (iVyq == 0) {
            return ni7.a9();
        }
        ArrayList arrayList = new ArrayList(iVyq);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(ikck.zy(C6220d.x2(slice, it.next().intValue())));
        }
        return arrayList;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final gyi mq(int[] lastOrNull, x2<? super gyi, Boolean> predicate) {
        d2ok.m23075h(lastOrNull, "$this$lastOrNull");
        d2ok.m23075h(predicate, "predicate");
        int iN7h = dr.n7h(lastOrNull) - 1;
        if (iN7h < 0) {
            return null;
        }
        while (true) {
            int i2 = iN7h - 1;
            int iX2 = dr.x2(lastOrNull, iN7h);
            if (predicate.invoke(gyi.zy(iX2)).booleanValue()) {
                return gyi.zy(iX2);
            }
            if (i2 < 0) {
                return null;
            }
            iN7h = i2;
        }
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final <R> R mqs(short[] minOfWith, Comparator<? super R> comparator, x2<? super qo, ? extends R> selector) {
        d2ok.m23075h(minOfWith, "$this$minOfWith");
        d2ok.m23075h(comparator, "comparator");
        d2ok.m23075h(selector, "selector");
        if (tfm.cdj(minOfWith)) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(qo.zy(tfm.x2(minOfWith, 0)));
        n5r1 it = new kotlin.ranges.x2(1, C6144h.orxw(minOfWith)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(qo.zy(tfm.x2(minOfWith, it.nextInt())));
            if (comparator.compare(rInvoke, rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC7395n
    @yz(version = "1.4")
    @InterfaceC6232i
    public static final gyi mru(@InterfaceC7396q int[] minWithOrNull, @InterfaceC7396q Comparator<? super gyi> comparator) {
        d2ok.m23075h(minWithOrNull, "$this$minWithOrNull");
        d2ok.m23075h(comparator, "comparator");
        if (dr.cdj(minWithOrNull)) {
            return null;
        }
        int iX2 = dr.x2(minWithOrNull, 0);
        n5r1 it = new kotlin.ranges.x2(1, C6144h.srpc(minWithOrNull)).iterator();
        while (it.hasNext()) {
            int iX22 = dr.x2(minWithOrNull, it.nextInt());
            if (comparator.compare(gyi.zy(iX2), gyi.zy(iX22)) > 0) {
                iX2 = iX22;
            }
        }
        return gyi.zy(iX2);
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final short[] ms(@InterfaceC7396q short[] sliceArray, @InterfaceC7396q Collection<Integer> indices) {
        d2ok.m23075h(sliceArray, "$this$sliceArray");
        d2ok.m23075h(indices, "indices");
        return tfm.m23651g(C6144h.io(sliceArray, indices));
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final byte mu(byte[] component2) {
        d2ok.m23075h(component2, "$this$component2");
        return bo.x2(component2, 1);
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final <R, C extends Collection<? super R>> C mub(byte[] flatMapTo, C destination, x2<? super C6475u, ? extends Iterable<? extends R>> transform) {
        d2ok.m23075h(flatMapTo, "$this$flatMapTo");
        d2ok.m23075h(destination, "destination");
        d2ok.m23075h(transform, "transform");
        int iN7h = bo.n7h(flatMapTo);
        for (int i2 = 0; i2 < iN7h; i2++) {
            C6163t.zp(destination, transform.invoke(C6475u.zy(bo.x2(flatMapTo, i2))));
        }
        return destination;
    }

    @yz(version = "1.7")
    @InterfaceC6769y(name = "minWithOrThrow-U")
    @InterfaceC6232i
    public static final long mv(@InterfaceC7396q long[] minWith, @InterfaceC7396q Comparator<? super ikck> comparator) {
        d2ok.m23075h(minWith, "$this$minWith");
        d2ok.m23075h(comparator, "comparator");
        if (C6220d.cdj(minWith)) {
            throw new NoSuchElementException();
        }
        long jX2 = C6220d.x2(minWith, 0);
        n5r1 it = new kotlin.ranges.x2(1, C6144h.hmvj(minWith)).iterator();
        while (it.hasNext()) {
            long jX22 = C6220d.x2(minWith, it.nextInt());
            if (comparator.compare(ikck.zy(jX2), ikck.zy(jX22)) > 0) {
                jX2 = jX22;
            }
        }
        return jX2;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final void mwo2(int[] reverse) {
        d2ok.m23075h(reverse, "$this$reverse");
        C6144h.q9e(reverse);
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final <R> List<C6227f<ikck, R>> mwxf(@InterfaceC7396q long[] zip, @InterfaceC7396q Iterable<? extends R> other) {
        d2ok.m23075h(zip, "$this$zip");
        d2ok.m23075h(other, "other");
        int iN7h = C6220d.n7h(zip);
        ArrayList arrayList = new ArrayList(Math.min(fu4.vyq(other, 10), iN7h));
        int i2 = 0;
        for (R r2 : other) {
            if (i2 >= iN7h) {
                break;
            }
            arrayList.add(nmn5.m23230k(ikck.zy(C6220d.x2(zip, i2)), r2));
            i2++;
        }
        return arrayList;
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final <R extends Comparable<? super R>> qo mxh(short[] maxByOrNull, x2<? super qo, ? extends R> selector) {
        d2ok.m23075h(maxByOrNull, "$this$maxByOrNull");
        d2ok.m23075h(selector, "selector");
        if (tfm.cdj(maxByOrNull)) {
            return null;
        }
        short sX2 = tfm.x2(maxByOrNull, 0);
        int iOrxw = C6144h.orxw(maxByOrNull);
        if (iOrxw == 0) {
            return qo.zy(sX2);
        }
        R rInvoke = selector.invoke(qo.zy(sX2));
        n5r1 it = new kotlin.ranges.x2(1, iOrxw).iterator();
        while (it.hasNext()) {
            short sX22 = tfm.x2(maxByOrNull, it.nextInt());
            R rInvoke2 = selector.invoke(qo.zy(sX22));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                sX2 = sX22;
                rInvoke = rInvoke2;
            }
        }
        return qo.zy(sX2);
    }

    @i9jn(markerClass = {ki.class})
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final C6475u mzno(byte[] reduceRightOrNull, InterfaceC5979h<? super C6475u, ? super C6475u, C6475u> operation) {
        d2ok.m23075h(reduceRightOrNull, "$this$reduceRightOrNull");
        d2ok.m23075h(operation, "operation");
        int iVl = C6144h.vl(reduceRightOrNull);
        if (iVl < 0) {
            return null;
        }
        byte bX2 = bo.x2(reduceRightOrNull, iVl);
        for (int i2 = iVl - 1; i2 >= 0; i2--) {
            bX2 = operation.invoke(C6475u.zy(bo.x2(reduceRightOrNull, i2)), C6475u.zy(bX2)).bf2();
        }
        return C6475u.zy(bX2);
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final void n2mu(short[] reverse) {
        d2ok.m23075h(reverse, "$this$reverse");
        C6144h.tgj1(reverse);
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final List<C6475u> n2t(@InterfaceC7396q byte[] drop, int i2) {
        d2ok.m23075h(drop, "$this$drop");
        if (i2 >= 0) {
            return p2(drop, fn3e.fn3e(bo.n7h(drop) - i2, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final Float n358(short[] minOfOrNull, x2<? super qo, Float> selector) {
        d2ok.m23075h(minOfOrNull, "$this$minOfOrNull");
        d2ok.m23075h(selector, "selector");
        if (tfm.cdj(minOfOrNull)) {
            return null;
        }
        float fFloatValue = selector.invoke(qo.zy(tfm.x2(minOfOrNull, 0))).floatValue();
        n5r1 it = new kotlin.ranges.x2(1, C6144h.orxw(minOfOrNull)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, selector.invoke(qo.zy(tfm.x2(minOfOrNull, it.nextInt()))).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final byte[] n4kc(@InterfaceC7396q byte[] sliceArray, @InterfaceC7396q kotlin.ranges.x2 indices) {
        d2ok.m23075h(sliceArray, "$this$sliceArray");
        d2ok.m23075h(indices, "indices");
        return bo.m22412g(C6144h.vaso(sliceArray, indices));
    }

    @yz(version = "1.3")
    @InterfaceC6232i
    public static final void n6(@InterfaceC7396q byte[] sortDescending) {
        d2ok.m23075h(sortDescending, "$this$sortDescending");
        if (bo.n7h(sortDescending) > 1) {
            os3j(sortDescending);
            C6144h.lo(sortDescending);
        }
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final int[] n8(@InterfaceC7396q int[] sliceArray, @InterfaceC7396q kotlin.ranges.x2 indices) {
        d2ok.m23075h(sliceArray, "$this$sliceArray");
        d2ok.m23075h(indices, "indices");
        return dr.m22802g(C6144h.gle(sliceArray, indices));
    }

    @i9jn(markerClass = {ki.class})
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final qo n9(short[] reduceRightOrNull, InterfaceC5979h<? super qo, ? super qo, qo> operation) {
        d2ok.m23075h(reduceRightOrNull, "$this$reduceRightOrNull");
        d2ok.m23075h(operation, "operation");
        int iOrxw = C6144h.orxw(reduceRightOrNull);
        if (iOrxw < 0) {
            return null;
        }
        short sX2 = tfm.x2(reduceRightOrNull, iOrxw);
        for (int i2 = iOrxw - 1; i2 >= 0; i2--) {
            sX2 = operation.invoke(qo.zy(tfm.x2(reduceRightOrNull, i2)), qo.zy(sX2)).bf2();
        }
        return qo.zy(sX2);
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final void nc(long[] forEach, x2<? super ikck, was> action) {
        d2ok.m23075h(forEach, "$this$forEach");
        d2ok.m23075h(action, "action");
        int iN7h = C6220d.n7h(forEach);
        for (int i2 = 0; i2 < iN7h; i2++) {
            action.invoke(ikck.zy(C6220d.x2(forEach, i2)));
        }
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final long nd(long[] reduceIndexed, cdj<? super Integer, ? super ikck, ? super ikck, ikck> operation) {
        d2ok.m23075h(reduceIndexed, "$this$reduceIndexed");
        d2ok.m23075h(operation, "operation");
        if (C6220d.cdj(reduceIndexed)) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        long jX2 = C6220d.x2(reduceIndexed, 0);
        n5r1 it = new kotlin.ranges.x2(1, C6144h.hmvj(reduceIndexed)).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            jX2 = operation.invoke(Integer.valueOf(iNextInt), ikck.zy(jX2), ikck.zy(C6220d.x2(reduceIndexed, iNextInt))).a98o();
        }
        return jX2;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final boolean ngvg(byte[] none, x2<? super C6475u, Boolean> predicate) {
        d2ok.m23075h(none, "$this$none");
        d2ok.m23075h(predicate, "predicate");
        int iN7h = bo.n7h(none);
        for (int i2 = 0; i2 < iN7h; i2++) {
            if (predicate.invoke(C6475u.zy(bo.x2(none, i2))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final List<gyi> ngy(@InterfaceC7396q int[] drop, int i2) {
        d2ok.m23075h(drop, "$this$drop");
        if (i2 >= 0) {
            return as(drop, fn3e.fn3e(dr.n7h(drop) - i2, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
    }

    @yz(version = "1.7")
    @InterfaceC6769y(name = "minOrThrow-U")
    @InterfaceC6232i
    public static final short nm(@InterfaceC7396q short[] min) {
        d2ok.m23075h(min, "$this$min");
        if (tfm.cdj(min)) {
            throw new NoSuchElementException();
        }
        short sX2 = tfm.x2(min, 0);
        n5r1 it = new kotlin.ranges.x2(1, C6144h.orxw(min)).iterator();
        while (it.hasNext()) {
            short sX22 = tfm.x2(min, it.nextInt());
            if (d2ok.m23076i(sX2 & qo.f36486g, 65535 & sX22) > 0) {
                sX2 = sX22;
            }
        }
        return sX2;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final C6475u nme(byte[] elementAtOrNull, int i2) {
        d2ok.m23075h(elementAtOrNull, "$this$elementAtOrNull");
        return zah1(elementAtOrNull, i2);
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final <V> Map<C6475u, V> nmn5(byte[] associateWith, x2<? super C6475u, ? extends V> valueSelector) {
        d2ok.m23075h(associateWith, "$this$associateWith");
        d2ok.m23075h(valueSelector, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(fn3e.fn3e(C6140e.m22479p(bo.n7h(associateWith)), 16));
        int iN7h = bo.n7h(associateWith);
        for (int i2 = 0; i2 < iN7h; i2++) {
            byte bX2 = bo.x2(associateWith, i2);
            linkedHashMap.put(C6475u.zy(bX2), valueSelector.invoke(C6475u.zy(bX2)));
        }
        return linkedHashMap;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final boolean nn86(int[] any) {
        d2ok.m23075h(any, "$this$any");
        return C6144h.wh(any);
    }

    public static /* synthetic */ void nnh(byte[] bArr, byte b2, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = bo.n7h(bArr);
        }
        ra(bArr, b2, i2, i3);
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final void nod(int[] forEachIndexed, InterfaceC5979h<? super Integer, ? super gyi, was> action) {
        d2ok.m23075h(forEachIndexed, "$this$forEachIndexed");
        d2ok.m23075h(action, "action");
        int iN7h = dr.n7h(forEachIndexed);
        int i2 = 0;
        int i3 = 0;
        while (i2 < iN7h) {
            action.invoke(Integer.valueOf(i3), gyi.zy(dr.x2(forEachIndexed, i2)));
            i2++;
            i3++;
        }
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final long[] nr0(long[] plus, long[] elements) {
        d2ok.m23075h(plus, "$this$plus");
        d2ok.m23075h(elements, "elements");
        return C6220d.m22779g(kja0.fh(plus, elements));
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final long[] nrcs(long[] onEach, x2<? super ikck, was> action) {
        d2ok.m23075h(onEach, "$this$onEach");
        d2ok.m23075h(action, "action");
        int iN7h = C6220d.n7h(onEach);
        for (int i2 = 0; i2 < iN7h; i2++) {
            action.invoke(ikck.zy(C6220d.x2(onEach, i2)));
        }
        return onEach;
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final int[] nrys(@InterfaceC7396q int[] plus, @InterfaceC7396q Collection<gyi> elements) {
        d2ok.m23075h(plus, "$this$plus");
        d2ok.m23075h(elements, "elements");
        int iN7h = dr.n7h(plus);
        int[] iArrCopyOf = Arrays.copyOf(plus, dr.n7h(plus) + elements.size());
        d2ok.kja0(iArrCopyOf, "copyOf(this, newSize)");
        Iterator<gyi> it = elements.iterator();
        while (it.hasNext()) {
            iArrCopyOf[iN7h] = it.next().a98o();
            iN7h++;
        }
        return dr.m22802g(iArrCopyOf);
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final int nsb(int[] count, x2<? super gyi, Boolean> predicate) {
        d2ok.m23075h(count, "$this$count");
        d2ok.m23075h(predicate, "predicate");
        int iN7h = dr.n7h(count);
        int i2 = 0;
        for (int i3 = 0; i3 < iN7h; i3++) {
            if (predicate.invoke(gyi.zy(dr.x2(count, i3))).booleanValue()) {
                i2++;
            }
        }
        return i2;
    }

    @InterfaceC7395n
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final qo nyj(@InterfaceC7396q short[] firstOrNull) {
        d2ok.m23075h(firstOrNull, "$this$firstOrNull");
        if (tfm.cdj(firstOrNull)) {
            return null;
        }
        return qo.zy(tfm.x2(firstOrNull, 0));
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final <R, V> List<V> nz77(int[] zip, R[] other, InterfaceC5979h<? super gyi, ? super R, ? extends V> transform) {
        d2ok.m23075h(zip, "$this$zip");
        d2ok.m23075h(other, "other");
        d2ok.m23075h(transform, "transform");
        int iMin = Math.min(dr.n7h(zip), other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i2 = 0; i2 < iMin; i2++) {
            arrayList.add(transform.invoke(gyi.zy(dr.x2(zip, i2)), other[i2]));
        }
        return arrayList;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    /* JADX INFO: renamed from: o */
    private static final boolean m22647o(long[] any, x2<? super ikck, Boolean> predicate) {
        d2ok.m23075h(any, "$this$any");
        d2ok.m23075h(predicate, "predicate");
        int iN7h = C6220d.n7h(any);
        for (int i2 = 0; i2 < iN7h; i2++) {
            if (predicate.invoke(ikck.zy(C6220d.x2(any, i2))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final List<qo> o05(short[] dropWhile, x2<? super qo, Boolean> predicate) {
        d2ok.m23075h(dropWhile, "$this$dropWhile");
        d2ok.m23075h(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int iN7h = tfm.n7h(dropWhile);
        boolean z2 = false;
        for (int i2 = 0; i2 < iN7h; i2++) {
            short sX2 = tfm.x2(dropWhile, i2);
            if (z2) {
                arrayList.add(qo.zy(sX2));
            } else if (!predicate.invoke(qo.zy(sX2)).booleanValue()) {
                arrayList.add(qo.zy(sX2));
                z2 = true;
            }
        }
        return arrayList;
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final void o2(long[] reverse, int i2, int i3) {
        d2ok.m23075h(reverse, "$this$reverse");
        C6144h.aiyx(reverse, i2, i3);
    }

    @yz(version = "1.3")
    @InterfaceC6232i
    public static final void o3(@InterfaceC7396q long[] sortDescending) {
        d2ok.m23075h(sortDescending, "$this$sortDescending");
        if (C6220d.n7h(sortDescending) > 1) {
            ca(sortDescending);
            C6144h.sxq(sortDescending);
        }
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @hyr
    @InterfaceC6234g
    @yz(version = "1.5")
    @InterfaceC6769y(name = "sumOfULong")
    @InterfaceC6232i
    private static final long o4(long[] sumOf, x2<? super ikck, ikck> selector) {
        d2ok.m23075h(sumOf, "$this$sumOf");
        d2ok.m23075h(selector, "selector");
        long jLd6 = ikck.ld6(0L);
        int iN7h = C6220d.n7h(sumOf);
        for (int i2 = 0; i2 < iN7h; i2++) {
            jLd6 = ikck.ld6(jLd6 + selector.invoke(ikck.zy(C6220d.x2(sumOf, i2))).a98o());
        }
        return jLd6;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final List<gyi> o5(int[] filterIndexed, InterfaceC5979h<? super Integer, ? super gyi, Boolean> predicate) {
        d2ok.m23075h(filterIndexed, "$this$filterIndexed");
        d2ok.m23075h(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int iN7h = dr.n7h(filterIndexed);
        int i2 = 0;
        int i3 = 0;
        while (i2 < iN7h) {
            int iX2 = dr.x2(filterIndexed, i2);
            int i4 = i3 + 1;
            if (predicate.invoke(Integer.valueOf(i3), gyi.zy(iX2)).booleanValue()) {
                arrayList.add(gyi.zy(iX2));
            }
            i2++;
            i3 = i4;
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final kotlin.ranges.x2 oaex(@InterfaceC7396q short[] indices) {
        d2ok.m23075h(indices, "$this$indices");
        return C6144h.ueix(indices);
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final <C extends Collection<? super ikck>> C ob(long[] filterTo, C destination, x2<? super ikck, Boolean> predicate) {
        d2ok.m23075h(filterTo, "$this$filterTo");
        d2ok.m23075h(destination, "destination");
        d2ok.m23075h(predicate, "predicate");
        int iN7h = C6220d.n7h(filterTo);
        for (int i2 = 0; i2 < iN7h; i2++) {
            long jX2 = C6220d.x2(filterTo, i2);
            if (predicate.invoke(ikck.zy(jX2)).booleanValue()) {
                destination.add(ikck.zy(jX2));
            }
        }
        return destination;
    }

    @InterfaceC7395n
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final gyi oei(@InterfaceC7396q int[] getOrNull, int i2) {
        d2ok.m23075h(getOrNull, "$this$getOrNull");
        if (i2 < 0 || i2 > C6144h.srpc(getOrNull)) {
            return null;
        }
        return gyi.zy(dr.x2(getOrNull, i2));
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final <V> List<V> oj(long[] zip, long[] other, InterfaceC5979h<? super ikck, ? super ikck, ? extends V> transform) {
        d2ok.m23075h(zip, "$this$zip");
        d2ok.m23075h(other, "other");
        d2ok.m23075h(transform, "transform");
        int iMin = Math.min(C6220d.n7h(zip), C6220d.n7h(other));
        ArrayList arrayList = new ArrayList(iMin);
        for (int i2 = 0; i2 < iMin; i2++) {
            arrayList.add(transform.invoke(ikck.zy(C6220d.x2(zip, i2)), ikck.zy(C6220d.x2(other, i2))));
        }
        return arrayList;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final List<gyi> oki(int[] dropWhile, x2<? super gyi, Boolean> predicate) {
        d2ok.m23075h(dropWhile, "$this$dropWhile");
        d2ok.m23075h(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int iN7h = dr.n7h(dropWhile);
        boolean z2 = false;
        for (int i2 = 0; i2 < iN7h; i2++) {
            int iX2 = dr.x2(dropWhile, i2);
            if (z2) {
                arrayList.add(gyi.zy(iX2));
            } else if (!predicate.invoke(gyi.zy(iX2)).booleanValue()) {
                arrayList.add(gyi.zy(iX2));
                z2 = true;
            }
        }
        return arrayList;
    }

    @InterfaceC7395n
    @yz(version = "1.4")
    @InterfaceC6232i
    public static final gyi olj(@InterfaceC7396q int[] maxWithOrNull, @InterfaceC7396q Comparator<? super gyi> comparator) {
        d2ok.m23075h(maxWithOrNull, "$this$maxWithOrNull");
        d2ok.m23075h(comparator, "comparator");
        if (dr.cdj(maxWithOrNull)) {
            return null;
        }
        int iX2 = dr.x2(maxWithOrNull, 0);
        n5r1 it = new kotlin.ranges.x2(1, C6144h.srpc(maxWithOrNull)).iterator();
        while (it.hasNext()) {
            int iX22 = dr.x2(maxWithOrNull, it.nextInt());
            if (comparator.compare(gyi.zy(iX2), gyi.zy(iX22)) < 0) {
                iX2 = iX22;
            }
        }
        return gyi.zy(iX2);
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final <R, C extends Collection<? super R>> C oph(short[] flatMapTo, C destination, x2<? super qo, ? extends Iterable<? extends R>> transform) {
        d2ok.m23075h(flatMapTo, "$this$flatMapTo");
        d2ok.m23075h(destination, "destination");
        d2ok.m23075h(transform, "transform");
        int iN7h = tfm.n7h(flatMapTo);
        for (int i2 = 0; i2 < iN7h; i2++) {
            C6163t.zp(destination, transform.invoke(qo.zy(tfm.x2(flatMapTo, i2))));
        }
        return destination;
    }

    @kotlin.x2(warningSince = "1.5")
    @InterfaceC6234g
    @ld6(message = "Use sumOf instead.", replaceWith = @hb(expression = "this.sumOf(selector)", imports = {}))
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final double oqy(int[] sumByDouble, x2<? super gyi, Double> selector) {
        d2ok.m23075h(sumByDouble, "$this$sumByDouble");
        d2ok.m23075h(selector, "selector");
        int iN7h = dr.n7h(sumByDouble);
        double dDoubleValue = 0.0d;
        for (int i2 = 0; i2 < iN7h; i2++) {
            dDoubleValue += selector.invoke(gyi.zy(dr.x2(sumByDouble, i2))).doubleValue();
        }
        return dDoubleValue;
    }

    @yz(version = "1.3")
    @InterfaceC6232i
    public static final void os3j(@InterfaceC7396q byte[] sort) {
        d2ok.m23075h(sort, "$this$sort");
        if (bo.n7h(sort) > 1) {
            kotlin.collections.lv5.m22556p(sort, 0, bo.n7h(sort));
        }
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final C6475u ovdh(byte[] findLast, x2<? super C6475u, Boolean> predicate) {
        d2ok.m23075h(findLast, "$this$findLast");
        d2ok.m23075h(predicate, "predicate");
        int iN7h = bo.n7h(findLast) - 1;
        if (iN7h >= 0) {
            while (true) {
                int i2 = iN7h - 1;
                byte bX2 = bo.x2(findLast, iN7h);
                if (predicate.invoke(C6475u.zy(bX2)).booleanValue()) {
                    return C6475u.zy(bX2);
                }
                if (i2 < 0) {
                    break;
                }
                iN7h = i2;
            }
        }
        return null;
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final C6475u[] ow(@InterfaceC7396q byte[] toTypedArray) {
        d2ok.m23075h(toTypedArray, "$this$toTypedArray");
        int iN7h = bo.n7h(toTypedArray);
        C6475u[] c6475uArr = new C6475u[iN7h];
        for (int i2 = 0; i2 < iN7h; i2++) {
            c6475uArr[i2] = C6475u.zy(bo.x2(toTypedArray, i2));
        }
        return c6475uArr;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final <K, V> Map<K, List<V>> owi(long[] groupBy, x2<? super ikck, ? extends K> keySelector, x2<? super ikck, ? extends V> valueTransform) {
        d2ok.m23075h(groupBy, "$this$groupBy");
        d2ok.m23075h(keySelector, "keySelector");
        d2ok.m23075h(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int iN7h = C6220d.n7h(groupBy);
        for (int i2 = 0; i2 < iN7h; i2++) {
            long jX2 = C6220d.x2(groupBy, i2);
            K kInvoke = keySelector.invoke(ikck.zy(jX2));
            List<V> arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(kInvoke, arrayList);
            }
            arrayList.add(valueTransform.invoke(ikck.zy(jX2)));
        }
        return linkedHashMap;
    }

    @i9jn(markerClass = {ki.class})
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final ikck ox6n(long[] reduceOrNull, InterfaceC5979h<? super ikck, ? super ikck, ikck> operation) {
        d2ok.m23075h(reduceOrNull, "$this$reduceOrNull");
        d2ok.m23075h(operation, "operation");
        if (C6220d.cdj(reduceOrNull)) {
            return null;
        }
        long jX2 = C6220d.x2(reduceOrNull, 0);
        n5r1 it = new kotlin.ranges.x2(1, C6144h.hmvj(reduceOrNull)).iterator();
        while (it.hasNext()) {
            jX2 = operation.invoke(ikck.zy(jX2), ikck.zy(C6220d.x2(reduceOrNull, it.nextInt()))).a98o();
        }
        return ikck.zy(jX2);
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final short[] ozfn(@InterfaceC7396q qo[] qoVarArr) {
        d2ok.m23075h(qoVarArr, "<this>");
        int length = qoVarArr.length;
        short[] sArr = new short[length];
        for (int i2 = 0; i2 < length; i2++) {
            sArr[i2] = qoVarArr[i2].bf2();
        }
        return tfm.m23651g(sArr);
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final <R> R p1t5(byte[] minOfWithOrNull, Comparator<? super R> comparator, x2<? super C6475u, ? extends R> selector) {
        d2ok.m23075h(minOfWithOrNull, "$this$minOfWithOrNull");
        d2ok.m23075h(comparator, "comparator");
        d2ok.m23075h(selector, "selector");
        if (bo.cdj(minOfWithOrNull)) {
            return null;
        }
        R rInvoke = selector.invoke(C6475u.zy(bo.x2(minOfWithOrNull, 0)));
        n5r1 it = new kotlin.ranges.x2(1, C6144h.vl(minOfWithOrNull)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(C6475u.zy(bo.x2(minOfWithOrNull, it.nextInt())));
            if (comparator.compare(rInvoke, rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final List<C6475u> p2(@InterfaceC7396q byte[] takeLast, int i2) {
        d2ok.m23075h(takeLast, "$this$takeLast");
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
        }
        if (i2 == 0) {
            return ni7.a9();
        }
        int iN7h = bo.n7h(takeLast);
        if (i2 >= iN7h) {
            return a9.wr(bo.toq(takeLast));
        }
        if (i2 == 1) {
            return zurt.ld6(C6475u.zy(bo.x2(takeLast, iN7h - 1)));
        }
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = iN7h - i2; i3 < iN7h; i3++) {
            arrayList.add(C6475u.zy(bo.x2(takeLast, i3)));
        }
        return arrayList;
    }

    @yz(version = "1.3")
    @InterfaceC6232i
    public static final byte p2sg(@InterfaceC7396q byte[] random, @InterfaceC7396q AbstractC6332g random2) {
        d2ok.m23075h(random, "$this$random");
        d2ok.m23075h(random2, "random");
        if (bo.cdj(random)) {
            throw new NoSuchElementException("Array is empty.");
        }
        return bo.x2(random, random2.nextInt(bo.n7h(random)));
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final <R> List<R> p6(long[] mapIndexed, InterfaceC5979h<? super Integer, ? super ikck, ? extends R> transform) {
        d2ok.m23075h(mapIndexed, "$this$mapIndexed");
        d2ok.m23075h(transform, "transform");
        ArrayList arrayList = new ArrayList(C6220d.n7h(mapIndexed));
        int iN7h = C6220d.n7h(mapIndexed);
        int i2 = 0;
        int i3 = 0;
        while (i2 < iN7h) {
            arrayList.add(transform.invoke(Integer.valueOf(i3), ikck.zy(C6220d.x2(mapIndexed, i2))));
            i2++;
            i3++;
        }
        return arrayList;
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final double p68f(short[] minOf, x2<? super qo, Double> selector) {
        d2ok.m23075h(minOf, "$this$minOf");
        d2ok.m23075h(selector, "selector");
        if (tfm.cdj(minOf)) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(qo.zy(tfm.x2(minOf, 0))).doubleValue();
        n5r1 it = new kotlin.ranges.x2(1, C6144h.orxw(minOf)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, selector.invoke(qo.zy(tfm.x2(minOf, it.nextInt()))).doubleValue());
        }
        return dDoubleValue;
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final int[] p9(@InterfaceC7396q int[] sliceArray, @InterfaceC7396q Collection<Integer> indices) {
        d2ok.m23075h(sliceArray, "$this$sliceArray");
        d2ok.m23075h(indices, "indices");
        return dr.m22802g(C6144h.b03g(sliceArray, indices));
    }

    @InterfaceC6234g
    @yz(version = "1.7")
    @InterfaceC6769y(name = "maxByOrThrow-U")
    @InterfaceC6232i
    private static final <R extends Comparable<? super R>> byte p996(byte[] maxBy, x2<? super C6475u, ? extends R> selector) {
        d2ok.m23075h(maxBy, "$this$maxBy");
        d2ok.m23075h(selector, "selector");
        if (bo.cdj(maxBy)) {
            throw new NoSuchElementException();
        }
        byte bX2 = bo.x2(maxBy, 0);
        int iVl = C6144h.vl(maxBy);
        if (iVl == 0) {
            return bX2;
        }
        R rInvoke = selector.invoke(C6475u.zy(bX2));
        n5r1 it = new kotlin.ranges.x2(1, iVl).iterator();
        while (it.hasNext()) {
            byte bX22 = bo.x2(maxBy, it.nextInt());
            R rInvoke2 = selector.invoke(C6475u.zy(bX22));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                bX2 = bX22;
                rInvoke = rInvoke2;
            }
        }
        return bX2;
    }

    @i9jn(markerClass = {ki.class})
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final qo pb(short[] reduceOrNull, InterfaceC5979h<? super qo, ? super qo, qo> operation) {
        d2ok.m23075h(reduceOrNull, "$this$reduceOrNull");
        d2ok.m23075h(operation, "operation");
        if (tfm.cdj(reduceOrNull)) {
            return null;
        }
        short sX2 = tfm.x2(reduceOrNull, 0);
        n5r1 it = new kotlin.ranges.x2(1, C6144h.orxw(reduceOrNull)).iterator();
        while (it.hasNext()) {
            sX2 = operation.invoke(qo.zy(sX2), qo.zy(tfm.x2(reduceOrNull, it.nextInt()))).bf2();
        }
        return qo.zy(sX2);
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final int pc(byte[] count, x2<? super C6475u, Boolean> predicate) {
        d2ok.m23075h(count, "$this$count");
        d2ok.m23075h(predicate, "predicate");
        int iN7h = bo.n7h(count);
        int i2 = 0;
        for (int i3 = 0; i3 < iN7h; i3++) {
            if (predicate.invoke(C6475u.zy(bo.x2(count, i3))).booleanValue()) {
                i2++;
            }
        }
        return i2;
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final List<gyi> pd(@InterfaceC7396q int[] take, int i2) {
        d2ok.m23075h(take, "$this$take");
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
        }
        if (i2 == 0) {
            return ni7.a9();
        }
        if (i2 >= dr.n7h(take)) {
            return a9.wr(dr.toq(take));
        }
        if (i2 == 1) {
            return zurt.ld6(gyi.zy(dr.x2(take, 0)));
        }
        ArrayList arrayList = new ArrayList(i2);
        int iN7h = dr.n7h(take);
        int i3 = 0;
        for (int i4 = 0; i4 < iN7h; i4++) {
            arrayList.add(gyi.zy(dr.x2(take, i4)));
            i3++;
            if (i3 == i2) {
                break;
            }
        }
        return arrayList;
    }

    @yz(version = "1.4")
    @InterfaceC6232i
    public static final void peir(@InterfaceC7396q long[] sortDescending, int i2, int i3) {
        d2ok.m23075h(sortDescending, "$this$sortDescending");
        iroj(sortDescending, i2, i3);
        C6144h.aiyx(sortDescending, i2, i3);
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final <R, V> List<V> pf98(short[] zip, Iterable<? extends R> other, InterfaceC5979h<? super qo, ? super R, ? extends V> transform) {
        d2ok.m23075h(zip, "$this$zip");
        d2ok.m23075h(other, "other");
        d2ok.m23075h(transform, "transform");
        int iN7h = tfm.n7h(zip);
        ArrayList arrayList = new ArrayList(Math.min(fu4.vyq(other, 10), iN7h));
        int i2 = 0;
        for (R r2 : other) {
            if (i2 >= iN7h) {
                break;
            }
            arrayList.add(transform.invoke(qo.zy(tfm.x2(zip, i2)), r2));
            i2++;
        }
        return arrayList;
    }

    @yz(version = "1.3")
    @InterfaceC6232i
    public static final long pgi(@InterfaceC7396q long[] random, @InterfaceC7396q AbstractC6332g random2) {
        d2ok.m23075h(random, "$this$random");
        d2ok.m23075h(random2, "random");
        if (C6220d.cdj(random)) {
            throw new NoSuchElementException("Array is empty.");
        }
        return C6220d.x2(random, random2.nextInt(C6220d.n7h(random)));
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final short ph5d(short[] random) {
        d2ok.m23075h(random, "$this$random");
        return x0c(random, AbstractC6332g.Default);
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final <R extends Comparable<? super R>> ikck pi(long[] maxByOrNull, x2<? super ikck, ? extends R> selector) {
        d2ok.m23075h(maxByOrNull, "$this$maxByOrNull");
        d2ok.m23075h(selector, "selector");
        if (C6220d.cdj(maxByOrNull)) {
            return null;
        }
        long jX2 = C6220d.x2(maxByOrNull, 0);
        int iHmvj = C6144h.hmvj(maxByOrNull);
        if (iHmvj == 0) {
            return ikck.zy(jX2);
        }
        R rInvoke = selector.invoke(ikck.zy(jX2));
        n5r1 it = new kotlin.ranges.x2(1, iHmvj).iterator();
        while (it.hasNext()) {
            long jX22 = C6220d.x2(maxByOrNull, it.nextInt());
            R rInvoke2 = selector.invoke(ikck.zy(jX22));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                jX2 = jX22;
                rInvoke = rInvoke2;
            }
        }
        return ikck.zy(jX2);
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final List<qo> pjz9(@InterfaceC7396q short[] drop, int i2) {
        d2ok.m23075h(drop, "$this$drop");
        if (i2 >= 0) {
            return cin(drop, fn3e.fn3e(tfm.n7h(drop) - i2, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final List<C6227f<gyi, gyi>> pm(@InterfaceC7396q int[] zip, @InterfaceC7396q int[] other) {
        d2ok.m23075h(zip, "$this$zip");
        d2ok.m23075h(other, "other");
        int iMin = Math.min(dr.n7h(zip), dr.n7h(other));
        ArrayList arrayList = new ArrayList(iMin);
        for (int i2 = 0; i2 < iMin; i2++) {
            arrayList.add(nmn5.m23230k(gyi.zy(dr.x2(zip, i2)), gyi.zy(dr.x2(other, i2))));
        }
        return arrayList;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final byte pnt2(byte[] first) {
        d2ok.m23075h(first, "$this$first");
        return C6475u.ld6(C6144h.v0wk(first));
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final ikck pri(long[] singleOrNull, x2<? super ikck, Boolean> predicate) {
        d2ok.m23075h(singleOrNull, "$this$singleOrNull");
        d2ok.m23075h(predicate, "predicate");
        int iN7h = C6220d.n7h(singleOrNull);
        boolean z2 = false;
        ikck ikckVarZy = null;
        for (int i2 = 0; i2 < iN7h; i2++) {
            long jX2 = C6220d.x2(singleOrNull, i2);
            if (predicate.invoke(ikck.zy(jX2)).booleanValue()) {
                if (z2) {
                    return null;
                }
                ikckVarZy = ikck.zy(jX2);
                z2 = true;
            }
        }
        if (z2) {
            return ikckVarZy;
        }
        return null;
    }

    @yz(version = "1.3")
    @InterfaceC6232i
    public static final void ps(@InterfaceC7396q long[] fill, long j2, int i2, int i3) {
        d2ok.m23075h(fill, "$this$fill");
        kja0.dxef(fill, j2, i2, i3);
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6769y(name = "sumOfDouble")
    @InterfaceC6232i
    private static final double ptry(int[] sumOf, x2<? super gyi, Double> selector) {
        d2ok.m23075h(sumOf, "$this$sumOf");
        d2ok.m23075h(selector, "selector");
        int iN7h = dr.n7h(sumOf);
        double dDoubleValue = 0.0d;
        for (int i2 = 0; i2 < iN7h; i2++) {
            dDoubleValue += selector.invoke(gyi.zy(dr.x2(sumOf, i2))).doubleValue();
        }
        return dDoubleValue;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final byte py(byte[] component5) {
        d2ok.m23075h(component5, "$this$component5");
        return bo.x2(component5, 4);
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final <R> List<R> py7(int[] map, x2<? super gyi, ? extends R> transform) {
        d2ok.m23075h(map, "$this$map");
        d2ok.m23075h(transform, "transform");
        ArrayList arrayList = new ArrayList(dr.n7h(map));
        int iN7h = dr.n7h(map);
        for (int i2 = 0; i2 < iN7h; i2++) {
            arrayList.add(transform.invoke(gyi.zy(dr.x2(map, i2))));
        }
        return arrayList;
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6769y(name = "sumOfLong")
    @InterfaceC6232i
    private static final long q4lv(byte[] sumOf, x2<? super C6475u, Long> selector) {
        d2ok.m23075h(sumOf, "$this$sumOf");
        d2ok.m23075h(selector, "selector");
        int iN7h = bo.n7h(sumOf);
        long jLongValue = 0;
        for (int i2 = 0; i2 < iN7h; i2++) {
            jLongValue += selector.invoke(C6475u.zy(bo.x2(sumOf, i2))).longValue();
        }
        return jLongValue;
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final byte[] q72(@InterfaceC7396q C6475u[] c6475uArr) {
        d2ok.m23075h(c6475uArr, "<this>");
        int length = c6475uArr.length;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            bArr[i2] = c6475uArr[i2].bf2();
        }
        return bo.m22412g(bArr);
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final qo q8(short[] singleOrNull, x2<? super qo, Boolean> predicate) {
        d2ok.m23075h(singleOrNull, "$this$singleOrNull");
        d2ok.m23075h(predicate, "predicate");
        int iN7h = tfm.n7h(singleOrNull);
        boolean z2 = false;
        qo qoVarZy = null;
        for (int i2 = 0; i2 < iN7h; i2++) {
            short sX2 = tfm.x2(singleOrNull, i2);
            if (predicate.invoke(qo.zy(sX2)).booleanValue()) {
                if (z2) {
                    return null;
                }
                qoVarZy = qo.zy(sX2);
                z2 = true;
            }
        }
        if (z2) {
            return qoVarZy;
        }
        return null;
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final List<C6475u> qb8(byte[] runningReduce, InterfaceC5979h<? super C6475u, ? super C6475u, C6475u> operation) {
        d2ok.m23075h(runningReduce, "$this$runningReduce");
        d2ok.m23075h(operation, "operation");
        if (bo.cdj(runningReduce)) {
            return ni7.a9();
        }
        byte bX2 = bo.x2(runningReduce, 0);
        ArrayList arrayList = new ArrayList(bo.n7h(runningReduce));
        arrayList.add(C6475u.zy(bX2));
        int iN7h = bo.n7h(runningReduce);
        for (int i2 = 1; i2 < iN7h; i2++) {
            bX2 = operation.invoke(C6475u.zy(bX2), C6475u.zy(bo.x2(runningReduce, i2))).bf2();
            arrayList.add(C6475u.zy(bX2));
        }
        return arrayList;
    }

    @i9jn(markerClass = {ki.class})
    @InterfaceC7395n
    @yz(version = "1.4")
    @InterfaceC6232i
    public static final ikck qe(@InterfaceC7396q long[] randomOrNull, @InterfaceC7396q AbstractC6332g random) {
        d2ok.m23075h(randomOrNull, "$this$randomOrNull");
        d2ok.m23075h(random, "random");
        if (C6220d.cdj(randomOrNull)) {
            return null;
        }
        return ikck.zy(C6220d.x2(randomOrNull, random.nextInt(C6220d.n7h(randomOrNull))));
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final int qexj(int[] indexOfLast, x2<? super gyi, Boolean> predicate) {
        d2ok.m23075h(indexOfLast, "$this$indexOfLast");
        d2ok.m23075h(predicate, "predicate");
        int length = indexOfLast.length - 1;
        if (length < 0) {
            return -1;
        }
        while (true) {
            int i2 = length - 1;
            if (predicate.invoke(gyi.zy(gyi.ld6(indexOfLast[length]))).booleanValue()) {
                return length;
            }
            if (i2 < 0) {
                return -1;
            }
            length = i2;
        }
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final <R> List<R> qg(byte[] runningFoldIndexed, R r2, cdj<? super Integer, ? super R, ? super C6475u, ? extends R> operation) {
        d2ok.m23075h(runningFoldIndexed, "$this$runningFoldIndexed");
        d2ok.m23075h(operation, "operation");
        if (bo.cdj(runningFoldIndexed)) {
            return zurt.ld6(r2);
        }
        ArrayList arrayList = new ArrayList(bo.n7h(runningFoldIndexed) + 1);
        arrayList.add(r2);
        int iN7h = bo.n7h(runningFoldIndexed);
        for (int i2 = 0; i2 < iN7h; i2++) {
            r2 = operation.invoke(Integer.valueOf(i2), r2, C6475u.zy(bo.x2(runningFoldIndexed, i2)));
            arrayList.add(r2);
        }
        return arrayList;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final gyi qh4d(int[] findLast, x2<? super gyi, Boolean> predicate) {
        d2ok.m23075h(findLast, "$this$findLast");
        d2ok.m23075h(predicate, "predicate");
        int iN7h = dr.n7h(findLast) - 1;
        if (iN7h >= 0) {
            while (true) {
                int i2 = iN7h - 1;
                int iX2 = dr.x2(findLast, iN7h);
                if (predicate.invoke(gyi.zy(iX2)).booleanValue()) {
                    return gyi.zy(iX2);
                }
                if (i2 < 0) {
                    break;
                }
                iN7h = i2;
            }
        }
        return null;
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6769y(name = "sumOfLong")
    @InterfaceC6232i
    private static final long qkbk(long[] sumOf, x2<? super ikck, Long> selector) {
        d2ok.m23075h(sumOf, "$this$sumOf");
        d2ok.m23075h(selector, "selector");
        int iN7h = C6220d.n7h(sumOf);
        long jLongValue = 0;
        for (int i2 = 0; i2 < iN7h; i2++) {
            jLongValue += selector.invoke(ikck.zy(C6220d.x2(sumOf, i2))).longValue();
        }
        return jLongValue;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final short qkj8(short[] component2) {
        d2ok.m23075h(component2, "$this$component2");
        return tfm.x2(component2, 1);
    }

    @yz(version = "1.3")
    @InterfaceC6232i
    public static /* synthetic */ void qla(long[] jArr) {
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final short qm8(short[] reduceIndexed, cdj<? super Integer, ? super qo, ? super qo, qo> operation) {
        d2ok.m23075h(reduceIndexed, "$this$reduceIndexed");
        d2ok.m23075h(operation, "operation");
        if (tfm.cdj(reduceIndexed)) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        short sX2 = tfm.x2(reduceIndexed, 0);
        n5r1 it = new kotlin.ranges.x2(1, C6144h.orxw(reduceIndexed)).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            sX2 = operation.invoke(Integer.valueOf(iNextInt), qo.zy(sX2), qo.zy(tfm.x2(reduceIndexed, iNextInt))).bf2();
        }
        return sX2;
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final Iterable<x9kr<qo>> qmo(@InterfaceC7396q short[] withIndex) {
        d2ok.m23075h(withIndex, "$this$withIndex");
        return new ncyb(new C6170q(withIndex));
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final byte qo(byte[] component3) {
        d2ok.m23075h(component3, "$this$component3");
        return bo.x2(component3, 2);
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @yz(version = "1.5")
    @InterfaceC6769y(name = "sumOfULong")
    public static final long qoo(@InterfaceC7396q ikck[] ikckVarArr) {
        d2ok.m23075h(ikckVarArr, "<this>");
        long jLd6 = 0;
        for (ikck ikckVar : ikckVarArr) {
            jLd6 = ikck.ld6(jLd6 + ikckVar.a98o());
        }
        return jLd6;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final int qppo(int[] indexOf, int i2) {
        d2ok.m23075h(indexOf, "$this$indexOf");
        return C6144h.wj7e(indexOf, i2);
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final boolean qspg(short[] none, x2<? super qo, Boolean> predicate) {
        d2ok.m23075h(none, "$this$none");
        d2ok.m23075h(predicate, "predicate");
        int iN7h = tfm.n7h(none);
        for (int i2 = 0; i2 < iN7h; i2++) {
            if (predicate.invoke(qo.zy(tfm.x2(none, i2))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final byte[] qu9(byte[] plus, byte[] elements) {
        d2ok.m23075h(plus, "$this$plus");
        d2ok.m23075h(elements, "elements");
        return bo.m22412g(kja0.kt06(plus, elements));
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final qo[] qv3(@InterfaceC7396q short[] toTypedArray) {
        d2ok.m23075h(toTypedArray, "$this$toTypedArray");
        int iN7h = tfm.n7h(toTypedArray);
        qo[] qoVarArr = new qo[iN7h];
        for (int i2 = 0; i2 < iN7h; i2++) {
            qoVarArr[i2] = qo.zy(tfm.x2(toTypedArray, i2));
        }
        return qoVarArr;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final int[] qy(int[] iArr) {
        d2ok.m23075h(iArr, "<this>");
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        d2ok.kja0(iArrCopyOf, "copyOf(this, size)");
        return dr.m22802g(iArrCopyOf);
    }

    @InterfaceC7395n
    @yz(version = "1.4")
    @InterfaceC6232i
    public static final ikck qyk(@InterfaceC7396q long[] maxOrNull) {
        d2ok.m23075h(maxOrNull, "$this$maxOrNull");
        if (C6220d.cdj(maxOrNull)) {
            return null;
        }
        long jX2 = C6220d.x2(maxOrNull, 0);
        n5r1 it = new kotlin.ranges.x2(1, C6144h.hmvj(maxOrNull)).iterator();
        while (it.hasNext()) {
            long jX22 = C6220d.x2(maxOrNull, it.nextInt());
            if (Long.compareUnsigned(jX2, jX22) < 0) {
                jX2 = jX22;
            }
        }
        return ikck.zy(jX2);
    }

    @i9jn(markerClass = {ki.class})
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final C6475u qyp(byte[] reduceOrNull, InterfaceC5979h<? super C6475u, ? super C6475u, C6475u> operation) {
        d2ok.m23075h(reduceOrNull, "$this$reduceOrNull");
        d2ok.m23075h(operation, "operation");
        if (bo.cdj(reduceOrNull)) {
            return null;
        }
        byte bX2 = bo.x2(reduceOrNull, 0);
        n5r1 it = new kotlin.ranges.x2(1, C6144h.vl(reduceOrNull)).iterator();
        while (it.hasNext()) {
            bX2 = operation.invoke(C6475u.zy(bX2), C6475u.zy(bo.x2(reduceOrNull, it.nextInt()))).bf2();
        }
        return C6475u.zy(bX2);
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final List<qo> qyp7(short[] runningReduceIndexed, cdj<? super Integer, ? super qo, ? super qo, qo> operation) {
        d2ok.m23075h(runningReduceIndexed, "$this$runningReduceIndexed");
        d2ok.m23075h(operation, "operation");
        if (tfm.cdj(runningReduceIndexed)) {
            return ni7.a9();
        }
        short sX2 = tfm.x2(runningReduceIndexed, 0);
        ArrayList arrayList = new ArrayList(tfm.n7h(runningReduceIndexed));
        arrayList.add(qo.zy(sX2));
        int iN7h = tfm.n7h(runningReduceIndexed);
        for (int i2 = 1; i2 < iN7h; i2++) {
            sX2 = operation.invoke(Integer.valueOf(i2), qo.zy(sX2), qo.zy(tfm.x2(runningReduceIndexed, i2))).bf2();
            arrayList.add(qo.zy(sX2));
        }
        return arrayList;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final qo r25n(short[] elementAtOrNull, int i2) {
        d2ok.m23075h(elementAtOrNull, "$this$elementAtOrNull");
        return koj(elementAtOrNull, i2);
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final List<gyi> r3w(int[] runningReduce, InterfaceC5979h<? super gyi, ? super gyi, gyi> operation) {
        d2ok.m23075h(runningReduce, "$this$runningReduce");
        d2ok.m23075h(operation, "operation");
        if (dr.cdj(runningReduce)) {
            return ni7.a9();
        }
        int iX2 = dr.x2(runningReduce, 0);
        ArrayList arrayList = new ArrayList(dr.n7h(runningReduce));
        arrayList.add(gyi.zy(iX2));
        int iN7h = dr.n7h(runningReduce);
        for (int i2 = 1; i2 < iN7h; i2++) {
            iX2 = operation.invoke(gyi.zy(iX2), gyi.zy(dr.x2(runningReduce, i2))).a98o();
            arrayList.add(gyi.zy(iX2));
        }
        return arrayList;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final <C extends Collection<? super C6475u>> C r6ty(byte[] filterIndexedTo, C destination, InterfaceC5979h<? super Integer, ? super C6475u, Boolean> predicate) {
        d2ok.m23075h(filterIndexedTo, "$this$filterIndexedTo");
        d2ok.m23075h(destination, "destination");
        d2ok.m23075h(predicate, "predicate");
        int iN7h = bo.n7h(filterIndexedTo);
        int i2 = 0;
        int i3 = 0;
        while (i2 < iN7h) {
            byte bX2 = bo.x2(filterIndexedTo, i2);
            int i4 = i3 + 1;
            if (predicate.invoke(Integer.valueOf(i3), C6475u.zy(bX2)).booleanValue()) {
                destination.add(C6475u.zy(bX2));
            }
            i2++;
            i3 = i4;
        }
        return destination;
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final long[] r8k(long[] onEachIndexed, InterfaceC5979h<? super Integer, ? super ikck, was> action) {
        d2ok.m23075h(onEachIndexed, "$this$onEachIndexed");
        d2ok.m23075h(action, "action");
        int iN7h = C6220d.n7h(onEachIndexed);
        int i2 = 0;
        int i3 = 0;
        while (i2 < iN7h) {
            action.invoke(Integer.valueOf(i3), ikck.zy(C6220d.x2(onEachIndexed, i2)));
            i2++;
            i3++;
        }
        return onEachIndexed;
    }

    @yz(version = "1.4")
    @InterfaceC6232i
    public static boolean r8s8(@InterfaceC7395n short[] sArr, @InterfaceC7395n short[] sArr2) {
        if (sArr == null) {
            sArr = null;
        }
        if (sArr2 == null) {
            sArr2 = null;
        }
        return Arrays.equals(sArr, sArr2);
    }

    @yz(version = "1.3")
    @InterfaceC6232i
    public static final void ra(@InterfaceC7396q byte[] fill, byte b2, int i2, int i3) {
        d2ok.m23075h(fill, "$this$fill");
        kja0.bap7(fill, b2, i2, i3);
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final <R> R rb7(byte[] minOfWith, Comparator<? super R> comparator, x2<? super C6475u, ? extends R> selector) {
        d2ok.m23075h(minOfWith, "$this$minOfWith");
        d2ok.m23075h(comparator, "comparator");
        d2ok.m23075h(selector, "selector");
        if (bo.cdj(minOfWith)) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(C6475u.zy(bo.x2(minOfWith, 0)));
        n5r1 it = new kotlin.ranges.x2(1, C6144h.vl(minOfWith)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(C6475u.zy(bo.x2(minOfWith, it.nextInt())));
            if (comparator.compare(rInvoke, rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final List<C6475u> re9(byte[] runningReduceIndexed, cdj<? super Integer, ? super C6475u, ? super C6475u, C6475u> operation) {
        d2ok.m23075h(runningReduceIndexed, "$this$runningReduceIndexed");
        d2ok.m23075h(operation, "operation");
        if (bo.cdj(runningReduceIndexed)) {
            return ni7.a9();
        }
        byte bX2 = bo.x2(runningReduceIndexed, 0);
        ArrayList arrayList = new ArrayList(bo.n7h(runningReduceIndexed));
        arrayList.add(C6475u.zy(bX2));
        int iN7h = bo.n7h(runningReduceIndexed);
        for (int i2 = 1; i2 < iN7h; i2++) {
            bX2 = operation.invoke(Integer.valueOf(i2), C6475u.zy(bX2), C6475u.zy(bo.x2(runningReduceIndexed, i2))).bf2();
            arrayList.add(C6475u.zy(bX2));
        }
        return arrayList;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final void rf(long[] forEachIndexed, InterfaceC5979h<? super Integer, ? super ikck, was> action) {
        d2ok.m23075h(forEachIndexed, "$this$forEachIndexed");
        d2ok.m23075h(action, "action");
        int iN7h = C6220d.n7h(forEachIndexed);
        int i2 = 0;
        int i3 = 0;
        while (i2 < iN7h) {
            action.invoke(Integer.valueOf(i3), ikck.zy(C6220d.x2(forEachIndexed, i2)));
            i2++;
            i3++;
        }
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final short rh(short[] reduce, InterfaceC5979h<? super qo, ? super qo, qo> operation) {
        d2ok.m23075h(reduce, "$this$reduce");
        d2ok.m23075h(operation, "operation");
        if (tfm.cdj(reduce)) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        short sX2 = tfm.x2(reduce, 0);
        n5r1 it = new kotlin.ranges.x2(1, C6144h.orxw(reduce)).iterator();
        while (it.hasNext()) {
            sX2 = operation.invoke(qo.zy(sX2), qo.zy(tfm.x2(reduce, it.nextInt()))).bf2();
        }
        return sX2;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final int rig(int[] last, x2<? super gyi, Boolean> predicate) {
        d2ok.m23075h(last, "$this$last");
        d2ok.m23075h(predicate, "predicate");
        int iN7h = dr.n7h(last) - 1;
        if (iN7h >= 0) {
            while (true) {
                int i2 = iN7h - 1;
                int iX2 = dr.x2(last, iN7h);
                if (!predicate.invoke(gyi.zy(iX2)).booleanValue()) {
                    if (i2 < 0) {
                        break;
                    }
                    iN7h = i2;
                } else {
                    return iX2;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final double rlj(byte[] maxOf, x2<? super C6475u, Double> selector) {
        d2ok.m23075h(maxOf, "$this$maxOf");
        d2ok.m23075h(selector, "selector");
        if (bo.cdj(maxOf)) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(C6475u.zy(bo.x2(maxOf, 0))).doubleValue();
        n5r1 it = new kotlin.ranges.x2(1, C6144h.vl(maxOf)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, selector.invoke(C6475u.zy(bo.x2(maxOf, it.nextInt()))).doubleValue());
        }
        return dDoubleValue;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final <R, V> List<V> rlpj(byte[] zip, Iterable<? extends R> other, InterfaceC5979h<? super C6475u, ? super R, ? extends V> transform) {
        d2ok.m23075h(zip, "$this$zip");
        d2ok.m23075h(other, "other");
        d2ok.m23075h(transform, "transform");
        int iN7h = bo.n7h(zip);
        ArrayList arrayList = new ArrayList(Math.min(fu4.vyq(other, 10), iN7h));
        int i2 = 0;
        for (R r2 : other) {
            if (i2 >= iN7h) {
                break;
            }
            arrayList.add(transform.invoke(C6475u.zy(bo.x2(zip, i2)), r2));
            i2++;
        }
        return arrayList;
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final ikck[] rn(@InterfaceC7396q long[] toTypedArray) {
        d2ok.m23075h(toTypedArray, "$this$toTypedArray");
        int iN7h = C6220d.n7h(toTypedArray);
        ikck[] ikckVarArr = new ikck[iN7h];
        for (int i2 = 0; i2 < iN7h; i2++) {
            ikckVarArr[i2] = ikck.zy(C6220d.x2(toTypedArray, i2));
        }
        return ikckVarArr;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final List<qo> rp(short[] filterIndexed, InterfaceC5979h<? super Integer, ? super qo, Boolean> predicate) {
        d2ok.m23075h(filterIndexed, "$this$filterIndexed");
        d2ok.m23075h(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int iN7h = tfm.n7h(filterIndexed);
        int i2 = 0;
        int i3 = 0;
        while (i2 < iN7h) {
            short sX2 = tfm.x2(filterIndexed, i2);
            int i4 = i3 + 1;
            if (predicate.invoke(Integer.valueOf(i3), qo.zy(sX2)).booleanValue()) {
                arrayList.add(qo.zy(sX2));
            }
            i2++;
            i3 = i4;
        }
        return arrayList;
    }

    @InterfaceC7395n
    @yz(version = "1.4")
    @InterfaceC6232i
    public static final ikck rq(@InterfaceC7396q long[] maxWithOrNull, @InterfaceC7396q Comparator<? super ikck> comparator) {
        d2ok.m23075h(maxWithOrNull, "$this$maxWithOrNull");
        d2ok.m23075h(comparator, "comparator");
        if (C6220d.cdj(maxWithOrNull)) {
            return null;
        }
        long jX2 = C6220d.x2(maxWithOrNull, 0);
        n5r1 it = new kotlin.ranges.x2(1, C6144h.hmvj(maxWithOrNull)).iterator();
        while (it.hasNext()) {
            long jX22 = C6220d.x2(maxWithOrNull, it.nextInt());
            if (comparator.compare(ikck.zy(jX2), ikck.zy(jX22)) < 0) {
                jX2 = jX22;
            }
        }
        return ikck.zy(jX2);
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final List<qo> rw(short[] takeWhile, x2<? super qo, Boolean> predicate) {
        d2ok.m23075h(takeWhile, "$this$takeWhile");
        d2ok.m23075h(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int iN7h = tfm.n7h(takeWhile);
        for (int i2 = 0; i2 < iN7h; i2++) {
            short sX2 = tfm.x2(takeWhile, i2);
            if (!predicate.invoke(qo.zy(sX2)).booleanValue()) {
                break;
            }
            arrayList.add(qo.zy(sX2));
        }
        return arrayList;
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final <R> List<R> ryij(int[] runningFold, R r2, InterfaceC5979h<? super R, ? super gyi, ? extends R> operation) {
        d2ok.m23075h(runningFold, "$this$runningFold");
        d2ok.m23075h(operation, "operation");
        if (dr.cdj(runningFold)) {
            return zurt.ld6(r2);
        }
        ArrayList arrayList = new ArrayList(dr.n7h(runningFold) + 1);
        arrayList.add(r2);
        int iN7h = dr.n7h(runningFold);
        for (int i2 = 0; i2 < iN7h; i2++) {
            r2 = operation.invoke(r2, gyi.zy(dr.x2(runningFold, i2)));
            arrayList.add(r2);
        }
        return arrayList;
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final <R> List<C6227f<gyi, R>> s0jx(@InterfaceC7396q int[] zip, @InterfaceC7396q Iterable<? extends R> other) {
        d2ok.m23075h(zip, "$this$zip");
        d2ok.m23075h(other, "other");
        int iN7h = dr.n7h(zip);
        ArrayList arrayList = new ArrayList(Math.min(fu4.vyq(other, 10), iN7h));
        int i2 = 0;
        for (R r2 : other) {
            if (i2 >= iN7h) {
                break;
            }
            arrayList.add(nmn5.m23230k(gyi.zy(dr.x2(zip, i2)), r2));
            i2++;
        }
        return arrayList;
    }

    @InterfaceC7395n
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final ikck s31(@InterfaceC7396q long[] getOrNull, int i2) {
        d2ok.m23075h(getOrNull, "$this$getOrNull");
        if (i2 < 0 || i2 > C6144h.hmvj(getOrNull)) {
            return null;
        }
        return ikck.zy(C6220d.x2(getOrNull, i2));
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6769y(name = "sumOfDouble")
    @InterfaceC6232i
    private static final double s8(long[] sumOf, x2<? super ikck, Double> selector) {
        d2ok.m23075h(sumOf, "$this$sumOf");
        d2ok.m23075h(selector, "selector");
        int iN7h = C6220d.n7h(sumOf);
        double dDoubleValue = 0.0d;
        for (int i2 = 0; i2 < iN7h; i2++) {
            dDoubleValue += selector.invoke(ikck.zy(C6220d.x2(sumOf, i2))).doubleValue();
        }
        return dDoubleValue;
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final void s9(int[] reverse, int i2, int i3) {
        d2ok.m23075h(reverse, "$this$reverse");
        C6144h.tm(reverse, i2, i3);
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final <R> R s9de(int[] maxOfWith, Comparator<? super R> comparator, x2<? super gyi, ? extends R> selector) {
        d2ok.m23075h(maxOfWith, "$this$maxOfWith");
        d2ok.m23075h(comparator, "comparator");
        d2ok.m23075h(selector, "selector");
        if (dr.cdj(maxOfWith)) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(gyi.zy(dr.x2(maxOfWith, 0)));
        n5r1 it = new kotlin.ranges.x2(1, C6144h.srpc(maxOfWith)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(gyi.zy(dr.x2(maxOfWith, it.nextInt())));
            if (comparator.compare(rInvoke, rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final int sa(int[] single, x2<? super gyi, Boolean> predicate) {
        d2ok.m23075h(single, "$this$single");
        d2ok.m23075h(predicate, "predicate");
        int iN7h = dr.n7h(single);
        gyi gyiVarZy = null;
        boolean z2 = false;
        for (int i2 = 0; i2 < iN7h; i2++) {
            int iX2 = dr.x2(single, i2);
            if (predicate.invoke(gyi.zy(iX2)).booleanValue()) {
                if (z2) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                gyiVarZy = gyi.zy(iX2);
                z2 = true;
            }
        }
        if (z2) {
            return gyiVarZy.a98o();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @yz(version = "1.3")
    @InterfaceC6232i
    public static /* synthetic */ void sb(byte[] bArr) {
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final <R> R sb1e(int[] foldRight, R r2, InterfaceC5979h<? super gyi, ? super R, ? extends R> operation) {
        d2ok.m23075h(foldRight, "$this$foldRight");
        d2ok.m23075h(operation, "operation");
        for (int iSrpc = C6144h.srpc(foldRight); iSrpc >= 0; iSrpc--) {
            r2 = operation.invoke(gyi.zy(dr.x2(foldRight, iSrpc)), r2);
        }
        return r2;
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final <R, C extends Collection<? super R>> C sc(byte[] flatMapIndexedTo, C destination, InterfaceC5979h<? super Integer, ? super C6475u, ? extends Iterable<? extends R>> transform) {
        d2ok.m23075h(flatMapIndexedTo, "$this$flatMapIndexedTo");
        d2ok.m23075h(destination, "destination");
        d2ok.m23075h(transform, "transform");
        int iN7h = bo.n7h(flatMapIndexedTo);
        int i2 = 0;
        int i3 = 0;
        while (i2 < iN7h) {
            C6163t.zp(destination, transform.invoke(Integer.valueOf(i3), C6475u.zy(bo.x2(flatMapIndexedTo, i2))));
            i2++;
            i3++;
        }
        return destination;
    }

    @InterfaceC7396q
    @yz(version = "1.4")
    @InterfaceC6232i
    public static String se(@InterfaceC7395n long[] jArr) {
        String strUo;
        return (jArr == null || (strUo = a9.uo(C6220d.toq(jArr), ", ", "[", "]", 0, null, null, 56, null)) == null) ? "null" : strUo;
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final gyi se2c(int[] reduceIndexedOrNull, cdj<? super Integer, ? super gyi, ? super gyi, gyi> operation) {
        d2ok.m23075h(reduceIndexedOrNull, "$this$reduceIndexedOrNull");
        d2ok.m23075h(operation, "operation");
        if (dr.cdj(reduceIndexedOrNull)) {
            return null;
        }
        int iX2 = dr.x2(reduceIndexedOrNull, 0);
        n5r1 it = new kotlin.ranges.x2(1, C6144h.srpc(reduceIndexedOrNull)).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            iX2 = operation.invoke(Integer.valueOf(iNextInt), gyi.zy(iX2), gyi.zy(dr.x2(reduceIndexedOrNull, iNextInt))).a98o();
        }
        return gyi.zy(iX2);
    }

    @i9jn(markerClass = {ki.class})
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final <R> List<R> sgh1(byte[] scan, R r2, InterfaceC5979h<? super R, ? super C6475u, ? extends R> operation) {
        d2ok.m23075h(scan, "$this$scan");
        d2ok.m23075h(operation, "operation");
        if (bo.cdj(scan)) {
            return zurt.ld6(r2);
        }
        ArrayList arrayList = new ArrayList(bo.n7h(scan) + 1);
        arrayList.add(r2);
        int iN7h = bo.n7h(scan);
        for (int i2 = 0; i2 < iN7h; i2++) {
            r2 = operation.invoke(r2, C6475u.zy(bo.x2(scan, i2)));
            arrayList.add(r2);
        }
        return arrayList;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final void sj(short[] forEachIndexed, InterfaceC5979h<? super Integer, ? super qo, was> action) {
        d2ok.m23075h(forEachIndexed, "$this$forEachIndexed");
        d2ok.m23075h(action, "action");
        int iN7h = tfm.n7h(forEachIndexed);
        int i2 = 0;
        int i3 = 0;
        while (i2 < iN7h) {
            action.invoke(Integer.valueOf(i3), qo.zy(tfm.x2(forEachIndexed, i2)));
            i2++;
            i3++;
        }
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final short sm(short[] last, x2<? super qo, Boolean> predicate) {
        d2ok.m23075h(last, "$this$last");
        d2ok.m23075h(predicate, "predicate");
        int iN7h = tfm.n7h(last) - 1;
        if (iN7h >= 0) {
            while (true) {
                int i2 = iN7h - 1;
                short sX2 = tfm.x2(last, iN7h);
                if (!predicate.invoke(qo.zy(sX2)).booleanValue()) {
                    if (i2 < 0) {
                        break;
                    }
                    iN7h = i2;
                } else {
                    return sX2;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @i9jn(markerClass = {ki.class})
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final <R> List<R> so(short[] scan, R r2, InterfaceC5979h<? super R, ? super qo, ? extends R> operation) {
        d2ok.m23075h(scan, "$this$scan");
        d2ok.m23075h(operation, "operation");
        if (tfm.cdj(scan)) {
            return zurt.ld6(r2);
        }
        ArrayList arrayList = new ArrayList(tfm.n7h(scan) + 1);
        arrayList.add(r2);
        int iN7h = tfm.n7h(scan);
        for (int i2 = 0; i2 < iN7h; i2++) {
            r2 = operation.invoke(r2, qo.zy(tfm.x2(scan, i2)));
            arrayList.add(r2);
        }
        return arrayList;
    }

    @yz(version = "1.4")
    @InterfaceC6232i
    public static final int sok(@InterfaceC7395n byte[] bArr) {
        if (bArr == null) {
            bArr = null;
        }
        return Arrays.hashCode(bArr);
    }

    public static /* synthetic */ void sr0i(long[] jArr, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = C6220d.n7h(jArr);
        }
        iroj(jArr, i2, i3);
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final List<C6475u> syl2(@InterfaceC7396q byte[] sortedDescending) {
        d2ok.m23075h(sortedDescending, "$this$sortedDescending");
        byte[] bArrCopyOf = Arrays.copyOf(sortedDescending, sortedDescending.length);
        d2ok.kja0(bArrCopyOf, "copyOf(this, size)");
        byte[] bArrM22412g = bo.m22412g(bArrCopyOf);
        os3j(bArrM22412g);
        return gk(bArrM22412g);
    }

    @i9jn(markerClass = {ki.class})
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final gyi t0(int[] randomOrNull) {
        d2ok.m23075h(randomOrNull, "$this$randomOrNull");
        return zuh(randomOrNull, AbstractC6332g.Default);
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final List<ikck> t1(@InterfaceC7396q long[] slice, @InterfaceC7396q kotlin.ranges.x2 indices) {
        d2ok.m23075h(slice, "$this$slice");
        d2ok.m23075h(indices, "indices");
        return indices.isEmpty() ? ni7.a9() : kotlin.collections.unsigned.toq.zy(C6220d.m22779g(kja0.b3e(slice, indices.mo2951k().intValue(), indices.zy().intValue() + 1)));
    }

    public static /* synthetic */ void t2et(short[] sArr, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = tfm.n7h(sArr);
        }
        wk(sArr, i2, i3);
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final short[] t4(@InterfaceC7396q short[] sortedArray) {
        d2ok.m23075h(sortedArray, "$this$sortedArray");
        if (tfm.cdj(sortedArray)) {
            return sortedArray;
        }
        short[] sArrCopyOf = Arrays.copyOf(sortedArray, sortedArray.length);
        d2ok.kja0(sArrCopyOf, "copyOf(this, size)");
        short[] sArrM23651g = tfm.m23651g(sArrCopyOf);
        jrla(sArrM23651g);
        return sArrM23651g;
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @hyr
    @InterfaceC6234g
    @yz(version = "1.5")
    @InterfaceC6769y(name = "sumOfUInt")
    @InterfaceC6232i
    private static final int t5(long[] sumOf, x2<? super ikck, gyi> selector) {
        d2ok.m23075h(sumOf, "$this$sumOf");
        d2ok.m23075h(selector, "selector");
        int iLd6 = gyi.ld6(0);
        int iN7h = C6220d.n7h(sumOf);
        for (int i2 = 0; i2 < iN7h; i2++) {
            iLd6 = gyi.ld6(iLd6 + selector.invoke(ikck.zy(C6220d.x2(sumOf, i2))).a98o());
        }
        return iLd6;
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final <R> R t57j(short[] minOfWithOrNull, Comparator<? super R> comparator, x2<? super qo, ? extends R> selector) {
        d2ok.m23075h(minOfWithOrNull, "$this$minOfWithOrNull");
        d2ok.m23075h(comparator, "comparator");
        d2ok.m23075h(selector, "selector");
        if (tfm.cdj(minOfWithOrNull)) {
            return null;
        }
        R rInvoke = selector.invoke(qo.zy(tfm.x2(minOfWithOrNull, 0)));
        n5r1 it = new kotlin.ranges.x2(1, C6144h.orxw(minOfWithOrNull)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(qo.zy(tfm.x2(minOfWithOrNull, it.nextInt())));
            if (comparator.compare(rInvoke, rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final <R, V> List<V> t6(long[] zip, R[] other, InterfaceC5979h<? super ikck, ? super R, ? extends V> transform) {
        d2ok.m23075h(zip, "$this$zip");
        d2ok.m23075h(other, "other");
        d2ok.m23075h(transform, "transform");
        int iMin = Math.min(C6220d.n7h(zip), other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i2 = 0; i2 < iMin; i2++) {
            arrayList.add(transform.invoke(ikck.zy(C6220d.x2(zip, i2)), other[i2]));
        }
        return arrayList;
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final Float t8fp(byte[] maxOfOrNull, x2<? super C6475u, Float> selector) {
        d2ok.m23075h(maxOfOrNull, "$this$maxOfOrNull");
        d2ok.m23075h(selector, "selector");
        if (bo.cdj(maxOfOrNull)) {
            return null;
        }
        float fFloatValue = selector.invoke(C6475u.zy(bo.x2(maxOfOrNull, 0))).floatValue();
        n5r1 it = new kotlin.ranges.x2(1, C6144h.vl(maxOfOrNull)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, selector.invoke(C6475u.zy(bo.x2(maxOfOrNull, it.nextInt()))).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final <V> Map<gyi, V> t8iq(int[] associateWith, x2<? super gyi, ? extends V> valueSelector) {
        d2ok.m23075h(associateWith, "$this$associateWith");
        d2ok.m23075h(valueSelector, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(fn3e.fn3e(C6140e.m22479p(dr.n7h(associateWith)), 16));
        int iN7h = dr.n7h(associateWith);
        for (int i2 = 0; i2 < iN7h; i2++) {
            int iX2 = dr.x2(associateWith, i2);
            linkedHashMap.put(gyi.zy(iX2), valueSelector.invoke(gyi.zy(iX2)));
        }
        return linkedHashMap;
    }

    @InterfaceC7395n
    @yz(version = "1.4")
    @InterfaceC6232i
    public static final gyi t8o(@InterfaceC7396q int[] maxOrNull) {
        d2ok.m23075h(maxOrNull, "$this$maxOrNull");
        if (dr.cdj(maxOrNull)) {
            return null;
        }
        int iX2 = dr.x2(maxOrNull, 0);
        n5r1 it = new kotlin.ranges.x2(1, C6144h.srpc(maxOrNull)).iterator();
        while (it.hasNext()) {
            int iX22 = dr.x2(maxOrNull, it.nextInt());
            if (Integer.compareUnsigned(iX2, iX22) < 0) {
                iX2 = iX22;
            }
        }
        return gyi.zy(iX2);
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final double td(long[] minOf, x2<? super ikck, Double> selector) {
        d2ok.m23075h(minOf, "$this$minOf");
        d2ok.m23075h(selector, "selector");
        if (C6220d.cdj(minOf)) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(ikck.zy(C6220d.x2(minOf, 0))).doubleValue();
        n5r1 it = new kotlin.ranges.x2(1, C6144h.hmvj(minOf)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, selector.invoke(ikck.zy(C6220d.x2(minOf, it.nextInt()))).doubleValue());
        }
        return dDoubleValue;
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final <R> R te(int[] maxOfWithOrNull, Comparator<? super R> comparator, x2<? super gyi, ? extends R> selector) {
        d2ok.m23075h(maxOfWithOrNull, "$this$maxOfWithOrNull");
        d2ok.m23075h(comparator, "comparator");
        d2ok.m23075h(selector, "selector");
        if (dr.cdj(maxOfWithOrNull)) {
            return null;
        }
        R rInvoke = selector.invoke(gyi.zy(dr.x2(maxOfWithOrNull, 0)));
        n5r1 it = new kotlin.ranges.x2(1, C6144h.srpc(maxOfWithOrNull)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(gyi.zy(dr.x2(maxOfWithOrNull, it.nextInt())));
            if (comparator.compare(rInvoke, rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final long tfm(long[] component3) {
        d2ok.m23075h(component3, "$this$component3");
        return C6220d.x2(component3, 2);
    }

    @yz(version = "1.7")
    @InterfaceC6769y(name = "minOrThrow-U")
    @InterfaceC6232i
    public static final long thtw(@InterfaceC7396q long[] min) {
        d2ok.m23075h(min, "$this$min");
        if (C6220d.cdj(min)) {
            throw new NoSuchElementException();
        }
        long jX2 = C6220d.x2(min, 0);
        n5r1 it = new kotlin.ranges.x2(1, C6144h.hmvj(min)).iterator();
        while (it.hasNext()) {
            long jX22 = C6220d.x2(min, it.nextInt());
            if (Long.compareUnsigned(jX2, jX22) > 0) {
                jX2 = jX22;
            }
        }
        return jX2;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final short[] ti1(short[] toShortArray) {
        d2ok.m23075h(toShortArray, "$this$toShortArray");
        short[] sArrCopyOf = Arrays.copyOf(toShortArray, toShortArray.length);
        d2ok.kja0(sArrCopyOf, "copyOf(this, size)");
        return sArrCopyOf;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final ikck tjz5(long[] firstOrNull, x2<? super ikck, Boolean> predicate) {
        d2ok.m23075h(firstOrNull, "$this$firstOrNull");
        d2ok.m23075h(predicate, "predicate");
        int iN7h = C6220d.n7h(firstOrNull);
        for (int i2 = 0; i2 < iN7h; i2++) {
            long jX2 = C6220d.x2(firstOrNull, i2);
            if (predicate.invoke(ikck.zy(jX2)).booleanValue()) {
                return ikck.zy(jX2);
            }
        }
        return null;
    }

    @i9jn(markerClass = {ki.class})
    @InterfaceC7395n
    @yz(version = "1.4")
    @InterfaceC6232i
    public static final qo tn(@InterfaceC7396q short[] randomOrNull, @InterfaceC7396q AbstractC6332g random) {
        d2ok.m23075h(randomOrNull, "$this$randomOrNull");
        d2ok.m23075h(random, "random");
        if (tfm.cdj(randomOrNull)) {
            return null;
        }
        return qo.zy(tfm.x2(randomOrNull, random.nextInt(tfm.n7h(randomOrNull))));
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final List<C6227f<C6475u, C6475u>> tpq8(@InterfaceC7396q byte[] zip, @InterfaceC7396q byte[] other) {
        d2ok.m23075h(zip, "$this$zip");
        d2ok.m23075h(other, "other");
        int iMin = Math.min(bo.n7h(zip), bo.n7h(other));
        ArrayList arrayList = new ArrayList(iMin);
        for (int i2 = 0; i2 < iMin; i2++) {
            arrayList.add(nmn5.m23230k(C6475u.zy(bo.x2(zip, i2)), C6475u.zy(bo.x2(other, i2))));
        }
        return arrayList;
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final <R> List<C6227f<qo, R>> trap(@InterfaceC7396q short[] zip, @InterfaceC7396q Iterable<? extends R> other) {
        d2ok.m23075h(zip, "$this$zip");
        d2ok.m23075h(other, "other");
        int iN7h = tfm.n7h(zip);
        ArrayList arrayList = new ArrayList(Math.min(fu4.vyq(other, 10), iN7h));
        int i2 = 0;
        for (R r2 : other) {
            if (i2 >= iN7h) {
                break;
            }
            arrayList.add(nmn5.m23230k(qo.zy(tfm.x2(zip, i2)), r2));
            i2++;
        }
        return arrayList;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final long[] ts(long[] toLongArray) {
        d2ok.m23075h(toLongArray, "$this$toLongArray");
        long[] jArrCopyOf = Arrays.copyOf(toLongArray, toLongArray.length);
        d2ok.kja0(jArrCopyOf, "copyOf(this, size)");
        return jArrCopyOf;
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final Float tvn8(long[] maxOfOrNull, x2<? super ikck, Float> selector) {
        d2ok.m23075h(maxOfOrNull, "$this$maxOfOrNull");
        d2ok.m23075h(selector, "selector");
        if (C6220d.cdj(maxOfOrNull)) {
            return null;
        }
        float fFloatValue = selector.invoke(ikck.zy(C6220d.x2(maxOfOrNull, 0))).floatValue();
        n5r1 it = new kotlin.ranges.x2(1, C6144h.hmvj(maxOfOrNull)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, selector.invoke(ikck.zy(C6220d.x2(maxOfOrNull, it.nextInt()))).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final <C extends Collection<? super C6475u>> C tww7(byte[] filterNotTo, C destination, x2<? super C6475u, Boolean> predicate) {
        d2ok.m23075h(filterNotTo, "$this$filterNotTo");
        d2ok.m23075h(destination, "destination");
        d2ok.m23075h(predicate, "predicate");
        int iN7h = bo.n7h(filterNotTo);
        for (int i2 = 0; i2 < iN7h; i2++) {
            byte bX2 = bo.x2(filterNotTo, i2);
            if (!predicate.invoke(C6475u.zy(bX2)).booleanValue()) {
                destination.add(C6475u.zy(bX2));
            }
        }
        return destination;
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final <R extends Comparable<? super R>> C6475u twzk(byte[] minByOrNull, x2<? super C6475u, ? extends R> selector) {
        d2ok.m23075h(minByOrNull, "$this$minByOrNull");
        d2ok.m23075h(selector, "selector");
        if (bo.cdj(minByOrNull)) {
            return null;
        }
        byte bX2 = bo.x2(minByOrNull, 0);
        int iVl = C6144h.vl(minByOrNull);
        if (iVl == 0) {
            return C6475u.zy(bX2);
        }
        R rInvoke = selector.invoke(C6475u.zy(bX2));
        n5r1 it = new kotlin.ranges.x2(1, iVl).iterator();
        while (it.hasNext()) {
            byte bX22 = bo.x2(minByOrNull, it.nextInt());
            R rInvoke2 = selector.invoke(C6475u.zy(bX22));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                bX2 = bX22;
                rInvoke = rInvoke2;
            }
        }
        return C6475u.zy(bX2);
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    /* JADX INFO: renamed from: u */
    private static final <V> Map<qo, V> m22648u(short[] associateWith, x2<? super qo, ? extends V> valueSelector) {
        d2ok.m23075h(associateWith, "$this$associateWith");
        d2ok.m23075h(valueSelector, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(fn3e.fn3e(C6140e.m22479p(tfm.n7h(associateWith)), 16));
        int iN7h = tfm.n7h(associateWith);
        for (int i2 = 0; i2 < iN7h; i2++) {
            short sX2 = tfm.x2(associateWith, i2);
            linkedHashMap.put(qo.zy(sX2), valueSelector.invoke(qo.zy(sX2)));
        }
        return linkedHashMap;
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final double u0z(int[] maxOf, x2<? super gyi, Double> selector) {
        d2ok.m23075h(maxOf, "$this$maxOf");
        d2ok.m23075h(selector, "selector");
        if (dr.cdj(maxOf)) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(gyi.zy(dr.x2(maxOf, 0))).doubleValue();
        n5r1 it = new kotlin.ranges.x2(1, C6144h.srpc(maxOf)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, selector.invoke(gyi.zy(dr.x2(maxOf, it.nextInt()))).doubleValue());
        }
        return dDoubleValue;
    }

    public static /* synthetic */ void u38j(short[] sArr, short s2, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = tfm.n7h(sArr);
        }
        m2t(sArr, s2, i2, i3);
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final boolean u3gu(short[] none) {
        d2ok.m23075h(none, "$this$none");
        return tfm.cdj(none);
    }

    @InterfaceC7395n
    @yz(version = "1.4")
    @InterfaceC6232i
    public static final ikck u4(@InterfaceC7396q long[] minWithOrNull, @InterfaceC7396q Comparator<? super ikck> comparator) {
        d2ok.m23075h(minWithOrNull, "$this$minWithOrNull");
        d2ok.m23075h(comparator, "comparator");
        if (C6220d.cdj(minWithOrNull)) {
            return null;
        }
        long jX2 = C6220d.x2(minWithOrNull, 0);
        n5r1 it = new kotlin.ranges.x2(1, C6144h.hmvj(minWithOrNull)).iterator();
        while (it.hasNext()) {
            long jX22 = C6220d.x2(minWithOrNull, it.nextInt());
            if (comparator.compare(ikck.zy(jX2), ikck.zy(jX22)) > 0) {
                jX2 = jX22;
            }
        }
        return ikck.zy(jX2);
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final long[] uc(long[] copyOf, int i2) {
        d2ok.m23075h(copyOf, "$this$copyOf");
        long[] jArrCopyOf = Arrays.copyOf(copyOf, i2);
        d2ok.kja0(jArrCopyOf, "copyOf(this, newSize)");
        return C6220d.m22779g(jArrCopyOf);
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final Float ue(long[] minOfOrNull, x2<? super ikck, Float> selector) {
        d2ok.m23075h(minOfOrNull, "$this$minOfOrNull");
        d2ok.m23075h(selector, "selector");
        if (C6220d.cdj(minOfOrNull)) {
            return null;
        }
        float fFloatValue = selector.invoke(ikck.zy(C6220d.x2(minOfOrNull, 0))).floatValue();
        n5r1 it = new kotlin.ranges.x2(1, C6144h.hmvj(minOfOrNull)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, selector.invoke(ikck.zy(C6220d.x2(minOfOrNull, it.nextInt()))).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final <R> R uew(byte[] maxOfWith, Comparator<? super R> comparator, x2<? super C6475u, ? extends R> selector) {
        d2ok.m23075h(maxOfWith, "$this$maxOfWith");
        d2ok.m23075h(comparator, "comparator");
        d2ok.m23075h(selector, "selector");
        if (bo.cdj(maxOfWith)) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(C6475u.zy(bo.x2(maxOfWith, 0)));
        n5r1 it = new kotlin.ranges.x2(1, C6144h.vl(maxOfWith)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(C6475u.zy(bo.x2(maxOfWith, it.nextInt())));
            if (comparator.compare(rInvoke, rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final List<C6475u> uf(byte[] filter, x2<? super C6475u, Boolean> predicate) {
        d2ok.m23075h(filter, "$this$filter");
        d2ok.m23075h(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int iN7h = bo.n7h(filter);
        for (int i2 = 0; i2 < iN7h; i2++) {
            byte bX2 = bo.x2(filter, i2);
            if (predicate.invoke(C6475u.zy(bX2)).booleanValue()) {
                arrayList.add(C6475u.zy(bX2));
            }
        }
        return arrayList;
    }

    @yz(version = "1.4")
    @InterfaceC6232i
    public static final void uia(@InterfaceC7396q int[] shuffle) {
        d2ok.m23075h(shuffle, "$this$shuffle");
        yw7(shuffle, AbstractC6332g.Default);
    }

    static /* synthetic */ short[] uj2j(short[] copyInto, short[] destination, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i2 = 0;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = tfm.n7h(copyInto);
        }
        d2ok.m23075h(copyInto, "$this$copyInto");
        d2ok.m23075h(destination, "destination");
        kja0.m22510d(copyInto, destination, i2, i3, i4);
        return destination;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final short[] ukdy(short[] copyOfRange, int i2, int i3) {
        d2ok.m23075h(copyOfRange, "$this$copyOfRange");
        return tfm.m23651g(kja0.cv06(copyOfRange, i2, i3));
    }

    @i9jn(markerClass = {ki.class})
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final <R> List<R> ul(byte[] scanIndexed, R r2, cdj<? super Integer, ? super R, ? super C6475u, ? extends R> operation) {
        d2ok.m23075h(scanIndexed, "$this$scanIndexed");
        d2ok.m23075h(operation, "operation");
        if (bo.cdj(scanIndexed)) {
            return zurt.ld6(r2);
        }
        ArrayList arrayList = new ArrayList(bo.n7h(scanIndexed) + 1);
        arrayList.add(r2);
        int iN7h = bo.n7h(scanIndexed);
        for (int i2 = 0; i2 < iN7h; i2++) {
            r2 = operation.invoke(Integer.valueOf(i2), r2, C6475u.zy(bo.x2(scanIndexed, i2)));
            arrayList.add(r2);
        }
        return arrayList;
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final <R> List<R> ula6(short[] flatMapIndexed, InterfaceC5979h<? super Integer, ? super qo, ? extends Iterable<? extends R>> transform) {
        d2ok.m23075h(flatMapIndexed, "$this$flatMapIndexed");
        d2ok.m23075h(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int iN7h = tfm.n7h(flatMapIndexed);
        int i2 = 0;
        int i3 = 0;
        while (i2 < iN7h) {
            C6163t.zp(arrayList, transform.invoke(Integer.valueOf(i3), qo.zy(tfm.x2(flatMapIndexed, i2))));
            i2++;
            i3++;
        }
        return arrayList;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final int um(int[] sum) {
        d2ok.m23075h(sum, "$this$sum");
        return gyi.ld6(C6144h.krlr(sum));
    }

    @i9jn(markerClass = {ki.class})
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final gyi ume(int[] reduceRightOrNull, InterfaceC5979h<? super gyi, ? super gyi, gyi> operation) {
        d2ok.m23075h(reduceRightOrNull, "$this$reduceRightOrNull");
        d2ok.m23075h(operation, "operation");
        int iSrpc = C6144h.srpc(reduceRightOrNull);
        if (iSrpc < 0) {
            return null;
        }
        int iX2 = dr.x2(reduceRightOrNull, iSrpc);
        for (int i2 = iSrpc - 1; i2 >= 0; i2--) {
            iX2 = operation.invoke(gyi.zy(dr.x2(reduceRightOrNull, i2)), gyi.zy(iX2)).a98o();
        }
        return gyi.zy(iX2);
    }

    @i9jn(markerClass = {ki.class})
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final ikck un3l(long[] reduceRightOrNull, InterfaceC5979h<? super ikck, ? super ikck, ikck> operation) {
        d2ok.m23075h(reduceRightOrNull, "$this$reduceRightOrNull");
        d2ok.m23075h(operation, "operation");
        int iHmvj = C6144h.hmvj(reduceRightOrNull);
        if (iHmvj < 0) {
            return null;
        }
        long jX2 = C6220d.x2(reduceRightOrNull, iHmvj);
        for (int i2 = iHmvj - 1; i2 >= 0; i2--) {
            jX2 = operation.invoke(ikck.zy(C6220d.x2(reduceRightOrNull, i2)), ikck.zy(jX2)).a98o();
        }
        return ikck.zy(jX2);
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final short[] unv(short[] plus, short s2) {
        d2ok.m23075h(plus, "$this$plus");
        return tfm.m23651g(kja0.z5(plus, s2));
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final <R> List<R> uo(int[] flatMapIndexed, InterfaceC5979h<? super Integer, ? super gyi, ? extends Iterable<? extends R>> transform) {
        d2ok.m23075h(flatMapIndexed, "$this$flatMapIndexed");
        d2ok.m23075h(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int iN7h = dr.n7h(flatMapIndexed);
        int i2 = 0;
        int i3 = 0;
        while (i2 < iN7h) {
            C6163t.zp(arrayList, transform.invoke(Integer.valueOf(i3), gyi.zy(dr.x2(flatMapIndexed, i2))));
            i2++;
            i3++;
        }
        return arrayList;
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final byte[] urz8(@InterfaceC7396q byte[] sliceArray, @InterfaceC7396q Collection<Integer> indices) {
        d2ok.m23075h(sliceArray, "$this$sliceArray");
        d2ok.m23075h(indices, "indices");
        return bo.m22412g(C6144h.aix(sliceArray, indices));
    }

    @InterfaceC7396q
    public static final kotlin.ranges.x2 uv(@InterfaceC7396q long[] indices) {
        d2ok.m23075h(indices, "$this$indices");
        return C6144h.whyb(indices);
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final boolean uv6(long[] all, x2<? super ikck, Boolean> predicate) {
        d2ok.m23075h(all, "$this$all");
        d2ok.m23075h(predicate, "predicate");
        int iN7h = C6220d.n7h(all);
        for (int i2 = 0; i2 < iN7h; i2++) {
            if (!predicate.invoke(ikck.zy(C6220d.x2(all, i2))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    /* JADX INFO: renamed from: v */
    private static final long m22649v(long[] component1) {
        d2ok.m23075h(component1, "$this$component1");
        return C6220d.x2(component1, 0);
    }

    @yz(version = "1.4")
    @InterfaceC6232i
    public static boolean v0af(@InterfaceC7395n byte[] bArr, @InterfaceC7395n byte[] bArr2) {
        if (bArr == null) {
            bArr = null;
        }
        if (bArr2 == null) {
            bArr2 = null;
        }
        return Arrays.equals(bArr, bArr2);
    }

    @kotlin.x2(warningSince = "1.5")
    @InterfaceC6234g
    @ld6(message = "Use sumOf instead.", replaceWith = @hb(expression = "this.sumOf(selector)", imports = {}))
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final double v0wk(short[] sumByDouble, x2<? super qo, Double> selector) {
        d2ok.m23075h(sumByDouble, "$this$sumByDouble");
        d2ok.m23075h(selector, "selector");
        int iN7h = tfm.n7h(sumByDouble);
        double dDoubleValue = 0.0d;
        for (int i2 = 0; i2 < iN7h; i2++) {
            dDoubleValue += selector.invoke(qo.zy(tfm.x2(sumByDouble, i2))).doubleValue();
        }
        return dDoubleValue;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final int[] v1(int[] reversedArray) {
        d2ok.m23075h(reversedArray, "$this$reversedArray");
        return dr.m22802g(C6144h.dota(reversedArray));
    }

    @yz(version = "1.4")
    @InterfaceC6232i
    public static final void v2t(@InterfaceC7396q int[] sortDescending, int i2, int i3) {
        d2ok.m23075h(sortDescending, "$this$sortDescending");
        hql(sortDescending, i2, i3);
        C6144h.tm(sortDescending, i2, i3);
    }

    public static /* synthetic */ void v5yj(long[] jArr, long j2, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = C6220d.n7h(jArr);
        }
        ps(jArr, j2, i2, i3);
    }

    @yz(version = "1.3")
    @InterfaceC6232i
    public static /* synthetic */ void vahq(long[] jArr) {
    }

    public static final int vc(@InterfaceC7396q short[] lastIndex) {
        d2ok.m23075h(lastIndex, "$this$lastIndex");
        return C6144h.orxw(lastIndex);
    }

    @yz(version = "1.7")
    @InterfaceC6769y(name = "minOrThrow-U")
    @InterfaceC6232i
    public static final int vd(@InterfaceC7396q int[] min) {
        d2ok.m23075h(min, "$this$min");
        if (dr.cdj(min)) {
            throw new NoSuchElementException();
        }
        int iX2 = dr.x2(min, 0);
        n5r1 it = new kotlin.ranges.x2(1, C6144h.srpc(min)).iterator();
        while (it.hasNext()) {
            int iX22 = dr.x2(min, it.nextInt());
            if (Integer.compareUnsigned(iX2, iX22) > 0) {
                iX2 = iX22;
            }
        }
        return iX2;
    }

    @yz(version = "1.3")
    @InterfaceC6232i
    public static /* synthetic */ void vddr(int[] iArr) {
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final byte[] vep5(byte[] copyOf, int i2) {
        d2ok.m23075h(copyOf, "$this$copyOf");
        byte[] bArrCopyOf = Arrays.copyOf(copyOf, i2);
        d2ok.kja0(bArrCopyOf, "copyOf(this, newSize)");
        return bo.m22412g(bArrCopyOf);
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final <K> Map<K, List<gyi>> verb(int[] groupBy, x2<? super gyi, ? extends K> keySelector) {
        d2ok.m23075h(groupBy, "$this$groupBy");
        d2ok.m23075h(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int iN7h = dr.n7h(groupBy);
        for (int i2 = 0; i2 < iN7h; i2++) {
            int iX2 = dr.x2(groupBy, i2);
            K kInvoke = keySelector.invoke(gyi.zy(iX2));
            Object arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(gyi.zy(iX2));
        }
        return linkedHashMap;
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final double vf(byte[] minOf, x2<? super C6475u, Double> selector) {
        d2ok.m23075h(minOf, "$this$minOf");
        d2ok.m23075h(selector, "selector");
        if (bo.cdj(minOf)) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(C6475u.zy(bo.x2(minOf, 0))).doubleValue();
        n5r1 it = new kotlin.ranges.x2(1, C6144h.vl(minOf)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, selector.invoke(C6475u.zy(bo.x2(minOf, it.nextInt()))).doubleValue());
        }
        return dDoubleValue;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final void vg(byte[] forEach, x2<? super C6475u, was> action) {
        d2ok.m23075h(forEach, "$this$forEach");
        d2ok.m23075h(action, "action");
        int iN7h = bo.n7h(forEach);
        for (int i2 = 0; i2 < iN7h; i2++) {
            action.invoke(C6475u.zy(bo.x2(forEach, i2)));
        }
    }

    @yz(version = "1.3")
    @InterfaceC6232i
    public static /* synthetic */ void vh(short[] sArr) {
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final void vibj(byte[] reverse, int i2, int i3) {
        d2ok.m23075h(reverse, "$this$reverse");
        C6144h.vx(reverse, i2, i3);
    }

    @kotlin.x2(warningSince = "1.5")
    @InterfaceC6234g
    @ld6(message = "Use sumOf instead.", replaceWith = @hb(expression = "this.sumOf(selector)", imports = {}))
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final int vm(long[] sumBy, x2<? super ikck, gyi> selector) {
        d2ok.m23075h(sumBy, "$this$sumBy");
        d2ok.m23075h(selector, "selector");
        int iN7h = C6220d.n7h(sumBy);
        int iLd6 = 0;
        for (int i2 = 0; i2 < iN7h; i2++) {
            iLd6 = gyi.ld6(iLd6 + selector.invoke(ikck.zy(C6220d.x2(sumBy, i2))).a98o());
        }
        return iLd6;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final long vq(long[] component2) {
        d2ok.m23075h(component2, "$this$component2");
        return C6220d.x2(component2, 1);
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final qo vss1(short[] firstOrNull, x2<? super qo, Boolean> predicate) {
        d2ok.m23075h(firstOrNull, "$this$firstOrNull");
        d2ok.m23075h(predicate, "predicate");
        int iN7h = tfm.n7h(firstOrNull);
        for (int i2 = 0; i2 < iN7h; i2++) {
            short sX2 = tfm.x2(firstOrNull, i2);
            if (predicate.invoke(qo.zy(sX2)).booleanValue()) {
                return qo.zy(sX2);
            }
        }
        return null;
    }

    @yz(version = "1.4")
    @InterfaceC6232i
    public static final void vt4y(@InterfaceC7396q byte[] shuffle, @InterfaceC7396q AbstractC6332g random) {
        d2ok.m23075h(shuffle, "$this$shuffle");
        d2ok.m23075h(random, "random");
        for (int iVl = C6144h.vl(shuffle); iVl > 0; iVl--) {
            int iNextInt = random.nextInt(iVl + 1);
            byte bX2 = bo.x2(shuffle, iVl);
            bo.m22414i(shuffle, iVl, bo.x2(shuffle, iNextInt));
            bo.m22414i(shuffle, iNextInt, bX2);
        }
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6769y(name = "sumOfLong")
    @InterfaceC6232i
    private static final long vu6(short[] sumOf, x2<? super qo, Long> selector) {
        d2ok.m23075h(sumOf, "$this$sumOf");
        d2ok.m23075h(selector, "selector");
        int iN7h = tfm.n7h(sumOf);
        long jLongValue = 0;
        for (int i2 = 0; i2 < iN7h; i2++) {
            jLongValue += selector.invoke(qo.zy(tfm.x2(sumOf, i2))).longValue();
        }
        return jLongValue;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final long vwb(long[] first) {
        d2ok.m23075h(first, "$this$first");
        return ikck.ld6(C6144h.i8fu(first));
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final List<gyi> vy(int[] dropLastWhile, x2<? super gyi, Boolean> predicate) {
        d2ok.m23075h(dropLastWhile, "$this$dropLastWhile");
        d2ok.m23075h(predicate, "predicate");
        for (int iSrpc = C6144h.srpc(dropLastWhile); -1 < iSrpc; iSrpc--) {
            if (!predicate.invoke(gyi.zy(dr.x2(dropLastWhile, iSrpc))).booleanValue()) {
                return pd(dropLastWhile, iSrpc + 1);
            }
        }
        return ni7.a9();
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final <R> List<R> vymi(byte[] map, x2<? super C6475u, ? extends R> transform) {
        d2ok.m23075h(map, "$this$map");
        d2ok.m23075h(transform, "transform");
        ArrayList arrayList = new ArrayList(bo.n7h(map));
        int iN7h = bo.n7h(map);
        for (int i2 = 0; i2 < iN7h; i2++) {
            arrayList.add(transform.invoke(C6475u.zy(bo.x2(map, i2))));
        }
        return arrayList;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final boolean vyq(int[] all, x2<? super gyi, Boolean> predicate) {
        d2ok.m23075h(all, "$this$all");
        d2ok.m23075h(predicate, "predicate");
        int iN7h = dr.n7h(all);
        for (int i2 = 0; i2 < iN7h; i2++) {
            if (!predicate.invoke(gyi.zy(dr.x2(all, i2))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @kotlin.x2(warningSince = "1.5")
    @InterfaceC6234g
    @ld6(message = "Use sumOf instead.", replaceWith = @hb(expression = "this.sumOf(selector)", imports = {}))
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final double vz(long[] sumByDouble, x2<? super ikck, Double> selector) {
        d2ok.m23075h(sumByDouble, "$this$sumByDouble");
        d2ok.m23075h(selector, "selector");
        int iN7h = C6220d.n7h(sumByDouble);
        double dDoubleValue = 0.0d;
        for (int i2 = 0; i2 < iN7h; i2++) {
            dDoubleValue += selector.invoke(ikck.zy(C6220d.x2(sumByDouble, i2))).doubleValue();
        }
        return dDoubleValue;
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m22650w(int[] iArr, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i3 = 0;
        }
        if ((i5 & 4) != 0) {
            i4 = dr.n7h(iArr);
        }
        kx3(iArr, i2, i3, i4);
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final <R extends Comparable<? super R>> R w0(byte[] minOf, x2<? super C6475u, ? extends R> selector) {
        d2ok.m23075h(minOf, "$this$minOf");
        d2ok.m23075h(selector, "selector");
        if (bo.cdj(minOf)) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(C6475u.zy(bo.x2(minOf, 0)));
        n5r1 it = new kotlin.ranges.x2(1, C6144h.vl(minOf)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(C6475u.zy(bo.x2(minOf, it.nextInt())));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final long w0qe(long[] reduceRight, InterfaceC5979h<? super ikck, ? super ikck, ikck> operation) {
        d2ok.m23075h(reduceRight, "$this$reduceRight");
        d2ok.m23075h(operation, "operation");
        int iHmvj = C6144h.hmvj(reduceRight);
        if (iHmvj < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        long jX2 = C6220d.x2(reduceRight, iHmvj);
        for (int i2 = iHmvj - 1; i2 >= 0; i2--) {
            jX2 = operation.invoke(ikck.zy(C6220d.x2(reduceRight, i2)), ikck.zy(jX2)).a98o();
        }
        return jX2;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final <V> List<V> w1q6(byte[] zip, byte[] other, InterfaceC5979h<? super C6475u, ? super C6475u, ? extends V> transform) {
        d2ok.m23075h(zip, "$this$zip");
        d2ok.m23075h(other, "other");
        d2ok.m23075h(transform, "transform");
        int iMin = Math.min(bo.n7h(zip), bo.n7h(other));
        ArrayList arrayList = new ArrayList(iMin);
        for (int i2 = 0; i2 < iMin; i2++) {
            arrayList.add(transform.invoke(C6475u.zy(bo.x2(zip, i2)), C6475u.zy(bo.x2(other, i2))));
        }
        return arrayList;
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final float w2bz(long[] minOf, x2<? super ikck, Float> selector) {
        d2ok.m23075h(minOf, "$this$minOf");
        d2ok.m23075h(selector, "selector");
        if (C6220d.cdj(minOf)) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(ikck.zy(C6220d.x2(minOf, 0))).floatValue();
        n5r1 it = new kotlin.ranges.x2(1, C6144h.hmvj(minOf)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, selector.invoke(ikck.zy(C6220d.x2(minOf, it.nextInt()))).floatValue());
        }
        return fFloatValue;
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final float w6w4(short[] minOf, x2<? super qo, Float> selector) {
        d2ok.m23075h(minOf, "$this$minOf");
        d2ok.m23075h(selector, "selector");
        if (tfm.cdj(minOf)) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(qo.zy(tfm.x2(minOf, 0))).floatValue();
        n5r1 it = new kotlin.ranges.x2(1, C6144h.orxw(minOf)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, selector.invoke(qo.zy(tfm.x2(minOf, it.nextInt()))).floatValue());
        }
        return fFloatValue;
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final short[] w7(@InterfaceC7396q short[] sliceArray, @InterfaceC7396q kotlin.ranges.x2 indices) {
        d2ok.m23075h(sliceArray, "$this$sliceArray");
        d2ok.m23075h(indices, "indices");
        return tfm.m23651g(C6144h.tzg(sliceArray, indices));
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final ikck w8(long[] reduceRightIndexedOrNull, cdj<? super Integer, ? super ikck, ? super ikck, ikck> operation) {
        d2ok.m23075h(reduceRightIndexedOrNull, "$this$reduceRightIndexedOrNull");
        d2ok.m23075h(operation, "operation");
        int iHmvj = C6144h.hmvj(reduceRightIndexedOrNull);
        if (iHmvj < 0) {
            return null;
        }
        long jX2 = C6220d.x2(reduceRightIndexedOrNull, iHmvj);
        for (int i2 = iHmvj - 1; i2 >= 0; i2--) {
            jX2 = operation.invoke(Integer.valueOf(i2), ikck.zy(C6220d.x2(reduceRightIndexedOrNull, i2)), ikck.zy(jX2)).a98o();
        }
        return ikck.zy(jX2);
    }

    public static /* synthetic */ void w82(byte[] bArr, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = bo.n7h(bArr);
        }
        c4my(bArr, i2, i3);
    }

    @yz(version = "1.4")
    @InterfaceC6232i
    public static final int w831(@InterfaceC7395n short[] sArr) {
        if (sArr == null) {
            sArr = null;
        }
        return Arrays.hashCode(sArr);
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final List<qo> w8w(@InterfaceC7396q short[] sorted) {
        d2ok.m23075h(sorted, "$this$sorted");
        short[] sArrCopyOf = Arrays.copyOf(sorted, sorted.length);
        d2ok.kja0(sArrCopyOf, "copyOf(this, size)");
        short[] sArrM23651g = tfm.m23651g(sArrCopyOf);
        jrla(sArrM23651g);
        return kotlin.collections.unsigned.toq.m22627q(sArrM23651g);
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final long was(long[] component4) {
        d2ok.m23075h(component4, "$this$component4");
        return C6220d.x2(component4, 3);
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final C6475u wd(byte[] reduceRightIndexedOrNull, cdj<? super Integer, ? super C6475u, ? super C6475u, C6475u> operation) {
        d2ok.m23075h(reduceRightIndexedOrNull, "$this$reduceRightIndexedOrNull");
        d2ok.m23075h(operation, "operation");
        int iVl = C6144h.vl(reduceRightIndexedOrNull);
        if (iVl < 0) {
            return null;
        }
        byte bX2 = bo.x2(reduceRightIndexedOrNull, iVl);
        for (int i2 = iVl - 1; i2 >= 0; i2--) {
            bX2 = operation.invoke(Integer.valueOf(i2), C6475u.zy(bo.x2(reduceRightIndexedOrNull, i2)), C6475u.zy(bX2)).bf2();
        }
        return C6475u.zy(bX2);
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final <R extends Comparable<? super R>> gyi wen(int[] maxByOrNull, x2<? super gyi, ? extends R> selector) {
        d2ok.m23075h(maxByOrNull, "$this$maxByOrNull");
        d2ok.m23075h(selector, "selector");
        if (dr.cdj(maxByOrNull)) {
            return null;
        }
        int iX2 = dr.x2(maxByOrNull, 0);
        int iSrpc = C6144h.srpc(maxByOrNull);
        if (iSrpc == 0) {
            return gyi.zy(iX2);
        }
        R rInvoke = selector.invoke(gyi.zy(iX2));
        n5r1 it = new kotlin.ranges.x2(1, iSrpc).iterator();
        while (it.hasNext()) {
            int iX22 = dr.x2(maxByOrNull, it.nextInt());
            R rInvoke2 = selector.invoke(gyi.zy(iX22));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                iX2 = iX22;
                rInvoke = rInvoke2;
            }
        }
        return gyi.zy(iX2);
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final qo wh(short[] lastOrNull, x2<? super qo, Boolean> predicate) {
        d2ok.m23075h(lastOrNull, "$this$lastOrNull");
        d2ok.m23075h(predicate, "predicate");
        int iN7h = tfm.n7h(lastOrNull) - 1;
        if (iN7h < 0) {
            return null;
        }
        while (true) {
            int i2 = iN7h - 1;
            short sX2 = tfm.x2(lastOrNull, iN7h);
            if (predicate.invoke(qo.zy(sX2)).booleanValue()) {
                return qo.zy(sX2);
            }
            if (i2 < 0) {
                return null;
            }
            iN7h = i2;
        }
    }

    @yz(version = "1.4")
    @InterfaceC6232i
    public static final void wk(@InterfaceC7396q short[] sort, int i2, int i3) {
        d2ok.m23075h(sort, "$this$sort");
        kotlin.collections.zy.Companion.m22683q(i2, i3, tfm.n7h(sort));
        kotlin.collections.lv5.ld6(sort, i2, i3);
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final <R, C extends Collection<? super R>> C wkrb(long[] mapIndexedTo, C destination, InterfaceC5979h<? super Integer, ? super ikck, ? extends R> transform) {
        d2ok.m23075h(mapIndexedTo, "$this$mapIndexedTo");
        d2ok.m23075h(destination, "destination");
        d2ok.m23075h(transform, "transform");
        int iN7h = C6220d.n7h(mapIndexedTo);
        int i2 = 0;
        int i3 = 0;
        while (i2 < iN7h) {
            destination.add(transform.invoke(Integer.valueOf(i3), ikck.zy(C6220d.x2(mapIndexedTo, i2))));
            i2++;
            i3++;
        }
        return destination;
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final List<gyi> wlev(@InterfaceC7396q int[] dropLast, int i2) {
        d2ok.m23075h(dropLast, "$this$dropLast");
        if (i2 >= 0) {
            return pd(dropLast, fn3e.fn3e(dr.n7h(dropLast) - i2, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final short wo(short[] component3) {
        d2ok.m23075h(component3, "$this$component3");
        return tfm.x2(component3, 2);
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final List<ikck> wq(long[] runningReduce, InterfaceC5979h<? super ikck, ? super ikck, ikck> operation) {
        d2ok.m23075h(runningReduce, "$this$runningReduce");
        d2ok.m23075h(operation, "operation");
        if (C6220d.cdj(runningReduce)) {
            return ni7.a9();
        }
        long jX2 = C6220d.x2(runningReduce, 0);
        ArrayList arrayList = new ArrayList(C6220d.n7h(runningReduce));
        arrayList.add(ikck.zy(jX2));
        int iN7h = C6220d.n7h(runningReduce);
        for (int i2 = 1; i2 < iN7h; i2++) {
            jX2 = operation.invoke(ikck.zy(jX2), ikck.zy(C6220d.x2(runningReduce, i2))).a98o();
            arrayList.add(ikck.zy(jX2));
        }
        return arrayList;
    }

    @InterfaceC6234g
    @yz(version = "1.7")
    @InterfaceC6769y(name = "minByOrThrow-U")
    @InterfaceC6232i
    private static final <R extends Comparable<? super R>> long wqg(long[] minBy, x2<? super ikck, ? extends R> selector) {
        d2ok.m23075h(minBy, "$this$minBy");
        d2ok.m23075h(selector, "selector");
        if (C6220d.cdj(minBy)) {
            throw new NoSuchElementException();
        }
        long jX2 = C6220d.x2(minBy, 0);
        int iHmvj = C6144h.hmvj(minBy);
        if (iHmvj == 0) {
            return jX2;
        }
        R rInvoke = selector.invoke(ikck.zy(jX2));
        n5r1 it = new kotlin.ranges.x2(1, iHmvj).iterator();
        while (it.hasNext()) {
            long jX22 = C6220d.x2(minBy, it.nextInt());
            R rInvoke2 = selector.invoke(ikck.zy(jX22));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                jX2 = jX22;
                rInvoke = rInvoke2;
            }
        }
        return jX2;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final C6475u wqp(byte[] lastOrNull, x2<? super C6475u, Boolean> predicate) {
        d2ok.m23075h(lastOrNull, "$this$lastOrNull");
        d2ok.m23075h(predicate, "predicate");
        int iN7h = bo.n7h(lastOrNull) - 1;
        if (iN7h < 0) {
            return null;
        }
        while (true) {
            int i2 = iN7h - 1;
            byte bX2 = bo.x2(lastOrNull, iN7h);
            if (predicate.invoke(C6475u.zy(bX2)).booleanValue()) {
                return C6475u.zy(bX2);
            }
            if (i2 < 0) {
                return null;
            }
            iN7h = i2;
        }
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final <R extends Comparable<? super R>> R wr(int[] maxOf, x2<? super gyi, ? extends R> selector) {
        d2ok.m23075h(maxOf, "$this$maxOf");
        d2ok.m23075h(selector, "selector");
        if (dr.cdj(maxOf)) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(gyi.zy(dr.x2(maxOf, 0)));
        n5r1 it = new kotlin.ranges.x2(1, C6144h.srpc(maxOf)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(gyi.zy(dr.x2(maxOf, it.nextInt())));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final List<gyi> wt(int[] filterNot, x2<? super gyi, Boolean> predicate) {
        d2ok.m23075h(filterNot, "$this$filterNot");
        d2ok.m23075h(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int iN7h = dr.n7h(filterNot);
        for (int i2 = 0; i2 < iN7h; i2++) {
            int iX2 = dr.x2(filterNot, i2);
            if (!predicate.invoke(gyi.zy(iX2)).booleanValue()) {
                arrayList.add(gyi.zy(iX2));
            }
        }
        return arrayList;
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final List<gyi> wtds(@InterfaceC7396q int[] slice, @InterfaceC7396q kotlin.ranges.x2 indices) {
        d2ok.m23075h(slice, "$this$slice");
        d2ok.m23075h(indices, "indices");
        return indices.isEmpty() ? ni7.a9() : kotlin.collections.unsigned.toq.m22623k(dr.m22802g(kja0.ktq(slice, indices.mo2951k().intValue(), indices.zy().intValue() + 1)));
    }

    @yz(version = "1.7")
    @InterfaceC6769y(name = "maxWithOrThrow-U")
    @InterfaceC6232i
    public static final int wtm(@InterfaceC7396q int[] maxWith, @InterfaceC7396q Comparator<? super gyi> comparator) {
        d2ok.m23075h(maxWith, "$this$maxWith");
        d2ok.m23075h(comparator, "comparator");
        if (dr.cdj(maxWith)) {
            throw new NoSuchElementException();
        }
        int iX2 = dr.x2(maxWith, 0);
        n5r1 it = new kotlin.ranges.x2(1, C6144h.srpc(maxWith)).iterator();
        while (it.hasNext()) {
            int iX22 = dr.x2(maxWith, it.nextInt());
            if (comparator.compare(gyi.zy(iX2), gyi.zy(iX22)) < 0) {
                iX2 = iX22;
            }
        }
        return iX2;
    }

    @InterfaceC7395n
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final gyi wtop(@InterfaceC7396q int[] firstOrNull) {
        d2ok.m23075h(firstOrNull, "$this$firstOrNull");
        if (dr.cdj(firstOrNull)) {
            return null;
        }
        return gyi.zy(dr.x2(firstOrNull, 0));
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final <K, M extends Map<? super K, List<ikck>>> M wu(long[] groupByTo, M destination, x2<? super ikck, ? extends K> keySelector) {
        d2ok.m23075h(groupByTo, "$this$groupByTo");
        d2ok.m23075h(destination, "destination");
        d2ok.m23075h(keySelector, "keySelector");
        int iN7h = C6220d.n7h(groupByTo);
        for (int i2 = 0; i2 < iN7h; i2++) {
            long jX2 = C6220d.x2(groupByTo, i2);
            K kInvoke = keySelector.invoke(ikck.zy(jX2));
            Object arrayList = destination.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(ikck.zy(jX2));
        }
        return destination;
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final List<qo> wu7(@InterfaceC7396q short[] take, int i2) {
        d2ok.m23075h(take, "$this$take");
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
        }
        if (i2 == 0) {
            return ni7.a9();
        }
        if (i2 >= tfm.n7h(take)) {
            return a9.wr(tfm.toq(take));
        }
        if (i2 == 1) {
            return zurt.ld6(qo.zy(tfm.x2(take, 0)));
        }
        ArrayList arrayList = new ArrayList(i2);
        int iN7h = tfm.n7h(take);
        int i3 = 0;
        for (int i4 = 0; i4 < iN7h; i4++) {
            arrayList.add(qo.zy(tfm.x2(take, i4)));
            i3++;
            if (i3 == i2) {
                break;
            }
        }
        return arrayList;
    }

    @InterfaceC7395n
    @yz(version = "1.4")
    @InterfaceC6232i
    public static final C6475u wutb(@InterfaceC7396q byte[] minOrNull) {
        d2ok.m23075h(minOrNull, "$this$minOrNull");
        if (bo.cdj(minOrNull)) {
            return null;
        }
        byte bX2 = bo.x2(minOrNull, 0);
        n5r1 it = new kotlin.ranges.x2(1, C6144h.vl(minOrNull)).iterator();
        while (it.hasNext()) {
            byte bX22 = bo.x2(minOrNull, it.nextInt());
            if (d2ok.m23076i(bX2 & 255, bX22 & 255) > 0) {
                bX2 = bX22;
            }
        }
        return C6475u.zy(bX2);
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final byte[] wvka(byte[] bArr) {
        d2ok.m23075h(bArr, "<this>");
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        d2ok.kja0(bArrCopyOf, "copyOf(this, size)");
        return bo.m22412g(bArrCopyOf);
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final <R, C extends Collection<? super R>> C wwp(int[] flatMapIndexedTo, C destination, InterfaceC5979h<? super Integer, ? super gyi, ? extends Iterable<? extends R>> transform) {
        d2ok.m23075h(flatMapIndexedTo, "$this$flatMapIndexedTo");
        d2ok.m23075h(destination, "destination");
        d2ok.m23075h(transform, "transform");
        int iN7h = dr.n7h(flatMapIndexedTo);
        int i2 = 0;
        int i3 = 0;
        while (i2 < iN7h) {
            C6163t.zp(destination, transform.invoke(Integer.valueOf(i3), gyi.zy(dr.x2(flatMapIndexedTo, i2))));
            i2++;
            i3++;
        }
        return destination;
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final int[] wwr9(@InterfaceC7396q int[] sortedArray) {
        d2ok.m23075h(sortedArray, "$this$sortedArray");
        if (dr.cdj(sortedArray)) {
            return sortedArray;
        }
        int[] iArrCopyOf = Arrays.copyOf(sortedArray, sortedArray.length);
        d2ok.kja0(iArrCopyOf, "copyOf(this, size)");
        int[] iArrM22802g = dr.m22802g(iArrCopyOf);
        ceo(iArrM22802g);
        return iArrM22802g;
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final List<C6475u> wx(@InterfaceC7396q byte[] slice, @InterfaceC7396q Iterable<Integer> indices) {
        d2ok.m23075h(slice, "$this$slice");
        d2ok.m23075h(indices, "indices");
        int iVyq = fu4.vyq(indices, 10);
        if (iVyq == 0) {
            return ni7.a9();
        }
        ArrayList arrayList = new ArrayList(iVyq);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(C6475u.zy(bo.x2(slice, it.next().intValue())));
        }
        return arrayList;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final short[] wx16(short[] copyOf) {
        d2ok.m23075h(copyOf, "$this$copyOf");
        short[] sArrCopyOf = Arrays.copyOf(copyOf, copyOf.length);
        d2ok.kja0(sArrCopyOf, "copyOf(this, size)");
        return tfm.m23651g(sArrCopyOf);
    }

    @yz(version = "1.4")
    @InterfaceC6232i
    public static final void wy(@InterfaceC7396q byte[] shuffle) {
        d2ok.m23075h(shuffle, "$this$shuffle");
        vt4y(shuffle, AbstractC6332g.Default);
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    /* JADX INFO: renamed from: x */
    private static final long[] m22651x(long[] jArr) {
        d2ok.m23075h(jArr, "<this>");
        return C6220d.m22779g(jArr);
    }

    @yz(version = "1.3")
    @InterfaceC6232i
    public static final short x0c(@InterfaceC7396q short[] random, @InterfaceC7396q AbstractC6332g random2) {
        d2ok.m23075h(random, "$this$random");
        d2ok.m23075h(random2, "random");
        if (tfm.cdj(random)) {
            throw new NoSuchElementException("Array is empty.");
        }
        return tfm.x2(random, random2.nextInt(tfm.n7h(random)));
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final int x3b(int[] indexOfFirst, x2<? super gyi, Boolean> predicate) {
        d2ok.m23075h(indexOfFirst, "$this$indexOfFirst");
        d2ok.m23075h(predicate, "predicate");
        int length = indexOfFirst.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (predicate.invoke(gyi.zy(gyi.ld6(indexOfFirst[i2]))).booleanValue()) {
                return i2;
            }
        }
        return -1;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final <R> R x7o(long[] foldRight, R r2, InterfaceC5979h<? super ikck, ? super R, ? extends R> operation) {
        d2ok.m23075h(foldRight, "$this$foldRight");
        d2ok.m23075h(operation, "operation");
        for (int iHmvj = C6144h.hmvj(foldRight); iHmvj >= 0; iHmvj--) {
            r2 = operation.invoke(ikck.zy(C6220d.x2(foldRight, iHmvj)), r2);
        }
        return r2;
    }

    @yz(version = "1.7")
    @InterfaceC6769y(name = "maxOrThrow-U")
    @InterfaceC6232i
    public static final int x8(@InterfaceC7396q int[] max) {
        d2ok.m23075h(max, "$this$max");
        if (dr.cdj(max)) {
            throw new NoSuchElementException();
        }
        int iX2 = dr.x2(max, 0);
        n5r1 it = new kotlin.ranges.x2(1, C6144h.srpc(max)).iterator();
        while (it.hasNext()) {
            int iX22 = dr.x2(max, it.nextInt());
            if (Integer.compareUnsigned(iX2, iX22) < 0) {
                iX2 = iX22;
            }
        }
        return iX2;
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @yz(version = "1.5")
    @InterfaceC6769y(name = "sumOfUShort")
    public static final int x85(@InterfaceC7396q qo[] qoVarArr) {
        d2ok.m23075h(qoVarArr, "<this>");
        int iLd6 = 0;
        for (qo qoVar : qoVarArr) {
            iLd6 = gyi.ld6(iLd6 + gyi.ld6(qoVar.bf2() & qo.f36486g));
        }
        return iLd6;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final int xblq(int[] first) {
        d2ok.m23075h(first, "$this$first");
        return gyi.ld6(C6144h.yuzy(first));
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final short xdxk(short[] reduceRightIndexed, cdj<? super Integer, ? super qo, ? super qo, qo> operation) {
        d2ok.m23075h(reduceRightIndexed, "$this$reduceRightIndexed");
        d2ok.m23075h(operation, "operation");
        int iOrxw = C6144h.orxw(reduceRightIndexed);
        if (iOrxw < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        short sX2 = tfm.x2(reduceRightIndexed, iOrxw);
        for (int i2 = iOrxw - 1; i2 >= 0; i2--) {
            sX2 = operation.invoke(Integer.valueOf(i2), qo.zy(tfm.x2(reduceRightIndexed, i2)), qo.zy(sX2)).bf2();
        }
        return sX2;
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final long[] xg(@InterfaceC7396q ikck[] ikckVarArr) {
        d2ok.m23075h(ikckVarArr, "<this>");
        int length = ikckVarArr.length;
        long[] jArr = new long[length];
        for (int i2 = 0; i2 < length; i2++) {
            jArr[i2] = ikckVarArr[i2].a98o();
        }
        return C6220d.m22779g(jArr);
    }

    @InterfaceC6234g
    @yz(version = "1.7")
    @InterfaceC6769y(name = "maxByOrThrow-U")
    @InterfaceC6232i
    private static final <R extends Comparable<? super R>> short xh(short[] maxBy, x2<? super qo, ? extends R> selector) {
        d2ok.m23075h(maxBy, "$this$maxBy");
        d2ok.m23075h(selector, "selector");
        if (tfm.cdj(maxBy)) {
            throw new NoSuchElementException();
        }
        short sX2 = tfm.x2(maxBy, 0);
        int iOrxw = C6144h.orxw(maxBy);
        if (iOrxw == 0) {
            return sX2;
        }
        R rInvoke = selector.invoke(qo.zy(sX2));
        n5r1 it = new kotlin.ranges.x2(1, iOrxw).iterator();
        while (it.hasNext()) {
            short sX22 = tfm.x2(maxBy, it.nextInt());
            R rInvoke2 = selector.invoke(qo.zy(sX22));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                sX2 = sX22;
                rInvoke = rInvoke2;
            }
        }
        return sX2;
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final Double xknm(short[] maxOfOrNull, x2<? super qo, Double> selector) {
        d2ok.m23075h(maxOfOrNull, "$this$maxOfOrNull");
        d2ok.m23075h(selector, "selector");
        if (tfm.cdj(maxOfOrNull)) {
            return null;
        }
        double dDoubleValue = selector.invoke(qo.zy(tfm.x2(maxOfOrNull, 0))).doubleValue();
        n5r1 it = new kotlin.ranges.x2(1, C6144h.orxw(maxOfOrNull)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, selector.invoke(qo.zy(tfm.x2(maxOfOrNull, it.nextInt()))).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final ikck xm(long[] find, x2<? super ikck, Boolean> predicate) {
        d2ok.m23075h(find, "$this$find");
        d2ok.m23075h(predicate, "predicate");
        int iN7h = C6220d.n7h(find);
        for (int i2 = 0; i2 < iN7h; i2++) {
            long jX2 = C6220d.x2(find, i2);
            if (predicate.invoke(ikck.zy(jX2)).booleanValue()) {
                return ikck.zy(jX2);
            }
        }
        return null;
    }

    public static /* synthetic */ void xn(int[] iArr, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = dr.n7h(iArr);
        }
        hql(iArr, i2, i3);
    }

    @InterfaceC7395n
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final qo xnf(@InterfaceC7396q short[] singleOrNull) {
        d2ok.m23075h(singleOrNull, "$this$singleOrNull");
        if (tfm.n7h(singleOrNull) == 1) {
            return qo.zy(tfm.x2(singleOrNull, 0));
        }
        return null;
    }

    @InterfaceC7395n
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final qo xnu(@InterfaceC7396q short[] lastOrNull) {
        d2ok.m23075h(lastOrNull, "$this$lastOrNull");
        if (tfm.cdj(lastOrNull)) {
            return null;
        }
        return qo.zy(tfm.x2(lastOrNull, tfm.n7h(lastOrNull) - 1));
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final int xo(byte[] lastIndexOf, byte b2) {
        d2ok.m23075h(lastIndexOf, "$this$lastIndexOf");
        return C6144h.pwca(lastIndexOf, b2);
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final int xouc(byte[] indexOfFirst, x2<? super C6475u, Boolean> predicate) {
        d2ok.m23075h(indexOfFirst, "$this$indexOfFirst");
        d2ok.m23075h(predicate, "predicate");
        int length = indexOfFirst.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (predicate.invoke(C6475u.zy(C6475u.ld6(indexOfFirst[i2]))).booleanValue()) {
                return i2;
            }
        }
        return -1;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final long xrg(long[] single) {
        d2ok.m23075h(single, "$this$single");
        return ikck.ld6(C6144h.ow8(single));
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final byte xtb7(byte[] first, x2<? super C6475u, Boolean> predicate) {
        d2ok.m23075h(first, "$this$first");
        d2ok.m23075h(predicate, "predicate");
        int iN7h = bo.n7h(first);
        for (int i2 = 0; i2 < iN7h; i2++) {
            byte bX2 = bo.x2(first, i2);
            if (predicate.invoke(C6475u.zy(bX2)).booleanValue()) {
                return bX2;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final byte xwq3(byte[] component1) {
        d2ok.m23075h(component1, "$this$component1");
        return bo.x2(component1, 0);
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final float xx(byte[] minOf, x2<? super C6475u, Float> selector) {
        d2ok.m23075h(minOf, "$this$minOf");
        d2ok.m23075h(selector, "selector");
        if (bo.cdj(minOf)) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(C6475u.zy(bo.x2(minOf, 0))).floatValue();
        n5r1 it = new kotlin.ranges.x2(1, C6144h.vl(minOf)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, selector.invoke(C6475u.zy(bo.x2(minOf, it.nextInt()))).floatValue());
        }
        return fFloatValue;
    }

    @yz(version = "1.4")
    @InterfaceC6232i
    public static final void xypo(@InterfaceC7396q short[] sortDescending, int i2, int i3) {
        d2ok.m23075h(sortDescending, "$this$sortDescending");
        wk(sortDescending, i2, i3);
        C6144h.c7j(sortDescending, i2, i3);
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final <R extends Comparable<? super R>> R xzk4(short[] maxOf, x2<? super qo, ? extends R> selector) {
        d2ok.m23075h(maxOf, "$this$maxOf");
        d2ok.m23075h(selector, "selector");
        if (tfm.cdj(maxOf)) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(qo.zy(tfm.x2(maxOf, 0)));
        n5r1 it = new kotlin.ranges.x2(1, C6144h.orxw(maxOf)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(qo.zy(tfm.x2(maxOf, it.nextInt())));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final short xzk6(short[] single) {
        d2ok.m23075h(single, "$this$single");
        return qo.ld6(C6144h.jqd(single));
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final short xzl(short[] first, x2<? super qo, Boolean> predicate) {
        d2ok.m23075h(first, "$this$first");
        d2ok.m23075h(predicate, "predicate");
        int iN7h = tfm.n7h(first);
        for (int i2 = 0; i2 < iN7h; i2++) {
            short sX2 = tfm.x2(first, i2);
            if (predicate.invoke(qo.zy(sX2)).booleanValue()) {
                return sX2;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final <V, M extends Map<? super C6475u, ? super V>> M y2(byte[] associateWithTo, M destination, x2<? super C6475u, ? extends V> valueSelector) {
        d2ok.m23075h(associateWithTo, "$this$associateWithTo");
        d2ok.m23075h(destination, "destination");
        d2ok.m23075h(valueSelector, "valueSelector");
        int iN7h = bo.n7h(associateWithTo);
        for (int i2 = 0; i2 < iN7h; i2++) {
            byte bX2 = bo.x2(associateWithTo, i2);
            destination.put(C6475u.zy(bX2), valueSelector.invoke(C6475u.zy(bX2)));
        }
        return destination;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final <K, M extends Map<? super K, List<qo>>> M y3(short[] groupByTo, M destination, x2<? super qo, ? extends K> keySelector) {
        d2ok.m23075h(groupByTo, "$this$groupByTo");
        d2ok.m23075h(destination, "destination");
        d2ok.m23075h(keySelector, "keySelector");
        int iN7h = tfm.n7h(groupByTo);
        for (int i2 = 0; i2 < iN7h; i2++) {
            short sX2 = tfm.x2(groupByTo, i2);
            K kInvoke = keySelector.invoke(qo.zy(sX2));
            Object arrayList = destination.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(qo.zy(sX2));
        }
        return destination;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final long[] y4wo(long[] reversedArray) {
        d2ok.m23075h(reversedArray, "$this$reversedArray");
        return C6220d.m22779g(C6144h.d98(reversedArray));
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final byte y76(byte[] random) {
        d2ok.m23075h(random, "$this$random");
        return p2sg(random, AbstractC6332g.Default);
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final <R extends Comparable<? super R>> ikck y84(long[] minByOrNull, x2<? super ikck, ? extends R> selector) {
        d2ok.m23075h(minByOrNull, "$this$minByOrNull");
        d2ok.m23075h(selector, "selector");
        if (C6220d.cdj(minByOrNull)) {
            return null;
        }
        long jX2 = C6220d.x2(minByOrNull, 0);
        int iHmvj = C6144h.hmvj(minByOrNull);
        if (iHmvj == 0) {
            return ikck.zy(jX2);
        }
        R rInvoke = selector.invoke(ikck.zy(jX2));
        n5r1 it = new kotlin.ranges.x2(1, iHmvj).iterator();
        while (it.hasNext()) {
            long jX22 = C6220d.x2(minByOrNull, it.nextInt());
            R rInvoke2 = selector.invoke(ikck.zy(jX22));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                jX2 = jX22;
                rInvoke = rInvoke2;
            }
        }
        return ikck.zy(jX2);
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final boolean y9n(short[] any, x2<? super qo, Boolean> predicate) {
        d2ok.m23075h(any, "$this$any");
        d2ok.m23075h(predicate, "predicate");
        int iN7h = tfm.n7h(any);
        for (int i2 = 0; i2 < iN7h; i2++) {
            if (predicate.invoke(qo.zy(tfm.x2(any, i2))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final int yaw(int[] single) {
        d2ok.m23075h(single, "$this$single");
        return gyi.ld6(C6144h.oklc(single));
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final int ybb(short[] lastIndexOf, short s2) {
        d2ok.m23075h(lastIndexOf, "$this$lastIndexOf");
        return C6144h.fyt(lastIndexOf, s2);
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final int ydj3(short[] indexOf, short s2) {
        d2ok.m23075h(indexOf, "$this$indexOf");
        return C6144h.kes(indexOf, s2);
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final List<C6475u> yg(@InterfaceC7396q byte[] slice, @InterfaceC7396q kotlin.ranges.x2 indices) {
        d2ok.m23075h(slice, "$this$slice");
        d2ok.m23075h(indices, "indices");
        return indices.isEmpty() ? ni7.a9() : kotlin.collections.unsigned.toq.toq(bo.m22412g(kja0.zkd(slice, indices.mo2951k().intValue(), indices.zy().intValue() + 1)));
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final <R extends Comparable<? super R>> qo yh8z(short[] minByOrNull, x2<? super qo, ? extends R> selector) {
        d2ok.m23075h(minByOrNull, "$this$minByOrNull");
        d2ok.m23075h(selector, "selector");
        if (tfm.cdj(minByOrNull)) {
            return null;
        }
        short sX2 = tfm.x2(minByOrNull, 0);
        int iOrxw = C6144h.orxw(minByOrNull);
        if (iOrxw == 0) {
            return qo.zy(sX2);
        }
        R rInvoke = selector.invoke(qo.zy(sX2));
        n5r1 it = new kotlin.ranges.x2(1, iOrxw).iterator();
        while (it.hasNext()) {
            short sX22 = tfm.x2(minByOrNull, it.nextInt());
            R rInvoke2 = selector.invoke(qo.zy(sX22));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                sX2 = sX22;
                rInvoke = rInvoke2;
            }
        }
        return qo.zy(sX2);
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final List<C6227f<ikck, ikck>> yiu(@InterfaceC7396q long[] zip, @InterfaceC7396q long[] other) {
        d2ok.m23075h(zip, "$this$zip");
        d2ok.m23075h(other, "other");
        int iMin = Math.min(C6220d.n7h(zip), C6220d.n7h(other));
        ArrayList arrayList = new ArrayList(iMin);
        for (int i2 = 0; i2 < iMin; i2++) {
            arrayList.add(nmn5.m23230k(ikck.zy(C6220d.x2(zip, i2)), ikck.zy(C6220d.x2(other, i2))));
        }
        return arrayList;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final int[] yl(int[] copyOf, int i2) {
        d2ok.m23075h(copyOf, "$this$copyOf");
        int[] iArrCopyOf = Arrays.copyOf(copyOf, i2);
        d2ok.kja0(iArrCopyOf, "copyOf(this, newSize)");
        return dr.m22802g(iArrCopyOf);
    }

    @i9jn(markerClass = {ki.class})
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final qo yl24(short[] randomOrNull) {
        d2ok.m23075h(randomOrNull, "$this$randomOrNull");
        return tn(randomOrNull, AbstractC6332g.Default);
    }

    @InterfaceC7395n
    @yz(version = "1.4")
    @InterfaceC6232i
    public static final C6475u ym(@InterfaceC7396q byte[] maxOrNull) {
        d2ok.m23075h(maxOrNull, "$this$maxOrNull");
        if (bo.cdj(maxOrNull)) {
            return null;
        }
        byte bX2 = bo.x2(maxOrNull, 0);
        n5r1 it = new kotlin.ranges.x2(1, C6144h.vl(maxOrNull)).iterator();
        while (it.hasNext()) {
            byte bX22 = bo.x2(maxOrNull, it.nextInt());
            if (d2ok.m23076i(bX2 & 255, bX22 & 255) < 0) {
                bX2 = bX22;
            }
        }
        return C6475u.zy(bX2);
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final Double ym8(short[] minOfOrNull, x2<? super qo, Double> selector) {
        d2ok.m23075h(minOfOrNull, "$this$minOfOrNull");
        d2ok.m23075h(selector, "selector");
        if (tfm.cdj(minOfOrNull)) {
            return null;
        }
        double dDoubleValue = selector.invoke(qo.zy(tfm.x2(minOfOrNull, 0))).doubleValue();
        n5r1 it = new kotlin.ranges.x2(1, C6144h.orxw(minOfOrNull)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, selector.invoke(qo.zy(tfm.x2(minOfOrNull, it.nextInt()))).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final long yn(long[] reduceRightIndexed, cdj<? super Integer, ? super ikck, ? super ikck, ikck> operation) {
        d2ok.m23075h(reduceRightIndexed, "$this$reduceRightIndexed");
        d2ok.m23075h(operation, "operation");
        int iHmvj = C6144h.hmvj(reduceRightIndexed);
        if (iHmvj < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        long jX2 = C6220d.x2(reduceRightIndexed, iHmvj);
        for (int i2 = iHmvj - 1; i2 >= 0; i2--) {
            jX2 = operation.invoke(Integer.valueOf(i2), ikck.zy(C6220d.x2(reduceRightIndexed, i2)), ikck.zy(jX2)).a98o();
        }
        return jX2;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final <C extends Collection<? super ikck>> C yp31(long[] filterIndexedTo, C destination, InterfaceC5979h<? super Integer, ? super ikck, Boolean> predicate) {
        d2ok.m23075h(filterIndexedTo, "$this$filterIndexedTo");
        d2ok.m23075h(destination, "destination");
        d2ok.m23075h(predicate, "predicate");
        int iN7h = C6220d.n7h(filterIndexedTo);
        int i2 = 0;
        int i3 = 0;
        while (i2 < iN7h) {
            long jX2 = C6220d.x2(filterIndexedTo, i2);
            int i4 = i3 + 1;
            if (predicate.invoke(Integer.valueOf(i3), ikck.zy(jX2)).booleanValue()) {
                destination.add(ikck.zy(jX2));
            }
            i2++;
            i3 = i4;
        }
        return destination;
    }

    @InterfaceC7396q
    @yz(version = "1.4")
    @InterfaceC6232i
    public static String yqrt(@InterfaceC7395n byte[] bArr) {
        String strUo;
        return (bArr == null || (strUo = a9.uo(bo.toq(bArr), ", ", "[", "]", 0, null, null, 56, null)) == null) ? "null" : strUo;
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6769y(name = "sumOfInt")
    @InterfaceC6232i
    private static final int yuzy(short[] sumOf, x2<? super qo, Integer> selector) {
        d2ok.m23075h(sumOf, "$this$sumOf");
        d2ok.m23075h(selector, "selector");
        int iN7h = tfm.n7h(sumOf);
        int iIntValue = 0;
        for (int i2 = 0; i2 < iN7h; i2++) {
            iIntValue += selector.invoke(qo.zy(tfm.x2(sumOf, i2))).intValue();
        }
        return iIntValue;
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final Double yvs(byte[] maxOfOrNull, x2<? super C6475u, Double> selector) {
        d2ok.m23075h(maxOfOrNull, "$this$maxOfOrNull");
        d2ok.m23075h(selector, "selector");
        if (bo.cdj(maxOfOrNull)) {
            return null;
        }
        double dDoubleValue = selector.invoke(C6475u.zy(bo.x2(maxOfOrNull, 0))).doubleValue();
        n5r1 it = new kotlin.ranges.x2(1, C6144h.vl(maxOfOrNull)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, selector.invoke(C6475u.zy(bo.x2(maxOfOrNull, it.nextInt()))).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final List<ikck> yw(long[] filterIndexed, InterfaceC5979h<? super Integer, ? super ikck, Boolean> predicate) {
        d2ok.m23075h(filterIndexed, "$this$filterIndexed");
        d2ok.m23075h(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int iN7h = C6220d.n7h(filterIndexed);
        int i2 = 0;
        int i3 = 0;
        while (i2 < iN7h) {
            long jX2 = C6220d.x2(filterIndexed, i2);
            int i4 = i3 + 1;
            if (predicate.invoke(Integer.valueOf(i3), ikck.zy(jX2)).booleanValue()) {
                arrayList.add(ikck.zy(jX2));
            }
            i2++;
            i3 = i4;
        }
        return arrayList;
    }

    @yz(version = "1.4")
    @InterfaceC6232i
    public static final void yw7(@InterfaceC7396q int[] shuffle, @InterfaceC7396q AbstractC6332g random) {
        d2ok.m23075h(shuffle, "$this$shuffle");
        d2ok.m23075h(random, "random");
        for (int iSrpc = C6144h.srpc(shuffle); iSrpc > 0; iSrpc--) {
            int iNextInt = random.nextInt(iSrpc + 1);
            int iX2 = dr.x2(shuffle, iSrpc);
            dr.m22804i(shuffle, iSrpc, dr.x2(shuffle, iNextInt));
            dr.m22804i(shuffle, iNextInt, iX2);
        }
    }

    @i9jn(markerClass = {ki.class})
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final <R> List<R> yyel(long[] scan, R r2, InterfaceC5979h<? super R, ? super ikck, ? extends R> operation) {
        d2ok.m23075h(scan, "$this$scan");
        d2ok.m23075h(operation, "operation");
        if (C6220d.cdj(scan)) {
            return zurt.ld6(r2);
        }
        ArrayList arrayList = new ArrayList(C6220d.n7h(scan) + 1);
        arrayList.add(r2);
        int iN7h = C6220d.n7h(scan);
        for (int i2 = 0; i2 < iN7h; i2++) {
            r2 = operation.invoke(r2, ikck.zy(C6220d.x2(scan, i2)));
            arrayList.add(r2);
        }
        return arrayList;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final boolean yz(short[] any) {
        d2ok.m23075h(any, "$this$any");
        return C6144h.zxa9(any);
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final List<C6475u> yz5(@InterfaceC7396q byte[] sorted) {
        d2ok.m23075h(sorted, "$this$sorted");
        byte[] bArrCopyOf = Arrays.copyOf(sorted, sorted.length);
        d2ok.kja0(bArrCopyOf, "copyOf(this, size)");
        byte[] bArrM22412g = bo.m22412g(bArrCopyOf);
        os3j(bArrM22412g);
        return kotlin.collections.unsigned.toq.toq(bArrM22412g);
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final byte[] z0(byte[] plus, byte b2) {
        d2ok.m23075h(plus, "$this$plus");
        return bo.m22412g(kja0.z4j7(plus, b2));
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final int z1(int[] reduceRightIndexed, cdj<? super Integer, ? super gyi, ? super gyi, gyi> operation) {
        d2ok.m23075h(reduceRightIndexed, "$this$reduceRightIndexed");
        d2ok.m23075h(operation, "operation");
        int iSrpc = C6144h.srpc(reduceRightIndexed);
        if (iSrpc < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        int iX2 = dr.x2(reduceRightIndexed, iSrpc);
        for (int i2 = iSrpc - 1; i2 >= 0; i2--) {
            iX2 = operation.invoke(Integer.valueOf(i2), gyi.zy(dr.x2(reduceRightIndexed, i2)), gyi.zy(iX2)).a98o();
        }
        return iX2;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final <K, V> Map<K, List<V>> z1r(byte[] groupBy, x2<? super C6475u, ? extends K> keySelector, x2<? super C6475u, ? extends V> valueTransform) {
        d2ok.m23075h(groupBy, "$this$groupBy");
        d2ok.m23075h(keySelector, "keySelector");
        d2ok.m23075h(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int iN7h = bo.n7h(groupBy);
        for (int i2 = 0; i2 < iN7h; i2++) {
            byte bX2 = bo.x2(groupBy, i2);
            K kInvoke = keySelector.invoke(C6475u.zy(bX2));
            List<V> arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(kInvoke, arrayList);
            }
            arrayList.add(valueTransform.invoke(C6475u.zy(bX2)));
        }
        return linkedHashMap;
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final List<ikck> z3jl(@InterfaceC7396q long[] take, int i2) {
        d2ok.m23075h(take, "$this$take");
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
        }
        if (i2 == 0) {
            return ni7.a9();
        }
        if (i2 >= C6220d.n7h(take)) {
            return a9.wr(C6220d.toq(take));
        }
        if (i2 == 1) {
            return zurt.ld6(ikck.zy(C6220d.x2(take, 0)));
        }
        ArrayList arrayList = new ArrayList(i2);
        int iN7h = C6220d.n7h(take);
        int i3 = 0;
        for (int i4 = 0; i4 < iN7h; i4++) {
            arrayList.add(ikck.zy(C6220d.x2(take, i4)));
            i3++;
            if (i3 == i2) {
                break;
            }
        }
        return arrayList;
    }

    @yz(version = "1.4")
    @InterfaceC6232i
    public static final int z4(@InterfaceC7395n long[] jArr) {
        if (jArr == null) {
            jArr = null;
        }
        return Arrays.hashCode(jArr);
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final <R> List<R> z4j7(byte[] flatMap, x2<? super C6475u, ? extends Iterable<? extends R>> transform) {
        d2ok.m23075h(flatMap, "$this$flatMap");
        d2ok.m23075h(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int iN7h = bo.n7h(flatMap);
        for (int i2 = 0; i2 < iN7h; i2++) {
            C6163t.zp(arrayList, transform.invoke(C6475u.zy(bo.x2(flatMap, i2))));
        }
        return arrayList;
    }

    @i9jn(markerClass = {ki.class})
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final <R> List<R> z4jl(int[] scanIndexed, R r2, cdj<? super Integer, ? super R, ? super gyi, ? extends R> operation) {
        d2ok.m23075h(scanIndexed, "$this$scanIndexed");
        d2ok.m23075h(operation, "operation");
        if (dr.cdj(scanIndexed)) {
            return zurt.ld6(r2);
        }
        ArrayList arrayList = new ArrayList(dr.n7h(scanIndexed) + 1);
        arrayList.add(r2);
        int iN7h = dr.n7h(scanIndexed);
        for (int i2 = 0; i2 < iN7h; i2++) {
            r2 = operation.invoke(Integer.valueOf(i2), r2, gyi.zy(dr.x2(scanIndexed, i2)));
            arrayList.add(r2);
        }
        return arrayList;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final List<gyi> z4t(int[] filter, x2<? super gyi, Boolean> predicate) {
        d2ok.m23075h(filter, "$this$filter");
        d2ok.m23075h(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int iN7h = dr.n7h(filter);
        for (int i2 = 0; i2 < iN7h; i2++) {
            int iX2 = dr.x2(filter, i2);
            if (predicate.invoke(gyi.zy(iX2)).booleanValue()) {
                arrayList.add(gyi.zy(iX2));
            }
        }
        return arrayList;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final <R> R z5(long[] foldIndexed, R r2, cdj<? super Integer, ? super R, ? super ikck, ? extends R> operation) {
        d2ok.m23075h(foldIndexed, "$this$foldIndexed");
        d2ok.m23075h(operation, "operation");
        int iN7h = C6220d.n7h(foldIndexed);
        int i2 = 0;
        int i3 = 0;
        while (i2 < iN7h) {
            r2 = operation.invoke(Integer.valueOf(i3), r2, ikck.zy(C6220d.x2(foldIndexed, i2)));
            i2++;
            i3++;
        }
        return r2;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final short z617(short[] first) {
        d2ok.m23075h(first, "$this$first");
        return qo.ld6(C6144h.c4k8(first));
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final List<ikck> z75m(@InterfaceC7396q long[] takeLast, int i2) {
        d2ok.m23075h(takeLast, "$this$takeLast");
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
        }
        if (i2 == 0) {
            return ni7.a9();
        }
        int iN7h = C6220d.n7h(takeLast);
        if (i2 >= iN7h) {
            return a9.wr(C6220d.toq(takeLast));
        }
        if (i2 == 1) {
            return zurt.ld6(ikck.zy(C6220d.x2(takeLast, iN7h - 1)));
        }
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = iN7h - i2; i3 < iN7h; i3++) {
            arrayList.add(ikck.zy(C6220d.x2(takeLast, i3)));
        }
        return arrayList;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final <R> R z8(byte[] foldRight, R r2, InterfaceC5979h<? super C6475u, ? super R, ? extends R> operation) {
        d2ok.m23075h(foldRight, "$this$foldRight");
        d2ok.m23075h(operation, "operation");
        for (int iVl = C6144h.vl(foldRight); iVl >= 0; iVl--) {
            r2 = operation.invoke(C6475u.zy(bo.x2(foldRight, iVl)), r2);
        }
        return r2;
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6769y(name = "sumOfInt")
    @InterfaceC6232i
    private static final int z8l(int[] sumOf, x2<? super gyi, Integer> selector) {
        d2ok.m23075h(sumOf, "$this$sumOf");
        d2ok.m23075h(selector, "selector");
        int iN7h = dr.n7h(sumOf);
        int iIntValue = 0;
        for (int i2 = 0; i2 < iN7h; i2++) {
            iIntValue += selector.invoke(gyi.zy(dr.x2(sumOf, i2))).intValue();
        }
        return iIntValue;
    }

    @InterfaceC7395n
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final C6475u zah1(@InterfaceC7396q byte[] getOrNull, int i2) {
        d2ok.m23075h(getOrNull, "$this$getOrNull");
        if (i2 < 0 || i2 > C6144h.vl(getOrNull)) {
            return null;
        }
        return C6475u.zy(bo.x2(getOrNull, i2));
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final <R extends Comparable<? super R>> R zalf(byte[] minOfOrNull, x2<? super C6475u, ? extends R> selector) {
        d2ok.m23075h(minOfOrNull, "$this$minOfOrNull");
        d2ok.m23075h(selector, "selector");
        if (bo.cdj(minOfOrNull)) {
            return null;
        }
        R rInvoke = selector.invoke(C6475u.zy(bo.x2(minOfOrNull, 0)));
        n5r1 it = new kotlin.ranges.x2(1, C6144h.vl(minOfOrNull)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(C6475u.zy(bo.x2(minOfOrNull, it.nextInt())));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final int zaso(int[] lastIndexOf, int i2) {
        d2ok.m23075h(lastIndexOf, "$this$lastIndexOf");
        return C6144h.f5k(lastIndexOf, i2);
    }

    @yz(version = "1.7")
    @InterfaceC6769y(name = "minWithOrThrow-U")
    @InterfaceC6232i
    public static final short zc(@InterfaceC7396q short[] minWith, @InterfaceC7396q Comparator<? super qo> comparator) {
        d2ok.m23075h(minWith, "$this$minWith");
        d2ok.m23075h(comparator, "comparator");
        if (tfm.cdj(minWith)) {
            throw new NoSuchElementException();
        }
        short sX2 = tfm.x2(minWith, 0);
        n5r1 it = new kotlin.ranges.x2(1, C6144h.orxw(minWith)).iterator();
        while (it.hasNext()) {
            short sX22 = tfm.x2(minWith, it.nextInt());
            if (comparator.compare(qo.zy(sX2), qo.zy(sX22)) > 0) {
                sX2 = sX22;
            }
        }
        return sX2;
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final <R extends Comparable<? super R>> R ze(int[] maxOfOrNull, x2<? super gyi, ? extends R> selector) {
        d2ok.m23075h(maxOfOrNull, "$this$maxOfOrNull");
        d2ok.m23075h(selector, "selector");
        if (dr.cdj(maxOfOrNull)) {
            return null;
        }
        R rInvoke = selector.invoke(gyi.zy(dr.x2(maxOfOrNull, 0)));
        n5r1 it = new kotlin.ranges.x2(1, C6144h.srpc(maxOfOrNull)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(gyi.zy(dr.x2(maxOfOrNull, it.nextInt())));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final List<C6475u> zff0(byte[] filterNot, x2<? super C6475u, Boolean> predicate) {
        d2ok.m23075h(filterNot, "$this$filterNot");
        d2ok.m23075h(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int iN7h = bo.n7h(filterNot);
        for (int i2 = 0; i2 < iN7h; i2++) {
            byte bX2 = bo.x2(filterNot, i2);
            if (!predicate.invoke(C6475u.zy(bX2)).booleanValue()) {
                arrayList.add(C6475u.zy(bX2));
            }
        }
        return arrayList;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final short zi4o(short[] last) {
        d2ok.m23075h(last, "$this$last");
        return qo.ld6(C6144h.vy5c(last));
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final <R extends Comparable<? super R>> R zidq(byte[] maxOfOrNull, x2<? super C6475u, ? extends R> selector) {
        d2ok.m23075h(maxOfOrNull, "$this$maxOfOrNull");
        d2ok.m23075h(selector, "selector");
        if (bo.cdj(maxOfOrNull)) {
            return null;
        }
        R rInvoke = selector.invoke(C6475u.zy(bo.x2(maxOfOrNull, 0)));
        n5r1 it = new kotlin.ranges.x2(1, C6144h.vl(maxOfOrNull)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(C6475u.zy(bo.x2(maxOfOrNull, it.nextInt())));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    static /* synthetic */ long[] zkd(long[] copyInto, long[] destination, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i2 = 0;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = C6220d.n7h(copyInto);
        }
        d2ok.m23075h(copyInto, "$this$copyInto");
        d2ok.m23075h(destination, "destination");
        kja0.m22522v(copyInto, destination, i2, i3, i4);
        return destination;
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final <R> List<C6227f<C6475u, R>> zkf2(@InterfaceC7396q byte[] zip, @InterfaceC7396q Iterable<? extends R> other) {
        d2ok.m23075h(zip, "$this$zip");
        d2ok.m23075h(other, "other");
        int iN7h = bo.n7h(zip);
        ArrayList arrayList = new ArrayList(Math.min(fu4.vyq(other, 10), iN7h));
        int i2 = 0;
        for (R r2 : other) {
            if (i2 >= iN7h) {
                break;
            }
            arrayList.add(nmn5.m23230k(C6475u.zy(bo.x2(zip, i2)), r2));
            i2++;
        }
        return arrayList;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final short zlf(short[] single, x2<? super qo, Boolean> predicate) {
        d2ok.m23075h(single, "$this$single");
        d2ok.m23075h(predicate, "predicate");
        int iN7h = tfm.n7h(single);
        qo qoVarZy = null;
        boolean z2 = false;
        for (int i2 = 0; i2 < iN7h; i2++) {
            short sX2 = tfm.x2(single, i2);
            if (predicate.invoke(qo.zy(sX2)).booleanValue()) {
                if (z2) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                qoVarZy = qo.zy(sX2);
                z2 = true;
            }
        }
        if (z2) {
            return qoVarZy.bf2();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @yz(version = "1.4")
    @InterfaceC6232i
    public static final void zlo(@InterfaceC7396q long[] shuffle) {
        d2ok.m23075h(shuffle, "$this$shuffle");
        ew08(shuffle, AbstractC6332g.Default);
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final <R> R zma(byte[] foldRightIndexed, R r2, cdj<? super Integer, ? super C6475u, ? super R, ? extends R> operation) {
        d2ok.m23075h(foldRightIndexed, "$this$foldRightIndexed");
        d2ok.m23075h(operation, "operation");
        for (int iVl = C6144h.vl(foldRightIndexed); iVl >= 0; iVl--) {
            r2 = operation.invoke(Integer.valueOf(iVl), C6475u.zy(bo.x2(foldRightIndexed, iVl)), r2);
        }
        return r2;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final int[] zp(int[] iArr) {
        d2ok.m23075h(iArr, "<this>");
        return dr.m22802g(iArr);
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final int zsr0(int[] component5) {
        d2ok.m23075h(component5, "$this$component5");
        return dr.x2(component5, 4);
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final int zt(short[] indexOfFirst, x2<? super qo, Boolean> predicate) {
        d2ok.m23075h(indexOfFirst, "$this$indexOfFirst");
        d2ok.m23075h(predicate, "predicate");
        int length = indexOfFirst.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (predicate.invoke(qo.zy(qo.ld6(indexOfFirst[i2]))).booleanValue()) {
                return i2;
            }
        }
        return -1;
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6232i
    private static final <R, C extends Collection<? super R>> C zuf(short[] flatMapIndexedTo, C destination, InterfaceC5979h<? super Integer, ? super qo, ? extends Iterable<? extends R>> transform) {
        d2ok.m23075h(flatMapIndexedTo, "$this$flatMapIndexedTo");
        d2ok.m23075h(destination, "destination");
        d2ok.m23075h(transform, "transform");
        int iN7h = tfm.n7h(flatMapIndexedTo);
        int i2 = 0;
        int i3 = 0;
        while (i2 < iN7h) {
            C6163t.zp(destination, transform.invoke(Integer.valueOf(i3), qo.zy(tfm.x2(flatMapIndexedTo, i2))));
            i2++;
            i3++;
        }
        return destination;
    }

    @i9jn(markerClass = {ki.class})
    @InterfaceC7395n
    @yz(version = "1.4")
    @InterfaceC6232i
    public static final gyi zuh(@InterfaceC7396q int[] randomOrNull, @InterfaceC7396q AbstractC6332g random) {
        d2ok.m23075h(randomOrNull, "$this$randomOrNull");
        d2ok.m23075h(random, "random");
        if (dr.cdj(randomOrNull)) {
            return null;
        }
        return gyi.zy(dr.x2(randomOrNull, random.nextInt(dr.n7h(randomOrNull))));
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final int zwy(short[] count, x2<? super qo, Boolean> predicate) {
        d2ok.m23075h(count, "$this$count");
        d2ok.m23075h(predicate, "predicate");
        int iN7h = tfm.n7h(count);
        int i2 = 0;
        for (int i3 = 0; i3 < iN7h; i3++) {
            if (predicate.invoke(qo.zy(tfm.x2(count, i3))).booleanValue()) {
                i2++;
            }
        }
        return i2;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final <R> List<R> zxa9(int[] mapIndexed, InterfaceC5979h<? super Integer, ? super gyi, ? extends R> transform) {
        d2ok.m23075h(mapIndexed, "$this$mapIndexed");
        d2ok.m23075h(transform, "transform");
        ArrayList arrayList = new ArrayList(dr.n7h(mapIndexed));
        int iN7h = dr.n7h(mapIndexed);
        int i2 = 0;
        int i3 = 0;
        while (i2 < iN7h) {
            arrayList.add(transform.invoke(Integer.valueOf(i3), gyi.zy(dr.x2(mapIndexed, i2))));
            i2++;
            i3++;
        }
        return arrayList;
    }

    @yz(version = "1.3")
    @InterfaceC6232i
    public static final void zxe(@InterfaceC7396q int[] sortDescending) {
        d2ok.m23075h(sortDescending, "$this$sortDescending");
        if (dr.n7h(sortDescending) > 1) {
            ceo(sortDescending);
            C6144h.q9e(sortDescending);
        }
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final void zxq(short[] forEach, x2<? super qo, was> action) {
        d2ok.m23075h(forEach, "$this$forEach");
        d2ok.m23075h(action, "action");
        int iN7h = tfm.n7h(forEach);
        for (int i2 = 0; i2 < iN7h; i2++) {
            action.invoke(qo.zy(tfm.x2(forEach, i2)));
        }
    }
}
