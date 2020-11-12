namespace my.bookshop;

entity Authors {
  key ID : String;
  firstname : String;
  lastname : String;
}

entity Books {
  key ID : Integer;
  title  : String;
  AuthorID : String;
  stock  : Integer;
  author: Association to Authors on author.ID = AuthorID;
}
