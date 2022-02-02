package com.github.mxsicxyz.ahni;

import com.github.natanbc.reliqua.request.RequestException;

@SuppressWarnings("WeakerAccess")
public class MissingScopeException extends RequestException {
    public MissingScopeException(String message, StackTraceElement[] elements) {
        super(message, elements);
    }
}
