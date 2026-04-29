package androidx.core.text;

import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.UnderlineSpan;
import com.google.android.exoplayer2.text.ttml.C3678q;
import com.miui.maml.folme.AnimatedProperty;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import kotlin.was;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: renamed from: androidx.core.text.y */
/* JADX INFO: compiled from: SpannableStringBuilder.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\u001a\"\u0010\u0006\u001a\u00020\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\b\u001aA\u0010\n\u001a\u00020\u0001*\u00020\u00012\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\b2\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\b¢\u0006\u0004\b\n\u0010\u000b\u001a.\u0010\r\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\f\u001a\u00020\b2\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\b\u001a&\u0010\u000e\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\b\u001a&\u0010\u000f\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\b\u001a&\u0010\u0010\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\b\u001a0\u0010\u0013\u001a\u00020\u0001*\u00020\u00012\b\b\u0001\u0010\u0012\u001a\u00020\u00112\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\b\u001a0\u0010\u0014\u001a\u00020\u0001*\u00020\u00012\b\b\u0001\u0010\u0012\u001a\u00020\u00112\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\b\u001a&\u0010\u0015\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\b\u001a.\u0010\u0018\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00162\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\b\u001a&\u0010\u0019\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\b\u001a&\u0010\u001a\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\b¨\u0006\u001b"}, d2 = {"Lkotlin/Function1;", "Landroid/text/SpannableStringBuilder;", "Lkotlin/was;", "Lkotlin/fn3e;", "builderAction", "Landroid/text/SpannedString;", "zy", "", "", "spans", C7704k.y.toq.f95579toq, "(Landroid/text/SpannableStringBuilder;[Ljava/lang/Object;Lcyoe/x2;)Landroid/text/SpannableStringBuilder;", C3678q.f65840t8r, "n", "toq", "f7l8", "x2", "", "color", "q", "k", C7704k.y.toq.f44691k, "", "proportion", AnimatedProperty.PROPERTY_NAME_Y, "ld6", "p", "core-ktx_release"}, m22787k = 2, mv = {1, 4, 0})
public final class C0628y {
    @InterfaceC7396q
    public static final SpannableStringBuilder f7l8(@InterfaceC7396q SpannableStringBuilder italic, @InterfaceC7396q cyoe.x2<? super SpannableStringBuilder, was> builderAction) {
        d2ok.cdj(italic, "$this$italic");
        d2ok.cdj(builderAction, "builderAction");
        StyleSpan styleSpan = new StyleSpan(2);
        int length = italic.length();
        builderAction.invoke(italic);
        italic.setSpan(styleSpan, length, italic.length(), 17);
        return italic;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: g */
    public static final SpannableStringBuilder m2908g(@InterfaceC7396q SpannableStringBuilder inSpans, @InterfaceC7396q Object[] spans, @InterfaceC7396q cyoe.x2<? super SpannableStringBuilder, was> builderAction) {
        d2ok.cdj(inSpans, "$this$inSpans");
        d2ok.cdj(spans, "spans");
        d2ok.cdj(builderAction, "builderAction");
        int length = inSpans.length();
        builderAction.invoke(inSpans);
        for (Object obj : spans) {
            inSpans.setSpan(obj, length, inSpans.length(), 17);
        }
        return inSpans;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public static final SpannableStringBuilder m2909k(@InterfaceC7396q SpannableStringBuilder backgroundColor, @zy.x2 int i2, @InterfaceC7396q cyoe.x2<? super SpannableStringBuilder, was> builderAction) {
        d2ok.cdj(backgroundColor, "$this$backgroundColor");
        d2ok.cdj(builderAction, "builderAction");
        BackgroundColorSpan backgroundColorSpan = new BackgroundColorSpan(i2);
        int length = backgroundColor.length();
        builderAction.invoke(backgroundColor);
        backgroundColor.setSpan(backgroundColorSpan, length, backgroundColor.length(), 17);
        return backgroundColor;
    }

    @InterfaceC7396q
    public static final SpannableStringBuilder ld6(@InterfaceC7396q SpannableStringBuilder superscript, @InterfaceC7396q cyoe.x2<? super SpannableStringBuilder, was> builderAction) {
        d2ok.cdj(superscript, "$this$superscript");
        d2ok.cdj(builderAction, "builderAction");
        SuperscriptSpan superscriptSpan = new SuperscriptSpan();
        int length = superscript.length();
        builderAction.invoke(superscript);
        superscript.setSpan(superscriptSpan, length, superscript.length(), 17);
        return superscript;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: n */
    public static final SpannableStringBuilder m2910n(@InterfaceC7396q SpannableStringBuilder inSpans, @InterfaceC7396q Object span, @InterfaceC7396q cyoe.x2<? super SpannableStringBuilder, was> builderAction) {
        d2ok.cdj(inSpans, "$this$inSpans");
        d2ok.cdj(span, "span");
        d2ok.cdj(builderAction, "builderAction");
        int length = inSpans.length();
        builderAction.invoke(inSpans);
        inSpans.setSpan(span, length, inSpans.length(), 17);
        return inSpans;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: p */
    public static final SpannableStringBuilder m2911p(@InterfaceC7396q SpannableStringBuilder subscript, @InterfaceC7396q cyoe.x2<? super SpannableStringBuilder, was> builderAction) {
        d2ok.cdj(subscript, "$this$subscript");
        d2ok.cdj(builderAction, "builderAction");
        SubscriptSpan subscriptSpan = new SubscriptSpan();
        int length = subscript.length();
        builderAction.invoke(subscript);
        subscript.setSpan(subscriptSpan, length, subscript.length(), 17);
        return subscript;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: q */
    public static final SpannableStringBuilder m2912q(@InterfaceC7396q SpannableStringBuilder color, @zy.x2 int i2, @InterfaceC7396q cyoe.x2<? super SpannableStringBuilder, was> builderAction) {
        d2ok.cdj(color, "$this$color");
        d2ok.cdj(builderAction, "builderAction");
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(i2);
        int length = color.length();
        builderAction.invoke(color);
        color.setSpan(foregroundColorSpan, length, color.length(), 17);
        return color;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: s */
    public static final SpannableStringBuilder m2913s(@InterfaceC7396q SpannableStringBuilder strikeThrough, @InterfaceC7396q cyoe.x2<? super SpannableStringBuilder, was> builderAction) {
        d2ok.cdj(strikeThrough, "$this$strikeThrough");
        d2ok.cdj(builderAction, "builderAction");
        StrikethroughSpan strikethroughSpan = new StrikethroughSpan();
        int length = strikeThrough.length();
        builderAction.invoke(strikeThrough);
        strikeThrough.setSpan(strikethroughSpan, length, strikeThrough.length(), 17);
        return strikeThrough;
    }

    @InterfaceC7396q
    public static final SpannableStringBuilder toq(@InterfaceC7396q SpannableStringBuilder bold, @InterfaceC7396q cyoe.x2<? super SpannableStringBuilder, was> builderAction) {
        d2ok.cdj(bold, "$this$bold");
        d2ok.cdj(builderAction, "builderAction");
        StyleSpan styleSpan = new StyleSpan(1);
        int length = bold.length();
        builderAction.invoke(bold);
        bold.setSpan(styleSpan, length, bold.length(), 17);
        return bold;
    }

    @InterfaceC7396q
    public static final SpannableStringBuilder x2(@InterfaceC7396q SpannableStringBuilder underline, @InterfaceC7396q cyoe.x2<? super SpannableStringBuilder, was> builderAction) {
        d2ok.cdj(underline, "$this$underline");
        d2ok.cdj(builderAction, "builderAction");
        UnderlineSpan underlineSpan = new UnderlineSpan();
        int length = underline.length();
        builderAction.invoke(underline);
        underline.setSpan(underlineSpan, length, underline.length(), 17);
        return underline;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: y */
    public static final SpannableStringBuilder m2914y(@InterfaceC7396q SpannableStringBuilder scale, float f2, @InterfaceC7396q cyoe.x2<? super SpannableStringBuilder, was> builderAction) {
        d2ok.cdj(scale, "$this$scale");
        d2ok.cdj(builderAction, "builderAction");
        RelativeSizeSpan relativeSizeSpan = new RelativeSizeSpan(f2);
        int length = scale.length();
        builderAction.invoke(scale);
        scale.setSpan(relativeSizeSpan, length, scale.length(), 17);
        return scale;
    }

    @InterfaceC7396q
    public static final SpannedString zy(@InterfaceC7396q cyoe.x2<? super SpannableStringBuilder, was> builderAction) {
        d2ok.cdj(builderAction, "builderAction");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        builderAction.invoke(spannableStringBuilder);
        return new SpannedString(spannableStringBuilder);
    }
}
