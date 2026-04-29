package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.C0339g;
import androidx.constraintlayout.core.widgets.C0340k;
import androidx.constraintlayout.core.widgets.C0341n;
import androidx.constraintlayout.core.widgets.C0342p;
import androidx.constraintlayout.core.widgets.C0343q;
import androidx.constraintlayout.core.widgets.C0345y;
import androidx.constraintlayout.core.widgets.analyzer.toq;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.analyzer.n */
/* JADX INFO: compiled from: DependencyGraph.java */
/* JADX INFO: loaded from: classes.dex */
public class C0330n {

    /* JADX INFO: renamed from: p */
    private static final boolean f1987p = true;

    /* JADX INFO: renamed from: k */
    private C0339g f1989k;

    /* JADX INFO: renamed from: q */
    private C0339g f1991q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private boolean f47708toq = true;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private boolean f47709zy = true;

    /* JADX INFO: renamed from: n */
    private ArrayList<AbstractC0327h> f1990n = new ArrayList<>();

    /* JADX INFO: renamed from: g */
    private ArrayList<qrj> f1988g = new ArrayList<>();

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private toq.InterfaceC7855toq f47707f7l8 = null;

    /* JADX INFO: renamed from: y */
    private toq.C0335k f1993y = new toq.C0335k();

    /* JADX INFO: renamed from: s */
    ArrayList<qrj> f1992s = new ArrayList<>();

    public C0330n(C0339g c0339g) {
        this.f1989k = c0339g;
        this.f1991q = c0339g;
    }

