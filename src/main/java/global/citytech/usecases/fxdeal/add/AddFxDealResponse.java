package global.citytech.usecases.fxdeal.add;
/*
    @author suman dhungana
*/

import io.micronaut.core.annotation.Introspected;

@Introspected
public class AddFxDealResponse {
    String id;

    public AddFxDealResponse(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
