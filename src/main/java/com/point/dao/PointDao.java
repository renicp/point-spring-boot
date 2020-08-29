package com.point.dao;

import com.point.entity.Point;

public interface PointDao {

    Point createPoint(Point point);
    Point updatePoint(Point point);
    Point getPoint(int userId);
}
