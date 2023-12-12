package com.example.exercic1tp3;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
public class AfiichageEtudiants extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, jakarta.servlet.ServletException {
        request.setAttribute("GestionEtudiants", new GestionEtudiants());
        GestionEtudiants gestionEtudiants = new GestionEtudiants();
        gestionEtudiants.AddEtudiant(new Etudiant("DA103017", "NAJI", 17));
        gestionEtudiants.AddEtudiant(new Etudiant("DA103018", "badre", 17));
        gestionEtudiants.AddEtudiant(new Etudiant("DA103019", "foad", 17));

        request.setAttribute("GestionEtudiants", gestionEtudiants);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, jakarta.servlet.ServletException {
        // Vous pouvez implémenter des actions POST si nécessaire
    }

    @Override
    public void destroy() {
        super.destroy();
    }
}
