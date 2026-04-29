package com.google.android.exoplayer2.ui;

import android.R;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.DialogInterfaceC0102q;
import com.google.android.exoplayer2.source.C3629x;
import com.google.android.exoplayer2.trackselection.C3705g;
import com.google.android.exoplayer2.trackselection.ld6;
import com.google.android.exoplayer2.ui.C3748h;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.xwq3;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import zy.hb;

/* JADX INFO: compiled from: TrackSelectionDialogBuilder.java */
/* JADX INFO: loaded from: classes2.dex */
public final class uv6 {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private boolean f66711f7l8;

    /* JADX INFO: renamed from: g */
    private final InterfaceC3766k f22845g;

    /* JADX INFO: renamed from: k */
    private final Context f22846k;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private boolean f66712ld6;

    /* JADX INFO: renamed from: n */
    private final int f22847n;

    /* JADX INFO: renamed from: p */
    @zy.dd
    private InterfaceC3746f f22848p;

    /* JADX INFO: renamed from: q */
    private final ld6.C3709k f22849q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    @zy.dd
    private Comparator<xwq3> f66713qrj;

    /* JADX INFO: renamed from: s */
    private boolean f22850s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @hb
    private int f66714toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private List<C3705g.g> f66715x2;

    /* JADX INFO: renamed from: y */
    private boolean f22851y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final CharSequence f66716zy;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.uv6$k */
    /* JADX INFO: compiled from: TrackSelectionDialogBuilder.java */
    public interface InterfaceC3766k {
        /* JADX INFO: renamed from: k */
        void mo13319k(boolean z2, List<C3705g.g> list);
    }

    public uv6(Context context, CharSequence charSequence, ld6.C3709k c3709k, int i2, InterfaceC3766k interfaceC3766k) {
        this.f22846k = context;
        this.f66716zy = charSequence;
        this.f22849q = c3709k;
        this.f22847n = i2;
        this.f22845g = interfaceC3766k;
        this.f66715x2 = Collections.emptyList();
    }

    private DialogInterface.OnClickListener cdj(View view) {
        final TrackSelectionView trackSelectionView = (TrackSelectionView) view.findViewById(C3748h.f7l8.f66171ltg8);
        trackSelectionView.setAllowMultipleOverrides(this.f22851y);
        trackSelectionView.setAllowAdaptiveSelections(this.f66711f7l8);
        trackSelectionView.setShowDisableOption(this.f22850s);
        InterfaceC3746f interfaceC3746f = this.f22848p;
        if (interfaceC3746f != null) {
            trackSelectionView.setTrackNameProvider(interfaceC3746f);
        }
        trackSelectionView.m13255n(this.f22849q, this.f22847n, this.f66712ld6, this.f66715x2, this.f66713qrj, null);
        return new DialogInterface.OnClickListener() { // from class: com.google.android.exoplayer2.ui.c
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                this.f22563k.f7l8(trackSelectionView, dialogInterface, i2);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f7l8(TrackSelectionView trackSelectionView, DialogInterface dialogInterface, int i2) {
        this.f22845g.mo13319k(trackSelectionView.getIsDisabled(), trackSelectionView.getOverrides());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m13336g(C3705g c3705g, C3705g.q qVar, int i2, C3629x c3629x, boolean z2, List list) {
        c3705g.mo13094y(com.google.android.exoplayer2.trackselection.fn3e.zy(qVar, i2, c3629x, z2, list.isEmpty() ? null : (C3705g.g) list.get(0)));
    }

    /* JADX INFO: renamed from: n */
    private Dialog m13338n() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f22846k, this.f66714toq);
        View viewInflate = LayoutInflater.from(builder.getContext()).inflate(C3748h.s.f66561x2, (ViewGroup) null);
        return builder.setTitle(this.f66716zy).setView(viewInflate).setPositiveButton(R.string.ok, cdj(viewInflate)).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).create();
    }