    private boolean cdj(C0326g c0326g, C0326g c0326g2) {
        Iterator<C0326g> it = c0326g.f47696x2.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (it.next() != c0326g2) {
                i2++;
            }
        }
        Iterator<C0326g> it2 = c0326g2.f47696x2.iterator();
        int i3 = 0;
        while (it2.hasNext()) {
            if (it2.next() != c0326g) {
                i3++;
            }
        }
        return i2 > 0 && i3 > 0;
    }

    /* JADX INFO: renamed from: i */
    private String m1273i(AbstractC0327h abstractC0327h) {
        boolean z2 = abstractC0327h instanceof n7h;
        String strM1332z = abstractC0327h.f47699toq.m1332z();
        StringBuilder sb = new StringBuilder(strM1332z);
        C0341n c0341n = abstractC0327h.f47699toq;
        C0341n.toq toqVarGvn7 = !z2 ? c0341n.gvn7() : c0341n.bf2();
        qrj qrjVar = abstractC0327h.f47700zy;
        if (z2) {
            sb.append("_VERTICAL");
        } else {
            sb.append("_HORIZONTAL");
        }
        sb.append(" [shape=none, label=<");
        sb.append("<TABLE BORDER=\"0\" CELLSPACING=\"0\" CELLPADDING=\"2\">");
        sb.append("  <TR>");
        if (z2) {
            sb.append("    <TD ");
            if (abstractC0327h.f1974y.f1963p) {
                sb.append(" BGCOLOR=\"green\"");
            }
            sb.append(" PORT=\"TOP\" BORDER=\"1\">T</TD>");
        } else {
            sb.append("    <TD ");
            if (abstractC0327h.f1974y.f1963p) {
                sb.append(" BGCOLOR=\"green\"");
            }
            sb.append(" PORT=\"LEFT\" BORDER=\"1\">L</TD>");
        }
        sb.append("    <TD BORDER=\"1\" ");
        boolean z3 = abstractC0327h.f1970n.f1963p;
        if (z3 && !abstractC0327h.f47699toq.f2050k) {
            sb.append(" BGCOLOR=\"green\" ");
        } else if (z3) {
            sb.append(" BGCOLOR=\"lightgray\" ");
        } else if (abstractC0327h.f47699toq.f2050k) {
            sb.append(" BGCOLOR=\"yellow\" ");
        }
        if (toqVarGvn7 == C0341n.toq.MATCH_CONSTRAINT) {
            sb.append("style=\"dashed\"");
        }
        sb.append(">");
        sb.append(strM1332z);
        if (qrjVar != null) {
            sb.append(" [");
            sb.append(qrjVar.f1998g + 1);
            sb.append("/");
            sb.append(qrj.f47712ld6);
            sb.append("]");
        }
        sb.append(" </TD>");
        if (z2) {
            sb.append("    <TD ");
            if (((n7h) abstractC0327h).f47710ld6.f1963p) {
                sb.append(" BGCOLOR=\"green\"");
            }
            sb.append(" PORT=\"BASELINE\" BORDER=\"1\">b</TD>");
            sb.append("    <TD ");
            if (abstractC0327h.f1973s.f1963p) {
                sb.append(" BGCOLOR=\"green\"");
            }
            sb.append(" PORT=\"BOTTOM\" BORDER=\"1\">B</TD>");
        } else {
            sb.append("    <TD ");
            if (abstractC0327h.f1973s.f1963p) {
                sb.append(" BGCOLOR=\"green\"");
            }
            sb.append(" PORT=\"RIGHT\" BORDER=\"1\">R</TD>");
        }
        sb.append("  </TR></TABLE>");
        sb.append(">];\n");
        return sb.toString();
    }

    /* JADX INFO: renamed from: k */
    private void m1274k(C0326g c0326g, int i2, int i3, C0326g c0326g2, ArrayList<qrj> arrayList, qrj qrjVar) {
        AbstractC0327h abstractC0327h = c0326g.f1964q;
        if (abstractC0327h.f47700zy == null) {
            C0339g c0339g = this.f1989k;
            if (abstractC0327h == c0339g.f2053n || abstractC0327h == c0339g.f2046g) {
                return;
            }
            if (qrjVar == null) {
                qrjVar = new qrj(abstractC0327h, i3);
                arrayList.add(qrjVar);
            }
            abstractC0327h.f47700zy = qrjVar;
            qrjVar.m1284k(abstractC0327h);
            for (InterfaceC0333q interfaceC0333q : abstractC0327h.f1974y.f47694ld6) {
                if (interfaceC0333q instanceof C0326g) {
                    m1274k((C0326g) interfaceC0333q, i2, 0, c0326g2, arrayList, qrjVar);
                }
            }
            for (InterfaceC0333q interfaceC0333q2 : abstractC0327h.f1973s.f47694ld6) {
                if (interfaceC0333q2 instanceof C0326g) {
                    m1274k((C0326g) interfaceC0333q2, i2, 1, c0326g2, arrayList, qrjVar);
                }
            }
            if (i2 == 1 && (abstractC0327h instanceof n7h)) {
                for (InterfaceC0333q interfaceC0333q3 : ((n7h) abstractC0327h).f47710ld6.f47694ld6) {
                    if (interfaceC0333q3 instanceof C0326g) {
                        m1274k((C0326g) interfaceC0333q3, i2, 2, c0326g2, arrayList, qrjVar);
                    }
                }
            }
            for (C0326g c0326g3 : abstractC0327h.f1974y.f47696x2) {
                if (c0326g3 == c0326g2) {
                    qrjVar.f47714toq = true;
                }
                m1274k(c0326g3, i2, 0, c0326g2, arrayList, qrjVar);
            }
            for (C0326g c0326g4 : abstractC0327h.f1973s.f47696x2) {
                if (c0326g4 == c0326g2) {
                    qrjVar.f47714toq = true;
                }
                m1274k(c0326g4, i2, 1, c0326g2, arrayList, qrjVar);
            }
            if (i2 == 1 && (abstractC0327h instanceof n7h)) {
                Iterator<C0326g> it = ((n7h) abstractC0327h).f47710ld6.f47696x2.iterator();
                while (it.hasNext()) {
                    m1274k(it.next(), i2, 2, c0326g2, arrayList, qrjVar);
                }
            }
        }
    }

    private void ki(C0341n c0341n, C0341n.toq toqVar, int i2, C0341n.toq toqVar2, int i3) {
        toq.C0335k c0335k = this.f1993y;
        c0335k.f2011k = toqVar;
        c0335k.f47725toq = toqVar2;
        c0335k.f47726zy = i2;
        c0335k.f2014q = i3;
        this.f47707f7l8.toq(c0341n, c0335k);
        c0341n.m2t(this.f1993y.f2012n);
        c0341n.pc(this.f1993y.f2010g);
        c0341n.ebn(this.f1993y.f2016y);
        c0341n.bz2(this.f1993y.f47724f7l8);
    }

    private void ld6(AbstractC0327h abstractC0327h, int i2, ArrayList<qrj> arrayList) {
        for (InterfaceC0333q interfaceC0333q : abstractC0327h.f1974y.f47694ld6) {
            if (interfaceC0333q instanceof C0326g) {
                m1274k((C0326g) interfaceC0333q, i2, 0, abstractC0327h.f1973s, arrayList, null);
            } else if (interfaceC0333q instanceof AbstractC0327h) {
                m1274k(((AbstractC0327h) interfaceC0333q).f1974y, i2, 0, abstractC0327h.f1973s, arrayList, null);
            }
        }
        for (InterfaceC0333q interfaceC0333q2 : abstractC0327h.f1973s.f47694ld6) {
            if (interfaceC0333q2 instanceof C0326g) {
                m1274k((C0326g) interfaceC0333q2, i2, 1, abstractC0327h.f1974y, arrayList, null);
            } else if (interfaceC0333q2 instanceof AbstractC0327h) {
                m1274k(((AbstractC0327h) interfaceC0333q2).f1973s, i2, 1, abstractC0327h.f1974y, arrayList, null);
            }
        }
        if (i2 == 1) {
            for (InterfaceC0333q interfaceC0333q3 : ((n7h) abstractC0327h).f47710ld6.f47694ld6) {
                if (interfaceC0333q3 instanceof C0326g) {
                    m1274k((C0326g) interfaceC0333q3, i2, 2, null, arrayList, null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: n */
    private int m1275n(C0339g c0339g, int i2) {
        int size = this.f1992s.size();
        long jMax = 0;
        for (int i3 = 0; i3 < size; i3++) {
            jMax = Math.max(jMax, this.f1992s.get(i3).toq(c0339g, i2));
        }
        return (int) jMax;
    }

    private String n7h(C0326g c0326g, boolean z2, String str) {
        StringBuilder sb = new StringBuilder(str);
        for (C0326g c0326g2 : c0326g.f47696x2) {
            String str2 = ("\n" + c0326g.m1254q()) + " -> " + c0326g2.m1254q();
            if (c0326g.f1960g > 0 || z2 || (c0326g.f1964q instanceof ld6)) {
                String str3 = str2 + "[";
                if (c0326g.f1960g > 0) {
                    str3 = str3 + "label=\"" + c0326g.f1960g + "\"";
                    if (z2) {
                        str3 = str3 + ",";
                    }
                }
                if (z2) {
                    str3 = str3 + " style=dashed ";
                }
                if (c0326g.f1964q instanceof ld6) {
                    str3 = str3 + " style=bold,color=gray ";
                }
                str2 = str3 + "]";
            }
            sb.append(str2 + "\n");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: p */
    private void m1276p() {
        Iterator<AbstractC0327h> it = this.f1990n.iterator();
        String strQrj = "digraph {\n";
        while (it.hasNext()) {
            strQrj = qrj(it.next(), strQrj);
        }
        String str = strQrj + "\n}\n";
        System.out.println("content:<<\n" + str + "\n>>");
    }

    private String qrj(AbstractC0327h abstractC0327h, String str) {
        boolean z2;
        C0326g c0326g = abstractC0327h.f1974y;
        C0326g c0326g2 = abstractC0327h.f1973s;
        StringBuilder sb = new StringBuilder(str);
        if (!(abstractC0327h instanceof ld6) && c0326g.f47694ld6.isEmpty() && (c0326g2.f47694ld6.isEmpty() && c0326g.f47696x2.isEmpty()) && c0326g2.f47696x2.isEmpty()) {
            return str;
        }
        sb.append(m1273i(abstractC0327h));
        boolean zCdj = cdj(c0326g, c0326g2);
        String strN7h = n7h(c0326g2, zCdj, n7h(c0326g, zCdj, str));
        boolean z3 = abstractC0327h instanceof n7h;
        if (z3) {
            strN7h = n7h(((n7h) abstractC0327h).f47710ld6, zCdj, strN7h);
        }
        if ((abstractC0327h instanceof x2) || (((z2 = abstractC0327h instanceof zy)) && ((zy) abstractC0327h).f1968g == 0)) {
            C0341n.toq toqVarGvn7 = abstractC0327h.f47699toq.gvn7();
            if (toqVarGvn7 == C0341n.toq.FIXED || toqVarGvn7 == C0341n.toq.WRAP_CONTENT) {
                if (!c0326g.f47696x2.isEmpty() && c0326g2.f47696x2.isEmpty()) {
                    sb.append("\n");
                    sb.append(c0326g2.m1254q());
                    sb.append(" -> ");
                    sb.append(c0326g.m1254q());
                    sb.append("\n");
                } else if (c0326g.f47696x2.isEmpty() && !c0326g2.f47696x2.isEmpty()) {
                    sb.append("\n");
                    sb.append(c0326g.m1254q());
                    sb.append(" -> ");
                    sb.append(c0326g2.m1254q());
                    sb.append("\n");
                }
            } else if (toqVarGvn7 == C0341n.toq.MATCH_CONSTRAINT && abstractC0327h.f47699toq.wvg() > 0.0f) {
                sb.append("\n");
                sb.append(abstractC0327h.f47699toq.m1332z());
                sb.append("_HORIZONTAL -> ");
                sb.append(abstractC0327h.f47699toq.m1332z());
                sb.append("_VERTICAL;\n");
            }
        } else if (z3 || (z2 && ((zy) abstractC0327h).f1968g == 1)) {
            C0341n.toq toqVarBf2 = abstractC0327h.f47699toq.bf2();
            if (toqVarBf2 == C0341n.toq.FIXED || toqVarBf2 == C0341n.toq.WRAP_CONTENT) {
                if (!c0326g.f47696x2.isEmpty() && c0326g2.f47696x2.isEmpty()) {
                    sb.append("\n");
                    sb.append(c0326g2.m1254q());
                    sb.append(" -> ");
                    sb.append(c0326g.m1254q());
                    sb.append("\n");
                } else if (c0326g.f47696x2.isEmpty() && !c0326g2.f47696x2.isEmpty()) {
                    sb.append("\n");
                    sb.append(c0326g.m1254q());
                    sb.append(" -> ");
                    sb.append(c0326g2.m1254q());
                    sb.append("\n");
                }
            } else if (toqVarBf2 == C0341n.toq.MATCH_CONSTRAINT && abstractC0327h.f47699toq.wvg() > 0.0f) {
                sb.append("\n");
                sb.append(abstractC0327h.f47699toq.m1332z());
                sb.append("_VERTICAL -> ");
                sb.append(abstractC0327h.f47699toq.m1332z());
                sb.append("_HORIZONTAL;\n");
            }
        }
        return abstractC0327h instanceof zy ? x2((zy) abstractC0327h, strN7h) : sb.toString();
    }

    private boolean toq(C0339g c0339g) {
        int iM1313a;
        C0341n.toq toqVar;
        int iJk;
        C0341n.toq toqVar2;
        C0341n.toq toqVar3;
        C0341n.toq toqVar4;
        for (C0341n c0341n : c0339g.f47822nsb) {
            C0341n.toq[] toqVarArr = c0341n.f47886hb;
            C0341n.toq toqVar5 = toqVarArr[0];
            C0341n.toq toqVar6 = toqVarArr[1];
            if (c0341n.a98o() == 8) {
                c0341n.f2050k = true;
            } else {
                if (c0341n.f2059t < 1.0f && toqVar5 == C0341n.toq.MATCH_CONSTRAINT) {
                    c0341n.f47906ni7 = 2;
                }
                if (c0341n.f47863a9 < 1.0f && toqVar6 == C0341n.toq.MATCH_CONSTRAINT) {
                    c0341n.f47881fu4 = 2;
                }
                if (c0341n.wvg() > 0.0f) {
                    C0341n.toq toqVar7 = C0341n.toq.MATCH_CONSTRAINT;
                    if (toqVar5 == toqVar7 && (toqVar6 == C0341n.toq.WRAP_CONTENT || toqVar6 == C0341n.toq.FIXED)) {
                        c0341n.f47906ni7 = 3;
                    } else if (toqVar6 == toqVar7 && (toqVar5 == C0341n.toq.WRAP_CONTENT || toqVar5 == C0341n.toq.FIXED)) {
                        c0341n.f47881fu4 = 3;
                    } else if (toqVar5 == toqVar7 && toqVar6 == toqVar7) {
                        if (c0341n.f47906ni7 == 0) {
                            c0341n.f47906ni7 = 3;
                        }
                        if (c0341n.f47881fu4 == 0) {
                            c0341n.f47881fu4 = 3;
                        }
                    }
                }
                C0341n.toq toqVar8 = C0341n.toq.MATCH_CONSTRAINT;
                if (toqVar5 == toqVar8 && c0341n.f47906ni7 == 1 && (c0341n.f47905ncyb.f2068g == null || c0341n.f47903n5r1.f2068g == null)) {
                    toqVar5 = C0341n.toq.WRAP_CONTENT;
                }
                C0341n.toq toqVar9 = toqVar5;
                if (toqVar6 == toqVar8 && c0341n.f47881fu4 == 1 && (c0341n.f2051l.f2068g == null || c0341n.f47887hyr.f2068g == null)) {
                    toqVar6 = C0341n.toq.WRAP_CONTENT;
                }
                C0341n.toq toqVar10 = toqVar6;
                x2 x2Var = c0341n.f2053n;
                x2Var.f1972q = toqVar9;
                int i2 = c0341n.f47906ni7;
                x2Var.f1969k = i2;
                n7h n7hVar = c0341n.f2046g;
                n7hVar.f1972q = toqVar10;
                int i3 = c0341n.f47881fu4;
                n7hVar.f1969k = i3;
                C0341n.toq toqVar11 = C0341n.toq.MATCH_PARENT;
                if ((toqVar9 == toqVar11 || toqVar9 == C0341n.toq.FIXED || toqVar9 == C0341n.toq.WRAP_CONTENT) && (toqVar10 == toqVar11 || toqVar10 == C0341n.toq.FIXED || toqVar10 == C0341n.toq.WRAP_CONTENT)) {
                    int iM1313a2 = c0341n.m1313a();
                    if (toqVar9 == toqVar11) {
                        iM1313a = (c0339g.m1313a() - c0341n.f47905ncyb.f47953f7l8) - c0341n.f47903n5r1.f47953f7l8;
                        toqVar = C0341n.toq.FIXED;
                    } else {
                        iM1313a = iM1313a2;
                        toqVar = toqVar9;
                    }
                    int iJk2 = c0341n.jk();
                    if (toqVar10 == toqVar11) {
                        iJk = (c0339g.jk() - c0341n.f2051l.f47953f7l8) - c0341n.f47887hyr.f47953f7l8;
                        toqVar2 = C0341n.toq.FIXED;
                    } else {
                        iJk = iJk2;
                        toqVar2 = toqVar10;
                    }
                    ki(c0341n, toqVar, iM1313a, toqVar2, iJk);
                    c0341n.f2053n.f1970n.mo1252n(c0341n.m1313a());
                    c0341n.f2046g.f1970n.mo1252n(c0341n.jk());
                    c0341n.f2050k = true;
                } else {
                    if (toqVar9 == toqVar8 && (toqVar10 == (toqVar4 = C0341n.toq.WRAP_CONTENT) || toqVar10 == C0341n.toq.FIXED)) {
                        if (i2 == 3) {
                            if (toqVar10 == toqVar4) {
                                ki(c0341n, toqVar4, 0, toqVar4, 0);
                            }
                            int iJk3 = c0341n.jk();
                            int i4 = (int) ((iJk3 * c0341n.f47875ek5k) + 0.5f);
                            C0341n.toq toqVar12 = C0341n.toq.FIXED;
                            ki(c0341n, toqVar12, i4, toqVar12, iJk3);
                            c0341n.f2053n.f1970n.mo1252n(c0341n.m1313a());
                            c0341n.f2046g.f1970n.mo1252n(c0341n.jk());
                            c0341n.f2050k = true;
                        } else if (i2 == 1) {
                            ki(c0341n, toqVar4, 0, toqVar10, 0);
                            c0341n.f2053n.f1970n.f47692qrj = c0341n.m1313a();
                        } else if (i2 == 2) {
                            C0341n.toq toqVar13 = c0339g.f47886hb[0];
                            C0341n.toq toqVar14 = C0341n.toq.FIXED;
                            if (toqVar13 == toqVar14 || toqVar13 == toqVar11) {
                                ki(c0341n, toqVar14, (int) ((c0341n.f2059t * c0339g.m1313a()) + 0.5f), toqVar10, c0341n.jk());
                                c0341n.f2053n.f1970n.mo1252n(c0341n.m1313a());
                                c0341n.f2046g.f1970n.mo1252n(c0341n.jk());
                                c0341n.f2050k = true;
                            }
                        } else {
                            C0343q[] c0343qArr = c0341n.f47922vyq;
                            if (c0343qArr[0].f2068g == null || c0343qArr[1].f2068g == null) {
                                ki(c0341n, toqVar4, 0, toqVar10, 0);
                                c0341n.f2053n.f1970n.mo1252n(c0341n.m1313a());
                                c0341n.f2046g.f1970n.mo1252n(c0341n.jk());
                                c0341n.f2050k = true;
                            }
                        }
                    }
                    if (toqVar10 == toqVar8 && (toqVar9 == (toqVar3 = C0341n.toq.WRAP_CONTENT) || toqVar9 == C0341n.toq.FIXED)) {
                        if (i3 == 3) {
                            if (toqVar9 == toqVar3) {
                                ki(c0341n, toqVar3, 0, toqVar3, 0);
                            }
                            int iM1313a3 = c0341n.m1313a();
                            float f2 = c0341n.f47875ek5k;
                            if (c0341n.m1327t() == -1) {
                                f2 = 1.0f / f2;
                            }
                            C0341n.toq toqVar15 = C0341n.toq.FIXED;
                            ki(c0341n, toqVar15, iM1313a3, toqVar15, (int) ((iM1313a3 * f2) + 0.5f));
                            c0341n.f2053n.f1970n.mo1252n(c0341n.m1313a());
                            c0341n.f2046g.f1970n.mo1252n(c0341n.jk());
                            c0341n.f2050k = true;
                        } else if (i3 == 1) {
                            ki(c0341n, toqVar9, 0, toqVar3, 0);
                            c0341n.f2046g.f1970n.f47692qrj = c0341n.jk();
                        } else if (i3 == 2) {
                            C0341n.toq toqVar16 = c0339g.f47886hb[1];
                            C0341n.toq toqVar17 = C0341n.toq.FIXED;
                            if (toqVar16 == toqVar17 || toqVar16 == toqVar11) {
                                ki(c0341n, toqVar9, c0341n.m1313a(), toqVar17, (int) ((c0341n.f47863a9 * c0339g.jk()) + 0.5f));
                                c0341n.f2053n.f1970n.mo1252n(c0341n.m1313a());
                                c0341n.f2046g.f1970n.mo1252n(c0341n.jk());
                                c0341n.f2050k = true;
                            }
                        } else {
                            C0343q[] c0343qArr2 = c0341n.f47922vyq;
                            if (c0343qArr2[2].f2068g == null || c0343qArr2[3].f2068g == null) {
                                ki(c0341n, toqVar3, 0, toqVar10, 0);
                                c0341n.f2053n.f1970n.mo1252n(c0341n.m1313a());
                                c0341n.f2046g.f1970n.mo1252n(c0341n.jk());
                                c0341n.f2050k = true;
                            }
                        }
                    }
                    if (toqVar9 == toqVar8 && toqVar10 == toqVar8) {
                        if (i2 == 1 || i3 == 1) {
                            C0341n.toq toqVar18 = C0341n.toq.WRAP_CONTENT;
                            ki(c0341n, toqVar18, 0, toqVar18, 0);
                            c0341n.f2053n.f1970n.f47692qrj = c0341n.m1313a();
                            c0341n.f2046g.f1970n.f47692qrj = c0341n.jk();
                        } else if (i3 == 2 && i2 == 2) {
                            C0341n.toq[] toqVarArr2 = c0339g.f47886hb;
                            C0341n.toq toqVar19 = toqVarArr2[0];
                            C0341n.toq toqVar20 = C0341n.toq.FIXED;
                            if (toqVar19 == toqVar20 && toqVarArr2[1] == toqVar20) {
                                ki(c0341n, toqVar20, (int) ((c0341n.f2059t * c0339g.m1313a()) + 0.5f), toqVar20, (int) ((c0341n.f47863a9 * c0339g.jk()) + 0.5f));
                                c0341n.f2053n.f1970n.mo1252n(c0341n.m1313a());
                                c0341n.f2046g.f1970n.mo1252n(c0341n.jk());
                                c0341n.f2050k = true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    private String x2(zy zyVar, String str) {
        int i2 = zyVar.f1968g;
        StringBuilder sb = new StringBuilder("subgraph ");
        sb.append("cluster_");
        sb.append(zyVar.f47699toq.m1332z());
        if (i2 == 0) {
            sb.append("_h");
        } else {
            sb.append("_v");
        }
        sb.append(" {\n");
        String strQrj = "";
        for (AbstractC0327h abstractC0327h : zyVar.f47730ld6) {
            sb.append(abstractC0327h.f47699toq.m1332z());
            if (i2 == 0) {
                sb.append("_HORIZONTAL");
            } else {
                sb.append("_VERTICAL");
            }
            sb.append(";\n");
            strQrj = qrj(abstractC0327h, strQrj);
        }
        sb.append("}\n");
        return str + strQrj + ((Object) sb);
    }

    public boolean f7l8(boolean z2) {
        boolean z3;
        boolean z5 = true;
        boolean z6 = z2 & true;
        if (this.f47708toq || this.f47709zy) {
            for (C0341n c0341n : this.f1989k.f47822nsb) {
                c0341n.cdj();
                c0341n.f2050k = false;
                c0341n.f2053n.n7h();
                c0341n.f2046g.n7h();
            }
            this.f1989k.cdj();
            C0339g c0339g = this.f1989k;
            c0339g.f2050k = false;
            c0339g.f2053n.n7h();
            this.f1989k.f2046g.n7h();
            this.f47709zy = false;
        }
        if (toq(this.f1991q)) {
            return false;
        }
        this.f1989k.v5yj(0);
        this.f1989k.ra(0);
        C0341n.toq toqVarO1t = this.f1989k.o1t(0);
        C0341n.toq toqVarO1t2 = this.f1989k.o1t(1);
        if (this.f47708toq) {
            zy();
        }
        int iM1331x = this.f1989k.m1331x();
        int iCh = this.f1989k.ch();
        this.f1989k.f2053n.f1974y.mo1252n(iM1331x);
        this.f1989k.f2046g.f1974y.mo1252n(iCh);
        t8r();
        C0341n.toq toqVar = C0341n.toq.WRAP_CONTENT;
        if (toqVarO1t == toqVar || toqVarO1t2 == toqVar) {
            if (z6) {
                Iterator<AbstractC0327h> it = this.f1990n.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (!it.next().mo1256h()) {
                        z6 = false;
                        break;
                    }
                }
            }
            if (z6 && toqVarO1t == C0341n.toq.WRAP_CONTENT) {
                this.f1989k.pjz9(C0341n.toq.FIXED);
                C0339g c0339g2 = this.f1989k;
                c0339g2.m2t(m1275n(c0339g2, 0));
                C0339g c0339g3 = this.f1989k;
                c0339g3.f2053n.f1970n.mo1252n(c0339g3.m1313a());
            }
            if (z6 && toqVarO1t2 == C0341n.toq.WRAP_CONTENT) {
                this.f1989k.ew(C0341n.toq.FIXED);
                C0339g c0339g4 = this.f1989k;
                c0339g4.pc(m1275n(c0339g4, 1));
                C0339g c0339g5 = this.f1989k;
                c0339g5.f2046g.f1970n.mo1252n(c0339g5.jk());
            }
        }
        C0339g c0339g6 = this.f1989k;
        C0341n.toq toqVar2 = c0339g6.f47886hb[0];
        C0341n.toq toqVar3 = C0341n.toq.FIXED;
        if (toqVar2 == toqVar3 || toqVar2 == C0341n.toq.MATCH_PARENT) {
            int iM1313a = c0339g6.m1313a() + iM1331x;
            this.f1989k.f2053n.f1973s.mo1252n(iM1313a);
            this.f1989k.f2053n.f1970n.mo1252n(iM1313a - iM1331x);
            t8r();
            C0339g c0339g7 = this.f1989k;
            C0341n.toq toqVar4 = c0339g7.f47886hb[1];
            if (toqVar4 == toqVar3 || toqVar4 == C0341n.toq.MATCH_PARENT) {
                int iJk = c0339g7.jk() + iCh;
                this.f1989k.f2046g.f1973s.mo1252n(iJk);
                this.f1989k.f2046g.f1970n.mo1252n(iJk - iCh);
            }
            t8r();
            z3 = true;
        } else {
            z3 = false;
        }
        for (AbstractC0327h abstractC0327h : this.f1990n) {
            if (abstractC0327h.f47699toq != this.f1989k || abstractC0327h.f47698f7l8) {
                abstractC0327h.mo1258n();
            }
        }
        for (AbstractC0327h abstractC0327h2 : this.f1990n) {
            if (z3 || abstractC0327h2.f47699toq != this.f1989k) {
                if (!abstractC0327h2.f1974y.f1963p || ((!abstractC0327h2.f1973s.f1963p && !(abstractC0327h2 instanceof C0332p)) || (!abstractC0327h2.f1970n.f1963p && !(abstractC0327h2 instanceof zy) && !(abstractC0327h2 instanceof C0332p)))) {
                    z5 = false;
                    break;
                }
            }
        }
        this.f1989k.pjz9(toqVarO1t);
        this.f1989k.ew(toqVarO1t2);
        return z5;
    }

    public void fn3e(toq.InterfaceC7855toq interfaceC7855toq) {
        this.f47707f7l8 = interfaceC7855toq;
    }

    /* JADX INFO: renamed from: g */
    public void m1277g(C0341n.toq toqVar, C0341n.toq toqVar2) {
        if (this.f47708toq) {
            zy();
            boolean z2 = false;
            for (C0341n c0341n : this.f1989k.f47822nsb) {
                boolean[] zArr = c0341n.f47877f7l8;
                zArr[0] = true;
                zArr[1] = true;
                if (c0341n instanceof C0340k) {
                    z2 = true;
                }
            }
            if (z2) {
                return;
            }
            for (qrj qrjVar : this.f1992s) {
                C0341n.toq toqVar3 = C0341n.toq.WRAP_CONTENT;
                qrjVar.m1285q(toqVar == toqVar3, toqVar2 == toqVar3);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public void m1278h() {
        this.f47709zy = true;
    }

    public void kja0() {
        this.f47708toq = true;
    }

    /* JADX INFO: renamed from: q */
    public void m1279q(ArrayList<AbstractC0327h> arrayList) {
        arrayList.clear();
        this.f1991q.f2053n.mo1255g();
        this.f1991q.f2046g.mo1255g();
        arrayList.add(this.f1991q.f2053n);
        arrayList.add(this.f1991q.f2046g);
        HashSet hashSet = null;
        for (C0341n c0341n : this.f1991q.f47822nsb) {
            if (c0341n instanceof C0345y) {
                arrayList.add(new C0332p(c0341n));
            } else {
                if (c0341n.ikck()) {
                    if (c0341n.f47935zy == null) {
                        c0341n.f47935zy = new zy(c0341n, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c0341n.f47935zy);
                } else {
                    arrayList.add(c0341n.f2053n);
                }
                if (c0341n.mu()) {
                    if (c0341n.f2056q == null) {
                        c0341n.f2056q = new zy(c0341n, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c0341n.f2056q);
                } else {
                    arrayList.add(c0341n.f2046g);
                }
                if (c0341n instanceof C0342p) {
                    arrayList.add(new ld6(c0341n));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<AbstractC0327h> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().mo1255g();
        }
        for (AbstractC0327h abstractC0327h : arrayList) {
            if (abstractC0327h.f47699toq != this.f1991q) {
                abstractC0327h.mo1260q();
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public boolean m1280s(boolean z2, int i2) {
        boolean z3;
        C0341n.toq toqVar;
        boolean z5 = true;
        boolean z6 = z2 & true;
        C0341n.toq toqVarO1t = this.f1989k.o1t(0);
        C0341n.toq toqVarO1t2 = this.f1989k.o1t(1);
        int iM1331x = this.f1989k.m1331x();
        int iCh = this.f1989k.ch();
        if (z6 && (toqVarO1t == (toqVar = C0341n.toq.WRAP_CONTENT) || toqVarO1t2 == toqVar)) {
            Iterator<AbstractC0327h> it = this.f1990n.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AbstractC0327h next = it.next();
                if (next.f1968g == i2 && !next.mo1256h()) {
                    z6 = false;
                    break;
                }
            }
            if (i2 == 0) {
                if (z6 && toqVarO1t == C0341n.toq.WRAP_CONTENT) {
                    this.f1989k.pjz9(C0341n.toq.FIXED);
                    C0339g c0339g = this.f1989k;
                    c0339g.m2t(m1275n(c0339g, 0));
                    C0339g c0339g2 = this.f1989k;
                    c0339g2.f2053n.f1970n.mo1252n(c0339g2.m1313a());
                }
            } else if (z6 && toqVarO1t2 == C0341n.toq.WRAP_CONTENT) {
                this.f1989k.ew(C0341n.toq.FIXED);
                C0339g c0339g3 = this.f1989k;
                c0339g3.pc(m1275n(c0339g3, 1));
                C0339g c0339g4 = this.f1989k;
                c0339g4.f2046g.f1970n.mo1252n(c0339g4.jk());
            }
        }
        if (i2 == 0) {
            C0339g c0339g5 = this.f1989k;
            C0341n.toq toqVar2 = c0339g5.f47886hb[0];
            if (toqVar2 == C0341n.toq.FIXED || toqVar2 == C0341n.toq.MATCH_PARENT) {
                int iM1313a = c0339g5.m1313a() + iM1331x;
                this.f1989k.f2053n.f1973s.mo1252n(iM1313a);
                this.f1989k.f2053n.f1970n.mo1252n(iM1313a - iM1331x);
                z3 = true;
            }
            z3 = false;
        } else {
            C0339g c0339g6 = this.f1989k;
            C0341n.toq toqVar3 = c0339g6.f47886hb[1];
            if (toqVar3 == C0341n.toq.FIXED || toqVar3 == C0341n.toq.MATCH_PARENT) {
                int iJk = c0339g6.jk() + iCh;
                this.f1989k.f2046g.f1973s.mo1252n(iJk);
                this.f1989k.f2046g.f1970n.mo1252n(iJk - iCh);
                z3 = true;
            }
            z3 = false;
        }
        t8r();
        for (AbstractC0327h abstractC0327h : this.f1990n) {
            if (abstractC0327h.f1968g == i2 && (abstractC0327h.f47699toq != this.f1989k || abstractC0327h.f47698f7l8)) {
                abstractC0327h.mo1258n();
            }
        }
        for (AbstractC0327h abstractC0327h2 : this.f1990n) {
            if (abstractC0327h2.f1968g == i2 && (z3 || abstractC0327h2.f47699toq != this.f1989k)) {
                if (!abstractC0327h2.f1974y.f1963p || !abstractC0327h2.f1973s.f1963p || (!(abstractC0327h2 instanceof zy) && !abstractC0327h2.f1970n.f1963p)) {
                    z5 = false;
                    break;
                }
            }
        }
        this.f1989k.pjz9(toqVarO1t);
        this.f1989k.ew(toqVarO1t2);
        return z5;
    }

    public void t8r() {
        f7l8 f7l8Var;
        for (C0341n c0341n : this.f1989k.f47822nsb) {
            if (!c0341n.f2050k) {
                C0341n.toq[] toqVarArr = c0341n.f47886hb;
                boolean z2 = false;
                C0341n.toq toqVar = toqVarArr[0];
                C0341n.toq toqVar2 = toqVarArr[1];
                int i2 = c0341n.f47906ni7;
                int i3 = c0341n.f47881fu4;
                C0341n.toq toqVar3 = C0341n.toq.WRAP_CONTENT;
                boolean z3 = toqVar == toqVar3 || (toqVar == C0341n.toq.MATCH_CONSTRAINT && i2 == 1);
                if (toqVar2 == toqVar3 || (toqVar2 == C0341n.toq.MATCH_CONSTRAINT && i3 == 1)) {
                    z2 = true;
                }
                f7l8 f7l8Var2 = c0341n.f2053n.f1970n;
                boolean z5 = f7l8Var2.f1963p;
                f7l8 f7l8Var3 = c0341n.f2046g.f1970n;
                boolean z6 = f7l8Var3.f1963p;
                if (z5 && z6) {
                    C0341n.toq toqVar4 = C0341n.toq.FIXED;
                    ki(c0341n, toqVar4, f7l8Var2.f47693f7l8, toqVar4, f7l8Var3.f47693f7l8);
                    c0341n.f2050k = true;
                } else if (z5 && z2) {
                    ki(c0341n, C0341n.toq.FIXED, f7l8Var2.f47693f7l8, toqVar3, f7l8Var3.f47693f7l8);
                    if (toqVar2 == C0341n.toq.MATCH_CONSTRAINT) {
                        c0341n.f2046g.f1970n.f47692qrj = c0341n.jk();
                    } else {
                        c0341n.f2046g.f1970n.mo1252n(c0341n.jk());
                        c0341n.f2050k = true;
                    }
                } else if (z6 && z3) {
                    ki(c0341n, toqVar3, f7l8Var2.f47693f7l8, C0341n.toq.FIXED, f7l8Var3.f47693f7l8);
                    if (toqVar == C0341n.toq.MATCH_CONSTRAINT) {
                        c0341n.f2053n.f1970n.f47692qrj = c0341n.m1313a();
                    } else {
                        c0341n.f2053n.f1970n.mo1252n(c0341n.m1313a());
                        c0341n.f2050k = true;
                    }
                }
                if (c0341n.f2050k && (f7l8Var = c0341n.f2046g.f47711x2) != null) {
                    f7l8Var.mo1252n(c0341n.m1321i());
                }
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public boolean m1281y(boolean z2) {
        if (this.f47708toq) {
            for (C0341n c0341n : this.f1989k.f47822nsb) {
                c0341n.cdj();
                c0341n.f2050k = false;
                x2 x2Var = c0341n.f2053n;
                x2Var.f1970n.f1963p = false;
                x2Var.f47698f7l8 = false;
                x2Var.n7h();
                n7h n7hVar = c0341n.f2046g;
                n7hVar.f1970n.f1963p = false;
                n7hVar.f47698f7l8 = false;
                n7hVar.n7h();
            }
            this.f1989k.cdj();
            C0339g c0339g = this.f1989k;
            c0339g.f2050k = false;
            x2 x2Var2 = c0339g.f2053n;
            x2Var2.f1970n.f1963p = false;
            x2Var2.f47698f7l8 = false;
            x2Var2.n7h();
            n7h n7hVar2 = this.f1989k.f2046g;
            n7hVar2.f1970n.f1963p = false;
            n7hVar2.f47698f7l8 = false;
            n7hVar2.n7h();
            zy();
        }
        if (toq(this.f1991q)) {
            return false;
        }
        this.f1989k.v5yj(0);
        this.f1989k.ra(0);
        this.f1989k.f2053n.f1974y.mo1252n(0);
        this.f1989k.f2046g.f1974y.mo1252n(0);
        return true;
    }

    public void zy() {
        m1279q(this.f1990n);
        this.f1992s.clear();
        qrj.f47712ld6 = 0;
        ld6(this.f1989k.f2053n, 0, this.f1992s);
        ld6(this.f1989k.f2046g, 1, this.f1992s);
        this.f47708toq = false;
    }
}
