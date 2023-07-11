package org.openapitools.codegen;

import org.openapitools.codegen.CodegenOperation;

public abstract class CopyableCodegenOperation extends CodegenOperation {

    public CopyableCodegenOperation() {
        super();
        this.addFields();
    }

    public CopyableCodegenOperation(CodegenOperation otherOp) {
        this();
        this.copyOperation(otherOp);
    }

    /**
     * Adds field data specific to the implementing class.
     */
    protected abstract void addFields();

    protected CopyableCodegenOperation copyOperation(CodegenOperation otherOp) {
        this.responseHeaders.addAll(otherOp.responseHeaders);
        this.hasAuthMethods = otherOp.hasAuthMethods;
        this.hasConsumes = otherOp.hasConsumes;
        this.hasProduces = otherOp.hasProduces;
        this.hasParams = otherOp.hasParams;
        this.hasOptionalParams = otherOp.hasOptionalParams;
        this.hasRequiredParams = otherOp.hasRequiredParams;
        this.returnTypeIsPrimitive = otherOp.returnTypeIsPrimitive;
        this.returnSimpleType = otherOp.returnSimpleType;
        this.subresourceOperation = otherOp.subresourceOperation;
        this.isMap = otherOp.isMap;
        this.isArray = otherOp.isArray;
        this.isMultipart = otherOp.isMultipart;
        this.isVoid = otherOp.isVoid;
        this.hasVersionHeaders = otherOp.hasVersionHeaders;
        this.hasVersionQueryParams = otherOp.hasVersionQueryParams;
        this.isResponseBinary = otherOp.isResponseBinary;
        this.isResponseFile = otherOp.isResponseFile;
        this.isResponseOptional = otherOp.isResponseOptional;
        this.hasReference = otherOp.hasReference;
        this.defaultReturnType = otherOp.defaultReturnType;
        this.isRestfulIndex = otherOp.isRestfulIndex;
        this.isRestfulShow = otherOp.isRestfulShow;
        this.isRestfulCreate = otherOp.isRestfulCreate;
        this.isRestfulUpdate = otherOp.isRestfulUpdate;
        this.isRestfulDestroy = otherOp.isRestfulDestroy;
        this.isRestful = otherOp.isRestful;
        this.isDeprecated = otherOp.isDeprecated;
        this.isCallbackRequest = otherOp.isCallbackRequest;
        this.uniqueItems = otherOp.uniqueItems;
        this.hasDefaultResponse = otherOp.hasDefaultResponse;
        this.hasErrorResponseObject = otherOp.hasErrorResponseObject;
        this.returnProperty = otherOp.returnProperty;
        this.path = otherOp.path;
        this.operationId = otherOp.operationId;
        this.returnType = otherOp.returnType;
        this.returnFormat = otherOp.returnFormat;
        this.httpMethod = otherOp.httpMethod;
        this.returnBaseType = otherOp.returnBaseType;
        this.returnContainer = otherOp.returnContainer;
        this.summary = otherOp.summary;
        this.unescapedNotes = otherOp.unescapedNotes;
        this.notes = otherOp.notes;
        this.baseName = otherOp.baseName;
        this.defaultResponse = otherOp.defaultResponse;
        this.discriminator = otherOp.discriminator;
        this.consumes = otherOp.consumes;
        this.produces = otherOp.produces;
        this.prioritizedContentTypes = otherOp.prioritizedContentTypes;
        this.servers = otherOp.servers;
        this.bodyParam = otherOp.bodyParam;
        this.allParams = otherOp.allParams;
        this.bodyParams = otherOp.bodyParams;
        this.pathParams = otherOp.pathParams;
        this.queryParams = otherOp.queryParams;
        this.headerParams = otherOp.headerParams;
        this.implicitHeadersParams = otherOp.implicitHeadersParams;
        this.formParams = otherOp.formParams;
        this.cookieParams = otherOp.cookieParams;
        this.requiredParams = otherOp.requiredParams;
        this.optionalParams = otherOp.optionalParams;
        this.requiredAndNotNullableParams = otherOp.requiredAndNotNullableParams;
        this.authMethods = otherOp.authMethods;
        this.tags = otherOp.tags;
        this.responses = otherOp.responses;
        this.callbacks = otherOp.callbacks;
        this.imports = otherOp.imports;
        this.examples = otherOp.examples;
        this.requestBodyExamples = otherOp.requestBodyExamples;
        this.externalDocs = otherOp.externalDocs;
        this.vendorExtensions = otherOp.vendorExtensions;
        this.nickname = otherOp.nickname; // legacy support
        this.operationIdOriginal = otherOp.operationIdOriginal; // for plug-in
        this.operationIdLowerCase = otherOp.operationIdLowerCase; // for markdown documentation
        this.operationIdCamelCase = otherOp.operationIdCamelCase; // for class names
        this.operationIdSnakeCase = otherOp.operationIdSnakeCase;
        return this;
    }
}
