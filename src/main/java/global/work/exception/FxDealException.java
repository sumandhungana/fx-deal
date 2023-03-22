package global.work.exception;
/*
    @author suman dhungana
*/

public class FxDealException extends RuntimeException {
    private final ExceptionType exceptionType;
    private final String detailMessage;

    public FxDealException(ExceptionType exception) {
        super(exception.getMessage());
        this.exceptionType = exception;
        this.detailMessage = "";

    }

    public FxDealException(ExceptionType exception, String detailMessage) {
        super(exception.getMessage());
        this.exceptionType = exception;
        this.detailMessage = detailMessage;
    }


    public ExceptionType getType() {
        return exceptionType;
    }

    public String getDetailMessage() {
        return detailMessage;
    }


    public enum ExceptionType {
        DEAL_ID_IS_MISSING("FXD-0001", "Deal unique id is empty or null."),
        FROM_CURRENCY_ISO_CODE_IS_MISSING("FXD-0002", "From currency code is missing."),
        TO_CURRENCY_ISO_CODE_IS_MISSING("FXD-0003", "To currency code is missing."),
        ID_ALREADY_EXIST("FXD-0005", "Id already exist"),
        DEAL_AMOUNT_IS_MISSING("FXD-0004", "Deal amount is missing.");

        private String code;
        private String message;

        ExceptionType(String code, String message) {
            this.code = code;
            this.message = message;
        }

        public String getCode() {
            return code;
        }

        public String getMessage() {
            return message;
        }
    }
}