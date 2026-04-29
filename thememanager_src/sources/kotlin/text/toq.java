package kotlin.text;

import cyoe.InterfaceC5981k;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.C6140e;
import kotlin.enums.InterfaceC6225k;
import kotlin.jvm.internal.AbstractC6308r;
import kotlin.jvm.internal.lv5;
import mub.InterfaceC7396q;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: CharDirectionality.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class toq {

    @InterfaceC7396q
    public static final C8063toq Companion;

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private static final kotlin.jk<Map<Integer, toq>> f36718k;

    /* JADX INFO: renamed from: n */
    private static final /* synthetic */ InterfaceC6225k f36719n;

    /* JADX INFO: renamed from: q */
    private static final /* synthetic */ toq[] f36720q;
    private final int value;
    public static final toq UNDEFINED = new toq("UNDEFINED", 0, -1);
    public static final toq LEFT_TO_RIGHT = new toq("LEFT_TO_RIGHT", 1, 0);
    public static final toq RIGHT_TO_LEFT = new toq("RIGHT_TO_LEFT", 2, 1);
    public static final toq RIGHT_TO_LEFT_ARABIC = new toq("RIGHT_TO_LEFT_ARABIC", 3, 2);
    public static final toq EUROPEAN_NUMBER = new toq("EUROPEAN_NUMBER", 4, 3);
    public static final toq EUROPEAN_NUMBER_SEPARATOR = new toq("EUROPEAN_NUMBER_SEPARATOR", 5, 4);
    public static final toq EUROPEAN_NUMBER_TERMINATOR = new toq("EUROPEAN_NUMBER_TERMINATOR", 6, 5);
    public static final toq ARABIC_NUMBER = new toq("ARABIC_NUMBER", 7, 6);
    public static final toq COMMON_NUMBER_SEPARATOR = new toq("COMMON_NUMBER_SEPARATOR", 8, 7);
    public static final toq NONSPACING_MARK = new toq("NONSPACING_MARK", 9, 8);
    public static final toq BOUNDARY_NEUTRAL = new toq("BOUNDARY_NEUTRAL", 10, 9);
    public static final toq PARAGRAPH_SEPARATOR = new toq("PARAGRAPH_SEPARATOR", 11, 10);
    public static final toq SEGMENT_SEPARATOR = new toq("SEGMENT_SEPARATOR", 12, 11);
    public static final toq WHITESPACE = new toq("WHITESPACE", 13, 12);
    public static final toq OTHER_NEUTRALS = new toq("OTHER_NEUTRALS", 14, 13);
    public static final toq LEFT_TO_RIGHT_EMBEDDING = new toq("LEFT_TO_RIGHT_EMBEDDING", 15, 14);
    public static final toq LEFT_TO_RIGHT_OVERRIDE = new toq("LEFT_TO_RIGHT_OVERRIDE", 16, 15);
    public static final toq RIGHT_TO_LEFT_EMBEDDING = new toq("RIGHT_TO_LEFT_EMBEDDING", 17, 16);
    public static final toq RIGHT_TO_LEFT_OVERRIDE = new toq("RIGHT_TO_LEFT_OVERRIDE", 18, 17);
    public static final toq POP_DIRECTIONAL_FORMAT = new toq("POP_DIRECTIONAL_FORMAT", 19, 18);

    /* JADX INFO: renamed from: kotlin.text.toq$k */
    /* JADX INFO: compiled from: CharDirectionality.kt */
    @lv5({"SMAP\nCharDirectionality.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CharDirectionality.kt\nkotlin/text/CharDirectionality$Companion$directionalityMap$2\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,123:1\n8541#2,2:124\n8801#2,4:126\n*S KotlinDebug\n*F\n+ 1 CharDirectionality.kt\nkotlin/text/CharDirectionality$Companion$directionalityMap$2\n*L\n118#1:124,2\n118#1:126,4\n*E\n"})
    static final class C6457k extends AbstractC6308r implements InterfaceC5981k<Map<Integer, ? extends toq>> {
        public static final C6457k INSTANCE = new C6457k();

        C6457k() {
            super(0);
        }

        @Override // cyoe.InterfaceC5981k
        @InterfaceC7396q
        public final Map<Integer, ? extends toq> invoke() {
            toq[] toqVarArrValues = toq.values();
            LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.fn3e.fn3e(C6140e.m22479p(toqVarArrValues.length), 16));
            for (toq toqVar : toqVarArrValues) {
                linkedHashMap.put(Integer.valueOf(toqVar.getValue()), toqVar);
            }
            return linkedHashMap;
        }
    }

    /* JADX INFO: renamed from: kotlin.text.toq$toq, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CharDirectionality.kt */
    public static final class C8063toq {
        private C8063toq() {
        }

        public /* synthetic */ C8063toq(kotlin.jvm.internal.ni7 ni7Var) {
            this();
        }

        /* JADX INFO: renamed from: k */
        private final Map<Integer, toq> m23628k() {
            return (Map) toq.f36718k.getValue();
        }

        @InterfaceC7396q
        public final toq toq(int i2) {
            toq toqVar = m23628k().get(Integer.valueOf(i2));
            if (toqVar != null) {
                return toqVar;
            }
            throw new IllegalArgumentException("Directionality #" + i2 + " is not defined.");
        }
    }

    static {
        toq[] qVar = toq();
        f36720q = qVar;
        Companion = new C8063toq(null);
        f36718k = kotlin.fti.m22825k(C6457k.INSTANCE);
        f36719n = kotlin.enums.toq.toq(qVar);
    }

    private toq(String str, int i2, int i3) {
        this.value = i3;
    }

    @InterfaceC7396q
    public static InterfaceC6225k<toq> getEntries() {
        return f36719n;
    }

    private static final /* synthetic */ toq[] toq() {
        return new toq[]{UNDEFINED, LEFT_TO_RIGHT, RIGHT_TO_LEFT, RIGHT_TO_LEFT_ARABIC, EUROPEAN_NUMBER, EUROPEAN_NUMBER_SEPARATOR, EUROPEAN_NUMBER_TERMINATOR, ARABIC_NUMBER, COMMON_NUMBER_SEPARATOR, NONSPACING_MARK, BOUNDARY_NEUTRAL, PARAGRAPH_SEPARATOR, SEGMENT_SEPARATOR, WHITESPACE, OTHER_NEUTRALS, LEFT_TO_RIGHT_EMBEDDING, LEFT_TO_RIGHT_OVERRIDE, RIGHT_TO_LEFT_EMBEDDING, RIGHT_TO_LEFT_OVERRIDE, POP_DIRECTIONAL_FORMAT};
    }

    public static toq valueOf(String str) {
        return (toq) Enum.valueOf(toq.class, str);
    }

    public static toq[] values() {
        return (toq[]) f36720q.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
