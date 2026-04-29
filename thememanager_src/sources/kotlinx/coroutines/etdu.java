package kotlinx.coroutines;

import androidx.exifinterface.media.C0846k;
import com.android.thememanager.basemodule.network.theme.interceptors.C1774q;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.market.sdk.reflect.C4991s;
import com.miui.maml.folme.AnimatedProperty;
import com.xiaomi.onetrack.api.at;
import cyoe.InterfaceC5979h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C6231h;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.f7l8;
import kotlin.coroutines.intrinsics.C6199q;
import kotlin.coroutines.jvm.internal.C6211y;
import kotlin.coroutines.jvm.internal.InterfaceC6205g;
import kotlinx.coroutines.gbni;
import kotlinx.coroutines.internal.C6694z;
import kotlinx.coroutines.selects.InterfaceC6720g;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import t8iq.C7672k;
import tww7.C7677k;
import v5yj.C7704k;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0005~Î\u0001Ï\u0001B\u0012\u0012\u0007\u0010Ë\u0001\u001a\u00020\u001b¢\u0006\u0006\bÌ\u0001\u0010Í\u0001J&\u0010\n\u001a\u00020\t2\u0014\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0082\b¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0014\u001a\u0004\u0018\u00010\u00122\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010#\u001a\u00020\u00072\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0012H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u0012H\u0002¢\u0006\u0004\b%\u0010&J\u001d\u0010'\u001a\u00020\u0007*\u00020 2\b\u0010\"\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b'\u0010$J.\u0010*\u001a\u00020\u0007\"\n\b\u0000\u0010)\u0018\u0001*\u00020(2\u0006\u0010!\u001a\u00020 2\b\u0010\"\u001a\u0004\u0018\u00010\u0012H\u0082\b¢\u0006\u0004\b*\u0010$J\u0019\u0010,\u001a\u00020+2\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b,\u0010-J@\u00103\u001a\u00020(2'\u00101\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0012¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`02\u0006\u00102\u001a\u00020\u001bH\u0002¢\u0006\u0004\b3\u00104J'\u00107\u001a\u00020\u001b2\u0006\u00105\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 2\u0006\u00106\u001a\u00020(H\u0002¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\u00020\u00072\u0006\u0010\r\u001a\u000209H\u0002¢\u0006\u0004\b:\u0010;J\u0017\u0010<\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020(H\u0002¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\u001bH\u0002¢\u0006\u0004\b>\u0010?J\u0013\u0010@\u001a\u00020\u0007H\u0082@ø\u0001\u0000¢\u0006\u0004\b@\u0010AJ\u001b\u0010B\u001a\u0004\u0018\u00010\u00062\b\u0010\"\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\bB\u0010CJ\u0019\u0010D\u001a\u00020\u00122\b\u0010\"\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\bD\u0010EJ\u001b\u0010F\u001a\u0004\u0018\u00010\u00062\b\u0010\"\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\bF\u0010CJ\u0019\u0010G\u001a\u0004\u0018\u00010 2\u0006\u0010\r\u001a\u00020\u0019H\u0002¢\u0006\u0004\bG\u0010HJ\u001f\u0010I\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u0012H\u0002¢\u0006\u0004\bI\u0010JJ%\u0010K\u001a\u0004\u0018\u00010\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\bK\u0010LJ#\u0010M\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\u00192\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\bM\u0010NJ\u0019\u0010P\u001a\u0004\u0018\u00010O2\u0006\u0010\r\u001a\u00020\u0019H\u0002¢\u0006\u0004\bP\u0010QJ*\u0010S\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010R\u001a\u00020O2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0082\u0010¢\u0006\u0004\bS\u0010TJ)\u0010V\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010U\u001a\u00020O2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\bV\u0010WJ\u0015\u0010Y\u001a\u0004\u0018\u00010O*\u00020XH\u0002¢\u0006\u0004\bY\u0010ZJ\u0019\u0010\\\u001a\u00020[2\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\\\u0010]J\u0015\u0010^\u001a\u0004\u0018\u00010\u0006H\u0082@ø\u0001\u0000¢\u0006\u0004\b^\u0010AJ\u0019\u0010`\u001a\u00020\u00072\b\u0010_\u001a\u0004\u0018\u00010\u0001H\u0004¢\u0006\u0004\b`\u0010aJ\r\u0010b\u001a\u00020\u001b¢\u0006\u0004\bb\u0010?J\u000f\u0010c\u001a\u00020\u0007H\u0014¢\u0006\u0004\bc\u0010dJ\u0011\u0010g\u001a\u00060ej\u0002`f¢\u0006\u0004\bg\u0010hJ#\u0010j\u001a\u00060ej\u0002`f*\u00020\u00122\n\b\u0002\u0010i\u001a\u0004\u0018\u00010[H\u0004¢\u0006\u0004\bj\u0010kJ6\u0010m\u001a\u00020l2'\u00101\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0012¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`0¢\u0006\u0004\bm\u0010nJF\u0010p\u001a\u00020l2\u0006\u00102\u001a\u00020\u001b2\u0006\u0010o\u001a\u00020\u001b2'\u00101\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0012¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`0¢\u0006\u0004\bp\u0010qJ\u0013\u0010r\u001a\u00020\u0007H\u0086@ø\u0001\u0000¢\u0006\u0004\br\u0010AJB\u0010w\u001a\u00020\u0007\"\u0004\b\u0000\u0010s2\f\u0010u\u001a\b\u0012\u0004\u0012\u00028\u00000t2\u001c\u0010\b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000v\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005ø\u0001\u0000¢\u0006\u0004\bw\u0010xJ\u0017\u0010y\u001a\u00020\u00072\u0006\u00106\u001a\u00020(H\u0000¢\u0006\u0004\by\u0010=J\u001f\u0010z\u001a\u00020\u00072\u000e\u0010\"\u001a\n\u0018\u00010ej\u0004\u0018\u0001`fH\u0016¢\u0006\u0004\bz\u0010{J\u000f\u0010|\u001a\u00020[H\u0014¢\u0006\u0004\b|\u0010}J\u0019\u0010~\u001a\u00020\u001b2\b\u0010\"\u001a\u0004\u0018\u00010\u0012H\u0017¢\u0006\u0004\b~\u0010&J\u0018\u0010\u007f\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u0012H\u0016¢\u0006\u0005\b\u007f\u0010\u0080\u0001J\u0019\u0010\u0082\u0001\u001a\u00020\u00072\u0007\u0010\u0081\u0001\u001a\u00020\u0003¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u0019\u0010\u0084\u0001\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u0012H\u0016¢\u0006\u0005\b\u0084\u0001\u0010&J\u0019\u0010\u0085\u0001\u001a\u00020\u001b2\b\u0010\"\u001a\u0004\u0018\u00010\u0012¢\u0006\u0005\b\u0085\u0001\u0010&J\u001c\u0010\u0086\u0001\u001a\u00020\u001b2\b\u0010\"\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J,\u0010\u0089\u0001\u001a\u00030\u0088\u00012\n\b\u0002\u0010i\u001a\u0004\u0018\u00010[2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0012H\u0080\b¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J\u0015\u0010\u008b\u0001\u001a\u00060ej\u0002`fH\u0016¢\u0006\u0005\b\u008b\u0001\u0010hJ\u001c\u0010\u008c\u0001\u001a\u00020\u001b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0006\b\u008c\u0001\u0010\u0087\u0001J\u001d\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0005\b\u008d\u0001\u0010CJ\u0019\u0010\u008f\u0001\u001a\u00030\u008e\u00012\u0006\u0010R\u001a\u00020\u0002¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J\u001b\u0010\u0092\u0001\u001a\u00020\u00072\u0007\u0010\u0091\u0001\u001a\u00020\u0012H\u0010¢\u0006\u0006\b\u0092\u0001\u0010\u0080\u0001J\u001c\u0010\u0093\u0001\u001a\u00020\u00072\b\u0010\"\u001a\u0004\u0018\u00010\u0012H\u0014¢\u0006\u0006\b\u0093\u0001\u0010\u0080\u0001J\u001a\u0010\u0094\u0001\u001a\u00020\u001b2\u0007\u0010\u0091\u0001\u001a\u00020\u0012H\u0014¢\u0006\u0005\b\u0094\u0001\u0010&J\u001c\u0010\u0095\u0001\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J\u001c\u0010\u0097\u0001\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0006\b\u0097\u0001\u0010\u0096\u0001J\u0011\u0010\u0098\u0001\u001a\u00020[H\u0016¢\u0006\u0005\b\u0098\u0001\u0010}J\u0011\u0010\u0099\u0001\u001a\u00020[H\u0007¢\u0006\u0005\b\u0099\u0001\u0010}J\u0011\u0010\u009a\u0001\u001a\u00020[H\u0010¢\u0006\u0005\b\u009a\u0001\u0010}J\u0012\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u0012¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001J\u0014\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0006\b\u009d\u0001\u0010\u009e\u0001J\u0017\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u0006H\u0080@ø\u0001\u0000¢\u0006\u0005\b\u009f\u0001\u0010AJT\u0010¡\u0001\u001a\u00020\u0007\"\u0004\b\u0000\u0010)\"\u0004\b\u0001\u0010s2\f\u0010u\u001a\b\u0012\u0004\u0012\u00028\u00010t2#\u0010\b\u001a\u001f\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010v\u0012\u0006\u0012\u0004\u0018\u00010\u00060 \u0001H\u0000ø\u0001\u0000¢\u0006\u0006\b¡\u0001\u0010¢\u0001JT\u0010£\u0001\u001a\u00020\u0007\"\u0004\b\u0000\u0010)\"\u0004\b\u0001\u0010s2\f\u0010u\u001a\b\u0012\u0004\u0012\u00028\u00010t2#\u0010\b\u001a\u001f\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010v\u0012\u0006\u0012\u0004\u0018\u00010\u00060 \u0001H\u0000ø\u0001\u0000¢\u0006\u0006\b£\u0001\u0010¢\u0001R\u001e\u0010¥\u0001\u001a\u0004\u0018\u00010\u0012*\u0004\u0018\u00010\u00068BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b¤\u0001\u0010ER\u001b\u0010¨\u0001\u001a\u00020\u001b*\u00020\u00198BX\u0082\u0004¢\u0006\b\u001a\u0006\b¦\u0001\u0010§\u0001R\u0019\u0010¬\u0001\u001a\u0007\u0012\u0002\b\u00030©\u00018F¢\u0006\b\u001a\u0006\bª\u0001\u0010«\u0001R0\u0010²\u0001\u001a\u0005\u0018\u00010\u008e\u00012\n\u0010\u00ad\u0001\u001a\u0005\u0018\u00010\u008e\u00018@@@X\u0080\u000e¢\u0006\u0010\u001a\u0006\b®\u0001\u0010¯\u0001\"\u0006\b°\u0001\u0010±\u0001R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00068@X\u0080\u0004¢\u0006\b\u001a\u0006\b³\u0001\u0010\u009e\u0001R\u0016\u0010´\u0001\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b´\u0001\u0010?R\u0013\u0010¶\u0001\u001a\u00020\u001b8F¢\u0006\u0007\u001a\u0005\bµ\u0001\u0010?R\u0013\u0010·\u0001\u001a\u00020\u001b8F¢\u0006\u0007\u001a\u0005\b·\u0001\u0010?R\u0019\u0010¹\u0001\u001a\u0004\u0018\u00010\u00128DX\u0084\u0004¢\u0006\b\u001a\u0006\b¸\u0001\u0010\u009c\u0001R\u0016\u0010»\u0001\u001a\u00020\u001b8DX\u0084\u0004¢\u0006\u0007\u001a\u0005\bº\u0001\u0010?R\u0014\u0010¾\u0001\u001a\u00020\u00048F¢\u0006\b\u001a\u0006\b¼\u0001\u0010½\u0001R\u0016\u0010À\u0001\u001a\u00020\u001b8PX\u0090\u0004¢\u0006\u0007\u001a\u0005\b¿\u0001\u0010?R\u001b\u0010Ä\u0001\u001a\t\u0012\u0004\u0012\u00020\u00010Á\u00018F¢\u0006\b\u001a\u0006\bÂ\u0001\u0010Ã\u0001R\u0016\u0010Æ\u0001\u001a\u00020\u001b8TX\u0094\u0004¢\u0006\u0007\u001a\u0005\bÅ\u0001\u0010?R\u0016\u0010È\u0001\u001a\u00020\u001b8PX\u0090\u0004¢\u0006\u0007\u001a\u0005\bÇ\u0001\u0010?R\u0013\u0010Ê\u0001\u001a\u00020\u001b8F¢\u0006\u0007\u001a\u0005\bÉ\u0001\u0010?\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006Ð\u0001"}, d2 = {"Lkotlinx/coroutines/etdu;", "Lkotlinx/coroutines/gbni;", "Lkotlinx/coroutines/z;", "Lkotlinx/coroutines/zkd;", "Lkotlinx/coroutines/selects/zy;", "Lkotlin/Function1;", "", "Lkotlin/was;", "block", "", "zsr0", "(Lcyoe/x2;)Ljava/lang/Void;", "Lkotlinx/coroutines/etdu$zy;", "state", "proposedUpdate", "lv5", "(Lkotlinx/coroutines/etdu$zy;Ljava/lang/Object;)Ljava/lang/Object;", "", "", "exceptions", "dr", "(Lkotlinx/coroutines/etdu$zy;Ljava/util/List;)Ljava/lang/Throwable;", "rootCause", "c", "(Ljava/lang/Throwable;Ljava/util/List;)V", "Lkotlinx/coroutines/fnq8;", com.android.thememanager.util.hb.f61276lvui, "", "cv06", "(Lkotlinx/coroutines/fnq8;Ljava/lang/Object;)Z", "b", "(Lkotlinx/coroutines/fnq8;Ljava/lang/Object;)V", "Lkotlinx/coroutines/yqrt;", "list", "cause", "etdu", "(Lkotlinx/coroutines/yqrt;Ljava/lang/Throwable;)V", "o", "(Ljava/lang/Throwable;)Z", "sok", "Lkotlinx/coroutines/v0af;", C0846k.zaso, "cfr", "", "uj2j", "(Ljava/lang/Object;)I", "Lkotlin/c;", "name", "Lkotlinx/coroutines/CompletionHandler;", "handler", "onCancelling", "r8s8", "(Lcyoe/x2;Z)Lkotlinx/coroutines/v0af;", "expect", "node", "n5r1", "(Ljava/lang/Object;Lkotlinx/coroutines/yqrt;Lkotlinx/coroutines/v0af;)Z", "Lkotlinx/coroutines/t8iq;", "kcsr", "(Lkotlinx/coroutines/t8iq;)V", "bwp", "(Lkotlinx/coroutines/v0af;)V", "d8wk", "()Z", "gbni", "(Lkotlin/coroutines/q;)Ljava/lang/Object;", "j", "(Ljava/lang/Object;)Ljava/lang/Object;", "a", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "py", "ikck", "(Lkotlinx/coroutines/fnq8;)Lkotlinx/coroutines/yqrt;", "vep5", "(Lkotlinx/coroutines/fnq8;Ljava/lang/Throwable;)Z", "mbx", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "jbh", "(Lkotlinx/coroutines/fnq8;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/coroutines/fu4;", "u", "(Lkotlinx/coroutines/fnq8;)Lkotlinx/coroutines/fu4;", C1774q.as, "yl", "(Lkotlinx/coroutines/etdu$zy;Lkotlinx/coroutines/fu4;Ljava/lang/Object;)Z", "lastChild", "bf2", "(Lkotlinx/coroutines/etdu$zy;Lkotlinx/coroutines/fu4;Ljava/lang/Object;)V", "Lkotlinx/coroutines/internal/z;", "v0af", "(Lkotlinx/coroutines/internal/z;)Lkotlinx/coroutines/fu4;", "", "jz5", "(Ljava/lang/Object;)Ljava/lang/String;", "vyq", "parent", "fnq8", "(Lkotlinx/coroutines/gbni;)V", "start", "yqrt", "()V", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "d2ok", "()Ljava/util/concurrent/CancellationException;", "message", "ktq", "(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/ch;", "yz", "(Lcyoe/x2;)Lkotlinx/coroutines/ch;", "invokeImmediately", "ij", "(ZZLcyoe/x2;)Lkotlinx/coroutines/ch;", "was", "R", "Lkotlinx/coroutines/selects/g;", "select", "Lkotlin/coroutines/q;", "gvn7", "(Lkotlinx/coroutines/selects/g;Lcyoe/x2;)V", "gc3c", "q", "(Ljava/util/concurrent/CancellationException;)V", "m", "()Ljava/lang/String;", "k", "hb", "(Ljava/lang/Throwable;)V", "parentJob", "f", "(Lkotlinx/coroutines/zkd;)V", "ek5k", "e", "nn86", "(Ljava/lang/Object;)Z", "Lkotlinx/coroutines/zsr0;", "zp", "(Ljava/lang/String;Ljava/lang/Throwable;)Lkotlinx/coroutines/zsr0;", "t8iq", "i9jn", "ltg8", "Lkotlinx/coroutines/ni7;", "ngy", "(Lkotlinx/coroutines/z;)Lkotlinx/coroutines/ni7;", "exception", "qkj8", "w831", "vq", "z4", "(Ljava/lang/Object;)V", "lrht", "toString", "bek6", "m4", "t", "()Ljava/lang/Throwable;", "bo", "()Ljava/lang/Object;", "uv6", "Lkotlin/Function2;", "se", "(Lkotlinx/coroutines/selects/g;Lcyoe/h;)V", "zkd", "gyi", "exceptionOrNull", "qo", "(Lkotlinx/coroutines/fnq8;)Z", "isCancelling", "Lkotlin/coroutines/f7l8$zy;", "getKey", "()Lkotlin/coroutines/f7l8$zy;", InterfaceC1925p.qn, "value", C7672k.f94880zy, "()Lkotlinx/coroutines/ni7;", "bz2", "(Lkotlinx/coroutines/ni7;)V", "parentHandle", "mu", "isActive", "p", "isCompleted", "isCancelled", "y2", "completionCause", "c8jq", "completionCauseHandled", "h7am", "()Lkotlinx/coroutines/selects/zy;", "onJoin", "v", "onCancelComplete", "Lkotlin/sequences/qrj;", "wvg", "()Lkotlin/sequences/qrj;", "children", "wo", "isScopedCoroutine", "xwq3", "handlesException", "tfm", "isCompletedExceptionally", C7704k.q.f95568zurt, C4991s.f28129n, "(Z)V", "toq", "zy", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
@kotlin.ld6(level = kotlin.qrj.ERROR, message = "This is internal API and may be removed in the future releases")
public class etdu implements gbni, InterfaceC6749z, zkd, kotlinx.coroutines.selects.zy {

