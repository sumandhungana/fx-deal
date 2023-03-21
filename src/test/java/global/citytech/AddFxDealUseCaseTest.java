package global.citytech;

import global.citytech.repository.FxDealRepository;
import global.citytech.usecases.fxdeal.add.AddFxDealRequest;
import global.citytech.usecases.fxdeal.add.AddFxDealUseCase;
import global.citytech.validation.fxdeal.AddFxDealValidation;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

@MicronautTest
class AddFxDealUseCaseTest {

    private FxDealRepository fxDealRepository;
    private AddFxDealUseCase addFxDealUseCase;

    @BeforeEach
    void setUp() {
        fxDealRepository = Mockito.mock(FxDealRepository.class);
        addFxDealUseCase = new AddFxDealUseCase(fxDealRepository);
    }

//    @Test
//    void shouldReturnErrorWhenDealUniqueIdIsEmpty() {
//        AddFxDealRequest addFxDealRequest = new AddFxDealRequest();
//        addFxDealRequest.setDealUniqueId("");
//        AddFxDealValidation validation = new AddFxDealValidation();
//        validation.validateAddFxDeal(addFxDealRequest);
//
//    }

}
