package com.ravi.factorydp;

public interface IDatabase {
void IDCBConnection connect();
void IDBCommand createCommand(IDCBConnection connect);
IDBResult ExecuteCommand(IDCBConnection connect,IDBCOmmand command);
}
