/*
 *  ____    _    ____  _   _ _____     ___    _
 * / ___|  / \  |  _ \| \ | |_ _\ \   / / \  | |
 * | |    / _ \ | |_) |  \| || | \ \ / / _ \ | |
 * | |___/ ___ \|  _ <| |\  || |  \ V / ___ \| |___
 * \____/_/   \_\_| \_\_| \_|___|  \_/_/   \_\_____|
 *
 * https://github.com/yingzhuo/carnival
 */
package com.github.yingzhuo.carnival.json;

import org.springframework.http.HttpStatus;

import java.io.Serializable;
import java.util.Objects;
import java.util.function.Supplier;

/**
 * @author 应卓
 */
public class Json implements Serializable {

    @Deprecated     // 这个方法名容易使人误会是一个单例
    public static Json instance() {
        return new Json();
    }

    public static Json newInstance() {
        return new Json();
    }

    private static final long serialVersionUID = 3132693907573837391L;

    private String code = String.valueOf(HttpStatus.OK.value());
    private String errorMessage = null;
    private Payload payload = new Payload();

    public Json() {
        super();
    }

    public Json code(String code) {
        this.code = Objects.requireNonNull(code);
        return this;
    }

    public Json code(Supplier<String> supplier) {
        return code(Objects.requireNonNull(supplier).get());
    }

    public Json code(HttpStatus httpStatus) {
        return code(String.valueOf(Objects.requireNonNull(httpStatus).value()));
    }

    public Json errorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    public Json errorMessage(Supplier<String> supplier) {
        return errorMessage(Objects.requireNonNull(supplier).get());
    }

    public Json payload(String key, Object value) {
        payload.put(key, value);
        return this;
    }

    public String getCode() {
        return code;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public Payload getPayload() {
        return payload;
    }

    public int size() {
        return payload.size();
    }

}
