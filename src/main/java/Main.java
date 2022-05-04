public class Main {
    public static void main(String[] args) {

    //declare new items from each class in main so they can be used
        var house = new House(200,20,400000, "white");
        var bedRoom = new Room(15,15,10,4);
        var livingRoom = new Room(25,25,10,4);



        house.addRoom(bedRoom);
        house.addRoom(livingRoom);

        System.out.println("This house is " + house.color + " and it costs $" + house.price + " dollars. The house has a rather" +
                " nice living room that is "+livingRoom.getWidth()+" feet wide and " +livingRoom.getLength()+" feet long" +
                " and "+livingRoom.getHeight()+" feet tall.");
    }
}
