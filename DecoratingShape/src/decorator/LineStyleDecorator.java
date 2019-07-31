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
public class LineStyleDecorator extends ShapeDecorator {
        protected LineStyle style;
        public LineStyleDecorator(Shape decoratedShape, LineStyle style) {
        super(decoratedShape);
        this.style = style;
        }
        @Override
        public void draw() {
        decoratedShape.draw();
        System.out.println("Line Style: " + style);
        }
        // no change in the functionality
        @Override
        public void resize() {
        decoratedShape.resize();
        }
        @Override
        public String description() {
        return decoratedShape.description() + " drawn with " + style + " lines.";
        }
        // no change in the functionality
        @Override
        public boolean isHide() {
        return decoratedShape.isHide();
        }
}
