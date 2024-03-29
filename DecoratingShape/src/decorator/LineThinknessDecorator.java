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
public class LineThinknessDecorator extends ShapeDecorator {
      protected double thickness;
      public LineThinknessDecorator(Shape decoratedShape, double thickness) {
                super(decoratedShape);
                this.thickness = thickness;
      }
      @Override
      public void draw() {
                decoratedShape.draw();
                System.out.println("Line thickness: " + thickness);
      }
      // no change in the functionality
      @Override
      public void resize() {
      decoratedShape.resize();
      }
      @Override
      public String description() {
      return decoratedShape.description() + " drawn with line thickness " + thickness + ".";
      }
      // no change in the functionality
      @Override
      public boolean isHide() {
      return decoratedShape.isHide();
      }
}
