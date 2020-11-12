package net.korasoft.books.handlers;

import java.util.stream.Stream;

import org.springframework.stereotype.Component;

import com.sap.cds.services.cds.CdsService;
import com.sap.cds.services.handler.EventHandler;
import com.sap.cds.services.handler.annotations.After;
import com.sap.cds.services.handler.annotations.ServiceName;

// import cds.gen.catalogservice.CatalogService_;
// import cds.gen.ordersservice.OrdersService_;
// import cds.gen.ordersservice.Books;
// import cds.gen.catalogservice.Books; ///

import cds.gen.authorsservice.AuthorsService_;
import cds.gen.authorsservice.Authors;

@Component
@ServiceName(AuthorsService_.CDS_NAME) 
public class AuthorsServiceHandler implements EventHandler {
    @After(event = CdsService.EVENT_READ)
    //@After(event = CdsService.EVENT_UPDATE)
	public void doSomething(Stream<Authors> authors) {
		int y = 3;
	}
}
