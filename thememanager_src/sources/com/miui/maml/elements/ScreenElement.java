package com.miui.maml.elements;

import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.android.thememanager.util.hb;
import com.google.android.exoplayer2.text.ttml.C3678q;
import com.miui.maml.CommandTriggers;
import com.miui.maml.FramerateTokenList;
import com.miui.maml.NotifierManager;
import com.miui.maml.RendererController;
import com.miui.maml.ScreenContext;
import com.miui.maml.ScreenElementRoot;
import com.miui.maml.StylesManager;
import com.miui.maml.animation.BaseAnimation;
import com.miui.maml.data.Expression;
import com.miui.maml.data.IndexedVariable;
import com.miui.maml.data.Variables;
import com.miui.maml.util.StyleHelper;
import com.miui.maml.util.Utils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import org.w3c.dom.Element;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ScreenElement {
    public static final String ACTUAL_H = "actual_h";
    public static final String ACTUAL_W = "actual_w";
    public static final String ACTUAL_X = "actual_x";
    public static final String ACTUAL_Y = "actual_y";
    private static final String LOG_TAG = "MAML ScreenElement";
    public static final String VISIBILITY = "visibility";
    public static final int VISIBILITY_FALSE = 0;
    public static final int VISIBILITY_TRUE = 1;
    private IndexedVariable mActualHeightVar;
    private IndexedVariable mActualWidthVar;
    protected Align mAlign;
    protected AlignV mAlignV;
    protected ArrayList<BaseAnimation> mAnimations;
    protected RendererController mAvailableController;
    protected String mCategory;
    private float mCurFramerate;
    private FramerateTokenList.FramerateToken mFramerateToken;
    protected boolean mHasName;
    protected String mName;
    protected ElementGroup mParent;
    protected boolean mResumed;
    protected ScreenElementRoot mRoot;
    protected StylesManager.Style mStyle;
    protected CommandTriggers mTriggers;
    private Expression mVisibilityExpression;
    private IndexedVariable mVisibilityVar;
    private boolean mInitShow = true;
    private boolean mShow = true;
    private boolean mIsVisible = true;

    /* JADX INFO: renamed from: com.miui.maml.elements.ScreenElement$2 */
    static /* synthetic */ class C52002 {
        static final /* synthetic */ int[] $SwitchMap$com$miui$maml$elements$ScreenElement$Align;
        static final /* synthetic */ int[] $SwitchMap$com$miui$maml$elements$ScreenElement$AlignV;

        static {
            int[] iArr = new int[Align.values().length];
            $SwitchMap$com$miui$maml$elements$ScreenElement$Align = iArr;
            try {
                iArr[Align.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$miui$maml$elements$ScreenElement$Align[Align.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[AlignV.values().length];
            $SwitchMap$com$miui$maml$elements$ScreenElement$AlignV = iArr2;
            try {
                iArr2[AlignV.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$miui$maml$elements$ScreenElement$AlignV[AlignV.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    protected enum Align {
        LEFT,
        CENTER,
        RIGHT
    }

    protected enum AlignV {
        TOP,
        CENTER,
        BOTTOM
    }

    public ScreenElement(Element element, ScreenElementRoot screenElementRoot) {
        this.mRoot = screenElementRoot;
        if (element != null && screenElementRoot != null) {
            this.mStyle = screenElementRoot.getStyle(element.getAttribute(C3678q.f65814fn3e));
        }
        load(element);
    }

    protected static boolean isTagEnable(String[] strArr, String str) {
        return strArr == null ? TextUtils.isEmpty(str) : Utils.arrayContains(strArr, str);
    }

    private void load(Element element) {
        if (element == null) {
            return;
        }
        this.mCategory = getAttr(element, "category");
        String attr = getAttr(element, "name");
        this.mName = attr;
        boolean z2 = !TextUtils.isEmpty(attr);
        this.mHasName = z2;
        if (z2) {
            String attr2 = getAttr(element, "namesSuffix");
            if (!TextUtils.isEmpty(attr2)) {
                this.mName += attr2;
            }
            if (!Boolean.parseBoolean(getAttr(element, "dontAddToMap"))) {
                getRoot().addElement(this.mName, new WeakReference(this));
            }
        }
        String attr3 = getAttr(element, "visibility");
        if (!TextUtils.isEmpty(attr3)) {
            if (attr3.equalsIgnoreCase("false")) {
                this.mInitShow = false;
            } else if (attr3.equalsIgnoreCase("true")) {
                this.mInitShow = true;
            } else {
                this.mVisibilityExpression = Expression.build(getVariables(), attr3);
            }
        }
        Align align = Align.LEFT;
        this.mAlign = align;
        String attr4 = getAttr(element, "align");
        if (TextUtils.isEmpty(attr4)) {
            attr4 = getAttr(element, "alignH");
        }
        if (attr4.equalsIgnoreCase("right")) {
            this.mAlign = Align.RIGHT;
        } else if (attr4.equalsIgnoreCase("left")) {
            this.mAlign = align;
        } else if (attr4.equalsIgnoreCase(C3678q.f22036a)) {
            this.mAlign = Align.CENTER;
        }
        AlignV alignV = AlignV.TOP;
        this.mAlignV = alignV;
        String attr5 = getAttr(element, "alignV");
        if (attr5.equalsIgnoreCase(hb.f61266fu4)) {
            this.mAlignV = AlignV.BOTTOM;
        } else if (attr5.equalsIgnoreCase("top")) {
            this.mAlignV = alignV;
        } else if (attr5.equalsIgnoreCase(C3678q.f22036a)) {
            this.mAlignV = AlignV.CENTER;
        }
        loadTriggers(element);
        loadAnimations(element);
    }

    private void loadAnimations(Element element) {
        Utils.traverseXmlElementChildren(element, null, new Utils.XmlTraverseListener() { // from class: com.miui.maml.elements.ScreenElement.1
            @Override // com.miui.maml.util.Utils.XmlTraverseListener
            public void onChild(Element element2) {
                BaseAnimation baseAnimationOnCreateAnimation;
                String nodeName = element2.getNodeName();
                if (!nodeName.endsWith("Animation") || (baseAnimationOnCreateAnimation = ScreenElement.this.onCreateAnimation(nodeName, element2)) == null) {
                    return;
                }
                ScreenElement screenElement = ScreenElement.this;
                if (screenElement.mAnimations == null) {
                    screenElement.mAnimations = new ArrayList<>();
                }
                ScreenElement.this.mAnimations.add(baseAnimationOnCreateAnimation);
            }
        });
    }

    private void setVisibilityVar(boolean z2) {
        if (this.mHasName) {
            if (this.mVisibilityVar == null) {
                this.mVisibilityVar = new IndexedVariable(this.mName + ".visibility", getContext().mVariables, true);
            }
            this.mVisibilityVar.set(z2 ? 1.0d : 0.0d);
        }
    }

    public void acceptVisitor(ScreenElementVisitor screenElementVisitor) {
        screenElementVisitor.visit(this);
    }

    public FramerateTokenList.FramerateToken createToken(String str) {
        RendererController rendererController = getRendererController();
        if (rendererController == null) {
            return null;
        }
        return rendererController.createToken(str);
    }

    protected final double descale(double d2) {
        return d2 / ((double) this.mRoot.getScale());
    }

    protected abstract void doRender(Canvas canvas);

    protected void doTick(long j2) {
        ArrayList<BaseAnimation> arrayList = this.mAnimations;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.mAnimations.get(i2).tick(j2);
            }
        }
    }

    protected final double evaluate(Expression expression) {
        if (expression == null) {
            return 0.0d;
        }
        return expression.evaluate();
    }

    protected final String evaluateStr(Expression expression) {
        if (expression == null) {
            return null;
        }
        return expression.evaluateStr();
    }

    public ScreenElement findElement(String str) {
        String str2 = this.mName;
        if (str2 == null || !str2.equals(str)) {
            return null;
        }
        return this;
    }

    public void finish() {
        CommandTriggers commandTriggers = this.mTriggers;
        if (commandTriggers != null) {
            commandTriggers.finish();
        }
        ArrayList<BaseAnimation> arrayList = this.mAnimations;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.mAnimations.get(i2).finish();
            }
        }
    }

    protected String getAttr(Element element, String str) {
        return StyleHelper.getAttr(element, str, this.mStyle);
    }

    protected float getAttrAsFloat(Element element, String str, float f2) {
        String attr = getAttr(element, str);
        if (!TextUtils.isEmpty(attr)) {
            try {
                return Float.parseFloat(attr);
            } catch (NumberFormatException unused) {
            }
        }
        return f2;
    }

    protected int getAttrAsInt(Element element, String str, int i2) {
        String attr = getAttr(element, str);
        if (!TextUtils.isEmpty(attr)) {
            try {
                return Integer.parseInt(attr);
            } catch (NumberFormatException unused) {
            }
        }
        return i2;
    }

    protected long getAttrAsLong(Element element, String str, long j2) {
        String attr = getAttr(element, str);
        if (!TextUtils.isEmpty(attr)) {
            try {
                return Long.parseLong(attr);
            } catch (NumberFormatException unused) {
            }
        }
        return j2;
    }

    public ScreenContext getContext() {
        return this.mRoot.getContext();
    }

    protected final float getFramerate() {
        FramerateTokenList.FramerateToken framerateToken = this.mFramerateToken;
        if (framerateToken == null) {
            return 0.0f;
        }
        return framerateToken.getFramerate();
    }

    protected float getLeft(float f2, float f3) {
        if (f3 <= 0.0f) {
            return f2;
        }
        int i2 = C52002.$SwitchMap$com$miui$maml$elements$ScreenElement$Align[this.mAlign.ordinal()];
        if (i2 == 1) {
            f3 /= 2.0f;
        } else if (i2 != 2) {
            return f2;
        }
        return f2 - f3;
    }

    public String getName() {
        return this.mName;
    }

    protected final NotifierManager getNotifierManager() {
        return NotifierManager.getInstance(getContext().mContext);
    }

    public ElementGroup getParent() {
        return this.mParent;
    }

    public RendererController getRendererController() {
        ElementGroup elementGroup = this.mParent;
        if (elementGroup != null) {
            return elementGroup.getRendererController();
        }
        return null;
    }

    public ScreenElementRoot getRoot() {
        return this.mRoot;
    }

    protected float getTop(float f2, float f3) {
        if (f3 <= 0.0f) {
            return f2;
        }
        int i2 = C52002.$SwitchMap$com$miui$maml$elements$ScreenElement$AlignV[this.mAlignV.ordinal()];
        if (i2 == 1) {
            f3 /= 2.0f;
        } else if (i2 != 2) {
            return f2;
        }
        return f2 - f3;
    }

    public final Variables getVariables() {
        return getContext().mVariables;
    }

    public void init() {
        this.mShow = this.mInitShow;
        FramerateTokenList.FramerateToken framerateToken = this.mFramerateToken;
        if (framerateToken != null) {
            removeToken(framerateToken);
        }
        this.mFramerateToken = null;
        CommandTriggers commandTriggers = this.mTriggers;
        if (commandTriggers != null) {
            commandTriggers.init();
        }
        setAnim(null);
        ArrayList<BaseAnimation> arrayList = this.mAnimations;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.mAnimations.get(i2).init();
            }
        }
        updateVisibility();
        setVisibilityVar(isVisible());
        performAction("init");
    }

    public boolean isVisible() {
        return this.mIsVisible;
    }

    protected boolean isVisibleInner() {
        Expression expression;
        ElementGroup elementGroup;
        return this.mShow && ((expression = this.mVisibilityExpression) == null || expression.evaluate() > 0.0d) && ((elementGroup = this.mParent) == null || elementGroup.isVisible());
    }

    protected void loadTriggers(Element element) {
        Element child = Utils.getChild(element, CommandTriggers.TAG_NAME);
        if (child != null) {
            this.mTriggers = new CommandTriggers(child, this);
        }
    }

    protected void onConfigurationChanged(Configuration configuration) {
    }

    protected BaseAnimation onCreateAnimation(String str, Element element) {
        return null;
    }

    public boolean onHover(MotionEvent motionEvent) {
        return false;
    }

    protected void onSetAnimBefore() {
    }

    protected void onSetAnimEnable(BaseAnimation baseAnimation) {
    }

    public boolean onTouch(MotionEvent motionEvent) {
        return false;
    }

    protected void onVisibilityChange(boolean z2) {
        setVisibilityVar(z2);
        if (z2) {
            requestFramerate(this.mCurFramerate);
        } else {
            this.mCurFramerate = getFramerate();
            requestFramerate(0.0f);
        }
    }

    public void pause() {
        this.mResumed = false;
        CommandTriggers commandTriggers = this.mTriggers;
        if (commandTriggers != null) {
            commandTriggers.pause();
        }
        ArrayList<BaseAnimation> arrayList = this.mAnimations;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.mAnimations.get(i2).pause();
            }
        }
    }

    public final void pauseAnim() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        pauseAnim(jElapsedRealtime);
        doTick(jElapsedRealtime);
    }

    public void performAction(String str) {
        CommandTriggers commandTriggers = this.mTriggers;
        if (commandTriggers == null || str == null) {
            return;
        }
        commandTriggers.onAction(str);
        requestUpdate();
    }

    public final void playAnim() {
        playAnim(0L, -1L, true, true);
    }

    protected final void postInMainThread(Runnable runnable) {
        getContext().getHandler().post(runnable);
    }

    public void postRunnable(Runnable runnable) {
        RendererController rendererController = this.mRoot.getRendererController();
        if (rendererController != null) {
            rendererController.postRunnable(runnable);
        }
    }

    public void postRunnableAtFrontOfQueue(Runnable runnable) {
        RendererController rendererController = this.mRoot.getRendererController();
        if (rendererController != null) {
            rendererController.postRunnableAtFrontOfQueue(runnable);
        }
    }

    public void removeToken(FramerateTokenList.FramerateToken framerateToken) {
        RendererController rendererController = getRendererController();
        if (rendererController != null) {
            rendererController.removeToken(framerateToken);
        }
    }

    public void render(Canvas canvas) {
        updateVisibility();
        if (isVisible()) {
            doRender(canvas);
        }
    }

    protected final void requestFramerate(float f2) {
        if (f2 < 0.0f) {
            return;
        }
        if (this.mFramerateToken == null) {
            if (f2 == 0.0f) {
                return;
            } else {
                this.mFramerateToken = createToken(toString());
            }
        }
        if (this.mFramerateToken != null) {
            float systemFrameRate = this.mRoot.getSystemFrameRate();
            FramerateTokenList.FramerateToken framerateToken = this.mFramerateToken;
            if (f2 > systemFrameRate) {
                f2 = systemFrameRate;
            }
            framerateToken.requestFramerate(f2);
        }
    }

    public void requestUpdate() {
        RendererController rendererController = getRendererController();
        if (rendererController != null) {
            rendererController.forceUpdate();
        }
    }

    public final void reset() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        reset(jElapsedRealtime);
        doTick(jElapsedRealtime);
    }

    public void resume() {
        this.mResumed = true;
        CommandTriggers commandTriggers = this.mTriggers;
        if (commandTriggers != null) {
            commandTriggers.resume();
        }
        ArrayList<BaseAnimation> arrayList = this.mAnimations;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.mAnimations.get(i2).resume();
            }
        }
    }

    public final void resumeAnim() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        resumeAnim(jElapsedRealtime);
        doTick(jElapsedRealtime);
    }

    protected final float scale(double d2) {
        return (float) (d2 * ((double) this.mRoot.getScale()));
    }

    protected void setActualHeight(double d2) {
        if (this.mHasName) {
            if (this.mActualHeightVar == null) {
                this.mActualHeightVar = new IndexedVariable(this.mName + "." + ACTUAL_H, getVariables(), true);
            }
            this.mActualHeightVar.set(d2);
        }
    }

    protected void setActualWidth(double d2) {
        if (this.mHasName) {
            if (this.mActualWidthVar == null) {
                this.mActualWidthVar = new IndexedVariable(this.mName + "." + ACTUAL_W, getVariables(), true);
            }
            this.mActualWidthVar.set(d2);
        }
    }

    public void setAnim(String[] strArr) {
        if (this.mAnimations != null) {
            onSetAnimBefore();
            int size = this.mAnimations.size();
            for (int i2 = 0; i2 < size; i2++) {
                BaseAnimation baseAnimation = this.mAnimations.get(i2);
                boolean zIsTagEnable = isTagEnable(strArr, baseAnimation.getTag());
                baseAnimation.setDisable(!zIsTagEnable);
                if (zIsTagEnable) {
                    onSetAnimEnable(baseAnimation);
                }
            }
        }
    }

    public final void setAnimations(String str) {
        setAnim((TextUtils.isEmpty(str) || ".".equals(str)) ? null : str.split(","));
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void setName(String str) {
        getRoot().removeElement(this.mName);
        this.mName = str;
        getRoot().addElement(str, new WeakReference(this));
    }

    public void setParent(ElementGroup elementGroup) {
        this.mParent = elementGroup;
    }

    public void show(boolean z2) {
        this.mShow = z2;
        updateVisibility();
        requestUpdate();
    }

    public void showCategory(String str, boolean z2) {
        String str2 = this.mCategory;
        if (str2 == null || !str2.equals(str)) {
            return;
        }
        show(z2);
    }

    public void tick(long j2) {
        updateVisibility();
        if (isVisible()) {
            onConfigurationChanged(getContext().mContext.getResources().getConfiguration());
            doTick(j2);
        }
    }

    protected void updateVisibility() {
        boolean zIsVisibleInner = isVisibleInner();
        if (this.mIsVisible != zIsVisibleInner) {
            this.mIsVisible = zIsVisibleInner;
            onVisibilityChange(zIsVisibleInner);
            if (zIsVisibleInner) {
                doTick(SystemClock.elapsedRealtime());
            }
        }
    }

    public final void playAnim(long j2, long j3, boolean z2, boolean z3) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        playAnim(jElapsedRealtime, j2, j3, z2, z3);
        doTick(jElapsedRealtime);
    }

    protected void pauseAnim(long j2) {
        ArrayList<BaseAnimation> arrayList = this.mAnimations;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.mAnimations.get(i2).pauseAnim(j2);
            }
        }
    }

    public void reset(long j2) {
        ArrayList<BaseAnimation> arrayList = this.mAnimations;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.mAnimations.get(i2).reset(j2);
            }
        }
    }

    protected void resumeAnim(long j2) {
        ArrayList<BaseAnimation> arrayList = this.mAnimations;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.mAnimations.get(i2).resumeAnim(j2);
            }
        }
    }

    protected void playAnim(long j2, long j3, long j4, boolean z2, boolean z3) {
        ArrayList<BaseAnimation> arrayList = this.mAnimations;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.mAnimations.get(i2).playAnim(j2, j3, j4, z2, z3);
            }
        }
    }
}
