package structural.flyweight.after;

public class FlyingBullet {
    private double x_coord;
    private double y_coord;
    private double z_coord;
    private double speed;
    private BulletStatus bulletStatus;
    private long userId;
    private double x_direction;
    private double y_direction;
    private double z_direction;
    private Bullet bullet;

    public double getX_coord() {
        return x_coord;
    }

    public void setX_coord(double x_coord) {
        this.x_coord = x_coord;
    }

    public double getY_coord() {
        return y_coord;
    }

    public void setY_coord(double y_coord) {
        this.y_coord = y_coord;
    }

    public double getZ_coord() {
        return z_coord;
    }

    public void setZ_coord(double z_coord) {
        this.z_coord = z_coord;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public BulletStatus getBulletStatus() {
        return bulletStatus;
    }

    public void setBulletStatus(BulletStatus bulletStatus) {
        this.bulletStatus = bulletStatus;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public double getX_direction() {
        return x_direction;
    }

    public void setX_direction(double x_direction) {
        this.x_direction = x_direction;
    }

    public double getY_direction() {
        return y_direction;
    }

    public void setY_direction(double y_direction) {
        this.y_direction = y_direction;
    }

    public double getZ_direction() {
        return z_direction;
    }

    public void setZ_direction(double z_direction) {
        this.z_direction = z_direction;
    }

    public Bullet getBullet() {
        return bullet;
    }

    public void setBullet(Bullet bullet) {
        this.bullet = bullet;
    }
}
