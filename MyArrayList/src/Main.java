public class Main {
    public static void main ( String[] args) {

        MyArrayList list = new MyArrayList (  );

        System.out.println ( list );

        list.add ( "0" );
        list.add ( "Hello" );
        list.add ( "World" );
        list.add ( "3" );
        list.add ( "4" );
        list.add ( "5" );
        list.add ( "6" );
        list.add ( "7" );
        list.add ( "8" );
        list.add ( "9" );
        list.add ( "10" );
        list.add ( "11" );
        System.out.println ( list );

        list.remove ( 1 );
        System.out.println ( list );

        list.remove ( 1 );
        System.out.println ( list );
    }
}
