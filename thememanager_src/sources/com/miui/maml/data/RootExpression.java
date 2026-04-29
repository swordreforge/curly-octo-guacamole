package com.miui.maml.data;

import com.miui.maml.data.Expression;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class RootExpression extends Expression {
    public static final String LOG_TAG = "RootExression";
    private boolean mAlwaysEvaluate;
    private double mDoubleValue;
    private Expression mExp;
    private JSONArray mJsonArrayValue;
    private JSONObject mJsonObjectValue;
    private String mStringValue;
    private Variables mVars;
    private VarVersion[] mVersions;
    private HashSet<VarVersion> mVersionSet = new HashSet<>();
    private boolean mIsNumInit = false;
    private boolean mIsStrInit = false;
    private boolean mIsJsonObjectInit = false;
    private boolean mIsJsonArrayInit = false;
    private VarVersionVisitor mVarVersionVisitor = null;

    public static class VarVersion {
        int mIndex;
        private boolean mIsNumber;
        int mVersion;

        public VarVersion(int i2, int i3, boolean z2) {
            this.mIndex = i2;
            this.mVersion = i3;
            this.mIsNumber = z2;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof VarVersion)) {
                return false;
            }
            VarVersion varVersion = (VarVersion) obj;
            return varVersion.mIsNumber == this.mIsNumber && varVersion.mIndex == this.mIndex;
        }

        public int getVer(Variables variables) {
            return variables.getVer(this.mIndex, this.mIsNumber);
        }

        public int hashCode() {
            return this.mIsNumber ? this.mIndex : (-this.mIndex) - 1;
        }
    }

    private static class VarVersionVisitor extends ExpressionVisitor {
        private RootExpression mRoot;

        public VarVersionVisitor(RootExpression rootExpression) {
            this.mRoot = rootExpression;
        }

        @Override // com.miui.maml.data.ExpressionVisitor
        public void visit(Expression expression) {
            if (expression instanceof Expression.VariableExpression) {
                Expression.VariableExpression variableExpression = (Expression.VariableExpression) expression;
                variableExpression.evaluate();
                this.mRoot.addVarVersion(new VarVersion(variableExpression.getIndex(), variableExpression.getVersion(), expression instanceof Expression.NumberVariableExpression));
            } else if (expression instanceof Expression.FunctionExpression) {
                String funName = ((Expression.FunctionExpression) expression).getFunName();
                if ("rand".equals(funName) || "eval".equals(funName) || "preciseeval".equals(funName) || "newJsonObject".equals(funName) || "newJsonArray".equals(funName)) {
                    this.mRoot.mAlwaysEvaluate = true;
                }
            }
        }
    }

    public RootExpression(Variables variables, Expression expression) {
        this.mVars = variables;
        this.mExp = expression;
    }

    @Override // com.miui.maml.data.Expression
    public void accept(ExpressionVisitor expressionVisitor) {
    }

    public void addVarVersion(VarVersion varVersion) {
        this.mVersionSet.add(varVersion);
    }

    @Override // com.miui.maml.data.Expression
    public double evaluate() {
        int ver;
        boolean z2 = true;
        if (this.mIsNumInit) {
            int i2 = 0;
            if (!this.mAlwaysEvaluate) {
                if (this.mVersions != null) {
                    boolean z3 = false;
                    while (true) {
                        VarVersion[] varVersionArr = this.mVersions;
                        if (i2 >= varVersionArr.length) {
                            break;
                        }
                        VarVersion varVersion = varVersionArr[i2];
                        if (varVersion != null && varVersion.mVersion != (ver = varVersion.getVer(this.mVars))) {
                            varVersion.mVersion = ver;
                            z3 = true;
                        }
                        i2++;
                    }
                    z2 = z3;
                } else {
                    z2 = false;
                }
            }
            if (z2) {
                this.mDoubleValue = this.mExp.evaluate();
            }
        } else {
            this.mDoubleValue = this.mExp.evaluate();
            if (this.mVarVersionVisitor == null) {
                VarVersionVisitor varVersionVisitor = new VarVersionVisitor(this);
                this.mVarVersionVisitor = varVersionVisitor;
                this.mExp.accept(varVersionVisitor);
                if (this.mVersionSet.size() <= 0) {
                    this.mVersions = null;
                } else {
                    VarVersion[] varVersionArr2 = new VarVersion[this.mVersionSet.size()];
                    this.mVersions = varVersionArr2;
                    this.mVersionSet.toArray(varVersionArr2);
                }
            }
            this.mIsNumInit = true;
        }
        return this.mDoubleValue;
    }

    @Override // com.miui.maml.data.Expression
    public JSONArray evaluateJsonArray() {
        int ver;
        boolean z2 = true;
        if (this.mIsJsonArrayInit) {
            int i2 = 0;
            if (!this.mAlwaysEvaluate) {
                if (this.mVersions != null) {
                    boolean z3 = false;
                    while (true) {
                        VarVersion[] varVersionArr = this.mVersions;
                        if (i2 >= varVersionArr.length) {
                            break;
                        }
                        VarVersion varVersion = varVersionArr[i2];
                        if (varVersion != null && varVersion.mVersion != (ver = varVersion.getVer(this.mVars))) {
                            varVersion.mVersion = ver;
                            z3 = true;
                        }
                        i2++;
                    }
                    z2 = z3;
                } else {
                    z2 = false;
                }
            }
            if (z2) {
                this.mJsonArrayValue = this.mExp.evaluateJsonArray();
            }
        } else {
            this.mJsonArrayValue = this.mExp.evaluateJsonArray();
            if (this.mVarVersionVisitor == null) {
                VarVersionVisitor varVersionVisitor = new VarVersionVisitor(this);
                this.mVarVersionVisitor = varVersionVisitor;
                this.mExp.accept(varVersionVisitor);
                VarVersion[] varVersionArr2 = new VarVersion[this.mVersionSet.size()];
                this.mVersions = varVersionArr2;
                this.mVersionSet.toArray(varVersionArr2);
            }
            this.mIsJsonArrayInit = true;
        }
        return this.mJsonArrayValue;
    }

    @Override // com.miui.maml.data.Expression
    public JSONObject evaluateJsonObject() {
        int ver;
        boolean z2 = true;
        if (this.mIsJsonObjectInit) {
            int i2 = 0;
            if (!this.mAlwaysEvaluate) {
                if (this.mVersions != null) {
                    boolean z3 = false;
                    while (true) {
                        VarVersion[] varVersionArr = this.mVersions;
                        if (i2 >= varVersionArr.length) {
                            break;
                        }
                        VarVersion varVersion = varVersionArr[i2];
                        if (varVersion != null && varVersion.mVersion != (ver = varVersion.getVer(this.mVars))) {
                            varVersion.mVersion = ver;
                            z3 = true;
                        }
                        i2++;
                    }
                    z2 = z3;
                } else {
                    z2 = false;
                }
            }
            if (z2) {
                this.mJsonObjectValue = this.mExp.evaluateJsonObject();
            }
        } else {
            this.mJsonObjectValue = this.mExp.evaluateJsonObject();
            if (this.mVarVersionVisitor == null) {
                VarVersionVisitor varVersionVisitor = new VarVersionVisitor(this);
                this.mVarVersionVisitor = varVersionVisitor;
                this.mExp.accept(varVersionVisitor);
                VarVersion[] varVersionArr2 = new VarVersion[this.mVersionSet.size()];
                this.mVersions = varVersionArr2;
                this.mVersionSet.toArray(varVersionArr2);
            }
            this.mIsJsonObjectInit = true;
        }
        return this.mJsonObjectValue;
    }

    @Override // com.miui.maml.data.Expression
    public String evaluateStr() {
        int ver;
        boolean z2 = true;
        if (this.mIsStrInit) {
            int i2 = 0;
            if (!this.mAlwaysEvaluate) {
                if (this.mVersions != null) {
                    boolean z3 = false;
                    while (true) {
                        VarVersion[] varVersionArr = this.mVersions;
                        if (i2 >= varVersionArr.length) {
                            break;
                        }
                        VarVersion varVersion = varVersionArr[i2];
                        if (varVersion != null && varVersion.mVersion != (ver = varVersion.getVer(this.mVars))) {
                            varVersion.mVersion = ver;
                            z3 = true;
                        }
                        i2++;
                    }
                    z2 = z3;
                } else {
                    z2 = false;
                }
            }
            if (z2) {
                this.mStringValue = this.mExp.evaluateStr();
            }
        } else {
            this.mStringValue = this.mExp.evaluateStr();
            if (this.mVarVersionVisitor == null) {
                VarVersionVisitor varVersionVisitor = new VarVersionVisitor(this);
                this.mVarVersionVisitor = varVersionVisitor;
                this.mExp.accept(varVersionVisitor);
                VarVersion[] varVersionArr2 = new VarVersion[this.mVersionSet.size()];
                this.mVersions = varVersionArr2;
                this.mVersionSet.toArray(varVersionArr2);
            }
            this.mIsStrInit = true;
        }
        return this.mStringValue;
    }

    @Override // com.miui.maml.data.Expression
    public boolean isNull() {
        return this.mExp.isNull();
    }
}
