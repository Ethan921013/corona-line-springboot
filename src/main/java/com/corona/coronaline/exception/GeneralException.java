package com.corona.coronaline.exception;

import com.corona.coronaline.constant.ErrorCode;
import lombok.Getter;

@Getter
public class GeneralException extends RuntimeException {

    private final ErrorCode errorCode;

    public GeneralException() {
        super();
        this.errorCode = ErrorCode.INTERNAL_ERROR;
    }

    public GeneralException(String message) {
        super(message);
        this.errorCode = ErrorCode.INTERNAL_ERROR;
    }

    public GeneralException(String message, Throwable cause) {
        super(message , cause);
        this.errorCode = ErrorCode.INTERNAL_ERROR;
    }

    public GeneralException(Throwable cause) {
        super(cause);
        this.errorCode = ErrorCode.INTERNAL_ERROR;
    }

    public GeneralException(String message , Throwable cause , boolean enableSuppression , boolean writeableStackTrace) {
        super(message , cause , enableSuppression , writeableStackTrace);
        this.errorCode = ErrorCode.INTERNAL_ERROR;
    }

    public GeneralException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }

    public GeneralException(ErrorCode errorCode , Throwable cause) {
        super(errorCode.getMessage(), cause);
        this.errorCode = errorCode;
    }

    public GeneralException(ErrorCode errorCode , Throwable cause , boolean enableSuppression , boolean writeableStackTrace) {
        super(errorCode.getMessage(), cause , enableSuppression , writeableStackTrace);
        this.errorCode = ErrorCode.INTERNAL_ERROR;
    }

}
