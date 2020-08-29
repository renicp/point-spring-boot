package com.point.services;

import com.point.dao.PointDao;
import com.point.entity.Point;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PointServiceImpl implements PointService{
    @Autowired
    private PointDao pointDao;

    @Override
    public Point createPoint(Point point) {
        return pointDao.createPoint(point);
    }

    @Override
    public Point updatePoint(Point point) {
        return pointDao.updatePoint(point);
    }

    @Override
    public Point getPoint(int userId) {
        return pointDao.getPoint(userId);
    }
}
