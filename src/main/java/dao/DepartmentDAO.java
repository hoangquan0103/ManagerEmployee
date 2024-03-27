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
import model.Department;

/**
 *
 * @author Hoang Quan
 */
public class DepartmentDAO {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    public List<Department> getAllDepartment() {
        List<Department> list = new ArrayList<>();
        String query = "SELECT * FROM department";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while(rs.next()){
                Department d = new Department();
                d.setDepartId(rs.getInt(1));
                d.setDepartName(rs.getString(2));
                list.add(d);
            }
        }catch(Exception e){
        }
        return list;
    }
    
    public void addNewDepart(Department d) {
         String query = "INSERT INTO department (dpm_name) VALUES (?)";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            
            ps.setString(1, d.getDepartName());
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    public Department getDpmById(int dpmId){
        String query = "select * from department where dpm_id = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, dpmId);
            rs = ps.executeQuery();
            if(rs.next()){
                return new Department(rs.getInt(1), rs.getString(2));
            }
        } catch (Exception e) {
        }
        return null;
    }
    
//    public static void main(String[] args) {
//        DepartmentDAO dao = new DepartmentDAO();
//        System.out.println(dao.getDpmById(1));
//    }
}
