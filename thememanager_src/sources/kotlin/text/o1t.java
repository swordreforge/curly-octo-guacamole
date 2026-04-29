package kotlin.text;

import java.util.Set;
import kotlin.internal.InterfaceC6234g;

/* JADX INFO: compiled from: RegexExtensions.kt */
/* JADX INFO: loaded from: classes3.dex */
class o1t extends C6459z {
    @InterfaceC6234g
    private static final ki fn3e(String str, Set<? extends EnumC6440i> options) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(options, "options");
        return new ki(str, options);
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: i */
    private static final ki m23586i(String str) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        return new ki(str);
    }

    @InterfaceC6234g
    private static final ki zurt(String str, EnumC6440i option) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(option, "option");
        return new ki(str, option);
    }
}
