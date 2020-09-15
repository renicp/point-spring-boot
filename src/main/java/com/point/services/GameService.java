package com.point.services;

import com.point.entity.Game;

import java.util.List;

public interface GameService {
    int create(Game game);
    List<Game> getList();
}
