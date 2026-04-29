package kotlin.text;

import l05.InterfaceC6765n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: StringNumberConversionsJVM.kt */
/* JADX INFO: loaded from: classes3.dex */
final class fn3e {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final fn3e f36680k = new fn3e();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    @InterfaceC6765n
    public static final ki f81919toq;

    static {
        String str = "[eE][+-]?(\\p{Digit}+)";
        f81919toq = new ki("[\\x00-\\x20]*[+-]?(NaN|Infinity|((" + ("((\\p{Digit}+)(\\.)?((\\p{Digit}+)?)(" + str + ")?)|(\\.((\\p{Digit}+))(" + str + ")?)|((" + ("(0[xX](\\p{XDigit}+)(\\.)?)|(0[xX](\\p{XDigit}+)?(\\.)(\\p{XDigit}+))") + ")[pP][+-]?(\\p{Digit}+))") + ")[fFdD]?))[\\x00-\\x20]*");
    }

    private fn3e() {
    }
}
