<%@ page import="java.util.List" %>
<%@ page import= "prototype.ex2.Shape"%>
<%@ page import= "prototype.ex2.Circle"%>
<%@ page import= "prototype.ex2.Rectangle"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Display Shapes</title>
</head>
<body>
    <h1>Display Shapes</h1>

    public abstract class Shape {
    private String type;
    private String description;
    private int x;
    private int y;
    private String color;

    public Shape(String type, String description, int x, int y, String color) {
        this.type = type;
        this.description = description;
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getColor() {
        return color;
    }

    public abstract double getRadius();
    public abstract int getWidth();
    public abstract int getHeight();
}

public class Circle extends Shape {
    private double radius;

    public Circle(String type, String description, int x, int y, String color, double radius) {
        super(type, description, x, y, color);
        this.radius = radius;
    }

    @Override
    public double getRadius() {
        return radius;
    }

    @Override
    public int getWidth() {
        return 0;
    }

    @Override
    public int getHeight() {
        return 0;
    }
}

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(String type, String description, int x, int y, String color, int width, int height) {
        super(type, description, x, y, color);
        this.width =
</body>
</html>