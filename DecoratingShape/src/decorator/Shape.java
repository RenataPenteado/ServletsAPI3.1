package decorator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Renata
 */
public interface Shape {
    void draw();
    void resize();
    String description();
    boolean isHide();
}
