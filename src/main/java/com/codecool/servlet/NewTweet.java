package com.codecool.servlet;

import com.codecool.model.Tweet;
import com.codecool.service.TweetList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;


@WebServlet("/new-tweet")
public class NewTweet extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        String name = req.getParameter("name");
        String content = req.getParameter("comment");
        Date date = new Date();
        TweetList.getInstance().addTweet(new Tweet(name, content, date));
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }
}
