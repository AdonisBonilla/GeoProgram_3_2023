//public: visible to everyone
// class: template
//after class we say the name of the class which in this case is A1_HowToMove
//extends World: inventory

import java.awt.*;

public class A1_HowToMove extends World {

    //This is the method that your program looks for and executes when you 'run' it
    //void: returnType which is null in this case (null or nothing)
    public void go() {

        System.out.println("This message will be printed to the window below.");
        System.out.println("That window is called the dos window");
        //Word before fullstop refers to an object/class
        //Word after fullstop refers to a method/variable
        //Method has parenthesis after it
        //Variable does not have parenthesis after it but it has "="
        //Hence plane.properties refers to a variable in an object called plane

        plane.pausetime = 2;
        plane.startingAngle(0);
        plane.isTrail= true;
        plane.move(200);
        plane.house(35);
        trailGraphics.setColor(Color.cyan);
        plane.isTrail= true;
        plane.move(375);
        plane.isTrail= true;
        plane.move(200);
        plane.turn(90);
        plane.move(900);
        plane.isTrail= true;
        plane.setColor(3, 300, 54);
        plane.isTrail=true;
        plane.move(237);
        plane.teleport(420,69);
        //plane.move
        plane.isTrail=true;

        plane.move(299);
        plane.startingAngle(24);





        

    }

//    public void fish(int size)
//    {//plane.teleport(186,280);
//        plane.startingAngle(90);
//        plane.trailWidth=5;
//        plane.setColor(252, 165, 3);
//        plane.isTrail=true;
//        plane.move(200/size);
//        plane.turn(135);
//        plane.move(250/size);
//        plane.isTrail=false;
//        plane.turn(180);
//        plane.move(250/size);
//        plane.turn(-135);
//        plane.move(200/size);
//        plane.isTrail=true;
//        plane.turn(-135);
//        plane.move(250/size);
//        plane.turn(45);
//        plane.move(150/size);
//        plane.turn(45);
//        plane.move(125/size);
//        plane.turn(-265);
//        plane.move(115/size);
//        plane.turn(40);
//        plane.move(140/size);
//        plane.turn(40);
//        plane.move(20/size);
//
//
//
//    }











}

/*

Methods:
- move(int x)
   move() moves the plane forward by the number of pixels specified in the parameter.
   plane.move(10); moves the plane forward 10 pixels.

- startingAngle(int x)
   startingAngle() orients the plane at the angle specified in the parameter.
   plane.startingAngle(0); points the plane to the right.

Attributes:
- boolean isTrail
   isTrail controls whether or not the plane should leave a trail. It can be true or false.
   plane.isTrail = true; causes the plane to leave a trail.

*/