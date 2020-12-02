// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.android.communication.chat.models;

import com.azure.android.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The CreateChatThreadResult model.
 */
@Fluent
public final class CreateChatThreadResult {
    /*
     * The thread property.
     */
    @JsonProperty(value = "thread")
    private ChatThread thread;

    /*
     * The errors property.
     */
    @JsonProperty(value = "errors")
    private CreateChatThreadErrors errors;

    /**
     * Get the thread property: The thread property.
     * 
     * @return the thread value.
     */
    public ChatThread getThread() {
        return this.thread;
    }

    /**
     * Set the thread property: The thread property.
     * 
     * @param thread the thread value to set.
     * @return the CreateChatThreadResult object itself.
     */
    public CreateChatThreadResult setThread(ChatThread thread) {
        this.thread = thread;
        return this;
    }

    /**
     * Get the errors property: The errors property.
     * 
     * @return the errors value.
     */
    public CreateChatThreadErrors getErrors() {
        return this.errors;
    }

    /**
     * Set the errors property: The errors property.
     * 
     * @param errors the errors value to set.
     * @return the CreateChatThreadResult object itself.
     */
    public CreateChatThreadResult setErrors(CreateChatThreadErrors errors) {
        this.errors = errors;
        return this;
    }
}
