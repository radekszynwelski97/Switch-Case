import Data.Point;
import Logic.PointController;

public class PointApliccation2 {
    public static void main(String[] args) {
        Point p1 = new Point(10 , 20 );
        PointController pointController = new PointController();

        final int addX = 0 ;
        final int addY = 1 ;
        final int minusX = 2 ;
        final int minusY = 3 ;

        int option = minusX;
        switch (option){
            case addX:
                pointController.addX(p1);
                break;

            case addY:
                pointController.addY(p1);
                break;
            case minusX:
                pointController.minusX(p1);
                break;
            case minusY:
                pointController.minusY(p1);
                break;
            default:
                System.out.println("Żadna wartość nie spelnia naszych oczekiwań");




        }
        System.out.println("Nasz nowy punkt to : " + p1.getX()+ " ; " + p1.getY());



    }

}



