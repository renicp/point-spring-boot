package com.point.services;

import com.point.dao.GameDao;
import com.point.entity.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class GameServiceImpl implements GameService{
    @Autowired
    private GameDao gameDao;
    @Override
    public int create(Game game) {
        game.setCreatedAt(new Date());
        return gameDao.create(game);
    }

    @Override
    public List<Game> getList() {
        return gameDao.getList();
    }
}
