package com.geekbrains;

public class Road extends Barrier{
    private int length;

    public Road(String name, int length) {
        super(name);
        this.length = length;
    }

    public int getLength(){
        return length;
    }

    @Override
    protected boolean moving(Actions actions){
        System.out.println("The road " + super.getName() + " lenght: " + this.length);

        actions.run();

        if(getLength() <= actions.getRunDistance()){
            System.out.println("run success");
            return true;
        } else {
            System.out.println("run unsuccessfully");
            return false;
        }
    }
}
