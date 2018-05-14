package db;

import models.Golfer;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class DBGolfer {

    private static Session session;
    private static Transaction transaction;

    public static void save(models.Golfer golfer) {
        session = HibernateUtil.getSessionfactory().openSession();
        try {
            transaction = session.beginTransaction();
            session.save(golfer);
            transaction.commit();
        } catch (HibernateException e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public static List<models.Golfer> getGolfers() {
        session = HibernateUtil.getSessionfactory().openSession();
        List<Golfer> results = null;
        try {
            String hql = "from Golfer";
            results = session.createQuery(hql).list();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return results;
    }

    public static void delete(models.Golfer golfer) {
        session = HibernateUtil.getSessionfactory().openSession();
        try {
            transaction = session.beginTransaction();
            session.delete(golfer);
            transaction.commit();
        } catch (HibernateException e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public static models.Golfer find(int id) {
        session = HibernateUtil.getSessionfactory().openSession();
        models.Golfer result = null;
        try {
            String hql = "from Golfer where id = :id";
            Query query = session.createQuery(hql);
            query.setInteger("id", id);
            result = (models.Golfer) query.uniqueResult();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return result;
    }

    public static void update(Golfer golfer) {
        session = HibernateUtil.getSessionfactory().openSession();
        try {
            transaction = session.beginTransaction();
            session.update(golfer);
            transaction.commit();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}
