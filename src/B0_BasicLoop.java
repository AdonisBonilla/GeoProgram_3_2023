public class B0_BasicLoop extends World {


    public void go() {
        //countdown();
        //drawsquare();
        //rowofsquares();
        multiplerows();

    }

    //This is the method that your program looks for and executes when you 'run' it
    public void countdown() {

        for (int i = 7; i > 0; i = i - 1) {
            System.out.println(i);

        }
        }


        public void drawsquare() {

            for (int i = 0; i < 4; i = i + 1) {

                plane.isTrail = true;
                plane.turn(90);
                plane.move(100);

            }
        }


            public void rowofsquares() {
               for(int i=1; i<8; i=i+1){
                   plane.teleport(i*100, 200);
                   drawsquare();


               }
            }
            public void multiplerows(){

        for(int i=1; i<500; i=i+1){
            for(int j=1; j<500; j=j+1){
                plane.pausetime=0;

                plane.setColor(i*2, i*3, i*5);
                plane.teleport(j*10, i*10);


                plane.square(10);





            }

                }






            }
        }















