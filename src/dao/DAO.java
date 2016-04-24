package dao;

import bean.Bean;
import com.sun.istack.internal.NotNull;
import org.hibernate.Session;
import util.HibernateUtil;

import javax.persistence.Id;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

/**
 * Created by falling on 2016/4/21.
 */
public class DAO {

    //通用checked
    public Object getById(Bean bean) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Object object = session.get(bean.getClass(), bean.getId());
        session.getTransaction().commit();
        return object;
    }

    public List searchByName(String contactName) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        List list = session.createQuery("from CustomerBean where ContactName like :contactName").setString("contactName", "%" + contactName + "%").list();
        session.getTransaction().commit();
        return list;
    }


    //通用checked
    public void addBean(Object bean) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.save(bean);
        session.getTransaction().commit();
    }

    //通用checked
    public void updateCustomer(@NotNull Object newBean) {

        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        String PKValue = "";

        //获取PK的值。
        Method[] methods = newBean.getClass().getDeclaredMethods();
        for (Method method : methods) {
            if (method.getAnnotation(Id.class) != null) {
                try {
                    PKValue = (String) method.invoke(newBean);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }

        session.beginTransaction();
        Object oldBean = session.get(newBean.getClass(), PKValue);
        if (oldBean != null) {
            Field[] fields = oldBean.getClass().getDeclaredFields();
            for (Field field : fields) {
                try {
                    field.setAccessible(true);
                    if (field.get(newBean) != null) {
                        field.set(oldBean, field.get(newBean));
                    }
                    field.setAccessible(false);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
            session.update(oldBean);
            session.getTransaction().commit();
        }

    }

    //通用
    public void deleteCustomer(Bean bean) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Object ob = session.get(bean.getClass(), bean.getId());
        session.delete(ob);
        session.getTransaction().commit();
    }
}
