package dio.restapi.doc;

// ##### A Configução abaixo funciona apenas com versões do Spring menores que a 3: #####

// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;

// import springfox.documentation.builders.ApiInfoBuilder;
// import springfox.documentation.builders.RequestHandlerSelectors;
// import springfox.documentation.service.ApiInfo;
// import springfox.documentation.service.Contact;
// import springfox.documentation.swagger2.annotations.EnableSwagger2;
// import springfox.documentation.spring.web.plugins.Docket;
// import springfox.documentation.spi.DocumentationType;
// import springfox.documentation.builders.PathSelectors;

// @Configuration
// @EnableSwagger2
// public class SwaggerConfig {
//     // Acessar pelos endpoints: 
//     //     http://localhost:8080/swagger-ui.html
//     //     http://localhost:8080/v2/api-docs

//     private Contact contact() {
//         return new Contact(
//             "Nome do desenvolvedor",
//             "Url",
//             "email@exemplo.com"
//         );
//     };

//     private ApiInfo apiInfoBuilder() {
//         return new ApiInfoBuilder()
//         .title("API REST com Spring")
//         .description("Documentação da API REST com Spring")
//         .version("1.0")
//         .contact(this.contact())
//         .license("Apache License Version 2.0")
//         .licenseUrl("https://www.apache.org/licenses/LICENSE-2.0\"")
//         .build();
//     }

//     @Bean
//     public Docket api() {
//         return new Docket(DocumentationType.SWAGGER_2)
//             .select()
//             .apis(RequestHandlerSelectors.basePackage("dio.restapi"))
//             .paths(PathSelectors.any())
//             .build()
//             .apiInfo(this.apiInfoBuilder());
//     }

// }

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    // Acessar pelos endpoints: 
    //     http://localhost:8080/swagger-ui.html
    //     http://localhost:8080/v3/api-docs

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
            .info(new Info()
                .title("Rest API")
                .description("API exemplo de uso de Springboot REST API")
                .contact(new Contact()
                    .name("Nome do Dev")
                    .email("email@exemplo.com")
                )
                .license(new License()
                    .name("Licença - Sua Empresa")
                    .url("http://www.seusite.com.br")
                )
            );
    }

}
