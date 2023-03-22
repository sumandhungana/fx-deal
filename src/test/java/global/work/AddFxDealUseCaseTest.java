package global.work;

import global.work.repository.FxDealEntity;
import global.work.repository.FxDealRepository;
import global.work.usecases.fxdeal.add.AddFxDealRequest;
import global.work.usecases.fxdeal.add.AddFxDealResponse;
import global.work.usecases.fxdeal.add.AddFxDealUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.time.LocalDateTime;
import java.util.Optional;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

class AddFxDealUseCaseTest {

    @Mock
    private FxDealRepository fxDealRepository;

    private AddFxDealUseCase addFxDealUseCase;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        this.addFxDealUseCase = new AddFxDealUseCase(fxDealRepository);
    }

    @Test
    void execute_adds_new_fx_deal() {

        AddFxDealRequest request = new AddFxDealRequest();
        request.setDealUniqueId("1234");
        request.setFromCurrencyIsoCode("AUS");
        request.setToCurrencyIsoCode("USD");
        request.setDealAmount("12");
        request.setDealTimeStamp(LocalDateTime.now());

        when(fxDealRepository.findById(request.getDealUniqueId())).thenReturn(Optional.empty());
        when(fxDealRepository.save(any())).thenReturn(new FxDealEntity());

        AddFxDealResponse response = addFxDealUseCase.execute(request);

        Assertions.assertNotNull(response);
        Assertions.assertEquals(request.getDealUniqueId(), response.getId());
    }
}
