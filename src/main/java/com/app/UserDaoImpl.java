package com.app;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Random;

@Repository("user")
@Transactional
public class UserDaoImpl {
    private final Logger LOGGER = Logger.getLogger(UserDaoImpl.class);
    @Autowired
    private SessionFactory sessionFactory;

    private Session getCurrentSession() {
        return this.sessionFactory.getCurrentSession();
    }


    public User findSimulateUser() {
        List<User> records = this.getCurrentSession().createQuery("from user where source='moon'").setCacheable(true).list();
        Random random = new Random(System.currentTimeMillis());
        int choice = random.nextInt(records.size());
        return records.get(choice);
    }


    public String save(User entity) {
        return (String) getCurrentSession().save(entity);
    }

    public void update(User entity) {
        getCurrentSession().update(entity);
    }

}