    /* JADX INFO: renamed from: k */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f36931k = AtomicReferenceFieldUpdater.newUpdater(etdu.class, Object.class, "_state");

    @InterfaceC7396q
    private volatile /* synthetic */ Object _parentHandle;

    @InterfaceC7396q
    private volatile /* synthetic */ Object _state;

    /* JADX INFO: renamed from: kotlinx.coroutines.etdu$k */
    /* JADX INFO: compiled from: JobSupport.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0014R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0011"}, d2 = {"Lkotlinx/coroutines/etdu$k;", C0846k.zaso, "Lkotlinx/coroutines/ki;", "Lkotlinx/coroutines/gbni;", "parent", "", "fu4", "", "gvn7", "Lkotlinx/coroutines/etdu;", "i", "Lkotlinx/coroutines/etdu;", at.f31711e, "Lkotlin/coroutines/q;", "delegate", C4991s.f28129n, "(Lkotlin/coroutines/q;Lkotlinx/coroutines/etdu;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    private static final class C6553k<T> extends ki<T> {

        /* JADX INFO: renamed from: i */
        @InterfaceC7396q
        private final etdu f36932i;

        public C6553k(@InterfaceC7396q InterfaceC6216q<? super T> interfaceC6216q, @InterfaceC7396q etdu etduVar) {
            super(interfaceC6216q, 1);
            this.f36932i = etduVar;
        }

