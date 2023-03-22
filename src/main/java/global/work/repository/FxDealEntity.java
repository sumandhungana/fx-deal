package global.work.repository;
/*
    @author suman dhungana
*/

import io.micronaut.core.annotation.Introspected;
import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;
import io.micronaut.data.annotation.MappedProperty;
import io.micronaut.data.model.DataType;

import java.time.LocalDateTime;

@Introspected
@MappedEntity("fx_deal")
public class FxDealEntity {

    @Id
    @MappedProperty(value = "deal_unique_id", type = DataType.STRING)
    private String dealUniqueId;
    @MappedProperty(value = "from_currency_iso_code", type = DataType.STRING)
    private String fromCurrencyIsoCode;
    @MappedProperty(value = "to_currency_iso_code", type = DataType.STRING)
    private String toCurrencyIsoCode;
    @MappedProperty(value = "deal_time_stamp", type = DataType.STRING)
    private String dealTimeStamp;
    @MappedProperty(value = "deal_amount", type = DataType.STRING)
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

    public String getDealTimeStamp() {
        return dealTimeStamp;
    }

    public void setDealTimeStamp(String dealTimeStamp) {
        this.dealTimeStamp = dealTimeStamp;
    }

    public String getDealAmount() {
        return dealAmount;
    }

    public void setDealAmount(String dealAmount) {
        this.dealAmount = dealAmount;
    }
}
