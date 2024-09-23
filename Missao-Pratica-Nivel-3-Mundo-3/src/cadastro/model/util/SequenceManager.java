package cadastro.model.util;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SequenceManager {
    public int getValue(String sequence) throws SQLException, Exception{
        ResultSet rs = new ConectorBD().getSelect("SELECT NEXT VALUE FOR ".concat(sequence));
        if(rs.next()){
            return rs.getInt(1);
        }else{
            throw new SQLException("Value not achivable");
        }
    }
}
