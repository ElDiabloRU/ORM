package Dao;

import Hibernate.HibernateSessionFactoryUtil;
import Hibernate.News;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class NewsDao {
    public News findById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(News.class, id);
    }

    public void save(News news) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(news);
        tx1.commit();
        session.close();
    }

    public void update(News news) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(news);
        tx1.commit();
        session.close();
    }

    public void delete(News news) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(news);
        tx1.commit();
        session.close();
    }

}
