/*
 *  ____    _    ____  _   _ _____     ___    _
 * / ___|  / \  |  _ \| \ | |_ _\ \   / / \  | |
 * | |    / _ \ | |_) |  \| || | \ \ / / _ \ | |
 * | |___/ ___ \|  _ <| |\  || |  \ V / ___ \| |___
 * \____/_/   \_\_| \_\_| \_|___|  \_/_/   \_\_____|
 *
 * https://github.com/yingzhuo/carnival
 */
package com.github.yingzhuo.carnival.restful.security.exception;

/**
 * @author 应卓
 */
public class TokenBlacklistedException extends AuthenticationException {

    private static final long serialVersionUID = -4409853136141750731L;

    public TokenBlacklistedException() {
        this(null);
    }

    public TokenBlacklistedException(String message) {
        super(message);
    }

}
