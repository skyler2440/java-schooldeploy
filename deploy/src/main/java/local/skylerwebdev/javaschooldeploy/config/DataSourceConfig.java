package local.skylerwebdev.javaschooldeploy.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig
{
    @Autowired
    private Environment env;

    @Bean(name = "dsCustom")
    public DataSource dataSource()
    {
        String myUrlString = "";
        String myDriverClass = "";
        String myDBUser = "";
        String myDBPassword = "";

        String dbValue = env.getProperty("local.run.db");

        if (dbValue.equalsIgnoreCase("POSTGRESQL"))
        {
            myUrlString = "jdbc:postgresql://" + System.getenv("MYDBHOST") + ":5432/dd65m50d7mqdb8";
            myDriverClass = "org.postgresql.Driver";
            myDBUser = "cjfxgbxivxiuss";
            myDBPassword = "df1598287f1878d0eb26b08b1707bcb529267ad01c680ac1f51138441aadc93d";
        } else
        {
            // Assumes H2
            myUrlString = "jdbc:h2:mem:testdb";
            myDriverClass = "org.h2.Driver";
            myDBUser = "sa";
            myDBPassword = "";
        }

        System.out.println(myUrlString);
        return DataSourceBuilder.create().username(myDBUser).password(myDBPassword).url(myUrlString).driverClassName(myDriverClass).build();
    }

    @Bean(name = "jdbcCustom")

    @Autowired
    public JdbcTemplate jdbcTemplate(
            @Qualifier("dsCustom")
                    DataSource dsCustom)
    {
        return new JdbcTemplate(dsCustom);
    }
}