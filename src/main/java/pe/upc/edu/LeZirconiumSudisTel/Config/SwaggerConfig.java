package pe.upc.edu.LeZirconiumSudisTel.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket apiDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("pe.upc.edu.LeZirconiumSudisTel.Controllers"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(demoApiInfo());
    }

    private ApiInfo demoApiInfo() {
        return new ApiInfoBuilder()
                .title("SudisTel API")//大标题
                .description("Esta pagina presenta el API de la plataforma SudisTel")//详细描述
                .version("2.0")//版本
                .termsOfServiceUrl("NO terms of service")
                .contact(new Contact("Link del repositorio", "https://github.com/LeZirconium-SudisTel/BackEnd-SudisTel", "sudistel@hotmail.com"))//作者
                .license("The Apache License, Version 2.0")
                .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
                .build();
    }
}
