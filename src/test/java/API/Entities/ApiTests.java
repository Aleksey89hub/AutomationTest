package API.Entities;

import by.stormnet.automation.core.utils.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ApiTests {
    private UserService userService = new UserService();

    @Test

    public void getAllusersTest(){
        Response response = userService.getUserList();
        int code = response.getCode();
        boolean containsEmail = response.getBody().contains("george.bluth@reqres.in");
        Assert.assertTrue(code == 200 && containsEmail,"Users are not availiable");
    }

    @Test

    public void createNewUserTest(){
        String newUser = "{\"name\":\"morpheus\",\"job\":\"leader\"}";
        Response response = userService.createNewUser(newUser);
        int code = response.getCode();
        boolean containUserName = response.getBody().contains("morpheus");
        Assert.assertTrue(code == 201 && containUserName, "User is not created");
    }

    @Test

    public void updateUserTest(){
        String updateUser = "{\"name\":\"morpheus12\",\"job\":\"leader12\"}";
        Response response = userService.updateUser(updateUser);
        int code = response.getCode();
        boolean containUserName = response.getBody().contains("morpheus12");
        Assert.assertTrue(code == 201 && containUserName, "User is not updated");
    }

    @Test
    public void DeleteUserTest(){
        String deleteUser = "{\"name\":\"morpheus12\",\"job\":\"leader12\"}";
        Response response = userService.deleteUser(deleteUser);
        int code = response.getCode();
        boolean containUserName = response.getBody().contains("morpheus12");
        Assert.assertTrue(code == 201 && containUserName, "User is not deleted");
    }
}


