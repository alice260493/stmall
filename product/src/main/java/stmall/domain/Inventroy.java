package stmall.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;
import stmall.ProductApplication;

@Entity
@Table(name = "Inventroy_table")
@Data
//<<< DDD / Aggregate Root
public class Inventroy {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String productName;

    private Integer stock;

    public static InventroyRepository repository() {
        InventroyRepository inventroyRepository = ProductApplication.applicationContext.getBean(
            InventroyRepository.class
        );
        return inventroyRepository;
    }

    //<<< Clean Arch / Port Method
    public static void differenceStock(OrderPlaced orderPlaced) {
        //implement business logic here:

        /** Example 1:  new item 
        Inventroy inventroy = new Inventroy();
        repository().save(inventroy);

        Startcancled startcancled = new Startcancled(inventroy);
        startcancled.publishAfterCommit();
        Soldout soldout = new Soldout(inventroy);
        soldout.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        // if orderPlaced.pgId exists, use it
        
        // ObjectMapper mapper = new ObjectMapper();
        // Map<, Object> orderMap = mapper.convertValue(orderPlaced.getPgId(), Map.class);

        repository().findById(orderPlaced.get???()).ifPresent(inventroy->{
            
            inventroy // do something
            repository().save(inventroy);

            Startcancled startcancled = new Startcancled(inventroy);
            startcancled.publishAfterCommit();
            Soldout soldout = new Soldout(inventroy);
            soldout.publishAfterCommit();

         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
