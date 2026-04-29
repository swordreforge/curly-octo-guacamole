package com.google.common.graph;

/* JADX INFO: compiled from: GraphConstants.java */
/* JADX INFO: loaded from: classes2.dex */
final class wvg {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    static final String f68285f7l8 = "Edge %s is not an element of this graph.";

    /* JADX INFO: renamed from: g */
    static final String f26966g = "Node %s is not an element of this graph.";

    /* JADX INFO: renamed from: k */
    static final int f26967k = 2;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    static final String f68286ld6 = "Cannot add self-loop edge on node %s, as self-loops are not allowed. To construct a graph that allows self-loops, call allowsSelfLoops(true) on the Builder.";

    /* JADX INFO: renamed from: n */
    static final int f26968n = 2;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    static final String f68287n7h = "Mismatch: unordered endpoints cannot be used with directed graphs";

    /* JADX INFO: renamed from: p */
    static final String f26969p = "Nodes %s and %s are already connected by a different edge. To construct a graph that allows parallel edges, call allowsParallelEdges(true) on the Builder.";

    /* JADX INFO: renamed from: q */
    static final float f26970q = 1.0f;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    static final String f68288qrj = "Edge %s already exists in the graph.";

    /* JADX INFO: renamed from: s */
    static final String f26971s = "Cannot call edgeConnecting() when parallel edges exist between %s and %s. Consider calling edgesConnecting() instead.";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    static final int f68289toq = 10;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    static final String f68290x2 = "Cannot call source()/target() on a EndpointPair from an undirected graph. Consider calling adjacentNode(node) if you already have a node, or nodeU()/nodeV() if you don't.";

    /* JADX INFO: renamed from: y */
    static final String f26972y = "Edge %s already exists between the following nodes: %s, so it cannot be reused to connect the following nodes: %s.";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    static final int f68291zy = 20;

    /* JADX INFO: renamed from: com.google.common.graph.wvg$k */
    /* JADX INFO: compiled from: GraphConstants.java */
    enum EnumC4647k {
        EDGE_EXISTS
    }

    private wvg() {
    }
}
