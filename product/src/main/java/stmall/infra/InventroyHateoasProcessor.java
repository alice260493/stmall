package stmall.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import stmall.domain.*;

@Component
public class InventroyHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Inventroy>> {

    @Override
    public EntityModel<Inventroy> process(EntityModel<Inventroy> model) {
        return model;
    }
}
