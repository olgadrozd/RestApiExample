package tests;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class OnlinerTest {

    @Test
public void validateSignin(){


    //https://www.onliner.by/sdapi/user.api/login
    // {login: "", password: ""}

    given()
            .body("{login: \"ov_drozd777@mail.ru\", password: \"asd\"}")
            .header("Content-Type", "application/json")
            .log().all()

            .when()
            .post("https://www.onliner.by/sdapi/user.api/login")
            .then()
            .log().all()
            .statusCode(422);
           // .body("errors[0].message", equalTo("Неверный логин или пароль"))
          //.body("errors[0].key", equalTo("Validation failed"));

            //given
            //when
            //then

  }
}
