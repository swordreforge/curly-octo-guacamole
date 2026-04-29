package kotlinx.coroutines.flow;

import androidx.exifinterface.media.C0846k;
import cyoe.InterfaceC5979h;
import kotlin.C6318m;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.intrinsics.C6199q;
import kotlin.coroutines.jvm.internal.InterfaceC6205g;
import kotlin.jvm.internal.i1;
import kotlin.was;
import kotlinx.coroutines.C6708p;
import kotlinx.coroutines.C6739t;
import kotlinx.coroutines.InterfaceC6556f;
import kotlinx.coroutines.gbni;
import kotlinx.coroutines.ltg8;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: compiled from: Share.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a6\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u001a-\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001aM\u0010\u0014\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0000*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a;\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00028\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a1\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001aC\u0010\u001e\u001a\u00020\u001d\"\u0004\b\u0000\u0010\u0000*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00160\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0010\u001a\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000!\u001aU\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b2-\u0010(\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000$\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0%\u0012\u0006\u0012\u0004\u0018\u00010&0#¢\u0006\u0002\b'ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006+"}, d2 = {C0846k.zaso, "Lkotlinx/coroutines/flow/s;", "Lkotlinx/coroutines/f;", "scope", "Lkotlinx/coroutines/flow/dd;", "started", "", "replay", "Lkotlinx/coroutines/flow/d3;", "f7l8", "Lkotlinx/coroutines/flow/r;", "zy", "(Lkotlinx/coroutines/flow/s;I)Lkotlinx/coroutines/flow/r;", "Lkotlin/coroutines/f7l8;", "context", "upstream", "Lkotlinx/coroutines/flow/jk;", "shared", "initialValue", "Lkotlinx/coroutines/gbni;", "q", "(Lkotlinx/coroutines/f;Lkotlin/coroutines/f7l8;Lkotlinx/coroutines/flow/s;Lkotlinx/coroutines/flow/jk;Lkotlinx/coroutines/flow/dd;Ljava/lang/Object;)Lkotlinx/coroutines/gbni;", "Lkotlinx/coroutines/flow/hyr;", "p", "(Lkotlinx/coroutines/flow/s;Lkotlinx/coroutines/f;Lkotlinx/coroutines/flow/dd;Ljava/lang/Object;)Lkotlinx/coroutines/flow/hyr;", C7704k.y.toq.f44691k, "(Lkotlinx/coroutines/flow/s;Lkotlinx/coroutines/f;Lkotlin/coroutines/q;)Ljava/lang/Object;", "Lkotlinx/coroutines/o1t;", "result", "Lkotlin/was;", "n", "(Lkotlinx/coroutines/f;Lkotlin/coroutines/f7l8;Lkotlinx/coroutines/flow/s;Lkotlinx/coroutines/o1t;)V", "k", "Lkotlinx/coroutines/flow/a9;", "toq", "Lkotlin/Function2;", "Lkotlinx/coroutines/flow/p;", "Lkotlin/coroutines/q;", "", "Lkotlin/fn3e;", "action", C7704k.y.toq.f95579toq, "(Lkotlinx/coroutines/flow/d3;Lcyoe/h;)Lkotlinx/coroutines/flow/d3;", "kotlinx-coroutines-core"}, m22787k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
final /* synthetic */ class o1t {

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.o1t$k */
    /* JADX INFO: compiled from: Share.kt */
    @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1", m22756f = "Share.kt", m22757i = {}, m22758l = {214, 218, 219, 225}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
    @kotlin.d3(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {C0846k.zaso, "Lkotlinx/coroutines/f;", "Lkotlin/was;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    static final class C6615k extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super was>, Object> {
        final /* synthetic */ T $initialValue;
        final /* synthetic */ jk<T> $shared;
        final /* synthetic */ dd $started;
        final /* synthetic */ InterfaceC6622s<T> $upstream;
        int label;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.o1t$k$k */
        /* JADX INFO: compiled from: Share.kt */
        @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1", m22756f = "Share.kt", m22757i = {}, m22758l = {}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
        @kotlin.d3(bv = {}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {C0846k.zaso, "", "it", "", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
        static final class k extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<Integer, InterfaceC6216q<? super Boolean>, Object> {
            /* synthetic */ int I$0;
            int label;

            k(InterfaceC6216q<? super k> interfaceC6216q) {
                super(2, interfaceC6216q);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
            @InterfaceC7396q
            public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
                k kVar = new k(interfaceC6216q);
                kVar.I$0 = ((Number) obj).intValue();
                return kVar;
            }

            @InterfaceC7395n
            public final Object invoke(int i2, @InterfaceC7395n InterfaceC6216q<? super Boolean> interfaceC6216q) {
                return ((k) create(Integer.valueOf(i2), interfaceC6216q)).invokeSuspend(was.f36763k);
            }

            @Override // cyoe.InterfaceC5979h
            public /* bridge */ /* synthetic */ Object invoke(Integer num, InterfaceC6216q<? super Boolean> interfaceC6216q) {
                return invoke(num.intValue(), interfaceC6216q);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
            @InterfaceC7395n
            public final Object invokeSuspend(@InterfaceC7396q Object obj) {
                C6199q.x2();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6318m.n7h(obj);
                return kotlin.coroutines.jvm.internal.toq.m22766k(this.I$0 > 0);
            }
        }

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.o1t$k$toq */
        /* JADX INFO: compiled from: Share.kt */
        @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2", m22756f = "Share.kt", m22757i = {}, m22758l = {227}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
        @kotlin.d3(bv = {}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {C0846k.zaso, "Lkotlinx/coroutines/flow/lvui;", "it", "Lkotlin/was;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
        static final class toq extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<lvui, InterfaceC6216q<? super was>, Object> {
            final /* synthetic */ T $initialValue;
            final /* synthetic */ jk<T> $shared;
            final /* synthetic */ InterfaceC6622s<T> $upstream;
            /* synthetic */ Object L$0;
            int label;

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.o1t$k$toq$k */
            /* JADX INFO: compiled from: Share.kt */
            @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
            public /* synthetic */ class k {

                /* JADX INFO: renamed from: k */
                public static final /* synthetic */ int[] f37055k;

                static {
                    int[] iArr = new int[lvui.values().length];
                    iArr[lvui.START.ordinal()] = 1;
                    iArr[lvui.STOP.ordinal()] = 2;
                    iArr[lvui.STOP_AND_RESET_REPLAY_CACHE.ordinal()] = 3;
                    f37055k = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            toq(InterfaceC6622s<? extends T> interfaceC6622s, jk<T> jkVar, T t2, InterfaceC6216q<? super toq> interfaceC6216q) {
                super(2, interfaceC6216q);
                this.$upstream = interfaceC6622s;
                this.$shared = jkVar;
                this.$initialValue = t2;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
            @InterfaceC7396q
            public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
                toq toqVar = new toq(this.$upstream, this.$shared, this.$initialValue, interfaceC6216q);
                toqVar.L$0 = obj;
                return toqVar;
            }

            @Override // cyoe.InterfaceC5979h
            @InterfaceC7395n
            public final Object invoke(@InterfaceC7396q lvui lvuiVar, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
                return ((toq) create(lvuiVar, interfaceC6216q)).invokeSuspend(was.f36763k);
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
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
                    int i3 = k.f37055k[((lvui) this.L$0).ordinal()];
                    if (i3 == 1) {
                        InterfaceC6622s<T> interfaceC6622s = this.$upstream;
                        d3 d3Var = this.$shared;
                        this.label = 1;
                        if (interfaceC6622s.mo5262k(d3Var, this) == objX2) {
                            return objX2;
                        }
                    } else if (i3 == 3) {
                        T t2 = this.$initialValue;
                        if (t2 == eqxt.f36949k) {
                            this.$shared.f7l8();
                        } else {
                            this.$shared.toq(t2);
                        }
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
        /* JADX WARN: Multi-variable type inference failed */
        C6615k(dd ddVar, InterfaceC6622s<? extends T> interfaceC6622s, jk<T> jkVar, T t2, InterfaceC6216q<? super C6615k> interfaceC6216q) {
            super(2, interfaceC6216q);
            this.$started = ddVar;
            this.$upstream = interfaceC6622s;
            this.$shared = jkVar;
            this.$initialValue = t2;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            return new C6615k(this.$started, this.$upstream, this.$shared, this.$initialValue, interfaceC6216q);
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
            return ((C6615k) create(interfaceC6556f, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x0068 A[RETURN] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
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
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L25
                if (r1 == r5) goto L21
                if (r1 == r4) goto L1d
                if (r1 == r3) goto L21
                if (r1 != r2) goto L15
                goto L21
            L15:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1d:
                kotlin.C6318m.n7h(r8)
                goto L5c
            L21:
                kotlin.C6318m.n7h(r8)
                goto L8d
            L25:
                kotlin.C6318m.n7h(r8)
                kotlinx.coroutines.flow.dd r8 = r7.$started
                kotlinx.coroutines.flow.dd$k r1 = kotlinx.coroutines.flow.dd.f36946k
                kotlinx.coroutines.flow.dd r6 = r1.zy()
                if (r8 != r6) goto L3f
                kotlinx.coroutines.flow.s<T> r8 = r7.$upstream
                kotlinx.coroutines.flow.jk<T> r1 = r7.$shared
                r7.label = r5
                java.lang.Object r8 = r8.mo5262k(r1, r7)
                if (r8 != r0) goto L8d
                return r0
            L3f:
                kotlinx.coroutines.flow.dd r8 = r7.$started
                kotlinx.coroutines.flow.dd r1 = r1.m24082q()
                r5 = 0
                if (r8 != r1) goto L69
                kotlinx.coroutines.flow.jk<T> r8 = r7.$shared
                kotlinx.coroutines.flow.hyr r8 = r8.zy()
                kotlinx.coroutines.flow.o1t$k$k r1 = new kotlinx.coroutines.flow.o1t$k$k
                r1.<init>(r5)
                r7.label = r4
                java.lang.Object r8 = kotlinx.coroutines.flow.ld6.m24175u(r8, r1, r7)
                if (r8 != r0) goto L5c
                return r0
            L5c:
                kotlinx.coroutines.flow.s<T> r8 = r7.$upstream
                kotlinx.coroutines.flow.jk<T> r1 = r7.$shared
                r7.label = r3
                java.lang.Object r8 = r8.mo5262k(r1, r7)
                if (r8 != r0) goto L8d
                return r0
            L69:
                kotlinx.coroutines.flow.dd r8 = r7.$started
                kotlinx.coroutines.flow.jk<T> r1 = r7.$shared
                kotlinx.coroutines.flow.hyr r1 = r1.zy()
                kotlinx.coroutines.flow.s r8 = r8.mo24080k(r1)
                kotlinx.coroutines.flow.s r8 = kotlinx.coroutines.flow.ld6.yz(r8)
                kotlinx.coroutines.flow.o1t$k$toq r1 = new kotlinx.coroutines.flow.o1t$k$toq
                kotlinx.coroutines.flow.s<T> r3 = r7.$upstream
                kotlinx.coroutines.flow.jk<T> r4 = r7.$shared
                T r6 = r7.$initialValue
                r1.<init>(r3, r4, r6, r5)
                r7.label = r2
                java.lang.Object r8 = kotlinx.coroutines.flow.ld6.wvg(r8, r1, r7)
                if (r8 != r0) goto L8d
                return r0
            L8d:
                kotlin.was r8 = kotlin.was.f36763k
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.o1t.C6615k.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: compiled from: Share.kt */
    @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1", m22756f = "Share.kt", m22757i = {}, m22758l = {340}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
    @kotlin.d3(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {C0846k.zaso, "Lkotlinx/coroutines/f;", "Lkotlin/was;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    static final class toq extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super was>, Object> {
        final /* synthetic */ kotlinx.coroutines.o1t<hyr<T>> $result;
        final /* synthetic */ InterfaceC6622s<T> $upstream;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.o1t$toq$k */
        /* JADX INFO: compiled from: Share.kt */
        @kotlin.d3(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {C0846k.zaso, "value", "Lkotlin/was;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/q;)Ljava/lang/Object;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
        static final class C6616k<T> implements InterfaceC6618p, kotlin.coroutines.jvm.internal.n7h {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ i1.C6299y<a9<T>> f37056k;

            /* JADX INFO: renamed from: n */
            final /* synthetic */ kotlinx.coroutines.o1t<hyr<T>> f37057n;

            /* JADX INFO: renamed from: q */
            final /* synthetic */ InterfaceC6556f f37058q;

            C6616k(i1.C6299y<a9<T>> c6299y, InterfaceC6556f interfaceC6556f, kotlinx.coroutines.o1t<hyr<T>> o1tVar) {
                this.f37056k = c6299y;
                this.f37058q = interfaceC6556f;
                this.f37057n = o1tVar;
            }

            /* JADX WARN: Type inference failed for: r4v2, types: [T, kotlinx.coroutines.flow.a9, kotlinx.coroutines.flow.hyr] */
            @Override // kotlinx.coroutines.flow.InterfaceC6618p
            @InterfaceC7395n
            public final Object emit(T t2, @InterfaceC7396q InterfaceC6216q<? super was> interfaceC6216q) {
                was wasVar;
                a9<T> a9Var = this.f37056k.element;
                if (a9Var == null) {
                    wasVar = null;
                } else {
                    a9Var.setValue(t2);
                    wasVar = was.f36763k;
                }
                if (wasVar == null) {
                    InterfaceC6556f interfaceC6556f = this.f37058q;
                    i1.C6299y<a9<T>> c6299y = this.f37056k;
                    kotlinx.coroutines.o1t<hyr<T>> o1tVar = this.f37057n;
                    ?? r4 = (T) C6557c.m24071k(t2);
                    o1tVar.nmn5(new jp0y(r4, ltg8.m24486t(interfaceC6556f.i1())));
                    c6299y.element = r4;
                }
                return was.f36763k;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        toq(InterfaceC6622s<? extends T> interfaceC6622s, kotlinx.coroutines.o1t<hyr<T>> o1tVar, InterfaceC6216q<? super toq> interfaceC6216q) {
            super(2, interfaceC6216q);
            this.$upstream = interfaceC6622s;
            this.$result = o1tVar;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            toq toqVar = new toq(this.$upstream, this.$result, interfaceC6216q);
            toqVar.L$0 = obj;
            return toqVar;
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
            return ((toq) create(interfaceC6556f, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.q to kotlinx.coroutines.flow.o1t$toq for r6v1 'this'  kotlin.coroutines.q
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
                r2 = 1
                if (r1 == 0) goto L19
                if (r1 != r2) goto L11
                kotlin.C6318m.n7h(r7)     // Catch: java.lang.Throwable -> Lf
                goto L37
            Lf:
                r7 = move-exception
                goto L3a
            L11:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L19:
                kotlin.C6318m.n7h(r7)
                java.lang.Object r7 = r6.L$0
                kotlinx.coroutines.f r7 = (kotlinx.coroutines.InterfaceC6556f) r7
                kotlin.jvm.internal.i1$y r1 = new kotlin.jvm.internal.i1$y     // Catch: java.lang.Throwable -> Lf
                r1.<init>()     // Catch: java.lang.Throwable -> Lf
                kotlinx.coroutines.flow.s<T> r3 = r6.$upstream     // Catch: java.lang.Throwable -> Lf
                kotlinx.coroutines.flow.o1t$toq$k r4 = new kotlinx.coroutines.flow.o1t$toq$k     // Catch: java.lang.Throwable -> Lf
                kotlinx.coroutines.o1t<kotlinx.coroutines.flow.hyr<T>> r5 = r6.$result     // Catch: java.lang.Throwable -> Lf
                r4.<init>(r1, r7, r5)     // Catch: java.lang.Throwable -> Lf
                r6.label = r2     // Catch: java.lang.Throwable -> Lf
                java.lang.Object r7 = r3.mo5262k(r4, r6)     // Catch: java.lang.Throwable -> Lf
                if (r7 != r0) goto L37
                return r0
            L37:
                kotlin.was r7 = kotlin.was.f36763k
                return r7
            L3a:
                kotlinx.coroutines.o1t<kotlinx.coroutines.flow.hyr<T>> r0 = r6.$result
                r0.mo24513y(r7)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.o1t.toq.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @InterfaceC7396q
    public static final <T> d3<T> f7l8(@InterfaceC7396q InterfaceC6622s<? extends T> interfaceC6622s, @InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7396q dd ddVar, int i2) {
        C6621r c6621rZy = zy(interfaceC6622s, i2);
        jk jkVarM24084k = eqxt.m24084k(i2, c6621rZy.f81995toq, c6621rZy.f81996zy);
        return new fti(jkVarM24084k, m24212q(interfaceC6556f, c6621rZy.f37076q, c6621rZy.f37075k, jkVarM24084k, ddVar, eqxt.f36949k));
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: g */
    public static final <T> d3<T> m24208g(@InterfaceC7396q d3<? extends T> d3Var, @InterfaceC7396q InterfaceC5979h<? super InterfaceC6618p<? super T>, ? super InterfaceC6216q<? super was>, ? extends Object> interfaceC5979h) {
        return new vyq(d3Var, interfaceC5979h);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public static final <T> d3<T> m24209k(@InterfaceC7396q jk<T> jkVar) {
        return new fti(jkVar, null);
    }

    /* JADX INFO: renamed from: n */
    private static final <T> void m24210n(InterfaceC6556f interfaceC6556f, kotlin.coroutines.f7l8 f7l8Var, InterfaceC6622s<? extends T> interfaceC6622s, kotlinx.coroutines.o1t<hyr<T>> o1tVar) {
        kotlinx.coroutines.x2.m24649g(interfaceC6556f, f7l8Var, null, new toq(interfaceC6622s, o1tVar, null), 2, null);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: p */
    public static final <T> hyr<T> m24211p(@InterfaceC7396q InterfaceC6622s<? extends T> interfaceC6622s, @InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7396q dd ddVar, T t2) {
        C6621r c6621rZy = zy(interfaceC6622s, 1);
        a9 a9VarM24071k = C6557c.m24071k(t2);
        return new jp0y(a9VarM24071k, m24212q(interfaceC6556f, c6621rZy.f37076q, c6621rZy.f37075k, a9VarM24071k, ddVar, t2));
    }

    /* JADX INFO: renamed from: q */
    private static final <T> gbni m24212q(InterfaceC6556f interfaceC6556f, kotlin.coroutines.f7l8 f7l8Var, InterfaceC6622s<? extends T> interfaceC6622s, jk<T> jkVar, dd ddVar, T t2) {
        return C6708p.m24522q(interfaceC6556f, f7l8Var, kotlin.jvm.internal.d2ok.f7l8(ddVar, dd.f36946k.zy()) ? kotlinx.coroutines.lrht.DEFAULT : kotlinx.coroutines.lrht.UNDISPATCHED, new C6615k(ddVar, interfaceC6622s, jkVar, t2, null));
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: s */
    public static final <T> Object m24213s(@InterfaceC7396q InterfaceC6622s<? extends T> interfaceC6622s, @InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7396q InterfaceC6216q<? super hyr<? extends T>> interfaceC6216q) {
        C6621r c6621rZy = zy(interfaceC6622s, 1);
        kotlinx.coroutines.o1t o1tVarZy = C6739t.zy(null, 1, null);
        m24210n(interfaceC6556f, c6621rZy.f37076q, c6621rZy.f37075k, o1tVarZy);
        return o1tVarZy.hyr(interfaceC6216q);
    }

    @InterfaceC7396q
    public static final <T> hyr<T> toq(@InterfaceC7396q a9<T> a9Var) {
        return new jp0y(a9Var, null);
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ d3 m24214y(InterfaceC6622s interfaceC6622s, InterfaceC6556f interfaceC6556f, dd ddVar, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        return ld6.lh(interfaceC6622s, interfaceC6556f, ddVar, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final <T> kotlinx.coroutines.flow.C6621r<T> zy(kotlinx.coroutines.flow.InterfaceC6622s<? extends T> r7, int r8) {
        /*
            kotlinx.coroutines.channels.n7h$toq r0 = kotlinx.coroutines.channels.n7h.zzoo
            int r0 = r0.m23927k()
            int r0 = kotlin.ranges.t8r.fn3e(r8, r0)
            int r0 = r0 - r8
            boolean r1 = r7 instanceof kotlinx.coroutines.flow.internal.AbstractC6584n
            if (r1 == 0) goto L3d
            r1 = r7
            kotlinx.coroutines.flow.internal.n r1 = (kotlinx.coroutines.flow.internal.AbstractC6584n) r1
            kotlinx.coroutines.flow.s r2 = r1.x2()
            if (r2 == 0) goto L3d
            kotlinx.coroutines.flow.r r7 = new kotlinx.coroutines.flow.r
            int r3 = r1.f36994q
            r4 = -3
            r5 = 0
            if (r3 == r4) goto L27
            r4 = -2
            if (r3 == r4) goto L27
            if (r3 == 0) goto L27
            r0 = r3
            goto L35
        L27:
            kotlinx.coroutines.channels.qrj r4 = r1.f36993n
            kotlinx.coroutines.channels.qrj r6 = kotlinx.coroutines.channels.qrj.SUSPEND
            if (r4 != r6) goto L30
            if (r3 != 0) goto L35
            goto L34
        L30:
            if (r8 != 0) goto L34
            r0 = 1
            goto L35
        L34:
            r0 = r5
        L35:
            kotlinx.coroutines.channels.qrj r8 = r1.f36993n
            kotlin.coroutines.f7l8 r1 = r1.f36992k
            r7.<init>(r2, r0, r8, r1)
            return r7
        L3d:
            kotlinx.coroutines.flow.r r8 = new kotlinx.coroutines.flow.r
            kotlinx.coroutines.channels.qrj r1 = kotlinx.coroutines.channels.qrj.SUSPEND
            kotlin.coroutines.s r2 = kotlin.coroutines.C6217s.INSTANCE
            r8.<init>(r7, r0, r1, r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.o1t.zy(kotlinx.coroutines.flow.s, int):kotlinx.coroutines.flow.r");
    }
}
