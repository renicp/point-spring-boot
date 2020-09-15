package com.point.dao;

import com.point.entity.Game;

import java.util.List;

public interface GameDao {
    int create(Game game);
    List<Game> getList();
}
