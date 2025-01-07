package com.azmi.AzmiHotel.service.interfac;

import com.azmi.AzmiHotel.dto.LoginRequest;
import com.azmi.AzmiHotel.dto.Response;
import com.azmi.AzmiHotel.entity.User;

public interface IUserService {
    Response register(User user);

    Response login(LoginRequest loginRequest);

    Response getAllUsers();

    Response getUserBookingHistory(String userId);

    Response deleteUser(String userId);

    Response getUserById(String userId);

    Response getMyInfo(String email);

}
