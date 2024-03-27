/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import context.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Position;

/**
 *
 * @author Hoang Quan
 */
public class PositionDAO {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    public List<Position> getAllPosition() {
        List<Position> list = new ArrayList<>();
        String query = "SELECT * FROM position";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while(rs.next()){
                Position p = new Position();
                p.setPosiId(rs.getInt(1));
                p.setPosiName(rs.getString(2));
                list.add(p);
            }
        }catch(Exception e){
        }
        return list;
    }
    
    public void addNewPosition(Position p) {
         String query = "INSERT INTO position (pst_name) VALUES (?)";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            
            ps.setString(1, p.getPosiName());
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    public Position getPstById(int pstId){
        String query = "select * from position where pst_id = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, pstId);
            rs = ps.executeQuery();
            if(rs.next()){
                return new Position(rs.getInt(1), rs.getString(2));
            }
        } catch (Exception e) {
        }
        return null;
    }
    
}
