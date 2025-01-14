package stmall.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import stmall.domain.*;
import stmall.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class Orderinfostatusupdated extends AbstractEvent {

    private Long id;
    private String userid;
    private String productname;
    private String address;
    private Long productid;
    private Integer qty;
    private String status;

    public Orderinfostatusupdated(Order aggregate) {
        super(aggregate);
    }

    public Orderinfostatusupdated() {
        super();
    }
}
//>>> DDD / Domain Event
