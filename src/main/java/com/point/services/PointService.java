package com.point.services;

import com.point.entity.Point;

public interface PointService {
    Point createPoint(Point point);
    Point updatePoint(Point point);
    Point getPoint(int userId);
}
