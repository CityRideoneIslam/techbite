import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connectivity con = new Connectivity();
        con.getConnection();
    }
}