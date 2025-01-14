package stmall.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import stmall.domain.*;
import stmall.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class Startcancled extends AbstractEvent {

    private Long id;
    private String productname;
    private Integer stock;

    public Startcancled(Inventroy aggregate) {
        super(aggregate);
    }

    public Startcancled() {
        super();
    }
}
//>>> DDD / Domain Event
