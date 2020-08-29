package com.point.dao;

import com.point.entity.Point;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Transactional
@Repository
public class PointDaoImpl implements PointDao{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Point createPoint(Point point) {
        if(getPoint(point.getUserId()) != null){
            System.out.println("user sudah ada");
           return null;
        }
        entityManager.persist(point);
        Point b = getLastInsertedPoint();
        return b;
    }

    @Override
    public Point updatePoint(Point point) {
        Point pointFromDB = getPoint(point.getUserId());
        int newPoint = point.getPoint();
        if(Integer.valueOf(pointFromDB.getPoint()) + Integer.valueOf(point.getPoint()) <= 0 ){
            newPoint=0;
        }
        pointFromDB.setPoint(newPoint);
        entityManager.flush();
        Point result = getPoint(point.getUserId());
        return result;
    }

    @Override
    public Point getPoint(int userId) {
        String hql = "from Point where user_id = :userId";
        Query query = entityManager.createQuery(hql);
        query.setParameter("userId", userId);
        return (Point)query.getSingleResult();
    }

    private Point getLastInsertedPoint(){
        String hql = "from Point order by id DESC";
        Query query = entityManager.createQuery(hql);
        query.setMaxResults(1);
        Point point = (Point)query.getSingleResult();
        return point;
    }
}
