package com.codeclan.example.courseBookingSystem.repositories.CourseRepository;

import com.codeclan.example.courseBookingSystem.models.Course;
import com.codeclan.example.courseBookingSystem.models.Customer;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

public class CourseRepositoryImpl implements CourseRepositoryCustom{

    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<Course> getAllCustomersFromCourse(Long id){


        List<Course> results = null;
        Session session = entityManager.unwrap(Session.class);

        Criteria cr = session.createCriteria(Customer.class);
        cr.createAlias("course", "courseAlias");
        cr.add(Restrictions.eq("courseAlias.id", id));
        results = cr.list();
        return results;
    }
}
