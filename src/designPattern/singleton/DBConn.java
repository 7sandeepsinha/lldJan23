package designPattern.singleton;

public class DBConn {
    private static DBConn dbConnObj;

    private DBConn(){}

    public static DBConn getObject(){
        if(dbConnObj == null){
            dbConnObj = new DBConn();
        }
        return dbConnObj;
    }
}
