package global.work.controller;

import global.work.converter.FxDealConverter;
import global.work.usecases.fxdeal.add.AddFxDealRequest;
import global.work.usecases.fxdeal.add.AddFxDealResponse;
import global.work.usecases.fxdeal.add.AddFxDealUseCase;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.*;
import jakarta.inject.Inject;

@Controller("fx-deal")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class FxDealController {

    AddFxDealUseCase addFxDealUseCase;
    FxDealConverter fxDealConverter;

    @Inject
    public FxDealController(AddFxDealUseCase addFxDealUseCase, FxDealConverter fxDealConverter) {
        this.addFxDealUseCase = addFxDealUseCase;
        this.fxDealConverter = fxDealConverter;
    }

    @Post("add")
    public AddFxDealResponse addCrudOperationResponse(FxDealRequestPayload payload) {

        AddFxDealRequest requestPayload = FxDealConverter.toFxDealRequest(payload);
        return this.addFxDealUseCase.execute(requestPayload);

    }

}