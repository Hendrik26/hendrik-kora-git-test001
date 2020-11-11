namespace my.bookshop;

entity Authors {
  key ID : Integer;
  firstname : String;
  lastname : String;
}

entity Books {
  key ID : Integer;
  title  : String;
  stock  : Integer;
}

