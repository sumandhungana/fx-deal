package global.citytech.usecases.fxdeal.add;
/*
    @author suman dhungana
*/

import global.citytech.converter.FxDealConverter;
import global.citytech.exception.FxDealException;
import global.citytech.repository.FxDealEntity;
import global.citytech.repository.FxDealRepository;
import global.citytech.validation.fxdeal.AddFxDealValidation;
import jakarta.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;

public class AddFxDealUseCase {

    private final FxDealRepository fxDealRepository;

    private Logger LOG = LoggerFactory.getLogger(AddFxDealUseCase.class.getName());

    @Inject
    public AddFxDealUseCase(FxDealRepository fxDealRepository) {
        this.fxDealRepository = fxDealRepository;
    }

    public AddFxDealResponse execute(AddFxDealRequest request) {
         AddFxDealValidation addFxDealValidation = new AddFxDealValidation();
        LOG.info("<< INSIDE ADD FX-DEAL USE-CASE >>");
        addFxDealValidation.validateAddFxDeal(request);
        Optional<FxDealEntity> mayBeFxDealEntity = this.fxDealRepository.findById(request.getDealUniqueId());
        if (mayBeFxDealEntity.isPresent()) {
            throw new FxDealException(FxDealException.ExceptionType.ID_ALREADY_EXIST);
        }

        FxDealEntity entity = FxDealConverter.toFxDealEntity(request);
        var resp = this.fxDealRepository.save(entity);
        return new AddFxDealResponse(resp.getDealUniqueId());
    }
}
