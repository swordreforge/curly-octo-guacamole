package kiv;

import kotlin.enums.InterfaceC6225k;
import kotlin.yz;
import mub.InterfaceC7396q;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Annotations.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class toq {

    /* JADX INFO: renamed from: k */
    private static final /* synthetic */ toq[] f36093k;

    /* JADX INFO: renamed from: q */
    private static final /* synthetic */ InterfaceC6225k f36094q;
    public static final toq CLASS = new toq("CLASS", 0);
    public static final toq ANNOTATION_CLASS = new toq("ANNOTATION_CLASS", 1);
    public static final toq TYPE_PARAMETER = new toq("TYPE_PARAMETER", 2);
    public static final toq PROPERTY = new toq("PROPERTY", 3);
    public static final toq FIELD = new toq("FIELD", 4);
    public static final toq LOCAL_VARIABLE = new toq("LOCAL_VARIABLE", 5);
    public static final toq VALUE_PARAMETER = new toq("VALUE_PARAMETER", 6);
    public static final toq CONSTRUCTOR = new toq("CONSTRUCTOR", 7);
    public static final toq FUNCTION = new toq("FUNCTION", 8);
    public static final toq PROPERTY_GETTER = new toq("PROPERTY_GETTER", 9);
    public static final toq PROPERTY_SETTER = new toq("PROPERTY_SETTER", 10);
    public static final toq TYPE = new toq("TYPE", 11);
    public static final toq EXPRESSION = new toq("EXPRESSION", 12);
    public static final toq FILE = new toq("FILE", 13);

    @yz(version = "1.1")
    public static final toq TYPEALIAS = new toq("TYPEALIAS", 14);

    static {
        toq[] qVar = toq();
        f36093k = qVar;
        f36094q = kotlin.enums.toq.toq(qVar);
    }

    private toq(String str, int i2) {
    }

    @InterfaceC7396q
    public static InterfaceC6225k<toq> getEntries() {
        return f36094q;
    }

    private static final /* synthetic */ toq[] toq() {
        return new toq[]{CLASS, ANNOTATION_CLASS, TYPE_PARAMETER, PROPERTY, FIELD, LOCAL_VARIABLE, VALUE_PARAMETER, CONSTRUCTOR, FUNCTION, PROPERTY_GETTER, PROPERTY_SETTER, TYPE, EXPRESSION, FILE, TYPEALIAS};
    }

    public static toq valueOf(String str) {
        return (toq) Enum.valueOf(toq.class, str);
    }

    public static toq[] values() {
        return (toq[]) f36093k.clone();
    }
}
