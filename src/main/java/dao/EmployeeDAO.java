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
import model.Department;
import model.Employee;
import model.Position;
import model.Role;

/**
 *
 * @author Hoang Quan
 */
public class EmployeeDAO {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    DepartmentDAO dDao = new DepartmentDAO();
    PositionDAO pDao = new PositionDAO();
    LevelDAO acaDao = new LevelDAO();
    
    public List<Employee> getAllEmployee() {
        List<Employee> list = new ArrayList<>();
        String query = "SELECT e.*, d.dpm_name, p.pst_name, aca.lv_name\n" +
                "FROM employee e\n"
                + "JOIN department d ON e.dpm_id = d.dpm_id\n"
                + "JOIN position p ON e.pst_id = p.pst_id\n"
                + "JOIN academic_lv aca ON e.lv_id = aca.lv_id ;";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
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
                
                Department d = new Department();
                d.setDepartName(rs.getString("dpm_name"));
                e.setDpmId(d);
                
                Position p = new Position();
                p.setPosiName(rs.getString("pst_name"));
                e.setPstId(p);
                
                AcademicLevel a = new AcademicLevel();
                a.setLevelName(rs.getString("lv_name"));
                e.setLvId(a);
                
                list.add(e);
            }
        }catch(Exception e){
        }
        return list;
    }
    
    public void addNewEmployee(Employee em) {
         String query = "INSERT INTO employee \n"
                + "(name, sex, dob, phone, password, role, id_card, address, picture, dpm_id, pst_id, lv_id)\n"
                + " VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, em.getName());
            ps.setString(2, em.getSex());
            ps.setDate(3, em.getDob());
            ps.setString(4, em.getPhone());
            ps.setString(5, em.getPassword());
            ps.setString(6, em.getRole().name());
            ps.setString(7, em.getIdCard());
            ps.setString(8, em.getAddress());
            ps.setString(9, em.getPicture());
            ps.setInt(10, em.getDpmId().getDepartId());
            ps.setInt(11, em.getPstId().getPosiId());
            ps.setInt(12, em.getLvId().getLevelId());
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    
//    public static void main(String[] args) {
//        EmployeeDAO dao = new EmployeeDAO();
//        List<Employee> list = dao.getAllEmployee();
//        Employee employee = new Employee(
//                "quan", 
//                "nam", 
//                Date.valueOf("2001-03-01"),
//                "0812001321", 
//                "quan0103", 
//                Role.SUPER_ADMIN, 
//                "122324202", 
//                "Bắc Giang", 
//                "123123123", 
//                dao.getDpmById(1),
//                dao.getPstById(1),
//                dao.getLvById(1));       
//        dao.addNewEmployee(employee);
//        for (Employee e : dao.getAllEmployee()) {
//            System.out.println(e);
//        }
//        for (Employee e : dao.getAllEmployee()) {
//            System.out.println(e);
//        };
//    }
}
