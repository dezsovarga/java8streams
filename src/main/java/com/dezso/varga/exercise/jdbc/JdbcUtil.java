package com.dezso.varga.exercise.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class JdbcUtil {

    public static Map<Integer, String> getResults(ResultSet rs) throws SQLException {

        Map<Integer, String> map = new HashMap<>();
        while (rs.next()) {
            int id = rs.getInt("id");
            String email = rs.getString("email");
            map.put(id, email);
        }

        return map;
    }

}
