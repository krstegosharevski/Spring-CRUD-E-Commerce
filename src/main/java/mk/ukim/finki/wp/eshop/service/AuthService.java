package mk.ukim.finki.wp.eshop.service;

import mk.ukim.finki.wp.eshop.model.User;

public interface AuthService {

    User login(String username, String password);
    User register(String username, String password, String repeatPassword, String name, String surname);
}
