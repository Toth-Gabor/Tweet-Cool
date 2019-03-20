package com.codecool.servlet;
import com.codecool.service.TweetList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/tweets")
public class TweetServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        String name = req.getParameter("name");
        int skip = Integer.parseInt(req.getParameter("skip"));
        int limit = Integer.parseInt(req.getParameter("limit"));
        String dateString = req.getParameter("date");
        SimpleDateFormat sd = new SimpleDateFormat("YYYY-MM-dd HH:mm");
        try {
            Date date = sd.parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
        req.setAttribute("tweets", TweetList.getInstance().getNumberOfTweets(limit));
        
        req.getRequestDispatcher("tweet-board.jsp").forward(req,resp);
    }
    
    
}
