/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import context.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.Employee;
import model.Role;


/**
 *
 * @author Hoang Quan
 */
public class LoginDAO {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    DepartmentDAO dDao = new DepartmentDAO();
    PositionDAO pDao = new PositionDAO();
    LevelDAO acaDao = new LevelDAO();
    
    public Employee checkAccountExist(String phone) {
        String query = "SELECT * FROM employee WHERE phone = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, phone);
            rs = ps.executeQuery();
            while(rs.next()){
                Employee e = new Employee();
                e.setEmployeeId(rs.getInt(1));
                e.setName(rs.getString(2));
                e.setSex(rs.getString(3));
                e.setDob(rs.getDate(4));
                e.setPhone(rs.getString(5));
                e.setPassword(rs.getString(6));
                e.setRole(Role.valueOf(rs.getString(7)));
                e.setIdCard(rs.getString(8));
                e.setAddress(rs.getString(9));
                e.setPicture(rs.getString(10));
                e.setDpmId(dDao.getDpmById(rs.getInt(11)));
                e.setPstId(pDao.getPstById(rs.getInt(12)));
                e.setLvId(acaDao.getLvById(rs.getInt(13)));
                return e;
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public void creatAccount(Employee employee){
        String query = "INSERT INTO employee (name, phone, password, role, dpm_id, pst_id, lv_id) VALUES (?,?,?,?,?,?,?)";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            
            ps.setString(1, employee.getName());
            ps.setString(2, employee.getPhone());
            ps.setString(3, employee.getPassword());
            ps.setString(4, employee.getRole().name());
            ps.setInt(5, employee.getDpmId().getDepartId());
            ps.setInt(6, employee.getPstId().getPosiId());
            ps.setInt(7, employee.getLvId().getLevelId());
            
            ps.executeUpdate();
        } catch (Exception e) {
        }

    }
    
    public Employee checkAccount(String phone, String pass) {
        String query = "SELECT * FROM employee WHERE phone = ? AND password = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, phone);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            while(rs.next()){
                return new Employee(
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDate(4),
                        rs.getString(5),
                        rs.getString(6),
                        Role.valueOf(rs.getString(7)),
                        rs.getString(8), 
                        rs.getString(9),
                        rs.getString(10),
                        dDao.getDpmById(rs.getInt(11)),
                        pDao.getPstById(rs.getInt(12)),
                        acaDao.getLvById(rs.getInt(13)));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
    
//    public static void main(String[] args) {
//        LoginDAO dao = new LoginDAO();
//        Employee e = dao.checkAccountExist("123");
//        System.out.println(e);
//    }
}
