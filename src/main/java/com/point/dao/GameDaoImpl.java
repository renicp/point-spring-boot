package com.point.dao;

import com.point.entity.Game;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Transactional
@Repository
public class GameDaoImpl implements GameDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public int create(Game game) {
        int result =0;
        try {
            entityManager.persist(game);
            result  =1;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return result;
    }

    @Override
    public List<Game> getList() {
        String hql = "from Game order by id DESC";
        Query query = entityManager.createQuery(hql);
        return query.getResultList();
    }
}
