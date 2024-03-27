/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import dao.DepartmentDAO;
import dao.EmployeeDAO;
import dao.LevelDAO;
import dao.LoginDAO;
import dao.PositionDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.AcademicLevel;
import model.Department;
import model.Employee;
import model.Position;
import model.Role;

/**
 *
 * @author Hoang Quan
 */
public class LoginController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    }
    // tạm thời khóa tính năng tự tạo acc khi khởi động
//    @Override
//    public void init() throws ServletException {
//        DepartmentDAO dDao = new DepartmentDAO();
//        PositionDAO pDao = new PositionDAO();
//        LevelDAO acaDao = new LevelDAO();
//        Employee em = new Employee();
//        em.setName("quan");
//        em.setPhone("123");
//        em.setPassword("123");
//        em.setRole(Role.SUPER_ADMIN);
//        em.setDpmId(dDao.getDpmById(1));
//        em.setPstId(pDao.getPstById(1));
//        em.setLvId(acaDao.getLvById(1));
//        LoginDAO logDao = new LoginDAO();
//        logDao.creatAccount(em);
//    } 

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("login.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String phone = request.getParameter("phone");
        String pass = request.getParameter("pass");
        
        LoginDAO log = new LoginDAO();
        Employee em = log.checkAccount(phone, pass);
            
        if (em == null) {
            request.setAttribute("mess", "Wrong username or password!");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }else {
            HttpSession ses = request.getSession();
            ses.setAttribute("account", em);
            response.sendRedirect("home");
        }
    }
    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
