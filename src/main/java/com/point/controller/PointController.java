package com.point.controller;

import com.point.entity.Point;
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
}
