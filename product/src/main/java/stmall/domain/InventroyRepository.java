package stmall.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import stmall.domain.*;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "inventroys",
    path = "inventroys"
)
public interface InventroyRepository
    extends PagingAndSortingRepository<Inventroy, Long> {}
