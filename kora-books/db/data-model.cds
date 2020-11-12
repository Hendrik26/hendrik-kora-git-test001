namespace my.bookshop;

entity Authors {
  key ID : String;
  firstname : String;
  lastname : String;
  //> books : Association to many Books on books.AuthorID = ID;
}

entity Books {
  key ID : Integer;
  title  : String;
  AuthorID : String;
  stock  : Integer;
  author: Association to Authors on author.ID = AuthorID;
  //> author : Association to Authors;
}
