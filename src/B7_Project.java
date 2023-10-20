public class B7_Project extends World {

    public int red;
    public int blue;
    public int green;

    public void go() {
        {
            plane.loadBackGround("burhan2.jpg");          //*** new method to load a diffrent JPG
            System.out.println("This will be printed to the  window. ");
            plane.teleport(0, 0);
            plane.showBackGround();
            plane.teleport(0,0);
            plane.isTrail=true;
            plane.trailWidth=10;
            plane.pausetime=0;
            plane.setColor(235, 52, 52);
            plane.startingAngle(90);
            plane.move(900);
            plane.turn(90);
            plane.move(990);
            plane.turn(90);
            plane.move(900);
            plane.turn(90);
            plane.move(980);
            System.out.println(plane.howMuchRed());

            for (int row = 1; row < plane.getBackGroundHeight(); row++)    //*** this is using new getBackground
            {
                for (int col = 1; col < plane.getBackGroundWidth(); col++)    //*** this is using new getBackgroun
                {
                    plane.teleport(col, row);

                    red = plane.howMuchRed();
                    green = plane.howMuchGreen();
                    blue = plane.howMuchBlue();

                    if(red>30 && green> 28 && blue>26)//&&green<240 && blue< 100)
                        if (red<71  && green<71  && blue<69 )
                    {
                        plane.setPixelColor(252,236,0);
                    }





                }

            }
        }
    }
}





