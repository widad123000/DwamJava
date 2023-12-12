package com.example.tp2ex2;

import jakarta.servlet.annotation.WebServlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        out.println("<h1>Bonjour</h1>");

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentDate = dateFormat.format(new Date());
        out.println("<h2>La date est : " + currentDate + "</h2>");
        out.println("exemple du tablaux");
        int rows = 9;
        int columns = 2;
        out.println("<html><body>");
        out.println("<h1>Tableau de " + rows + " lignes et " + columns + " colonnes</h1>");
        out.println("<table border='1'>");
        for (int i = 0; i < rows; i++) {
            out.println("<tr>");
            for (int j = 0; j < columns; j++) {
                out.println("<td>Cellule " + i + "," + j + "</td>");
            }
            out.println("</tr>");
        }
        out.println("</table>");


        out.println("<h3>Message 2 : Les servlets sont cool!</h3>");

        out.println("</body></html>");

        int numberOfStudents = 5;

        out.println("<html><body>");
        out.println("<h1>Liste des étudiants et leurs moyennes</h1>");
        out.println("<table border='1'>");
        out.println("<tr><th>Nom de l'étudiant</th><th>Moyenne</th></tr>");

        for (int i = 1; i <= numberOfStudents; i++) {
            String studentName = "Étudiant " + i;
            double grade = Math.random() * 20; // Random grade between 0 and 20

            out.println("<tr>");
            out.println("<td>" + studentName + "</td>");
            out.println("<td>" + String.format("%.2f", grade) + "</td>");
            out.println("</tr>");
        }

        out.println("</table>");
        out.println("</body></html>");
    }



    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Handle POST requests if needed
    }
}
