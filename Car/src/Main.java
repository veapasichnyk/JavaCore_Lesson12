import java.util.*;

public class Main {

    static void menu ( ) {
        System.out.println ( "Enter 1 to display an array of random cars" );
        System.out.println ( "Enter 2 to fill the array with the same values for a random car" );
    }

    public static void main ( String[] args ) {

        Scanner        scanner           = new Scanner ( System.in );
        RandomOfValue  random            = new RandomOfValue ( );
        List<MaterialOfHelm> materialOfHelms = new ArrayList<> ();

        for (MaterialOfHelm materialOfHelmsValue : MaterialOfHelm.values ()) {

            materialOfHelms.add ( materialOfHelmsValue );
        }

        while (true) {
            menu ( );

            switch (scanner.nextInt ( )) {

                case 1: {
                    List<Car> carArrayList = new ArrayList<> ();

                    for ( int i = 0 ; i < random.getRandom ( 1,10) ; i++ ) {
                        List<Car> carArrayList1 = new ArrayList<> ();
                        for ( int j = 0 ; j < random.getRandom ( 1,10) ; j++ ) {
                            carArrayList1.add ( new Car ( random.getRandom ( 65 , 210 ) , random.getRandom ( 2010 , 2021 ) ,
                                                          new Engine ( random.getRandom ( 2 , 16 ) ) ,
                                                          new Helm ( random.getRandom ( 37,39) ,
                                                                 materialOfHelms.get ( random.getRandom ( 0 , materialOfHelms.size() - 1 ) )
                                                    ) ) );
                        }
                        carArrayList.addAll ( carArrayList1 );
                    }
                    System.out.println ( carArrayList );

                    break;
                }

                case 2: {
                    Car car = new Car ( 210 , 2020 ,
                                        new Engine ( 16 ) ,
                                        new Helm ( 39 ,
                                                   materialOfHelms.get ( 1 ) )
                    );

                    List<Car> carArrayList2 = new ArrayList<> (  );

                    for ( int i = 0; i < random.getRandom ( 1,10); i++ ) {
                        carArrayList2.add ( car );
                    }

                    System.out.println (carArrayList2 );

                    break;
                }
                default: {
                    System.out.println ( "The entered number must be 1 or 2" );

                    break;
                }
            }

        }
    }
}
