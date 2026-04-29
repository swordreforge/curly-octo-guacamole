package kotlinx.coroutines.flow;

import androidx.exifinterface.media.C0846k;
import com.android.thememanager.settingssearch.C2690k;
import com.miui.maml.folme.AnimatedProperty;
import cyoe.InterfaceC5979h;
import cyoe.InterfaceC5980i;
import cyoe.InterfaceC5981k;
import kotlin.C6318m;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.intrinsics.C6199q;
import kotlin.coroutines.jvm.internal.AbstractC6209q;
import kotlin.coroutines.jvm.internal.InterfaceC6205g;
import kotlin.jvm.internal.AbstractC6308r;
import kotlin.was;
import l05.InterfaceC6769y;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.t */
/* JADX INFO: compiled from: Zip.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000l\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\u0007\u001a\u008a\u0001\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032F\u0010\f\u001aB\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u008c\u0001\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032F\u0010\f\u001aB\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0005ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000e\u001a\u009d\u0001\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032Y\b\u0001\u0010\f\u001aS\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u0012\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0011¢\u0006\u0002\b\u0014H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u009f\u0001\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032Y\b\u0001\u0010\f\u001aS\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u0012\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0011¢\u0006\u0002\b\u0014ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0016\u001a\u008a\u0001\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00030\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0018\"\u0004\b\u0003\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00020\u000320\b\u0001\u0010\f\u001a*\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0011ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u009b\u0001\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00030\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0018\"\u0004\b\u0003\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00020\u00032A\b\u0001\u0010\f\u001a;\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\u0012\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u001c¢\u0006\u0002\b\u0014ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a¢\u0001\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00040\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0018\"\u0004\b\u0003\u0010\u001f\"\u0004\b\u0004\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00020\u00032\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00030\u000324\u0010\f\u001a0\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00040\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u001cø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001aµ\u0001\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00040\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0018\"\u0004\b\u0003\u0010\u001f\"\u0004\b\u0004\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00020\u00032\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00030\u00032G\b\u0001\u0010\f\u001aA\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00040\u0012\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0#¢\u0006\u0002\b\u0014ø\u0001\u0000¢\u0006\u0004\b$\u0010%\u001a¼\u0001\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00050\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0018\"\u0004\b\u0003\u0010\u001f\"\u0004\b\u0004\u0010&\"\u0004\b\u0005\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00020\u00032\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00030\u00032\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00040\u00032:\u0010\f\u001a6\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00050\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0#ø\u0001\u0000¢\u0006\u0004\b(\u0010)\u001aÏ\u0001\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00050\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0018\"\u0004\b\u0003\u0010\u001f\"\u0004\b\u0004\u0010&\"\u0004\b\u0005\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00020\u00032\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00030\u00032\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00040\u00032M\b\u0001\u0010\f\u001aG\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00050\u0012\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0*¢\u0006\u0002\b\u0014ø\u0001\u0000¢\u0006\u0004\b+\u0010,\u001as\u00101\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0006\b\u0000\u0010-\u0018\u0001\"\u0004\b\u0001\u0010\u00022\u001e\u0010/\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030.\"\b\u0012\u0004\u0012\u00028\u00000\u00032*\b\u0004\u0010\f\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000.\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b00H\u0086\bø\u0001\u0000¢\u0006\u0004\b1\u00102\u001a\u0084\u0001\u00103\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0006\b\u0000\u0010-\u0018\u0001\"\u0004\b\u0001\u0010\u00022\u001e\u0010/\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030.\"\b\u0012\u0004\u0012\u00028\u00000\u00032;\b\u0005\u0010\f\u001a5\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0005¢\u0006\u0002\b\u0014H\u0086\bø\u0001\u0000¢\u0006\u0004\b3\u00104\u001as\u00105\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0006\b\u0000\u0010-\u0018\u0001\"\u0004\b\u0001\u0010\u00022\u001e\u0010/\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030.\"\b\u0012\u0004\u0012\u00028\u00000\u00032*\b\u0004\u0010\f\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000.\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b00H\u0082\bø\u0001\u0000¢\u0006\u0004\b5\u00102\u001a\u0084\u0001\u00106\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0006\b\u0000\u0010-\u0018\u0001\"\u0004\b\u0001\u0010\u00022\u001e\u0010/\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030.\"\b\u0012\u0004\u0012\u00028\u00000\u00032;\b\u0005\u0010\f\u001a5\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0005¢\u0006\u0002\b\u0014H\u0082\bø\u0001\u0000¢\u0006\u0004\b6\u00104\u001a#\u00108\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010.07\"\u0004\b\u0000\u0010-H\u0002¢\u0006\u0004\b8\u00109\u001ag\u0010;\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0006\b\u0000\u0010-\u0018\u0001\"\u0004\b\u0001\u0010\u00022\u0012\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030:2*\b\u0004\u0010\f\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000.\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b00H\u0086\bø\u0001\u0000¢\u0006\u0004\b;\u0010<\u001ax\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0006\b\u0000\u0010-\u0018\u0001\"\u0004\b\u0001\u0010\u00022\u0012\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030:2;\b\u0005\u0010\f\u001a5\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0005¢\u0006\u0002\b\u0014H\u0086\bø\u0001\u0000¢\u0006\u0004\b=\u0010>\u001aj\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032(\u0010\f\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0005ø\u0001\u0000¢\u0006\u0004\b@\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006A"}, d2 = {"T1", "T2", "R", "Lkotlinx/coroutines/flow/s;", "flow", "Lkotlin/Function3;", "Lkotlin/c;", "name", "a", "b", "Lkotlin/coroutines/q;", "", "transform", AnimatedProperty.PROPERTY_NAME_H, "(Lkotlinx/coroutines/flow/s;Lkotlinx/coroutines/flow/s;Lcyoe/cdj;)Lkotlinx/coroutines/flow/s;", "flow2", "zy", "Lkotlin/Function4;", "Lkotlinx/coroutines/flow/p;", "Lkotlin/was;", "Lkotlin/fn3e;", "cdj", "(Lkotlinx/coroutines/flow/s;Lkotlinx/coroutines/flow/s;Lcyoe/ki;)Lkotlinx/coroutines/flow/s;", C7704k.y.toq.f44691k, "T3", "flow3", "q", "(Lkotlinx/coroutines/flow/s;Lkotlinx/coroutines/flow/s;Lkotlinx/coroutines/flow/s;Lcyoe/ki;)Lkotlinx/coroutines/flow/s;", "Lkotlin/Function5;", "p", "(Lkotlinx/coroutines/flow/s;Lkotlinx/coroutines/flow/s;Lkotlinx/coroutines/flow/s;Lcyoe/t8r;)Lkotlinx/coroutines/flow/s;", "T4", "flow4", "n", "(Lkotlinx/coroutines/flow/s;Lkotlinx/coroutines/flow/s;Lkotlinx/coroutines/flow/s;Lkotlinx/coroutines/flow/s;Lcyoe/t8r;)Lkotlinx/coroutines/flow/s;", "Lkotlin/Function6;", "ld6", "(Lkotlinx/coroutines/flow/s;Lkotlinx/coroutines/flow/s;Lkotlinx/coroutines/flow/s;Lkotlinx/coroutines/flow/s;Lcyoe/i;)Lkotlinx/coroutines/flow/s;", "T5", "flow5", C7704k.y.toq.f95579toq, "(Lkotlinx/coroutines/flow/s;Lkotlinx/coroutines/flow/s;Lkotlinx/coroutines/flow/s;Lkotlinx/coroutines/flow/s;Lkotlinx/coroutines/flow/s;Lcyoe/i;)Lkotlinx/coroutines/flow/s;", "Lkotlin/Function7;", "x2", "(Lkotlinx/coroutines/flow/s;Lkotlinx/coroutines/flow/s;Lkotlinx/coroutines/flow/s;Lkotlinx/coroutines/flow/s;Lkotlinx/coroutines/flow/s;Lcyoe/fn3e;)Lkotlinx/coroutines/flow/s;", C0846k.zaso, "", "flows", "Lkotlin/Function2;", "f7l8", "([Lkotlinx/coroutines/flow/s;Lcyoe/h;)Lkotlinx/coroutines/flow/s;", "qrj", "([Lkotlinx/coroutines/flow/s;Lcyoe/cdj;)Lkotlinx/coroutines/flow/s;", "kja0", "n7h", "Lkotlin/Function0;", "ki", "()Lcyoe/k;", "", "toq", "(Ljava/lang/Iterable;Lcyoe/h;)Lkotlinx/coroutines/flow/s;", AnimatedProperty.PROPERTY_NAME_Y, "(Ljava/lang/Iterable;Lcyoe/cdj;)Lkotlinx/coroutines/flow/s;", C2690k.k.f61039ld6, "t8r", "kotlinx-coroutines-core"}, m22787k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
final /* synthetic */ class C6623t {

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.t$cdj */
    /* JADX INFO: compiled from: Zip.kt */
    @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6", m22756f = "Zip.kt", m22757i = {}, m22758l = {251}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
    @kotlin.d3(bv = {}, d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@"}, d2 = {C0846k.zaso, "R", "Lkotlinx/coroutines/flow/p;", "Lkotlin/was;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    public static final class cdj<R> extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<InterfaceC6618p<? super R>, InterfaceC6216q<? super was>, Object> {
        final /* synthetic */ InterfaceC6622s<T>[] $flows;
        final /* synthetic */ cyoe.cdj<InterfaceC6618p<? super R>, T[], InterfaceC6216q<? super was>, Object> $transform;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: Add missing generic type declarations: [T] */
        /* JADX INFO: renamed from: kotlinx.coroutines.flow.t$cdj$k */
        /* JADX INFO: compiled from: Zip.kt */
        @kotlin.d3(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\u0010\u0000\u001a\f\u0012\u0006\u0012\u0004\u0018\u0001H\u0002\u0018\u00010\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0004\b\u0001\u0010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", C0846k.zaso, "R", "invoke", "()[Ljava/lang/Object;"}, m22787k = 3, mv = {1, 6, 0}, xi = 176)
        public static final class k<T> extends AbstractC6308r implements InterfaceC5981k<T[]> {
            final /* synthetic */ InterfaceC6622s<T>[] $flows;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public k(InterfaceC6622s<? extends T>[] interfaceC6622sArr) {
                super(0);
                this.$flows = interfaceC6622sArr;
            }

            @Override // cyoe.InterfaceC5981k
            @InterfaceC7395n
            public final T[] invoke() {
                int length = this.$flows.length;
                kotlin.jvm.internal.d2ok.m23086z(0, "T?");
                return (T[]) new Object[length];
            }
        }

        /* JADX INFO: Add missing generic type declarations: [T] */
        /* JADX INFO: renamed from: kotlinx.coroutines.flow.t$cdj$toq */
        /* JADX INFO: compiled from: Zip.kt */
        @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6$2", m22756f = "Zip.kt", m22757i = {}, m22758l = {251}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
        @kotlin.d3(bv = {}, d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@"}, d2 = {C0846k.zaso, "R", "Lkotlinx/coroutines/flow/p;", "", "it", "Lkotlin/was;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
        public static final class toq<T> extends kotlin.coroutines.jvm.internal.kja0 implements cyoe.cdj<InterfaceC6618p<? super R>, T[], InterfaceC6216q<? super was>, Object> {
            final /* synthetic */ cyoe.cdj<InterfaceC6618p<? super R>, T[], InterfaceC6216q<? super was>, Object> $transform;
            private /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public toq(cyoe.cdj<? super InterfaceC6618p<? super R>, ? super T[], ? super InterfaceC6216q<? super was>, ? extends Object> cdjVar, InterfaceC6216q<? super toq> interfaceC6216q) {
                super(3, interfaceC6216q);
                this.$transform = cdjVar;
            }

            @Override // cyoe.cdj
            @InterfaceC7395n
            public final Object invoke(@InterfaceC7396q InterfaceC6618p<? super R> interfaceC6618p, @InterfaceC7396q T[] tArr, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
                toq toqVar = new toq(this.$transform, interfaceC6216q);
                toqVar.L$0 = interfaceC6618p;
                toqVar.L$1 = tArr;
                return toqVar.invokeSuspend(was.f36763k);
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
            @InterfaceC7395n
            public final Object invokeSuspend(@InterfaceC7396q Object obj) {
                Object objX2 = C6199q.x2();
                int i2 = this.label;
                if (i2 == 0) {
                    C6318m.n7h(obj);
                    InterfaceC6618p<? super R> interfaceC6618p = (InterfaceC6618p) this.L$0;
                    Object[] objArr = (Object[]) this.L$1;
                    cyoe.cdj<InterfaceC6618p<? super R>, T[], InterfaceC6216q<? super was>, Object> cdjVar = this.$transform;
                    this.L$0 = null;
                    this.label = 1;
                    if (cdjVar.invoke(interfaceC6618p, objArr, this) == objX2) {
                        return objX2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C6318m.n7h(obj);
                }
                return was.f36763k;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @InterfaceC7395n
            public final Object invokeSuspend$$forInline(@InterfaceC7396q Object obj) {
                this.$transform.invoke((InterfaceC6618p) this.L$0, (Object[]) this.L$1, this);
                return was.f36763k;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public cdj(InterfaceC6622s<? extends T>[] interfaceC6622sArr, cyoe.cdj<? super InterfaceC6618p<? super R>, ? super T[], ? super InterfaceC6216q<? super was>, ? extends Object> cdjVar, InterfaceC6216q<? super cdj> interfaceC6216q) {
            super(2, interfaceC6216q);
            this.$flows = interfaceC6622sArr;
            this.$transform = cdjVar;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            cdj cdjVar = new cdj(this.$flows, this.$transform, interfaceC6216q);
            cdjVar.L$0 = obj;
            return cdjVar;
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q InterfaceC6618p<? super R> interfaceC6618p, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
            return ((cdj) create(interfaceC6618p, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            Object objX2 = C6199q.x2();
            int i2 = this.label;
            if (i2 == 0) {
                C6318m.n7h(obj);
                InterfaceC6618p interfaceC6618p = (InterfaceC6618p) this.L$0;
                InterfaceC6622s<T>[] interfaceC6622sArr = this.$flows;
                kotlin.jvm.internal.d2ok.ni7();
                k kVar = new k(this.$flows);
                kotlin.jvm.internal.d2ok.ni7();
                toq toqVar = new toq(this.$transform, null);
                this.label = 1;
                if (kotlinx.coroutines.flow.internal.qrj.m24135k(interfaceC6618p, interfaceC6622sArr, kVar, toqVar, this) == objX2) {
                    return objX2;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6318m.n7h(obj);
            }
            return was.f36763k;
        }

        @InterfaceC7395n
        public final Object invokeSuspend$$forInline(@InterfaceC7396q Object obj) {
            InterfaceC6618p interfaceC6618p = (InterfaceC6618p) this.L$0;
            InterfaceC6622s<T>[] interfaceC6622sArr = this.$flows;
            kotlin.jvm.internal.d2ok.ni7();
            k kVar = new k(this.$flows);
            kotlin.jvm.internal.d2ok.ni7();
            toq toqVar = new toq(this.$transform, null);
            kotlin.jvm.internal.d3.m23089n(0);
            kotlinx.coroutines.flow.internal.qrj.m24135k(interfaceC6618p, interfaceC6622sArr, kVar, toqVar, this);
            kotlin.jvm.internal.d3.m23089n(1);
            return was.f36763k;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.t$f7l8 */
    /* JADX INFO: compiled from: Zip.kt */
    @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1", m22756f = "Zip.kt", m22757i = {}, m22758l = {33, 33}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
    @kotlin.d3(bv = {}, d1 = {"\u0000\u0018\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00020\u00032\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u008a@"}, d2 = {"T1", "T2", "R", "Lkotlinx/coroutines/flow/p;", "", "", "it", "Lkotlin/was;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    static final class f7l8<R> extends kotlin.coroutines.jvm.internal.kja0 implements cyoe.cdj<InterfaceC6618p<? super R>, Object[], InterfaceC6216q<? super was>, Object> {
        final /* synthetic */ cyoe.cdj<T1, T2, InterfaceC6216q<? super R>, Object> $transform;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f7l8(cyoe.cdj<? super T1, ? super T2, ? super InterfaceC6216q<? super R>, ? extends Object> cdjVar, InterfaceC6216q<? super f7l8> interfaceC6216q) {
            super(3, interfaceC6216q);
            this.$transform = cdjVar;
        }

        @Override // cyoe.cdj
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q InterfaceC6618p<? super R> interfaceC6618p, @InterfaceC7396q Object[] objArr, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
            f7l8 f7l8Var = new f7l8(this.$transform, interfaceC6216q);
            f7l8Var.L$0 = interfaceC6618p;
            f7l8Var.L$1 = objArr;
            return f7l8Var.invokeSuspend(was.f36763k);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to kotlinx.coroutines.flow.t$f7l8<R> for r6v1 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @mub.InterfaceC7395n
        public final java.lang.Object invokeSuspend(@mub.InterfaceC7396q java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.toq.x2()
                int r1 = r6.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.C6318m.n7h(r7)
                goto L4c
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1a:
                java.lang.Object r1 = r6.L$0
                kotlinx.coroutines.flow.p r1 = (kotlinx.coroutines.flow.InterfaceC6618p) r1
                kotlin.C6318m.n7h(r7)
                goto L40
            L22:
                kotlin.C6318m.n7h(r7)
                java.lang.Object r7 = r6.L$0
                r1 = r7
                kotlinx.coroutines.flow.p r1 = (kotlinx.coroutines.flow.InterfaceC6618p) r1
                java.lang.Object r7 = r6.L$1
                java.lang.Object[] r7 = (java.lang.Object[]) r7
                cyoe.cdj<T1, T2, kotlin.coroutines.q<? super R>, java.lang.Object> r4 = r6.$transform
                r5 = 0
                r5 = r7[r5]
                r7 = r7[r3]
                r6.L$0 = r1
                r6.label = r3
                java.lang.Object r7 = r4.invoke(r5, r7, r6)
                if (r7 != r0) goto L40
                return r0
            L40:
                r3 = 0
                r6.L$0 = r3
                r6.label = r2
                java.lang.Object r7 = r1.emit(r7, r6)
                if (r7 != r0) goto L4c
                return r0
            L4c:
                kotlin.was r7 = kotlin.was.f36763k
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C6623t.f7l8.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R, T] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.t$fn3e */
    /* JADX INFO: compiled from: Zip.kt */
    @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineUnsafe$1$1", m22756f = "Zip.kt", m22757i = {}, m22758l = {262, 262}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
    @kotlin.d3(bv = {}, d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@"}, d2 = {C0846k.zaso, "R", "Lkotlinx/coroutines/flow/p;", "", "it", "Lkotlin/was;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    public static final class fn3e<R, T> extends kotlin.coroutines.jvm.internal.kja0 implements cyoe.cdj<InterfaceC6618p<? super R>, T[], InterfaceC6216q<? super was>, Object> {
        final /* synthetic */ InterfaceC5979h<T[], InterfaceC6216q<? super R>, Object> $transform;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public fn3e(InterfaceC5979h<? super T[], ? super InterfaceC6216q<? super R>, ? extends Object> interfaceC5979h, InterfaceC6216q<? super fn3e> interfaceC6216q) {
            super(3, interfaceC6216q);
            this.$transform = interfaceC5979h;
        }

        @Override // cyoe.cdj
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q InterfaceC6618p<? super R> interfaceC6618p, @InterfaceC7396q T[] tArr, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
            fn3e fn3eVar = new fn3e(this.$transform, interfaceC6216q);
            fn3eVar.L$0 = interfaceC6618p;
            fn3eVar.L$1 = tArr;
            return fn3eVar.invokeSuspend(was.f36763k);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            InterfaceC6618p interfaceC6618p;
            Object objX2 = C6199q.x2();
            int i2 = this.label;
            if (i2 == 0) {
                C6318m.n7h(obj);
                InterfaceC6618p interfaceC6618p2 = (InterfaceC6618p) this.L$0;
                Object[] objArr = (Object[]) this.L$1;
                InterfaceC5979h<T[], InterfaceC6216q<? super R>, Object> interfaceC5979h = this.$transform;
                this.L$0 = interfaceC6618p2;
                this.label = 1;
                obj = interfaceC5979h.invoke(objArr, this);
                interfaceC6618p = interfaceC6618p2;
                if (obj == objX2) {
                    return objX2;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C6318m.n7h(obj);
                    return was.f36763k;
                }
                InterfaceC6618p interfaceC6618p3 = (InterfaceC6618p) this.L$0;
                C6318m.n7h(obj);
                interfaceC6618p = interfaceC6618p3;
            }
            this.L$0 = null;
            this.label = 2;
            if (interfaceC6618p.emit(obj, this) == objX2) {
                return objX2;
            }
            return was.f36763k;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @InterfaceC7395n
        public final Object invokeSuspend$$forInline(@InterfaceC7396q Object obj) {
            InterfaceC6618p interfaceC6618p = (InterfaceC6618p) this.L$0;
            Object objInvoke = this.$transform.invoke((Object[]) this.L$1, this);
            kotlin.jvm.internal.d3.m23089n(0);
            interfaceC6618p.emit(objInvoke, this);
            kotlin.jvm.internal.d3.m23089n(1);
            return was.f36763k;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.t$g */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/fu4$toq", "Lkotlinx/coroutines/flow/s;", "Lkotlinx/coroutines/flow/p;", "collector", "Lkotlin/was;", "k", "(Lkotlinx/coroutines/flow/p;Lkotlin/coroutines/q;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    public static final class g<R> implements InterfaceC6622s<R> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ InterfaceC6622s[] f37077k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ InterfaceC5979h f37078q;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.t$g$k */
        /* JADX INFO: compiled from: SafeCollector.common.kt */
        @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 176)
        public static final class k extends AbstractC6209q {
            int label;
            /* synthetic */ Object result;

            public k(InterfaceC6216q interfaceC6216q) {
                super(interfaceC6216q);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
            @InterfaceC7395n
            public final Object invokeSuspend(@InterfaceC7396q Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return g.this.mo5262k(null, this);
            }
        }

        public g(InterfaceC6622s[] interfaceC6622sArr, InterfaceC5979h interfaceC5979h) {
            this.f37077k = interfaceC6622sArr;
            this.f37078q = interfaceC5979h;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC6622s
        @InterfaceC7395n
        /* JADX INFO: renamed from: k */
        public Object mo5262k(@InterfaceC7396q InterfaceC6618p<? super R> interfaceC6618p, @InterfaceC7396q InterfaceC6216q<? super was> interfaceC6216q) {
            InterfaceC6622s[] interfaceC6622sArr = this.f37077k;
            kotlin.jvm.internal.d2ok.ni7();
            p pVar = new p(this.f37077k);
            kotlin.jvm.internal.d2ok.ni7();
            Object objM24135k = kotlinx.coroutines.flow.internal.qrj.m24135k(interfaceC6618p, interfaceC6622sArr, pVar, new ld6(this.f37078q, null), interfaceC6216q);
            return objM24135k == C6199q.x2() ? objM24135k : was.f36763k;
        }

        @InterfaceC7395n
        /* JADX INFO: renamed from: y */
        public Object m24238y(@InterfaceC7396q InterfaceC6618p interfaceC6618p, @InterfaceC7396q InterfaceC6216q interfaceC6216q) {
            kotlin.jvm.internal.d3.m23089n(4);
            new k(interfaceC6216q);
            kotlin.jvm.internal.d3.m23089n(5);
            InterfaceC6622s[] interfaceC6622sArr = this.f37077k;
            kotlin.jvm.internal.d2ok.ni7();
            p pVar = new p(this.f37077k);
            kotlin.jvm.internal.d2ok.ni7();
            ld6 ld6Var = new ld6(this.f37078q, null);
            kotlin.jvm.internal.d3.m23089n(0);
            kotlinx.coroutines.flow.internal.qrj.m24135k(interfaceC6618p, interfaceC6622sArr, pVar, ld6Var, interfaceC6216q);
            kotlin.jvm.internal.d3.m23089n(1);
            return was.f36763k;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.t$h */
    /* JADX INFO: compiled from: Zip.kt */
    @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$5", m22756f = "Zip.kt", m22757i = {}, m22758l = {273}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
    @kotlin.d3(bv = {}, d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¨\u0006\u0004"}, d2 = {C0846k.zaso, "R", "Lkotlinx/coroutines/flow/p;", "Lkotlin/was;", "kotlinx/coroutines/flow/t$t8r", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    public static final class h<R> extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<InterfaceC6618p<? super R>, InterfaceC6216q<? super was>, Object> {
        final /* synthetic */ InterfaceC6622s[] $flows;
        final /* synthetic */ cyoe.fn3e $transform$inlined;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.t$h$k */
        /* JADX INFO: compiled from: Zip.kt */
        @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$5$1", m22756f = "Zip.kt", m22757i = {}, m22758l = {333}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
        @kotlin.d3(bv = {}, d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¨\u0006\u0006"}, d2 = {C0846k.zaso, "R", "Lkotlinx/coroutines/flow/p;", "", "it", "Lkotlin/was;", "kotlinx/coroutines/flow/t$t8r$k", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
        public static final class k extends kotlin.coroutines.jvm.internal.kja0 implements cyoe.cdj<InterfaceC6618p<? super R>, Object[], InterfaceC6216q<? super was>, Object> {
            final /* synthetic */ cyoe.fn3e $transform$inlined;
            private /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public k(InterfaceC6216q interfaceC6216q, cyoe.fn3e fn3eVar) {
                super(3, interfaceC6216q);
                this.$transform$inlined = fn3eVar;
            }

            @Override // cyoe.cdj
            @InterfaceC7395n
            public final Object invoke(@InterfaceC7396q InterfaceC6618p<? super R> interfaceC6618p, @InterfaceC7396q Object[] objArr, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
                k kVar = new k(interfaceC6216q, this.$transform$inlined);
                kVar.L$0 = interfaceC6618p;
                kVar.L$1 = objArr;
                return kVar.invokeSuspend(was.f36763k);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
            @InterfaceC7395n
            public final Object invokeSuspend(@InterfaceC7396q Object obj) {
                Object objX2 = C6199q.x2();
                int i2 = this.label;
                if (i2 == 0) {
                    C6318m.n7h(obj);
                    InterfaceC6618p interfaceC6618p = (InterfaceC6618p) this.L$0;
                    Object[] objArr = (Object[]) this.L$1;
                    cyoe.fn3e fn3eVar = this.$transform$inlined;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    Object obj5 = objArr[3];
                    Object obj6 = objArr[4];
                    this.label = 1;
                    kotlin.jvm.internal.d3.m23089n(6);
                    Object objInvoke = fn3eVar.invoke(interfaceC6618p, obj2, obj3, obj4, obj5, obj6, this);
                    kotlin.jvm.internal.d3.m23089n(7);
                    if (objInvoke == objX2) {
                        return objX2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C6318m.n7h(obj);
                }
                return was.f36763k;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC6622s[] interfaceC6622sArr, InterfaceC6216q interfaceC6216q, cyoe.fn3e fn3eVar) {
            super(2, interfaceC6216q);
            this.$flows = interfaceC6622sArr;
            this.$transform$inlined = fn3eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            h hVar = new h(this.$flows, interfaceC6216q, this.$transform$inlined);
            hVar.L$0 = obj;
            return hVar;
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q InterfaceC6618p<? super R> interfaceC6618p, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
            return ((h) create(interfaceC6618p, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            Object objX2 = C6199q.x2();
            int i2 = this.label;
            if (i2 == 0) {
                C6318m.n7h(obj);
                InterfaceC6618p interfaceC6618p = (InterfaceC6618p) this.L$0;
                InterfaceC6622s[] interfaceC6622sArr = this.$flows;
                InterfaceC5981k interfaceC5981kKi = C6623t.ki();
                k kVar = new k(null, this.$transform$inlined);
                this.label = 1;
                if (kotlinx.coroutines.flow.internal.qrj.m24135k(interfaceC6618p, interfaceC6622sArr, interfaceC5981kKi, kVar, this) == objX2) {
                    return objX2;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6318m.n7h(obj);
            }
            return was.f36763k;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.t$i */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/fu4$toq", "Lkotlinx/coroutines/flow/s;", "Lkotlinx/coroutines/flow/p;", "collector", "Lkotlin/was;", "k", "(Lkotlinx/coroutines/flow/p;Lkotlin/coroutines/q;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    public static final class i<R> implements InterfaceC6622s<R> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ InterfaceC6622s[] f37079k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ InterfaceC5979h f37080q;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.t$i$k */
        /* JADX INFO: compiled from: SafeCollector.common.kt */
        @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
        public static final class k extends AbstractC6209q {
            int label;
            /* synthetic */ Object result;

            public k(InterfaceC6216q interfaceC6216q) {
                super(interfaceC6216q);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
            @InterfaceC7395n
            public final Object invokeSuspend(@InterfaceC7396q Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return i.this.mo5262k(null, this);
            }
        }

        public i(InterfaceC6622s[] interfaceC6622sArr, InterfaceC5979h interfaceC5979h) {
            this.f37079k = interfaceC6622sArr;
            this.f37080q = interfaceC5979h;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC6622s
        @InterfaceC7395n
        /* JADX INFO: renamed from: k */
        public Object mo5262k(@InterfaceC7396q InterfaceC6618p<? super R> interfaceC6618p, @InterfaceC7396q InterfaceC6216q<? super was> interfaceC6216q) {
            InterfaceC6622s[] interfaceC6622sArr = this.f37079k;
            InterfaceC5981k interfaceC5981kKi = C6623t.ki();
            kotlin.jvm.internal.d2ok.ni7();
            Object objM24135k = kotlinx.coroutines.flow.internal.qrj.m24135k(interfaceC6618p, interfaceC6622sArr, interfaceC5981kKi, new fn3e(this.f37080q, null), interfaceC6216q);
            return objM24135k == C6199q.x2() ? objM24135k : was.f36763k;
        }

        @InterfaceC7395n
        /* JADX INFO: renamed from: y */
        public Object m24239y(@InterfaceC7396q InterfaceC6618p interfaceC6618p, @InterfaceC7396q InterfaceC6216q interfaceC6216q) {
            kotlin.jvm.internal.d3.m23089n(4);
            new k(interfaceC6216q);
            kotlin.jvm.internal.d3.m23089n(5);
            InterfaceC6622s[] interfaceC6622sArr = this.f37079k;
            InterfaceC5981k interfaceC5981kKi = C6623t.ki();
            kotlin.jvm.internal.d2ok.ni7();
            fn3e fn3eVar = new fn3e(this.f37080q, null);
            kotlin.jvm.internal.d3.m23089n(0);
            kotlinx.coroutines.flow.internal.qrj.m24135k(interfaceC6618p, interfaceC6622sArr, interfaceC5981kKi, fn3eVar, interfaceC6216q);
            kotlin.jvm.internal.d3.m23089n(1);
            return was.f36763k;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.t$k */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/s;", "Lkotlinx/coroutines/flow/p;", "collector", "Lkotlin/was;", "k", "(Lkotlinx/coroutines/flow/p;Lkotlin/coroutines/q;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/t$i"}, m22787k = 1, mv = {1, 6, 0})
    public static final class k<R> implements InterfaceC6622s<R> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ InterfaceC6622s[] f37081k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ cyoe.ki f37082q;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.t$k$k, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Zip.kt */
        @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2", m22756f = "Zip.kt", m22757i = {}, m22758l = {333, 333}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
        @kotlin.d3(bv = {}, d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¨\u0006\u0006"}, d2 = {C0846k.zaso, "R", "Lkotlinx/coroutines/flow/p;", "", "it", "Lkotlin/was;", "kotlinx/coroutines/flow/t$fn3e", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
        public static final class C8085k extends kotlin.coroutines.jvm.internal.kja0 implements cyoe.cdj<InterfaceC6618p<? super R>, Object[], InterfaceC6216q<? super was>, Object> {
            final /* synthetic */ cyoe.ki $transform$inlined;
            private /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C8085k(InterfaceC6216q interfaceC6216q, cyoe.ki kiVar) {
                super(3, interfaceC6216q);
                this.$transform$inlined = kiVar;
            }

            @Override // cyoe.cdj
            @InterfaceC7395n
            public final Object invoke(@InterfaceC7396q InterfaceC6618p<? super R> interfaceC6618p, @InterfaceC7396q Object[] objArr, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
                C8085k c8085k = new C8085k(interfaceC6216q, this.$transform$inlined);
                c8085k.L$0 = interfaceC6618p;
                c8085k.L$1 = objArr;
                return c8085k.invokeSuspend(was.f36763k);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
            @InterfaceC7395n
            public final Object invokeSuspend(@InterfaceC7396q Object obj) {
                InterfaceC6618p interfaceC6618p;
                Object objX2 = C6199q.x2();
                int i2 = this.label;
                if (i2 == 0) {
                    C6318m.n7h(obj);
                    interfaceC6618p = (InterfaceC6618p) this.L$0;
                    Object[] objArr = (Object[]) this.L$1;
                    cyoe.ki kiVar = this.$transform$inlined;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    this.L$0 = interfaceC6618p;
                    this.label = 1;
                    kotlin.jvm.internal.d3.m23089n(6);
                    obj = kiVar.invoke(obj2, obj3, obj4, this);
                    kotlin.jvm.internal.d3.m23089n(7);
                    if (obj == objX2) {
                        return objX2;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C6318m.n7h(obj);
                        return was.f36763k;
                    }
                    interfaceC6618p = (InterfaceC6618p) this.L$0;
                    C6318m.n7h(obj);
                }
                this.L$0 = null;
                this.label = 2;
                if (interfaceC6618p.emit(obj, this) == objX2) {
                    return objX2;
                }
                return was.f36763k;
            }
        }

        public k(InterfaceC6622s[] interfaceC6622sArr, cyoe.ki kiVar) {
            this.f37081k = interfaceC6622sArr;
            this.f37082q = kiVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC6622s
        @InterfaceC7395n
        /* JADX INFO: renamed from: k */
        public Object mo5262k(@InterfaceC7396q InterfaceC6618p interfaceC6618p, @InterfaceC7396q InterfaceC6216q interfaceC6216q) {
            Object objM24135k = kotlinx.coroutines.flow.internal.qrj.m24135k(interfaceC6618p, this.f37081k, C6623t.ki(), new C8085k(null, this.f37082q), interfaceC6216q);
            return objM24135k == C6199q.x2() ? objM24135k : was.f36763k;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.t$ki */
    /* JADX INFO: compiled from: Zip.kt */
    @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7", m22756f = "Zip.kt", m22757i = {}, m22758l = {308}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
    @kotlin.d3(bv = {}, d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@"}, d2 = {C0846k.zaso, "R", "Lkotlinx/coroutines/flow/p;", "Lkotlin/was;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    public static final class ki<R> extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<InterfaceC6618p<? super R>, InterfaceC6216q<? super was>, Object> {
        final /* synthetic */ InterfaceC6622s<T>[] $flowArray;
        final /* synthetic */ cyoe.cdj<InterfaceC6618p<? super R>, T[], InterfaceC6216q<? super was>, Object> $transform;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: Add missing generic type declarations: [T] */
        /* JADX INFO: renamed from: kotlinx.coroutines.flow.t$ki$k */
        /* JADX INFO: compiled from: Zip.kt */
        @kotlin.d3(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\u0010\u0000\u001a\f\u0012\u0006\u0012\u0004\u0018\u0001H\u0002\u0018\u00010\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0004\b\u0001\u0010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", C0846k.zaso, "R", "invoke", "()[Ljava/lang/Object;"}, m22787k = 3, mv = {1, 6, 0}, xi = 176)
        public static final class k<T> extends AbstractC6308r implements InterfaceC5981k<T[]> {
            final /* synthetic */ InterfaceC6622s<T>[] $flowArray;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public k(InterfaceC6622s<T>[] interfaceC6622sArr) {
                super(0);
                this.$flowArray = interfaceC6622sArr;
            }

            @Override // cyoe.InterfaceC5981k
            @InterfaceC7395n
            public final T[] invoke() {
                int length = this.$flowArray.length;
                kotlin.jvm.internal.d2ok.m23086z(0, "T?");
                return (T[]) new Object[length];
            }
        }

        /* JADX INFO: Add missing generic type declarations: [T] */
        /* JADX INFO: renamed from: kotlinx.coroutines.flow.t$ki$toq */
        /* JADX INFO: compiled from: Zip.kt */
        @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7$2", m22756f = "Zip.kt", m22757i = {}, m22758l = {308}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
        @kotlin.d3(bv = {}, d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@"}, d2 = {C0846k.zaso, "R", "Lkotlinx/coroutines/flow/p;", "", "it", "Lkotlin/was;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
        public static final class toq<T> extends kotlin.coroutines.jvm.internal.kja0 implements cyoe.cdj<InterfaceC6618p<? super R>, T[], InterfaceC6216q<? super was>, Object> {
            final /* synthetic */ cyoe.cdj<InterfaceC6618p<? super R>, T[], InterfaceC6216q<? super was>, Object> $transform;
            private /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public toq(cyoe.cdj<? super InterfaceC6618p<? super R>, ? super T[], ? super InterfaceC6216q<? super was>, ? extends Object> cdjVar, InterfaceC6216q<? super toq> interfaceC6216q) {
                super(3, interfaceC6216q);
                this.$transform = cdjVar;
            }

            @Override // cyoe.cdj
            @InterfaceC7395n
            public final Object invoke(@InterfaceC7396q InterfaceC6618p<? super R> interfaceC6618p, @InterfaceC7396q T[] tArr, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
                toq toqVar = new toq(this.$transform, interfaceC6216q);
                toqVar.L$0 = interfaceC6618p;
                toqVar.L$1 = tArr;
                return toqVar.invokeSuspend(was.f36763k);
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
            @InterfaceC7395n
            public final Object invokeSuspend(@InterfaceC7396q Object obj) {
                Object objX2 = C6199q.x2();
                int i2 = this.label;
                if (i2 == 0) {
                    C6318m.n7h(obj);
                    InterfaceC6618p<? super R> interfaceC6618p = (InterfaceC6618p) this.L$0;
                    Object[] objArr = (Object[]) this.L$1;
                    cyoe.cdj<InterfaceC6618p<? super R>, T[], InterfaceC6216q<? super was>, Object> cdjVar = this.$transform;
                    this.L$0 = null;
                    this.label = 1;
                    if (cdjVar.invoke(interfaceC6618p, objArr, this) == objX2) {
                        return objX2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C6318m.n7h(obj);
                }
                return was.f36763k;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @InterfaceC7395n
            public final Object invokeSuspend$$forInline(@InterfaceC7396q Object obj) {
                this.$transform.invoke((InterfaceC6618p) this.L$0, (Object[]) this.L$1, this);
                return was.f36763k;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ki(InterfaceC6622s<T>[] interfaceC6622sArr, cyoe.cdj<? super InterfaceC6618p<? super R>, ? super T[], ? super InterfaceC6216q<? super was>, ? extends Object> cdjVar, InterfaceC6216q<? super ki> interfaceC6216q) {
            super(2, interfaceC6216q);
            this.$flowArray = interfaceC6622sArr;
            this.$transform = cdjVar;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            ki kiVar = new ki(this.$flowArray, this.$transform, interfaceC6216q);
            kiVar.L$0 = obj;
            return kiVar;
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q InterfaceC6618p<? super R> interfaceC6618p, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
            return ((ki) create(interfaceC6618p, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            Object objX2 = C6199q.x2();
            int i2 = this.label;
            if (i2 == 0) {
                C6318m.n7h(obj);
                InterfaceC6618p interfaceC6618p = (InterfaceC6618p) this.L$0;
                InterfaceC6622s<T>[] interfaceC6622sArr = this.$flowArray;
                kotlin.jvm.internal.d2ok.ni7();
                k kVar = new k(this.$flowArray);
                kotlin.jvm.internal.d2ok.ni7();
                toq toqVar = new toq(this.$transform, null);
                this.label = 1;
                if (kotlinx.coroutines.flow.internal.qrj.m24135k(interfaceC6618p, interfaceC6622sArr, kVar, toqVar, this) == objX2) {
                    return objX2;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6318m.n7h(obj);
            }
            return was.f36763k;
        }

        @InterfaceC7395n
        public final Object invokeSuspend$$forInline(@InterfaceC7396q Object obj) {
            InterfaceC6618p interfaceC6618p = (InterfaceC6618p) this.L$0;
            InterfaceC6622s<T>[] interfaceC6622sArr = this.$flowArray;
            kotlin.jvm.internal.d2ok.ni7();
            k kVar = new k(this.$flowArray);
            kotlin.jvm.internal.d2ok.ni7();
            toq toqVar = new toq(this.$transform, null);
            kotlin.jvm.internal.d3.m23089n(0);
            kotlinx.coroutines.flow.internal.qrj.m24135k(interfaceC6618p, interfaceC6622sArr, kVar, toqVar, this);
            kotlin.jvm.internal.d3.m23089n(1);
            return was.f36763k;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.t$kja0 */
    /* JADX INFO: compiled from: Zip.kt */
    @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$4", m22756f = "Zip.kt", m22757i = {}, m22758l = {273}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
    @kotlin.d3(bv = {}, d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¨\u0006\u0004"}, d2 = {C0846k.zaso, "R", "Lkotlinx/coroutines/flow/p;", "Lkotlin/was;", "kotlinx/coroutines/flow/t$t8r", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    public static final class kja0<R> extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<InterfaceC6618p<? super R>, InterfaceC6216q<? super was>, Object> {
        final /* synthetic */ InterfaceC6622s[] $flows;
        final /* synthetic */ InterfaceC5980i $transform$inlined;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.t$kja0$k */
        /* JADX INFO: compiled from: Zip.kt */
        @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$4$1", m22756f = "Zip.kt", m22757i = {}, m22758l = {333}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
        @kotlin.d3(bv = {}, d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¨\u0006\u0006"}, d2 = {C0846k.zaso, "R", "Lkotlinx/coroutines/flow/p;", "", "it", "Lkotlin/was;", "kotlinx/coroutines/flow/t$t8r$k", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
        public static final class k extends kotlin.coroutines.jvm.internal.kja0 implements cyoe.cdj<InterfaceC6618p<? super R>, Object[], InterfaceC6216q<? super was>, Object> {
            final /* synthetic */ InterfaceC5980i $transform$inlined;
            private /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public k(InterfaceC6216q interfaceC6216q, InterfaceC5980i interfaceC5980i) {
                super(3, interfaceC6216q);
                this.$transform$inlined = interfaceC5980i;
            }

            @Override // cyoe.cdj
            @InterfaceC7395n
            public final Object invoke(@InterfaceC7396q InterfaceC6618p<? super R> interfaceC6618p, @InterfaceC7396q Object[] objArr, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
                k kVar = new k(interfaceC6216q, this.$transform$inlined);
                kVar.L$0 = interfaceC6618p;
                kVar.L$1 = objArr;
                return kVar.invokeSuspend(was.f36763k);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
            @InterfaceC7395n
            public final Object invokeSuspend(@InterfaceC7396q Object obj) {
                Object objX2 = C6199q.x2();
                int i2 = this.label;
                if (i2 == 0) {
                    C6318m.n7h(obj);
                    InterfaceC6618p interfaceC6618p = (InterfaceC6618p) this.L$0;
                    Object[] objArr = (Object[]) this.L$1;
                    InterfaceC5980i interfaceC5980i = this.$transform$inlined;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    Object obj5 = objArr[3];
                    this.label = 1;
                    kotlin.jvm.internal.d3.m23089n(6);
                    Object objInvoke = interfaceC5980i.invoke(interfaceC6618p, obj2, obj3, obj4, obj5, this);
                    kotlin.jvm.internal.d3.m23089n(7);
                    if (objInvoke == objX2) {
                        return objX2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C6318m.n7h(obj);
                }
                return was.f36763k;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public kja0(InterfaceC6622s[] interfaceC6622sArr, InterfaceC6216q interfaceC6216q, InterfaceC5980i interfaceC5980i) {
            super(2, interfaceC6216q);
            this.$flows = interfaceC6622sArr;
            this.$transform$inlined = interfaceC5980i;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            kja0 kja0Var = new kja0(this.$flows, interfaceC6216q, this.$transform$inlined);
            kja0Var.L$0 = obj;
            return kja0Var;
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q InterfaceC6618p<? super R> interfaceC6618p, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
            return ((kja0) create(interfaceC6618p, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            Object objX2 = C6199q.x2();
            int i2 = this.label;
            if (i2 == 0) {
                C6318m.n7h(obj);
                InterfaceC6618p interfaceC6618p = (InterfaceC6618p) this.L$0;
                InterfaceC6622s[] interfaceC6622sArr = this.$flows;
                InterfaceC5981k interfaceC5981kKi = C6623t.ki();
                k kVar = new k(null, this.$transform$inlined);
                this.label = 1;
                if (kotlinx.coroutines.flow.internal.qrj.m24135k(interfaceC6618p, interfaceC6622sArr, interfaceC5981kKi, kVar, this) == objX2) {
                    return objX2;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6318m.n7h(obj);
            }
            return was.f36763k;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R, T] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.t$ld6 */
    /* JADX INFO: compiled from: Zip.kt */
    @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$6$2", m22756f = "Zip.kt", m22757i = {}, m22758l = {292, 292}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
    @kotlin.d3(bv = {}, d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@"}, d2 = {C0846k.zaso, "R", "Lkotlinx/coroutines/flow/p;", "", "it", "Lkotlin/was;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    public static final class ld6<R, T> extends kotlin.coroutines.jvm.internal.kja0 implements cyoe.cdj<InterfaceC6618p<? super R>, T[], InterfaceC6216q<? super was>, Object> {
        final /* synthetic */ InterfaceC5979h<T[], InterfaceC6216q<? super R>, Object> $transform;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ld6(InterfaceC5979h<? super T[], ? super InterfaceC6216q<? super R>, ? extends Object> interfaceC5979h, InterfaceC6216q<? super ld6> interfaceC6216q) {
            super(3, interfaceC6216q);
            this.$transform = interfaceC5979h;
        }

        @Override // cyoe.cdj
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q InterfaceC6618p<? super R> interfaceC6618p, @InterfaceC7396q T[] tArr, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
            ld6 ld6Var = new ld6(this.$transform, interfaceC6216q);
            ld6Var.L$0 = interfaceC6618p;
            ld6Var.L$1 = tArr;
            return ld6Var.invokeSuspend(was.f36763k);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            InterfaceC6618p interfaceC6618p;
            Object objX2 = C6199q.x2();
            int i2 = this.label;
            if (i2 == 0) {
                C6318m.n7h(obj);
                InterfaceC6618p interfaceC6618p2 = (InterfaceC6618p) this.L$0;
                Object[] objArr = (Object[]) this.L$1;
                InterfaceC5979h<T[], InterfaceC6216q<? super R>, Object> interfaceC5979h = this.$transform;
                this.L$0 = interfaceC6618p2;
                this.label = 1;
                obj = interfaceC5979h.invoke(objArr, this);
                interfaceC6618p = interfaceC6618p2;
                if (obj == objX2) {
                    return objX2;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C6318m.n7h(obj);
                    return was.f36763k;
                }
                InterfaceC6618p interfaceC6618p3 = (InterfaceC6618p) this.L$0;
                C6318m.n7h(obj);
                interfaceC6618p = interfaceC6618p3;
            }
            this.L$0 = null;
            this.label = 2;
            if (interfaceC6618p.emit(obj, this) == objX2) {
                return objX2;
            }
            return was.f36763k;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @InterfaceC7395n
        public final Object invokeSuspend$$forInline(@InterfaceC7396q Object obj) {
            InterfaceC6618p interfaceC6618p = (InterfaceC6618p) this.L$0;
            Object objInvoke = this.$transform.invoke((Object[]) this.L$1, this);
            kotlin.jvm.internal.d3.m23089n(0);
            interfaceC6618p.emit(objInvoke, this);
            kotlin.jvm.internal.d3.m23089n(1);
            return was.f36763k;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.t$n */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/fu4$toq", "Lkotlinx/coroutines/flow/s;", "Lkotlinx/coroutines/flow/p;", "collector", "Lkotlin/was;", "k", "(Lkotlinx/coroutines/flow/p;Lkotlin/coroutines/q;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    public static final class n<R> implements InterfaceC6622s<R> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ InterfaceC6622s[] f37083k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ InterfaceC5979h f37084q;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.t$n$k */
        /* JADX INFO: compiled from: SafeCollector.common.kt */
        @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 176)
        public static final class k extends AbstractC6209q {
            int label;
            /* synthetic */ Object result;

            public k(InterfaceC6216q interfaceC6216q) {
                super(interfaceC6216q);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
            @InterfaceC7395n
            public final Object invokeSuspend(@InterfaceC7396q Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return n.this.mo5262k(null, this);
            }
        }

        public n(InterfaceC6622s[] interfaceC6622sArr, InterfaceC5979h interfaceC5979h) {
            this.f37083k = interfaceC6622sArr;
            this.f37084q = interfaceC5979h;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC6622s
        @InterfaceC7395n
        /* JADX INFO: renamed from: k */
        public Object mo5262k(@InterfaceC7396q InterfaceC6618p<? super R> interfaceC6618p, @InterfaceC7396q InterfaceC6216q<? super was> interfaceC6216q) {
            InterfaceC6622s[] interfaceC6622sArr = this.f37083k;
            kotlin.jvm.internal.d2ok.ni7();
            y yVar = new y(this.f37083k);
            kotlin.jvm.internal.d2ok.ni7();
            Object objM24135k = kotlinx.coroutines.flow.internal.qrj.m24135k(interfaceC6618p, interfaceC6622sArr, yVar, new s(this.f37084q, null), interfaceC6216q);
            return objM24135k == C6199q.x2() ? objM24135k : was.f36763k;
        }

        @InterfaceC7395n
        /* JADX INFO: renamed from: y */
        public Object m24240y(@InterfaceC7396q InterfaceC6618p interfaceC6618p, @InterfaceC7396q InterfaceC6216q interfaceC6216q) {
            kotlin.jvm.internal.d3.m23089n(4);
            new k(interfaceC6216q);
            kotlin.jvm.internal.d3.m23089n(5);
            InterfaceC6622s[] interfaceC6622sArr = this.f37083k;
            kotlin.jvm.internal.d2ok.ni7();
            y yVar = new y(this.f37083k);
            kotlin.jvm.internal.d2ok.ni7();
            s sVar = new s(this.f37084q, null);
            kotlin.jvm.internal.d3.m23089n(0);
            kotlinx.coroutines.flow.internal.qrj.m24135k(interfaceC6618p, interfaceC6622sArr, yVar, sVar, interfaceC6216q);
            kotlin.jvm.internal.d3.m23089n(1);
            return was.f36763k;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.t$n7h */
    /* JADX INFO: compiled from: Zip.kt */
    @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$3", m22756f = "Zip.kt", m22757i = {}, m22758l = {273}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
    @kotlin.d3(bv = {}, d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¨\u0006\u0004"}, d2 = {C0846k.zaso, "R", "Lkotlinx/coroutines/flow/p;", "Lkotlin/was;", "kotlinx/coroutines/flow/t$t8r", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    public static final class n7h<R> extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<InterfaceC6618p<? super R>, InterfaceC6216q<? super was>, Object> {
        final /* synthetic */ InterfaceC6622s[] $flows;
        final /* synthetic */ cyoe.t8r $transform$inlined;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.t$n7h$k */
        /* JADX INFO: compiled from: Zip.kt */
        @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$3$1", m22756f = "Zip.kt", m22757i = {}, m22758l = {333}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
        @kotlin.d3(bv = {}, d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¨\u0006\u0006"}, d2 = {C0846k.zaso, "R", "Lkotlinx/coroutines/flow/p;", "", "it", "Lkotlin/was;", "kotlinx/coroutines/flow/t$t8r$k", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
        public static final class k extends kotlin.coroutines.jvm.internal.kja0 implements cyoe.cdj<InterfaceC6618p<? super R>, Object[], InterfaceC6216q<? super was>, Object> {
            final /* synthetic */ cyoe.t8r $transform$inlined;
            private /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public k(InterfaceC6216q interfaceC6216q, cyoe.t8r t8rVar) {
                super(3, interfaceC6216q);
                this.$transform$inlined = t8rVar;
            }

            @Override // cyoe.cdj
            @InterfaceC7395n
            public final Object invoke(@InterfaceC7396q InterfaceC6618p<? super R> interfaceC6618p, @InterfaceC7396q Object[] objArr, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
                k kVar = new k(interfaceC6216q, this.$transform$inlined);
                kVar.L$0 = interfaceC6618p;
                kVar.L$1 = objArr;
                return kVar.invokeSuspend(was.f36763k);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
            @InterfaceC7395n
            public final Object invokeSuspend(@InterfaceC7396q Object obj) {
                Object objX2 = C6199q.x2();
                int i2 = this.label;
                if (i2 == 0) {
                    C6318m.n7h(obj);
                    InterfaceC6618p interfaceC6618p = (InterfaceC6618p) this.L$0;
                    Object[] objArr = (Object[]) this.L$1;
                    cyoe.t8r t8rVar = this.$transform$inlined;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    this.label = 1;
                    kotlin.jvm.internal.d3.m23089n(6);
                    Object objInvoke = t8rVar.invoke(interfaceC6618p, obj2, obj3, obj4, this);
                    kotlin.jvm.internal.d3.m23089n(7);
                    if (objInvoke == objX2) {
                        return objX2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C6318m.n7h(obj);
                }
                return was.f36763k;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n7h(InterfaceC6622s[] interfaceC6622sArr, InterfaceC6216q interfaceC6216q, cyoe.t8r t8rVar) {
            super(2, interfaceC6216q);
            this.$flows = interfaceC6622sArr;
            this.$transform$inlined = t8rVar;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            n7h n7hVar = new n7h(this.$flows, interfaceC6216q, this.$transform$inlined);
            n7hVar.L$0 = obj;
            return n7hVar;
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q InterfaceC6618p<? super R> interfaceC6618p, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
            return ((n7h) create(interfaceC6618p, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            Object objX2 = C6199q.x2();
            int i2 = this.label;
            if (i2 == 0) {
                C6318m.n7h(obj);
                InterfaceC6618p interfaceC6618p = (InterfaceC6618p) this.L$0;
                InterfaceC6622s[] interfaceC6622sArr = this.$flows;
                InterfaceC5981k interfaceC5981kKi = C6623t.ki();
                k kVar = new k(null, this.$transform$inlined);
                this.label = 1;
                if (kotlinx.coroutines.flow.internal.qrj.m24135k(interfaceC6618p, interfaceC6622sArr, interfaceC5981kKi, kVar, this) == objX2) {
                    return objX2;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6318m.n7h(obj);
            }
            return was.f36763k;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.t$p */
    /* JADX INFO: compiled from: Zip.kt */
    @kotlin.d3(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\u0010\u0000\u001a\f\u0012\u0006\u0012\u0004\u0018\u0001H\u0002\u0018\u00010\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0004\b\u0001\u0010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", C0846k.zaso, "R", "invoke", "()[Ljava/lang/Object;"}, m22787k = 3, mv = {1, 6, 0}, xi = 176)
    static final class p<T> extends AbstractC6308r implements InterfaceC5981k<T[]> {
        final /* synthetic */ InterfaceC6622s<T>[] $flowArray;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(InterfaceC6622s<T>[] interfaceC6622sArr) {
            super(0);
            this.$flowArray = interfaceC6622sArr;
        }

        @Override // cyoe.InterfaceC5981k
        @InterfaceC7395n
        public final T[] invoke() {
            int length = this.$flowArray.length;
            kotlin.jvm.internal.d2ok.m23086z(0, "T?");
            return (T[]) new Object[length];
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.t$q */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/fu4$toq", "Lkotlinx/coroutines/flow/s;", "Lkotlinx/coroutines/flow/p;", "collector", "Lkotlin/was;", "k", "(Lkotlinx/coroutines/flow/p;Lkotlin/coroutines/q;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    public static final class q<R> implements InterfaceC6622s<R> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ InterfaceC6622s f37085k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ cyoe.cdj f37086n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ InterfaceC6622s f37087q;

        public q(InterfaceC6622s interfaceC6622s, InterfaceC6622s interfaceC6622s2, cyoe.cdj cdjVar) {
            this.f37085k = interfaceC6622s;
            this.f37087q = interfaceC6622s2;
            this.f37086n = cdjVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC6622s
        @InterfaceC7395n
        /* JADX INFO: renamed from: k */
        public Object mo5262k(@InterfaceC7396q InterfaceC6618p<? super R> interfaceC6618p, @InterfaceC7396q InterfaceC6216q<? super was> interfaceC6216q) {
            Object objM24135k = kotlinx.coroutines.flow.internal.qrj.m24135k(interfaceC6618p, new InterfaceC6622s[]{this.f37085k, this.f37087q}, C6623t.ki(), new f7l8(this.f37086n, null), interfaceC6216q);
            return objM24135k == C6199q.x2() ? objM24135k : was.f36763k;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.t$qrj */
    /* JADX INFO: compiled from: Zip.kt */
    @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$2", m22756f = "Zip.kt", m22757i = {}, m22758l = {273}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
    @kotlin.d3(bv = {}, d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¨\u0006\u0004"}, d2 = {C0846k.zaso, "R", "Lkotlinx/coroutines/flow/p;", "Lkotlin/was;", "kotlinx/coroutines/flow/t$t8r", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    public static final class qrj<R> extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<InterfaceC6618p<? super R>, InterfaceC6216q<? super was>, Object> {
        final /* synthetic */ InterfaceC6622s[] $flows;
        final /* synthetic */ cyoe.ki $transform$inlined;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.t$qrj$k */
        /* JADX INFO: compiled from: Zip.kt */
        @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$2$1", m22756f = "Zip.kt", m22757i = {}, m22758l = {333}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
        @kotlin.d3(bv = {}, d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¨\u0006\u0006"}, d2 = {C0846k.zaso, "R", "Lkotlinx/coroutines/flow/p;", "", "it", "Lkotlin/was;", "kotlinx/coroutines/flow/t$t8r$k", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
        public static final class k extends kotlin.coroutines.jvm.internal.kja0 implements cyoe.cdj<InterfaceC6618p<? super R>, Object[], InterfaceC6216q<? super was>, Object> {
            final /* synthetic */ cyoe.ki $transform$inlined;
            private /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public k(InterfaceC6216q interfaceC6216q, cyoe.ki kiVar) {
                super(3, interfaceC6216q);
                this.$transform$inlined = kiVar;
            }

            @Override // cyoe.cdj
            @InterfaceC7395n
            public final Object invoke(@InterfaceC7396q InterfaceC6618p<? super R> interfaceC6618p, @InterfaceC7396q Object[] objArr, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
                k kVar = new k(interfaceC6216q, this.$transform$inlined);
                kVar.L$0 = interfaceC6618p;
                kVar.L$1 = objArr;
                return kVar.invokeSuspend(was.f36763k);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
            @InterfaceC7395n
            public final Object invokeSuspend(@InterfaceC7396q Object obj) {
                Object objX2 = C6199q.x2();
                int i2 = this.label;
                if (i2 == 0) {
                    C6318m.n7h(obj);
                    InterfaceC6618p interfaceC6618p = (InterfaceC6618p) this.L$0;
                    Object[] objArr = (Object[]) this.L$1;
                    cyoe.ki kiVar = this.$transform$inlined;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    this.label = 1;
                    kotlin.jvm.internal.d3.m23089n(6);
                    Object objInvoke = kiVar.invoke(interfaceC6618p, obj2, obj3, this);
                    kotlin.jvm.internal.d3.m23089n(7);
                    if (objInvoke == objX2) {
                        return objX2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C6318m.n7h(obj);
                }
                return was.f36763k;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public qrj(InterfaceC6622s[] interfaceC6622sArr, InterfaceC6216q interfaceC6216q, cyoe.ki kiVar) {
            super(2, interfaceC6216q);
            this.$flows = interfaceC6622sArr;
            this.$transform$inlined = kiVar;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            qrj qrjVar = new qrj(this.$flows, interfaceC6216q, this.$transform$inlined);
            qrjVar.L$0 = obj;
            return qrjVar;
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q InterfaceC6618p<? super R> interfaceC6618p, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
            return ((qrj) create(interfaceC6618p, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            Object objX2 = C6199q.x2();
            int i2 = this.label;
            if (i2 == 0) {
                C6318m.n7h(obj);
                InterfaceC6618p interfaceC6618p = (InterfaceC6618p) this.L$0;
                InterfaceC6622s[] interfaceC6622sArr = this.$flows;
                InterfaceC5981k interfaceC5981kKi = C6623t.ki();
                k kVar = new k(null, this.$transform$inlined);
                this.label = 1;
                if (kotlinx.coroutines.flow.internal.qrj.m24135k(interfaceC6618p, interfaceC6622sArr, interfaceC5981kKi, kVar, this) == objX2) {
                    return objX2;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6318m.n7h(obj);
            }
            return was.f36763k;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R, T] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.t$s */
    /* JADX INFO: compiled from: Zip.kt */
    @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$5$2", m22756f = "Zip.kt", m22757i = {}, m22758l = {238, 238}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
    @kotlin.d3(bv = {}, d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@"}, d2 = {C0846k.zaso, "R", "Lkotlinx/coroutines/flow/p;", "", "it", "Lkotlin/was;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    public static final class s<R, T> extends kotlin.coroutines.jvm.internal.kja0 implements cyoe.cdj<InterfaceC6618p<? super R>, T[], InterfaceC6216q<? super was>, Object> {
        final /* synthetic */ InterfaceC5979h<T[], InterfaceC6216q<? super R>, Object> $transform;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public s(InterfaceC5979h<? super T[], ? super InterfaceC6216q<? super R>, ? extends Object> interfaceC5979h, InterfaceC6216q<? super s> interfaceC6216q) {
            super(3, interfaceC6216q);
            this.$transform = interfaceC5979h;
        }

        @Override // cyoe.cdj
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q InterfaceC6618p<? super R> interfaceC6618p, @InterfaceC7396q T[] tArr, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
            s sVar = new s(this.$transform, interfaceC6216q);
            sVar.L$0 = interfaceC6618p;
            sVar.L$1 = tArr;
            return sVar.invokeSuspend(was.f36763k);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            InterfaceC6618p interfaceC6618p;
            Object objX2 = C6199q.x2();
            int i2 = this.label;
            if (i2 == 0) {
                C6318m.n7h(obj);
                InterfaceC6618p interfaceC6618p2 = (InterfaceC6618p) this.L$0;
                Object[] objArr = (Object[]) this.L$1;
                InterfaceC5979h<T[], InterfaceC6216q<? super R>, Object> interfaceC5979h = this.$transform;
                this.L$0 = interfaceC6618p2;
                this.label = 1;
                obj = interfaceC5979h.invoke(objArr, this);
                interfaceC6618p = interfaceC6618p2;
                if (obj == objX2) {
                    return objX2;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C6318m.n7h(obj);
                    return was.f36763k;
                }
                InterfaceC6618p interfaceC6618p3 = (InterfaceC6618p) this.L$0;
                C6318m.n7h(obj);
                interfaceC6618p = interfaceC6618p3;
            }
            this.L$0 = null;
            this.label = 2;
            if (interfaceC6618p.emit(obj, this) == objX2) {
                return objX2;
            }
            return was.f36763k;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @InterfaceC7395n
        public final Object invokeSuspend$$forInline(@InterfaceC7396q Object obj) {
            InterfaceC6618p interfaceC6618p = (InterfaceC6618p) this.L$0;
            Object objInvoke = this.$transform.invoke((Object[]) this.L$1, this);
            kotlin.jvm.internal.d3.m23089n(0);
            interfaceC6618p.emit(objInvoke, this);
            kotlin.jvm.internal.d3.m23089n(1);
            return was.f36763k;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.t$t8r */
    /* JADX INFO: compiled from: Zip.kt */
    @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransformUnsafe$1", m22756f = "Zip.kt", m22757i = {}, m22758l = {273}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
    @kotlin.d3(bv = {}, d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@"}, d2 = {C0846k.zaso, "R", "Lkotlinx/coroutines/flow/p;", "Lkotlin/was;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    public static final class t8r<R> extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<InterfaceC6618p<? super R>, InterfaceC6216q<? super was>, Object> {
        final /* synthetic */ InterfaceC6622s<T>[] $flows;
        final /* synthetic */ cyoe.cdj<InterfaceC6618p<? super R>, T[], InterfaceC6216q<? super was>, Object> $transform;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: Add missing generic type declarations: [T] */
        /* JADX INFO: renamed from: kotlinx.coroutines.flow.t$t8r$k */
        /* JADX INFO: compiled from: Zip.kt */
        @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransformUnsafe$1$1", m22756f = "Zip.kt", m22757i = {}, m22758l = {273}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
        @kotlin.d3(bv = {}, d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@"}, d2 = {C0846k.zaso, "R", "Lkotlinx/coroutines/flow/p;", "", "it", "Lkotlin/was;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
        public static final class k<T> extends kotlin.coroutines.jvm.internal.kja0 implements cyoe.cdj<InterfaceC6618p<? super R>, T[], InterfaceC6216q<? super was>, Object> {
            final /* synthetic */ cyoe.cdj<InterfaceC6618p<? super R>, T[], InterfaceC6216q<? super was>, Object> $transform;
            private /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public k(cyoe.cdj<? super InterfaceC6618p<? super R>, ? super T[], ? super InterfaceC6216q<? super was>, ? extends Object> cdjVar, InterfaceC6216q<? super k> interfaceC6216q) {
                super(3, interfaceC6216q);
                this.$transform = cdjVar;
            }

            @Override // cyoe.cdj
            @InterfaceC7395n
            public final Object invoke(@InterfaceC7396q InterfaceC6618p<? super R> interfaceC6618p, @InterfaceC7396q T[] tArr, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
                k kVar = new k(this.$transform, interfaceC6216q);
                kVar.L$0 = interfaceC6618p;
                kVar.L$1 = tArr;
                return kVar.invokeSuspend(was.f36763k);
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
            @InterfaceC7395n
            public final Object invokeSuspend(@InterfaceC7396q Object obj) {
                Object objX2 = C6199q.x2();
                int i2 = this.label;
                if (i2 == 0) {
                    C6318m.n7h(obj);
                    InterfaceC6618p<? super R> interfaceC6618p = (InterfaceC6618p) this.L$0;
                    Object[] objArr = (Object[]) this.L$1;
                    cyoe.cdj<InterfaceC6618p<? super R>, T[], InterfaceC6216q<? super was>, Object> cdjVar = this.$transform;
                    this.L$0 = null;
                    this.label = 1;
                    if (cdjVar.invoke(interfaceC6618p, objArr, this) == objX2) {
                        return objX2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C6318m.n7h(obj);
                }
                return was.f36763k;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @InterfaceC7395n
            public final Object invokeSuspend$$forInline(@InterfaceC7396q Object obj) {
                this.$transform.invoke((InterfaceC6618p) this.L$0, (Object[]) this.L$1, this);
                return was.f36763k;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public t8r(InterfaceC6622s<? extends T>[] interfaceC6622sArr, cyoe.cdj<? super InterfaceC6618p<? super R>, ? super T[], ? super InterfaceC6216q<? super was>, ? extends Object> cdjVar, InterfaceC6216q<? super t8r> interfaceC6216q) {
            super(2, interfaceC6216q);
            this.$flows = interfaceC6622sArr;
            this.$transform = cdjVar;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            t8r t8rVar = new t8r(this.$flows, this.$transform, interfaceC6216q);
            t8rVar.L$0 = obj;
            return t8rVar;
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q InterfaceC6618p<? super R> interfaceC6618p, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
            return ((t8r) create(interfaceC6618p, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            Object objX2 = C6199q.x2();
            int i2 = this.label;
            if (i2 == 0) {
                C6318m.n7h(obj);
                InterfaceC6618p interfaceC6618p = (InterfaceC6618p) this.L$0;
                InterfaceC6622s<T>[] interfaceC6622sArr = this.$flows;
                InterfaceC5981k interfaceC5981kKi = C6623t.ki();
                kotlin.jvm.internal.d2ok.ni7();
                k kVar = new k(this.$transform, null);
                this.label = 1;
                if (kotlinx.coroutines.flow.internal.qrj.m24135k(interfaceC6618p, interfaceC6622sArr, interfaceC5981kKi, kVar, this) == objX2) {
                    return objX2;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6318m.n7h(obj);
            }
            return was.f36763k;
        }

        @InterfaceC7395n
        public final Object invokeSuspend$$forInline(@InterfaceC7396q Object obj) {
            InterfaceC6618p interfaceC6618p = (InterfaceC6618p) this.L$0;
            InterfaceC6622s<T>[] interfaceC6622sArr = this.$flows;
            InterfaceC5981k interfaceC5981kKi = C6623t.ki();
            kotlin.jvm.internal.d2ok.ni7();
            k kVar = new k(this.$transform, null);
            kotlin.jvm.internal.d3.m23089n(0);
            kotlinx.coroutines.flow.internal.qrj.m24135k(interfaceC6618p, interfaceC6622sArr, interfaceC5981kKi, kVar, this);
            kotlin.jvm.internal.d3.m23089n(1);
            return was.f36763k;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.t$toq */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/s;", "Lkotlinx/coroutines/flow/p;", "collector", "Lkotlin/was;", "k", "(Lkotlinx/coroutines/flow/p;Lkotlin/coroutines/q;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/t$i"}, m22787k = 1, mv = {1, 6, 0})
    public static final class toq<R> implements InterfaceC6622s<R> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ InterfaceC6622s[] f37088k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ cyoe.t8r f37089q;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.t$toq$k */
        /* JADX INFO: compiled from: Zip.kt */
        @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2$2", m22756f = "Zip.kt", m22757i = {}, m22758l = {333, 333}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
        @kotlin.d3(bv = {}, d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¨\u0006\u0006"}, d2 = {C0846k.zaso, "R", "Lkotlinx/coroutines/flow/p;", "", "it", "Lkotlin/was;", "kotlinx/coroutines/flow/t$fn3e", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
        public static final class k extends kotlin.coroutines.jvm.internal.kja0 implements cyoe.cdj<InterfaceC6618p<? super R>, Object[], InterfaceC6216q<? super was>, Object> {
            final /* synthetic */ cyoe.t8r $transform$inlined;
            private /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public k(InterfaceC6216q interfaceC6216q, cyoe.t8r t8rVar) {
                super(3, interfaceC6216q);
                this.$transform$inlined = t8rVar;
            }

            @Override // cyoe.cdj
            @InterfaceC7395n
            public final Object invoke(@InterfaceC7396q InterfaceC6618p<? super R> interfaceC6618p, @InterfaceC7396q Object[] objArr, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
                k kVar = new k(interfaceC6216q, this.$transform$inlined);
                kVar.L$0 = interfaceC6618p;
                kVar.L$1 = objArr;
                return kVar.invokeSuspend(was.f36763k);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
            @InterfaceC7395n
            public final Object invokeSuspend(@InterfaceC7396q Object obj) {
                InterfaceC6618p interfaceC6618p;
                Object objX2 = C6199q.x2();
                int i2 = this.label;
                if (i2 == 0) {
                    C6318m.n7h(obj);
                    interfaceC6618p = (InterfaceC6618p) this.L$0;
                    Object[] objArr = (Object[]) this.L$1;
                    cyoe.t8r t8rVar = this.$transform$inlined;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    Object obj5 = objArr[3];
                    this.L$0 = interfaceC6618p;
                    this.label = 1;
                    kotlin.jvm.internal.d3.m23089n(6);
                    obj = t8rVar.invoke(obj2, obj3, obj4, obj5, this);
                    kotlin.jvm.internal.d3.m23089n(7);
                    if (obj == objX2) {
                        return objX2;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C6318m.n7h(obj);
                        return was.f36763k;
                    }
                    interfaceC6618p = (InterfaceC6618p) this.L$0;
                    C6318m.n7h(obj);
                }
                this.L$0 = null;
                this.label = 2;
                if (interfaceC6618p.emit(obj, this) == objX2) {
                    return objX2;
                }
                return was.f36763k;
            }
        }

        public toq(InterfaceC6622s[] interfaceC6622sArr, cyoe.t8r t8rVar) {
            this.f37088k = interfaceC6622sArr;
            this.f37089q = t8rVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC6622s
        @InterfaceC7395n
        /* JADX INFO: renamed from: k */
        public Object mo5262k(@InterfaceC7396q InterfaceC6618p interfaceC6618p, @InterfaceC7396q InterfaceC6216q interfaceC6216q) {
            Object objM24135k = kotlinx.coroutines.flow.internal.qrj.m24135k(interfaceC6618p, this.f37088k, C6623t.ki(), new k(null, this.f37089q), interfaceC6216q);
            return objM24135k == C6199q.x2() ? objM24135k : was.f36763k;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.t$x2 */
    /* JADX INFO: compiled from: Zip.kt */
    @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$1", m22756f = "Zip.kt", m22757i = {}, m22758l = {273}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
    @kotlin.d3(bv = {}, d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¨\u0006\u0004"}, d2 = {C0846k.zaso, "R", "Lkotlinx/coroutines/flow/p;", "Lkotlin/was;", "kotlinx/coroutines/flow/t$t8r", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    public static final class x2<R> extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<InterfaceC6618p<? super R>, InterfaceC6216q<? super was>, Object> {
        final /* synthetic */ InterfaceC6622s[] $flows;
        final /* synthetic */ cyoe.ki $transform$inlined;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.t$x2$k */
        /* JADX INFO: compiled from: Zip.kt */
        @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$1$1", m22756f = "Zip.kt", m22757i = {}, m22758l = {333}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
        @kotlin.d3(bv = {}, d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¨\u0006\u0006"}, d2 = {C0846k.zaso, "R", "Lkotlinx/coroutines/flow/p;", "", "it", "Lkotlin/was;", "kotlinx/coroutines/flow/t$t8r$k", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
        public static final class k extends kotlin.coroutines.jvm.internal.kja0 implements cyoe.cdj<InterfaceC6618p<? super R>, Object[], InterfaceC6216q<? super was>, Object> {
            final /* synthetic */ cyoe.ki $transform$inlined;
            private /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public k(InterfaceC6216q interfaceC6216q, cyoe.ki kiVar) {
                super(3, interfaceC6216q);
                this.$transform$inlined = kiVar;
            }

            @Override // cyoe.cdj
            @InterfaceC7395n
            public final Object invoke(@InterfaceC7396q InterfaceC6618p<? super R> interfaceC6618p, @InterfaceC7396q Object[] objArr, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
                k kVar = new k(interfaceC6216q, this.$transform$inlined);
                kVar.L$0 = interfaceC6618p;
                kVar.L$1 = objArr;
                return kVar.invokeSuspend(was.f36763k);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
            @InterfaceC7395n
            public final Object invokeSuspend(@InterfaceC7396q Object obj) {
                Object objX2 = C6199q.x2();
                int i2 = this.label;
                if (i2 == 0) {
                    C6318m.n7h(obj);
                    InterfaceC6618p interfaceC6618p = (InterfaceC6618p) this.L$0;
                    Object[] objArr = (Object[]) this.L$1;
                    cyoe.ki kiVar = this.$transform$inlined;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    this.label = 1;
                    kotlin.jvm.internal.d3.m23089n(6);
                    Object objInvoke = kiVar.invoke(interfaceC6618p, obj2, obj3, this);
                    kotlin.jvm.internal.d3.m23089n(7);
                    if (objInvoke == objX2) {
                        return objX2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C6318m.n7h(obj);
                }
                return was.f36763k;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x2(InterfaceC6622s[] interfaceC6622sArr, InterfaceC6216q interfaceC6216q, cyoe.ki kiVar) {
            super(2, interfaceC6216q);
            this.$flows = interfaceC6622sArr;
            this.$transform$inlined = kiVar;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            x2 x2Var = new x2(this.$flows, interfaceC6216q, this.$transform$inlined);
            x2Var.L$0 = obj;
            return x2Var;
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q InterfaceC6618p<? super R> interfaceC6618p, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
            return ((x2) create(interfaceC6618p, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            Object objX2 = C6199q.x2();
            int i2 = this.label;
            if (i2 == 0) {
                C6318m.n7h(obj);
                InterfaceC6618p interfaceC6618p = (InterfaceC6618p) this.L$0;
                InterfaceC6622s[] interfaceC6622sArr = this.$flows;
                InterfaceC5981k interfaceC5981kKi = C6623t.ki();
                k kVar = new k(null, this.$transform$inlined);
                this.label = 1;
                if (kotlinx.coroutines.flow.internal.qrj.m24135k(interfaceC6618p, interfaceC6622sArr, interfaceC5981kKi, kVar, this) == objX2) {
                    return objX2;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6318m.n7h(obj);
            }
            return was.f36763k;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.t$y */
    /* JADX INFO: compiled from: Zip.kt */
    @kotlin.d3(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\u0010\u0000\u001a\f\u0012\u0006\u0012\u0004\u0018\u0001H\u0002\u0018\u00010\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0004\b\u0001\u0010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", C0846k.zaso, "R", "invoke", "()[Ljava/lang/Object;"}, m22787k = 3, mv = {1, 6, 0}, xi = 176)
    static final class y<T> extends AbstractC6308r implements InterfaceC5981k<T[]> {
        final /* synthetic */ InterfaceC6622s<T>[] $flows;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public y(InterfaceC6622s<? extends T>[] interfaceC6622sArr) {
            super(0);
            this.$flows = interfaceC6622sArr;
        }

        @Override // cyoe.InterfaceC5981k
        @InterfaceC7395n
        public final T[] invoke() {
            int length = this.$flows.length;
            kotlin.jvm.internal.d2ok.m23086z(0, "T?");
            return (T[]) new Object[length];
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.t$zurt */
    /* JADX INFO: compiled from: Zip.kt */
    @kotlin.d3(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", C0846k.zaso, "invoke"}, m22787k = 3, mv = {1, 6, 0}, xi = 48)
    static final class zurt extends AbstractC6308r implements InterfaceC5981k {
        public static final zurt INSTANCE = new zurt();

        zurt() {
            super(0);
        }

        @Override // cyoe.InterfaceC5981k
        @InterfaceC7395n
        public final Void invoke() {
            return null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.t$zy */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/s;", "Lkotlinx/coroutines/flow/p;", "collector", "Lkotlin/was;", "k", "(Lkotlinx/coroutines/flow/p;Lkotlin/coroutines/q;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/t$i"}, m22787k = 1, mv = {1, 6, 0})
    public static final class zy<R> implements InterfaceC6622s<R> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ InterfaceC6622s[] f37090k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ InterfaceC5980i f37091q;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.t$zy$k */
        /* JADX INFO: compiled from: Zip.kt */
        @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2", m22756f = "Zip.kt", m22757i = {}, m22758l = {333, 333}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
        @kotlin.d3(bv = {}, d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¨\u0006\u0006"}, d2 = {C0846k.zaso, "R", "Lkotlinx/coroutines/flow/p;", "", "it", "Lkotlin/was;", "kotlinx/coroutines/flow/t$fn3e", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
        public static final class k extends kotlin.coroutines.jvm.internal.kja0 implements cyoe.cdj<InterfaceC6618p<? super R>, Object[], InterfaceC6216q<? super was>, Object> {
            final /* synthetic */ InterfaceC5980i $transform$inlined;
            private /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public k(InterfaceC6216q interfaceC6216q, InterfaceC5980i interfaceC5980i) {
                super(3, interfaceC6216q);
                this.$transform$inlined = interfaceC5980i;
            }

            @Override // cyoe.cdj
            @InterfaceC7395n
            public final Object invoke(@InterfaceC7396q InterfaceC6618p<? super R> interfaceC6618p, @InterfaceC7396q Object[] objArr, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
                k kVar = new k(interfaceC6216q, this.$transform$inlined);
                kVar.L$0 = interfaceC6618p;
                kVar.L$1 = objArr;
                return kVar.invokeSuspend(was.f36763k);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
            @InterfaceC7395n
            public final Object invokeSuspend(@InterfaceC7396q Object obj) {
                InterfaceC6618p interfaceC6618p;
                Object objX2 = C6199q.x2();
                int i2 = this.label;
                if (i2 == 0) {
                    C6318m.n7h(obj);
                    interfaceC6618p = (InterfaceC6618p) this.L$0;
                    Object[] objArr = (Object[]) this.L$1;
                    InterfaceC5980i interfaceC5980i = this.$transform$inlined;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    Object obj5 = objArr[3];
                    Object obj6 = objArr[4];
                    this.L$0 = interfaceC6618p;
                    this.label = 1;
                    kotlin.jvm.internal.d3.m23089n(6);
                    obj = interfaceC5980i.invoke(obj2, obj3, obj4, obj5, obj6, this);
                    kotlin.jvm.internal.d3.m23089n(7);
                    if (obj == objX2) {
                        return objX2;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C6318m.n7h(obj);
                        return was.f36763k;
                    }
                    interfaceC6618p = (InterfaceC6618p) this.L$0;
                    C6318m.n7h(obj);
                }
                this.L$0 = null;
                this.label = 2;
                if (interfaceC6618p.emit(obj, this) == objX2) {
                    return objX2;
                }
                return was.f36763k;
            }
        }

        public zy(InterfaceC6622s[] interfaceC6622sArr, InterfaceC5980i interfaceC5980i) {
            this.f37090k = interfaceC6622sArr;
            this.f37091q = interfaceC5980i;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC6622s
        @InterfaceC7395n
        /* JADX INFO: renamed from: k */
        public Object mo5262k(@InterfaceC7396q InterfaceC6618p interfaceC6618p, @InterfaceC7396q InterfaceC6216q interfaceC6216q) {
            Object objM24135k = kotlinx.coroutines.flow.internal.qrj.m24135k(interfaceC6618p, this.f37090k, C6623t.ki(), new k(null, this.f37091q), interfaceC6216q);
            return objM24135k == C6199q.x2() ? objM24135k : was.f36763k;
        }
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "flowCombineTransform")
    public static final <T1, T2, R> InterfaceC6622s<R> cdj(@InterfaceC7396q InterfaceC6622s<? extends T1> interfaceC6622s, @InterfaceC7396q InterfaceC6622s<? extends T2> interfaceC6622s2, @InterfaceC7396q @kotlin.toq cyoe.ki<? super InterfaceC6618p<? super R>, ? super T1, ? super T2, ? super InterfaceC6216q<? super was>, ? extends Object> kiVar) {
        return kotlinx.coroutines.flow.ld6.tfm(new x2(new InterfaceC6622s[]{interfaceC6622s, interfaceC6622s2}, null, kiVar));
    }

    public static final /* synthetic */ <T, R> InterfaceC6622s<R> f7l8(InterfaceC6622s<? extends T>[] interfaceC6622sArr, InterfaceC5979h<? super T[], ? super InterfaceC6216q<? super R>, ? extends Object> interfaceC5979h) {
        kotlin.jvm.internal.d2ok.ni7();
        return new n(interfaceC6622sArr, interfaceC5979h);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: g */
    public static final <T1, T2, T3, T4, T5, R> InterfaceC6622s<R> m24230g(@InterfaceC7396q InterfaceC6622s<? extends T1> interfaceC6622s, @InterfaceC7396q InterfaceC6622s<? extends T2> interfaceC6622s2, @InterfaceC7396q InterfaceC6622s<? extends T3> interfaceC6622s3, @InterfaceC7396q InterfaceC6622s<? extends T4> interfaceC6622s4, @InterfaceC7396q InterfaceC6622s<? extends T5> interfaceC6622s5, @InterfaceC7396q InterfaceC5980i<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super InterfaceC6216q<? super R>, ? extends Object> interfaceC5980i) {
        return new zy(new InterfaceC6622s[]{interfaceC6622s, interfaceC6622s2, interfaceC6622s3, interfaceC6622s4, interfaceC6622s5}, interfaceC5980i);
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "flowCombine")
    /* JADX INFO: renamed from: h */
    public static final <T1, T2, R> InterfaceC6622s<R> m24231h(@InterfaceC7396q InterfaceC6622s<? extends T1> interfaceC6622s, @InterfaceC7396q InterfaceC6622s<? extends T2> interfaceC6622s2, @InterfaceC7396q cyoe.cdj<? super T1, ? super T2, ? super InterfaceC6216q<? super R>, ? extends Object> cdjVar) {
        return new q(interfaceC6622s, interfaceC6622s2, cdjVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> InterfaceC5981k<T[]> ki() {
        return zurt.INSTANCE;
    }

    private static final /* synthetic */ <T, R> InterfaceC6622s<R> kja0(InterfaceC6622s<? extends T>[] interfaceC6622sArr, InterfaceC5979h<? super T[], ? super InterfaceC6216q<? super R>, ? extends Object> interfaceC5979h) {
        kotlin.jvm.internal.d2ok.ni7();
        return new i(interfaceC6622sArr, interfaceC5979h);
    }

    @InterfaceC7396q
    public static final <T1, T2, T3, T4, R> InterfaceC6622s<R> ld6(@InterfaceC7396q InterfaceC6622s<? extends T1> interfaceC6622s, @InterfaceC7396q InterfaceC6622s<? extends T2> interfaceC6622s2, @InterfaceC7396q InterfaceC6622s<? extends T3> interfaceC6622s3, @InterfaceC7396q InterfaceC6622s<? extends T4> interfaceC6622s4, @InterfaceC7396q @kotlin.toq InterfaceC5980i<? super InterfaceC6618p<? super R>, ? super T1, ? super T2, ? super T3, ? super T4, ? super InterfaceC6216q<? super was>, ? extends Object> interfaceC5980i) {
        return kotlinx.coroutines.flow.ld6.tfm(new kja0(new InterfaceC6622s[]{interfaceC6622s, interfaceC6622s2, interfaceC6622s3, interfaceC6622s4}, null, interfaceC5980i));
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: n */
    public static final <T1, T2, T3, T4, R> InterfaceC6622s<R> m24233n(@InterfaceC7396q InterfaceC6622s<? extends T1> interfaceC6622s, @InterfaceC7396q InterfaceC6622s<? extends T2> interfaceC6622s2, @InterfaceC7396q InterfaceC6622s<? extends T3> interfaceC6622s3, @InterfaceC7396q InterfaceC6622s<? extends T4> interfaceC6622s4, @InterfaceC7396q cyoe.t8r<? super T1, ? super T2, ? super T3, ? super T4, ? super InterfaceC6216q<? super R>, ? extends Object> t8rVar) {
        return new toq(new InterfaceC6622s[]{interfaceC6622s, interfaceC6622s2, interfaceC6622s3, interfaceC6622s4}, t8rVar);
    }

    private static final /* synthetic */ <T, R> InterfaceC6622s<R> n7h(InterfaceC6622s<? extends T>[] interfaceC6622sArr, @kotlin.toq cyoe.cdj<? super InterfaceC6618p<? super R>, ? super T[], ? super InterfaceC6216q<? super was>, ? extends Object> cdjVar) {
        kotlin.jvm.internal.d2ok.ni7();
        return kotlinx.coroutines.flow.ld6.tfm(new t8r(interfaceC6622sArr, cdjVar, null));
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: p */
    public static final <T1, T2, T3, R> InterfaceC6622s<R> m24234p(@InterfaceC7396q InterfaceC6622s<? extends T1> interfaceC6622s, @InterfaceC7396q InterfaceC6622s<? extends T2> interfaceC6622s2, @InterfaceC7396q InterfaceC6622s<? extends T3> interfaceC6622s3, @InterfaceC7396q @kotlin.toq cyoe.t8r<? super InterfaceC6618p<? super R>, ? super T1, ? super T2, ? super T3, ? super InterfaceC6216q<? super was>, ? extends Object> t8rVar) {
        return kotlinx.coroutines.flow.ld6.tfm(new n7h(new InterfaceC6622s[]{interfaceC6622s, interfaceC6622s2, interfaceC6622s3}, null, t8rVar));
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: q */
    public static final <T1, T2, T3, R> InterfaceC6622s<R> m24235q(@InterfaceC7396q InterfaceC6622s<? extends T1> interfaceC6622s, @InterfaceC7396q InterfaceC6622s<? extends T2> interfaceC6622s2, @InterfaceC7396q InterfaceC6622s<? extends T3> interfaceC6622s3, @InterfaceC7396q @kotlin.toq cyoe.ki<? super T1, ? super T2, ? super T3, ? super InterfaceC6216q<? super R>, ? extends Object> kiVar) {
        return new k(new InterfaceC6622s[]{interfaceC6622s, interfaceC6622s2, interfaceC6622s3}, kiVar);
    }

    public static final /* synthetic */ <T, R> InterfaceC6622s<R> qrj(InterfaceC6622s<? extends T>[] interfaceC6622sArr, @kotlin.toq cyoe.cdj<? super InterfaceC6618p<? super R>, ? super T[], ? super InterfaceC6216q<? super was>, ? extends Object> cdjVar) {
        kotlin.jvm.internal.d2ok.ni7();
        return kotlinx.coroutines.flow.ld6.tfm(new cdj(interfaceC6622sArr, cdjVar, null));
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: s */
    public static final <T1, T2, R> InterfaceC6622s<R> m24236s(@InterfaceC7396q InterfaceC6622s<? extends T1> interfaceC6622s, @InterfaceC7396q InterfaceC6622s<? extends T2> interfaceC6622s2, @InterfaceC7396q @kotlin.toq cyoe.ki<? super InterfaceC6618p<? super R>, ? super T1, ? super T2, ? super InterfaceC6216q<? super was>, ? extends Object> kiVar) {
        return kotlinx.coroutines.flow.ld6.tfm(new qrj(new InterfaceC6622s[]{interfaceC6622s, interfaceC6622s2}, null, kiVar));
    }

    @InterfaceC7396q
    public static final <T1, T2, R> InterfaceC6622s<R> t8r(@InterfaceC7396q InterfaceC6622s<? extends T1> interfaceC6622s, @InterfaceC7396q InterfaceC6622s<? extends T2> interfaceC6622s2, @InterfaceC7396q cyoe.cdj<? super T1, ? super T2, ? super InterfaceC6216q<? super R>, ? extends Object> cdjVar) {
        return kotlinx.coroutines.flow.internal.qrj.toq(interfaceC6622s, interfaceC6622s2, cdjVar);
    }

    public static final /* synthetic */ <T, R> InterfaceC6622s<R> toq(Iterable<? extends InterfaceC6622s<? extends T>> iterable, InterfaceC5979h<? super T[], ? super InterfaceC6216q<? super R>, ? extends Object> interfaceC5979h) {
        Object[] array = kotlin.collections.a9.wr(iterable).toArray(new InterfaceC6622s[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        kotlin.jvm.internal.d2ok.ni7();
        return new g((InterfaceC6622s[]) array, interfaceC5979h);
    }

    @InterfaceC7396q
    public static final <T1, T2, T3, T4, T5, R> InterfaceC6622s<R> x2(@InterfaceC7396q InterfaceC6622s<? extends T1> interfaceC6622s, @InterfaceC7396q InterfaceC6622s<? extends T2> interfaceC6622s2, @InterfaceC7396q InterfaceC6622s<? extends T3> interfaceC6622s3, @InterfaceC7396q InterfaceC6622s<? extends T4> interfaceC6622s4, @InterfaceC7396q InterfaceC6622s<? extends T5> interfaceC6622s5, @InterfaceC7396q @kotlin.toq cyoe.fn3e<? super InterfaceC6618p<? super R>, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super InterfaceC6216q<? super was>, ? extends Object> fn3eVar) {
        return kotlinx.coroutines.flow.ld6.tfm(new h(new InterfaceC6622s[]{interfaceC6622s, interfaceC6622s2, interfaceC6622s3, interfaceC6622s4, interfaceC6622s5}, null, fn3eVar));
    }

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ <T, R> InterfaceC6622s<R> m24237y(Iterable<? extends InterfaceC6622s<? extends T>> iterable, @kotlin.toq cyoe.cdj<? super InterfaceC6618p<? super R>, ? super T[], ? super InterfaceC6216q<? super was>, ? extends Object> cdjVar) {
        Object[] array = kotlin.collections.a9.wr(iterable).toArray(new InterfaceC6622s[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        kotlin.jvm.internal.d2ok.ni7();
        return kotlinx.coroutines.flow.ld6.tfm(new ki((InterfaceC6622s[]) array, cdjVar, null));
    }

    @InterfaceC7396q
    public static final <T1, T2, R> InterfaceC6622s<R> zy(@InterfaceC7396q InterfaceC6622s<? extends T1> interfaceC6622s, @InterfaceC7396q InterfaceC6622s<? extends T2> interfaceC6622s2, @InterfaceC7396q cyoe.cdj<? super T1, ? super T2, ? super InterfaceC6216q<? super R>, ? extends Object> cdjVar) {
        return kotlinx.coroutines.flow.ld6.wo(interfaceC6622s, interfaceC6622s2, cdjVar);
    }
}
