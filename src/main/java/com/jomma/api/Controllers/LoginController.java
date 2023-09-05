package com.jomma.api.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jomma.api.Entities.LoginRequest;

import java.sql.Types;
import java.util.HashMap;
import java.util.Map;

@RestController

public class LoginController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @PostMapping("/api/login")
    public Map<String, Object> sign(@RequestBody LoginRequest request) {
        Map<String, Object> resultMap = new HashMap<>();
        try {
            // Create a SimpleJdbcCall instance for calling the stored procedure
            SimpleJdbcCall jdbcCall = new SimpleJdbcCall(jdbcTemplate)
                .withProcedureName("prc_api_login")
                .declareParameters(
                    new SqlParameter("p_phone", Types.VARCHAR),
                    new SqlParameter("p_password", Types.VARCHAR),
                    new SqlParameter("p_ip_address", Types.VARCHAR),
                    new SqlOutParameter("p_error", Types.NUMERIC),
                    new SqlOutParameter("p_user_id", Types.NUMERIC),
                    new SqlOutParameter("p_msg", Types.VARCHAR),
                    new SqlOutParameter("p_is_valid", Types.VARCHAR)
                    
                );

            // Prepare the input parameters
            Map<String, Object> inParams = new HashMap<>();
            inParams.put("p_phone", request.getPhone());
            inParams.put("p_password", request.getPassword());
            inParams.put("p_ip_address", request.getIpAddress());
       
     
            // Execute the stored procedure and retrieve the output parameters
            Map<String, Object> outParams = jdbcCall.execute(inParams);

            // Retrieve the output parameters and add them to the result map
            resultMap.put("p_error", outParams.get("p_error"));
            resultMap.put("p_user_id", outParams.get("p_user_id"));
            resultMap.put("p_msg", outParams.get("p_msg"));
            resultMap.put("p_is_valid", outParams.get("p_is_valid"));

            return resultMap;
        } catch (Exception e) {
            e.printStackTrace();
            resultMap.put("error", "Error executing procedure");
            return resultMap;
        }
    }
    
}
