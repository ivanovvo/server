package vadim.help.neuro.configs;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.config.annotation.ObjectPostProcessor;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class ResourceSecurityConfigurationTest {
    @Autowired
    ResourceSecurityConfiguration resourceSecurityConfiguration;



    @Test
    void corsConfigurationSource() {
        //System.out.println(resourceSecurityConfiguration.corsConfigurationSource());
        Assert.assertEquals(resourceSecurityConfiguration.corsConfigurationSource(), resourceSecurityConfiguration.corsConfigurationSource());
    }

    @Test
    void configure() throws Exception {
        ObjectPostProcessor objectPostProcessor = new ObjectPostProcessor() {
            @Override
            public Object postProcess(Object o) {
                return "t";
            }
        };
        AuthenticationManagerBuilder auth = new AuthenticationManagerBuilder(objectPostProcessor);
        /*auth.inMemoryAuthentication()
                .withUser("t")
                .password("t");*/
        resourceSecurityConfiguration.configure(auth);

        //System.out.println(resourceSecurityConfiguration.configure((AuthenticationManagerBuilder) null));
    }
}