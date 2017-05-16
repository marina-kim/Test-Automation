package taxi_oop_homework;

/**
 * Created by Marina on 16.05.2017.
 */
public class NotExistedDoorException extends RuntimeException {
    public NotExistedDoorException(String message){
        super(message);
    }
}
