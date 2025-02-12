public class BookSeat {

    private static volatile int[] seatnumber = {1,2,3,4,5};
    private static int seatCount =-1;

    private BookSeat() {
        System.out.println("Booking seats 1 -5");
    }

    public static int BookMySeat(){
        if (seatCount < 4){
            seatCount = seatCount +1;
            return seatnumber[seatCount];
        }else
            return 0;
    }
}
