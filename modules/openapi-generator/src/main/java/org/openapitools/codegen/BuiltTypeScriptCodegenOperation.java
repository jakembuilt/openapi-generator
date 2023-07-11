package org.openapitools.codegen;

import java.util.Locale;
import java.util.Objects;
import org.openapitools.codegen.CodegenOperation;

public class BuiltTypeScriptCodegenOperation extends CopyableCodegenOperation {

    /**
     * If true, generate an RTK toolkit mutation for the operation.
     */
    public boolean shouldCreateMutation;

    public BuiltTypeScriptCodegenOperation(CodegenOperation otherOp) {
        super(otherOp);
    }

    @Override
    protected void addFields() {
        this.shouldCreateMutation = !this.httpMethod.toLowerCase(Locale.ROOT).equals("get");
    }

    @Override
    public String toString() {
        String superString = super.toString();
        superString = superString.substring(superString.indexOf('{'), superString.length());
        superString = superString.substring(0, superString.lastIndexOf('}') - 1);
        final StringBuffer sb = new StringBuffer("BuiltTypeScriptCodegenOperation{");
        sb.append(superString);
        sb.append(", shouldCreateMutation=").append(shouldCreateMutation);
        // sb.append(", operationId='").append(operationId).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        BuiltTypeScriptCodegenOperation that = (BuiltTypeScriptCodegenOperation) o;
        return super.equals(o)
            && shouldCreateMutation == that.shouldCreateMutation;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), this.shouldCreateMutation);
    }
}