    @zy.dd
    /* JADX INFO: renamed from: q */
    private Dialog m13339q() {
        try {
            Class cls = Integer.TYPE;
            Object objNewInstance = DialogInterfaceC0102q.k.class.getConstructor(Context.class, cls).newInstance(this.f22846k, Integer.valueOf(this.f66714toq));
            View viewInflate = LayoutInflater.from((Context) DialogInterfaceC0102q.k.class.getMethod("getContext", new Class[0]).invoke(objNewInstance, new Object[0])).inflate(C3748h.s.f66561x2, (ViewGroup) null);
            DialogInterface.OnClickListener onClickListenerCdj = cdj(viewInflate);
            DialogInterfaceC0102q.k.class.getMethod("setTitle", CharSequence.class).invoke(objNewInstance, this.f66716zy);
            DialogInterfaceC0102q.k.class.getMethod("setView", View.class).invoke(objNewInstance, viewInflate);
            DialogInterfaceC0102q.k.class.getMethod("setPositiveButton", cls, DialogInterface.OnClickListener.class).invoke(objNewInstance, Integer.valueOf(R.string.ok), onClickListenerCdj);
            DialogInterfaceC0102q.k.class.getMethod("setNegativeButton", cls, DialogInterface.OnClickListener.class).invoke(objNewInstance, Integer.valueOf(R.string.cancel), null);
            return (Dialog) DialogInterfaceC0102q.k.class.getMethod("create", new Class[0]).invoke(objNewInstance, new Object[0]);
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (Exception e2) {
            throw new IllegalStateException(e2);
        }
    }

    /* JADX INFO: renamed from: h */
    public uv6 m13340h(@zy.dd InterfaceC3746f interfaceC3746f) {
        this.f22848p = interfaceC3746f;
        return this;
    }

    public void kja0(@zy.dd Comparator<xwq3> comparator) {
        this.f66713qrj = comparator;
    }

    public uv6 ld6(@zy.dd C3705g.g gVar) {
        return x2(gVar == null ? Collections.emptyList() : Collections.singletonList(gVar));
    }

    public uv6 n7h(@hb int i2) {
        this.f66714toq = i2;
        return this;
    }

    /* JADX INFO: renamed from: p */
    public uv6 m13341p(boolean z2) {
        this.f66712ld6 = z2;
        return this;
    }

    public uv6 qrj(boolean z2) {
        this.f22850s = z2;
        return this;
    }

    /* JADX INFO: renamed from: s */
    public uv6 m13342s(boolean z2) {
        this.f22851y = z2;
        return this;
    }

    public uv6 x2(List<C3705g.g> list) {
        this.f66715x2 = list;
        return this;
    }

    /* JADX INFO: renamed from: y */
    public uv6 m13343y(boolean z2) {
        this.f66711f7l8 = z2;
        return this;
    }

    public Dialog zy() {
        Dialog dialogM13339q = m13339q();
        return dialogM13339q == null ? m13338n() : dialogM13339q;
    }

    public uv6(Context context, CharSequence charSequence, final C3705g c3705g, final int i2) {
        this.f22846k = context;
        this.f66716zy = charSequence;
        ld6.C3709k c3709k = (ld6.C3709k) C3844k.f7l8(c3705g.ld6());
        this.f22849q = c3709k;
        this.f22847n = i2;
        final C3629x c3629xF7l8 = c3709k.f7l8(i2);
        final C3705g.q qVar = c3705g.toq();
        this.f66712ld6 = qVar.cdj(i2);
        C3705g.g gVarKi = qVar.ki(i2, c3629xF7l8);
        this.f66715x2 = gVarKi == null ? Collections.emptyList() : Collections.singletonList(gVarKi);
        this.f22845g = new InterfaceC3766k() { // from class: com.google.android.exoplayer2.ui.lrht
            @Override // com.google.android.exoplayer2.ui.uv6.InterfaceC3766k
            /* JADX INFO: renamed from: k */
            public final void mo13319k(boolean z2, List list) {
                uv6.m13336g(c3705g, qVar, i2, c3629xF7l8, z2, list);
            }
        };
    }
}
