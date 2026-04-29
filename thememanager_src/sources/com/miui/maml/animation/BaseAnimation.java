package com.miui.maml.animation;

import android.text.TextUtils;
import com.google.android.exoplayer2.text.ttml.C3678q;
import com.miui.maml.CommandTriggers;
import com.miui.maml.animation.interpolater.InterpolatorHelper;
import com.miui.maml.data.Expression;
import com.miui.maml.data.IndexedVariable;
import com.miui.maml.data.Variables;
import com.miui.maml.elements.ListScreenElement;
import com.miui.maml.elements.ScreenElement;
import com.miui.maml.util.MamlLog;
import com.miui.maml.util.Utils;
import java.util.ArrayList;
import org.w3c.dom.Element;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseAnimation {
    private static final long INFINITE_TIME = 1000000000000L;
    private static final String LOG_TAG = "BaseAnimation";
    public static final int PLAY_TO_END = -1;
    private static final String VAR_CURRENT_FRAME = "current_frame";
    private long mAnimEndTime;
    private long mAnimStartTime;
    protected String[] mAttrs;
    private double[] mCurValues;
    private IndexedVariable mCurrentFrame;
    private Expression mDelay;
    private boolean mDisable;
    private long mEndTime;
    private boolean mHasName;
    private boolean mInitPaused;
    private boolean mIsDelay;
    private boolean mIsFirstFrame;
    private boolean mIsFirstReset;
    private boolean mIsLastFrame;
    private boolean mIsLoop;
    private boolean mIsPaused;
    private boolean mIsReverse;
    private boolean mIsTimeInfinite;
    protected ArrayList<AnimationItem> mItems;
    private boolean mLoop;
    private String mName;
    private long mPauseTime;
    private long mPlayTimeRange;
    private long mRealTimeRange;
    private long mResetTime;
    protected ScreenElement mScreenElement;
    private long mStartTime;
    private String mTag;
    private CommandTriggers mTriggers;
    protected String mType;

    public static class AnimationItem {
        private BaseAnimation mAni;
        private double[] mAttrsValue;
        public Expression mDeltaTimeExp;
        public Expression[] mExps;
        public long mInitTime;
        public InterpolatorHelper mInterpolator;
        private String mName;
        private boolean mNeedEvaluate = true;
        public long mTime;

        public AnimationItem(BaseAnimation baseAnimation, Element element) {
            this.mAni = baseAnimation;
            load(element);
        }

        private void load(Element element) {
            Variables variables = this.mAni.getVariables();
            String attribute = element.getAttribute("name");
            this.mName = attribute;
            if (!TextUtils.isEmpty(attribute)) {
                this.mAni.mScreenElement.getRoot().addAnimationItem(this.mName, this);
            }
            this.mInterpolator = InterpolatorHelper.create(variables, element);
            String attribute2 = element.getAttribute("time");
            if (!TextUtils.isEmpty(attribute2)) {
                try {
                    this.mTime = Long.parseLong(attribute2);
                } catch (NumberFormatException unused) {
                }
            }
            this.mDeltaTimeExp = Expression.build(variables, element.getAttribute("dtime"));
            String[] attrs = this.mAni.getAttrs();
            if (attrs != null) {
                this.mAttrsValue = new double[attrs.length];
                this.mExps = new Expression[attrs.length];
                int length = attrs.length;
                int i2 = 0;
                int i3 = 0;
                while (i2 < length) {
                    String str = attrs[i2];
                    Expression expressionBuild = Expression.build(variables, element.getAttribute(str));
                    if (expressionBuild == null && i3 == 0 && !"value".equals(str)) {
                        expressionBuild = Expression.build(variables, element.getAttribute("value"));
                    }
                    this.mExps[i3] = expressionBuild;
                    i2++;
                    i3++;
                }
            }
            this.mInitTime = this.mTime;
        }

        private void reevaluate() {
            Expression[] expressionArr = this.mExps;
            if (expressionArr == null) {
                return;
            }
            int length = expressionArr.length;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                Expression expression = expressionArr[i2];
                int i4 = i3 + 1;
                this.mAttrsValue[i3] = expression == null ? 0.0d : expression.evaluate();
                i2++;
                i3 = i4;
            }
        }

        public boolean attrExists(int i2) {
            Expression[] expressionArr = this.mExps;
            return expressionArr != null && i2 >= 0 && i2 < expressionArr.length && expressionArr[i2] != null;
        }

        public void changeInterpolator(String str, String str2, String str3) {
            this.mInterpolator = new InterpolatorHelper(this.mAni.getVariables(), str, str3, str2);
        }

        public double get(int i2) {
            double[] dArr = this.mAttrsValue;
            if (dArr != null && i2 >= 0 && i2 < dArr.length) {
                if (this.mNeedEvaluate) {
                    reevaluate();
                    this.mNeedEvaluate = false;
                }
                return this.mAttrsValue[i2];
            }
            MamlLog.m17851e(BaseAnimation.LOG_TAG, "fail to get number in AnimationItem:" + i2);
            return 0.0d;
        }

        public void reset() {
            this.mNeedEvaluate = true;
            this.mTime = this.mInitTime;
        }
    }

    public BaseAnimation(Element element, String str, String[] strArr, ScreenElement screenElement) {
        this.mItems = new ArrayList<>();
        this.mLoop = true;
        this.mScreenElement = screenElement;
        this.mAttrs = strArr;
        this.mCurValues = new double[strArr.length];
        load(element, str);
    }

    private float getRatio(AnimationItem animationItem, long j2, long j3, long j4) {
        InterpolatorHelper interpolatorHelper;
        float f2 = j4 == 0 ? 1.0f : (j2 - j3) / j4;
        return (animationItem == null || (interpolatorHelper = animationItem.mInterpolator) == null) ? f2 : interpolatorHelper.get(f2);
    }

    private void load(Element element, String str) {
        this.mName = element.getAttribute("name");
        this.mHasName = !TextUtils.isEmpty(r0);
        Variables variables = getVariables();
        if (this.mHasName) {
            this.mCurrentFrame = new IndexedVariable(this.mName + "." + VAR_CURRENT_FRAME, variables, true);
        }
        this.mType = element.getAttribute("type");
        this.mDelay = Expression.build(variables, element.getAttribute("delay"));
        this.mInitPaused = Boolean.parseBoolean(element.getAttribute("initPause"));
        this.mLoop = !"false".equalsIgnoreCase(element.getAttribute("loop"));
        this.mTag = element.getAttribute("tag");
        Utils.traverseXmlElementChildrenTags(element, new String[]{str, ListScreenElement.ListItemElement.TAG_NAME}, new Utils.XmlTraverseListener() { // from class: com.miui.maml.animation.BaseAnimation.1
            @Override // com.miui.maml.util.Utils.XmlTraverseListener
            public void onChild(Element element2) {
                BaseAnimation baseAnimation = BaseAnimation.this;
                baseAnimation.mItems.add(baseAnimation.onCreateItem(baseAnimation, element2));
            }
        });
        if (this.mItems.size() <= 0) {
            MamlLog.m17851e(LOG_TAG, "empty items");
            return;
        }
        ArrayList<AnimationItem> arrayList = this.mItems;
        this.mIsTimeInfinite = arrayList.get(arrayList.size() - 1).mTime >= 1000000000000L;
        if (this.mItems.size() <= 1 || !this.mIsTimeInfinite) {
            ArrayList<AnimationItem> arrayList2 = this.mItems;
            this.mRealTimeRange = arrayList2.get(arrayList2.size() - 1).mTime;
        } else {
            ArrayList<AnimationItem> arrayList3 = this.mItems;
            this.mRealTimeRange = arrayList3.get(arrayList3.size() - 2).mTime;
        }
        Element child = Utils.getChild(element, CommandTriggers.TAG_NAME);
        if (child != null) {
            this.mTriggers = new CommandTriggers(child, this.mScreenElement);
        }
    }

    private void reevaluate() {
        int size = this.mItems.size();
        long j2 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            AnimationItem animationItem = this.mItems.get(i2);
            Expression expression = animationItem.mDeltaTimeExp;
            if (expression != null) {
                long jEvaluate = (long) expression.evaluate();
                if (jEvaluate < 0) {
                    jEvaluate = 0;
                }
                j2 += jEvaluate;
                animationItem.mTime = j2;
            } else {
                long j3 = animationItem.mTime;
                if (j3 >= j2) {
                    j2 = j3;
                }
            }
        }
        boolean z2 = j2 >= 1000000000000L;
        this.mIsTimeInfinite = z2;
        if (size <= 1 || !z2) {
            this.mRealTimeRange = j2;
        } else {
            this.mRealTimeRange = this.mItems.get(size - 2).mTime;
        }
    }

    private void resetTime() {
        if (this.mIsFirstReset) {
            this.mIsFirstReset = false;
        }
        this.mIsLastFrame = false;
        int size = this.mItems.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.mItems.get(i2).reset();
        }
        reevaluate();
        this.mAnimStartTime = transToAnimTime(this.mStartTime);
        long jTransToAnimTime = transToAnimTime(this.mEndTime);
        this.mAnimEndTime = jTransToAnimTime;
        this.mPlayTimeRange = Math.abs(jTransToAnimTime - this.mAnimStartTime);
    }

    private long transToAnimTime(long j2) {
        return (j2 == -1 || j2 > this.mRealTimeRange) ? this.mRealTimeRange : j2;
    }

    public void finish() {
        CommandTriggers commandTriggers = this.mTriggers;
        if (commandTriggers != null) {
            commandTriggers.finish();
        }
        int size = this.mItems.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.mItems.get(i2).reset();
        }
        int length = this.mCurValues.length;
        for (int i3 = 0; i3 < length; i3++) {
            this.mCurValues[i3] = 0.0d;
        }
    }

    public String[] getAttrs() {
        return this.mAttrs;
    }

    public double getCurValue(int i2) {
        return this.mCurValues[i2];
    }

    protected double getDefaultValue() {
        return 0.0d;
    }

    protected double getDelayValue(int i2) {
        AnimationItem item = getItem(0);
        if (item != null) {
            return item.get(i2);
        }
        return 0.0d;
    }

    protected AnimationItem getItem(int i2) {
        if (i2 < 0 || i2 >= this.mItems.size()) {
            return null;
        }
        return this.mItems.get(i2);
    }

    public String getTag() {
        return this.mTag;
    }

    public String getType() {
        return this.mType;
    }

    protected final Variables getVariables() {
        return this.mScreenElement.getVariables();
    }

    public void init() {
        CommandTriggers commandTriggers = this.mTriggers;
        if (commandTriggers != null) {
            commandTriggers.init();
        }
    }

    public void onAction(String str) {
        CommandTriggers commandTriggers = this.mTriggers;
        if (commandTriggers != null) {
            commandTriggers.onAction(str);
        }
    }

    protected AnimationItem onCreateItem(BaseAnimation baseAnimation, Element element) {
        return new AnimationItem(baseAnimation, element);
    }

    protected void onTick(AnimationItem animationItem, AnimationItem animationItem2, float f2) {
        if (animationItem == null && animationItem2 == null) {
            return;
        }
        double defaultValue = getDefaultValue();
        int length = this.mAttrs.length;
        for (int i2 = 0; i2 < length; i2++) {
            double d2 = animationItem == null ? defaultValue : animationItem.get(i2);
            this.mCurValues[i2] = d2 + ((animationItem2.get(i2) - d2) * ((double) f2));
        }
    }

    public void pause() {
        CommandTriggers commandTriggers = this.mTriggers;
        if (commandTriggers != null) {
            commandTriggers.pause();
        }
    }

    public void pauseAnim(long j2) {
        if (this.mDisable || this.mIsPaused) {
            return;
        }
        this.mIsPaused = true;
        this.mPauseTime = j2;
    }

    public void playAnim(long j2, long j3, long j4, boolean z2, boolean z3) {
        Expression expression;
        if (this.mDisable) {
            return;
        }
        this.mResetTime = j2;
        if (j3 < 0 && j3 != -1) {
            j3 = 0;
        }
        this.mStartTime = j3;
        this.mAnimStartTime = j3;
        if (j4 < 0 && j4 != -1) {
            j4 = 0;
        }
        this.mEndTime = j4;
        this.mAnimEndTime = j4;
        this.mIsLoop = z2;
        this.mIsDelay = z3;
        this.mIsReverse = j3 == -1 || (j3 >= j4 && j4 >= 0);
        if (j3 == j4) {
            this.mIsLoop = false;
        }
        if (z3 && (expression = this.mDelay) != null) {
            this.mResetTime = (long) (j2 + expression.evaluate());
        }
        this.mIsFirstFrame = true;
        this.mIsLastFrame = false;
        this.mIsPaused = false;
        this.mIsFirstReset = true;
        this.mPlayTimeRange = 0L;
    }

    public void reset(long j2) {
        if (this.mDisable) {
            return;
        }
        int length = this.mAttrs.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.mCurValues[i2] = getDelayValue(i2);
        }
        if (this.mInitPaused) {
            playAnim(j2, 0L, 0L, false, false);
        } else {
            playAnim(j2, 0L, -1L, true, true);
        }
        if (this.mHasName) {
            this.mCurrentFrame.set(0.0d);
        }
        onAction("init");
    }

    public void resume() {
        CommandTriggers commandTriggers = this.mTriggers;
        if (commandTriggers != null) {
            commandTriggers.resume();
        }
    }

    public void resumeAnim(long j2) {
        if (!this.mDisable && this.mIsPaused) {
            this.mIsPaused = false;
            this.mResetTime += j2 - this.mPauseTime;
        }
    }

    public void setCurValue(int i2, double d2) {
        this.mCurValues[i2] = d2;
    }

    public void setDisable(boolean z2) {
        this.mDisable = z2;
    }

    public final void tick(long j2) {
        long j3;
        AnimationItem animationItem;
        long j4;
        if (this.mIsPaused || this.mDisable) {
            return;
        }
        long j5 = j2 - this.mResetTime;
        int i2 = 0;
        if (j5 < 0) {
            if (!this.mIsFirstFrame) {
                onTick(null, null, 0.0f);
                return;
            } else {
                this.mIsFirstFrame = false;
                j5 = 0;
            }
        }
        if (this.mIsFirstReset || (this.mIsLastFrame && !this.mIsTimeInfinite && this.mLoop && this.mIsLoop)) {
            resetTime();
        }
        if (!(!this.mIsTimeInfinite && this.mLoop && this.mIsLoop) && this.mIsLastFrame) {
            this.mIsPaused = true;
            this.mPauseTime = this.mResetTime + this.mPlayTimeRange;
            if (this.mHasName) {
                this.mCurrentFrame.set(this.mEndTime);
            }
            onAction(C3678q.f65807ch);
            return;
        }
        long j6 = this.mPlayTimeRange;
        if (j5 >= j6) {
            this.mResetTime = j2 - (j5 % (j6 + 1));
            this.mIsLastFrame = true;
            j5 = j6;
        }
        long j7 = (this.mIsReverse ? this.mAnimStartTime - j5 : this.mAnimStartTime + j5) % (this.mRealTimeRange + 1);
        int size = this.mItems.size();
        AnimationItem animationItem2 = null;
        while (i2 < size) {
            AnimationItem animationItem3 = this.mItems.get(i2);
            long j8 = animationItem3.mTime;
            if (j7 < j8) {
                if (i2 == 0) {
                    j3 = 0;
                    animationItem = null;
                    j4 = j8;
                } else {
                    AnimationItem animationItem4 = this.mItems.get(i2 - 1);
                    long j9 = animationItem3.mTime;
                    long j10 = animationItem4.mTime;
                    j3 = j10;
                    animationItem = animationItem4;
                    j4 = j9 - j10;
                }
                onTick(animationItem, animationItem3, getRatio(animationItem, j7, j3, j4));
                return;
            }
            i2++;
            animationItem2 = animationItem3;
        }
        onTick(null, animationItem2, 1.0f);
    }

    public BaseAnimation(Element element, String str, String str2, ScreenElement screenElement) {
        this(element, str, new String[]{str2}, screenElement);
    }

    public BaseAnimation(Element element, String str, ScreenElement screenElement) {
        this(element, str, "value", screenElement);
    }

    public BaseAnimation(Element element, ScreenElement screenElement) {
        this(element, (String) null, "value", screenElement);
    }
}
