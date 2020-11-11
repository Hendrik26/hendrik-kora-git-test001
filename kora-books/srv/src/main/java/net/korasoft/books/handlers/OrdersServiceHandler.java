package net.korasoft.books.handlers;

import java.util.stream.Stream;

import org.springframework.stereotype.Component;

import com.sap.cds.services.cds.CdsService;
import com.sap.cds.services.handler.EventHandler;
import com.sap.cds.services.handler.annotations.After;
import com.sap.cds.services.handler.annotations.ServiceName;

// import cds.gen.catalogservice.CatalogService_;
import cds.gen.ordersservice.OrdersService_;
// import cds.gen.catalogservice.Books;
import cds.gen.ordersservice.Books;

@Component
@ServiceName(OrdersService_.CDS_NAME) 
public class OrdersServiceHandler implements EventHandler {
    // @After(event = CdsService.EVENT_READ)
    @After(event = CdsService.EVENT_UPDATE)
	public void doSomething(Stream<Books> books) {
		int y = 3;
	}
}