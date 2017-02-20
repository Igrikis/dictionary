package com.project.vocabulary.request;

/**
 * Created by Igor Ivanov
 */
public class MultiResult<T> extends SingleResult<T> {
    private int total;

    public MultiResult() {
    }

    public MultiResult(T result, int total) {
        super(result);
        this.total = total;
    }

    public MultiResult(T result, boolean success, int total) {
        super(result, success);
        this.total = total;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

}
