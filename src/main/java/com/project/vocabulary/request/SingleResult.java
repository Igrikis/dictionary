package com.project.vocabulary.request;

/**
 * Created by Igor Ivanov
 */
public class SingleResult<T> {
    private T result;
    private boolean success = true;

    public SingleResult() {
    }

    public SingleResult(T result) {
        this.result = result;
    }

    public SingleResult(T result, boolean success) {
        this.result = result;
        this.success = success;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
