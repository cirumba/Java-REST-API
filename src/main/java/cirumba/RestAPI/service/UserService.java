package cirumba.RestAPI.service;

import cirumba.RestAPI.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}