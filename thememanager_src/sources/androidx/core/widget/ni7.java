package androidx.core.widget;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import com.google.android.exoplayer2.text.ttml.C3678q;
import kotlin.d3;
import kotlin.jvm.internal.AbstractC6308r;
import kotlin.jvm.internal.d2ok;
import kotlin.was;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: compiled from: TextView.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001as\u0010\r\u001a\u00020\f*\u00020\u00002d\b\u0004\u0010\u000b\u001a^\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0001H\u0086\b\u001as\u0010\u000e\u001a\u00020\f*\u00020\u00002d\b\u0004\u0010\u000b\u001a^\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0001H\u0086\b\u001a4\u0010\u0011\u001a\u00020\f*\u00020\u00002%\b\u0004\u0010\u000b\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0010¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\n0\u000fH\u0086\b\u001a\u0080\u0002\u0010\u0015\u001a\u00020\f*\u00020\u00002d\b\u0006\u0010\u0012\u001a^\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u00012d\b\u0006\u0010\u0013\u001a^\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u00012%\b\u0006\u0010\u0014\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0010¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\n0\u000fH\u0086\b¨\u0006\u0016"}, d2 = {"Landroid/widget/TextView;", "Lkotlin/Function4;", "", "Lkotlin/c;", "name", "text", "", "start", "count", C3678q.f22046o, "Lkotlin/was;", "action", "Landroid/text/TextWatcher;", "q", "n", "Lkotlin/Function1;", "Landroid/text/Editable;", "zy", "beforeTextChanged", "onTextChanged", "afterTextChanged", "k", "core-ktx_release"}, m22787k = 2, mv = {1, 4, 0})
public final class ni7 {

