package global.work.converter;
/*
    @author suman dhungana
*/

import global.work.controller.FxDealRequestPayload;
import global.work.repository.FxDealEntity;
import global.work.usecases.fxdeal.add.AddFxDealRequest;
import jakarta.inject.Singleton;

import java.time.LocalDateTime;

@Singleton
public class FxDealConverter {

    public static AddFxDealRequest toFxDealRequest(FxDealRequestPayload payload) {
        AddFxDealRequest addFxDealRequest = new AddFxDealRequest();
        addFxDealRequest.setDealUniqueId(payload.getDealUniqueId());
        addFxDealRequest.setFromCurrencyIsoCode(payload.getFromCurrencyIsoCode());
        addFxDealRequest.setToCurrencyIsoCode(payload.getToCurrencyIsoCode());
        addFxDealRequest.setDealTimeStamp(LocalDateTime.now());
        addFxDealRequest.setDealAmount(payload.getDealAmount());
        return addFxDealRequest;
    }

    public static FxDealEntity toFxDealEntity(AddFxDealRequest addFxDealRequest) {
        FxDealEntity entity = new FxDealEntity();
        entity.setDealUniqueId(addFxDealRequest.getDealUniqueId());
        entity.setFromCurrencyIsoCode(addFxDealRequest.getFromCurrencyIsoCode());
        entity.setToCurrencyIsoCode(addFxDealRequest.getToCurrencyIsoCode());
        entity.setDealTimeStamp(addFxDealRequest.getDealTimeStamp().toString());
        entity.setDealAmount(addFxDealRequest.getDealAmount());
        return entity;
    }
}
