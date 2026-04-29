package kotlin.collections;

import cyoe.InterfaceC5979h;
import cyoe.InterfaceC5981k;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.C6227f;
import kotlin.InterfaceC6232i;
import kotlin.comparisons.f7l8;
import kotlin.gyi;
import kotlin.i9jn;
import kotlin.ikck;
import kotlin.internal.InterfaceC6234g;
import kotlin.jvm.internal.AbstractC6308r;
import kotlin.jvm.internal.C6306p;
import kotlin.jvm.internal.C6309s;
import kotlin.random.AbstractC6332g;
import kotlin.was;
import l05.InterfaceC6769y;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import r6ty.InterfaceC7625k;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: kotlin.collections.h */
/* JADX INFO: compiled from: _Arrays.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.jvm.internal.lv5({"SMAP\n_Arrays.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,24423:1\n12524#1,2:24424\n12534#1,2:24426\n1282#1,2:24428\n1290#1,2:24430\n1298#1,2:24432\n1306#1,2:24434\n1314#1,2:24436\n1322#1,2:24438\n1330#1,2:24440\n1338#1,2:24442\n1346#1,2:24444\n2298#1,5:24446\n2311#1,5:24451\n2324#1,5:24456\n2337#1,5:24461\n2350#1,5:24466\n2363#1,5:24471\n2376#1,5:24476\n2389#1,5:24481\n2402#1,5:24486\n4307#1,2:24492\n4317#1,2:24494\n4327#1,2:24496\n4337#1,2:24498\n4347#1,2:24500\n4357#1,2:24502\n4367#1,2:24504\n4377#1,2:24506\n4387#1,2:24508\n3974#1:24510\n13374#1,2:24511\n3975#1,2:24513\n13376#1:24515\n3977#1:24516\n3988#1:24517\n13384#1,2:24518\n3989#1,2:24520\n13386#1:24522\n3991#1:24523\n4002#1:24524\n13394#1,2:24525\n4003#1,2:24527\n13396#1:24529\n4005#1:24530\n4016#1:24531\n13404#1,2:24532\n4017#1,2:24534\n13406#1:24536\n4019#1:24537\n4030#1:24538\n13414#1,2:24539\n4031#1,2:24541\n13416#1:24543\n4033#1:24544\n4044#1:24545\n13424#1,2:24546\n4045#1,2:24548\n13426#1:24550\n4047#1:24551\n4058#1:24552\n13434#1,2:24553\n4059#1,2:24555\n13436#1:24557\n4061#1:24558\n4072#1:24559\n13444#1,2:24560\n4073#1,2:24562\n13446#1:24564\n4075#1:24565\n4086#1:24566\n13454#1,2:24567\n4087#1,2:24569\n13456#1:24571\n4089#1:24572\n13374#1,3:24573\n13384#1,3:24576\n13394#1,3:24579\n13404#1,3:24582\n13414#1,3:24585\n13424#1,3:24588\n13434#1,3:24591\n13444#1,3:24594\n13454#1,3:24597\n4107#1,2:24600\n4217#1,2:24602\n4227#1,2:24604\n4237#1,2:24606\n4247#1,2:24608\n4257#1,2:24610\n4267#1,2:24612\n4277#1,2:24614\n4287#1,2:24616\n4297#1,2:24618\n9088#1,4:24620\n9103#1,4:24624\n9118#1,4:24628\n9133#1,4:24632\n9148#1,4:24636\n9163#1,4:24640\n9178#1,4:24644\n9193#1,4:24648\n9208#1,4:24652\n8801#1,4:24656\n8817#1,4:24660\n8833#1,4:24664\n8849#1,4:24668\n8865#1,4:24672\n8881#1,4:24676\n8897#1,4:24680\n8913#1,4:24684\n8929#1,4:24688\n8945#1,4:24692\n8961#1,4:24696\n8977#1,4:24700\n8993#1,4:24704\n9009#1,4:24708\n9025#1,4:24712\n9041#1,4:24716\n9057#1,4:24720\n9073#1,4:24724\n9376#1,4:24728\n10394#1,5:24732\n10405#1,5:24737\n10416#1,5:24742\n10427#1,5:24747\n10438#1,5:24752\n10449#1,5:24757\n10460#1,5:24762\n10471#1,5:24767\n10482#1,5:24772\n10497#1,5:24777\n10738#1,3:24782\n10741#1,3:24792\n10755#1,3:24795\n10758#1,3:24805\n10772#1,3:24808\n10775#1,3:24818\n10789#1,3:24821\n10792#1,3:24831\n10806#1,3:24834\n10809#1,3:24844\n10823#1,3:24847\n10826#1,3:24857\n10840#1,3:24860\n10843#1,3:24870\n10857#1,3:24873\n10860#1,3:24883\n10874#1,3:24886\n10877#1,3:24896\n10892#1,3:24899\n10895#1,3:24909\n10910#1,3:24912\n10913#1,3:24922\n10928#1,3:24925\n10931#1,3:24935\n10946#1,3:24938\n10949#1,3:24948\n10964#1,3:24951\n10967#1,3:24961\n10982#1,3:24964\n10985#1,3:24974\n11000#1,3:24977\n11003#1,3:24987\n11018#1,3:24990\n11021#1,3:25000\n11036#1,3:25003\n11039#1,3:25013\n11400#1,3:25142\n11410#1,3:25145\n11420#1,3:25148\n11430#1,3:25151\n11440#1,3:25154\n11450#1,3:25157\n11460#1,3:25160\n11470#1,3:25163\n11480#1,3:25166\n11266#1,4:25169\n11279#1,4:25173\n11292#1,4:25177\n11305#1,4:25181\n11318#1,4:25185\n11331#1,4:25189\n11344#1,4:25193\n11357#1,4:25197\n11370#1,4:25201\n11255#1:25205\n13374#1,2:25206\n13376#1:25209\n11256#1:25210\n13374#1,3:25211\n11391#1:25214\n13309#1:25215\n13310#1:25217\n11392#1:25218\n13309#1,2:25219\n13374#1,3:25221\n13384#1,3:25224\n13394#1,3:25227\n13404#1,3:25230\n13414#1,3:25233\n13424#1,3:25236\n13434#1,3:25239\n13444#1,3:25242\n13454#1,3:25245\n20623#1,2:25248\n20625#1,6:25251\n20839#1,2:25257\n20841#1,6:25260\n23035#1,6:25266\n23051#1,6:25272\n23067#1,6:25278\n23083#1,6:25284\n23099#1,6:25290\n23115#1,6:25296\n23131#1,6:25302\n23147#1,6:25308\n23163#1,6:25314\n23269#1,8:25320\n23287#1,8:25328\n23305#1,8:25336\n23323#1,8:25344\n23341#1,8:25352\n23359#1,8:25360\n23377#1,8:25368\n23395#1,8:25376\n23413#1,8:25384\n23511#1,6:25392\n23527#1,6:25398\n23543#1,6:25404\n23559#1,6:25410\n23575#1,6:25416\n23591#1,6:25422\n23607#1,6:25428\n23623#1,6:25434\n1#2:24491\n1#2:25208\n1#2:25216\n1#2:25250\n1#2:25259\n372#3,7:24785\n372#3,7:24798\n372#3,7:24811\n372#3,7:24824\n372#3,7:24837\n372#3,7:24850\n372#3,7:24863\n372#3,7:24876\n372#3,7:24889\n372#3,7:24902\n372#3,7:24915\n372#3,7:24928\n372#3,7:24941\n372#3,7:24954\n372#3,7:24967\n372#3,7:24980\n372#3,7:24993\n372#3,7:25006\n372#3,7:25016\n372#3,7:25023\n372#3,7:25030\n372#3,7:25037\n372#3,7:25044\n372#3,7:25051\n372#3,7:25058\n372#3,7:25065\n372#3,7:25072\n372#3,7:25079\n372#3,7:25086\n372#3,7:25093\n372#3,7:25100\n372#3,7:25107\n372#3,7:25114\n372#3,7:25121\n372#3,7:25128\n372#3,7:25135\n*S KotlinDebug\n*F\n+ 1 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n556#1:24424,2\n565#1:24426,2\n832#1:24428,2\n842#1:24430,2\n852#1:24432,2\n862#1:24434,2\n872#1:24436,2\n882#1:24438,2\n892#1:24440,2\n902#1:24442,2\n912#1:24444,2\n922#1:24446,5\n932#1:24451,5\n942#1:24456,5\n952#1:24461,5\n962#1:24466,5\n972#1:24471,5\n982#1:24476,5\n992#1:24481,5\n1002#1:24486,5\n3792#1:24492,2\n3801#1:24494,2\n3810#1:24496,2\n3819#1:24498,2\n3828#1:24500,2\n3837#1:24502,2\n3846#1:24504,2\n3855#1:24506,2\n3864#1:24508,2\n3875#1:24510\n3875#1:24511,2\n3875#1:24513,2\n3875#1:24515\n3875#1:24516\n3886#1:24517\n3886#1:24518,2\n3886#1:24520,2\n3886#1:24522\n3886#1:24523\n3897#1:24524\n3897#1:24525,2\n3897#1:24527,2\n3897#1:24529\n3897#1:24530\n3908#1:24531\n3908#1:24532,2\n3908#1:24534,2\n3908#1:24536\n3908#1:24537\n3919#1:24538\n3919#1:24539,2\n3919#1:24541,2\n3919#1:24543\n3919#1:24544\n3930#1:24545\n3930#1:24546,2\n3930#1:24548,2\n3930#1:24550\n3930#1:24551\n3941#1:24552\n3941#1:24553,2\n3941#1:24555,2\n3941#1:24557\n3941#1:24558\n3952#1:24559\n3952#1:24560,2\n3952#1:24562,2\n3952#1:24564\n3952#1:24565\n3963#1:24566\n3963#1:24567,2\n3963#1:24569,2\n3963#1:24571\n3963#1:24572\n3974#1:24573,3\n3988#1:24576,3\n4002#1:24579,3\n4016#1:24582,3\n4030#1:24585,3\n4044#1:24588,3\n4058#1:24591,3\n4072#1:24594,3\n4086#1:24597,3\n4098#1:24600,2\n4117#1:24602,2\n4126#1:24604,2\n4135#1:24606,2\n4144#1:24608,2\n4153#1:24610,2\n4162#1:24612,2\n4171#1:24614,2\n4180#1:24616,2\n4189#1:24618,2\n8407#1:24620,4\n8422#1:24624,4\n8437#1:24628,4\n8452#1:24632,4\n8467#1:24636,4\n8482#1:24640,4\n8497#1:24644,4\n8512#1:24648,4\n8527#1:24652,4\n8542#1:24656,4\n8557#1:24660,4\n8572#1:24664,4\n8587#1:24668,4\n8602#1:24672,4\n8617#1:24676,4\n8632#1:24680,4\n8647#1:24684,4\n8662#1:24688,4\n8676#1:24692,4\n8690#1:24696,4\n8704#1:24700,4\n8718#1:24704,4\n8732#1:24708,4\n8746#1:24712,4\n8760#1:24716,4\n8774#1:24720,4\n8788#1:24724,4\n9227#1:24728,4\n9972#1:24732,5\n9981#1:24737,5\n9990#1:24742,5\n9999#1:24747,5\n10008#1:24752,5\n10017#1:24757,5\n10026#1:24762,5\n10035#1:24767,5\n10044#1:24772,5\n10057#1:24777,5\n10513#1:24782,3\n10513#1:24792,3\n10525#1:24795,3\n10525#1:24805,3\n10537#1:24808,3\n10537#1:24818,3\n10549#1:24821,3\n10549#1:24831,3\n10561#1:24834,3\n10561#1:24844,3\n10573#1:24847,3\n10573#1:24857,3\n10585#1:24860,3\n10585#1:24870,3\n10597#1:24873,3\n10597#1:24883,3\n10609#1:24886,3\n10609#1:24896,3\n10622#1:24899,3\n10622#1:24909,3\n10635#1:24912,3\n10635#1:24922,3\n10648#1:24925,3\n10648#1:24935,3\n10661#1:24938,3\n10661#1:24948,3\n10674#1:24951,3\n10674#1:24961,3\n10687#1:24964,3\n10687#1:24974,3\n10700#1:24977,3\n10700#1:24987,3\n10713#1:24990,3\n10713#1:25000,3\n10726#1:25003,3\n10726#1:25013,3\n11065#1:25142,3\n11075#1:25145,3\n11085#1:25148,3\n11095#1:25151,3\n11105#1:25154,3\n11115#1:25157,3\n11125#1:25160,3\n11135#1:25163,3\n11145#1:25166,3\n11155#1:25169,4\n11165#1:25173,4\n11175#1:25177,4\n11185#1:25181,4\n11195#1:25185,4\n11205#1:25189,4\n11215#1:25193,4\n11225#1:25197,4\n11235#1:25201,4\n11245#1:25205\n11245#1:25206,2\n11245#1:25209\n11245#1:25210\n11255#1:25211,3\n11383#1:25214\n11383#1:25215\n11383#1:25217\n11383#1:25218\n11391#1:25219,2\n18891#1:25221,3\n18903#1:25224,3\n18915#1:25227,3\n18927#1:25230,3\n18939#1:25233,3\n18951#1:25236,3\n18963#1:25239,3\n18975#1:25242,3\n18987#1:25245,3\n21455#1:25248,2\n21455#1:25251,6\n21617#1:25257,2\n21617#1:25260,6\n22944#1:25266,6\n22954#1:25272,6\n22964#1:25278,6\n22974#1:25284,6\n22984#1:25290,6\n22994#1:25296,6\n23004#1:25302,6\n23014#1:25308,6\n23024#1:25314,6\n23178#1:25320,8\n23188#1:25328,8\n23198#1:25336,8\n23208#1:25344,8\n23218#1:25352,8\n23228#1:25360,8\n23238#1:25368,8\n23248#1:25376,8\n23258#1:25384,8\n23430#1:25392,6\n23440#1:25398,6\n23450#1:25404,6\n23460#1:25410,6\n23470#1:25416,6\n23480#1:25422,6\n23490#1:25428,6\n23500#1:25434,6\n11245#1:25208\n11383#1:25216\n21455#1:25250\n21617#1:25259\n10513#1:24785,7\n10525#1:24798,7\n10537#1:24811,7\n10549#1:24824,7\n10561#1:24837,7\n10573#1:24850,7\n10585#1:24863,7\n10597#1:24876,7\n10609#1:24889,7\n10622#1:24902,7\n10635#1:24915,7\n10648#1:24928,7\n10661#1:24941,7\n10674#1:24954,7\n10687#1:24967,7\n10700#1:24980,7\n10713#1:24993,7\n10726#1:25006,7\n10740#1:25016,7\n10757#1:25023,7\n10774#1:25030,7\n10791#1:25037,7\n10808#1:25044,7\n10825#1:25051,7\n10842#1:25058,7\n10859#1:25065,7\n10876#1:25072,7\n10894#1:25079,7\n10912#1:25086,7\n10930#1:25093,7\n10948#1:25100,7\n10966#1:25107,7\n10984#1:25114,7\n11002#1:25121,7\n11020#1:25128,7\n11038#1:25135,7\n*E\n"})
public class C6144h extends kotlin.collections.kja0 {

    /* JADX INFO: renamed from: kotlin.collections.h$cdj */
    /* JADX INFO: compiled from: Sequences.kt */
    @kotlin.jvm.internal.lv5({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,680:1\n24110#2:681\n*E\n"})
    public static final class cdj implements kotlin.sequences.qrj<Boolean> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ boolean[] f36142k;

        public cdj(boolean[] zArr) {
            this.f36142k = zArr;
        }

        @Override // kotlin.sequences.qrj
        @InterfaceC7396q
        public Iterator<Boolean> iterator() {
            return C6306p.m23141k(this.f36142k);
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.h$f7l8 */
    /* JADX INFO: compiled from: Iterables.kt */
    @kotlin.jvm.internal.lv5({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,70:1\n24014#2:71\n*E\n"})
    public static final class f7l8 implements Iterable<Double>, InterfaceC7625k {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ double[] f36143k;

        public f7l8(double[] dArr) {
            this.f36143k = dArr;
        }

        @Override // java.lang.Iterable
        @InterfaceC7396q
        public Iterator<Double> iterator() {
            return C6306p.m23143q(this.f36143k);
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.h$fn3e */
    /* JADX INFO: compiled from: _Arrays.kt */
    static final class fn3e extends AbstractC6308r implements InterfaceC5981k<Iterator<? extends Byte>> {
        final /* synthetic */ byte[] $this_withIndex;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        fn3e(byte[] bArr) {
            super(0);
            this.$this_withIndex = bArr;
        }

        @Override // cyoe.InterfaceC5981k
        @InterfaceC7396q
        public final Iterator<? extends Byte> invoke() {
            return C6306p.toq(this.$this_withIndex);
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.h$fu4 */
    /* JADX INFO: compiled from: _Arrays.kt */
    static final class fu4 extends AbstractC6308r implements InterfaceC5981k<Iterator<? extends Long>> {
        final /* synthetic */ long[] $this_withIndex;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        fu4(long[] jArr) {
            super(0);
            this.$this_withIndex = jArr;
        }

        @Override // cyoe.InterfaceC5981k
        @InterfaceC7396q
        public final Iterator<? extends Long> invoke() {
            return C6306p.f7l8(this.$this_withIndex);
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.h$g */
    /* JADX INFO: compiled from: Iterables.kt */
    @kotlin.jvm.internal.lv5({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,70:1\n24006#2:71\n*E\n"})
    public static final class g implements Iterable<Float>, InterfaceC7625k {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ float[] f36144k;

        public g(float[] fArr) {
            this.f36144k = fArr;
        }

        @Override // java.lang.Iterable
        @InterfaceC7396q
        public Iterator<Float> iterator() {
            return C6306p.m23142n(this.f36144k);
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.h$h */
    /* JADX INFO: compiled from: Sequences.kt */
    @kotlin.jvm.internal.lv5({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,680:1\n24100#2:681\n*E\n"})
    public static final class h implements kotlin.sequences.qrj<Double> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ double[] f36145k;

        public h(double[] dArr) {
            this.f36145k = dArr;
        }

        @Override // kotlin.sequences.qrj
        @InterfaceC7396q
        public Iterator<Double> iterator() {
            return C6306p.m23143q(this.f36145k);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlin.collections.h$i */
    /* JADX INFO: compiled from: _Arrays.kt */
    static final class i<T> extends AbstractC6308r implements InterfaceC5981k<Iterator<? extends T>> {
        final /* synthetic */ T[] $this_withIndex;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(T[] tArr) {
            super(0);
            this.$this_withIndex = tArr;
        }

        @Override // cyoe.InterfaceC5981k
        @InterfaceC7396q
        public final Iterator<T> invoke() {
            return C6309s.m23145k(this.$this_withIndex);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlin.collections.h$k */
    /* JADX INFO: compiled from: Iterables.kt */
    @kotlin.jvm.internal.lv5({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,70:1\n23966#2:71\n*E\n"})
    public static final class k<T> implements Iterable<T>, InterfaceC7625k {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Object[] f36146k;

        public k(Object[] objArr) {
            this.f36146k = objArr;
        }

        @Override // java.lang.Iterable
        @InterfaceC7396q
        public Iterator<T> iterator() {
            return C6309s.m23145k(this.f36146k);
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.h$ki */
    /* JADX INFO: compiled from: Sequences.kt */
    @kotlin.jvm.internal.lv5({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,680:1\n24120#2:681\n*E\n"})
    public static final class ki implements kotlin.sequences.qrj<Character> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ char[] f36147k;

        public ki(char[] cArr) {
            this.f36147k = cArr;
        }

        @Override // kotlin.sequences.qrj
        @InterfaceC7396q
        public Iterator<Character> iterator() {
            return C6306p.zy(this.f36147k);
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.h$kja0 */
    /* JADX INFO: compiled from: Sequences.kt */
    @kotlin.jvm.internal.lv5({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,680:1\n24090#2:681\n*E\n"})
    public static final class kja0 implements kotlin.sequences.qrj<Float> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ float[] f36148k;

        public kja0(float[] fArr) {
            this.f36148k = fArr;
        }

        @Override // kotlin.sequences.qrj
        @InterfaceC7396q
        public Iterator<Float> iterator() {
            return C6306p.m23142n(this.f36148k);
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.h$ld6 */
    /* JADX INFO: compiled from: Sequences.kt */
    @kotlin.jvm.internal.lv5({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,680:1\n24050#2:681\n*E\n"})
    public static final class ld6 implements kotlin.sequences.qrj<Byte> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ byte[] f36149k;

        public ld6(byte[] bArr) {
            this.f36149k = bArr;
        }

        @Override // kotlin.sequences.qrj
        @InterfaceC7396q
        public Iterator<Byte> iterator() {
            return C6306p.toq(this.f36149k);
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.h$n */
    /* JADX INFO: compiled from: Iterables.kt */
    @kotlin.jvm.internal.lv5({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,70:1\n23998#2:71\n*E\n"})
    public static final class n implements Iterable<Long>, InterfaceC7625k {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ long[] f36150k;

        public n(long[] jArr) {
            this.f36150k = jArr;
        }

        @Override // java.lang.Iterable
        @InterfaceC7396q
        public Iterator<Long> iterator() {
            return C6306p.f7l8(this.f36150k);
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.h$n7h */
    /* JADX INFO: compiled from: Sequences.kt */
    @kotlin.jvm.internal.lv5({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,680:1\n24080#2:681\n*E\n"})
    public static final class n7h implements kotlin.sequences.qrj<Long> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ long[] f36151k;

        public n7h(long[] jArr) {
            this.f36151k = jArr;
        }

        @Override // kotlin.sequences.qrj
        @InterfaceC7396q
        public Iterator<Long> iterator() {
            return C6306p.f7l8(this.f36151k);
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.h$ni7 */
    /* JADX INFO: compiled from: _Arrays.kt */
    static final class ni7 extends AbstractC6308r implements InterfaceC5981k<Iterator<? extends Integer>> {
        final /* synthetic */ int[] $this_withIndex;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ni7(int[] iArr) {
            super(0);
            this.$this_withIndex = iArr;
        }

        @Override // cyoe.InterfaceC5981k
        @InterfaceC7396q
        public final Iterator<? extends Integer> invoke() {
            return C6306p.m23140g(this.$this_withIndex);
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.h$o1t */
    /* JADX INFO: compiled from: _Arrays.kt */
    static final class o1t extends AbstractC6308r implements InterfaceC5981k<Iterator<? extends Double>> {
        final /* synthetic */ double[] $this_withIndex;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o1t(double[] dArr) {
            super(0);
            this.$this_withIndex = dArr;
        }

        @Override // cyoe.InterfaceC5981k
        @InterfaceC7396q
        public final Iterator<? extends Double> invoke() {
            return C6306p.m23143q(this.$this_withIndex);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlin.collections.h$p */
    /* JADX INFO: compiled from: Sequences.kt */
    @kotlin.jvm.internal.lv5({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,680:1\n24040#2:681\n*E\n"})
    public static final class p<T> implements kotlin.sequences.qrj<T> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Object[] f36152k;

        public p(Object[] objArr) {
            this.f36152k = objArr;
        }

        @Override // kotlin.sequences.qrj
        @InterfaceC7396q
        public Iterator<T> iterator() {
            return C6309s.m23145k(this.f36152k);
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.h$q */
    /* JADX INFO: compiled from: Iterables.kt */
    @kotlin.jvm.internal.lv5({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,70:1\n23990#2:71\n*E\n"})
    public static final class q implements Iterable<Integer>, InterfaceC7625k {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ int[] f36153k;

        public q(int[] iArr) {
            this.f36153k = iArr;
        }

        @Override // java.lang.Iterable
        @InterfaceC7396q
        public Iterator<Integer> iterator() {
            return C6306p.m23140g(this.f36153k);
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.h$qrj */
    /* JADX INFO: compiled from: Sequences.kt */
    @kotlin.jvm.internal.lv5({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,680:1\n24070#2:681\n*E\n"})
    public static final class qrj implements kotlin.sequences.qrj<Integer> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ int[] f36154k;

        public qrj(int[] iArr) {
            this.f36154k = iArr;
        }

        @Override // kotlin.sequences.qrj
        @InterfaceC7396q
        public Iterator<Integer> iterator() {
            return C6306p.m23140g(this.f36154k);
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.h$s */
    /* JADX INFO: compiled from: Iterables.kt */
    @kotlin.jvm.internal.lv5({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,70:1\n24030#2:71\n*E\n"})
    public static final class s implements Iterable<Character>, InterfaceC7625k {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ char[] f36155k;

        public s(char[] cArr) {
            this.f36155k = cArr;
        }

        @Override // java.lang.Iterable
        @InterfaceC7396q
        public Iterator<Character> iterator() {
            return C6306p.zy(this.f36155k);
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.h$t */
    /* JADX INFO: compiled from: _Arrays.kt */
    static final class t extends AbstractC6308r implements InterfaceC5981k<Iterator<? extends Character>> {
        final /* synthetic */ char[] $this_withIndex;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(char[] cArr) {
            super(0);
            this.$this_withIndex = cArr;
        }

        @Override // cyoe.InterfaceC5981k
        @InterfaceC7396q
        public final Iterator<? extends Character> invoke() {
            return C6306p.zy(this.$this_withIndex);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T, K] */
    /* JADX INFO: renamed from: kotlin.collections.h$t8r */
    /* JADX INFO: compiled from: _Arrays.kt */
    @kotlin.jvm.internal.lv5({"SMAP\n_Arrays.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt$groupingBy$1\n*L\n1#1,24423:1\n*E\n"})
    public static final class t8r<K, T> implements d2ok<T, K> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ T[] f36156k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ cyoe.x2<T, K> f81780toq;

        /* JADX WARN: Multi-variable type inference failed */
        public t8r(T[] tArr, cyoe.x2<? super T, ? extends K> x2Var) {
            this.f36156k = tArr;
            this.f81780toq = x2Var;
        }

        @Override // kotlin.collections.d2ok
        /* JADX INFO: renamed from: k */
        public K mo22425k(T t2) {
            return this.f81780toq.invoke(t2);
        }

        @Override // kotlin.collections.d2ok
        @InterfaceC7396q
        public Iterator<T> toq() {
            return C6309s.m23145k(this.f36156k);
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.h$toq */
    /* JADX INFO: compiled from: Iterables.kt */
    @kotlin.jvm.internal.lv5({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,70:1\n23974#2:71\n*E\n"})
    public static final class toq implements Iterable<Byte>, InterfaceC7625k {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ byte[] f36157k;

        public toq(byte[] bArr) {
            this.f36157k = bArr;
        }

        @Override // java.lang.Iterable
        @InterfaceC7396q
        public Iterator<Byte> iterator() {
            return C6306p.toq(this.f36157k);
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.h$wvg */
    /* JADX INFO: compiled from: _Arrays.kt */
    static final class wvg extends AbstractC6308r implements InterfaceC5981k<Iterator<? extends Boolean>> {
        final /* synthetic */ boolean[] $this_withIndex;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        wvg(boolean[] zArr) {
            super(0);
            this.$this_withIndex = zArr;
        }

        @Override // cyoe.InterfaceC5981k
        @InterfaceC7396q
        public final Iterator<? extends Boolean> invoke() {
            return C6306p.m23141k(this.$this_withIndex);
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.h$x2 */
    /* JADX INFO: compiled from: Sequences.kt */
    @kotlin.jvm.internal.lv5({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,680:1\n24060#2:681\n*E\n"})
    public static final class x2 implements kotlin.sequences.qrj<Short> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ short[] f36158k;

        public x2(short[] sArr) {
            this.f36158k = sArr;
        }

        @Override // kotlin.sequences.qrj
        @InterfaceC7396q
        public Iterator<Short> iterator() {
            return C6306p.m23144y(this.f36158k);
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.h$y */
    /* JADX INFO: compiled from: Iterables.kt */
    @kotlin.jvm.internal.lv5({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,70:1\n24022#2:71\n*E\n"})
    public static final class y implements Iterable<Boolean>, InterfaceC7625k {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ boolean[] f36159k;

        public y(boolean[] zArr) {
            this.f36159k = zArr;
        }

        @Override // java.lang.Iterable
        @InterfaceC7396q
        public Iterator<Boolean> iterator() {
            return C6306p.m23141k(this.f36159k);
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.h$z */
    /* JADX INFO: compiled from: _Arrays.kt */
    static final class z extends AbstractC6308r implements InterfaceC5981k<Iterator<? extends Float>> {
        final /* synthetic */ float[] $this_withIndex;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        z(float[] fArr) {
            super(0);
            this.$this_withIndex = fArr;
        }

        @Override // cyoe.InterfaceC5981k
        @InterfaceC7396q
        public final Iterator<? extends Float> invoke() {
            return C6306p.m23142n(this.$this_withIndex);
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.h$zurt */
    /* JADX INFO: compiled from: _Arrays.kt */
    static final class zurt extends AbstractC6308r implements InterfaceC5981k<Iterator<? extends Short>> {
        final /* synthetic */ short[] $this_withIndex;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zurt(short[] sArr) {
            super(0);
            this.$this_withIndex = sArr;
        }

        @Override // cyoe.InterfaceC5981k
        @InterfaceC7396q
        public final Iterator<? extends Short> invoke() {
            return C6306p.m23144y(this.$this_withIndex);
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.h$zy */
    /* JADX INFO: compiled from: Iterables.kt */
    @kotlin.jvm.internal.lv5({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,70:1\n23982#2:71\n*E\n"})
    public static final class zy implements Iterable<Short>, InterfaceC7625k {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ short[] f36160k;

        public zy(short[] sArr) {
            this.f36160k = sArr;
        }

        @Override // java.lang.Iterable
        @InterfaceC7396q
        public Iterator<Short> iterator() {
            return C6306p.m23144y(this.f36160k);
        }
    }

    public static final int a0(@InterfaceC7396q int[] iArr, @InterfaceC7396q cyoe.cdj<? super Integer, ? super Integer, ? super Integer, Integer> operation) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (iArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        int iIntValue = iArr[0];
        n5r1 it = new kotlin.ranges.x2(1, srpc(iArr)).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            iIntValue = operation.invoke(Integer.valueOf(iNextInt), Integer.valueOf(iIntValue), Integer.valueOf(iArr[iNextInt])).intValue();
        }
        return iIntValue;
    }

    public static final double a0w(@InterfaceC7396q double[] dArr) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        int length = dArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return dArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    @InterfaceC7396q
    public static final <A extends Appendable> A a2lv(@InterfaceC7396q double[] dArr, @InterfaceC7396q A buffer, @InterfaceC7396q CharSequence separator, @InterfaceC7396q CharSequence prefix, @InterfaceC7396q CharSequence postfix, int i2, @InterfaceC7396q CharSequence truncated, @InterfaceC7395n cyoe.x2<? super Double, ? extends CharSequence> x2Var) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(buffer, "buffer");
        kotlin.jvm.internal.d2ok.m23075h(separator, "separator");
        kotlin.jvm.internal.d2ok.m23075h(prefix, "prefix");
        kotlin.jvm.internal.d2ok.m23075h(postfix, "postfix");
        kotlin.jvm.internal.d2ok.m23075h(truncated, "truncated");
        buffer.append(prefix);
        int i3 = 0;
        for (double d2 : dArr) {
            i3++;
            if (i3 > 1) {
                buffer.append(separator);
            }
            if (i2 >= 0 && i3 > i2) {
                break;
            }
            if (x2Var != null) {
                buffer.append(x2Var.invoke(Double.valueOf(d2)));
            } else {
                buffer.append(String.valueOf(d2));
            }
        }
        if (i2 >= 0 && i3 > i2) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final Integer a4(int[] iArr) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        return j8wd(iArr, AbstractC6332g.Default);
    }

    @InterfaceC7396q
    public static final <T> List<T> a46k(@InterfaceC7396q T[] tArr, @InterfaceC7396q cyoe.x2<? super T, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (T t2 : tArr) {
            if (predicate.invoke(t2).booleanValue()) {
                arrayList.add(t2);
            }
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final <K, V> Map<K, V> a4ph(@InterfaceC7396q int[] iArr, @InterfaceC7396q cyoe.x2<? super Integer, ? extends K> keySelector, @InterfaceC7396q cyoe.x2<? super Integer, ? extends V> valueTransform) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(keySelector, "keySelector");
        kotlin.jvm.internal.d2ok.m23075h(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.fn3e.fn3e(C6140e.m22479p(iArr.length), 16));
        for (int i2 : iArr) {
            linkedHashMap.put(keySelector.invoke(Integer.valueOf(i2)), valueTransform.invoke(Integer.valueOf(i2)));
        }
        return linkedHashMap;
    }

    @kotlin.hyr
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @InterfaceC6769y(name = "flatMapIndexedIterableTo")
    private static final <R, C extends Collection<? super R>> C a5(double[] dArr, C destination, InterfaceC5979h<? super Integer, ? super Double, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        int length = dArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            C6163t.zp(destination, transform.invoke(Integer.valueOf(i3), Double.valueOf(dArr[i2])));
            i2++;
            i3++;
        }
        return destination;
    }

    @kotlin.hyr
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @InterfaceC6769y(name = "sumOfInt")
    private static final int a5le(double[] dArr, cyoe.x2<? super Double, Integer> selector) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        int iIntValue = 0;
        for (double d2 : dArr) {
            iIntValue += selector.invoke(Double.valueOf(d2)).intValue();
        }
        return iIntValue;
    }

    public static final double a5rs(@InterfaceC7396q short[] sArr) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        double d2 = 0.0d;
        int i2 = 0;
        for (short s2 : sArr) {
            d2 += (double) s2;
            i2++;
        }
        if (i2 == 0) {
            return Double.NaN;
        }
        return d2 / ((double) i2);
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final float a6(int[] iArr, cyoe.x2<? super Integer, Float> selector) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(Integer.valueOf(iArr[0])).floatValue();
        n5r1 it = new kotlin.ranges.x2(1, srpc(iArr)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, selector.invoke(Integer.valueOf(iArr[it.nextInt()])).floatValue());
        }
        return fFloatValue;
    }

    public static final <R> R a644(@InterfaceC7396q float[] fArr, R r2, @InterfaceC7396q InterfaceC5979h<? super Float, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        for (int iGto = gto(fArr); iGto >= 0; iGto--) {
            r2 = operation.invoke(Float.valueOf(fArr[iGto]), r2);
        }
        return r2;
    }

    @kotlin.yz(version = "1.4")
    public static final void a7(@InterfaceC7396q byte[] bArr, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.collections.kja0.kjd(bArr, i2, i3);
        vx(bArr, i2, i3);
    }

    @InterfaceC7396q
    public static final Set<Double> a77c(@InterfaceC7396q double[] dArr, @InterfaceC7396q Iterable<Double> other) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        Set<Double> setQtn = qtn(dArr);
        C6163t.zsr0(setQtn, other);
        return setQtn;
    }

    @InterfaceC7396q
    public static final <C extends Collection<? super Integer>> C a7on(@InterfaceC7396q int[] iArr, @InterfaceC7396q C destination) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        for (int i2 : iArr) {
            destination.add(Integer.valueOf(i2));
        }
        return destination;
    }

    @InterfaceC7396q
    public static final <T, R, V> List<V> a7y9(@InterfaceC7396q T[] tArr, @InterfaceC7396q R[] other, @InterfaceC7396q InterfaceC5979h<? super T, ? super R, ? extends V> transform) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        int iMin = Math.min(tArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i2 = 0; i2 < iMin; i2++) {
            arrayList.add(transform.invoke(tArr[i2], other[i2]));
        }
        return arrayList;
    }

    public static final boolean a7zh(@InterfaceC7396q boolean[] zArr, @InterfaceC7396q cyoe.x2<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (boolean z2 : zArr) {
            if (predicate.invoke(Boolean.valueOf(z2)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @InterfaceC7396q
    public static final <K> Map<K, List<Integer>> a800(@InterfaceC7396q int[] iArr, @InterfaceC7396q cyoe.x2<? super Integer, ? extends K> keySelector) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i2 : iArr) {
            K kInvoke = keySelector.invoke(Integer.valueOf(i2));
            Object arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(Integer.valueOf(i2));
        }
        return linkedHashMap;
    }

    @InterfaceC7396q
    public static final List<Boolean> a95z(@InterfaceC7396q boolean[] zArr, @InterfaceC7396q cyoe.x2<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (boolean z2 : zArr) {
            if (!predicate.invoke(Boolean.valueOf(z2)).booleanValue()) {
                break;
            }
            arrayList.add(Boolean.valueOf(z2));
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final <R> List<R> ac(@InterfaceC7396q boolean[] zArr, @InterfaceC7396q cyoe.x2<? super Boolean, ? extends R> transform) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean z2 : zArr) {
            arrayList.add(transform.invoke(Boolean.valueOf(z2)));
        }
        return arrayList;
    }

    public static final <R> R acgx(@InterfaceC7396q short[] sArr, R r2, @InterfaceC7396q InterfaceC5979h<? super R, ? super Short, ? extends R> operation) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        for (short s2 : sArr) {
            r2 = operation.invoke(r2, Short.valueOf(s2));
        }
        return r2;
    }

    @InterfaceC7396q
    public static final <T, R> List<R> ad(@InterfaceC7396q T[] tArr, @InterfaceC7396q InterfaceC5979h<? super Integer, ? super T, ? extends R> transform) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        ArrayList arrayList = new ArrayList(tArr.length);
        int length = tArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            arrayList.add(transform.invoke(Integer.valueOf(i3), tArr[i2]));
            i2++;
            i3++;
        }
        return arrayList;
    }

    @InterfaceC6769y(name = "sumOfLong")
    public static final long ad8(@InterfaceC7396q Long[] lArr) {
        kotlin.jvm.internal.d2ok.m23075h(lArr, "<this>");
        long jLongValue = 0;
        for (Long l2 : lArr) {
            jLongValue += l2.longValue();
        }
        return jLongValue;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final char[] ada(char[] cArr, InterfaceC5979h<? super Integer, ? super Character, was> action) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(action, "action");
        int length = cArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            action.invoke(Integer.valueOf(i3), Character.valueOf(cArr[i2]));
            i2++;
            i3++;
        }
        return cArr;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <R extends Comparable<? super R>> R adn(double[] dArr, cyoe.x2<? super Double, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Double.valueOf(dArr[0]));
        n5r1 it = new kotlin.ranges.x2(1, f14(dArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Double.valueOf(dArr[it.nextInt()]));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC7396q
    public static final <C extends Collection<? super Byte>> C ads1(@InterfaceC7396q byte[] bArr, @InterfaceC7396q C destination) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        for (byte b2 : bArr) {
            destination.add(Byte.valueOf(b2));
        }
        return destination;
    }

    @InterfaceC7396q
    public static final <C extends Collection<? super Double>> C ae9n(@InterfaceC7396q double[] dArr, @InterfaceC7396q C destination) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        for (double d2 : dArr) {
            destination.add(Double.valueOf(d2));
        }
        return destination;
    }

    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final Boolean afni(@InterfaceC7396q boolean[] zArr, @InterfaceC7396q cyoe.cdj<? super Integer, ? super Boolean, ? super Boolean, Boolean> operation) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        int iRl = rl(zArr);
        if (iRl < 0) {
            return null;
        }
        boolean zBooleanValue = zArr[iRl];
        for (int i2 = iRl - 1; i2 >= 0; i2--) {
            zBooleanValue = operation.invoke(Integer.valueOf(i2), Boolean.valueOf(zArr[i2]), Boolean.valueOf(zBooleanValue)).booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    @InterfaceC7396q
    public static final <C extends Collection<? super Boolean>> C afv(@InterfaceC7396q boolean[] zArr, @InterfaceC7396q C destination, @InterfaceC7396q cyoe.x2<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (boolean z2 : zArr) {
            if (!predicate.invoke(Boolean.valueOf(z2)).booleanValue()) {
                destination.add(Boolean.valueOf(z2));
            }
        }
        return destination;
    }

    @InterfaceC7396q
    public static final <R extends Comparable<? super R>> List<Float> agdp(@InterfaceC7396q float[] fArr, @InterfaceC7396q cyoe.x2<? super Float, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        return q6c(fArr, new f7l8.zy(selector));
    }

    @InterfaceC7396q
    public static final float[] agf(@InterfaceC7396q float[] fArr) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        if (fArr.length == 0) {
            return fArr;
        }
        float[] fArr2 = new float[fArr.length];
        int iGto = gto(fArr);
        n5r1 it = new kotlin.ranges.x2(0, iGto).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            fArr2[iGto - iNextInt] = fArr[iNextInt];
        }
        return fArr2;
    }

    @kotlin.yz(version = "1.7")
    @InterfaceC6769y(name = "minOrThrow")
    public static final long ah9(@InterfaceC7396q long[] jArr) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        long j2 = jArr[0];
        n5r1 it = new kotlin.ranges.x2(1, hmvj(jArr)).iterator();
        while (it.hasNext()) {
            long j3 = jArr[it.nextInt()];
            if (j2 > j3) {
                j2 = j3;
            }
        }
        return j2;
    }

    @InterfaceC7396q
    public static final Iterable<Long> ahb(@InterfaceC7396q long[] jArr) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        return jArr.length == 0 ? kotlin.collections.ni7.a9() : new n(jArr);
    }

    @InterfaceC6234g
    private static final Short ahy0(short[] sArr, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        return nd9(sArr, i2);
    }

    @InterfaceC7396q
    public static byte[] aix(@InterfaceC7396q byte[] bArr, @InterfaceC7396q Collection<Integer> indices) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(indices, "indices");
        byte[] bArr2 = new byte[indices.size()];
        Iterator<Integer> it = indices.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            bArr2[i2] = bArr[it.next().intValue()];
            i2++;
        }
        return bArr2;
    }

    @kotlin.yz(version = "1.4")
    public static void aiyx(@InterfaceC7396q long[] jArr, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.collections.zy.Companion.m22683q(i2, i3, jArr.length);
        int i4 = (i2 + i3) / 2;
        if (i2 == i4) {
            return;
        }
        int i5 = i3 - 1;
        while (i2 < i4) {
            long j2 = jArr[i2];
            jArr[i2] = jArr[i5];
            jArr[i5] = j2;
            i5--;
            i2++;
        }
    }

    public static final boolean aj(@InterfaceC7396q boolean[] zArr, @InterfaceC7396q cyoe.cdj<? super Integer, ? super Boolean, ? super Boolean, Boolean> operation) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (zArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        boolean zBooleanValue = zArr[0];
        n5r1 it = new kotlin.ranges.x2(1, rl(zArr)).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            zBooleanValue = operation.invoke(Integer.valueOf(iNextInt), Boolean.valueOf(zBooleanValue), Boolean.valueOf(zArr[iNextInt])).booleanValue();
        }
        return zBooleanValue;
    }

    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final <R extends Comparable<? super R>> Character am(@InterfaceC7396q char[] cArr, @InterfaceC7396q cyoe.x2<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        char c2 = cArr[0];
        int iJ59a = j59a(cArr);
        if (iJ59a == 0) {
            return Character.valueOf(c2);
        }
        R rInvoke = selector.invoke(Character.valueOf(c2));
        n5r1 it = new kotlin.ranges.x2(1, iJ59a).iterator();
        while (it.hasNext()) {
            char c3 = cArr[it.nextInt()];
            R rInvoke2 = selector.invoke(Character.valueOf(c3));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                c2 = c3;
                rInvoke = rInvoke2;
            }
        }
        return Character.valueOf(c2);
    }

    @InterfaceC6234g
    private static final byte an(byte[] bArr) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        return bArr[3];
    }

    @InterfaceC7396q
    public static final <T, A extends Appendable> A anfo(@InterfaceC7396q T[] tArr, @InterfaceC7396q A buffer, @InterfaceC7396q CharSequence separator, @InterfaceC7396q CharSequence prefix, @InterfaceC7396q CharSequence postfix, int i2, @InterfaceC7396q CharSequence truncated, @InterfaceC7395n cyoe.x2<? super T, ? extends CharSequence> x2Var) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(buffer, "buffer");
        kotlin.jvm.internal.d2ok.m23075h(separator, "separator");
        kotlin.jvm.internal.d2ok.m23075h(prefix, "prefix");
        kotlin.jvm.internal.d2ok.m23075h(postfix, "postfix");
        kotlin.jvm.internal.d2ok.m23075h(truncated, "truncated");
        buffer.append(prefix);
        int i3 = 0;
        for (T t2 : tArr) {
            i3++;
            if (i3 > 1) {
                buffer.append(separator);
            }
            if (i2 >= 0 && i3 > i2) {
                break;
            }
            kotlin.text.ni7.toq(buffer, t2, x2Var);
        }
        if (i2 >= 0 && i3 > i2) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <R extends Comparable<? super R>> R aof(boolean[] zArr, cyoe.x2<? super Boolean, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Boolean.valueOf(zArr[0]));
        n5r1 it = new kotlin.ranges.x2(1, rl(zArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Boolean.valueOf(zArr[it.nextInt()]));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC7396q
    public static final <R extends Comparable<? super R>> List<Double> aojq(@InterfaceC7396q double[] dArr, @InterfaceC7396q cyoe.x2<? super Double, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        return onc0(dArr, new f7l8.zy(selector));
    }

    @kotlin.x2(warningSince = "1.5")
    @kotlin.ld6(message = "Use sumOf instead.", replaceWith = @kotlin.hb(expression = "this.sumOf(selector)", imports = {}))
    public static final int apb(@InterfaceC7396q long[] jArr, @InterfaceC7396q cyoe.x2<? super Long, Integer> selector) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        int iIntValue = 0;
        for (long j2 : jArr) {
            iIntValue += selector.invoke(Long.valueOf(j2)).intValue();
        }
        return iIntValue;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final <V, M extends Map<? super Float, ? super V>> M aq2a(float[] fArr, M destination, cyoe.x2<? super Float, ? extends V> valueSelector) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(valueSelector, "valueSelector");
        for (float f2 : fArr) {
            destination.put(Float.valueOf(f2), valueSelector.invoke(Float.valueOf(f2)));
        }
        return destination;
    }

    @InterfaceC7396q
    public static final <R, V> List<V> aqnf(@InterfaceC7396q int[] iArr, @InterfaceC7396q R[] other, @InterfaceC7396q InterfaceC5979h<? super Integer, ? super R, ? extends V> transform) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        int iMin = Math.min(iArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i2 = 0; i2 < iMin; i2++) {
            arrayList.add(transform.invoke(Integer.valueOf(iArr[i2]), other[i2]));
        }
        return arrayList;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final Double aqx(float[] fArr, cyoe.x2<? super Float, Double> selector) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        double dDoubleValue = selector.invoke(Float.valueOf(fArr[0])).doubleValue();
        n5r1 it = new kotlin.ranges.x2(1, gto(fArr)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, selector.invoke(Float.valueOf(fArr[it.nextInt()])).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final <R> List<R> ar(short[] sArr, R r2, cyoe.cdj<? super Integer, ? super R, ? super Short, ? extends R> operation) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (sArr.length == 0) {
            return kotlin.collections.zurt.ld6(r2);
        }
        ArrayList arrayList = new ArrayList(sArr.length + 1);
        arrayList.add(r2);
        int length = sArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            r2 = operation.invoke(Integer.valueOf(i2), r2, Short.valueOf(sArr[i2]));
            arrayList.add(r2);
        }
        return arrayList;
    }

    @InterfaceC6234g
    private static final <T> int ar4(T[] tArr) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        return tArr.length;
    }

    public static final short arkx(@InterfaceC7396q short[] sArr, @InterfaceC7396q InterfaceC5979h<? super Short, ? super Short, Short> operation) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        int iOrxw = orxw(sArr);
        if (iOrxw < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        short sShortValue = sArr[iOrxw];
        for (int i2 = iOrxw - 1; i2 >= 0; i2--) {
            sShortValue = operation.invoke(Short.valueOf(sArr[i2]), Short.valueOf(sShortValue)).shortValue();
        }
        return sShortValue;
    }

    @InterfaceC7395n
    public static final Integer as(@InterfaceC7396q int[] iArr, @InterfaceC7396q cyoe.x2<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (int i2 : iArr) {
            if (predicate.invoke(Integer.valueOf(i2)).booleanValue()) {
                return Integer.valueOf(i2);
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC7396q
    @kotlin.yz(version = "1.4")
    public static final <T, R> List<R> asr(@InterfaceC7396q T[] tArr, R r2, @InterfaceC7396q InterfaceC5979h<? super R, ? super T, ? extends R> operation) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (tArr.length == 0) {
            return kotlin.collections.zurt.ld6(r2);
        }
        ArrayList arrayList = new ArrayList(tArr.length + 1);
        arrayList.add(r2);
        for (a98o.toq toqVar : tArr) {
            r2 = operation.invoke(r2, toqVar);
            arrayList.add(r2);
        }
        return arrayList;
    }

    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final <R extends Comparable<? super R>> Long avdu(@InterfaceC7396q long[] jArr, @InterfaceC7396q cyoe.x2<? super Long, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        long j2 = jArr[0];
        int iHmvj = hmvj(jArr);
        if (iHmvj == 0) {
            return Long.valueOf(j2);
        }
        R rInvoke = selector.invoke(Long.valueOf(j2));
        n5r1 it = new kotlin.ranges.x2(1, iHmvj).iterator();
        while (it.hasNext()) {
            long j3 = jArr[it.nextInt()];
            R rInvoke2 = selector.invoke(Long.valueOf(j3));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
                j2 = j3;
            }
        }
        return Long.valueOf(j2);
    }

    @kotlin.yz(version = "1.4")
    public static final void aw19(@InterfaceC7396q char[] cArr, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.collections.kja0.k4jz(cArr, i2, i3);
        qn(cArr, i2, i3);
    }

    @InterfaceC6234g
    private static final boolean ax(boolean[] zArr) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        return zArr.length == 0;
    }

    @kotlin.yz(version = "1.7")
    @InterfaceC6769y(name = "maxWithOrThrow")
    public static final byte ax0p(@InterfaceC7396q byte[] bArr, @InterfaceC7396q Comparator<? super Byte> comparator) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        byte b2 = bArr[0];
        n5r1 it = new kotlin.ranges.x2(1, vl(bArr)).iterator();
        while (it.hasNext()) {
            byte b3 = bArr[it.nextInt()];
            if (comparator.compare(Byte.valueOf(b2), Byte.valueOf(b3)) < 0) {
                b2 = b3;
            }
        }
        return b2;
    }

    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final Character ay(@InterfaceC7396q char[] cArr, @InterfaceC7396q Comparator<? super Character> comparator) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        if (cArr.length == 0) {
            return null;
        }
        char c2 = cArr[0];
        n5r1 it = new kotlin.ranges.x2(1, j59a(cArr)).iterator();
        while (it.hasNext()) {
            char c3 = cArr[it.nextInt()];
            if (comparator.compare(Character.valueOf(c2), Character.valueOf(c3)) < 0) {
                c2 = c3;
            }
        }
        return Character.valueOf(c2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC7396q
    public static final <K, V, M extends Map<? super K, List<V>>> M az(@InterfaceC7396q byte[] bArr, @InterfaceC7396q M destination, @InterfaceC7396q cyoe.x2<? super Byte, ? extends K> keySelector, @InterfaceC7396q cyoe.x2<? super Byte, ? extends V> valueTransform) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(keySelector, "keySelector");
        kotlin.jvm.internal.d2ok.m23075h(valueTransform, "valueTransform");
        for (byte b2 : bArr) {
            K kInvoke = keySelector.invoke(Byte.valueOf(b2));
            Object arrayList = destination.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(valueTransform.invoke(Byte.valueOf(b2)));
        }
        return destination;
    }

    @InterfaceC7396q
    public static final <K> List<Integer> azf(@InterfaceC7396q int[] iArr, @InterfaceC7396q cyoe.x2<? super Integer, ? extends K> selector) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (int i2 : iArr) {
            if (hashSet.add(selector.invoke(Integer.valueOf(i2)))) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final <R> List<R> azz1(@InterfaceC7396q float[] fArr, @InterfaceC7396q cyoe.x2<? super Float, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (float f2 : fArr) {
            C6163t.zp(arrayList, transform.invoke(Float.valueOf(f2)));
        }
        return arrayList;
    }

    @InterfaceC7395n
    public static <T> T b0(@InterfaceC7396q T[] tArr, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        if (i2 < 0 || i2 > gjp(tArr)) {
            return null;
        }
        return tArr[i2];
    }

    @InterfaceC7396q
    public static int[] b03g(@InterfaceC7396q int[] iArr, @InterfaceC7396q Collection<Integer> indices) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(indices, "indices");
        int[] iArr2 = new int[indices.size()];
        Iterator<Integer> it = indices.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            iArr2[i2] = iArr[it.next().intValue()];
            i2++;
        }
        return iArr2;
    }

    @InterfaceC7396q
    public static final <T, C extends Collection<? super T>> C b1(@InterfaceC7396q T[] tArr, @InterfaceC7396q C destination, @InterfaceC7396q cyoe.x2<? super T, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (T t2 : tArr) {
            if (predicate.invoke(t2).booleanValue()) {
                destination.add(t2);
            }
        }
        return destination;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.3")
    private static final char b10b(char[] cArr) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        return km71(cArr, AbstractC6332g.Default);
    }

    @InterfaceC7396q
    public static final List<C6227f<Byte, Byte>> b1th(@InterfaceC7396q byte[] bArr, @InterfaceC7396q byte[] other) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        int iMin = Math.min(bArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i2 = 0; i2 < iMin; i2++) {
            arrayList.add(kotlin.nmn5.m23230k(Byte.valueOf(bArr[i2]), Byte.valueOf(other[i2])));
        }
        return arrayList;
    }

    public static final byte b1ty(@InterfaceC7396q byte[] bArr, @InterfaceC7396q InterfaceC5979h<? super Byte, ? super Byte, Byte> operation) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (bArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        byte bByteValue = bArr[0];
        n5r1 it = new kotlin.ranges.x2(1, vl(bArr)).iterator();
        while (it.hasNext()) {
            bByteValue = operation.invoke(Byte.valueOf(bByteValue), Byte.valueOf(bArr[it.nextInt()])).byteValue();
        }
        return bByteValue;
    }

    @kotlin.x2(warningSince = "1.5")
    @kotlin.ld6(message = "Use sumOf instead.", replaceWith = @kotlin.hb(expression = "this.sumOf(selector)", imports = {}))
    public static final double b2bv(@InterfaceC7396q double[] dArr, @InterfaceC7396q cyoe.x2<? super Double, Double> selector) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        double dDoubleValue = 0.0d;
        for (double d2 : dArr) {
            dDoubleValue += selector.invoke(Double.valueOf(d2)).doubleValue();
        }
        return dDoubleValue;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final double b3(char[] cArr, cyoe.x2<? super Character, Double> selector) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(Character.valueOf(cArr[0])).doubleValue();
        n5r1 it = new kotlin.ranges.x2(1, j59a(cArr)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, selector.invoke(Character.valueOf(cArr[it.nextInt()])).doubleValue());
        }
        return dDoubleValue;
    }

    @InterfaceC7396q
    public static final Set<Integer> b37y(@InterfaceC7396q int[] iArr, @InterfaceC7396q Iterable<Integer> other) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        Set<Integer> setGvu = gvu(iArr);
        C6163t.zsr0(setGvu, other);
        return setGvu;
    }

    public static final boolean b3fl(@InterfaceC7396q boolean[] zArr) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        return !(zArr.length == 0);
    }

    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final <R extends Comparable<? super R>> Boolean b4(@InterfaceC7396q boolean[] zArr, @InterfaceC7396q cyoe.x2<? super Boolean, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        boolean z2 = zArr[0];
        int iRl = rl(zArr);
        if (iRl == 0) {
            return Boolean.valueOf(z2);
        }
        R rInvoke = selector.invoke(Boolean.valueOf(z2));
        n5r1 it = new kotlin.ranges.x2(1, iRl).iterator();
        while (it.hasNext()) {
            boolean z3 = zArr[it.nextInt()];
            R rInvoke2 = selector.invoke(Boolean.valueOf(z3));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                z2 = z3;
                rInvoke = rInvoke2;
            }
        }
        return Boolean.valueOf(z2);
    }

    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final Character b5(@InterfaceC7396q char[] cArr) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        if (cArr.length == 0) {
            return null;
        }
        char c2 = cArr[0];
        n5r1 it = new kotlin.ranges.x2(1, j59a(cArr)).iterator();
        while (it.hasNext()) {
            char c3 = cArr[it.nextInt()];
            if (kotlin.jvm.internal.d2ok.m23076i(c2, c3) < 0) {
                c2 = c3;
            }
        }
        return Character.valueOf(c2);
    }

    @InterfaceC7396q
    public static final <K, V> Map<K, V> b6i9(@InterfaceC7396q long[] jArr, @InterfaceC7396q cyoe.x2<? super Long, ? extends K> keySelector, @InterfaceC7396q cyoe.x2<? super Long, ? extends V> valueTransform) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(keySelector, "keySelector");
        kotlin.jvm.internal.d2ok.m23075h(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.fn3e.fn3e(C6140e.m22479p(jArr.length), 16));
        for (long j2 : jArr) {
            linkedHashMap.put(keySelector.invoke(Long.valueOf(j2)), valueTransform.invoke(Long.valueOf(j2)));
        }
        return linkedHashMap;
    }

    @InterfaceC7396q
    public static final <C extends Collection<? super Short>> C b6t2(@InterfaceC7396q short[] sArr, @InterfaceC7396q C destination, @InterfaceC7396q InterfaceC5979h<? super Integer, ? super Short, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        int length = sArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            short s2 = sArr[i2];
            int i4 = i3 + 1;
            if (predicate.invoke(Integer.valueOf(i3), Short.valueOf(s2)).booleanValue()) {
                destination.add(Short.valueOf(s2));
            }
            i2++;
            i3 = i4;
        }
        return destination;
    }

    @InterfaceC7396q
    public static final <T> Iterable<x9kr<T>> b71(@InterfaceC7396q T[] tArr) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        return new ncyb(new i(tArr));
    }

    @kotlin.hyr
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @InterfaceC6769y(name = "sumOfDouble")
    private static final double b7h(int[] iArr, cyoe.x2<? super Integer, Double> selector) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        double dDoubleValue = 0.0d;
        for (int i2 : iArr) {
            dDoubleValue += selector.invoke(Integer.valueOf(i2)).doubleValue();
        }
        return dDoubleValue;
    }

    public static final void b7sa(@InterfaceC7396q int[] iArr) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        if (iArr.length > 1) {
            kotlin.collections.kja0.e4e(iArr);
            q9e(iArr);
        }
    }

    @kotlin.yz(version = "1.3")
    public static final short b8j1(@InterfaceC7396q short[] sArr, @InterfaceC7396q AbstractC6332g random) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(random, "random");
        if (sArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return sArr[random.nextInt(sArr.length)];
    }

    @InterfaceC7396q
    public static final <K, M extends Map<? super K, ? super Float>> M b972(@InterfaceC7396q float[] fArr, @InterfaceC7396q M destination, @InterfaceC7396q cyoe.x2<? super Float, ? extends K> keySelector) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(keySelector, "keySelector");
        for (float f2 : fArr) {
            destination.put(keySelector.invoke(Float.valueOf(f2)), Float.valueOf(f2));
        }
        return destination;
    }

    public static final int ba(@InterfaceC7396q byte[] bArr, @InterfaceC7396q cyoe.x2<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        int length = bArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (predicate.invoke(Byte.valueOf(bArr[length])).booleanValue()) {
                    return length;
                }
                if (i2 < 0) {
                    break;
                }
                length = i2;
            }
        }
        return -1;
    }

    public static final byte ba7(@InterfaceC7396q byte[] bArr, @InterfaceC7396q cyoe.cdj<? super Integer, ? super Byte, ? super Byte, Byte> operation) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (bArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        byte bByteValue = bArr[0];
        n5r1 it = new kotlin.ranges.x2(1, vl(bArr)).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            bByteValue = operation.invoke(Integer.valueOf(iNextInt), Byte.valueOf(bByteValue), Byte.valueOf(bArr[iNextInt])).byteValue();
        }
        return bByteValue;
    }

    @InterfaceC7396q
    public static final <K> Map<K, Short> bao0(@InterfaceC7396q short[] sArr, @InterfaceC7396q cyoe.x2<? super Short, ? extends K> keySelector) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.fn3e.fn3e(C6140e.m22479p(sArr.length), 16));
        for (short s2 : sArr) {
            linkedHashMap.put(keySelector.invoke(Short.valueOf(s2)), Short.valueOf(s2));
        }
        return linkedHashMap;
    }

    @InterfaceC7396q
    public static <T> Iterable<T> bb(@InterfaceC7396q T[] tArr) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        return tArr.length == 0 ? kotlin.collections.ni7.a9() : new k(tArr);
    }

    @InterfaceC7396q
    public static final <T> List<T> bb1(@InterfaceC7396q T[] tArr, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
        }
        if (i2 == 0) {
            return kotlin.collections.ni7.a9();
        }
        int length = tArr.length;
        if (i2 >= length) {
            return vyee(tArr);
        }
        if (i2 == 1) {
            return kotlin.collections.zurt.ld6(tArr[length - 1]);
        }
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = length - i2; i3 < length; i3++) {
            arrayList.add(tArr[i3]);
        }
        return arrayList;
    }

    public static final double bb8(@InterfaceC7396q double[] dArr, @InterfaceC7396q cyoe.cdj<? super Integer, ? super Double, ? super Double, Double> operation) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (dArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        double dDoubleValue = dArr[0];
        n5r1 it = new kotlin.ranges.x2(1, f14(dArr)).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            dDoubleValue = operation.invoke(Integer.valueOf(iNextInt), Double.valueOf(dDoubleValue), Double.valueOf(dArr[iNextInt])).doubleValue();
        }
        return dDoubleValue;
    }

    @kotlin.yz(version = "1.4")
    public static final void bb9p(@InterfaceC7396q byte[] bArr, @InterfaceC7396q AbstractC6332g random) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(random, "random");
        for (int iVl = vl(bArr); iVl > 0; iVl--) {
            int iNextInt = random.nextInt(iVl + 1);
            byte b2 = bArr[iVl];
            bArr[iVl] = bArr[iNextInt];
            bArr[iNextInt] = b2;
        }
    }

    @InterfaceC6234g
    private static final float bbg(float[] fArr) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        return fArr[0];
    }

    @InterfaceC6769y(name = "sumOfDouble")
    public static final double bc(@InterfaceC7396q Double[] dArr) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        double dDoubleValue = 0.0d;
        for (Double d2 : dArr) {
            dDoubleValue += d2.doubleValue();
        }
        return dDoubleValue;
    }

    @InterfaceC7396q
    public static final <R> List<C6227f<Float, R>> bd(@InterfaceC7396q float[] fArr, @InterfaceC7396q Iterable<? extends R> other) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        int length = fArr.length;
        ArrayList arrayList = new ArrayList(Math.min(kotlin.collections.fu4.vyq(other, 10), length));
        int i2 = 0;
        for (R r2 : other) {
            if (i2 >= length) {
                break;
            }
            arrayList.add(kotlin.nmn5.m23230k(Float.valueOf(fArr[i2]), r2));
            i2++;
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final List<Float> bd84(@InterfaceC7396q float[] fArr, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
        }
        if (i2 == 0) {
            return kotlin.collections.ni7.a9();
        }
        int length = fArr.length;
        if (i2 >= length) {
            return lk4(fArr);
        }
        if (i2 == 1) {
            return kotlin.collections.zurt.ld6(Float.valueOf(fArr[length - 1]));
        }
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = length - i2; i3 < length; i3++) {
            arrayList.add(Float.valueOf(fArr[i3]));
        }
        return arrayList;
    }

    @kotlin.yz(version = "1.3")
    public static final double be(@InterfaceC7396q double[] dArr, @InterfaceC7396q AbstractC6332g random) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(random, "random");
        if (dArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return dArr[random.nextInt(dArr.length)];
    }

    @InterfaceC7396q
    public static final List<Character> bewm(@InterfaceC7396q char[] cArr) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        if (cArr.length == 0) {
            return kotlin.collections.ni7.a9();
        }
        List<Character> listL2gm = l2gm(cArr);
        jk.vep5(listL2gm);
        return listL2gm;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, R> R bfh3(@InterfaceC7396q T[] tArr, R r2, @InterfaceC7396q InterfaceC5979h<? super T, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        for (int iGjp = gjp(tArr); iGjp >= 0; iGjp--) {
            r2 = operation.invoke(tArr[iGjp], r2);
        }
        return r2;
    }

    @kotlin.hyr
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @InterfaceC6769y(name = "flatMapIndexedIterableTo")
    private static final <R, C extends Collection<? super R>> C bg(char[] cArr, C destination, InterfaceC5979h<? super Integer, ? super Character, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        int length = cArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            C6163t.zp(destination, transform.invoke(Integer.valueOf(i3), Character.valueOf(cArr[i2])));
            i2++;
            i3++;
        }
        return destination;
    }

    @InterfaceC7396q
    public static final List<Integer> bgz(@InterfaceC7396q int[] iArr) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        int length = iArr.length;
        return length != 0 ? length != 1 ? v9ed(iArr) : kotlin.collections.zurt.ld6(Integer.valueOf(iArr[0])) : kotlin.collections.ni7.a9();
    }

    public static final <R> R bh2(@InterfaceC7396q int[] iArr, R r2, @InterfaceC7396q cyoe.cdj<? super Integer, ? super R, ? super Integer, ? extends R> operation) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            r2 = operation.invoke(Integer.valueOf(i3), r2, Integer.valueOf(iArr[i2]));
            i2++;
            i3++;
        }
        return r2;
    }

    public static final double bhar(@InterfaceC7396q double[] dArr) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        if (dArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return dArr[0];
    }

    public static int bhh(@InterfaceC7396q int[] iArr) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        if (iArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return iArr[srpc(iArr)];
    }

    public static final void bic(@InterfaceC7396q short[] sArr, @InterfaceC7396q cyoe.x2<? super Short, was> action) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(action, "action");
        for (short s2 : sArr) {
            action.invoke(Short.valueOf(s2));
        }
    }

    @InterfaceC7395n
    public static final Short bk3(@InterfaceC7396q short[] sArr) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        if (sArr.length == 1) {
            return Short.valueOf(sArr[0]);
        }
        return null;
    }

    @InterfaceC7396q
    public static final List<Byte> bklz(@InterfaceC7396q byte[] bArr, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
        }
        if (i2 == 0) {
            return kotlin.collections.ni7.a9();
        }
        if (i2 >= bArr.length) {
            return rek(bArr);
        }
        if (i2 == 1) {
            return kotlin.collections.zurt.ld6(Byte.valueOf(bArr[0]));
        }
        ArrayList arrayList = new ArrayList(i2);
        int i3 = 0;
        for (byte b2 : bArr) {
            arrayList.add(Byte.valueOf(b2));
            i3++;
            if (i3 == i2) {
                break;
            }
        }
        return arrayList;
    }

    @InterfaceC6234g
    private static final Byte bl(byte[] bArr, cyoe.x2<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        int length = bArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                byte b2 = bArr[length];
                if (predicate.invoke(Byte.valueOf(b2)).booleanValue()) {
                    return Byte.valueOf(b2);
                }
                if (i2 < 0) {
                    break;
                }
                length = i2;
            }
        }
        return null;
    }

    public static final long blj(@InterfaceC7396q long[] jArr, @InterfaceC7396q cyoe.cdj<? super Integer, ? super Long, ? super Long, Long> operation) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (jArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        long jLongValue = jArr[0];
        n5r1 it = new kotlin.ranges.x2(1, hmvj(jArr)).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            jLongValue = operation.invoke(Integer.valueOf(iNextInt), Long.valueOf(jLongValue), Long.valueOf(jArr[iNextInt])).longValue();
        }
        return jLongValue;
    }

    @InterfaceC7396q
    public static final Set<Character> blsz(@InterfaceC7396q char[] cArr, @InterfaceC7396q Iterable<Character> other) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        Set<Character> setH9 = h9(cArr);
        C6163t.vq(setH9, other);
        return setH9;
    }

    public static final boolean bmt3(@InterfaceC7396q double[] dArr, @InterfaceC7396q cyoe.x2<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (double d2 : dArr) {
            if (predicate.invoke(Double.valueOf(d2)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <T> double bn0(T[] tArr, cyoe.x2<? super T, Double> selector) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(tArr[0]).doubleValue();
        n5r1 it = new kotlin.ranges.x2(1, gjp(tArr)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, selector.invoke(tArr[it.nextInt()]).doubleValue());
        }
        return dDoubleValue;
    }

    @InterfaceC7396q
    public static final <V> List<V> bnp(@InterfaceC7396q long[] jArr, @InterfaceC7396q long[] other, @InterfaceC7396q InterfaceC5979h<? super Long, ? super Long, ? extends V> transform) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        int iMin = Math.min(jArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i2 = 0; i2 < iMin; i2++) {
            arrayList.add(transform.invoke(Long.valueOf(jArr[i2]), Long.valueOf(other[i2])));
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final List<Byte> bo7(@InterfaceC7396q byte[] bArr) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        if (bArr.length == 0) {
            return kotlin.collections.ni7.a9();
        }
        List<Byte> listHwpi = hwpi(bArr);
        jk.vep5(listHwpi);
        return listHwpi;
    }

    @InterfaceC7396q
    public static final <T> List<T> bogl(@InterfaceC7396q T[] tArr, @InterfaceC7396q cyoe.x2<? super T, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (int iGjp = gjp(tArr); -1 < iGjp; iGjp--) {
            if (!predicate.invoke(tArr[iGjp]).booleanValue()) {
                return i6(tArr, iGjp + 1);
            }
        }
        return kotlin.collections.ni7.a9();
    }

    @InterfaceC7396q
    public static final List<Byte> bou5(@InterfaceC7396q byte[] bArr, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
        }
        if (i2 == 0) {
            return kotlin.collections.ni7.a9();
        }
        int length = bArr.length;
        if (i2 >= length) {
            return rek(bArr);
        }
        if (i2 == 1) {
            return kotlin.collections.zurt.ld6(Byte.valueOf(bArr[length - 1]));
        }
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = length - i2; i3 < length; i3++) {
            arrayList.add(Byte.valueOf(bArr[i3]));
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final <T, K> Map<K, T> bp(@InterfaceC7396q T[] tArr, @InterfaceC7396q cyoe.x2<? super T, ? extends K> keySelector) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.fn3e.fn3e(C6140e.m22479p(tArr.length), 16));
        for (T t2 : tArr) {
            linkedHashMap.put(keySelector.invoke(t2), t2);
        }
        return linkedHashMap;
    }

    @InterfaceC7396q
    public static final <K> Map<K, List<Character>> bp0b(@InterfaceC7396q char[] cArr, @InterfaceC7396q cyoe.x2<? super Character, ? extends K> keySelector) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (char c2 : cArr) {
            K kInvoke = keySelector.invoke(Character.valueOf(c2));
            Object arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(Character.valueOf(c2));
        }
        return linkedHashMap;
    }

    @InterfaceC7395n
    public static final Integer bq(@InterfaceC7396q int[] iArr, @InterfaceC7396q cyoe.x2<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        int length = iArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i2 = length - 1;
            int i3 = iArr[length];
            if (predicate.invoke(Integer.valueOf(i3)).booleanValue()) {
                return Integer.valueOf(i3);
            }
            if (i2 < 0) {
                return null;
            }
            length = i2;
        }
    }

    public static final void bqr(@InterfaceC7396q float[] fArr, @InterfaceC7396q cyoe.x2<? super Float, was> action) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(action, "action");
        for (float f2 : fArr) {
            action.invoke(Float.valueOf(f2));
        }
    }

    @InterfaceC6234g
    private static final float bru(float[] fArr) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        return fArr[4];
    }

    public static final double bs(@InterfaceC7396q double[] dArr, @InterfaceC7396q InterfaceC5979h<? super Double, ? super Double, Double> operation) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        int iF14 = f14(dArr);
        if (iF14 < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        double dDoubleValue = dArr[iF14];
        for (int i2 = iF14 - 1; i2 >= 0; i2--) {
            dDoubleValue = operation.invoke(Double.valueOf(dArr[i2]), Double.valueOf(dDoubleValue)).doubleValue();
        }
        return dDoubleValue;
    }

    public static /* synthetic */ String bt4(float[] fArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, cyoe.x2 x2Var, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i3 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i3 & 4) == 0 ? charSequence3 : "";
        if ((i3 & 8) != 0) {
            i2 = -1;
        }
        int i4 = i2;
        if ((i3 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i3 & 32) != 0) {
            x2Var = null;
        }
        return ik8(fArr, charSequence, charSequence5, charSequence6, i4, charSequence7, x2Var);
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <T> Double bt9(T[] tArr, cyoe.x2<? super T, Double> selector) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        double dDoubleValue = selector.invoke(tArr[0]).doubleValue();
        n5r1 it = new kotlin.ranges.x2(1, gjp(tArr)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, selector.invoke(tArr[it.nextInt()]).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC7396q
    public static final <K, V, M extends Map<? super K, List<V>>> M btl(@InterfaceC7396q double[] dArr, @InterfaceC7396q M destination, @InterfaceC7396q cyoe.x2<? super Double, ? extends K> keySelector, @InterfaceC7396q cyoe.x2<? super Double, ? extends V> valueTransform) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(keySelector, "keySelector");
        kotlin.jvm.internal.d2ok.m23075h(valueTransform, "valueTransform");
        for (double d2 : dArr) {
            K kInvoke = keySelector.invoke(Double.valueOf(d2));
            Object arrayList = destination.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(valueTransform.invoke(Double.valueOf(d2)));
        }
        return destination;
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @kotlin.hyr
    @InterfaceC6234g
    @kotlin.yz(version = "1.5")
    @InterfaceC6769y(name = "sumOfULong")
    private static final <T> long bu(T[] tArr, cyoe.x2<? super T, ikck> selector) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        long jLd6 = ikck.ld6(0L);
        for (T t2 : tArr) {
            jLd6 = ikck.ld6(jLd6 + selector.invoke(t2).a98o());
        }
        return jLd6;
    }

    @InterfaceC7396q
    public static final <K, V, M extends Map<? super K, ? super V>> M bv(@InterfaceC7396q short[] sArr, @InterfaceC7396q M destination, @InterfaceC7396q cyoe.x2<? super Short, ? extends C6227f<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        for (short s2 : sArr) {
            C6227f<? extends K, ? extends V> c6227fInvoke = transform.invoke(Short.valueOf(s2));
            destination.put(c6227fInvoke.getFirst(), c6227fInvoke.getSecond());
        }
        return destination;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final List<Float> bvq(float[] fArr, cyoe.cdj<? super Integer, ? super Float, ? super Float, Float> operation) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (fArr.length == 0) {
            return kotlin.collections.ni7.a9();
        }
        float fFloatValue = fArr[0];
        ArrayList arrayList = new ArrayList(fArr.length);
        arrayList.add(Float.valueOf(fFloatValue));
        int length = fArr.length;
        for (int i2 = 1; i2 < length; i2++) {
            fFloatValue = operation.invoke(Integer.valueOf(i2), Float.valueOf(fFloatValue), Float.valueOf(fArr[i2])).floatValue();
            arrayList.add(Float.valueOf(fFloatValue));
        }
        return arrayList;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final <R> List<R> bvt(boolean[] zArr, R r2, cyoe.cdj<? super Integer, ? super R, ? super Boolean, ? extends R> operation) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (zArr.length == 0) {
            return kotlin.collections.zurt.ld6(r2);
        }
        ArrayList arrayList = new ArrayList(zArr.length + 1);
        arrayList.add(r2);
        int length = zArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            r2 = operation.invoke(Integer.valueOf(i2), r2, Boolean.valueOf(zArr[i2]));
            arrayList.add(r2);
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final <R, V> List<V> bwu(@InterfaceC7396q byte[] bArr, @InterfaceC7396q Iterable<? extends R> other, @InterfaceC7396q InterfaceC5979h<? super Byte, ? super R, ? extends V> transform) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        int length = bArr.length;
        ArrayList arrayList = new ArrayList(Math.min(kotlin.collections.fu4.vyq(other, 10), length));
        int i2 = 0;
        for (R r2 : other) {
            if (i2 >= length) {
                break;
            }
            arrayList.add(transform.invoke(Byte.valueOf(bArr[i2]), r2));
            i2++;
        }
        return arrayList;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final List<Character> bxas(char[] cArr, cyoe.cdj<? super Integer, ? super Character, ? super Character, Character> operation) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (cArr.length == 0) {
            return kotlin.collections.ni7.a9();
        }
        char cCharValue = cArr[0];
        ArrayList arrayList = new ArrayList(cArr.length);
        arrayList.add(Character.valueOf(cCharValue));
        int length = cArr.length;
        for (int i2 = 1; i2 < length; i2++) {
            cCharValue = operation.invoke(Integer.valueOf(i2), Character.valueOf(cCharValue), Character.valueOf(cArr[i2])).charValue();
            arrayList.add(Character.valueOf(cCharValue));
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final boolean[] byb3(@InterfaceC7396q Boolean[] boolArr) {
        kotlin.jvm.internal.d2ok.m23075h(boolArr, "<this>");
        int length = boolArr.length;
        boolean[] zArr = new boolean[length];
        for (int i2 = 0; i2 < length; i2++) {
            zArr[i2] = boolArr[i2].booleanValue();
        }
        return zArr;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final <R> List<R> byf(short[] sArr, R r2, InterfaceC5979h<? super R, ? super Short, ? extends R> operation) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (sArr.length == 0) {
            return kotlin.collections.zurt.ld6(r2);
        }
        ArrayList arrayList = new ArrayList(sArr.length + 1);
        arrayList.add(r2);
        for (short s2 : sArr) {
            r2 = operation.invoke(r2, Short.valueOf(s2));
            arrayList.add(r2);
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final List<Double> bz4g(@InterfaceC7396q double[] dArr, @InterfaceC7396q cyoe.x2<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (int iF14 = f14(dArr); -1 < iF14; iF14--) {
            if (!predicate.invoke(Double.valueOf(dArr[iF14])).booleanValue()) {
                return nzoy(dArr, iF14 + 1);
            }
        }
        return kotlin.collections.ni7.a9();
    }

    @kotlin.yz(version = "1.7")
    @InterfaceC6769y(name = "maxOrThrow")
    public static final float bzx(@InterfaceC7396q float[] fArr) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fMax = fArr[0];
        n5r1 it = new kotlin.ranges.x2(1, gto(fArr)).iterator();
        while (it.hasNext()) {
            fMax = Math.max(fMax, fArr[it.nextInt()]);
        }
        return fMax;
    }

    @InterfaceC7396q
    public static final List<Byte> c08(@InterfaceC7396q byte[] bArr, @InterfaceC7396q cyoe.x2<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (int iVl = vl(bArr); -1 < iVl; iVl--) {
            if (!predicate.invoke(Byte.valueOf(bArr[iVl])).booleanValue()) {
                return bklz(bArr, iVl + 1);
            }
        }
        return kotlin.collections.ni7.a9();
    }

    @kotlin.yz(version = "1.7")
    @InterfaceC6769y(name = "maxOrThrow")
    public static final double c1f(@InterfaceC7396q double[] dArr) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dMax = dArr[0];
        n5r1 it = new kotlin.ranges.x2(1, f14(dArr)).iterator();
        while (it.hasNext()) {
            dMax = Math.max(dMax, dArr[it.nextInt()]);
        }
        return dMax;
    }

    public static final boolean c2(@InterfaceC7396q double[] dArr) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        return !(dArr.length == 0);
    }

    @InterfaceC6234g
    private static final long c2lu(long[] jArr) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        return jArr[3];
    }

    @InterfaceC6234g
    private static final char c3(char[] cArr, int i2, cyoe.x2<? super Integer, Character> defaultValue) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(defaultValue, "defaultValue");
        return (i2 < 0 || i2 > j59a(cArr)) ? defaultValue.invoke(Integer.valueOf(i2)).charValue() : cArr[i2];
    }

    @InterfaceC7396q
    public static final List<Boolean> c3sl(@InterfaceC7396q boolean[] zArr, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        if (i2 >= 0) {
            return gwj(zArr, kotlin.ranges.fn3e.fn3e(zArr.length - i2, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
    }

    @InterfaceC6769y(name = "averageOfFloat")
    public static final double c4(@InterfaceC7396q Float[] fArr) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        double dFloatValue = 0.0d;
        int i2 = 0;
        for (Float f2 : fArr) {
            dFloatValue += (double) f2.floatValue();
            i2++;
        }
        if (i2 == 0) {
            return Double.NaN;
        }
        return dFloatValue / ((double) i2);
    }

    public static short c4k8(@InterfaceC7396q short[] sArr) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        if (sArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return sArr[0];
    }

    @InterfaceC7396q
    public static final List<Float> c4my(@InterfaceC7396q float[] fArr, @InterfaceC7396q cyoe.x2<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (float f2 : fArr) {
            if (!predicate.invoke(Float.valueOf(f2)).booleanValue()) {
                arrayList.add(Float.valueOf(f2));
            }
        }
        return arrayList;
    }

    @kotlin.yz(version = "1.4")
    public static final void c4zs(@InterfaceC7396q long[] jArr, @InterfaceC7396q AbstractC6332g random) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(random, "random");
        for (int iHmvj = hmvj(jArr); iHmvj > 0; iHmvj--) {
            int iNextInt = random.nextInt(iHmvj + 1);
            long j2 = jArr[iHmvj];
            jArr[iHmvj] = jArr[iNextInt];
            jArr[iNextInt] = j2;
        }
    }

    @kotlin.x2(warningSince = "1.5")
    @kotlin.ld6(message = "Use sumOf instead.", replaceWith = @kotlin.hb(expression = "this.sumOf(selector)", imports = {}))
    public static final <T> int c59w(@InterfaceC7396q T[] tArr, @InterfaceC7396q cyoe.x2<? super T, Integer> selector) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        int iIntValue = 0;
        for (T t2 : tArr) {
            iIntValue += selector.invoke(t2).intValue();
        }
        return iIntValue;
    }

    @InterfaceC6234g
    private static final int c7(int[] iArr, int i2, cyoe.x2<? super Integer, Integer> defaultValue) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(defaultValue, "defaultValue");
        return (i2 < 0 || i2 > srpc(iArr)) ? defaultValue.invoke(Integer.valueOf(i2)).intValue() : iArr[i2];
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <R> R c7aq(double[] dArr, Comparator<? super R> comparator, cyoe.x2<? super Double, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Double.valueOf(dArr[0]));
        n5r1 it = new kotlin.ranges.x2(1, f14(dArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Double.valueOf(dArr[it.nextInt()]));
            if (comparator.compare(rInvoke, rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC7396q
    public static final <K, V, M extends Map<? super K, ? super V>> M c7g(@InterfaceC7396q int[] iArr, @InterfaceC7396q M destination, @InterfaceC7396q cyoe.x2<? super Integer, ? extends K> keySelector, @InterfaceC7396q cyoe.x2<? super Integer, ? extends V> valueTransform) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(keySelector, "keySelector");
        kotlin.jvm.internal.d2ok.m23075h(valueTransform, "valueTransform");
        for (int i2 : iArr) {
            destination.put(keySelector.invoke(Integer.valueOf(i2)), valueTransform.invoke(Integer.valueOf(i2)));
        }
        return destination;
    }

    @kotlin.yz(version = "1.3")
    public static final int c7hg(@InterfaceC7396q int[] iArr, @InterfaceC7396q AbstractC6332g random) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(random, "random");
        if (iArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return iArr[random.nextInt(iArr.length)];
    }

    @kotlin.yz(version = "1.4")
    public static void c7j(@InterfaceC7396q short[] sArr, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.collections.zy.Companion.m22683q(i2, i3, sArr.length);
        int i4 = (i2 + i3) / 2;
        if (i2 == i4) {
            return;
        }
        int i5 = i3 - 1;
        while (i2 < i4) {
            short s2 = sArr[i2];
            sArr[i2] = sArr[i5];
            sArr[i5] = s2;
            i5--;
            i2++;
        }
    }

    @kotlin.hyr
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @InterfaceC6769y(name = "sumOfDouble")
    private static final double c7tw(double[] dArr, cyoe.x2<? super Double, Double> selector) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        double dDoubleValue = 0.0d;
        for (double d2 : dArr) {
            dDoubleValue += selector.invoke(Double.valueOf(d2)).doubleValue();
        }
        return dDoubleValue;
    }

    @kotlin.yz(version = "1.7")
    @InterfaceC6769y(name = "maxWithOrThrow")
    public static final char c8(@InterfaceC7396q char[] cArr, @InterfaceC7396q Comparator<? super Character> comparator) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        char c2 = cArr[0];
        n5r1 it = new kotlin.ranges.x2(1, j59a(cArr)).iterator();
        while (it.hasNext()) {
            char c3 = cArr[it.nextInt()];
            if (comparator.compare(Character.valueOf(c2), Character.valueOf(c3)) < 0) {
                c2 = c3;
            }
        }
        return c2;
    }

    @InterfaceC6234g
    private static final Float c8n3(float[] fArr, cyoe.x2<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        int length = fArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                float f2 = fArr[length];
                if (predicate.invoke(Float.valueOf(f2)).booleanValue()) {
                    return Float.valueOf(f2);
                }
                if (i2 < 0) {
                    break;
                }
                length = i2;
            }
        }
        return null;
    }

    @InterfaceC7396q
    public static final List<Boolean> ca(@InterfaceC7396q boolean[] zArr, @InterfaceC7396q cyoe.x2<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (boolean z2 : zArr) {
            if (!predicate.invoke(Boolean.valueOf(z2)).booleanValue()) {
                arrayList.add(Boolean.valueOf(z2));
            }
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final <R extends Comparable<? super R>> List<Boolean> cbcd(@InterfaceC7396q boolean[] zArr, @InterfaceC7396q cyoe.x2<? super Boolean, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        return imy(zArr, new f7l8.zy(selector));
    }

    @InterfaceC7396q
    public static final <K, M extends Map<? super K, ? super Short>> M cc1(@InterfaceC7396q short[] sArr, @InterfaceC7396q M destination, @InterfaceC7396q cyoe.x2<? super Short, ? extends K> keySelector) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(keySelector, "keySelector");
        for (short s2 : sArr) {
            destination.put(keySelector.invoke(Short.valueOf(s2)), Short.valueOf(s2));
        }
        return destination;
    }

    public static final void cdhb(@InterfaceC7396q float[] fArr) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        int length = (fArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int iGto = gto(fArr);
        n5r1 it = new kotlin.ranges.x2(0, length).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            float f2 = fArr[iNextInt];
            fArr[iNextInt] = fArr[iGto];
            fArr[iGto] = f2;
            iGto--;
        }
    }

    public static final boolean ce(@InterfaceC7396q boolean[] zArr, @InterfaceC7396q cyoe.x2<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (boolean z2 : zArr) {
            if (predicate.invoke(Boolean.valueOf(z2)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final short ce2(@InterfaceC7396q short[] sArr, @InterfaceC7396q cyoe.cdj<? super Integer, ? super Short, ? super Short, Short> operation) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (sArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        short sShortValue = sArr[0];
        n5r1 it = new kotlin.ranges.x2(1, orxw(sArr)).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            sShortValue = operation.invoke(Integer.valueOf(iNextInt), Short.valueOf(sShortValue), Short.valueOf(sArr[iNextInt])).shortValue();
        }
        return sShortValue;
    }

    @InterfaceC7396q
    public static final Set<Double> cel(@InterfaceC7396q double[] dArr) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        int length = dArr.length;
        return length != 0 ? length != 1 ? (Set) ae9n(dArr, new LinkedHashSet(C6140e.m22479p(dArr.length))) : i1.m22499g(Double.valueOf(dArr[0])) : a98o.ld6();
    }

    @InterfaceC7396q
    public static final List<Byte> ceo(@InterfaceC7396q byte[] bArr, @InterfaceC7396q cyoe.x2<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (byte b2 : bArr) {
            if (!predicate.invoke(Byte.valueOf(b2)).booleanValue()) {
                arrayList.add(Byte.valueOf(b2));
            }
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final Set<Boolean> cff0(@InterfaceC7396q boolean[] zArr) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        return (Set) p7p2(zArr, new LinkedHashSet(C6140e.m22479p(zArr.length)));
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @kotlin.hyr
    @InterfaceC6234g
    @kotlin.yz(version = "1.5")
    @InterfaceC6769y(name = "sumOfUInt")
    private static final int cg(char[] cArr, cyoe.x2<? super Character, gyi> selector) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        int iLd6 = gyi.ld6(0);
        for (char c2 : cArr) {
            iLd6 = gyi.ld6(iLd6 + selector.invoke(Character.valueOf(c2)).a98o());
        }
        return iLd6;
    }

    @InterfaceC7395n
    public static final Double cgz(@InterfaceC7396q double[] dArr, @InterfaceC7396q cyoe.x2<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        boolean z2 = false;
        Double dValueOf = null;
        for (double d2 : dArr) {
            if (predicate.invoke(Double.valueOf(d2)).booleanValue()) {
                if (z2) {
                    return null;
                }
                dValueOf = Double.valueOf(d2);
                z2 = true;
            }
        }
        if (z2) {
            return dValueOf;
        }
        return null;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <R> R ch1s(float[] fArr, Comparator<? super R> comparator, cyoe.x2<? super Float, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Float.valueOf(fArr[0]));
        n5r1 it = new kotlin.ranges.x2(1, gto(fArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Float.valueOf(fArr[it.nextInt()]));
            if (comparator.compare(rInvoke, rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final Float ci1g(double[] dArr, cyoe.x2<? super Double, Float> selector) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        float fFloatValue = selector.invoke(Double.valueOf(dArr[0])).floatValue();
        n5r1 it = new kotlin.ranges.x2(1, f14(dArr)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, selector.invoke(Double.valueOf(dArr[it.nextInt()])).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @InterfaceC7395n
    public static final Integer cin(@InterfaceC7396q int[] iArr) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        return Integer.valueOf(iArr[0]);
    }

    @InterfaceC7395n
    public static final Float cj(@InterfaceC7396q float[] fArr, @InterfaceC7396q cyoe.x2<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        int length = fArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i2 = length - 1;
            float f2 = fArr[length];
            if (predicate.invoke(Float.valueOf(f2)).booleanValue()) {
                return Float.valueOf(f2);
            }
            if (i2 < 0) {
                return null;
            }
            length = i2;
        }
    }

    @kotlin.hyr
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @InterfaceC6769y(name = "sumOfInt")
    private static final <T> int cjs(T[] tArr, cyoe.x2<? super T, Integer> selector) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        int iIntValue = 0;
        for (T t2 : tArr) {
            iIntValue += selector.invoke(t2).intValue();
        }
        return iIntValue;
    }

    @InterfaceC7396q
    public static final Iterable<x9kr<Boolean>> ckgh(@InterfaceC7396q boolean[] zArr) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        return new ncyb(new wvg(zArr));
    }

    @kotlin.hyr
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @InterfaceC6769y(name = "sumOfLong")
    private static final long cm(long[] jArr, cyoe.x2<? super Long, Long> selector) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        long jLongValue = 0;
        for (long j2 : jArr) {
            jLongValue += selector.invoke(Long.valueOf(j2)).longValue();
        }
        return jLongValue;
    }

    @InterfaceC7396q
    public static final <R, C extends Collection<? super R>> C cmzf(@InterfaceC7396q long[] jArr, @InterfaceC7396q C destination, @InterfaceC7396q InterfaceC5979h<? super Integer, ? super Long, ? extends R> transform) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        int length = jArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            destination.add(transform.invoke(Integer.valueOf(i3), Long.valueOf(jArr[i2])));
            i2++;
            i3++;
        }
        return destination;
    }

    @InterfaceC7396q
    public static final List<Character> cns(@InterfaceC7396q char[] cArr, @InterfaceC7396q InterfaceC5979h<? super Integer, ? super Character, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = cArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            char c2 = cArr[i2];
            int i4 = i3 + 1;
            if (predicate.invoke(Integer.valueOf(i3), Character.valueOf(c2)).booleanValue()) {
                arrayList.add(Character.valueOf(c2));
            }
            i2++;
            i3 = i4;
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final <R> List<R> cnx(@InterfaceC7396q float[] fArr, @InterfaceC7396q cyoe.x2<? super Float, ? extends R> transform) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f2 : fArr) {
            arrayList.add(transform.invoke(Float.valueOf(f2)));
        }
        return arrayList;
    }

    public static final boolean cp(@InterfaceC7396q char[] cArr) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        return !(cArr.length == 0);
    }

    @kotlin.yz(version = "1.7")
    @InterfaceC6769y(name = "minByOrThrow")
    public static final <R extends Comparable<? super R>> short cp2(@InterfaceC7396q short[] sArr, @InterfaceC7396q cyoe.x2<? super Short, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        short s2 = sArr[0];
        int iOrxw = orxw(sArr);
        if (iOrxw == 0) {
            return s2;
        }
        R rInvoke = selector.invoke(Short.valueOf(s2));
        n5r1 it = new kotlin.ranges.x2(1, iOrxw).iterator();
        while (it.hasNext()) {
            short s3 = sArr[it.nextInt()];
            R rInvoke2 = selector.invoke(Short.valueOf(s3));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                s2 = s3;
                rInvoke = rInvoke2;
            }
        }
        return s2;
    }

    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final Double cph(@InterfaceC7396q double[] dArr) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        if (dArr.length == 0) {
            return null;
        }
        double dMax = dArr[0];
        n5r1 it = new kotlin.ranges.x2(1, f14(dArr)).iterator();
        while (it.hasNext()) {
            dMax = Math.max(dMax, dArr[it.nextInt()]);
        }
        return Double.valueOf(dMax);
    }

    public static final double crha(@InterfaceC7396q double[] dArr) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        double d2 = 0.0d;
        int i2 = 0;
        for (double d4 : dArr) {
            d2 += d4;
            i2++;
        }
        if (i2 == 0) {
            return Double.NaN;
        }
        return d2 / ((double) i2);
    }

    public static final boolean crp8(@InterfaceC7396q boolean[] zArr, @InterfaceC7396q cyoe.x2<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        Boolean boolValueOf = null;
        boolean z2 = false;
        for (boolean z3 : zArr) {
            if (predicate.invoke(Boolean.valueOf(z3)).booleanValue()) {
                if (z2) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                boolValueOf = Boolean.valueOf(z3);
                z2 = true;
            }
        }
        if (!z2) {
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        kotlin.jvm.internal.d2ok.n7h(boolValueOf, "null cannot be cast to non-null type kotlin.Boolean");
        return boolValueOf.booleanValue();
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <R> R cs(short[] sArr, Comparator<? super R> comparator, cyoe.x2<? super Short, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Short.valueOf(sArr[0]));
        n5r1 it = new kotlin.ranges.x2(1, orxw(sArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Short.valueOf(sArr[it.nextInt()]));
            if (comparator.compare(rInvoke, rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC6234g
    private static final Integer ct(int[] iArr, cyoe.x2<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                int i3 = iArr[length];
                if (predicate.invoke(Integer.valueOf(i3)).booleanValue()) {
                    return Integer.valueOf(i3);
                }
                if (i2 < 0) {
                    break;
                }
                length = i2;
            }
        }
        return null;
    }

    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final Integer ctl4(@InterfaceC7396q int[] iArr, @InterfaceC7396q cyoe.cdj<? super Integer, ? super Integer, ? super Integer, Integer> operation) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        int iSrpc = srpc(iArr);
        if (iSrpc < 0) {
            return null;
        }
        int iIntValue = iArr[iSrpc];
        for (int i2 = iSrpc - 1; i2 >= 0; i2--) {
            iIntValue = operation.invoke(Integer.valueOf(i2), Integer.valueOf(iArr[i2]), Integer.valueOf(iIntValue)).intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    @kotlin.yz(version = "1.7")
    @InterfaceC6769y(name = "minOrThrow")
    public static final float cu(@InterfaceC7396q float[] fArr) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fMin = fArr[0];
        n5r1 it = new kotlin.ranges.x2(1, gto(fArr)).iterator();
        while (it.hasNext()) {
            fMin = Math.min(fMin, fArr[it.nextInt()]);
        }
        return fMin;
    }

    public static final int cub(@InterfaceC7396q short[] sArr, @InterfaceC7396q cyoe.x2<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        int length = sArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (predicate.invoke(Short.valueOf(sArr[length])).booleanValue()) {
                    return length;
                }
                if (i2 < 0) {
                    break;
                }
                length = i2;
            }
        }
        return -1;
    }

    @InterfaceC7396q
    public static final List<Short> cud(@InterfaceC7396q short[] sArr, @InterfaceC7396q cyoe.x2<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (int iOrxw = orxw(sArr); -1 < iOrxw; iOrxw--) {
            if (!predicate.invoke(Short.valueOf(sArr[iOrxw])).booleanValue()) {
                return m76(sArr, iOrxw + 1);
            }
        }
        return kotlin.collections.ni7.a9();
    }

    @InterfaceC7395n
    public static final Byte cuep(@InterfaceC7396q byte[] bArr, @InterfaceC7396q cyoe.x2<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        boolean z2 = false;
        Byte bValueOf = null;
        for (byte b2 : bArr) {
            if (predicate.invoke(Byte.valueOf(b2)).booleanValue()) {
                if (z2) {
                    return null;
                }
                bValueOf = Byte.valueOf(b2);
                z2 = true;
            }
        }
        if (z2) {
            return bValueOf;
        }
        return null;
    }

    @InterfaceC6234g
    private static final byte cun(byte[] bArr) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        return bArr[0];
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <R extends Comparable<? super R>> R cv(short[] sArr, cyoe.x2<? super Short, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Short.valueOf(sArr[0]));
        n5r1 it = new kotlin.ranges.x2(1, orxw(sArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Short.valueOf(sArr[it.nextInt()]));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC7395n
    public static final Short cw(@InterfaceC7396q short[] sArr, @InterfaceC7396q cyoe.x2<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (short s2 : sArr) {
            if (predicate.invoke(Short.valueOf(s2)).booleanValue()) {
                return Short.valueOf(s2);
            }
        }
        return null;
    }

    @InterfaceC7396q
    public static final Iterable<x9kr<Character>> cwso(@InterfaceC7396q char[] cArr) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        return new ncyb(new t(cArr));
    }

    @InterfaceC7396q
    public static final List<Short> cxw(@InterfaceC7396q short[] sArr, @InterfaceC7396q Comparator<? super Short> comparator) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        Short[] shArrAe4 = kotlin.collections.kja0.ae4(sArr);
        kotlin.collections.kja0.izu(shArrAe4, comparator);
        return kotlin.collections.kja0.m22514i(shArrAe4);
    }

    @InterfaceC7396q
    public static final Iterable<Float> cyg(@InterfaceC7396q float[] fArr) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        return fArr.length == 0 ? kotlin.collections.ni7.a9() : new g(fArr);
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final double cz(short[] sArr, cyoe.x2<? super Short, Double> selector) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(Short.valueOf(sArr[0])).doubleValue();
        n5r1 it = new kotlin.ranges.x2(1, orxw(sArr)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, selector.invoke(Short.valueOf(sArr[it.nextInt()])).doubleValue());
        }
        return dDoubleValue;
    }

    @kotlin.hyr
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @InterfaceC6769y(name = "sumOfLong")
    private static final long czt(boolean[] zArr, cyoe.x2<? super Boolean, Long> selector) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        long jLongValue = 0;
        for (boolean z2 : zArr) {
            jLongValue += selector.invoke(Boolean.valueOf(z2)).longValue();
        }
        return jLongValue;
    }

    @InterfaceC6234g
    private static final Long czxz(long[] jArr, cyoe.x2<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        int length = jArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                long j2 = jArr[length];
                if (predicate.invoke(Long.valueOf(j2)).booleanValue()) {
                    return Long.valueOf(j2);
                }
                if (i2 < 0) {
                    break;
                }
                length = i2;
            }
        }
        return null;
    }

    public static final <T> int d0q9(@InterfaceC7396q T[] tArr, @InterfaceC7396q cyoe.x2<? super T, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        int length = tArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (predicate.invoke(tArr[length]).booleanValue()) {
                    return length;
                }
                if (i2 < 0) {
                    break;
                }
                length = i2;
            }
        }
        return -1;
    }

    @InterfaceC7396q
    public static final List<Character> d2(@InterfaceC7396q char[] cArr, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
        }
        if (i2 == 0) {
            return kotlin.collections.ni7.a9();
        }
        if (i2 >= cArr.length) {
            return eovq(cArr);
        }
        if (i2 == 1) {
            return kotlin.collections.zurt.ld6(Character.valueOf(cArr[0]));
        }
        ArrayList arrayList = new ArrayList(i2);
        int i3 = 0;
        for (char c2 : cArr) {
            arrayList.add(Character.valueOf(c2));
            i3++;
            if (i3 == i2) {
                break;
            }
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final Set<Double> d5i1(@InterfaceC7396q double[] dArr, @InterfaceC7396q Iterable<Double> other) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        Set<Double> setQtn = qtn(dArr);
        C6163t.zp(setQtn, other);
        return setQtn;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final float d7(double[] dArr, cyoe.x2<? super Double, Float> selector) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(Double.valueOf(dArr[0])).floatValue();
        n5r1 it = new kotlin.ranges.x2(1, f14(dArr)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, selector.invoke(Double.valueOf(dArr[it.nextInt()])).floatValue());
        }
        return fFloatValue;
    }

    @InterfaceC7396q
    public static final String d79j(@InterfaceC7396q short[] sArr, @InterfaceC7396q CharSequence separator, @InterfaceC7396q CharSequence prefix, @InterfaceC7396q CharSequence postfix, int i2, @InterfaceC7396q CharSequence truncated, @InterfaceC7395n cyoe.x2<? super Short, ? extends CharSequence> x2Var) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(separator, "separator");
        kotlin.jvm.internal.d2ok.m23075h(prefix, "prefix");
        kotlin.jvm.internal.d2ok.m23075h(postfix, "postfix");
        kotlin.jvm.internal.d2ok.m23075h(truncated, "truncated");
        String string = ((StringBuilder) nyhr(sArr, new StringBuilder(), separator, prefix, postfix, i2, truncated, x2Var)).toString();
        kotlin.jvm.internal.d2ok.kja0(string, "joinTo(StringBuilder(), …ed, transform).toString()");
        return string;
    }

    @InterfaceC7396q
    public static final char[] d7ek(@InterfaceC7396q char[] cArr) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        if (cArr.length == 0) {
            return cArr;
        }
        char[] cArrCopyOf = Arrays.copyOf(cArr, cArr.length);
        kotlin.jvm.internal.d2ok.kja0(cArrCopyOf, "copyOf(this, size)");
        kotlin.collections.kja0.m28(cArrCopyOf);
        return cArrCopyOf;
    }

    public static final <R> R d7f(@InterfaceC7396q char[] cArr, R r2, @InterfaceC7396q InterfaceC5979h<? super Character, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        for (int iJ59a = j59a(cArr); iJ59a >= 0; iJ59a--) {
            r2 = operation.invoke(Character.valueOf(cArr[iJ59a]), r2);
        }
        return r2;
    }

    public static final int d7y(@InterfaceC7396q long[] jArr, @InterfaceC7396q cyoe.x2<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        int i2 = 0;
        for (long j2 : jArr) {
            if (predicate.invoke(Long.valueOf(j2)).booleanValue()) {
                i2++;
            }
        }
        return i2;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <R extends Comparable<? super R>> R d8jh(boolean[] zArr, cyoe.x2<? super Boolean, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (zArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Boolean.valueOf(zArr[0]));
        n5r1 it = new kotlin.ranges.x2(1, rl(zArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Boolean.valueOf(zArr[it.nextInt()]));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC7396q
    public static long[] d98(@InterfaceC7396q long[] jArr) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        if (jArr.length == 0) {
            return jArr;
        }
        long[] jArr2 = new long[jArr.length];
        int iHmvj = hmvj(jArr);
        n5r1 it = new kotlin.ranges.x2(0, iHmvj).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            jArr2[iHmvj - iNextInt] = jArr[iNextInt];
        }
        return jArr2;
    }

    @InterfaceC6234g
    private static final byte da(byte[] bArr) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        return bArr[4];
    }

    @InterfaceC7396q
    public static final <R> List<R> daa(@InterfaceC7396q float[] fArr, @InterfaceC7396q InterfaceC5979h<? super Integer, ? super Float, ? extends R> transform) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        ArrayList arrayList = new ArrayList(fArr.length);
        int length = fArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            arrayList.add(transform.invoke(Integer.valueOf(i3), Float.valueOf(fArr[i2])));
            i2++;
            i3++;
        }
        return arrayList;
    }

    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final Integer dbvq(@InterfaceC7396q int[] iArr, @InterfaceC7396q Comparator<? super Integer> comparator) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        if (iArr.length == 0) {
            return null;
        }
        int i2 = iArr[0];
        n5r1 it = new kotlin.ranges.x2(1, srpc(iArr)).iterator();
        while (it.hasNext()) {
            int i3 = iArr[it.nextInt()];
            if (comparator.compare(Integer.valueOf(i2), Integer.valueOf(i3)) > 0) {
                i2 = i3;
            }
        }
        return Integer.valueOf(i2);
    }

    public static final boolean dc(@InterfaceC7396q boolean[] zArr) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        return zArr.length == 0;
    }

    public static final float dci(@InterfaceC7396q float[] fArr, @InterfaceC7396q cyoe.cdj<? super Integer, ? super Float, ? super Float, Float> operation) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        int iGto = gto(fArr);
        if (iGto < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        float fFloatValue = fArr[iGto];
        for (int i2 = iGto - 1; i2 >= 0; i2--) {
            fFloatValue = operation.invoke(Integer.valueOf(i2), Float.valueOf(fArr[i2]), Float.valueOf(fFloatValue)).floatValue();
        }
        return fFloatValue;
    }

    @InterfaceC7396q
    public static final <R> List<R> dcmf(@InterfaceC7396q double[] dArr, @InterfaceC7396q cyoe.x2<? super Double, ? extends R> transform) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double d2 : dArr) {
            arrayList.add(transform.invoke(Double.valueOf(d2)));
        }
        return arrayList;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <R extends Comparable<? super R>> R dd0(long[] jArr, cyoe.x2<? super Long, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Long.valueOf(jArr[0]));
        n5r1 it = new kotlin.ranges.x2(1, hmvj(jArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Long.valueOf(jArr[it.nextInt()]));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    public static final <R> R de95(@InterfaceC7396q float[] fArr, R r2, @InterfaceC7396q InterfaceC5979h<? super R, ? super Float, ? extends R> operation) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        for (float f2 : fArr) {
            r2 = operation.invoke(r2, Float.valueOf(f2));
        }
        return r2;
    }

    @InterfaceC7396q
    public static final <T> T[] de9w(@InterfaceC7396q T[] tArr) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        if (tArr.length == 0) {
            return tArr;
        }
        T[] tArr2 = (T[]) kotlin.collections.qrj.m22602k(tArr, tArr.length);
        int iGjp = gjp(tArr);
        n5r1 it = new kotlin.ranges.x2(0, iGjp).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            tArr2[iGjp - iNextInt] = tArr[iNextInt];
        }
        return tArr2;
    }

    public static final int dew6(@InterfaceC7396q int[] iArr, @InterfaceC7396q cyoe.cdj<? super Integer, ? super Integer, ? super Integer, Integer> operation) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        int iSrpc = srpc(iArr);
        if (iSrpc < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        int iIntValue = iArr[iSrpc];
        for (int i2 = iSrpc - 1; i2 >= 0; i2--) {
            iIntValue = operation.invoke(Integer.valueOf(i2), Integer.valueOf(iArr[i2]), Integer.valueOf(iIntValue)).intValue();
        }
        return iIntValue;
    }

    @InterfaceC7396q
    public static final Iterable<x9kr<Long>> df(@InterfaceC7396q long[] jArr) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        return new ncyb(new fu4(jArr));
    }

    @InterfaceC7396q
    public static final <T extends Comparable<? super T>> T[] dg(@InterfaceC7396q T[] tArr) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        if (tArr.length == 0) {
            return tArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(tArr, tArr.length);
        kotlin.jvm.internal.d2ok.kja0(objArrCopyOf, "copyOf(this, size)");
        T[] tArr2 = (T[]) ((Comparable[]) objArrCopyOf);
        kotlin.collections.kja0.izu(tArr2, kotlin.comparisons.f7l8.fu4());
        return tArr2;
    }

    @InterfaceC7396q
    public static final C6227f<List<Character>, List<Character>> dg4q(@InterfaceC7396q char[] cArr, @InterfaceC7396q cyoe.x2<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (char c2 : cArr) {
            if (predicate.invoke(Character.valueOf(c2)).booleanValue()) {
                arrayList.add(Character.valueOf(c2));
            } else {
                arrayList2.add(Character.valueOf(c2));
            }
        }
        return new C6227f<>(arrayList, arrayList2);
    }

    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final Double dgf(@InterfaceC7396q double[] dArr) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        if (dArr.length == 0) {
            return null;
        }
        double dMin = dArr[0];
        n5r1 it = new kotlin.ranges.x2(1, f14(dArr)).iterator();
        while (it.hasNext()) {
            dMin = Math.min(dMin, dArr[it.nextInt()]);
        }
        return Double.valueOf(dMin);
    }

    public static final int dgmt(@InterfaceC7396q boolean[] zArr, @InterfaceC7396q cyoe.x2<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        int i2 = 0;
        for (boolean z2 : zArr) {
            if (predicate.invoke(Boolean.valueOf(z2)).booleanValue()) {
                i2++;
            }
        }
        return i2;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <R> R dh74(double[] dArr, Comparator<? super R> comparator, cyoe.x2<? super Double, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Double.valueOf(dArr[0]));
        n5r1 it = new kotlin.ranges.x2(1, f14(dArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Double.valueOf(dArr[it.nextInt()]));
            if (comparator.compare(rInvoke, rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final <V, M extends Map<? super Boolean, ? super V>> M dhzo(boolean[] zArr, M destination, cyoe.x2<? super Boolean, ? extends V> valueSelector) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(valueSelector, "valueSelector");
        for (boolean z2 : zArr) {
            destination.put(Boolean.valueOf(z2), valueSelector.invoke(Boolean.valueOf(z2)));
        }
        return destination;
    }

    @InterfaceC7396q
    public static final <R, V> List<V> dis(@InterfaceC7396q long[] jArr, @InterfaceC7396q R[] other, @InterfaceC7396q InterfaceC5979h<? super Long, ? super R, ? extends V> transform) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        int iMin = Math.min(jArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i2 = 0; i2 < iMin; i2++) {
            arrayList.add(transform.invoke(Long.valueOf(jArr[i2]), other[i2]));
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final <R> List<R> dizt(@InterfaceC7396q double[] dArr, @InterfaceC7396q InterfaceC5979h<? super Integer, ? super Double, ? extends R> transform) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        ArrayList arrayList = new ArrayList(dArr.length);
        int length = dArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            arrayList.add(transform.invoke(Integer.valueOf(i3), Double.valueOf(dArr[i2])));
            i2++;
            i3++;
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final <R, V> List<V> dk(@InterfaceC7396q double[] dArr, @InterfaceC7396q Iterable<? extends R> other, @InterfaceC7396q InterfaceC5979h<? super Double, ? super R, ? extends V> transform) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        int length = dArr.length;
        ArrayList arrayList = new ArrayList(Math.min(kotlin.collections.fu4.vyq(other, 10), length));
        int i2 = 0;
        for (R r2 : other) {
            if (i2 >= length) {
                break;
            }
            arrayList.add(transform.invoke(Double.valueOf(dArr[i2]), r2));
            i2++;
        }
        return arrayList;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.5")
    private static final <T, R> R dkhc(T[] tArr, cyoe.x2<? super T, ? extends R> transform) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        for (T t2 : tArr) {
            R rInvoke = transform.invoke(t2);
            if (rInvoke != null) {
                return rInvoke;
            }
        }
        return null;
    }

    @InterfaceC7396q
    public static final kotlin.ranges.x2 dkp2(@InterfaceC7396q char[] cArr) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        return new kotlin.ranges.x2(0, j59a(cArr));
    }

    @kotlin.yz(version = "1.7")
    @InterfaceC6769y(name = "maxByOrThrow")
    public static final <T, R extends Comparable<? super R>> T dlv(@InterfaceC7396q T[] tArr, @InterfaceC7396q cyoe.x2<? super T, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        T t2 = tArr[0];
        int iGjp = gjp(tArr);
        if (iGjp == 0) {
            return t2;
        }
        R rInvoke = selector.invoke(t2);
        n5r1 it = new kotlin.ranges.x2(1, iGjp).iterator();
        while (it.hasNext()) {
            T t3 = tArr[it.nextInt()];
            R rInvoke2 = selector.invoke(t3);
            if (rInvoke.compareTo(rInvoke2) < 0) {
                t2 = t3;
                rInvoke = rInvoke2;
            }
        }
        return t2;
    }

    @InterfaceC7396q
    public static final <K, V> Map<K, V> dm(@InterfaceC7396q char[] cArr, @InterfaceC7396q cyoe.x2<? super Character, ? extends K> keySelector, @InterfaceC7396q cyoe.x2<? super Character, ? extends V> valueTransform) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(keySelector, "keySelector");
        kotlin.jvm.internal.d2ok.m23075h(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.fn3e.fn3e(C6140e.m22479p(cArr.length), 16));
        for (char c2 : cArr) {
            linkedHashMap.put(keySelector.invoke(Character.valueOf(c2)), valueTransform.invoke(Character.valueOf(c2)));
        }
        return linkedHashMap;
    }

    @InterfaceC7395n
    public static final Boolean dmt(@InterfaceC7396q boolean[] zArr) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        if (zArr.length == 0) {
            return null;
        }
        return Boolean.valueOf(zArr[zArr.length - 1]);
    }

    @InterfaceC7396q
    public static final <K> Map<K, Boolean> dmw0(@InterfaceC7396q boolean[] zArr, @InterfaceC7396q cyoe.x2<? super Boolean, ? extends K> keySelector) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.fn3e.fn3e(C6140e.m22479p(zArr.length), 16));
        for (boolean z2 : zArr) {
            linkedHashMap.put(keySelector.invoke(Boolean.valueOf(z2)), Boolean.valueOf(z2));
        }
        return linkedHashMap;
    }

    @InterfaceC7396q
    public static int[] dota(@InterfaceC7396q int[] iArr) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        if (iArr.length == 0) {
            return iArr;
        }
        int[] iArr2 = new int[iArr.length];
        int iSrpc = srpc(iArr);
        n5r1 it = new kotlin.ranges.x2(0, iSrpc).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            iArr2[iSrpc - iNextInt] = iArr[iNextInt];
        }
        return iArr2;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <T, R extends Comparable<? super R>> R dp7j(T[] tArr, cyoe.x2<? super T, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(tArr[0]);
        n5r1 it = new kotlin.ranges.x2(1, gjp(tArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(tArr[it.nextInt()]);
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC7396q
    public static final <R> List<C6227f<Character, R>> dpl(@InterfaceC7396q char[] cArr, @InterfaceC7396q R[] other) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        int iMin = Math.min(cArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i2 = 0; i2 < iMin; i2++) {
            char c2 = cArr[i2];
            arrayList.add(kotlin.nmn5.m23230k(Character.valueOf(c2), other[i2]));
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final List<Double> dpl2(@InterfaceC7396q double[] dArr) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        double[] dArrCopyOf = Arrays.copyOf(dArr, dArr.length);
        kotlin.jvm.internal.d2ok.kja0(dArrCopyOf, "copyOf(this, size)");
        kotlin.collections.kja0.vg(dArrCopyOf);
        return wy14(dArrCopyOf);
    }

    public static final float dqa(@InterfaceC7396q float[] fArr, @InterfaceC7396q InterfaceC5979h<? super Float, ? super Float, Float> operation) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (fArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        float fFloatValue = fArr[0];
        n5r1 it = new kotlin.ranges.x2(1, gto(fArr)).iterator();
        while (it.hasNext()) {
            fFloatValue = operation.invoke(Float.valueOf(fFloatValue), Float.valueOf(fArr[it.nextInt()])).floatValue();
        }
        return fFloatValue;
    }

    public static final int dqjj(@InterfaceC7396q short[] sArr) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        int i2 = 0;
        for (short s2 : sArr) {
            i2 += s2;
        }
        return i2;
    }

    @InterfaceC6234g
    private static final char dr1(char[] cArr, int i2, cyoe.x2<? super Integer, Character> defaultValue) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(defaultValue, "defaultValue");
        return (i2 < 0 || i2 > j59a(cArr)) ? defaultValue.invoke(Integer.valueOf(i2)).charValue() : cArr[i2];
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final <T> T[] dr6w(T[] tArr, cyoe.x2<? super T, was> action) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(action, "action");
        for (T t2 : tArr) {
            action.invoke(t2);
        }
        return tArr;
    }

    public static final <T> boolean drpy(@InterfaceC7396q T[] tArr) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        return !(tArr.length == 0);
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.3")
    private static final short dsn(short[] sArr) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        return b8j1(sArr, AbstractC6332g.Default);
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final <R> List<R> dsx(float[] fArr, R r2, cyoe.cdj<? super Integer, ? super R, ? super Float, ? extends R> operation) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (fArr.length == 0) {
            return kotlin.collections.zurt.ld6(r2);
        }
        ArrayList arrayList = new ArrayList(fArr.length + 1);
        arrayList.add(r2);
        int length = fArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            r2 = operation.invoke(Integer.valueOf(i2), r2, Float.valueOf(fArr[i2]));
            arrayList.add(r2);
        }
        return arrayList;
    }

    public static /* synthetic */ String dt(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, cyoe.x2 x2Var, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i3 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i3 & 4) == 0 ? charSequence3 : "";
        if ((i3 & 8) != 0) {
            i2 = -1;
        }
        int i4 = i2;
        if ((i3 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i3 & 32) != 0) {
            x2Var = null;
        }
        return z7zz(objArr, charSequence, charSequence5, charSequence6, i4, charSequence7, x2Var);
    }

    @InterfaceC7396q
    public static final List<Byte> dtf(@InterfaceC7396q byte[] bArr) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        kotlin.jvm.internal.d2ok.kja0(bArrCopyOf, "copyOf(this, size)");
        kotlin.collections.kja0.zma(bArrCopyOf);
        return bo7(bArrCopyOf);
    }

    public static long du(@InterfaceC7396q long[] jArr) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        long j2 = 0;
        for (long j3 : jArr) {
            j2 += j3;
        }
        return j2;
    }

    @kotlin.hyr
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @InterfaceC6769y(name = "sumOfInt")
    private static final int dv5(long[] jArr, cyoe.x2<? super Long, Integer> selector) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        int iIntValue = 0;
        for (long j2 : jArr) {
            iIntValue += selector.invoke(Long.valueOf(j2)).intValue();
        }
        return iIntValue;
    }

    @InterfaceC6234g
    private static final Character dw(char[] cArr, cyoe.x2<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (char c2 : cArr) {
            if (predicate.invoke(Character.valueOf(c2)).booleanValue()) {
                return Character.valueOf(c2);
            }
        }
        return null;
    }

    @InterfaceC6234g
    private static final long dwra(long[] jArr) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        return jArr[1];
    }

    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final Long dxb(@InterfaceC7396q long[] jArr, @InterfaceC7396q Comparator<? super Long> comparator) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        if (jArr.length == 0) {
            return null;
        }
        long j2 = jArr[0];
        n5r1 it = new kotlin.ranges.x2(1, hmvj(jArr)).iterator();
        while (it.hasNext()) {
            long j3 = jArr[it.nextInt()];
            if (comparator.compare(Long.valueOf(j2), Long.valueOf(j3)) < 0) {
                j2 = j3;
            }
        }
        return Long.valueOf(j2);
    }

    @InterfaceC6234g
    private static final short dxr2(short[] sArr, int i2, cyoe.x2<? super Integer, Short> defaultValue) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(defaultValue, "defaultValue");
        return (i2 < 0 || i2 > orxw(sArr)) ? defaultValue.invoke(Integer.valueOf(i2)).shortValue() : sArr[i2];
    }

    @InterfaceC7396q
    public static final <R> List<C6227f<Boolean, R>> dy(@InterfaceC7396q boolean[] zArr, @InterfaceC7396q Iterable<? extends R> other) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        int length = zArr.length;
        ArrayList arrayList = new ArrayList(Math.min(kotlin.collections.fu4.vyq(other, 10), length));
        int i2 = 0;
        for (R r2 : other) {
            if (i2 >= length) {
                break;
            }
            arrayList.add(kotlin.nmn5.m23230k(Boolean.valueOf(zArr[i2]), r2));
            i2++;
        }
        return arrayList;
    }

    @InterfaceC6234g
    private static final int dyer(int[] iArr) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        return iArr.length;
    }

    @InterfaceC7396q
    public static final List<Integer> dymb(@InterfaceC7396q int[] iArr, @InterfaceC7396q Iterable<Integer> indices) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(indices, "indices");
        int iVyq = kotlin.collections.fu4.vyq(indices, 10);
        if (iVyq == 0) {
            return kotlin.collections.ni7.a9();
        }
        ArrayList arrayList = new ArrayList(iVyq);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(iArr[it.next().intValue()]));
        }
        return arrayList;
    }

    public static final byte dzm(@InterfaceC7396q byte[] bArr, @InterfaceC7396q cyoe.x2<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (byte b2 : bArr) {
            if (predicate.invoke(Byte.valueOf(b2)).booleanValue()) {
                return b2;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <R> R dzu0(long[] jArr, Comparator<? super R> comparator, cyoe.x2<? super Long, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Long.valueOf(jArr[0]));
        n5r1 it = new kotlin.ranges.x2(1, hmvj(jArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Long.valueOf(jArr[it.nextInt()]));
            if (comparator.compare(rInvoke, rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC7396q
    public static final List<Double> e0l(@InterfaceC7396q double[] dArr, @InterfaceC7396q Iterable<Integer> indices) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(indices, "indices");
        int iVyq = kotlin.collections.fu4.vyq(indices, 10);
        if (iVyq == 0) {
            return kotlin.collections.ni7.a9();
        }
        ArrayList arrayList = new ArrayList(iVyq);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(Double.valueOf(dArr[it.next().intValue()]));
        }
        return arrayList;
    }

    public static final boolean e0t(@InterfaceC7396q double[] dArr) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        return dArr.length == 0;
    }

    public static final <T> T e1(@InterfaceC7396q T[] tArr) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        if (tArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return tArr[gjp(tArr)];
    }

    public static final float e10(@InterfaceC7396q float[] fArr, @InterfaceC7396q cyoe.x2<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (float f2 : fArr) {
            if (predicate.invoke(Float.valueOf(f2)).booleanValue()) {
                return f2;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @InterfaceC6234g
    private static final Byte e1c(byte[] bArr, cyoe.x2<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (byte b2 : bArr) {
            if (predicate.invoke(Byte.valueOf(b2)).booleanValue()) {
                return Byte.valueOf(b2);
            }
        }
        return null;
    }

    @kotlin.yz(version = "1.7")
    @InterfaceC6769y(name = "minByOrThrow")
    public static final <R extends Comparable<? super R>> boolean e1v(@InterfaceC7396q boolean[] zArr, @InterfaceC7396q cyoe.x2<? super Boolean, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (zArr.length == 0) {
            throw new NoSuchElementException();
        }
        boolean z2 = zArr[0];
        int iRl = rl(zArr);
        if (iRl == 0) {
            return z2;
        }
        R rInvoke = selector.invoke(Boolean.valueOf(z2));
        n5r1 it = new kotlin.ranges.x2(1, iRl).iterator();
        while (it.hasNext()) {
            boolean z3 = zArr[it.nextInt()];
            R rInvoke2 = selector.invoke(Boolean.valueOf(z3));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                z2 = z3;
                rInvoke = rInvoke2;
            }
        }
        return z2;
    }

    @InterfaceC6234g
    private static final boolean e2(short[] sArr) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        return sArr.length == 0;
    }

    @InterfaceC7396q
    public static final List<Long> e3la(@InterfaceC7396q long[] jArr) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        if (jArr.length == 0) {
            return kotlin.collections.ni7.a9();
        }
        List<Long> listMug = mug(jArr);
        jk.vep5(listMug);
        return listMug;
    }

    public static final <R> R e4n(@InterfaceC7396q byte[] bArr, R r2, @InterfaceC7396q InterfaceC5979h<? super Byte, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        for (int iVl = vl(bArr); iVl >= 0; iVl--) {
            r2 = operation.invoke(Byte.valueOf(bArr[iVl]), r2);
        }
        return r2;
    }

    public static final void e58q(@InterfaceC7396q long[] jArr) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        if (jArr.length > 1) {
            kotlin.collections.kja0.rf(jArr);
            sxq(jArr);
        }
    }

    @InterfaceC7396q
    public static final double[] e63j(@InterfaceC7396q double[] dArr) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        if (dArr.length == 0) {
            return dArr;
        }
        double[] dArrCopyOf = Arrays.copyOf(dArr, dArr.length);
        kotlin.jvm.internal.d2ok.kja0(dArrCopyOf, "copyOf(this, size)");
        kotlin.collections.kja0.vg(dArrCopyOf);
        return dArrCopyOf;
    }

    @InterfaceC7396q
    public static final <R> List<C6227f<Character, R>> e6nw(@InterfaceC7396q char[] cArr, @InterfaceC7396q Iterable<? extends R> other) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        int length = cArr.length;
        ArrayList arrayList = new ArrayList(Math.min(kotlin.collections.fu4.vyq(other, 10), length));
        int i2 = 0;
        for (R r2 : other) {
            if (i2 >= length) {
                break;
            }
            arrayList.add(kotlin.nmn5.m23230k(Character.valueOf(cArr[i2]), r2));
            i2++;
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final HashSet<Double> e6x(@InterfaceC7396q double[] dArr) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        return (HashSet) ae9n(dArr, new HashSet(C6140e.m22479p(dArr.length)));
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <R> R e6z(int[] iArr, Comparator<? super R> comparator, cyoe.x2<? super Integer, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Integer.valueOf(iArr[0]));
        n5r1 it = new kotlin.ranges.x2(1, srpc(iArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Integer.valueOf(iArr[it.nextInt()]));
            if (comparator.compare(rInvoke, rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @kotlin.yz(version = "1.4")
    public static final void e7ie(@InterfaceC7396q int[] iArr, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.collections.kja0.nod(iArr, i2, i3);
        tm(iArr, i2, i3);
    }

    @InterfaceC7396q
    public static final List<Long> e8vv(@InterfaceC7396q long[] jArr, @InterfaceC7396q InterfaceC5979h<? super Integer, ? super Long, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = jArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            long j2 = jArr[i2];
            int i4 = i3 + 1;
            if (predicate.invoke(Integer.valueOf(i3), Long.valueOf(j2)).booleanValue()) {
                arrayList.add(Long.valueOf(j2));
            }
            i2++;
            i3 = i4;
        }
        return arrayList;
    }

    @InterfaceC6234g
    private static final boolean e9(boolean[] zArr) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        return zArr[1];
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <R extends Comparable<? super R>> R e95(float[] fArr, cyoe.x2<? super Float, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Float.valueOf(fArr[0]));
        n5r1 it = new kotlin.ranges.x2(1, gto(fArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Float.valueOf(fArr[it.nextInt()]));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC7396q
    public static final kotlin.sequences.qrj<Integer> e9s(@InterfaceC7396q int[] iArr) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        return iArr.length == 0 ? kotlin.sequences.t8r.f7l8() : new qrj(iArr);
    }

    @kotlin.yz(version = "1.4")
    public static final void ea(@InterfaceC7396q float[] fArr, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.collections.kja0.zxq(fArr, i2, i3);
        g3a(fArr, i2, i3);
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <R extends Comparable<? super R>> R ea7(long[] jArr, cyoe.x2<? super Long, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Long.valueOf(jArr[0]));
        n5r1 it = new kotlin.ranges.x2(1, hmvj(jArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Long.valueOf(jArr[it.nextInt()]));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    public static final <R> R eaj(@InterfaceC7396q boolean[] zArr, R r2, @InterfaceC7396q InterfaceC5979h<? super Boolean, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        for (int iRl = rl(zArr); iRl >= 0; iRl--) {
            r2 = operation.invoke(Boolean.valueOf(zArr[iRl]), r2);
        }
        return r2;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final double eao0(boolean[] zArr, cyoe.x2<? super Boolean, Double> selector) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (zArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(Boolean.valueOf(zArr[0])).doubleValue();
        n5r1 it = new kotlin.ranges.x2(1, rl(zArr)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, selector.invoke(Boolean.valueOf(zArr[it.nextInt()])).doubleValue());
        }
        return dDoubleValue;
    }

    @InterfaceC7395n
    public static final Boolean eb(@InterfaceC7396q boolean[] zArr, @InterfaceC7396q cyoe.x2<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        boolean z2 = false;
        Boolean boolValueOf = null;
        for (boolean z3 : zArr) {
            if (predicate.invoke(Boolean.valueOf(z3)).booleanValue()) {
                if (z2) {
                    return null;
                }
                boolValueOf = Boolean.valueOf(z3);
                z2 = true;
            }
        }
        if (z2) {
            return boolValueOf;
        }
        return null;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final <V, M extends Map<? super Character, ? super V>> M ebaq(char[] cArr, M destination, cyoe.x2<? super Character, ? extends V> valueSelector) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(valueSelector, "valueSelector");
        for (char c2 : cArr) {
            destination.put(Character.valueOf(c2), valueSelector.invoke(Character.valueOf(c2)));
        }
        return destination;
    }

    @InterfaceC6234g
    private static final Boolean ebmm(boolean[] zArr, cyoe.x2<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        int length = zArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                boolean z2 = zArr[length];
                if (predicate.invoke(Boolean.valueOf(z2)).booleanValue()) {
                    return Boolean.valueOf(z2);
                }
                if (i2 < 0) {
                    break;
                }
                length = i2;
            }
        }
        return null;
    }

    @InterfaceC7396q
    public static final <T, R> List<C6227f<T, R>> ecp(@InterfaceC7396q T[] tArr, @InterfaceC7396q R[] other) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        int iMin = Math.min(tArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i2 = 0; i2 < iMin; i2++) {
            arrayList.add(kotlin.nmn5.m23230k(tArr[i2], other[i2]));
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final <R> List<C6227f<Integer, R>> eed(@InterfaceC7396q int[] iArr, @InterfaceC7396q R[] other) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        int iMin = Math.min(iArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i2 = 0; i2 < iMin; i2++) {
            int i3 = iArr[i2];
            arrayList.add(kotlin.nmn5.m23230k(Integer.valueOf(i3), other[i2]));
        }
        return arrayList;
    }

    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final Short ef(@InterfaceC7396q short[] sArr, @InterfaceC7396q Comparator<? super Short> comparator) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        if (sArr.length == 0) {
            return null;
        }
        short s2 = sArr[0];
        n5r1 it = new kotlin.ranges.x2(1, orxw(sArr)).iterator();
        while (it.hasNext()) {
            short s3 = sArr[it.nextInt()];
            if (comparator.compare(Short.valueOf(s2), Short.valueOf(s3)) > 0) {
                s2 = s3;
            }
        }
        return Short.valueOf(s2);
    }

    @InterfaceC7395n
    public static final Integer eg2(@InterfaceC7396q int[] iArr, @InterfaceC7396q cyoe.x2<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        boolean z2 = false;
        Integer numValueOf = null;
        for (int i2 : iArr) {
            if (predicate.invoke(Integer.valueOf(i2)).booleanValue()) {
                if (z2) {
                    return null;
                }
                numValueOf = Integer.valueOf(i2);
                z2 = true;
            }
        }
        if (z2) {
            return numValueOf;
        }
        return null;
    }

    @InterfaceC7396q
    public static final <C extends Collection<? super Long>> C eg6(@InterfaceC7396q long[] jArr, @InterfaceC7396q C destination, @InterfaceC7396q InterfaceC5979h<? super Integer, ? super Long, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        int length = jArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            long j2 = jArr[i2];
            int i4 = i3 + 1;
            if (predicate.invoke(Integer.valueOf(i3), Long.valueOf(j2)).booleanValue()) {
                destination.add(Long.valueOf(j2));
            }
            i2++;
            i3 = i4;
        }
        return destination;
    }

    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final Double egc1(@InterfaceC7396q double[] dArr, @InterfaceC7396q cyoe.cdj<? super Integer, ? super Double, ? super Double, Double> operation) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (dArr.length == 0) {
            return null;
        }
        double dDoubleValue = dArr[0];
        n5r1 it = new kotlin.ranges.x2(1, f14(dArr)).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            dDoubleValue = operation.invoke(Integer.valueOf(iNextInt), Double.valueOf(dDoubleValue), Double.valueOf(dArr[iNextInt])).doubleValue();
        }
        return Double.valueOf(dDoubleValue);
    }

    @InterfaceC6234g
    private static final int eh(int[] iArr) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        return iArr[2];
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <R extends Comparable<? super R>> R ehbk(byte[] bArr, cyoe.x2<? super Byte, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Byte.valueOf(bArr[0]));
        n5r1 it = new kotlin.ranges.x2(1, vl(bArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Byte.valueOf(bArr[it.nextInt()]));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC6234g
    private static final double ek(double[] dArr) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        return dArr[2];
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final Float ekha(short[] sArr, cyoe.x2<? super Short, Float> selector) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        float fFloatValue = selector.invoke(Short.valueOf(sArr[0])).floatValue();
        n5r1 it = new kotlin.ranges.x2(1, orxw(sArr)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, selector.invoke(Short.valueOf(sArr[it.nextInt()])).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final double ekiv(char[] cArr, cyoe.x2<? super Character, Double> selector) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(Character.valueOf(cArr[0])).doubleValue();
        n5r1 it = new kotlin.ranges.x2(1, j59a(cArr)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, selector.invoke(Character.valueOf(cArr[it.nextInt()])).doubleValue());
        }
        return dDoubleValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, R> R el7(@InterfaceC7396q T[] tArr, R r2, @InterfaceC7396q cyoe.cdj<? super Integer, ? super T, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        for (int iGjp = gjp(tArr); iGjp >= 0; iGjp--) {
            r2 = operation.invoke(Integer.valueOf(iGjp), tArr[iGjp], r2);
        }
        return r2;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final Float elg(byte[] bArr, cyoe.x2<? super Byte, Float> selector) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        float fFloatValue = selector.invoke(Byte.valueOf(bArr[0])).floatValue();
        n5r1 it = new kotlin.ranges.x2(1, vl(bArr)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, selector.invoke(Byte.valueOf(bArr[it.nextInt()])).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @InterfaceC6234g
    private static final long em(long[] jArr, int i2, cyoe.x2<? super Integer, Long> defaultValue) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(defaultValue, "defaultValue");
        return (i2 < 0 || i2 > hmvj(jArr)) ? defaultValue.invoke(Integer.valueOf(i2)).longValue() : jArr[i2];
    }

    @InterfaceC7395n
    public static final Long em44(@InterfaceC7396q long[] jArr, @InterfaceC7396q cyoe.x2<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        int length = jArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i2 = length - 1;
            long j2 = jArr[length];
            if (predicate.invoke(Long.valueOf(j2)).booleanValue()) {
                return Long.valueOf(j2);
            }
            if (i2 < 0) {
                return null;
            }
            length = i2;
        }
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <T> float emvb(T[] tArr, cyoe.x2<? super T, Float> selector) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(tArr[0]).floatValue();
        n5r1 it = new kotlin.ranges.x2(1, gjp(tArr)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, selector.invoke(tArr[it.nextInt()]).floatValue());
        }
        return fFloatValue;
    }

    @InterfaceC7396q
    public static final List<Double> en(@InterfaceC7396q double[] dArr, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
        }
        if (i2 == 0) {
            return kotlin.collections.ni7.a9();
        }
        int length = dArr.length;
        if (i2 >= length) {
            return ok4l(dArr);
        }
        if (i2 == 1) {
            return kotlin.collections.zurt.ld6(Double.valueOf(dArr[length - 1]));
        }
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = length - i2; i3 < length; i3++) {
            arrayList.add(Double.valueOf(dArr[i3]));
        }
        return arrayList;
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final Double enbq(@InterfaceC7396q double[] dArr, @InterfaceC7396q InterfaceC5979h<? super Double, ? super Double, Double> operation) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        int iF14 = f14(dArr);
        if (iF14 < 0) {
            return null;
        }
        double dDoubleValue = dArr[iF14];
        for (int i2 = iF14 - 1; i2 >= 0; i2--) {
            dDoubleValue = operation.invoke(Double.valueOf(dArr[i2]), Double.valueOf(dDoubleValue)).doubleValue();
        }
        return Double.valueOf(dDoubleValue);
    }

    public static final <S, T extends S> S eov(@InterfaceC7396q T[] tArr, @InterfaceC7396q InterfaceC5979h<? super S, ? super T, ? extends S> operation) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (tArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        S sInvoke = (S) tArr[0];
        n5r1 it = new kotlin.ranges.x2(1, gjp(tArr)).iterator();
        while (it.hasNext()) {
            sInvoke = operation.invoke(sInvoke, (Object) tArr[it.nextInt()]);
        }
        return sInvoke;
    }

    @InterfaceC7396q
    public static final List<Character> eovq(@InterfaceC7396q char[] cArr) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        int length = cArr.length;
        return length != 0 ? length != 1 ? l2gm(cArr) : kotlin.collections.zurt.ld6(Character.valueOf(cArr[0])) : kotlin.collections.ni7.a9();
    }

    @InterfaceC7396q
    public static final <V> List<V> ep(@InterfaceC7396q float[] fArr, @InterfaceC7396q float[] other, @InterfaceC7396q InterfaceC5979h<? super Float, ? super Float, ? extends V> transform) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        int iMin = Math.min(fArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i2 = 0; i2 < iMin; i2++) {
            arrayList.add(transform.invoke(Float.valueOf(fArr[i2]), Float.valueOf(other[i2])));
        }
        return arrayList;
    }

    @InterfaceC6234g
    private static final <T> T ep5q(T[] tArr) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        return tArr[3];
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final float eqnj(byte[] bArr, cyoe.x2<? super Byte, Float> selector) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(Byte.valueOf(bArr[0])).floatValue();
        n5r1 it = new kotlin.ranges.x2(1, vl(bArr)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, selector.invoke(Byte.valueOf(bArr[it.nextInt()])).floatValue());
        }
        return fFloatValue;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final double ergk(float[] fArr, cyoe.x2<? super Float, Double> selector) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(Float.valueOf(fArr[0])).doubleValue();
        n5r1 it = new kotlin.ranges.x2(1, gto(fArr)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, selector.invoke(Float.valueOf(fArr[it.nextInt()])).doubleValue());
        }
        return dDoubleValue;
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final Long esx1(@InterfaceC7396q long[] jArr, @InterfaceC7396q InterfaceC5979h<? super Long, ? super Long, Long> operation) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (jArr.length == 0) {
            return null;
        }
        long jLongValue = jArr[0];
        n5r1 it = new kotlin.ranges.x2(1, hmvj(jArr)).iterator();
        while (it.hasNext()) {
            jLongValue = operation.invoke(Long.valueOf(jLongValue), Long.valueOf(jArr[it.nextInt()])).longValue();
        }
        return Long.valueOf(jLongValue);
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final double eunr(short[] sArr, cyoe.x2<? super Short, Double> selector) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(Short.valueOf(sArr[0])).doubleValue();
        n5r1 it = new kotlin.ranges.x2(1, orxw(sArr)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, selector.invoke(Short.valueOf(sArr[it.nextInt()])).doubleValue());
        }
        return dDoubleValue;
    }

    public static final void evb(@InterfaceC7396q int[] iArr, @InterfaceC7396q cyoe.x2<? super Integer, was> action) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(action, "action");
        for (int i2 : iArr) {
            action.invoke(Integer.valueOf(i2));
        }
    }

    @InterfaceC6234g
    private static final Byte ew08(byte[] bArr, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        return rka(bArr, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC7396q
    public static final <T, K, V, M extends Map<? super K, List<V>>> M ewa(@InterfaceC7396q T[] tArr, @InterfaceC7396q M destination, @InterfaceC7396q cyoe.x2<? super T, ? extends K> keySelector, @InterfaceC7396q cyoe.x2<? super T, ? extends V> valueTransform) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(keySelector, "keySelector");
        kotlin.jvm.internal.d2ok.m23075h(valueTransform, "valueTransform");
        for (T t2 : tArr) {
            K kInvoke = keySelector.invoke(t2);
            Object arrayList = destination.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(valueTransform.invoke(t2));
        }
        return destination;
    }

    @InterfaceC7396q
    public static final <K, M extends Map<? super K, ? super Boolean>> M ex76(@InterfaceC7396q boolean[] zArr, @InterfaceC7396q M destination, @InterfaceC7396q cyoe.x2<? super Boolean, ? extends K> keySelector) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(keySelector, "keySelector");
        for (boolean z2 : zArr) {
            destination.put(keySelector.invoke(Boolean.valueOf(z2)), Boolean.valueOf(z2));
        }
        return destination;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final List<Long> eyzx(long[] jArr, InterfaceC5979h<? super Long, ? super Long, Long> operation) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (jArr.length == 0) {
            return kotlin.collections.ni7.a9();
        }
        long jLongValue = jArr[0];
        ArrayList arrayList = new ArrayList(jArr.length);
        arrayList.add(Long.valueOf(jLongValue));
        int length = jArr.length;
        for (int i2 = 1; i2 < length; i2++) {
            jLongValue = operation.invoke(Long.valueOf(jLongValue), Long.valueOf(jArr[i2])).longValue();
            arrayList.add(Long.valueOf(jLongValue));
        }
        return arrayList;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final Float ezv(long[] jArr, cyoe.x2<? super Long, Float> selector) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        float fFloatValue = selector.invoke(Long.valueOf(jArr[0])).floatValue();
        n5r1 it = new kotlin.ranges.x2(1, hmvj(jArr)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, selector.invoke(Long.valueOf(jArr[it.nextInt()])).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    public static final double f1(@InterfaceC7396q byte[] bArr) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        double d2 = 0.0d;
        int i2 = 0;
        for (byte b2 : bArr) {
            d2 += (double) b2;
            i2++;
        }
        if (i2 == 0) {
            return Double.NaN;
        }
        return d2 / ((double) i2);
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <R extends Comparable<? super R>> R f12b(long[] jArr, cyoe.x2<? super Long, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Long.valueOf(jArr[0]));
        n5r1 it = new kotlin.ranges.x2(1, hmvj(jArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Long.valueOf(jArr[it.nextInt()]));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    public static final int f14(@InterfaceC7396q double[] dArr) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        return dArr.length - 1;
    }

    @InterfaceC7396q
    public static final <R> List<R> f1w3(@InterfaceC7396q char[] cArr, @InterfaceC7396q cyoe.x2<? super Character, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (char c2 : cArr) {
            C6163t.zp(arrayList, transform.invoke(Character.valueOf(c2)));
        }
        return arrayList;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final double f2(boolean[] zArr, cyoe.x2<? super Boolean, Double> selector) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (zArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(Boolean.valueOf(zArr[0])).doubleValue();
        n5r1 it = new kotlin.ranges.x2(1, rl(zArr)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, selector.invoke(Boolean.valueOf(zArr[it.nextInt()])).doubleValue());
        }
        return dDoubleValue;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final byte[] f32v(byte[] bArr, InterfaceC5979h<? super Integer, ? super Byte, was> action) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(action, "action");
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            action.invoke(Integer.valueOf(i3), Byte.valueOf(bArr[i2]));
            i2++;
            i3++;
        }
        return bArr;
    }

    @InterfaceC7396q
    public static final <R> List<R> f4(@InterfaceC7396q int[] iArr, @InterfaceC7396q cyoe.x2<? super Integer, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (int i2 : iArr) {
            C6163t.zp(arrayList, transform.invoke(Integer.valueOf(i2)));
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final List<Long> f4f(@InterfaceC7396q long[] jArr, @InterfaceC7396q cyoe.x2<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (long j2 : jArr) {
            if (predicate.invoke(Long.valueOf(j2)).booleanValue()) {
                arrayList.add(Long.valueOf(j2));
            }
        }
        return arrayList;
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final Double f5(@InterfaceC7396q double[] dArr, @InterfaceC7396q InterfaceC5979h<? super Double, ? super Double, Double> operation) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (dArr.length == 0) {
            return null;
        }
        double dDoubleValue = dArr[0];
        n5r1 it = new kotlin.ranges.x2(1, f14(dArr)).iterator();
        while (it.hasNext()) {
            dDoubleValue = operation.invoke(Double.valueOf(dDoubleValue), Double.valueOf(dArr[it.nextInt()])).doubleValue();
        }
        return Double.valueOf(dDoubleValue);
    }

    @kotlin.yz(version = "1.4")
    public static final void f517(@InterfaceC7396q double[] dArr, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.collections.zy.Companion.m22683q(i2, i3, dArr.length);
        int i4 = (i2 + i3) / 2;
        if (i2 == i4) {
            return;
        }
        int i5 = i3 - 1;
        while (i2 < i4) {
            double d2 = dArr[i2];
            dArr[i2] = dArr[i5];
            dArr[i5] = d2;
            i5--;
            i2++;
        }
    }

    public static int f5k(@InterfaceC7396q int[] iArr, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i3 = length - 1;
                if (i2 == iArr[length]) {
                    return length;
                }
                if (i3 < 0) {
                    break;
                }
                length = i3;
            }
        }
        return -1;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final short[] f6ja(short[] sArr, cyoe.x2<? super Short, was> action) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(action, "action");
        for (short s2 : sArr) {
            action.invoke(Short.valueOf(s2));
        }
        return sArr;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final int[] f6u2(int[] iArr, cyoe.x2<? super Integer, was> action) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(action, "action");
        for (int i2 : iArr) {
            action.invoke(Integer.valueOf(i2));
        }
        return iArr;
    }

    @InterfaceC7396q
    public static final List<Character> f7(@InterfaceC7396q char[] cArr, @InterfaceC7396q cyoe.x2<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (int iJ59a = j59a(cArr); -1 < iJ59a; iJ59a--) {
            if (!predicate.invoke(Character.valueOf(cArr[iJ59a])).booleanValue()) {
                return d2(cArr, iJ59a + 1);
            }
        }
        return kotlin.collections.ni7.a9();
    }

    @InterfaceC7396q
    public static final <R extends Comparable<? super R>> List<Long> f7sp(@InterfaceC7396q long[] jArr, @InterfaceC7396q cyoe.x2<? super Long, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        return ttpr(jArr, new f7l8.C6179k(selector));
    }

    @InterfaceC7396q
    public static final <T extends Comparable<? super T>> List<T> f8(@InterfaceC7396q T[] tArr) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        return kotlin.collections.kja0.m22514i(w4j4(tArr));
    }

    public static final <S, T extends S> S f8i(@InterfaceC7396q T[] tArr, @InterfaceC7396q InterfaceC5979h<? super T, ? super S, ? extends S> operation) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        int iGjp = gjp(tArr);
        if (iGjp < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        S sInvoke = (S) tArr[iGjp];
        for (int i2 = iGjp - 1; i2 >= 0; i2--) {
            sInvoke = operation.invoke((Object) tArr[i2], sInvoke);
        }
        return sInvoke;
    }

    public static final boolean f9(@InterfaceC7396q byte[] bArr, @InterfaceC7396q cyoe.x2<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (byte b2 : bArr) {
            if (predicate.invoke(Byte.valueOf(b2)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <R extends Comparable<? super R>> R faab(char[] cArr, cyoe.x2<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Character.valueOf(cArr[0]));
        n5r1 it = new kotlin.ranges.x2(1, j59a(cArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Character.valueOf(cArr[it.nextInt()]));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    public static final double fai(@InterfaceC7396q float[] fArr) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        double d2 = 0.0d;
        int i2 = 0;
        for (float f2 : fArr) {
            d2 += (double) f2;
            i2++;
        }
        if (i2 == 0) {
            return Double.NaN;
        }
        return d2 / ((double) i2);
    }

    @InterfaceC7396q
    public static final kotlin.sequences.qrj<Short> fbr(@InterfaceC7396q short[] sArr) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        return sArr.length == 0 ? kotlin.sequences.t8r.f7l8() : new x2(sArr);
    }

    public static /* synthetic */ String fd(boolean[] zArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, cyoe.x2 x2Var, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i3 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i3 & 4) == 0 ? charSequence3 : "";
        if ((i3 & 8) != 0) {
            i2 = -1;
        }
        int i4 = i2;
        if ((i3 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i3 & 32) != 0) {
            x2Var = null;
        }
        return tl(zArr, charSequence, charSequence5, charSequence6, i4, charSequence7, x2Var);
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final double fd23(double[] dArr, cyoe.x2<? super Double, Double> selector) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(Double.valueOf(dArr[0])).doubleValue();
        n5r1 it = new kotlin.ranges.x2(1, f14(dArr)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, selector.invoke(Double.valueOf(dArr[it.nextInt()])).doubleValue());
        }
        return dDoubleValue;
    }

    @InterfaceC7396q
    public static final List<Float> fd7p(@InterfaceC7396q float[] fArr, @InterfaceC7396q kotlin.ranges.x2 indices) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(indices, "indices");
        return indices.isEmpty() ? kotlin.collections.ni7.a9() : kotlin.collections.kja0.cdj(kotlin.collections.kja0.jz5(fArr, indices.mo2951k().intValue(), indices.zy().intValue() + 1));
    }

    @InterfaceC6234g
    private static final Short fe(short[] sArr, cyoe.x2<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (short s2 : sArr) {
            if (predicate.invoke(Short.valueOf(s2)).booleanValue()) {
                return Short.valueOf(s2);
            }
        }
        return null;
    }

    public static final short feb(@InterfaceC7396q short[] sArr, @InterfaceC7396q cyoe.x2<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (short s2 : sArr) {
            if (predicate.invoke(Short.valueOf(s2)).booleanValue()) {
                return s2;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @InterfaceC7396q
    public static final <K, M extends Map<? super K, ? super Byte>> M ff8y(@InterfaceC7396q byte[] bArr, @InterfaceC7396q M destination, @InterfaceC7396q cyoe.x2<? super Byte, ? extends K> keySelector) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(keySelector, "keySelector");
        for (byte b2 : bArr) {
            destination.put(keySelector.invoke(Byte.valueOf(b2)), Byte.valueOf(b2));
        }
        return destination;
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final Float ffiu(@InterfaceC7396q float[] fArr, @InterfaceC7396q InterfaceC5979h<? super Float, ? super Float, Float> operation) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        int iGto = gto(fArr);
        if (iGto < 0) {
            return null;
        }
        float fFloatValue = fArr[iGto];
        for (int i2 = iGto - 1; i2 >= 0; i2--) {
            fFloatValue = operation.invoke(Float.valueOf(fArr[i2]), Float.valueOf(fFloatValue)).floatValue();
        }
        return Float.valueOf(fFloatValue);
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final <V, M extends Map<? super Integer, ? super V>> M ffy(int[] iArr, M destination, cyoe.x2<? super Integer, ? extends V> valueSelector) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(valueSelector, "valueSelector");
        for (int i2 : iArr) {
            destination.put(Integer.valueOf(i2), valueSelector.invoke(Integer.valueOf(i2)));
        }
        return destination;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <T> float fh1(T[] tArr, cyoe.x2<? super T, Float> selector) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(tArr[0]).floatValue();
        n5r1 it = new kotlin.ranges.x2(1, gjp(tArr)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, selector.invoke(tArr[it.nextInt()]).floatValue());
        }
        return fFloatValue;
    }

    @InterfaceC7396q
    public static final <R, C extends Collection<? super R>> C fiyg(@InterfaceC7396q char[] cArr, @InterfaceC7396q C destination, @InterfaceC7396q InterfaceC5979h<? super Integer, ? super Character, ? extends R> transform) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        int length = cArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            destination.add(transform.invoke(Integer.valueOf(i3), Character.valueOf(cArr[i2])));
            i2++;
            i3++;
        }
        return destination;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final <V, M extends Map<? super Long, ? super V>> M fjcj(long[] jArr, M destination, cyoe.x2<? super Long, ? extends V> valueSelector) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(valueSelector, "valueSelector");
        for (long j2 : jArr) {
            destination.put(Long.valueOf(j2), valueSelector.invoke(Long.valueOf(j2)));
        }
        return destination;
    }

    @InterfaceC7396q
    public static final List<Boolean> fjxh(@InterfaceC7396q boolean[] zArr) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        return a9.wr(cff0(zArr));
    }

    public static boolean fl(@InterfaceC7396q char[] cArr, char c2) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        return s4pb(cArr, c2) >= 0;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final double fl9j(int[] iArr, cyoe.x2<? super Integer, Double> selector) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(Integer.valueOf(iArr[0])).doubleValue();
        n5r1 it = new kotlin.ranges.x2(1, srpc(iArr)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, selector.invoke(Integer.valueOf(iArr[it.nextInt()])).doubleValue());
        }
        return dDoubleValue;
    }

    @InterfaceC7396q
    public static final <R, V> List<V> fltg(@InterfaceC7396q long[] jArr, @InterfaceC7396q Iterable<? extends R> other, @InterfaceC7396q InterfaceC5979h<? super Long, ? super R, ? extends V> transform) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        int length = jArr.length;
        ArrayList arrayList = new ArrayList(Math.min(kotlin.collections.fu4.vyq(other, 10), length));
        int i2 = 0;
        for (R r2 : other) {
            if (i2 >= length) {
                break;
            }
            arrayList.add(transform.invoke(Long.valueOf(jArr[i2]), r2));
            i2++;
        }
        return arrayList;
    }

    @InterfaceC7396q
    @kotlin.yz(version = "1.4")
    public static final <K, V> Map<K, V> fm(@InterfaceC7396q K[] kArr, @InterfaceC7396q cyoe.x2<? super K, ? extends V> valueSelector) {
        kotlin.jvm.internal.d2ok.m23075h(kArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(valueSelector, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.fn3e.fn3e(C6140e.m22479p(kArr.length), 16));
        for (K k2 : kArr) {
            linkedHashMap.put(k2, valueSelector.invoke(k2));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC7396q
    @kotlin.yz(version = "1.4")
    public static final <T, R> List<R> fmq(@InterfaceC7396q T[] tArr, R r2, @InterfaceC7396q cyoe.cdj<? super Integer, ? super R, ? super T, ? extends R> operation) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (tArr.length == 0) {
            return kotlin.collections.zurt.ld6(r2);
        }
        ArrayList arrayList = new ArrayList(tArr.length + 1);
        arrayList.add(r2);
        int length = tArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            r2 = operation.invoke(Integer.valueOf(i2), r2, tArr[i2]);
            arrayList.add(r2);
        }
        return arrayList;
    }

    @InterfaceC6234g
    private static final short fn9(short[] sArr) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        return sArr[2];
    }

    @kotlin.hyr
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @InterfaceC6769y(name = "sumOfInt")
    private static final int foll(float[] fArr, cyoe.x2<? super Float, Integer> selector) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        int iIntValue = 0;
        for (float f2 : fArr) {
            iIntValue += selector.invoke(Float.valueOf(f2)).intValue();
        }
        return iIntValue;
    }

    @InterfaceC7396q
    public static final List<Long> fp(@InterfaceC7396q long[] jArr, @InterfaceC7396q cyoe.x2<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (int iHmvj = hmvj(jArr); -1 < iHmvj; iHmvj--) {
            if (!predicate.invoke(Long.valueOf(jArr[iHmvj])).booleanValue()) {
                return vibj(jArr, iHmvj + 1);
            }
        }
        return zr(jArr);
    }

    @InterfaceC7396q
    public static final char[] fpd(@InterfaceC7396q char[] cArr) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        if (cArr.length == 0) {
            return cArr;
        }
        char[] cArrCopyOf = Arrays.copyOf(cArr, cArr.length);
        kotlin.jvm.internal.d2ok.kja0(cArrCopyOf, "copyOf(this, size)");
        hkfy(cArrCopyOf);
        return cArrCopyOf;
    }

    @InterfaceC7396q
    public static final <K, M extends Map<? super K, ? super Long>> M fpn(@InterfaceC7396q long[] jArr, @InterfaceC7396q M destination, @InterfaceC7396q cyoe.x2<? super Long, ? extends K> keySelector) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(keySelector, "keySelector");
        for (long j2 : jArr) {
            destination.put(keySelector.invoke(Long.valueOf(j2)), Long.valueOf(j2));
        }
        return destination;
    }

    @InterfaceC6234g
    private static final Character fpx(char[] cArr, cyoe.x2<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        int length = cArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                char c2 = cArr[length];
                if (predicate.invoke(Character.valueOf(c2)).booleanValue()) {
                    return Character.valueOf(c2);
                }
                if (i2 < 0) {
                    break;
                }
                length = i2;
            }
        }
        return null;
    }

    @InterfaceC7396q
    public static final <K, V, M extends Map<? super K, ? super V>> M fq(@InterfaceC7396q double[] dArr, @InterfaceC7396q M destination, @InterfaceC7396q cyoe.x2<? super Double, ? extends C6227f<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        for (double d2 : dArr) {
            C6227f<? extends K, ? extends V> c6227fInvoke = transform.invoke(Double.valueOf(d2));
            destination.put(c6227fInvoke.getFirst(), c6227fInvoke.getSecond());
        }
        return destination;
    }

    @kotlin.x2(errorSince = "1.6", hiddenSince = "1.7", warningSince = "1.4")
    @kotlin.ld6(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use 'indexOfFirst { it == element }' instead to continue using this behavior, or '.asList().indexOf(element: T)' to get the same search behavior as in a list.", replaceWith = @kotlin.hb(expression = "indexOfFirst { it == element }", imports = {}))
    public static final /* synthetic */ int frtx(float[] fArr, float f2) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        int length = fArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (f2 == fArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    @InterfaceC7396q
    public static final Set<Byte> fs9(@InterfaceC7396q byte[] bArr) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        return (Set) ads1(bArr, new LinkedHashSet(C6140e.m22479p(bArr.length)));
    }

    @InterfaceC7396q
    public static final HashSet<Integer> ft4(@InterfaceC7396q int[] iArr) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        return (HashSet) a7on(iArr, new HashSet(C6140e.m22479p(iArr.length)));
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <R extends Comparable<? super R>> R ftf(byte[] bArr, cyoe.x2<? super Byte, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Byte.valueOf(bArr[0]));
        n5r1 it = new kotlin.ranges.x2(1, vl(bArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Byte.valueOf(bArr[it.nextInt()]));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @kotlin.hyr
    @InterfaceC6234g
    @kotlin.yz(version = "1.5")
    @InterfaceC6769y(name = "sumOfUInt")
    private static final int ftn(long[] jArr, cyoe.x2<? super Long, gyi> selector) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        int iLd6 = gyi.ld6(0);
        for (long j2 : jArr) {
            iLd6 = gyi.ld6(iLd6 + selector.invoke(Long.valueOf(j2)).a98o());
        }
        return iLd6;
    }

    @InterfaceC7396q
    public static final <K> List<Character> fu7m(@InterfaceC7396q char[] cArr, @InterfaceC7396q cyoe.x2<? super Character, ? extends K> selector) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (char c2 : cArr) {
            if (hashSet.add(selector.invoke(Character.valueOf(c2)))) {
                arrayList.add(Character.valueOf(c2));
            }
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final Iterable<Integer> fupf(@InterfaceC7396q int[] iArr) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        return iArr.length == 0 ? kotlin.collections.ni7.a9() : new q(iArr);
    }

    @InterfaceC7396q
    public static final List<Short> fv(@InterfaceC7396q short[] sArr, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        if (i2 >= 0) {
            return p1s7(sArr, kotlin.ranges.fn3e.fn3e(sArr.length - i2, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final float fvoi(boolean[] zArr, cyoe.x2<? super Boolean, Float> selector) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (zArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(Boolean.valueOf(zArr[0])).floatValue();
        n5r1 it = new kotlin.ranges.x2(1, rl(zArr)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, selector.invoke(Boolean.valueOf(zArr[it.nextInt()])).floatValue());
        }
        return fFloatValue;
    }

    @InterfaceC6234g
    private static final char fvqg(char[] cArr) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        return cArr[3];
    }

    @InterfaceC6234g
    private static final Float fw(float[] fArr, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        return ooto(fArr, i2);
    }

    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final Character fwd(@InterfaceC7396q char[] cArr, @InterfaceC7396q cyoe.cdj<? super Integer, ? super Character, ? super Character, Character> operation) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (cArr.length == 0) {
            return null;
        }
        char cCharValue = cArr[0];
        n5r1 it = new kotlin.ranges.x2(1, j59a(cArr)).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            cCharValue = operation.invoke(Integer.valueOf(iNextInt), Character.valueOf(cCharValue), Character.valueOf(cArr[iNextInt])).charValue();
        }
        return Character.valueOf(cCharValue);
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC7396q
    @kotlin.yz(version = "1.4")
    public static final <S, T extends S> List<S> fx(@InterfaceC7396q T[] tArr, @InterfaceC7396q InterfaceC5979h<? super S, ? super T, ? extends S> operation) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (tArr.length == 0) {
            return kotlin.collections.ni7.a9();
        }
        S sInvoke = (Object) tArr[0];
        ArrayList arrayList = new ArrayList(tArr.length);
        arrayList.add(sInvoke);
        int length = tArr.length;
        for (int i2 = 1; i2 < length; i2++) {
            sInvoke = operation.invoke(sInvoke, (Object) tArr[i2]);
            arrayList.add(sInvoke);
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final Set<Short> fxq0(@InterfaceC7396q short[] sArr) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        return (Set) l0e(sArr, new LinkedHashSet(C6140e.m22479p(sArr.length)));
    }

    @InterfaceC7395n
    public static final Character fy7(@InterfaceC7396q char[] cArr, @InterfaceC7396q cyoe.x2<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        boolean z2 = false;
        Character chValueOf = null;
        for (char c2 : cArr) {
            if (predicate.invoke(Character.valueOf(c2)).booleanValue()) {
                if (z2) {
                    return null;
                }
                chValueOf = Character.valueOf(c2);
                z2 = true;
            }
        }
        if (z2) {
            return chValueOf;
        }
        return null;
    }

    public static int fyt(@InterfaceC7396q short[] sArr, short s2) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        int length = sArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (s2 == sArr[length]) {
                    return length;
                }
                if (i2 < 0) {
                    break;
                }
                length = i2;
            }
        }
        return -1;
    }

    @InterfaceC7396q
    public static final <R, C extends Collection<? super R>> C fz(@InterfaceC7396q short[] sArr, @InterfaceC7396q C destination, @InterfaceC7396q cyoe.x2<? super Short, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        for (short s2 : sArr) {
            C6163t.zp(destination, transform.invoke(Short.valueOf(s2)));
        }
        return destination;
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @kotlin.hyr
    @InterfaceC6234g
    @kotlin.yz(version = "1.5")
    @InterfaceC6769y(name = "sumOfULong")
    private static final long fz0t(boolean[] zArr, cyoe.x2<? super Boolean, ikck> selector) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        long jLd6 = ikck.ld6(0L);
        for (boolean z2 : zArr) {
            jLd6 = ikck.ld6(jLd6 + selector.invoke(Boolean.valueOf(z2)).a98o());
        }
        return jLd6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC7396q
    public static final <K, V, M extends Map<? super K, List<V>>> M fz5f(@InterfaceC7396q short[] sArr, @InterfaceC7396q M destination, @InterfaceC7396q cyoe.x2<? super Short, ? extends K> keySelector, @InterfaceC7396q cyoe.x2<? super Short, ? extends V> valueTransform) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(keySelector, "keySelector");
        kotlin.jvm.internal.d2ok.m23075h(valueTransform, "valueTransform");
        for (short s2 : sArr) {
            K kInvoke = keySelector.invoke(Short.valueOf(s2));
            Object arrayList = destination.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(valueTransform.invoke(Short.valueOf(s2)));
        }
        return destination;
    }

    @InterfaceC7396q
    public static final List<Byte> fzr(@InterfaceC7396q byte[] bArr, @InterfaceC7396q Comparator<? super Byte> comparator) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        Byte[] bArrZt = kotlin.collections.kja0.zt(bArr);
        kotlin.collections.kja0.izu(bArrZt, comparator);
        return kotlin.collections.kja0.m22514i(bArrZt);
    }

    public static final void fzz(@InterfaceC7396q boolean[] zArr) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        int length = (zArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int iRl = rl(zArr);
        n5r1 it = new kotlin.ranges.x2(0, length).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            boolean z2 = zArr[iNextInt];
            zArr[iNextInt] = zArr[iRl];
            zArr[iRl] = z2;
            iRl--;
        }
    }

    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final <R extends Comparable<? super R>> Double g0(@InterfaceC7396q double[] dArr, @InterfaceC7396q cyoe.x2<? super Double, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        double d2 = dArr[0];
        int iF14 = f14(dArr);
        if (iF14 == 0) {
            return Double.valueOf(d2);
        }
        R rInvoke = selector.invoke(Double.valueOf(d2));
        n5r1 it = new kotlin.ranges.x2(1, iF14).iterator();
        while (it.hasNext()) {
            double d4 = dArr[it.nextInt()];
            R rInvoke2 = selector.invoke(Double.valueOf(d4));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
                d2 = d4;
            }
        }
        return Double.valueOf(d2);
    }

    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final <T, R extends Comparable<? super R>> T g2h(@InterfaceC7396q T[] tArr, @InterfaceC7396q cyoe.x2<? super T, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        T t2 = tArr[0];
        int iGjp = gjp(tArr);
        if (iGjp == 0) {
            return t2;
        }
        R rInvoke = selector.invoke(t2);
        n5r1 it = new kotlin.ranges.x2(1, iGjp).iterator();
        while (it.hasNext()) {
            T t3 = tArr[it.nextInt()];
            R rInvoke2 = selector.invoke(t3);
            if (rInvoke.compareTo(rInvoke2) > 0) {
                t2 = t3;
                rInvoke = rInvoke2;
            }
        }
        return t2;
    }

    @InterfaceC7396q
    public static final <R, C extends Collection<? super R>> C g2p(@InterfaceC7396q int[] iArr, @InterfaceC7396q C destination, @InterfaceC7396q cyoe.x2<? super Integer, ? extends R> transform) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        for (int i2 : iArr) {
            destination.add(transform.invoke(Integer.valueOf(i2)));
        }
        return destination;
    }

    @kotlin.yz(version = "1.4")
    public static final void g3a(@InterfaceC7396q float[] fArr, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.collections.zy.Companion.m22683q(i2, i3, fArr.length);
        int i4 = (i2 + i3) / 2;
        if (i2 == i4) {
            return;
        }
        int i5 = i3 - 1;
        while (i2 < i4) {
            float f2 = fArr[i2];
            fArr[i2] = fArr[i5];
            fArr[i5] = f2;
            i5--;
            i2++;
        }
    }

    @InterfaceC7396q
    public static final <R> List<C6227f<Byte, R>> g4(@InterfaceC7396q byte[] bArr, @InterfaceC7396q Iterable<? extends R> other) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        int length = bArr.length;
        ArrayList arrayList = new ArrayList(Math.min(kotlin.collections.fu4.vyq(other, 10), length));
        int i2 = 0;
        for (R r2 : other) {
            if (i2 >= length) {
                break;
            }
            arrayList.add(kotlin.nmn5.m23230k(Byte.valueOf(bArr[i2]), r2));
            i2++;
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final <K, V> Map<K, V> g41(@InterfaceC7396q double[] dArr, @InterfaceC7396q cyoe.x2<? super Double, ? extends C6227f<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.fn3e.fn3e(C6140e.m22479p(dArr.length), 16));
        for (double d2 : dArr) {
            C6227f<? extends K, ? extends V> c6227fInvoke = transform.invoke(Double.valueOf(d2));
            linkedHashMap.put(c6227fInvoke.getFirst(), c6227fInvoke.getSecond());
        }
        return linkedHashMap;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <R> R g45(int[] iArr, Comparator<? super R> comparator, cyoe.x2<? super Integer, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Integer.valueOf(iArr[0]));
        n5r1 it = new kotlin.ranges.x2(1, srpc(iArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Integer.valueOf(iArr[it.nextInt()]));
            if (comparator.compare(rInvoke, rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final List<Byte> g5n4(byte[] bArr, InterfaceC5979h<? super Byte, ? super Byte, Byte> operation) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (bArr.length == 0) {
            return kotlin.collections.ni7.a9();
        }
        byte bByteValue = bArr[0];
        ArrayList arrayList = new ArrayList(bArr.length);
        arrayList.add(Byte.valueOf(bByteValue));
        int length = bArr.length;
        for (int i2 = 1; i2 < length; i2++) {
            bByteValue = operation.invoke(Byte.valueOf(bByteValue), Byte.valueOf(bArr[i2])).byteValue();
            arrayList.add(Byte.valueOf(bByteValue));
        }
        return arrayList;
    }

    @InterfaceC6234g
    private static final Integer g6(int[] iArr, cyoe.x2<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (int i2 : iArr) {
            if (predicate.invoke(Integer.valueOf(i2)).booleanValue()) {
                return Integer.valueOf(i2);
            }
        }
        return null;
    }

    @InterfaceC6234g
    private static final double g6i(double[] dArr) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        return dArr[1];
    }

    @InterfaceC7395n
    public static final Byte g7(@InterfaceC7396q byte[] bArr) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        if (bArr.length == 0) {
            return null;
        }
        return Byte.valueOf(bArr[bArr.length - 1]);
    }

    @kotlin.yz(version = "1.7")
    @InterfaceC6769y(name = "maxWithOrThrow")
    public static final boolean g74f(@InterfaceC7396q boolean[] zArr, @InterfaceC7396q Comparator<? super Boolean> comparator) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        if (zArr.length == 0) {
            throw new NoSuchElementException();
        }
        boolean z2 = zArr[0];
        n5r1 it = new kotlin.ranges.x2(1, rl(zArr)).iterator();
        while (it.hasNext()) {
            boolean z3 = zArr[it.nextInt()];
            if (comparator.compare(Boolean.valueOf(z2), Boolean.valueOf(z3)) < 0) {
                z2 = z3;
            }
        }
        return z2;
    }

    @InterfaceC7396q
    public static final <K, V, M extends Map<? super K, ? super V>> M g8(@InterfaceC7396q long[] jArr, @InterfaceC7396q M destination, @InterfaceC7396q cyoe.x2<? super Long, ? extends C6227f<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        for (long j2 : jArr) {
            C6227f<? extends K, ? extends V> c6227fInvoke = transform.invoke(Long.valueOf(j2));
            destination.put(c6227fInvoke.getFirst(), c6227fInvoke.getSecond());
        }
        return destination;
    }

    @InterfaceC7396q
    public static final <R, V> List<V> g8b1(@InterfaceC7396q int[] iArr, @InterfaceC7396q Iterable<? extends R> other, @InterfaceC7396q InterfaceC5979h<? super Integer, ? super R, ? extends V> transform) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        int length = iArr.length;
        ArrayList arrayList = new ArrayList(Math.min(kotlin.collections.fu4.vyq(other, 10), length));
        int i2 = 0;
        for (R r2 : other) {
            if (i2 >= length) {
                break;
            }
            arrayList.add(transform.invoke(Integer.valueOf(iArr[i2]), r2));
            i2++;
        }
        return arrayList;
    }

    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final Float g8pn(@InterfaceC7396q float[] fArr, @InterfaceC7396q cyoe.cdj<? super Integer, ? super Float, ? super Float, Float> operation) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        int iGto = gto(fArr);
        if (iGto < 0) {
            return null;
        }
        float fFloatValue = fArr[iGto];
        for (int i2 = iGto - 1; i2 >= 0; i2--) {
            fFloatValue = operation.invoke(Integer.valueOf(i2), Float.valueOf(fArr[i2]), Float.valueOf(fFloatValue)).floatValue();
        }
        return Float.valueOf(fFloatValue);
    }

    @InterfaceC7396q
    public static final Set<Byte> g9o6(@InterfaceC7396q byte[] bArr, @InterfaceC7396q Iterable<Byte> other) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        Set<Byte> setFs9 = fs9(bArr);
        C6163t.zsr0(setFs9, other);
        return setFs9;
    }

    @InterfaceC7395n
    public static final Short ga8(@InterfaceC7396q short[] sArr, @InterfaceC7396q cyoe.x2<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        int length = sArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i2 = length - 1;
            short s2 = sArr[length];
            if (predicate.invoke(Short.valueOf(s2)).booleanValue()) {
                return Short.valueOf(s2);
            }
            if (i2 < 0) {
                return null;
            }
            length = i2;
        }
    }

    @InterfaceC6234g
    private static final Boolean gai(boolean[] zArr, cyoe.x2<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (boolean z2 : zArr) {
            if (predicate.invoke(Boolean.valueOf(z2)).booleanValue()) {
                return Boolean.valueOf(z2);
            }
        }
        return null;
    }

    @InterfaceC7396q
    public static final <C extends Collection<? super Long>> C gb1(@InterfaceC7396q long[] jArr, @InterfaceC7396q C destination) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        for (long j2 : jArr) {
            destination.add(Long.valueOf(j2));
        }
        return destination;
    }

    @InterfaceC7396q
    public static final <C extends Collection<? super Byte>> C gb7o(@InterfaceC7396q byte[] bArr, @InterfaceC7396q C destination, @InterfaceC7396q cyoe.x2<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (byte b2 : bArr) {
            if (predicate.invoke(Byte.valueOf(b2)).booleanValue()) {
                destination.add(Byte.valueOf(b2));
            }
        }
        return destination;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final double gc1(byte[] bArr, cyoe.x2<? super Byte, Double> selector) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(Byte.valueOf(bArr[0])).doubleValue();
        n5r1 it = new kotlin.ranges.x2(1, vl(bArr)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, selector.invoke(Byte.valueOf(bArr[it.nextInt()])).doubleValue());
        }
        return dDoubleValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC7396q
    public static final <K, V, M extends Map<? super K, List<V>>> M gd(@InterfaceC7396q float[] fArr, @InterfaceC7396q M destination, @InterfaceC7396q cyoe.x2<? super Float, ? extends K> keySelector, @InterfaceC7396q cyoe.x2<? super Float, ? extends V> valueTransform) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(keySelector, "keySelector");
        kotlin.jvm.internal.d2ok.m23075h(valueTransform, "valueTransform");
        for (float f2 : fArr) {
            K kInvoke = keySelector.invoke(Float.valueOf(f2));
            Object arrayList = destination.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(valueTransform.invoke(Float.valueOf(f2)));
        }
        return destination;
    }

    @InterfaceC7396q
    public static final List<Long> gd7z(@InterfaceC7396q long[] jArr, @InterfaceC7396q cyoe.x2<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (long j2 : jArr) {
            if (!predicate.invoke(Long.valueOf(j2)).booleanValue()) {
                break;
            }
            arrayList.add(Long.valueOf(j2));
        }
        return arrayList;
    }

    @InterfaceC7395n
    public static final Float gdzl(@InterfaceC7396q float[] fArr) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        if (fArr.length == 1) {
            return Float.valueOf(fArr[0]);
        }
        return null;
    }

    @InterfaceC6234g
    private static final boolean gek(byte[] bArr) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        return bArr.length == 0;
    }

    @kotlin.hyr
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @InterfaceC6769y(name = "flatMapIndexedIterable")
    private static final <R> List<R> gg(long[] jArr, InterfaceC5979h<? super Integer, ? super Long, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = jArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            C6163t.zp(arrayList, transform.invoke(Integer.valueOf(i3), Long.valueOf(jArr[i2])));
            i2++;
            i3++;
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final <K, V> Map<K, V> gg7(@InterfaceC7396q boolean[] zArr, @InterfaceC7396q cyoe.x2<? super Boolean, ? extends K> keySelector, @InterfaceC7396q cyoe.x2<? super Boolean, ? extends V> valueTransform) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(keySelector, "keySelector");
        kotlin.jvm.internal.d2ok.m23075h(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.fn3e.fn3e(C6140e.m22479p(zArr.length), 16));
        for (boolean z2 : zArr) {
            linkedHashMap.put(keySelector.invoke(Boolean.valueOf(z2)), valueTransform.invoke(Boolean.valueOf(z2)));
        }
        return linkedHashMap;
    }

    @InterfaceC7396q
    public static final <R, C extends Collection<? super R>> C ggci(@InterfaceC7396q float[] fArr, @InterfaceC7396q C destination, @InterfaceC7396q cyoe.x2<? super Float, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        for (float f2 : fArr) {
            C6163t.zp(destination, transform.invoke(Float.valueOf(f2)));
        }
        return destination;
    }

    @InterfaceC6234g
    private static final Long gge(long[] jArr, cyoe.x2<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (long j2 : jArr) {
            if (predicate.invoke(Long.valueOf(j2)).booleanValue()) {
                return Long.valueOf(j2);
            }
        }
        return null;
    }

    public static final <T> T ggnn(@InterfaceC7396q T[] tArr) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        int length = tArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return tArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    @InterfaceC6234g
    private static final int ghw9(int[] iArr, int i2, cyoe.x2<? super Integer, Integer> defaultValue) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(defaultValue, "defaultValue");
        return (i2 < 0 || i2 > srpc(iArr)) ? defaultValue.invoke(Integer.valueOf(i2)).intValue() : iArr[i2];
    }

    @kotlin.yz(version = "1.7")
    @InterfaceC6769y(name = "minOrThrow")
    public static final int gi(@InterfaceC7396q int[] iArr) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        int i2 = iArr[0];
        n5r1 it = new kotlin.ranges.x2(1, srpc(iArr)).iterator();
        while (it.hasNext()) {
            int i3 = iArr[it.nextInt()];
            if (i2 > i3) {
                i2 = i3;
            }
        }
        return i2;
    }

    @InterfaceC7396q
    public static final <T> HashSet<T> giq0(@InterfaceC7396q T[] tArr) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        return (HashSet) mp7a(tArr, new HashSet(C6140e.m22479p(tArr.length)));
    }

    @InterfaceC7396q
    public static final List<Long> gir(@InterfaceC7396q long[] jArr, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        if (i2 >= 0) {
            return wl(jArr, kotlin.ranges.fn3e.fn3e(jArr.length - i2, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
    }

    public static long gj(@InterfaceC7396q long[] jArr) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        if (jArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return jArr[hmvj(jArr)];
    }

    @InterfaceC7396q
    public static final <R> List<R> gjbz(@InterfaceC7396q byte[] bArr, @InterfaceC7396q cyoe.x2<? super Byte, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (byte b2 : bArr) {
            C6163t.zp(arrayList, transform.invoke(Byte.valueOf(b2)));
        }
        return arrayList;
    }

    public static <T> int gjp(@InterfaceC7396q T[] tArr) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        return tArr.length - 1;
    }

    @InterfaceC7396q
    public static final List<Float> gk(@InterfaceC7396q float[] fArr, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        if (i2 >= 0) {
            return kg(fArr, kotlin.ranges.fn3e.fn3e(fArr.length - i2, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final Byte gk4(@InterfaceC7396q byte[] bArr, @InterfaceC7396q AbstractC6332g random) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(random, "random");
        if (bArr.length == 0) {
            return null;
        }
        return Byte.valueOf(bArr[random.nextInt(bArr.length)]);
    }

    @InterfaceC7396q
    public static final <R> List<R> gkj(@InterfaceC7396q int[] iArr, @InterfaceC7396q InterfaceC5979h<? super Integer, ? super Integer, ? extends R> transform) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        ArrayList arrayList = new ArrayList(iArr.length);
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            arrayList.add(transform.invoke(Integer.valueOf(i3), Integer.valueOf(iArr[i2])));
            i2++;
            i3++;
        }
        return arrayList;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final <V> Map<Integer, V> gl8t(int[] iArr, cyoe.x2<? super Integer, ? extends V> valueSelector) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(valueSelector, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.fn3e.fn3e(C6140e.m22479p(iArr.length), 16));
        for (int i2 : iArr) {
            linkedHashMap.put(Integer.valueOf(i2), valueSelector.invoke(Integer.valueOf(i2)));
        }
        return linkedHashMap;
    }

    @InterfaceC7396q
    public static int[] gle(@InterfaceC7396q int[] iArr, @InterfaceC7396q kotlin.ranges.x2 indices) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(indices, "indices");
        return indices.isEmpty() ? new int[0] : kotlin.collections.kja0.ktq(iArr, indices.mo2951k().intValue(), indices.zy().intValue() + 1);
    }

    @InterfaceC7396q
    public static final Set<Byte> glf(@InterfaceC7396q byte[] bArr, @InterfaceC7396q Iterable<Byte> other) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        Set<Byte> setFs9 = fs9(bArr);
        C6163t.vq(setFs9, other);
        return setFs9;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final Double gm(short[] sArr, cyoe.x2<? super Short, Double> selector) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        double dDoubleValue = selector.invoke(Short.valueOf(sArr[0])).doubleValue();
        n5r1 it = new kotlin.ranges.x2(1, orxw(sArr)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, selector.invoke(Short.valueOf(sArr[it.nextInt()])).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final Short gm2h(@InterfaceC7396q short[] sArr, @InterfaceC7396q cyoe.cdj<? super Integer, ? super Short, ? super Short, Short> operation) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        int iOrxw = orxw(sArr);
        if (iOrxw < 0) {
            return null;
        }
        short sShortValue = sArr[iOrxw];
        for (int i2 = iOrxw - 1; i2 >= 0; i2--) {
            sShortValue = operation.invoke(Integer.valueOf(i2), Short.valueOf(sArr[i2]), Short.valueOf(sShortValue)).shortValue();
        }
        return Short.valueOf(sShortValue);
    }

    @InterfaceC7396q
    public static final String gm3(@InterfaceC7396q double[] dArr, @InterfaceC7396q CharSequence separator, @InterfaceC7396q CharSequence prefix, @InterfaceC7396q CharSequence postfix, int i2, @InterfaceC7396q CharSequence truncated, @InterfaceC7395n cyoe.x2<? super Double, ? extends CharSequence> x2Var) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(separator, "separator");
        kotlin.jvm.internal.d2ok.m23075h(prefix, "prefix");
        kotlin.jvm.internal.d2ok.m23075h(postfix, "postfix");
        kotlin.jvm.internal.d2ok.m23075h(truncated, "truncated");
        String string = ((StringBuilder) a2lv(dArr, new StringBuilder(), separator, prefix, postfix, i2, truncated, x2Var)).toString();
        kotlin.jvm.internal.d2ok.kja0(string, "joinTo(StringBuilder(), …ed, transform).toString()");
        return string;
    }

    public static final <T> T gn7j(@InterfaceC7396q T[] tArr, @InterfaceC7396q cyoe.x2<? super T, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        T t2 = null;
        boolean z2 = false;
        for (T t3 : tArr) {
            if (predicate.invoke(t3).booleanValue()) {
                if (z2) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                z2 = true;
                t2 = t3;
            }
        }
        if (z2) {
            return t2;
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final int goq(@InterfaceC7396q char[] cArr, @InterfaceC7396q cyoe.x2<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        int i2 = 0;
        for (char c2 : cArr) {
            if (predicate.invoke(Character.valueOf(c2)).booleanValue()) {
                i2++;
            }
        }
        return i2;
    }

    @InterfaceC7396q
    public static final <K> Map<K, List<Double>> gpgg(@InterfaceC7396q double[] dArr, @InterfaceC7396q cyoe.x2<? super Double, ? extends K> keySelector) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (double d2 : dArr) {
            K kInvoke = keySelector.invoke(Double.valueOf(d2));
            Object arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(Double.valueOf(d2));
        }
        return linkedHashMap;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <R extends Comparable<? super R>> R gq(int[] iArr, cyoe.x2<? super Integer, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Integer.valueOf(iArr[0]));
        n5r1 it = new kotlin.ranges.x2(1, srpc(iArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Integer.valueOf(iArr[it.nextInt()]));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final Double gr(char[] cArr, cyoe.x2<? super Character, Double> selector) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        double dDoubleValue = selector.invoke(Character.valueOf(cArr[0])).doubleValue();
        n5r1 it = new kotlin.ranges.x2(1, j59a(cArr)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, selector.invoke(Character.valueOf(cArr[it.nextInt()])).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    public static final double gs9(@InterfaceC7396q double[] dArr, @InterfaceC7396q cyoe.x2<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (double d2 : dArr) {
            if (predicate.invoke(Double.valueOf(d2)).booleanValue()) {
                return d2;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <T, R> R gt(T[] tArr, Comparator<? super R> comparator, cyoe.x2<? super T, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(tArr[0]);
        n5r1 it = new kotlin.ranges.x2(1, gjp(tArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(tArr[it.nextInt()]);
            if (comparator.compare(rInvoke, rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    public static final int gto(@InterfaceC7396q float[] fArr) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        return fArr.length - 1;
    }

    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final Integer gu(@InterfaceC7396q int[] iArr) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        int i2 = iArr[0];
        n5r1 it = new kotlin.ranges.x2(1, srpc(iArr)).iterator();
        while (it.hasNext()) {
            int i3 = iArr[it.nextInt()];
            if (i2 < i3) {
                i2 = i3;
            }
        }
        return Integer.valueOf(i2);
    }

    @InterfaceC7396q
    public static final <K, M extends Map<? super K, List<Byte>>> M gue(@InterfaceC7396q byte[] bArr, @InterfaceC7396q M destination, @InterfaceC7396q cyoe.x2<? super Byte, ? extends K> keySelector) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(keySelector, "keySelector");
        for (byte b2 : bArr) {
            K kInvoke = keySelector.invoke(Byte.valueOf(b2));
            Object arrayList = destination.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(Byte.valueOf(b2));
        }
        return destination;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <R> R gun(byte[] bArr, Comparator<? super R> comparator, cyoe.x2<? super Byte, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Byte.valueOf(bArr[0]));
        n5r1 it = new kotlin.ranges.x2(1, vl(bArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Byte.valueOf(bArr[it.nextInt()]));
            if (comparator.compare(rInvoke, rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC7396q
    public static final Set<Long> gvs2(@InterfaceC7396q long[] jArr, @InterfaceC7396q Iterable<Long> other) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        Set<Long> setQ4m4 = q4m4(jArr);
        C6163t.zsr0(setQ4m4, other);
        return setQ4m4;
    }

    public static final boolean gvt(@InterfaceC7396q byte[] bArr) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        return bArr.length == 0;
    }

    @InterfaceC7396q
    public static final Set<Integer> gvu(@InterfaceC7396q int[] iArr) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        return (Set) a7on(iArr, new LinkedHashSet(C6140e.m22479p(iArr.length)));
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final <R> List<R> gwe(long[] jArr, R r2, InterfaceC5979h<? super R, ? super Long, ? extends R> operation) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (jArr.length == 0) {
            return kotlin.collections.zurt.ld6(r2);
        }
        ArrayList arrayList = new ArrayList(jArr.length + 1);
        arrayList.add(r2);
        for (long j2 : jArr) {
            r2 = operation.invoke(r2, Long.valueOf(j2));
            arrayList.add(r2);
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final List<Boolean> gwj(@InterfaceC7396q boolean[] zArr, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
        }
        if (i2 == 0) {
            return kotlin.collections.ni7.a9();
        }
        int length = zArr.length;
        if (i2 >= length) {
            return w4de(zArr);
        }
        if (i2 == 1) {
            return kotlin.collections.zurt.ld6(Boolean.valueOf(zArr[length - 1]));
        }
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = length - i2; i3 < length; i3++) {
            arrayList.add(Boolean.valueOf(zArr[i3]));
        }
        return arrayList;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <R> R gx2z(char[] cArr, Comparator<? super R> comparator, cyoe.x2<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Character.valueOf(cArr[0]));
        n5r1 it = new kotlin.ranges.x2(1, j59a(cArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Character.valueOf(cArr[it.nextInt()]));
            if (comparator.compare(rInvoke, rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @kotlin.x2(warningSince = "1.5")
    @kotlin.ld6(message = "Use sumOf instead.", replaceWith = @kotlin.hb(expression = "this.sumOf(selector)", imports = {}))
    public static final double gx4(@InterfaceC7396q byte[] bArr, @InterfaceC7396q cyoe.x2<? super Byte, Double> selector) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        double dDoubleValue = 0.0d;
        for (byte b2 : bArr) {
            dDoubleValue += selector.invoke(Byte.valueOf(b2)).doubleValue();
        }
        return dDoubleValue;
    }

    @InterfaceC7396q
    public static final <K, M extends Map<? super K, List<Short>>> M gxqa(@InterfaceC7396q short[] sArr, @InterfaceC7396q M destination, @InterfaceC7396q cyoe.x2<? super Short, ? extends K> keySelector) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(keySelector, "keySelector");
        for (short s2 : sArr) {
            K kInvoke = keySelector.invoke(Short.valueOf(s2));
            Object arrayList = destination.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(Short.valueOf(s2));
        }
        return destination;
    }

    @InterfaceC7395n
    public static final Boolean gy40(@InterfaceC7396q boolean[] zArr) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        if (zArr.length == 0) {
            return null;
        }
        return Boolean.valueOf(zArr[0]);
    }

    @InterfaceC7396q
    public static final boolean[] gym(@InterfaceC7396q boolean[] zArr, @InterfaceC7396q kotlin.ranges.x2 indices) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(indices, "indices");
        return indices.isEmpty() ? new boolean[0] : kotlin.collections.kja0.h7am(zArr, indices.mo2951k().intValue(), indices.zy().intValue() + 1);
    }

    public static final int gz(@InterfaceC7396q int[] iArr, @InterfaceC7396q cyoe.x2<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        int i2 = 0;
        for (int i3 : iArr) {
            if (predicate.invoke(Integer.valueOf(i3)).booleanValue()) {
                i2++;
            }
        }
        return i2;
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final Byte h2(@InterfaceC7396q byte[] bArr, @InterfaceC7396q InterfaceC5979h<? super Byte, ? super Byte, Byte> operation) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        int iVl = vl(bArr);
        if (iVl < 0) {
            return null;
        }
        byte bByteValue = bArr[iVl];
        for (int i2 = iVl - 1; i2 >= 0; i2--) {
            bByteValue = operation.invoke(Byte.valueOf(bArr[i2]), Byte.valueOf(bByteValue)).byteValue();
        }
        return Byte.valueOf(bByteValue);
    }

    @InterfaceC7396q
    public static final <R, C extends Collection<? super R>> C h3(@InterfaceC7396q float[] fArr, @InterfaceC7396q C destination, @InterfaceC7396q InterfaceC5979h<? super Integer, ? super Float, ? extends R> transform) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        int length = fArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            destination.add(transform.invoke(Integer.valueOf(i3), Float.valueOf(fArr[i2])));
            i2++;
            i3++;
        }
        return destination;
    }

    @InterfaceC6234g
    private static final int h39(int[] iArr) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        return iArr[4];
    }

    @InterfaceC6234g
    private static final byte h4g(byte[] bArr) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        return bArr[2];
    }

    @kotlin.yz(version = "1.7")
    @InterfaceC6769y(name = "minWithOrThrow")
    public static final boolean h52g(@InterfaceC7396q boolean[] zArr, @InterfaceC7396q Comparator<? super Boolean> comparator) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        if (zArr.length == 0) {
            throw new NoSuchElementException();
        }
        boolean z2 = zArr[0];
        n5r1 it = new kotlin.ranges.x2(1, rl(zArr)).iterator();
        while (it.hasNext()) {
            boolean z3 = zArr[it.nextInt()];
            if (comparator.compare(Boolean.valueOf(z2), Boolean.valueOf(z3)) > 0) {
                z2 = z3;
            }
        }
        return z2;
    }

    @InterfaceC7396q
    public static kotlin.ranges.x2 h5bu(@InterfaceC7396q int[] iArr) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        return new kotlin.ranges.x2(0, srpc(iArr));
    }

    @InterfaceC7396q
    public static final <V> List<V> h6(@InterfaceC7396q int[] iArr, @InterfaceC7396q int[] other, @InterfaceC7396q InterfaceC5979h<? super Integer, ? super Integer, ? extends V> transform) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        int iMin = Math.min(iArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i2 = 0; i2 < iMin; i2++) {
            arrayList.add(transform.invoke(Integer.valueOf(iArr[i2]), Integer.valueOf(other[i2])));
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final <R, C extends Collection<? super R>> C h60v(@InterfaceC7396q long[] jArr, @InterfaceC7396q C destination, @InterfaceC7396q cyoe.x2<? super Long, ? extends R> transform) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        for (long j2 : jArr) {
            destination.add(transform.invoke(Long.valueOf(j2)));
        }
        return destination;
    }

    @kotlin.hyr
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @InterfaceC6769y(name = "flatMapIndexedIterableTo")
    private static final <R, C extends Collection<? super R>> C h7(byte[] bArr, C destination, InterfaceC5979h<? super Integer, ? super Byte, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            C6163t.zp(destination, transform.invoke(Integer.valueOf(i3), Byte.valueOf(bArr[i2])));
            i2++;
            i3++;
        }
        return destination;
    }

    public static final float h8(@InterfaceC7396q float[] fArr, @InterfaceC7396q cyoe.cdj<? super Integer, ? super Float, ? super Float, Float> operation) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (fArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        float fFloatValue = fArr[0];
        n5r1 it = new kotlin.ranges.x2(1, gto(fArr)).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            fFloatValue = operation.invoke(Integer.valueOf(iNextInt), Float.valueOf(fFloatValue), Float.valueOf(fArr[iNextInt])).floatValue();
        }
        return fFloatValue;
    }

    @InterfaceC6234g
    private static final double h8k(double[] dArr) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        return dArr[3];
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final float h8w0(float[] fArr, cyoe.x2<? super Float, Float> selector) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(Float.valueOf(fArr[0])).floatValue();
        n5r1 it = new kotlin.ranges.x2(1, gto(fArr)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, selector.invoke(Float.valueOf(fArr[it.nextInt()])).floatValue());
        }
        return fFloatValue;
    }

    @InterfaceC7396q
    public static final Set<Character> h9(@InterfaceC7396q char[] cArr) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        return (Set) kff(cArr, new LinkedHashSet(C6140e.m22479p(kotlin.ranges.fn3e.m23305t(cArr.length, 128))));
    }

    @InterfaceC7396q
    public static final List<Integer> h97(@InterfaceC7396q int[] iArr, @InterfaceC7396q cyoe.x2<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (int iSrpc = srpc(iArr); -1 < iSrpc; iSrpc--) {
            if (!predicate.invoke(Integer.valueOf(iArr[iSrpc])).booleanValue()) {
                return o2(iArr, iSrpc + 1);
            }
        }
        return bgz(iArr);
    }

    @InterfaceC7396q
    public static final List<Integer> h9i4(@InterfaceC7396q int[] iArr, @InterfaceC7396q cyoe.x2<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (int i2 : iArr) {
            if (!predicate.invoke(Integer.valueOf(i2)).booleanValue()) {
                break;
            }
            arrayList.add(Integer.valueOf(i2));
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final List<Character> h9w7(@InterfaceC7396q char[] cArr, @InterfaceC7396q Comparator<? super Character> comparator) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        Character[] chArrB6 = kotlin.collections.kja0.b6(cArr);
        kotlin.collections.kja0.izu(chArrB6, comparator);
        return kotlin.collections.kja0.m22514i(chArrB6);
    }

    @InterfaceC7396q
    public static final float[] ha(@InterfaceC7396q float[] fArr, @InterfaceC7396q kotlin.ranges.x2 indices) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(indices, "indices");
        return indices.isEmpty() ? new float[0] : kotlin.collections.kja0.jz5(fArr, indices.mo2951k().intValue(), indices.zy().intValue() + 1);
    }

    public static final <R> R haw(@InterfaceC7396q long[] jArr, R r2, @InterfaceC7396q cyoe.cdj<? super Integer, ? super Long, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        for (int iHmvj = hmvj(jArr); iHmvj >= 0; iHmvj--) {
            r2 = operation.invoke(Integer.valueOf(iHmvj), Long.valueOf(jArr[iHmvj]), r2);
        }
        return r2;
    }

    @InterfaceC7396q
    public static final List<Byte> hcy(@InterfaceC7396q byte[] bArr, @InterfaceC7396q InterfaceC5979h<? super Integer, ? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            byte b2 = bArr[i2];
            int i4 = i3 + 1;
            if (predicate.invoke(Integer.valueOf(i3), Byte.valueOf(b2)).booleanValue()) {
                arrayList.add(Byte.valueOf(b2));
            }
            i2++;
            i3 = i4;
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final <K, V, M extends Map<? super K, ? super V>> M hczd(@InterfaceC7396q boolean[] zArr, @InterfaceC7396q M destination, @InterfaceC7396q cyoe.x2<? super Boolean, ? extends K> keySelector, @InterfaceC7396q cyoe.x2<? super Boolean, ? extends V> valueTransform) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(keySelector, "keySelector");
        kotlin.jvm.internal.d2ok.m23075h(valueTransform, "valueTransform");
        for (boolean z2 : zArr) {
            destination.put(keySelector.invoke(Boolean.valueOf(z2)), valueTransform.invoke(Boolean.valueOf(z2)));
        }
        return destination;
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final <R> List<R> hd(byte[] bArr, R r2, cyoe.cdj<? super Integer, ? super R, ? super Byte, ? extends R> operation) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (bArr.length == 0) {
            return kotlin.collections.zurt.ld6(r2);
        }
        ArrayList arrayList = new ArrayList(bArr.length + 1);
        arrayList.add(r2);
        int length = bArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            r2 = operation.invoke(Integer.valueOf(i2), r2, Byte.valueOf(bArr[i2]));
            arrayList.add(r2);
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final Set<Character> hew1(@InterfaceC7396q char[] cArr) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        int length = cArr.length;
        return length != 0 ? length != 1 ? (Set) kff(cArr, new LinkedHashSet(C6140e.m22479p(kotlin.ranges.fn3e.m23305t(cArr.length, 128)))) : i1.m22499g(Character.valueOf(cArr[0])) : a98o.ld6();
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final <R> List<R> hf(boolean[] zArr, R r2, InterfaceC5979h<? super R, ? super Boolean, ? extends R> operation) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (zArr.length == 0) {
            return kotlin.collections.zurt.ld6(r2);
        }
        ArrayList arrayList = new ArrayList(zArr.length + 1);
        arrayList.add(r2);
        for (boolean z2 : zArr) {
            r2 = operation.invoke(r2, Boolean.valueOf(z2));
            arrayList.add(r2);
        }
        return arrayList;
    }

    @InterfaceC6234g
    private static final Integer hf7(int[] iArr, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        return l2gr(iArr, i2);
    }

    @InterfaceC7396q
    public static final <R, C extends Collection<? super R>> C hf94(@InterfaceC7396q boolean[] zArr, @InterfaceC7396q C destination, @InterfaceC7396q InterfaceC5979h<? super Integer, ? super Boolean, ? extends R> transform) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        int length = zArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            destination.add(transform.invoke(Integer.valueOf(i3), Boolean.valueOf(zArr[i2])));
            i2++;
            i3++;
        }
        return destination;
    }

    @InterfaceC6234g
    private static final int hfwa(int[] iArr) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        return iArr[1];
    }

    @InterfaceC7396q
    public static final <R, C extends Collection<? super R>> C hgj(@InterfaceC7396q boolean[] zArr, @InterfaceC7396q C destination, @InterfaceC7396q cyoe.x2<? super Boolean, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        for (boolean z2 : zArr) {
            C6163t.zp(destination, transform.invoke(Boolean.valueOf(z2)));
        }
        return destination;
    }

    public static final double hhpi(@InterfaceC7396q double[] dArr) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        double d2 = 0.0d;
        for (double d4 : dArr) {
            d2 += d4;
        }
        return d2;
    }

    @InterfaceC7395n
    public static final Character hi(@InterfaceC7396q char[] cArr, @InterfaceC7396q cyoe.x2<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (char c2 : cArr) {
            if (predicate.invoke(Character.valueOf(c2)).booleanValue()) {
                return Character.valueOf(c2);
            }
        }
        return null;
    }

    public static final boolean hi2(@InterfaceC7396q int[] iArr, @InterfaceC7396q cyoe.x2<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (int i2 : iArr) {
            if (predicate.invoke(Integer.valueOf(i2)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <R> R hj(@InterfaceC7396q char[] cArr, R r2, @InterfaceC7396q cyoe.cdj<? super Integer, ? super Character, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        for (int iJ59a = j59a(cArr); iJ59a >= 0; iJ59a--) {
            r2 = operation.invoke(Integer.valueOf(iJ59a), Character.valueOf(cArr[iJ59a]), r2);
        }
        return r2;
    }

    @InterfaceC7396q
    public static final List<Long> hjp(@InterfaceC7396q long[] jArr) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        Long[] lArrD9i = kotlin.collections.kja0.d9i(jArr);
        kotlin.collections.kja0.anw(lArrD9i);
        return kotlin.collections.kja0.m22514i(lArrD9i);
    }

    @InterfaceC7396q
    public static final List<Double> hk(@InterfaceC7396q double[] dArr, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        if (i2 >= 0) {
            return nzoy(dArr, kotlin.ranges.fn3e.fn3e(dArr.length - i2, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
    }

    @InterfaceC7396q
    public static final List<Integer> hk2l(@InterfaceC7396q int[] iArr, @InterfaceC7396q cyoe.x2<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (int iSrpc = srpc(iArr); -1 < iSrpc; iSrpc--) {
            if (!predicate.invoke(Integer.valueOf(iArr[iSrpc])).booleanValue()) {
                return pnh(iArr, iSrpc + 1);
            }
        }
        return kotlin.collections.ni7.a9();
    }

    public static final void hkfy(@InterfaceC7396q char[] cArr) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        if (cArr.length > 1) {
            kotlin.collections.kja0.m28(cArr);
            np(cArr);
        }
    }

    public static final int hli(@InterfaceC7396q int[] iArr, @InterfaceC7396q cyoe.x2<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (predicate.invoke(Integer.valueOf(iArr[length])).booleanValue()) {
                    return length;
                }
                if (i2 < 0) {
                    break;
                }
                length = i2;
            }
        }
        return -1;
    }

    @InterfaceC7396q
    public static final List<Byte> hm43(@InterfaceC7396q byte[] bArr, @InterfaceC7396q kotlin.ranges.x2 indices) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(indices, "indices");
        return indices.isEmpty() ? kotlin.collections.ni7.a9() : kotlin.collections.kja0.n7h(kotlin.collections.kja0.zkd(bArr, indices.mo2951k().intValue(), indices.zy().intValue() + 1));
    }

    @InterfaceC7396q
    public static final float[] hm6(@InterfaceC7396q float[] fArr) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        if (fArr.length == 0) {
            return fArr;
        }
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        kotlin.jvm.internal.d2ok.kja0(fArrCopyOf, "copyOf(this, size)");
        kotlin.collections.kja0.erbd(fArrCopyOf);
        return fArrCopyOf;
    }

    public static final <R> R hm7(@InterfaceC7396q byte[] bArr, R r2, @InterfaceC7396q cyoe.cdj<? super Integer, ? super Byte, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        for (int iVl = vl(bArr); iVl >= 0; iVl--) {
            r2 = operation.invoke(Integer.valueOf(iVl), Byte.valueOf(bArr[iVl]), r2);
        }
        return r2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC7396q
    public static final <K, V, M extends Map<? super K, List<V>>> M hm78(@InterfaceC7396q int[] iArr, @InterfaceC7396q M destination, @InterfaceC7396q cyoe.x2<? super Integer, ? extends K> keySelector, @InterfaceC7396q cyoe.x2<? super Integer, ? extends V> valueTransform) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(keySelector, "keySelector");
        kotlin.jvm.internal.d2ok.m23075h(valueTransform, "valueTransform");
        for (int i2 : iArr) {
            K kInvoke = keySelector.invoke(Integer.valueOf(i2));
            Object arrayList = destination.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(valueTransform.invoke(Integer.valueOf(i2)));
        }
        return destination;
    }

    public static int hmvj(@InterfaceC7396q long[] jArr) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        return jArr.length - 1;
    }

    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final Integer hn4z(@InterfaceC7396q int[] iArr, @InterfaceC7396q cyoe.cdj<? super Integer, ? super Integer, ? super Integer, Integer> operation) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (iArr.length == 0) {
            return null;
        }
        int iIntValue = iArr[0];
        n5r1 it = new kotlin.ranges.x2(1, srpc(iArr)).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            iIntValue = operation.invoke(Integer.valueOf(iNextInt), Integer.valueOf(iIntValue), Integer.valueOf(iArr[iNextInt])).intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    @kotlin.yz(version = "1.4")
    public static final void hohe(@InterfaceC7396q boolean[] zArr) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        loce(zArr, AbstractC6332g.Default);
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <R> R hop(long[] jArr, Comparator<? super R> comparator, cyoe.x2<? super Long, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Long.valueOf(jArr[0]));
        n5r1 it = new kotlin.ranges.x2(1, hmvj(jArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Long.valueOf(jArr[it.nextInt()]));
            if (comparator.compare(rInvoke, rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC7396q
    public static final <T> List<T> hql(@InterfaceC7396q T[] tArr) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        return (List) xn(tArr, new ArrayList());
    }

    @InterfaceC7396q
    public static final List<Byte> hs6(@InterfaceC7396q byte[] bArr) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        return a9.wr(fs9(bArr));
    }

    @InterfaceC7396q
    public static final <R, V> List<V> hsg(@InterfaceC7396q char[] cArr, @InterfaceC7396q Iterable<? extends R> other, @InterfaceC7396q InterfaceC5979h<? super Character, ? super R, ? extends V> transform) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        int length = cArr.length;
        ArrayList arrayList = new ArrayList(Math.min(kotlin.collections.fu4.vyq(other, 10), length));
        int i2 = 0;
        for (R r2 : other) {
            if (i2 >= length) {
                break;
            }
            arrayList.add(transform.invoke(Character.valueOf(cArr[i2]), r2));
            i2++;
        }
        return arrayList;
    }

    public static final void ht(@InterfaceC7396q double[] dArr, @InterfaceC7396q InterfaceC5979h<? super Integer, ? super Double, was> action) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(action, "action");
        int length = dArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            action.invoke(Integer.valueOf(i3), Double.valueOf(dArr[i2]));
            i2++;
            i3++;
        }
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final List<Integer> huhj(int[] iArr, cyoe.cdj<? super Integer, ? super Integer, ? super Integer, Integer> operation) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (iArr.length == 0) {
            return kotlin.collections.ni7.a9();
        }
        int iIntValue = iArr[0];
        ArrayList arrayList = new ArrayList(iArr.length);
        arrayList.add(Integer.valueOf(iIntValue));
        int length = iArr.length;
        for (int i2 = 1; i2 < length; i2++) {
            iIntValue = operation.invoke(Integer.valueOf(i2), Integer.valueOf(iIntValue), Integer.valueOf(iArr[i2])).intValue();
            arrayList.add(Integer.valueOf(iIntValue));
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final char[] husj(@InterfaceC7396q char[] cArr) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        if (cArr.length == 0) {
            return cArr;
        }
        char[] cArr2 = new char[cArr.length];
        int iJ59a = j59a(cArr);
        n5r1 it = new kotlin.ranges.x2(0, iJ59a).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            cArr2[iJ59a - iNextInt] = cArr[iNextInt];
        }
        return cArr2;
    }

    @kotlin.hyr
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @InterfaceC6769y(name = "flatMapIndexedIterableTo")
    private static final <R, C extends Collection<? super R>> C hut(short[] sArr, C destination, InterfaceC5979h<? super Integer, ? super Short, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        int length = sArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            C6163t.zp(destination, transform.invoke(Integer.valueOf(i3), Short.valueOf(sArr[i2])));
            i2++;
            i3++;
        }
        return destination;
    }

    @InterfaceC6234g
    private static final boolean huy(boolean[] zArr) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        return zArr[4];
    }

    @InterfaceC7396q
    public static final List<Integer> hw(@InterfaceC7396q int[] iArr, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        if (i2 >= 0) {
            return pnh(iArr, kotlin.ranges.fn3e.fn3e(iArr.length - i2, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
    }

    @InterfaceC7396q
    public static final List<Byte> hwpi(@InterfaceC7396q byte[] bArr) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b2 : bArr) {
            arrayList.add(Byte.valueOf(b2));
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final <V> List<V> hwy(@InterfaceC7396q byte[] bArr, @InterfaceC7396q byte[] other, @InterfaceC7396q InterfaceC5979h<? super Byte, ? super Byte, ? extends V> transform) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        int iMin = Math.min(bArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i2 = 0; i2 < iMin; i2++) {
            arrayList.add(transform.invoke(Byte.valueOf(bArr[i2]), Byte.valueOf(other[i2])));
        }
        return arrayList;
    }

    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final <T> T hx(@InterfaceC7396q T[] tArr, @InterfaceC7396q Comparator<? super T> comparator) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        if (tArr.length == 0) {
            return null;
        }
        T t2 = tArr[0];
        n5r1 it = new kotlin.ranges.x2(1, gjp(tArr)).iterator();
        while (it.hasNext()) {
            T t3 = tArr[it.nextInt()];
            if (comparator.compare(t2, t3) < 0) {
                t2 = t3;
            }
        }
        return t2;
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final <T> T hx5d(@InterfaceC7396q T[] tArr, @InterfaceC7396q AbstractC6332g random) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(random, "random");
        if (tArr.length == 0) {
            return null;
        }
        return tArr[random.nextInt(tArr.length)];
    }

    @InterfaceC7396q
    public static final <T, R> List<R> hxtt(@InterfaceC7396q T[] tArr, @InterfaceC7396q cyoe.x2<? super T, ? extends R> transform) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        ArrayList arrayList = new ArrayList(tArr.length);
        for (T t2 : tArr) {
            arrayList.add(transform.invoke(t2));
        }
        return arrayList;
    }

    @InterfaceC6234g
    private static final <T> boolean hze4(T[] tArr) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        return !(tArr.length == 0);
    }

    @InterfaceC6234g
    private static final byte hzl(byte[] bArr) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        return bArr[1];
    }

    @InterfaceC7396q
    public static final <T, K, M extends Map<? super K, ? super T>> M i0(@InterfaceC7396q T[] tArr, @InterfaceC7396q M destination, @InterfaceC7396q cyoe.x2<? super T, ? extends K> keySelector) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(keySelector, "keySelector");
        for (T t2 : tArr) {
            destination.put(keySelector.invoke(t2), t2);
        }
        return destination;
    }

    public static boolean i03a(@InterfaceC7396q int[] iArr, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        return wj7e(iArr, i2) >= 0;
    }

    @InterfaceC7396q
    public static final List<Float> i05(@InterfaceC7396q float[] fArr) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        if (fArr.length == 0) {
            return kotlin.collections.ni7.a9();
        }
        List<Float> listZht = zht(fArr);
        jk.vep5(listZht);
        return listZht;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final <R> List<R> i0fv(float[] fArr, R r2, cyoe.cdj<? super Integer, ? super R, ? super Float, ? extends R> operation) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (fArr.length == 0) {
            return kotlin.collections.zurt.ld6(r2);
        }
        ArrayList arrayList = new ArrayList(fArr.length + 1);
        arrayList.add(r2);
        int length = fArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            r2 = operation.invoke(Integer.valueOf(i2), r2, Float.valueOf(fArr[i2]));
            arrayList.add(r2);
        }
        return arrayList;
    }

    public static final boolean i0z(@InterfaceC7396q double[] dArr, @InterfaceC7396q cyoe.x2<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (double d2 : dArr) {
            if (predicate.invoke(Double.valueOf(d2)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @InterfaceC7396q
    public static final List<Short> i1r(@InterfaceC7396q short[] sArr) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        ArrayList arrayList = new ArrayList(sArr.length);
        for (short s2 : sArr) {
            arrayList.add(Short.valueOf(s2));
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final List<Integer> i2(@InterfaceC7396q int[] iArr, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
        }
        if (i2 == 0) {
            return kotlin.collections.ni7.a9();
        }
        int length = iArr.length;
        if (i2 >= length) {
            return bgz(iArr);
        }
        if (i2 == 1) {
            return kotlin.collections.zurt.ld6(Integer.valueOf(iArr[length - 1]));
        }
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = length - i2; i3 < length; i3++) {
            arrayList.add(Integer.valueOf(iArr[i3]));
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final Set<Integer> i2en(@InterfaceC7396q int[] iArr, @InterfaceC7396q Iterable<Integer> other) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        Set<Integer> setGvu = gvu(iArr);
        C6163t.vq(setGvu, other);
        return setGvu;
    }

    @InterfaceC7396q
    public static final <R, C extends Collection<? super R>> C i49(@InterfaceC7396q char[] cArr, @InterfaceC7396q C destination, @InterfaceC7396q cyoe.x2<? super Character, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        for (char c2 : cArr) {
            C6163t.zp(destination, transform.invoke(Character.valueOf(c2)));
        }
        return destination;
    }

    @InterfaceC6234g
    private static final int i4w(double[] dArr) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        return dArr.length;
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @kotlin.hyr
    @InterfaceC6234g
    @kotlin.yz(version = "1.5")
    @InterfaceC6769y(name = "sumOfULong")
    private static final long i51(short[] sArr, cyoe.x2<? super Short, ikck> selector) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        long jLd6 = ikck.ld6(0L);
        for (short s2 : sArr) {
            jLd6 = ikck.ld6(jLd6 + selector.invoke(Short.valueOf(s2)).a98o());
        }
        return jLd6;
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final Float i55(float[] fArr) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        return vqy(fArr, AbstractC6332g.Default);
    }

    @InterfaceC7396q
    public static final char[] i5c(@InterfaceC7396q char[] cArr, @InterfaceC7396q kotlin.ranges.x2 indices) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(indices, "indices");
        return indices.isEmpty() ? new char[0] : kotlin.collections.kja0.bz2(cArr, indices.mo2951k().intValue(), indices.zy().intValue() + 1);
    }

    @InterfaceC7396q
    public static final <T> List<T> i6(@InterfaceC7396q T[] tArr, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
        }
        if (i2 == 0) {
            return kotlin.collections.ni7.a9();
        }
        if (i2 >= tArr.length) {
            return vyee(tArr);
        }
        if (i2 == 1) {
            return kotlin.collections.zurt.ld6(tArr[0]);
        }
        ArrayList arrayList = new ArrayList(i2);
        int i3 = 0;
        for (T t2 : tArr) {
            arrayList.add(t2);
            i3++;
            if (i3 == i2) {
                break;
            }
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final List<Short> i7(@InterfaceC7396q short[] sArr, @InterfaceC7396q cyoe.x2<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z2 = false;
        for (short s2 : sArr) {
            if (z2) {
                arrayList.add(Short.valueOf(s2));
            } else if (!predicate.invoke(Short.valueOf(s2)).booleanValue()) {
                arrayList.add(Short.valueOf(s2));
                z2 = true;
            }
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final List<Float> i7x(@InterfaceC7396q float[] fArr, @InterfaceC7396q Iterable<Integer> indices) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(indices, "indices");
        int iVyq = kotlin.collections.fu4.vyq(indices, 10);
        if (iVyq == 0) {
            return kotlin.collections.ni7.a9();
        }
        ArrayList arrayList = new ArrayList(iVyq);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(Float.valueOf(fArr[it.next().intValue()]));
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final <K, V> Map<K, V> i8(@InterfaceC7396q byte[] bArr, @InterfaceC7396q cyoe.x2<? super Byte, ? extends C6227f<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.fn3e.fn3e(C6140e.m22479p(bArr.length), 16));
        for (byte b2 : bArr) {
            C6227f<? extends K, ? extends V> c6227fInvoke = transform.invoke(Byte.valueOf(b2));
            linkedHashMap.put(c6227fInvoke.getFirst(), c6227fInvoke.getSecond());
        }
        return linkedHashMap;
    }

    public static long i8fu(@InterfaceC7396q long[] jArr) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        if (jArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return jArr[0];
    }

    public static final int i8gn(@InterfaceC7396q float[] fArr, @InterfaceC7396q cyoe.x2<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        int i2 = 0;
        for (float f2 : fArr) {
            if (predicate.invoke(Float.valueOf(f2)).booleanValue()) {
                i2++;
            }
        }
        return i2;
    }

    @InterfaceC7395n
    public static final Byte i9(@InterfaceC7396q byte[] bArr, @InterfaceC7396q cyoe.x2<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (byte b2 : bArr) {
            if (predicate.invoke(Byte.valueOf(b2)).booleanValue()) {
                return Byte.valueOf(b2);
            }
        }
        return null;
    }

    @InterfaceC7396q
    public static final List<Byte> i97(@InterfaceC7396q byte[] bArr, @InterfaceC7396q Iterable<Integer> indices) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(indices, "indices");
        int iVyq = kotlin.collections.fu4.vyq(indices, 10);
        if (iVyq == 0) {
            return kotlin.collections.ni7.a9();
        }
        ArrayList arrayList = new ArrayList(iVyq);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(Byte.valueOf(bArr[it.next().intValue()]));
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final Set<Short> i99y(@InterfaceC7396q short[] sArr, @InterfaceC7396q Iterable<Short> other) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        Set<Short> setFxq0 = fxq0(sArr);
        C6163t.vq(setFxq0, other);
        return setFxq0;
    }

    public static final boolean ia(@InterfaceC7396q boolean[] zArr, @InterfaceC7396q cyoe.x2<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (boolean z2 : zArr) {
            if (predicate.invoke(Boolean.valueOf(z2)).booleanValue()) {
                return z2;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final int iby(@InterfaceC7396q byte[] bArr, @InterfaceC7396q cyoe.x2<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        int i2 = 0;
        for (byte b2 : bArr) {
            if (predicate.invoke(Byte.valueOf(b2)).booleanValue()) {
                i2++;
            }
        }
        return i2;
    }

    @InterfaceC7396q
    public static final <T> Set<T> icp(@InterfaceC7396q T[] tArr) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        return (Set) mp7a(tArr, new LinkedHashSet(C6140e.m22479p(tArr.length)));
    }

    @InterfaceC7396q
    public static <T> List<T> id(@InterfaceC7396q T[] tArr, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        if (i2 >= 0) {
            return bb1(tArr, kotlin.ranges.fn3e.fn3e(tArr.length - i2, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <R> R idkz(int[] iArr, Comparator<? super R> comparator, cyoe.x2<? super Integer, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Integer.valueOf(iArr[0]));
        n5r1 it = new kotlin.ranges.x2(1, srpc(iArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Integer.valueOf(iArr[it.nextInt()]));
            if (comparator.compare(rInvoke, rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC7396q
    public static final byte[] idln(@InterfaceC7396q byte[] bArr) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        if (bArr.length == 0) {
            return bArr;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        kotlin.jvm.internal.d2ok.kja0(bArrCopyOf, "copyOf(this, size)");
        n0wh(bArrCopyOf);
        return bArrCopyOf;
    }

    public static final boolean ie(@InterfaceC7396q byte[] bArr, @InterfaceC7396q cyoe.x2<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (byte b2 : bArr) {
            if (!predicate.invoke(Byte.valueOf(b2)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: if, reason: not valid java name */
    public static final <R, C extends Collection<? super R>> C m28274if(@InterfaceC7396q char[] cArr, @InterfaceC7396q C destination, @InterfaceC7396q cyoe.x2<? super Character, ? extends R> transform) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        for (char c2 : cArr) {
            destination.add(transform.invoke(Character.valueOf(c2)));
        }
        return destination;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <R extends Comparable<? super R>> R ifc(char[] cArr, cyoe.x2<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Character.valueOf(cArr[0]));
        n5r1 it = new kotlin.ranges.x2(1, j59a(cArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Character.valueOf(cArr[it.nextInt()]));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC7396q
    public static final List<Short> ifu(@InterfaceC7396q short[] sArr, @InterfaceC7396q kotlin.ranges.x2 indices) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(indices, "indices");
        return indices.isEmpty() ? kotlin.collections.ni7.a9() : kotlin.collections.kja0.fn3e(kotlin.collections.kja0.cv06(sArr, indices.mo2951k().intValue(), indices.zy().intValue() + 1));
    }

    @InterfaceC7395n
    public static final Short ig(@InterfaceC7396q short[] sArr, @InterfaceC7396q cyoe.x2<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        boolean z2 = false;
        Short shValueOf = null;
        for (short s2 : sArr) {
            if (predicate.invoke(Short.valueOf(s2)).booleanValue()) {
                if (z2) {
                    return null;
                }
                shValueOf = Short.valueOf(s2);
                z2 = true;
            }
        }
        if (z2) {
            return shValueOf;
        }
        return null;
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @kotlin.hyr
    @InterfaceC6234g
    @kotlin.yz(version = "1.5")
    @InterfaceC6769y(name = "sumOfULong")
    private static final long igdj(byte[] bArr, cyoe.x2<? super Byte, ikck> selector) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        long jLd6 = ikck.ld6(0L);
        for (byte b2 : bArr) {
            jLd6 = ikck.ld6(jLd6 + selector.invoke(Byte.valueOf(b2)).a98o());
        }
        return jLd6;
    }

    @kotlin.yz(version = "1.7")
    @InterfaceC6769y(name = "maxByOrThrow")
    public static final <R extends Comparable<? super R>> long igu(@InterfaceC7396q long[] jArr, @InterfaceC7396q cyoe.x2<? super Long, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        long j2 = jArr[0];
        int iHmvj = hmvj(jArr);
        if (iHmvj == 0) {
            return j2;
        }
        R rInvoke = selector.invoke(Long.valueOf(j2));
        n5r1 it = new kotlin.ranges.x2(1, iHmvj).iterator();
        while (it.hasNext()) {
            long j3 = jArr[it.nextInt()];
            R rInvoke2 = selector.invoke(Long.valueOf(j3));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
                j2 = j3;
            }
        }
        return j2;
    }

    @InterfaceC7396q
    public static final List<Double> igv(@InterfaceC7396q double[] dArr, @InterfaceC7396q cyoe.x2<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (double d2 : dArr) {
            if (!predicate.invoke(Double.valueOf(d2)).booleanValue()) {
                break;
            }
            arrayList.add(Double.valueOf(d2));
        }
        return arrayList;
    }

    public static boolean ih(@InterfaceC7396q byte[] bArr, byte b2) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        return m7(bArr, b2) >= 0;
    }

    @InterfaceC6234g
    private static final boolean ihvk(double[] dArr) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        return dArr.length == 0;
    }

    @InterfaceC7396q
    @kotlin.yz(version = "1.1")
    public static final <T, K> d2ok<T, K> ihy(@InterfaceC7396q T[] tArr, @InterfaceC7396q cyoe.x2<? super T, ? extends K> keySelector) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(keySelector, "keySelector");
        return new t8r(tArr, keySelector);
    }

    @InterfaceC7396q
    public static final List<Double> iip(@InterfaceC7396q double[] dArr, @InterfaceC7396q kotlin.ranges.x2 indices) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(indices, "indices");
        return indices.isEmpty() ? kotlin.collections.ni7.a9() : kotlin.collections.kja0.m22513h(kotlin.collections.kja0.uj2j(dArr, indices.mo2951k().intValue(), indices.zy().intValue() + 1));
    }

    @InterfaceC7396q
    public static final String ik8(@InterfaceC7396q float[] fArr, @InterfaceC7396q CharSequence separator, @InterfaceC7396q CharSequence prefix, @InterfaceC7396q CharSequence postfix, int i2, @InterfaceC7396q CharSequence truncated, @InterfaceC7395n cyoe.x2<? super Float, ? extends CharSequence> x2Var) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(separator, "separator");
        kotlin.jvm.internal.d2ok.m23075h(prefix, "prefix");
        kotlin.jvm.internal.d2ok.m23075h(postfix, "postfix");
        kotlin.jvm.internal.d2ok.m23075h(truncated, "truncated");
        String string = ((StringBuilder) kncy(fArr, new StringBuilder(), separator, prefix, postfix, i2, truncated, x2Var)).toString();
        kotlin.jvm.internal.d2ok.kja0(string, "joinTo(StringBuilder(), …ed, transform).toString()");
        return string;
    }

    @InterfaceC7396q
    public static final List<Integer> iks(@InterfaceC7396q int[] iArr, @InterfaceC7396q cyoe.x2<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z2 = false;
        for (int i2 : iArr) {
            if (z2) {
                arrayList.add(Integer.valueOf(i2));
            } else if (!predicate.invoke(Integer.valueOf(i2)).booleanValue()) {
                arrayList.add(Integer.valueOf(i2));
                z2 = true;
            }
        }
        return arrayList;
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final <R> List<R> il(double[] dArr, R r2, cyoe.cdj<? super Integer, ? super R, ? super Double, ? extends R> operation) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (dArr.length == 0) {
            return kotlin.collections.zurt.ld6(r2);
        }
        ArrayList arrayList = new ArrayList(dArr.length + 1);
        arrayList.add(r2);
        int length = dArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            r2 = operation.invoke(Integer.valueOf(i2), r2, Double.valueOf(dArr[i2]));
            arrayList.add(r2);
        }
        return arrayList;
    }

    public static final int im(@InterfaceC7396q int[] iArr, @InterfaceC7396q InterfaceC5979h<? super Integer, ? super Integer, Integer> operation) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (iArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        int iIntValue = iArr[0];
        n5r1 it = new kotlin.ranges.x2(1, srpc(iArr)).iterator();
        while (it.hasNext()) {
            iIntValue = operation.invoke(Integer.valueOf(iIntValue), Integer.valueOf(iArr[it.nextInt()])).intValue();
        }
        return iIntValue;
    }

    @kotlin.yz(version = "1.4")
    public static final void im8v(@InterfaceC7396q char[] cArr) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        o6t(cArr, AbstractC6332g.Default);
    }

    @InterfaceC7396q
    public static final List<Boolean> imy(@InterfaceC7396q boolean[] zArr, @InterfaceC7396q Comparator<? super Boolean> comparator) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        Boolean[] boolArrX3b = kotlin.collections.kja0.x3b(zArr);
        kotlin.collections.kja0.izu(boolArrX3b, comparator);
        return kotlin.collections.kja0.m22514i(boolArrX3b);
    }

    @InterfaceC7396q
    public static final <C extends Collection<? super Boolean>> C in(@InterfaceC7396q boolean[] zArr, @InterfaceC7396q C destination, @InterfaceC7396q cyoe.x2<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (boolean z2 : zArr) {
            if (predicate.invoke(Boolean.valueOf(z2)).booleanValue()) {
                destination.add(Boolean.valueOf(z2));
            }
        }
        return destination;
    }

    @InterfaceC7396q
    public static short[] io(@InterfaceC7396q short[] sArr, @InterfaceC7396q Collection<Integer> indices) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(indices, "indices");
        short[] sArr2 = new short[indices.size()];
        Iterator<Integer> it = indices.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            sArr2[i2] = sArr[it.next().intValue()];
            i2++;
        }
        return sArr2;
    }

    public static <T> int iobz(@InterfaceC7396q T[] tArr, T t2) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        int i2 = 0;
        if (t2 == null) {
            int length = tArr.length;
            while (i2 < length) {
                if (tArr[i2] == null) {
                    return i2;
                }
                i2++;
            }
            return -1;
        }
        int length2 = tArr.length;
        while (i2 < length2) {
            if (kotlin.jvm.internal.d2ok.f7l8(t2, tArr[i2])) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    @InterfaceC7396q
    public static final float[] ioq(@InterfaceC7396q float[] fArr) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        if (fArr.length == 0) {
            return fArr;
        }
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        kotlin.jvm.internal.d2ok.kja0(fArrCopyOf, "copyOf(this, size)");
        l3h(fArrCopyOf);
        return fArrCopyOf;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final Float ioq6(short[] sArr, cyoe.x2<? super Short, Float> selector) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        float fFloatValue = selector.invoke(Short.valueOf(sArr[0])).floatValue();
        n5r1 it = new kotlin.ranges.x2(1, orxw(sArr)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, selector.invoke(Short.valueOf(sArr[it.nextInt()])).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @InterfaceC6234g
    private static final boolean ip4r(boolean[] zArr, int i2, cyoe.x2<? super Integer, Boolean> defaultValue) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(defaultValue, "defaultValue");
        return (i2 < 0 || i2 > rl(zArr)) ? defaultValue.invoke(Integer.valueOf(i2)).booleanValue() : zArr[i2];
    }

    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final Short iq(@InterfaceC7396q short[] sArr) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        if (sArr.length == 0) {
            return null;
        }
        short s2 = sArr[0];
        n5r1 it = new kotlin.ranges.x2(1, orxw(sArr)).iterator();
        while (it.hasNext()) {
            short s3 = sArr[it.nextInt()];
            if (s2 < s3) {
                s2 = s3;
            }
        }
        return Short.valueOf(s2);
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final Byte iq3(byte[] bArr) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        return gk4(bArr, AbstractC6332g.Default);
    }

    @InterfaceC6234g
    private static final long iqz(long[] jArr) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        return jArr[4];
    }

    @InterfaceC6234g
    private static final long irh(long[] jArr) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        return jArr[0];
    }

    @InterfaceC7396q
    public static final List<Character> iroj(@InterfaceC7396q char[] cArr, @InterfaceC7396q cyoe.x2<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (char c2 : cArr) {
            if (!predicate.invoke(Character.valueOf(c2)).booleanValue()) {
                arrayList.add(Character.valueOf(c2));
            }
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final kotlin.sequences.qrj<Float> is(@InterfaceC7396q float[] fArr) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        return fArr.length == 0 ? kotlin.sequences.t8r.f7l8() : new kja0(fArr);
    }

    @kotlin.yz(version = "1.7")
    @InterfaceC6769y(name = "maxByOrThrow")
    public static final <R extends Comparable<? super R>> double iu(@InterfaceC7396q double[] dArr, @InterfaceC7396q cyoe.x2<? super Double, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        double d2 = dArr[0];
        int iF14 = f14(dArr);
        if (iF14 == 0) {
            return d2;
        }
        R rInvoke = selector.invoke(Double.valueOf(d2));
        n5r1 it = new kotlin.ranges.x2(1, iF14).iterator();
        while (it.hasNext()) {
            double d4 = dArr[it.nextInt()];
            R rInvoke2 = selector.invoke(Double.valueOf(d4));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
                d2 = d4;
            }
        }
        return d2;
    }

    @InterfaceC7396q
    public static final Set<Long> iuh(@InterfaceC7396q long[] jArr) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        int length = jArr.length;
        return length != 0 ? length != 1 ? (Set) gb1(jArr, new LinkedHashSet(C6140e.m22479p(jArr.length))) : i1.m22499g(Long.valueOf(jArr[0])) : a98o.ld6();
    }

    @InterfaceC7396q
    public static final List<Short> ivf(@InterfaceC7396q short[] sArr, @InterfaceC7396q cyoe.x2<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (int iOrxw = orxw(sArr); -1 < iOrxw; iOrxw--) {
            if (!predicate.invoke(Short.valueOf(sArr[iOrxw])).booleanValue()) {
                return fv(sArr, iOrxw + 1);
            }
        }
        return l8(sArr);
    }

    public static final double ivg(@InterfaceC7396q double[] dArr, @InterfaceC7396q cyoe.x2<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        Double dValueOf = null;
        boolean z2 = false;
        for (double d2 : dArr) {
            if (predicate.invoke(Double.valueOf(d2)).booleanValue()) {
                if (z2) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                dValueOf = Double.valueOf(d2);
                z2 = true;
            }
        }
        if (!z2) {
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        kotlin.jvm.internal.d2ok.n7h(dValueOf, "null cannot be cast to non-null type kotlin.Double");
        return dValueOf.doubleValue();
    }

    @InterfaceC6234g
    private static final float ivs(float[] fArr) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        return fArr[2];
    }

    @InterfaceC7396q
    public static final <R, C extends Collection<? super R>> C ivv9(@InterfaceC7396q double[] dArr, @InterfaceC7396q C destination, @InterfaceC7396q cyoe.x2<? super Double, ? extends R> transform) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        for (double d2 : dArr) {
            destination.add(transform.invoke(Double.valueOf(d2)));
        }
        return destination;
    }

    @InterfaceC7396q
    public static final Iterable<Character> iw(@InterfaceC7396q char[] cArr) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        return cArr.length == 0 ? kotlin.collections.ni7.a9() : new s(cArr);
    }

    @InterfaceC7396q
    public static final List<Character> iw2p(@InterfaceC7396q char[] cArr) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        char[] cArrCopyOf = Arrays.copyOf(cArr, cArr.length);
        kotlin.jvm.internal.d2ok.kja0(cArrCopyOf, "copyOf(this, size)");
        kotlin.collections.kja0.m28(cArrCopyOf);
        return bewm(cArrCopyOf);
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final double iwp(long[] jArr, cyoe.x2<? super Long, Double> selector) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(Long.valueOf(jArr[0])).doubleValue();
        n5r1 it = new kotlin.ranges.x2(1, hmvj(jArr)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, selector.invoke(Long.valueOf(jArr[it.nextInt()])).doubleValue());
        }
        return dDoubleValue;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <R extends Comparable<? super R>> R iws(float[] fArr, cyoe.x2<? super Float, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Float.valueOf(fArr[0]));
        n5r1 it = new kotlin.ranges.x2(1, gto(fArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Float.valueOf(fArr[it.nextInt()]));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC7396q
    public static final Set<Character> iy(@InterfaceC7396q char[] cArr, @InterfaceC7396q Iterable<Character> other) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        Set<Character> setH9 = h9(cArr);
        C6163t.zsr0(setH9, other);
        return setH9;
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @kotlin.hyr
    @InterfaceC6234g
    @kotlin.yz(version = "1.5")
    @InterfaceC6769y(name = "sumOfUInt")
    private static final int iya(int[] iArr, cyoe.x2<? super Integer, gyi> selector) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        int iLd6 = gyi.ld6(0);
        for (int i2 : iArr) {
            iLd6 = gyi.ld6(iLd6 + selector.invoke(Integer.valueOf(i2)).a98o());
        }
        return iLd6;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final List<Float> iz1i(float[] fArr, InterfaceC5979h<? super Float, ? super Float, Float> operation) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (fArr.length == 0) {
            return kotlin.collections.ni7.a9();
        }
        float fFloatValue = fArr[0];
        ArrayList arrayList = new ArrayList(fArr.length);
        arrayList.add(Float.valueOf(fFloatValue));
        int length = fArr.length;
        for (int i2 = 1; i2 < length; i2++) {
            fFloatValue = operation.invoke(Float.valueOf(fFloatValue), Float.valueOf(fArr[i2])).floatValue();
            arrayList.add(Float.valueOf(fFloatValue));
        }
        return arrayList;
    }

    @kotlin.hyr
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @InterfaceC6769y(name = "sumOfInt")
    private static final int izd(boolean[] zArr, cyoe.x2<? super Boolean, Integer> selector) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        int iIntValue = 0;
        for (boolean z2 : zArr) {
            iIntValue += selector.invoke(Boolean.valueOf(z2)).intValue();
        }
        return iIntValue;
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final Boolean j0(@InterfaceC7396q boolean[] zArr, @InterfaceC7396q InterfaceC5979h<? super Boolean, ? super Boolean, Boolean> operation) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (zArr.length == 0) {
            return null;
        }
        boolean zBooleanValue = zArr[0];
        n5r1 it = new kotlin.ranges.x2(1, rl(zArr)).iterator();
        while (it.hasNext()) {
            zBooleanValue = operation.invoke(Boolean.valueOf(zBooleanValue), Boolean.valueOf(zArr[it.nextInt()])).booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    @InterfaceC7396q
    public static final <K> Map<K, Double> j1s(@InterfaceC7396q double[] dArr, @InterfaceC7396q cyoe.x2<? super Double, ? extends K> keySelector) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.fn3e.fn3e(C6140e.m22479p(dArr.length), 16));
        for (double d2 : dArr) {
            linkedHashMap.put(keySelector.invoke(Double.valueOf(d2)), Double.valueOf(d2));
        }
        return linkedHashMap;
    }

    @kotlin.yz(version = "1.7")
    @InterfaceC6769y(name = "maxOrThrow")
    public static final long j2(@InterfaceC7396q long[] jArr) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        long j2 = jArr[0];
        n5r1 it = new kotlin.ranges.x2(1, hmvj(jArr)).iterator();
        while (it.hasNext()) {
            long j3 = jArr[it.nextInt()];
            if (j2 < j3) {
                j2 = j3;
            }
        }
        return j2;
    }

    @InterfaceC7396q
    public static final kotlin.sequences.qrj<Boolean> j3px(@InterfaceC7396q boolean[] zArr) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        return zArr.length == 0 ? kotlin.sequences.t8r.f7l8() : new cdj(zArr);
    }

    @kotlin.yz(version = "1.3")
    public static final byte j5(@InterfaceC7396q byte[] bArr, @InterfaceC7396q AbstractC6332g random) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(random, "random");
        if (bArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return bArr[random.nextInt(bArr.length)];
    }

    public static final int j59a(@InterfaceC7396q char[] cArr) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        return cArr.length - 1;
    }

    public static final boolean j59y(@InterfaceC7396q char[] cArr) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        return cArr.length == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC7396q
    public static final <T, R, V> List<V> j5in(@InterfaceC7396q T[] tArr, @InterfaceC7396q Iterable<? extends R> other, @InterfaceC7396q InterfaceC5979h<? super T, ? super R, ? extends V> transform) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        int length = tArr.length;
        ArrayList arrayList = new ArrayList(Math.min(kotlin.collections.fu4.vyq(other, 10), length));
        int i2 = 0;
        for (R r2 : other) {
            if (i2 >= length) {
                break;
            }
            arrayList.add(transform.invoke(tArr[i2], r2));
            i2++;
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final List<Double> j60k(@InterfaceC7396q double[] dArr) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double d2 : dArr) {
            arrayList.add(Double.valueOf(d2));
        }
        return arrayList;
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final Integer j8wd(@InterfaceC7396q int[] iArr, @InterfaceC7396q AbstractC6332g random) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(random, "random");
        if (iArr.length == 0) {
            return null;
        }
        return Integer.valueOf(iArr[random.nextInt(iArr.length)]);
    }

    @InterfaceC7396q
    public static final List<Float> j9nl(@InterfaceC7396q float[] fArr, @InterfaceC7396q cyoe.x2<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z2 = false;
        for (float f2 : fArr) {
            if (z2) {
                arrayList.add(Float.valueOf(f2));
            } else if (!predicate.invoke(Float.valueOf(f2)).booleanValue()) {
                arrayList.add(Float.valueOf(f2));
                z2 = true;
            }
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final <K> Map<K, List<Boolean>> ja(@InterfaceC7396q boolean[] zArr, @InterfaceC7396q cyoe.x2<? super Boolean, ? extends K> keySelector) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (boolean z2 : zArr) {
            K kInvoke = keySelector.invoke(Boolean.valueOf(z2));
            Object arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(Boolean.valueOf(z2));
        }
        return linkedHashMap;
    }

    public static final boolean ja7(@InterfaceC7396q long[] jArr, @InterfaceC7396q cyoe.x2<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (long j2 : jArr) {
            if (predicate.invoke(Long.valueOf(j2)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @kotlin.yz(version = "1.7")
    @InterfaceC6769y(name = "minOrThrow")
    public static final float jad(@InterfaceC7396q Float[] fArr) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = fArr[0].floatValue();
        n5r1 it = new kotlin.ranges.x2(1, gjp(fArr)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, fArr[it.nextInt()].floatValue());
        }
        return fFloatValue;
    }

    @InterfaceC7396q
    public static final Set<Double> jar(@InterfaceC7396q double[] dArr, @InterfaceC7396q Iterable<Double> other) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        Set<Double> setQtn = qtn(dArr);
        C6163t.vq(setQtn, other);
        return setQtn;
    }

    @InterfaceC7396q
    public static final <T, R> List<C6227f<T, R>> jb(@InterfaceC7396q T[] tArr, @InterfaceC7396q Iterable<? extends R> other) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        int length = tArr.length;
        ArrayList arrayList = new ArrayList(Math.min(kotlin.collections.fu4.vyq(other, 10), length));
        int i2 = 0;
        for (R r2 : other) {
            if (i2 >= length) {
                break;
            }
            arrayList.add(kotlin.nmn5.m23230k(tArr[i2], r2));
            i2++;
        }
        return arrayList;
    }

    public static final <T> T jb7a(@InterfaceC7396q T[] tArr, @InterfaceC7396q cyoe.x2<? super T, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (T t2 : tArr) {
            if (predicate.invoke(t2).booleanValue()) {
                return t2;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <T, R> R jci(T[] tArr, Comparator<? super R> comparator, cyoe.x2<? super T, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(tArr[0]);
        n5r1 it = new kotlin.ranges.x2(1, gjp(tArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(tArr[it.nextInt()]);
            if (comparator.compare(rInvoke, rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC7396q
    public static final <T, K> List<T> jcwh(@InterfaceC7396q T[] tArr, @InterfaceC7396q cyoe.x2<? super T, ? extends K> selector) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (T t2 : tArr) {
            if (hashSet.add(selector.invoke(t2))) {
                arrayList.add(t2);
            }
        }
        return arrayList;
    }

    public static final <R> R je(@InterfaceC7396q char[] cArr, R r2, @InterfaceC7396q cyoe.cdj<? super Integer, ? super R, ? super Character, ? extends R> operation) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        int length = cArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            r2 = operation.invoke(Integer.valueOf(i3), r2, Character.valueOf(cArr[i2]));
            i2++;
            i3++;
        }
        return r2;
    }

    public static final <T> boolean je1q(@InterfaceC7396q T[] tArr, @InterfaceC7396q cyoe.x2<? super T, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (T t2 : tArr) {
            if (predicate.invoke(t2).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <R> R jej(double[] dArr, Comparator<? super R> comparator, cyoe.x2<? super Double, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Double.valueOf(dArr[0]));
        n5r1 it = new kotlin.ranges.x2(1, f14(dArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Double.valueOf(dArr[it.nextInt()]));
            if (comparator.compare(rInvoke, rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    public static final <R> R jek(@InterfaceC7396q int[] iArr, R r2, @InterfaceC7396q InterfaceC5979h<? super R, ? super Integer, ? extends R> operation) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        for (int i2 : iArr) {
            r2 = operation.invoke(r2, Integer.valueOf(i2));
        }
        return r2;
    }

    @InterfaceC6234g
    private static final float jerf(float[] fArr) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        return fArr[3];
    }

    @kotlin.yz(version = "1.7")
    @InterfaceC6769y(name = "maxByOrThrow")
    public static final <R extends Comparable<? super R>> int jf(@InterfaceC7396q int[] iArr, @InterfaceC7396q cyoe.x2<? super Integer, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        int i2 = iArr[0];
        int iSrpc = srpc(iArr);
        if (iSrpc == 0) {
            return i2;
        }
        R rInvoke = selector.invoke(Integer.valueOf(i2));
        n5r1 it = new kotlin.ranges.x2(1, iSrpc).iterator();
        while (it.hasNext()) {
            int i3 = iArr[it.nextInt()];
            R rInvoke2 = selector.invoke(Integer.valueOf(i3));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                i2 = i3;
                rInvoke = rInvoke2;
            }
        }
        return i2;
    }

    public static final float jf5c(@InterfaceC7396q float[] fArr, @InterfaceC7396q cyoe.x2<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        int length = fArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                float f2 = fArr[length];
                if (!predicate.invoke(Float.valueOf(f2)).booleanValue()) {
                    if (i2 < 0) {
                        break;
                    }
                    length = i2;
                } else {
                    return f2;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final <T> boolean jglj(@InterfaceC7396q T[] tArr, @InterfaceC7396q cyoe.x2<? super T, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (T t2 : tArr) {
            if (!predicate.invoke(t2).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @InterfaceC7396q
    public static final <C extends Collection<? super Double>> C jhn(@InterfaceC7396q double[] dArr, @InterfaceC7396q C destination, @InterfaceC7396q cyoe.x2<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (double d2 : dArr) {
            if (predicate.invoke(Double.valueOf(d2)).booleanValue()) {
                destination.add(Double.valueOf(d2));
            }
        }
        return destination;
    }

    @InterfaceC7396q
    public static byte[] ji83(@InterfaceC7396q byte[] bArr) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        if (bArr.length == 0) {
            return bArr;
        }
        byte[] bArr2 = new byte[bArr.length];
        int iVl = vl(bArr);
        n5r1 it = new kotlin.ranges.x2(0, iVl).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            bArr2[iVl - iNextInt] = bArr[iNextInt];
        }
        return bArr2;
    }

    public static final double jk2(@InterfaceC7396q double[] dArr, @InterfaceC7396q InterfaceC5979h<? super Double, ? super Double, Double> operation) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (dArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        double dDoubleValue = dArr[0];
        n5r1 it = new kotlin.ranges.x2(1, f14(dArr)).iterator();
        while (it.hasNext()) {
            dDoubleValue = operation.invoke(Double.valueOf(dDoubleValue), Double.valueOf(dArr[it.nextInt()])).doubleValue();
        }
        return dDoubleValue;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final float jk2b(long[] jArr, cyoe.x2<? super Long, Float> selector) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(Long.valueOf(jArr[0])).floatValue();
        n5r1 it = new kotlin.ranges.x2(1, hmvj(jArr)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, selector.invoke(Long.valueOf(jArr[it.nextInt()])).floatValue());
        }
        return fFloatValue;
    }

    @kotlin.yz(version = "1.4")
    public static final void jky(@InterfaceC7396q short[] sArr, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.collections.kja0.qla(sArr, i2, i3);
        c7j(sArr, i2, i3);
    }

    @InterfaceC7396q
    public static final <T> List<T> jl(@InterfaceC7396q T[] tArr) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        return a9.wr(icp(tArr));
    }

    @InterfaceC7396q
    public static final <V> List<V> jm(@InterfaceC7396q double[] dArr, @InterfaceC7396q double[] other, @InterfaceC7396q InterfaceC5979h<? super Double, ? super Double, ? extends V> transform) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        int iMin = Math.min(dArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i2 = 0; i2 < iMin; i2++) {
            arrayList.add(transform.invoke(Double.valueOf(dArr[i2]), Double.valueOf(other[i2])));
        }
        return arrayList;
    }

    public static final void jmz(@InterfaceC7396q int[] iArr, @InterfaceC7396q InterfaceC5979h<? super Integer, ? super Integer, was> action) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(action, "action");
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            action.invoke(Integer.valueOf(i3), Integer.valueOf(iArr[i2]));
            i2++;
            i3++;
        }
    }

    @InterfaceC6234g
    private static final boolean jn(char[] cArr) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        return cArr.length == 0;
    }

    @InterfaceC7396q
    public static final <T, R, C extends Collection<? super R>> C jo(@InterfaceC7396q T[] tArr, @InterfaceC7396q C destination, @InterfaceC7396q InterfaceC5979h<? super Integer, ? super T, ? extends R> transform) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        int length = tArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            destination.add(transform.invoke(Integer.valueOf(i3), tArr[i2]));
            i2++;
            i3++;
        }
        return destination;
    }

    public static final boolean jog(@InterfaceC7396q char[] cArr, @InterfaceC7396q cyoe.x2<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (char c2 : cArr) {
            if (!predicate.invoke(Character.valueOf(c2)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final Float jom(@InterfaceC7396q float[] fArr, @InterfaceC7396q InterfaceC5979h<? super Float, ? super Float, Float> operation) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (fArr.length == 0) {
            return null;
        }
        float fFloatValue = fArr[0];
        n5r1 it = new kotlin.ranges.x2(1, gto(fArr)).iterator();
        while (it.hasNext()) {
            fFloatValue = operation.invoke(Float.valueOf(fFloatValue), Float.valueOf(fArr[it.nextInt()])).floatValue();
        }
        return Float.valueOf(fFloatValue);
    }

    @InterfaceC7396q
    public static final <K, V, M extends Map<? super K, ? super V>> M jp(@InterfaceC7396q double[] dArr, @InterfaceC7396q M destination, @InterfaceC7396q cyoe.x2<? super Double, ? extends K> keySelector, @InterfaceC7396q cyoe.x2<? super Double, ? extends V> valueTransform) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(keySelector, "keySelector");
        kotlin.jvm.internal.d2ok.m23075h(valueTransform, "valueTransform");
        for (double d2 : dArr) {
            destination.put(keySelector.invoke(Double.valueOf(d2)), valueTransform.invoke(Double.valueOf(d2)));
        }
        return destination;
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final <S, T extends S> S jpkh(@InterfaceC7396q T[] tArr, @InterfaceC7396q InterfaceC5979h<? super T, ? super S, ? extends S> operation) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        int iGjp = gjp(tArr);
        if (iGjp < 0) {
            return null;
        }
        S sInvoke = (S) tArr[iGjp];
        for (int i2 = iGjp - 1; i2 >= 0; i2--) {
            sInvoke = operation.invoke((Object) tArr[i2], sInvoke);
        }
        return sInvoke;
    }

    public static short jqd(@InterfaceC7396q short[] sArr) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        int length = sArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return sArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final float jr(float[] fArr, cyoe.x2<? super Float, Float> selector) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(Float.valueOf(fArr[0])).floatValue();
        n5r1 it = new kotlin.ranges.x2(1, gto(fArr)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, selector.invoke(Float.valueOf(fArr[it.nextInt()])).floatValue());
        }
        return fFloatValue;
    }

    public static boolean jre(@InterfaceC7396q long[] jArr) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        return !(jArr.length == 0);
    }

    @InterfaceC7396q
    public static final <C extends Collection<? super Byte>> C jrla(@InterfaceC7396q byte[] bArr, @InterfaceC7396q C destination, @InterfaceC7396q cyoe.x2<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (byte b2 : bArr) {
            if (!predicate.invoke(Byte.valueOf(b2)).booleanValue()) {
                destination.add(Byte.valueOf(b2));
            }
        }
        return destination;
    }

    @InterfaceC7396q
    public static final <R> List<R> jswb(@InterfaceC7396q short[] sArr, @InterfaceC7396q cyoe.x2<? super Short, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (short s2 : sArr) {
            C6163t.zp(arrayList, transform.invoke(Short.valueOf(s2)));
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final List<Byte> jt(@InterfaceC7396q byte[] bArr, @InterfaceC7396q cyoe.x2<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (byte b2 : bArr) {
            if (!predicate.invoke(Byte.valueOf(b2)).booleanValue()) {
                break;
            }
            arrayList.add(Byte.valueOf(b2));
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final List<Boolean> jtf(@InterfaceC7396q boolean[] zArr) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean z2 : zArr) {
            arrayList.add(Boolean.valueOf(z2));
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final <R> List<R> ju(@InterfaceC7396q short[] sArr, @InterfaceC7396q InterfaceC5979h<? super Integer, ? super Short, ? extends R> transform) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        ArrayList arrayList = new ArrayList(sArr.length);
        int length = sArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            arrayList.add(transform.invoke(Integer.valueOf(i3), Short.valueOf(sArr[i2])));
            i2++;
            i3++;
        }
        return arrayList;
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final Integer jua8(@InterfaceC7396q int[] iArr, @InterfaceC7396q InterfaceC5979h<? super Integer, ? super Integer, Integer> operation) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        int iSrpc = srpc(iArr);
        if (iSrpc < 0) {
            return null;
        }
        int iIntValue = iArr[iSrpc];
        for (int i2 = iSrpc - 1; i2 >= 0; i2--) {
            iIntValue = operation.invoke(Integer.valueOf(iArr[i2]), Integer.valueOf(iIntValue)).intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    @InterfaceC7395n
    public static final Double jun(@InterfaceC7396q double[] dArr) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        if (dArr.length == 0) {
            return null;
        }
        return Double.valueOf(dArr[dArr.length - 1]);
    }

    @InterfaceC6234g
    private static final int jut(int[] iArr) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        return iArr[0];
    }

    @kotlin.hyr
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @InterfaceC6769y(name = "flatMapIndexedIterable")
    private static final <T, R> List<R> jute(T[] tArr, InterfaceC5979h<? super Integer, ? super T, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = tArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            C6163t.zp(arrayList, transform.invoke(Integer.valueOf(i3), tArr[i2]));
            i2++;
            i3++;
        }
        return arrayList;
    }

    public static final int jv24(@InterfaceC7396q byte[] bArr, @InterfaceC7396q cyoe.x2<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        int length = bArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (predicate.invoke(Byte.valueOf(bArr[i2])).booleanValue()) {
                return i2;
            }
        }
        return -1;
    }

    @InterfaceC7396q
    public static final <T> Set<T> jvci(@InterfaceC7396q T[] tArr, @InterfaceC7396q Iterable<? extends T> other) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        Set<T> setIcp = icp(tArr);
        C6163t.vq(setIcp, other);
        return setIcp;
    }

    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final Long jz7r(@InterfaceC7396q long[] jArr) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        if (jArr.length == 0) {
            return null;
        }
        long j2 = jArr[0];
        n5r1 it = new kotlin.ranges.x2(1, hmvj(jArr)).iterator();
        while (it.hasNext()) {
            long j3 = jArr[it.nextInt()];
            if (j2 > j3) {
                j2 = j3;
            }
        }
        return Long.valueOf(j2);
    }

    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final <R extends Comparable<? super R>> Boolean jzp(@InterfaceC7396q boolean[] zArr, @InterfaceC7396q cyoe.x2<? super Boolean, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        boolean z2 = zArr[0];
        int iRl = rl(zArr);
        if (iRl == 0) {
            return Boolean.valueOf(z2);
        }
        R rInvoke = selector.invoke(Boolean.valueOf(z2));
        n5r1 it = new kotlin.ranges.x2(1, iRl).iterator();
        while (it.hasNext()) {
            boolean z3 = zArr[it.nextInt()];
            R rInvoke2 = selector.invoke(Boolean.valueOf(z3));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                z2 = z3;
                rInvoke = rInvoke2;
            }
        }
        return Boolean.valueOf(z2);
    }

    public static final <T> void k0(@InterfaceC7396q T[] tArr) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        int length = (tArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int iGjp = gjp(tArr);
        n5r1 it = new kotlin.ranges.x2(0, length).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            T t2 = tArr[iNextInt];
            tArr[iNextInt] = tArr[iGjp];
            tArr[iGjp] = t2;
            iGjp--;
        }
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.5")
    private static final <T, R> R k0ir(T[] tArr, cyoe.x2<? super T, ? extends R> transform) {
        R rInvoke;
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        int length = tArr.length;
        int i2 = 0;
        while (true) {
            if (i2 < length) {
                rInvoke = transform.invoke(tArr[i2]);
                if (rInvoke != null) {
                    break;
                }
                i2++;
            } else {
                rInvoke = null;
                break;
            }
        }
        if (rInvoke != null) {
            return rInvoke;
        }
        throw new NoSuchElementException("No element of the array was transformed to a non-null value.");
    }

    @InterfaceC7396q
    public static final <K, V> Map<K, V> k2b8(@InterfaceC7396q char[] cArr, @InterfaceC7396q cyoe.x2<? super Character, ? extends C6227f<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.fn3e.fn3e(C6140e.m22479p(cArr.length), 16));
        for (char c2 : cArr) {
            C6227f<? extends K, ? extends V> c6227fInvoke = transform.invoke(Character.valueOf(c2));
            linkedHashMap.put(c6227fInvoke.getFirst(), c6227fInvoke.getSecond());
        }
        return linkedHashMap;
    }

    public static final float k2gn(@InterfaceC7396q float[] fArr) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        float f2 = 0.0f;
        for (float f3 : fArr) {
            f2 += f3;
        }
        return f2;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <R extends Comparable<? super R>> R k3(char[] cArr, cyoe.x2<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Character.valueOf(cArr[0]));
        n5r1 it = new kotlin.ranges.x2(1, j59a(cArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Character.valueOf(cArr[it.nextInt()]));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC7396q
    public static final Iterable<x9kr<Short>> k3pw(@InterfaceC7396q short[] sArr) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        return new ncyb(new zurt(sArr));
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final <R> List<R> k3v9(int[] iArr, R r2, cyoe.cdj<? super Integer, ? super R, ? super Integer, ? extends R> operation) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (iArr.length == 0) {
            return kotlin.collections.zurt.ld6(r2);
        }
        ArrayList arrayList = new ArrayList(iArr.length + 1);
        arrayList.add(r2);
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            r2 = operation.invoke(Integer.valueOf(i2), r2, Integer.valueOf(iArr[i2]));
            arrayList.add(r2);
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final <T> List<T> k4(@InterfaceC7396q T[] tArr, @InterfaceC7396q Iterable<Integer> indices) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(indices, "indices");
        int iVyq = kotlin.collections.fu4.vyq(indices, 10);
        if (iVyq == 0) {
            return kotlin.collections.ni7.a9();
        }
        ArrayList arrayList = new ArrayList(iVyq);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(tArr[it.next().intValue()]);
        }
        return arrayList;
    }

    public static final float k5dw(@InterfaceC7396q float[] fArr) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        int length = fArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return fArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    @InterfaceC7395n
    public static final Float k68d(@InterfaceC7396q float[] fArr) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        return Float.valueOf(fArr[fArr.length - 1]);
    }

    @InterfaceC7396q
    public static final <R> List<C6227f<Boolean, R>> k6e(@InterfaceC7396q boolean[] zArr, @InterfaceC7396q R[] other) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        int iMin = Math.min(zArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i2 = 0; i2 < iMin; i2++) {
            boolean z2 = zArr[i2];
            arrayList.add(kotlin.nmn5.m23230k(Boolean.valueOf(z2), other[i2]));
        }
        return arrayList;
    }

    @kotlin.yz(version = "1.4")
    public static final void k7(@InterfaceC7396q double[] dArr, @InterfaceC7396q AbstractC6332g random) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(random, "random");
        for (int iF14 = f14(dArr); iF14 > 0; iF14--) {
            int iNextInt = random.nextInt(iF14 + 1);
            double d2 = dArr[iF14];
            dArr[iF14] = dArr[iNextInt];
            dArr[iNextInt] = d2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC7396q
    @kotlin.yz(version = "1.4")
    public static final <T, R> List<R> k7ck(@InterfaceC7396q T[] tArr, R r2, @InterfaceC7396q cyoe.cdj<? super Integer, ? super R, ? super T, ? extends R> operation) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (tArr.length == 0) {
            return kotlin.collections.zurt.ld6(r2);
        }
        ArrayList arrayList = new ArrayList(tArr.length + 1);
        arrayList.add(r2);
        int length = tArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            r2 = operation.invoke(Integer.valueOf(i2), r2, tArr[i2]);
            arrayList.add(r2);
        }
        return arrayList;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <R> R k7u(double[] dArr, Comparator<? super R> comparator, cyoe.x2<? super Double, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Double.valueOf(dArr[0]));
        n5r1 it = new kotlin.ranges.x2(1, f14(dArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Double.valueOf(dArr[it.nextInt()]));
            if (comparator.compare(rInvoke, rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC7396q
    public static final String k8s(@InterfaceC7396q long[] jArr, @InterfaceC7396q CharSequence separator, @InterfaceC7396q CharSequence prefix, @InterfaceC7396q CharSequence postfix, int i2, @InterfaceC7396q CharSequence truncated, @InterfaceC7395n cyoe.x2<? super Long, ? extends CharSequence> x2Var) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(separator, "separator");
        kotlin.jvm.internal.d2ok.m23075h(prefix, "prefix");
        kotlin.jvm.internal.d2ok.m23075h(postfix, "postfix");
        kotlin.jvm.internal.d2ok.m23075h(truncated, "truncated");
        String string = ((StringBuilder) zn(jArr, new StringBuilder(), separator, prefix, postfix, i2, truncated, x2Var)).toString();
        kotlin.jvm.internal.d2ok.kja0(string, "joinTo(StringBuilder(), …ed, transform).toString()");
        return string;
    }

    @kotlin.yz(version = "1.7")
    @InterfaceC6769y(name = "maxByOrThrow")
    public static final <R extends Comparable<? super R>> boolean k9(@InterfaceC7396q boolean[] zArr, @InterfaceC7396q cyoe.x2<? super Boolean, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (zArr.length == 0) {
            throw new NoSuchElementException();
        }
        boolean z2 = zArr[0];
        int iRl = rl(zArr);
        if (iRl == 0) {
            return z2;
        }
        R rInvoke = selector.invoke(Boolean.valueOf(z2));
        n5r1 it = new kotlin.ranges.x2(1, iRl).iterator();
        while (it.hasNext()) {
            boolean z3 = zArr[it.nextInt()];
            R rInvoke2 = selector.invoke(Boolean.valueOf(z3));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                z2 = z3;
                rInvoke = rInvoke2;
            }
        }
        return z2;
    }

    @InterfaceC7395n
    public static final Long kaf(@InterfaceC7396q long[] jArr, @InterfaceC7396q cyoe.x2<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (long j2 : jArr) {
            if (predicate.invoke(Long.valueOf(j2)).booleanValue()) {
                return Long.valueOf(j2);
            }
        }
        return null;
    }

    @InterfaceC7396q
    public static final <K> Map<K, List<Short>> kajn(@InterfaceC7396q short[] sArr, @InterfaceC7396q cyoe.x2<? super Short, ? extends K> keySelector) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (short s2 : sArr) {
            K kInvoke = keySelector.invoke(Short.valueOf(s2));
            Object arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(Short.valueOf(s2));
        }
        return linkedHashMap;
    }

    public static final byte kbf0(@InterfaceC7396q byte[] bArr, @InterfaceC7396q cyoe.cdj<? super Integer, ? super Byte, ? super Byte, Byte> operation) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        int iVl = vl(bArr);
        if (iVl < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        byte bByteValue = bArr[iVl];
        for (int i2 = iVl - 1; i2 >= 0; i2--) {
            bByteValue = operation.invoke(Integer.valueOf(i2), Byte.valueOf(bArr[i2]), Byte.valueOf(bByteValue)).byteValue();
        }
        return bByteValue;
    }

    @kotlin.yz(version = "1.7")
    @InterfaceC6769y(name = "minByOrThrow")
    public static final <R extends Comparable<? super R>> int kc(@InterfaceC7396q int[] iArr, @InterfaceC7396q cyoe.x2<? super Integer, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        int i2 = iArr[0];
        int iSrpc = srpc(iArr);
        if (iSrpc == 0) {
            return i2;
        }
        R rInvoke = selector.invoke(Integer.valueOf(i2));
        n5r1 it = new kotlin.ranges.x2(1, iSrpc).iterator();
        while (it.hasNext()) {
            int i3 = iArr[it.nextInt()];
            R rInvoke2 = selector.invoke(Integer.valueOf(i3));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                i2 = i3;
                rInvoke = rInvoke2;
            }
        }
        return i2;
    }

    @InterfaceC7396q
    public static final List<Boolean> kcdz(@InterfaceC7396q boolean[] zArr, @InterfaceC7396q cyoe.x2<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (int iRl = rl(zArr); -1 < iRl; iRl--) {
            if (!predicate.invoke(Boolean.valueOf(zArr[iRl])).booleanValue()) {
                return o1sk(zArr, iRl + 1);
            }
        }
        return kotlin.collections.ni7.a9();
    }

    @InterfaceC7396q
    public static final <T, R, C extends Collection<? super R>> C kd8(@InterfaceC7396q T[] tArr, @InterfaceC7396q C destination, @InterfaceC7396q cyoe.x2<? super T, ? extends R> transform) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        for (T t2 : tArr) {
            R rInvoke = transform.invoke(t2);
            if (rInvoke != null) {
                destination.add(rInvoke);
            }
        }
        return destination;
    }

    public static int kes(@InterfaceC7396q short[] sArr, short s2) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        int length = sArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (s2 == sArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @kotlin.hyr
    @InterfaceC6234g
    @kotlin.yz(version = "1.5")
    @InterfaceC6769y(name = "sumOfULong")
    private static final long kf(long[] jArr, cyoe.x2<? super Long, ikck> selector) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        long jLd6 = ikck.ld6(0L);
        for (long j2 : jArr) {
            jLd6 = ikck.ld6(jLd6 + selector.invoke(Long.valueOf(j2)).a98o());
        }
        return jLd6;
    }

    @InterfaceC7396q
    public static final <C extends Collection<? super Character>> C kff(@InterfaceC7396q char[] cArr, @InterfaceC7396q C destination) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        for (char c2 : cArr) {
            destination.add(Character.valueOf(c2));
        }
        return destination;
    }

    @kotlin.yz(version = "1.4")
    public static final <T> void kfxm(@InterfaceC7396q T[] tArr) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        sr(tArr, AbstractC6332g.Default);
    }

    @InterfaceC7396q
    public static final List<Float> kg(@InterfaceC7396q float[] fArr, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
        }
        if (i2 == 0) {
            return kotlin.collections.ni7.a9();
        }
        if (i2 >= fArr.length) {
            return lk4(fArr);
        }
        if (i2 == 1) {
            return kotlin.collections.zurt.ld6(Float.valueOf(fArr[0]));
        }
        ArrayList arrayList = new ArrayList(i2);
        int i3 = 0;
        for (float f2 : fArr) {
            arrayList.add(Float.valueOf(f2));
            i3++;
            if (i3 == i2) {
                break;
            }
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final <K, M extends Map<? super K, ? super Integer>> M kho(@InterfaceC7396q int[] iArr, @InterfaceC7396q M destination, @InterfaceC7396q cyoe.x2<? super Integer, ? extends K> keySelector) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(keySelector, "keySelector");
        for (int i2 : iArr) {
            destination.put(keySelector.invoke(Integer.valueOf(i2)), Integer.valueOf(i2));
        }
        return destination;
    }

    public static final char khz(@InterfaceC7396q char[] cArr, @InterfaceC7396q InterfaceC5979h<? super Character, ? super Character, Character> operation) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (cArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        char cCharValue = cArr[0];
        n5r1 it = new kotlin.ranges.x2(1, j59a(cArr)).iterator();
        while (it.hasNext()) {
            cCharValue = operation.invoke(Character.valueOf(cCharValue), Character.valueOf(cArr[it.nextInt()])).charValue();
        }
        return cCharValue;
    }

    @InterfaceC7396q
    public static final List<Boolean> kl(@InterfaceC7396q boolean[] zArr, @InterfaceC7396q InterfaceC5979h<? super Integer, ? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = zArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            boolean z2 = zArr[i2];
            int i4 = i3 + 1;
            if (predicate.invoke(Integer.valueOf(i3), Boolean.valueOf(z2)).booleanValue()) {
                arrayList.add(Boolean.valueOf(z2));
            }
            i2++;
            i3 = i4;
        }
        return arrayList;
    }

    @InterfaceC7395n
    public static final Short klfn(@InterfaceC7396q short[] sArr) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        if (sArr.length == 0) {
            return null;
        }
        return Short.valueOf(sArr[0]);
    }

    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final <R extends Comparable<? super R>> Float klnv(@InterfaceC7396q float[] fArr, @InterfaceC7396q cyoe.x2<? super Float, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        float f2 = fArr[0];
        int iGto = gto(fArr);
        if (iGto == 0) {
            return Float.valueOf(f2);
        }
        R rInvoke = selector.invoke(Float.valueOf(f2));
        n5r1 it = new kotlin.ranges.x2(1, iGto).iterator();
        while (it.hasNext()) {
            float f3 = fArr[it.nextInt()];
            R rInvoke2 = selector.invoke(Float.valueOf(f3));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                f2 = f3;
                rInvoke = rInvoke2;
            }
        }
        return Float.valueOf(f2);
    }

    @kotlin.hyr
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @InterfaceC6769y(name = "sumOfLong")
    private static final long kls(short[] sArr, cyoe.x2<? super Short, Long> selector) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        long jLongValue = 0;
        for (short s2 : sArr) {
            jLongValue += selector.invoke(Short.valueOf(s2)).longValue();
        }
        return jLongValue;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final float km(short[] sArr, cyoe.x2<? super Short, Float> selector) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(Short.valueOf(sArr[0])).floatValue();
        n5r1 it = new kotlin.ranges.x2(1, orxw(sArr)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, selector.invoke(Short.valueOf(sArr[it.nextInt()])).floatValue());
        }
        return fFloatValue;
    }

    @kotlin.yz(version = "1.3")
    public static final char km71(@InterfaceC7396q char[] cArr, @InterfaceC7396q AbstractC6332g random) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(random, "random");
        if (cArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return cArr[random.nextInt(cArr.length)];
    }

    @InterfaceC7396q
    public static final <K, V> Map<K, V> km9o(@InterfaceC7396q float[] fArr, @InterfaceC7396q cyoe.x2<? super Float, ? extends K> keySelector, @InterfaceC7396q cyoe.x2<? super Float, ? extends V> valueTransform) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(keySelector, "keySelector");
        kotlin.jvm.internal.d2ok.m23075h(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.fn3e.fn3e(C6140e.m22479p(fArr.length), 16));
        for (float f2 : fArr) {
            linkedHashMap.put(keySelector.invoke(Float.valueOf(f2)), valueTransform.invoke(Float.valueOf(f2)));
        }
        return linkedHashMap;
    }

    @InterfaceC7396q
    public static final List<Long> kn(@InterfaceC7396q long[] jArr) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
        kotlin.jvm.internal.d2ok.kja0(jArrCopyOf, "copyOf(this, size)");
        kotlin.collections.kja0.rf(jArrCopyOf);
        return e3la(jArrCopyOf);
    }

    @InterfaceC6234g
    private static final Double kn7(double[] dArr, cyoe.x2<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (double d2 : dArr) {
            if (predicate.invoke(Double.valueOf(d2)).booleanValue()) {
                return Double.valueOf(d2);
            }
        }
        return null;
    }

    @InterfaceC7396q
    public static final <A extends Appendable> A kncy(@InterfaceC7396q float[] fArr, @InterfaceC7396q A buffer, @InterfaceC7396q CharSequence separator, @InterfaceC7396q CharSequence prefix, @InterfaceC7396q CharSequence postfix, int i2, @InterfaceC7396q CharSequence truncated, @InterfaceC7395n cyoe.x2<? super Float, ? extends CharSequence> x2Var) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(buffer, "buffer");
        kotlin.jvm.internal.d2ok.m23075h(separator, "separator");
        kotlin.jvm.internal.d2ok.m23075h(prefix, "prefix");
        kotlin.jvm.internal.d2ok.m23075h(postfix, "postfix");
        kotlin.jvm.internal.d2ok.m23075h(truncated, "truncated");
        buffer.append(prefix);
        int i3 = 0;
        for (float f2 : fArr) {
            i3++;
            if (i3 > 1) {
                buffer.append(separator);
            }
            if (i2 >= 0 && i3 > i2) {
                break;
            }
            if (x2Var != null) {
                buffer.append(x2Var.invoke(Float.valueOf(f2)));
            } else {
                buffer.append(String.valueOf(f2));
            }
        }
        if (i2 >= 0 && i3 > i2) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    @kotlin.hyr
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @InterfaceC6769y(name = "sumOfInt")
    private static final int koyb(short[] sArr, cyoe.x2<? super Short, Integer> selector) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        int iIntValue = 0;
        for (short s2 : sArr) {
            iIntValue += selector.invoke(Short.valueOf(s2)).intValue();
        }
        return iIntValue;
    }

    @InterfaceC7396q
    public static final <R, C extends Collection<? super R>> C kp3(@InterfaceC7396q byte[] bArr, @InterfaceC7396q C destination, @InterfaceC7396q cyoe.x2<? super Byte, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        for (byte b2 : bArr) {
            C6163t.zp(destination, transform.invoke(Byte.valueOf(b2)));
        }
        return destination;
    }

    @InterfaceC7396q
    public static final <R extends Comparable<? super R>> List<Boolean> kpsf(@InterfaceC7396q boolean[] zArr, @InterfaceC7396q cyoe.x2<? super Boolean, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        return imy(zArr, new f7l8.C6179k(selector));
    }

    @InterfaceC7396q
    public static final <K, V> Map<K, List<V>> kqdm(@InterfaceC7396q byte[] bArr, @InterfaceC7396q cyoe.x2<? super Byte, ? extends K> keySelector, @InterfaceC7396q cyoe.x2<? super Byte, ? extends V> valueTransform) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(keySelector, "keySelector");
        kotlin.jvm.internal.d2ok.m23075h(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (byte b2 : bArr) {
            K kInvoke = keySelector.invoke(Byte.valueOf(b2));
            List<V> arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(kInvoke, arrayList);
            }
            arrayList.add(valueTransform.invoke(Byte.valueOf(b2)));
        }
        return linkedHashMap;
    }

    @InterfaceC6234g
    private static final boolean kqo(char[] cArr) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        return !(cArr.length == 0);
    }

    public static int krlr(@InterfaceC7396q int[] iArr) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        int i2 = 0;
        for (int i3 : iArr) {
            i2 += i3;
        }
        return i2;
    }

    public static final <R> R kro(@InterfaceC7396q long[] jArr, R r2, @InterfaceC7396q InterfaceC5979h<? super R, ? super Long, ? extends R> operation) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        for (long j2 : jArr) {
            r2 = operation.invoke(r2, Long.valueOf(j2));
        }
        return r2;
    }

    @InterfaceC7396q
    public static final Set<Short> krop(@InterfaceC7396q short[] sArr, @InterfaceC7396q Iterable<Short> other) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        Set<Short> setFxq0 = fxq0(sArr);
        C6163t.zsr0(setFxq0, other);
        return setFxq0;
    }

    @InterfaceC7396q
    public static final <K, V> Map<K, V> krto(@InterfaceC7396q short[] sArr, @InterfaceC7396q cyoe.x2<? super Short, ? extends C6227f<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.fn3e.fn3e(C6140e.m22479p(sArr.length), 16));
        for (short s2 : sArr) {
            C6227f<? extends K, ? extends V> c6227fInvoke = transform.invoke(Short.valueOf(s2));
            linkedHashMap.put(c6227fInvoke.getFirst(), c6227fInvoke.getSecond());
        }
        return linkedHashMap;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <R extends Comparable<? super R>> R ks5(int[] iArr, cyoe.x2<? super Integer, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Integer.valueOf(iArr[0]));
        n5r1 it = new kotlin.ranges.x2(1, srpc(iArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Integer.valueOf(iArr[it.nextInt()]));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final float ksgr(byte[] bArr, cyoe.x2<? super Byte, Float> selector) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(Byte.valueOf(bArr[0])).floatValue();
        n5r1 it = new kotlin.ranges.x2(1, vl(bArr)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, selector.invoke(Byte.valueOf(bArr[it.nextInt()])).floatValue());
        }
        return fFloatValue;
    }

    @InterfaceC6234g
    private static final boolean ktm(long[] jArr) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        return !(jArr.length == 0);
    }

    public static final int ku(@InterfaceC7396q float[] fArr, @InterfaceC7396q cyoe.x2<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        int length = fArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (predicate.invoke(Float.valueOf(fArr[length])).booleanValue()) {
                    return length;
                }
                if (i2 < 0) {
                    break;
                }
                length = i2;
            }
        }
        return -1;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <R extends Comparable<? super R>> R kuf(float[] fArr, cyoe.x2<? super Float, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Float.valueOf(fArr[0]));
        n5r1 it = new kotlin.ranges.x2(1, gto(fArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Float.valueOf(fArr[it.nextInt()]));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <T> Float kus(T[] tArr, cyoe.x2<? super T, Float> selector) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        float fFloatValue = selector.invoke(tArr[0]).floatValue();
        n5r1 it = new kotlin.ranges.x2(1, gjp(tArr)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, selector.invoke(tArr[it.nextInt()]).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    public static final byte kw5(@InterfaceC7396q byte[] bArr, @InterfaceC7396q InterfaceC5979h<? super Byte, ? super Byte, Byte> operation) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        int iVl = vl(bArr);
        if (iVl < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        byte bByteValue = bArr[iVl];
        for (int i2 = iVl - 1; i2 >= 0; i2--) {
            bByteValue = operation.invoke(Byte.valueOf(bArr[i2]), Byte.valueOf(bByteValue)).byteValue();
        }
        return bByteValue;
    }

    public static final char kx(@InterfaceC7396q char[] cArr) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        if (cArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return cArr[j59a(cArr)];
    }

    @InterfaceC7395n
    public static final Double kxe(@InterfaceC7396q double[] dArr, @InterfaceC7396q cyoe.x2<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        int length = dArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i2 = length - 1;
            double d2 = dArr[length];
            if (predicate.invoke(Double.valueOf(d2)).booleanValue()) {
                return Double.valueOf(d2);
            }
            if (i2 < 0) {
                return null;
            }
            length = i2;
        }
    }

    @kotlin.x2(errorSince = "1.6", hiddenSince = "1.7", warningSince = "1.4")
    @kotlin.ld6(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use 'indexOfLast { it == element }' instead to continue using this behavior, or '.asList().lastIndexOf(element: T)' to get the same search behavior as in a list.", replaceWith = @kotlin.hb(expression = "indexOfLast { it == element }", imports = {}))
    public static final /* synthetic */ int kxp3(float[] fArr, float f2) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        int length = fArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (f2 == fArr[length]) {
                    return length;
                }
                if (i2 < 0) {
                    break;
                }
                length = i2;
            }
        }
        return -1;
    }

    public static final int kxwi(@InterfaceC7396q int[] iArr, @InterfaceC7396q InterfaceC5979h<? super Integer, ? super Integer, Integer> operation) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        int iSrpc = srpc(iArr);
        if (iSrpc < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        int iIntValue = iArr[iSrpc];
        for (int i2 = iSrpc - 1; i2 >= 0; i2--) {
            iIntValue = operation.invoke(Integer.valueOf(iArr[i2]), Integer.valueOf(iIntValue)).intValue();
        }
        return iIntValue;
    }

    @InterfaceC7396q
    public static final List<Byte> kyz8(@InterfaceC7396q byte[] bArr, @InterfaceC7396q cyoe.x2<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (int iVl = vl(bArr); -1 < iVl; iVl--) {
            if (!predicate.invoke(Byte.valueOf(bArr[iVl])).booleanValue()) {
                return ume(bArr, iVl + 1);
            }
        }
        return rek(bArr);
    }

    @InterfaceC6769y(name = "sumOfShort")
    public static final int kz6x(@InterfaceC7396q Short[] shArr) {
        kotlin.jvm.internal.d2ok.m23075h(shArr, "<this>");
        int iShortValue = 0;
        for (Short sh : shArr) {
            iShortValue += sh.shortValue();
        }
        return iShortValue;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final Double kzk(byte[] bArr, cyoe.x2<? super Byte, Double> selector) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        double dDoubleValue = selector.invoke(Byte.valueOf(bArr[0])).doubleValue();
        n5r1 it = new kotlin.ranges.x2(1, vl(bArr)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, selector.invoke(Byte.valueOf(bArr[it.nextInt()])).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    public static final boolean l0(@InterfaceC7396q double[] dArr, @InterfaceC7396q cyoe.x2<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (double d2 : dArr) {
            if (!predicate.invoke(Double.valueOf(d2)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @InterfaceC7396q
    public static final <R extends Comparable<? super R>> List<Short> l044(@InterfaceC7396q short[] sArr, @InterfaceC7396q cyoe.x2<? super Short, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        return cxw(sArr, new f7l8.C6179k(selector));
    }

    @InterfaceC7396q
    public static final <C extends Collection<? super Short>> C l0e(@InterfaceC7396q short[] sArr, @InterfaceC7396q C destination) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        for (short s2 : sArr) {
            destination.add(Short.valueOf(s2));
        }
        return destination;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final <V> Map<Short, V> l0u(short[] sArr, cyoe.x2<? super Short, ? extends V> valueSelector) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(valueSelector, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.fn3e.fn3e(C6140e.m22479p(sArr.length), 16));
        for (short s2 : sArr) {
            linkedHashMap.put(Short.valueOf(s2), valueSelector.invoke(Short.valueOf(s2)));
        }
        return linkedHashMap;
    }

    @kotlin.yz(version = "1.4")
    public static final void l1l1(@InterfaceC7396q double[] dArr, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.collections.kja0.nc(dArr, i2, i3);
        f517(dArr, i2, i3);
    }

    @InterfaceC7396q
    public static final <R extends Comparable<? super R>> List<Character> l24(@InterfaceC7396q char[] cArr, @InterfaceC7396q cyoe.x2<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        return h9w7(cArr, new f7l8.C6179k(selector));
    }

    @InterfaceC7396q
    public static final List<Character> l2gm(@InterfaceC7396q char[] cArr) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        ArrayList arrayList = new ArrayList(cArr.length);
        for (char c2 : cArr) {
            arrayList.add(Character.valueOf(c2));
        }
        return arrayList;
    }

    @InterfaceC7395n
    public static final Integer l2gr(@InterfaceC7396q int[] iArr, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        if (i2 < 0 || i2 > srpc(iArr)) {
            return null;
        }
        return Integer.valueOf(iArr[i2]);
    }

    @InterfaceC7396q
    public static final <T> Set<T> l2hi(@InterfaceC7396q T[] tArr) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        int length = tArr.length;
        return length != 0 ? length != 1 ? (Set) mp7a(tArr, new LinkedHashSet(C6140e.m22479p(tArr.length))) : i1.m22499g(tArr[0]) : a98o.ld6();
    }

    public static final void l3h(@InterfaceC7396q float[] fArr) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        if (fArr.length > 1) {
            kotlin.collections.kja0.erbd(fArr);
            cdhb(fArr);
        }
    }

    @kotlin.hyr
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @InterfaceC6769y(name = "flatMapIndexedIterableTo")
    private static final <R, C extends Collection<? super R>> C l42(float[] fArr, C destination, InterfaceC5979h<? super Integer, ? super Float, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        int length = fArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            C6163t.zp(destination, transform.invoke(Integer.valueOf(i3), Float.valueOf(fArr[i2])));
            i2++;
            i3++;
        }
        return destination;
    }

    @InterfaceC7396q
    public static final HashSet<Short> l49c(@InterfaceC7396q short[] sArr) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        return (HashSet) l0e(sArr, new HashSet(C6140e.m22479p(sArr.length)));
    }

    @InterfaceC7396q
    public static final List<Short> l5(@InterfaceC7396q short[] sArr) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        Short[] shArrAe4 = kotlin.collections.kja0.ae4(sArr);
        kotlin.collections.kja0.anw(shArrAe4);
        return kotlin.collections.kja0.m22514i(shArrAe4);
    }

    @InterfaceC7396q
    public static final List<Long> l5o(@InterfaceC7396q long[] jArr) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        return a9.wr(q4m4(jArr));
    }

    @InterfaceC7396q
    public static final <R> List<R> l6(@InterfaceC7396q short[] sArr, @InterfaceC7396q cyoe.x2<? super Short, ? extends R> transform) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        ArrayList arrayList = new ArrayList(sArr.length);
        for (short s2 : sArr) {
            arrayList.add(transform.invoke(Short.valueOf(s2)));
        }
        return arrayList;
    }

    @kotlin.yz(version = "1.7")
    @InterfaceC6769y(name = "maxOrThrow")
    public static final byte l7p(@InterfaceC7396q byte[] bArr) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        byte b2 = bArr[0];
        n5r1 it = new kotlin.ranges.x2(1, vl(bArr)).iterator();
        while (it.hasNext()) {
            byte b3 = bArr[it.nextInt()];
            if (b2 < b3) {
                b2 = b3;
            }
        }
        return b2;
    }

    @InterfaceC7396q
    public static final List<Short> l8(@InterfaceC7396q short[] sArr) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        int length = sArr.length;
        return length != 0 ? length != 1 ? i1r(sArr) : kotlin.collections.zurt.ld6(Short.valueOf(sArr[0])) : kotlin.collections.ni7.a9();
    }

    public static final void l8l(@InterfaceC7396q boolean[] zArr, @InterfaceC7396q cyoe.x2<? super Boolean, was> action) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(action, "action");
        for (boolean z2 : zArr) {
            action.invoke(Boolean.valueOf(z2));
        }
    }

    public static final int l8s(@InterfaceC7396q boolean[] zArr, boolean z2) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        int length = zArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (z2 == zArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final Float l8y(@InterfaceC7396q float[] fArr) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        float fMax = fArr[0];
        n5r1 it = new kotlin.ranges.x2(1, gto(fArr)).iterator();
        while (it.hasNext()) {
            fMax = Math.max(fMax, fArr[it.nextInt()]);
        }
        return Float.valueOf(fMax);
    }

    @InterfaceC7395n
    public static <T> T l9(@InterfaceC7396q T[] tArr) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        if (tArr.length == 1) {
            return tArr[0];
        }
        return null;
    }

    @InterfaceC7396q
    public static final Iterable<Short> l92(@InterfaceC7396q short[] sArr) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        return sArr.length == 0 ? kotlin.collections.ni7.a9() : new zy(sArr);
    }

    @kotlin.yz(version = "1.7")
    @InterfaceC6769y(name = "minWithOrThrow")
    public static final long la(@InterfaceC7396q long[] jArr, @InterfaceC7396q Comparator<? super Long> comparator) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        long j2 = jArr[0];
        n5r1 it = new kotlin.ranges.x2(1, hmvj(jArr)).iterator();
        while (it.hasNext()) {
            long j3 = jArr[it.nextInt()];
            if (comparator.compare(Long.valueOf(j2), Long.valueOf(j3)) > 0) {
                j2 = j3;
            }
        }
        return j2;
    }

    @InterfaceC7396q
    public static final List<Short> lay(@InterfaceC7396q short[] sArr, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        if (i2 >= 0) {
            return m76(sArr, kotlin.ranges.fn3e.fn3e(sArr.length - i2, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
    }

    public static final int lb(@InterfaceC7396q char[] cArr, char c2) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        int length = cArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (c2 == cArr[length]) {
                    return length;
                }
                if (i2 < 0) {
                    break;
                }
                length = i2;
            }
        }
        return -1;
    }

    public static final float lb8(@InterfaceC7396q float[] fArr) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        if (fArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return fArr[gto(fArr)];
    }

    @InterfaceC7396q
    public static final <C extends Collection<? super Long>> C lbeq(@InterfaceC7396q long[] jArr, @InterfaceC7396q C destination, @InterfaceC7396q cyoe.x2<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (long j2 : jArr) {
            if (predicate.invoke(Long.valueOf(j2)).booleanValue()) {
                destination.add(Long.valueOf(j2));
            }
        }
        return destination;
    }

    @InterfaceC7395n
    public static final Character lbq(@InterfaceC7396q char[] cArr) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        if (cArr.length == 0) {
            return null;
        }
        return Character.valueOf(cArr[cArr.length - 1]);
    }

    public static final <R> R le(@InterfaceC7396q double[] dArr, R r2, @InterfaceC7396q InterfaceC5979h<? super Double, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        for (int iF14 = f14(dArr); iF14 >= 0; iF14--) {
            r2 = operation.invoke(Double.valueOf(dArr[iF14]), r2);
        }
        return r2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC7396q
    public static final <T, K, V> Map<K, V> le9(@InterfaceC7396q T[] tArr, @InterfaceC7396q cyoe.x2<? super T, ? extends C6227f<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.fn3e.fn3e(C6140e.m22479p(tArr.length), 16));
        for (a98o.toq toqVar : tArr) {
            C6227f<? extends K, ? extends V> c6227fInvoke = transform.invoke(toqVar);
            linkedHashMap.put(c6227fInvoke.getFirst(), c6227fInvoke.getSecond());
        }
        return linkedHashMap;
    }

    @InterfaceC7395n
    public static final Integer leq(@InterfaceC7396q int[] iArr) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        return Integer.valueOf(iArr[iArr.length - 1]);
    }

    @InterfaceC6234g
    private static final int lflh(boolean[] zArr) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        return zArr.length;
    }

    @kotlin.yz(version = "1.3")
    public static final boolean lg(@InterfaceC7396q boolean[] zArr, @InterfaceC7396q AbstractC6332g random) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(random, "random");
        if (zArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return zArr[random.nextInt(zArr.length)];
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final Boolean lg18(@InterfaceC7396q boolean[] zArr, @InterfaceC7396q InterfaceC5979h<? super Boolean, ? super Boolean, Boolean> operation) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        int iRl = rl(zArr);
        if (iRl < 0) {
            return null;
        }
        boolean zBooleanValue = zArr[iRl];
        for (int i2 = iRl - 1; i2 >= 0; i2--) {
            zBooleanValue = operation.invoke(Boolean.valueOf(zArr[i2]), Boolean.valueOf(zBooleanValue)).booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final Long lge8(@InterfaceC7396q long[] jArr, @InterfaceC7396q InterfaceC5979h<? super Long, ? super Long, Long> operation) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        int iHmvj = hmvj(jArr);
        if (iHmvj < 0) {
            return null;
        }
        long jLongValue = jArr[iHmvj];
        for (int i2 = iHmvj - 1; i2 >= 0; i2--) {
            jLongValue = operation.invoke(Long.valueOf(jArr[i2]), Long.valueOf(jLongValue)).longValue();
        }
        return Long.valueOf(jLongValue);
    }

    @InterfaceC7396q
    public static final <K, M extends Map<? super K, List<Integer>>> M li(@InterfaceC7396q int[] iArr, @InterfaceC7396q M destination, @InterfaceC7396q cyoe.x2<? super Integer, ? extends K> keySelector) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(keySelector, "keySelector");
        for (int i2 : iArr) {
            K kInvoke = keySelector.invoke(Integer.valueOf(i2));
            Object arrayList = destination.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(Integer.valueOf(i2));
        }
        return destination;
    }

    @InterfaceC7396q
    public static final <K> Map<K, Integer> li5y(@InterfaceC7396q int[] iArr, @InterfaceC7396q cyoe.x2<? super Integer, ? extends K> keySelector) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.fn3e.fn3e(C6140e.m22479p(iArr.length), 16));
        for (int i2 : iArr) {
            linkedHashMap.put(keySelector.invoke(Integer.valueOf(i2)), Integer.valueOf(i2));
        }
        return linkedHashMap;
    }

    public static final char lj(@InterfaceC7396q char[] cArr, @InterfaceC7396q cyoe.cdj<? super Integer, ? super Character, ? super Character, Character> operation) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (cArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        char cCharValue = cArr[0];
        n5r1 it = new kotlin.ranges.x2(1, j59a(cArr)).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            cCharValue = operation.invoke(Integer.valueOf(iNextInt), Character.valueOf(cCharValue), Character.valueOf(cArr[iNextInt])).charValue();
        }
        return cCharValue;
    }

    @InterfaceC7396q
    public static final List<Float> lk4(@InterfaceC7396q float[] fArr) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        int length = fArr.length;
        return length != 0 ? length != 1 ? zht(fArr) : kotlin.collections.zurt.ld6(Float.valueOf(fArr[0])) : kotlin.collections.ni7.a9();
    }

    @InterfaceC7396q
    public static final List<C6227f<Character, Character>> lk5(@InterfaceC7396q char[] cArr, @InterfaceC7396q char[] other) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        int iMin = Math.min(cArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i2 = 0; i2 < iMin; i2++) {
            arrayList.add(kotlin.nmn5.m23230k(Character.valueOf(cArr[i2]), Character.valueOf(other[i2])));
        }
        return arrayList;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.3")
    private static final <T> T lk7(T[] tArr) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        return (T) tfr(tArr, AbstractC6332g.Default);
    }

    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final Character lki0(@InterfaceC7396q char[] cArr, @InterfaceC7396q cyoe.cdj<? super Integer, ? super Character, ? super Character, Character> operation) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        int iJ59a = j59a(cArr);
        if (iJ59a < 0) {
            return null;
        }
        char cCharValue = cArr[iJ59a];
        for (int i2 = iJ59a - 1; i2 >= 0; i2--) {
            cCharValue = operation.invoke(Integer.valueOf(i2), Character.valueOf(cArr[i2]), Character.valueOf(cCharValue)).charValue();
        }
        return Character.valueOf(cCharValue);
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final Character lkw(@InterfaceC7396q char[] cArr, @InterfaceC7396q InterfaceC5979h<? super Character, ? super Character, Character> operation) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        int iJ59a = j59a(cArr);
        if (iJ59a < 0) {
            return null;
        }
        char cCharValue = cArr[iJ59a];
        for (int i2 = iJ59a - 1; i2 >= 0; i2--) {
            cCharValue = operation.invoke(Character.valueOf(cArr[i2]), Character.valueOf(cCharValue)).charValue();
        }
        return Character.valueOf(cCharValue);
    }

    @InterfaceC7396q
    public static final <K, V> Map<K, V> lm(@InterfaceC7396q int[] iArr, @InterfaceC7396q cyoe.x2<? super Integer, ? extends C6227f<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.fn3e.fn3e(C6140e.m22479p(iArr.length), 16));
        for (int i2 : iArr) {
            C6227f<? extends K, ? extends V> c6227fInvoke = transform.invoke(Integer.valueOf(i2));
            linkedHashMap.put(c6227fInvoke.getFirst(), c6227fInvoke.getSecond());
        }
        return linkedHashMap;
    }

    @InterfaceC7396q
    public static final List<Character> lm3(@InterfaceC7396q char[] cArr) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        Character[] chArrB6 = kotlin.collections.kja0.b6(cArr);
        kotlin.collections.kja0.anw(chArrB6);
        return kotlin.collections.kja0.m22514i(chArrB6);
    }

    @InterfaceC7396q
    public static final <K, V, M extends Map<? super K, ? super V>> M lm5(@InterfaceC7396q int[] iArr, @InterfaceC7396q M destination, @InterfaceC7396q cyoe.x2<? super Integer, ? extends C6227f<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        for (int i2 : iArr) {
            C6227f<? extends K, ? extends V> c6227fInvoke = transform.invoke(Integer.valueOf(i2));
            destination.put(c6227fInvoke.getFirst(), c6227fInvoke.getSecond());
        }
        return destination;
    }

    @InterfaceC7396q
    public static final Set<Float> lmkm(@InterfaceC7396q float[] fArr, @InterfaceC7396q Iterable<Float> other) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        Set<Float> setW1s = w1s(fArr);
        C6163t.zp(setW1s, other);
        return setW1s;
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @kotlin.hyr
    @InterfaceC6234g
    @kotlin.yz(version = "1.5")
    @InterfaceC6769y(name = "sumOfUInt")
    private static final <T> int lmz(T[] tArr, cyoe.x2<? super T, gyi> selector) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        int iLd6 = gyi.ld6(0);
        for (T t2 : tArr) {
            iLd6 = gyi.ld6(iLd6 + selector.invoke(t2).a98o());
        }
        return iLd6;
    }

    @InterfaceC7396q
    public static final <R, C extends Collection<? super R>> C lnj(@InterfaceC7396q int[] iArr, @InterfaceC7396q C destination, @InterfaceC7396q InterfaceC5979h<? super Integer, ? super Integer, ? extends R> transform) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            destination.add(transform.invoke(Integer.valueOf(i3), Integer.valueOf(iArr[i2])));
            i2++;
            i3++;
        }
        return destination;
    }

    public static void lo(@InterfaceC7396q byte[] bArr) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        int length = (bArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int iVl = vl(bArr);
        n5r1 it = new kotlin.ranges.x2(0, length).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            byte b2 = bArr[iNextInt];
            bArr[iNextInt] = bArr[iVl];
            bArr[iVl] = b2;
            iVl--;
        }
    }

    @kotlin.yz(version = "1.4")
    public static final void loce(@InterfaceC7396q boolean[] zArr, @InterfaceC7396q AbstractC6332g random) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(random, "random");
        for (int iRl = rl(zArr); iRl > 0; iRl--) {
            int iNextInt = random.nextInt(iRl + 1);
            boolean z2 = zArr[iRl];
            zArr[iRl] = zArr[iNextInt];
            zArr[iNextInt] = z2;
        }
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.3")
    private static final double lp7(double[] dArr) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        return be(dArr, AbstractC6332g.Default);
    }

    @kotlin.yz(version = "1.7")
    @InterfaceC6769y(name = "maxWithOrThrow")
    public static final double lptj(@InterfaceC7396q double[] dArr, @InterfaceC7396q Comparator<? super Double> comparator) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        double d2 = dArr[0];
        n5r1 it = new kotlin.ranges.x2(1, f14(dArr)).iterator();
        while (it.hasNext()) {
            double d4 = dArr[it.nextInt()];
            if (comparator.compare(Double.valueOf(d2), Double.valueOf(d4)) < 0) {
                d2 = d4;
            }
        }
        return d2;
    }

    @InterfaceC7395n
    public static final <T> T lq1p(@InterfaceC7396q T[] tArr, @InterfaceC7396q cyoe.x2<? super T, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        boolean z2 = false;
        T t2 = null;
        for (T t3 : tArr) {
            if (predicate.invoke(t3).booleanValue()) {
                if (z2) {
                    return null;
                }
                z2 = true;
                t2 = t3;
            }
        }
        if (z2) {
            return t2;
        }
        return null;
    }

    @InterfaceC7396q
    public static final <R> List<R> lq96(@InterfaceC7396q byte[] bArr, @InterfaceC7396q InterfaceC5979h<? super Integer, ? super Byte, ? extends R> transform) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        ArrayList arrayList = new ArrayList(bArr.length);
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            arrayList.add(transform.invoke(Integer.valueOf(i3), Byte.valueOf(bArr[i2])));
            i2++;
            i3++;
        }
        return arrayList;
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final <R> List<R> lqk8(boolean[] zArr, R r2, cyoe.cdj<? super Integer, ? super R, ? super Boolean, ? extends R> operation) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (zArr.length == 0) {
            return kotlin.collections.zurt.ld6(r2);
        }
        ArrayList arrayList = new ArrayList(zArr.length + 1);
        arrayList.add(r2);
        int length = zArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            r2 = operation.invoke(Integer.valueOf(i2), r2, Boolean.valueOf(zArr[i2]));
            arrayList.add(r2);
        }
        return arrayList;
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final <R> List<R> lro(int[] iArr, R r2, cyoe.cdj<? super Integer, ? super R, ? super Integer, ? extends R> operation) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (iArr.length == 0) {
            return kotlin.collections.zurt.ld6(r2);
        }
        ArrayList arrayList = new ArrayList(iArr.length + 1);
        arrayList.add(r2);
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            r2 = operation.invoke(Integer.valueOf(i2), r2, Integer.valueOf(iArr[i2]));
            arrayList.add(r2);
        }
        return arrayList;
    }

    @kotlin.hyr
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @InterfaceC6769y(name = "sumOfDouble")
    private static final double ls(float[] fArr, cyoe.x2<? super Float, Double> selector) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        double dDoubleValue = 0.0d;
        for (float f2 : fArr) {
            dDoubleValue += selector.invoke(Float.valueOf(f2)).doubleValue();
        }
        return dDoubleValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <T, R> R lsos(T[] tArr, Comparator<? super R> comparator, cyoe.x2<? super T, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(tArr[0]);
        n5r1 it = new kotlin.ranges.x2(1, gjp(tArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(tArr[it.nextInt()]);
            if (comparator.compare(rInvoke, rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    public static byte lt(@InterfaceC7396q byte[] bArr) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        if (bArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return bArr[vl(bArr)];
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <T, R extends Comparable<? super R>> R ltll(T[] tArr, cyoe.x2<? super T, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(tArr[0]);
        n5r1 it = new kotlin.ranges.x2(1, gjp(tArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(tArr[it.nextInt()]);
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @kotlin.yz(version = "1.7")
    @InterfaceC6769y(name = "minByOrThrow")
    public static final <R extends Comparable<? super R>> double luqn(@InterfaceC7396q double[] dArr, @InterfaceC7396q cyoe.x2<? super Double, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        double d2 = dArr[0];
        int iF14 = f14(dArr);
        if (iF14 == 0) {
            return d2;
        }
        R rInvoke = selector.invoke(Double.valueOf(d2));
        n5r1 it = new kotlin.ranges.x2(1, iF14).iterator();
        while (it.hasNext()) {
            double d4 = dArr[it.nextInt()];
            R rInvoke2 = selector.invoke(Double.valueOf(d4));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
                d2 = d4;
            }
        }
        return d2;
    }

    public static final int luud(@InterfaceC7396q long[] jArr, @InterfaceC7396q cyoe.x2<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        int length = jArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (predicate.invoke(Long.valueOf(jArr[length])).booleanValue()) {
                    return length;
                }
                if (i2 < 0) {
                    break;
                }
                length = i2;
            }
        }
        return -1;
    }

    @InterfaceC7396q
    public static final List<Double> lv7(@InterfaceC7396q double[] dArr) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        return a9.wr(qtn(dArr));
    }

    public static final byte lvt(@InterfaceC7396q byte[] bArr, @InterfaceC7396q cyoe.x2<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        int length = bArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                byte b2 = bArr[length];
                if (!predicate.invoke(Byte.valueOf(b2)).booleanValue()) {
                    if (i2 < 0) {
                        break;
                    }
                    length = i2;
                } else {
                    return b2;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @InterfaceC7396q
    public static final List<Boolean> lwce(@InterfaceC7396q boolean[] zArr, @InterfaceC7396q cyoe.x2<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (int iRl = rl(zArr); -1 < iRl; iRl--) {
            if (!predicate.invoke(Boolean.valueOf(zArr[iRl])).booleanValue()) {
                return c3sl(zArr, iRl + 1);
            }
        }
        return w4de(zArr);
    }

    public static final boolean lwt(@InterfaceC7396q int[] iArr) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        return iArr.length == 0;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final Double lww6(double[] dArr, cyoe.x2<? super Double, Double> selector) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        double dDoubleValue = selector.invoke(Double.valueOf(dArr[0])).doubleValue();
        n5r1 it = new kotlin.ranges.x2(1, f14(dArr)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, selector.invoke(Double.valueOf(dArr[it.nextInt()])).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    public static final <R> R lx(@InterfaceC7396q byte[] bArr, R r2, @InterfaceC7396q InterfaceC5979h<? super R, ? super Byte, ? extends R> operation) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        for (byte b2 : bArr) {
            r2 = operation.invoke(r2, Byte.valueOf(b2));
        }
        return r2;
    }

    @kotlin.yz(version = "1.7")
    @InterfaceC6769y(name = "maxWithOrThrow")
    public static final long ly(@InterfaceC7396q long[] jArr, @InterfaceC7396q Comparator<? super Long> comparator) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        long j2 = jArr[0];
        n5r1 it = new kotlin.ranges.x2(1, hmvj(jArr)).iterator();
        while (it.hasNext()) {
            long j3 = jArr[it.nextInt()];
            if (comparator.compare(Long.valueOf(j2), Long.valueOf(j3)) < 0) {
                j2 = j3;
            }
        }
        return j2;
    }

    @InterfaceC6234g
    private static final char lz(char[] cArr) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        return cArr[0];
    }

    @InterfaceC7396q
    public static final List<Byte> lzd(@InterfaceC7396q byte[] bArr, @InterfaceC7396q cyoe.x2<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (byte b2 : bArr) {
            if (predicate.invoke(Byte.valueOf(b2)).booleanValue()) {
                arrayList.add(Byte.valueOf(b2));
            }
        }
        return arrayList;
    }

    public static final <T, R extends Comparable<? super R>> void m0(@InterfaceC7396q T[] tArr, @InterfaceC7396q cyoe.x2<? super T, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (tArr.length > 1) {
            kotlin.collections.kja0.izu(tArr, new f7l8.C6179k(selector));
        }
    }

    @InterfaceC7396q
    public static final <T> List<T> m0c6(@InterfaceC7396q T[] tArr, @InterfaceC7396q InterfaceC5979h<? super Integer, ? super T, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = tArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            T t2 = tArr[i2];
            int i4 = i3 + 1;
            if (predicate.invoke(Integer.valueOf(i3), t2).booleanValue()) {
                arrayList.add(t2);
            }
            i2++;
            i3 = i4;
        }
        return arrayList;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final float m0ql(double[] dArr, cyoe.x2<? super Double, Float> selector) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(Double.valueOf(dArr[0])).floatValue();
        n5r1 it = new kotlin.ranges.x2(1, f14(dArr)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, selector.invoke(Double.valueOf(dArr[it.nextInt()])).floatValue());
        }
        return fFloatValue;
    }

    @InterfaceC7395n
    public static final <T> T m1(@InterfaceC7396q T[] tArr, @InterfaceC7396q cyoe.x2<? super T, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (T t2 : tArr) {
            if (predicate.invoke(t2).booleanValue()) {
                return t2;
            }
        }
        return null;
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @kotlin.hyr
    @InterfaceC6234g
    @kotlin.yz(version = "1.5")
    @InterfaceC6769y(name = "sumOfUInt")
    private static final int m2(byte[] bArr, cyoe.x2<? super Byte, gyi> selector) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        int iLd6 = gyi.ld6(0);
        for (byte b2 : bArr) {
            iLd6 = gyi.ld6(iLd6 + selector.invoke(Byte.valueOf(b2)).a98o());
        }
        return iLd6;
    }

    @InterfaceC7396q
    public static final List<Short> m24(@InterfaceC7396q short[] sArr, @InterfaceC7396q cyoe.x2<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (short s2 : sArr) {
            if (predicate.invoke(Short.valueOf(s2)).booleanValue()) {
                arrayList.add(Short.valueOf(s2));
            }
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final List<Short> m3(@InterfaceC7396q short[] sArr, @InterfaceC7396q Iterable<Integer> indices) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(indices, "indices");
        int iVyq = kotlin.collections.fu4.vyq(indices, 10);
        if (iVyq == 0) {
            return kotlin.collections.ni7.a9();
        }
        ArrayList arrayList = new ArrayList(iVyq);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(Short.valueOf(sArr[it.next().intValue()]));
        }
        return arrayList;
    }

    @InterfaceC7396q
    @kotlin.yz(version = "1.4")
    public static final <K, V, M extends Map<? super K, ? super V>> M m4ll(@InterfaceC7396q K[] kArr, @InterfaceC7396q M destination, @InterfaceC7396q cyoe.x2<? super K, ? extends V> valueSelector) {
        kotlin.jvm.internal.d2ok.m23075h(kArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(valueSelector, "valueSelector");
        for (K k2 : kArr) {
            destination.put(k2, valueSelector.invoke(k2));
        }
        return destination;
    }

    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final <R extends Comparable<? super R>> Byte m5(@InterfaceC7396q byte[] bArr, @InterfaceC7396q cyoe.x2<? super Byte, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        byte b2 = bArr[0];
        int iVl = vl(bArr);
        if (iVl == 0) {
            return Byte.valueOf(b2);
        }
        R rInvoke = selector.invoke(Byte.valueOf(b2));
        n5r1 it = new kotlin.ranges.x2(1, iVl).iterator();
        while (it.hasNext()) {
            byte b3 = bArr[it.nextInt()];
            R rInvoke2 = selector.invoke(Byte.valueOf(b3));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                b2 = b3;
                rInvoke = rInvoke2;
            }
        }
        return Byte.valueOf(b2);
    }

    @kotlin.yz(version = "1.7")
    @InterfaceC6769y(name = "minOrThrow")
    public static final double m5h3(@InterfaceC7396q Double[] dArr) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = dArr[0].doubleValue();
        n5r1 it = new kotlin.ranges.x2(1, gjp(dArr)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, dArr[it.nextInt()].doubleValue());
        }
        return dDoubleValue;
    }

    public static final long m5pq(@InterfaceC7396q long[] jArr, @InterfaceC7396q InterfaceC5979h<? super Long, ? super Long, Long> operation) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        int iHmvj = hmvj(jArr);
        if (iHmvj < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        long jLongValue = jArr[iHmvj];
        for (int i2 = iHmvj - 1; i2 >= 0; i2--) {
            jLongValue = operation.invoke(Long.valueOf(jArr[i2]), Long.valueOf(jLongValue)).longValue();
        }
        return jLongValue;
    }

    @InterfaceC6234g
    private static final boolean m6t(int[] iArr) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        return !(iArr.length == 0);
    }

    public static int m7(@InterfaceC7396q byte[] bArr, byte b2) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        int length = bArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (b2 == bArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    @InterfaceC7396q
    public static final List<Short> m76(@InterfaceC7396q short[] sArr, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
        }
        if (i2 == 0) {
            return kotlin.collections.ni7.a9();
        }
        if (i2 >= sArr.length) {
            return l8(sArr);
        }
        if (i2 == 1) {
            return kotlin.collections.zurt.ld6(Short.valueOf(sArr[0]));
        }
        ArrayList arrayList = new ArrayList(i2);
        int i3 = 0;
        for (short s2 : sArr) {
            arrayList.add(Short.valueOf(s2));
            i3++;
            if (i3 == i2) {
                break;
            }
        }
        return arrayList;
    }

    public static final void m7dd(@InterfaceC7396q float[] fArr, @InterfaceC7396q InterfaceC5979h<? super Integer, ? super Float, was> action) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(action, "action");
        int length = fArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            action.invoke(Integer.valueOf(i3), Float.valueOf(fArr[i2]));
            i2++;
            i3++;
        }
    }

    @kotlin.yz(version = "1.3")
    public static final float m9j(@InterfaceC7396q float[] fArr, @InterfaceC7396q AbstractC6332g random) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(random, "random");
        if (fArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return fArr[random.nextInt(fArr.length)];
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final <R> List<R> m9u(double[] dArr, R r2, cyoe.cdj<? super Integer, ? super R, ? super Double, ? extends R> operation) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (dArr.length == 0) {
            return kotlin.collections.zurt.ld6(r2);
        }
        ArrayList arrayList = new ArrayList(dArr.length + 1);
        arrayList.add(r2);
        int length = dArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            r2 = operation.invoke(Integer.valueOf(i2), r2, Double.valueOf(dArr[i2]));
            arrayList.add(r2);
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, R> R m9ze(@InterfaceC7396q T[] tArr, R r2, @InterfaceC7396q cyoe.cdj<? super Integer, ? super R, ? super T, ? extends R> operation) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        int length = tArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            r2 = operation.invoke(Integer.valueOf(i3), r2, tArr[i2]);
            i2++;
            i3++;
        }
        return r2;
    }

    @InterfaceC7396q
    public static final List<Double> ma(@InterfaceC7396q double[] dArr) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        Double[] dArrLn = kotlin.collections.kja0.ln(dArr);
        kotlin.collections.kja0.anw(dArrLn);
        return kotlin.collections.kja0.m22514i(dArrLn);
    }

    @InterfaceC7396q
    public static final Iterable<Byte> ma8k(@InterfaceC7396q byte[] bArr) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        return bArr.length == 0 ? kotlin.collections.ni7.a9() : new toq(bArr);
    }

    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final Long mam(@InterfaceC7396q long[] jArr, @InterfaceC7396q Comparator<? super Long> comparator) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        if (jArr.length == 0) {
            return null;
        }
        long j2 = jArr[0];
        n5r1 it = new kotlin.ranges.x2(1, hmvj(jArr)).iterator();
        while (it.hasNext()) {
            long j3 = jArr[it.nextInt()];
            if (comparator.compare(Long.valueOf(j2), Long.valueOf(j3)) > 0) {
                j2 = j3;
            }
        }
        return Long.valueOf(j2);
    }

    @InterfaceC7396q
    public static final Set<Long> mb2r(@InterfaceC7396q long[] jArr, @InterfaceC7396q Iterable<Long> other) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        Set<Long> setQ4m4 = q4m4(jArr);
        C6163t.zp(setQ4m4, other);
        return setQ4m4;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final <V> Map<Long, V> mc(long[] jArr, cyoe.x2<? super Long, ? extends V> valueSelector) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(valueSelector, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.fn3e.fn3e(C6140e.m22479p(jArr.length), 16));
        for (long j2 : jArr) {
            linkedHashMap.put(Long.valueOf(j2), valueSelector.invoke(Long.valueOf(j2)));
        }
        return linkedHashMap;
    }

    @InterfaceC7396q
    public static final List<Float> mcy(@InterfaceC7396q float[] fArr, @InterfaceC7396q cyoe.x2<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (int iGto = gto(fArr); -1 < iGto; iGto--) {
            if (!predicate.invoke(Float.valueOf(fArr[iGto])).booleanValue()) {
                return mwo2(fArr, iGto + 1);
            }
        }
        return lk4(fArr);
    }

    @InterfaceC7396q
    public static final List<Boolean> mddg(@InterfaceC7396q boolean[] zArr, @InterfaceC7396q kotlin.ranges.x2 indices) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(indices, "indices");
        return indices.isEmpty() ? kotlin.collections.ni7.a9() : kotlin.collections.kja0.zurt(kotlin.collections.kja0.h7am(zArr, indices.mo2951k().intValue(), indices.zy().intValue() + 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC7396q
    public static final <K, V, M extends Map<? super K, List<V>>> M mdr(@InterfaceC7396q boolean[] zArr, @InterfaceC7396q M destination, @InterfaceC7396q cyoe.x2<? super Boolean, ? extends K> keySelector, @InterfaceC7396q cyoe.x2<? super Boolean, ? extends V> valueTransform) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(keySelector, "keySelector");
        kotlin.jvm.internal.d2ok.m23075h(valueTransform, "valueTransform");
        for (boolean z2 : zArr) {
            K kInvoke = keySelector.invoke(Boolean.valueOf(z2));
            Object arrayList = destination.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(valueTransform.invoke(Boolean.valueOf(z2)));
        }
        return destination;
    }

    @InterfaceC7396q
    public static final <R> List<C6227f<Float, R>> mdr8(@InterfaceC7396q float[] fArr, @InterfaceC7396q R[] other) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        int iMin = Math.min(fArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i2 = 0; i2 < iMin; i2++) {
            float f2 = fArr[i2];
            arrayList.add(kotlin.nmn5.m23230k(Float.valueOf(f2), other[i2]));
        }
        return arrayList;
    }

    public static final long me(@InterfaceC7396q long[] jArr, @InterfaceC7396q InterfaceC5979h<? super Long, ? super Long, Long> operation) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (jArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        long jLongValue = jArr[0];
        n5r1 it = new kotlin.ranges.x2(1, hmvj(jArr)).iterator();
        while (it.hasNext()) {
            jLongValue = operation.invoke(Long.valueOf(jLongValue), Long.valueOf(jArr[it.nextInt()])).longValue();
        }
        return jLongValue;
    }

    @kotlin.yz(version = "1.7")
    @InterfaceC6769y(name = "minWithOrThrow")
    public static final double mec(@InterfaceC7396q double[] dArr, @InterfaceC7396q Comparator<? super Double> comparator) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        double d2 = dArr[0];
        n5r1 it = new kotlin.ranges.x2(1, f14(dArr)).iterator();
        while (it.hasNext()) {
            double d4 = dArr[it.nextInt()];
            if (comparator.compare(Double.valueOf(d2), Double.valueOf(d4)) > 0) {
                d2 = d4;
            }
        }
        return d2;
    }

    @InterfaceC7396q
    public static final <K, V> Map<K, List<V>> mg(@InterfaceC7396q float[] fArr, @InterfaceC7396q cyoe.x2<? super Float, ? extends K> keySelector, @InterfaceC7396q cyoe.x2<? super Float, ? extends V> valueTransform) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(keySelector, "keySelector");
        kotlin.jvm.internal.d2ok.m23075h(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (float f2 : fArr) {
            K kInvoke = keySelector.invoke(Float.valueOf(f2));
            List<V> arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(kInvoke, arrayList);
            }
            arrayList.add(valueTransform.invoke(Float.valueOf(f2)));
        }
        return linkedHashMap;
    }

    @InterfaceC7395n
    public static final <T> T mgf(@InterfaceC7396q T[] tArr) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        if (tArr.length == 0) {
            return null;
        }
        return tArr[0];
    }

    @InterfaceC7396q
    public static final Set<Byte> mgh(@InterfaceC7396q byte[] bArr, @InterfaceC7396q Iterable<Byte> other) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        Set<Byte> setFs9 = fs9(bArr);
        C6163t.zp(setFs9, other);
        return setFs9;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <R extends Comparable<? super R>> R mh(int[] iArr, cyoe.x2<? super Integer, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Integer.valueOf(iArr[0]));
        n5r1 it = new kotlin.ranges.x2(1, srpc(iArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Integer.valueOf(iArr[it.nextInt()]));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC6234g
    private static final <T> T mho(T[] tArr) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        return tArr[4];
    }

    public static final void mj4s(@InterfaceC7396q long[] jArr, @InterfaceC7396q cyoe.x2<? super Long, was> action) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(action, "action");
        for (long j2 : jArr) {
            action.invoke(Long.valueOf(j2));
        }
    }

    @InterfaceC6234g
    private static final <T> T mjed(T[] tArr, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        return (T) b0(tArr, i2);
    }

    @InterfaceC7396q
    public static final <V> List<V> mjvl(@InterfaceC7396q boolean[] zArr, @InterfaceC7396q boolean[] other, @InterfaceC7396q InterfaceC5979h<? super Boolean, ? super Boolean, ? extends V> transform) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        int iMin = Math.min(zArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i2 = 0; i2 < iMin; i2++) {
            arrayList.add(transform.invoke(Boolean.valueOf(zArr[i2]), Boolean.valueOf(other[i2])));
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final <T> List<T> mk(@InterfaceC7396q T[] tArr) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        if (tArr.length == 0) {
            return kotlin.collections.ni7.a9();
        }
        List<T> listU7oz = u7oz(tArr);
        jk.vep5(listU7oz);
        return listU7oz;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <R> R mkj5(float[] fArr, Comparator<? super R> comparator, cyoe.x2<? super Float, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Float.valueOf(fArr[0]));
        n5r1 it = new kotlin.ranges.x2(1, gto(fArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Float.valueOf(fArr[it.nextInt()]));
            if (comparator.compare(rInvoke, rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    public static final boolean mkmm(@InterfaceC7396q byte[] bArr, @InterfaceC7396q cyoe.x2<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (byte b2 : bArr) {
            if (predicate.invoke(Byte.valueOf(b2)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @InterfaceC7396q
    public static final Set<Boolean> mkxg(@InterfaceC7396q boolean[] zArr, @InterfaceC7396q Iterable<Boolean> other) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        Set<Boolean> setCff0 = cff0(zArr);
        C6163t.vq(setCff0, other);
        return setCff0;
    }

    @kotlin.hyr
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @InterfaceC6769y(name = "flatMapIndexedIterableTo")
    private static final <R, C extends Collection<? super R>> C ml(long[] jArr, C destination, InterfaceC5979h<? super Integer, ? super Long, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        int length = jArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            C6163t.zp(destination, transform.invoke(Integer.valueOf(i3), Long.valueOf(jArr[i2])));
            i2++;
            i3++;
        }
        return destination;
    }

    @InterfaceC7396q
    public static final short[] ml5(@InterfaceC7396q short[] sArr) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        if (sArr.length == 0) {
            return sArr;
        }
        short[] sArrCopyOf = Arrays.copyOf(sArr, sArr.length);
        kotlin.jvm.internal.d2ok.kja0(sArrCopyOf, "copyOf(this, size)");
        kotlin.collections.kja0.uv(sArrCopyOf);
        return sArrCopyOf;
    }

    @InterfaceC7396q
    public static final <V> List<V> mlcd(@InterfaceC7396q char[] cArr, @InterfaceC7396q char[] other, @InterfaceC7396q InterfaceC5979h<? super Character, ? super Character, ? extends V> transform) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        int iMin = Math.min(cArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i2 = 0; i2 < iMin; i2++) {
            arrayList.add(transform.invoke(Character.valueOf(cArr[i2]), Character.valueOf(other[i2])));
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final <C extends Collection<? super Float>> C mle(@InterfaceC7396q float[] fArr, @InterfaceC7396q C destination, @InterfaceC7396q cyoe.x2<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (float f2 : fArr) {
            if (!predicate.invoke(Float.valueOf(f2)).booleanValue()) {
                destination.add(Float.valueOf(f2));
            }
        }
        return destination;
    }

    @InterfaceC7395n
    public static final Integer mm(@InterfaceC7396q int[] iArr) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        if (iArr.length == 1) {
            return Integer.valueOf(iArr[0]);
        }
        return null;
    }

    @kotlin.yz(version = "1.7")
    @InterfaceC6769y(name = "maxWithOrThrow")
    public static final <T> T mmdq(@InterfaceC7396q T[] tArr, @InterfaceC7396q Comparator<? super T> comparator) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        T t2 = tArr[0];
        n5r1 it = new kotlin.ranges.x2(1, gjp(tArr)).iterator();
        while (it.hasNext()) {
            T t3 = tArr[it.nextInt()];
            if (comparator.compare(t2, t3) < 0) {
                t2 = t3;
            }
        }
        return t2;
    }

    @InterfaceC6769y(name = "averageOfInt")
    public static final double mn(@InterfaceC7396q Integer[] numArr) {
        kotlin.jvm.internal.d2ok.m23075h(numArr, "<this>");
        double dIntValue = 0.0d;
        int i2 = 0;
        for (Integer num : numArr) {
            dIntValue += (double) num.intValue();
            i2++;
        }
        if (i2 == 0) {
            return Double.NaN;
        }
        return dIntValue / ((double) i2);
    }

    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final Long mnxh(@InterfaceC7396q long[] jArr) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        if (jArr.length == 0) {
            return null;
        }
        long j2 = jArr[0];
        n5r1 it = new kotlin.ranges.x2(1, hmvj(jArr)).iterator();
        while (it.hasNext()) {
            long j3 = jArr[it.nextInt()];
            if (j2 < j3) {
                j2 = j3;
            }
        }
        return Long.valueOf(j2);
    }

    @InterfaceC7396q
    public static final <K, V> Map<K, List<V>> mo(@InterfaceC7396q char[] cArr, @InterfaceC7396q cyoe.x2<? super Character, ? extends K> keySelector, @InterfaceC7396q cyoe.x2<? super Character, ? extends V> valueTransform) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(keySelector, "keySelector");
        kotlin.jvm.internal.d2ok.m23075h(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (char c2 : cArr) {
            K kInvoke = keySelector.invoke(Character.valueOf(c2));
            List<V> arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(kInvoke, arrayList);
            }
            arrayList.add(valueTransform.invoke(Character.valueOf(c2)));
        }
        return linkedHashMap;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final <R> List<R> mp(float[] fArr, R r2, InterfaceC5979h<? super R, ? super Float, ? extends R> operation) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (fArr.length == 0) {
            return kotlin.collections.zurt.ld6(r2);
        }
        ArrayList arrayList = new ArrayList(fArr.length + 1);
        arrayList.add(r2);
        for (float f2 : fArr) {
            r2 = operation.invoke(r2, Float.valueOf(f2));
            arrayList.add(r2);
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final <T, C extends Collection<? super T>> C mp7a(@InterfaceC7396q T[] tArr, @InterfaceC7396q C destination) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        for (T t2 : tArr) {
            destination.add(t2);
        }
        return destination;
    }

    public static final long mpq(@InterfaceC7396q long[] jArr, @InterfaceC7396q cyoe.x2<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        int length = jArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                long j2 = jArr[length];
                if (!predicate.invoke(Long.valueOf(j2)).booleanValue()) {
                    if (i2 < 0) {
                        break;
                    }
                    length = i2;
                } else {
                    return j2;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @InterfaceC7396q
    public static final List<Integer> mpzf(@InterfaceC7396q int[] iArr, @InterfaceC7396q InterfaceC5979h<? super Integer, ? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = iArr[i2];
            int i5 = i3 + 1;
            if (predicate.invoke(Integer.valueOf(i3), Integer.valueOf(i4)).booleanValue()) {
                arrayList.add(Integer.valueOf(i4));
            }
            i2++;
            i3 = i5;
        }
        return arrayList;
    }

    public static final boolean mq(@InterfaceC7396q float[] fArr) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        return !(fArr.length == 0);
    }

    @InterfaceC6769y(name = "averageOfDouble")
    public static final double mqs(@InterfaceC7396q Double[] dArr) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        double dDoubleValue = 0.0d;
        int i2 = 0;
        for (Double d2 : dArr) {
            dDoubleValue += d2.doubleValue();
            i2++;
        }
        if (i2 == 0) {
            return Double.NaN;
        }
        return dDoubleValue / ((double) i2);
    }

    @kotlin.x2(warningSince = "1.5")
    @kotlin.ld6(message = "Use sumOf instead.", replaceWith = @kotlin.hb(expression = "this.sumOf(selector)", imports = {}))
    public static final int mqz(@InterfaceC7396q double[] dArr, @InterfaceC7396q cyoe.x2<? super Double, Integer> selector) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        int iIntValue = 0;
        for (double d2 : dArr) {
            iIntValue += selector.invoke(Double.valueOf(d2)).intValue();
        }
        return iIntValue;
    }

    @InterfaceC6234g
    private static final char mru(char[] cArr) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        return cArr[1];
    }

    @InterfaceC7396q
    public static final <C extends Collection<? super Boolean>> C ms(@InterfaceC7396q boolean[] zArr, @InterfaceC7396q C destination, @InterfaceC7396q InterfaceC5979h<? super Integer, ? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        int length = zArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            boolean z2 = zArr[i2];
            int i4 = i3 + 1;
            if (predicate.invoke(Integer.valueOf(i3), Boolean.valueOf(z2)).booleanValue()) {
                destination.add(Boolean.valueOf(z2));
            }
            i2++;
            i3 = i4;
        }
        return destination;
    }

    @InterfaceC7396q
    public static final boolean[] mtwi(@InterfaceC7396q boolean[] zArr, @InterfaceC7396q Collection<Integer> indices) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(indices, "indices");
        boolean[] zArr2 = new boolean[indices.size()];
        Iterator<Integer> it = indices.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            zArr2[i2] = zArr[it.next().intValue()];
            i2++;
        }
        return zArr2;
    }

    @InterfaceC7396q
    public static final List<Long> mug(@InterfaceC7396q long[] jArr) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j2 : jArr) {
            arrayList.add(Long.valueOf(j2));
        }
        return arrayList;
    }

    @InterfaceC6234g
    private static final <T> T mv(T[] tArr) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        return tArr[1];
    }

    @InterfaceC7395n
    public static final Byte mwew(@InterfaceC7396q byte[] bArr) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        if (bArr.length == 1) {
            return Byte.valueOf(bArr[0]);
        }
        return null;
    }

    @InterfaceC7396q
    public static final List<Float> mwo2(@InterfaceC7396q float[] fArr, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        if (i2 >= 0) {
            return bd84(fArr, kotlin.ranges.fn3e.fn3e(fArr.length - i2, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
    }

    @kotlin.hyr
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @InterfaceC6769y(name = "flatMapIndexedIterableTo")
    private static final <R, C extends Collection<? super R>> C mwxf(boolean[] zArr, C destination, InterfaceC5979h<? super Integer, ? super Boolean, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        int length = zArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            C6163t.zp(destination, transform.invoke(Integer.valueOf(i3), Boolean.valueOf(zArr[i2])));
            i2++;
            i3++;
        }
        return destination;
    }

    public static int mxfl(@InterfaceC7396q long[] jArr, long j2) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        int length = jArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (j2 == jArr[length]) {
                    return length;
                }
                if (i2 < 0) {
                    break;
                }
                length = i2;
            }
        }
        return -1;
    }

    @InterfaceC7396q
    public static final kotlin.sequences.qrj<Character> mxh(@InterfaceC7396q char[] cArr) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        return cArr.length == 0 ? kotlin.sequences.t8r.f7l8() : new ki(cArr);
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final Double mz(double[] dArr, cyoe.x2<? super Double, Double> selector) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        double dDoubleValue = selector.invoke(Double.valueOf(dArr[0])).doubleValue();
        n5r1 it = new kotlin.ranges.x2(1, f14(dArr)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, selector.invoke(Double.valueOf(dArr[it.nextInt()])).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @InterfaceC7396q
    public static final short[] mzk(@InterfaceC7396q Short[] shArr) {
        kotlin.jvm.internal.d2ok.m23075h(shArr, "<this>");
        int length = shArr.length;
        short[] sArr = new short[length];
        for (int i2 = 0; i2 < length; i2++) {
            sArr[i2] = shArr[i2].shortValue();
        }
        return sArr;
    }

    @InterfaceC7396q
    public static final <K> List<Boolean> mzno(@InterfaceC7396q boolean[] zArr, @InterfaceC7396q cyoe.x2<? super Boolean, ? extends K> selector) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (boolean z2 : zArr) {
            if (hashSet.add(selector.invoke(Boolean.valueOf(z2)))) {
                arrayList.add(Boolean.valueOf(z2));
            }
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final double[] mzq(@InterfaceC7396q double[] dArr) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        if (dArr.length == 0) {
            return dArr;
        }
        double[] dArr2 = new double[dArr.length];
        int iF14 = f14(dArr);
        n5r1 it = new kotlin.ranges.x2(0, iF14).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            dArr2[iF14 - iNextInt] = dArr[iNextInt];
        }
        return dArr2;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final char[] n026(char[] cArr, cyoe.x2<? super Character, was> action) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(action, "action");
        for (char c2 : cArr) {
            action.invoke(Character.valueOf(c2));
        }
        return cArr;
    }

    public static final void n0wh(@InterfaceC7396q byte[] bArr) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        if (bArr.length > 1) {
            kotlin.collections.kja0.zma(bArr);
            lo(bArr);
        }
    }

    @InterfaceC7396q
    public static final <T> C6227f<List<T>, List<T>> n1p9(@InterfaceC7396q T[] tArr, @InterfaceC7396q cyoe.x2<? super T, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (T t2 : tArr) {
            if (predicate.invoke(t2).booleanValue()) {
                arrayList.add(t2);
            } else {
                arrayList2.add(t2);
            }
        }
        return new C6227f<>(arrayList, arrayList2);
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final double n1xt(byte[] bArr, cyoe.x2<? super Byte, Double> selector) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(Byte.valueOf(bArr[0])).doubleValue();
        n5r1 it = new kotlin.ranges.x2(1, vl(bArr)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, selector.invoke(Byte.valueOf(bArr[it.nextInt()])).doubleValue());
        }
        return dDoubleValue;
    }

    @InterfaceC7396q
    public static final List<Character> n2mu(@InterfaceC7396q char[] cArr, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        if (i2 >= 0) {
            return d2(cArr, kotlin.ranges.fn3e.fn3e(cArr.length - i2, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
    }

    @InterfaceC7396q
    public static final double[] n2wl(@InterfaceC7396q double[] dArr, @InterfaceC7396q kotlin.ranges.x2 indices) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(indices, "indices");
        return indices.isEmpty() ? new double[0] : kotlin.collections.kja0.uj2j(dArr, indices.mo2951k().intValue(), indices.zy().intValue() + 1);
    }

    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final <R extends Comparable<? super R>> Double n3(@InterfaceC7396q double[] dArr, @InterfaceC7396q cyoe.x2<? super Double, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        double d2 = dArr[0];
        int iF14 = f14(dArr);
        if (iF14 == 0) {
            return Double.valueOf(d2);
        }
        R rInvoke = selector.invoke(Double.valueOf(d2));
        n5r1 it = new kotlin.ranges.x2(1, iF14).iterator();
        while (it.hasNext()) {
            double d4 = dArr[it.nextInt()];
            R rInvoke2 = selector.invoke(Double.valueOf(d4));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
                d2 = d4;
            }
        }
        return Double.valueOf(d2);
    }

    public static final double n358(@InterfaceC7396q long[] jArr) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        double d2 = 0.0d;
        int i2 = 0;
        for (long j2 : jArr) {
            d2 += j2;
            i2++;
        }
        if (i2 == 0) {
            return Double.NaN;
        }
        return d2 / ((double) i2);
    }

    @InterfaceC7396q
    public static final <T, C extends Collection<? super T>> C n4kc(@InterfaceC7396q T[] tArr, @InterfaceC7396q C destination, @InterfaceC7396q InterfaceC5979h<? super Integer, ? super T, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        int length = tArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            T t2 = tArr[i2];
            int i4 = i3 + 1;
            if (predicate.invoke(Integer.valueOf(i3), t2).booleanValue()) {
                destination.add(t2);
            }
            i2++;
            i3 = i4;
        }
        return destination;
    }

    public static /* synthetic */ String n5(char[] cArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, cyoe.x2 x2Var, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i3 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i3 & 4) == 0 ? charSequence3 : "";
        if ((i3 & 8) != 0) {
            i2 = -1;
        }
        int i4 = i2;
        if ((i3 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i3 & 32) != 0) {
            x2Var = null;
        }
        return puh(cArr, charSequence, charSequence5, charSequence6, i4, charSequence7, x2Var);
    }

    @InterfaceC7395n
    public static final Long n54(@InterfaceC7396q long[] jArr) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        if (jArr.length == 0) {
            return null;
        }
        return Long.valueOf(jArr[jArr.length - 1]);
    }

    @InterfaceC7396q
    public static final <R extends Comparable<? super R>> List<Byte> n551(@InterfaceC7396q byte[] bArr, @InterfaceC7396q cyoe.x2<? super Byte, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        return fzr(bArr, new f7l8.C6179k(selector));
    }

    @InterfaceC7396q
    public static final <C extends Collection<? super Long>> C n6(@InterfaceC7396q long[] jArr, @InterfaceC7396q C destination, @InterfaceC7396q cyoe.x2<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (long j2 : jArr) {
            if (!predicate.invoke(Long.valueOf(j2)).booleanValue()) {
                destination.add(Long.valueOf(j2));
            }
        }
        return destination;
    }

    public static final void n68g(@InterfaceC7396q short[] sArr, @InterfaceC7396q InterfaceC5979h<? super Integer, ? super Short, was> action) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(action, "action");
        int length = sArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            action.invoke(Integer.valueOf(i3), Short.valueOf(sArr[i2]));
            i2++;
            i3++;
        }
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final Character n6e(char[] cArr) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        return r1m3(cArr, AbstractC6332g.Default);
    }

    @InterfaceC7396q
    public static final <A extends Appendable> A n7(@InterfaceC7396q boolean[] zArr, @InterfaceC7396q A buffer, @InterfaceC7396q CharSequence separator, @InterfaceC7396q CharSequence prefix, @InterfaceC7396q CharSequence postfix, int i2, @InterfaceC7396q CharSequence truncated, @InterfaceC7395n cyoe.x2<? super Boolean, ? extends CharSequence> x2Var) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(buffer, "buffer");
        kotlin.jvm.internal.d2ok.m23075h(separator, "separator");
        kotlin.jvm.internal.d2ok.m23075h(prefix, "prefix");
        kotlin.jvm.internal.d2ok.m23075h(postfix, "postfix");
        kotlin.jvm.internal.d2ok.m23075h(truncated, "truncated");
        buffer.append(prefix);
        int i3 = 0;
        for (boolean z2 : zArr) {
            i3++;
            if (i3 > 1) {
                buffer.append(separator);
            }
            if (i2 >= 0 && i3 > i2) {
                break;
            }
            if (x2Var != null) {
                buffer.append(x2Var.invoke(Boolean.valueOf(z2)));
            } else {
                buffer.append(String.valueOf(z2));
            }
        }
        if (i2 >= 0 && i3 > i2) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.3")
    private static final byte n7c(byte[] bArr) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        return j5(bArr, AbstractC6332g.Default);
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @kotlin.hyr
    @InterfaceC6234g
    @kotlin.yz(version = "1.5")
    @InterfaceC6769y(name = "sumOfULong")
    private static final long n7r(double[] dArr, cyoe.x2<? super Double, ikck> selector) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        long jLd6 = ikck.ld6(0L);
        for (double d2 : dArr) {
            jLd6 = ikck.ld6(jLd6 + selector.invoke(Double.valueOf(d2)).a98o());
        }
        return jLd6;
    }

    public static final /* synthetic */ <R> List<R> n8(Object[] objArr) {
        kotlin.jvm.internal.d2ok.m23075h(objArr, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            kotlin.jvm.internal.d2ok.m23086z(3, "R");
            if (obj instanceof Object) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final List<Double> n9(@InterfaceC7396q double[] dArr, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        if (i2 >= 0) {
            return en(dArr, kotlin.ranges.fn3e.fn3e(dArr.length - i2, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
    }

    @InterfaceC7395n
    public static final Byte n96(@InterfaceC7396q byte[] bArr, @InterfaceC7396q cyoe.x2<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        int length = bArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i2 = length - 1;
            byte b2 = bArr[length];
            if (predicate.invoke(Byte.valueOf(b2)).booleanValue()) {
                return Byte.valueOf(b2);
            }
            if (i2 < 0) {
                return null;
            }
            length = i2;
        }
    }

    @kotlin.x2(warningSince = "1.5")
    @kotlin.ld6(message = "Use sumOf instead.", replaceWith = @kotlin.hb(expression = "this.sumOf(selector)", imports = {}))
    public static final int n9t(@InterfaceC7396q boolean[] zArr, @InterfaceC7396q cyoe.x2<? super Boolean, Integer> selector) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        int iIntValue = 0;
        for (boolean z2 : zArr) {
            iIntValue += selector.invoke(Boolean.valueOf(z2)).intValue();
        }
        return iIntValue;
    }

    @InterfaceC7396q
    public static short[] n9v(@InterfaceC7396q short[] sArr) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        if (sArr.length == 0) {
            return sArr;
        }
        short[] sArr2 = new short[sArr.length];
        int iOrxw = orxw(sArr);
        n5r1 it = new kotlin.ranges.x2(0, iOrxw).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            sArr2[iOrxw - iNextInt] = sArr[iNextInt];
        }
        return sArr2;
    }

    @InterfaceC7396q
    public static final <R, V> List<V> n9xu(@InterfaceC7396q char[] cArr, @InterfaceC7396q R[] other, @InterfaceC7396q InterfaceC5979h<? super Character, ? super R, ? extends V> transform) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        int iMin = Math.min(cArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i2 = 0; i2 < iMin; i2++) {
            arrayList.add(transform.invoke(Character.valueOf(cArr[i2]), other[i2]));
        }
        return arrayList;
    }

    @kotlin.x2(warningSince = "1.5")
    @kotlin.ld6(message = "Use sumOf instead.", replaceWith = @kotlin.hb(expression = "this.sumOf(selector)", imports = {}))
    public static final double ncfu(@InterfaceC7396q long[] jArr, @InterfaceC7396q cyoe.x2<? super Long, Double> selector) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        double dDoubleValue = 0.0d;
        for (long j2 : jArr) {
            dDoubleValue += selector.invoke(Long.valueOf(j2)).doubleValue();
        }
        return dDoubleValue;
    }

    @InterfaceC6234g
    private static final int nd(short[] sArr) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        return sArr.length;
    }

    @InterfaceC7395n
    public static final Short nd9(@InterfaceC7396q short[] sArr, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        if (i2 < 0 || i2 > orxw(sArr)) {
            return null;
        }
        return Short.valueOf(sArr[i2]);
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final long[] ne(long[] jArr, cyoe.x2<? super Long, was> action) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(action, "action");
        for (long j2 : jArr) {
            action.invoke(Long.valueOf(j2));
        }
        return jArr;
    }

    @InterfaceC7396q
    public static final List<Integer> nea(@InterfaceC7396q int[] iArr) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        Integer[] numArrCb = kotlin.collections.kja0.cb(iArr);
        kotlin.collections.kja0.anw(numArrCb);
        return kotlin.collections.kja0.m22514i(numArrCb);
    }

    @InterfaceC7396q
    public static final List<Character> nf(@InterfaceC7396q char[] cArr, @InterfaceC7396q cyoe.x2<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (char c2 : cArr) {
            if (!predicate.invoke(Character.valueOf(c2)).booleanValue()) {
                break;
            }
            arrayList.add(Character.valueOf(c2));
        }
        return arrayList;
    }

    @kotlin.x2(errorSince = "1.6", hiddenSince = "1.7", warningSince = "1.4")
    @kotlin.ld6(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use 'indexOfLast { it == element }' instead to continue using this behavior, or '.asList().lastIndexOf(element: T)' to get the same search behavior as in a list.", replaceWith = @kotlin.hb(expression = "indexOfLast { it == element }", imports = {}))
    public static final /* synthetic */ int nfw3(double[] dArr, double d2) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        int length = dArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (d2 == dArr[length]) {
                    return length;
                }
                if (i2 < 0) {
                    break;
                }
                length = i2;
            }
        }
        return -1;
    }

    @InterfaceC6234g
    private static final char ngvg(char[] cArr) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        return cArr[2];
    }

    @InterfaceC7396q
    public static final List<Character> nh(@InterfaceC7396q char[] cArr, @InterfaceC7396q Iterable<Integer> indices) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(indices, "indices");
        int iVyq = kotlin.collections.fu4.vyq(indices, 10);
        if (iVyq == 0) {
            return kotlin.collections.ni7.a9();
        }
        ArrayList arrayList = new ArrayList(iVyq);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(Character.valueOf(cArr[it.next().intValue()]));
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final <R, C extends Collection<? super R>> C nh83(@InterfaceC7396q short[] sArr, @InterfaceC7396q C destination, @InterfaceC7396q cyoe.x2<? super Short, ? extends R> transform) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        for (short s2 : sArr) {
            destination.add(transform.invoke(Short.valueOf(s2)));
        }
        return destination;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <R extends Comparable<? super R>> R nhj(double[] dArr, cyoe.x2<? super Double, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Double.valueOf(dArr[0]));
        n5r1 it = new kotlin.ranges.x2(1, f14(dArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Double.valueOf(dArr[it.nextInt()]));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @kotlin.hyr
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @InterfaceC6769y(name = "sumOfLong")
    private static final long njq(double[] dArr, cyoe.x2<? super Double, Long> selector) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        long jLongValue = 0;
        for (double d2 : dArr) {
            jLongValue += selector.invoke(Double.valueOf(d2)).longValue();
        }
        return jLongValue;
    }

    public static final <R> R nl6(@InterfaceC7396q double[] dArr, R r2, @InterfaceC7396q cyoe.cdj<? super Integer, ? super Double, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        for (int iF14 = f14(dArr); iF14 >= 0; iF14--) {
            r2 = operation.invoke(Integer.valueOf(iF14), Double.valueOf(dArr[iF14]), r2);
        }
        return r2;
    }

    @kotlin.hyr
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @InterfaceC6769y(name = "sumOfLong")
    private static final <T> long nlg(T[] tArr, cyoe.x2<? super T, Long> selector) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        long jLongValue = 0;
        for (T t2 : tArr) {
            jLongValue += selector.invoke(t2).longValue();
        }
        return jLongValue;
    }

    @InterfaceC6234g
    private static final boolean nm(boolean[] zArr) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        return zArr[0];
    }

    @InterfaceC7396q
    public static final <T> T[] nmft(@InterfaceC7396q T[] tArr, @InterfaceC7396q Comparator<? super T> comparator) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        if (tArr.length == 0) {
            return tArr;
        }
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, tArr.length);
        kotlin.jvm.internal.d2ok.kja0(tArr2, "copyOf(this, size)");
        kotlin.collections.kja0.izu(tArr2, comparator);
        return tArr2;
    }

    public static final boolean nn(@InterfaceC7396q boolean[] zArr, @InterfaceC7396q cyoe.cdj<? super Integer, ? super Boolean, ? super Boolean, Boolean> operation) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        int iRl = rl(zArr);
        if (iRl < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        boolean zBooleanValue = zArr[iRl];
        for (int i2 = iRl - 1; i2 >= 0; i2--) {
            zBooleanValue = operation.invoke(Integer.valueOf(i2), Boolean.valueOf(zArr[i2]), Boolean.valueOf(zBooleanValue)).booleanValue();
        }
        return zBooleanValue;
    }

    public static final int nngj(@InterfaceC7396q int[] iArr, @InterfaceC7396q cyoe.x2<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                int i3 = iArr[length];
                if (!predicate.invoke(Integer.valueOf(i3)).booleanValue()) {
                    if (i2 < 0) {
                        break;
                    }
                    length = i2;
                } else {
                    return i3;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @kotlin.yz(version = "1.4")
    public static final void nnx(@InterfaceC7396q byte[] bArr) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        bb9p(bArr, AbstractC6332g.Default);
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <R> R no(short[] sArr, Comparator<? super R> comparator, cyoe.x2<? super Short, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Short.valueOf(sArr[0]));
        n5r1 it = new kotlin.ranges.x2(1, orxw(sArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Short.valueOf(sArr[it.nextInt()]));
            if (comparator.compare(rInvoke, rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @kotlin.yz(version = "1.7")
    @InterfaceC6769y(name = "maxByOrThrow")
    public static final <R extends Comparable<? super R>> char noa(@InterfaceC7396q char[] cArr, @InterfaceC7396q cyoe.x2<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        char c2 = cArr[0];
        int iJ59a = j59a(cArr);
        if (iJ59a == 0) {
            return c2;
        }
        R rInvoke = selector.invoke(Character.valueOf(c2));
        n5r1 it = new kotlin.ranges.x2(1, iJ59a).iterator();
        while (it.hasNext()) {
            char c3 = cArr[it.nextInt()];
            R rInvoke2 = selector.invoke(Character.valueOf(c3));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                c2 = c3;
                rInvoke = rInvoke2;
            }
        }
        return c2;
    }

    @kotlin.x2(warningSince = "1.5")
    @kotlin.ld6(message = "Use sumOf instead.", replaceWith = @kotlin.hb(expression = "this.sumOf(selector)", imports = {}))
    public static final int nou(@InterfaceC7396q char[] cArr, @InterfaceC7396q cyoe.x2<? super Character, Integer> selector) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        int iIntValue = 0;
        for (char c2 : cArr) {
            iIntValue += selector.invoke(Character.valueOf(c2)).intValue();
        }
        return iIntValue;
    }

    public static final void np(@InterfaceC7396q char[] cArr) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        int length = (cArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int iJ59a = j59a(cArr);
        n5r1 it = new kotlin.ranges.x2(0, length).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            char c2 = cArr[iNextInt];
            cArr[iNextInt] = cArr[iJ59a];
            cArr[iJ59a] = c2;
            iJ59a--;
        }
    }

    public static final <R> R npjo(@InterfaceC7396q double[] dArr, R r2, @InterfaceC7396q cyoe.cdj<? super Integer, ? super R, ? super Double, ? extends R> operation) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        int length = dArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            r2 = operation.invoke(Integer.valueOf(i3), r2, Double.valueOf(dArr[i2]));
            i2++;
            i3++;
        }
        return r2;
    }

    @kotlin.hyr
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @InterfaceC6769y(name = "sumOfDouble")
    private static final <T> double nr(T[] tArr, cyoe.x2<? super T, Double> selector) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        double dDoubleValue = 0.0d;
        for (T t2 : tArr) {
            dDoubleValue += selector.invoke(t2).doubleValue();
        }
        return dDoubleValue;
    }

    @InterfaceC6234g
    private static final short nr0(short[] sArr) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        return sArr[4];
    }

    @InterfaceC6234g
    private static final boolean nrcs(boolean[] zArr) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        return zArr[2];
    }

    @InterfaceC6234g
    private static final short nrys(short[] sArr) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        return sArr[3];
    }

    @InterfaceC7396q
    public static final Set<Short> ns20(@InterfaceC7396q short[] sArr) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        int length = sArr.length;
        return length != 0 ? length != 1 ? (Set) l0e(sArr, new LinkedHashSet(C6140e.m22479p(sArr.length))) : i1.m22499g(Short.valueOf(sArr[0])) : a98o.ld6();
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <R> R nsiv(short[] sArr, Comparator<? super R> comparator, cyoe.x2<? super Short, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Short.valueOf(sArr[0]));
        n5r1 it = new kotlin.ranges.x2(1, orxw(sArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Short.valueOf(sArr[it.nextInt()]));
            if (comparator.compare(rInvoke, rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC7396q
    public static final <R extends Comparable<? super R>> List<Integer> nsr(@InterfaceC7396q int[] iArr, @InterfaceC7396q cyoe.x2<? super Integer, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        return t7j(iArr, new f7l8.zy(selector));
    }

    public static final boolean nt(@InterfaceC7396q boolean[] zArr, @InterfaceC7396q cyoe.x2<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        int length = zArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                boolean z2 = zArr[length];
                if (!predicate.invoke(Boolean.valueOf(z2)).booleanValue()) {
                    if (i2 < 0) {
                        break;
                    }
                    length = i2;
                } else {
                    return z2;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @InterfaceC7396q
    public static final long[] nt6s(@InterfaceC7396q long[] jArr) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        if (jArr.length == 0) {
            return jArr;
        }
        long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
        kotlin.jvm.internal.d2ok.kja0(jArrCopyOf, "copyOf(this, size)");
        e58q(jArrCopyOf);
        return jArrCopyOf;
    }

    @kotlin.yz(version = "1.7")
    @InterfaceC6769y(name = "maxOrThrow")
    public static final float nufx(@InterfaceC7396q Float[] fArr) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = fArr[0].floatValue();
        n5r1 it = new kotlin.ranges.x2(1, gjp(fArr)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, fArr[it.nextInt()].floatValue());
        }
        return fFloatValue;
    }

    @InterfaceC7396q
    public static final <R> List<C6227f<Byte, R>> nust(@InterfaceC7396q byte[] bArr, @InterfaceC7396q R[] other) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        int iMin = Math.min(bArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i2 = 0; i2 < iMin; i2++) {
            byte b2 = bArr[i2];
            arrayList.add(kotlin.nmn5.m23230k(Byte.valueOf(b2), other[i2]));
        }
        return arrayList;
    }

    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final Character nv(@InterfaceC7396q char[] cArr) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        if (cArr.length == 0) {
            return null;
        }
        char c2 = cArr[0];
        n5r1 it = new kotlin.ranges.x2(1, j59a(cArr)).iterator();
        while (it.hasNext()) {
            char c3 = cArr[it.nextInt()];
            if (kotlin.jvm.internal.d2ok.m23076i(c2, c3) > 0) {
                c2 = c3;
            }
        }
        return Character.valueOf(c2);
    }

    @kotlin.yz(version = "1.7")
    @InterfaceC6769y(name = "maxWithOrThrow")
    public static final float nvn(@InterfaceC7396q float[] fArr, @InterfaceC7396q Comparator<? super Float> comparator) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        float f2 = fArr[0];
        n5r1 it = new kotlin.ranges.x2(1, gto(fArr)).iterator();
        while (it.hasNext()) {
            float f3 = fArr[it.nextInt()];
            if (comparator.compare(Float.valueOf(f2), Float.valueOf(f3)) < 0) {
                f2 = f3;
            }
        }
        return f2;
    }

    public static final char nvs3(@InterfaceC7396q char[] cArr, @InterfaceC7396q cyoe.cdj<? super Integer, ? super Character, ? super Character, Character> operation) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        int iJ59a = j59a(cArr);
        if (iJ59a < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        char cCharValue = cArr[iJ59a];
        for (int i2 = iJ59a - 1; i2 >= 0; i2--) {
            cCharValue = operation.invoke(Integer.valueOf(i2), Character.valueOf(cArr[i2]), Character.valueOf(cCharValue)).charValue();
        }
        return cCharValue;
    }

    public static final long nw(@InterfaceC7396q long[] jArr, @InterfaceC7396q cyoe.x2<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        Long lValueOf = null;
        boolean z2 = false;
        for (long j2 : jArr) {
            if (predicate.invoke(Long.valueOf(j2)).booleanValue()) {
                if (z2) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                lValueOf = Long.valueOf(j2);
                z2 = true;
            }
        }
        if (!z2) {
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        kotlin.jvm.internal.d2ok.n7h(lValueOf, "null cannot be cast to non-null type kotlin.Long");
        return lValueOf.longValue();
    }

    @InterfaceC7396q
    public static final <T, K> Map<K, List<T>> nxzp(@InterfaceC7396q T[] tArr, @InterfaceC7396q cyoe.x2<? super T, ? extends K> keySelector) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t2 : tArr) {
            K kInvoke = keySelector.invoke(t2);
            Object arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(t2);
        }
        return linkedHashMap;
    }

    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final Float ny6p(@InterfaceC7396q float[] fArr) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        float fMin = fArr[0];
        n5r1 it = new kotlin.ranges.x2(1, gto(fArr)).iterator();
        while (it.hasNext()) {
            fMin = Math.min(fMin, fArr[it.nextInt()]);
        }
        return Float.valueOf(fMin);
    }

    @InterfaceC7396q
    public static final <A extends Appendable> A nyhr(@InterfaceC7396q short[] sArr, @InterfaceC7396q A buffer, @InterfaceC7396q CharSequence separator, @InterfaceC7396q CharSequence prefix, @InterfaceC7396q CharSequence postfix, int i2, @InterfaceC7396q CharSequence truncated, @InterfaceC7395n cyoe.x2<? super Short, ? extends CharSequence> x2Var) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(buffer, "buffer");
        kotlin.jvm.internal.d2ok.m23075h(separator, "separator");
        kotlin.jvm.internal.d2ok.m23075h(prefix, "prefix");
        kotlin.jvm.internal.d2ok.m23075h(postfix, "postfix");
        kotlin.jvm.internal.d2ok.m23075h(truncated, "truncated");
        buffer.append(prefix);
        int i3 = 0;
        for (short s2 : sArr) {
            i3++;
            if (i3 > 1) {
                buffer.append(separator);
            }
            if (i2 >= 0 && i3 > i2) {
                break;
            }
            if (x2Var != null) {
                buffer.append(x2Var.invoke(Short.valueOf(s2)));
            } else {
                buffer.append(String.valueOf((int) s2));
            }
        }
        if (i2 >= 0 && i3 > i2) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    @InterfaceC7396q
    public static final <R, C extends Collection<? super R>> C nz77(@InterfaceC7396q long[] jArr, @InterfaceC7396q C destination, @InterfaceC7396q cyoe.x2<? super Long, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        for (long j2 : jArr) {
            C6163t.zp(destination, transform.invoke(Long.valueOf(j2)));
        }
        return destination;
    }

    @InterfaceC7396q
    public static final List<Double> nzoy(@InterfaceC7396q double[] dArr, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
        }
        if (i2 == 0) {
            return kotlin.collections.ni7.a9();
        }
        if (i2 >= dArr.length) {
            return ok4l(dArr);
        }
        if (i2 == 1) {
            return kotlin.collections.zurt.ld6(Double.valueOf(dArr[0]));
        }
        ArrayList arrayList = new ArrayList(i2);
        int i3 = 0;
        for (double d2 : dArr) {
            arrayList.add(Double.valueOf(d2));
            i3++;
            if (i3 == i2) {
                break;
            }
        }
        return arrayList;
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final Boolean o0t(@InterfaceC7396q boolean[] zArr, @InterfaceC7396q AbstractC6332g random) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(random, "random");
        if (zArr.length == 0) {
            return null;
        }
        return Boolean.valueOf(zArr[random.nextInt(zArr.length)]);
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <R> R o18(boolean[] zArr, Comparator<? super R> comparator, cyoe.x2<? super Boolean, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (zArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Boolean.valueOf(zArr[0]));
        n5r1 it = new kotlin.ranges.x2(1, rl(zArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Boolean.valueOf(zArr[it.nextInt()]));
            if (comparator.compare(rInvoke, rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC7396q
    public static final List<Boolean> o1sk(@InterfaceC7396q boolean[] zArr, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
        }
        if (i2 == 0) {
            return kotlin.collections.ni7.a9();
        }
        if (i2 >= zArr.length) {
            return w4de(zArr);
        }
        if (i2 == 1) {
            return kotlin.collections.zurt.ld6(Boolean.valueOf(zArr[0]));
        }
        ArrayList arrayList = new ArrayList(i2);
        int i3 = 0;
        for (boolean z2 : zArr) {
            arrayList.add(Boolean.valueOf(z2));
            i3++;
            if (i3 == i2) {
                break;
            }
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final List<Integer> o2(@InterfaceC7396q int[] iArr, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        if (i2 >= 0) {
            return i2(iArr, kotlin.ranges.fn3e.fn3e(iArr.length - i2, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
    }

    public static final <R> R o2sn(@InterfaceC7396q byte[] bArr, R r2, @InterfaceC7396q cyoe.cdj<? super Integer, ? super R, ? super Byte, ? extends R> operation) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            r2 = operation.invoke(Integer.valueOf(i3), r2, Byte.valueOf(bArr[i2]));
            i2++;
            i3++;
        }
        return r2;
    }

    @InterfaceC7396q
    public static final <T, C extends Collection<? super T>> C o3(@InterfaceC7396q T[] tArr, @InterfaceC7396q C destination, @InterfaceC7396q cyoe.x2<? super T, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (T t2 : tArr) {
            if (!predicate.invoke(t2).booleanValue()) {
                destination.add(t2);
            }
        }
        return destination;
    }

    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final Byte o3u0(@InterfaceC7396q byte[] bArr) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        if (bArr.length == 0) {
            return null;
        }
        byte b2 = bArr[0];
        n5r1 it = new kotlin.ranges.x2(1, vl(bArr)).iterator();
        while (it.hasNext()) {
            byte b3 = bArr[it.nextInt()];
            if (b2 > b3) {
                b2 = b3;
            }
        }
        return Byte.valueOf(b2);
    }

    @InterfaceC7395n
    public static final Boolean o4(@InterfaceC7396q boolean[] zArr, @InterfaceC7396q cyoe.x2<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (boolean z2 : zArr) {
            if (predicate.invoke(Boolean.valueOf(z2)).booleanValue()) {
                return Boolean.valueOf(z2);
            }
        }
        return null;
    }

    @InterfaceC7396q
    public static final Set<Boolean> o6(@InterfaceC7396q boolean[] zArr) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        int length = zArr.length;
        return length != 0 ? length != 1 ? (Set) p7p2(zArr, new LinkedHashSet(C6140e.m22479p(zArr.length))) : i1.m22499g(Boolean.valueOf(zArr[0])) : a98o.ld6();
    }

    @kotlin.yz(version = "1.4")
    public static final void o6t(@InterfaceC7396q char[] cArr, @InterfaceC7396q AbstractC6332g random) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(random, "random");
        for (int iJ59a = j59a(cArr); iJ59a > 0; iJ59a--) {
            int iNextInt = random.nextInt(iJ59a + 1);
            char c2 = cArr[iJ59a];
            cArr[iJ59a] = cArr[iNextInt];
            cArr[iNextInt] = c2;
        }
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final boolean[] o703(boolean[] zArr, InterfaceC5979h<? super Integer, ? super Boolean, was> action) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(action, "action");
        int length = zArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            action.invoke(Integer.valueOf(i3), Boolean.valueOf(zArr[i2]));
            i2++;
            i3++;
        }
        return zArr;
    }

    @InterfaceC6769y(name = "sumOfInt")
    public static final int o7h(@InterfaceC7396q Integer[] numArr) {
        kotlin.jvm.internal.d2ok.m23075h(numArr, "<this>");
        int iIntValue = 0;
        for (Integer num : numArr) {
            iIntValue += num.intValue();
        }
        return iIntValue;
    }

    @InterfaceC7396q
    public static final <R> List<R> o7w(@InterfaceC7396q long[] jArr, @InterfaceC7396q cyoe.x2<? super Long, ? extends R> transform) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j2 : jArr) {
            arrayList.add(transform.invoke(Long.valueOf(j2)));
        }
        return arrayList;
    }

    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final Boolean o9ja(@InterfaceC7396q boolean[] zArr, @InterfaceC7396q cyoe.cdj<? super Integer, ? super Boolean, ? super Boolean, Boolean> operation) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (zArr.length == 0) {
            return null;
        }
        boolean zBooleanValue = zArr[0];
        n5r1 it = new kotlin.ranges.x2(1, rl(zArr)).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            zBooleanValue = operation.invoke(Integer.valueOf(iNextInt), Boolean.valueOf(zBooleanValue), Boolean.valueOf(zArr[iNextInt])).booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    @InterfaceC7395n
    public static final Short o9qk(@InterfaceC7396q short[] sArr) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        if (sArr.length == 0) {
            return null;
        }
        return Short.valueOf(sArr[sArr.length - 1]);
    }

    public static final <T> void oa(@InterfaceC7396q T[] tArr, @InterfaceC7396q cyoe.x2<? super T, was> action) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(action, "action");
        for (T t2 : tArr) {
            action.invoke(t2);
        }
    }

    @kotlin.yz(version = "1.4")
    public static final void oa6p(@InterfaceC7396q long[] jArr, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.collections.kja0.sj(jArr, i2, i3);
        aiyx(jArr, i2, i3);
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.3")
    private static final int oay(int[] iArr) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        return c7hg(iArr, AbstractC6332g.Default);
    }

    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final Float ob6y(@InterfaceC7396q float[] fArr, @InterfaceC7396q Comparator<? super Float> comparator) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        if (fArr.length == 0) {
            return null;
        }
        float f2 = fArr[0];
        n5r1 it = new kotlin.ranges.x2(1, gto(fArr)).iterator();
        while (it.hasNext()) {
            float f3 = fArr[it.nextInt()];
            if (comparator.compare(Float.valueOf(f2), Float.valueOf(f3)) < 0) {
                f2 = f3;
            }
        }
        return Float.valueOf(f2);
    }

    public static final void ob7(@InterfaceC7396q char[] cArr, @InterfaceC7396q InterfaceC5979h<? super Integer, ? super Character, was> action) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(action, "action");
        int length = cArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            action.invoke(Integer.valueOf(i3), Character.valueOf(cArr[i2]));
            i2++;
            i3++;
        }
    }

    @kotlin.hyr
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @InterfaceC6769y(name = "sumOfInt")
    private static final int ocl(byte[] bArr, cyoe.x2<? super Byte, Integer> selector) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        int iIntValue = 0;
        for (byte b2 : bArr) {
            iIntValue += selector.invoke(Byte.valueOf(b2)).intValue();
        }
        return iIntValue;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final double oclb(float[] fArr, cyoe.x2<? super Float, Double> selector) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(Float.valueOf(fArr[0])).doubleValue();
        n5r1 it = new kotlin.ranges.x2(1, gto(fArr)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, selector.invoke(Float.valueOf(fArr[it.nextInt()])).doubleValue());
        }
        return dDoubleValue;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final double[] oct(double[] dArr, InterfaceC5979h<? super Integer, ? super Double, was> action) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(action, "action");
        int length = dArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            action.invoke(Integer.valueOf(i3), Double.valueOf(dArr[i2]));
            i2++;
            i3++;
        }
        return dArr;
    }

    @InterfaceC7396q
    public static final float[] oe42(@InterfaceC7396q Float[] fArr) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        int length = fArr.length;
        float[] fArr2 = new float[length];
        for (int i2 = 0; i2 < length; i2++) {
            fArr2[i2] = fArr[i2].floatValue();
        }
        return fArr2;
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final <R> List<R> oeke(boolean[] zArr, R r2, InterfaceC5979h<? super R, ? super Boolean, ? extends R> operation) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (zArr.length == 0) {
            return kotlin.collections.zurt.ld6(r2);
        }
        ArrayList arrayList = new ArrayList(zArr.length + 1);
        arrayList.add(r2);
        for (boolean z2 : zArr) {
            r2 = operation.invoke(r2, Boolean.valueOf(z2));
            arrayList.add(r2);
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final <K> Map<K, List<Float>> of0c(@InterfaceC7396q float[] fArr, @InterfaceC7396q cyoe.x2<? super Float, ? extends K> keySelector) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (float f2 : fArr) {
            K kInvoke = keySelector.invoke(Float.valueOf(f2));
            Object arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(Float.valueOf(f2));
        }
        return linkedHashMap;
    }

    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final <T> T ogyu(@InterfaceC7396q T[] tArr, @InterfaceC7396q Comparator<? super T> comparator) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        if (tArr.length == 0) {
            return null;
        }
        T t2 = tArr[0];
        n5r1 it = new kotlin.ranges.x2(1, gjp(tArr)).iterator();
        while (it.hasNext()) {
            T t3 = tArr[it.nextInt()];
            if (comparator.compare(t2, t3) > 0) {
                t2 = t3;
            }
        }
        return t2;
    }

    @InterfaceC7395n
    public static final Character ohc0(@InterfaceC7396q char[] cArr) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        if (cArr.length == 1) {
            return Character.valueOf(cArr[0]);
        }
        return null;
    }

    public static final boolean oiz(@InterfaceC7396q float[] fArr) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        return fArr.length == 0;
    }

    @InterfaceC7396q
    public static final <R, C extends Collection<? super R>> C oj(@InterfaceC7396q double[] dArr, @InterfaceC7396q C destination, @InterfaceC7396q cyoe.x2<? super Double, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        for (double d2 : dArr) {
            C6163t.zp(destination, transform.invoke(Double.valueOf(d2)));
        }
        return destination;
    }

    @kotlin.x2(warningSince = "1.5")
    @kotlin.ld6(message = "Use sumOf instead.", replaceWith = @kotlin.hb(expression = "this.sumOf(selector)", imports = {}))
    public static final double ojf7(@InterfaceC7396q char[] cArr, @InterfaceC7396q cyoe.x2<? super Character, Double> selector) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        double dDoubleValue = 0.0d;
        for (char c2 : cArr) {
            dDoubleValue += selector.invoke(Character.valueOf(c2)).doubleValue();
        }
        return dDoubleValue;
    }

    @InterfaceC7396q
    public static final List<Double> ok4l(@InterfaceC7396q double[] dArr) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        int length = dArr.length;
        return length != 0 ? length != 1 ? j60k(dArr) : kotlin.collections.zurt.ld6(Double.valueOf(dArr[0])) : kotlin.collections.ni7.a9();
    }

    public static int oklc(@InterfaceC7396q int[] iArr) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        int length = iArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return iArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final short[] ol(short[] sArr, InterfaceC5979h<? super Integer, ? super Short, was> action) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(action, "action");
        int length = sArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            action.invoke(Integer.valueOf(i3), Short.valueOf(sArr[i2]));
            i2++;
            i3++;
        }
        return sArr;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final int[] ol6(int[] iArr, InterfaceC5979h<? super Integer, ? super Integer, was> action) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(action, "action");
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            action.invoke(Integer.valueOf(i3), Integer.valueOf(iArr[i2]));
            i2++;
            i3++;
        }
        return iArr;
    }

    public static final <T> T olea(@InterfaceC7396q T[] tArr, @InterfaceC7396q cyoe.x2<? super T, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        int length = tArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                T t2 = tArr[length];
                if (!predicate.invoke(t2).booleanValue()) {
                    if (i2 < 0) {
                        break;
                    }
                    length = i2;
                } else {
                    return t2;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @InterfaceC7396q
    public static final <K, V, M extends Map<? super K, ? super V>> M olj(@InterfaceC7396q long[] jArr, @InterfaceC7396q M destination, @InterfaceC7396q cyoe.x2<? super Long, ? extends K> keySelector, @InterfaceC7396q cyoe.x2<? super Long, ? extends V> valueTransform) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(keySelector, "keySelector");
        kotlin.jvm.internal.d2ok.m23075h(valueTransform, "valueTransform");
        for (long j2 : jArr) {
            destination.put(keySelector.invoke(Long.valueOf(j2)), valueTransform.invoke(Long.valueOf(j2)));
        }
        return destination;
    }

    @InterfaceC7396q
    public static long[] oml3(@InterfaceC7396q long[] jArr, @InterfaceC7396q Collection<Integer> indices) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(indices, "indices");
        long[] jArr2 = new long[indices.size()];
        Iterator<Integer> it = indices.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            jArr2[i2] = jArr[it.next().intValue()];
            i2++;
        }
        return jArr2;
    }

    @kotlin.yz(version = "1.4")
    public static final void omp0(@InterfaceC7396q short[] sArr) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        psl(sArr, AbstractC6332g.Default);
    }

    @kotlin.x2(warningSince = "1.5")
    @kotlin.ld6(message = "Use sumOf instead.", replaceWith = @kotlin.hb(expression = "this.sumOf(selector)", imports = {}))
    public static final double on(@InterfaceC7396q float[] fArr, @InterfaceC7396q cyoe.x2<? super Float, Double> selector) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        double dDoubleValue = 0.0d;
        for (float f2 : fArr) {
            dDoubleValue += selector.invoke(Float.valueOf(f2)).doubleValue();
        }
        return dDoubleValue;
    }

    @InterfaceC7396q
    public static final List<Double> onc0(@InterfaceC7396q double[] dArr, @InterfaceC7396q Comparator<? super Double> comparator) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        Double[] dArrLn = kotlin.collections.kja0.ln(dArr);
        kotlin.collections.kja0.izu(dArrLn, comparator);
        return kotlin.collections.kja0.m22514i(dArrLn);
    }

    @InterfaceC6234g
    private static final boolean onm(float[] fArr) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        return fArr.length == 0;
    }

    public static final short onr(@InterfaceC7396q short[] sArr, @InterfaceC7396q cyoe.x2<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        Short shValueOf = null;
        boolean z2 = false;
        for (short s2 : sArr) {
            if (predicate.invoke(Short.valueOf(s2)).booleanValue()) {
                if (z2) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                shValueOf = Short.valueOf(s2);
                z2 = true;
            }
        }
        if (!z2) {
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        kotlin.jvm.internal.d2ok.n7h(shValueOf, "null cannot be cast to non-null type kotlin.Short");
        return shValueOf.shortValue();
    }

    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final <S, T extends S> S ooq6(@InterfaceC7396q T[] tArr, @InterfaceC7396q cyoe.cdj<? super Integer, ? super S, ? super T, ? extends S> operation) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (tArr.length == 0) {
            return null;
        }
        S sInvoke = (S) tArr[0];
        n5r1 it = new kotlin.ranges.x2(1, gjp(tArr)).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            sInvoke = operation.invoke(Integer.valueOf(iNextInt), sInvoke, (Object) tArr[iNextInt]);
        }
        return sInvoke;
    }

    @InterfaceC7395n
    public static final Float ooto(@InterfaceC7396q float[] fArr, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        if (i2 < 0 || i2 > gto(fArr)) {
            return null;
        }
        return Float.valueOf(fArr[i2]);
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <R extends Comparable<? super R>> R op7r(short[] sArr, cyoe.x2<? super Short, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Short.valueOf(sArr[0]));
        n5r1 it = new kotlin.ranges.x2(1, orxw(sArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Short.valueOf(sArr[it.nextInt()]));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC6234g
    private static final Short oqy(short[] sArr, cyoe.x2<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        int length = sArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                short s2 = sArr[length];
                if (predicate.invoke(Short.valueOf(s2)).booleanValue()) {
                    return Short.valueOf(s2);
                }
                if (i2 < 0) {
                    break;
                }
                length = i2;
            }
        }
        return null;
    }

    public static final byte or1(@InterfaceC7396q byte[] bArr, @InterfaceC7396q cyoe.x2<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        Byte bValueOf = null;
        boolean z2 = false;
        for (byte b2 : bArr) {
            if (predicate.invoke(Byte.valueOf(b2)).booleanValue()) {
                if (z2) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                bValueOf = Byte.valueOf(b2);
                z2 = true;
            }
        }
        if (!z2) {
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        kotlin.jvm.internal.d2ok.n7h(bValueOf, "null cannot be cast to non-null type kotlin.Byte");
        return bValueOf.byteValue();
    }

    public static int orxw(@InterfaceC7396q short[] sArr) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        return sArr.length - 1;
    }

    @InterfaceC7396q
    public static final List<Short> os3j(@InterfaceC7396q short[] sArr, @InterfaceC7396q cyoe.x2<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (short s2 : sArr) {
            if (!predicate.invoke(Short.valueOf(s2)).booleanValue()) {
                arrayList.add(Short.valueOf(s2));
            }
        }
        return arrayList;
    }

    @kotlin.hyr
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @InterfaceC6769y(name = "sumOfLong")
    private static final long os4s(byte[] bArr, cyoe.x2<? super Byte, Long> selector) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        long jLongValue = 0;
        for (byte b2 : bArr) {
            jLongValue += selector.invoke(Byte.valueOf(b2)).longValue();
        }
        return jLongValue;
    }

    public static final <R> R osq(@InterfaceC7396q short[] sArr, R r2, @InterfaceC7396q cyoe.cdj<? super Integer, ? super R, ? super Short, ? extends R> operation) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        int length = sArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            r2 = operation.invoke(Integer.valueOf(i3), r2, Short.valueOf(sArr[i2]));
            i2++;
            i3++;
        }
        return r2;
    }

    @InterfaceC7396q
    public static final <T> List<T> otl(@InterfaceC7396q T[] tArr, @InterfaceC7396q cyoe.x2<? super T, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (T t2 : tArr) {
            if (!predicate.invoke(t2).booleanValue()) {
                break;
            }
            arrayList.add(t2);
        }
        return arrayList;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final Float ots(char[] cArr, cyoe.x2<? super Character, Float> selector) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        float fFloatValue = selector.invoke(Character.valueOf(cArr[0])).floatValue();
        n5r1 it = new kotlin.ranges.x2(1, j59a(cArr)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, selector.invoke(Character.valueOf(cArr[it.nextInt()])).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final <R> List<R> ou1(byte[] bArr, R r2, InterfaceC5979h<? super R, ? super Byte, ? extends R> operation) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (bArr.length == 0) {
            return kotlin.collections.zurt.ld6(r2);
        }
        ArrayList arrayList = new ArrayList(bArr.length + 1);
        arrayList.add(r2);
        for (byte b2 : bArr) {
            r2 = operation.invoke(r2, Byte.valueOf(b2));
            arrayList.add(r2);
        }
        return arrayList;
    }

    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final <T, R extends Comparable<? super R>> T ovu0(@InterfaceC7396q T[] tArr, @InterfaceC7396q cyoe.x2<? super T, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        T t2 = tArr[0];
        int iGjp = gjp(tArr);
        if (iGjp == 0) {
            return t2;
        }
        R rInvoke = selector.invoke(t2);
        n5r1 it = new kotlin.ranges.x2(1, iGjp).iterator();
        while (it.hasNext()) {
            T t3 = tArr[it.nextInt()];
            R rInvoke2 = selector.invoke(t3);
            if (rInvoke.compareTo(rInvoke2) < 0) {
                t2 = t3;
                rInvoke = rInvoke2;
            }
        }
        return t2;
    }

    @InterfaceC7396q
    public static final <R> List<R> ow(@InterfaceC7396q boolean[] zArr, @InterfaceC7396q cyoe.x2<? super Boolean, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (boolean z2 : zArr) {
            C6163t.zp(arrayList, transform.invoke(Boolean.valueOf(z2)));
        }
        return arrayList;
    }

    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final Float ow0(@InterfaceC7396q Float[] fArr) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        float fFloatValue = fArr[0].floatValue();
        n5r1 it = new kotlin.ranges.x2(1, gjp(fArr)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, fArr[it.nextInt()].floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    public static long ow8(@InterfaceC7396q long[] jArr) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        int length = jArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return jArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    @InterfaceC7396q
    public static final List<Float> ox6n(@InterfaceC7396q float[] fArr) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        return a9.wr(w1s(fArr));
    }

    @InterfaceC7396q
    public static final List<Short> oy(@InterfaceC7396q short[] sArr) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        short[] sArrCopyOf = Arrays.copyOf(sArr, sArr.length);
        kotlin.jvm.internal.d2ok.kja0(sArrCopyOf, "copyOf(this, size)");
        kotlin.collections.kja0.uv(sArrCopyOf);
        return q68v(sArrCopyOf);
    }

    public static final <T> int oz47(@InterfaceC7396q T[] tArr, T t2) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        if (t2 == null) {
            int length = tArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i2 = length - 1;
                    if (tArr[length] == null) {
                        return length;
                    }
                    if (i2 < 0) {
                        break;
                    }
                    length = i2;
                }
            }
        } else {
            int length2 = tArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i3 = length2 - 1;
                    if (kotlin.jvm.internal.d2ok.f7l8(t2, tArr[length2])) {
                        return length2;
                    }
                    if (i3 < 0) {
                        break;
                    }
                    length2 = i3;
                }
            }
        }
        return -1;
    }

    @kotlin.hyr
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @InterfaceC6769y(name = "flatMapIndexedIterable")
    private static final <R> List<R> ozfn(boolean[] zArr, InterfaceC5979h<? super Integer, ? super Boolean, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = zArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            C6163t.zp(arrayList, transform.invoke(Integer.valueOf(i3), Boolean.valueOf(zArr[i2])));
            i2++;
            i3++;
        }
        return arrayList;
    }

    @kotlin.x2(warningSince = "1.5")
    @kotlin.ld6(message = "Use sumOf instead.", replaceWith = @kotlin.hb(expression = "this.sumOf(selector)", imports = {}))
    public static final <T> double p05g(@InterfaceC7396q T[] tArr, @InterfaceC7396q cyoe.x2<? super T, Double> selector) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        double dDoubleValue = 0.0d;
        for (T t2 : tArr) {
            dDoubleValue += selector.invoke(t2).doubleValue();
        }
        return dDoubleValue;
    }

    @kotlin.yz(version = "1.7")
    @InterfaceC6769y(name = "minWithOrThrow")
    public static final byte p1(@InterfaceC7396q byte[] bArr, @InterfaceC7396q Comparator<? super Byte> comparator) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        byte b2 = bArr[0];
        n5r1 it = new kotlin.ranges.x2(1, vl(bArr)).iterator();
        while (it.hasNext()) {
            byte b3 = bArr[it.nextInt()];
            if (comparator.compare(Byte.valueOf(b2), Byte.valueOf(b3)) > 0) {
                b2 = b3;
            }
        }
        return b2;
    }

    @InterfaceC7396q
    public static final List<Short> p1s7(@InterfaceC7396q short[] sArr, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
        }
        if (i2 == 0) {
            return kotlin.collections.ni7.a9();
        }
        int length = sArr.length;
        if (i2 >= length) {
            return l8(sArr);
        }
        if (i2 == 1) {
            return kotlin.collections.zurt.ld6(Short.valueOf(sArr[length - 1]));
        }
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = length - i2; i3 < length; i3++) {
            arrayList.add(Short.valueOf(sArr[i3]));
        }
        return arrayList;
    }

    @InterfaceC6769y(name = "averageOfLong")
    public static final double p1t5(@InterfaceC7396q Long[] lArr) {
        kotlin.jvm.internal.d2ok.m23075h(lArr, "<this>");
        double dLongValue = 0.0d;
        int i2 = 0;
        for (Long l2 : lArr) {
            dLongValue += l2.longValue();
            i2++;
        }
        if (i2 == 0) {
            return Double.NaN;
        }
        return dLongValue / ((double) i2);
    }

    @InterfaceC7395n
    public static final Float p2(@InterfaceC7396q float[] fArr, @InterfaceC7396q cyoe.x2<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (float f2 : fArr) {
            if (predicate.invoke(Float.valueOf(f2)).booleanValue()) {
                return Float.valueOf(f2);
            }
        }
        return null;
    }

    public static boolean p2sg(@InterfaceC7396q long[] jArr, long j2) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        return que(jArr, j2) >= 0;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <R> R p3(long[] jArr, Comparator<? super R> comparator, cyoe.x2<? super Long, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Long.valueOf(jArr[0]));
        n5r1 it = new kotlin.ranges.x2(1, hmvj(jArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Long.valueOf(jArr[it.nextInt()]));
            if (comparator.compare(rInvoke, rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC7396q
    public static final Iterable<x9kr<Byte>> p39g(@InterfaceC7396q byte[] bArr) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        return new ncyb(new fn3e(bArr));
    }

    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final <R extends Comparable<? super R>> Long p4(@InterfaceC7396q long[] jArr, @InterfaceC7396q cyoe.x2<? super Long, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        long j2 = jArr[0];
        int iHmvj = hmvj(jArr);
        if (iHmvj == 0) {
            return Long.valueOf(j2);
        }
        R rInvoke = selector.invoke(Long.valueOf(j2));
        n5r1 it = new kotlin.ranges.x2(1, iHmvj).iterator();
        while (it.hasNext()) {
            long j3 = jArr[it.nextInt()];
            R rInvoke2 = selector.invoke(Long.valueOf(j3));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
                j2 = j3;
            }
        }
        return Long.valueOf(j2);
    }

    public static final char p4g(@InterfaceC7396q char[] cArr, @InterfaceC7396q cyoe.x2<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        Character chValueOf = null;
        boolean z2 = false;
        for (char c2 : cArr) {
            if (predicate.invoke(Character.valueOf(c2)).booleanValue()) {
                if (z2) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                chValueOf = Character.valueOf(c2);
                z2 = true;
            }
        }
        if (!z2) {
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        kotlin.jvm.internal.d2ok.n7h(chValueOf, "null cannot be cast to non-null type kotlin.Char");
        return chValueOf.charValue();
    }

    public static final boolean p6(@InterfaceC7396q short[] sArr, @InterfaceC7396q cyoe.x2<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (short s2 : sArr) {
            if (predicate.invoke(Short.valueOf(s2)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final <V> Map<Boolean, V> p68f(boolean[] zArr, cyoe.x2<? super Boolean, ? extends V> valueSelector) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(valueSelector, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.fn3e.fn3e(C6140e.m22479p(zArr.length), 16));
        for (boolean z2 : zArr) {
            linkedHashMap.put(Boolean.valueOf(z2), valueSelector.invoke(Boolean.valueOf(z2)));
        }
        return linkedHashMap;
    }

    @kotlin.x2(warningSince = "1.5")
    @kotlin.ld6(message = "Use sumOf instead.", replaceWith = @kotlin.hb(expression = "this.sumOf(selector)", imports = {}))
    public static final int p69(@InterfaceC7396q short[] sArr, @InterfaceC7396q cyoe.x2<? super Short, Integer> selector) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        int iIntValue = 0;
        for (short s2 : sArr) {
            iIntValue += selector.invoke(Short.valueOf(s2)).intValue();
        }
        return iIntValue;
    }

    @InterfaceC7396q
    public static final <C extends Collection<? super Boolean>> C p7p2(@InterfaceC7396q boolean[] zArr, @InterfaceC7396q C destination) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        for (boolean z2 : zArr) {
            destination.add(Boolean.valueOf(z2));
        }
        return destination;
    }

    @InterfaceC7396q
    public static final Iterable<x9kr<Integer>> p87(@InterfaceC7396q int[] iArr) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        return new ncyb(new ni7(iArr));
    }

    @InterfaceC7396q
    public static final <C extends Collection<? super Float>> C p9(@InterfaceC7396q float[] fArr, @InterfaceC7396q C destination, @InterfaceC7396q InterfaceC5979h<? super Integer, ? super Float, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        int length = fArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            float f2 = fArr[i2];
            int i4 = i3 + 1;
            if (predicate.invoke(Integer.valueOf(i3), Float.valueOf(f2)).booleanValue()) {
                destination.add(Float.valueOf(f2));
            }
            i2++;
            i3 = i4;
        }
        return destination;
    }

    @InterfaceC7396q
    public static final kotlin.sequences.qrj<Double> p996(@InterfaceC7396q double[] dArr) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        return dArr.length == 0 ? kotlin.sequences.t8r.f7l8() : new h(dArr);
    }

    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final Boolean p9k9(@InterfaceC7396q boolean[] zArr, @InterfaceC7396q Comparator<? super Boolean> comparator) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        if (zArr.length == 0) {
            return null;
        }
        boolean z2 = zArr[0];
        n5r1 it = new kotlin.ranges.x2(1, rl(zArr)).iterator();
        while (it.hasNext()) {
            boolean z3 = zArr[it.nextInt()];
            if (comparator.compare(Boolean.valueOf(z2), Boolean.valueOf(z3)) > 0) {
                z2 = z3;
            }
        }
        return Boolean.valueOf(z2);
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final Short pavv(@InterfaceC7396q short[] sArr, @InterfaceC7396q InterfaceC5979h<? super Short, ? super Short, Short> operation) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (sArr.length == 0) {
            return null;
        }
        short sShortValue = sArr[0];
        n5r1 it = new kotlin.ranges.x2(1, orxw(sArr)).iterator();
        while (it.hasNext()) {
            sShortValue = operation.invoke(Short.valueOf(sShortValue), Short.valueOf(sArr[it.nextInt()])).shortValue();
        }
        return Short.valueOf(sShortValue);
    }

    @InterfaceC7396q
    public static final List<Integer> pb(@InterfaceC7396q int[] iArr) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        return a9.wr(gvu(iArr));
    }

    @InterfaceC7395n
    public static final Double pd(@InterfaceC7396q double[] dArr, @InterfaceC7396q cyoe.x2<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (double d2 : dArr) {
            if (predicate.invoke(Double.valueOf(d2)).booleanValue()) {
                return Double.valueOf(d2);
            }
        }
        return null;
    }

    @InterfaceC7396q
    public static final <T, R extends Comparable<? super R>> List<T> pe6o(@InterfaceC7396q T[] tArr, @InterfaceC7396q cyoe.x2<? super T, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        return tx8q(tArr, new f7l8.C6179k(selector));
    }

    @InterfaceC7396q
    public static final <C extends Collection<? super Double>> C peir(@InterfaceC7396q double[] dArr, @InterfaceC7396q C destination, @InterfaceC7396q cyoe.x2<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (double d2 : dArr) {
            if (!predicate.invoke(Double.valueOf(d2)).booleanValue()) {
                destination.add(Double.valueOf(d2));
            }
        }
        return destination;
    }

    public static final <R> R pf98(@InterfaceC7396q char[] cArr, R r2, @InterfaceC7396q InterfaceC5979h<? super R, ? super Character, ? extends R> operation) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        for (char c2 : cArr) {
            r2 = operation.invoke(r2, Character.valueOf(c2));
        }
        return r2;
    }

    public static final boolean pg(@InterfaceC7396q short[] sArr) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        return sArr.length == 0;
    }

    @kotlin.x2(errorSince = "1.6", hiddenSince = "1.7", warningSince = "1.4")
    @kotlin.ld6(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use 'any { it == element }' instead to continue using this behavior, or '.asList().contains(element: T)' to get the same search behavior as in a list.", replaceWith = @kotlin.hb(expression = "any { it == element }", imports = {}))
    public static final /* synthetic */ boolean pgi(float[] fArr, float f2) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        for (float f3 : fArr) {
            if (f3 == f2) {
                return true;
            }
        }
        return false;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final Float ph(char[] cArr, cyoe.x2<? super Character, Float> selector) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        float fFloatValue = selector.invoke(Character.valueOf(cArr[0])).floatValue();
        n5r1 it = new kotlin.ranges.x2(1, j59a(cArr)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, selector.invoke(Character.valueOf(cArr[it.nextInt()])).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    public static <T> boolean ph5d(@InterfaceC7396q T[] tArr, T t2) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        return iobz(tArr, t2) >= 0;
    }

    @InterfaceC7396q
    public static final Iterable<Boolean> pi(@InterfaceC7396q boolean[] zArr) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        return zArr.length == 0 ? kotlin.collections.ni7.a9() : new y(zArr);
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final float[] pi9r(float[] fArr, cyoe.x2<? super Float, was> action) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(action, "action");
        for (float f2 : fArr) {
            action.invoke(Float.valueOf(f2));
        }
        return fArr;
    }

    public static final float pia(@InterfaceC7396q float[] fArr, @InterfaceC7396q cyoe.x2<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        Float fValueOf = null;
        boolean z2 = false;
        for (float f2 : fArr) {
            if (predicate.invoke(Float.valueOf(f2)).booleanValue()) {
                if (z2) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                fValueOf = Float.valueOf(f2);
                z2 = true;
            }
        }
        if (!z2) {
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        kotlin.jvm.internal.d2ok.n7h(fValueOf, "null cannot be cast to non-null type kotlin.Float");
        return fValueOf.floatValue();
    }

    @InterfaceC7395n
    public static final Boolean pisc(@InterfaceC7396q boolean[] zArr) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        if (zArr.length == 1) {
            return Boolean.valueOf(zArr[0]);
        }
        return null;
    }

    @InterfaceC7396q
    public static final C6227f<List<Long>, List<Long>> pj7(@InterfaceC7396q long[] jArr, @InterfaceC7396q cyoe.x2<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (long j2 : jArr) {
            if (predicate.invoke(Long.valueOf(j2)).booleanValue()) {
                arrayList.add(Long.valueOf(j2));
            } else {
                arrayList2.add(Long.valueOf(j2));
            }
        }
        return new C6227f<>(arrayList, arrayList2);
    }

    public static final <T extends Comparable<? super T>> void pjp(@InterfaceC7396q T[] tArr) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.collections.kja0.izu(tArr, kotlin.comparisons.f7l8.fu4());
    }

    public static final short pkq2(@InterfaceC7396q short[] sArr, @InterfaceC7396q InterfaceC5979h<? super Short, ? super Short, Short> operation) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (sArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        short sShortValue = sArr[0];
        n5r1 it = new kotlin.ranges.x2(1, orxw(sArr)).iterator();
        while (it.hasNext()) {
            sShortValue = operation.invoke(Short.valueOf(sShortValue), Short.valueOf(sArr[it.nextInt()])).shortValue();
        }
        return sShortValue;
    }

    @InterfaceC7396q
    public static final <K, M extends Map<? super K, List<Character>>> M pku(@InterfaceC7396q char[] cArr, @InterfaceC7396q M destination, @InterfaceC7396q cyoe.x2<? super Character, ? extends K> keySelector) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(keySelector, "keySelector");
        for (char c2 : cArr) {
            K kInvoke = keySelector.invoke(Character.valueOf(c2));
            Object arrayList = destination.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(Character.valueOf(c2));
        }
        return destination;
    }

    @InterfaceC7396q
    public static final <T, R, C extends Collection<? super R>> C pm(@InterfaceC7396q T[] tArr, @InterfaceC7396q C destination, @InterfaceC7396q cyoe.x2<? super T, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        for (T t2 : tArr) {
            C6163t.zp(destination, transform.invoke(t2));
        }
        return destination;
    }

    public static /* synthetic */ String pm14(long[] jArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, cyoe.x2 x2Var, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i3 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i3 & 4) == 0 ? charSequence3 : "";
        if ((i3 & 8) != 0) {
            i2 = -1;
        }
        int i4 = i2;
        if ((i3 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i3 & 32) != 0) {
            x2Var = null;
        }
        return k8s(jArr, charSequence, charSequence5, charSequence6, i4, charSequence7, x2Var);
    }

    @InterfaceC7396q
    public static final List<Integer> pnh(@InterfaceC7396q int[] iArr, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
        }
        if (i2 == 0) {
            return kotlin.collections.ni7.a9();
        }
        if (i2 >= iArr.length) {
            return bgz(iArr);
        }
        if (i2 == 1) {
            return kotlin.collections.zurt.ld6(Integer.valueOf(iArr[0]));
        }
        ArrayList arrayList = new ArrayList(i2);
        int i3 = 0;
        for (int i4 : iArr) {
            arrayList.add(Integer.valueOf(i4));
            i3++;
            if (i3 == i2) {
                break;
            }
        }
        return arrayList;
    }

    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final Short pp(@InterfaceC7396q short[] sArr) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        if (sArr.length == 0) {
            return null;
        }
        short s2 = sArr[0];
        n5r1 it = new kotlin.ranges.x2(1, orxw(sArr)).iterator();
        while (it.hasNext()) {
            short s3 = sArr[it.nextInt()];
            if (s2 > s3) {
                s2 = s3;
            }
        }
        return Short.valueOf(s2);
    }

    public static final long ppa(@InterfaceC7396q long[] jArr, @InterfaceC7396q cyoe.cdj<? super Integer, ? super Long, ? super Long, Long> operation) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        int iHmvj = hmvj(jArr);
        if (iHmvj < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        long jLongValue = jArr[iHmvj];
        for (int i2 = iHmvj - 1; i2 >= 0; i2--) {
            jLongValue = operation.invoke(Integer.valueOf(i2), Long.valueOf(jArr[i2]), Long.valueOf(jLongValue)).longValue();
        }
        return jLongValue;
    }

    @InterfaceC7396q
    public static final List<Boolean> pri(@InterfaceC7396q boolean[] zArr, @InterfaceC7396q cyoe.x2<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (boolean z2 : zArr) {
            if (predicate.invoke(Boolean.valueOf(z2)).booleanValue()) {
                arrayList.add(Boolean.valueOf(z2));
            }
        }
        return arrayList;
    }

    @kotlin.yz(version = "1.4")
    public static final void psl(@InterfaceC7396q short[] sArr, @InterfaceC7396q AbstractC6332g random) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(random, "random");
        for (int iOrxw = orxw(sArr); iOrxw > 0; iOrxw--) {
            int iNextInt = random.nextInt(iOrxw + 1);
            short s2 = sArr[iOrxw];
            sArr[iOrxw] = sArr[iNextInt];
            sArr[iNextInt] = s2;
        }
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final double psqy(int[] iArr, cyoe.x2<? super Integer, Double> selector) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(Integer.valueOf(iArr[0])).doubleValue();
        n5r1 it = new kotlin.ranges.x2(1, srpc(iArr)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, selector.invoke(Integer.valueOf(iArr[it.nextInt()])).doubleValue());
        }
        return dDoubleValue;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final List<Character> pstq(char[] cArr, InterfaceC5979h<? super Character, ? super Character, Character> operation) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (cArr.length == 0) {
            return kotlin.collections.ni7.a9();
        }
        char cCharValue = cArr[0];
        ArrayList arrayList = new ArrayList(cArr.length);
        arrayList.add(Character.valueOf(cCharValue));
        int length = cArr.length;
        for (int i2 = 1; i2 < length; i2++) {
            cCharValue = operation.invoke(Character.valueOf(cCharValue), Character.valueOf(cArr[i2])).charValue();
            arrayList.add(Character.valueOf(cCharValue));
        }
        return arrayList;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final <R> List<R> pt6(byte[] bArr, R r2, InterfaceC5979h<? super R, ? super Byte, ? extends R> operation) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (bArr.length == 0) {
            return kotlin.collections.zurt.ld6(r2);
        }
        ArrayList arrayList = new ArrayList(bArr.length + 1);
        arrayList.add(r2);
        for (byte b2 : bArr) {
            r2 = operation.invoke(r2, Byte.valueOf(b2));
            arrayList.add(r2);
        }
        return arrayList;
    }

    @InterfaceC7395n
    public static final Boolean ptq(@InterfaceC7396q boolean[] zArr, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        if (i2 < 0 || i2 > rl(zArr)) {
            return null;
        }
        return Boolean.valueOf(zArr[i2]);
    }

    public static final char ptry(@InterfaceC7396q char[] cArr) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        if (cArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return cArr[0];
    }

    @InterfaceC7396q
    public static final C6227f<List<Double>, List<Double>> pub6(@InterfaceC7396q double[] dArr, @InterfaceC7396q cyoe.x2<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (double d2 : dArr) {
            if (predicate.invoke(Double.valueOf(d2)).booleanValue()) {
                arrayList.add(Double.valueOf(d2));
            } else {
                arrayList2.add(Double.valueOf(d2));
            }
        }
        return new C6227f<>(arrayList, arrayList2);
    }

    @InterfaceC7396q
    public static final String puh(@InterfaceC7396q char[] cArr, @InterfaceC7396q CharSequence separator, @InterfaceC7396q CharSequence prefix, @InterfaceC7396q CharSequence postfix, int i2, @InterfaceC7396q CharSequence truncated, @InterfaceC7395n cyoe.x2<? super Character, ? extends CharSequence> x2Var) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(separator, "separator");
        kotlin.jvm.internal.d2ok.m23075h(prefix, "prefix");
        kotlin.jvm.internal.d2ok.m23075h(postfix, "postfix");
        kotlin.jvm.internal.d2ok.m23075h(truncated, "truncated");
        String string = ((StringBuilder) v6we(cArr, new StringBuilder(), separator, prefix, postfix, i2, truncated, x2Var)).toString();
        kotlin.jvm.internal.d2ok.kja0(string, "joinTo(StringBuilder(), …ed, transform).toString()");
        return string;
    }

    @InterfaceC7396q
    public static final List<C6227f<Integer, Integer>> puq(@InterfaceC7396q int[] iArr, @InterfaceC7396q int[] other) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        int iMin = Math.min(iArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i2 = 0; i2 < iMin; i2++) {
            arrayList.add(kotlin.nmn5.m23230k(Integer.valueOf(iArr[i2]), Integer.valueOf(other[i2])));
        }
        return arrayList;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final <R> List<R> pw6a(char[] cArr, R r2, cyoe.cdj<? super Integer, ? super R, ? super Character, ? extends R> operation) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (cArr.length == 0) {
            return kotlin.collections.zurt.ld6(r2);
        }
        ArrayList arrayList = new ArrayList(cArr.length + 1);
        arrayList.add(r2);
        int length = cArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            r2 = operation.invoke(Integer.valueOf(i2), r2, Character.valueOf(cArr[i2]));
            arrayList.add(r2);
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final List<Boolean> pwbu(@InterfaceC7396q boolean[] zArr) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        if (zArr.length == 0) {
            return kotlin.collections.ni7.a9();
        }
        List<Boolean> listJtf = jtf(zArr);
        jk.vep5(listJtf);
        return listJtf;
    }

    public static int pwca(@InterfaceC7396q byte[] bArr, byte b2) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        int length = bArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (b2 == bArr[length]) {
                    return length;
                }
                if (i2 < 0) {
                    break;
                }
                length = i2;
            }
        }
        return -1;
    }

    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final Byte pwo(@InterfaceC7396q byte[] bArr, @InterfaceC7396q cyoe.cdj<? super Integer, ? super Byte, ? super Byte, Byte> operation) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        int iVl = vl(bArr);
        if (iVl < 0) {
            return null;
        }
        byte bByteValue = bArr[iVl];
        for (int i2 = iVl - 1; i2 >= 0; i2--) {
            bByteValue = operation.invoke(Integer.valueOf(i2), Byte.valueOf(bArr[i2]), Byte.valueOf(bByteValue)).byteValue();
        }
        return Byte.valueOf(bByteValue);
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <R extends Comparable<? super R>> R px2(float[] fArr, cyoe.x2<? super Float, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Float.valueOf(fArr[0]));
        n5r1 it = new kotlin.ranges.x2(1, gto(fArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Float.valueOf(fArr[it.nextInt()]));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC7396q
    public static final Set<Boolean> pxe(@InterfaceC7396q boolean[] zArr, @InterfaceC7396q Iterable<Boolean> other) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        Set<Boolean> setCff0 = cff0(zArr);
        C6163t.zp(setCff0, other);
        return setCff0;
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final <R> List<R> pxz(char[] cArr, R r2, cyoe.cdj<? super Integer, ? super R, ? super Character, ? extends R> operation) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (cArr.length == 0) {
            return kotlin.collections.zurt.ld6(r2);
        }
        ArrayList arrayList = new ArrayList(cArr.length + 1);
        arrayList.add(r2);
        int length = cArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            r2 = operation.invoke(Integer.valueOf(i2), r2, Character.valueOf(cArr[i2]));
            arrayList.add(r2);
        }
        return arrayList;
    }

    public static final boolean py7(@InterfaceC7396q long[] jArr, @InterfaceC7396q cyoe.x2<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (long j2 : jArr) {
            if (predicate.invoke(Long.valueOf(j2)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final <R extends Comparable<? super R>> Float q0(@InterfaceC7396q float[] fArr, @InterfaceC7396q cyoe.x2<? super Float, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        float f2 = fArr[0];
        int iGto = gto(fArr);
        if (iGto == 0) {
            return Float.valueOf(f2);
        }
        R rInvoke = selector.invoke(Float.valueOf(f2));
        n5r1 it = new kotlin.ranges.x2(1, iGto).iterator();
        while (it.hasNext()) {
            float f3 = fArr[it.nextInt()];
            R rInvoke2 = selector.invoke(Float.valueOf(f3));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                f2 = f3;
                rInvoke = rInvoke2;
            }
        }
        return Float.valueOf(f2);
    }

    @InterfaceC7396q
    public static final <R> List<R> q04(@InterfaceC7396q long[] jArr, @InterfaceC7396q InterfaceC5979h<? super Integer, ? super Long, ? extends R> transform) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        ArrayList arrayList = new ArrayList(jArr.length);
        int length = jArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            arrayList.add(transform.invoke(Integer.valueOf(i3), Long.valueOf(jArr[i2])));
            i2++;
            i3++;
        }
        return arrayList;
    }

    public static final float q1j(@InterfaceC7396q float[] fArr, @InterfaceC7396q InterfaceC5979h<? super Float, ? super Float, Float> operation) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        int iGto = gto(fArr);
        if (iGto < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        float fFloatValue = fArr[iGto];
        for (int i2 = iGto - 1; i2 >= 0; i2--) {
            fFloatValue = operation.invoke(Float.valueOf(fArr[i2]), Float.valueOf(fFloatValue)).floatValue();
        }
        return fFloatValue;
    }

    @kotlin.yz(version = "1.7")
    @InterfaceC6769y(name = "maxOrThrow")
    public static final char q28(@InterfaceC7396q char[] cArr) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        char c2 = cArr[0];
        n5r1 it = new kotlin.ranges.x2(1, j59a(cArr)).iterator();
        while (it.hasNext()) {
            char c3 = cArr[it.nextInt()];
            if (kotlin.jvm.internal.d2ok.m23076i(c2, c3) < 0) {
                c2 = c3;
            }
        }
        return c2;
    }

    @InterfaceC7395n
    public static final Float q3(@InterfaceC7396q float[] fArr, @InterfaceC7396q cyoe.x2<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        boolean z2 = false;
        Float fValueOf = null;
        for (float f2 : fArr) {
            if (predicate.invoke(Float.valueOf(f2)).booleanValue()) {
                if (z2) {
                    return null;
                }
                fValueOf = Float.valueOf(f2);
                z2 = true;
            }
        }
        if (z2) {
            return fValueOf;
        }
        return null;
    }

    public static final <R> R q3r(@InterfaceC7396q boolean[] zArr, R r2, @InterfaceC7396q cyoe.cdj<? super Integer, ? super R, ? super Boolean, ? extends R> operation) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        int length = zArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            r2 = operation.invoke(Integer.valueOf(i3), r2, Boolean.valueOf(zArr[i2]));
            i2++;
            i3++;
        }
        return r2;
    }

    public static final int q4lv(@InterfaceC7396q int[] iArr, @InterfaceC7396q cyoe.x2<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (int i2 : iArr) {
            if (predicate.invoke(Integer.valueOf(i2)).booleanValue()) {
                return i2;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @InterfaceC7396q
    public static final Set<Long> q4m4(@InterfaceC7396q long[] jArr) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        return (Set) gb1(jArr, new LinkedHashSet(C6140e.m22479p(jArr.length)));
    }

    @InterfaceC7396q
    public static final <T> Set<T> q5aq(@InterfaceC7396q T[] tArr, @InterfaceC7396q Iterable<? extends T> other) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        Set<T> setIcp = icp(tArr);
        C6163t.zsr0(setIcp, other);
        return setIcp;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <R> R q5x(boolean[] zArr, Comparator<? super R> comparator, cyoe.x2<? super Boolean, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (zArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Boolean.valueOf(zArr[0]));
        n5r1 it = new kotlin.ranges.x2(1, rl(zArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Boolean.valueOf(zArr[it.nextInt()]));
            if (comparator.compare(rInvoke, rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @kotlin.yz(version = "1.7")
    @InterfaceC6769y(name = "maxOrThrow")
    public static final int q68(@InterfaceC7396q int[] iArr) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        int i2 = iArr[0];
        n5r1 it = new kotlin.ranges.x2(1, srpc(iArr)).iterator();
        while (it.hasNext()) {
            int i3 = iArr[it.nextInt()];
            if (i2 < i3) {
                i2 = i3;
            }
        }
        return i2;
    }

    @InterfaceC7396q
    public static final List<Short> q68v(@InterfaceC7396q short[] sArr) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        if (sArr.length == 0) {
            return kotlin.collections.ni7.a9();
        }
        List<Short> listI1r = i1r(sArr);
        jk.vep5(listI1r);
        return listI1r;
    }

    @InterfaceC7396q
    public static final List<Float> q6c(@InterfaceC7396q float[] fArr, @InterfaceC7396q Comparator<? super Float> comparator) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        Float[] fArrQexj = kotlin.collections.kja0.qexj(fArr);
        kotlin.collections.kja0.izu(fArrQexj, comparator);
        return kotlin.collections.kja0.m22514i(fArrQexj);
    }

    @InterfaceC7396q
    public static final String q6x(@InterfaceC7396q byte[] bArr, @InterfaceC7396q CharSequence separator, @InterfaceC7396q CharSequence prefix, @InterfaceC7396q CharSequence postfix, int i2, @InterfaceC7396q CharSequence truncated, @InterfaceC7395n cyoe.x2<? super Byte, ? extends CharSequence> x2Var) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(separator, "separator");
        kotlin.jvm.internal.d2ok.m23075h(prefix, "prefix");
        kotlin.jvm.internal.d2ok.m23075h(postfix, "postfix");
        kotlin.jvm.internal.d2ok.m23075h(truncated, "truncated");
        String string = ((StringBuilder) y1e(bArr, new StringBuilder(), separator, prefix, postfix, i2, truncated, x2Var)).toString();
        kotlin.jvm.internal.d2ok.kja0(string, "joinTo(StringBuilder(), …ed, transform).toString()");
        return string;
    }

    @kotlin.hyr
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @InterfaceC6769y(name = "flatMapIndexedIterable")
    private static final <R> List<R> q72(float[] fArr, InterfaceC5979h<? super Integer, ? super Float, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = fArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            C6163t.zp(arrayList, transform.invoke(Integer.valueOf(i3), Float.valueOf(fArr[i2])));
            i2++;
            i3++;
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final boolean[] q7yl(@InterfaceC7396q boolean[] zArr) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        if (zArr.length == 0) {
            return zArr;
        }
        boolean[] zArr2 = new boolean[zArr.length];
        int iRl = rl(zArr);
        n5r1 it = new kotlin.ranges.x2(0, iRl).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            zArr2[iRl - iNextInt] = zArr[iNextInt];
        }
        return zArr2;
    }

    @InterfaceC7396q
    public static final List<Float> q8(@InterfaceC7396q float[] fArr, @InterfaceC7396q InterfaceC5979h<? super Integer, ? super Float, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = fArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            float f2 = fArr[i2];
            int i4 = i3 + 1;
            if (predicate.invoke(Integer.valueOf(i3), Float.valueOf(f2)).booleanValue()) {
                arrayList.add(Float.valueOf(f2));
            }
            i2++;
            i3 = i4;
        }
        return arrayList;
    }

    public static final int q8d(@InterfaceC7396q char[] cArr, @InterfaceC7396q cyoe.x2<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        int length = cArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (predicate.invoke(Character.valueOf(cArr[i2])).booleanValue()) {
                return i2;
            }
        }
        return -1;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final Double q8e(byte[] bArr, cyoe.x2<? super Byte, Double> selector) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        double dDoubleValue = selector.invoke(Byte.valueOf(bArr[0])).doubleValue();
        n5r1 it = new kotlin.ranges.x2(1, vl(bArr)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, selector.invoke(Byte.valueOf(bArr[it.nextInt()])).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final float q8n(char[] cArr, cyoe.x2<? super Character, Float> selector) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(Character.valueOf(cArr[0])).floatValue();
        n5r1 it = new kotlin.ranges.x2(1, j59a(cArr)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, selector.invoke(Character.valueOf(cArr[it.nextInt()])).floatValue());
        }
        return fFloatValue;
    }

    public static void q9e(@InterfaceC7396q int[] iArr) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        int length = (iArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int iSrpc = srpc(iArr);
        n5r1 it = new kotlin.ranges.x2(0, length).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            int i2 = iArr[iNextInt];
            iArr[iNextInt] = iArr[iSrpc];
            iArr[iSrpc] = i2;
            iSrpc--;
        }
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.3")
    private static final boolean qb(boolean[] zArr) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        return lg(zArr, AbstractC6332g.Default);
    }

    @InterfaceC7396q
    public static final List<Byte> qb8(@InterfaceC7396q byte[] bArr, @InterfaceC7396q cyoe.x2<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z2 = false;
        for (byte b2 : bArr) {
            if (z2) {
                arrayList.add(Byte.valueOf(b2));
            } else if (!predicate.invoke(Byte.valueOf(b2)).booleanValue()) {
                arrayList.add(Byte.valueOf(b2));
                z2 = true;
            }
        }
        return arrayList;
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @kotlin.hyr
    @InterfaceC6234g
    @kotlin.yz(version = "1.5")
    @InterfaceC6769y(name = "sumOfULong")
    private static final long qbxp(char[] cArr, cyoe.x2<? super Character, ikck> selector) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        long jLd6 = ikck.ld6(0L);
        for (char c2 : cArr) {
            jLd6 = ikck.ld6(jLd6 + selector.invoke(Character.valueOf(c2)).a98o());
        }
        return jLd6;
    }

    @InterfaceC7396q
    public static final HashSet<Long> qcx(@InterfaceC7396q long[] jArr) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        return (HashSet) gb1(jArr, new HashSet(C6140e.m22479p(jArr.length)));
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <R extends Comparable<? super R>> R qd7u(short[] sArr, cyoe.x2<? super Short, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Short.valueOf(sArr[0]));
        n5r1 it = new kotlin.ranges.x2(1, orxw(sArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Short.valueOf(sArr[it.nextInt()]));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC7395n
    public static final Long qdd(@InterfaceC7396q long[] jArr, @InterfaceC7396q cyoe.x2<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        boolean z2 = false;
        Long lValueOf = null;
        for (long j2 : jArr) {
            if (predicate.invoke(Long.valueOf(j2)).booleanValue()) {
                if (z2) {
                    return null;
                }
                lValueOf = Long.valueOf(j2);
                z2 = true;
            }
        }
        if (z2) {
            return lValueOf;
        }
        return null;
    }

    @InterfaceC6234g
    private static final int qe(char[] cArr) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        return cArr.length;
    }

    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final <T extends Comparable<? super T>> T qf(@InterfaceC7396q T[] tArr) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        if (tArr.length == 0) {
            return null;
        }
        T t2 = tArr[0];
        n5r1 it = new kotlin.ranges.x2(1, gjp(tArr)).iterator();
        while (it.hasNext()) {
            T t3 = tArr[it.nextInt()];
            if (t2.compareTo(t3) > 0) {
                t2 = t3;
            }
        }
        return t2;
    }

    @InterfaceC7396q
    public static final List<Long> qg(@InterfaceC7396q long[] jArr, @InterfaceC7396q cyoe.x2<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (int iHmvj = hmvj(jArr); -1 < iHmvj; iHmvj--) {
            if (!predicate.invoke(Long.valueOf(jArr[iHmvj])).booleanValue()) {
                return wl(jArr, iHmvj + 1);
            }
        }
        return kotlin.collections.ni7.a9();
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.3")
    private static final float qh(float[] fArr) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        return m9j(fArr, AbstractC6332g.Default);
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <R extends Comparable<? super R>> R qhg7(byte[] bArr, cyoe.x2<? super Byte, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Byte.valueOf(bArr[0]));
        n5r1 it = new kotlin.ranges.x2(1, vl(bArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Byte.valueOf(bArr[it.nextInt()]));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC7396q
    public static final <T extends Comparable<? super T>> List<T> qhv(@InterfaceC7396q T[] tArr) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        return tx8q(tArr, kotlin.comparisons.f7l8.fu4());
    }

    @InterfaceC7396q
    public static final <R extends Comparable<? super R>> List<Character> qhx(@InterfaceC7396q char[] cArr, @InterfaceC7396q cyoe.x2<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        return h9w7(cArr, new f7l8.zy(selector));
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <T, R extends Comparable<? super R>> R qimr(T[] tArr, cyoe.x2<? super T, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(tArr[0]);
        n5r1 it = new kotlin.ranges.x2(1, gjp(tArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(tArr[it.nextInt()]);
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final List<Integer> qj(int[] iArr, InterfaceC5979h<? super Integer, ? super Integer, Integer> operation) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (iArr.length == 0) {
            return kotlin.collections.ni7.a9();
        }
        int iIntValue = iArr[0];
        ArrayList arrayList = new ArrayList(iArr.length);
        arrayList.add(Integer.valueOf(iIntValue));
        int length = iArr.length;
        for (int i2 = 1; i2 < length; i2++) {
            iIntValue = operation.invoke(Integer.valueOf(iIntValue), Integer.valueOf(iArr[i2])).intValue();
            arrayList.add(Integer.valueOf(iIntValue));
        }
        return arrayList;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final long[] qjdr(long[] jArr, InterfaceC5979h<? super Integer, ? super Long, was> action) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(action, "action");
        int length = jArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            action.invoke(Integer.valueOf(i3), Long.valueOf(jArr[i2]));
            i2++;
            i3++;
        }
        return jArr;
    }

    @InterfaceC7396q
    public static final HashSet<Boolean> qjn(@InterfaceC7396q boolean[] zArr) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        return (HashSet) p7p2(zArr, new HashSet(C6140e.m22479p(zArr.length)));
    }

    @kotlin.hyr
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @InterfaceC6769y(name = "sumOfDouble")
    private static final double qk(short[] sArr, cyoe.x2<? super Short, Double> selector) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        double dDoubleValue = 0.0d;
        for (short s2 : sArr) {
            dDoubleValue += selector.invoke(Short.valueOf(s2)).doubleValue();
        }
        return dDoubleValue;
    }

    public static final long qkbk(@InterfaceC7396q long[] jArr, @InterfaceC7396q cyoe.x2<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (long j2 : jArr) {
            if (predicate.invoke(Long.valueOf(j2)).booleanValue()) {
                return j2;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @InterfaceC7396q
    public static final <K, V> Map<K, List<V>> qlt6(@InterfaceC7396q long[] jArr, @InterfaceC7396q cyoe.x2<? super Long, ? extends K> keySelector, @InterfaceC7396q cyoe.x2<? super Long, ? extends V> valueTransform) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(keySelector, "keySelector");
        kotlin.jvm.internal.d2ok.m23075h(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (long j2 : jArr) {
            K kInvoke = keySelector.invoke(Long.valueOf(j2));
            List<V> arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(kInvoke, arrayList);
            }
            arrayList.add(valueTransform.invoke(Long.valueOf(j2)));
        }
        return linkedHashMap;
    }

    public static final <T> int qm8(@InterfaceC7396q T[] tArr, @InterfaceC7396q cyoe.x2<? super T, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        int i2 = 0;
        for (T t2 : tArr) {
            if (predicate.invoke(t2).booleanValue()) {
                i2++;
            }
        }
        return i2;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final Float qmbf(float[] fArr, cyoe.x2<? super Float, Float> selector) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        float fFloatValue = selector.invoke(Float.valueOf(fArr[0])).floatValue();
        n5r1 it = new kotlin.ranges.x2(1, gto(fArr)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, selector.invoke(Float.valueOf(fArr[it.nextInt()])).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @InterfaceC7396q
    public static final <T> Set<T> qml(@InterfaceC7396q T[] tArr, @InterfaceC7396q Iterable<? extends T> other) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        Set<T> setIcp = icp(tArr);
        C6163t.zp(setIcp, other);
        return setIcp;
    }

    @kotlin.hyr
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @InterfaceC6769y(name = "flatMapIndexedIterableTo")
    private static final <R, C extends Collection<? super R>> C qmo(int[] iArr, C destination, InterfaceC5979h<? super Integer, ? super Integer, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            C6163t.zp(destination, transform.invoke(Integer.valueOf(i3), Integer.valueOf(iArr[i2])));
            i2++;
            i3++;
        }
        return destination;
    }

    @kotlin.yz(version = "1.4")
    public static final void qn(@InterfaceC7396q char[] cArr, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.collections.zy.Companion.m22683q(i2, i3, cArr.length);
        int i4 = (i2 + i3) / 2;
        if (i2 == i4) {
            return;
        }
        int i5 = i3 - 1;
        while (i2 < i4) {
            char c2 = cArr[i2];
            cArr[i2] = cArr[i5];
            cArr[i5] = c2;
            i5--;
            i2++;
        }
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @kotlin.hyr
    @InterfaceC6234g
    @kotlin.yz(version = "1.5")
    @InterfaceC6769y(name = "sumOfULong")
    private static final long qncf(int[] iArr, cyoe.x2<? super Integer, ikck> selector) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        long jLd6 = ikck.ld6(0L);
        for (int i2 : iArr) {
            jLd6 = ikck.ld6(jLd6 + selector.invoke(Integer.valueOf(i2)).a98o());
        }
        return jLd6;
    }

    @InterfaceC7396q
    public static final <R> List<R> qode(@InterfaceC7396q char[] cArr, @InterfaceC7396q cyoe.x2<? super Character, ? extends R> transform) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        ArrayList arrayList = new ArrayList(cArr.length);
        for (char c2 : cArr) {
            arrayList.add(transform.invoke(Character.valueOf(c2)));
        }
        return arrayList;
    }

    @InterfaceC7395n
    public static final Byte qoo(@InterfaceC7396q byte[] bArr) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        if (bArr.length == 0) {
            return null;
        }
        return Byte.valueOf(bArr[0]);
    }

    public static final double qp0k(@InterfaceC7396q double[] dArr, @InterfaceC7396q cyoe.x2<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        int length = dArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                double d2 = dArr[length];
                if (!predicate.invoke(Double.valueOf(d2)).booleanValue()) {
                    if (i2 < 0) {
                        break;
                    }
                    length = i2;
                } else {
                    return d2;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @InterfaceC7396q
    public static final C6227f<List<Integer>, List<Integer>> qp5l(@InterfaceC7396q int[] iArr, @InterfaceC7396q cyoe.x2<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i2 : iArr) {
            if (predicate.invoke(Integer.valueOf(i2)).booleanValue()) {
                arrayList.add(Integer.valueOf(i2));
            } else {
                arrayList2.add(Integer.valueOf(i2));
            }
        }
        return new C6227f<>(arrayList, arrayList2);
    }

    @InterfaceC7396q
    public static final List<Character> qp94(@InterfaceC7396q char[] cArr, @InterfaceC7396q cyoe.x2<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (int iJ59a = j59a(cArr); -1 < iJ59a; iJ59a--) {
            if (!predicate.invoke(Character.valueOf(cArr[iJ59a])).booleanValue()) {
                return un3l(cArr, iJ59a + 1);
            }
        }
        return eovq(cArr);
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final Double qpih(char[] cArr, cyoe.x2<? super Character, Double> selector) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        double dDoubleValue = selector.invoke(Character.valueOf(cArr[0])).doubleValue();
        n5r1 it = new kotlin.ranges.x2(1, j59a(cArr)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, selector.invoke(Character.valueOf(cArr[it.nextInt()])).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @kotlin.hyr
    @InterfaceC6234g
    @kotlin.yz(version = "1.5")
    @InterfaceC6769y(name = "sumOfUInt")
    private static final int qps(short[] sArr, cyoe.x2<? super Short, gyi> selector) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        int iLd6 = gyi.ld6(0);
        for (short s2 : sArr) {
            iLd6 = gyi.ld6(iLd6 + selector.invoke(Short.valueOf(s2)).a98o());
        }
        return iLd6;
    }

    @InterfaceC7396q
    public static final <T> kotlin.ranges.x2 qs(@InterfaceC7396q T[] tArr) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        return new kotlin.ranges.x2(0, gjp(tArr));
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final Float qsl8(int[] iArr, cyoe.x2<? super Integer, Float> selector) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        float fFloatValue = selector.invoke(Integer.valueOf(iArr[0])).floatValue();
        n5r1 it = new kotlin.ranges.x2(1, srpc(iArr)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, selector.invoke(Integer.valueOf(iArr[it.nextInt()])).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @InterfaceC7396q
    public static final <R> List<C6227f<Double, R>> qsok(@InterfaceC7396q double[] dArr, @InterfaceC7396q R[] other) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        int iMin = Math.min(dArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i2 = 0; i2 < iMin; i2++) {
            double d2 = dArr[i2];
            arrayList.add(kotlin.nmn5.m23230k(Double.valueOf(d2), other[i2]));
        }
        return arrayList;
    }

    @InterfaceC6234g
    private static final <T> T qspg(T[] tArr) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        return tArr[2];
    }

    @InterfaceC7396q
    public static final Set<Double> qtn(@InterfaceC7396q double[] dArr) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        return (Set) ae9n(dArr, new LinkedHashSet(C6140e.m22479p(dArr.length)));
    }

    @InterfaceC6234g
    private static final double qu9(double[] dArr) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        return dArr[4];
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <T, R extends Comparable<? super R>> R quc(T[] tArr, cyoe.x2<? super T, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(tArr[0]);
        n5r1 it = new kotlin.ranges.x2(1, gjp(tArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(tArr[it.nextInt()]);
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    public static int que(@InterfaceC7396q long[] jArr, long j2) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        int length = jArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (j2 == jArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    @kotlin.hyr
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @InterfaceC6769y(name = "flatMapIndexedIterable")
    private static final <R> List<R> qv3(char[] cArr, InterfaceC5979h<? super Integer, ? super Character, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = cArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            C6163t.zp(arrayList, transform.invoke(Integer.valueOf(i3), Character.valueOf(cArr[i2])));
            i2++;
            i3++;
        }
        return arrayList;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final Double qvnf(int[] iArr, cyoe.x2<? super Integer, Double> selector) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        double dDoubleValue = selector.invoke(Integer.valueOf(iArr[0])).doubleValue();
        n5r1 it = new kotlin.ranges.x2(1, srpc(iArr)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, selector.invoke(Integer.valueOf(iArr[it.nextInt()])).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @InterfaceC6234g
    private static final long qvyi(long[] jArr, int i2, cyoe.x2<? super Integer, Long> defaultValue) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(defaultValue, "defaultValue");
        return (i2 < 0 || i2 > hmvj(jArr)) ? defaultValue.invoke(Integer.valueOf(i2)).longValue() : jArr[i2];
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final Float qwyf(double[] dArr, cyoe.x2<? super Double, Float> selector) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        float fFloatValue = selector.invoke(Double.valueOf(dArr[0])).floatValue();
        n5r1 it = new kotlin.ranges.x2(1, f14(dArr)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, selector.invoke(Double.valueOf(dArr[it.nextInt()])).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @InterfaceC7396q
    public static final <R, C extends Collection<? super R>> C qx(@InterfaceC7396q short[] sArr, @InterfaceC7396q C destination, @InterfaceC7396q InterfaceC5979h<? super Integer, ? super Short, ? extends R> transform) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        int length = sArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            destination.add(transform.invoke(Integer.valueOf(i3), Short.valueOf(sArr[i2])));
            i2++;
            i3++;
        }
        return destination;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <R> R qxj(long[] jArr, Comparator<? super R> comparator, cyoe.x2<? super Long, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Long.valueOf(jArr[0]));
        n5r1 it = new kotlin.ranges.x2(1, hmvj(jArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Long.valueOf(jArr[it.nextInt()]));
            if (comparator.compare(rInvoke, rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @kotlin.hyr
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @InterfaceC6769y(name = "flatMapIndexedIterable")
    private static final <R> List<R> qy(int[] iArr, InterfaceC5979h<? super Integer, ? super Integer, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            C6163t.zp(arrayList, transform.invoke(Integer.valueOf(i3), Integer.valueOf(iArr[i2])));
            i2++;
            i3++;
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final <K, M extends Map<? super K, ? super Double>> M qyk(@InterfaceC7396q double[] dArr, @InterfaceC7396q M destination, @InterfaceC7396q cyoe.x2<? super Double, ? extends K> keySelector) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(keySelector, "keySelector");
        for (double d2 : dArr) {
            destination.put(keySelector.invoke(Double.valueOf(d2)), Double.valueOf(d2));
        }
        return destination;
    }

    @InterfaceC7396q
    public static final List<Character> qyp(@InterfaceC7396q char[] cArr) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        return a9.wr(h9(cArr));
    }

    @InterfaceC7396q
    public static final <T> List<T> qyp7(@InterfaceC7396q T[] tArr, @InterfaceC7396q cyoe.x2<? super T, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z2 = false;
        for (T t2 : tArr) {
            if (z2) {
                arrayList.add(t2);
            } else if (!predicate.invoke(t2).booleanValue()) {
                arrayList.add(t2);
                z2 = true;
            }
        }
        return arrayList;
    }

    @InterfaceC7396q
    @kotlin.yz(version = "1.7")
    @InterfaceC6769y(name = "minOrThrow")
    public static final <T extends Comparable<? super T>> T qzh(@InterfaceC7396q T[] tArr) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        T t2 = tArr[0];
        n5r1 it = new kotlin.ranges.x2(1, gjp(tArr)).iterator();
        while (it.hasNext()) {
            T t3 = tArr[it.nextInt()];
            if (t2.compareTo(t3) > 0) {
                t2 = t3;
            }
        }
        return t2;
    }

    @InterfaceC7396q
    public static final List<Float> r07n(@InterfaceC7396q float[] fArr) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        kotlin.jvm.internal.d2ok.kja0(fArrCopyOf, "copyOf(this, size)");
        kotlin.collections.kja0.erbd(fArrCopyOf);
        return i05(fArrCopyOf);
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <R extends Comparable<? super R>> R r1(byte[] bArr, cyoe.x2<? super Byte, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Byte.valueOf(bArr[0]));
        n5r1 it = new kotlin.ranges.x2(1, vl(bArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Byte.valueOf(bArr[it.nextInt()]));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    public static final <R> R r19(@InterfaceC7396q short[] sArr, R r2, @InterfaceC7396q cyoe.cdj<? super Integer, ? super Short, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        for (int iOrxw = orxw(sArr); iOrxw >= 0; iOrxw--) {
            r2 = operation.invoke(Integer.valueOf(iOrxw), Short.valueOf(sArr[iOrxw]), r2);
        }
        return r2;
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final Character r1m3(@InterfaceC7396q char[] cArr, @InterfaceC7396q AbstractC6332g random) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(random, "random");
        if (cArr.length == 0) {
            return null;
        }
        return Character.valueOf(cArr[random.nextInt(cArr.length)]);
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final Short r3(@InterfaceC7396q short[] sArr, @InterfaceC7396q InterfaceC5979h<? super Short, ? super Short, Short> operation) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        int iOrxw = orxw(sArr);
        if (iOrxw < 0) {
            return null;
        }
        short sShortValue = sArr[iOrxw];
        for (int i2 = iOrxw - 1; i2 >= 0; i2--) {
            sShortValue = operation.invoke(Short.valueOf(sArr[i2]), Short.valueOf(sShortValue)).shortValue();
        }
        return Short.valueOf(sShortValue);
    }

    @InterfaceC7396q
    public static final List<Character> r3w(@InterfaceC7396q char[] cArr, @InterfaceC7396q cyoe.x2<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z2 = false;
        for (char c2 : cArr) {
            if (z2) {
                arrayList.add(Character.valueOf(c2));
            } else if (!predicate.invoke(Character.valueOf(c2)).booleanValue()) {
                arrayList.add(Character.valueOf(c2));
                z2 = true;
            }
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final HashSet<Float> r58(@InterfaceC7396q float[] fArr) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        return (HashSet) xk9p(fArr, new HashSet(C6140e.m22479p(fArr.length)));
    }

    public static final boolean r5c(@InterfaceC7396q long[] jArr) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        return jArr.length == 0;
    }

    @InterfaceC7396q
    public static final List<Boolean> r61(@InterfaceC7396q boolean[] zArr, @InterfaceC7396q Iterable<Integer> indices) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(indices, "indices");
        int iVyq = kotlin.collections.fu4.vyq(indices, 10);
        if (iVyq == 0) {
            return kotlin.collections.ni7.a9();
        }
        ArrayList arrayList = new ArrayList(iVyq);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(Boolean.valueOf(zArr[it.next().intValue()]));
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final Set<Float> r8(@InterfaceC7396q float[] fArr) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        int length = fArr.length;
        return length != 0 ? length != 1 ? (Set) xk9p(fArr, new LinkedHashSet(C6140e.m22479p(fArr.length))) : i1.m22499g(Float.valueOf(fArr[0])) : a98o.ld6();
    }

    @InterfaceC7396q
    public static final Set<Integer> r84j(@InterfaceC7396q int[] iArr, @InterfaceC7396q Iterable<Integer> other) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        Set<Integer> setGvu = gvu(iArr);
        C6163t.zp(setGvu, other);
        return setGvu;
    }

    @InterfaceC6234g
    private static final int r8k(int[] iArr) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        return iArr[3];
    }

    @kotlin.yz(version = "1.4")
    public static final void rax(@InterfaceC7396q int[] iArr, @InterfaceC7396q AbstractC6332g random) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(random, "random");
        for (int iSrpc = srpc(iArr); iSrpc > 0; iSrpc--) {
            int iNextInt = random.nextInt(iSrpc + 1);
            int i2 = iArr[iSrpc];
            iArr[iSrpc] = iArr[iNextInt];
            iArr[iNextInt] = i2;
        }
    }

    @InterfaceC6769y(name = "averageOfByte")
    public static final double rb7(@InterfaceC7396q Byte[] bArr) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        double dByteValue = 0.0d;
        int i2 = 0;
        for (Byte b2 : bArr) {
            dByteValue += (double) b2.byteValue();
            i2++;
        }
        if (i2 == 0) {
            return Double.NaN;
        }
        return dByteValue / ((double) i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC7396q
    public static final <K, V, M extends Map<? super K, List<V>>> M rc(@InterfaceC7396q long[] jArr, @InterfaceC7396q M destination, @InterfaceC7396q cyoe.x2<? super Long, ? extends K> keySelector, @InterfaceC7396q cyoe.x2<? super Long, ? extends V> valueTransform) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(keySelector, "keySelector");
        kotlin.jvm.internal.d2ok.m23075h(valueTransform, "valueTransform");
        for (long j2 : jArr) {
            K kInvoke = keySelector.invoke(Long.valueOf(j2));
            Object arrayList = destination.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(valueTransform.invoke(Long.valueOf(j2)));
        }
        return destination;
    }

    @InterfaceC7396q
    public static final double[] rd5(@InterfaceC7396q Double[] dArr) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        int length = dArr.length;
        double[] dArr2 = new double[length];
        for (int i2 = 0; i2 < length; i2++) {
            dArr2[i2] = dArr[i2].doubleValue();
        }
        return dArr2;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final Float re(int[] iArr, cyoe.x2<? super Integer, Float> selector) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        float fFloatValue = selector.invoke(Integer.valueOf(iArr[0])).floatValue();
        n5r1 it = new kotlin.ranges.x2(1, srpc(iArr)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, selector.invoke(Integer.valueOf(iArr[it.nextInt()])).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @InterfaceC7396q
    public static final <A extends Appendable> A re5(@InterfaceC7396q int[] iArr, @InterfaceC7396q A buffer, @InterfaceC7396q CharSequence separator, @InterfaceC7396q CharSequence prefix, @InterfaceC7396q CharSequence postfix, int i2, @InterfaceC7396q CharSequence truncated, @InterfaceC7395n cyoe.x2<? super Integer, ? extends CharSequence> x2Var) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(buffer, "buffer");
        kotlin.jvm.internal.d2ok.m23075h(separator, "separator");
        kotlin.jvm.internal.d2ok.m23075h(prefix, "prefix");
        kotlin.jvm.internal.d2ok.m23075h(postfix, "postfix");
        kotlin.jvm.internal.d2ok.m23075h(truncated, "truncated");
        buffer.append(prefix);
        int i3 = 0;
        for (int i4 : iArr) {
            i3++;
            if (i3 > 1) {
                buffer.append(separator);
            }
            if (i2 >= 0 && i3 > i2) {
                break;
            }
            if (x2Var != null) {
                buffer.append(x2Var.invoke(Integer.valueOf(i4)));
            } else {
                buffer.append(String.valueOf(i4));
            }
        }
        if (i2 >= 0 && i3 > i2) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    @InterfaceC7396q
    public static final List<Long> re9(@InterfaceC7396q long[] jArr, @InterfaceC7396q cyoe.x2<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z2 = false;
        for (long j2 : jArr) {
            if (z2) {
                arrayList.add(Long.valueOf(j2));
            } else if (!predicate.invoke(Long.valueOf(j2)).booleanValue()) {
                arrayList.add(Long.valueOf(j2));
                z2 = true;
            }
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final List<Byte> rek(@InterfaceC7396q byte[] bArr) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        int length = bArr.length;
        return length != 0 ? length != 1 ? hwpi(bArr) : kotlin.collections.zurt.ld6(Byte.valueOf(bArr[0])) : kotlin.collections.ni7.a9();
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final Double rg(float[] fArr, cyoe.x2<? super Float, Double> selector) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        double dDoubleValue = selector.invoke(Float.valueOf(fArr[0])).doubleValue();
        n5r1 it = new kotlin.ranges.x2(1, gto(fArr)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, selector.invoke(Float.valueOf(fArr[it.nextInt()])).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final <R> List<R> rg7(long[] jArr, R r2, InterfaceC5979h<? super R, ? super Long, ? extends R> operation) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (jArr.length == 0) {
            return kotlin.collections.zurt.ld6(r2);
        }
        ArrayList arrayList = new ArrayList(jArr.length + 1);
        arrayList.add(r2);
        for (long j2 : jArr) {
            r2 = operation.invoke(r2, Long.valueOf(j2));
            arrayList.add(r2);
        }
        return arrayList;
    }

    @InterfaceC6234g
    private static final int rh(long[] jArr) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        return jArr.length;
    }

    public static final boolean rig(@InterfaceC7396q float[] fArr, @InterfaceC7396q cyoe.x2<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (float f2 : fArr) {
            if (!predicate.invoke(Float.valueOf(f2)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @InterfaceC7395n
    public static final Byte rka(@InterfaceC7396q byte[] bArr, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        if (i2 < 0 || i2 > vl(bArr)) {
            return null;
        }
        return Byte.valueOf(bArr[i2]);
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final List<Byte> rkfn(byte[] bArr, cyoe.cdj<? super Integer, ? super Byte, ? super Byte, Byte> operation) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (bArr.length == 0) {
            return kotlin.collections.ni7.a9();
        }
        byte bByteValue = bArr[0];
        ArrayList arrayList = new ArrayList(bArr.length);
        arrayList.add(Byte.valueOf(bByteValue));
        int length = bArr.length;
        for (int i2 = 1; i2 < length; i2++) {
            bByteValue = operation.invoke(Integer.valueOf(i2), Byte.valueOf(bByteValue), Byte.valueOf(bArr[i2])).byteValue();
            arrayList.add(Byte.valueOf(bByteValue));
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final <T> T[] rkxl(@InterfaceC7396q T[] tArr) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        for (T t2 : tArr) {
            if (t2 == null) {
                throw new IllegalArgumentException("null element found in " + tArr + '.');
            }
        }
        return tArr;
    }

    public static final int rl(@InterfaceC7396q boolean[] zArr) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        return zArr.length - 1;
    }

    @InterfaceC7396q
    public static <T> kotlin.sequences.qrj<T> rlj(@InterfaceC7396q T[] tArr) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        return tArr.length == 0 ? kotlin.sequences.t8r.f7l8() : new p(tArr);
    }

    @InterfaceC7396q
    public static final <R, C extends Collection<? super R>> C rlpj(@InterfaceC7396q int[] iArr, @InterfaceC7396q C destination, @InterfaceC7396q cyoe.x2<? super Integer, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        for (int i2 : iArr) {
            C6163t.zp(destination, transform.invoke(Integer.valueOf(i2)));
        }
        return destination;
    }

    @kotlin.hyr
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @InterfaceC6769y(name = "flatMapIndexedIterable")
    private static final <R> List<R> rn(byte[] bArr, InterfaceC5979h<? super Integer, ? super Byte, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            C6163t.zp(arrayList, transform.invoke(Integer.valueOf(i3), Byte.valueOf(bArr[i2])));
            i2++;
            i3++;
        }
        return arrayList;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final Double rnro(short[] sArr, cyoe.x2<? super Short, Double> selector) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        double dDoubleValue = selector.invoke(Short.valueOf(sArr[0])).doubleValue();
        n5r1 it = new kotlin.ranges.x2(1, orxw(sArr)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, selector.invoke(Short.valueOf(sArr[it.nextInt()])).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.3")
    private static final long ro(long[] jArr) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        return t7zh(jArr, AbstractC6332g.Default);
    }

    @kotlin.yz(version = "1.4")
    public static final void rp0(@InterfaceC7396q int[] iArr) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        rax(iArr, AbstractC6332g.Default);
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final float rpjx(boolean[] zArr, cyoe.x2<? super Boolean, Float> selector) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (zArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(Boolean.valueOf(zArr[0])).floatValue();
        n5r1 it = new kotlin.ranges.x2(1, rl(zArr)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, selector.invoke(Boolean.valueOf(zArr[it.nextInt()])).floatValue());
        }
        return fFloatValue;
    }

    @InterfaceC7396q
    public static final <T, K, V, M extends Map<? super K, ? super V>> M rq(@InterfaceC7396q T[] tArr, @InterfaceC7396q M destination, @InterfaceC7396q cyoe.x2<? super T, ? extends K> keySelector, @InterfaceC7396q cyoe.x2<? super T, ? extends V> valueTransform) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(keySelector, "keySelector");
        kotlin.jvm.internal.d2ok.m23075h(valueTransform, "valueTransform");
        for (T t2 : tArr) {
            destination.put(keySelector.invoke(t2), valueTransform.invoke(t2));
        }
        return destination;
    }

    @InterfaceC7396q
    public static final <T> T[] rr(@InterfaceC7396q T[] tArr, @InterfaceC7396q Collection<Integer> indices) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(indices, "indices");
        T[] tArr2 = (T[]) kotlin.collections.qrj.m22602k(tArr, indices.size());
        Iterator<Integer> it = indices.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            tArr2[i2] = tArr[it.next().intValue()];
            i2++;
        }
        return tArr2;
    }

    public static final boolean rr7(@InterfaceC7396q boolean[] zArr, @InterfaceC7396q InterfaceC5979h<? super Boolean, ? super Boolean, Boolean> operation) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (zArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        boolean zBooleanValue = zArr[0];
        n5r1 it = new kotlin.ranges.x2(1, rl(zArr)).iterator();
        while (it.hasNext()) {
            zBooleanValue = operation.invoke(Boolean.valueOf(zBooleanValue), Boolean.valueOf(zArr[it.nextInt()])).booleanValue();
        }
        return zBooleanValue;
    }

    @InterfaceC7396q
    public static final <T> List<T> rrtv(@InterfaceC7396q T[] tArr, @InterfaceC7396q cyoe.x2<? super T, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (int iGjp = gjp(tArr); -1 < iGjp; iGjp--) {
            if (!predicate.invoke(tArr[iGjp]).booleanValue()) {
                return id(tArr, iGjp + 1);
            }
        }
        return vyee(tArr);
    }

    @InterfaceC7396q
    public static final double[] rst(@InterfaceC7396q double[] dArr, @InterfaceC7396q Collection<Integer> indices) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(indices, "indices");
        double[] dArr2 = new double[indices.size()];
        Iterator<Integer> it = indices.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            dArr2[i2] = dArr[it.next().intValue()];
            i2++;
        }
        return dArr2;
    }

    @InterfaceC6234g
    private static final boolean ru(long[] jArr) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        return jArr.length == 0;
    }

    @InterfaceC7396q
    public static final Set<Float> ru8(@InterfaceC7396q float[] fArr, @InterfaceC7396q Iterable<Float> other) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        Set<Float> setW1s = w1s(fArr);
        C6163t.vq(setW1s, other);
        return setW1s;
    }

    @InterfaceC7395n
    public static final <T> T rugz(@InterfaceC7396q T[] tArr) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        if (tArr.length == 0) {
            return null;
        }
        return tArr[tArr.length - 1];
    }

    public static final double rv(@InterfaceC7396q double[] dArr) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        if (dArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return dArr[f14(dArr)];
    }

    @InterfaceC7396q
    public static final <R> List<R> rw(@InterfaceC7396q double[] dArr, @InterfaceC7396q cyoe.x2<? super Double, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (double d2 : dArr) {
            C6163t.zp(arrayList, transform.invoke(Double.valueOf(d2)));
        }
        return arrayList;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <R> R rxcq(int[] iArr, Comparator<? super R> comparator, cyoe.x2<? super Integer, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Integer.valueOf(iArr[0]));
        n5r1 it = new kotlin.ranges.x2(1, srpc(iArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Integer.valueOf(iArr[it.nextInt()]));
            if (comparator.compare(rInvoke, rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC7396q
    public static final List<Float> ryij(@InterfaceC7396q float[] fArr, @InterfaceC7396q cyoe.x2<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (int iGto = gto(fArr); -1 < iGto; iGto--) {
            if (!predicate.invoke(Float.valueOf(fArr[iGto])).booleanValue()) {
                return kg(fArr, iGto + 1);
            }
        }
        return kotlin.collections.ni7.a9();
    }

    @InterfaceC7396q
    public static final <R, C extends Collection<? super R>> C rz(@InterfaceC7396q double[] dArr, @InterfaceC7396q C destination, @InterfaceC7396q InterfaceC5979h<? super Integer, ? super Double, ? extends R> transform) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        int length = dArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            destination.add(transform.invoke(Integer.valueOf(i3), Double.valueOf(dArr[i2])));
            i2++;
            i3++;
        }
        return destination;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <R> R s08(boolean[] zArr, Comparator<? super R> comparator, cyoe.x2<? super Boolean, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Boolean.valueOf(zArr[0]));
        n5r1 it = new kotlin.ranges.x2(1, rl(zArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Boolean.valueOf(zArr[it.nextInt()]));
            if (comparator.compare(rInvoke, rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC7396q
    public static final long[] s0i(@InterfaceC7396q long[] jArr) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        if (jArr.length == 0) {
            return jArr;
        }
        long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
        kotlin.jvm.internal.d2ok.kja0(jArrCopyOf, "copyOf(this, size)");
        kotlin.collections.kja0.rf(jArrCopyOf);
        return jArrCopyOf;
    }

    @kotlin.hyr
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @InterfaceC6769y(name = "flatMapIndexedSequence")
    private static final <T, R> List<R> s0jx(T[] tArr, InterfaceC5979h<? super Integer, ? super T, ? extends kotlin.sequences.qrj<? extends R>> transform) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = tArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            C6163t.m22610x(arrayList, transform.invoke(Integer.valueOf(i3), tArr[i2]));
            i2++;
            i3++;
        }
        return arrayList;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final <R> List<R> s0z1(char[] cArr, R r2, InterfaceC5979h<? super R, ? super Character, ? extends R> operation) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (cArr.length == 0) {
            return kotlin.collections.zurt.ld6(r2);
        }
        ArrayList arrayList = new ArrayList(cArr.length + 1);
        arrayList.add(r2);
        for (char c2 : cArr) {
            r2 = operation.invoke(r2, Character.valueOf(c2));
            arrayList.add(r2);
        }
        return arrayList;
    }

    @InterfaceC7395n
    public static final Long s2kp(@InterfaceC7396q long[] jArr) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        if (jArr.length == 1) {
            return Long.valueOf(jArr[0]);
        }
        return null;
    }

    public static final int s4pb(@InterfaceC7396q char[] cArr, char c2) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        int length = cArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (c2 == cArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final Float s4y(@InterfaceC7396q float[] fArr, @InterfaceC7396q Comparator<? super Float> comparator) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        if (fArr.length == 0) {
            return null;
        }
        float f2 = fArr[0];
        n5r1 it = new kotlin.ranges.x2(1, gto(fArr)).iterator();
        while (it.hasNext()) {
            float f3 = fArr[it.nextInt()];
            if (comparator.compare(Float.valueOf(f2), Float.valueOf(f3)) > 0) {
                f2 = f3;
            }
        }
        return Float.valueOf(f2);
    }

    public static final void s5(@InterfaceC7396q long[] jArr, @InterfaceC7396q InterfaceC5979h<? super Integer, ? super Long, was> action) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(action, "action");
        int length = jArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            action.invoke(Integer.valueOf(i3), Long.valueOf(jArr[i2]));
            i2++;
            i3++;
        }
    }

    public static final <R> R s5qd(@InterfaceC7396q float[] fArr, R r2, @InterfaceC7396q cyoe.cdj<? super Integer, ? super Float, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        for (int iGto = gto(fArr); iGto >= 0; iGto--) {
            r2 = operation.invoke(Integer.valueOf(iGto), Float.valueOf(fArr[iGto]), r2);
        }
        return r2;
    }

    @kotlin.hyr
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @InterfaceC6769y(name = "sumOfDouble")
    private static final double s6x2(long[] jArr, cyoe.x2<? super Long, Double> selector) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        double dDoubleValue = 0.0d;
        for (long j2 : jArr) {
            dDoubleValue += selector.invoke(Long.valueOf(j2)).doubleValue();
        }
        return dDoubleValue;
    }

    public static char s7(@InterfaceC7396q char[] cArr) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    @InterfaceC7396q
    public static final <T, R> List<R> s7uw(@InterfaceC7396q T[] tArr, @InterfaceC7396q InterfaceC5979h<? super Integer, ? super T, ? extends R> transform) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = tArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = i3 + 1;
            R rInvoke = transform.invoke(Integer.valueOf(i3), tArr[i2]);
            if (rInvoke != null) {
                arrayList.add(rInvoke);
            }
            i2++;
            i3 = i4;
        }
        return arrayList;
    }

    public static final char s8(@InterfaceC7396q char[] cArr, @InterfaceC7396q cyoe.x2<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (char c2 : cArr) {
            if (predicate.invoke(Character.valueOf(c2)).booleanValue()) {
                return c2;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @InterfaceC7396q
    public static final List<C6227f<Boolean, Boolean>> s8y(@InterfaceC7396q boolean[] zArr, @InterfaceC7396q boolean[] other) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        int iMin = Math.min(zArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i2 = 0; i2 < iMin; i2++) {
            arrayList.add(kotlin.nmn5.m23230k(Boolean.valueOf(zArr[i2]), Boolean.valueOf(other[i2])));
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final List<Byte> s9(@InterfaceC7396q byte[] bArr, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        if (i2 >= 0) {
            return bklz(bArr, kotlin.ranges.fn3e.fn3e(bArr.length - i2, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
    }

    @InterfaceC7396q
    public static final <K, V> Map<K, V> s9de(@InterfaceC7396q short[] sArr, @InterfaceC7396q cyoe.x2<? super Short, ? extends K> keySelector, @InterfaceC7396q cyoe.x2<? super Short, ? extends V> valueTransform) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(keySelector, "keySelector");
        kotlin.jvm.internal.d2ok.m23075h(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.fn3e.fn3e(C6140e.m22479p(sArr.length), 16));
        for (short s2 : sArr) {
            linkedHashMap.put(keySelector.invoke(Short.valueOf(s2)), valueTransform.invoke(Short.valueOf(s2)));
        }
        return linkedHashMap;
    }

    public static final int s9y(@InterfaceC7396q byte[] bArr) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        int i2 = 0;
        for (byte b2 : bArr) {
            i2 += b2;
        }
        return i2;
    }

    @InterfaceC7396q
    public static final List<Double> sa(@InterfaceC7396q double[] dArr, @InterfaceC7396q cyoe.x2<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (double d2 : dArr) {
            if (predicate.invoke(Double.valueOf(d2)).booleanValue()) {
                arrayList.add(Double.valueOf(d2));
            }
        }
        return arrayList;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <R> R sa1t(byte[] bArr, Comparator<? super R> comparator, cyoe.x2<? super Byte, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Byte.valueOf(bArr[0]));
        n5r1 it = new kotlin.ranges.x2(1, vl(bArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Byte.valueOf(bArr[it.nextInt()]));
            if (comparator.compare(rInvoke, rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    public static final boolean sd(@InterfaceC7396q boolean[] zArr, @InterfaceC7396q InterfaceC5979h<? super Boolean, ? super Boolean, Boolean> operation) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        int iRl = rl(zArr);
        if (iRl < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        boolean zBooleanValue = zArr[iRl];
        for (int i2 = iRl - 1; i2 >= 0; i2--) {
            zBooleanValue = operation.invoke(Boolean.valueOf(zArr[i2]), Boolean.valueOf(zBooleanValue)).booleanValue();
        }
        return zBooleanValue;
    }

    @InterfaceC7396q
    public static final <R, V> List<V> sdmr(@InterfaceC7396q double[] dArr, @InterfaceC7396q R[] other, @InterfaceC7396q InterfaceC5979h<? super Double, ? super R, ? extends V> transform) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        int iMin = Math.min(dArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i2 = 0; i2 < iMin; i2++) {
            arrayList.add(transform.invoke(Double.valueOf(dArr[i2]), other[i2]));
        }
        return arrayList;
    }

    public static final int se2c(@InterfaceC7396q short[] sArr, @InterfaceC7396q cyoe.x2<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        int i2 = 0;
        for (short s2 : sArr) {
            if (predicate.invoke(Short.valueOf(s2)).booleanValue()) {
                i2++;
            }
        }
        return i2;
    }

    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final <R extends Comparable<? super R>> Short sfu(@InterfaceC7396q short[] sArr, @InterfaceC7396q cyoe.x2<? super Short, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        short s2 = sArr[0];
        int iOrxw = orxw(sArr);
        if (iOrxw == 0) {
            return Short.valueOf(s2);
        }
        R rInvoke = selector.invoke(Short.valueOf(s2));
        n5r1 it = new kotlin.ranges.x2(1, iOrxw).iterator();
        while (it.hasNext()) {
            short s3 = sArr[it.nextInt()];
            R rInvoke2 = selector.invoke(Short.valueOf(s3));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                s2 = s3;
                rInvoke = rInvoke2;
            }
        }
        return Short.valueOf(s2);
    }

    @InterfaceC6234g
    private static final byte sgh1(byte[] bArr, int i2, cyoe.x2<? super Integer, Byte> defaultValue) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(defaultValue, "defaultValue");
        return (i2 < 0 || i2 > vl(bArr)) ? defaultValue.invoke(Integer.valueOf(i2)).byteValue() : bArr[i2];
    }

    public static final <T> boolean sh(@InterfaceC7396q T[] tArr) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        return tArr.length == 0;
    }

    @InterfaceC7396q
    public static final <V> List<V> sk1t(@InterfaceC7396q short[] sArr, @InterfaceC7396q short[] other, @InterfaceC7396q InterfaceC5979h<? super Short, ? super Short, ? extends V> transform) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        int iMin = Math.min(sArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i2 = 0; i2 < iMin; i2++) {
            arrayList.add(transform.invoke(Short.valueOf(sArr[i2]), Short.valueOf(other[i2])));
        }
        return arrayList;
    }

    public static final <R> R sl(@InterfaceC7396q short[] sArr, R r2, @InterfaceC7396q InterfaceC5979h<? super Short, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        for (int iOrxw = orxw(sArr); iOrxw >= 0; iOrxw--) {
            r2 = operation.invoke(Short.valueOf(sArr[iOrxw]), r2);
        }
        return r2;
    }

    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final Byte sly(@InterfaceC7396q byte[] bArr) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        if (bArr.length == 0) {
            return null;
        }
        byte b2 = bArr[0];
        n5r1 it = new kotlin.ranges.x2(1, vl(bArr)).iterator();
        while (it.hasNext()) {
            byte b3 = bArr[it.nextInt()];
            if (b2 < b3) {
                b2 = b3;
            }
        }
        return Byte.valueOf(b2);
    }

    public static final boolean sm(@InterfaceC7396q long[] jArr, @InterfaceC7396q cyoe.x2<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (long j2 : jArr) {
            if (!predicate.invoke(Long.valueOf(j2)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final <R> List<R> sn(long[] jArr, R r2, cyoe.cdj<? super Integer, ? super R, ? super Long, ? extends R> operation) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (jArr.length == 0) {
            return kotlin.collections.zurt.ld6(r2);
        }
        ArrayList arrayList = new ArrayList(jArr.length + 1);
        arrayList.add(r2);
        int length = jArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            r2 = operation.invoke(Integer.valueOf(i2), r2, Long.valueOf(jArr[i2]));
            arrayList.add(r2);
        }
        return arrayList;
    }

    @InterfaceC6234g
    private static final double so(double[] dArr, int i2, cyoe.x2<? super Integer, Double> defaultValue) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(defaultValue, "defaultValue");
        return (i2 < 0 || i2 > f14(dArr)) ? defaultValue.invoke(Integer.valueOf(i2)).doubleValue() : dArr[i2];
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final Float so0v(boolean[] zArr, cyoe.x2<? super Boolean, Float> selector) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        float fFloatValue = selector.invoke(Boolean.valueOf(zArr[0])).floatValue();
        n5r1 it = new kotlin.ranges.x2(1, rl(zArr)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, selector.invoke(Boolean.valueOf(zArr[it.nextInt()])).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @InterfaceC7396q
    public static final Set<Short> spjb(@InterfaceC7396q short[] sArr, @InterfaceC7396q Iterable<Short> other) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        Set<Short> setFxq0 = fxq0(sArr);
        C6163t.zp(setFxq0, other);
        return setFxq0;
    }

    @kotlin.yz(version = "1.7")
    @InterfaceC6769y(name = "minByOrThrow")
    public static final <R extends Comparable<? super R>> float sq2k(@InterfaceC7396q float[] fArr, @InterfaceC7396q cyoe.x2<? super Float, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        float f2 = fArr[0];
        int iGto = gto(fArr);
        if (iGto == 0) {
            return f2;
        }
        R rInvoke = selector.invoke(Float.valueOf(f2));
        n5r1 it = new kotlin.ranges.x2(1, iGto).iterator();
        while (it.hasNext()) {
            float f3 = fArr[it.nextInt()];
            R rInvoke2 = selector.invoke(Float.valueOf(f3));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                f2 = f3;
                rInvoke = rInvoke2;
            }
        }
        return f2;
    }

    @kotlin.yz(version = "1.4")
    public static final <T> void sr(@InterfaceC7396q T[] tArr, @InterfaceC7396q AbstractC6332g random) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(random, "random");
        for (int iGjp = gjp(tArr); iGjp > 0; iGjp--) {
            int iNextInt = random.nextInt(iGjp + 1);
            T t2 = tArr[iGjp];
            tArr[iGjp] = tArr[iNextInt];
            tArr[iNextInt] = t2;
        }
    }

    @InterfaceC7396q
    public static final List<Double> sr0i(@InterfaceC7396q double[] dArr, @InterfaceC7396q cyoe.x2<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (double d2 : dArr) {
            if (!predicate.invoke(Double.valueOf(d2)).booleanValue()) {
                arrayList.add(Double.valueOf(d2));
            }
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final <K, M extends Map<? super K, List<Float>>> M sr6(@InterfaceC7396q float[] fArr, @InterfaceC7396q M destination, @InterfaceC7396q cyoe.x2<? super Float, ? extends K> keySelector) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(keySelector, "keySelector");
        for (float f2 : fArr) {
            K kInvoke = keySelector.invoke(Float.valueOf(f2));
            Object arrayList = destination.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(Float.valueOf(f2));
        }
        return destination;
    }

    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final Long srp(@InterfaceC7396q long[] jArr, @InterfaceC7396q cyoe.cdj<? super Integer, ? super Long, ? super Long, Long> operation) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (jArr.length == 0) {
            return null;
        }
        long jLongValue = jArr[0];
        n5r1 it = new kotlin.ranges.x2(1, hmvj(jArr)).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            jLongValue = operation.invoke(Integer.valueOf(iNextInt), Long.valueOf(jLongValue), Long.valueOf(jArr[iNextInt])).longValue();
        }
        return Long.valueOf(jLongValue);
    }

    public static int srpc(@InterfaceC7396q int[] iArr) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        return iArr.length - 1;
    }

    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final Short ss2(@InterfaceC7396q short[] sArr, @InterfaceC7396q Comparator<? super Short> comparator) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        if (sArr.length == 0) {
            return null;
        }
        short s2 = sArr[0];
        n5r1 it = new kotlin.ranges.x2(1, orxw(sArr)).iterator();
        while (it.hasNext()) {
            short s3 = sArr[it.nextInt()];
            if (comparator.compare(Short.valueOf(s2), Short.valueOf(s3)) < 0) {
                s2 = s3;
            }
        }
        return Short.valueOf(s2);
    }

    @InterfaceC7396q
    public static final <R extends Comparable<? super R>> List<Float> st(@InterfaceC7396q float[] fArr, @InterfaceC7396q cyoe.x2<? super Float, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        return q6c(fArr, new f7l8.C6179k(selector));
    }

    @kotlin.yz(version = "1.7")
    @InterfaceC6769y(name = "minWithOrThrow")
    public static final <T> T sttf(@InterfaceC7396q T[] tArr, @InterfaceC7396q Comparator<? super T> comparator) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        T t2 = tArr[0];
        n5r1 it = new kotlin.ranges.x2(1, gjp(tArr)).iterator();
        while (it.hasNext()) {
            T t3 = tArr[it.nextInt()];
            if (comparator.compare(t2, t3) > 0) {
                t2 = t3;
            }
        }
        return t2;
    }

    public static final boolean su(@InterfaceC7396q boolean[] zArr) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        int length = zArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return zArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    @InterfaceC7396q
    public static final <K, M extends Map<? super K, List<Double>>> M su2(@InterfaceC7396q double[] dArr, @InterfaceC7396q M destination, @InterfaceC7396q cyoe.x2<? super Double, ? extends K> keySelector) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(keySelector, "keySelector");
        for (double d2 : dArr) {
            K kInvoke = keySelector.invoke(Double.valueOf(d2));
            Object arrayList = destination.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(Double.valueOf(d2));
        }
        return destination;
    }

    public static final int sval(@InterfaceC7396q char[] cArr, @InterfaceC7396q cyoe.x2<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        int length = cArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (predicate.invoke(Character.valueOf(cArr[length])).booleanValue()) {
                    return length;
                }
                if (i2 < 0) {
                    break;
                }
                length = i2;
            }
        }
        return -1;
    }

    @InterfaceC7396q
    public static final <T, R, C extends Collection<? super R>> C sw0(@InterfaceC7396q T[] tArr, @InterfaceC7396q C destination, @InterfaceC7396q cyoe.x2<? super T, ? extends R> transform) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        for (T t2 : tArr) {
            destination.add(transform.invoke(t2));
        }
        return destination;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final Double sxpt(int[] iArr, cyoe.x2<? super Integer, Double> selector) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        double dDoubleValue = selector.invoke(Integer.valueOf(iArr[0])).doubleValue();
        n5r1 it = new kotlin.ranges.x2(1, srpc(iArr)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, selector.invoke(Integer.valueOf(iArr[it.nextInt()])).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    public static void sxq(@InterfaceC7396q long[] jArr) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        int length = (jArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int iHmvj = hmvj(jArr);
        n5r1 it = new kotlin.ranges.x2(0, length).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            long j2 = jArr[iNextInt];
            jArr[iNextInt] = jArr[iHmvj];
            jArr[iHmvj] = j2;
            iHmvj--;
        }
    }

    @kotlin.x2(warningSince = "1.5")
    @kotlin.ld6(message = "Use sumOf instead.", replaceWith = @kotlin.hb(expression = "this.sumOf(selector)", imports = {}))
    public static final int sy9g(@InterfaceC7396q float[] fArr, @InterfaceC7396q cyoe.x2<? super Float, Integer> selector) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        int iIntValue = 0;
        for (float f2 : fArr) {
            iIntValue += selector.invoke(Float.valueOf(f2)).intValue();
        }
        return iIntValue;
    }

    @InterfaceC6234g
    private static final Float syl2(float[] fArr, cyoe.x2<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (float f2 : fArr) {
            if (predicate.invoke(Float.valueOf(f2)).booleanValue()) {
                return Float.valueOf(f2);
            }
        }
        return null;
    }

    public static /* synthetic */ String szp(short[] sArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, cyoe.x2 x2Var, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i3 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i3 & 4) == 0 ? charSequence3 : "";
        if ((i3 & 8) != 0) {
            i2 = -1;
        }
        int i4 = i2;
        if ((i3 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i3 & 32) != 0) {
            x2Var = null;
        }
        return d79j(sArr, charSequence, charSequence5, charSequence6, i4, charSequence7, x2Var);
    }

    public static final boolean t0(@InterfaceC7396q boolean[] zArr, boolean z2) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        return l8s(zArr, z2) >= 0;
    }

    public static final int t00(@InterfaceC7396q boolean[] zArr, @InterfaceC7396q cyoe.x2<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        int length = zArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (predicate.invoke(Boolean.valueOf(zArr[i2])).booleanValue()) {
                return i2;
            }
        }
        return -1;
    }

    @InterfaceC7396q
    public static final <C extends Collection<? super Byte>> C t1(@InterfaceC7396q byte[] bArr, @InterfaceC7396q C destination, @InterfaceC7396q InterfaceC5979h<? super Integer, ? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            byte b2 = bArr[i2];
            int i4 = i3 + 1;
            if (predicate.invoke(Integer.valueOf(i3), Byte.valueOf(b2)).booleanValue()) {
                destination.add(Byte.valueOf(b2));
            }
            i2++;
            i3 = i4;
        }
        return destination;
    }

    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final Integer t146(@InterfaceC7396q int[] iArr) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        int i2 = iArr[0];
        n5r1 it = new kotlin.ranges.x2(1, srpc(iArr)).iterator();
        while (it.hasNext()) {
            int i3 = iArr[it.nextInt()];
            if (i2 > i3) {
                i2 = i3;
            }
        }
        return Integer.valueOf(i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC7396q
    public static final <T, K, V> Map<K, List<V>> t2d(@InterfaceC7396q T[] tArr, @InterfaceC7396q cyoe.x2<? super T, ? extends K> keySelector, @InterfaceC7396q cyoe.x2<? super T, ? extends V> valueTransform) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(keySelector, "keySelector");
        kotlin.jvm.internal.d2ok.m23075h(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (a98o.toq toqVar : tArr) {
            K kInvoke = keySelector.invoke(toqVar);
            List<V> arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(kInvoke, arrayList);
            }
            arrayList.add(valueTransform.invoke(toqVar));
        }
        return linkedHashMap;
    }

    @InterfaceC7396q
    public static final <T> List<T> t2et(@InterfaceC7396q T[] tArr, @InterfaceC7396q cyoe.x2<? super T, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (T t2 : tArr) {
            if (!predicate.invoke(t2).booleanValue()) {
                arrayList.add(t2);
            }
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final <C extends Collection<? super Short>> C t4(@InterfaceC7396q short[] sArr, @InterfaceC7396q C destination, @InterfaceC7396q cyoe.x2<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (short s2 : sArr) {
            if (predicate.invoke(Short.valueOf(s2)).booleanValue()) {
                destination.add(Short.valueOf(s2));
            }
        }
        return destination;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <T> Float t4se(T[] tArr, cyoe.x2<? super T, Float> selector) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        float fFloatValue = selector.invoke(tArr[0]).floatValue();
        n5r1 it = new kotlin.ranges.x2(1, gjp(tArr)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, selector.invoke(tArr[it.nextInt()]).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    public static final boolean t5(@InterfaceC7396q boolean[] zArr) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        if (zArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return zArr[0];
    }

    @InterfaceC6769y(name = "averageOfShort")
    public static final double t57j(@InterfaceC7396q Short[] shArr) {
        kotlin.jvm.internal.d2ok.m23075h(shArr, "<this>");
        double dShortValue = 0.0d;
        int i2 = 0;
        for (Short sh : shArr) {
            dShortValue += (double) sh.shortValue();
            i2++;
        }
        if (i2 == 0) {
            return Double.NaN;
        }
        return dShortValue / ((double) i2);
    }

    @kotlin.hyr
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @InterfaceC6769y(name = "flatMapIndexedIterableTo")
    private static final <T, R, C extends Collection<? super R>> C t6(T[] tArr, C destination, InterfaceC5979h<? super Integer, ? super T, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        int length = tArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            C6163t.zp(destination, transform.invoke(Integer.valueOf(i3), tArr[i2]));
            i2++;
            i3++;
        }
        return destination;
    }

    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final Double t7(@InterfaceC7396q double[] dArr, @InterfaceC7396q Comparator<? super Double> comparator) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        if (dArr.length == 0) {
            return null;
        }
        double d2 = dArr[0];
        n5r1 it = new kotlin.ranges.x2(1, f14(dArr)).iterator();
        while (it.hasNext()) {
            double d4 = dArr[it.nextInt()];
            if (comparator.compare(Double.valueOf(d2), Double.valueOf(d4)) < 0) {
                d2 = d4;
            }
        }
        return Double.valueOf(d2);
    }

    @InterfaceC7396q
    public static final List<Integer> t7j(@InterfaceC7396q int[] iArr, @InterfaceC7396q Comparator<? super Integer> comparator) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        Integer[] numArrCb = kotlin.collections.kja0.cb(iArr);
        kotlin.collections.kja0.izu(numArrCb, comparator);
        return kotlin.collections.kja0.m22514i(numArrCb);
    }

    @kotlin.yz(version = "1.3")
    public static final long t7zh(@InterfaceC7396q long[] jArr, @InterfaceC7396q AbstractC6332g random) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(random, "random");
        if (jArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return jArr[random.nextInt(jArr.length)];
    }

    @InterfaceC7396q
    public static final <K> Map<K, Character> t8fp(@InterfaceC7396q char[] cArr, @InterfaceC7396q cyoe.x2<? super Character, ? extends K> keySelector) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.fn3e.fn3e(C6140e.m22479p(cArr.length), 16));
        for (char c2 : cArr) {
            linkedHashMap.put(keySelector.invoke(Character.valueOf(c2)), Character.valueOf(c2));
        }
        return linkedHashMap;
    }

    @InterfaceC7396q
    public static final <K, M extends Map<? super K, ? super Character>> M t8o(@InterfaceC7396q char[] cArr, @InterfaceC7396q M destination, @InterfaceC7396q cyoe.x2<? super Character, ? extends K> keySelector) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(keySelector, "keySelector");
        for (char c2 : cArr) {
            destination.put(keySelector.invoke(Character.valueOf(c2)), Character.valueOf(c2));
        }
        return destination;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final byte[] t9(byte[] bArr, cyoe.x2<? super Byte, was> action) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(action, "action");
        for (byte b2 : bArr) {
            action.invoke(Byte.valueOf(b2));
        }
        return bArr;
    }

    @InterfaceC7396q
    public static final <K, V> Map<K, List<V>> ta(@InterfaceC7396q boolean[] zArr, @InterfaceC7396q cyoe.x2<? super Boolean, ? extends K> keySelector, @InterfaceC7396q cyoe.x2<? super Boolean, ? extends V> valueTransform) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(keySelector, "keySelector");
        kotlin.jvm.internal.d2ok.m23075h(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (boolean z2 : zArr) {
            K kInvoke = keySelector.invoke(Boolean.valueOf(z2));
            List<V> arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(kInvoke, arrayList);
            }
            arrayList.add(valueTransform.invoke(Boolean.valueOf(z2)));
        }
        return linkedHashMap;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <R> R ta3f(byte[] bArr, Comparator<? super R> comparator, cyoe.x2<? super Byte, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Byte.valueOf(bArr[0]));
        n5r1 it = new kotlin.ranges.x2(1, vl(bArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Byte.valueOf(bArr[it.nextInt()]));
            if (comparator.compare(rInvoke, rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final Long ta9a(long[] jArr) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        return v5fy(jArr, AbstractC6332g.Default);
    }

    @InterfaceC7396q
    public static final kotlin.ranges.x2 tb(@InterfaceC7396q double[] dArr) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        return new kotlin.ranges.x2(0, f14(dArr));
    }

    @InterfaceC7396q
    public static final Set<Integer> tbc(@InterfaceC7396q int[] iArr) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        int length = iArr.length;
        return length != 0 ? length != 1 ? (Set) a7on(iArr, new LinkedHashSet(C6140e.m22479p(iArr.length))) : i1.m22499g(Integer.valueOf(iArr[0])) : a98o.ld6();
    }

    public static final <R> R tc(@InterfaceC7396q int[] iArr, R r2, @InterfaceC7396q cyoe.cdj<? super Integer, ? super Integer, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        for (int iSrpc = srpc(iArr); iSrpc >= 0; iSrpc--) {
            r2 = operation.invoke(Integer.valueOf(iSrpc), Integer.valueOf(iArr[iSrpc]), r2);
        }
        return r2;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final <V> Map<Double, V> td(double[] dArr, cyoe.x2<? super Double, ? extends V> valueSelector) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(valueSelector, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.fn3e.fn3e(C6140e.m22479p(dArr.length), 16));
        for (double d2 : dArr) {
            linkedHashMap.put(Double.valueOf(d2), valueSelector.invoke(Double.valueOf(d2)));
        }
        return linkedHashMap;
    }

    @kotlin.yz(version = "1.7")
    @InterfaceC6769y(name = "minOrThrow")
    public static final char tdgg(@InterfaceC7396q char[] cArr) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        char c2 = cArr[0];
        n5r1 it = new kotlin.ranges.x2(1, j59a(cArr)).iterator();
        while (it.hasNext()) {
            char c3 = cArr[it.nextInt()];
            if (kotlin.jvm.internal.d2ok.m23076i(c2, c3) > 0) {
                c2 = c3;
            }
        }
        return c2;
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final Double tdq(double[] dArr) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        return wjj2(dArr, AbstractC6332g.Default);
    }

    @InterfaceC6234g
    private static final boolean tdsa(int[] iArr) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        return iArr.length == 0;
    }

    @InterfaceC7396q
    public static final <K, V, M extends Map<? super K, ? super V>> M te(@InterfaceC7396q byte[] bArr, @InterfaceC7396q M destination, @InterfaceC7396q cyoe.x2<? super Byte, ? extends K> keySelector, @InterfaceC7396q cyoe.x2<? super Byte, ? extends V> valueTransform) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(keySelector, "keySelector");
        kotlin.jvm.internal.d2ok.m23075h(valueTransform, "valueTransform");
        for (byte b2 : bArr) {
            destination.put(keySelector.invoke(Byte.valueOf(b2)), valueTransform.invoke(Byte.valueOf(b2)));
        }
        return destination;
    }

    @InterfaceC7396q
    public static final <R, V> List<V> tfb(@InterfaceC7396q float[] fArr, @InterfaceC7396q Iterable<? extends R> other, @InterfaceC7396q InterfaceC5979h<? super Float, ? super R, ? extends V> transform) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        int length = fArr.length;
        ArrayList arrayList = new ArrayList(Math.min(kotlin.collections.fu4.vyq(other, 10), length));
        int i2 = 0;
        for (R r2 : other) {
            if (i2 >= length) {
                break;
            }
            arrayList.add(transform.invoke(Float.valueOf(fArr[i2]), r2));
            i2++;
        }
        return arrayList;
    }

    @kotlin.yz(version = "1.3")
    public static final <T> T tfr(@InterfaceC7396q T[] tArr, @InterfaceC7396q AbstractC6332g random) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(random, "random");
        if (tArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return tArr[random.nextInt(tArr.length)];
    }

    public static void tgj1(@InterfaceC7396q short[] sArr) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        int length = (sArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int iOrxw = orxw(sArr);
        n5r1 it = new kotlin.ranges.x2(0, length).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            short s2 = sArr[iNextInt];
            sArr[iNextInt] = sArr[iOrxw];
            sArr[iOrxw] = s2;
            iOrxw--;
        }
    }

    @kotlin.hyr
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @InterfaceC6769y(name = "sumOfDouble")
    private static final double tgkg(byte[] bArr, cyoe.x2<? super Byte, Double> selector) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        double dDoubleValue = 0.0d;
        for (byte b2 : bArr) {
            dDoubleValue += selector.invoke(Byte.valueOf(b2)).doubleValue();
        }
        return dDoubleValue;
    }

    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final Byte tgr(@InterfaceC7396q byte[] bArr, @InterfaceC7396q cyoe.cdj<? super Integer, ? super Byte, ? super Byte, Byte> operation) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (bArr.length == 0) {
            return null;
        }
        byte bByteValue = bArr[0];
        n5r1 it = new kotlin.ranges.x2(1, vl(bArr)).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            bByteValue = operation.invoke(Integer.valueOf(iNextInt), Byte.valueOf(bByteValue), Byte.valueOf(bArr[iNextInt])).byteValue();
        }
        return Byte.valueOf(bByteValue);
    }

    @InterfaceC7396q
    public static final <R> List<C6227f<Short, R>> tgs(@InterfaceC7396q short[] sArr, @InterfaceC7396q R[] other) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        int iMin = Math.min(sArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i2 = 0; i2 < iMin; i2++) {
            short s2 = sArr[i2];
            arrayList.add(kotlin.nmn5.m23230k(Short.valueOf(s2), other[i2]));
        }
        return arrayList;
    }

    @InterfaceC6234g
    private static final short thtw(short[] sArr) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        return sArr[0];
    }

    @InterfaceC7396q
    public static final <T, R> List<R> ti1(@InterfaceC7396q T[] tArr, @InterfaceC7396q cyoe.x2<? super T, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (T t2 : tArr) {
            C6163t.zp(arrayList, transform.invoke(t2));
        }
        return arrayList;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <R extends Comparable<? super R>> R tjx(boolean[] zArr, cyoe.x2<? super Boolean, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Boolean.valueOf(zArr[0]));
        n5r1 it = new kotlin.ranges.x2(1, rl(zArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Boolean.valueOf(zArr[it.nextInt()]));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    public static final short tk5o(@InterfaceC7396q short[] sArr, @InterfaceC7396q cyoe.cdj<? super Integer, ? super Short, ? super Short, Short> operation) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        int iOrxw = orxw(sArr);
        if (iOrxw < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        short sShortValue = sArr[iOrxw];
        for (int i2 = iOrxw - 1; i2 >= 0; i2--) {
            sShortValue = operation.invoke(Integer.valueOf(i2), Short.valueOf(sArr[i2]), Short.valueOf(sShortValue)).shortValue();
        }
        return sShortValue;
    }

    @InterfaceC7396q
    public static final <K> Map<K, List<Long>> tkle(@InterfaceC7396q long[] jArr, @InterfaceC7396q cyoe.x2<? super Long, ? extends K> keySelector) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (long j2 : jArr) {
            K kInvoke = keySelector.invoke(Long.valueOf(j2));
            Object arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(Long.valueOf(j2));
        }
        return linkedHashMap;
    }

    @InterfaceC7396q
    public static final String tl(@InterfaceC7396q boolean[] zArr, @InterfaceC7396q CharSequence separator, @InterfaceC7396q CharSequence prefix, @InterfaceC7396q CharSequence postfix, int i2, @InterfaceC7396q CharSequence truncated, @InterfaceC7395n cyoe.x2<? super Boolean, ? extends CharSequence> x2Var) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(separator, "separator");
        kotlin.jvm.internal.d2ok.m23075h(prefix, "prefix");
        kotlin.jvm.internal.d2ok.m23075h(postfix, "postfix");
        kotlin.jvm.internal.d2ok.m23075h(truncated, "truncated");
        String string = ((StringBuilder) n7(zArr, new StringBuilder(), separator, prefix, postfix, i2, truncated, x2Var)).toString();
        kotlin.jvm.internal.d2ok.kja0(string, "joinTo(StringBuilder(), …ed, transform).toString()");
        return string;
    }

    @kotlin.yz(version = "1.4")
    public static final void tlc(@InterfaceC7396q float[] fArr, @InterfaceC7396q AbstractC6332g random) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(random, "random");
        for (int iGto = gto(fArr); iGto > 0; iGto--) {
            int iNextInt = random.nextInt(iGto + 1);
            float f2 = fArr[iGto];
            fArr[iGto] = fArr[iNextInt];
            fArr[iNextInt] = f2;
        }
    }

    @InterfaceC7396q
    public static final <R> List<C6227f<Short, R>> tlhn(@InterfaceC7396q short[] sArr, @InterfaceC7396q Iterable<? extends R> other) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        int length = sArr.length;
        ArrayList arrayList = new ArrayList(Math.min(kotlin.collections.fu4.vyq(other, 10), length));
        int i2 = 0;
        for (R r2 : other) {
            if (i2 >= length) {
                break;
            }
            arrayList.add(kotlin.nmn5.m23230k(Short.valueOf(sArr[i2]), r2));
            i2++;
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final Set<Character> tlra(@InterfaceC7396q char[] cArr, @InterfaceC7396q Iterable<Character> other) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        Set<Character> setH9 = h9(cArr);
        C6163t.zp(setH9, other);
        return setH9;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final float tlw5(short[] sArr, cyoe.x2<? super Short, Float> selector) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(Short.valueOf(sArr[0])).floatValue();
        n5r1 it = new kotlin.ranges.x2(1, orxw(sArr)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, selector.invoke(Short.valueOf(sArr[it.nextInt()])).floatValue());
        }
        return fFloatValue;
    }

    @kotlin.yz(version = "1.4")
    public static void tm(@InterfaceC7396q int[] iArr, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.collections.zy.Companion.m22683q(i2, i3, iArr.length);
        int i4 = (i2 + i3) / 2;
        if (i2 == i4) {
            return;
        }
        int i5 = i3 - 1;
        while (i2 < i4) {
            int i6 = iArr[i2];
            iArr[i2] = iArr[i5];
            iArr[i5] = i6;
            i5--;
            i2++;
        }
    }

    @kotlin.yz(version = "1.4")
    public static final <T> void tm71(@InterfaceC7396q T[] tArr, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.collections.zy.Companion.m22683q(i2, i3, tArr.length);
        int i4 = (i2 + i3) / 2;
        if (i2 == i4) {
            return;
        }
        int i5 = i3 - 1;
        while (i2 < i4) {
            T t2 = tArr[i2];
            tArr[i2] = tArr[i5];
            tArr[i5] = t2;
            i5--;
            i2++;
        }
    }

    @InterfaceC7396q
    public static final Set<Float> tma(@InterfaceC7396q float[] fArr, @InterfaceC7396q Iterable<Float> other) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        Set<Float> setW1s = w1s(fArr);
        C6163t.zsr0(setW1s, other);
        return setW1s;
    }

    @InterfaceC6234g
    private static final int tn(float[] fArr) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        return fArr.length;
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final <T> T tn4(T[] tArr) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        return (T) hx5d(tArr, AbstractC6332g.Default);
    }

    @InterfaceC7395n
    public static final Double tor2(@InterfaceC7396q double[] dArr) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        if (dArr.length == 1) {
            return Double.valueOf(dArr[0]);
        }
        return null;
    }

    @kotlin.yz(version = "1.7")
    @InterfaceC6769y(name = "minByOrThrow")
    public static final <R extends Comparable<? super R>> long tosv(@InterfaceC7396q long[] jArr, @InterfaceC7396q cyoe.x2<? super Long, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        long j2 = jArr[0];
        int iHmvj = hmvj(jArr);
        if (iHmvj == 0) {
            return j2;
        }
        R rInvoke = selector.invoke(Long.valueOf(j2));
        n5r1 it = new kotlin.ranges.x2(1, iHmvj).iterator();
        while (it.hasNext()) {
            long j3 = jArr[it.nextInt()];
            R rInvoke2 = selector.invoke(Long.valueOf(j3));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
                j2 = j3;
            }
        }
        return j2;
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final Short tpl(@InterfaceC7396q short[] sArr, @InterfaceC7396q AbstractC6332g random) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(random, "random");
        if (sArr.length == 0) {
            return null;
        }
        return Short.valueOf(sArr[random.nextInt(sArr.length)]);
    }

    @kotlin.hyr
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @InterfaceC6769y(name = "sumOfDouble")
    private static final double tpq(char[] cArr, cyoe.x2<? super Character, Double> selector) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        double dDoubleValue = 0.0d;
        for (char c2 : cArr) {
            dDoubleValue += selector.invoke(Character.valueOf(c2)).doubleValue();
        }
        return dDoubleValue;
    }

    public static final <R> R tpq8(@InterfaceC7396q double[] dArr, R r2, @InterfaceC7396q InterfaceC5979h<? super R, ? super Double, ? extends R> operation) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        for (double d2 : dArr) {
            r2 = operation.invoke(r2, Double.valueOf(d2));
        }
        return r2;
    }

    @kotlin.hyr
    @InterfaceC7396q
    @kotlin.yz(version = "1.4")
    @InterfaceC6769y(name = "flatMapSequence")
    public static final <T, R> List<R> trap(@InterfaceC7396q T[] tArr, @InterfaceC7396q cyoe.x2<? super T, ? extends kotlin.sequences.qrj<? extends R>> transform) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (T t2 : tArr) {
            C6163t.m22610x(arrayList, transform.invoke(t2));
        }
        return arrayList;
    }

    @InterfaceC6234g
    private static final boolean trbh(byte[] bArr) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        return !(bArr.length == 0);
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final List<Double> tre1(double[] dArr, InterfaceC5979h<? super Double, ? super Double, Double> operation) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (dArr.length == 0) {
            return kotlin.collections.ni7.a9();
        }
        double dDoubleValue = dArr[0];
        ArrayList arrayList = new ArrayList(dArr.length);
        arrayList.add(Double.valueOf(dDoubleValue));
        int length = dArr.length;
        for (int i2 = 1; i2 < length; i2++) {
            dDoubleValue = operation.invoke(Double.valueOf(dDoubleValue), Double.valueOf(dArr[i2])).doubleValue();
            arrayList.add(Double.valueOf(dDoubleValue));
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final <R> List<R> ts(@InterfaceC7396q long[] jArr, @InterfaceC7396q cyoe.x2<? super Long, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (long j2 : jArr) {
            C6163t.zp(arrayList, transform.invoke(Long.valueOf(j2)));
        }
        return arrayList;
    }

    @kotlin.yz(version = "1.7")
    @InterfaceC6769y(name = "maxWithOrThrow")
    public static final short ts4(@InterfaceC7396q short[] sArr, @InterfaceC7396q Comparator<? super Short> comparator) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        short s2 = sArr[0];
        n5r1 it = new kotlin.ranges.x2(1, orxw(sArr)).iterator();
        while (it.hasNext()) {
            short s3 = sArr[it.nextInt()];
            if (comparator.compare(Short.valueOf(s2), Short.valueOf(s3)) < 0) {
                s2 = s3;
            }
        }
        return s2;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <R extends Comparable<? super R>> R tsm(int[] iArr, cyoe.x2<? super Integer, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Integer.valueOf(iArr[0]));
        n5r1 it = new kotlin.ranges.x2(1, srpc(iArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Integer.valueOf(iArr[it.nextInt()]));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    public static final short tsz9(@InterfaceC7396q short[] sArr, @InterfaceC7396q cyoe.x2<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        int length = sArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                short s2 = sArr[length];
                if (!predicate.invoke(Short.valueOf(s2)).booleanValue()) {
                    if (i2 < 0) {
                        break;
                    }
                    length = i2;
                } else {
                    return s2;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @InterfaceC7396q
    public static final int[] tt(@InterfaceC7396q Integer[] numArr) {
        kotlin.jvm.internal.d2ok.m23075h(numArr, "<this>");
        int length = numArr.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = numArr[i2].intValue();
        }
        return iArr;
    }

    @InterfaceC7396q
    public static final List<Long> ttpr(@InterfaceC7396q long[] jArr, @InterfaceC7396q Comparator<? super Long> comparator) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        Long[] lArrD9i = kotlin.collections.kja0.d9i(jArr);
        kotlin.collections.kja0.izu(lArrD9i, comparator);
        return kotlin.collections.kja0.m22514i(lArrD9i);
    }

    @InterfaceC7396q
    public static kotlin.ranges.x2 ttq(@InterfaceC7396q byte[] bArr) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        return new kotlin.ranges.x2(0, vl(bArr));
    }

    @InterfaceC7396q
    public static final <K, V> Map<K, V> tvn8(@InterfaceC7396q double[] dArr, @InterfaceC7396q cyoe.x2<? super Double, ? extends K> keySelector, @InterfaceC7396q cyoe.x2<? super Double, ? extends V> valueTransform) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(keySelector, "keySelector");
        kotlin.jvm.internal.d2ok.m23075h(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.fn3e.fn3e(C6140e.m22479p(dArr.length), 16));
        for (double d2 : dArr) {
            linkedHashMap.put(keySelector.invoke(Double.valueOf(d2)), valueTransform.invoke(Double.valueOf(d2)));
        }
        return linkedHashMap;
    }

    public static final <S, T extends S> S tvyk(@InterfaceC7396q T[] tArr, @InterfaceC7396q cyoe.cdj<? super Integer, ? super S, ? super T, ? extends S> operation) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (tArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        S sInvoke = (S) tArr[0];
        n5r1 it = new kotlin.ranges.x2(1, gjp(tArr)).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            sInvoke = operation.invoke(Integer.valueOf(iNextInt), sInvoke, (Object) tArr[iNextInt]);
        }
        return sInvoke;
    }

    @InterfaceC7396q
    public static final <K, V, M extends Map<? super K, ? super V>> M twzk(@InterfaceC7396q byte[] bArr, @InterfaceC7396q M destination, @InterfaceC7396q cyoe.x2<? super Byte, ? extends C6227f<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        for (byte b2 : bArr) {
            C6227f<? extends K, ? extends V> c6227fInvoke = transform.invoke(Byte.valueOf(b2));
            destination.put(c6227fInvoke.getFirst(), c6227fInvoke.getSecond());
        }
        return destination;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <R> R tx(byte[] bArr, Comparator<? super R> comparator, cyoe.x2<? super Byte, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Byte.valueOf(bArr[0]));
        n5r1 it = new kotlin.ranges.x2(1, vl(bArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Byte.valueOf(bArr[it.nextInt()]));
            if (comparator.compare(rInvoke, rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC7396q
    public static <T> List<T> tx8q(@InterfaceC7396q T[] tArr, @InterfaceC7396q Comparator<? super T> comparator) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        return kotlin.collections.kja0.m22514i(nmft(tArr, comparator));
    }

    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final <R extends Comparable<? super R>> Character txs(@InterfaceC7396q char[] cArr, @InterfaceC7396q cyoe.x2<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        char c2 = cArr[0];
        int iJ59a = j59a(cArr);
        if (iJ59a == 0) {
            return Character.valueOf(c2);
        }
        R rInvoke = selector.invoke(Character.valueOf(c2));
        n5r1 it = new kotlin.ranges.x2(1, iJ59a).iterator();
        while (it.hasNext()) {
            char c3 = cArr[it.nextInt()];
            R rInvoke2 = selector.invoke(Character.valueOf(c3));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                c2 = c3;
                rInvoke = rInvoke2;
            }
        }
        return Character.valueOf(c2);
    }

    @kotlin.yz(version = "1.7")
    @InterfaceC6769y(name = "minWithOrThrow")
    public static final int txyb(@InterfaceC7396q int[] iArr, @InterfaceC7396q Comparator<? super Integer> comparator) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        int i2 = iArr[0];
        n5r1 it = new kotlin.ranges.x2(1, srpc(iArr)).iterator();
        while (it.hasNext()) {
            int i3 = iArr[it.nextInt()];
            if (comparator.compare(Integer.valueOf(i2), Integer.valueOf(i3)) > 0) {
                i2 = i3;
            }
        }
        return i2;
    }

    @InterfaceC7396q
    public static final List<Character> ty3d(@InterfaceC7396q char[] cArr, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
        }
        if (i2 == 0) {
            return kotlin.collections.ni7.a9();
        }
        int length = cArr.length;
        if (i2 >= length) {
            return eovq(cArr);
        }
        if (i2 == 1) {
            return kotlin.collections.zurt.ld6(Character.valueOf(cArr[length - 1]));
        }
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = length - i2; i3 < length; i3++) {
            arrayList.add(Character.valueOf(cArr[i3]));
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static short[] tzg(@InterfaceC7396q short[] sArr, @InterfaceC7396q kotlin.ranges.x2 indices) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(indices, "indices");
        return indices.isEmpty() ? new short[0] : kotlin.collections.kja0.cv06(sArr, indices.mo2951k().intValue(), indices.zy().intValue() + 1);
    }

    @InterfaceC7396q
    public static final List<Byte> u02(@InterfaceC7396q byte[] bArr) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        Byte[] bArrZt = kotlin.collections.kja0.zt(bArr);
        kotlin.collections.kja0.anw(bArrZt);
        return kotlin.collections.kja0.m22514i(bArrZt);
    }

    @InterfaceC7396q
    public static final <R> List<R> u02j(@InterfaceC7396q byte[] bArr, @InterfaceC7396q cyoe.x2<? super Byte, ? extends R> transform) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b2 : bArr) {
            arrayList.add(transform.invoke(Byte.valueOf(b2)));
        }
        return arrayList;
    }

    @kotlin.yz(version = "1.7")
    @InterfaceC6769y(name = "minWithOrThrow")
    public static final float u07(@InterfaceC7396q float[] fArr, @InterfaceC7396q Comparator<? super Float> comparator) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        float f2 = fArr[0];
        n5r1 it = new kotlin.ranges.x2(1, gto(fArr)).iterator();
        while (it.hasNext()) {
            float f3 = fArr[it.nextInt()];
            if (comparator.compare(Float.valueOf(f2), Float.valueOf(f3)) > 0) {
                f2 = f3;
            }
        }
        return f2;
    }

    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final Long u0jg(@InterfaceC7396q long[] jArr, @InterfaceC7396q cyoe.cdj<? super Integer, ? super Long, ? super Long, Long> operation) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        int iHmvj = hmvj(jArr);
        if (iHmvj < 0) {
            return null;
        }
        long jLongValue = jArr[iHmvj];
        for (int i2 = iHmvj - 1; i2 >= 0; i2--) {
            jLongValue = operation.invoke(Integer.valueOf(i2), Long.valueOf(jArr[i2]), Long.valueOf(jLongValue)).longValue();
        }
        return Long.valueOf(jLongValue);
    }

    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final Character u0t(@InterfaceC7396q char[] cArr, @InterfaceC7396q Comparator<? super Character> comparator) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        if (cArr.length == 0) {
            return null;
        }
        char c2 = cArr[0];
        n5r1 it = new kotlin.ranges.x2(1, j59a(cArr)).iterator();
        while (it.hasNext()) {
            char c3 = cArr[it.nextInt()];
            if (comparator.compare(Character.valueOf(c2), Character.valueOf(c3)) > 0) {
                c2 = c3;
            }
        }
        return Character.valueOf(c2);
    }

    @InterfaceC7396q
    public static final <K, V> Map<K, V> u0z(@InterfaceC7396q float[] fArr, @InterfaceC7396q cyoe.x2<? super Float, ? extends C6227f<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.fn3e.fn3e(C6140e.m22479p(fArr.length), 16));
        for (float f2 : fArr) {
            C6227f<? extends K, ? extends V> c6227fInvoke = transform.invoke(Float.valueOf(f2));
            linkedHashMap.put(c6227fInvoke.getFirst(), c6227fInvoke.getSecond());
        }
        return linkedHashMap;
    }

    public static final <T, R extends Comparable<? super R>> void u1j(@InterfaceC7396q T[] tArr, @InterfaceC7396q cyoe.x2<? super T, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (tArr.length > 1) {
            kotlin.collections.kja0.izu(tArr, new f7l8.zy(selector));
        }
    }

    @InterfaceC7396q
    public static final int[] u2(@InterfaceC7396q int[] iArr) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        if (iArr.length == 0) {
            return iArr;
        }
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        kotlin.jvm.internal.d2ok.kja0(iArrCopyOf, "copyOf(this, size)");
        kotlin.collections.kja0.e4e(iArrCopyOf);
        return iArrCopyOf;
    }

    @InterfaceC7396q
    public static final <K, V> Map<K, List<V>> u2a8(@InterfaceC7396q double[] dArr, @InterfaceC7396q cyoe.x2<? super Double, ? extends K> keySelector, @InterfaceC7396q cyoe.x2<? super Double, ? extends V> valueTransform) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(keySelector, "keySelector");
        kotlin.jvm.internal.d2ok.m23075h(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (double d2 : dArr) {
            K kInvoke = keySelector.invoke(Double.valueOf(d2));
            List<V> arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(kInvoke, arrayList);
            }
            arrayList.add(valueTransform.invoke(Double.valueOf(d2)));
        }
        return linkedHashMap;
    }

    @kotlin.yz(version = "1.7")
    @InterfaceC6769y(name = "maxWithOrThrow")
    public static final int u3(@InterfaceC7396q int[] iArr, @InterfaceC7396q Comparator<? super Integer> comparator) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        int i2 = iArr[0];
        n5r1 it = new kotlin.ranges.x2(1, srpc(iArr)).iterator();
        while (it.hasNext()) {
            int i3 = iArr[it.nextInt()];
            if (comparator.compare(Integer.valueOf(i2), Integer.valueOf(i3)) < 0) {
                i2 = i3;
            }
        }
        return i2;
    }

    @InterfaceC6234g
    private static final long u3gu(long[] jArr) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        return jArr[2];
    }

    @InterfaceC6234g
    private static final float u4(float[] fArr) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        return fArr[1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC7396q
    public static final <K, V, M extends Map<? super K, List<V>>> M u5(@InterfaceC7396q char[] cArr, @InterfaceC7396q M destination, @InterfaceC7396q cyoe.x2<? super Character, ? extends K> keySelector, @InterfaceC7396q cyoe.x2<? super Character, ? extends V> valueTransform) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(keySelector, "keySelector");
        kotlin.jvm.internal.d2ok.m23075h(valueTransform, "valueTransform");
        for (char c2 : cArr) {
            K kInvoke = keySelector.invoke(Character.valueOf(c2));
            Object arrayList = destination.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(valueTransform.invoke(Character.valueOf(c2)));
        }
        return destination;
    }

    @kotlin.yz(version = "1.4")
    public static final <T extends Comparable<? super T>> void u74(@InterfaceC7396q T[] tArr, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.collections.kja0.ap23(tArr, kotlin.comparisons.f7l8.fu4(), i2, i3);
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <T> Double u7l5(T[] tArr, cyoe.x2<? super T, Double> selector) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        double dDoubleValue = selector.invoke(tArr[0]).doubleValue();
        n5r1 it = new kotlin.ranges.x2(1, gjp(tArr)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, selector.invoke(tArr[it.nextInt()]).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final <R> List<R> u7mb(double[] dArr, R r2, InterfaceC5979h<? super R, ? super Double, ? extends R> operation) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (dArr.length == 0) {
            return kotlin.collections.zurt.ld6(r2);
        }
        ArrayList arrayList = new ArrayList(dArr.length + 1);
        arrayList.add(r2);
        for (double d2 : dArr) {
            r2 = operation.invoke(r2, Double.valueOf(d2));
            arrayList.add(r2);
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static <T> List<T> u7oz(@InterfaceC7396q T[] tArr) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        return new ArrayList(kotlin.collections.ni7.t8r(tArr));
    }

    @kotlin.x2(errorSince = "1.6", hiddenSince = "1.7", warningSince = "1.4")
    @kotlin.ld6(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use 'indexOfFirst { it == element }' instead to continue using this behavior, or '.asList().indexOf(element: T)' to get the same search behavior as in a list.", replaceWith = @kotlin.hb(expression = "indexOfFirst { it == element }", imports = {}))
    public static final /* synthetic */ int u9l(double[] dArr, double d2) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        int length = dArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (d2 == dArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final List<Long> u9o(long[] jArr, cyoe.cdj<? super Integer, ? super Long, ? super Long, Long> operation) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (jArr.length == 0) {
            return kotlin.collections.ni7.a9();
        }
        long jLongValue = jArr[0];
        ArrayList arrayList = new ArrayList(jArr.length);
        arrayList.add(Long.valueOf(jLongValue));
        int length = jArr.length;
        for (int i2 = 1; i2 < length; i2++) {
            jLongValue = operation.invoke(Integer.valueOf(i2), Long.valueOf(jLongValue), Long.valueOf(jArr[i2])).longValue();
            arrayList.add(Long.valueOf(jLongValue));
        }
        return arrayList;
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @kotlin.hyr
    @InterfaceC6234g
    @kotlin.yz(version = "1.5")
    @InterfaceC6769y(name = "sumOfUInt")
    private static final int u9q(boolean[] zArr, cyoe.x2<? super Boolean, gyi> selector) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        int iLd6 = gyi.ld6(0);
        for (boolean z2 : zArr) {
            iLd6 = gyi.ld6(iLd6 + selector.invoke(Boolean.valueOf(z2)).a98o());
        }
        return iLd6;
    }

    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final Byte ua(@InterfaceC7396q byte[] bArr, @InterfaceC7396q Comparator<? super Byte> comparator) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        if (bArr.length == 0) {
            return null;
        }
        byte b2 = bArr[0];
        n5r1 it = new kotlin.ranges.x2(1, vl(bArr)).iterator();
        while (it.hasNext()) {
            byte b3 = bArr[it.nextInt()];
            if (comparator.compare(Byte.valueOf(b2), Byte.valueOf(b3)) < 0) {
                b2 = b3;
            }
        }
        return Byte.valueOf(b2);
    }

    @InterfaceC7396q
    public static final kotlin.ranges.x2 ua79(@InterfaceC7396q boolean[] zArr) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        return new kotlin.ranges.x2(0, rl(zArr));
    }

    @InterfaceC7396q
    public static final <R, C extends Collection<? super R>> C ub(@InterfaceC7396q float[] fArr, @InterfaceC7396q C destination, @InterfaceC7396q cyoe.x2<? super Float, ? extends R> transform) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        for (float f2 : fArr) {
            destination.add(transform.invoke(Float.valueOf(f2)));
        }
        return destination;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final double[] uc1(double[] dArr, cyoe.x2<? super Double, was> action) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(action, "action");
        for (double d2 : dArr) {
            action.invoke(Double.valueOf(d2));
        }
        return dArr;
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final Character ucas(@InterfaceC7396q char[] cArr, @InterfaceC7396q InterfaceC5979h<? super Character, ? super Character, Character> operation) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (cArr.length == 0) {
            return null;
        }
        char cCharValue = cArr[0];
        n5r1 it = new kotlin.ranges.x2(1, j59a(cArr)).iterator();
        while (it.hasNext()) {
            cCharValue = operation.invoke(Character.valueOf(cCharValue), Character.valueOf(cArr[it.nextInt()])).charValue();
        }
        return Character.valueOf(cCharValue);
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final float uciq(long[] jArr, cyoe.x2<? super Long, Float> selector) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(Long.valueOf(jArr[0])).floatValue();
        n5r1 it = new kotlin.ranges.x2(1, hmvj(jArr)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, selector.invoke(Long.valueOf(jArr[it.nextInt()])).floatValue());
        }
        return fFloatValue;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final <V, M extends Map<? super Short, ? super V>> M ue(short[] sArr, M destination, cyoe.x2<? super Short, ? extends V> valueSelector) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(valueSelector, "valueSelector");
        for (short s2 : sArr) {
            destination.put(Short.valueOf(s2), valueSelector.invoke(Short.valueOf(s2)));
        }
        return destination;
    }

    @InterfaceC7396q
    public static kotlin.ranges.x2 ueix(@InterfaceC7396q short[] sArr) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        return new kotlin.ranges.x2(0, orxw(sArr));
    }

    @InterfaceC7396q
    public static final <T, K, V> Map<K, V> uew(@InterfaceC7396q T[] tArr, @InterfaceC7396q cyoe.x2<? super T, ? extends K> keySelector, @InterfaceC7396q cyoe.x2<? super T, ? extends V> valueTransform) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(keySelector, "keySelector");
        kotlin.jvm.internal.d2ok.m23075h(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.fn3e.fn3e(C6140e.m22479p(tArr.length), 16));
        for (T t2 : tArr) {
            linkedHashMap.put(keySelector.invoke(t2), valueTransform.invoke(t2));
        }
        return linkedHashMap;
    }

    @kotlin.yz(version = "1.7")
    @InterfaceC6769y(name = "minWithOrThrow")
    public static final char uey(@InterfaceC7396q char[] cArr, @InterfaceC7396q Comparator<? super Character> comparator) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        char c2 = cArr[0];
        n5r1 it = new kotlin.ranges.x2(1, j59a(cArr)).iterator();
        while (it.hasNext()) {
            char c3 = cArr[it.nextInt()];
            if (comparator.compare(Character.valueOf(c2), Character.valueOf(c3)) > 0) {
                c2 = c3;
            }
        }
        return c2;
    }

    @InterfaceC7396q
    public static final List<Double> uf5(@InterfaceC7396q double[] dArr, @InterfaceC7396q cyoe.x2<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (int iF14 = f14(dArr); -1 < iF14; iF14--) {
            if (!predicate.invoke(Double.valueOf(dArr[iF14])).booleanValue()) {
                return n9(dArr, iF14 + 1);
            }
        }
        return ok4l(dArr);
    }

    @InterfaceC6234g
    private static final double ufxg(double[] dArr, int i2, cyoe.x2<? super Integer, Double> defaultValue) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(defaultValue, "defaultValue");
        return (i2 < 0 || i2 > f14(dArr)) ? defaultValue.invoke(Integer.valueOf(i2)).doubleValue() : dArr[i2];
    }

    @kotlin.hyr
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @InterfaceC6769y(name = "sumOfInt")
    private static final int ugm(int[] iArr, cyoe.x2<? super Integer, Integer> selector) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        int iIntValue = 0;
        for (int i2 : iArr) {
            iIntValue += selector.invoke(Integer.valueOf(i2)).intValue();
        }
        return iIntValue;
    }

    @InterfaceC7396q
    public static final <R extends Comparable<? super R>> List<Double> uhu(@InterfaceC7396q double[] dArr, @InterfaceC7396q cyoe.x2<? super Double, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        return onc0(dArr, new f7l8.C6179k(selector));
    }

    @InterfaceC6234g
    private static final short uia(short[] sArr, int i2, cyoe.x2<? super Integer, Short> defaultValue) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(defaultValue, "defaultValue");
        return (i2 < 0 || i2 > orxw(sArr)) ? defaultValue.invoke(Integer.valueOf(i2)).shortValue() : sArr[i2];
    }

    @InterfaceC6234g
    private static final float ul(float[] fArr, int i2, cyoe.x2<? super Integer, Float> defaultValue) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(defaultValue, "defaultValue");
        return (i2 < 0 || i2 > gto(fArr)) ? defaultValue.invoke(Integer.valueOf(i2)).floatValue() : fArr[i2];
    }

    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final Short ul9p(@InterfaceC7396q short[] sArr, @InterfaceC7396q cyoe.cdj<? super Integer, ? super Short, ? super Short, Short> operation) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (sArr.length == 0) {
            return null;
        }
        short sShortValue = sArr[0];
        n5r1 it = new kotlin.ranges.x2(1, orxw(sArr)).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            sShortValue = operation.invoke(Integer.valueOf(iNextInt), Short.valueOf(sShortValue), Short.valueOf(sArr[iNextInt])).shortValue();
        }
        return Short.valueOf(sShortValue);
    }

    @InterfaceC6234g
    private static final <T> T um(T[] tArr, cyoe.x2<? super T, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (T t2 : tArr) {
            if (predicate.invoke(t2).booleanValue()) {
                return t2;
            }
        }
        return null;
    }

    @InterfaceC7396q
    public static final List<Byte> ume(@InterfaceC7396q byte[] bArr, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        if (i2 >= 0) {
            return bou5(bArr, kotlin.ranges.fn3e.fn3e(bArr.length - i2, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
    }

    @InterfaceC7396q
    public static final List<Character> un3l(@InterfaceC7396q char[] cArr, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        if (i2 >= 0) {
            return ty3d(cArr, kotlin.ranges.fn3e.fn3e(cArr.length - i2, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
    }

    @InterfaceC6234g
    private static final boolean unv(boolean[] zArr) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        return zArr[3];
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <T, R> R uod(T[] tArr, Comparator<? super R> comparator, cyoe.x2<? super T, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(tArr[0]);
        n5r1 it = new kotlin.ranges.x2(1, gjp(tArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(tArr[it.nextInt()]);
            if (comparator.compare(rInvoke, rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @kotlin.x2(warningSince = "1.5")
    @kotlin.ld6(message = "Use sumOf instead.", replaceWith = @kotlin.hb(expression = "this.sumOf(selector)", imports = {}))
    public static final double up(@InterfaceC7396q boolean[] zArr, @InterfaceC7396q cyoe.x2<? super Boolean, Double> selector) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        double dDoubleValue = 0.0d;
        for (boolean z2 : zArr) {
            dDoubleValue += selector.invoke(Boolean.valueOf(z2)).doubleValue();
        }
        return dDoubleValue;
    }

    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final Double upj2(@InterfaceC7396q Double[] dArr) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        if (dArr.length == 0) {
            return null;
        }
        double dDoubleValue = dArr[0].doubleValue();
        n5r1 it = new kotlin.ranges.x2(1, gjp(dArr)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, dArr[it.nextInt()].doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    public static final boolean upv(@InterfaceC7396q boolean[] zArr) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        if (zArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return zArr[rl(zArr)];
    }

    public static final int upz(@InterfaceC7396q double[] dArr, @InterfaceC7396q cyoe.x2<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        int length = dArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (predicate.invoke(Double.valueOf(dArr[i2])).booleanValue()) {
                return i2;
            }
        }
        return -1;
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final <R> List<R> uqa(long[] jArr, R r2, cyoe.cdj<? super Integer, ? super R, ? super Long, ? extends R> operation) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (jArr.length == 0) {
            return kotlin.collections.zurt.ld6(r2);
        }
        ArrayList arrayList = new ArrayList(jArr.length + 1);
        arrayList.add(r2);
        int length = jArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            r2 = operation.invoke(Integer.valueOf(i2), r2, Long.valueOf(jArr[i2]));
            arrayList.add(r2);
        }
        return arrayList;
    }

    public static final void ur0a(@InterfaceC7396q short[] sArr) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        if (sArr.length > 1) {
            kotlin.collections.kja0.uv(sArr);
            tgj1(sArr);
        }
    }

    public static final /* synthetic */ <R, C extends Collection<? super R>> C urz8(Object[] objArr, C destination) {
        kotlin.jvm.internal.d2ok.m23075h(objArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        for (Object obj : objArr) {
            kotlin.jvm.internal.d2ok.m23086z(3, "R");
            if (obj instanceof Object) {
                destination.add(obj);
            }
        }
        return destination;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final <T> T[] usxh(T[] tArr, InterfaceC5979h<? super Integer, ? super T, was> action) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(action, "action");
        int length = tArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            action.invoke(Integer.valueOf(i3), tArr[i2]);
            i2++;
            i3++;
        }
        return tArr;
    }

    @InterfaceC7396q
    public static final <K, V> Map<K, List<V>> uu(@InterfaceC7396q short[] sArr, @InterfaceC7396q cyoe.x2<? super Short, ? extends K> keySelector, @InterfaceC7396q cyoe.x2<? super Short, ? extends V> valueTransform) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(keySelector, "keySelector");
        kotlin.jvm.internal.d2ok.m23075h(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (short s2 : sArr) {
            K kInvoke = keySelector.invoke(Short.valueOf(s2));
            List<V> arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(kInvoke, arrayList);
            }
            arrayList.add(valueTransform.invoke(Short.valueOf(s2)));
        }
        return linkedHashMap;
    }

    @InterfaceC7396q
    public static final List<C6227f<Double, Double>> uu0y(@InterfaceC7396q double[] dArr, @InterfaceC7396q double[] other) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        int iMin = Math.min(dArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i2 = 0; i2 < iMin; i2++) {
            arrayList.add(kotlin.nmn5.m23230k(Double.valueOf(dArr[i2]), Double.valueOf(other[i2])));
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final Set<Byte> uu9f(@InterfaceC7396q byte[] bArr) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        int length = bArr.length;
        return length != 0 ? length != 1 ? (Set) ads1(bArr, new LinkedHashSet(C6140e.m22479p(bArr.length))) : i1.m22499g(Byte.valueOf(bArr[0])) : a98o.ld6();
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final Double uux(boolean[] zArr, cyoe.x2<? super Boolean, Double> selector) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        double dDoubleValue = selector.invoke(Boolean.valueOf(zArr[0])).doubleValue();
        n5r1 it = new kotlin.ranges.x2(1, rl(zArr)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, selector.invoke(Boolean.valueOf(zArr[it.nextInt()])).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    public static final void uw73(@InterfaceC7396q double[] dArr) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        if (dArr.length > 1) {
            kotlin.collections.kja0.vg(dArr);
            zvz(dArr);
        }
    }

    @InterfaceC7396q
    public static final <R extends Comparable<? super R>> List<Short> ux0(@InterfaceC7396q short[] sArr, @InterfaceC7396q cyoe.x2<? super Short, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        return cxw(sArr, new f7l8.zy(selector));
    }

    public static final void uyb(@InterfaceC7396q double[] dArr, @InterfaceC7396q cyoe.x2<? super Double, was> action) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(action, "action");
        for (double d2 : dArr) {
            action.invoke(Double.valueOf(d2));
        }
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <R> R uz6(short[] sArr, Comparator<? super R> comparator, cyoe.x2<? super Short, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Short.valueOf(sArr[0]));
        n5r1 it = new kotlin.ranges.x2(1, orxw(sArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Short.valueOf(sArr[it.nextInt()]));
            if (comparator.compare(rInvoke, rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final List<Double> v0(double[] dArr, cyoe.cdj<? super Integer, ? super Double, ? super Double, Double> operation) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (dArr.length == 0) {
            return kotlin.collections.ni7.a9();
        }
        double dDoubleValue = dArr[0];
        ArrayList arrayList = new ArrayList(dArr.length);
        arrayList.add(Double.valueOf(dDoubleValue));
        int length = dArr.length;
        for (int i2 = 1; i2 < length; i2++) {
            dDoubleValue = operation.invoke(Integer.valueOf(i2), Double.valueOf(dDoubleValue), Double.valueOf(dArr[i2])).doubleValue();
            arrayList.add(Double.valueOf(dDoubleValue));
        }
        return arrayList;
    }

    public static byte v0wk(@InterfaceC7396q byte[] bArr) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        if (bArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return bArr[0];
    }

    public static final <R> R v0yo(@InterfaceC7396q float[] fArr, R r2, @InterfaceC7396q cyoe.cdj<? super Integer, ? super R, ? super Float, ? extends R> operation) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        int length = fArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            r2 = operation.invoke(Integer.valueOf(i3), r2, Float.valueOf(fArr[i2]));
            i2++;
            i3++;
        }
        return r2;
    }

    @InterfaceC7396q
    public static final <T> List<T> v1(@InterfaceC7396q T[] tArr, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        if (i2 >= 0) {
            return i6(tArr, kotlin.ranges.fn3e.fn3e(tArr.length - i2, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
    }

    @InterfaceC7396q
    public static long[] v1uh(@InterfaceC7396q long[] jArr, @InterfaceC7396q kotlin.ranges.x2 indices) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(indices, "indices");
        return indices.isEmpty() ? new long[0] : kotlin.collections.kja0.b3e(jArr, indices.mo2951k().intValue(), indices.zy().intValue() + 1);
    }

    @InterfaceC7396q
    public static final char[] v2(@InterfaceC7396q char[] cArr, @InterfaceC7396q Collection<Integer> indices) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(indices, "indices");
        char[] cArr2 = new char[indices.size()];
        Iterator<Integer> it = indices.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            cArr2[i2] = cArr[it.next().intValue()];
            i2++;
        }
        return cArr2;
    }

    @InterfaceC7396q
    public static final <T> T[] v2k(@InterfaceC7396q T[] tArr, @InterfaceC7396q kotlin.ranges.x2 indices) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(indices, "indices");
        return indices.isEmpty() ? (T[]) kotlin.collections.kja0.bek6(tArr, 0, 0) : (T[]) kotlin.collections.kja0.bek6(tArr, indices.mo2951k().intValue(), indices.zy().intValue() + 1);
    }

    @InterfaceC7396q
    public static final <C extends Collection<? super Short>> C v2t(@InterfaceC7396q short[] sArr, @InterfaceC7396q C destination, @InterfaceC7396q cyoe.x2<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (short s2 : sArr) {
            if (!predicate.invoke(Short.valueOf(s2)).booleanValue()) {
                destination.add(Short.valueOf(s2));
            }
        }
        return destination;
    }

    @InterfaceC7396q
    public static final short[] v4(@InterfaceC7396q short[] sArr) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        if (sArr.length == 0) {
            return sArr;
        }
        short[] sArrCopyOf = Arrays.copyOf(sArr, sArr.length);
        kotlin.jvm.internal.d2ok.kja0(sArrCopyOf, "copyOf(this, size)");
        ur0a(sArrCopyOf);
        return sArrCopyOf;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <R> R v5(float[] fArr, Comparator<? super R> comparator, cyoe.x2<? super Float, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Float.valueOf(fArr[0]));
        n5r1 it = new kotlin.ranges.x2(1, gto(fArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Float.valueOf(fArr[it.nextInt()]));
            if (comparator.compare(rInvoke, rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final Long v5fy(@InterfaceC7396q long[] jArr, @InterfaceC7396q AbstractC6332g random) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(random, "random");
        if (jArr.length == 0) {
            return null;
        }
        return Long.valueOf(jArr[random.nextInt(jArr.length)]);
    }

    @kotlin.yz(version = "1.7")
    @InterfaceC6769y(name = "minByOrThrow")
    public static final <R extends Comparable<? super R>> char v6(@InterfaceC7396q char[] cArr, @InterfaceC7396q cyoe.x2<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        char c2 = cArr[0];
        int iJ59a = j59a(cArr);
        if (iJ59a == 0) {
            return c2;
        }
        R rInvoke = selector.invoke(Character.valueOf(c2));
        n5r1 it = new kotlin.ranges.x2(1, iJ59a).iterator();
        while (it.hasNext()) {
            char c3 = cArr[it.nextInt()];
            R rInvoke2 = selector.invoke(Character.valueOf(c3));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                c2 = c3;
                rInvoke = rInvoke2;
            }
        }
        return c2;
    }

    @InterfaceC7396q
    public static final <A extends Appendable> A v6we(@InterfaceC7396q char[] cArr, @InterfaceC7396q A buffer, @InterfaceC7396q CharSequence separator, @InterfaceC7396q CharSequence prefix, @InterfaceC7396q CharSequence postfix, int i2, @InterfaceC7396q CharSequence truncated, @InterfaceC7395n cyoe.x2<? super Character, ? extends CharSequence> x2Var) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(buffer, "buffer");
        kotlin.jvm.internal.d2ok.m23075h(separator, "separator");
        kotlin.jvm.internal.d2ok.m23075h(prefix, "prefix");
        kotlin.jvm.internal.d2ok.m23075h(postfix, "postfix");
        kotlin.jvm.internal.d2ok.m23075h(truncated, "truncated");
        buffer.append(prefix);
        int i3 = 0;
        for (char c2 : cArr) {
            i3++;
            if (i3 > 1) {
                buffer.append(separator);
            }
            if (i2 >= 0 && i3 > i2) {
                break;
            }
            if (x2Var != null) {
                buffer.append(x2Var.invoke(Character.valueOf(c2)));
            } else {
                buffer.append(c2);
            }
        }
        if (i2 >= 0 && i3 > i2) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final Boolean v70n(@InterfaceC7396q boolean[] zArr, @InterfaceC7396q Comparator<? super Boolean> comparator) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        if (zArr.length == 0) {
            return null;
        }
        boolean z2 = zArr[0];
        n5r1 it = new kotlin.ranges.x2(1, rl(zArr)).iterator();
        while (it.hasNext()) {
            boolean z3 = zArr[it.nextInt()];
            if (comparator.compare(Boolean.valueOf(z2), Boolean.valueOf(z3)) < 0) {
                z2 = z3;
            }
        }
        return Boolean.valueOf(z2);
    }

    @InterfaceC7396q
    public static final String v7p(@InterfaceC7396q int[] iArr, @InterfaceC7396q CharSequence separator, @InterfaceC7396q CharSequence prefix, @InterfaceC7396q CharSequence postfix, int i2, @InterfaceC7396q CharSequence truncated, @InterfaceC7395n cyoe.x2<? super Integer, ? extends CharSequence> x2Var) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(separator, "separator");
        kotlin.jvm.internal.d2ok.m23075h(prefix, "prefix");
        kotlin.jvm.internal.d2ok.m23075h(postfix, "postfix");
        kotlin.jvm.internal.d2ok.m23075h(truncated, "truncated");
        String string = ((StringBuilder) re5(iArr, new StringBuilder(), separator, prefix, postfix, i2, truncated, x2Var)).toString();
        kotlin.jvm.internal.d2ok.kja0(string, "joinTo(StringBuilder(), …ed, transform).toString()");
        return string;
    }

    @kotlin.x2(warningSince = "1.5")
    @kotlin.ld6(message = "Use sumOf instead.", replaceWith = @kotlin.hb(expression = "this.sumOf(selector)", imports = {}))
    public static final int v7x(@InterfaceC7396q byte[] bArr, @InterfaceC7396q cyoe.x2<? super Byte, Integer> selector) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        int iIntValue = 0;
        for (byte b2 : bArr) {
            iIntValue += selector.invoke(Byte.valueOf(b2)).intValue();
        }
        return iIntValue;
    }

    @InterfaceC7396q
    public static final List<Float> v9(@InterfaceC7396q float[] fArr, @InterfaceC7396q cyoe.x2<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (float f2 : fArr) {
            if (!predicate.invoke(Float.valueOf(f2)).booleanValue()) {
                break;
            }
            arrayList.add(Float.valueOf(f2));
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final List<Integer> v9ed(@InterfaceC7396q int[] iArr) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i2 : iArr) {
            arrayList.add(Integer.valueOf(i2));
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final C6227f<List<Float>, List<Float>> v9zx(@InterfaceC7396q float[] fArr, @InterfaceC7396q cyoe.x2<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (float f2 : fArr) {
            if (predicate.invoke(Float.valueOf(f2)).booleanValue()) {
                arrayList.add(Float.valueOf(f2));
            } else {
                arrayList2.add(Float.valueOf(f2));
            }
        }
        return new C6227f<>(arrayList, arrayList2);
    }

    @InterfaceC7396q
    public static byte[] vaso(@InterfaceC7396q byte[] bArr, @InterfaceC7396q kotlin.ranges.x2 indices) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(indices, "indices");
        return indices.isEmpty() ? new byte[0] : kotlin.collections.kja0.zkd(bArr, indices.mo2951k().intValue(), indices.zy().intValue() + 1);
    }

    @InterfaceC7396q
    public static final <R, V> List<V> vb6(@InterfaceC7396q boolean[] zArr, @InterfaceC7396q Iterable<? extends R> other, @InterfaceC7396q InterfaceC5979h<? super Boolean, ? super R, ? extends V> transform) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        int length = zArr.length;
        ArrayList arrayList = new ArrayList(Math.min(kotlin.collections.fu4.vyq(other, 10), length));
        int i2 = 0;
        for (R r2 : other) {
            if (i2 >= length) {
                break;
            }
            arrayList.add(transform.invoke(Boolean.valueOf(zArr[i2]), r2));
            i2++;
        }
        return arrayList;
    }

    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final Float vc7p(@InterfaceC7396q Float[] fArr) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        float fFloatValue = fArr[0].floatValue();
        n5r1 it = new kotlin.ranges.x2(1, gjp(fArr)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, fArr[it.nextInt()].floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @InterfaceC7395n
    public static final Long vce(@InterfaceC7396q long[] jArr, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        if (i2 < 0 || i2 > hmvj(jArr)) {
            return null;
        }
        return Long.valueOf(jArr[i2]);
    }

    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final <R extends Comparable<? super R>> Integer vcky(@InterfaceC7396q int[] iArr, @InterfaceC7396q cyoe.x2<? super Integer, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        int i2 = iArr[0];
        int iSrpc = srpc(iArr);
        if (iSrpc == 0) {
            return Integer.valueOf(i2);
        }
        R rInvoke = selector.invoke(Integer.valueOf(i2));
        n5r1 it = new kotlin.ranges.x2(1, iSrpc).iterator();
        while (it.hasNext()) {
            int i3 = iArr[it.nextInt()];
            R rInvoke2 = selector.invoke(Integer.valueOf(i3));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                i2 = i3;
                rInvoke = rInvoke2;
            }
        }
        return Integer.valueOf(i2);
    }

    @InterfaceC6234g
    private static final <T> T vd(T[] tArr) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        return tArr[0];
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final Integer ve1q(@InterfaceC7396q int[] iArr, @InterfaceC7396q InterfaceC5979h<? super Integer, ? super Integer, Integer> operation) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (iArr.length == 0) {
            return null;
        }
        int iIntValue = iArr[0];
        n5r1 it = new kotlin.ranges.x2(1, srpc(iArr)).iterator();
        while (it.hasNext()) {
            iIntValue = operation.invoke(Integer.valueOf(iIntValue), Integer.valueOf(iArr[it.nextInt()])).intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    @InterfaceC7396q
    public static final <K, V, M extends Map<? super K, ? super V>> M vf(@InterfaceC7396q boolean[] zArr, @InterfaceC7396q M destination, @InterfaceC7396q cyoe.x2<? super Boolean, ? extends C6227f<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        for (boolean z2 : zArr) {
            C6227f<? extends K, ? extends V> c6227fInvoke = transform.invoke(Boolean.valueOf(z2));
            destination.put(c6227fInvoke.getFirst(), c6227fInvoke.getSecond());
        }
        return destination;
    }

    @InterfaceC7396q
    public static final long[] vi(@InterfaceC7396q Long[] lArr) {
        kotlin.jvm.internal.d2ok.m23075h(lArr, "<this>");
        int length = lArr.length;
        long[] jArr = new long[length];
        for (int i2 = 0; i2 < length; i2++) {
            jArr[i2] = lArr[i2].longValue();
        }
        return jArr;
    }

    @InterfaceC7396q
    public static final List<Long> vibj(@InterfaceC7396q long[] jArr, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        if (i2 >= 0) {
            return w1(jArr, kotlin.ranges.fn3e.fn3e(jArr.length - i2, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
    }

    @InterfaceC7396q
    public static final <K> Map<K, List<Byte>> vj(@InterfaceC7396q byte[] bArr, @InterfaceC7396q cyoe.x2<? super Byte, ? extends K> keySelector) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (byte b2 : bArr) {
            K kInvoke = keySelector.invoke(Byte.valueOf(b2));
            Object arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(Byte.valueOf(b2));
        }
        return linkedHashMap;
    }

    @InterfaceC7396q
    public static final List<C6227f<Long, Long>> vjn9(@InterfaceC7396q long[] jArr, @InterfaceC7396q long[] other) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        int iMin = Math.min(jArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i2 = 0; i2 < iMin; i2++) {
            arrayList.add(kotlin.nmn5.m23230k(Long.valueOf(jArr[i2]), Long.valueOf(other[i2])));
        }
        return arrayList;
    }

    @kotlin.yz(version = "1.7")
    @InterfaceC6769y(name = "minOrThrow")
    public static final short vjz(@InterfaceC7396q short[] sArr) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        short s2 = sArr[0];
        n5r1 it = new kotlin.ranges.x2(1, orxw(sArr)).iterator();
        while (it.hasNext()) {
            short s3 = sArr[it.nextInt()];
            if (s2 > s3) {
                s2 = s3;
            }
        }
        return s2;
    }

    public static int vl(@InterfaceC7396q byte[] bArr) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        return bArr.length - 1;
    }

    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final <R extends Comparable<? super R>> Integer vllq(@InterfaceC7396q int[] iArr, @InterfaceC7396q cyoe.x2<? super Integer, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        int i2 = iArr[0];
        int iSrpc = srpc(iArr);
        if (iSrpc == 0) {
            return Integer.valueOf(i2);
        }
        R rInvoke = selector.invoke(Integer.valueOf(i2));
        n5r1 it = new kotlin.ranges.x2(1, iSrpc).iterator();
        while (it.hasNext()) {
            int i3 = iArr[it.nextInt()];
            R rInvoke2 = selector.invoke(Integer.valueOf(i3));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                i2 = i3;
                rInvoke = rInvoke2;
            }
        }
        return Integer.valueOf(i2);
    }

    @InterfaceC6234g
    private static final Double vm(double[] dArr, cyoe.x2<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        int length = dArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                double d2 = dArr[length];
                if (predicate.invoke(Double.valueOf(d2)).booleanValue()) {
                    return Double.valueOf(d2);
                }
                if (i2 < 0) {
                    break;
                }
                length = i2;
            }
        }
        return null;
    }

    public static /* synthetic */ String vm8(double[] dArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, cyoe.x2 x2Var, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i3 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i3 & 4) == 0 ? charSequence3 : "";
        if ((i3 & 8) != 0) {
            i2 = -1;
        }
        int i4 = i2;
        if ((i3 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i3 & 32) != 0) {
            x2Var = null;
        }
        return gm3(dArr, charSequence, charSequence5, charSequence6, i4, charSequence7, x2Var);
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <R extends Comparable<? super R>> R vmj(char[] cArr, cyoe.x2<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Character.valueOf(cArr[0]));
        n5r1 it = new kotlin.ranges.x2(1, j59a(cArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Character.valueOf(cArr[it.nextInt()]));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <R extends Comparable<? super R>> R vn7(long[] jArr, cyoe.x2<? super Long, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Long.valueOf(jArr[0]));
        n5r1 it = new kotlin.ranges.x2(1, hmvj(jArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Long.valueOf(jArr[it.nextInt()]));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final Float vog(@InterfaceC7396q float[] fArr, @InterfaceC7396q cyoe.cdj<? super Integer, ? super Float, ? super Float, Float> operation) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (fArr.length == 0) {
            return null;
        }
        float fFloatValue = fArr[0];
        n5r1 it = new kotlin.ranges.x2(1, gto(fArr)).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            fFloatValue = operation.invoke(Integer.valueOf(iNextInt), Float.valueOf(fFloatValue), Float.valueOf(fArr[iNextInt])).floatValue();
        }
        return Float.valueOf(fFloatValue);
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final Float vqy(@InterfaceC7396q float[] fArr, @InterfaceC7396q AbstractC6332g random) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(random, "random");
        if (fArr.length == 0) {
            return null;
        }
        return Float.valueOf(fArr[random.nextInt(fArr.length)]);
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <R extends Comparable<? super R>> R vs4(double[] dArr, cyoe.x2<? super Double, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Double.valueOf(dArr[0]));
        n5r1 it = new kotlin.ranges.x2(1, f14(dArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Double.valueOf(dArr[it.nextInt()]));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    public static final <T> boolean vt(@InterfaceC7396q T[] tArr, @InterfaceC7396q cyoe.x2<? super T, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (T t2 : tArr) {
            if (predicate.invoke(t2).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <R> R vt2p(float[] fArr, Comparator<? super R> comparator, cyoe.x2<? super Float, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Float.valueOf(fArr[0]));
        n5r1 it = new kotlin.ranges.x2(1, gto(fArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Float.valueOf(fArr[it.nextInt()]));
            if (comparator.compare(rInvoke, rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC6234g
    private static final Double vt4y(double[] dArr, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        return zx(dArr, i2);
    }

    @InterfaceC7396q
    public static final kotlin.ranges.x2 vtz9(@InterfaceC7396q float[] fArr) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        return new kotlin.ranges.x2(0, gto(fArr));
    }

    @InterfaceC7396q
    public static final <R extends Comparable<? super R>> List<Integer> vu(@InterfaceC7396q int[] iArr, @InterfaceC7396q cyoe.x2<? super Integer, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        return t7j(iArr, new f7l8.C6179k(selector));
    }

    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final <S, T extends S> S vu3v(@InterfaceC7396q T[] tArr, @InterfaceC7396q cyoe.cdj<? super Integer, ? super T, ? super S, ? extends S> operation) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        int iGjp = gjp(tArr);
        if (iGjp < 0) {
            return null;
        }
        S sInvoke = (S) tArr[iGjp];
        for (int i2 = iGjp - 1; i2 >= 0; i2--) {
            sInvoke = operation.invoke(Integer.valueOf(i2), (Object) tArr[i2], sInvoke);
        }
        return sInvoke;
    }

    public static final <T> T vu6(@InterfaceC7396q T[] tArr) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        if (tArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return tArr[0];
    }

    public static /* synthetic */ String vuk(byte[] bArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, cyoe.x2 x2Var, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i3 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i3 & 4) == 0 ? charSequence3 : "";
        if ((i3 & 8) != 0) {
            i2 = -1;
        }
        int i4 = i2;
        if ((i3 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i3 & 32) != 0) {
            x2Var = null;
        }
        return q6x(bArr, charSequence, charSequence5, charSequence6, i4, charSequence7, x2Var);
    }

    @InterfaceC7396q
    public static final <K, M extends Map<? super K, List<Long>>> M vv3(@InterfaceC7396q long[] jArr, @InterfaceC7396q M destination, @InterfaceC7396q cyoe.x2<? super Long, ? extends K> keySelector) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(keySelector, "keySelector");
        for (long j2 : jArr) {
            K kInvoke = keySelector.invoke(Long.valueOf(j2));
            Object arrayList = destination.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(Long.valueOf(j2));
        }
        return destination;
    }

    @InterfaceC7396q
    public static final Set<Long> vvj(@InterfaceC7396q long[] jArr, @InterfaceC7396q Iterable<Long> other) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        Set<Long> setQ4m4 = q4m4(jArr);
        C6163t.vq(setQ4m4, other);
        return setQ4m4;
    }

    @kotlin.hyr
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @InterfaceC6769y(name = "sumOfDouble")
    private static final double vwlh(boolean[] zArr, cyoe.x2<? super Boolean, Double> selector) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        double dDoubleValue = 0.0d;
        for (boolean z2 : zArr) {
            dDoubleValue += selector.invoke(Boolean.valueOf(z2)).doubleValue();
        }
        return dDoubleValue;
    }

    @kotlin.yz(version = "1.4")
    public static void vx(@InterfaceC7396q byte[] bArr, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.collections.zy.Companion.m22683q(i2, i3, bArr.length);
        int i4 = (i2 + i3) / 2;
        if (i2 == i4) {
            return;
        }
        int i5 = i3 - 1;
        while (i2 < i4) {
            byte b2 = bArr[i2];
            bArr[i2] = bArr[i5];
            bArr[i5] = b2;
            i5--;
            i2++;
        }
    }

    @kotlin.yz(version = "1.4")
    public static final void vx4g(@InterfaceC7396q long[] jArr) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        c4zs(jArr, AbstractC6332g.Default);
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <R extends Comparable<? super R>> R vx9l(short[] sArr, cyoe.x2<? super Short, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Short.valueOf(sArr[0]));
        n5r1 it = new kotlin.ranges.x2(1, orxw(sArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Short.valueOf(sArr[it.nextInt()]));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    public static short vy5c(@InterfaceC7396q short[] sArr) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        if (sArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return sArr[orxw(sArr)];
    }

    @InterfaceC7396q
    public static <T> List<T> vyee(@InterfaceC7396q T[] tArr) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        int length = tArr.length;
        return length != 0 ? length != 1 ? u7oz(tArr) : kotlin.collections.zurt.ld6(tArr[0]) : kotlin.collections.ni7.a9();
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <R extends Comparable<? super R>> R vyj(double[] dArr, cyoe.x2<? super Double, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Double.valueOf(dArr[0]));
        n5r1 it = new kotlin.ranges.x2(1, f14(dArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Double.valueOf(dArr[it.nextInt()]));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    public static final boolean vymi(@InterfaceC7396q int[] iArr, @InterfaceC7396q cyoe.x2<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (int i2 : iArr) {
            if (predicate.invoke(Integer.valueOf(i2)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @InterfaceC6234g
    private static final <T> T vz(T[] tArr, cyoe.x2<? super T, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        int length = tArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                T t2 = tArr[length];
                if (predicate.invoke(t2).booleanValue()) {
                    return t2;
                }
                if (i2 < 0) {
                    break;
                }
                length = i2;
            }
        }
        return null;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final <V> Map<Character, V> w0(char[] cArr, cyoe.x2<? super Character, ? extends V> valueSelector) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(valueSelector, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.fn3e.fn3e(C6140e.m22479p(kotlin.ranges.fn3e.m23305t(cArr.length, 128)), 16));
        for (char c2 : cArr) {
            linkedHashMap.put(Character.valueOf(c2), valueSelector.invoke(Character.valueOf(c2)));
        }
        return linkedHashMap;
    }

    @InterfaceC7396q
    public static final List<Short> w0qe(@InterfaceC7396q short[] sArr) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        return a9.wr(fxq0(sArr));
    }

    @InterfaceC7396q
    public static final List<Long> w1(@InterfaceC7396q long[] jArr, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
        }
        if (i2 == 0) {
            return kotlin.collections.ni7.a9();
        }
        int length = jArr.length;
        if (i2 >= length) {
            return zr(jArr);
        }
        if (i2 == 1) {
            return kotlin.collections.zurt.ld6(Long.valueOf(jArr[length - 1]));
        }
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = length - i2; i3 < length; i3++) {
            arrayList.add(Long.valueOf(jArr[i3]));
        }
        return arrayList;
    }

    @InterfaceC6234g
    private static final boolean w1k2(boolean[] zArr) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        return !(zArr.length == 0);
    }

    @kotlin.hyr
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @InterfaceC6769y(name = "flatMapIndexedSequenceTo")
    private static final <T, R, C extends Collection<? super R>> C w1q6(T[] tArr, C destination, InterfaceC5979h<? super Integer, ? super T, ? extends kotlin.sequences.qrj<? extends R>> transform) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        int length = tArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            C6163t.m22610x(destination, transform.invoke(Integer.valueOf(i3), tArr[i2]));
            i2++;
            i3++;
        }
        return destination;
    }

    @InterfaceC7396q
    public static final Set<Float> w1s(@InterfaceC7396q float[] fArr) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        return (Set) xk9p(fArr, new LinkedHashSet(C6140e.m22479p(fArr.length)));
    }

    @InterfaceC6234g
    private static final float w2(float[] fArr, int i2, cyoe.x2<? super Integer, Float> defaultValue) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(defaultValue, "defaultValue");
        return (i2 < 0 || i2 > gto(fArr)) ? defaultValue.invoke(Integer.valueOf(i2)).floatValue() : fArr[i2];
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final <V> Map<Float, V> w2bz(float[] fArr, cyoe.x2<? super Float, ? extends V> valueSelector) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(valueSelector, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.fn3e.fn3e(C6140e.m22479p(fArr.length), 16));
        for (float f2 : fArr) {
            linkedHashMap.put(Float.valueOf(f2), valueSelector.invoke(Float.valueOf(f2)));
        }
        return linkedHashMap;
    }

    @InterfaceC7396q
    public static final <T, R extends Comparable<? super R>> List<T> w2q(@InterfaceC7396q T[] tArr, @InterfaceC7396q cyoe.x2<? super T, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        return tx8q(tArr, new f7l8.zy(selector));
    }

    @kotlin.hyr
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @InterfaceC6769y(name = "sumOfLong")
    private static final long w2q9(char[] cArr, cyoe.x2<? super Character, Long> selector) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        long jLongValue = 0;
        for (char c2 : cArr) {
            jLongValue += selector.invoke(Character.valueOf(c2)).longValue();
        }
        return jLongValue;
    }

    @InterfaceC7396q
    public static final Set<Boolean> w3(@InterfaceC7396q boolean[] zArr, @InterfaceC7396q Iterable<Boolean> other) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        Set<Boolean> setCff0 = cff0(zArr);
        C6163t.zsr0(setCff0, other);
        return setCff0;
    }

    @InterfaceC7396q
    public static final char[] w3u7(@InterfaceC7396q Character[] chArr) {
        kotlin.jvm.internal.d2ok.m23075h(chArr, "<this>");
        int length = chArr.length;
        char[] cArr = new char[length];
        for (int i2 = 0; i2 < length; i2++) {
            cArr[i2] = chArr[i2].charValue();
        }
        return cArr;
    }

    @InterfaceC7396q
    public static final List<Boolean> w4de(@InterfaceC7396q boolean[] zArr) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        int length = zArr.length;
        return length != 0 ? length != 1 ? jtf(zArr) : kotlin.collections.zurt.ld6(Boolean.valueOf(zArr[0])) : kotlin.collections.ni7.a9();
    }

    @InterfaceC7396q
    public static final <T extends Comparable<? super T>> T[] w4j4(@InterfaceC7396q T[] tArr) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        if (tArr.length == 0) {
            return tArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(tArr, tArr.length);
        kotlin.jvm.internal.d2ok.kja0(objArrCopyOf, "copyOf(this, size)");
        T[] tArr2 = (T[]) ((Comparable[]) objArrCopyOf);
        kotlin.collections.kja0.anw(tArr2);
        return tArr2;
    }

    public static final <R> R w4x9(@InterfaceC7396q int[] iArr, R r2, @InterfaceC7396q InterfaceC5979h<? super Integer, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        for (int iSrpc = srpc(iArr); iSrpc >= 0; iSrpc--) {
            r2 = operation.invoke(Integer.valueOf(iArr[iSrpc]), r2);
        }
        return r2;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final Float w5(boolean[] zArr, cyoe.x2<? super Boolean, Float> selector) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        float fFloatValue = selector.invoke(Boolean.valueOf(zArr[0])).floatValue();
        n5r1 it = new kotlin.ranges.x2(1, rl(zArr)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, selector.invoke(Boolean.valueOf(zArr[it.nextInt()])).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @InterfaceC7395n
    public static final <T> T w5fh(@InterfaceC7396q T[] tArr, @InterfaceC7396q cyoe.x2<? super T, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        int length = tArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i2 = length - 1;
            T t2 = tArr[length];
            if (predicate.invoke(t2).booleanValue()) {
                return t2;
            }
            if (i2 < 0) {
                return null;
            }
            length = i2;
        }
    }

    @InterfaceC7395n
    public static final Character w6(@InterfaceC7396q char[] cArr, @InterfaceC7396q cyoe.x2<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        int length = cArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i2 = length - 1;
            char c2 = cArr[length];
            if (predicate.invoke(Character.valueOf(c2)).booleanValue()) {
                return Character.valueOf(c2);
            }
            if (i2 < 0) {
                return null;
            }
            length = i2;
        }
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final <V, M extends Map<? super Byte, ? super V>> M w6w4(byte[] bArr, M destination, cyoe.x2<? super Byte, ? extends V> valueSelector) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(valueSelector, "valueSelector");
        for (byte b2 : bArr) {
            destination.put(Byte.valueOf(b2), valueSelector.invoke(Byte.valueOf(b2)));
        }
        return destination;
    }

    @InterfaceC7396q
    public static final <C extends Collection<? super Integer>> C w7(@InterfaceC7396q int[] iArr, @InterfaceC7396q C destination, @InterfaceC7396q InterfaceC5979h<? super Integer, ? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = iArr[i2];
            int i5 = i3 + 1;
            if (predicate.invoke(Integer.valueOf(i3), Integer.valueOf(i4)).booleanValue()) {
                destination.add(Integer.valueOf(i4));
            }
            i2++;
            i3 = i5;
        }
        return destination;
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final <R> List<R> w7ud(float[] fArr, R r2, InterfaceC5979h<? super R, ? super Float, ? extends R> operation) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (fArr.length == 0) {
            return kotlin.collections.zurt.ld6(r2);
        }
        ArrayList arrayList = new ArrayList(fArr.length + 1);
        arrayList.add(r2);
        for (float f2 : fArr) {
            r2 = operation.invoke(r2, Float.valueOf(f2));
            arrayList.add(r2);
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final <K> List<Short> w8(@InterfaceC7396q short[] sArr, @InterfaceC7396q cyoe.x2<? super Short, ? extends K> selector) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (short s2 : sArr) {
            if (hashSet.add(selector.invoke(Short.valueOf(s2)))) {
                arrayList.add(Short.valueOf(s2));
            }
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final List<Integer> w82(@InterfaceC7396q int[] iArr, @InterfaceC7396q cyoe.x2<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (int i2 : iArr) {
            if (!predicate.invoke(Integer.valueOf(i2)).booleanValue()) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        return arrayList;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <R extends Comparable<? super R>> R w8g(boolean[] zArr, cyoe.x2<? super Boolean, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (zArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Boolean.valueOf(zArr[0]));
        n5r1 it = new kotlin.ranges.x2(1, rl(zArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Boolean.valueOf(zArr[it.nextInt()]));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC7396q
    public static final <C extends Collection<? super Float>> C w8w(@InterfaceC7396q float[] fArr, @InterfaceC7396q C destination, @InterfaceC7396q cyoe.x2<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (float f2 : fArr) {
            if (predicate.invoke(Float.valueOf(f2)).booleanValue()) {
                destination.add(Float.valueOf(f2));
            }
        }
        return destination;
    }

    @InterfaceC7396q
    public static final <R> List<C6227f<Long, R>> w8y(@InterfaceC7396q long[] jArr, @InterfaceC7396q R[] other) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        int iMin = Math.min(jArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i2 = 0; i2 < iMin; i2++) {
            long j2 = jArr[i2];
            arrayList.add(kotlin.nmn5.m23230k(Long.valueOf(j2), other[i2]));
        }
        return arrayList;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final float w95(char[] cArr, cyoe.x2<? super Character, Float> selector) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(Character.valueOf(cArr[0])).floatValue();
        n5r1 it = new kotlin.ranges.x2(1, j59a(cArr)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, selector.invoke(Character.valueOf(cArr[it.nextInt()])).floatValue());
        }
        return fFloatValue;
    }

    @InterfaceC7396q
    public static final <R, V> List<V> w97r(@InterfaceC7396q short[] sArr, @InterfaceC7396q Iterable<? extends R> other, @InterfaceC7396q InterfaceC5979h<? super Short, ? super R, ? extends V> transform) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        int length = sArr.length;
        ArrayList arrayList = new ArrayList(Math.min(kotlin.collections.fu4.vyq(other, 10), length));
        int i2 = 0;
        for (R r2 : other) {
            if (i2 >= length) {
                break;
            }
            arrayList.add(transform.invoke(Short.valueOf(sArr[i2]), r2));
            i2++;
        }
        return arrayList;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final List<Short> wa(short[] sArr, InterfaceC5979h<? super Short, ? super Short, Short> operation) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (sArr.length == 0) {
            return kotlin.collections.ni7.a9();
        }
        short sShortValue = sArr[0];
        ArrayList arrayList = new ArrayList(sArr.length);
        arrayList.add(Short.valueOf(sShortValue));
        int length = sArr.length;
        for (int i2 = 1; i2 < length; i2++) {
            sShortValue = operation.invoke(Short.valueOf(sShortValue), Short.valueOf(sArr[i2])).shortValue();
            arrayList.add(Short.valueOf(sShortValue));
        }
        return arrayList;
    }

    @InterfaceC6769y(name = "sumOfByte")
    public static final int wbu(@InterfaceC7396q Byte[] bArr) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        int iByteValue = 0;
        for (Byte b2 : bArr) {
            iByteValue += b2.byteValue();
        }
        return iByteValue;
    }

    @InterfaceC7396q
    public static final int[] wc(@InterfaceC7396q int[] iArr) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        if (iArr.length == 0) {
            return iArr;
        }
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        kotlin.jvm.internal.d2ok.kja0(iArrCopyOf, "copyOf(this, size)");
        b7sa(iArrCopyOf);
        return iArrCopyOf;
    }

    @InterfaceC6234g
    private static final <T> boolean wc6(T[] tArr) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        return tArr.length == 0;
    }

    @InterfaceC7396q
    public static final <K> List<Long> wd(@InterfaceC7396q long[] jArr, @InterfaceC7396q cyoe.x2<? super Long, ? extends K> selector) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (long j2 : jArr) {
            if (hashSet.add(selector.invoke(Long.valueOf(j2)))) {
                arrayList.add(Long.valueOf(j2));
            }
        }
        return arrayList;
    }

    @kotlin.hyr
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @InterfaceC6769y(name = "sumOfInt")
    private static final int wde(char[] cArr, cyoe.x2<? super Character, Integer> selector) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        int iIntValue = 0;
        for (char c2 : cArr) {
            iIntValue += selector.invoke(Character.valueOf(c2)).intValue();
        }
        return iIntValue;
    }

    @InterfaceC7396q
    public static final <R, V> List<V> we(@InterfaceC7396q byte[] bArr, @InterfaceC7396q R[] other, @InterfaceC7396q InterfaceC5979h<? super Byte, ? super R, ? extends V> transform) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        int iMin = Math.min(bArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i2 = 0; i2 < iMin; i2++) {
            arrayList.add(transform.invoke(Byte.valueOf(bArr[i2]), other[i2]));
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final kotlin.sequences.qrj<Byte> wen(@InterfaceC7396q byte[] bArr) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        return bArr.length == 0 ? kotlin.sequences.t8r.f7l8() : new ld6(bArr);
    }

    @kotlin.yz(version = "1.4")
    public static final void wg(@InterfaceC7396q double[] dArr) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        k7(dArr, AbstractC6332g.Default);
    }

    @InterfaceC7396q
    public static final Iterable<x9kr<Double>> wg7n(@InterfaceC7396q double[] dArr) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        return new ncyb(new o1t(dArr));
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final <R> List<R> wgc(char[] cArr, R r2, InterfaceC5979h<? super R, ? super Character, ? extends R> operation) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (cArr.length == 0) {
            return kotlin.collections.zurt.ld6(r2);
        }
        ArrayList arrayList = new ArrayList(cArr.length + 1);
        arrayList.add(r2);
        for (char c2 : cArr) {
            r2 = operation.invoke(r2, Character.valueOf(c2));
            arrayList.add(r2);
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final <R> List<C6227f<Long, R>> wgw1(@InterfaceC7396q long[] jArr, @InterfaceC7396q Iterable<? extends R> other) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        int length = jArr.length;
        ArrayList arrayList = new ArrayList(Math.min(kotlin.collections.fu4.vyq(other, 10), length));
        int i2 = 0;
        for (R r2 : other) {
            if (i2 >= length) {
                break;
            }
            arrayList.add(kotlin.nmn5.m23230k(Long.valueOf(jArr[i2]), r2));
            i2++;
        }
        return arrayList;
    }

    public static boolean wh(@InterfaceC7396q int[] iArr) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        return !(iArr.length == 0);
    }

    @InterfaceC7396q
    public static kotlin.ranges.x2 whyb(@InterfaceC7396q long[] jArr) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        return new kotlin.ranges.x2(0, hmvj(jArr));
    }

    @InterfaceC7396q
    public static final <K, V> Map<K, List<V>> wime(@InterfaceC7396q int[] iArr, @InterfaceC7396q cyoe.x2<? super Integer, ? extends K> keySelector, @InterfaceC7396q cyoe.x2<? super Integer, ? extends V> valueTransform) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(keySelector, "keySelector");
        kotlin.jvm.internal.d2ok.m23075h(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i2 : iArr) {
            K kInvoke = keySelector.invoke(Integer.valueOf(i2));
            List<V> arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(kInvoke, arrayList);
            }
            arrayList.add(valueTransform.invoke(Integer.valueOf(i2)));
        }
        return linkedHashMap;
    }

    @InterfaceC7396q
    public static final float[] wj(@InterfaceC7396q float[] fArr, @InterfaceC7396q Collection<Integer> indices) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(indices, "indices");
        float[] fArr2 = new float[indices.size()];
        Iterator<Integer> it = indices.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            fArr2[i2] = fArr[it.next().intValue()];
            i2++;
        }
        return fArr2;
    }

    public static int wj7e(@InterfaceC7396q int[] iArr, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        int length = iArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            if (i2 == iArr[i3]) {
                return i3;
            }
        }
        return -1;
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final Double wjj2(@InterfaceC7396q double[] dArr, @InterfaceC7396q AbstractC6332g random) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(random, "random");
        if (dArr.length == 0) {
            return null;
        }
        return Double.valueOf(dArr[random.nextInt(dArr.length)]);
    }

    @InterfaceC6234g
    private static final boolean wjzm(float[] fArr) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        return !(fArr.length == 0);
    }

    @InterfaceC7396q
    public static final List<Long> wk(@InterfaceC7396q long[] jArr, @InterfaceC7396q cyoe.x2<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (long j2 : jArr) {
            if (!predicate.invoke(Long.valueOf(j2)).booleanValue()) {
                arrayList.add(Long.valueOf(j2));
            }
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final Iterable<Double> wkrb(@InterfaceC7396q double[] dArr) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        return dArr.length == 0 ? kotlin.collections.ni7.a9() : new f7l8(dArr);
    }

    @InterfaceC7396q
    public static final List<Long> wl(@InterfaceC7396q long[] jArr, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
        }
        if (i2 == 0) {
            return kotlin.collections.ni7.a9();
        }
        if (i2 >= jArr.length) {
            return zr(jArr);
        }
        if (i2 == 1) {
            return kotlin.collections.zurt.ld6(Long.valueOf(jArr[0]));
        }
        ArrayList arrayList = new ArrayList(i2);
        int i3 = 0;
        for (long j2 : jArr) {
            arrayList.add(Long.valueOf(j2));
            i3++;
            if (i3 == i2) {
                break;
            }
        }
        return arrayList;
    }

    @kotlin.x2(warningSince = "1.5")
    @kotlin.ld6(message = "Use sumOf instead.", replaceWith = @kotlin.hb(expression = "this.sumOf(selector)", imports = {}))
    public static final int woar(@InterfaceC7396q int[] iArr, @InterfaceC7396q cyoe.x2<? super Integer, Integer> selector) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        int iIntValue = 0;
        for (int i2 : iArr) {
            iIntValue += selector.invoke(Integer.valueOf(i2)).intValue();
        }
        return iIntValue;
    }

    public static final double wp(@InterfaceC7396q double[] dArr, @InterfaceC7396q cyoe.cdj<? super Integer, ? super Double, ? super Double, Double> operation) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        int iF14 = f14(dArr);
        if (iF14 < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        double dDoubleValue = dArr[iF14];
        for (int i2 = iF14 - 1; i2 >= 0; i2--) {
            dDoubleValue = operation.invoke(Integer.valueOf(i2), Double.valueOf(dArr[i2]), Double.valueOf(dDoubleValue)).doubleValue();
        }
        return dDoubleValue;
    }

    @InterfaceC7396q
    public static final <R> List<C6227f<Double, R>> wpic(@InterfaceC7396q double[] dArr, @InterfaceC7396q Iterable<? extends R> other) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        int length = dArr.length;
        ArrayList arrayList = new ArrayList(Math.min(kotlin.collections.fu4.vyq(other, 10), length));
        int i2 = 0;
        for (R r2 : other) {
            if (i2 >= length) {
                break;
            }
            arrayList.add(kotlin.nmn5.m23230k(Double.valueOf(dArr[i2]), r2));
            i2++;
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final List<Double> wq(@InterfaceC7396q double[] dArr, @InterfaceC7396q cyoe.x2<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z2 = false;
        for (double d2 : dArr) {
            if (z2) {
                arrayList.add(Double.valueOf(d2));
            } else if (!predicate.invoke(Double.valueOf(d2)).booleanValue()) {
                arrayList.add(Double.valueOf(d2));
                z2 = true;
            }
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final <T, K, V, M extends Map<? super K, ? super V>> M wqg(@InterfaceC7396q T[] tArr, @InterfaceC7396q M destination, @InterfaceC7396q cyoe.x2<? super T, ? extends C6227f<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        for (T t2 : tArr) {
            C6227f<? extends K, ? extends V> c6227fInvoke = transform.invoke(t2);
            destination.put(c6227fInvoke.getFirst(), c6227fInvoke.getSecond());
        }
        return destination;
    }

    public static final boolean wqp(@InterfaceC7396q char[] cArr, @InterfaceC7396q cyoe.x2<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (char c2 : cArr) {
            if (predicate.invoke(Character.valueOf(c2)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @InterfaceC7396q
    public static final <K, V> Map<K, V> wr(@InterfaceC7396q long[] jArr, @InterfaceC7396q cyoe.x2<? super Long, ? extends C6227f<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.fn3e.fn3e(C6140e.m22479p(jArr.length), 16));
        for (long j2 : jArr) {
            C6227f<? extends K, ? extends V> c6227fInvoke = transform.invoke(Long.valueOf(j2));
            linkedHashMap.put(c6227fInvoke.getFirst(), c6227fInvoke.getSecond());
        }
        return linkedHashMap;
    }

    @InterfaceC7396q
    public static final <R, C extends Collection<? super R>> C wr3(@InterfaceC7396q boolean[] zArr, @InterfaceC7396q C destination, @InterfaceC7396q cyoe.x2<? super Boolean, ? extends R> transform) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        for (boolean z2 : zArr) {
            destination.add(transform.invoke(Boolean.valueOf(z2)));
        }
        return destination;
    }

    @InterfaceC7396q
    public static final <C extends Collection<? super Double>> C wtds(@InterfaceC7396q double[] dArr, @InterfaceC7396q C destination, @InterfaceC7396q InterfaceC5979h<? super Integer, ? super Double, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        int length = dArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            double d2 = dArr[i2];
            int i4 = i3 + 1;
            if (predicate.invoke(Integer.valueOf(i3), Double.valueOf(d2)).booleanValue()) {
                destination.add(Double.valueOf(d2));
            }
            i2++;
            i3 = i4;
        }
        return destination;
    }

    @InterfaceC7396q
    public static final <K, V, M extends Map<? super K, ? super V>> M wtm(@InterfaceC7396q short[] sArr, @InterfaceC7396q M destination, @InterfaceC7396q cyoe.x2<? super Short, ? extends K> keySelector, @InterfaceC7396q cyoe.x2<? super Short, ? extends V> valueTransform) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(keySelector, "keySelector");
        kotlin.jvm.internal.d2ok.m23075h(valueTransform, "valueTransform");
        for (short s2 : sArr) {
            destination.put(keySelector.invoke(Short.valueOf(s2)), valueTransform.invoke(Short.valueOf(s2)));
        }
        return destination;
    }

    @InterfaceC7395n
    public static final Double wu7(@InterfaceC7396q double[] dArr) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        if (dArr.length == 0) {
            return null;
        }
        return Double.valueOf(dArr[0]);
    }

    @InterfaceC6234g
    private static final double wutb(double[] dArr) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        return dArr[0];
    }

    @kotlin.hyr
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @InterfaceC6769y(name = "flatMapIndexedIterable")
    private static final <R> List<R> wvka(double[] dArr, InterfaceC5979h<? super Integer, ? super Double, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = dArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            C6163t.zp(arrayList, transform.invoke(Integer.valueOf(i3), Double.valueOf(dArr[i2])));
            i2++;
            i3++;
        }
        return arrayList;
    }

    @kotlin.yz(version = "1.4")
    public static final void wwa(@InterfaceC7396q float[] fArr) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        tlc(fArr, AbstractC6332g.Default);
    }

    @InterfaceC7396q
    public static final <C extends Collection<? super Integer>> C wwr9(@InterfaceC7396q int[] iArr, @InterfaceC7396q C destination, @InterfaceC7396q cyoe.x2<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (int i2 : iArr) {
            if (predicate.invoke(Integer.valueOf(i2)).booleanValue()) {
                destination.add(Integer.valueOf(i2));
            }
        }
        return destination;
    }

    @InterfaceC7396q
    public static final Iterable<x9kr<Float>> wwzu(@InterfaceC7396q float[] fArr) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        return new ncyb(new z(fArr));
    }

    @InterfaceC7396q
    public static final List<Short> wx(@InterfaceC7396q short[] sArr, @InterfaceC7396q InterfaceC5979h<? super Integer, ? super Short, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = sArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            short s2 = sArr[i2];
            int i4 = i3 + 1;
            if (predicate.invoke(Integer.valueOf(i3), Short.valueOf(s2)).booleanValue()) {
                arrayList.add(Short.valueOf(s2));
            }
            i2++;
            i3 = i4;
        }
        return arrayList;
    }

    @kotlin.yz(version = "1.7")
    @InterfaceC6769y(name = "maxOrThrow")
    public static final short wx3a(@InterfaceC7396q short[] sArr) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        short s2 = sArr[0];
        n5r1 it = new kotlin.ranges.x2(1, orxw(sArr)).iterator();
        while (it.hasNext()) {
            short s3 = sArr[it.nextInt()];
            if (s2 < s3) {
                s2 = s3;
            }
        }
        return s2;
    }

    @InterfaceC6234g
    private static final Boolean wy(boolean[] zArr, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        return ptq(zArr, i2);
    }

    @InterfaceC7396q
    public static final List<Double> wy14(@InterfaceC7396q double[] dArr) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        if (dArr.length == 0) {
            return kotlin.collections.ni7.a9();
        }
        List<Double> listJ60k = j60k(dArr);
        jk.vep5(listJ60k);
        return listJ60k;
    }

    public static final <T> int wyfv(@InterfaceC7396q T[] tArr, @InterfaceC7396q cyoe.x2<? super T, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        int length = tArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (predicate.invoke(tArr[i2]).booleanValue()) {
                return i2;
            }
        }
        return -1;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <R> R wz(boolean[] zArr, Comparator<? super R> comparator, cyoe.x2<? super Boolean, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Boolean.valueOf(zArr[0]));
        n5r1 it = new kotlin.ranges.x2(1, rl(zArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Boolean.valueOf(zArr[it.nextInt()]));
            if (comparator.compare(rInvoke, rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    public static final <T> void wz6j(@InterfaceC7396q T[] tArr, @InterfaceC7396q InterfaceC5979h<? super Integer, ? super T, was> action) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(action, "action");
        int length = tArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            action.invoke(Integer.valueOf(i3), tArr[i2]);
            i2++;
            i3++;
        }
    }

    @InterfaceC7396q
    public static final C6227f<List<Boolean>, List<Boolean>> x0(@InterfaceC7396q boolean[] zArr, @InterfaceC7396q cyoe.x2<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (boolean z2 : zArr) {
            if (predicate.invoke(Boolean.valueOf(z2)).booleanValue()) {
                arrayList.add(Boolean.valueOf(z2));
            } else {
                arrayList2.add(Boolean.valueOf(z2));
            }
        }
        return new C6227f<>(arrayList, arrayList2);
    }

    public static final void x02(@InterfaceC7396q byte[] bArr, @InterfaceC7396q cyoe.x2<? super Byte, was> action) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(action, "action");
        for (byte b2 : bArr) {
            action.invoke(Byte.valueOf(b2));
        }
    }

    public static boolean x0c(@InterfaceC7396q short[] sArr, short s2) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        return kes(sArr, s2) >= 0;
    }

    @InterfaceC7396q
    public static final List<Short> x2z(@InterfaceC7396q short[] sArr, @InterfaceC7396q cyoe.x2<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (short s2 : sArr) {
            if (!predicate.invoke(Short.valueOf(s2)).booleanValue()) {
                break;
            }
            arrayList.add(Short.valueOf(s2));
        }
        return arrayList;
    }

    @InterfaceC6234g
    private static final boolean x3b5(short[] sArr) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        return !(sArr.length == 0);
    }

    @InterfaceC6234g
    private static final byte x4(byte[] bArr, int i2, cyoe.x2<? super Integer, Byte> defaultValue) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(defaultValue, "defaultValue");
        return (i2 < 0 || i2 > vl(bArr)) ? defaultValue.invoke(Integer.valueOf(i2)).byteValue() : bArr[i2];
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final <S, T extends S> S x41(@InterfaceC7396q T[] tArr, @InterfaceC7396q InterfaceC5979h<? super S, ? super T, ? extends S> operation) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (tArr.length == 0) {
            return null;
        }
        S sInvoke = (S) tArr[0];
        n5r1 it = new kotlin.ranges.x2(1, gjp(tArr)).iterator();
        while (it.hasNext()) {
            sInvoke = operation.invoke(sInvoke, (Object) tArr[it.nextInt()]);
        }
        return sInvoke;
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final Byte x76(@InterfaceC7396q byte[] bArr, @InterfaceC7396q InterfaceC5979h<? super Byte, ? super Byte, Byte> operation) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (bArr.length == 0) {
            return null;
        }
        byte bByteValue = bArr[0];
        n5r1 it = new kotlin.ranges.x2(1, vl(bArr)).iterator();
        while (it.hasNext()) {
            bByteValue = operation.invoke(Byte.valueOf(bByteValue), Byte.valueOf(bArr[it.nextInt()])).byteValue();
        }
        return Byte.valueOf(bByteValue);
    }

    @InterfaceC7396q
    public static final <K, V, M extends Map<? super K, ? super V>> M x8(@InterfaceC7396q float[] fArr, @InterfaceC7396q M destination, @InterfaceC7396q cyoe.x2<? super Float, ? extends K> keySelector, @InterfaceC7396q cyoe.x2<? super Float, ? extends V> valueTransform) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(keySelector, "keySelector");
        kotlin.jvm.internal.d2ok.m23075h(valueTransform, "valueTransform");
        for (float f2 : fArr) {
            destination.put(keySelector.invoke(Float.valueOf(f2)), valueTransform.invoke(Float.valueOf(f2)));
        }
        return destination;
    }

    @InterfaceC7395n
    public static final Character x85(@InterfaceC7396q char[] cArr) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        if (cArr.length == 0) {
            return null;
        }
        return Character.valueOf(cArr[0]);
    }

    @InterfaceC7396q
    public static final <R extends Comparable<? super R>> List<Long> x8sl(@InterfaceC7396q long[] jArr, @InterfaceC7396q cyoe.x2<? super Long, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        return ttpr(jArr, new f7l8.zy(selector));
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @kotlin.hyr
    @InterfaceC6234g
    @kotlin.yz(version = "1.5")
    @InterfaceC6769y(name = "sumOfUInt")
    private static final int x9(double[] dArr, cyoe.x2<? super Double, gyi> selector) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        int iLd6 = gyi.ld6(0);
        for (double d2 : dArr) {
            iLd6 = gyi.ld6(iLd6 + selector.invoke(Double.valueOf(d2)).a98o());
        }
        return iLd6;
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final Short x9e(short[] sArr) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        return tpl(sArr, AbstractC6332g.Default);
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @kotlin.hyr
    @InterfaceC6234g
    @kotlin.yz(version = "1.5")
    @InterfaceC6769y(name = "sumOfUInt")
    private static final int x9f2(float[] fArr, cyoe.x2<? super Float, gyi> selector) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        int iLd6 = gyi.ld6(0);
        for (float f2 : fArr) {
            iLd6 = gyi.ld6(iLd6 + selector.invoke(Float.valueOf(f2)).a98o());
        }
        return iLd6;
    }

    public static final int xa(@InterfaceC7396q float[] fArr, @InterfaceC7396q cyoe.x2<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        int length = fArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (predicate.invoke(Float.valueOf(fArr[i2])).booleanValue()) {
                return i2;
            }
        }
        return -1;
    }

    @InterfaceC7396q
    public static final List<Integer> xavr(@InterfaceC7396q int[] iArr, @InterfaceC7396q kotlin.ranges.x2 indices) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(indices, "indices");
        return indices.isEmpty() ? kotlin.collections.ni7.a9() : kotlin.collections.kja0.ki(kotlin.collections.kja0.ktq(iArr, indices.mo2951k().intValue(), indices.zy().intValue() + 1));
    }

    @kotlin.yz(version = "1.7")
    @InterfaceC6769y(name = "minOrThrow")
    public static final byte xb(@InterfaceC7396q byte[] bArr) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        byte b2 = bArr[0];
        n5r1 it = new kotlin.ranges.x2(1, vl(bArr)).iterator();
        while (it.hasNext()) {
            byte b3 = bArr[it.nextInt()];
            if (b2 > b3) {
                b2 = b3;
            }
        }
        return b2;
    }

    @kotlin.yz(version = "1.7")
    @InterfaceC6769y(name = "maxByOrThrow")
    public static final <R extends Comparable<? super R>> short xd(@InterfaceC7396q short[] sArr, @InterfaceC7396q cyoe.x2<? super Short, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        short s2 = sArr[0];
        int iOrxw = orxw(sArr);
        if (iOrxw == 0) {
            return s2;
        }
        R rInvoke = selector.invoke(Short.valueOf(s2));
        n5r1 it = new kotlin.ranges.x2(1, iOrxw).iterator();
        while (it.hasNext()) {
            short s3 = sArr[it.nextInt()];
            R rInvoke2 = selector.invoke(Short.valueOf(s3));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                s2 = s3;
                rInvoke = rInvoke2;
            }
        }
        return s2;
    }

    public static final char xdbo(@InterfaceC7396q char[] cArr, @InterfaceC7396q cyoe.x2<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        int length = cArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                char c2 = cArr[length];
                if (!predicate.invoke(Character.valueOf(c2)).booleanValue()) {
                    if (i2 < 0) {
                        break;
                    }
                    length = i2;
                } else {
                    return c2;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @InterfaceC7396q
    public static final <K> List<Double> xdxk(@InterfaceC7396q double[] dArr, @InterfaceC7396q cyoe.x2<? super Double, ? extends K> selector) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (double d2 : dArr) {
            if (hashSet.add(selector.invoke(Double.valueOf(d2)))) {
                arrayList.add(Double.valueOf(d2));
            }
        }
        return arrayList;
    }

    @kotlin.hyr
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @InterfaceC6769y(name = "flatMapIndexedIterable")
    private static final <R> List<R> xg(short[] sArr, InterfaceC5979h<? super Integer, ? super Short, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = sArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            C6163t.zp(arrayList, transform.invoke(Integer.valueOf(i3), Short.valueOf(sArr[i2])));
            i2++;
            i3++;
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final kotlin.sequences.qrj<Long> xh(@InterfaceC7396q long[] jArr) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        return jArr.length == 0 ? kotlin.sequences.t8r.f7l8() : new n7h(jArr);
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final double xk3(double[] dArr, cyoe.x2<? super Double, Double> selector) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(Double.valueOf(dArr[0])).doubleValue();
        n5r1 it = new kotlin.ranges.x2(1, f14(dArr)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, selector.invoke(Double.valueOf(dArr[it.nextInt()])).doubleValue());
        }
        return dDoubleValue;
    }

    @InterfaceC7396q
    public static final <R, V> List<V> xk5(@InterfaceC7396q boolean[] zArr, @InterfaceC7396q R[] other, @InterfaceC7396q InterfaceC5979h<? super Boolean, ? super R, ? extends V> transform) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        int iMin = Math.min(zArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i2 = 0; i2 < iMin; i2++) {
            arrayList.add(transform.invoke(Boolean.valueOf(zArr[i2]), other[i2]));
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final <C extends Collection<? super Float>> C xk9p(@InterfaceC7396q float[] fArr, @InterfaceC7396q C destination) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        for (float f2 : fArr) {
            destination.add(Float.valueOf(f2));
        }
        return destination;
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final <R> List<R> xkf(short[] sArr, R r2, InterfaceC5979h<? super R, ? super Short, ? extends R> operation) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (sArr.length == 0) {
            return kotlin.collections.zurt.ld6(r2);
        }
        ArrayList arrayList = new ArrayList(sArr.length + 1);
        arrayList.add(r2);
        for (short s2 : sArr) {
            r2 = operation.invoke(r2, Short.valueOf(s2));
            arrayList.add(r2);
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final HashSet<Character> xkj(@InterfaceC7396q char[] cArr) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        return (HashSet) kff(cArr, new HashSet(C6140e.m22479p(kotlin.ranges.fn3e.m23305t(cArr.length, 128))));
    }

    @InterfaceC7396q
    public static final <K> Map<K, Long> xknm(@InterfaceC7396q long[] jArr, @InterfaceC7396q cyoe.x2<? super Long, ? extends K> keySelector) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.fn3e.fn3e(C6140e.m22479p(jArr.length), 16));
        for (long j2 : jArr) {
            linkedHashMap.put(keySelector.invoke(Long.valueOf(j2)), Long.valueOf(j2));
        }
        return linkedHashMap;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final List<Short> xky(short[] sArr, cyoe.cdj<? super Integer, ? super Short, ? super Short, Short> operation) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (sArr.length == 0) {
            return kotlin.collections.ni7.a9();
        }
        short sShortValue = sArr[0];
        ArrayList arrayList = new ArrayList(sArr.length);
        arrayList.add(Short.valueOf(sShortValue));
        int length = sArr.length;
        for (int i2 = 1; i2 < length; i2++) {
            sShortValue = operation.invoke(Integer.valueOf(i2), Short.valueOf(sShortValue), Short.valueOf(sArr[i2])).shortValue();
            arrayList.add(Short.valueOf(sShortValue));
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final List<Integer> xleu(@InterfaceC7396q int[] iArr) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        kotlin.jvm.internal.d2ok.kja0(iArrCopyOf, "copyOf(this, size)");
        kotlin.collections.kja0.e4e(iArrCopyOf);
        return xzp(iArrCopyOf);
    }

    @InterfaceC7396q
    public static final <C extends Collection<? super T>, T> C xn(@InterfaceC7396q T[] tArr, @InterfaceC7396q C destination) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        for (T t2 : tArr) {
            if (t2 != null) {
                destination.add(t2);
            }
        }
        return destination;
    }

    @InterfaceC7396q
    public static final List<Double> xnf(@InterfaceC7396q double[] dArr, @InterfaceC7396q InterfaceC5979h<? super Integer, ? super Double, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = dArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            double d2 = dArr[i2];
            int i4 = i3 + 1;
            if (predicate.invoke(Integer.valueOf(i3), Double.valueOf(d2)).booleanValue()) {
                arrayList.add(Double.valueOf(d2));
            }
            i2++;
            i3 = i4;
        }
        return arrayList;
    }

    public static final boolean xnu(@InterfaceC7396q float[] fArr, @InterfaceC7396q cyoe.x2<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (float f2 : fArr) {
            if (predicate.invoke(Float.valueOf(f2)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static final boolean xo(@InterfaceC7396q boolean[] zArr, @InterfaceC7396q cyoe.x2<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (boolean z2 : zArr) {
            if (!predicate.invoke(Boolean.valueOf(z2)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final <R> List<R> xoi(int[] iArr, R r2, InterfaceC5979h<? super R, ? super Integer, ? extends R> operation) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (iArr.length == 0) {
            return kotlin.collections.zurt.ld6(r2);
        }
        ArrayList arrayList = new ArrayList(iArr.length + 1);
        arrayList.add(r2);
        for (int i2 : iArr) {
            r2 = operation.invoke(r2, Integer.valueOf(i2));
            arrayList.add(r2);
        }
        return arrayList;
    }

    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final Double xq(@InterfaceC7396q double[] dArr, @InterfaceC7396q cyoe.cdj<? super Integer, ? super Double, ? super Double, Double> operation) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        int iF14 = f14(dArr);
        if (iF14 < 0) {
            return null;
        }
        double dDoubleValue = dArr[iF14];
        for (int i2 = iF14 - 1; i2 >= 0; i2--) {
            dDoubleValue = operation.invoke(Integer.valueOf(i2), Double.valueOf(dArr[i2]), Double.valueOf(dDoubleValue)).doubleValue();
        }
        return Double.valueOf(dDoubleValue);
    }

    @InterfaceC7396q
    public static final byte[] xq3b(@InterfaceC7396q byte[] bArr) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        if (bArr.length == 0) {
            return bArr;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        kotlin.jvm.internal.d2ok.kja0(bArrCopyOf, "copyOf(this, size)");
        kotlin.collections.kja0.zma(bArrCopyOf);
        return bArrCopyOf;
    }

    @InterfaceC7396q
    public static final List<Character> xrg(@InterfaceC7396q char[] cArr, @InterfaceC7396q cyoe.x2<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (char c2 : cArr) {
            if (predicate.invoke(Character.valueOf(c2)).booleanValue()) {
                arrayList.add(Character.valueOf(c2));
            }
        }
        return arrayList;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final List<Boolean> xt(boolean[] zArr, InterfaceC5979h<? super Boolean, ? super Boolean, Boolean> operation) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (zArr.length == 0) {
            return kotlin.collections.ni7.a9();
        }
        boolean zBooleanValue = zArr[0];
        ArrayList arrayList = new ArrayList(zArr.length);
        arrayList.add(Boolean.valueOf(zBooleanValue));
        int length = zArr.length;
        for (int i2 = 1; i2 < length; i2++) {
            zBooleanValue = operation.invoke(Boolean.valueOf(zBooleanValue), Boolean.valueOf(zArr[i2])).booleanValue();
            arrayList.add(Boolean.valueOf(zBooleanValue));
        }
        return arrayList;
    }

    public static final int xt8(@InterfaceC7396q int[] iArr, @InterfaceC7396q cyoe.x2<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        Integer numValueOf = null;
        boolean z2 = false;
        for (int i2 : iArr) {
            if (predicate.invoke(Integer.valueOf(i2)).booleanValue()) {
                if (z2) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                numValueOf = Integer.valueOf(i2);
                z2 = true;
            }
        }
        if (!z2) {
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        kotlin.jvm.internal.d2ok.n7h(numValueOf, "null cannot be cast to non-null type kotlin.Int");
        return numValueOf.intValue();
    }

    @InterfaceC7396q
    public static final <T, K, M extends Map<? super K, List<T>>> M xtsf(@InterfaceC7396q T[] tArr, @InterfaceC7396q M destination, @InterfaceC7396q cyoe.x2<? super T, ? extends K> keySelector) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(keySelector, "keySelector");
        for (T t2 : tArr) {
            K kInvoke = keySelector.invoke(t2);
            Object arrayList = destination.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(t2);
        }
        return destination;
    }

    public static final <R> R xtxy(@InterfaceC7396q boolean[] zArr, R r2, @InterfaceC7396q cyoe.cdj<? super Integer, ? super Boolean, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        for (int iRl = rl(zArr); iRl >= 0; iRl--) {
            r2 = operation.invoke(Integer.valueOf(iRl), Boolean.valueOf(zArr[iRl]), r2);
        }
        return r2;
    }

    @kotlin.yz(version = "1.7")
    @InterfaceC6769y(name = "minOrThrow")
    public static final double xtyc(@InterfaceC7396q double[] dArr) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dMin = dArr[0];
        n5r1 it = new kotlin.ranges.x2(1, f14(dArr)).iterator();
        while (it.hasNext()) {
            dMin = Math.min(dMin, dArr[it.nextInt()]);
        }
        return dMin;
    }

    public static final void xu7(@InterfaceC7396q boolean[] zArr, @InterfaceC7396q InterfaceC5979h<? super Integer, ? super Boolean, was> action) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(action, "action");
        int length = zArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            action.invoke(Integer.valueOf(i3), Boolean.valueOf(zArr[i2]));
            i2++;
            i3++;
        }
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final <V> Map<Byte, V> xx(byte[] bArr, cyoe.x2<? super Byte, ? extends V> valueSelector) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(valueSelector, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.fn3e.fn3e(C6140e.m22479p(bArr.length), 16));
        for (byte b2 : bArr) {
            linkedHashMap.put(Byte.valueOf(b2), valueSelector.invoke(Byte.valueOf(b2)));
        }
        return linkedHashMap;
    }

    @InterfaceC7396q
    public static final C6227f<List<Byte>, List<Byte>> xx8g(@InterfaceC7396q byte[] bArr, @InterfaceC7396q cyoe.x2<? super Byte, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (byte b2 : bArr) {
            if (predicate.invoke(Byte.valueOf(b2)).booleanValue()) {
                arrayList.add(Byte.valueOf(b2));
            } else {
                arrayList2.add(Byte.valueOf(b2));
            }
        }
        return new C6227f<>(arrayList, arrayList2);
    }

    public static final int xxxc(@InterfaceC7396q long[] jArr, @InterfaceC7396q cyoe.x2<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        int length = jArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (predicate.invoke(Long.valueOf(jArr[i2])).booleanValue()) {
                return i2;
            }
        }
        return -1;
    }

    @InterfaceC7396q
    public static final <C extends Collection<? super Integer>> C xypo(@InterfaceC7396q int[] iArr, @InterfaceC7396q C destination, @InterfaceC7396q cyoe.x2<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (int i2 : iArr) {
            if (!predicate.invoke(Integer.valueOf(i2)).booleanValue()) {
                destination.add(Integer.valueOf(i2));
            }
        }
        return destination;
    }

    @kotlin.x2(warningSince = "1.5")
    @kotlin.ld6(message = "Use sumOf instead.", replaceWith = @kotlin.hb(expression = "this.sumOf(selector)", imports = {}))
    public static final double xyt(@InterfaceC7396q short[] sArr, @InterfaceC7396q cyoe.x2<? super Short, Double> selector) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        double dDoubleValue = 0.0d;
        for (short s2 : sArr) {
            dDoubleValue += selector.invoke(Short.valueOf(s2)).doubleValue();
        }
        return dDoubleValue;
    }

    @InterfaceC7396q
    public static final <T, R, C extends Collection<? super R>> C xz(@InterfaceC7396q T[] tArr, @InterfaceC7396q C destination, @InterfaceC7396q InterfaceC5979h<? super Integer, ? super T, ? extends R> transform) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        int length = tArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = i3 + 1;
            R rInvoke = transform.invoke(Integer.valueOf(i3), tArr[i2]);
            if (rInvoke != null) {
                destination.add(rInvoke);
            }
            i2++;
            i3 = i4;
        }
        return destination;
    }

    @InterfaceC7396q
    public static final <K, V> Map<K, V> xzk4(@InterfaceC7396q boolean[] zArr, @InterfaceC7396q cyoe.x2<? super Boolean, ? extends C6227f<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.fn3e.fn3e(C6140e.m22479p(zArr.length), 16));
        for (boolean z2 : zArr) {
            C6227f<? extends K, ? extends V> c6227fInvoke = transform.invoke(Boolean.valueOf(z2));
            linkedHashMap.put(c6227fInvoke.getFirst(), c6227fInvoke.getSecond());
        }
        return linkedHashMap;
    }

    @InterfaceC7396q
    public static final List<Float> xzk6(@InterfaceC7396q float[] fArr, @InterfaceC7396q cyoe.x2<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (float f2 : fArr) {
            if (predicate.invoke(Float.valueOf(f2)).booleanValue()) {
                arrayList.add(Float.valueOf(f2));
            }
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final List<Integer> xzp(@InterfaceC7396q int[] iArr) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        if (iArr.length == 0) {
            return kotlin.collections.ni7.a9();
        }
        List<Integer> listV9ed = v9ed(iArr);
        jk.vep5(listV9ed);
        return listV9ed;
    }

    @InterfaceC7396q
    public static final List<Float> xzve(@InterfaceC7396q float[] fArr) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        Float[] fArrQexj = kotlin.collections.kja0.qexj(fArr);
        kotlin.collections.kja0.anw(fArrQexj);
        return kotlin.collections.kja0.m22514i(fArrQexj);
    }

    @InterfaceC7396q
    public static final double[] y0(@InterfaceC7396q double[] dArr) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        if (dArr.length == 0) {
            return dArr;
        }
        double[] dArrCopyOf = Arrays.copyOf(dArr, dArr.length);
        kotlin.jvm.internal.d2ok.kja0(dArrCopyOf, "copyOf(this, size)");
        uw73(dArrCopyOf);
        return dArrCopyOf;
    }

    @InterfaceC7396q
    public static final <R> List<R> y0yf(@InterfaceC7396q char[] cArr, @InterfaceC7396q InterfaceC5979h<? super Integer, ? super Character, ? extends R> transform) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        ArrayList arrayList = new ArrayList(cArr.length);
        int length = cArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            arrayList.add(transform.invoke(Integer.valueOf(i3), Character.valueOf(cArr[i2])));
            i2++;
            i3++;
        }
        return arrayList;
    }

    public static final int y1(@InterfaceC7396q int[] iArr, @InterfaceC7396q cyoe.x2<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (predicate.invoke(Integer.valueOf(iArr[i2])).booleanValue()) {
                return i2;
            }
        }
        return -1;
    }

    @InterfaceC7396q
    public static final <A extends Appendable> A y1e(@InterfaceC7396q byte[] bArr, @InterfaceC7396q A buffer, @InterfaceC7396q CharSequence separator, @InterfaceC7396q CharSequence prefix, @InterfaceC7396q CharSequence postfix, int i2, @InterfaceC7396q CharSequence truncated, @InterfaceC7395n cyoe.x2<? super Byte, ? extends CharSequence> x2Var) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(buffer, "buffer");
        kotlin.jvm.internal.d2ok.m23075h(separator, "separator");
        kotlin.jvm.internal.d2ok.m23075h(prefix, "prefix");
        kotlin.jvm.internal.d2ok.m23075h(postfix, "postfix");
        kotlin.jvm.internal.d2ok.m23075h(truncated, "truncated");
        buffer.append(prefix);
        int i3 = 0;
        for (byte b2 : bArr) {
            i3++;
            if (i3 > 1) {
                buffer.append(separator);
            }
            if (i2 >= 0 && i3 > i2) {
                break;
            }
            if (x2Var != null) {
                buffer.append(x2Var.invoke(Byte.valueOf(b2)));
            } else {
                buffer.append(String.valueOf((int) b2));
            }
        }
        if (i2 >= 0 && i3 > i2) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    @InterfaceC7396q
    public static final C6227f<List<Short>, List<Short>> y380(@InterfaceC7396q short[] sArr, @InterfaceC7396q cyoe.x2<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (short s2 : sArr) {
            if (predicate.invoke(Short.valueOf(s2)).booleanValue()) {
                arrayList.add(Short.valueOf(s2));
            } else {
                arrayList2.add(Short.valueOf(s2));
            }
        }
        return new C6227f<>(arrayList, arrayList2);
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final Float y3rt(long[] jArr, cyoe.x2<? super Long, Float> selector) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        float fFloatValue = selector.invoke(Long.valueOf(jArr[0])).floatValue();
        n5r1 it = new kotlin.ranges.x2(1, hmvj(jArr)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, selector.invoke(Long.valueOf(jArr[it.nextInt()])).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @InterfaceC7396q
    public static final List<Boolean> y4wo(@InterfaceC7396q boolean[] zArr, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        if (i2 >= 0) {
            return o1sk(zArr, kotlin.ranges.fn3e.fn3e(zArr.length - i2, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final Boolean y5(boolean[] zArr) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        return o0t(zArr, AbstractC6332g.Default);
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final boolean[] y53(boolean[] zArr, cyoe.x2<? super Boolean, was> action) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(action, "action");
        for (boolean z2 : zArr) {
            action.invoke(Boolean.valueOf(z2));
        }
        return zArr;
    }

    @InterfaceC7396q
    public static final <T, R> List<R> y5s(@InterfaceC7396q T[] tArr, @InterfaceC7396q cyoe.x2<? super T, ? extends R> transform) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (T t2 : tArr) {
            R rInvoke = transform.invoke(t2);
            if (rInvoke != null) {
                arrayList.add(rInvoke);
            }
        }
        return arrayList;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <R> R y6(char[] cArr, Comparator<? super R> comparator, cyoe.x2<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Character.valueOf(cArr[0]));
        n5r1 it = new kotlin.ranges.x2(1, j59a(cArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Character.valueOf(cArr[it.nextInt()]));
            if (comparator.compare(rInvoke, rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC6769y(name = "sumOfFloat")
    public static final float y6xt(@InterfaceC7396q Float[] fArr) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        float fFloatValue = 0.0f;
        for (Float f2 : fArr) {
            fFloatValue += f2.floatValue();
        }
        return fFloatValue;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final double y7(long[] jArr, cyoe.x2<? super Long, Double> selector) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(Long.valueOf(jArr[0])).doubleValue();
        n5r1 it = new kotlin.ranges.x2(1, hmvj(jArr)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, selector.invoke(Long.valueOf(jArr[it.nextInt()])).doubleValue());
        }
        return dDoubleValue;
    }

    @kotlin.x2(errorSince = "1.6", hiddenSince = "1.7", warningSince = "1.4")
    @kotlin.ld6(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use 'any { it == element }' instead to continue using this behavior, or '.asList().contains(element: T)' to get the same search behavior as in a list.", replaceWith = @kotlin.hb(expression = "any { it == element }", imports = {}))
    public static final /* synthetic */ boolean y76(double[] dArr, double d2) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        for (double d4 : dArr) {
            if (d4 == d2) {
                return true;
            }
        }
        return false;
    }

    @InterfaceC7396q
    public static final <K, V, M extends Map<? super K, ? super V>> M y84(@InterfaceC7396q char[] cArr, @InterfaceC7396q M destination, @InterfaceC7396q cyoe.x2<? super Character, ? extends C6227f<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        for (char c2 : cArr) {
            C6227f<? extends K, ? extends V> c6227fInvoke = transform.invoke(Character.valueOf(c2));
            destination.put(c6227fInvoke.getFirst(), c6227fInvoke.getSecond());
        }
        return destination;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final List<Boolean> y84p(boolean[] zArr, cyoe.cdj<? super Integer, ? super Boolean, ? super Boolean, Boolean> operation) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (zArr.length == 0) {
            return kotlin.collections.ni7.a9();
        }
        boolean zBooleanValue = zArr[0];
        ArrayList arrayList = new ArrayList(zArr.length);
        arrayList.add(Boolean.valueOf(zBooleanValue));
        int length = zArr.length;
        for (int i2 = 1; i2 < length; i2++) {
            zBooleanValue = operation.invoke(Integer.valueOf(i2), Boolean.valueOf(zBooleanValue), Boolean.valueOf(zArr[i2])).booleanValue();
            arrayList.add(Boolean.valueOf(zBooleanValue));
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final <T> List<T> y8mq(@InterfaceC7396q T[] tArr, @InterfaceC7396q kotlin.ranges.x2 indices) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(indices, "indices");
        return indices.isEmpty() ? kotlin.collections.ni7.a9() : kotlin.collections.kja0.m22514i(kotlin.collections.kja0.bek6(tArr, indices.mo2951k().intValue(), indices.zy().intValue() + 1));
    }

    @InterfaceC6234g
    private static final boolean y9(double[] dArr) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        return !(dArr.length == 0);
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final Double y9h3(boolean[] zArr, cyoe.x2<? super Boolean, Double> selector) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        double dDoubleValue = selector.invoke(Boolean.valueOf(zArr[0])).doubleValue();
        n5r1 it = new kotlin.ranges.x2(1, rl(zArr)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, selector.invoke(Boolean.valueOf(zArr[it.nextInt()])).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final Byte y9i5(@InterfaceC7396q byte[] bArr, @InterfaceC7396q Comparator<? super Byte> comparator) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        if (bArr.length == 0) {
            return null;
        }
        byte b2 = bArr[0];
        n5r1 it = new kotlin.ranges.x2(1, vl(bArr)).iterator();
        while (it.hasNext()) {
            byte b3 = bArr[it.nextInt()];
            if (comparator.compare(Byte.valueOf(b2), Byte.valueOf(b3)) > 0) {
                b2 = b3;
            }
        }
        return Byte.valueOf(b2);
    }

    @kotlin.yz(version = "1.7")
    @InterfaceC6769y(name = "maxByOrThrow")
    public static final <R extends Comparable<? super R>> float y9o6(@InterfaceC7396q float[] fArr, @InterfaceC7396q cyoe.x2<? super Float, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        float f2 = fArr[0];
        int iGto = gto(fArr);
        if (iGto == 0) {
            return f2;
        }
        R rInvoke = selector.invoke(Float.valueOf(f2));
        n5r1 it = new kotlin.ranges.x2(1, iGto).iterator();
        while (it.hasNext()) {
            float f3 = fArr[it.nextInt()];
            R rInvoke2 = selector.invoke(Float.valueOf(f3));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                f2 = f3;
                rInvoke = rInvoke2;
            }
        }
        return f2;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final Double yad(long[] jArr, cyoe.x2<? super Long, Double> selector) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        double dDoubleValue = selector.invoke(Long.valueOf(jArr[0])).doubleValue();
        n5r1 it = new kotlin.ranges.x2(1, hmvj(jArr)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, selector.invoke(Long.valueOf(jArr[it.nextInt()])).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @InterfaceC6234g
    private static final Long yaw(long[] jArr, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        return vce(jArr, i2);
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final Float yb3p(float[] fArr, cyoe.x2<? super Float, Float> selector) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        float fFloatValue = selector.invoke(Float.valueOf(fArr[0])).floatValue();
        n5r1 it = new kotlin.ranges.x2(1, gto(fArr)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, selector.invoke(Float.valueOf(fArr[it.nextInt()])).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    public static final boolean ybb(@InterfaceC7396q short[] sArr, @InterfaceC7396q cyoe.x2<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (short s2 : sArr) {
            if (!predicate.invoke(Short.valueOf(s2)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ String ybu(int[] iArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, cyoe.x2 x2Var, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i3 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i3 & 4) == 0 ? charSequence3 : "";
        if ((i3 & 8) != 0) {
            i2 = -1;
        }
        int i4 = i2;
        if ((i3 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i3 & 32) != 0) {
            x2Var = null;
        }
        return v7p(iArr, charSequence, charSequence5, charSequence6, i4, charSequence7, x2Var);
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final float[] yc(float[] fArr, InterfaceC5979h<? super Integer, ? super Float, was> action) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(action, "action");
        int length = fArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            action.invoke(Integer.valueOf(i3), Float.valueOf(fArr[i2]));
            i2++;
            i3++;
        }
        return fArr;
    }

    @InterfaceC7396q
    public static final <C extends Collection<? super Character>> C yg(@InterfaceC7396q char[] cArr, @InterfaceC7396q C destination, @InterfaceC7396q InterfaceC5979h<? super Integer, ? super Character, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        int length = cArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            char c2 = cArr[i2];
            int i4 = i3 + 1;
            if (predicate.invoke(Integer.valueOf(i3), Character.valueOf(c2)).booleanValue()) {
                destination.add(Character.valueOf(c2));
            }
            i2++;
            i3 = i4;
        }
        return destination;
    }

    @kotlin.yz(version = "1.7")
    @InterfaceC6769y(name = "maxOrThrow")
    public static final double ygct(@InterfaceC7396q Double[] dArr) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = dArr[0].doubleValue();
        n5r1 it = new kotlin.ranges.x2(1, gjp(dArr)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, dArr[it.nextInt()].doubleValue());
        }
        return dDoubleValue;
    }

    public static final int ygmb(@InterfaceC7396q short[] sArr, @InterfaceC7396q cyoe.x2<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        int length = sArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (predicate.invoke(Short.valueOf(sArr[i2])).booleanValue()) {
                return i2;
            }
        }
        return -1;
    }

    @InterfaceC7396q
    public static final <R, V> List<V> ygy(@InterfaceC7396q float[] fArr, @InterfaceC7396q R[] other, @InterfaceC7396q InterfaceC5979h<? super Float, ? super R, ? extends V> transform) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        int iMin = Math.min(fArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i2 = 0; i2 < iMin; i2++) {
            arrayList.add(transform.invoke(Float.valueOf(fArr[i2]), other[i2]));
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final HashSet<Byte> yh(@InterfaceC7396q byte[] bArr) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        return (HashSet) ads1(bArr, new HashSet(C6140e.m22479p(bArr.length)));
    }

    @InterfaceC7396q
    public static final <K, V, M extends Map<? super K, ? super V>> M yh8z(@InterfaceC7396q float[] fArr, @InterfaceC7396q M destination, @InterfaceC7396q cyoe.x2<? super Float, ? extends C6227f<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        for (float f2 : fArr) {
            C6227f<? extends K, ? extends V> c6227fInvoke = transform.invoke(Float.valueOf(f2));
            destination.put(c6227fInvoke.getFirst(), c6227fInvoke.getSecond());
        }
        return destination;
    }

    public static final char yhcu(@InterfaceC7396q char[] cArr, @InterfaceC7396q InterfaceC5979h<? super Character, ? super Character, Character> operation) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        int iJ59a = j59a(cArr);
        if (iJ59a < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        char cCharValue = cArr[iJ59a];
        for (int i2 = iJ59a - 1; i2 >= 0; i2--) {
            cCharValue = operation.invoke(Character.valueOf(cArr[i2]), Character.valueOf(cCharValue)).charValue();
        }
        return cCharValue;
    }

    public static final <S, T extends S> S yhe(@InterfaceC7396q T[] tArr, @InterfaceC7396q cyoe.cdj<? super Integer, ? super T, ? super S, ? extends S> operation) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        int iGjp = gjp(tArr);
        if (iGjp < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        S sInvoke = (S) tArr[iGjp];
        for (int i2 = iGjp - 1; i2 >= 0; i2--) {
            sInvoke = operation.invoke(Integer.valueOf(i2), (Object) tArr[i2], sInvoke);
        }
        return sInvoke;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final <R> List<R> yhsc(short[] sArr, R r2, cyoe.cdj<? super Integer, ? super R, ? super Short, ? extends R> operation) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (sArr.length == 0) {
            return kotlin.collections.zurt.ld6(r2);
        }
        ArrayList arrayList = new ArrayList(sArr.length + 1);
        arrayList.add(r2);
        int length = sArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            r2 = operation.invoke(Integer.valueOf(i2), r2, Short.valueOf(sArr[i2]));
            arrayList.add(r2);
        }
        return arrayList;
    }

    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final <T extends Comparable<? super T>> T yi(@InterfaceC7396q T[] tArr) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        if (tArr.length == 0) {
            return null;
        }
        T t2 = tArr[0];
        n5r1 it = new kotlin.ranges.x2(1, gjp(tArr)).iterator();
        while (it.hasNext()) {
            T t3 = tArr[it.nextInt()];
            if (t2.compareTo(t3) < 0) {
                t2 = t3;
            }
        }
        return t2;
    }

    @InterfaceC7396q
    public static final <R, C extends Collection<? super R>> C yir(@InterfaceC7396q byte[] bArr, @InterfaceC7396q C destination, @InterfaceC7396q InterfaceC5979h<? super Integer, ? super Byte, ? extends R> transform) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            destination.add(transform.invoke(Integer.valueOf(i3), Byte.valueOf(bArr[i2])));
            i2++;
            i3++;
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, R> R yiu(@InterfaceC7396q T[] tArr, R r2, @InterfaceC7396q InterfaceC5979h<? super R, ? super T, ? extends R> operation) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        for (a98o.toq toqVar : tArr) {
            r2 = operation.invoke(r2, toqVar);
        }
        return r2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC7396q
    @kotlin.yz(version = "1.4")
    public static final <T, R> List<R> yiy0(@InterfaceC7396q T[] tArr, R r2, @InterfaceC7396q InterfaceC5979h<? super R, ? super T, ? extends R> operation) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (tArr.length == 0) {
            return kotlin.collections.zurt.ld6(r2);
        }
        ArrayList arrayList = new ArrayList(tArr.length + 1);
        arrayList.add(r2);
        for (a98o.toq toqVar : tArr) {
            r2 = operation.invoke(r2, toqVar);
            arrayList.add(r2);
        }
        return arrayList;
    }

    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final Double yj1(@InterfaceC7396q double[] dArr, @InterfaceC7396q Comparator<? super Double> comparator) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        if (dArr.length == 0) {
            return null;
        }
        double d2 = dArr[0];
        n5r1 it = new kotlin.ranges.x2(1, f14(dArr)).iterator();
        while (it.hasNext()) {
            double d4 = dArr[it.nextInt()];
            if (comparator.compare(Double.valueOf(d2), Double.valueOf(d4)) > 0) {
                d2 = d4;
            }
        }
        return Double.valueOf(d2);
    }

    public static final int yl24(@InterfaceC7396q double[] dArr, @InterfaceC7396q cyoe.x2<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        int i2 = 0;
        for (double d2 : dArr) {
            if (predicate.invoke(Double.valueOf(d2)).booleanValue()) {
                i2++;
            }
        }
        return i2;
    }

    @InterfaceC7396q
    public static final <R, V> List<V> yl25(@InterfaceC7396q short[] sArr, @InterfaceC7396q R[] other, @InterfaceC7396q InterfaceC5979h<? super Short, ? super R, ? extends V> transform) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        int iMin = Math.min(sArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i2 = 0; i2 < iMin; i2++) {
            arrayList.add(transform.invoke(Short.valueOf(sArr[i2]), other[i2]));
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final <K, V, M extends Map<? super K, ? super V>> M ym(@InterfaceC7396q char[] cArr, @InterfaceC7396q M destination, @InterfaceC7396q cyoe.x2<? super Character, ? extends K> keySelector, @InterfaceC7396q cyoe.x2<? super Character, ? extends V> valueTransform) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(keySelector, "keySelector");
        kotlin.jvm.internal.d2ok.m23075h(valueTransform, "valueTransform");
        for (char c2 : cArr) {
            destination.put(keySelector.invoke(Character.valueOf(c2)), valueTransform.invoke(Character.valueOf(c2)));
        }
        return destination;
    }

    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final <R extends Comparable<? super R>> Byte ym5(@InterfaceC7396q byte[] bArr, @InterfaceC7396q cyoe.x2<? super Byte, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        byte b2 = bArr[0];
        int iVl = vl(bArr);
        if (iVl == 0) {
            return Byte.valueOf(b2);
        }
        R rInvoke = selector.invoke(Byte.valueOf(b2));
        n5r1 it = new kotlin.ranges.x2(1, iVl).iterator();
        while (it.hasNext()) {
            byte b3 = bArr[it.nextInt()];
            R rInvoke2 = selector.invoke(Byte.valueOf(b3));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                b2 = b3;
                rInvoke = rInvoke2;
            }
        }
        return Byte.valueOf(b2);
    }

    public static final double ym8(@InterfaceC7396q int[] iArr) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        double d2 = 0.0d;
        int i2 = 0;
        for (int i3 : iArr) {
            d2 += (double) i3;
            i2++;
        }
        if (i2 == 0) {
            return Double.NaN;
        }
        return d2 / ((double) i2);
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final Float ymez(byte[] bArr, cyoe.x2<? super Byte, Float> selector) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        float fFloatValue = selector.invoke(Byte.valueOf(bArr[0])).floatValue();
        n5r1 it = new kotlin.ranges.x2(1, vl(bArr)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, selector.invoke(Byte.valueOf(bArr[it.nextInt()])).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @InterfaceC7396q
    public static final <K> List<Float> yn(@InterfaceC7396q float[] fArr, @InterfaceC7396q cyoe.x2<? super Float, ? extends K> selector) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (float f2 : fArr) {
            if (hashSet.add(selector.invoke(Float.valueOf(f2)))) {
                arrayList.add(Float.valueOf(f2));
            }
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final List<Long> ynka(@InterfaceC7396q long[] jArr, @InterfaceC7396q kotlin.ranges.x2 indices) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(indices, "indices");
        return indices.isEmpty() ? kotlin.collections.ni7.a9() : kotlin.collections.kja0.t8r(kotlin.collections.kja0.b3e(jArr, indices.mo2951k().intValue(), indices.zy().intValue() + 1));
    }

    @InterfaceC7396q
    public static final List<Long> ypv(@InterfaceC7396q long[] jArr, @InterfaceC7396q Iterable<Integer> indices) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(indices, "indices");
        int iVyq = kotlin.collections.fu4.vyq(indices, 10);
        if (iVyq == 0) {
            return kotlin.collections.ni7.a9();
        }
        ArrayList arrayList = new ArrayList(iVyq);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(jArr[it.next().intValue()]));
        }
        return arrayList;
    }

    @kotlin.x2(warningSince = "1.5")
    @kotlin.ld6(message = "Use sumOf instead.", replaceWith = @kotlin.hb(expression = "this.sumOf(selector)", imports = {}))
    public static final double yqyp(@InterfaceC7396q int[] iArr, @InterfaceC7396q cyoe.x2<? super Integer, Double> selector) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        double dDoubleValue = 0.0d;
        for (int i2 : iArr) {
            dDoubleValue += selector.invoke(Integer.valueOf(i2)).doubleValue();
        }
        return dDoubleValue;
    }

    public static int yuzy(@InterfaceC7396q int[] iArr) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        if (iArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return iArr[0];
    }

    @kotlin.yz(version = "1.7")
    @InterfaceC6769y(name = "minByOrThrow")
    public static final <R extends Comparable<? super R>> byte yv44(@InterfaceC7396q byte[] bArr, @InterfaceC7396q cyoe.x2<? super Byte, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        byte b2 = bArr[0];
        int iVl = vl(bArr);
        if (iVl == 0) {
            return b2;
        }
        R rInvoke = selector.invoke(Byte.valueOf(b2));
        n5r1 it = new kotlin.ranges.x2(1, iVl).iterator();
        while (it.hasNext()) {
            byte b3 = bArr[it.nextInt()];
            R rInvoke2 = selector.invoke(Byte.valueOf(b3));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                b2 = b3;
                rInvoke = rInvoke2;
            }
        }
        return b2;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final float yvd(int[] iArr, cyoe.x2<? super Integer, Float> selector) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(Integer.valueOf(iArr[0])).floatValue();
        n5r1 it = new kotlin.ranges.x2(1, srpc(iArr)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, selector.invoke(Integer.valueOf(iArr[it.nextInt()])).floatValue());
        }
        return fFloatValue;
    }

    @InterfaceC7396q
    public static final <K, V> Map<K, V> yvs(@InterfaceC7396q byte[] bArr, @InterfaceC7396q cyoe.x2<? super Byte, ? extends K> keySelector, @InterfaceC7396q cyoe.x2<? super Byte, ? extends V> valueTransform) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(keySelector, "keySelector");
        kotlin.jvm.internal.d2ok.m23075h(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.fn3e.fn3e(C6140e.m22479p(bArr.length), 16));
        for (byte b2 : bArr) {
            linkedHashMap.put(keySelector.invoke(Byte.valueOf(b2)), valueTransform.invoke(Byte.valueOf(b2)));
        }
        return linkedHashMap;
    }

    @InterfaceC6234g
    private static final boolean yw7(boolean[] zArr, int i2, cyoe.x2<? super Integer, Boolean> defaultValue) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(defaultValue, "defaultValue");
        return (i2 < 0 || i2 > rl(zArr)) ? defaultValue.invoke(Integer.valueOf(i2)).booleanValue() : zArr[i2];
    }

    public static final <R> R yx(@InterfaceC7396q long[] jArr, R r2, @InterfaceC7396q InterfaceC5979h<? super Long, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        for (int iHmvj = hmvj(jArr); iHmvj >= 0; iHmvj--) {
            r2 = operation.invoke(Long.valueOf(jArr[iHmvj]), r2);
        }
        return r2;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final <R> List<R> yxk(int[] iArr, R r2, InterfaceC5979h<? super R, ? super Integer, ? extends R> operation) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (iArr.length == 0) {
            return kotlin.collections.zurt.ld6(r2);
        }
        ArrayList arrayList = new ArrayList(iArr.length + 1);
        arrayList.add(r2);
        for (int i2 : iArr) {
            r2 = operation.invoke(r2, Integer.valueOf(i2));
            arrayList.add(r2);
        }
        return arrayList;
    }

    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final Double yy(@InterfaceC7396q Double[] dArr) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        if (dArr.length == 0) {
            return null;
        }
        double dDoubleValue = dArr[0].doubleValue();
        n5r1 it = new kotlin.ranges.x2(1, gjp(dArr)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, dArr[it.nextInt()].doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @InterfaceC7396q
    public static final List<Boolean> yyel(@InterfaceC7396q boolean[] zArr, @InterfaceC7396q cyoe.x2<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z2 = false;
        for (boolean z3 : zArr) {
            if (z2) {
                arrayList.add(Boolean.valueOf(z3));
            } else if (!predicate.invoke(Boolean.valueOf(z3)).booleanValue()) {
                arrayList.add(Boolean.valueOf(z3));
                z2 = true;
            }
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final <C extends Collection<? super Character>> C yz5(@InterfaceC7396q char[] cArr, @InterfaceC7396q C destination, @InterfaceC7396q cyoe.x2<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (char c2 : cArr) {
            if (predicate.invoke(Character.valueOf(c2)).booleanValue()) {
                destination.add(Character.valueOf(c2));
            }
        }
        return destination;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final Double yza(long[] jArr, cyoe.x2<? super Long, Double> selector) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        double dDoubleValue = selector.invoke(Long.valueOf(jArr[0])).doubleValue();
        n5r1 it = new kotlin.ranges.x2(1, hmvj(jArr)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, selector.invoke(Long.valueOf(jArr[it.nextInt()])).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @kotlin.yz(version = "1.7")
    @InterfaceC6769y(name = "minWithOrThrow")
    public static final short yzg4(@InterfaceC7396q short[] sArr, @InterfaceC7396q Comparator<? super Short> comparator) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        short s2 = sArr[0];
        n5r1 it = new kotlin.ranges.x2(1, orxw(sArr)).iterator();
        while (it.hasNext()) {
            short s3 = sArr[it.nextInt()];
            if (comparator.compare(Short.valueOf(s2), Short.valueOf(s3)) > 0) {
                s2 = s3;
            }
        }
        return s2;
    }

    public static byte yzs4(@InterfaceC7396q byte[] bArr) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        int length = bArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return bArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    @InterfaceC7396q
    public static final <R> List<R> yzy(@InterfaceC7396q boolean[] zArr, @InterfaceC7396q InterfaceC5979h<? super Integer, ? super Boolean, ? extends R> transform) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        ArrayList arrayList = new ArrayList(zArr.length);
        int length = zArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            arrayList.add(transform.invoke(Integer.valueOf(i3), Boolean.valueOf(zArr[i2])));
            i2++;
            i3++;
        }
        return arrayList;
    }

    @InterfaceC6234g
    private static final char z0(char[] cArr) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        return cArr[4];
    }

    @InterfaceC7396q
    public static final <K> List<Byte> z1(@InterfaceC7396q byte[] bArr, @InterfaceC7396q cyoe.x2<? super Byte, ? extends K> selector) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (byte b2 : bArr) {
            if (hashSet.add(selector.invoke(Byte.valueOf(b2)))) {
                arrayList.add(Byte.valueOf(b2));
            }
        }
        return arrayList;
    }

    @kotlin.yz(version = "1.7")
    @InterfaceC6769y(name = "minByOrThrow")
    public static final <T, R extends Comparable<? super R>> T z2(@InterfaceC7396q T[] tArr, @InterfaceC7396q cyoe.x2<? super T, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        T t2 = tArr[0];
        int iGjp = gjp(tArr);
        if (iGjp == 0) {
            return t2;
        }
        R rInvoke = selector.invoke(t2);
        n5r1 it = new kotlin.ranges.x2(1, iGjp).iterator();
        while (it.hasNext()) {
            T t3 = tArr[it.nextInt()];
            R rInvoke2 = selector.invoke(t3);
            if (rInvoke.compareTo(rInvoke2) > 0) {
                t2 = t3;
                rInvoke = rInvoke2;
            }
        }
        return t2;
    }

    @InterfaceC7395n
    public static final Character z3(@InterfaceC7396q char[] cArr, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        if (i2 < 0 || i2 > j59a(cArr)) {
            return null;
        }
        return Character.valueOf(cArr[i2]);
    }

    @InterfaceC7396q
    public static final List<C6227f<Float, Float>> z3a(@InterfaceC7396q float[] fArr, @InterfaceC7396q float[] other) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        int iMin = Math.min(fArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i2 = 0; i2 < iMin; i2++) {
            arrayList.add(kotlin.nmn5.m23230k(Float.valueOf(fArr[i2]), Float.valueOf(other[i2])));
        }
        return arrayList;
    }

    @InterfaceC7395n
    public static final Float z3jl(@InterfaceC7396q float[] fArr) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        return Float.valueOf(fArr[0]);
    }

    @InterfaceC6234g
    private static final <T> T z4jl(T[] tArr, int i2, cyoe.x2<? super Integer, ? extends T> defaultValue) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(defaultValue, "defaultValue");
        return (i2 < 0 || i2 > gjp(tArr)) ? defaultValue.invoke(Integer.valueOf(i2)) : tArr[i2];
    }

    public static final void z4zy(@InterfaceC7396q byte[] bArr, @InterfaceC7396q InterfaceC5979h<? super Integer, ? super Byte, was> action) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(action, "action");
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            action.invoke(Integer.valueOf(i3), Byte.valueOf(bArr[i2]));
            i2++;
            i3++;
        }
    }

    @kotlin.yz(version = "1.7")
    @InterfaceC6769y(name = "maxByOrThrow")
    public static final <R extends Comparable<? super R>> byte z5tq(@InterfaceC7396q byte[] bArr, @InterfaceC7396q cyoe.x2<? super Byte, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        byte b2 = bArr[0];
        int iVl = vl(bArr);
        if (iVl == 0) {
            return b2;
        }
        R rInvoke = selector.invoke(Byte.valueOf(b2));
        n5r1 it = new kotlin.ranges.x2(1, iVl).iterator();
        while (it.hasNext()) {
            byte b3 = bArr[it.nextInt()];
            R rInvoke2 = selector.invoke(Byte.valueOf(b3));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                b2 = b3;
                rInvoke = rInvoke2;
            }
        }
        return b2;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final <R> List<R> z6f(double[] dArr, R r2, InterfaceC5979h<? super R, ? super Double, ? extends R> operation) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (dArr.length == 0) {
            return kotlin.collections.zurt.ld6(r2);
        }
        ArrayList arrayList = new ArrayList(dArr.length + 1);
        arrayList.add(r2);
        for (double d2 : dArr) {
            r2 = operation.invoke(r2, Double.valueOf(d2));
            arrayList.add(r2);
        }
        return arrayList;
    }

    @InterfaceC7395n
    public static final Boolean z7(@InterfaceC7396q boolean[] zArr, @InterfaceC7396q cyoe.x2<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        int length = zArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i2 = length - 1;
            boolean z2 = zArr[length];
            if (predicate.invoke(Boolean.valueOf(z2)).booleanValue()) {
                return Boolean.valueOf(z2);
            }
            if (i2 < 0) {
                return null;
            }
            length = i2;
        }
    }

    @InterfaceC7395n
    public static final Long z75m(@InterfaceC7396q long[] jArr) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        if (jArr.length == 0) {
            return null;
        }
        return Long.valueOf(jArr[0]);
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <T> double z79v(T[] tArr, cyoe.x2<? super T, Double> selector) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(tArr[0]).doubleValue();
        n5r1 it = new kotlin.ranges.x2(1, gjp(tArr)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, selector.invoke(tArr[it.nextInt()]).doubleValue());
        }
        return dDoubleValue;
    }

    @InterfaceC7396q
    public static final <T> String z7zz(@InterfaceC7396q T[] tArr, @InterfaceC7396q CharSequence separator, @InterfaceC7396q CharSequence prefix, @InterfaceC7396q CharSequence postfix, int i2, @InterfaceC7396q CharSequence truncated, @InterfaceC7395n cyoe.x2<? super T, ? extends CharSequence> x2Var) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(separator, "separator");
        kotlin.jvm.internal.d2ok.m23075h(prefix, "prefix");
        kotlin.jvm.internal.d2ok.m23075h(postfix, "postfix");
        kotlin.jvm.internal.d2ok.m23075h(truncated, "truncated");
        String string = ((StringBuilder) anfo(tArr, new StringBuilder(), separator, prefix, postfix, i2, truncated, x2Var)).toString();
        kotlin.jvm.internal.d2ok.kja0(string, "joinTo(StringBuilder(), …ed, transform).toString()");
        return string;
    }

    public static final float z8l(@InterfaceC7396q float[] fArr) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        if (fArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return fArr[0];
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <R> R zac(char[] cArr, Comparator<? super R> comparator, cyoe.x2<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Character.valueOf(cArr[0]));
        n5r1 it = new kotlin.ranges.x2(1, j59a(cArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Character.valueOf(cArr[it.nextInt()]));
            if (comparator.compare(rInvoke, rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final <V, M extends Map<? super Double, ? super V>> M zalf(double[] dArr, M destination, cyoe.x2<? super Double, ? extends V> valueSelector) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(valueSelector, "valueSelector");
        for (double d2 : dArr) {
            destination.put(Double.valueOf(d2), valueSelector.invoke(Double.valueOf(d2)));
        }
        return destination;
    }

    public static boolean zaso(@InterfaceC7396q byte[] bArr) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        return !(bArr.length == 0);
    }

    @InterfaceC6234g
    private static final short zc(short[] sArr) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        return sArr[1];
    }

    public static final <R> R zch(@InterfaceC7396q boolean[] zArr, R r2, @InterfaceC7396q InterfaceC5979h<? super R, ? super Boolean, ? extends R> operation) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        for (boolean z2 : zArr) {
            r2 = operation.invoke(r2, Boolean.valueOf(z2));
        }
        return r2;
    }

    public static final boolean zdb0(@InterfaceC7396q float[] fArr, @InterfaceC7396q cyoe.x2<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (float f2 : fArr) {
            if (predicate.invoke(Float.valueOf(f2)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean zdev(@InterfaceC7396q char[] cArr, @InterfaceC7396q cyoe.x2<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (char c2 : cArr) {
            if (predicate.invoke(Character.valueOf(c2)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @InterfaceC7396q
    public static final <K> Map<K, Float> ze(@InterfaceC7396q float[] fArr, @InterfaceC7396q cyoe.x2<? super Float, ? extends K> keySelector) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.fn3e.fn3e(C6140e.m22479p(fArr.length), 16));
        for (float f2 : fArr) {
            linkedHashMap.put(keySelector.invoke(Float.valueOf(f2)), Float.valueOf(f2));
        }
        return linkedHashMap;
    }

    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final <R extends Comparable<? super R>> Short zg(@InterfaceC7396q short[] sArr, @InterfaceC7396q cyoe.x2<? super Short, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        short s2 = sArr[0];
        int iOrxw = orxw(sArr);
        if (iOrxw == 0) {
            return Short.valueOf(s2);
        }
        R rInvoke = selector.invoke(Short.valueOf(s2));
        n5r1 it = new kotlin.ranges.x2(1, iOrxw).iterator();
        while (it.hasNext()) {
            short s3 = sArr[it.nextInt()];
            R rInvoke2 = selector.invoke(Short.valueOf(s3));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                s2 = s3;
                rInvoke = rInvoke2;
            }
        }
        return Short.valueOf(s2);
    }

    @InterfaceC7396q
    @kotlin.yz(version = "1.4")
    public static final <S, T extends S> List<S> zhll(@InterfaceC7396q T[] tArr, @InterfaceC7396q cyoe.cdj<? super Integer, ? super S, ? super T, ? extends S> operation) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (tArr.length == 0) {
            return kotlin.collections.ni7.a9();
        }
        S sInvoke = (Object) tArr[0];
        ArrayList arrayList = new ArrayList(tArr.length);
        arrayList.add(sInvoke);
        int length = tArr.length;
        for (int i2 = 1; i2 < length; i2++) {
            sInvoke = operation.invoke(Integer.valueOf(i2), sInvoke, (Object) tArr[i2]);
            arrayList.add(sInvoke);
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final List<Float> zht(@InterfaceC7396q float[] fArr) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f2 : fArr) {
            arrayList.add(Float.valueOf(f2));
        }
        return arrayList;
    }

    public static final boolean zi4o(@InterfaceC7396q int[] iArr, @InterfaceC7396q cyoe.x2<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (int i2 : iArr) {
            if (!predicate.invoke(Integer.valueOf(i2)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @InterfaceC7396q
    public static final <K> Map<K, Byte> zidq(@InterfaceC7396q byte[] bArr, @InterfaceC7396q cyoe.x2<? super Byte, ? extends K> keySelector) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.fn3e.fn3e(C6140e.m22479p(bArr.length), 16));
        for (byte b2 : bArr) {
            linkedHashMap.put(keySelector.invoke(Byte.valueOf(b2)), Byte.valueOf(b2));
        }
        return linkedHashMap;
    }

    public static final int zio(@InterfaceC7396q double[] dArr, @InterfaceC7396q cyoe.x2<? super Double, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        int length = dArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (predicate.invoke(Double.valueOf(dArr[length])).booleanValue()) {
                    return length;
                }
                if (i2 < 0) {
                    break;
                }
                length = i2;
            }
        }
        return -1;
    }

    public static final boolean ziq(@InterfaceC7396q short[] sArr, @InterfaceC7396q cyoe.x2<? super Short, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (short s2 : sArr) {
            if (predicate.invoke(Short.valueOf(s2)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @InterfaceC6234g
    private static final <T> T zj(T[] tArr, int i2, cyoe.x2<? super Integer, ? extends T> defaultValue) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(defaultValue, "defaultValue");
        return (i2 < 0 || i2 > gjp(tArr)) ? defaultValue.invoke(Integer.valueOf(i2)) : tArr[i2];
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @kotlin.hyr
    @InterfaceC6234g
    @kotlin.yz(version = "1.5")
    @InterfaceC6769y(name = "sumOfULong")
    private static final long zj2n(float[] fArr, cyoe.x2<? super Float, ikck> selector) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        long jLd6 = ikck.ld6(0L);
        for (float f2 : fArr) {
            jLd6 = ikck.ld6(jLd6 + selector.invoke(Float.valueOf(f2)).a98o());
        }
        return jLd6;
    }

    @InterfaceC7396q
    @kotlin.yz(version = "1.7")
    @InterfaceC6769y(name = "maxOrThrow")
    public static final <T extends Comparable<? super T>> T zjr(@InterfaceC7396q T[] tArr) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        T t2 = tArr[0];
        n5r1 it = new kotlin.ranges.x2(1, gjp(tArr)).iterator();
        while (it.hasNext()) {
            T t3 = tArr[it.nextInt()];
            if (t2.compareTo(t3) < 0) {
                t2 = t3;
            }
        }
        return t2;
    }

    @kotlin.yz(version = "1.4")
    public static final void zjv(@InterfaceC7396q boolean[] zArr, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.collections.zy.Companion.m22683q(i2, i3, zArr.length);
        int i4 = (i2 + i3) / 2;
        if (i2 == i4) {
            return;
        }
        int i5 = i3 - 1;
        while (i2 < i4) {
            boolean z2 = zArr[i2];
            zArr[i2] = zArr[i5];
            zArr[i5] = z2;
            i5--;
            i2++;
        }
    }

    @kotlin.hyr
    @InterfaceC7396q
    @kotlin.yz(version = "1.4")
    @InterfaceC6769y(name = "flatMapSequenceTo")
    public static final <T, R, C extends Collection<? super R>> C zkf2(@InterfaceC7396q T[] tArr, @InterfaceC7396q C destination, @InterfaceC7396q cyoe.x2<? super T, ? extends kotlin.sequences.qrj<? extends R>> transform) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        for (T t2 : tArr) {
            C6163t.m22610x(destination, transform.invoke(t2));
        }
        return destination;
    }

    @InterfaceC7396q
    public static final List<Character> zky5(@InterfaceC7396q char[] cArr, @InterfaceC7396q kotlin.ranges.x2 indices) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(indices, "indices");
        return indices.isEmpty() ? kotlin.collections.ni7.a9() : kotlin.collections.kja0.kja0(kotlin.collections.kja0.bz2(cArr, indices.mo2951k().intValue(), indices.zy().intValue() + 1));
    }

    @InterfaceC7396q
    public static final List<Integer> zlf(@InterfaceC7396q int[] iArr, @InterfaceC7396q cyoe.x2<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (int i2 : iArr) {
            if (predicate.invoke(Integer.valueOf(i2)).booleanValue()) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        return arrayList;
    }

    @InterfaceC6234g
    private static final Character zlo(char[] cArr, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        return z3(cArr, i2);
    }

    @InterfaceC7396q
    public static final List<C6227f<Short, Short>> zmmu(@InterfaceC7396q short[] sArr, @InterfaceC7396q short[] other) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        int iMin = Math.min(sArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i2 = 0; i2 < iMin; i2++) {
            arrayList.add(kotlin.nmn5.m23230k(Short.valueOf(sArr[i2]), Short.valueOf(other[i2])));
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final <A extends Appendable> A zn(@InterfaceC7396q long[] jArr, @InterfaceC7396q A buffer, @InterfaceC7396q CharSequence separator, @InterfaceC7396q CharSequence prefix, @InterfaceC7396q CharSequence postfix, int i2, @InterfaceC7396q CharSequence truncated, @InterfaceC7395n cyoe.x2<? super Long, ? extends CharSequence> x2Var) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(buffer, "buffer");
        kotlin.jvm.internal.d2ok.m23075h(separator, "separator");
        kotlin.jvm.internal.d2ok.m23075h(prefix, "prefix");
        kotlin.jvm.internal.d2ok.m23075h(postfix, "postfix");
        kotlin.jvm.internal.d2ok.m23075h(truncated, "truncated");
        buffer.append(prefix);
        int i3 = 0;
        for (long j2 : jArr) {
            i3++;
            if (i3 > 1) {
                buffer.append(separator);
            }
            if (i2 >= 0 && i3 > i2) {
                break;
            }
            if (x2Var != null) {
                buffer.append(x2Var.invoke(Long.valueOf(j2)));
            } else {
                buffer.append(String.valueOf(j2));
            }
        }
        if (i2 >= 0 && i3 > i2) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final Integer zne(@InterfaceC7396q int[] iArr, @InterfaceC7396q Comparator<? super Integer> comparator) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        if (iArr.length == 0) {
            return null;
        }
        int i2 = iArr[0];
        n5r1 it = new kotlin.ranges.x2(1, srpc(iArr)).iterator();
        while (it.hasNext()) {
            int i3 = iArr[it.nextInt()];
            if (comparator.compare(Integer.valueOf(i2), Integer.valueOf(i3)) < 0) {
                i2 = i3;
            }
        }
        return Integer.valueOf(i2);
    }

    @InterfaceC7396q
    public static final <R extends Comparable<? super R>> List<Byte> zogz(@InterfaceC7396q byte[] bArr, @InterfaceC7396q cyoe.x2<? super Byte, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        return fzr(bArr, new f7l8.zy(selector));
    }

    public static final int zq(@InterfaceC7396q boolean[] zArr, boolean z2) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        int length = zArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (z2 == zArr[length]) {
                    return length;
                }
                if (i2 < 0) {
                    break;
                }
                length = i2;
            }
        }
        return -1;
    }

    @kotlin.hyr
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @InterfaceC6769y(name = "sumOfLong")
    private static final long zqoj(float[] fArr, cyoe.x2<? super Float, Long> selector) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        long jLongValue = 0;
        for (float f2 : fArr) {
            jLongValue += selector.invoke(Float.valueOf(f2)).longValue();
        }
        return jLongValue;
    }

    @InterfaceC7396q
    public static final List<Long> zr(@InterfaceC7396q long[] jArr) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        int length = jArr.length;
        return length != 0 ? length != 1 ? mug(jArr) : kotlin.collections.zurt.ld6(Long.valueOf(jArr[0])) : kotlin.collections.ni7.a9();
    }

    public static final int zrx(@InterfaceC7396q boolean[] zArr, @InterfaceC7396q cyoe.x2<? super Boolean, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        int length = zArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (predicate.invoke(Boolean.valueOf(zArr[length])).booleanValue()) {
                    return length;
                }
                if (i2 < 0) {
                    break;
                }
                length = i2;
            }
        }
        return -1;
    }

    public static final <R> R zry(@InterfaceC7396q long[] jArr, R r2, @InterfaceC7396q cyoe.cdj<? super Integer, ? super R, ? super Long, ? extends R> operation) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        int length = jArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            r2 = operation.invoke(Integer.valueOf(i3), r2, Long.valueOf(jArr[i2]));
            i2++;
            i3++;
        }
        return r2;
    }

    @InterfaceC7396q
    public static final byte[] zs(@InterfaceC7396q Byte[] bArr) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            bArr2[i2] = bArr[i2].byteValue();
        }
        return bArr2;
    }

    @InterfaceC7396q
    public static final <R, C extends Collection<? super R>> C zsm2(@InterfaceC7396q byte[] bArr, @InterfaceC7396q C destination, @InterfaceC7396q cyoe.x2<? super Byte, ? extends R> transform) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        for (byte b2 : bArr) {
            destination.add(transform.invoke(Byte.valueOf(b2)));
        }
        return destination;
    }

    @InterfaceC7396q
    public static final <K, M extends Map<? super K, List<Boolean>>> M ztlo(@InterfaceC7396q boolean[] zArr, @InterfaceC7396q M destination, @InterfaceC7396q cyoe.x2<? super Boolean, ? extends K> keySelector) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(keySelector, "keySelector");
        for (boolean z2 : zArr) {
            K kInvoke = keySelector.invoke(Boolean.valueOf(z2));
            Object arrayList = destination.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(Boolean.valueOf(z2));
        }
        return destination;
    }

    @InterfaceC6234g
    private static final int zuh(byte[] bArr) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        return bArr.length;
    }

    public static final void zuk(@InterfaceC7396q char[] cArr, @InterfaceC7396q cyoe.x2<? super Character, was> action) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(action, "action");
        for (char c2 : cArr) {
            action.invoke(Character.valueOf(c2));
        }
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final <R> List<R> zvd4(byte[] bArr, R r2, cyoe.cdj<? super Integer, ? super R, ? super Byte, ? extends R> operation) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (bArr.length == 0) {
            return kotlin.collections.zurt.ld6(r2);
        }
        ArrayList arrayList = new ArrayList(bArr.length + 1);
        arrayList.add(r2);
        int length = bArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            r2 = operation.invoke(Integer.valueOf(i2), r2, Byte.valueOf(bArr[i2]));
            arrayList.add(r2);
        }
        return arrayList;
    }

    public static final void zvz(@InterfaceC7396q double[] dArr) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        int length = (dArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int iF14 = f14(dArr);
        n5r1 it = new kotlin.ranges.x2(0, length).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            double d2 = dArr[iNextInt];
            dArr[iNextInt] = dArr[iF14];
            dArr[iF14] = d2;
            iF14--;
        }
    }

    @InterfaceC7396q
    public static final <R> List<R> zwh(@InterfaceC7396q int[] iArr, @InterfaceC7396q cyoe.x2<? super Integer, ? extends R> transform) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i2 : iArr) {
            arrayList.add(transform.invoke(Integer.valueOf(i2)));
        }
        return arrayList;
    }

    @InterfaceC7395n
    public static final Double zx(@InterfaceC7396q double[] dArr, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        if (i2 < 0 || i2 > f14(dArr)) {
            return null;
        }
        return Double.valueOf(dArr[i2]);
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <R> R zx6(char[] cArr, Comparator<? super R> comparator, cyoe.x2<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Character.valueOf(cArr[0]));
        n5r1 it = new kotlin.ranges.x2(1, j59a(cArr)).iterator();
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(Character.valueOf(cArr[it.nextInt()]));
            if (comparator.compare(rInvoke, rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    public static boolean zxa9(@InterfaceC7396q short[] sArr) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        return !(sArr.length == 0);
    }

    @InterfaceC7396q
    public static final <C extends Collection<? super Character>> C zxe(@InterfaceC7396q char[] cArr, @InterfaceC7396q C destination, @InterfaceC7396q cyoe.x2<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (char c2 : cArr) {
            if (!predicate.invoke(Character.valueOf(c2)).booleanValue()) {
                destination.add(Character.valueOf(c2));
            }
        }
        return destination;
    }

    @kotlin.hyr
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @InterfaceC6769y(name = "sumOfLong")
    private static final long zz(int[] iArr, cyoe.x2<? super Integer, Long> selector) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        long jLongValue = 0;
        for (int i2 : iArr) {
            jLongValue += selector.invoke(Integer.valueOf(i2)).longValue();
        }
        return jLongValue;
    }

    @InterfaceC7396q
    public static final <R> List<C6227f<Integer, R>> zzoo(@InterfaceC7396q int[] iArr, @InterfaceC7396q Iterable<? extends R> other) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        int length = iArr.length;
        ArrayList arrayList = new ArrayList(Math.min(kotlin.collections.fu4.vyq(other, 10), length));
        int i2 = 0;
        for (R r2 : other) {
            if (i2 >= length) {
                break;
            }
            arrayList.add(kotlin.nmn5.m23230k(Integer.valueOf(iArr[i2]), r2));
            i2++;
        }
        return arrayList;
    }
}
