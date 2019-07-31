/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author Renata
 */
public class LineColorDecorator extends ShapeDecorator {
      protected Color color;
      public LineColorDecorator(Shape decoratedShape, Color color) {
      super(decoratedShape);
      this.color = color;
      }
      @Override
      public void draw() {
      decoratedShape.draw();
      System.out.println("Line Color: " + color);
      }
      // no change in the functionality
      @Override
      public void resize() {
      decoratedShape.resize();
      }
      @Override
      public String description() {
      return decoratedShape.description() + " drawn with " + color + " color.";
      }
      // no change in the functionality
      @Override
      public boolean isHide() {
      return decoratedShape.isHide();
      }
}
