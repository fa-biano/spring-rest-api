package dio.restapi.doc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.builders.PathSelectors;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    // Acessar pelos endpoints: 
    //     http://localhost:8080/swagger-ui.html
    //     http://localhost:8080/v2/api-docs

    private Contact contact() {
        return new Contact(
            "Nome do desenvolvedor",
            "Url",
            "email@exemplo.com"
        );
    };

    private ApiInfo apiInfoBuilder() {
        return new ApiInfoBuilder()
        .title("API REST com Spring")
        .description("Documentação da API REST com Spring")
        .version("1.0")
        .contact(this.contact())
        .license("Apache License Version 2.0")
        .licenseUrl("https://www.apache.org/licenses/LICENSE-2.0\"")
        .build();
    }

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
            .select()
            .apis(RequestHandlerSelectors.basePackage("dio.restapi"))
            .paths(PathSelectors.any())
            .build()
            .apiInfo(this.apiInfoBuilder());
    }

}
