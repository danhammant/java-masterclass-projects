package vehicle;

public class Vehicle {
    private String name;
    private int position;
    private int topSpeed;
    private int speed;
    private Direction direction;


    public Vehicle (String name, int topSpeed) {
        this.name = name;
        this.topSpeed = topSpeed;
        this.position = 0;
        this.speed = 0;
    }

    public void move(int speed, Direction direction) {
        this.speed = speed;
        this.direction = direction;
    }


    public void steer(Direction direction) {
        this.direction = direction;
    }

    public void stop() {
        speed = 0;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return this.position;
    }

    public Direction getDirection() {
        return direction;
    }

}
