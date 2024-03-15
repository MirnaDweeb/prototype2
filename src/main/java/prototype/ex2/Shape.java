package prototype.ex2;

public interface Shape {
    Shape clone(); // Method to clone the shape
    String getType(); // Method to get the type of the shape
    String getDescription(); // Method to get the description of the shape
    int getX(); // Method to get the x coordinate of the shape
    int getY(); // Method to get the y coordinate of the shape
    String getColor(); // Method to get the color of the shape
    int getRadius(); // Method to get the radius of the shape (for circles)
    int getWidth(); // Method to get the width of the shape (for rectangles)
    int getHeight(); // Method to get the height of the shape (for rectangles)
}