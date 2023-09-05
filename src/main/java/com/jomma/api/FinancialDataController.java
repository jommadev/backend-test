package com.jomma.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/financial")
public class FinancialDataController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/data")
    public List<FinancialData> getFinancialData() {
        String sql = "SELECT prod_name, last_value, year_to_date FROM fin_ydt_v";
        return jdbcTemplate.query(sql, (rs, rowNum) -> {
            FinancialData financialData = new FinancialData(sql, rowNum, rowNum);
            financialData.setProdName(rs.getString("prod_name"));
            financialData.setLastValue(rs.getDouble("last_value"));
            financialData.setYearToDate(rs.getDouble("year_to_date"));
            return financialData;
        });
    }
}
