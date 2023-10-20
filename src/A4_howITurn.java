

public class A4_howITurn extends World {

    public void go(){
        for(int i= 0; i < 10; i++){
            shape(100, 60);
        }

    }

    //This is the method that your program looks for and executes when you 'run' it
    public void shape(int i, int j) {



        for(int k= 0;k<1000;k=k+1){
            plane.startingAngle(60);
            plane.isTrail = true;
            plane.trailWidth = 10;
            plane.setColor(200, 0, 0);
            plane.move(i+50);
            plane.turn(j+75);
            plane.setColor(0, 200, 0);
            plane.move(i+50);
            plane.turn(j+75);
            plane.move(i+50);
        }




    }


}
