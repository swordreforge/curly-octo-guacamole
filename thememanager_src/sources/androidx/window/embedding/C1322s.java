package androidx.window.embedding;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.util.Pair;
import android.view.WindowMetrics;
import androidx.window.core.InterfaceC1310q;
import androidx.window.extensions.embedding.ActivityRule;
import androidx.window.extensions.embedding.ActivityStack;
import androidx.window.extensions.embedding.EmbeddingRule;
import androidx.window.extensions.embedding.SplitInfo;
import androidx.window.extensions.embedding.SplitPairRule;
import androidx.window.extensions.embedding.SplitPlaceholderRule;
import com.market.sdk.reflect.C4991s;
import com.miui.maml.folme.AnimatedProperty;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import kotlin.collections.a9;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: renamed from: androidx.window.embedding.s */
/* JADX INFO: compiled from: EmbeddingAdapter.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b#\u0010$J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J,\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u0007*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\bH\u0082\u0002¢\u0006\u0004\b\t\u0010\nJ,\u0010\u000b\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u0007*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\bH\u0082\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\fJ(\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\b0\u00122\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0007J(\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00150\b0\u00122\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0007J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00122\u0006\u0010\u0018\u001a\u00020\u0017H\u0007J\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000fH\u0007J\u001c\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00150\u00122\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000fH\u0007J\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u000f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u000f¨\u0006%"}, d2 = {"Landroidx/window/embedding/s;", "", "Landroidx/window/extensions/embedding/SplitInfo;", "splitInfo", "Landroidx/window/embedding/i;", AnimatedProperty.PROPERTY_NAME_Y, com.market.sdk.reflect.toq.f28136y, "S", "Landroid/util/Pair;", C7704k.y.toq.f95579toq, "(Landroid/util/Pair;)Ljava/lang/Object;", "f7l8", "", "splitInfoList", C7704k.y.toq.f44691k, "", "Landroidx/window/embedding/fn3e;", "splitPairFilters", "Ljava/util/function/Predicate;", "Landroid/app/Activity;", "qrj", "Landroid/content/Intent;", "ld6", "Landroidx/window/embedding/fu4;", "splitRule", "Landroid/view/WindowMetrics;", "t8r", "Landroidx/window/embedding/k;", "activityFilters", "kja0", "cdj", "Landroidx/window/embedding/qrj;", "rules", "Landroidx/window/extensions/embedding/EmbeddingRule;", "p", C4991s.f28129n, "()V", "window_release"}, m22787k = 1, mv = {1, 6, 0})
@InterfaceC1310q
public final class C1322s {
    private final <F, S> S f7l8(Pair<F, S> pair) {
        d2ok.m23075h(pair, "<this>");
        return (S) pair.second;
    }

    /* JADX INFO: renamed from: g */
    private final <F, S> F m5639g(Pair<F, S> pair) {
        d2ok.m23075h(pair, "<this>");
        return (F) pair.first;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final boolean m5640h(Set activityFilters, Activity activity) {
        d2ok.m23075h(activityFilters, "$activityFilters");
        if ((activityFilters instanceof Collection) && activityFilters.isEmpty()) {
            return false;
        }
        Iterator it = activityFilters.iterator();
        while (it.hasNext()) {
            C1317k c1317k = (C1317k) it.next();
            d2ok.kja0(activity, "activity");
            if (c1317k.zy(activity)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final boolean m5641i(fu4 splitRule, WindowMetrics windowMetrics) {
        d2ok.m23075h(splitRule, "$splitRule");
        d2ok.kja0(windowMetrics, "windowMetrics");
        return splitRule.m5613k(windowMetrics);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ki(Set activityFilters, Intent intent) {
        d2ok.m23075h(activityFilters, "$activityFilters");
        if ((activityFilters instanceof Collection) && activityFilters.isEmpty()) {
            return false;
        }
        Iterator it = activityFilters.iterator();
        while (it.hasNext()) {
            C1317k c1317k = (C1317k) it.next();
            d2ok.kja0(intent, "intent");
            if (c1317k.m5631q(intent)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean n7h(C1322s this$0, Set splitPairFilters, Pair pair) {
        d2ok.m23075h(this$0, "this$0");
        d2ok.m23075h(splitPairFilters, "$splitPairFilters");
        d2ok.kja0(pair, "(first, second)");
        Activity activity = (Activity) this$0.m5639g(pair);
        Activity activity2 = (Activity) this$0.f7l8(pair);
        if ((splitPairFilters instanceof Collection) && splitPairFilters.isEmpty()) {
            return false;
        }
        Iterator it = splitPairFilters.iterator();
        while (it.hasNext()) {
            if (((fn3e) it.next()).m5611n(activity, activity2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean x2(C1322s this$0, Set splitPairFilters, Pair pair) {
        d2ok.m23075h(this$0, "this$0");
        d2ok.m23075h(splitPairFilters, "$splitPairFilters");
        d2ok.kja0(pair, "(first, second)");
        Activity activity = (Activity) this$0.m5639g(pair);
        Intent intent = (Intent) this$0.f7l8(pair);
        if ((splitPairFilters instanceof Collection) && splitPairFilters.isEmpty()) {
            return false;
        }
        Iterator it = splitPairFilters.iterator();
        while (it.hasNext()) {
            if (((fn3e) it.next()).m5612q(activity, intent)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: y */
    private final C1316i m5645y(SplitInfo splitInfo) {
        boolean zIsEmpty;
        ActivityStack primaryActivityStack = splitInfo.getPrimaryActivityStack();
        d2ok.kja0(primaryActivityStack, "splitInfo.primaryActivityStack");
        boolean zIsEmpty2 = false;
        try {
            zIsEmpty = primaryActivityStack.isEmpty();
        } catch (NoSuchMethodError unused) {
            zIsEmpty = false;
        }
        List activities = primaryActivityStack.getActivities();
        d2ok.kja0(activities, "primaryActivityStack.activities");
        zy zyVar = new zy(activities, zIsEmpty);
        ActivityStack secondaryActivityStack = splitInfo.getSecondaryActivityStack();
        d2ok.kja0(secondaryActivityStack, "splitInfo.secondaryActivityStack");
        try {
            zIsEmpty2 = secondaryActivityStack.isEmpty();
        } catch (NoSuchMethodError unused2) {
        }
        List activities2 = secondaryActivityStack.getActivities();
        d2ok.kja0(activities2, "secondaryActivityStack.activities");
        return new C1316i(zyVar, new zy(activities2, zIsEmpty2), splitInfo.getSplitRatio());
    }

    @InterfaceC7396q
    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    public final Predicate<Intent> cdj(@InterfaceC7396q final Set<C1317k> activityFilters) {
        d2ok.m23075h(activityFilters, "activityFilters");
        return new Predicate() { // from class: androidx.window.embedding.f7l8
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return C1322s.ki(activityFilters, (Intent) obj);
            }
        };
    }

    @InterfaceC7396q
    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    public final Predicate<Activity> kja0(@InterfaceC7396q final Set<C1317k> activityFilters) {
        d2ok.m23075h(activityFilters, "activityFilters");
        return new Predicate() { // from class: androidx.window.embedding.n
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return C1322s.m5640h(activityFilters, (Activity) obj);
            }
        };
    }

    @InterfaceC7396q
    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    public final Predicate<Pair<Activity, Intent>> ld6(@InterfaceC7396q final Set<fn3e> splitPairFilters) {
        d2ok.m23075h(splitPairFilters, "splitPairFilters");
        return new Predicate() { // from class: androidx.window.embedding.q
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return C1322s.x2(this.f7124k, splitPairFilters, (Pair) obj);
            }
        };
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: p */
    public final Set<EmbeddingRule> m5646p(@InterfaceC7396q Set<? extends qrj> rules) {
        SplitPairRule splitPairRuleBuild;
        d2ok.m23075h(rules, "rules");
        ArrayList arrayList = new ArrayList(kotlin.collections.fu4.vyq(rules, 10));
        for (qrj qrjVar : rules) {
            if (qrjVar instanceof zurt) {
                zurt zurtVar = (zurt) qrjVar;
                splitPairRuleBuild = new SplitPairRule.Builder(qrj(zurtVar.f7l8()), ld6(zurtVar.f7l8()), t8r((fu4) qrjVar)).setSplitRatio(zurtVar.m5614n()).setLayoutDirection(zurtVar.toq()).setShouldFinishPrimaryWithSecondary(zurtVar.m5665y()).setShouldFinishSecondaryWithPrimary(zurtVar.m5664s()).setShouldClearTop(zurtVar.m5662g()).build();
                d2ok.kja0(splitPairRuleBuild, "SplitPairRuleBuilder(\n  …                 .build()");
            } else if (qrjVar instanceof ni7) {
                ni7 ni7Var = (ni7) qrjVar;
                splitPairRuleBuild = new SplitPlaceholderRule.Builder(ni7Var.f7l8(), kja0(ni7Var.m5637g()), cdj(ni7Var.m5637g()), t8r((fu4) qrjVar)).setSplitRatio(ni7Var.m5614n()).setLayoutDirection(ni7Var.toq()).build();
                d2ok.kja0(splitPairRuleBuild, "SplitPlaceholderRuleBuil…                 .build()");
            } else {
                if (!(qrjVar instanceof toq)) {
                    throw new IllegalArgumentException("Unsupported rule type");
                }
                toq toqVar = (toq) qrjVar;
                splitPairRuleBuild = new ActivityRule.Builder(kja0(toqVar.toq()), cdj(toqVar.toq())).setShouldAlwaysExpand(toqVar.m5656k()).build();
                d2ok.kja0(splitPairRuleBuild, "ActivityRuleBuilder(\n   …                 .build()");
            }
            arrayList.add((EmbeddingRule) splitPairRuleBuild);
        }
        return a9.yvs(arrayList);
    }

    @InterfaceC7396q
    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    public final Predicate<Pair<Activity, Activity>> qrj(@InterfaceC7396q final Set<fn3e> splitPairFilters) {
        d2ok.m23075h(splitPairFilters, "splitPairFilters");
        return new Predicate() { // from class: androidx.window.embedding.y
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return C1322s.n7h(this.f7130k, splitPairFilters, (Pair) obj);
            }
        };
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: s */
    public final List<C1316i> m5647s(@InterfaceC7396q List<? extends SplitInfo> splitInfoList) {
        d2ok.m23075h(splitInfoList, "splitInfoList");
        ArrayList arrayList = new ArrayList(kotlin.collections.fu4.vyq(splitInfoList, 10));
        Iterator<T> it = splitInfoList.iterator();
        while (it.hasNext()) {
            arrayList.add(m5645y((SplitInfo) it.next()));
        }
        return arrayList;
    }

    @InterfaceC7396q
    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    public final Predicate<WindowMetrics> t8r(@InterfaceC7396q final fu4 splitRule) {
        d2ok.m23075h(splitRule, "splitRule");
        return new Predicate() { // from class: androidx.window.embedding.g
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return C1322s.m5641i(splitRule, (WindowMetrics) obj);
            }
        };
    }
}