        @Override // kotlinx.coroutines.ki
        @InterfaceC7396q
        public Throwable fu4(@InterfaceC7396q gbni gbniVar) {
            Throwable thM24065n;
            Object objMu = this.f36932i.mu();
            return (!(objMu instanceof zy) || (thM24065n = ((zy) objMu).m24065n()) == null) ? objMu instanceof a9 ? ((a9) objMu).f36774k : gbniVar.d2ok() : thM24065n;
        }

        @Override // kotlinx.coroutines.ki
        @InterfaceC7396q
        protected String gvn7() {
            return "AwaitContinuation";
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.etdu$n */
    /* JADX INFO: compiled from: JobSupport.kt */
    @InterfaceC6205g(m22755c = "kotlinx.coroutines.JobSupport$children$1", m22756f = "JobSupport.kt", m22757i = {1, 1, 1}, m22758l = {952, 954}, m22759m = "invokeSuspend", m22760n = {"$this$sequence", "this_$iv", "cur$iv"}, m22761s = {"L$0", "L$1", "L$2"})
    @kotlin.d3(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlin/sequences/kja0;", "Lkotlinx/coroutines/gbni;", "Lkotlin/was;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    static final class C6554n extends kotlin.coroutines.jvm.internal.ld6 implements InterfaceC5979h<kotlin.sequences.kja0<? super gbni>, InterfaceC6216q<? super kotlin.was>, Object> {
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        C6554n(InterfaceC6216q<? super C6554n> interfaceC6216q) {
            super(2, interfaceC6216q);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<kotlin.was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            C6554n c6554n = etdu.this.new C6554n(interfaceC6216q);
            c6554n.L$0 = obj;
            return c6554n;
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q kotlin.sequences.kja0<? super gbni> kja0Var, @InterfaceC7395n InterfaceC6216q<? super kotlin.was> interfaceC6216q) {
            return ((C6554n) create(kja0Var, interfaceC6216q)).invokeSuspend(kotlin.was.f36763k);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0069 -> B:28:0x007f). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x007c -> B:28:0x007f). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @mub.InterfaceC7395n
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@mub.InterfaceC7396q java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.toq.x2()
                int r1 = r7.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2b
                if (r1 == r3) goto L27
                if (r1 != r2) goto L1f
                java.lang.Object r1 = r7.L$2
                kotlinx.coroutines.internal.z r1 = (kotlinx.coroutines.internal.C6694z) r1
                java.lang.Object r3 = r7.L$1
                kotlinx.coroutines.internal.ni7 r3 = (kotlinx.coroutines.internal.ni7) r3
                java.lang.Object r4 = r7.L$0
                kotlin.sequences.kja0 r4 = (kotlin.sequences.kja0) r4
                kotlin.C6318m.n7h(r8)
                r8 = r7
                goto L7f
            L1f:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L27:
                kotlin.C6318m.n7h(r8)
                goto L84
            L2b:
                kotlin.C6318m.n7h(r8)
                java.lang.Object r8 = r7.L$0
                kotlin.sequences.kja0 r8 = (kotlin.sequences.kja0) r8
                kotlinx.coroutines.etdu r1 = kotlinx.coroutines.etdu.this
                java.lang.Object r1 = r1.mu()
                boolean r4 = r1 instanceof kotlinx.coroutines.fu4
                if (r4 == 0) goto L49
                kotlinx.coroutines.fu4 r1 = (kotlinx.coroutines.fu4) r1
                kotlinx.coroutines.z r1 = r1.f37186y
                r7.label = r3
                java.lang.Object r8 = r8.toq(r1, r7)
                if (r8 != r0) goto L84
                return r0
            L49:
                boolean r3 = r1 instanceof kotlinx.coroutines.fnq8
                if (r3 == 0) goto L84
                kotlinx.coroutines.fnq8 r1 = (kotlinx.coroutines.fnq8) r1
                kotlinx.coroutines.yqrt r1 = r1.toq()
                if (r1 != 0) goto L56
                goto L84
            L56:
                java.lang.Object r3 = r1.n5r1()
                kotlinx.coroutines.internal.z r3 = (kotlinx.coroutines.internal.C6694z) r3
                r4 = r8
                r8 = r7
                r6 = r3
                r3 = r1
                r1 = r6
            L61:
                boolean r5 = kotlin.jvm.internal.d2ok.f7l8(r1, r3)
                if (r5 != 0) goto L84
                boolean r5 = r1 instanceof kotlinx.coroutines.fu4
                if (r5 == 0) goto L7f
                r5 = r1
                kotlinx.coroutines.fu4 r5 = (kotlinx.coroutines.fu4) r5
                kotlinx.coroutines.z r5 = r5.f37186y
                r8.L$0 = r4
                r8.L$1 = r3
                r8.L$2 = r1
                r8.label = r2
                java.lang.Object r5 = r4.toq(r5, r8)
                if (r5 != r0) goto L7f
                return r0
            L7f:
                kotlinx.coroutines.internal.z r1 = r1.hyr()
                goto L61
            L84:
                kotlin.was r8 = kotlin.was.f36763k
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.etdu.C6554n.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.etdu$q */
    /* JADX INFO: compiled from: LockFreeLinkedList.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/internal/z$g", "Lkotlinx/coroutines/internal/z$zy;", "Lkotlinx/coroutines/internal/z;", "Lkotlinx/coroutines/internal/Node;", "affected", "", "ld6", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    public static final class C6555q extends C6694z.zy {

        /* JADX INFO: renamed from: g */
        final /* synthetic */ Object f36933g;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ etdu f36934n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ C6694z f36935q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6555q(C6694z c6694z, etdu etduVar, Object obj) {
            super(c6694z);
            this.f36935q = c6694z;
            this.f36934n = etduVar;
            this.f36933g = obj;
        }

        @Override // kotlinx.coroutines.internal.AbstractC6689q
        @InterfaceC7395n
        /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
        public Object mo23910s(@InterfaceC7396q C6694z c6694z) {
            if (this.f36934n.mu() == this.f36933g) {
                return null;
            }
            return kotlinx.coroutines.internal.fu4.m24339k();
        }
    }

    /* JADX INFO: compiled from: JobSupport.kt */
    @kotlin.d3(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lkotlinx/coroutines/etdu$toq;", "Lkotlinx/coroutines/v0af;", "", "cause", "Lkotlin/was;", "y9n", "Lkotlinx/coroutines/etdu;", AnimatedProperty.PROPERTY_NAME_Y, "Lkotlinx/coroutines/etdu;", "parent", "Lkotlinx/coroutines/etdu$zy;", C7704k.y.toq.f44691k, "Lkotlinx/coroutines/etdu$zy;", "state", "Lkotlinx/coroutines/fu4;", "p", "Lkotlinx/coroutines/fu4;", C1774q.as, "", AnimatedProperty.PROPERTY_NAME_H, "Ljava/lang/Object;", "proposedUpdate", C4991s.f28129n, "(Lkotlinx/coroutines/etdu;Lkotlinx/coroutines/etdu$zy;Lkotlinx/coroutines/fu4;Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    private static final class toq extends v0af {

        /* JADX INFO: renamed from: h */
        @InterfaceC7395n
        private final Object f36936h;

        /* JADX INFO: renamed from: p */
        @InterfaceC7396q
        private final fu4 f36937p;

        /* JADX INFO: renamed from: s */
        @InterfaceC7396q
        private final zy f36938s;

        /* JADX INFO: renamed from: y */
        @InterfaceC7396q
        private final etdu f36939y;

        public toq(@InterfaceC7396q etdu etduVar, @InterfaceC7396q zy zyVar, @InterfaceC7396q fu4 fu4Var, @InterfaceC7395n Object obj) {
            this.f36939y = etduVar;
            this.f36938s = zyVar;
            this.f36937p = fu4Var;
            this.f36936h = obj;
        }

        @Override // cyoe.x2
        public /* bridge */ /* synthetic */ kotlin.was invoke(Throwable th) {
            y9n(th);
            return kotlin.was.f36763k;
        }

        @Override // kotlinx.coroutines.jp0y
        public void y9n(@InterfaceC7395n Throwable th) {
            this.f36939y.bf2(this.f36938s, this.f36937p, this.f36936h);
        }
    }

    /* JADX INFO: compiled from: JobSupport.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003B!\u0012\u0006\u0010\u0018\u001a\u00020\u0014\u0012\u0006\u0010$\u001a\u00020\u001f\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b.\u0010/J\u001f\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0018\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R(\u0010\u001e\u001a\u0004\u0018\u00010\u00012\b\u0010\u0019\u001a\u0004\u0018\u00010\u00018B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010$\u001a\u00020\u001f2\u0006\u0010\u0019\u001a\u00020\u001f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R(\u0010(\u001a\u0004\u0018\u00010\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u00058F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010\u0010R\u0011\u0010*\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b)\u0010!R\u0011\u0010,\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b+\u0010!R\u0014\u0010-\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010!¨\u00060"}, d2 = {"Lkotlinx/coroutines/etdu$zy;", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "Lkotlinx/coroutines/fnq8;", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "zy", "()Ljava/util/ArrayList;", "proposedException", "", C7704k.y.toq.f44691k, "(Ljava/lang/Throwable;)Ljava/util/List;", "exception", "Lkotlin/was;", "k", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "Lkotlinx/coroutines/yqrt;", "Lkotlinx/coroutines/yqrt;", "toq", "()Lkotlinx/coroutines/yqrt;", "list", "value", "q", "()Ljava/lang/Object;", "ld6", "(Ljava/lang/Object;)V", "exceptionsHolder", "", "f7l8", "()Z", "p", "(Z)V", "isCompleting", "n", "()Ljava/lang/Throwable;", "x2", "rootCause", AnimatedProperty.PROPERTY_NAME_Y, "isSealed", C7704k.y.toq.f95579toq, "isCancelling", "isActive", C4991s.f28129n, "(Lkotlinx/coroutines/yqrt;ZLjava/lang/Throwable;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    private static final class zy implements fnq8 {

        @InterfaceC7396q
        private volatile /* synthetic */ Object _exceptionsHolder = null;

        @InterfaceC7396q
        private volatile /* synthetic */ int _isCompleting;

        @InterfaceC7396q
        private volatile /* synthetic */ Object _rootCause;

        /* JADX INFO: renamed from: k */
        @InterfaceC7396q
        private final yqrt f36940k;

        public zy(@InterfaceC7396q yqrt yqrtVar, boolean z2, @InterfaceC7395n Throwable th) {
            this.f36940k = yqrtVar;
            this._isCompleting = z2 ? 1 : 0;
            this._rootCause = th;
        }

        private final void ld6(Object obj) {
            this._exceptionsHolder = obj;
        }

        /* JADX INFO: renamed from: q */
        private final Object m24062q() {
            return this._exceptionsHolder;
        }

        private final ArrayList<Throwable> zy() {
            return new ArrayList<>(4);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
        public final boolean f7l8() {
            return this._isCompleting;
        }

        /* JADX INFO: renamed from: g */
        public final boolean m24063g() {
            return m24065n() != null;
        }

        @Override // kotlinx.coroutines.fnq8
        public boolean isActive() {
            return m24065n() == null;
        }

        /* JADX INFO: renamed from: k */
        public final void m24064k(@InterfaceC7396q Throwable th) {
            Throwable thM24065n = m24065n();
            if (thM24065n == null) {
                x2(th);
                return;
            }
            if (th == thM24065n) {
                return;
            }
            Object objM24062q = m24062q();
            if (objM24062q == null) {
                ld6(th);
                return;
            }
            if (!(objM24062q instanceof Throwable)) {
                if (!(objM24062q instanceof ArrayList)) {
                    throw new IllegalStateException(kotlin.jvm.internal.d2ok.mcp("State is ", objM24062q).toString());
                }
                ((ArrayList) objM24062q).add(th);
            } else {
                if (th == objM24062q) {
                    return;
                }
                ArrayList<Throwable> arrayListZy = zy();
                arrayListZy.add(objM24062q);
                arrayListZy.add(th);
                ld6(arrayListZy);
            }
        }

        @InterfaceC7395n
        /* JADX INFO: renamed from: n */
        public final Throwable m24065n() {
            return (Throwable) this._rootCause;
        }

        /* JADX INFO: renamed from: p */
        public final void m24066p(boolean z2) {
            this._isCompleting = z2 ? 1 : 0;
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: s */
        public final List<Throwable> m24067s(@InterfaceC7395n Throwable th) {
            ArrayList<Throwable> arrayListZy;
            Object objM24062q = m24062q();
            if (objM24062q == null) {
                arrayListZy = zy();
            } else if (objM24062q instanceof Throwable) {
                ArrayList<Throwable> arrayListZy2 = zy();
                arrayListZy2.add(objM24062q);
                arrayListZy = arrayListZy2;
            } else {
                if (!(objM24062q instanceof ArrayList)) {
                    throw new IllegalStateException(kotlin.jvm.internal.d2ok.mcp("State is ", objM24062q).toString());
                }
                arrayListZy = (ArrayList) objM24062q;
            }
            Throwable thM24065n = m24065n();
            if (thM24065n != null) {
                arrayListZy.add(0, thM24065n);
            }
            if (th != null && !kotlin.jvm.internal.d2ok.f7l8(th, thM24065n)) {
                arrayListZy.add(th);
            }
            ld6(sok.f37417y);
            return arrayListZy;
        }

        @InterfaceC7396q
        public String toString() {
            return "Finishing[cancelling=" + m24063g() + ", completing=" + f7l8() + ", rootCause=" + m24065n() + ", exceptions=" + m24062q() + ", list=" + toq() + ']';
        }

        @Override // kotlinx.coroutines.fnq8
        @InterfaceC7396q
        public yqrt toq() {
            return this.f36940k;
        }

        public final void x2(@InterfaceC7395n Throwable th) {
            this._rootCause = th;
        }

        /* JADX INFO: renamed from: y */
        public final boolean m24068y() {
            return m24062q() == sok.f37417y;
        }
    }

    public etdu(boolean z2) {
        this._state = z2 ? sok.f37414p : sok.f37416s;
        this._parentHandle = null;
    }

    /* JADX INFO: renamed from: a */
    private final Throwable m24048a(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new zsr0(mo24058m(), null, this) : th;
        }
        if (obj != null) {
            return ((zkd) obj).t8iq();
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
    }

    /* JADX INFO: renamed from: b */
    private final void m24049b(fnq8 fnq8Var, Object obj) throws Throwable {
        ni7 ni7VarM24055d = m24055d();
        if (ni7VarM24055d != null) {
            ni7VarM24055d.zy();
            bz2(bwp.f36798k);
        }
        a9 a9Var = obj instanceof a9 ? (a9) obj : null;
        Throwable th = a9Var != null ? a9Var.f36774k : null;
        if (!(fnq8Var instanceof v0af)) {
            yqrt qVar = fnq8Var.toq();
            if (qVar == null) {
                return;
            }
            sok(qVar, th);
            return;
        }
        try {
            ((v0af) fnq8Var).y9n(th);
        } catch (Throwable th2) {
            qkj8(new gvn7("Exception in completion handler " + fnq8Var + " for " + this, th2));
        }
    }

    public static /* synthetic */ CancellationException b3e(etdu etduVar, Throwable th, String str, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
        }
        if ((i2 & 1) != 0) {
            str = null;
        }
        return etduVar.ktq(th, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bf2(zy zyVar, fu4 fu4Var, Object obj) {
        fu4 fu4VarV0af = v0af(fu4Var);
        if (fu4VarV0af == null || !yl(zyVar, fu4VarV0af, obj)) {
            lrht(lv5(zyVar, obj));
        }
    }

    private final void bwp(v0af v0afVar) {
        v0afVar.eqxt(new yqrt());
        androidx.concurrent.futures.toq.m906k(f36931k, this, v0afVar, v0afVar.hyr());
    }

    /* JADX INFO: renamed from: c */
    private final void m24050c(Throwable th, List<? extends Throwable> list) {
        if (list.size() <= 1) {
            return;
        }
        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
        for (Throwable th2 : list) {
            if (th2 != th && th2 != th && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                C6231h.m22845k(th, th2);
            }
        }
    }

    private final /* synthetic */ <T extends v0af> void cfr(yqrt yqrtVar, Throwable th) throws Throwable {
        gvn7 gvn7Var;
        gvn7 gvn7Var2 = null;
        for (C6694z c6694zHyr = (C6694z) yqrtVar.n5r1(); !kotlin.jvm.internal.d2ok.f7l8(c6694zHyr, yqrtVar); c6694zHyr = c6694zHyr.hyr()) {
            kotlin.jvm.internal.d2ok.m23086z(3, C0846k.zaso);
            if (c6694zHyr instanceof C6694z) {
                v0af v0afVar = (v0af) c6694zHyr;
                try {
                    v0afVar.y9n(th);
                } catch (Throwable th2) {
                    if (gvn7Var2 == null) {
                        gvn7Var = null;
                    } else {
                        C6231h.m22845k(gvn7Var2, th2);
                        gvn7Var = gvn7Var2;
                    }
                    if (gvn7Var == null) {
                        gvn7Var2 = new gvn7("Exception in completion handler " + v0afVar + " for " + this, th2);
                    }
                }
            }
        }
        if (gvn7Var2 == null) {
            return;
        }
        qkj8(gvn7Var2);
    }

    public static /* synthetic */ zsr0 ch(etdu etduVar, String str, Throwable th, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: defaultCancellationException");
        }
        if ((i2 & 1) != 0) {
            str = null;
        }
        if ((i2 & 2) != 0) {
            th = null;
        }
        if (str == null) {
            str = etduVar.mo24058m();
        }
        return new zsr0(str, th, etduVar);
    }

    private final boolean cv06(fnq8 fnq8Var, Object obj) throws Throwable {
        if (!androidx.concurrent.futures.toq.m906k(f36931k, this, fnq8Var, sok.f7l8(obj))) {
            return false;
        }
        w831(null);
        z4(obj);
        m24049b(fnq8Var, obj);
        return true;
    }

    private final boolean d8wk() {
        Object objMu;
        do {
            objMu = mu();
            if (!(objMu instanceof fnq8)) {
                return false;
            }
        } while (uj2j(objMu) < 0);
        return true;
    }

    private final Throwable dr(zy zyVar, List<? extends Throwable> list) {
        Object next;
        Object obj = null;
        if (list.isEmpty()) {
            if (zyVar.m24063g()) {
                return new zsr0(mo24058m(), null, this);
            }
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!(((Throwable) next) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) next;
        if (th != null) {
            return th;
        }
        Throwable th2 = list.get(0);
        if (th2 instanceof pc) {
            Iterator<T> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                Throwable th3 = (Throwable) next2;
                if (th3 != th2 && (th3 instanceof pc)) {
                    obj = next2;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    private final void etdu(yqrt yqrtVar, Throwable th) throws Throwable {
        gvn7 gvn7Var;
        w831(th);
        gvn7 gvn7Var2 = null;
        for (C6694z c6694zHyr = (C6694z) yqrtVar.n5r1(); !kotlin.jvm.internal.d2ok.f7l8(c6694zHyr, yqrtVar); c6694zHyr = c6694zHyr.hyr()) {
            if (c6694zHyr instanceof py) {
                v0af v0afVar = (v0af) c6694zHyr;
                try {
                    v0afVar.y9n(th);
                } catch (Throwable th2) {
                    if (gvn7Var2 == null) {
                        gvn7Var = null;
                    } else {
                        C6231h.m22845k(gvn7Var2, th2);
                        gvn7Var = gvn7Var2;
                    }
                    if (gvn7Var == null) {
                        gvn7Var2 = new gvn7("Exception in completion handler " + v0afVar + " for " + this, th2);
                    }
                }
            }
        }
        if (gvn7Var2 != null) {
            qkj8(gvn7Var2);
        }
        m24053o(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object gbni(InterfaceC6216q<? super kotlin.was> interfaceC6216q) {
        ki kiVar = new ki(kotlin.coroutines.intrinsics.zy.m22747n(interfaceC6216q), 1);
        kiVar.a9();
        C6668i.m24303k(kiVar, yz(new jz5(kiVar)));
        Object objM24474z = kiVar.m24474z();
        if (objM24474z == C6199q.x2()) {
            C6211y.zy(interfaceC6216q);
        }
        return objM24474z == C6199q.x2() ? objM24474z : kotlin.was.f36763k;
    }

    private final Throwable gyi(Object obj) {
        a9 a9Var = obj instanceof a9 ? (a9) obj : null;
        if (a9Var == null) {
            return null;
        }
        return a9Var.f36774k;
    }

    private final yqrt ikck(fnq8 fnq8Var) {
        yqrt qVar = fnq8Var.toq();
        if (qVar != null) {
            return qVar;
        }
        if (fnq8Var instanceof t8iq) {
            return new yqrt();
        }
        if (!(fnq8Var instanceof v0af)) {
            throw new IllegalStateException(kotlin.jvm.internal.d2ok.mcp("State should have list: ", fnq8Var).toString());
        }
        bwp((v0af) fnq8Var);
        return null;
    }

    /* JADX INFO: renamed from: j */
    private final Object m24051j(Object obj) {
        Object objMbx;
        do {
            Object objMu = mu();
            if (!(objMu instanceof fnq8) || ((objMu instanceof zy) && ((zy) objMu).f7l8())) {
                return sok.f37412k;
            }
            objMbx = mbx(objMu, new a9(m24048a(obj), false, 2, null));
        } while (objMbx == sok.f82069zy);
        return objMbx;
    }

    private final Object jbh(fnq8 fnq8Var, Object obj) throws Throwable {
        yqrt yqrtVarIkck = ikck(fnq8Var);
        if (yqrtVarIkck == null) {
            return sok.f82069zy;
        }
        zy zyVar = fnq8Var instanceof zy ? (zy) fnq8Var : null;
        if (zyVar == null) {
            zyVar = new zy(yqrtVarIkck, false, null);
        }
        synchronized (zyVar) {
            if (zyVar.f7l8()) {
                return sok.f37412k;
            }
            zyVar.m24066p(true);
            if (zyVar != fnq8Var && !androidx.concurrent.futures.toq.m906k(f36931k, this, fnq8Var, zyVar)) {
                return sok.f82069zy;
            }
            boolean zM24063g = zyVar.m24063g();
            a9 a9Var = obj instanceof a9 ? (a9) obj : null;
            if (a9Var != null) {
                zyVar.m24064k(a9Var.f36774k);
            }
            Throwable thM24065n = true ^ zM24063g ? zyVar.m24065n() : null;
            kotlin.was wasVar = kotlin.was.f36763k;
            if (thM24065n != null) {
                etdu(yqrtVarIkck, thM24065n);
            }
            fu4 fu4VarM24054u = m24054u(fnq8Var);
            return (fu4VarM24054u == null || !yl(zyVar, fu4VarM24054u, obj)) ? lv5(zyVar, obj) : sok.f82068toq;
        }
    }

    private final String jz5(Object obj) {
        if (!(obj instanceof zy)) {
            return obj instanceof fnq8 ? ((fnq8) obj).isActive() ? "Active" : "New" : obj instanceof a9 ? "Cancelled" : "Completed";
        }
        zy zyVar = (zy) obj;
        return zyVar.m24063g() ? "Cancelling" : zyVar.f7l8() ? "Completing" : "Active";
    }

    private final void kcsr(t8iq t8iqVar) {
        yqrt yqrtVar = new yqrt();
        Object qkj8Var = yqrtVar;
        if (!t8iqVar.isActive()) {
            qkj8Var = new qkj8(yqrtVar);
        }
        androidx.concurrent.futures.toq.m906k(f36931k, this, t8iqVar, qkj8Var);
    }

    private final Object lv5(zy zyVar, Object obj) throws Throwable {
        boolean zM24063g;
        Throwable thDr;
        a9 a9Var = obj instanceof a9 ? (a9) obj : null;
        Throwable th = a9Var == null ? null : a9Var.f36774k;
        synchronized (zyVar) {
            zM24063g = zyVar.m24063g();
            List<Throwable> listM24067s = zyVar.m24067s(th);
            thDr = dr(zyVar, listM24067s);
            if (thDr != null) {
                m24050c(thDr, listM24067s);
            }
        }
        if (thDr != null && thDr != th) {
            obj = new a9(thDr, false, 2, null);
        }
        if (thDr != null) {
            if (m24053o(thDr) || vq(thDr)) {
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                }
                ((a9) obj).toq();
            }
        }
        if (!zM24063g) {
            w831(thDr);
        }
        z4(obj);
        androidx.concurrent.futures.toq.m906k(f36931k, this, zyVar, sok.f7l8(obj));
        m24049b(zyVar, obj);
        return obj;
    }

    private final Object mbx(Object obj, Object obj2) {
        return !(obj instanceof fnq8) ? sok.f37412k : ((!(obj instanceof t8iq) && !(obj instanceof v0af)) || (obj instanceof fu4) || (obj2 instanceof a9)) ? jbh((fnq8) obj, obj2) : cv06((fnq8) obj, obj2) ? obj2 : sok.f82069zy;
    }

    private final boolean n5r1(Object obj, yqrt yqrtVar, v0af v0afVar) {
        int iEk5k;
        C6555q c6555q = new C6555q(v0afVar, this, obj);
        do {
            iEk5k = yqrtVar.m24444f().ek5k(v0afVar, yqrtVar, c6555q);
            if (iEk5k == 1) {
                return true;
            }
        } while (iEk5k != 2);
        return false;
    }

    /* JADX INFO: renamed from: o */
    private final boolean m24053o(Throwable th) {
        if (wo()) {
            return true;
        }
        boolean z2 = th instanceof CancellationException;
        ni7 ni7VarM24055d = m24055d();
        return (ni7VarM24055d == null || ni7VarM24055d == bwp.f36798k) ? z2 : ni7VarM24055d.f7l8(th) || z2;
    }

    private final Object py(Object obj) throws Throwable {
        Throwable thM24048a = null;
        while (true) {
            Object objMu = mu();
            if (objMu instanceof zy) {
                synchronized (objMu) {
                    if (((zy) objMu).m24068y()) {
                        return sok.f37415q;
                    }
                    boolean zM24063g = ((zy) objMu).m24063g();
                    if (obj != null || !zM24063g) {
                        if (thM24048a == null) {
                            thM24048a = m24048a(obj);
                        }
                        ((zy) objMu).m24064k(thM24048a);
                    }
                    Throwable thM24065n = zM24063g ^ true ? ((zy) objMu).m24065n() : null;
                    if (thM24065n != null) {
                        etdu(((zy) objMu).toq(), thM24065n);
                    }
                    return sok.f37412k;
                }
            }
            if (!(objMu instanceof fnq8)) {
                return sok.f37415q;
            }
            if (thM24048a == null) {
                thM24048a = m24048a(obj);
            }
            fnq8 fnq8Var = (fnq8) objMu;
            if (!fnq8Var.isActive()) {
                Object objMbx = mbx(objMu, new a9(thM24048a, false, 2, null));
                if (objMbx == sok.f37412k) {
                    throw new IllegalStateException(kotlin.jvm.internal.d2ok.mcp("Cannot happen in ", objMu).toString());
                }
                if (objMbx != sok.f82069zy) {
                    return objMbx;
                }
            } else if (vep5(fnq8Var, thM24048a)) {
                return sok.f37412k;
            }
        }
    }

    private final boolean qo(fnq8 fnq8Var) {
        return (fnq8Var instanceof zy) && ((zy) fnq8Var).m24063g();
    }

    private final v0af r8s8(cyoe.x2<? super Throwable, kotlin.was> x2Var, boolean z2) {
        v0af wasVar;
        if (z2) {
            wasVar = x2Var instanceof py ? (py) x2Var : null;
            if (wasVar == null) {
                wasVar = new g1(x2Var);
            }
        } else {
            v0af v0afVar = x2Var instanceof v0af ? (v0af) x2Var : null;
            wasVar = v0afVar != null ? v0afVar : null;
            if (wasVar == null) {
                wasVar = new was(x2Var);
            }
        }
        wasVar.bf2(this);
        return wasVar;
    }

    private final void sok(yqrt yqrtVar, Throwable th) throws Throwable {
        gvn7 gvn7Var;
        gvn7 gvn7Var2 = null;
        for (C6694z c6694zHyr = (C6694z) yqrtVar.n5r1(); !kotlin.jvm.internal.d2ok.f7l8(c6694zHyr, yqrtVar); c6694zHyr = c6694zHyr.hyr()) {
            if (c6694zHyr instanceof v0af) {
                v0af v0afVar = (v0af) c6694zHyr;
                try {
                    v0afVar.y9n(th);
                } catch (Throwable th2) {
                    if (gvn7Var2 == null) {
                        gvn7Var = null;
                    } else {
                        C6231h.m22845k(gvn7Var2, th2);
                        gvn7Var = gvn7Var2;
                    }
                    if (gvn7Var == null) {
                        gvn7Var2 = new gvn7("Exception in completion handler " + v0afVar + " for " + this, th2);
                    }
                }
            }
        }
        if (gvn7Var2 == null) {
            return;
        }
        qkj8(gvn7Var2);
    }

    /* JADX INFO: renamed from: u */
    private final fu4 m24054u(fnq8 fnq8Var) {
        fu4 fu4Var = fnq8Var instanceof fu4 ? (fu4) fnq8Var : null;
        if (fu4Var != null) {
            return fu4Var;
        }
        yqrt qVar = fnq8Var.toq();
        if (qVar == null) {
            return null;
        }
        return v0af(qVar);
    }

    private final int uj2j(Object obj) {
        if (obj instanceof t8iq) {
            if (((t8iq) obj).isActive()) {
                return 0;
            }
            if (!androidx.concurrent.futures.toq.m906k(f36931k, this, obj, sok.f37414p)) {
                return -1;
            }
            yqrt();
            return 1;
        }
        if (!(obj instanceof qkj8)) {
            return 0;
        }
        if (!androidx.concurrent.futures.toq.m906k(f36931k, this, obj, ((qkj8) obj).toq())) {
            return -1;
        }
        yqrt();
        return 1;
    }

    private final fu4 v0af(C6694z c6694z) {
        while (c6694z.uv6()) {
            c6694z = c6694z.m24444f();
        }
        while (true) {
            c6694z = c6694z.hyr();
            if (!c6694z.uv6()) {
                if (c6694z instanceof fu4) {
                    return (fu4) c6694z;
                }
                if (c6694z instanceof yqrt) {
                    return null;
                }
            }
        }
    }

    private final boolean vep5(fnq8 fnq8Var, Throwable th) throws Throwable {
        yqrt yqrtVarIkck = ikck(fnq8Var);
        if (yqrtVarIkck == null) {
            return false;
        }
        if (!androidx.concurrent.futures.toq.m906k(f36931k, this, fnq8Var, new zy(yqrtVarIkck, false, th))) {
            return false;
        }
        etdu(yqrtVarIkck, th);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object vyq(InterfaceC6216q<Object> interfaceC6216q) {
        C6553k c6553k = new C6553k(kotlin.coroutines.intrinsics.zy.m22747n(interfaceC6216q), this);
        c6553k.a9();
        C6668i.m24303k(c6553k, yz(new uj2j(c6553k)));
        Object objM24474z = c6553k.m24474z();
        if (objM24474z == C6199q.x2()) {
            C6211y.zy(interfaceC6216q);
        }
        return objM24474z;
    }

    private final boolean yl(zy zyVar, fu4 fu4Var, Object obj) {
        while (gbni.C6665k.m24291g(fu4Var.f37186y, false, false, new toq(this, zyVar, fu4Var, obj), 1, null) == bwp.f36798k) {
            fu4Var = v0af(fu4Var);
            if (fu4Var == null) {
                return false;
            }
        }
        return true;
    }

    private final Void zsr0(cyoe.x2<Object, kotlin.was> x2Var) {
        while (true) {
            x2Var.invoke(mu());
        }
    }

    @InterfaceC7396q
    @tfm
    public final String bek6() {
        return m4() + '{' + jz5(mu()) + '}';
    }

    @InterfaceC7395n
    public final Object bo() throws Throwable {
        Object objMu = mu();
        if (!(!(objMu instanceof fnq8))) {
            throw new IllegalStateException("This job has not completed yet".toString());
        }
        if (objMu instanceof a9) {
            throw ((a9) objMu).f36774k;
        }
        return sok.kja0(objMu);
    }

    public final void bz2(@InterfaceC7395n ni7 ni7Var) {
        this._parentHandle = ni7Var;
    }

    protected final boolean c8jq() {
        Object objMu = mu();
        return (objMu instanceof a9) && ((a9) objMu).m23817k();
    }

    @Override // kotlinx.coroutines.gbni, kotlinx.coroutines.channels.d3
    @kotlin.ld6(level = kotlin.qrj.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ void cancel() {
        mo23862q(null);
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: d */
    public final ni7 m24055d() {
        return (ni7) this._parentHandle;
    }

    @Override // kotlinx.coroutines.gbni
    @InterfaceC7396q
    public final CancellationException d2ok() {
        Object objMu = mu();
        if (!(objMu instanceof zy)) {
            if (objMu instanceof fnq8) {
                throw new IllegalStateException(kotlin.jvm.internal.d2ok.mcp("Job is still new or active: ", this).toString());
            }
            return objMu instanceof a9 ? b3e(this, ((a9) objMu).f36774k, null, 1, null) : new zsr0(kotlin.jvm.internal.d2ok.mcp(C6551e.m24040k(this), " has completed normally"), null, this);
        }
        Throwable thM24065n = ((zy) objMu).m24065n();
        CancellationException cancellationExceptionKtq = thM24065n != null ? ktq(thM24065n, kotlin.jvm.internal.d2ok.mcp(C6551e.m24040k(this), " is cancelling")) : null;
        if (cancellationExceptionKtq != null) {
            return cancellationExceptionKtq;
        }
        throw new IllegalStateException(kotlin.jvm.internal.d2ok.mcp("Job is still new or active: ", this).toString());
    }

    /* JADX INFO: renamed from: e */
    public final boolean m24056e(@InterfaceC7395n Throwable th) {
        return nn86(th);
    }

    public boolean ek5k(@InterfaceC7396q Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return nn86(th) && xwq3();
    }

    @Override // kotlinx.coroutines.InterfaceC6749z
    /* JADX INFO: renamed from: f */
    public final void mo24057f(@InterfaceC7396q zkd zkdVar) throws Throwable {
        nn86(zkdVar);
    }

    protected final void fnq8(@InterfaceC7395n gbni gbniVar) {
        if (gbniVar == null) {
            bz2(bwp.f36798k);
            return;
        }
        gbniVar.start();
        ni7 ni7VarNgy = gbniVar.ngy(this);
        bz2(ni7VarNgy);
        if (mo24059p()) {
            ni7VarNgy.zy();
            bz2(bwp.f36798k);
        }
    }

    @Override // kotlin.coroutines.f7l8.toq, kotlin.coroutines.f7l8
    public <R> R fold(R r2, @InterfaceC7396q InterfaceC5979h<? super R, ? super f7l8.toq, ? extends R> interfaceC5979h) {
        return (R) gbni.C6665k.m24294q(this, r2, interfaceC5979h);
    }

    public final void gc3c(@InterfaceC7396q v0af v0afVar) {
        Object objMu;
        do {
            objMu = mu();
            if (!(objMu instanceof v0af)) {
                if (!(objMu instanceof fnq8) || ((fnq8) objMu).toq() == null) {
                    return;
                }
                v0afVar.nn86();
                return;
            }
            if (objMu != v0afVar) {
                return;
            }
        } while (!androidx.concurrent.futures.toq.m906k(f36931k, this, objMu, sok.f37414p));
    }

    @Override // kotlin.coroutines.f7l8.toq, kotlin.coroutines.f7l8
    @InterfaceC7395n
    public <E extends f7l8.toq> E get(@InterfaceC7396q f7l8.zy<E> zyVar) {
        return (E) gbni.C6665k.m24293n(this, zyVar);
    }

    @Override // kotlin.coroutines.f7l8.toq
    @InterfaceC7396q
    public final f7l8.zy<?> getKey() {
        return gbni.ygy;
    }

    @Override // kotlinx.coroutines.selects.zy
    public final <R> void gvn7(@InterfaceC7396q InterfaceC6720g<? super R> interfaceC6720g, @InterfaceC7396q cyoe.x2<? super InterfaceC6216q<? super R>, ? extends Object> x2Var) {
        Object objMu;
        do {
            objMu = mu();
            if (interfaceC6720g.mo24565g()) {
                return;
            }
            if (!(objMu instanceof fnq8)) {
                if (interfaceC6720g.ki()) {
                    tww7.toq.zy(x2Var, interfaceC6720g.t8r());
                    return;
                }
                return;
            }
        } while (uj2j(objMu) != 0);
        interfaceC6720g.mo24566s(yz(new h7am(interfaceC6720g, x2Var)));
    }

    @Override // kotlinx.coroutines.gbni
    @InterfaceC7396q
    public final kotlinx.coroutines.selects.zy h7am() {
        return this;
    }

    public void hb(@InterfaceC7396q Throwable th) throws Throwable {
        nn86(th);
    }

    public final boolean i9jn(@InterfaceC7395n Object obj) {
        Object objMbx;
        do {
            objMbx = mbx(mu(), obj);
            if (objMbx == sok.f37412k) {
                return false;
            }
            if (objMbx == sok.f82068toq) {
                return true;
            }
        } while (objMbx == sok.f82069zy);
        lrht(objMbx);
        return true;
    }

    @Override // kotlinx.coroutines.gbni
    @InterfaceC7396q
    public final ch ij(boolean z2, boolean z3, @InterfaceC7396q cyoe.x2<? super Throwable, kotlin.was> x2Var) {
        v0af v0afVarR8s8 = r8s8(x2Var, z2);
        while (true) {
            Object objMu = mu();
            if (objMu instanceof t8iq) {
                t8iq t8iqVar = (t8iq) objMu;
                if (!t8iqVar.isActive()) {
                    kcsr(t8iqVar);
                } else if (androidx.concurrent.futures.toq.m906k(f36931k, this, objMu, v0afVarR8s8)) {
                    return v0afVarR8s8;
                }
            } else {
                if (!(objMu instanceof fnq8)) {
                    if (z3) {
                        a9 a9Var = objMu instanceof a9 ? (a9) objMu : null;
                        x2Var.invoke(a9Var != null ? a9Var.f36774k : null);
                    }
                    return bwp.f36798k;
                }
                yqrt qVar = ((fnq8) objMu).toq();
                if (qVar != null) {
                    ch chVar = bwp.f36798k;
                    if (z2 && (objMu instanceof zy)) {
                        synchronized (objMu) {
                            thM24065n = ((zy) objMu).m24065n();
                            if (thM24065n == null || ((x2Var instanceof fu4) && !((zy) objMu).f7l8())) {
                                if (n5r1(objMu, qVar, v0afVarR8s8)) {
                                    if (thM24065n == null) {
                                        return v0afVarR8s8;
                                    }
                                    chVar = v0afVarR8s8;
                                }
                            }
                            kotlin.was wasVar = kotlin.was.f36763k;
                        }
                    }
                    if (thM24065n != null) {
                        if (z3) {
                            x2Var.invoke(thM24065n);
                        }
                        return chVar;
                    }
                    if (n5r1(objMu, qVar, v0afVarR8s8)) {
                        return v0afVarR8s8;
                    }
                } else {
                    if (objMu == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    }
                    bwp((v0af) objMu);
                }
            }
        }
    }

    @Override // kotlinx.coroutines.gbni
    public boolean isActive() {
        Object objMu = mu();
        return (objMu instanceof fnq8) && ((fnq8) objMu).isActive();
    }

    @Override // kotlinx.coroutines.gbni
    public final boolean isCancelled() {
        Object objMu = mu();
        return (objMu instanceof a9) || ((objMu instanceof zy) && ((zy) objMu).m24063g());
    }

    @Override // kotlinx.coroutines.gbni, kotlinx.coroutines.channels.d3
    @kotlin.ld6(level = kotlin.qrj.HIDDEN, message = "Added since 1.2.0 for binary compatibility with versions <= 1.1.x")
    /* JADX INFO: renamed from: k */
    public /* synthetic */ boolean mo23861k(Throwable th) throws Throwable {
        CancellationException cancellationExceptionB3e = th == null ? null : b3e(this, th, null, 1, null);
        if (cancellationExceptionB3e == null) {
            cancellationExceptionB3e = new zsr0(mo24058m(), null, this);
        }
        hb(cancellationExceptionB3e);
        return true;
    }

    @InterfaceC7396q
    protected final CancellationException ktq(@InterfaceC7396q Throwable th, @InterfaceC7395n String str) {
        CancellationException zsr0Var = th instanceof CancellationException ? (CancellationException) th : null;
        if (zsr0Var == null) {
            if (str == null) {
                str = mo24058m();
            }
            zsr0Var = new zsr0(str, th, this);
        }
        return zsr0Var;
    }

    protected void lrht(@InterfaceC7395n Object obj) {
    }

    @InterfaceC7395n
    public final Object ltg8(@InterfaceC7395n Object obj) {
        Object objMbx;
        do {
            objMbx = mbx(mu(), obj);
            if (objMbx == sok.f37412k) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, gyi(obj));
            }
        } while (objMbx == sok.f82069zy);
        return objMbx;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @InterfaceC7396q
    /* JADX INFO: renamed from: m */
    public String mo24058m() {
        return "Job was cancelled";
    }

    @InterfaceC7396q
    public String m4() {
        return C6551e.m24040k(this);
    }

    @Override // kotlin.coroutines.f7l8.toq, kotlin.coroutines.f7l8
    @InterfaceC7396q
    public kotlin.coroutines.f7l8 minusKey(@InterfaceC7396q f7l8.zy<?> zyVar) {
        return gbni.C6665k.f7l8(this, zyVar);
    }

    @InterfaceC7395n
    public final Object mu() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof kotlinx.coroutines.internal.oc)) {
                return obj;
            }
            ((kotlinx.coroutines.internal.oc) obj).zy(this);
        }
    }

    @Override // kotlinx.coroutines.gbni
    @InterfaceC7396q
    public final ni7 ngy(@InterfaceC7396q InterfaceC6749z interfaceC6749z) {
        return (ni7) gbni.C6665k.m24291g(this, true, false, new fu4(interfaceC6749z), 2, null);
    }

    public final boolean nn86(@InterfaceC7395n Object obj) throws Throwable {
        Object objPy = sok.f37412k;
        if (mo24061v() && (objPy = m24051j(obj)) == sok.f82068toq) {
            return true;
        }
        if (objPy == sok.f37412k) {
            objPy = py(obj);
        }
        if (objPy == sok.f37412k || objPy == sok.f82068toq) {
            return true;
        }
        if (objPy == sok.f37415q) {
            return false;
        }
        lrht(objPy);
        return true;
    }

    @Override // kotlinx.coroutines.gbni
    /* JADX INFO: renamed from: p */
    public final boolean mo24059p() {
        return !(mu() instanceof fnq8);
    }

    @Override // kotlin.coroutines.f7l8
    @InterfaceC7396q
    public kotlin.coroutines.f7l8 plus(@InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var) {
        return gbni.C6665k.m24296y(this, f7l8Var);
    }

    @Override // kotlinx.coroutines.gbni, kotlinx.coroutines.channels.d3
    /* JADX INFO: renamed from: q */
    public void mo23862q(@InterfaceC7395n CancellationException cancellationException) throws Throwable {
        if (cancellationException == null) {
            cancellationException = new zsr0(mo24058m(), null, this);
        }
        hb(cancellationException);
    }

    public final <T, R> void se(@InterfaceC7396q InterfaceC6720g<? super R> interfaceC6720g, @InterfaceC7396q InterfaceC5979h<? super T, ? super InterfaceC6216q<? super R>, ? extends Object> interfaceC5979h) {
        Object objMu;
        do {
            objMu = mu();
            if (interfaceC6720g.mo24565g()) {
                return;
            }
            if (!(objMu instanceof fnq8)) {
                if (interfaceC6720g.ki()) {
                    if (objMu instanceof a9) {
                        interfaceC6720g.zurt(((a9) objMu).f36774k);
                        return;
                    } else {
                        tww7.toq.m28041q(interfaceC5979h, sok.kja0(objMu), interfaceC6720g.t8r());
                        return;
                    }
                }
                return;
            }
        } while (uj2j(objMu) != 0);
        interfaceC6720g.mo24566s(yz(new cv06(interfaceC6720g, interfaceC5979h)));
    }

    @Override // kotlinx.coroutines.gbni
    public final boolean start() {
        int iUj2j;
        do {
            iUj2j = uj2j(mu());
            if (iUj2j == 0) {
                return false;
            }
        } while (iUj2j != 1);
        return true;
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: t */
    public final Throwable m24060t() {
        Object objMu = mu();
        if (!(objMu instanceof fnq8)) {
            return gyi(objMu);
        }
        throw new IllegalStateException("This job has not completed yet".toString());
    }

    @Override // kotlinx.coroutines.zkd
    @InterfaceC7396q
    public CancellationException t8iq() {
        Throwable thM24065n;
        Object objMu = mu();
        if (objMu instanceof zy) {
            thM24065n = ((zy) objMu).m24065n();
        } else if (objMu instanceof a9) {
            thM24065n = ((a9) objMu).f36774k;
        } else {
            if (objMu instanceof fnq8) {
                throw new IllegalStateException(kotlin.jvm.internal.d2ok.mcp("Cannot be cancelling child in this state: ", objMu).toString());
            }
            thM24065n = null;
        }
        CancellationException cancellationException = thM24065n instanceof CancellationException ? (CancellationException) thM24065n : null;
        return cancellationException == null ? new zsr0(kotlin.jvm.internal.d2ok.mcp("Parent job is ", jz5(objMu)), thM24065n, this) : cancellationException;
    }

    public final boolean tfm() {
        return mu() instanceof a9;
    }

    @InterfaceC7396q
    public String toString() {
        return bek6() + '@' + C6551e.toq(this);
    }

    @InterfaceC7395n
    public final Object uv6(@InterfaceC7396q InterfaceC6216q<Object> interfaceC6216q) throws Throwable {
        Object objMu;
        do {
            objMu = mu();
            if (!(objMu instanceof fnq8)) {
                if (objMu instanceof a9) {
                    throw ((a9) objMu).f36774k;
                }
                return sok.kja0(objMu);
            }
        } while (uj2j(objMu) < 0);
        return vyq(interfaceC6216q);
    }

    /* JADX INFO: renamed from: v */
    public boolean mo24061v() {
        return false;
    }

    protected boolean vq(@InterfaceC7396q Throwable th) {
        return false;
    }

    protected void w831(@InterfaceC7395n Throwable th) {
    }

    @Override // kotlinx.coroutines.gbni
    @InterfaceC7395n
    public final Object was(@InterfaceC7396q InterfaceC6216q<? super kotlin.was> interfaceC6216q) {
        if (d8wk()) {
            Object objGbni = gbni(interfaceC6216q);
            return objGbni == C6199q.x2() ? objGbni : kotlin.was.f36763k;
        }
        ltg8.o1t(interfaceC6216q.getContext());
        return kotlin.was.f36763k;
    }

    protected boolean wo() {
        return false;
    }

    @Override // kotlinx.coroutines.gbni
    @InterfaceC7396q
    public final kotlin.sequences.qrj<gbni> wvg() {
        return kotlin.sequences.cdj.toq(new C6554n(null));
    }

    public boolean xwq3() {
        return true;
    }

    @InterfaceC7395n
    protected final Throwable y2() {
        Object objMu = mu();
        if (objMu instanceof zy) {
            Throwable thM24065n = ((zy) objMu).m24065n();
            if (thM24065n != null) {
                return thM24065n;
            }
            throw new IllegalStateException(kotlin.jvm.internal.d2ok.mcp("Job is still new or active: ", this).toString());
        }
        if (objMu instanceof fnq8) {
            throw new IllegalStateException(kotlin.jvm.internal.d2ok.mcp("Job is still new or active: ", this).toString());
        }
        if (objMu instanceof a9) {
            return ((a9) objMu).f36774k;
        }
        return null;
    }

    @Override // kotlinx.coroutines.gbni
    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
    public gbni y9n(@InterfaceC7396q gbni gbniVar) {
        return gbni.C6665k.m24295s(this, gbniVar);
    }

    protected void yqrt() {
    }

    @Override // kotlinx.coroutines.gbni
    @InterfaceC7396q
    public final ch yz(@InterfaceC7396q cyoe.x2<? super Throwable, kotlin.was> x2Var) {
        return ij(false, true, x2Var);
    }

    protected void z4(@InterfaceC7395n Object obj) {
    }

    public final <T, R> void zkd(@InterfaceC7396q InterfaceC6720g<? super R> interfaceC6720g, @InterfaceC7396q InterfaceC5979h<? super T, ? super InterfaceC6216q<? super R>, ? extends Object> interfaceC5979h) throws Throwable {
        Object objMu = mu();
        if (objMu instanceof a9) {
            interfaceC6720g.zurt(((a9) objMu).f36774k);
        } else {
            C7677k.m28034g(interfaceC5979h, sok.kja0(objMu), interfaceC6720g.t8r(), null, 4, null);
        }
    }

    @InterfaceC7396q
    public final zsr0 zp(@InterfaceC7395n String str, @InterfaceC7395n Throwable th) {
        if (str == null) {
            str = mo24058m();
        }
        return new zsr0(str, th, this);
    }

    public void qkj8(@InterfaceC7396q Throwable th) throws Throwable {
        throw th;
    }
}
