package com.assuresoftDecorator;

public abstract class ShapeDecorator implements Shape {
    protected Shape decoratorShape;

    public ShapeDecorator(Shape decoratorShape){
        this.decoratorShape=decoratorShape;

    }
    public void draw(){
        decoratorShape.draw();
    }
}
