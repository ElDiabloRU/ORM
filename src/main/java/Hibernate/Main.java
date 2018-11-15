package Hibernate;


import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        NewsService newsService = new NewsService();
        News news = new News("Test","Test");
        newsService.saveNews(news);
        newsService.updateNews(news);
    }
}
