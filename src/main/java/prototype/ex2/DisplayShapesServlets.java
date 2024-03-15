package prototype.ex2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/DisplayShapesServlet")
public class DisplayShapesServlets extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Create a list to hold the shapes
        List<Shape> shapes = new ArrayList<>();
        // Add a circle to the list
        shapes.add(new Circle(10, 20, "red", 5)); // x=10, y=20, color=red, radius=5
        // Add a rectangle to the list
        shapes.add(new Rectangle()); // x=30, y=40, color=blue, width=10, height=15

        // Create a list to hold the cloned shapes
        List<Shape> clonedShapes = new ArrayList<>();
        // Clone each shape in the list and add it to the cloned shapes list
        for (Shape shape : shapes) {
            clonedShapes.add(shape.clone());
        }

        // Set the attribute "shapes" to the cloned shapes list
        request.setAttribute("shapes", clonedShapes);
        // Forward the request to the display_shapes.jsp file
        request.getRequestDispatcher("display_shapes.jsp").forward(request, response);
    }
}