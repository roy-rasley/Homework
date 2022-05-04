import java.util.ArrayList;

public class House extends Building{
//    Data Members
ArrayList<Room> roomList;








//    Constructors

    public House(int width, int height, int price, String color) {
        super(width, height, price, color);
        this.roomList = new ArrayList<Room>();
    }


//    Setters/Getters









//    Methods
//adds rooms to roomList
    public void addRoom(Room room){
        roomList.add(room);
    }






}
