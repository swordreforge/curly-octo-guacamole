package com.google.android.exoplayer2.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.core.content.res.C0506s;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.c8jq;
import com.google.android.exoplayer2.gc3c;
import com.google.android.exoplayer2.ikck;
import com.google.android.exoplayer2.pc;
import com.google.android.exoplayer2.pjz9;
import com.google.android.exoplayer2.source.C3564a;
import com.google.android.exoplayer2.trackselection.C3707i;
import com.google.android.exoplayer2.trackselection.cdj;
import com.google.android.exoplayer2.ui.C3748h;
import com.google.android.exoplayer2.ui.hyr;
import com.google.android.exoplayer2.util.C3844k;
import com.google.common.collect.se;
import com.google.common.collect.vep5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Formatter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class StyledPlayerControlView extends FrameLayout {
    public static final int ei = 0;
    private static final int ut = 1;
    public static final int wra = 200;
    private static final int xhv = 1000;
    private static final int zm = 0;
    public static final int zr5t = 5000;
    public static final int zsl = 100;

    /* JADX INFO: renamed from: a */
    private final Drawable f22455a;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private final Drawable f66075ab;

    @zy.dd
    private InterfaceC3725g ac;

    @zy.dd
    private InterfaceC3729q ad;
    private boolean aj;
    private boolean am;
    private final String an;
    private int ar;
    private final String as;
    private final String ax;
    private boolean ay;
    private final Drawable az;

    /* JADX INFO: renamed from: b */
    private final Runnable f22456b;
    private final String ba;
    private final float bb;
    private int bc;
    private boolean[] bd;
    private boolean be;
    private final Drawable bg;
    private final String bl;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private final String f66076bo;
    private final float bp;

    @zy.dd
    private gc3c bq;
    private boolean bs;
    private long[] bu;
    private final String bv;

    /* JADX INFO: renamed from: c */
    @zy.dd
    private final hyr f22457c;
    private InterfaceC3746f cw14;

    /* JADX INFO: renamed from: d */
    private final String f22458d;

    @zy.dd
    private View d1cy;
    private C3731y dy;

    /* JADX INFO: renamed from: e */
    private final StringBuilder f22459e;

    /* JADX INFO: renamed from: f */
    @zy.dd
    private final TextView f22460f;

    /* JADX INFO: renamed from: g */
    @zy.dd
    private final View f22461g;

    /* JADX INFO: renamed from: h */
    @zy.dd
    private final TextView f22462h;
    private toq hp;

    /* JADX INFO: renamed from: i */
    @zy.dd
    private final TextView f22463i;
    private final Drawable id;
    private final Drawable in;

    /* JADX INFO: renamed from: j */
    private final Formatter f22464j;

    /* JADX INFO: renamed from: k */
    private final zy f22465k;
    private int k0;
    private PopupWindow k6e;

    /* JADX INFO: renamed from: l */
    @zy.dd
    private final TextView f22466l;

    /* JADX INFO: renamed from: m */
    private final pc.C3550q f22467m;
    private C3728p mjvl;

    /* JADX INFO: renamed from: n */
    @zy.dd
    private final View f22468n;

    @zy.dd
    private View ndjo;

    /* JADX INFO: renamed from: o */
    private final pc.toq f22469o;

    /* JADX INFO: renamed from: p */
    @zy.dd
    private final View f22470p;

    /* JADX INFO: renamed from: q */
    private final CopyOnWriteArrayList<qrj> f22471q;

    @zy.dd
    private ImageView q7k9;

    /* JADX INFO: renamed from: r */
    @zy.dd
    private final View f22472r;

    /* JADX INFO: renamed from: s */
    @zy.dd
    private final View f22473s;
    private int s8y;
    private RecyclerView sk1t;

    /* JADX INFO: renamed from: t */
    @zy.dd
    private final ImageView f22474t;
    private long tgs;

    @zy.dd
    private ImageView th6;
    private long[] tlhn;

    /* JADX INFO: renamed from: u */
    private final Drawable f22475u;

    /* JADX INFO: renamed from: v */
    private final String f22476v;
    private C3727n vb6;

    /* JADX INFO: renamed from: w */
    private final Drawable f22477w;
    private boolean[] w97r;

    /* JADX INFO: renamed from: x */
    private final Drawable f22478x;
    private boolean xk5;

    @zy.dd
    private View xqx;

    @zy.dd
    private ImageView xy8;

    /* JADX INFO: renamed from: y */
    @zy.dd
    private final View f22479y;
    private dd yl25;

    /* JADX INFO: renamed from: z */
    @zy.dd
    private final ImageView f22480z;
    private Resources zmmu;

    /* JADX INFO: Access modifiers changed from: private */
    final class f7l8 extends RecyclerView.fti {

        /* JADX INFO: renamed from: k */
        private final TextView f22482k;

        /* JADX INFO: renamed from: n */
        private final ImageView f22483n;

        /* JADX INFO: renamed from: q */
        private final TextView f22484q;

        public f7l8(View view) {
            super(view);
            if (com.google.android.exoplayer2.util.lrht.f23230k < 26) {
                view.setFocusable(true);
            }
            this.f22482k = (TextView) view.findViewById(C3748h.f7l8.f66185nmn5);
            this.f22484q = (TextView) view.findViewById(C3748h.f7l8.f66214was);
            this.f22483n = (ImageView) view.findViewById(C3748h.f7l8.f66126ch);
            view.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.exoplayer2.ui.z
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f22869k.m13227z(view2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: z */
        public /* synthetic */ void m13227z(View view) {
            StyledPlayerControlView.this.m13202a(getAdapterPosition());
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlView$g */
    public interface InterfaceC3725g {
        /* JADX INFO: renamed from: k */
        void m13228k(long j2, long j3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class ld6 {

        /* JADX INFO: renamed from: k */
        public final pjz9.C3551k f22485k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public final int f66077toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public final String f66078zy;

        public ld6(pjz9 pjz9Var, int i2, int i3, String str) {
            this.f22485k = pjz9Var.toq().get(i2);
            this.f66077toq = i3;
            this.f66078zy = str;
        }

        /* JADX INFO: renamed from: k */
        public boolean m13229k() {
            return this.f22485k.m12513y(this.f66077toq);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlView$n */
    final class C3727n extends RecyclerView.AbstractC1060y<C3730s> {

        /* JADX INFO: renamed from: k */
        private final String[] f22487k;

        /* JADX INFO: renamed from: n */
        private int f22488n;

        /* JADX INFO: renamed from: q */
        private final int[] f22489q;

        public C3727n(String[] strArr, int[] iArr) {
            this.f22487k = strArr;
            this.f22489q = iArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void fn3e(int i2, View view) {
            if (i2 != this.f22488n) {
                StyledPlayerControlView.this.setPlaybackSpeed(this.f22489q[i2] / 100.0f);
            }
            StyledPlayerControlView.this.k6e.dismiss();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
        /* JADX INFO: renamed from: fu4, reason: merged with bridge method [inline-methods] */
        public C3730s onCreateViewHolder(ViewGroup viewGroup, int i2) {
            return new C3730s(LayoutInflater.from(StyledPlayerControlView.this.getContext()).inflate(C3748h.s.f66553ld6, viewGroup, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
        public int getItemCount() {
            return this.f22487k.length;
        }

        public String ki() {
            return this.f22487k[this.f22488n];
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
        /* JADX INFO: renamed from: ni7, reason: merged with bridge method [inline-methods] */
        public void mo6707z(C3730s c3730s, final int i2) {
            String[] strArr = this.f22487k;
            if (i2 < strArr.length) {
                c3730s.f22491k.setText(strArr[i2]);
            }
            c3730s.f22492q.setVisibility(i2 == this.f22488n ? 0 : 4);
            c3730s.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.exoplayer2.ui.fu4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f22611k.fn3e(i2, view);
                }
            });
        }

        /* JADX INFO: renamed from: z */
        public void m13230z(float f2) {
            int iRound = Math.round(f2 * 100.0f);
            int i2 = 0;
            int i3 = Integer.MAX_VALUE;
            int i4 = 0;
            while (true) {
                int[] iArr = this.f22489q;
                if (i2 >= iArr.length) {
                    this.f22488n = i4;
                    return;
                }
                int iAbs = Math.abs(iRound - iArr[i2]);
                if (iAbs < i3) {
                    i4 = i2;
                    i3 = iAbs;
                }
                i2++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlView$p */
    final class C3728p extends x2 {
        private C3728p() {
            super();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void mcp(View view) {
            if (StyledPlayerControlView.this.bq != null) {
                C3707i c3707iGbni = StyledPlayerControlView.this.bq.gbni();
                StyledPlayerControlView.this.bq.ga(c3707iGbni.zy().a9(new vep5.C4532k().zy(c3707iGbni.f66013bo).f7l8(3).mo15570n()).mo13111z());
                StyledPlayerControlView.this.k6e.dismiss();
            }
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.x2
        public void fn3e(List<ld6> list) {
            boolean z2 = false;
            int i2 = 0;
            while (true) {
                if (i2 >= list.size()) {
                    break;
                }
                if (list.get(i2).m13229k()) {
                    z2 = true;
                    break;
                }
                i2++;
            }
            if (StyledPlayerControlView.this.xy8 != null) {
                ImageView imageView = StyledPlayerControlView.this.xy8;
                StyledPlayerControlView styledPlayerControlView = StyledPlayerControlView.this;
                imageView.setImageDrawable(z2 ? styledPlayerControlView.id : styledPlayerControlView.in);
                StyledPlayerControlView.this.xy8.setContentDescription(z2 ? StyledPlayerControlView.this.bl : StyledPlayerControlView.this.as);
            }
            this.f22494k = list;
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.x2, androidx.recyclerview.widget.RecyclerView.AbstractC1060y
        /* JADX INFO: renamed from: fu4, reason: merged with bridge method [inline-methods] */
        public void mo6707z(C3730s c3730s, int i2) {
            super.mo6707z(c3730s, i2);
            if (i2 > 0) {
                c3730s.f22492q.setVisibility(this.f22494k.get(i2 + (-1)).m13229k() ? 0 : 4);
            }
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.x2
        public void wvg(String str) {
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.x2
        /* JADX INFO: renamed from: z */
        public void mo13232z(C3730s c3730s) {
            boolean z2;
            c3730s.f22491k.setText(C3748h.ld6.f66247hyr);
            int i2 = 0;
            while (true) {
                if (i2 >= this.f22494k.size()) {
                    z2 = true;
                    break;
                } else {
                    if (this.f22494k.get(i2).m13229k()) {
                        z2 = false;
                        break;
                    }
                    i2++;
                }
            }
            c3730s.f22492q.setVisibility(z2 ? 0 : 4);
            c3730s.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.exoplayer2.ui.o1t
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f22832k.mcp(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlView$q */
    public interface InterfaceC3729q {
        /* JADX INFO: renamed from: k */
        void m13233k(boolean z2);
    }

    public interface qrj {
        void toq(int i2);
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlView$s */
    private static class C3730s extends RecyclerView.fti {

        /* JADX INFO: renamed from: k */
        public final TextView f22491k;

        /* JADX INFO: renamed from: q */
        public final View f22492q;

        public C3730s(View view) {
            super(view);
            if (com.google.android.exoplayer2.util.lrht.f23230k < 26) {
                view.setFocusable(true);
            }
            this.f22491k = (TextView) view.findViewById(C3748h.f7l8.f66193py);
            this.f22492q = view.findViewById(C3748h.f7l8.f22629o);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class toq extends x2 {
        private toq() {
            super();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void jk(View view) {
            if (StyledPlayerControlView.this.bq == null) {
                return;
            }
            C3707i c3707iGbni = StyledPlayerControlView.this.bq.gbni();
            com.google.android.exoplayer2.trackselection.cdj qVar = c3707iGbni.f22302u.zy().m13080q(1).toq();
            HashSet hashSet = new HashSet(c3707iGbni.f66013bo);
            hashSet.remove(1);
            ((gc3c) com.google.android.exoplayer2.util.lrht.ld6(StyledPlayerControlView.this.bq)).ga(c3707iGbni.zy().mo13108o(qVar).a9(hashSet).mo13111z());
            StyledPlayerControlView.this.dy.fn3e(1, StyledPlayerControlView.this.getResources().getString(C3748h.ld6.f66256n5r1));
            StyledPlayerControlView.this.k6e.dismiss();
        }

        private boolean mcp(com.google.android.exoplayer2.trackselection.cdj cdjVar) {
            for (int i2 = 0; i2 < this.f22494k.size(); i2++) {
                if (cdjVar.m13077q(this.f22494k.get(i2).f22485k.zy()) != null) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.x2
        public void fn3e(List<ld6> list) {
            this.f22494k = list;
            C3707i c3707iGbni = ((gc3c) C3844k.f7l8(StyledPlayerControlView.this.bq)).gbni();
            if (list.isEmpty()) {
                StyledPlayerControlView.this.dy.fn3e(1, StyledPlayerControlView.this.getResources().getString(C3748h.ld6.f66247hyr));
                return;
            }
            if (!mcp(c3707iGbni.f22302u)) {
                StyledPlayerControlView.this.dy.fn3e(1, StyledPlayerControlView.this.getResources().getString(C3748h.ld6.f66256n5r1));
                return;
            }
            for (int i2 = 0; i2 < list.size(); i2++) {
                ld6 ld6Var = list.get(i2);
                if (ld6Var.m13229k()) {
                    StyledPlayerControlView.this.dy.fn3e(1, ld6Var.f66078zy);
                    return;
                }
            }
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.x2
        public void wvg(String str) {
            StyledPlayerControlView.this.dy.fn3e(1, str);
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.x2
        /* JADX INFO: renamed from: z */
        public void mo13232z(C3730s c3730s) {
            c3730s.f22491k.setText(C3748h.ld6.f66256n5r1);
            c3730s.f22492q.setVisibility(mcp(((gc3c) C3844k.f7l8(StyledPlayerControlView.this.bq)).gbni().f22302u) ? 4 : 0);
            c3730s.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.exoplayer2.ui.ni7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f22831k.jk(view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    abstract class x2 extends RecyclerView.AbstractC1060y<C3730s> {

        /* JADX INFO: renamed from: k */
        protected List<ld6> f22494k = new ArrayList();

        protected x2() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void ni7(C3564a c3564a, ld6 ld6Var, View view) {
            if (StyledPlayerControlView.this.bq == null) {
                return;
            }
            C3707i c3707iGbni = StyledPlayerControlView.this.bq.gbni();
            com.google.android.exoplayer2.trackselection.cdj qVar = c3707iGbni.f22302u.zy().m13079n(new cdj.zy(c3564a, se.of(Integer.valueOf(ld6Var.f66077toq)))).toq();
            HashSet hashSet = new HashSet(c3707iGbni.f66013bo);
            hashSet.remove(Integer.valueOf(ld6Var.f22485k.m12510n()));
            ((gc3c) C3844k.f7l8(StyledPlayerControlView.this.bq)).ga(c3707iGbni.zy().mo13108o(qVar).a9(hashSet).mo13111z());
            wvg(ld6Var.f66078zy);
            StyledPlayerControlView.this.k6e.dismiss();
        }

        public abstract void fn3e(List<ld6> list);

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
        /* JADX INFO: renamed from: fu4 */
        public void mo6707z(C3730s c3730s, int i2) {
            if (StyledPlayerControlView.this.bq == null) {
                return;
            }
            if (i2 == 0) {
                mo13232z(c3730s);
                return;
            }
            final ld6 ld6Var = this.f22494k.get(i2 - 1);
            final C3564a c3564aZy = ld6Var.f22485k.zy();
            boolean z2 = ((gc3c) C3844k.f7l8(StyledPlayerControlView.this.bq)).gbni().f22302u.m13077q(c3564aZy) != null && ld6Var.m13229k();
            c3730s.f22491k.setText(ld6Var.f66078zy);
            c3730s.f22492q.setVisibility(z2 ? 0 : 4);
            c3730s.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.exoplayer2.ui.wvg
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f22853k.ni7(c3564aZy, ld6Var, view);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
        public int getItemCount() {
            if (this.f22494k.isEmpty()) {
                return 0;
            }
            return this.f22494k.size() + 1;
        }

        protected void ki() {
            this.f22494k = Collections.emptyList();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
        /* JADX INFO: renamed from: o1t, reason: merged with bridge method [inline-methods] */
        public C3730s onCreateViewHolder(ViewGroup viewGroup, int i2) {
            return new C3730s(LayoutInflater.from(StyledPlayerControlView.this.getContext()).inflate(C3748h.s.f66553ld6, viewGroup, false));
        }

        protected abstract void wvg(String str);

        /* JADX INFO: renamed from: z */
        protected abstract void mo13232z(C3730s c3730s);
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlView$y */
    private class C3731y extends RecyclerView.AbstractC1060y<f7l8> {

        /* JADX INFO: renamed from: k */
        private final String[] f22497k;

        /* JADX INFO: renamed from: n */
        private final Drawable[] f22498n;

        /* JADX INFO: renamed from: q */
        private final String[] f22499q;

        public C3731y(String[] strArr, Drawable[] drawableArr) {
            this.f22497k = strArr;
            this.f22499q = new String[strArr.length];
            this.f22498n = drawableArr;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
        /* JADX INFO: renamed from: cdj, reason: merged with bridge method [inline-methods] */
        public void mo6707z(f7l8 f7l8Var, int i2) {
            f7l8Var.f22482k.setText(this.f22497k[i2]);
            if (this.f22499q[i2] == null) {
                f7l8Var.f22484q.setVisibility(8);
            } else {
                f7l8Var.f22484q.setText(this.f22499q[i2]);
            }
            if (this.f22498n[i2] == null) {
                f7l8Var.f22483n.setVisibility(8);
            } else {
                f7l8Var.f22483n.setImageDrawable(this.f22498n[i2]);
            }
        }

        public void fn3e(int i2, String str) {
            this.f22499q[i2] = str;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
        public int getItemCount() {
            return this.f22497k.length;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
        public long getItemId(int i2) {
            return i2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
        /* JADX INFO: renamed from: ki, reason: merged with bridge method [inline-methods] */
        public f7l8 onCreateViewHolder(ViewGroup viewGroup, int i2) {
            return StyledPlayerControlView.this.new f7l8(LayoutInflater.from(StyledPlayerControlView.this.getContext()).inflate(C3748h.s.f22736p, viewGroup, false));
        }
    }

    private final class zy implements gc3c.InterfaceC3440y, hyr.InterfaceC3749k, View.OnClickListener, PopupWindow.OnDismissListener {
        private zy() {
        }

        @Override // com.google.android.exoplayer2.ui.hyr.InterfaceC3749k
        public void f7l8(hyr hyrVar, long j2) {
            StyledPlayerControlView.this.bs = true;
            if (StyledPlayerControlView.this.f22460f != null) {
                StyledPlayerControlView.this.f22460f.setText(com.google.android.exoplayer2.util.lrht.lv5(StyledPlayerControlView.this.f22459e, StyledPlayerControlView.this.f22464j, j2));
            }
            StyledPlayerControlView.this.yl25.lrht();
        }

        @Override // com.google.android.exoplayer2.gc3c.InterfaceC3440y, com.google.android.exoplayer2.gc3c.InterfaceC3434g
        public void fu4(gc3c gc3cVar, gc3c.f7l8 f7l8Var) {
            if (f7l8Var.toq(4, 5)) {
                StyledPlayerControlView.this.xwq3();
            }
            if (f7l8Var.toq(4, 5, 7)) {
                StyledPlayerControlView.this.ikck();
            }
            if (f7l8Var.m12094k(8)) {
                StyledPlayerControlView.this.m13204d();
            }
            if (f7l8Var.m12094k(9)) {
                StyledPlayerControlView.this.qkj8();
            }
            if (f7l8Var.toq(8, 9, 11, 0, 16, 17, 13)) {
                StyledPlayerControlView.this.dr();
            }
            if (f7l8Var.toq(11, 0)) {
                StyledPlayerControlView.this.fnq8();
            }
            if (f7l8Var.m12094k(12)) {
                StyledPlayerControlView.this.m13219v();
            }
            if (f7l8Var.m12094k(2)) {
                StyledPlayerControlView.this.qo();
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            gc3c gc3cVar = StyledPlayerControlView.this.bq;
            if (gc3cVar == null) {
                return;
            }
            StyledPlayerControlView.this.yl25.uv6();
            if (StyledPlayerControlView.this.f22461g == view) {
                gc3cVar.zsr0();
                return;
            }
            if (StyledPlayerControlView.this.f22468n == view) {
                gc3cVar.ch();
                return;
            }
            if (StyledPlayerControlView.this.f22473s == view) {
                if (gc3cVar.getPlaybackState() != 4) {
                    gc3cVar.m2t();
                    return;
                }
                return;
            }
            if (StyledPlayerControlView.this.f22470p == view) {
                gc3cVar.ps();
                return;
            }
            if (StyledPlayerControlView.this.f22479y == view) {
                StyledPlayerControlView.this.uv6(gc3cVar);
                return;
            }
            if (StyledPlayerControlView.this.f22480z == view) {
                gc3cVar.setRepeatMode(com.google.android.exoplayer2.util.eqxt.m13576k(gc3cVar.getRepeatMode(), StyledPlayerControlView.this.bc));
                return;
            }
            if (StyledPlayerControlView.this.f22474t == view) {
                gc3cVar.kcsr(!gc3cVar.ix());
                return;
            }
            if (StyledPlayerControlView.this.ndjo == view) {
                StyledPlayerControlView.this.yl25.lrht();
                StyledPlayerControlView styledPlayerControlView = StyledPlayerControlView.this;
                styledPlayerControlView.vyq(styledPlayerControlView.dy);
                return;
            }
            if (StyledPlayerControlView.this.d1cy == view) {
                StyledPlayerControlView.this.yl25.lrht();
                StyledPlayerControlView styledPlayerControlView2 = StyledPlayerControlView.this;
                styledPlayerControlView2.vyq(styledPlayerControlView2.vb6);
            } else if (StyledPlayerControlView.this.xqx == view) {
                StyledPlayerControlView.this.yl25.lrht();
                StyledPlayerControlView styledPlayerControlView3 = StyledPlayerControlView.this;
                styledPlayerControlView3.vyq(styledPlayerControlView3.hp);
            } else if (StyledPlayerControlView.this.xy8 == view) {
                StyledPlayerControlView.this.yl25.lrht();
                StyledPlayerControlView styledPlayerControlView4 = StyledPlayerControlView.this;
                styledPlayerControlView4.vyq(styledPlayerControlView4.mjvl);
            }
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            if (StyledPlayerControlView.this.xk5) {
                StyledPlayerControlView.this.yl25.uv6();
            }
        }

        @Override // com.google.android.exoplayer2.ui.hyr.InterfaceC3749k
        public void toq(hyr hyrVar, long j2) {
            if (StyledPlayerControlView.this.f22460f != null) {
                StyledPlayerControlView.this.f22460f.setText(com.google.android.exoplayer2.util.lrht.lv5(StyledPlayerControlView.this.f22459e, StyledPlayerControlView.this.f22464j, j2));
            }
        }

        @Override // com.google.android.exoplayer2.ui.hyr.InterfaceC3749k
        public void zy(hyr hyrVar, long j2, boolean z2) {
            StyledPlayerControlView.this.bs = false;
            if (!z2 && StyledPlayerControlView.this.bq != null) {
                StyledPlayerControlView styledPlayerControlView = StyledPlayerControlView.this;
                styledPlayerControlView.nmn5(styledPlayerControlView.bq, j2);
            }
            StyledPlayerControlView.this.yl25.uv6();
        }
    }

    static {
        c8jq.m11556k("goog.exo.ui");
    }

    public StyledPlayerControlView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m13202a(int i2) {
        if (i2 == 0) {
            vyq(this.vb6);
        } else if (i2 == 1) {
            vyq(this.hp);
        } else {
            this.k6e.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a98o(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        int i10 = i5 - i3;
        int i11 = i9 - i7;
        if (!(i4 - i2 == i8 - i6 && i10 == i11) && this.k6e.isShowing()) {
            vq();
            this.k6e.update(view, (getWidth() - this.k6e.getWidth()) - this.s8y, (-this.k6e.getHeight()) - this.s8y, -1, -1);
        }
    }

    private void bo(boolean z2, @zy.dd View view) {
        if (view == null) {
            return;
        }
        view.setEnabled(z2);
        view.setAlpha(z2 ? this.bb : this.bp);
    }

    /* JADX INFO: renamed from: c */
    private void m13203c(gc3c gc3cVar) {
        gc3cVar.pause();
    }

    private void c8jq(@zy.dd ImageView imageView, boolean z2) {
        if (imageView == null) {
            return;
        }
        if (z2) {
            imageView.setImageDrawable(this.bg);
            imageView.setContentDescription(this.ba);
        } else {
            imageView.setImageDrawable(this.az);
            imageView.setContentDescription(this.ax);
        }
    }

    private void ch(gc3c gc3cVar, int i2, long j2) {
        gc3cVar.cfr(i2, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public void m13204d() {
        ImageView imageView;
        if (m13222b() && this.ay && (imageView = this.f22480z) != null) {
            if (this.bc == 0) {
                bo(false, imageView);
                return;
            }
            gc3c gc3cVar = this.bq;
            if (gc3cVar == null) {
                bo(false, imageView);
                this.f22480z.setImageDrawable(this.f22455a);
                this.f22480z.setContentDescription(this.f66076bo);
                return;
            }
            bo(true, imageView);
            int repeatMode = gc3cVar.getRepeatMode();
            if (repeatMode == 0) {
                this.f22480z.setImageDrawable(this.f22455a);
                this.f22480z.setContentDescription(this.f66076bo);
            } else if (repeatMode == 1) {
                this.f22480z.setImageDrawable(this.f22478x);
                this.f22480z.setContentDescription(this.f22476v);
            } else {
                if (repeatMode != 2) {
                    return;
                }
                this.f22480z.setImageDrawable(this.f22475u);
                this.f22480z.setContentDescription(this.f22458d);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dr() {
        boolean zMo12080d;
        boolean zMo12080d2;
        boolean z2;
        boolean zMo12080d3;
        if (m13222b() && this.ay) {
            gc3c gc3cVar = this.bq;
            boolean z3 = false;
            if (gc3cVar != null) {
                boolean zMo12080d4 = gc3cVar.mo12080d(5);
                zMo12080d2 = gc3cVar.mo12080d(7);
                boolean zMo12080d5 = gc3cVar.mo12080d(11);
                zMo12080d3 = gc3cVar.mo12080d(12);
                zMo12080d = gc3cVar.mo12080d(9);
                z2 = zMo12080d4;
                z3 = zMo12080d5;
            } else {
                zMo12080d = false;
                zMo12080d2 = false;
                z2 = false;
                zMo12080d3 = false;
            }
            if (z3) {
                mu();
            }
            if (zMo12080d3) {
                y2();
            }
            bo(zMo12080d2, this.f22468n);
            bo(z3, this.f22470p);
            bo(zMo12080d3, this.f22473s);
            bo(zMo12080d, this.f22461g);
            hyr hyrVar = this.f22457c;
            if (hyrVar != null) {
                hyrVar.setEnabled(z2);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    private se<ld6> m13205e(pjz9 pjz9Var, int i2) {
        se.C4520k c4520k = new se.C4520k();
        se<pjz9.C3551k> qVar = pjz9Var.toq();
        for (int i3 = 0; i3 < qVar.size(); i3++) {
            pjz9.C3551k c3551k = qVar.get(i3);
            if (c3551k.m12510n() == i2) {
                C3564a c3564aZy = c3551k.zy();
                for (int i4 = 0; i4 < c3564aZy.f21222k; i4++) {
                    if (c3551k.m12512s(i4)) {
                        c4520k.mo15569k(new ld6(pjz9Var, i3, i4, this.cw14.mo13291k(c3564aZy.toq(i4))));
                    }
                }
            }
        }
        return c4520k.mo15570n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d4 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void fnq8() {
        /*
            Method dump skipped, instruction units count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.StyledPlayerControlView.fnq8():void");
    }

    private static void gyi(@zy.dd View view, boolean z2) {
        if (view == null) {
            return;
        }
        if (z2) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
    }

    private static boolean hyr(pc pcVar, pc.C3550q c3550q) {
        if (pcVar.zurt() > 100) {
            return false;
        }
        int iZurt = pcVar.zurt();
        for (int i2 = 0; i2 < iZurt; i2++) {
            if (pcVar.m12484i(i2, c3550q).f21128f == C3548p.f65257toq) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i1(View view) {
        if (this.ad == null) {
            return;
        }
        boolean z2 = !this.am;
        this.am = z2;
        c8jq(this.th6, z2);
        c8jq(this.q7k9, this.am);
        InterfaceC3729q interfaceC3729q = this.ad;
        if (interfaceC3729q != null) {
            interfaceC3729q.m13233k(this.am);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ikck() {
        long jMo12092w;
        if (m13222b() && this.ay) {
            gc3c gc3cVar = this.bq;
            long jN2t = 0;
            if (gc3cVar != null) {
                jN2t = this.tgs + gc3cVar.n2t();
                jMo12092w = this.tgs + gc3cVar.mo12092w();
            } else {
                jMo12092w = 0;
            }
            TextView textView = this.f22460f;
            if (textView != null && !this.bs) {
                textView.setText(com.google.android.exoplayer2.util.lrht.lv5(this.f22459e, this.f22464j, jN2t));
            }
            hyr hyrVar = this.f22457c;
            if (hyrVar != null) {
                hyrVar.setPosition(jN2t);
                this.f22457c.setBufferedPosition(jMo12092w);
            }
            InterfaceC3725g interfaceC3725g = this.ac;
            if (interfaceC3725g != null) {
                interfaceC3725g.m13228k(jN2t, jMo12092w);
            }
            removeCallbacks(this.f22456b);
            int playbackState = gc3cVar == null ? 1 : gc3cVar.getPlaybackState();
            if (gc3cVar == null || !gc3cVar.isPlaying()) {
                if (playbackState == 4 || playbackState == 1) {
                    return;
                }
                postDelayed(this.f22456b, 1000L);
                return;
            }
            hyr hyrVar2 = this.f22457c;
            long jMin = Math.min(hyrVar2 != null ? hyrVar2.getPreferredUpdateDelay() : 1000L, 1000 - (jN2t % 1000));
            float f2 = gc3cVar.f7l8().f21216k;
            postDelayed(this.f22456b, com.google.android.exoplayer2.util.lrht.m13660i(f2 > 0.0f ? (long) (jMin / f2) : 1000L, this.ar, 1000L));
        }
    }

    private void lrht(gc3c gc3cVar) {
        int playbackState = gc3cVar.getPlaybackState();
        if (playbackState == 1) {
            gc3cVar.prepare();
        } else if (playbackState == 4) {
            ch(gc3cVar, gc3cVar.lw(), C3548p.f65257toq);
        }
        gc3cVar.play();
    }

    private boolean lv5() {
        gc3c gc3cVar = this.bq;
        return (gc3cVar == null || gc3cVar.getPlaybackState() == 4 || this.bq.getPlaybackState() == 1 || !this.bq.yqrt()) ? false : true;
    }

    /* JADX INFO: renamed from: m */
    private static void m13211m(View view, View.OnClickListener onClickListener) {
        if (view == null) {
            return;
        }
        view.setVisibility(8);
        view.setOnClickListener(onClickListener);
    }

    private void mu() {
        gc3c gc3cVar = this.bq;
        int iKiv = (int) ((gc3cVar != null ? gc3cVar.kiv() : 5000L) / 1000);
        TextView textView = this.f22463i;
        if (textView != null) {
            textView.setText(String.valueOf(iKiv));
        }
        View view = this.f22470p;
        if (view != null) {
            view.setContentDescription(this.zmmu.getQuantityString(C3748h.p.f66339toq, iKiv, Integer.valueOf(iKiv)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void nmn5(gc3c gc3cVar, long j2) {
        int iLw;
        pc pcVarD8wk = gc3cVar.d8wk();
        if (this.aj && !pcVarD8wk.ni7()) {
            int iZurt = pcVarD8wk.zurt();
            iLw = 0;
            while (true) {
                long jF7l8 = pcVarD8wk.m12484i(iLw, this.f22467m).f7l8();
                if (j2 < jF7l8) {
                    break;
                }
                if (iLw == iZurt - 1) {
                    j2 = jF7l8;
                    break;
                } else {
                    j2 -= jF7l8;
                    iLw++;
                }
            }
        } else {
            iLw = gc3cVar.lw();
        }
        ch(gc3cVar, iLw, j2);
        ikck();
    }

    private static int nn86(TypedArray typedArray, int i2) {
        return typedArray.getInt(C3748h.qrj.f66427ga, i2);
    }

    /* JADX INFO: renamed from: o */
    private void m13213o() {
        this.mjvl.ki();
        this.hp.ki();
        gc3c gc3cVar = this.bq;
        if (gc3cVar != null && gc3cVar.mo12080d(30) && this.bq.mo12080d(29)) {
            pjz9 pjz9VarTfm = this.bq.tfm();
            this.hp.fn3e(m13205e(pjz9VarTfm, 1));
            if (this.yl25.wvg(this.xy8)) {
                this.mjvl.fn3e(m13205e(pjz9VarTfm, 3));
            } else {
                this.mjvl.fn3e(se.of());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qkj8() {
        ImageView imageView;
        if (m13222b() && this.ay && (imageView = this.f22474t) != null) {
            gc3c gc3cVar = this.bq;
            if (!this.yl25.wvg(imageView)) {
                bo(false, this.f22474t);
                return;
            }
            if (gc3cVar == null) {
                bo(false, this.f22474t);
                this.f22474t.setImageDrawable(this.f66075ab);
                this.f22474t.setContentDescription(this.an);
            } else {
                bo(true, this.f22474t);
                this.f22474t.setImageDrawable(gc3cVar.ix() ? this.f22477w : this.f66075ab);
                this.f22474t.setContentDescription(gc3cVar.ix() ? this.bv : this.an);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qo() {
        m13213o();
        bo(this.mjvl.getItemCount() > 0, this.xy8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackSpeed(float f2) {
        gc3c gc3cVar = this.bq;
        if (gc3cVar == null) {
            return;
        }
        gc3cVar.ld6(gc3cVar.f7l8().m12550n(f2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uv6(gc3c gc3cVar) {
        int playbackState = gc3cVar.getPlaybackState();
        if (playbackState == 1 || playbackState == 4 || !gc3cVar.yqrt()) {
            lrht(gc3cVar);
        } else {
            m13203c(gc3cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public void m13219v() {
        gc3c gc3cVar = this.bq;
        if (gc3cVar == null) {
            return;
        }
        this.vb6.m13230z(gc3cVar.f7l8().f21216k);
        this.dy.fn3e(0, this.vb6.ki());
    }

    private void vq() {
        this.sk1t.measure(0, 0);
        this.k6e.setWidth(Math.min(this.sk1t.getMeasuredWidth(), getWidth() - (this.s8y * 2)));
        this.k6e.setHeight(Math.min(getHeight() - (this.s8y * 2), this.sk1t.getMeasuredHeight()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vyq(RecyclerView.AbstractC1060y<?> abstractC1060y) {
        this.sk1t.setAdapter(abstractC1060y);
        vq();
        this.xk5 = false;
        this.k6e.dismiss();
        this.xk5 = true;
        this.k6e.showAsDropDown(this, (getWidth() - this.k6e.getWidth()) - this.s8y, (-this.k6e.getHeight()) - this.s8y);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void xwq3() {
        if (m13222b() && this.ay && this.f22479y != null) {
            if (lv5()) {
                ((ImageView) this.f22479y).setImageDrawable(this.zmmu.getDrawable(C3748h.n.f66336zp));
                this.f22479y.setContentDescription(this.zmmu.getString(C3748h.ld6.f66252ld6));
            } else {
                ((ImageView) this.f22479y).setImageDrawable(this.zmmu.getDrawable(C3748h.n.f22681x));
                this.f22479y.setContentDescription(this.zmmu.getString(C3748h.ld6.f66269x2));
            }
        }
    }

    private void y2() {
        gc3c gc3cVar = this.bq;
        int iIj = (int) ((gc3cVar != null ? gc3cVar.ij() : C3548p.f65211lw) / 1000);
        TextView textView = this.f22462h;
        if (textView != null) {
            textView.setText(String.valueOf(iIj));
        }
        View view = this.f22473s;
        if (view != null) {
            view.setContentDescription(this.zmmu.getQuantityString(C3748h.p.f22684k, iIj, Integer.valueOf(iIj)));
        }
    }

    @SuppressLint({"InlinedApi"})
    private static boolean y9n(int i2) {
        return i2 == 90 || i2 == 89 || i2 == 85 || i2 == 79 || i2 == 126 || i2 == 127 || i2 == 87 || i2 == 88;
    }

    /* JADX INFO: renamed from: b */
    public boolean m13222b() {
        return getVisibility() == 0;
    }

    void bf2() {
        Iterator<qrj> it = this.f22471q.iterator();
        while (it.hasNext()) {
            it.next().toq(getVisibility());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return m13223f(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public boolean ek5k() {
        return this.yl25.d3();
    }

    /* JADX INFO: renamed from: f */
    public boolean m13223f(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        gc3c gc3cVar = this.bq;
        if (gc3cVar == null || !y9n(keyCode)) {
            return false;
        }
        if (keyEvent.getAction() != 0) {
            return true;
        }
        if (keyCode == 90) {
            if (gc3cVar.getPlaybackState() == 4) {
                return true;
            }
            gc3cVar.m2t();
            return true;
        }
        if (keyCode == 89) {
            gc3cVar.ps();
            return true;
        }
        if (keyEvent.getRepeatCount() != 0) {
            return true;
        }
        if (keyCode == 79 || keyCode == 85) {
            uv6(gc3cVar);
            return true;
        }
        if (keyCode == 87) {
            gc3cVar.zsr0();
            return true;
        }
        if (keyCode == 88) {
            gc3cVar.ch();
            return true;
        }
        if (keyCode == 126) {
            lrht(gc3cVar);
            return true;
        }
        if (keyCode != 127) {
            return true;
        }
        m13203c(gc3cVar);
        return true;
    }

    @zy.dd
    public gc3c getPlayer() {
        return this.bq;
    }

    public int getRepeatToggleModes() {
        return this.bc;
    }

    public boolean getShowShuffleButton() {
        return this.yl25.wvg(this.f22474t);
    }

    public boolean getShowSubtitleButton() {
        return this.yl25.wvg(this.xy8);
    }

    public int getShowTimeoutMs() {
        return this.k0;
    }

    public boolean getShowVrButton() {
        return this.yl25.wvg(this.f22472r);
    }

    public void hb() {
        this.yl25.mcp();
    }

    /* JADX INFO: renamed from: j */
    public void m13224j() {
        this.yl25.fti();
    }

    public void n5r1(qrj qrjVar) {
        C3844k.f7l8(qrjVar);
        this.f22471q.add(qrjVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.yl25.x9kr();
        this.ay = true;
        if (yz()) {
            this.yl25.uv6();
        }
        m13225u();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.yl25.ncyb();
        this.ay = false;
        removeCallbacks(this.f22456b);
        this.yl25.lrht();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        this.yl25.m13285l(z2, i2, i3, i4, i5);
    }

    public void setAnimationEnabled(boolean z2) {
        this.yl25.vyq(z2);
    }

    public void setExtraAdGroupMarkers(@zy.dd long[] jArr, @zy.dd boolean[] zArr) {
        if (jArr == null) {
            this.tlhn = new long[0];
            this.w97r = new boolean[0];
        } else {
            boolean[] zArr2 = (boolean[]) C3844k.f7l8(zArr);
            C3844k.m13629k(jArr.length == zArr2.length);
            this.tlhn = jArr;
            this.w97r = zArr2;
        }
        fnq8();
    }

    public void setOnFullScreenModeChangedListener(@zy.dd InterfaceC3729q interfaceC3729q) {
        this.ad = interfaceC3729q;
        gyi(this.th6, interfaceC3729q != null);
        gyi(this.q7k9, interfaceC3729q != null);
    }

    public void setPlayer(@zy.dd gc3c gc3cVar) {
        boolean z2 = true;
        C3844k.m13633s(Looper.myLooper() == Looper.getMainLooper());
        if (gc3cVar != null && gc3cVar.g1() != Looper.getMainLooper()) {
            z2 = false;
        }
        C3844k.m13629k(z2);
        gc3c gc3cVar2 = this.bq;
        if (gc3cVar2 == gc3cVar) {
            return;
        }
        if (gc3cVar2 != null) {
            gc3cVar2.mo12081e(this.f22465k);
        }
        this.bq = gc3cVar;
        if (gc3cVar != null) {
            gc3cVar.ngy(this.f22465k);
        }
        if (gc3cVar instanceof ikck) {
            ((ikck) gc3cVar).bih();
        }
        m13225u();
    }

    public void setProgressUpdateListener(@zy.dd InterfaceC3725g interfaceC3725g) {
        this.ac = interfaceC3725g;
    }

    public void setRepeatToggleModes(int i2) {
        this.bc = i2;
        gc3c gc3cVar = this.bq;
        if (gc3cVar != null) {
            int repeatMode = gc3cVar.getRepeatMode();
            if (i2 == 0 && repeatMode != 0) {
                this.bq.setRepeatMode(0);
            } else if (i2 == 1 && repeatMode == 2) {
                this.bq.setRepeatMode(1);
            } else if (i2 == 2 && repeatMode == 1) {
                this.bq.setRepeatMode(2);
            }
        }
        this.yl25.m13283e(this.f22480z, i2 != 0);
        m13204d();
    }

    public void setShowFastForwardButton(boolean z2) {
        this.yl25.m13283e(this.f22473s, z2);
        dr();
    }

    public void setShowMultiWindowTimeBar(boolean z2) {
        this.be = z2;
        fnq8();
    }

    public void setShowNextButton(boolean z2) {
        this.yl25.m13283e(this.f22461g, z2);
        dr();
    }

    public void setShowPreviousButton(boolean z2) {
        this.yl25.m13283e(this.f22468n, z2);
        dr();
    }

    public void setShowRewindButton(boolean z2) {
        this.yl25.m13283e(this.f22470p, z2);
        dr();
    }

    public void setShowShuffleButton(boolean z2) {
        this.yl25.m13283e(this.f22474t, z2);
        qkj8();
    }

    public void setShowSubtitleButton(boolean z2) {
        this.yl25.m13283e(this.xy8, z2);
    }

    public void setShowTimeoutMs(int i2) {
        this.k0 = i2;
        if (yz()) {
            this.yl25.uv6();
        }
    }

    public void setShowVrButton(boolean z2) {
        this.yl25.m13283e(this.f22472r, z2);
    }

    public void setTimeBarMinUpdateInterval(int i2) {
        this.ar = com.google.android.exoplayer2.util.lrht.t8r(i2, 16, 1000);
    }

    public void setVrButtonListener(@zy.dd View.OnClickListener onClickListener) {
        View view = this.f22472r;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            bo(onClickListener != null, this.f22472r);
        }
    }

    public void t8iq() {
        this.yl25.m13284j();
    }

    /* JADX INFO: renamed from: u */
    void m13225u() {
        xwq3();
        dr();
        m13204d();
        qkj8();
        qo();
        m13219v();
        fnq8();
    }

    /* JADX INFO: renamed from: x */
    void m13226x() {
        View view = this.f22479y;
        if (view != null) {
            view.requestFocus();
        }
    }

    public boolean yz() {
        return this.yl25.oc();
    }

    public void zp(qrj qrjVar) {
        this.f22471q.remove(qrjVar);
    }

    public StyledPlayerControlView(Context context, @zy.dd AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public StyledPlayerControlView(Context context, @zy.dd AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v66, types: [android.view.LayoutInflater] */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v4, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v5, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v7, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [android.view.ViewGroup, com.google.android.exoplayer2.ui.StyledPlayerControlView$k] */
    /* JADX WARN: Type inference failed for: r9v4 */
    public StyledPlayerControlView(Context context, @zy.dd AttributeSet attributeSet, int i2, @zy.dd AttributeSet attributeSet2) {
        boolean z2;
        boolean z3;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        zy zyVar;
        boolean z11;
        boolean z12;
        ?? r9;
        boolean z13;
        super(context, attributeSet, i2);
        int resourceId = C3748h.s.f66548f7l8;
        this.k0 = 5000;
        this.bc = 0;
        this.ar = 200;
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, C3748h.qrj.f66440ij, i2, 0);
            try {
                resourceId = typedArrayObtainStyledAttributes.getResourceId(C3748h.qrj.f66389bap7, resourceId);
                this.k0 = typedArrayObtainStyledAttributes.getInt(C3748h.qrj.f66387b8, this.k0);
                this.bc = nn86(typedArrayObtainStyledAttributes, this.bc);
                boolean z14 = typedArrayObtainStyledAttributes.getBoolean(C3748h.qrj.f66467m58i, true);
                boolean z15 = typedArrayObtainStyledAttributes.getBoolean(C3748h.qrj.f66431gcp, true);
                boolean z16 = typedArrayObtainStyledAttributes.getBoolean(C3748h.qrj.f66483o05, true);
                boolean z17 = typedArrayObtainStyledAttributes.getBoolean(C3748h.qrj.f66488oki, true);
                boolean z18 = typedArrayObtainStyledAttributes.getBoolean(C3748h.qrj.f66402cnbm, false);
                boolean z19 = typedArrayObtainStyledAttributes.getBoolean(C3748h.qrj.f66388b9ub, false);
                boolean z20 = typedArrayObtainStyledAttributes.getBoolean(C3748h.qrj.f66478nme, false);
                setTimeBarMinUpdateInterval(typedArrayObtainStyledAttributes.getInt(C3748h.qrj.f66496r25n, this.ar));
                boolean z21 = typedArrayObtainStyledAttributes.getBoolean(C3748h.qrj.f66472n2t, true);
                typedArrayObtainStyledAttributes.recycle();
                z3 = z18;
                z5 = z19;
                z7 = z14;
                z8 = z15;
                z9 = z16;
                z6 = z21;
                z10 = z17;
                z2 = z20;
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            z2 = false;
            z3 = false;
            z5 = false;
            z6 = true;
            z7 = true;
            z8 = true;
            z9 = true;
            z10 = true;
        }
        LayoutInflater.from(context).inflate(resourceId, this);
        setDescendantFocusability(262144);
        zy zyVar2 = new zy();
        this.f22465k = zyVar2;
        this.f22471q = new CopyOnWriteArrayList<>();
        this.f22469o = new pc.toq();
        this.f22467m = new pc.C3550q();
        StringBuilder sb = new StringBuilder();
        this.f22459e = sb;
        this.f22464j = new Formatter(sb, Locale.getDefault());
        this.bu = new long[0];
        this.bd = new boolean[0];
        this.tlhn = new long[0];
        this.w97r = new boolean[0];
        this.f22456b = new Runnable() { // from class: com.google.android.exoplayer2.ui.i
            @Override // java.lang.Runnable
            public final void run() {
                this.f22785k.ikck();
            }
        };
        this.f22466l = (TextView) findViewById(C3748h.f7l8.f22616b);
        this.f22460f = (TextView) findViewById(C3748h.f7l8.f66158ikck);
        ImageView imageView = (ImageView) findViewById(C3748h.f7l8.f66146gbni);
        this.xy8 = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(zyVar2);
        }
        ImageView imageView2 = (ImageView) findViewById(C3748h.f7l8.f22637x);
        this.th6 = imageView2;
        m13211m(imageView2, new View.OnClickListener() { // from class: com.google.android.exoplayer2.ui.fn3e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22609k.i1(view);
            }
        });
        ImageView imageView3 = (ImageView) findViewById(C3748h.f7l8.f66200t8iq);
        this.q7k9 = imageView3;
        m13211m(imageView3, new View.OnClickListener() { // from class: com.google.android.exoplayer2.ui.fn3e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22609k.i1(view);
            }
        });
        View viewFindViewById = findViewById(C3748h.f7l8.f66202tfm);
        this.ndjo = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(zyVar2);
        }
        View viewFindViewById2 = findViewById(C3748h.f7l8.f22636v);
        this.d1cy = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(zyVar2);
        }
        View viewFindViewById3 = findViewById(C3748h.f7l8.f66212vyq);
        this.xqx = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(zyVar2);
        }
        int i3 = C3748h.f7l8.f66178mu;
        hyr hyrVar = (hyr) findViewById(i3);
        View viewFindViewById4 = findViewById(C3748h.f7l8.f66210vq);
        if (hyrVar != null) {
            this.f22457c = hyrVar;
            zyVar = zyVar2;
            z11 = z6;
            z12 = z2;
            r9 = 0;
        } else if (viewFindViewById4 != null) {
            r9 = 0;
            zyVar = zyVar2;
            z11 = z6;
            z12 = z2;
            DefaultTimeBar defaultTimeBar = new DefaultTimeBar(context, null, 0, attributeSet2, C3748h.x2.f66626mcp);
            defaultTimeBar.setId(i3);
            defaultTimeBar.setLayoutParams(viewFindViewById4.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById4.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById4);
            viewGroup.removeView(viewFindViewById4);
            viewGroup.addView(defaultTimeBar, iIndexOfChild);
            this.f22457c = defaultTimeBar;
        } else {
            zyVar = zyVar2;
            z11 = z6;
            z12 = z2;
            r9 = 0;
            this.f22457c = null;
        }
        hyr hyrVar2 = this.f22457c;
        zy zyVar3 = zyVar;
        if (hyrVar2 != null) {
            hyrVar2.toq(zyVar3);
        }
        View viewFindViewById5 = findViewById(C3748h.f7l8.f66221xwq3);
        this.f22479y = viewFindViewById5;
        if (viewFindViewById5 != null) {
            viewFindViewById5.setOnClickListener(zyVar3);
        }
        View viewFindViewById6 = findViewById(C3748h.f7l8.f22618d);
        this.f22468n = viewFindViewById6;
        if (viewFindViewById6 != null) {
            viewFindViewById6.setOnClickListener(zyVar3);
        }
        View viewFindViewById7 = findViewById(C3748h.f7l8.f22635u);
        this.f22461g = viewFindViewById7;
        if (viewFindViewById7 != null) {
            viewFindViewById7.setOnClickListener(zyVar3);
        }
        Typeface typefaceM2331p = C0506s.m2331p(context, C3748h.g.f22640k);
        ?? FindViewById = findViewById(C3748h.f7l8.f66141fnq8);
        ?? r6 = FindViewById == 0 ? (TextView) findViewById(C3748h.f7l8.f66195qo) : r9;
        this.f22463i = r6;
        if (r6 != 0) {
            r6.setTypeface(typefaceM2331p);
        }
        FindViewById = FindViewById == 0 ? r6 : FindViewById;
        this.f22470p = FindViewById;
        if (FindViewById != 0) {
            FindViewById.setOnClickListener(zyVar3);
        }
        ?? FindViewById2 = findViewById(C3748h.f7l8.f22615a);
        ?? r62 = FindViewById2 == 0 ? (TextView) findViewById(C3748h.f7l8.f66229zp) : r9;
        this.f22462h = r62;
        if (r62 != 0) {
            r62.setTypeface(typefaceM2331p);
        }
        FindViewById2 = FindViewById2 == 0 ? r62 : FindViewById2;
        this.f22473s = FindViewById2;
        if (FindViewById2 != 0) {
            FindViewById2.setOnClickListener(zyVar3);
        }
        ImageView imageView4 = (ImageView) findViewById(C3748h.f7l8.f66194qkj8);
        this.f22480z = imageView4;
        if (imageView4 != null) {
            imageView4.setOnClickListener(zyVar3);
        }
        ImageView imageView5 = (ImageView) findViewById(C3748h.f7l8.f66130d8wk);
        this.f22474t = imageView5;
        if (imageView5 != null) {
            imageView5.setOnClickListener(zyVar3);
        }
        this.zmmu = context.getResources();
        this.bb = r2.getInteger(C3748h.y.f66642zy) / 100.0f;
        this.bp = this.zmmu.getInteger(C3748h.y.f66641toq) / 100.0f;
        View viewFindViewById8 = findViewById(C3748h.f7l8.f66197r8s8);
        this.f22472r = viewFindViewById8;
        if (viewFindViewById8 != null) {
            bo(false, viewFindViewById8);
        }
        dd ddVar = new dd(this);
        this.yl25 = ddVar;
        ddVar.vyq(z11);
        this.dy = new C3731y(new String[]{this.zmmu.getString(C3748h.ld6.f66263qrj), this.zmmu.getString(C3748h.ld6.f22644f)}, new Drawable[]{this.zmmu.getDrawable(C3748h.n.f66294gyi), this.zmmu.getDrawable(C3748h.n.f66285ek5k)});
        this.s8y = this.zmmu.getDimensionPixelSize(C3748h.q.f66351fu4);
        RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(context).inflate(C3748h.s.f22738s, r9);
        this.sk1t = recyclerView;
        recyclerView.setAdapter(this.dy);
        this.sk1t.setLayoutManager(new LinearLayoutManager(getContext()));
        PopupWindow popupWindow = new PopupWindow((View) this.sk1t, -2, -2, true);
        this.k6e = popupWindow;
        if (com.google.android.exoplayer2.util.lrht.f23230k < 23) {
            z13 = false;
            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        } else {
            z13 = false;
        }
        this.k6e.setOnDismissListener(zyVar3);
        this.xk5 = true;
        this.cw14 = new C3764s(getResources());
        this.id = this.zmmu.getDrawable(C3748h.n.f66332xwq3);
        this.in = this.zmmu.getDrawable(C3748h.n.f66284dr);
        this.bl = this.zmmu.getString(C3748h.ld6.f66265toq);
        this.as = this.zmmu.getString(C3748h.ld6.f22649k);
        this.mjvl = new C3728p();
        this.hp = new toq();
        this.vb6 = new C3727n(this.zmmu.getStringArray(C3748h.k.f22641k), this.zmmu.getIntArray(C3748h.k.f66234toq));
        this.bg = this.zmmu.getDrawable(C3748h.n.f66275bf2);
        this.az = this.zmmu.getDrawable(C3748h.n.f22660b);
        this.f22455a = this.zmmu.getDrawable(C3748h.n.f66305lv5);
        this.f22478x = this.zmmu.getDrawable(C3748h.n.f66320t8iq);
        this.f22475u = this.zmmu.getDrawable(C3748h.n.f66313nmn5);
        this.f22477w = this.zmmu.getDrawable(C3748h.n.f66277c8jq);
        this.f66075ab = this.zmmu.getDrawable(C3748h.n.f66333y2);
        this.ba = this.zmmu.getString(C3748h.ld6.f22645g);
        this.ax = this.zmmu.getString(C3748h.ld6.f22651n);
        this.f66076bo = this.zmmu.getString(C3748h.ld6.f66236cdj);
        this.f22476v = this.zmmu.getString(C3748h.ld6.f66250ki);
        this.f22458d = this.zmmu.getString(C3748h.ld6.f22646h);
        this.bv = this.zmmu.getString(C3748h.ld6.f66244fu4);
        this.an = this.zmmu.getString(C3748h.ld6.f66259ni7);
        this.yl25.m13283e((ViewGroup) findViewById(C3748h.f7l8.f66186nn86), true);
        this.yl25.m13283e(this.f22473s, z8);
        this.yl25.m13283e(this.f22470p, z7);
        this.yl25.m13283e(this.f22468n, z9);
        this.yl25.m13283e(this.f22461g, z10);
        this.yl25.m13283e(this.f22474t, z3);
        this.yl25.m13283e(this.xy8, z5);
        this.yl25.m13283e(this.f22472r, z12);
        this.yl25.m13283e(this.f22480z, this.bc != 0 ? true : z13);
        addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.google.android.exoplayer2.ui.zurt
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
                this.f22870k.a98o(view, i4, i5, i6, i7, i8, i9, i10, i11);
            }
        });
    }
}
