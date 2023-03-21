package global.citytech.usecases.fxdeal.add;
/*
    @author suman dhungana
*/

import io.micronaut.core.annotation.Introspected;

import java.time.LocalDateTime;

@Introspected
public class AddFxDealRequest {
    private String dealUniqueId;
    private String fromCurrencyIsoCode;
    private String toCurrencyIsoCode;
    private LocalDateTime dealTimeStamp;
    private String dealAmount;

    public String getDealUniqueId() {
        return dealUniqueId;
    }

    public void setDealUniqueId(String dealUniqueId) {
        this.dealUniqueId = dealUniqueId;
    }

    public String getFromCurrencyIsoCode() {
        return fromCurrencyIsoCode;
    }

    public void setFromCurrencyIsoCode(String fromCurrencyIsoCode) {
        this.fromCurrencyIsoCode = fromCurrencyIsoCode;
    }

    public String getToCurrencyIsoCode() {
        return toCurrencyIsoCode;
    }

    public void setToCurrencyIsoCode(String toCurrencyIsoCode) {
        this.toCurrencyIsoCode = toCurrencyIsoCode;
    }

    public LocalDateTime getDealTimeStamp() {
        return dealTimeStamp;
    }

    public void setDealTimeStamp(LocalDateTime dealTimeStamp) {
        this.dealTimeStamp = dealTimeStamp;
    }

    public String getDealAmount() {
        return dealAmount;
    }

    public void setDealAmount(String dealAmount) {
        this.dealAmount = dealAmount;
    }
}
