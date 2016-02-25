package com.ravi.job;

import java.awt.geom.Point2D;

public class CoordinatesInspector {

  public Point2D coordinates(Double degrees, Double radius) {
  
  Point2D p = new Point2D.Double(Math.round(Math.cos(degrees)*radius),Math.round(Math.sin(degrees))*radius);
    return p;
  }

}