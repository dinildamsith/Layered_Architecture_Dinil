package dao;

import db.DBConnection;
import model.ItemDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public interface ItemDAO {
    public boolean addItem(ItemDTO itemDTO) throws SQLException, ClassNotFoundException ;

    public boolean deleteItem(String code) throws SQLException, ClassNotFoundException ;

    public boolean updateItem(ItemDTO itemDTO) throws SQLException, ClassNotFoundException;

    public String genrateId() throws SQLException, ClassNotFoundException ;

    public boolean searchItem(String code) throws SQLException, ClassNotFoundException ;
}
