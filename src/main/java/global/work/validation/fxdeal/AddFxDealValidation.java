package global.work.validation.fxdeal;
/*
    @author suman dhungana
*/

import global.work.exception.FxDealException;
import global.work.usecases.fxdeal.add.AddFxDealRequest;
import global.work.utils.HelperUtils;
import jakarta.inject.Inject;

public class AddFxDealValidation {

    @Inject
    public AddFxDealValidation() {}

    public void validateAddFxDeal(AddFxDealRequest request) {
        if(HelperUtils.isBlankOrNull(request.getDealUniqueId())) {
            throw new FxDealException(FxDealException.ExceptionType.DEAL_ID_IS_MISSING);
        } if(HelperUtils.isBlankOrNull(request.getFromCurrencyIsoCode())) {
            throw new FxDealException(FxDealException.ExceptionType.FROM_CURRENCY_ISO_CODE_IS_MISSING);
        } if(HelperUtils.isBlankOrNull(request.getToCurrencyIsoCode())) {
            throw new FxDealException(FxDealException.ExceptionType.TO_CURRENCY_ISO_CODE_IS_MISSING);
        } if(HelperUtils.isBlankOrNull(request.getDealAmount())) {
            throw new FxDealException(FxDealException.ExceptionType.DEAL_AMOUNT_IS_MISSING);
        }
    }

}
