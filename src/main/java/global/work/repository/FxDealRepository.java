package global.work.repository;

import io.micronaut.data.jdbc.annotation.JdbcRepository;
import io.micronaut.data.jdbc.runtime.JdbcOperations;
import io.micronaut.data.model.query.builder.sql.Dialect;
import io.micronaut.data.repository.CrudRepository;

/*
    @author suman dhungana
*/
//@Repository
@JdbcRepository(dialect = Dialect.POSTGRES)
public abstract class FxDealRepository implements CrudRepository<FxDealEntity, String> {

    private final JdbcOperations jdbcOperations;

    protected FxDealRepository(JdbcOperations jdbcOperations) {
        this.jdbcOperations = jdbcOperations;
    }
}
