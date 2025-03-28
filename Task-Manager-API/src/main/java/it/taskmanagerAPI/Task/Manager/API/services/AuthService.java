package it.taskmanagerAPI.Task.Manager.API.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


@Service
    public class AuthService {

        @Autowired
        private JwtTool jwtTool;

        @Autowired
        private UserService userService;

        @Autowired
        private PasswordEncoder passwordEncoder;

        public LoginUserResponseBody authenticateUserAndToken (LoginUserRequestBody loginUserRequestBody) {
            User user = userService.retrieveByEmail(loginUserRequestBody.getEmail());

            if (passwordEncoder.matches(loginUserRequestBody.getPassword(), user.getPassword())){
                return new LoginUserResponseBody(user, "Successfully logged in", jwtTool.createToken(user));
            }
            else throw new UnauthorizedException("User not found, please try again");
        }
    }

