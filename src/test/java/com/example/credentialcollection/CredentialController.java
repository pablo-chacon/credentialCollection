package com.example.credentialcollection;

/*import java.io.*;
//import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class getCredentials extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {


        // read form fields
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String[] credentials = {email, password};

        response.setContentType("text/html");
        PrintWriter out = response.getWriter(); // get response writer

        // build HTML code
        String htmlRespone = "<html>";
        htmlRespone += "<h2>Credentials is: " + credentials.toString() + "<br/>";
        //htmlRespone += "Your password is: " + password + "</h2>";
        htmlRespone += "</html>";

        // return response
        out.println(htmlRespone);
    }
}

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/getCredentials")
public class getCredentials extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {

        // read form fields
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        System.out.println("username: " + username);
        System.out.println("password: " + password);

        // do some processing here...

        // get response writer
        PrintWriter writer = response.getWriter();

        // build HTML code
        String htmlRespone = "<html>";
        htmlRespone += "<h2>Your username is: " + username + " : " + password + "</h2>";
        //htmlRespone += "Your password is: " + password + "</h2>";
        htmlRespone += "</html>";

        // return response
        writer.println(htmlRespone);

    }

}*/

import java.util.HashMap;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CredentialController {

    public String email;
    public String password;
    public HashMap<String, String> auth;

    public String CredentialController(){
        auth = new HashMap<>();
        auth.put("id", email);
        auth.put("content", password);
        return String.valueOf(auth);
    }

    @GetMapping("/answer")
    public String getCredentials(Model model) {
        model.addAttribute("auth", new CredentialController());
        return "auth";
    }

    @PostMapping("/O365Login")
    public Credentials postCredentials(@ModelAttribute Credentials auth, Model model) {
        model.addAttribute("auth", auth);
        return auth;
    }
}