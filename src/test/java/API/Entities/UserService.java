package API.Entities;

import by.stormnet.automation.core.utils.FrameWorkHttpClient;
import by.stormnet.automation.core.utils.Response;

public class UserService extends AbstractService {
    private FrameWorkHttpClient client = new FrameWorkHttpClient();
    private String userUrl = baseAppUrl + "/api/users";

    public Response getUserList() {
        System.out.println("Get user list request ");
        return client.doGet(userUrl);
    }

    public Response createNewUser(String userData) {
        System.out.println("Create new user with data " + userData);
        return client.doPost(userUrl, userData);
    }

    public Response updateUser(String userData) {
        System.out.println("Update user with data " + userData);
        return client.doPut(userUrl, userData);
    }

    public Response deleteUser(String userData) {
        System.out.println("Delete user with data " );
        return client.doDelete(userUrl);
    }
}




