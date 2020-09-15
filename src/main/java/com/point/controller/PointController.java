package com.point.controller;

import com.point.entity.Game;
import com.point.entity.Point;
import com.point.services.GameService;
import com.point.services.PointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("pointservice")
public class PointController {
    @Autowired
    private PointService pointService;

    @Autowired
    private GameService gameService;

    @PostMapping("point")
    public ResponseEntity<Point> createBook(@RequestBody Point point){
        Point b = pointService.createPoint(point);
        return new ResponseEntity<Point>(b, HttpStatus.OK);

    }

    @PutMapping("update")
    public ResponseEntity<Point> updateBook(@RequestBody Point point){

        Point b = pointService.updatePoint(point);
        return new ResponseEntity<Point>(b, HttpStatus.OK);
    }

    @GetMapping("list")
    public ResponseEntity<List<Game>> list(){
        List<Game> b = gameService.getList();
        return new ResponseEntity<List<Game>>(b, HttpStatus.OK);

    }

    @PostMapping("gameCreate")
    public ResponseEntity<Integer> createGame(@RequestBody Game game){
        int a = gameService.create(game);
        return new ResponseEntity<Integer>(a, HttpStatus.OK);

    }
}

