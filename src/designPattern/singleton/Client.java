package designPattern.singleton;

public class Client {
    public static void main(String[] args) {
        DBConn d1 = DBConn.getObject();
        DBConn d2 = DBConn.getObject();
        DBConn d3 = DBConn.getObject();
        DBConn d4 = DBConn.getObject();
    }
}