    /* JADX INFO: compiled from: TextView.kt */
    @d3(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J*\u0010\f\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0016J*\u0010\u000e\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¨\u0006\u000f¸\u0006\u0000"}, d2 = {"androidx/core/widget/ni7$q", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", C7704k.y.toq.f44691k, "Lkotlin/was;", "afterTextChanged", "L;", "text", "", "start", "count", "kotlin/Int", "beforeTextChanged", C3678q.f22043j, "onTextChanged", "core-ktx_release"}, m22787k = 1, mv = {1, 4, 0})
    public static final class f7l8 implements TextWatcher {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ cyoe.ki f4286k;

        public f7l8(cyoe.ki kiVar) {
            this.f4286k = kiVar;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@InterfaceC7395n Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@InterfaceC7395n CharSequence charSequence, int i2, int i3, int i4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@InterfaceC7395n CharSequence charSequence, int i2, int i3, int i4) {
            this.f4286k.invoke(charSequence, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
        }
    }

    /* JADX INFO: renamed from: androidx.core.widget.ni7$g */
    /* JADX INFO: compiled from: TextView.kt */
    @d3(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J*\u0010\f\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0016J*\u0010\u000e\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¨\u0006\u000f¸\u0006\u0000"}, d2 = {"androidx/core/widget/ni7$q", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", C7704k.y.toq.f44691k, "Lkotlin/was;", "afterTextChanged", "L;", "text", "", "start", "count", "kotlin/Int", "beforeTextChanged", C3678q.f22043j, "onTextChanged", "core-ktx_release"}, m22787k = 1, mv = {1, 4, 0})
    public static final class C0755g implements TextWatcher {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ cyoe.ki f4287k;

        public C0755g(cyoe.ki kiVar) {
            this.f4287k = kiVar;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@InterfaceC7395n Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@InterfaceC7395n CharSequence charSequence, int i2, int i3, int i4) {
            this.f4287k.invoke(charSequence, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@InterfaceC7395n CharSequence charSequence, int i2, int i3, int i4) {
        }
    }

    /* JADX INFO: renamed from: androidx.core.widget.ni7$k */
    /* JADX INFO: compiled from: TextView.kt */
    @d3(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "<anonymous parameter 2>", "<anonymous parameter 3>", "Lkotlin/was;", "invoke", "(Ljava/lang/CharSequence;III)V", "<anonymous>"}, m22787k = 3, mv = {1, 4, 0})
    public static final class C0756k extends AbstractC6308r implements cyoe.ki<CharSequence, Integer, Integer, Integer, was> {
        public static final C0756k INSTANCE = new C0756k();

        public C0756k() {
            super(4);
        }

        @Override // cyoe.ki
        public /* bridge */ /* synthetic */ was invoke(CharSequence charSequence, Integer num, Integer num2, Integer num3) {
            invoke(charSequence, num.intValue(), num2.intValue(), num3.intValue());
            return was.f36763k;
        }

        public final void invoke(@InterfaceC7395n CharSequence charSequence, int i2, int i3, int i4) {
        }
    }

    /* JADX INFO: renamed from: androidx.core.widget.ni7$n */
    /* JADX INFO: compiled from: TextView.kt */
    @d3(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J*\u0010\f\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0016J*\u0010\u000e\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¨\u0006\u000f¸\u0006\u0000"}, d2 = {"androidx/core/widget/ni7$q", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", C7704k.y.toq.f44691k, "Lkotlin/was;", "afterTextChanged", "L;", "text", "", "start", "count", "kotlin/Int", "beforeTextChanged", C3678q.f22043j, "onTextChanged", "core-ktx_release"}, m22787k = 1, mv = {1, 4, 0})
    public static final class C0757n implements TextWatcher {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ cyoe.x2 f4288k;

        public C0757n(cyoe.x2 x2Var) {
            this.f4288k = x2Var;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@InterfaceC7395n Editable editable) {
            this.f4288k.invoke(editable);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@InterfaceC7395n CharSequence charSequence, int i2, int i3, int i4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@InterfaceC7395n CharSequence charSequence, int i2, int i3, int i4) {
        }
    }

    /* JADX INFO: renamed from: androidx.core.widget.ni7$q */
    /* JADX INFO: compiled from: TextView.kt */
    @d3(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J*\u0010\f\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0016J*\u0010\u000e\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¨\u0006\u000f"}, d2 = {"androidx/core/widget/ni7$q", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", C7704k.y.toq.f44691k, "Lkotlin/was;", "afterTextChanged", "", "text", "", "start", "count", C3678q.f22046o, "beforeTextChanged", C3678q.f22043j, "onTextChanged", "core-ktx_release"}, m22787k = 1, mv = {1, 4, 0})
    public static final class C0758q implements TextWatcher {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ cyoe.x2 f4289k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ cyoe.ki f4290n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ cyoe.ki f4291q;

        public C0758q(cyoe.x2 x2Var, cyoe.ki kiVar, cyoe.ki kiVar2) {
            this.f4289k = x2Var;
            this.f4291q = kiVar;
            this.f4290n = kiVar2;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@InterfaceC7395n Editable editable) {
            this.f4289k.invoke(editable);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@InterfaceC7395n CharSequence charSequence, int i2, int i3, int i4) {
            this.f4291q.invoke(charSequence, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@InterfaceC7395n CharSequence charSequence, int i2, int i3, int i4) {
            this.f4290n.invoke(charSequence, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
        }
    }

    /* JADX INFO: compiled from: TextView.kt */
    @d3(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "<anonymous parameter 2>", "<anonymous parameter 3>", "Lkotlin/was;", "invoke", "(Ljava/lang/CharSequence;III)V", "<anonymous>"}, m22787k = 3, mv = {1, 4, 0})
    public static final class toq extends AbstractC6308r implements cyoe.ki<CharSequence, Integer, Integer, Integer, was> {
        public static final toq INSTANCE = new toq();

        public toq() {
            super(4);
        }

        @Override // cyoe.ki
        public /* bridge */ /* synthetic */ was invoke(CharSequence charSequence, Integer num, Integer num2, Integer num3) {
            invoke(charSequence, num.intValue(), num2.intValue(), num3.intValue());
            return was.f36763k;
        }

        public final void invoke(@InterfaceC7395n CharSequence charSequence, int i2, int i3, int i4) {
        }
    }

    /* JADX INFO: compiled from: TextView.kt */
    @d3(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/text/Editable;", "it", "Lkotlin/was;", "invoke", "(Landroid/text/Editable;)V", "<anonymous>"}, m22787k = 3, mv = {1, 4, 0})
    public static final class zy extends AbstractC6308r implements cyoe.x2<Editable, was> {
        public static final zy INSTANCE = new zy();

        public zy() {
            super(1);
        }

        @Override // cyoe.x2
        public /* bridge */ /* synthetic */ was invoke(Editable editable) {
            invoke2(editable);
            return was.f36763k;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@InterfaceC7395n Editable editable) {
        }
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public static final TextWatcher m3659k(@InterfaceC7396q TextView addTextChangedListener, @InterfaceC7396q cyoe.ki<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, was> beforeTextChanged, @InterfaceC7396q cyoe.ki<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, was> onTextChanged, @InterfaceC7396q cyoe.x2<? super Editable, was> afterTextChanged) {
        d2ok.cdj(addTextChangedListener, "$this$addTextChangedListener");
        d2ok.cdj(beforeTextChanged, "beforeTextChanged");
        d2ok.cdj(onTextChanged, "onTextChanged");
        d2ok.cdj(afterTextChanged, "afterTextChanged");
        C0758q c0758q = new C0758q(afterTextChanged, beforeTextChanged, onTextChanged);
        addTextChangedListener.addTextChangedListener(c0758q);
        return c0758q;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: n */
    public static final TextWatcher m3660n(@InterfaceC7396q TextView doOnTextChanged, @InterfaceC7396q cyoe.ki<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, was> action) {
        d2ok.cdj(doOnTextChanged, "$this$doOnTextChanged");
        d2ok.cdj(action, "action");
        f7l8 f7l8Var = new f7l8(action);
        doOnTextChanged.addTextChangedListener(f7l8Var);
        return f7l8Var;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: q */
    public static final TextWatcher m3661q(@InterfaceC7396q TextView doBeforeTextChanged, @InterfaceC7396q cyoe.ki<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, was> action) {
        d2ok.cdj(doBeforeTextChanged, "$this$doBeforeTextChanged");
        d2ok.cdj(action, "action");
        C0755g c0755g = new C0755g(action);
        doBeforeTextChanged.addTextChangedListener(c0755g);
        return c0755g;
    }

    public static /* synthetic */ TextWatcher toq(TextView addTextChangedListener, cyoe.ki beforeTextChanged, cyoe.ki onTextChanged, cyoe.x2 afterTextChanged, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            beforeTextChanged = C0756k.INSTANCE;
        }
        if ((i2 & 2) != 0) {
            onTextChanged = toq.INSTANCE;
        }
        if ((i2 & 4) != 0) {
            afterTextChanged = zy.INSTANCE;
        }
        d2ok.cdj(addTextChangedListener, "$this$addTextChangedListener");
        d2ok.cdj(beforeTextChanged, "beforeTextChanged");
        d2ok.cdj(onTextChanged, "onTextChanged");
        d2ok.cdj(afterTextChanged, "afterTextChanged");
        C0758q c0758q = new C0758q(afterTextChanged, beforeTextChanged, onTextChanged);
        addTextChangedListener.addTextChangedListener(c0758q);
        return c0758q;
    }

    @InterfaceC7396q
    public static final TextWatcher zy(@InterfaceC7396q TextView doAfterTextChanged, @InterfaceC7396q cyoe.x2<? super Editable, was> action) {
        d2ok.cdj(doAfterTextChanged, "$this$doAfterTextChanged");
        d2ok.cdj(action, "action");
        C0757n c0757n = new C0757n(action);
        doAfterTextChanged.addTextChangedListener(c0757n);
        return c0757n;
    }
}
