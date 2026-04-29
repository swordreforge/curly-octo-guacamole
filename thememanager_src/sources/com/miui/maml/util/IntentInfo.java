package com.miui.maml.util;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.zurt;
import com.miui.maml.data.Expression;
import com.miui.maml.data.Variables;
import com.miui.maml.util.Utils;
import java.util.ArrayList;
import org.w3c.dom.Element;

/* JADX INFO: loaded from: classes3.dex */
public class IntentInfo {
    private static final String LOG_TAG = "TaskVariable";
    private Expression mClassNameExp;
    private ArrayList<Extra> mExtraList = new ArrayList<>();
    private Expression mPackageNameExp;
    private Task mTask;
    private String mUri;
    private Expression mUriExp;
    private Variables mVariables;

    /* JADX INFO: renamed from: com.miui.maml.util.IntentInfo$2 */
    static /* synthetic */ class C52612 {
        static final /* synthetic */ int[] $SwitchMap$com$miui$maml$util$IntentInfo$Type;

        static {
            int[] iArr = new int[Type.values().length];
            $SwitchMap$com$miui$maml$util$IntentInfo$Type = iArr;
            try {
                iArr[Type.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$miui$maml$util$IntentInfo$Type[Type.INT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$miui$maml$util$IntentInfo$Type[Type.LONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$miui$maml$util$IntentInfo$Type[Type.FLOAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$miui$maml$util$IntentInfo$Type[Type.DOUBLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$miui$maml$util$IntentInfo$Type[Type.BOOLEAN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private class Extra {
        public static final String TAG_NAME = "Extra";
        private Expression mCondition;
        private Expression mExpression;
        private String mName;
        protected Type mType = Type.DOUBLE;

        public Extra(Element element) {
            load(element);
        }

        private void load(Element element) {
            if (element == null) {
                MamlLog.m17851e(IntentInfo.LOG_TAG, "node is null");
                return;
            }
            this.mName = element.getAttribute("name");
            String attribute = element.getAttribute("type");
            if ("string".equalsIgnoreCase(attribute)) {
                this.mType = Type.STRING;
            } else if ("int".equalsIgnoreCase(attribute) || zurt.toq.f47469toq.equalsIgnoreCase(attribute)) {
                this.mType = Type.INT;
            } else if ("long".equalsIgnoreCase(attribute)) {
                this.mType = Type.LONG;
            } else if (zurt.toq.f47471zy.equalsIgnoreCase(attribute)) {
                this.mType = Type.FLOAT;
            } else if ("double".equalsIgnoreCase(attribute)) {
                this.mType = Type.DOUBLE;
            } else if (zurt.toq.f1755g.equalsIgnoreCase(attribute)) {
                this.mType = Type.BOOLEAN;
            }
            Expression expressionBuild = Expression.build(IntentInfo.this.mVariables, element.getAttribute("expression"));
            this.mExpression = expressionBuild;
            if (expressionBuild == null) {
                MamlLog.m17851e(IntentInfo.LOG_TAG, "invalid expression in IntentCommand");
            }
            this.mCondition = Expression.build(IntentInfo.this.mVariables, element.getAttribute("condition"));
        }

        public double getDouble() {
            Expression expression = this.mExpression;
            if (expression == null) {
                return 0.0d;
            }
            return expression.evaluate();
        }

        public String getName() {
            return this.mName;
        }

        public String getString() {
            Expression expression = this.mExpression;
            if (expression == null) {
                return null;
            }
            return expression.evaluateStr();
        }

        public boolean isConditionTrue() {
            Expression expression = this.mCondition;
            return expression == null || expression.evaluate() > 0.0d;
        }
    }

    private enum Type {
        STRING,
        INT,
        LONG,
        FLOAT,
        DOUBLE,
        BOOLEAN
    }

    public IntentInfo(Element element, Variables variables) {
        if (element == null) {
            return;
        }
        this.mTask = Task.load(element);
        this.mVariables = variables;
        this.mPackageNameExp = Expression.build(variables, element.getAttribute("packageExp"));
        this.mClassNameExp = Expression.build(variables, element.getAttribute("classExp"));
        this.mUri = element.getAttribute("uri");
        this.mUriExp = Expression.build(variables, element.getAttribute("uriExp"));
        loadExtras(element);
    }

    private void loadExtras(Element element) {
        Utils.traverseXmlElementChildren(element, Extra.TAG_NAME, new Utils.XmlTraverseListener() { // from class: com.miui.maml.util.IntentInfo.1
            @Override // com.miui.maml.util.Utils.XmlTraverseListener
            public void onChild(Element element2) {
                IntentInfo.this.mExtraList.add(IntentInfo.this.new Extra(element2));
            }
        });
    }

    public String getAction() {
        Task task = this.mTask;
        if (task != null) {
            return task.action;
        }
        return null;
    }

    public String getId() {
        Task task = this.mTask;
        if (task != null) {
            return task.id;
        }
        return null;
    }

    public void set(Task task) {
        this.mTask = task;
    }

    public void update(Intent intent) {
        Task task = this.mTask;
        String str = task != null ? task.action : null;
        if (!TextUtils.isEmpty(str)) {
            intent.setAction(str);
        }
        Task task2 = this.mTask;
        String str2 = task2 != null ? task2.type : null;
        if (!TextUtils.isEmpty(str2)) {
            intent.setType(str2);
        }
        Task task3 = this.mTask;
        String str3 = task3 != null ? task3.category : null;
        if (!TextUtils.isEmpty(str3)) {
            intent.addCategory(str3);
        }
        Task task4 = this.mTask;
        String strEvaluateStr = task4 != null ? task4.packageName : null;
        Expression expression = this.mPackageNameExp;
        if (expression != null) {
            strEvaluateStr = expression.evaluateStr();
        }
        Task task5 = this.mTask;
        String strEvaluateStr2 = task5 != null ? task5.className : null;
        Expression expression2 = this.mClassNameExp;
        if (expression2 != null) {
            strEvaluateStr2 = expression2.evaluateStr();
        }
        if (!TextUtils.isEmpty(strEvaluateStr)) {
            if (TextUtils.isEmpty(strEvaluateStr2)) {
                intent.setPackage(strEvaluateStr);
            } else {
                intent.setClassName(strEvaluateStr, strEvaluateStr2);
            }
        }
        CustomUtils.replaceCameraIntentInfoOnF3M(strEvaluateStr, strEvaluateStr2, intent);
        String strEvaluateStr3 = this.mUri;
        Expression expression3 = this.mUriExp;
        if (expression3 != null) {
            strEvaluateStr3 = expression3.evaluateStr();
        }
        if (!TextUtils.isEmpty(strEvaluateStr3)) {
            intent.setData(Uri.parse(strEvaluateStr3));
        }
        ArrayList<Extra> arrayList = this.mExtraList;
        if (arrayList != null) {
            for (Extra extra : arrayList) {
                if (extra.isConditionTrue()) {
                    switch (C52612.$SwitchMap$com$miui$maml$util$IntentInfo$Type[extra.mType.ordinal()]) {
                        case 1:
                            intent.putExtra(extra.getName(), extra.getString());
                            break;
                        case 2:
                            intent.putExtra(extra.getName(), (int) extra.getDouble());
                            break;
                        case 3:
                            intent.putExtra(extra.getName(), (long) extra.getDouble());
                            break;
                        case 4:
                            intent.putExtra(extra.getName(), (float) extra.getDouble());
                            break;
                        case 5:
                            intent.putExtra(extra.getName(), extra.getDouble());
                            break;
                        case 6:
                            intent.putExtra(extra.getName(), extra.getDouble() > 0.0d);
                            break;
                    }
                } else {
                    intent.removeExtra(extra.getName());
                }
            }
        }
    }
}
