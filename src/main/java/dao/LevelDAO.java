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
import model.AcademicLevel;

/**
 *
 * @author Hoang Quan
 */
public class LevelDAO {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    public List<AcademicLevel> getAllLevel() {
        List<AcademicLevel> list = new ArrayList<>();
        String query = "SELECT * FROM academic_lv";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while(rs.next()){
                AcademicLevel aca = new AcademicLevel();
                aca.setLevelId(rs.getInt(1));
                aca.setLevelName(rs.getString(2));
                list.add(aca);
            }
        }catch(Exception e){
        }
        return list;
    }
    
    public void addNewLevel(AcademicLevel aca) {
         String query = "INSERT INTO academic_lv (pst_name) VALUES (?)";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            
            ps.setString(1, aca.getLevelName());
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    public AcademicLevel getLvById(int lvId){
        String query = "select * from academic_lv where lv_id = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, lvId);
            rs = ps.executeQuery();
            if(rs.next()){
                return new AcademicLevel(rs.getInt(1), rs.getString(2));
            }
        } catch (Exception e) {
        }
        return null;
    }
}
