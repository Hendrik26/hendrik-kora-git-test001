namespace my.bookshop;

entity Authors {
  key ID : String;
  firstname : String;
  lastname : String;
}

entity Books {
  key ID : Integer;
  title  : String;
  stock  : Integer;
}
