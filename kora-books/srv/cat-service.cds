using my.bookshop as my from '../db/data-model';

service AuthorsService {
    @readonly entity Authors as projection on my.Authors;
}

service CatalogService {
    @readonly entity Books as projection on my.Books;
}

service JoinAuthorsBooksService {
    @readonly entity Authors as projection on my.Authors;
}

service OrdersService {
    @readonly entity Books as projection on my.Books;
    @readonly entity Authors as projection on my.Authors;
}